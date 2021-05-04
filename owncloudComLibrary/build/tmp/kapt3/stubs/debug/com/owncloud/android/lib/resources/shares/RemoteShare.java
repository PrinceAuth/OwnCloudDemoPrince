package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Contains the data of a Share from the Share API
 *
 * @author masensio
 * @author David A. Velasco
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b8\b\u0086\b\u0018\u0000 J2\u00020\u0001:\u0001JB\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u000eH\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\t\u0010;\u001a\u00020\u0010H\u00c6\u0003J\t\u0010<\u001a\u00020\u0013H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u008d\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\u0013\u0010F\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u000eH\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001c\u00a8\u0006K"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/RemoteShare;", "", "id", "", "shareWith", "path", "token", "sharedWithDisplayName", "sharedWithAdditionalInfo", "name", "shareLink", "shareType", "Lcom/owncloud/android/lib/resources/shares/ShareType;", "permissions", "", "sharedDate", "", "expirationDate", "isFolder", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/owncloud/android/lib/resources/shares/ShareType;IJJZ)V", "getExpirationDate", "()J", "setExpirationDate", "(J)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setFolder", "(Z)V", "getName", "setName", "getPath", "setPath", "getPermissions", "()I", "setPermissions", "(I)V", "getShareLink", "setShareLink", "getShareType", "()Lcom/owncloud/android/lib/resources/shares/ShareType;", "setShareType", "(Lcom/owncloud/android/lib/resources/shares/ShareType;)V", "getShareWith", "setShareWith", "getSharedDate", "setSharedDate", "getSharedWithAdditionalInfo", "setSharedWithAdditionalInfo", "getSharedWithDisplayName", "setSharedWithDisplayName", "getToken", "setToken", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "owncloudComLibrary_debug"})
public final class RemoteShare {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shareWith;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String path;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sharedWithDisplayName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sharedWithAdditionalInfo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shareLink;
    @org.jetbrains.annotations.Nullable()
    private com.owncloud.android.lib.resources.shares.ShareType shareType;
    private int permissions;
    private long sharedDate;
    private long expirationDate;
    private boolean isFolder;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.RemoteShare.Companion Companion = null;
    public static final int DEFAULT_PERMISSION = -1;
    public static final int READ_PERMISSION_FLAG = 1;
    public static final int UPDATE_PERMISSION_FLAG = 2;
    public static final int CREATE_PERMISSION_FLAG = 4;
    public static final int DELETE_PERMISSION_FLAG = 8;
    public static final int SHARE_PERMISSION_FLAG = 16;
    public static final int MAXIMUM_PERMISSIONS_FOR_FILE = 19;
    public static final int MAXIMUM_PERMISSIONS_FOR_FOLDER = 31;
    public static final int FEDERATED_PERMISSIONS_FOR_FILE = 19;
    public static final int FEDERATED_PERMISSIONS_FOR_FOLDER = 31;
    public static final long INIT_EXPIRATION_DATE_IN_MILLIS = 0L;
    public static final long INIT_SHARED_DATE = 0L;
    
    /**
     * Contains the data of a Share from the Share API
     *
     * @author masensio
     * @author David A. Velasco
     * @author David González Verdugo
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.shares.RemoteShare copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String shareWith, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String sharedWithDisplayName, @org.jetbrains.annotations.NotNull()
    java.lang.String sharedWithAdditionalInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String shareLink, @org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.shares.ShareType shareType, int permissions, long sharedDate, long expirationDate, boolean isFolder) {
        return null;
    }
    
    /**
     * Contains the data of a Share from the Share API
     *
     * @author masensio
     * @author David A. Velasco
     * @author David González Verdugo
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * Contains the data of a Share from the Share API
     *
     * @author masensio
     * @author David A. Velasco
     * @author David González Verdugo
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Contains the data of a Share from the Share API
     *
     * @author masensio
     * @author David A. Velasco
     * @author David González Verdugo
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RemoteShare() {
        super();
    }
    
    public RemoteShare(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String shareWith, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String sharedWithDisplayName, @org.jetbrains.annotations.NotNull()
    java.lang.String sharedWithAdditionalInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String shareLink, @org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.shares.ShareType shareType, int permissions, long sharedDate, long expirationDate, boolean isFolder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShareWith() {
        return null;
    }
    
    public final void setShareWith(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSharedWithDisplayName() {
        return null;
    }
    
    public final void setSharedWithDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSharedWithAdditionalInfo() {
        return null;
    }
    
    public final void setSharedWithAdditionalInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShareLink() {
        return null;
    }
    
    public final void setShareLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.shares.ShareType component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.shares.ShareType getShareType() {
        return null;
    }
    
    public final void setShareType(@org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.shares.ShareType p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getPermissions() {
        return 0;
    }
    
    public final void setPermissions(int p0) {
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getSharedDate() {
        return 0L;
    }
    
    public final void setSharedDate(long p0) {
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long getExpirationDate() {
        return 0L;
    }
    
    public final void setExpirationDate(long p0) {
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean isFolder() {
        return false;
    }
    
    public final void setFolder(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/RemoteShare$Companion;", "", "()V", "CREATE_PERMISSION_FLAG", "", "DEFAULT_PERMISSION", "DELETE_PERMISSION_FLAG", "FEDERATED_PERMISSIONS_FOR_FILE", "FEDERATED_PERMISSIONS_FOR_FOLDER", "INIT_EXPIRATION_DATE_IN_MILLIS", "", "INIT_SHARED_DATE", "MAXIMUM_PERMISSIONS_FOR_FILE", "MAXIMUM_PERMISSIONS_FOR_FOLDER", "READ_PERMISSION_FLAG", "SHARE_PERMISSION_FLAG", "UPDATE_PERMISSION_FLAG", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}