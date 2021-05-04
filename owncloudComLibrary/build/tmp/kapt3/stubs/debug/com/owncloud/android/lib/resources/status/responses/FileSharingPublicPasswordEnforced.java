package com.owncloud.android.lib.resources.status.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/owncloud/android/lib/resources/status/responses/FileSharingPublicPasswordEnforced;", "", "enforcedReadOnly", "", "enforcedReadWrite", "enforcedUploadOnly", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnforcedReadOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnforcedReadWrite", "getEnforcedUploadOnly", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/owncloud/android/lib/resources/status/responses/FileSharingPublicPasswordEnforced;", "equals", "other", "hashCode", "", "toString", "", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class FileSharingPublicPasswordEnforced {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean enforcedReadOnly = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean enforcedReadWrite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean enforcedUploadOnly = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingPublicPasswordEnforced copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "read_only")
    java.lang.Boolean enforcedReadOnly, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "read_write")
    java.lang.Boolean enforcedReadWrite, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_only")
    java.lang.Boolean enforcedUploadOnly) {
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
    
    public FileSharingPublicPasswordEnforced(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "read_only")
    java.lang.Boolean enforcedReadOnly, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "read_write")
    java.lang.Boolean enforcedReadWrite, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_only")
    java.lang.Boolean enforcedUploadOnly) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEnforcedReadOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEnforcedReadWrite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEnforcedUploadOnly() {
        return null;
    }
}