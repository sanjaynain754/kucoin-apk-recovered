package com.tencent.qcloud.tim.push;

import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushMessage implements Serializable {
    private String desc;
    private String ext;
    private String messageID;
    private String title;

    public String getDesc() {
        return this.desc;
    }

    public String getExt() {
        return this.ext;
    }

    public String getMessageID() {
        return this.messageID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setMessageID(String str) {
        this.messageID = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "TIMPushMessage--->title:" + getTitle() + ", desc:" + getDesc() + ", messageID:" + getMessageID() + " | ext:" + getExt();
    }
}
