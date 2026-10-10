package com.tencent.imsdk.community;

/* JADX INFO: loaded from: classes59.dex */
public class PermissionGroupOperationResult {
    private int errorCode;
    private String errorMessage;
    private String permissionGroupID;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getPermissionGroupID() {
        return this.permissionGroupID;
    }

    public void setErrorCode(int i11) {
        this.errorCode = i11;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setPermissionGroupID(String str) {
        this.permissionGroupID = str;
    }
}
