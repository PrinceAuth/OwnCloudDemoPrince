package com.owncloud.android.lib.resources.oauth.services.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/services/implementation/OCOIDCService;", "Lcom/owncloud/android/lib/resources/oauth/services/OIDCService;", "()V", "getOIDCServerDiscovery", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/oauth/responses/OIDCDiscoveryResponse;", "ownCloudClient", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "performTokenRequest", "Lcom/owncloud/android/lib/resources/oauth/responses/TokenResponse;", "tokenRequest", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;", "registerClientWithRegistrationEndpoint", "Lcom/owncloud/android/lib/resources/oauth/responses/ClientRegistrationResponse;", "clientRegistrationParams", "Lcom/owncloud/android/lib/resources/oauth/params/ClientRegistrationParams;", "owncloudComLibrary_debug"})
public final class OCOIDCService implements com.owncloud.android.lib.resources.oauth.services.OIDCService {
    
    public OCOIDCService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponse> getOIDCServerDiscovery(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient ownCloudClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.TokenResponse> performTokenRequest(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient ownCloudClient, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.oauth.params.TokenRequestParams tokenRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponse> registerClientWithRegistrationEndpoint(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient ownCloudClient, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.oauth.params.ClientRegistrationParams clientRegistrationParams) {
        return null;
    }
}