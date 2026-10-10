package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.community.PermissionGroupInfoGetResult;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMPermissionGroupInfoResult {
    private PermissionGroupInfoGetResult permissionGroupInfoGetResult = new PermissionGroupInfoGetResult();

    public V2TIMPermissionGroupInfo getPermissionGroupInfo() {
        if (this.permissionGroupInfoGetResult == null) {
            return null;
        }
        V2TIMPermissionGroupInfo v2TIMPermissionGroupInfo = new V2TIMPermissionGroupInfo();
        v2TIMPermissionGroupInfo.setPermissionGroupInfo(this.permissionGroupInfoGetResult.getPermissionGroupInfo());
        return v2TIMPermissionGroupInfo;
    }

    public int getResultCode() {
        PermissionGroupInfoGetResult permissionGroupInfoGetResult = this.permissionGroupInfoGetResult;
        if (permissionGroupInfoGetResult != null) {
            return permissionGroupInfoGetResult.getErrorCode();
        }
        return 0;
    }

    public String getResultMessage() {
        PermissionGroupInfoGetResult permissionGroupInfoGetResult = this.permissionGroupInfoGetResult;
        return permissionGroupInfoGetResult != null ? permissionGroupInfoGetResult.getErrorMessage() : "";
    }

    public void setPermissionGroupInfoGetResult(PermissionGroupInfoGetResult permissionGroupInfoGetResult) {
        this.permissionGroupInfoGetResult = permissionGroupInfoGetResult;
    }
}
