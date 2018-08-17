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
// Generated from file `Common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.common.zeroc;

public interface CommonServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default ConstServicePrx getDefaultConstService()
        throws CustomException
    {
        return getDefaultConstService(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default ConstServicePrx getDefaultConstService(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getDefaultConstServiceAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<ConstServicePrx> getDefaultConstServiceAsync()
    {
        return _iceI_getDefaultConstServiceAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<ConstServicePrx> getDefaultConstServiceAsync(java.util.Map<String, String> context)
    {
        return _iceI_getDefaultConstServiceAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<ConstServicePrx> _iceI_getDefaultConstServiceAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<ConstServicePrx> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDefaultConstService", null, sync, _iceE_getDefaultConstService);
        f.invoke(true, context, null, null, istr -> {
                     ConstServicePrx ret;
                     ret = ConstServicePrx.uncheckedCast(istr.readProxy());
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getDefaultConstService =
    {
        CustomException.class
    };

    default com.maoding.storage.zeroc.StorageServicePrx getDefaultStorageService()
        throws CustomException
    {
        return getDefaultStorageService(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default com.maoding.storage.zeroc.StorageServicePrx getDefaultStorageService(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getDefaultStorageServiceAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<com.maoding.storage.zeroc.StorageServicePrx> getDefaultStorageServiceAsync()
    {
        return _iceI_getDefaultStorageServiceAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<com.maoding.storage.zeroc.StorageServicePrx> getDefaultStorageServiceAsync(java.util.Map<String, String> context)
    {
        return _iceI_getDefaultStorageServiceAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<com.maoding.storage.zeroc.StorageServicePrx> _iceI_getDefaultStorageServiceAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<com.maoding.storage.zeroc.StorageServicePrx> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDefaultStorageService", null, sync, _iceE_getDefaultStorageService);
        f.invoke(true, context, null, null, istr -> {
                     com.maoding.storage.zeroc.StorageServicePrx ret;
                     ret = com.maoding.storage.zeroc.StorageServicePrx.uncheckedCast(istr.readProxy());
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getDefaultStorageService =
    {
        CustomException.class
    };

    default com.maoding.fileServer.zeroc.FileServicePrx getDefaultFileService()
        throws CustomException
    {
        return getDefaultFileService(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default com.maoding.fileServer.zeroc.FileServicePrx getDefaultFileService(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getDefaultFileServiceAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<com.maoding.fileServer.zeroc.FileServicePrx> getDefaultFileServiceAsync()
    {
        return _iceI_getDefaultFileServiceAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<com.maoding.fileServer.zeroc.FileServicePrx> getDefaultFileServiceAsync(java.util.Map<String, String> context)
    {
        return _iceI_getDefaultFileServiceAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<com.maoding.fileServer.zeroc.FileServicePrx> _iceI_getDefaultFileServiceAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<com.maoding.fileServer.zeroc.FileServicePrx> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDefaultFileService", null, sync, _iceE_getDefaultFileService);
        f.invoke(true, context, null, null, istr -> {
                     com.maoding.fileServer.zeroc.FileServicePrx ret;
                     ret = com.maoding.fileServer.zeroc.FileServicePrx.uncheckedCast(istr.readProxy());
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getDefaultFileService =
    {
        CustomException.class
    };

    default com.maoding.user.zeroc.UserServicePrx getDefaultUserService()
        throws CustomException
    {
        return getDefaultUserService(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default com.maoding.user.zeroc.UserServicePrx getDefaultUserService(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getDefaultUserServiceAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<com.maoding.user.zeroc.UserServicePrx> getDefaultUserServiceAsync()
    {
        return _iceI_getDefaultUserServiceAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<com.maoding.user.zeroc.UserServicePrx> getDefaultUserServiceAsync(java.util.Map<String, String> context)
    {
        return _iceI_getDefaultUserServiceAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<com.maoding.user.zeroc.UserServicePrx> _iceI_getDefaultUserServiceAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<com.maoding.user.zeroc.UserServicePrx> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDefaultUserService", null, sync, _iceE_getDefaultUserService);
        f.invoke(true, context, null, null, istr -> {
                     com.maoding.user.zeroc.UserServicePrx ret;
                     ret = com.maoding.user.zeroc.UserServicePrx.uncheckedCast(istr.readProxy());
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getDefaultUserService =
    {
        CustomException.class
    };

    default com.maoding.notice.zeroc.NoticeServicePrx getDefaultNoticeService()
        throws CustomException
    {
        return getDefaultNoticeService(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default com.maoding.notice.zeroc.NoticeServicePrx getDefaultNoticeService(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getDefaultNoticeServiceAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<com.maoding.notice.zeroc.NoticeServicePrx> getDefaultNoticeServiceAsync()
    {
        return _iceI_getDefaultNoticeServiceAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<com.maoding.notice.zeroc.NoticeServicePrx> getDefaultNoticeServiceAsync(java.util.Map<String, String> context)
    {
        return _iceI_getDefaultNoticeServiceAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<com.maoding.notice.zeroc.NoticeServicePrx> _iceI_getDefaultNoticeServiceAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<com.maoding.notice.zeroc.NoticeServicePrx> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDefaultNoticeService", null, sync, _iceE_getDefaultNoticeService);
        f.invoke(true, context, null, null, istr -> {
                     com.maoding.notice.zeroc.NoticeServicePrx ret;
                     ret = com.maoding.notice.zeroc.NoticeServicePrx.uncheckedCast(istr.readProxy());
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getDefaultNoticeService =
    {
        CustomException.class
    };

    default void updateService()
        throws CustomException
    {
        updateService(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void updateService(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            _iceI_updateServiceAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Void> updateServiceAsync()
    {
        return _iceI_updateServiceAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> updateServiceAsync(java.util.Map<String, String> context)
    {
        return _iceI_updateServiceAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_updateServiceAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "updateService", null, sync, _iceE_updateService);
        f.invoke(true, context, null, null, null);
        return f;
    }

    static final Class<?>[] _iceE_updateService =
    {
        CustomException.class
    };

    default VersionDTO getNewestClient()
        throws CustomException
    {
        return getNewestClient(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default VersionDTO getNewestClient(java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getNewestClientAsync(context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<VersionDTO> getNewestClientAsync()
    {
        return _iceI_getNewestClientAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<VersionDTO> getNewestClientAsync(java.util.Map<String, String> context)
    {
        return _iceI_getNewestClientAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<VersionDTO> _iceI_getNewestClientAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<VersionDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getNewestClient", null, sync, _iceE_getNewestClient);
        f.invoke(true, context, null, null, istr -> {
                     VersionDTO ret;
                     ret = VersionDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getNewestClient =
    {
        CustomException.class
    };

    default long getVersionLength(VersionDTO version)
        throws CustomException
    {
        return getVersionLength(version, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default long getVersionLength(VersionDTO version, java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_getVersionLengthAsync(version, context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<java.lang.Long> getVersionLengthAsync(VersionDTO version)
    {
        return _iceI_getVersionLengthAsync(version, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Long> getVersionLengthAsync(VersionDTO version, java.util.Map<String, String> context)
    {
        return _iceI_getVersionLengthAsync(version, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Long> _iceI_getVersionLengthAsync(VersionDTO iceP_version, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Long> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getVersionLength", null, sync, _iceE_getVersionLength);
        f.invoke(true, context, null, ostr -> {
                     VersionDTO.ice_write(ostr, iceP_version);
                 }, istr -> {
                     long ret;
                     ret = istr.readLong();
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_getVersionLength =
    {
        CustomException.class
    };

    default com.maoding.fileServer.zeroc.FileDataDTO readVersion(VersionDTO version, long pos, int size)
        throws CustomException
    {
        return readVersion(version, pos, size, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default com.maoding.fileServer.zeroc.FileDataDTO readVersion(VersionDTO version, long pos, int size, java.util.Map<String, String> context)
        throws CustomException
    {
        try
        {
            return _iceI_readVersionAsync(version, pos, size, context, true).waitForResponseOrUserEx();
        }
        catch(CustomException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<com.maoding.fileServer.zeroc.FileDataDTO> readVersionAsync(VersionDTO version, long pos, int size)
    {
        return _iceI_readVersionAsync(version, pos, size, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<com.maoding.fileServer.zeroc.FileDataDTO> readVersionAsync(VersionDTO version, long pos, int size, java.util.Map<String, String> context)
    {
        return _iceI_readVersionAsync(version, pos, size, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<com.maoding.fileServer.zeroc.FileDataDTO> _iceI_readVersionAsync(VersionDTO iceP_version, long iceP_pos, int iceP_size, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<com.maoding.fileServer.zeroc.FileDataDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "readVersion", null, sync, _iceE_readVersion);
        f.invoke(true, context, null, ostr -> {
                     VersionDTO.ice_write(ostr, iceP_version);
                     ostr.writeLong(iceP_pos);
                     ostr.writeInt(iceP_size);
                 }, istr -> {
                     com.maoding.fileServer.zeroc.FileDataDTO ret;
                     ret = com.maoding.fileServer.zeroc.FileDataDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_readVersion =
    {
        CustomException.class
    };

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CommonServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), CommonServicePrx.class, _CommonServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CommonServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), CommonServicePrx.class, _CommonServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CommonServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), CommonServicePrx.class, _CommonServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CommonServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), CommonServicePrx.class, _CommonServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static CommonServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, CommonServicePrx.class, _CommonServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static CommonServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, CommonServicePrx.class, _CommonServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default CommonServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (CommonServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default CommonServicePrx ice_adapterId(String newAdapterId)
    {
        return (CommonServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default CommonServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (CommonServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default CommonServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (CommonServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default CommonServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (CommonServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default CommonServicePrx ice_connectionCached(boolean newCache)
    {
        return (CommonServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default CommonServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (CommonServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default CommonServicePrx ice_secure(boolean b)
    {
        return (CommonServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default CommonServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (CommonServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default CommonServicePrx ice_preferSecure(boolean b)
    {
        return (CommonServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default CommonServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (CommonServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default CommonServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (CommonServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default CommonServicePrx ice_collocationOptimized(boolean b)
    {
        return (CommonServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default CommonServicePrx ice_twoway()
    {
        return (CommonServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default CommonServicePrx ice_oneway()
    {
        return (CommonServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default CommonServicePrx ice_batchOneway()
    {
        return (CommonServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default CommonServicePrx ice_datagram()
    {
        return (CommonServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default CommonServicePrx ice_batchDatagram()
    {
        return (CommonServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default CommonServicePrx ice_compress(boolean co)
    {
        return (CommonServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default CommonServicePrx ice_timeout(int t)
    {
        return (CommonServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default CommonServicePrx ice_connectionId(String connectionId)
    {
        return (CommonServicePrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::zeroc::CommonService";
    }
}
