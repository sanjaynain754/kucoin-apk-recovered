package com.tencent.imsdk.relationship;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class ReceiveMessageOptInfo implements Serializable {
    private long duration;
    private int receiveMessageOpt;
    private int startHour;
    private int startMinute;
    private int startSecond;
    private long startTimeStamp;
    private String userID;

    public long getDuration() {
        return this.duration;
    }

    public int getReceiveMessageOpt() {
        return this.receiveMessageOpt;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMinute() {
        return this.startMinute;
    }

    public int getStartSecond() {
        return this.startSecond;
    }

    public long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setReceiveMessageOpt(int i11) {
        this.receiveMessageOpt = i11;
    }

    public void setUserID(String str) {
        this.userID = str;
    }
}
