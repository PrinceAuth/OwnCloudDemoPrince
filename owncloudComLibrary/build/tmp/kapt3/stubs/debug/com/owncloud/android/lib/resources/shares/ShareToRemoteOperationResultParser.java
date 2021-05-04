package com.owncloud.android.lib.resources.shares;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/ShareToRemoteOperationResultParser;", "", "shareXmlParser", "Lcom/owncloud/android/lib/resources/shares/ShareXMLParser;", "(Lcom/owncloud/android/lib/resources/shares/ShareXMLParser;)V", "oneOrMoreSharesRequired", "", "getOneOrMoreSharesRequired", "()Z", "setOneOrMoreSharesRequired", "(Z)V", "ownCloudVersion", "Lcom/owncloud/android/lib/resources/status/OwnCloudVersion;", "getOwnCloudVersion", "()Lcom/owncloud/android/lib/resources/status/OwnCloudVersion;", "setOwnCloudVersion", "(Lcom/owncloud/android/lib/resources/status/OwnCloudVersion;)V", "serverBaseUri", "Landroid/net/Uri;", "getServerBaseUri", "()Landroid/net/Uri;", "setServerBaseUri", "(Landroid/net/Uri;)V", "parse", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/shares/ShareParserResult;", "serverResponse", "", "owncloudComLibrary_debug"})
public final class ShareToRemoteOperationResultParser {
    private com.owncloud.android.lib.resources.shares.ShareXMLParser shareXmlParser;
    private boolean oneOrMoreSharesRequired = false;
    @org.jetbrains.annotations.Nullable()
    private com.owncloud.android.lib.resources.status.OwnCloudVersion ownCloudVersion;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri serverBaseUri;
    
    public ShareToRemoteOperationResultParser(@org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.shares.ShareXMLParser shareXmlParser) {
        super();
    }
    
    public final boolean getOneOrMoreSharesRequired() {
        return false;
    }
    
    public final void setOneOrMoreSharesRequired(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.OwnCloudVersion getOwnCloudVersion() {
        return null;
    }
    
    public final void setOwnCloudVersion(@org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.status.OwnCloudVersion p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getServerBaseUri() {
        return null;
    }
    
    public final void setServerBaseUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> parse(@org.jetbrains.annotations.Nullable()
    java.lang.String serverResponse) {
        return null;
    }
}