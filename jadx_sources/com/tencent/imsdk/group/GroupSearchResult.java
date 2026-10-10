package com.tencent.imsdk.group;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class GroupSearchResult implements Serializable {
    private List<GroupInfo> groupList;
    private boolean isFinished;
    private String nextCursor;
    private int totalCount;

    public List<GroupInfo> getGroupList() {
        return this.groupList;
    }

    public boolean getIsFinished() {
        return this.isFinished;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public int getTotalCount() {
        return this.totalCount;
    }
}
