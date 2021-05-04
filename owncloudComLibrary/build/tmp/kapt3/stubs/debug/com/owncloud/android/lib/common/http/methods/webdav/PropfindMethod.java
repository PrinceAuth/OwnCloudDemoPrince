package com.owncloud.android.lib.common.http.methods.webdav;

import java.lang.System;

/**
 * Propfind calls wrapper
 *
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/owncloud/android/lib/common/http/methods/webdav/PropfindMethod;", "Lcom/owncloud/android/lib/common/http/methods/webdav/DavMethod;", "url", "Ljava/net/URL;", "depth", "", "propertiesToRequest", "", "Lat/bitfire/dav4jvm/Property$Name;", "(Ljava/net/URL;I[Lat/bitfire/dav4jvm/Property$Name;)V", "members", "", "Lat/bitfire/dav4jvm/Response;", "getMembers", "()Ljava/util/List;", "[Lat/bitfire/dav4jvm/Property$Name;", "<set-?>", "root", "getRoot", "()Lat/bitfire/dav4jvm/Response;", "onExecute", "owncloudComLibrary_debug"})
public final class PropfindMethod extends com.owncloud.android.lib.common.http.methods.webdav.DavMethod {
    private final int depth = 0;
    private final at.bitfire.dav4jvm.Property.Name[] propertiesToRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<at.bitfire.dav4jvm.Response> members = null;
    @org.jetbrains.annotations.Nullable()
    private at.bitfire.dav4jvm.Response root;
    
    public PropfindMethod(@org.jetbrains.annotations.NotNull()
    java.net.URL url, int depth, @org.jetbrains.annotations.NotNull()
    at.bitfire.dav4jvm.Property.Name[] propertiesToRequest) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<at.bitfire.dav4jvm.Response> getMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final at.bitfire.dav4jvm.Response getRoot() {
        return null;
    }
    
    @java.lang.Override()
    public int onExecute() throws java.io.IOException, at.bitfire.dav4jvm.exception.DavException {
        return 0;
    }
}