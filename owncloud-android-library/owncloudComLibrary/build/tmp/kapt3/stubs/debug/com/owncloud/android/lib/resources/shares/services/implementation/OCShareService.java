package com.owncloud.android.lib.resources.shares.services.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016JN\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/services/implementation/OCShareService;", "Lcom/owncloud/android/lib/resources/shares/services/ShareService;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "(Lcom/owncloud/android/lib/common/OwnCloudClient;)V", "getClient", "()Lcom/owncloud/android/lib/common/OwnCloudClient;", "deleteShare", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/shares/ShareParserResult;", "remoteId", "", "getShares", "remoteFilePath", "reshares", "", "subfiles", "insertShare", "shareType", "Lcom/owncloud/android/lib/resources/shares/ShareType;", "shareWith", "permissions", "", "name", "password", "expirationDate", "", "publicUpload", "updateShare", "owncloudComLibrary_debug"})
public final class OCShareService implements com.owncloud.android.lib.resources.shares.services.ShareService {
    @org.jetbrains.annotations.NotNull()
    private final com.owncloud.android.lib.common.OwnCloudClient client = null;
    
    public OCShareService(@org.jetbrains.annotations.NotNull()
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
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> getShares(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteFilePath, boolean reshares, boolean subfiles) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> insertShare(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteFilePath, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.shares.ShareType shareType, @org.jetbrains.annotations.NotNull()
    java.lang.String shareWith, int permissions, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String password, long expirationDate, boolean publicUpload) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> updateShare(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String password, long expirationDate, int permissions, boolean publicUpload) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> deleteShare(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId) {
        return null;
    }
}