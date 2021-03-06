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
// Generated from file `FileServerData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.fileServer.zeroc;

public class MoveNodeRequestDTO implements java.lang.Cloneable,
                                           java.io.Serializable
{
    public String fullName;

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public MoveNodeRequestDTO()
    {
        this.fullName = "";
    }

    public MoveNodeRequestDTO(String fullName)
    {
        this.fullName = fullName;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MoveNodeRequestDTO r = null;
        if(rhs instanceof MoveNodeRequestDTO)
        {
            r = (MoveNodeRequestDTO)rhs;
        }

        if(r != null)
        {
            if(this.fullName != r.fullName)
            {
                if(this.fullName == null || r.fullName == null || !this.fullName.equals(r.fullName))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::MoveNodeRequestDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fullName);
        return h_;
    }

    public MoveNodeRequestDTO clone()
    {
        MoveNodeRequestDTO c = null;
        try
        {
            c = (MoveNodeRequestDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.fullName);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.fullName = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, MoveNodeRequestDTO v)
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

    static public MoveNodeRequestDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        MoveNodeRequestDTO v = new MoveNodeRequestDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<MoveNodeRequestDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, MoveNodeRequestDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<MoveNodeRequestDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(MoveNodeRequestDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final MoveNodeRequestDTO _nullMarshalValue = new MoveNodeRequestDTO();

    public static final long serialVersionUID = 1039974534L;
}
