package com.tencent.imsdk.group;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class GroupMemberSearchResult implements Serializable {
    private boolean isFinished;
    private Map<String, List<GroupMemberInfo>> memberList;
    private String nextCursor;
    private int totalCount;

    public boolean getIsFinished() {
        return this.isFinished;
    }

    public Map<String, List<GroupMemberInfo>> getMemberList() {
        return this.memberList;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public int getTotalCount() {
        return this.totalCount;
    }
}
