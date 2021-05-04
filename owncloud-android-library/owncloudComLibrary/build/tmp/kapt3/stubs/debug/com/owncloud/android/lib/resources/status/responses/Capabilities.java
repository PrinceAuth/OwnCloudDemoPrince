package com.owncloud.android.lib.resources.status.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/owncloud/android/lib/resources/status/responses/Capabilities;", "", "coreCapabilities", "Lcom/owncloud/android/lib/resources/status/responses/CoreCapabilities;", "fileSharingCapabilities", "Lcom/owncloud/android/lib/resources/status/responses/FileSharingCapabilities;", "fileCapabilities", "Lcom/owncloud/android/lib/resources/status/responses/FileCapabilities;", "davCapabilities", "Lcom/owncloud/android/lib/resources/status/responses/DavCapabilities;", "(Lcom/owncloud/android/lib/resources/status/responses/CoreCapabilities;Lcom/owncloud/android/lib/resources/status/responses/FileSharingCapabilities;Lcom/owncloud/android/lib/resources/status/responses/FileCapabilities;Lcom/owncloud/android/lib/resources/status/responses/DavCapabilities;)V", "getCoreCapabilities", "()Lcom/owncloud/android/lib/resources/status/responses/CoreCapabilities;", "getDavCapabilities", "()Lcom/owncloud/android/lib/resources/status/responses/DavCapabilities;", "getFileCapabilities", "()Lcom/owncloud/android/lib/resources/status/responses/FileCapabilities;", "getFileSharingCapabilities", "()Lcom/owncloud/android/lib/resources/status/responses/FileSharingCapabilities;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Capabilities {
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.CoreCapabilities coreCapabilities = null;
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.FileSharingCapabilities fileSharingCapabilities = null;
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.FileCapabilities fileCapabilities = null;
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.DavCapabilities davCapabilities = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.responses.Capabilities copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "core")
    com.owncloud.android.lib.resources.status.responses.CoreCapabilities coreCapabilities, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "files_sharing")
    com.owncloud.android.lib.resources.status.responses.FileSharingCapabilities fileSharingCapabilities, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "files")
    com.owncloud.android.lib.resources.status.responses.FileCapabilities fileCapabilities, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dav")
    com.owncloud.android.lib.resources.status.responses.DavCapabilities davCapabilities) {
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
    
    public Capabilities(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "core")
    com.owncloud.android.lib.resources.status.responses.CoreCapabilities coreCapabilities, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "files_sharing")
    com.owncloud.android.lib.resources.status.responses.FileSharingCapabilities fileSharingCapabilities, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "files")
    com.owncloud.android.lib.resources.status.responses.FileCapabilities fileCapabilities, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dav")
    com.owncloud.android.lib.resources.status.responses.DavCapabilities davCapabilities) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.CoreCapabilities component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.CoreCapabilities getCoreCapabilities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingCapabilities component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileSharingCapabilities getFileSharingCapabilities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileCapabilities component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.FileCapabilities getFileCapabilities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.DavCapabilities component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.DavCapabilities getDavCapabilities() {
        return null;
    }
}