package com.owncloud.android.lib.common.http.methods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+H\u0016J\b\u00103\u001a\u00020\'H\u0016J\u0010\u00104\u001a\u0004\u0018\u00010+2\u0006\u00101\u001a\u00020+J&\u00105\u001a\"\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010+06j\u0010\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010+`7J\n\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u0004\u0018\u00010+J\u0012\u0010;\u001a\u0004\u0018\u00010+2\u0006\u0010<\u001a\u00020+H\u0016J\n\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020\'H$J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u0012H\u0016J\u0018\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010I\u001a\u00020/2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+H\u0016J\u0010\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\u0012H\u0016J\u0010\u0010L\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u00020!X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-\u00a8\u0006M"}, d2 = {"Lcom/owncloud/android/lib/common/http/methods/HttpBaseMethod;", "", "url", "Ljava/net/URL;", "(Ljava/net/URL;)V", "call", "Lokhttp3/Call;", "getCall", "()Lokhttp3/Call;", "setCall", "(Lokhttp3/Call;)V", "httpUrl", "Lokhttp3/HttpUrl;", "getHttpUrl", "()Lokhttp3/HttpUrl;", "setHttpUrl", "(Lokhttp3/HttpUrl;)V", "isAborted", "", "()Z", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "setRequest", "(Lokhttp3/Request;)V", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "setResponse", "(Lokhttp3/Response;)V", "statusCode", "", "getStatusCode", "()I", "statusMessage", "", "getStatusMessage", "()Ljava/lang/String;", "abort", "", "addRequestHeader", "name", "value", "execute", "getRequestHeader", "getRequestHeadersAsHashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getResponseBodyAsStream", "Ljava/io/InputStream;", "getResponseBodyAsString", "getResponseHeader", "headerName", "getResponseHeaders", "Lokhttp3/Headers;", "onExecute", "setConnectionTimeout", "connectionTimeout", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "setFollowRedirects", "followRedirects", "setReadTimeout", "readTimeout", "setRequestHeader", "setRetryOnConnectionFailure", "retryOnConnectionFailure", "setUrl", "owncloudComLibrary_debug"})
public abstract class HttpBaseMethod {
    @org.jetbrains.annotations.NotNull()
    private okhttp3.OkHttpClient okHttpClient;
    @org.jetbrains.annotations.NotNull()
    private okhttp3.HttpUrl httpUrl;
    @org.jetbrains.annotations.NotNull()
    private okhttp3.Request request;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.Call call;
    
    public HttpBaseMethod(@org.jetbrains.annotations.NotNull()
    java.net.URL url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    public final void setOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.HttpUrl getHttpUrl() {
        return null;
    }
    
    public final void setHttpUrl(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Request getRequest() {
        return null;
    }
    
    public final void setRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.Request p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract okhttp3.Response getResponse();
    
    public abstract void setResponse(@org.jetbrains.annotations.NotNull()
    okhttp3.Response p0);
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.Call getCall() {
        return null;
    }
    
    public final void setCall(@org.jetbrains.annotations.Nullable()
    okhttp3.Call p0) {
    }
    
    public int execute() throws java.lang.Exception {
        return 0;
    }
    
    public void setUrl(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url) {
    }
    
    /**
     * **************
     * Requests ***
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRequestHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getRequestHeadersAsHashMap() {
        return null;
    }
    
    public void addRequestHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * Sets a header and replace it if already exists with that name
     *
     * @param name  header name
     * @param value header value
     */
    public void setRequestHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public okhttp3.Headers getResponseHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getResponseHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String headerName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResponseBodyAsString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.io.InputStream getResponseBodyAsStream() {
        return null;
    }
    
    /**
     * ***********************
     * Connection Params ***
     */
    public void setRetryOnConnectionFailure(boolean retryOnConnectionFailure) {
    }
    
    public void setReadTimeout(long readTimeout, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
    }
    
    public void setConnectionTimeout(long connectionTimeout, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
    }
    
    public void setFollowRedirects(boolean followRedirects) {
    }
    
    /**
     * **********
     * Call ***
     */
    public void abort() {
    }
    
    public boolean isAborted() {
        return false;
    }
    
    protected abstract int onExecute() throws java.lang.Exception;
}