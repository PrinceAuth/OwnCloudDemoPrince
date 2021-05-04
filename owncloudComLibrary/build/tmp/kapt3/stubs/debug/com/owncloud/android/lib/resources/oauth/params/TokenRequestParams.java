package com.owncloud.android.lib.resources.oauth.params;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH&R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;", "", "tokenEndpoint", "", "clientAuth", "grantType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientAuth", "()Ljava/lang/String;", "getGrantType", "getTokenEndpoint", "toRequestBody", "Lokhttp3/RequestBody;", "Authorization", "RefreshToken", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams$Authorization;", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams$RefreshToken;", "owncloudComLibrary_debug"})
public abstract class TokenRequestParams {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tokenEndpoint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientAuth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String grantType = null;
    
    private TokenRequestParams(java.lang.String tokenEndpoint, java.lang.String clientAuth, java.lang.String grantType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGrantType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract okhttp3.RequestBody toRequestBody();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams$Authorization;", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;", "tokenEndpoint", "", "clientAuth", "grantType", "authorizationCode", "redirectUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorizationCode", "()Ljava/lang/String;", "getRedirectUri", "toRequestBody", "Lokhttp3/RequestBody;", "owncloudComLibrary_debug"})
    public static final class Authorization extends com.owncloud.android.lib.resources.oauth.params.TokenRequestParams {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String authorizationCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String redirectUri = null;
        
        public Authorization(@org.jetbrains.annotations.NotNull()
        java.lang.String tokenEndpoint, @org.jetbrains.annotations.NotNull()
        java.lang.String clientAuth, @org.jetbrains.annotations.NotNull()
        java.lang.String grantType, @org.jetbrains.annotations.NotNull()
        java.lang.String authorizationCode, @org.jetbrains.annotations.NotNull()
        java.lang.String redirectUri) {
            super(null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthorizationCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRedirectUri() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.RequestBody toRequestBody() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams$RefreshToken;", "Lcom/owncloud/android/lib/resources/oauth/params/TokenRequestParams;", "tokenEndpoint", "", "clientAuth", "grantType", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefreshToken", "()Ljava/lang/String;", "toRequestBody", "Lokhttp3/RequestBody;", "owncloudComLibrary_debug"})
    public static final class RefreshToken extends com.owncloud.android.lib.resources.oauth.params.TokenRequestParams {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String refreshToken = null;
        
        public RefreshToken(@org.jetbrains.annotations.NotNull()
        java.lang.String tokenEndpoint, @org.jetbrains.annotations.NotNull()
        java.lang.String clientAuth, @org.jetbrains.annotations.NotNull()
        java.lang.String grantType, @org.jetbrains.annotations.Nullable()
        java.lang.String refreshToken) {
            super(null, null, null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRefreshToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.RequestBody toRequestBody() {
            return null;
        }
    }
}