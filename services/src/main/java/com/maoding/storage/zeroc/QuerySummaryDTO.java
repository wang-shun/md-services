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

public class QuerySummaryDTO implements java.lang.Cloneable,
                                        java.io.Serializable
{
    public String accountId;

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
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

    public String serverTypeId;

    public String getServerTypeId()
    {
        return serverTypeId;
    }

    public void setServerTypeId(String serverTypeId)
    {
        this.serverTypeId = serverTypeId;
    }

    public String notServerTypeId;

    public String getNotServerTypeId()
    {
        return notServerTypeId;
    }

    public void setNotServerTypeId(String notServerTypeId)
    {
        this.notServerTypeId = notServerTypeId;
    }

    public String serverAddress;

    public String getServerAddress()
    {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress)
    {
        this.serverAddress = serverAddress;
    }

    public String baseDir;

    public String getBaseDir()
    {
        return baseDir;
    }

    public void setBaseDir(String baseDir)
    {
        this.baseDir = baseDir;
    }

    public QuerySummaryDTO()
    {
        this.accountId = "";
        this.companyId = "";
        this.serverTypeId = "";
        this.notServerTypeId = "";
        this.serverAddress = "";
        this.baseDir = "";
    }

    public QuerySummaryDTO(String accountId, String companyId, String serverTypeId, String notServerTypeId, String serverAddress, String baseDir)
    {
        this.accountId = accountId;
        this.companyId = companyId;
        this.serverTypeId = serverTypeId;
        this.notServerTypeId = notServerTypeId;
        this.serverAddress = serverAddress;
        this.baseDir = baseDir;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QuerySummaryDTO r = null;
        if(rhs instanceof QuerySummaryDTO)
        {
            r = (QuerySummaryDTO)rhs;
        }

        if(r != null)
        {
            if(this.accountId != r.accountId)
            {
                if(this.accountId == null || r.accountId == null || !this.accountId.equals(r.accountId))
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
            if(this.serverTypeId != r.serverTypeId)
            {
                if(this.serverTypeId == null || r.serverTypeId == null || !this.serverTypeId.equals(r.serverTypeId))
                {
                    return false;
                }
            }
            if(this.notServerTypeId != r.notServerTypeId)
            {
                if(this.notServerTypeId == null || r.notServerTypeId == null || !this.notServerTypeId.equals(r.notServerTypeId))
                {
                    return false;
                }
            }
            if(this.serverAddress != r.serverAddress)
            {
                if(this.serverAddress == null || r.serverAddress == null || !this.serverAddress.equals(r.serverAddress))
                {
                    return false;
                }
            }
            if(this.baseDir != r.baseDir)
            {
                if(this.baseDir == null || r.baseDir == null || !this.baseDir.equals(r.baseDir))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QuerySummaryDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, accountId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, serverTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, notServerTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, serverAddress);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, baseDir);
        return h_;
    }

    public QuerySummaryDTO clone()
    {
        QuerySummaryDTO c = null;
        try
        {
            c = (QuerySummaryDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.accountId);
        ostr.writeString(this.companyId);
        ostr.writeString(this.serverTypeId);
        ostr.writeString(this.notServerTypeId);
        ostr.writeString(this.serverAddress);
        ostr.writeString(this.baseDir);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.accountId = istr.readString();
        this.companyId = istr.readString();
        this.serverTypeId = istr.readString();
        this.notServerTypeId = istr.readString();
        this.serverAddress = istr.readString();
        this.baseDir = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QuerySummaryDTO v)
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

    static public QuerySummaryDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QuerySummaryDTO v = new QuerySummaryDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QuerySummaryDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QuerySummaryDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QuerySummaryDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QuerySummaryDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QuerySummaryDTO _nullMarshalValue = new QuerySummaryDTO();

    public static final long serialVersionUID = 1327074233L;
}