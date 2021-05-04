package com.owncloud.android.lib.resources.oauth.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/services/OIDCService;", "", "getOIDCServerDiscovery", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/oauth/responses/OIDCDiscoveryResponse;", "ownCloudClient", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "performTokenRequest", "Lcom/owncloud/android/lib/resources/oauth/responses/TokenResponse;", "tokenRequest", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;", "registerClientWithRegistrationEndpoint", "Lcom/owncloud/android/lib/resources/oauth/responses/ClientRegistrationResponse;", "clientRegistrationParams", "Lcom/owncloud/android/lib/resources/oauth/params/ClientRegistrationParams;", "owncloudComLibrary_debug"})
public abstract interface OIDCService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponse> getOIDCServerDiscovery(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient ownCloudClient);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.TokenResponse> performTokenRequest(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient ownCloudClient, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.oauth.params.TokenRequestParams tokenRequest);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponse> registerClientWithRegistrationEndpoint(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient ownCloudClient, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.oauth.params.ClientRegistrationParams clientRegistrationParams);
}