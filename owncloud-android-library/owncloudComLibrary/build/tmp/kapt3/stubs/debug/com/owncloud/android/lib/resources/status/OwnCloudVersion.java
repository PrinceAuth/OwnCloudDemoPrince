package com.owncloud.android.lib.resources.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/owncloud/android/lib/resources/status/OwnCloudVersion;", "", "Landroid/os/Parcelable;", "version", "", "(Ljava/lang/String;)V", "isPublicSharingWriteOnlySupported", "", "()Z", "isServerVersionSupported", "isVersionHidden", "setVersionHidden", "(Z)V", "<set-?>", "isVersionValid", "setVersionValid", "mVersion", "", "getVersion", "()Ljava/lang/String;", "compareTo", "other", "describeContents", "getParsedVersion", "parseVersion", "", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Companion", "owncloudComLibrary_debug"})
public final class OwnCloudVersion implements java.lang.Comparable<com.owncloud.android.lib.resources.status.OwnCloudVersion>, android.os.Parcelable {
    private int mVersion = 0;
    private boolean isVersionValid = false;
    private boolean isVersionHidden = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.status.OwnCloudVersion.Companion Companion = null;
    private static final int MINIMUN_VERSION_SUPPORTED = 167772160;
    private static final int MINIMUM_VERSION_WITH_WRITE_ONLY_PUBLIC_SHARING = 167772416;
    private static final java.lang.String INVALID_ZERO_VERSION = "0.0.0";
    private static final int MAX_DOTS = 3;
    
    public OwnCloudVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        super();
    }
    
    public final boolean isVersionValid() {
        return false;
    }
    
    public final void setVersionValid(boolean p0) {
    }
    
    public final boolean isVersionHidden() {
        return false;
    }
    
    public final void setVersionHidden(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final boolean isServerVersionSupported() {
        return false;
    }
    
    public final boolean isPublicSharingWriteOnlySupported() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.OwnCloudVersion other) {
        return 0;
    }
    
    private final void parseVersion(java.lang.String version) {
    }
    
    private final int getParsedVersion(java.lang.String version) throws java.lang.NumberFormatException {
        return 0;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/owncloud/android/lib/resources/status/OwnCloudVersion$Companion;", "", "()V", "INVALID_ZERO_VERSION", "", "MAX_DOTS", "", "MINIMUM_VERSION_WITH_WRITE_ONLY_PUBLIC_SHARING", "MINIMUN_VERSION_SUPPORTED", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}