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

public final class PropertyListHelper
{
    public static void write(com.zeroc.Ice.OutputStream ostr, java.util.List<ProjectPropertyDTO> v)
    {
        if(v == null)
        {
            ostr.writeSize(0);
        }
        else
        {
            ostr.writeSize(v.size());
            for(ProjectPropertyDTO elem : v)
            {
                ProjectPropertyDTO.ice_write(ostr, elem);
            }
        }
    }

    public static java.util.List<ProjectPropertyDTO> read(com.zeroc.Ice.InputStream istr)
    {
        final java.util.List<ProjectPropertyDTO> v;
        v = new java.util.ArrayList<ProjectPropertyDTO>();
        final int len0 = istr.readAndCheckSeqSize(4);
        for(int i0 = 0; i0 < len0; i0++)
        {
            ProjectPropertyDTO elem;
            elem = ProjectPropertyDTO.ice_read(istr);
            v.add(elem);
        }
        return v;
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<java.util.List<ProjectPropertyDTO>> v)
    {
        if(v != null && v.isPresent())
        {
            write(ostr, tag, v.get());
        }
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.List<ProjectPropertyDTO> v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            PropertyListHelper.write(ostr, v);
            ostr.endSize(pos);
        }
    }

    public static java.util.Optional<java.util.List<ProjectPropertyDTO>> read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            java.util.List<ProjectPropertyDTO> v;
            v = PropertyListHelper.read(istr);
            return java.util.Optional.of(v);
        }
        else
        {
            return java.util.Optional.empty();
        }
    }
}
