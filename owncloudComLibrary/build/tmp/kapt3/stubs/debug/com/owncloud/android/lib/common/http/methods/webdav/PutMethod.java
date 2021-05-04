package com.owncloud.android.lib.common.http.methods.webdav;

import java.lang.System;

/**
 * Put calls wrapper
 *
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/owncloud/android/lib/common/http/methods/webdav/PutMethod;", "Lcom/owncloud/android/lib/common/http/methods/webdav/DavMethod;", "url", "Ljava/net/URL;", "putRequestBody", "Lokhttp3/RequestBody;", "(Ljava/net/URL;Lokhttp3/RequestBody;)V", "onExecute", "", "owncloudComLibrary_debug"})
public final class PutMethod extends com.owncloud.android.lib.common.http.methods.webdav.DavMethod {
    private final okhttp3.RequestBody putRequestBody = null;
    
    public PutMethod(@org.jetbrains.annotations.NotNull()
    java.net.URL url, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody putRequestBody) {
        super(null);
    }
    
    @java.lang.Override()
    public int onExecute() throws java.io.IOException, at.bitfire.dav4jvm.exception.HttpException {
        return 0;
    }
}