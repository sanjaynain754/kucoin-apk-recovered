package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.message.MessageQuoteInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessageQuoteInfo implements Serializable {
    private MessageQuoteInfo messageQuoteInfo = new MessageQuoteInfo();

    public long getMessageSequence() {
        return this.messageQuoteInfo.getMessageSequence();
    }

    public long getMessageTime() {
        return this.messageQuoteInfo.getMessageTime();
    }

    public String getMsgID() {
        return this.messageQuoteInfo.getMsgID();
    }

    public void setMessageQuoteInfo(MessageQuoteInfo messageQuoteInfo) {
        if (messageQuoteInfo == null) {
            messageQuoteInfo = new MessageQuoteInfo();
        }
        this.messageQuoteInfo = messageQuoteInfo;
    }

    public String toString() {
        return "V2TIMMessageQuoteInfo{msgID='" + getMsgID() + "', messageTime=" + getMessageTime() + ", messageSequence=" + getMessageSequence() + '}';
    }
}
