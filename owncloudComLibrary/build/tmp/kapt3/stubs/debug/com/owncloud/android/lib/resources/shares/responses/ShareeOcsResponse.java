package com.owncloud.android.lib.resources.shares.responses;

import java.lang.System;

/**
 * This was modeled according to the documentation:
 * https://doc.owncloud.com/server/developer_manual/core/apis/ocs-recipient-api.html#get-shares-recipients
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/responses/ShareeOcsResponse;", "", "exact", "Lcom/owncloud/android/lib/resources/shares/responses/ExactSharees;", "groups", "", "Lcom/owncloud/android/lib/resources/shares/responses/ShareeItem;", "remotes", "users", "(Lcom/owncloud/android/lib/resources/shares/responses/ExactSharees;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getExact", "()Lcom/owncloud/android/lib/resources/shares/responses/ExactSharees;", "getGroups", "()Ljava/util/List;", "getRemotes", "getUsers", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getFlatRepresentationWithoutExact", "Ljava/util/ArrayList;", "hashCode", "", "toString", "", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ShareeOcsResponse {
    @org.jetbrains.annotations.Nullable()
    private final com.owncloud.android.lib.resources.shares.responses.ExactSharees exact = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> groups = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> remotes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> users = null;
    
    /**
     * This was modeled according to the documentation:
     * https://doc.owncloud.com/server/developer_manual/core/apis/ocs-recipient-api.html#get-shares-recipients
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse copy(@org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.shares.responses.ExactSharees exact, @org.jetbrains.annotations.NotNull()
    java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> remotes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> users) {
        return null;
    }
    
    /**
     * This was modeled according to the documentation:
     * https://doc.owncloud.com/server/developer_manual/core/apis/ocs-recipient-api.html#get-shares-recipients
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * This was modeled according to the documentation:
     * https://doc.owncloud.com/server/developer_manual/core/apis/ocs-recipient-api.html#get-shares-recipients
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This was modeled according to the documentation:
     * https://doc.owncloud.com/server/developer_manual/core/apis/ocs-recipient-api.html#get-shares-recipients
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ShareeOcsResponse(@org.jetbrains.annotations.Nullable()
    com.owncloud.android.lib.resources.shares.responses.ExactSharees exact, @org.jetbrains.annotations.NotNull()
    java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> remotes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> users) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.shares.responses.ExactSharees component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.owncloud.android.lib.resources.shares.responses.ExactSharees getExact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> getRemotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.owncloud.android.lib.resources.shares.responses.ShareeItem> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.owncloud.android.lib.resources.shares.responses.ShareeItem> getFlatRepresentationWithoutExact() {
        return null;
    }
}