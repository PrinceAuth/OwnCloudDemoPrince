-if class com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponse
-keepnames class com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponse
-if class com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponse
-keep class com.owncloud.android.lib.resources.oauth.responses.OIDCDiscoveryResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
