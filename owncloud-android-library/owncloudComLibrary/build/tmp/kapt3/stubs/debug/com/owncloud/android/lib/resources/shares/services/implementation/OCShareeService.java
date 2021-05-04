package com.owncloud.android.lib.resources.shares.services.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/services/implementation/OCShareeService;", "Lcom/owncloud/android/lib/resources/shares/services/ShareeService;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "(Lcom/owncloud/android/lib/common/OwnCloudClient;)V", "getClient", "()Lcom/owncloud/android/lib/common/OwnCloudClient;", "getSharees", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/shares/responses/ShareeOcsResponse;", "searchString", "", "page", "", "perPage", "owncloudComLibrary_debug"})
public final class OCShareeService implements com.owncloud.android.lib.resources.shares.services.ShareeService {
    @org.jetbrains.annotations.NotNull()
    private final com.owncloud.android.lib.common.OwnCloudClient client = null;
    
    public OCShareeService(@org.jetbrains.annotations.NotNull()
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
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse> getSharees(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString, int page, int perPage) {
        return null;
    }
}