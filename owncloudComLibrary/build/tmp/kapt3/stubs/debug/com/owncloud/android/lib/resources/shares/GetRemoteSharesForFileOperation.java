package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Constructor
 *
 * @param remoteFilePath Path to file or folder
 * @param reshares       If set to false (default), only shares owned by the current user are
 * returned.
 * If set to true, shares owned by any user from the given file are returned.
 * @param subfiles       If set to false (default), lists only the folder being shared
 * If set to true, all shared files within the folder are returned.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/GetRemoteSharesForFileOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/shares/ShareParserResult;", "remoteFilePath", "", "reshares", "", "subfiles", "(Ljava/lang/String;ZZ)V", "isSuccess", "status", "", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "Companion", "owncloudComLibrary_debug"})
public final class GetRemoteSharesForFileOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.shares.ShareParserResult> {
    private final java.lang.String remoteFilePath = null;
    private final boolean reshares = false;
    private final boolean subfiles = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.GetRemoteSharesForFileOperation.Companion Companion = null;
    private static final java.lang.String PARAM_PATH = "path";
    private static final java.lang.String PARAM_RESHARES = "reshares";
    private static final java.lang.String PARAM_SUBFILES = "subfiles";
    
    public GetRemoteSharesForFileOperation(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteFilePath, boolean reshares, boolean subfiles) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    private final boolean isSuccess(int status) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/GetRemoteSharesForFileOperation$Companion;", "", "()V", "PARAM_PATH", "", "PARAM_RESHARES", "PARAM_SUBFILES", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}