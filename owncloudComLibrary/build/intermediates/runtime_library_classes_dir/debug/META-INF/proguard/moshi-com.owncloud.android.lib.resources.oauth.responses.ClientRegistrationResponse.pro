-if class com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponse
-keepnames class com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponse
-if class com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponse
-keep class com.owncloud.android.lib.resources.oauth.responses.ClientRegistrationResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
