package com.owncloud.android.lib.resources.users.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/owncloud/android/lib/resources/users/services/UserService;", "Lcom/owncloud/android/lib/resources/Service;", "getUserAvatar", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/users/RemoteAvatarData;", "avatarDimension", "", "getUserInfo", "Lcom/owncloud/android/lib/resources/users/RemoteUserInfo;", "getUserQuota", "Lcom/owncloud/android/lib/resources/users/GetRemoteUserQuotaOperation$RemoteQuota;", "owncloudComLibrary_debug"})
public abstract interface UserService extends com.owncloud.android.lib.resources.Service {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.RemoteUserInfo> getUserInfo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.GetRemoteUserQuotaOperation.RemoteQuota> getUserQuota();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.RemoteAvatarData> getUserAvatar(int avatarDimension);
}