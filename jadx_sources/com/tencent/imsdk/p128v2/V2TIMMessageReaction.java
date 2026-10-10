package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.message.MessageReaction;
import com.tencent.imsdk.relationship.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessageReaction implements Serializable {
    private MessageReaction reaction = new MessageReaction();

    public List<V2TIMUserInfo> getPartialUserList() {
        if (this.reaction == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UserInfo userInfo : this.reaction.getUserInfoList()) {
            V2TIMUserInfo v2TIMUserInfo = new V2TIMUserInfo();
            v2TIMUserInfo.setUserInfo(userInfo);
            arrayList.add(v2TIMUserInfo);
        }
        return arrayList;
    }

    public boolean getReactedByMyself() {
        return this.reaction.getReactedByMyself();
    }

    public String getReactionID() {
        MessageReaction messageReaction = this.reaction;
        if (messageReaction != null) {
            return messageReaction.getReactionID();
        }
        return null;
    }

    public int getTotalUserCount() {
        MessageReaction messageReaction = this.reaction;
        if (messageReaction != null) {
            return messageReaction.getTotalUserCount();
        }
        return 0;
    }

    public void setMessageReaction(MessageReaction messageReaction) {
        this.reaction = messageReaction;
    }

    public String toString() {
        return "V2TIMMessageReaction{reactionID=" + getReactionID() + ",partialUserList=" + getPartialUserList() + ",totalUserCount=" + getTotalUserCount() + ",reactedByMyself=" + getReactedByMyself() + '}';
    }
}
