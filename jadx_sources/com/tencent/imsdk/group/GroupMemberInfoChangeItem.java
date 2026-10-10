package com.tencent.imsdk.group;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class GroupMemberInfoChangeItem implements Serializable {
    private long shutUpTime;
    private long tinyID;
    private String userID;

    public long getShutUpTime() {
        return this.shutUpTime;
    }

    public String getUserID() {
        return this.userID;
    }
}
