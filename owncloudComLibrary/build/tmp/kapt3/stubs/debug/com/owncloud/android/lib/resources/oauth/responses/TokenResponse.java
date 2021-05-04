package com.owncloud.android.lib.resources.oauth.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003Jc\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/responses/TokenResponse;", "", "accessToken", "", "expiresIn", "", "refreshToken", "tokenType", "userId", "scope", "additionalParameters", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAccessToken", "()Ljava/lang/String;", "getAdditionalParameters", "()Ljava/util/Map;", "getExpiresIn", "()I", "getRefreshToken", "getScope", "getTokenType", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class TokenResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String accessToken = null;
    private final int expiresIn = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String refreshToken = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tokenType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String scope = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> additionalParameters = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.oauth.responses.TokenResponse copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "access_token")
    java.lang.String accessToken, @com.squareup.moshi.Json(name = "expires_in")
    int expiresIn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "refresh_token")
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "token_type")
    java.lang.String tokenType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user_id")
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String scope, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "additional_parameters")
    java.util.Map<java.lang.String, java.lang.String> additionalParameters) {
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
    
    public TokenResponse(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "access_token")
    java.lang.String accessToken, @com.squareup.moshi.Json(name = "expires_in")
    int expiresIn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "refresh_token")
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "token_type")
    java.lang.String tokenType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user_id")
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String scope, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "additional_parameters")
    java.util.Map<java.lang.String, java.lang.String> additionalParameters) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getExpiresIn() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalParameters() {
        return null;
    }
}