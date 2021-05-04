package com.owncloud.android.lib.resources.status.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/owncloud/android/lib/resources/status/responses/CapabilityResponse;", "", "serverVersion", "Lcom/owncloud/android/lib/resources/status/responses/ServerVersion;", "capabilities", "Lcom/owncloud/android/lib/resources/status/responses/Capabilities;", "(Lcom/owncloud/android/lib/resources/status/responses/ServerVersion;Lcom/owncloud/android/lib/resources/status/responses/Capabilities;)V", "getCapabilities", "()Lcom/owncloud/android/lib/resources/status/responses/Capabilities;", "getServerVersion", "()Lcom/owncloud/android/lib/resources/status/responses/ServerVersion;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toRemoteCapability", "Lcom/owncloud/android/lib/resources/status/RemoteCapability;", "toString", "", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CapabilityResponse {
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.ServerVersion serverVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.status.responses.Capabilities capabilities = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.responses.CapabilityResponse copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "version")
    com.owncloud.android.lib.resources.status.responses.ServerVersion serverVersion, @org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.status.responses.Capabilities capabilities) {
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
    
    public CapabilityResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "version")
    com.owncloud.android.lib.resources.status.responses.ServerVersion serverVersion, @org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.status.responses.Capabilities capabilities) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.ServerVersion component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.ServerVersion getServerVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.Capabilities component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.status.responses.Capabilities getCapabilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability toRemoteCapability() {
        return null;
    }
}