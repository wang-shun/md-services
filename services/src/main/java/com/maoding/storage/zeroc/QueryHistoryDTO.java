// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `StorageData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.storage.zeroc;

public class QueryHistoryDTO implements java.lang.Cloneable,
                                        java.io.Serializable
{
    public String mainFileId;

    public String getMainFileId()
    {
        return mainFileId;
    }

    public void setMainFileId(String mainFileId)
    {
        this.mainFileId = mainFileId;
    }

    public String actionAttr;

    public String getActionAttr()
    {
        return actionAttr;
    }

    public void setActionAttr(String actionAttr)
    {
        this.actionAttr = actionAttr;
    }

    public String actionTypeId;

    public String getActionTypeId()
    {
        return actionTypeId;
    }

    public void setActionTypeId(String actionTypeId)
    {
        this.actionTypeId = actionTypeId;
    }

    public String notActionTypeId;

    public String getNotActionTypeId()
    {
        return notActionTypeId;
    }

    public void setNotActionTypeId(String notActionTypeId)
    {
        this.notActionTypeId = notActionTypeId;
    }

    public String isCA;

    public String getIsCA()
    {
        return isCA;
    }

    public void setIsCA(String isCA)
    {
        this.isCA = isCA;
    }

    public String isCommit;

    public String getIsCommit()
    {
        return isCommit;
    }

    public void setIsCommit(String isCommit)
    {
        this.isCommit = isCommit;
    }

    public QueryHistoryDTO()
    {
        this.mainFileId = "";
        this.actionAttr = "";
        this.actionTypeId = "";
        this.notActionTypeId = "";
        this.isCA = "";
        this.isCommit = "";
    }

    public QueryHistoryDTO(String mainFileId, String actionAttr, String actionTypeId, String notActionTypeId, String isCA, String isCommit)
    {
        this.mainFileId = mainFileId;
        this.actionAttr = actionAttr;
        this.actionTypeId = actionTypeId;
        this.notActionTypeId = notActionTypeId;
        this.isCA = isCA;
        this.isCommit = isCommit;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryHistoryDTO r = null;
        if(rhs instanceof QueryHistoryDTO)
        {
            r = (QueryHistoryDTO)rhs;
        }

        if(r != null)
        {
            if(this.mainFileId != r.mainFileId)
            {
                if(this.mainFileId == null || r.mainFileId == null || !this.mainFileId.equals(r.mainFileId))
                {
                    return false;
                }
            }
            if(this.actionAttr != r.actionAttr)
            {
                if(this.actionAttr == null || r.actionAttr == null || !this.actionAttr.equals(r.actionAttr))
                {
                    return false;
                }
            }
            if(this.actionTypeId != r.actionTypeId)
            {
                if(this.actionTypeId == null || r.actionTypeId == null || !this.actionTypeId.equals(r.actionTypeId))
                {
                    return false;
                }
            }
            if(this.notActionTypeId != r.notActionTypeId)
            {
                if(this.notActionTypeId == null || r.notActionTypeId == null || !this.notActionTypeId.equals(r.notActionTypeId))
                {
                    return false;
                }
            }
            if(this.isCA != r.isCA)
            {
                if(this.isCA == null || r.isCA == null || !this.isCA.equals(r.isCA))
                {
                    return false;
                }
            }
            if(this.isCommit != r.isCommit)
            {
                if(this.isCommit == null || r.isCommit == null || !this.isCommit.equals(r.isCommit))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryHistoryDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mainFileId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, actionAttr);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, actionTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, notActionTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isCA);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isCommit);
        return h_;
    }

    public QueryHistoryDTO clone()
    {
        QueryHistoryDTO c = null;
        try
        {
            c = (QueryHistoryDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.mainFileId);
        ostr.writeString(this.actionAttr);
        ostr.writeString(this.actionTypeId);
        ostr.writeString(this.notActionTypeId);
        ostr.writeString(this.isCA);
        ostr.writeString(this.isCommit);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.mainFileId = istr.readString();
        this.actionAttr = istr.readString();
        this.actionTypeId = istr.readString();
        this.notActionTypeId = istr.readString();
        this.isCA = istr.readString();
        this.isCommit = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryHistoryDTO v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public QueryHistoryDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryHistoryDTO v = new QueryHistoryDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryHistoryDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryHistoryDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QueryHistoryDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QueryHistoryDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryHistoryDTO _nullMarshalValue = new QueryHistoryDTO();

    public static final long serialVersionUID = 1048901526L;
}
