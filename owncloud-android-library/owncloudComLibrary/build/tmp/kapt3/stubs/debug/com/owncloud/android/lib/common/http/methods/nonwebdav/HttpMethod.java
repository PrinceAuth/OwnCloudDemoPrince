package com.owncloud.android.lib.common.http.methods.nonwebdav;

import java.lang.System;

/**
 * Wrapper to perform OkHttp calls
 *
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/owncloud/android/lib/common/http/methods/nonwebdav/HttpMethod;", "Lcom/owncloud/android/lib/common/http/methods/HttpBaseMethod;", "url", "Ljava/net/URL;", "(Ljava/net/URL;)V", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "setResponse", "(Lokhttp3/Response;)V", "onExecute", "", "owncloudComLibrary_debug"})
public abstract class HttpMethod extends com.owncloud.android.lib.common.http.methods.HttpBaseMethod {
    public okhttp3.Response response;
    
    public HttpMethod(@org.jetbrains.annotations.NotNull()
    java.net.URL url) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response getResponse() {
        return null;
    }
    
    @java.lang.Override()
    public void setResponse(@org.jetbrains.annotations.NotNull()
    okhttp3.Response p0) {
    }
    
    @java.lang.Override()
    public int onExecute() {
        return 0;
    }
}