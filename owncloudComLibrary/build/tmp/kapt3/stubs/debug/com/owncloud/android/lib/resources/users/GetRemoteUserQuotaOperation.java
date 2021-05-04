package com.owncloud.android.lib.resources.users;

import java.lang.System;

/**
 * @author marcello
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014\u00a8\u0006\u0011"}, d2 = {"Lcom/owncloud/android/lib/resources/users/GetRemoteUserQuotaOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/users/GetRemoteUserQuotaOperation$RemoteQuota;", "()V", "isSuccess", "", "status", "", "readData", "properties", "", "Lat/bitfire/dav4jvm/Property;", "run", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "RemoteQuota", "owncloudComLibrary_debug"})
public final class GetRemoteUserQuotaOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.users.GetRemoteUserQuotaOperation.RemoteQuota> {
    
    public GetRemoteUserQuotaOperation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.users.GetRemoteUserQuotaOperation.RemoteQuota> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    private final boolean isSuccess(int status) {
        return false;
    }
    
    /**
     * Read the data retrieved from the server about the quota
     *
     * @param properties WebDAV properties containing quota data
     * @return new [RemoteQuota] instance representing the data read from the server
     */
    private final com.owncloud.android.lib.resources.users.GetRemoteUserQuotaOperation.RemoteQuota readData(java.util.List<? extends at.bitfire.dav4jvm.Property> properties) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/owncloud/android/lib/resources/users/GetRemoteUserQuotaOperation$RemoteQuota;", "", "free", "", "used", "total", "relative", "", "(JJJD)V", "getFree", "()J", "setFree", "(J)V", "getRelative", "()D", "setRelative", "(D)V", "getTotal", "setTotal", "getUsed", "setUsed", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "owncloudComLibrary_debug"})
    public static final class RemoteQuota {
        private long free;
        private long used;
        private long total;
        private double relative;
        
        @org.jetbrains.annotations.NotNull()
        public final com.owncloud.android.lib.resources.users.GetRemoteUserQuotaOperation.RemoteQuota copy(long free, long used, long total, double relative) {
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
        
        public RemoteQuota(long free, long used, long total, double relative) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getFree() {
            return 0L;
        }
        
        public final void setFree(long p0) {
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getUsed() {
            return 0L;
        }
        
        public final void setUsed(long p0) {
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getTotal() {
            return 0L;
        }
        
        public final void setTotal(long p0) {
        }
        
        public final double component4() {
            return 0.0;
        }
        
        public final double getRelative() {
            return 0.0;
        }
        
        public final void setRelative(double p0) {
        }
    }
}