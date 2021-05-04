package com.owncloud.android.lib.resources.oauth.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/owncloud/android/lib/resources/oauth/responses/ClientRegistrationResponse;", "", "clientId", "", "clientSecret", "clientIdIssuedAt", "", "clientSecretExpiration", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "getClientId", "()Ljava/lang/String;", "getClientIdIssuedAt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClientSecret", "getClientSecretExpiration", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)Lcom/owncloud/android/lib/resources/oauth/responses/ClientRegistrationResponse;", "equals", "", "other", "hashCode", "toString", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ClientRegistrationResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String clientSecret = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer clientIdIssuedAt = null;
    private final int clientSecretExpiration = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponse copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "client_id")
    java.lang.String clientId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "client_secret")
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "client_id_issued_at")
    java.lang.Integer clientIdIssuedAt, @com.squareup.moshi.Json(name = "client_secret_expires_at")
    int clientSecretExpiration) {
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
    
    public ClientRegistrationResponse(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "client_id")
    java.lang.String clientId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "client_secret")
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "client_id_issued_at")
    java.lang.Integer clientIdIssuedAt, @com.squareup.moshi.Json(name = "client_secret_expires_at")
    int clientSecretExpiration) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getClientIdIssuedAt() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getClientSecretExpiration() {
        return 0;
    }
}