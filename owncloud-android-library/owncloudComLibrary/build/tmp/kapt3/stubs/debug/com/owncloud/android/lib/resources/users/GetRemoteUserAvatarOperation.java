package com.owncloud.android.lib.resources.users;

import java.lang.System;

/**
 * Gets avatar about the user logged in, if available
 *
 * @author David A. Velasco
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/owncloud/android/lib/resources/users/GetRemoteUserAvatarOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/users/RemoteAvatarData;", "avatarDimension", "", "(I)V", "isSuccess", "", "status", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "Companion", "owncloudComLibrary_debug"})
public final class GetRemoteUserAvatarOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.users.RemoteAvatarData> {
    private final int avatarDimension = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.users.GetRemoteUserAvatarOperation.Companion Companion = null;
    private static final java.lang.String NON_OFFICIAL_AVATAR_PATH = "/index.php/avatar/";
    
    public GetRemoteUserAvatarOperation(int avatarDimension) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.RemoteAvatarData> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    private final boolean isSuccess(int status) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/owncloud/android/lib/resources/users/GetRemoteUserAvatarOperation$Companion;", "", "()V", "NON_OFFICIAL_AVATAR_PATH", "", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}