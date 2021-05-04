package com.owncloud.android.lib.common.http.methods.webdav;

import java.lang.System;

/**
 * Move calls wrapper
 *
 * @author Christian Schabesberger
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/owncloud/android/lib/common/http/methods/webdav/MoveMethod;", "Lcom/owncloud/android/lib/common/http/methods/webdav/DavMethod;", "url", "Ljava/net/URL;", "destinationUrl", "", "forceOverride", "", "(Ljava/net/URL;Ljava/lang/String;Z)V", "onExecute", "", "owncloudComLibrary_debug"})
public final class MoveMethod extends com.owncloud.android.lib.common.http.methods.webdav.DavMethod {
    private final java.lang.String destinationUrl = null;
    private final boolean forceOverride = false;
    
    public MoveMethod(@org.jetbrains.annotations.NotNull()
    java.net.URL url, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationUrl, boolean forceOverride) {
        super(null);
    }
    
    @java.lang.Override()
    public int onExecute() throws java.lang.Exception {
        return 0;
    }
}