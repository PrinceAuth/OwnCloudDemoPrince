package com.owncloud.android.lib.resources.files;

import java.lang.System;

/**
 * Operation to check the existence of a path in a remote server.
 *
 * @author David A. Velasco
 * @author David González Verdugo
 * @author Abel García de Prada
 *
 * @param remotePath      Path to append to the URL owned by the client instance.
 * @param isUserLogged    When `true`, the username won't be added at the end of the PROPFIND url since is not
 *                       needed to check user credentials
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0019\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0006\u0010\u0016\u001a\u00020\u0002R\u0011\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/owncloud/android/lib/resources/files/CheckPathExistenceRemoteOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "", "remotePath", "", "isUserLogged", "(Ljava/lang/String;Z)V", "()Z", "<set-?>", "Lcom/owncloud/android/lib/common/network/RedirectionPath;", "redirectionPath", "getRedirectionPath", "()Lcom/owncloud/android/lib/common/network/RedirectionPath;", "getRemotePath", "()Ljava/lang/String;", "isSuccess", "status", "", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "wasRedirected", "Companion", "owncloudComLibrary_debug"})
public final class CheckPathExistenceRemoteOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<java.lang.Boolean> {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String remotePath = null;
    private final boolean isUserLogged = false;
    
    /**
     * Gets the sequence of redirections followed during the execution of the operation.
     *
     * @return Sequence of redirections followed, if any, or NULL if the operation was not executed.
     */
    @org.jetbrains.annotations.Nullable()
    private com.owncloud.android.lib.common.network.RedirectionPath redirectionPath;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.files.CheckPathExistenceRemoteOperation.Companion Companion = null;
    
    /**
     * Maximum time to wait for a response from the server in milliseconds.
     */
    private static final int TIMEOUT = 10000;
    
    public CheckPathExistenceRemoteOperation(@org.jetbrains.annotations.Nullable()
    java.lang.String remotePath, boolean isUserLogged) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemotePath() {
        return null;
    }
    
    public final boolean isUserLogged() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.common.network.RedirectionPath getRedirectionPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<java.lang.Boolean> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    /**
     * @return 'True' if the operation was executed and at least one redirection was followed.
     */
    public final boolean wasRedirected() {
        return false;
    }
    
    private final boolean isSuccess(int status) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/owncloud/android/lib/resources/files/CheckPathExistenceRemoteOperation$Companion;", "", "()V", "TIMEOUT", "", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}