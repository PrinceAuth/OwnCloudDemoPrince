-if class com.owncloud.android.lib.resources.users.responses.UserInfoResponse
-keepnames class com.owncloud.android.lib.resources.users.responses.UserInfoResponse
-if class com.owncloud.android.lib.resources.users.responses.UserInfoResponse
-keep class com.owncloud.android.lib.resources.users.responses.UserInfoResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
