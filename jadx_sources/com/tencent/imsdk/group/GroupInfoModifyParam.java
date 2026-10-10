package com.tencent.imsdk.group;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class GroupInfoModifyParam implements Serializable {
    private GroupInfo groupInfo;
    private long modifyFlag;

    public GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public long getModifyFlag() {
        return this.modifyFlag;
    }

    public void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public void setModifyFlag(long j11) {
        this.modifyFlag = j11;
    }
}
