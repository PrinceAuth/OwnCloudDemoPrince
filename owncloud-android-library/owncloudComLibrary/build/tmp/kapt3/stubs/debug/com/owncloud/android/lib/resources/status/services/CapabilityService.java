package com.owncloud.android.lib.resources.status.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/owncloud/android/lib/resources/status/services/CapabilityService;", "Lcom/owncloud/android/lib/resources/Service;", "getCapabilities", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/status/RemoteCapability;", "owncloudComLibrary_debug"})
public abstract interface CapabilityService extends com.owncloud.android.lib.resources.Service {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.status.RemoteCapability> getCapabilities();
}