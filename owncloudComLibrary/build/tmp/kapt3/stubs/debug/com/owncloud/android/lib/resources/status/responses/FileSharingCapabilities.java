package com.owncloud.android.lib.resources.status.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/owncloud/android/lib/resources/status/responses/FileSharingCapabilities;", "", "fileSharingApiEnabled", "", "fileSharingPublic", "Lcom/owncloud/android/lib/resources/status/responses/FileSharingPublic;", "fileSharingReSharing", "fileSharingFederation", "Lcom/owncloud/android/lib/resources/status/responses/FileSharingFederation;", "(Ljava/lang/Boolean;Lcom/owncloud/android/lib/resources/status/responses/FileSharingPublic;Ljava/lang/Boolean;Lcom/owncloud/android/lib/resources/status/responses/FileSharingFederation;)V", "getFileSharingApiEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFileSharingFederation", "()Lcom/owncloud/android/lib/resources/status/responses/FileSharingFederation;", "getFileSharingPublic", "()Lcom/owncloud/android/lib/resources/status/responses/FileSharingPublic;", "getFileSharingReSharing", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lcom/owncloud/android/lib/resources/status/responses/FileSharingPublic;Ljava/lang/Boolean;Lcom/owncloud/android/lib/resources/status/responses/FileSharingFederation;)Lcom/owncloud/android/lib/resources/status/responses/FileSharingCapabilities;", "equals", "other", "hashCode", "", "toString", "", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class FileSharingCapabilities {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean fileSharingApiEnabled = null;
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.FileSharingPublic fileSharingPublic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean fileSharingReSharing = null;
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.FileSharingFederation fileSharingFederation = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingCapabilities copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "api_enabled")
    java.lang.Boolean fileSharingApiEnabled, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "public")
    com.owncloud.android.lib.resources.status.responses.FileSharingPublic fileSharingPublic, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resharing")
    java.lang.Boolean fileSharingReSharing, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "federation")
    com.owncloud.android.lib.resources.status.responses.FileSharingFederation fileSharingFederation) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FileSharingCapabilities(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "api_enabled")
    java.lang.Boolean fileSharingApiEnabled, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "public")
    com.owncloud.android.lib.resources.status.responses.FileSharingPublic fileSharingPublic, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resharing")
    java.lang.Boolean fileSharingReSharing, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "federation")
    com.owncloud.android.lib.resources.status.responses.FileSharingFederation fileSharingFederation) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFileSharingApiEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingPublic component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingPublic getFileSharingPublic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFileSharingReSharing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingFederation component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingFederation getFileSharingFederation() {
        return null;
    }
}