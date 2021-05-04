-if class com.owncloud.android.lib.resources.oauth.responses.TokenResponse
-keepnames class com.owncloud.android.lib.resources.oauth.responses.TokenResponse
-if class com.owncloud.android.lib.resources.oauth.responses.TokenResponse
-keep class com.owncloud.android.lib.resources.oauth.responses.TokenResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
