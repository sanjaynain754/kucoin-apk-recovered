package com.tencent.imsdk.community;

/* JADX INFO: loaded from: classes59.dex */
public class TopicPermissionResult {
    private int errorCode;
    private String errorMessage;
    private String groupID;
    private String permissionGroupID;
    private String topicID;
    private long topicPermission;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getGroupID() {
        return this.groupID;
    }

    public String getPermissionGroupID() {
        return this.permissionGroupID;
    }

    public String getTopicID() {
        return this.topicID;
    }

    public long getTopicPermission() {
        return this.topicPermission;
    }

    public void setErrorCode(int i11) {
        this.errorCode = i11;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setGroupID(String str) {
        this.groupID = str;
    }

    public void setPermissionGroupID(String str) {
        this.permissionGroupID = str;
    }

    public void setTopicID(String str) {
        this.topicID = str;
    }

    public void setTopicPermission(long j11) {
        this.topicPermission = j11;
    }
}
