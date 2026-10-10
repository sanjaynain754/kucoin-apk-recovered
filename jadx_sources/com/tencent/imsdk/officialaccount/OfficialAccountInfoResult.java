package com.tencent.imsdk.officialaccount;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class OfficialAccountInfoResult implements Serializable {
    private int errorCode;
    private String errorMessage;
    private String officialAccountID;
    private OfficialAccountInfo officialAccountInfo;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getOfficialAccountID() {
        return this.officialAccountID;
    }

    public OfficialAccountInfo getOfficialAccountInfo() {
        return this.officialAccountInfo;
    }
}
