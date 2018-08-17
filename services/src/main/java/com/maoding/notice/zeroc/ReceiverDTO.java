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
// Generated from file `NoticeData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.notice.zeroc;

public class ReceiverDTO implements java.lang.Cloneable,
                                    java.io.Serializable
{
    public String topic;

    public String getTopic()
    {
        return topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public String projectId;

    public String getProjectId()
    {
        return projectId;
    }

    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String companyId;

    public String getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(String companyId)
    {
        this.companyId = companyId;
    }

    public String userId;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public ReceiverDTO()
    {
        this.topic = "";
        this.projectId = "";
        this.companyId = "";
        this.userId = "";
    }

    public ReceiverDTO(String topic, String projectId, String companyId, String userId)
    {
        this.topic = topic;
        this.projectId = projectId;
        this.companyId = companyId;
        this.userId = userId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ReceiverDTO r = null;
        if(rhs instanceof ReceiverDTO)
        {
            r = (ReceiverDTO)rhs;
        }

        if(r != null)
        {
            if(this.topic != r.topic)
            {
                if(this.topic == null || r.topic == null || !this.topic.equals(r.topic))
                {
                    return false;
                }
            }
            if(this.projectId != r.projectId)
            {
                if(this.projectId == null || r.projectId == null || !this.projectId.equals(r.projectId))
                {
                    return false;
                }
            }
            if(this.companyId != r.companyId)
            {
                if(this.companyId == null || r.companyId == null || !this.companyId.equals(r.companyId))
                {
                    return false;
                }
            }
            if(this.userId != r.userId)
            {
                if(this.userId == null || r.userId == null || !this.userId.equals(r.userId))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::ReceiverDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, topic);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, projectId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, userId);
        return h_;
    }

    public ReceiverDTO clone()
    {
        ReceiverDTO c = null;
        try
        {
            c = (ReceiverDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.topic);
        ostr.writeString(this.projectId);
        ostr.writeString(this.companyId);
        ostr.writeString(this.userId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.topic = istr.readString();
        this.projectId = istr.readString();
        this.companyId = istr.readString();
        this.userId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, ReceiverDTO v)
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

    static public ReceiverDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        ReceiverDTO v = new ReceiverDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<ReceiverDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, ReceiverDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<ReceiverDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(ReceiverDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final ReceiverDTO _nullMarshalValue = new ReceiverDTO();

    public static final long serialVersionUID = 2070741251L;
}
