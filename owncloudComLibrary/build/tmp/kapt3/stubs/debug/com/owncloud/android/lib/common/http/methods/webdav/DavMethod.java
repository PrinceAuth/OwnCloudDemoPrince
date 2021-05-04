package com.owncloud.android.lib.common.http.methods.webdav;

import java.lang.System;

/**
 * Wrapper to perform WebDAV (dav4android) calls
 *
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020(H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006)"}, d2 = {"Lcom/owncloud/android/lib/common/http/methods/webdav/DavMethod;", "Lcom/owncloud/android/lib/common/http/methods/HttpBaseMethod;", "url", "Ljava/net/URL;", "(Ljava/net/URL;)V", "davResource", "Lat/bitfire/dav4jvm/DavOCResource;", "getDavResource", "()Lat/bitfire/dav4jvm/DavOCResource;", "setDavResource", "(Lat/bitfire/dav4jvm/DavOCResource;)V", "isAborted", "", "()Z", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "setResponse", "(Lokhttp3/Response;)V", "abort", "", "execute", "", "setConnectionTimeout", "connectionTimeout", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "setFollowRedirects", "followRedirects", "setReadTimeout", "readTimeout", "setRequestHeader", "name", "", "value", "setRetryOnConnectionFailure", "retryOnConnectionFailure", "setUrl", "Lokhttp3/HttpUrl;", "owncloudComLibrary_debug"})
public abstract class DavMethod extends com.owncloud.android.lib.common.http.methods.HttpBaseMethod {
    @org.jetbrains.annotations.NotNull()
    private at.bitfire.dav4jvm.DavOCResource davResource;
    public okhttp3.Response response;
    
    protected DavMethod(@org.jetbrains.annotations.NotNull()
    java.net.URL url) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final at.bitfire.dav4jvm.DavOCResource getDavResource() {
        return null;
    }
    
    protected final void setDavResource(@org.jetbrains.annotations.NotNull()
    at.bitfire.dav4jvm.DavOCResource p0) {
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
    public void abort() {
    }
    
    @java.lang.Override()
    public int execute() throws java.lang.Exception {
        return 0;
    }
    
    @java.lang.Override()
    public void setReadTimeout(long readTimeout, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
    }
    
    @java.lang.Override()
    public void setConnectionTimeout(long connectionTimeout, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
    }
    
    @java.lang.Override()
    public void setFollowRedirects(boolean followRedirects) {
    }
    
    @java.lang.Override()
    public void setUrl(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url) {
    }
    
    @java.lang.Override()
    public void setRequestHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void setRetryOnConnectionFailure(boolean retryOnConnectionFailure) {
    }
    
    @java.lang.Override()
    public boolean isAborted() {
        return false;
    }
}