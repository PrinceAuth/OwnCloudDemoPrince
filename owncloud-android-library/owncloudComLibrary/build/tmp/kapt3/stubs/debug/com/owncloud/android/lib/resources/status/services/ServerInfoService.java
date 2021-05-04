package com.owncloud.android.lib.resources.status.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\f"}, d2 = {"Lcom/owncloud/android/lib/resources/status/services/ServerInfoService;", "", "checkPathExistence", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "", "path", "", "isUserLogged", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "getRemoteStatus", "Lcom/owncloud/android/lib/resources/status/RemoteServerInfo;", "owncloudComLibrary_debug"})
public abstract interface ServerInfoService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<java.lang.Boolean> checkPathExistence(@org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean isUserLogged, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.status.RemoteServerInfo> getRemoteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client);
}