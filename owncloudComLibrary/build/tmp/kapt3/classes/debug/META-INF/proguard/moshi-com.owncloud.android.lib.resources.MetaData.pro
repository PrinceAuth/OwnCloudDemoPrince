-if class com.owncloud.android.lib.resources.MetaData
-keepnames class com.owncloud.android.lib.resources.MetaData
-if class com.owncloud.android.lib.resources.MetaData
-keep class com.owncloud.android.lib.resources.MetaDataJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
