package com.owncloud.android.lib.resources.oauth.params;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006 "}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/params/ClientRegistrationParams;", "", "registrationEndpoint", "", "clientName", "redirectUris", "", "tokenEndpointAuthMethod", "applicationType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationType", "()Ljava/lang/String;", "getClientName", "getRedirectUris", "()Ljava/util/List;", "getRegistrationEndpoint", "getTokenEndpointAuthMethod", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toRequestBody", "Lokhttp3/RequestBody;", "toString", "Companion", "owncloudComLibrary_debug"})
public final class ClientRegistrationParams {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String registrationEndpoint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> redirectUris = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tokenEndpointAuthMethod = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String applicationType = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.oauth.params.ClientRegistrationParams.Companion Companion = null;
    private static final java.lang.String PARAM_APPLICATION_TYPE = "application_type";
    private static final java.lang.String PARAM_CLIENT_NAME = "client_name";
    private static final java.lang.String PARAM_TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";
    private static final java.lang.String PARAM_REDIRECT_URIS = "redirect_uris";
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.oauth.params.ClientRegistrationParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String registrationEndpoint, @org.jetbrains.annotations.NotNull()
    java.lang.String clientName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> redirectUris, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenEndpointAuthMethod, @org.jetbrains.annotations.NotNull()
    java.lang.String applicationType) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ClientRegistrationParams(@org.jetbrains.annotations.NotNull()
    java.lang.String registrationEndpoint, @org.jetbrains.annotations.NotNull()
    java.lang.String clientName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> redirectUris, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenEndpointAuthMethod, @org.jetbrains.annotations.NotNull()
    java.lang.String applicationType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegistrationEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRedirectUris() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenEndpointAuthMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplicationType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody toRequestBody() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/params/ClientRegistrationParams$Companion;", "", "()V", "PARAM_APPLICATION_TYPE", "", "PARAM_CLIENT_NAME", "PARAM_REDIRECT_URIS", "PARAM_TOKEN_ENDPOINT_AUTH_METHOD", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}