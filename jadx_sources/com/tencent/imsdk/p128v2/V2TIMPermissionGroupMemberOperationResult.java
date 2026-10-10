package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.community.PermissionGroupMemberOperationResult;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMPermissionGroupMemberOperationResult {
    PermissionGroupMemberOperationResult permissionGroupMemberOperationResult = new PermissionGroupMemberOperationResult();

    public String getMemberID() {
        PermissionGroupMemberOperationResult permissionGroupMemberOperationResult = this.permissionGroupMemberOperationResult;
        return permissionGroupMemberOperationResult == null ? "" : permissionGroupMemberOperationResult.getUserID();
    }

    public int getResultCode() {
        PermissionGroupMemberOperationResult permissionGroupMemberOperationResult = this.permissionGroupMemberOperationResult;
        if (permissionGroupMemberOperationResult == null) {
            return 0;
        }
        return permissionGroupMemberOperationResult.getResultCode();
    }

    public void setPermissionGroupMemberOperationResult(PermissionGroupMemberOperationResult permissionGroupMemberOperationResult) {
        this.permissionGroupMemberOperationResult = permissionGroupMemberOperationResult;
    }
}
