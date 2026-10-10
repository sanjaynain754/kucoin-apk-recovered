package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.FriendGroup;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMFriendGroup implements Serializable {
    private FriendGroup friendGroup = new FriendGroup();

    public long getFriendCount() {
        return this.friendGroup.getUserCount();
    }

    public List<String> getFriendIDList() {
        return this.friendGroup.getUserIDList();
    }

    public String getName() {
        return this.friendGroup.getGroupName();
    }

    public void setFriendGroup(FriendGroup friendGroup) {
        this.friendGroup = friendGroup;
    }
}
