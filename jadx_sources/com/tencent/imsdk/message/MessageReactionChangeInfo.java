package com.tencent.imsdk.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class MessageReactionChangeInfo implements Serializable {
    private String messageID;
    private List<MessageReaction> reactions = new ArrayList();

    public String getMessageID() {
        return this.messageID;
    }

    public List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public void setMessageID(String str) {
        this.messageID = str;
    }

    public void setReactions(List<MessageReaction> list) {
        this.reactions = list;
    }
}
