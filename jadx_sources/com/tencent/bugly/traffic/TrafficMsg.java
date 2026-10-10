package com.tencent.bugly.traffic;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class TrafficMsg {
    public String mCollectType;
    public int mFore;
    public String mHost;
    public long mId;
    public int mNet;
    public int mRx;
    public long mTime;
    public int mTx;

    public TrafficMsg() {
        this.mCollectType = "auto";
    }

    public TrafficMsg(String str, int i11, int i12, int i13, int i14, long j11, long j12) {
        this.mHost = str;
        this.mRx = i11;
        this.mTx = i12;
        this.mNet = i13;
        this.mFore = i14;
        this.mTime = j11;
        this.mCollectType = "auto";
        this.mId = j12;
    }

    public TrafficMsg(TrafficMsg trafficMsg) {
        this.mCollectType = "auto";
        this.mHost = trafficMsg.mHost;
        this.mRx = trafficMsg.mRx;
        this.mTx = trafficMsg.mTx;
        this.mNet = trafficMsg.mNet;
        this.mFore = trafficMsg.mFore;
        this.mTime = trafficMsg.mTime;
        this.mCollectType = trafficMsg.mCollectType;
    }
}
