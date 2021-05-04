package com.owncloud.android.lib.resources.oauth.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u008b\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010\u00a8\u0006,"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/responses/OIDCDiscoveryResponse;", "", "authorization_endpoint", "", "check_session_iframe", "end_session_endpoint", "issuer", "registration_endpoint", "response_types_supported", "", "scopes_supported", "token_endpoint", "token_endpoint_auth_methods_supported", "userinfo_endpoint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAuthorization_endpoint", "()Ljava/lang/String;", "getCheck_session_iframe", "getEnd_session_endpoint", "getIssuer", "getRegistration_endpoint", "getResponse_types_supported", "()Ljava/util/List;", "getScopes_supported", "getToken_endpoint", "getToken_endpoint_auth_methods_supported", "getUserinfo_endpoint", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class OIDCDiscoveryResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String authorization_endpoint = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String check_session_iframe = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String end_session_endpoint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String issuer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String registration_endpoint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> response_types_supported = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> scopes_supported = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String token_endpoint = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> token_endpoint_auth_methods_supported = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userinfo_endpoint = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String authorization_endpoint, @org.jetbrains.annotations.Nullable()
    java.lang.String check_session_iframe, @org.jetbrains.annotations.Nullable()
    java.lang.String end_session_endpoint, @org.jetbrains.annotations.NotNull()
    java.lang.String issuer, @org.jetbrains.annotations.Nullable()
    java.lang.String registration_endpoint, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> response_types_supported, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> scopes_supported, @org.jetbrains.annotations.NotNull()
    java.lang.String token_endpoint, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> token_endpoint_auth_methods_supported, @org.jetbrains.annotations.Nullable()
    java.lang.String userinfo_endpoint) {
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
    
    public OIDCDiscoveryResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String authorization_endpoint, @org.jetbrains.annotations.Nullable()
    java.lang.String check_session_iframe, @org.jetbrains.annotations.Nullable()
    java.lang.String end_session_endpoint, @org.jetbrains.annotations.NotNull()
    java.lang.String issuer, @org.jetbrains.annotations.Nullable()
    java.lang.String registration_endpoint, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> response_types_supported, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> scopes_supported, @org.jetbrains.annotations.NotNull()
    java.lang.String token_endpoint, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> token_endpoint_auth_methods_supported, @org.jetbrains.annotations.Nullable()
    java.lang.String userinfo_endpoint) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthorization_endpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCheck_session_iframe() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEnd_session_endpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssuer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegistration_endpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getResponse_types_supported() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getScopes_supported() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken_endpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getToken_endpoint_auth_methods_supported() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserinfo_endpoint() {
        return null;
    }
}