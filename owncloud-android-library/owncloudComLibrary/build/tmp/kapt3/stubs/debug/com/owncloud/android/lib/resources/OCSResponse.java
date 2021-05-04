package com.owncloud.android.lib.resources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\u000e\u0010\r\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/owncloud/android/lib/resources/OCSResponse;", "T", "", "meta", "Lcom/owncloud/android/lib/resources/MetaData;", "data", "(Lcom/owncloud/android/lib/resources/MetaData;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMeta", "()Lcom/owncloud/android/lib/resources/MetaData;", "component1", "component2", "copy", "(Lcom/owncloud/android/lib/resources/MetaData;Ljava/lang/Object;)Lcom/owncloud/android/lib/resources/OCSResponse;", "equals", "", "other", "hashCode", "", "toString", "", "owncloudComLibrary_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class OCSResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.owncloud.android.lib.resources.MetaData meta = null;
    private final T data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.OCSResponse<T> copy(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.MetaData meta, T data) {
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
    
    public OCSResponse(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.resources.MetaData meta, T data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.MetaData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.owncloud.android.lib.resources.MetaData getMeta() {
        return null;
    }
    
    public final T component2() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
}