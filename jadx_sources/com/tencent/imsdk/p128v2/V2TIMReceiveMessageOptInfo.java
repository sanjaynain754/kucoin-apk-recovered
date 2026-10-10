package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.ReceiveMessageOptInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMReceiveMessageOptInfo implements Serializable {
    private ReceiveMessageOptInfo receiveMessageOptInfo = new ReceiveMessageOptInfo();

    public int getAllReceiveMessageOpt() {
        int receiveMessageOpt = this.receiveMessageOptInfo.getReceiveMessageOpt();
        if (receiveMessageOpt == 1) {
            return 0;
        }
        if (receiveMessageOpt == 3) {
            return 2;
        }
        return receiveMessageOpt == 3 ? 3 : 0;
    }

    public int getC2CReceiveMessageOpt() {
        int receiveMessageOpt = this.receiveMessageOptInfo.getReceiveMessageOpt();
        if (receiveMessageOpt == 1) {
            return 0;
        }
        if (receiveMessageOpt == 2) {
            return 1;
        }
        return receiveMessageOpt == 3 ? 2 : 0;
    }

    public long getDuration() {
        return this.receiveMessageOptInfo.getDuration();
    }

    public ReceiveMessageOptInfo getReceiveMessageOptInfo() {
        return this.receiveMessageOptInfo;
    }

    public int getStartHour() {
        return this.receiveMessageOptInfo.getStartHour();
    }

    public int getStartMinute() {
        return this.receiveMessageOptInfo.getStartMinute();
    }

    public int getStartSecond() {
        return this.receiveMessageOptInfo.getStartSecond();
    }

    public long getStartTimeStamp() {
        return this.receiveMessageOptInfo.getStartTimeStamp();
    }

    public String getUserID() {
        return this.receiveMessageOptInfo.getUserID();
    }

    public void setC2CReceiveMessageOpt(int i11) {
        this.receiveMessageOptInfo.setReceiveMessageOpt(i11);
    }

    public void setReceiveMessageOptInfo(ReceiveMessageOptInfo receiveMessageOptInfo) {
        this.receiveMessageOptInfo = receiveMessageOptInfo;
    }

    public void setUserID(String str) {
        this.receiveMessageOptInfo.setUserID(str);
    }
}
