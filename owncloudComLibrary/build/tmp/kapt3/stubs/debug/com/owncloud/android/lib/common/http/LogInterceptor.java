package com.owncloud.android.lib.common.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002\u00a8\u0006\u0016"}, d2 = {"Lcom/owncloud/android/lib/common/http/LogInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeaders", "", "requestId", "", "headers", "Lokhttp3/Headers;", "networkPetition", "Lcom/owncloud/android/lib/common/http/NetworkPetition;", "logRequestBody", "requestBodyParam", "Lokhttp3/RequestBody;", "logResponseBody", "responseBodyParam", "Lokhttp3/ResponseBody;", "Companion", "owncloudComLibrary_debug"})
public final class LogInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.common.http.LogInterceptor.Companion Companion = null;
    private static boolean httpLogsEnabled = false;
    private static final long LIMIT_BODY_LOG = 1024L;
    
    public LogInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final void logHeaders(java.lang.String requestId, okhttp3.Headers headers, com.owncloud.android.lib.common.http.NetworkPetition networkPetition) {
    }
    
    private final void logRequestBody(java.lang.String requestId, okhttp3.RequestBody requestBodyParam) {
    }
    
    private final void logResponseBody(java.lang.String requestId, okhttp3.ResponseBody responseBodyParam) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/owncloud/android/lib/common/http/LogInterceptor$Companion;", "", "()V", "LIMIT_BODY_LOG", "", "httpLogsEnabled", "", "getHttpLogsEnabled", "()Z", "setHttpLogsEnabled", "(Z)V", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getHttpLogsEnabled() {
            return false;
        }
        
        public final void setHttpLogsEnabled(boolean p0) {
        }
    }
}