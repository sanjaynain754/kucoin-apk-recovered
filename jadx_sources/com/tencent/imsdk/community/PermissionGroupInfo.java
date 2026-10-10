package com.tencent.imsdk.community;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes59.dex */
public class PermissionGroupInfo {
    public static long MODIFY_FLAG_NONE = 0;
    public static long MODIFY_FLAG_PERMISSION_GROUP_CUSTOM_STRING = 4;
    public static long MODIFY_FLAG_PERMISSION_GROUP_NAME = 1;
    public static long MODIFY_FLAG_PERMISSION_GROUP_PERMISSION = 2;
    private String customData;
    private String groupID;
    private long groupPermission;
    private long memberCount;
    private String permissionGroupID;
    private byte[] permissionGroupNameBytes;

    public String getCustomData() {
        return this.customData;
    }

    public String getGroupID() {
        return this.groupID;
    }

    public long getGroupPermission() {
        return this.groupPermission;
    }

    public long getMemberCount() {
        return this.memberCount;
    }

    public String getPermissionGroupID() {
        return this.permissionGroupID;
    }

    public String getPermissionGroupName() {
        byte[] bArr = this.permissionGroupNameBytes;
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public void setCustomData(String str) {
        this.customData = str;
    }

    public void setGroupID(String str) {
        this.groupID = str;
    }

    public void setGroupPermission(long j11) {
        this.groupPermission = j11;
    }

    public void setPermissionGroupID(String str) {
        this.permissionGroupID = str;
    }

    public void setPermissionGroupName(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.permissionGroupNameBytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
            }
        }
    }
}
