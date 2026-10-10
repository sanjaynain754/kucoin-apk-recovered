package com.tencent.imsdk.community;

/* JADX INFO: loaded from: classes59.dex */
public class PermissionGroupInfoGetResult {
    private int errorCode;
    private String errorMessage;
    private PermissionGroupInfo permissionGroupInfo;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PermissionGroupInfo getPermissionGroupInfo() {
        return this.permissionGroupInfo;
    }

    public void setErrorCode(int i11) {
        this.errorCode = i11;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setPermissionGroupInfo(PermissionGroupInfo permissionGroupInfo) {
        this.permissionGroupInfo = permissionGroupInfo;
    }
}
