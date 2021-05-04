-if class com.owncloud.android.lib.resources.OCSResponse
-keepnames class com.owncloud.android.lib.resources.OCSResponse
-if class com.owncloud.android.lib.resources.OCSResponse
-keep class com.owncloud.android.lib.resources.OCSResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi,java.lang.reflect.Type[]);
}
