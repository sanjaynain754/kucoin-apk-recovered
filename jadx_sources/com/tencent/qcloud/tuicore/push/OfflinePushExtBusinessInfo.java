package com.tencent.qcloud.tuicore.push;

import android.util.Log;
import androidx.annotation.NonNull;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes56.dex */
public class OfflinePushExtBusinessInfo implements Serializable {
    public byte[] customData;
    public int version = 1;
    public int chatType = 1;
    public int action = 1;
    public String sender = "";
    public String nickname = "";
    public String faceUrl = "";
    public String content = "";
    public long sendTime = 0;

    public int getChatAction() {
        return this.action;
    }

    public int getChatType() {
        return this.chatType;
    }

    public byte[] getCustomData() {
        return this.customData;
    }

    public String getCustomDataString() {
        byte[] bArr = this.customData;
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            Log.e(TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getCustomData e = " + e11);
            return "";
        }
    }

    public String getDesc() {
        return this.content;
    }

    public String getFaceUrl() {
        return this.faceUrl;
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public String getSenderId() {
        return this.sender;
    }

    public String getSenderNickName() {
        return this.nickname;
    }

    public int getVersion() {
        return this.version;
    }

    public void setChatAction(int i11) {
        this.action = i11;
    }

    public void setChatType(int i11) {
        this.chatType = i11;
    }

    public void setCustomData(byte[] bArr) {
        this.customData = bArr;
    }

    public void setDesc(String str) {
        this.content = str;
    }

    public void setFaceUrl(String str) {
        this.faceUrl = str;
    }

    public void setSendTime(long j11) {
        this.sendTime = j11;
    }

    public void setSenderId(String str) {
        this.sender = str;
    }

    public void setSenderNickName(String str) {
        this.nickname = str;
    }

    public void setVersion(int i11) {
        this.version = i11;
    }

    @NonNull
    public String toString() {
        return "OfflinePushExtBusinessInfo{version=" + this.version + ", chatType='" + this.chatType + "', action=" + this.action + ", sender=" + this.sender + ", nickname=" + this.nickname + ", faceUrl=" + this.faceUrl + ", content=" + this.content + ", sendTime=" + this.sendTime + ", customData=" + getCustomDataString() + '}';
    }
}
