package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * // TODO This type is already included in the domain but we still need it here since the parsing takes place in this library for the moment
 *
 * Enum for Share Type, with values:
 * -1 - Unknown
 * 0 - Shared by user
 * 1 - Shared by group
 * 3 - Shared by public link
 * 4 - Shared by e-mail
 * 5 - Shared by contact
 * 6 - Federated
 *
 * @author masensio
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/ShareType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "USER", "GROUP", "PUBLIC_LINK", "EMAIL", "CONTACT", "FEDERATED", "Companion", "owncloudComLibrary_debug"})
public enum ShareType {
    /*public static final*/ UNKNOWN /* = new UNKNOWN(0) */,
    /*public static final*/ USER /* = new USER(0) */,
    /*public static final*/ GROUP /* = new GROUP(0) */,
    /*public static final*/ PUBLIC_LINK /* = new PUBLIC_LINK(0) */,
    /*public static final*/ EMAIL /* = new EMAIL(0) */,
    /*public static final*/ CONTACT /* = new CONTACT(0) */,
    /*public static final*/ FEDERATED /* = new FEDERATED(0) */;
    private final int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.ShareType.Companion Companion = null;
    
    ShareType(int value) {
    }
    
    public final int getValue() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/ShareType$Companion;", "", "()V", "fromValue", "Lcom/owncloud/android/lib/resources/shares/ShareType;", "value", "", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.owncloud.android.lib.resources.shares.ShareType fromValue(int value) {
            return null;
        }
    }
}