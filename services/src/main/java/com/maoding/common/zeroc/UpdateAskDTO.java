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
// Generated from file `CommonData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.common.zeroc;

public class UpdateAskDTO implements java.lang.Cloneable,
                                     java.io.Serializable
{
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

    public UpdateAskDTO()
    {
        this.lastModifyUserId = "";
        this.lastModifyRoleId = "";
    }

    public UpdateAskDTO(String lastModifyUserId, String lastModifyRoleId)
    {
        this.lastModifyUserId = lastModifyUserId;
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UpdateAskDTO r = null;
        if(rhs instanceof UpdateAskDTO)
        {
            r = (UpdateAskDTO)rhs;
        }

        if(r != null)
        {
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::UpdateAskDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyRoleId);
        return h_;
    }

    public UpdateAskDTO clone()
    {
        UpdateAskDTO c = null;
        try
        {
            c = (UpdateAskDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.lastModifyUserId);
        ostr.writeString(this.lastModifyRoleId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.lastModifyUserId = istr.readString();
        this.lastModifyRoleId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, UpdateAskDTO v)
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

    static public UpdateAskDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        UpdateAskDTO v = new UpdateAskDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<UpdateAskDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, UpdateAskDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<UpdateAskDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(UpdateAskDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final UpdateAskDTO _nullMarshalValue = new UpdateAskDTO();

    public static final long serialVersionUID = 1490522616L;
}
