package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Created by masensio on 08/10/2015.
 *
 *
 * Retrieves a list of sharees (possible targets of a share) from the ownCloud server.
 *
 *
 * Currently only handles users and groups. Users in other OC servers (federation) should be added later.
 *
 *
 * Depends on SHAREE API. {@See https://github.com/owncloud/documentation/issues/1626}
 *
 *
 * Syntax:
 * Entry point: ocs/v2.php/apps/files_sharing/api/v1/sharees
 * HTTP method: GET
 * url argument: itemType - string, required
 * url argument: format - string, optional
 * url argument: search - string, optional
 * url arguments: perPage - int, optional
 * url arguments: page - int, optional
 *
 *
 * Status codes:
 * 100 - successful
 *
 * @author Christian Schabesberger
 * @author masensio
 * @author David A. Velasco
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/GetRemoteShareesOperation;", "Lcom/owncloud/android/lib/common/operations/RemoteOperation;", "Lcom/owncloud/android/lib/resources/shares/responses/ShareeOcsResponse;", "searchString", "", "page", "", "perPage", "(Ljava/lang/String;II)V", "buildRequestUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "baseUri", "isSuccess", "", "status", "onRequestSuccessful", "Lcom/owncloud/android/lib/common/operations/RemoteOperationResult;", "response", "onResultUnsuccessful", "method", "Lcom/owncloud/android/lib/common/http/methods/nonwebdav/GetMethod;", "parseResponse", "run", "client", "Lcom/owncloud/android/lib/common/OwnCloudClient;", "Companion", "owncloudComLibrary_debug"})
public final class GetRemoteShareesOperation extends com.owncloud.android.lib.common.operations.RemoteOperation<com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse> {
    private final java.lang.String searchString = null;
    private final int page = 0;
    private final int perPage = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.GetRemoteShareesOperation.Companion Companion = null;
    private static final java.lang.String OCS_ROUTE = "ocs/v2.php/apps/files_sharing/api/v1/sharees";
    private static final java.lang.String PARAM_FORMAT = "format";
    private static final java.lang.String PARAM_ITEM_TYPE = "itemType";
    private static final java.lang.String PARAM_SEARCH = "search";
    private static final java.lang.String PARAM_PAGE = "page";
    private static final java.lang.String PARAM_PER_PAGE = "perPage";
    private static final java.lang.String VALUE_FORMAT = "json";
    private static final java.lang.String VALUE_ITEM_TYPE = "file";
    
    public GetRemoteShareesOperation(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString, int page, int perPage) {
        super();
    }
    
    private final android.net.Uri buildRequestUri(android.net.Uri baseUri) {
        return null;
    }
    
    private final com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse parseResponse(java.lang.String response) {
        return null;
    }
    
    private final com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse> onResultUnsuccessful(com.owncloud.android.lib.common.http.methods.nonwebdav.GetMethod method, java.lang.String response, int status) {
        return null;
    }
    
    private final com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse> onRequestSuccessful(java.lang.String response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.owncloud.android.lib.common.operations.RemoteOperationResult<com.owncloud.android.lib.resources.shares.responses.ShareeOcsResponse> run(@org.jetbrains.annotations.NotNull()
    com.owncloud.android.lib.common.OwnCloudClient client) {
        return null;
    }
    
    private final boolean isSuccess(int status) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/GetRemoteShareesOperation$Companion;", "", "()V", "OCS_ROUTE", "", "PARAM_FORMAT", "PARAM_ITEM_TYPE", "PARAM_PAGE", "PARAM_PER_PAGE", "PARAM_SEARCH", "VALUE_FORMAT", "VALUE_ITEM_TYPE", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}