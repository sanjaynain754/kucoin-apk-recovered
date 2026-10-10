package com.tencent.imsdk.community;

import com.tencent.imsdk.group.GroupMemberInfo;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class PermissionGroupMemberInfoResult {
    private List<GroupMemberInfo> groupMemberInfoList;
    private String nextCursor;

    public List<GroupMemberInfo> getGroupMemberInfoList() {
        return this.groupMemberInfoList;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }
}
