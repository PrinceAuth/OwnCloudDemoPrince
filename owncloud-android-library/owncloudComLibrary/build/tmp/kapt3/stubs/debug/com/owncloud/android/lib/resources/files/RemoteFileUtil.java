package com.owncloud.android.lib.resources.files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/owncloud/android/lib/resources/files/RemoteFileUtil;", "", "()V", "Companion", "owncloudComLibrary_debug"})
public final class RemoteFileUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.files.RemoteFileUtil.Companion Companion = null;
    
    public RemoteFileUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/owncloud/android/lib/resources/files/RemoteFileUtil$Companion;", "", "()V", "getRemotePathFromUrl", "", "url", "Lokhttp3/HttpUrl;", "userId", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Retrieves a relative path from a remote file url
         *
         *
         * Example: url:port/remote.php/dav/files/username/Documents/text.txt => /Documents/text.txt
         *
         * @param url    remote file url
         * @param userId file owner
         * @return remote relative path of the file
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRemotePathFromUrl(@org.jetbrains.annotations.NotNull()
        okhttp3.HttpUrl url, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
            return null;
        }
    }
}