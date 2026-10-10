package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.FriendCheckResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMFriendCheckResult implements Serializable {
    public static final int V2TIM_FRIEND_RELATION_TYPE_BOTH_WAY = 3;
    public static final int V2TIM_FRIEND_RELATION_TYPE_IN_MY_FRIEND_LIST = 1;
    public static final int V2TIM_FRIEND_RELATION_TYPE_IN_OTHER_FRIEND_LIST = 2;
    public static final int V2TIM_FRIEND_RELATION_TYPE_NONE = 0;
    private FriendCheckResult friendCheckResult = new FriendCheckResult();

    public int getResultCode() {
        return this.friendCheckResult.getResultCode();
    }

    public String getResultInfo() {
        return this.friendCheckResult.getResultInfo();
    }

    public int getResultType() {
        return this.friendCheckResult.getRelationType();
    }

    public String getUserID() {
        return this.friendCheckResult.getUserID();
    }

    public void setFriendCheckResult(FriendCheckResult friendCheckResult) {
        this.friendCheckResult = friendCheckResult;
    }
}
