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

public class AnnotateDTO implements java.lang.Cloneable,
                                    java.io.Serializable
{
    public String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String pid;

    public String getPid()
    {
        return pid;
    }

    public void setPid(String pid)
    {
        this.pid = pid;
    }

    public String typeId;

    public String getTypeId()
    {
        return typeId;
    }

    public void setTypeId(String typeId)
    {
        this.typeId = typeId;
    }

    public String statusId;

    public String getStatusId()
    {
        return statusId;
    }

    public void setStatusId(String statusId)
    {
        this.statusId = statusId;
    }

    public String content;

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String fileId;

    public String getFileId()
    {
        return fileId;
    }

    public void setFileId(String fileId)
    {
        this.fileId = fileId;
    }

    public String mainFileId;

    public String getMainFileId()
    {
        return mainFileId;
    }

    public void setMainFileId(String mainFileId)
    {
        this.mainFileId = mainFileId;
    }

    public EmbedElementDTO element;

    public EmbedElementDTO getElement()
    {
        return element;
    }

    public void setElement(EmbedElementDTO element)
    {
        this.element = element;
    }

    public java.util.List<NodeFileDTO> accessoryList;

    public java.util.List<NodeFileDTO> getAccessoryList()
    {
        return accessoryList;
    }

    public void setAccessoryList(java.util.List<NodeFileDTO> accessoryList)
    {
        this.accessoryList = accessoryList;
    }

    public long createTimeStamp;

    public long getCreateTimeStamp()
    {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(long createTimeStamp)
    {
        this.createTimeStamp = createTimeStamp;
    }

    public String createTimeText;

    public String getCreateTimeText()
    {
        return createTimeText;
    }

    public void setCreateTimeText(String createTimeText)
    {
        this.createTimeText = createTimeText;
    }

    public long lastModifyTimeStamp;

    public long getLastModifyTimeStamp()
    {
        return lastModifyTimeStamp;
    }

    public void setLastModifyTimeStamp(long lastModifyTimeStamp)
    {
        this.lastModifyTimeStamp = lastModifyTimeStamp;
    }

    public String lastModifyTimeText;

    public String getLastModifyTimeText()
    {
        return lastModifyTimeText;
    }

    public void setLastModifyTimeText(String lastModifyTimeText)
    {
        this.lastModifyTimeText = lastModifyTimeText;
    }

    public String lastModifyUserId;

    public String getLastModifyUserId()
    {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId)
    {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String lastModifyRoleId;

    public String getLastModifyRoleId()
    {
        return lastModifyRoleId;
    }

    public void setLastModifyRoleId(String lastModifyRoleId)
    {
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public AnnotateDTO()
    {
        this.id = "";
        this.name = "";
        this.pid = "";
        this.typeId = "";
        this.statusId = "";
        this.content = "";
        this.fileId = "";
        this.mainFileId = "";
        this.element = new EmbedElementDTO();
        this.createTimeText = "";
        this.lastModifyTimeText = "";
        this.lastModifyUserId = "";
        this.lastModifyRoleId = "";
    }

    public AnnotateDTO(String id, String name, String pid, String typeId, String statusId, String content, String fileId, String mainFileId, EmbedElementDTO element, java.util.List<NodeFileDTO> accessoryList, long createTimeStamp, String createTimeText, long lastModifyTimeStamp, String lastModifyTimeText, String lastModifyUserId, String lastModifyRoleId)
    {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.typeId = typeId;
        this.statusId = statusId;
        this.content = content;
        this.fileId = fileId;
        this.mainFileId = mainFileId;
        this.element = element;
        this.accessoryList = accessoryList;
        this.createTimeStamp = createTimeStamp;
        this.createTimeText = createTimeText;
        this.lastModifyTimeStamp = lastModifyTimeStamp;
        this.lastModifyTimeText = lastModifyTimeText;
        this.lastModifyUserId = lastModifyUserId;
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        AnnotateDTO r = null;
        if(rhs instanceof AnnotateDTO)
        {
            r = (AnnotateDTO)rhs;
        }

        if(r != null)
        {
            if(this.id != r.id)
            {
                if(this.id == null || r.id == null || !this.id.equals(r.id))
                {
                    return false;
                }
            }
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
                {
                    return false;
                }
            }
            if(this.pid != r.pid)
            {
                if(this.pid == null || r.pid == null || !this.pid.equals(r.pid))
                {
                    return false;
                }
            }
            if(this.typeId != r.typeId)
            {
                if(this.typeId == null || r.typeId == null || !this.typeId.equals(r.typeId))
                {
                    return false;
                }
            }
            if(this.statusId != r.statusId)
            {
                if(this.statusId == null || r.statusId == null || !this.statusId.equals(r.statusId))
                {
                    return false;
                }
            }
            if(this.content != r.content)
            {
                if(this.content == null || r.content == null || !this.content.equals(r.content))
                {
                    return false;
                }
            }
            if(this.fileId != r.fileId)
            {
                if(this.fileId == null || r.fileId == null || !this.fileId.equals(r.fileId))
                {
                    return false;
                }
            }
            if(this.mainFileId != r.mainFileId)
            {
                if(this.mainFileId == null || r.mainFileId == null || !this.mainFileId.equals(r.mainFileId))
                {
                    return false;
                }
            }
            if(this.element != r.element)
            {
                if(this.element == null || r.element == null || !this.element.equals(r.element))
                {
                    return false;
                }
            }
            if(this.accessoryList != r.accessoryList)
            {
                if(this.accessoryList == null || r.accessoryList == null || !this.accessoryList.equals(r.accessoryList))
                {
                    return false;
                }
            }
            if(this.createTimeStamp != r.createTimeStamp)
            {
                return false;
            }
            if(this.createTimeText != r.createTimeText)
            {
                if(this.createTimeText == null || r.createTimeText == null || !this.createTimeText.equals(r.createTimeText))
                {
                    return false;
                }
            }
            if(this.lastModifyTimeStamp != r.lastModifyTimeStamp)
            {
                return false;
            }
            if(this.lastModifyTimeText != r.lastModifyTimeText)
            {
                if(this.lastModifyTimeText == null || r.lastModifyTimeText == null || !this.lastModifyTimeText.equals(r.lastModifyTimeText))
                {
                    return false;
                }
            }
            if(this.lastModifyUserId != r.lastModifyUserId)
            {
                if(this.lastModifyUserId == null || r.lastModifyUserId == null || !this.lastModifyUserId.equals(r.lastModifyUserId))
                {
                    return false;
                }
            }
            if(this.lastModifyRoleId != r.lastModifyRoleId)
            {
                if(this.lastModifyRoleId == null || r.lastModifyRoleId == null || !this.lastModifyRoleId.equals(r.lastModifyRoleId))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::AnnotateDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pid);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, statusId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, content);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fileId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mainFileId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, element);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, accessoryList);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyRoleId);
        return h_;
    }

    public AnnotateDTO clone()
    {
        AnnotateDTO c = null;
        try
        {
            c = (AnnotateDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.id);
        ostr.writeString(this.name);
        ostr.writeString(this.pid);
        ostr.writeString(this.typeId);
        ostr.writeString(this.statusId);
        ostr.writeString(this.content);
        ostr.writeString(this.fileId);
        ostr.writeString(this.mainFileId);
        EmbedElementDTO.ice_write(ostr, this.element);
        NodeFileListHelper.write(ostr, this.accessoryList);
        ostr.writeLong(this.createTimeStamp);
        ostr.writeString(this.createTimeText);
        ostr.writeLong(this.lastModifyTimeStamp);
        ostr.writeString(this.lastModifyTimeText);
        ostr.writeString(this.lastModifyUserId);
        ostr.writeString(this.lastModifyRoleId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.name = istr.readString();
        this.pid = istr.readString();
        this.typeId = istr.readString();
        this.statusId = istr.readString();
        this.content = istr.readString();
        this.fileId = istr.readString();
        this.mainFileId = istr.readString();
        this.element = EmbedElementDTO.ice_read(istr);
        this.accessoryList = NodeFileListHelper.read(istr);
        this.createTimeStamp = istr.readLong();
        this.createTimeText = istr.readString();
        this.lastModifyTimeStamp = istr.readLong();
        this.lastModifyTimeText = istr.readString();
        this.lastModifyUserId = istr.readString();
        this.lastModifyRoleId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, AnnotateDTO v)
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

    static public AnnotateDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        AnnotateDTO v = new AnnotateDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<AnnotateDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, AnnotateDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<AnnotateDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(AnnotateDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final AnnotateDTO _nullMarshalValue = new AnnotateDTO();

    public static final long serialVersionUID = 453183839L;
}
