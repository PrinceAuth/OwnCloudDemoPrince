package com.owncloud.android.lib.resources;

import java.lang.System;

/**
 * Facade to perform network calls without the verbosity of remote operations
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/owncloud/android/lib/resources/Service;", "", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "getClient", "()Lcom/owncloud/android/lib/common/OwnCloudClient;", "owncloudComLibrary_debug"})
public abstract interface Service {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.OwnCloudClient getClient();
}