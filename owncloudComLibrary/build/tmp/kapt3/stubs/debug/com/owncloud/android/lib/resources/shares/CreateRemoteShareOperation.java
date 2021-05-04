package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Constructor
 *
 * @param remoteFilePath Full path of the file/folder being shared. Mandatory argument
 * @param shareType      0 = user, 1 = group, 3 = Public link. Mandatory argument
 * @param shareWith      User/group ID with who the file should be shared.  This is mandatory for shareType
 * of 0 or 1
 * @param permissions    1 - Read only Default for public shares
 * 2 - Update
 * 4 - Create
 * 8 - Delete
 * 16- Re-share
 * 31- All above Default for private shares
 * For user or group shares.
 * To obtain combinations, add the desired values together.
 * For instance, for Re-Share, delete, read, update, add 16+8+2+1 = 27.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\tH\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010&\u001a\u00020\'H\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/CreateRemoteShareOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/shares/ShareParserResult;", "remoteFilePath", "", "shareType", "Lcom/owncloud/android/lib/resources/shares/ShareType;", "shareWith", "permissions", "", "(Ljava/lang/String;Lcom/owncloud/android/lib/resources/shares/ShareType;Ljava/lang/String;I)V", "expirationDateInMillis", "", "getExpirationDateInMillis", "()J", "setExpirationDateInMillis", "(J)V", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "publicUpload", "", "getPublicUpload", "()Z", "setPublicUpload", "(Z)V", "retrieveShareDetails", "getRetrieveShareDetails", "setRetrieveShareDetails", "isSuccess", "status", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "Companion", "owncloudComLibrary_debug"})
public final class CreateRemoteShareOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.shares.ShareParserResult> {
    private final java.lang.String remoteFilePath = null;
    private final com.owncloud.android.lib.resources.shares.ShareType shareType = null;
    private final java.lang.String shareWith = null;
    private final int permissions = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password = "";
    private long expirationDateInMillis = 0L;
    private boolean publicUpload = false;
    private boolean retrieveShareDetails = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.CreateRemoteShareOperation.Companion Companion = null;
    private static final java.lang.String PARAM_NAME = "name";
    private static final java.lang.String PARAM_PASSWORD = "password";
    private static final java.lang.String PARAM_EXPIRATION_DATE = "expireDate";
    private static final java.lang.String PARAM_PUBLIC_UPLOAD = "publicUpload";
    private static final java.lang.String PARAM_PATH = "path";
    private static final java.lang.String PARAM_SHARE_TYPE = "shareType";
    private static final java.lang.String PARAM_SHARE_WITH = "shareWith";
    private static final java.lang.String PARAM_PERMISSIONS = "permissions";
    private static final java.lang.String FORMAT_EXPIRATION_DATE = "yyyy-MM-dd";
    
    public CreateRemoteShareOperation(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteFilePath, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.shares.ShareType shareType, @org.jetbrains.annotations.NotNull()
    java.lang.String shareWith, int permissions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getExpirationDateInMillis() {
        return 0L;
    }
    
    public final void setExpirationDateInMillis(long p0) {
    }
    
    public final boolean getPublicUpload() {
        return false;
    }
    
    public final void setPublicUpload(boolean p0) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/CreateRemoteShareOperation$Companion;", "", "()V", "FORMAT_EXPIRATION_DATE", "", "PARAM_EXPIRATION_DATE", "PARAM_NAME", "PARAM_PASSWORD", "PARAM_PATH", "PARAM_PERMISSIONS", "PARAM_PUBLIC_UPLOAD", "PARAM_SHARE_TYPE", "PARAM_SHARE_WITH", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}