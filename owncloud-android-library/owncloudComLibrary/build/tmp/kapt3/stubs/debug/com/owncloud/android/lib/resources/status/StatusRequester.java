package com.owncloud.android.lib.resources.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\f\u0010\u0018\u001a\u00020\u000e*\u00020\u0019H\u0002\u00a8\u0006\u001c"}, d2 = {"Lcom/owncloud/android/lib/resources/status/StatusRequester;", "", "()V", "getGetMethod", "Lcom/owncloud/android/lib/common/http/methods/nonwebdav/GetMethod;", "url", "", "handleRequestResult", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "Lcom/owncloud/android/lib/resources/status/RemoteServerInfo;", "requestResult", "Lcom/owncloud/android/lib/resources/status/StatusRequester$RequestResult;", "baseUrl", "isRedirectedToNonSecureConnection", "", "redirectedToNonSecureLocationBefore", "redirectedUrl", "requestAndFollowRedirects", "baseLocation", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "updateLocationWithRedirectPath", "oldLocation", "redirectedLocation", "isSuccess", "", "Companion", "RequestResult", "owncloudComLibrary_debug"})
public final class StatusRequester {
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.status.StatusRequester.Companion Companion = null;
    
    /**
     * Maximum time to wait for a response from the server when the connection is being tested,
     * in milliseconds.
     */
    private static final long TRY_CONNECTION_TIMEOUT = 5000L;
    private static final java.lang.String NODE_INSTALLED = "installed";
    private static final java.lang.String NODE_VERSION = "version";
    
    public StatusRequester() {
        super();
    }
    
    /**
     * This function is ment to detect if a redirect from a secure to an unsecure connection
     * was made. If only connections from unsecure connections to unsecure connections were made
     * this function should not return true, because if the whole redirect chain was unsecure
     * we assume it was a debug setup.
     */
    public final boolean isRedirectedToNonSecureConnection(boolean redirectedToNonSecureLocationBefore, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String redirectedUrl) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String updateLocationWithRedirectPath(@org.jetbrains.annotations.NotNull()
    java.lang.String oldLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String redirectedLocation) {
        return null;
    }
    
    private final com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod getGetMethod(java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.status.StatusRequester.RequestResult requestAndFollowRedirects(@org.jetbrains.annotations.NotNull()
    java.lang.String baseLocation, @org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    private final boolean isSuccess(int $this$isSuccess) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.status.RemoteServerInfo> handleRequestResult(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.status.StatusRequester.RequestResult requestResult, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/owncloud/android/lib/resources/status/StatusRequester$RequestResult;", "", "getMethod", "Lcom/owncloud/android/lib/common/http/methods/nonwebdav/GetMethod;", "status", "", "redirectedToUnsecureLocation", "", "lastLocation", "", "(Lcom/owncloud/android/lib/common/http/methods/nonwebdav/GetMethod;IZLjava/lang/String;)V", "getGetMethod", "()Lcom/owncloud/android/lib/common/http/methods/nonwebdav/GetMethod;", "getLastLocation", "()Ljava/lang/String;", "getRedirectedToUnsecureLocation", "()Z", "getStatus", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "owncloudComLibrary_debug"})
    public static final class RequestResult {
        @org.jetbrains.annotations.NotNull()
        private final com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod getMethod = null;
        private final int status = 0;
        private final boolean redirectedToUnsecureLocation = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lastLocation = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.owncloud.android.lib.resources.status.StatusRequester.RequestResult copy(@org.jetbrains.annotations.NotNull()
        com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod getMethod, int status, boolean redirectedToUnsecureLocation, @org.jetbrains.annotations.NotNull()
        java.lang.String lastLocation) {
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
        
        public RequestResult(@org.jetbrains.annotations.NotNull()
        com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod getMethod, int status, boolean redirectedToUnsecureLocation, @org.jetbrains.annotations.NotNull()
        java.lang.String lastLocation) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod getGetMethod() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getStatus() {
            return 0;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getRedirectedToUnsecureLocation() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastLocation() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/owncloud/android/lib/resources/status/StatusRequester$Companion;", "", "()V", "NODE_INSTALLED", "", "NODE_VERSION", "TRY_CONNECTION_TIMEOUT", "", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}