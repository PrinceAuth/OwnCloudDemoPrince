package com.owncloud.android.lib.resources.shares.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&JN\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH&J@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\nH&\u00a8\u0006\u0018"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/services/ShareService;", "Lcom/owncloud/android/lib/resources/Service;", "deleteShare", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/shares/ShareParserResult;", "remoteId", "", "getShares", "remoteFilePath", "reshares", "", "subfiles", "insertShare", "shareType", "Lcom/owncloud/android/lib/resources/shares/ShareType;", "shareWith", "permissions", "", "name", "password", "expirationDate", "", "publicUpload", "updateShare", "owncloudComLibrary_debug"})
public abstract interface ShareService extends com.owncloud.android.lib.resources.Service {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> getShares(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteFilePath, boolean reshares, boolean subfiles);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> insertShare(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteFilePath, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.shares.ShareType shareType, @org.jetbrains.annotations.NotNull()
    java.lang.String shareWith, int permissions, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String password, long expirationDate, boolean publicUpload);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> updateShare(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String password, long expirationDate, int permissions, boolean publicUpload);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> deleteShare(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId);
}