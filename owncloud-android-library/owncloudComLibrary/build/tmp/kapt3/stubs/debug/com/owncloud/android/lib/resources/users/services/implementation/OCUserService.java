package com.owncloud.android.lib.resources.users.services.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/owncloud/android/lib/resources/users/services/implementation/OCUserService;", "Lcom/owncloud/android/lib/resources/users/services/UserService;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "(Lcom/owncloud/android/lib/common/OwnCloudClient;)V", "getClient", "()Lcom/owncloud/android/lib/common/OwnCloudClient;", "getUserAvatar", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/users/RemoteAvatarData;", "avatarDimension", "", "getUserInfo", "Lcom/owncloud/android/lib/resources/users/RemoteUserInfo;", "getUserQuota", "Lcom/owncloud/android/lib/resources/users/GetRemoteUserQuotaOperation$RemoteQuota;", "owncloudComLibrary_debug"})
public final class OCUserService implements com.owncloud.android.lib.resources.users.services.UserService {
    @org.jetbrains.annotations.NotNull()
    private final com.owncloud.android.lib.common.OwnCloudClient client = null;
    
    public OCUserService(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.OwnCloudClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.RemoteUserInfo> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.GetRemoteUserQuotaOperation.RemoteQuota> getUserQuota() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.RemoteAvatarData> getUserAvatar(int avatarDimension) {
        return null;
    }
}