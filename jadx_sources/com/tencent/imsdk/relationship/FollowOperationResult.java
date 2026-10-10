package com.tencent.imsdk.relationship;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class FollowOperationResult implements Serializable {
    private int resultCode;
    private String resultInfo;
    private String userID;

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public String getUserID() {
        return this.userID;
    }
}
