package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.community.PermissionGroupMemberInfoResult;
import com.tencent.imsdk.group.GroupMemberInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMPermissionGroupMemberInfoResult {
    private String nextCursor;
    private List<V2TIMGroupMemberFullInfo> v2TIMGroupMemberFullInfoList = new ArrayList();

    public List<V2TIMGroupMemberFullInfo> getMemberInfoList() {
        return this.v2TIMGroupMemberFullInfoList;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public void setPermissionGroupMemberInfoResult(PermissionGroupMemberInfoResult permissionGroupMemberInfoResult) {
        this.nextCursor = permissionGroupMemberInfoResult.getNextCursor();
        this.v2TIMGroupMemberFullInfoList.clear();
        List<GroupMemberInfo> groupMemberInfoList = permissionGroupMemberInfoResult.getGroupMemberInfoList();
        for (int i11 = 0; i11 < groupMemberInfoList.size(); i11++) {
            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = new V2TIMGroupMemberFullInfo();
            v2TIMGroupMemberFullInfo.setGroupMemberInfo(groupMemberInfoList.get(i11));
            this.v2TIMGroupMemberFullInfoList.add(v2TIMGroupMemberFullInfo);
        }
    }
}
