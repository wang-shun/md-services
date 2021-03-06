package com.maoding.coreMybatis;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.util.Set;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/9/12 19:12
 * 描    述 : 通用SQL语句实现
 */
public class CustomProvider extends MapperTemplate {

    public CustomProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    /** 按idList更新, entity字段为null不更新 */
    public String updateByIdList(MappedStatement ms){
        return getUpdateString(ms,true);
    }

    /** 按idList严格更新，entity字段为null也更新到null */
    public String updateExactByIdList(MappedStatement ms){
        return getUpdateString(ms,false);
    }

    /** 按idList删除 */
    public String fakeDeleteByIdList(MappedStatement ms){return getDeleteString(ms);}

    /** 生成更新sql */
    private String getUpdateString(MappedStatement ms, Boolean isIgnoreNull){
        final String PATH_FIELD_NAME = "path";
        final String PID_FIELD_NAME = "pid";
        final Class<?> entityClass = getEntityClass(ms); //获得列名称转换对象

        StringBuilder sqlTable = new StringBuilder(); //sql语句内update <table>部分
        StringBuilder sqlSet = new StringBuilder(); //sql语句内<set></set>部分
        StringBuilder sqlWhere = new StringBuilder(); //sql语句内<where></where>部分
        Set<EntityColumn> columns = EntityHelper.getColumns(entityClass);
        //update <table> t
        sqlTable.append(SqlHelper.updateTable(entityClass,tableName(entityClass))).append(" t");
        //根据各字段进行更新，id字段和输入为null的字段不更新
        sqlSet.append("<set>");
        sqlWhere.append("<where>");
        for (EntityColumn column : columns) {
            if (!column.isUpdatable()) continue;
            if (isId(column)) {
                sqlWhere.append(getIdCondition(column));
            } else {
                if (isIgnoreNull) {
                    //<if test="entity.<p>!=null">
                    sqlSet.append("<if test=\"entity.").append(column.getProperty()).append("!=null")
                        //本想添加 and entity<p>!=''.toString,但日期等格式的属性较难处理，暂时不添加
//                        .append(" and entity.").append(column.getProperty()).append("!=''.toString()")
                        .append("\">"); //entity是从@Param中得到的字符串
                    //对pid做特殊处理，可以通过设置为'-'设置为空
                    if (PID_FIELD_NAME.equals(column.getColumn())) {
                        //  <choose>
                        sqlSet.append("<choose>");
                        //      <when test="entity.<p>!='-'.toString()">
                        sqlSet.append("<when test=\"entity.").append(column.getProperty()).append("!='-'.toString()\">");
                    }
                }
                //t.`<c>`=#{entity.<p>},
                sqlSet.append("t.`").append(column.getColumn()).append("`").append("=#{entity.").append(column.getProperty()).append("}").append(",");
                //如果存在path更改，同时更改子节点路径
                if (PATH_FIELD_NAME.equals(column.getColumn())){
                    //<if test="entity.path!=null and entity.path!=''.toString()">
                    //left join <table> c on (c.path like concat(t.path,'/%')
                    //</if>
                    sqlTable.append("<if test=\"entity.").append(column.getProperty()).append("!=null")
                            //本想添加 and entity<p>!=''.toString,但日期等格式的属性较难处理，暂时不添加
//                            .append(" and entity.").append(column.getProperty()).append("!=''.toString()")
                            .append("\">");
                    sqlTable.append(" left join ").append(SqlHelper.getDynamicTableName(entityClass,tableName(entityClass)))
                            .append(" c on (c.").append(PATH_FIELD_NAME).append(" like concat(t.")
                            .append(PATH_FIELD_NAME).append(",'/%'))");
                    sqlTable.append("</if>");
                    //c.path=concat(#{entity.<p>},substring(c.path,char_length(t.path)+1)),
                    sqlSet.append("c.").append(PATH_FIELD_NAME)
                            .append("=concat(#{entity.").append(column.getProperty()).append("},substring(c.")
                            .append(PATH_FIELD_NAME).append(",char_length(t.").append(PATH_FIELD_NAME).append(")+1)),");
                }
                if (isIgnoreNull) {
                    //对pid做特殊处理，可以通过设置为'-'设置为空
                    //      </when>
                    //      <otherwise>
                    //          t.`<c>`=null,
                    //      </otherwise>
                    //  </choose>
                    if (PID_FIELD_NAME.equals(column.getColumn())) {
                        sqlSet.append("</when>").append("<otherwise>")
                                .append("t.`").append(column.getColumn()).append("`=null,")
                                .append("</otherwise>").append("</choose>");
                    }
                    //</if>
                    sqlSet.append("</if>");
                }
            }
        }
        sqlSet.append("</set>");
        sqlWhere.append("</where>");
        StringBuilder sql = (new StringBuilder(sqlTable.toString()))
                .append(sqlSet.toString()).append(sqlWhere.toString());

        return sql.toString();
    }

    /** 生成删除sql */
    private String getDeleteString(MappedStatement ms){
        final Class<?> entityClass = getEntityClass(ms); //获得列名称转换对象

        StringBuilder sql = new StringBuilder(); //sql语句
        StringBuilder sqlWhere = new StringBuilder(); //sql语句内where部分
        Set<EntityColumn> columns = EntityHelper.getColumns(entityClass);
        //update <table> t
        sql.append(SqlHelper.updateTable(entityClass,tableName(entityClass))).append(" t");
        //set deleted=1,last_modify_user_id=#{lastModifyUserId},lastModifyTime=时间
        sql.append("<set>");
        sqlWhere.append("<where>");
        for (EntityColumn column : columns) {
            if (!column.isUpdatable()) continue;
            if (isDeleted(column)) {
                // set deleted=1
                sql.append("t.`").append(column.getColumn()).append("`").append("=1").append(",");
                // and deleted=0
                sqlWhere.append(" and t.`").append(column.getColumn()).append("`").append("=0");
            } else if (isId(column)) {
                sqlWhere.append(getIdCondition(column));
            } else if (isLastModifyUserId(column)) {
                sql.append(getLastModifyUserIdSetString(column));
            } else if (isLastModifyRoleId(column)) {
                sql.append(getLastModifyRoleIdSetString(column));
            } else if (isLastModifyTime(column)) {
                sql.append(getLastModifyTimeSetString(column));
            }
        }
        sql.append("</set>");
        sqlWhere.append("</where>");

        sql.append(sqlWhere.toString());

        return sql.toString();
    }

    /**
     *   <if test="idList != null and idList.size() > 0">
     *       and t.`id` in
     *       <foreach collection="idList" item="id" open="(" separator="," close=")">
     *          #{id}
     *       </foreach>
     *   </if>
     */
    private String getIdCondition(EntityColumn column){
        final String ID_LIST_PARAM = "idList"; //@Param内定义的字符串
        return "<if test=\"" + ID_LIST_PARAM + "!=null and " + ID_LIST_PARAM + ".size() > 0\">" +
                " and t.`" + column.getColumn() + "` in " +
                "<foreach collection=\"" + ID_LIST_PARAM + "\" item=\"id\" open=\"(\" separator=\",\" close=\")\">" +
                "#{id}" +
                "</foreach>" +
                "</if>";
    }

    /**
     *  <if test="lastModifyUserId != null">
     *      t.`<c>` = #{lastModifyUserId},
     *  </if>
     */
    private String getLastModifyUserIdSetString(EntityColumn column){
        final String PARAM_NAME = "lastModifyUserId"; //@Param内定义的字符串
        return "<if test=\"" + PARAM_NAME + "!=null\">" +
                "t.`" + column.getColumn() + "`" + "=#{" + PARAM_NAME + "}" + "," +
                "</if>";
    }

    /**
     *  <if test="lastModifyRoleId != null">
     *      t.`<c>` = #{lastModifyRoleId},
     *  </if>
     */
    private String getLastModifyRoleIdSetString(EntityColumn column){
        final String PARAM_NAME = "lastModifyRoleId"; //@Param内定义的字符串
        return "<if test=\"" + PARAM_NAME + "!=null\">" +
                "t.`" + column.getColumn() + "`" + "=#{" + PARAM_NAME + "}" + "," +
                "</if>";
    }

    /**
     *  <choose>
     *     <when test="lastModifyTime != null">
     *         t.`<c>` = #{lastModifyTime},
     *     </when>
     *     <otherwise>
     *         t.`<c>` = now()
     *     </otherwise>
     *  </choose>
     */
    private String getLastModifyTimeSetString(EntityColumn column){
        final String PARAM_NAME = "lastModifyTime"; //@Param内定义的字符串
        return "<choose>" +
                "<when test=\"" + PARAM_NAME + "!=null\">" +
                "t.`" + column.getColumn() + "`" + "=#{" + PARAM_NAME + "}" + "," +
                "</when>" +
                "<otherwise>" +
                "t.`" + column.getColumn() + "`" + "=now()" + "," +
                "</otherwise>" +
                "</choose>";
    }

    private boolean isId(EntityColumn column){
        return "id".equals(column.getColumn());
    }

    private boolean isLastModifyUserId(EntityColumn column){
        return "last_modify_user_id".equals(column.getColumn());
    }

    private boolean isLastModifyRoleId(EntityColumn column){
        return "last_modify_role_id".equals(column.getColumn());
    }

    private boolean isLastModifyTime(EntityColumn column){
        return "last_modify_time".equals(column.getColumn());
    }

    private boolean isDeleted(EntityColumn column){
        return "deleted".equals(column.getColumn());
    }
}
