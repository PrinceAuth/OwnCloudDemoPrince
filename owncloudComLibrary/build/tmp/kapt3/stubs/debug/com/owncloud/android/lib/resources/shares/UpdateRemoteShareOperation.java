package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Updates parameters of an existing Share resource, known its remote ID.
 *
 *
 * Allow updating several parameters, triggering a request to the server per parameter.
 *
 * @author David A. Velasco
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0014H\u0002J\u0016\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010)\u001a\u00020*H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0005R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006,"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/UpdateRemoteShareOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/shares/ShareParserResult;", "remoteId", "", "(Ljava/lang/String;)V", "expirationDateInMillis", "", "getExpirationDateInMillis", "()J", "setExpirationDateInMillis", "(J)V", "name", "getName", "()Ljava/lang/String;", "setName", "password", "getPassword", "setPassword", "permissions", "", "getPermissions", "()I", "setPermissions", "(I)V", "publicUpload", "", "getPublicUpload", "()Ljava/lang/Boolean;", "setPublicUpload", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "retrieveShareDetails", "getRetrieveShareDetails", "()Z", "setRetrieveShareDetails", "(Z)V", "isSuccess", "status", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "Companion", "owncloudComLibrary_debug"})
public final class UpdateRemoteShareOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.shares.ShareParserResult> {
    
    /**
     * @param remoteId Identifier of the share to update.
     */
    private final java.lang.String remoteId = null;
    
    /**
     * Name to update in Share resource. Ignored by servers previous to version 10.0.0
     *
     * Empty string clears the current name.
     * Null results in no update applied to the name.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    
    /**
     * Password to update in Share resource.
     *
     * Empty string clears the current password.
     * Null results in no update applied to the password.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    
    /**
     * Expiration date to update in Share resource.
     *
     * A negative value clears the current expiration date.
     * Zero value (start-of-epoch) results in no update done on
     * the expiration date.
     */
    private long expirationDateInMillis = 0L;
    
    /**
     * Permissions to update in Share resource.
     *
     * Values <= 0 result in no update applied to the permissions.
     */
    private int permissions = -1;
    
    /**
     * Enable upload permissions to update in Share resource.
     *
     * Null results in no update applied to the upload permission.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean publicUpload;
    private boolean retrieveShareDetails = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.UpdateRemoteShareOperation.Companion Companion = null;
    private static final java.lang.String PARAM_NAME = "name";
    private static final java.lang.String PARAM_PASSWORD = "password";
    private static final java.lang.String PARAM_EXPIRATION_DATE = "expireDate";
    private static final java.lang.String PARAM_PERMISSIONS = "permissions";
    private static final java.lang.String PARAM_PUBLIC_UPLOAD = "publicUpload";
    private static final java.lang.String FORMAT_EXPIRATION_DATE = "yyyy-MM-dd";
    private static final java.lang.String ENTITY_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final java.lang.String ENTITY_CHARSET = "UTF-8";
    private static final long INITIAL_EXPIRATION_DATE_IN_MILLIS = 0L;
    
    public UpdateRemoteShareOperation(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getExpirationDateInMillis() {
        return 0L;
    }
    
    public final void setExpirationDateInMillis(long p0) {
    }
    
    public final int getPermissions() {
        return 0;
    }
    
    public final void setPermissions(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPublicUpload() {
        return null;
    }
    
    public final void setPublicUpload(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final boolean getRetrieveShareDetails() {
        return false;
    }
    
    public final void setRetrieveShareDetails(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.ShareParserResult> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    private final boolean isSuccess(int status) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/UpdateRemoteShareOperation$Companion;", "", "()V", "ENTITY_CHARSET", "", "ENTITY_CONTENT_TYPE", "FORMAT_EXPIRATION_DATE", "INITIAL_EXPIRATION_DATE_IN_MILLIS", "", "PARAM_EXPIRATION_DATE", "PARAM_NAME", "PARAM_PASSWORD", "PARAM_PERMISSIONS", "PARAM_PUBLIC_UPLOAD", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}