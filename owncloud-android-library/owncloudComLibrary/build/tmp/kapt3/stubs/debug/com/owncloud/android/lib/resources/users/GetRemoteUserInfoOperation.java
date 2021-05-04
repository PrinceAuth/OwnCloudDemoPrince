package com.owncloud.android.lib.resources.users;

import java.lang.System;

/**
 * Gets information (id, display name, and e-mail address) about the user logged in.
 *
 * @author masensio
 * @author David A. Velasco
 * @author David González Verdugo
 * @author Abel García de Prada
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014\u00a8\u0006\t"}, d2 = {"Lcom/owncloud/android/lib/resources/users/GetRemoteUserInfoOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/users/RemoteUserInfo;", "()V", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "Companion", "owncloudComLibrary_debug"})
public final class GetRemoteUserInfoOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.users.RemoteUserInfo> {
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.users.GetRemoteUserInfoOperation.Companion Companion = null;
    private static final java.lang.String OCS_ROUTE = "/ocs/v2.php/cloud/user?format=json";
    
    public GetRemoteUserInfoOperation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.RemoteUserInfo> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/owncloud/android/lib/resources/users/GetRemoteUserInfoOperation$Companion;", "", "()V", "OCS_ROUTE", "", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}