package com.tencent.imsdk.message;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class MessageQuoteInfo implements Serializable {
    private long messageSequence;
    private long messageTime;
    private String msgID;

    public long getMessageSequence() {
        return this.messageSequence;
    }

    public long getMessageTime() {
        return this.messageTime;
    }

    public String getMsgID() {
        return this.msgID;
    }

    public void setMessageSequence(long j11) {
        this.messageSequence = j11;
    }

    public void setMessageTime(long j11) {
        this.messageTime = j11;
    }

    public void setMsgID(String str) {
        this.msgID = str;
    }

    public String toString() {
        return "MessageQuoteInfo{msgID='" + this.msgID + "', messageTime=" + this.messageTime + ", messageSequence=" + this.messageSequence + '}';
    }
}
