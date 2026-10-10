package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.message.MessageReactionUserResult;
import com.tencent.imsdk.relationship.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessageReactionUserResult implements Serializable {
    private MessageReactionUserResult reactionUserResult;

    public boolean getIsFinished() {
        MessageReactionUserResult messageReactionUserResult = this.reactionUserResult;
        if (messageReactionUserResult != null) {
            return messageReactionUserResult.getIsFinished();
        }
        return true;
    }

    public int getNextSeq() {
        MessageReactionUserResult messageReactionUserResult = this.reactionUserResult;
        if (messageReactionUserResult != null) {
            return messageReactionUserResult.getNextSequence();
        }
        return 0;
    }

    public List<V2TIMUserInfo> getUserInfoList() {
        if (this.reactionUserResult == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UserInfo userInfo : this.reactionUserResult.getUserInfoList()) {
            V2TIMUserInfo v2TIMUserInfo = new V2TIMUserInfo();
            v2TIMUserInfo.setUserInfo(userInfo);
            arrayList.add(v2TIMUserInfo);
        }
        return arrayList;
    }

    public void setMessageReactionUserResult(MessageReactionUserResult messageReactionUserResult) {
        this.reactionUserResult = messageReactionUserResult;
    }

    public String toString() {
        return "V2TIMMessageReactionUserResult{userInfoList=" + getUserInfoList() + ",nextSeq=" + getNextSeq() + ",isFinished=" + getIsFinished() + '}';
    }
}
