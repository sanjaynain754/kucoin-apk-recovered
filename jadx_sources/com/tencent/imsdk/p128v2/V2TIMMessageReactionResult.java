package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.message.MessageReaction;
import com.tencent.imsdk.message.MessageReactionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessageReactionResult implements Serializable {
    private MessageReactionResult reactionResult;

    public String getMessageID() {
        MessageReactionResult messageReactionResult = this.reactionResult;
        if (messageReactionResult != null) {
            return messageReactionResult.getMessageID();
        }
        return null;
    }

    public List<V2TIMMessageReaction> getReactionList() {
        if (this.reactionResult == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MessageReaction messageReaction : this.reactionResult.getReactions()) {
            V2TIMMessageReaction v2TIMMessageReaction = new V2TIMMessageReaction();
            v2TIMMessageReaction.setMessageReaction(messageReaction);
            arrayList.add(v2TIMMessageReaction);
        }
        return arrayList;
    }

    public int getResultCode() {
        MessageReactionResult messageReactionResult = this.reactionResult;
        if (messageReactionResult != null) {
            return messageReactionResult.getResultCode();
        }
        return 0;
    }

    public String getResultInfo() {
        MessageReactionResult messageReactionResult = this.reactionResult;
        if (messageReactionResult != null) {
            return messageReactionResult.getResultInfo();
        }
        return null;
    }

    public void setMessageReactionResult(MessageReactionResult messageReactionResult) {
        this.reactionResult = messageReactionResult;
    }

    public String toString() {
        return "V2TIMMessageReactionResult{code=" + getResultCode() + ",info=" + getResultInfo() + ",messageID=" + getMessageID() + ",reactionList=" + getReactionList() + '}';
    }
}
