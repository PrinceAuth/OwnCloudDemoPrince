package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Provides method to define a set of share permissions and calculate the appropiate
 * int value representing it.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/SharePermissionsBuilder;", "", "()V", "permissions", "", "build", "setCreatePermission", "enabled", "", "setDeletePermission", "setSharePermission", "setUpdatePermission", "updatePermission", "", "permissionsFlag", "enable", "owncloudComLibrary_debug"})
public final class SharePermissionsBuilder {
    
    /**
     * Set of permissions
     */
    private int permissions = 1;
    
    public SharePermissionsBuilder() {
        super();
    }
    
    /**
     * Sets or clears permission to reshare a file or folder.
     *
     * @param enabled 'True' to set, 'false' to clear.
     * @return Instance to builder itself, to allow consecutive calls to setters
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.shares.SharePermissionsBuilder setSharePermission(boolean enabled) {
        return null;
    }
    
    /**
     * Sets or clears permission to update a folder or folder.
     *
     * @param enabled 'True' to set, 'false' to clear.
     * @return Instance to builder itself, to allow consecutive calls to setters
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.shares.SharePermissionsBuilder setUpdatePermission(boolean enabled) {
        return null;
    }
    
    /**
     * Sets or clears permission to create files in share folder.
     *
     * @param enabled 'True' to set, 'false' to clear.
     * @return Instance to builder itself, to allow consecutive calls to setters
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.shares.SharePermissionsBuilder setCreatePermission(boolean enabled) {
        return null;
    }
    
    /**
     * Sets or clears permission to delete files in a shared folder.
     *
     * @param enabled 'True' to set, 'false' to clear.
     * @return Instance to builder itself, to allow consecutive calls to setters
     */
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.shares.SharePermissionsBuilder setDeletePermission(boolean enabled) {
        return null;
    }
    
    /**
     * Common code to update the value of the set of permissions.
     *
     * @param permissionsFlag Flag for the permission to update.
     * @param enable          'True' to set, 'false' to clear.
     */
    private final void updatePermission(int permissionsFlag, boolean enable) {
    }
    
    /**
     * 'Builds' the int value for the accumulated set of permissions.
     *
     * @return An int value representing the accumulated set of permissions.
     */
    public final int build() {
        return 0;
    }
}