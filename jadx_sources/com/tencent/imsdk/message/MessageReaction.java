package com.tencent.imsdk.message;

import com.tencent.imsdk.relationship.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class MessageReaction implements Serializable {
    private boolean reactedByMyself;
    private String reactionID;
    private int totalUserCount;
    private List<UserInfo> userInfoList = new ArrayList();

    public boolean getReactedByMyself() {
        return this.reactedByMyself;
    }

    public String getReactionID() {
        return this.reactionID;
    }

    public int getTotalUserCount() {
        return this.totalUserCount;
    }

    public List<UserInfo> getUserInfoList() {
        return this.userInfoList;
    }

    public void setReactedByMyself(boolean z11) {
        this.reactedByMyself = z11;
    }

    public void setReactionID(String str) {
        this.reactionID = str;
    }

    public void setTotalUserCount(int i11) {
        this.totalUserCount = i11;
    }

    public void setUserInfoList(List<UserInfo> list) {
        this.userInfoList = list;
    }
}
