package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.group.GroupInfo;
import com.tencent.imsdk.group.GroupSearchResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupSearchResult implements Serializable {
    private GroupSearchResult groupSearchResult;

    public List<V2TIMGroupInfo> getGroupList() {
        if (this.groupSearchResult == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (GroupInfo groupInfo : this.groupSearchResult.getGroupList()) {
            V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
            v2TIMGroupInfo.setGroupInfo(groupInfo);
            arrayList.add(v2TIMGroupInfo);
        }
        return arrayList;
    }

    public boolean getIsFinished() {
        GroupSearchResult groupSearchResult = this.groupSearchResult;
        if (groupSearchResult != null) {
            return groupSearchResult.getIsFinished();
        }
        return false;
    }

    public String getNextCursor() {
        GroupSearchResult groupSearchResult = this.groupSearchResult;
        if (groupSearchResult != null) {
            return groupSearchResult.getNextCursor();
        }
        return null;
    }

    public int getTotalCount() {
        GroupSearchResult groupSearchResult = this.groupSearchResult;
        if (groupSearchResult != null) {
            return groupSearchResult.getTotalCount();
        }
        return 0;
    }

    public void setGroupSearchResult(GroupSearchResult groupSearchResult) {
        this.groupSearchResult = groupSearchResult;
    }
}
