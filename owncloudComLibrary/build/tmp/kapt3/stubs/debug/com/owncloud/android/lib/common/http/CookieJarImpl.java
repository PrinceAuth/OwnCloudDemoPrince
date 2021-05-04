package com.owncloud.android.lib.common.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012.\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\u0004J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R6\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/owncloud/android/lib/common/http/CookieJarImpl;", "Lokhttp3/CookieJar;", "sCookieStore", "Ljava/util/HashMap;", "", "", "Lokhttp3/Cookie;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "containsCookieWithName", "", "cookies", "name", "getUpdatedCookies", "oldCookies", "newCookies", "loadForRequest", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "owncloudComLibrary_debug"})
public final class CookieJarImpl implements okhttp3.CookieJar {
    private final java.util.HashMap<java.lang.String, java.util.List<okhttp3.Cookie>> sCookieStore = null;
    
    public CookieJarImpl(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.util.List<okhttp3.Cookie>> sCookieStore) {
        super();
    }
    
    public final boolean containsCookieWithName(@org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<okhttp3.Cookie> getUpdatedCookies(@org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> oldCookies, @org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> newCookies) {
        return null;
    }
    
    @java.lang.Override()
    public void saveFromResponse(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url, @org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl url) {
        return null;
    }
}