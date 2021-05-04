package com.owncloud.android.lib.resources.status.services.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/owncloud/android/lib/resources/status/services/implementation/OCServerInfoService;", "Lcom/owncloud/android/lib/resources/status/services/ServerInfoService;", "()V", "checkPathExistence", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "", "path", "", "isUserLogged", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "getRemoteStatus", "Lcom/owncloud/android/lib/resources/status/RemoteServerInfo;", "owncloudComLibrary_debug"})
public final class OCServerInfoService implements com.owncloud.android.lib.resources.status.services.ServerInfoService {
    
    public OCServerInfoService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<java.lang.Boolean> checkPathExistence(@org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean isUserLogged, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.status.RemoteServerInfo> getRemoteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
}