package com.owncloud.android.lib.resources.files.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&\u00a8\u0006\b"}, d2 = {"Lcom/owncloud/android/lib/resources/files/services/FileService;", "Lcom/owncloud/android/lib/resources/Service;", "checkPathExistence", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "", "path", "", "isUserLogged", "owncloudComLibrary_debug"})
public abstract interface FileService extends com.owncloud.android.lib.resources.Service {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<java.lang.Boolean> checkPathExistence(@org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean isUserLogged);
}