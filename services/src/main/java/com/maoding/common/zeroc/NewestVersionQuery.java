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

public class NewestVersionQuery implements java.lang.Cloneable,
                                           java.io.Serializable
{
    public String service;

    public String getService()
    {
        return service;
    }

    public void setService(String service)
    {
        this.service = service;
    }

    public NewestVersionQuery()
    {
        this.service = "";
    }

    public NewestVersionQuery(String service)
    {
        this.service = service;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NewestVersionQuery r = null;
        if(rhs instanceof NewestVersionQuery)
        {
            r = (NewestVersionQuery)rhs;
        }

        if(r != null)
        {
            if(this.service != r.service)
            {
                if(this.service == null || r.service == null || !this.service.equals(r.service))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::NewestVersionQuery");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, service);
        return h_;
    }

    public NewestVersionQuery clone()
    {
        NewestVersionQuery c = null;
        try
        {
            c = (NewestVersionQuery)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.service);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.service = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, NewestVersionQuery v)
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

    static public NewestVersionQuery ice_read(com.zeroc.Ice.InputStream istr)
    {
        NewestVersionQuery v = new NewestVersionQuery();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<NewestVersionQuery> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, NewestVersionQuery v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<NewestVersionQuery> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(NewestVersionQuery.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final NewestVersionQuery _nullMarshalValue = new NewestVersionQuery();

    public static final long serialVersionUID = -70781570L;
}
