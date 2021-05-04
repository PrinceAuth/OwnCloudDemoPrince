package com.owncloud.android.lib.resources.status;

import java.lang.System;

/**
 * Contains data of the Capabilities for an account, from the Capabilities API
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001yB\u0089\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u001fJ\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\rH\u00c6\u0003J\t\u0010[\u001a\u00020\rH\u00c6\u0003J\t\u0010\\\u001a\u00020\rH\u00c6\u0003J\t\u0010]\u001a\u00020\rH\u00c6\u0003J\t\u0010^\u001a\u00020\rH\u00c6\u0003J\t\u0010_\u001a\u00020\rH\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\rH\u00c6\u0003J\t\u0010b\u001a\u00020\rH\u00c6\u0003J\t\u0010c\u001a\u00020\rH\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\rH\u00c6\u0003J\t\u0010f\u001a\u00020\rH\u00c6\u0003J\t\u0010g\u001a\u00020\rH\u00c6\u0003J\t\u0010h\u001a\u00020\rH\u00c6\u0003J\t\u0010i\u001a\u00020\rH\u00c6\u0003J\t\u0010j\u001a\u00020\rH\u00c6\u0003J\t\u0010k\u001a\u00020\rH\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\rH\u00c6\u0003J\u008d\u0002\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u00c6\u0001J\u0013\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010w\u001a\u00020\u0005H\u00d6\u0001J\t\u0010x\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u001c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001a\u0010\u0017\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010*\"\u0004\bB\u0010,R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010*\"\u0004\bF\u0010,R\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R\u001a\u0010\u0019\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,R\u001a\u0010\u001d\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010*\"\u0004\bL\u0010,R\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010*\"\u0004\bN\u0010,R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010!\"\u0004\bP\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010!\"\u0004\bX\u0010#\u00a8\u0006z"}, d2 = {"Lcom/owncloud/android/lib/resources/status/RemoteCapability;", "", "accountName", "", "versionMayor", "", "versionMinor", "versionMicro", "versionString", "versionEdition", "corePollinterval", "chunkingVersion", "filesSharingApiEnabled", "Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;", "filesSharingPublicEnabled", "filesSharingPublicPasswordEnforced", "filesSharingPublicPasswordEnforcedReadOnly", "filesSharingPublicPasswordEnforcedReadWrite", "filesSharingPublicPasswordEnforcedUploadOnly", "filesSharingPublicExpireDateEnabled", "filesSharingPublicExpireDateDays", "filesSharingPublicExpireDateEnforced", "filesSharingPublicUpload", "filesSharingPublicMultiple", "filesSharingPublicSupportsUploadOnly", "filesSharingResharing", "filesSharingFederationOutgoing", "filesSharingFederationIncoming", "filesBigFileChunking", "filesUndelete", "filesVersioning", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;ILcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getChunkingVersion", "getCorePollinterval", "()I", "setCorePollinterval", "(I)V", "getFilesBigFileChunking", "()Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;", "setFilesBigFileChunking", "(Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;)V", "getFilesSharingApiEnabled", "setFilesSharingApiEnabled", "getFilesSharingFederationIncoming", "setFilesSharingFederationIncoming", "getFilesSharingFederationOutgoing", "setFilesSharingFederationOutgoing", "getFilesSharingPublicEnabled", "setFilesSharingPublicEnabled", "getFilesSharingPublicExpireDateDays", "setFilesSharingPublicExpireDateDays", "getFilesSharingPublicExpireDateEnabled", "setFilesSharingPublicExpireDateEnabled", "getFilesSharingPublicExpireDateEnforced", "setFilesSharingPublicExpireDateEnforced", "getFilesSharingPublicMultiple", "setFilesSharingPublicMultiple", "getFilesSharingPublicPasswordEnforced", "setFilesSharingPublicPasswordEnforced", "getFilesSharingPublicPasswordEnforcedReadOnly", "setFilesSharingPublicPasswordEnforcedReadOnly", "getFilesSharingPublicPasswordEnforcedReadWrite", "setFilesSharingPublicPasswordEnforcedReadWrite", "getFilesSharingPublicPasswordEnforcedUploadOnly", "setFilesSharingPublicPasswordEnforcedUploadOnly", "getFilesSharingPublicSupportsUploadOnly", "setFilesSharingPublicSupportsUploadOnly", "getFilesSharingPublicUpload", "setFilesSharingPublicUpload", "getFilesSharingResharing", "setFilesSharingResharing", "getFilesUndelete", "setFilesUndelete", "getFilesVersioning", "setFilesVersioning", "getVersionEdition", "setVersionEdition", "getVersionMayor", "setVersionMayor", "getVersionMicro", "setVersionMicro", "getVersionMinor", "setVersionMinor", "getVersionString", "setVersionString", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "CapabilityBooleanType", "owncloudComLibrary_debug"})
public final class RemoteCapability {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accountName;
    private int versionMayor;
    private int versionMinor;
    private int versionMicro;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String versionString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String versionEdition;
    private int corePollinterval;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String chunkingVersion = null;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingApiEnabled;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicEnabled;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforced;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedReadOnly;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedReadWrite;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedUploadOnly;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicExpireDateEnabled;
    private int filesSharingPublicExpireDateDays;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicExpireDateEnforced;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicUpload;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicMultiple;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicSupportsUploadOnly;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingResharing;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingFederationOutgoing;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingFederationIncoming;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesBigFileChunking;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesUndelete;
    @org.jetbrains.annotations.NotNull()
    private com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesVersioning;
    
    /**
     * Contains data of the Capabilities for an account, from the Capabilities API
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability copy(@org.jetbrains.annotations.NotNull()
    java.lang.String accountName, int versionMayor, int versionMinor, int versionMicro, @org.jetbrains.annotations.NotNull()
    java.lang.String versionString, @org.jetbrains.annotations.NotNull()
    java.lang.String versionEdition, int corePollinterval, @org.jetbrains.annotations.NotNull()
    java.lang.String chunkingVersion, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingApiEnabled, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicEnabled, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforced, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedReadOnly, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedReadWrite, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedUploadOnly, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicExpireDateEnabled, int filesSharingPublicExpireDateDays, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicExpireDateEnforced, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicUpload, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicMultiple, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicSupportsUploadOnly, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingResharing, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingFederationOutgoing, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingFederationIncoming, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesBigFileChunking, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesUndelete, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesVersioning) {
        return null;
    }
    
    /**
     * Contains data of the Capabilities for an account, from the Capabilities API
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * Contains data of the Capabilities for an account, from the Capabilities API
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Contains data of the Capabilities for an account, from the Capabilities API
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RemoteCapability() {
        super();
    }
    
    public RemoteCapability(@org.jetbrains.annotations.NotNull()
    java.lang.String accountName, int versionMayor, int versionMinor, int versionMicro, @org.jetbrains.annotations.NotNull()
    java.lang.String versionString, @org.jetbrains.annotations.NotNull()
    java.lang.String versionEdition, int corePollinterval, @org.jetbrains.annotations.NotNull()
    java.lang.String chunkingVersion, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingApiEnabled, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicEnabled, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforced, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedReadOnly, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedReadWrite, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicPasswordEnforcedUploadOnly, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicExpireDateEnabled, int filesSharingPublicExpireDateDays, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicExpireDateEnforced, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicUpload, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicMultiple, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingPublicSupportsUploadOnly, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingResharing, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingFederationOutgoing, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesSharingFederationIncoming, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesBigFileChunking, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesUndelete, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType filesVersioning) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountName() {
        return null;
    }
    
    public final void setAccountName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getVersionMayor() {
        return 0;
    }
    
    public final void setVersionMayor(int p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getVersionMinor() {
        return 0;
    }
    
    public final void setVersionMinor(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getVersionMicro() {
        return 0;
    }
    
    public final void setVersionMicro(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionString() {
        return null;
    }
    
    public final void setVersionString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionEdition() {
        return null;
    }
    
    public final void setVersionEdition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getCorePollinterval() {
        return 0;
    }
    
    public final void setCorePollinterval(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChunkingVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingApiEnabled() {
        return null;
    }
    
    public final void setFilesSharingApiEnabled(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicEnabled() {
        return null;
    }
    
    public final void setFilesSharingPublicEnabled(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicPasswordEnforced() {
        return null;
    }
    
    public final void setFilesSharingPublicPasswordEnforced(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicPasswordEnforcedReadOnly() {
        return null;
    }
    
    public final void setFilesSharingPublicPasswordEnforcedReadOnly(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicPasswordEnforcedReadWrite() {
        return null;
    }
    
    public final void setFilesSharingPublicPasswordEnforcedReadWrite(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicPasswordEnforcedUploadOnly() {
        return null;
    }
    
    public final void setFilesSharingPublicPasswordEnforcedUploadOnly(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicExpireDateEnabled() {
        return null;
    }
    
    public final void setFilesSharingPublicExpireDateEnabled(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getFilesSharingPublicExpireDateDays() {
        return 0;
    }
    
    public final void setFilesSharingPublicExpireDateDays(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicExpireDateEnforced() {
        return null;
    }
    
    public final void setFilesSharingPublicExpireDateEnforced(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicUpload() {
        return null;
    }
    
    public final void setFilesSharingPublicUpload(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicMultiple() {
        return null;
    }
    
    public final void setFilesSharingPublicMultiple(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingPublicSupportsUploadOnly() {
        return null;
    }
    
    public final void setFilesSharingPublicSupportsUploadOnly(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingResharing() {
        return null;
    }
    
    public final void setFilesSharingResharing(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingFederationOutgoing() {
        return null;
    }
    
    public final void setFilesSharingFederationOutgoing(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesSharingFederationIncoming() {
        return null;
    }
    
    public final void setFilesSharingFederationIncoming(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesBigFileChunking() {
        return null;
    }
    
    public final void setFilesBigFileChunking(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesUndelete() {
        return null;
    }
    
    public final void setFilesUndelete(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType getFilesVersioning() {
        return null;
    }
    
    public final void setFilesVersioning(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType p0) {
    }
    
    /**
     * Enum for Boolean Type in capabilities, with values:
     * -1 - Unknown
     * 0 - False
     * 1 - True
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "FALSE", "TRUE", "Companion", "owncloudComLibrary_debug"})
    public static enum CapabilityBooleanType {
        /*public static final*/ UNKNOWN /* = new UNKNOWN(0) */,
        /*public static final*/ FALSE /* = new FALSE(0) */,
        /*public static final*/ TRUE /* = new TRUE(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType.Companion Companion = null;
        
        CapabilityBooleanType(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType$Companion;", "", "()V", "fromBooleanValue", "Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;", "boolValue", "", "(Ljava/lang/Boolean;)Lcom/owncloud/android/lib/resources/status/RemoteCapability$CapabilityBooleanType;", "fromValue", "value", "", "owncloudComLibrary_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType fromValue(int value) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.owncloud.android.lib.resources.status.RemoteCapability.CapabilityBooleanType fromBooleanValue(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean boolValue) {
                return null;
            }
        }
    }
}