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
// Generated from file `ProjectData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.project.zeroc;

public class LocationDTO implements java.lang.Cloneable,
                                    java.io.Serializable
{
    public String city;

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String county;

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String detailAddress;

    public String getDetailAddress()
    {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress)
    {
        this.detailAddress = detailAddress;
    }

    public LocationDTO()
    {
        this.city = "";
        this.county = "";
        this.detailAddress = "";
    }

    public LocationDTO(String city, String county, String detailAddress)
    {
        this.city = city;
        this.county = county;
        this.detailAddress = detailAddress;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        LocationDTO r = null;
        if(rhs instanceof LocationDTO)
        {
            r = (LocationDTO)rhs;
        }

        if(r != null)
        {
            if(this.city != r.city)
            {
                if(this.city == null || r.city == null || !this.city.equals(r.city))
                {
                    return false;
                }
            }
            if(this.county != r.county)
            {
                if(this.county == null || r.county == null || !this.county.equals(r.county))
                {
                    return false;
                }
            }
            if(this.detailAddress != r.detailAddress)
            {
                if(this.detailAddress == null || r.detailAddress == null || !this.detailAddress.equals(r.detailAddress))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::LocationDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, city);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, county);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, detailAddress);
        return h_;
    }

    public LocationDTO clone()
    {
        LocationDTO c = null;
        try
        {
            c = (LocationDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.city);
        ostr.writeString(this.county);
        ostr.writeString(this.detailAddress);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.city = istr.readString();
        this.county = istr.readString();
        this.detailAddress = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, LocationDTO v)
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

    static public LocationDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        LocationDTO v = new LocationDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<LocationDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, LocationDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<LocationDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(LocationDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final LocationDTO _nullMarshalValue = new LocationDTO();

    public static final long serialVersionUID = -24216683L;
}
