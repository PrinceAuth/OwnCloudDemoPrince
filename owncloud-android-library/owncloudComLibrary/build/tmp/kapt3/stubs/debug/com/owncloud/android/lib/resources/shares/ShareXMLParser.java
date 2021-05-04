package com.owncloud.android.lib.resources.shares;

import java.lang.System;

/**
 * Parser for Share API Response
 *
 * @author masensio
 * @author David González Verdugo
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u001e\u0010#\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\nH\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010)\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/ShareXMLParser;", "", "()V", "isForbidden", "", "()Z", "isNotFound", "isSuccess", "isWrongParameter", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "status", "getStatus", "setStatus", "statusCode", "", "getStatusCode", "()I", "setStatusCode", "(I)V", "fixPathForFolder", "", "share", "Lcom/owncloud/android/lib/resources/shares/RemoteShare;", "parseXMLResponse", "Ljava/util/ArrayList;", "inputStream", "Ljava/io/InputStream;", "readData", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "readElement", "shares", "readMeta", "readNode", "node", "readOCS", "readText", "skip", "Companion", "owncloudComLibrary_debug"})
public final class ShareXMLParser {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    private int statusCode = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    public static final com.owncloud.android.lib.resources.shares.ShareXMLParser.Companion Companion = null;
    private static final java.lang.String ns = null;
    private static final java.lang.String NODE_OCS = "ocs";
    private static final java.lang.String NODE_META = "meta";
    private static final java.lang.String NODE_STATUS = "status";
    private static final java.lang.String NODE_STATUS_CODE = "statuscode";
    private static final java.lang.String NODE_MESSAGE = "message";
    private static final java.lang.String NODE_DATA = "data";
    private static final java.lang.String NODE_ELEMENT = "element";
    private static final java.lang.String NODE_ID = "id";
    private static final java.lang.String NODE_ITEM_TYPE = "item_type";
    private static final java.lang.String NODE_PARENT = "parent";
    private static final java.lang.String NODE_SHARE_TYPE = "share_type";
    private static final java.lang.String NODE_SHARE_WITH = "share_with";
    private static final java.lang.String NODE_PATH = "path";
    private static final java.lang.String NODE_PERMISSIONS = "permissions";
    private static final java.lang.String NODE_STIME = "stime";
    private static final java.lang.String NODE_EXPIRATION = "expiration";
    private static final java.lang.String NODE_TOKEN = "token";
    private static final java.lang.String NODE_STORAGE = "storage";
    private static final java.lang.String NODE_MAIL_SEND = "mail_send";
    private static final java.lang.String NODE_SHARE_WITH_DISPLAY_NAME = "share_with_displayname";
    private static final java.lang.String NODE_SHARE_WITH_ADDITIONAL_INFO = "share_with_additional_info";
    private static final java.lang.String NODE_NAME = "name";
    private static final java.lang.String NODE_URL = "url";
    private static final java.lang.String TYPE_FOLDER = "folder";
    private static final int SUCCESS = 200;
    private static final int ERROR_WRONG_PARAMETER = 400;
    private static final int ERROR_FORBIDDEN = 403;
    private static final int ERROR_NOT_FOUND = 404;
    private static final int INIT = -1;
    
    public ShareXMLParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final void setStatusCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final boolean isForbidden() {
        return false;
    }
    
    public final boolean isNotFound() {
        return false;
    }
    
    public final boolean isWrongParameter() {
        return false;
    }
    
    /**
     * Parse is as response of Share API
     * @param inputStream
     * @return List of ShareRemoteFiles
     * @throws XmlPullParserException
     * @throws IOException
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.owncloud.android.lib.resources.shares.RemoteShare> parseXMLResponse(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    /**
     * Parse OCS node
     * @param parser
     * @return List of ShareRemoteFiles
     * @throws XmlPullParserException
     * @throws IOException
     */
    private final java.util.ArrayList<com.owncloud.android.lib.resources.shares.RemoteShare> readOCS(org.xmlpull.v1.XmlPullParser parser) {
        return null;
    }
    
    /**
     * Parse Meta node
     * @param parser
     * @throws XmlPullParserException
     * @throws IOException
     */
    private final void readMeta(org.xmlpull.v1.XmlPullParser parser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
    }
    
    /**
     * Parse Data node
     * @param parser
     * @return
     * @throws XmlPullParserException
     * @throws IOException
     */
    private final java.util.ArrayList<com.owncloud.android.lib.resources.shares.RemoteShare> readData(org.xmlpull.v1.XmlPullParser parser) {
        return null;
    }
    
    /**
     * Parse Element node
     * @param parser
     * @return
     * @throws XmlPullParserException
     * @throws IOException
     */
    private final void readElement(org.xmlpull.v1.XmlPullParser parser, java.util.ArrayList<com.owncloud.android.lib.resources.shares.RemoteShare> shares) {
    }
    
    private final void fixPathForFolder(com.owncloud.android.lib.resources.shares.RemoteShare share) {
    }
    
    /**
     * Parse a node, to obtain its text. Needs readText method
     * @param parser
     * @param node
     * @return Text of the node
     * @throws XmlPullParserException
     * @throws IOException
     */
    private final java.lang.String readNode(org.xmlpull.v1.XmlPullParser parser, java.lang.String node) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return null;
    }
    
    /**
     * Read the text from a node
     * @param parser
     * @return Text of the node
     * @throws IOException
     * @throws XmlPullParserException
     */
    private final java.lang.String readText(org.xmlpull.v1.XmlPullParser parser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return null;
    }
    
    /**
     * Skip tags in parser procedure
     * @param parser
     * @throws XmlPullParserException
     * @throws IOException
     */
    private final void skip(org.xmlpull.v1.XmlPullParser parser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/owncloud/android/lib/resources/shares/ShareXMLParser$Companion;", "", "()V", "ERROR_FORBIDDEN", "", "ERROR_NOT_FOUND", "ERROR_WRONG_PARAMETER", "INIT", "NODE_DATA", "", "NODE_ELEMENT", "NODE_EXPIRATION", "NODE_ID", "NODE_ITEM_TYPE", "NODE_MAIL_SEND", "NODE_MESSAGE", "NODE_META", "NODE_NAME", "NODE_OCS", "NODE_PARENT", "NODE_PATH", "NODE_PERMISSIONS", "NODE_SHARE_TYPE", "NODE_SHARE_WITH", "NODE_SHARE_WITH_ADDITIONAL_INFO", "NODE_SHARE_WITH_DISPLAY_NAME", "NODE_STATUS", "NODE_STATUS_CODE", "NODE_STIME", "NODE_STORAGE", "NODE_TOKEN", "NODE_URL", "SUCCESS", "TYPE_FOLDER", "ns", "owncloudComLibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}