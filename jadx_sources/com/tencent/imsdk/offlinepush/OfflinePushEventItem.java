package com.tencent.imsdk.offlinepush;

/* JADX INFO: loaded from: classes59.dex */
public class OfflinePushEventItem {
    private long eventTime;
    private int eventType;

    /* JADX INFO: renamed from: id */
    private int f73267id;
    private String pushId;
    private int status = 0;

    public long getEventTime() {
        return this.eventTime;
    }

    public int getEventType() {
        return this.eventType;
    }

    public int getId() {
        return this.f73267id;
    }

    public String getPushId() {
        return this.pushId;
    }

    public int getStatus() {
        return this.status;
    }

    public void setEventTime(long j11) {
        this.eventTime = j11;
    }

    public void setEventType(int i11) {
        this.eventType = i11;
    }

    public void setId(int i11) {
        this.f73267id = i11;
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    public void setStatus(int i11) {
        this.status = i11;
    }

    public String toString() {
        return "OfflinePushEventItem{id=" + this.f73267id + ", eventType=" + this.eventType + ", eventTime=" + this.eventTime + ", pushId=" + this.pushId + ", status=" + this.status + "}";
    }
}
