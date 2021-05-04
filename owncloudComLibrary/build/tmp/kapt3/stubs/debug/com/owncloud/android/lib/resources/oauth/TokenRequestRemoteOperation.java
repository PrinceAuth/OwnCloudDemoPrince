package com.owncloud.android.lib.resources.oauth;

import java.lang.System;

/**
 * Perform token request
 *
 * @author Abel García de Prada
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/TokenRequestRemoteOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/oauth/responses/TokenResponse;", "tokenRequestParams", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;", "(Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;)V", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "owncloudComLibrary_debug"})
public final class TokenRequestRemoteOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.oauth.responses.TokenResponse> {
    private final com.owncloud.android.lib.resources.oauth.params.TokenRequestParams tokenRequestParams = null;
    
    public TokenRequestRemoteOperation(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.oauth.params.TokenRequestParams tokenRequestParams) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.oauth.responses.TokenResponse> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
}