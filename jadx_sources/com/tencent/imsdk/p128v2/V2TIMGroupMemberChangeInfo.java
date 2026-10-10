package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.group.GroupMemberInfoChangeItem;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupMemberChangeInfo implements Serializable {
    private GroupMemberInfoChangeItem groupMemberInfoChangeItem = new GroupMemberInfoChangeItem();

    public GroupMemberInfoChangeItem getGroupMemberInfoChangeItem() {
        return this.groupMemberInfoChangeItem;
    }

    public long getMuteTime() {
        return this.groupMemberInfoChangeItem.getShutUpTime();
    }

    public String getUserID() {
        return this.groupMemberInfoChangeItem.getUserID();
    }

    public void setGroupMemberInfoChangeItem(GroupMemberInfoChangeItem groupMemberInfoChangeItem) {
        this.groupMemberInfoChangeItem = groupMemberInfoChangeItem;
    }
}
