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

public class SummaryFileSimpleDTO implements java.lang.Cloneable,
                                             java.io.Serializable
{
    public long totalUsageSize;

    public long getTotalUsageSize()
    {
        return totalUsageSize;
    }

    public void setTotalUsageSize(long totalUsageSize)
    {
        this.totalUsageSize = totalUsageSize;
    }

    public long totalAllocSize;

    public long getTotalAllocSize()
    {
        return totalAllocSize;
    }

    public void setTotalAllocSize(long totalAllocSize)
    {
        this.totalAllocSize = totalAllocSize;
    }

    public SummaryFileSimpleDTO()
    {
    }

    public SummaryFileSimpleDTO(long totalUsageSize, long totalAllocSize)
    {
        this.totalUsageSize = totalUsageSize;
        this.totalAllocSize = totalAllocSize;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SummaryFileSimpleDTO r = null;
        if(rhs instanceof SummaryFileSimpleDTO)
        {
            r = (SummaryFileSimpleDTO)rhs;
        }

        if(r != null)
        {
            if(this.totalUsageSize != r.totalUsageSize)
            {
                return false;
            }
            if(this.totalAllocSize != r.totalAllocSize)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::SummaryFileSimpleDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, totalUsageSize);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, totalAllocSize);
        return h_;
    }

    public SummaryFileSimpleDTO clone()
    {
        SummaryFileSimpleDTO c = null;
        try
        {
            c = (SummaryFileSimpleDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeLong(this.totalUsageSize);
        ostr.writeLong(this.totalAllocSize);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.totalUsageSize = istr.readLong();
        this.totalAllocSize = istr.readLong();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, SummaryFileSimpleDTO v)
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

    static public SummaryFileSimpleDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        SummaryFileSimpleDTO v = new SummaryFileSimpleDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<SummaryFileSimpleDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, SummaryFileSimpleDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            ostr.writeSize(16);
            ice_write(ostr, v);
        }
    }

    static public java.util.Optional<SummaryFileSimpleDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            istr.skipSize();
            return java.util.Optional.of(SummaryFileSimpleDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final SummaryFileSimpleDTO _nullMarshalValue = new SummaryFileSimpleDTO();

    public static final long serialVersionUID = -1657535623L;
}
