package com.kubi.data.entity;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class CheckCodeResultEntity {
    private String checkResult;
    private int failedCount;
    private String fingerprintPwd;
    private int maxFailedCount;
    private String validationType;

    public int getFailedCount() {
        return this.failedCount;
    }

    public String getFingerprintPwd() {
        return this.fingerprintPwd;
    }

    public int getMaxFailedCount() {
        return this.maxFailedCount;
    }

    public String getValidationType() {
        return this.validationType;
    }

    public String isCheckResult() {
        return this.checkResult;
    }

    public void setCheckResult(String str) {
        this.checkResult = str;
    }

    public void setFailedCount(int i11) {
        this.failedCount = i11;
    }

    public void setFingerprintPwd(String str) {
        this.fingerprintPwd = str;
    }

    public void setMaxFailedCount(int i11) {
        this.maxFailedCount = i11;
    }

    public void setValidationType(String str) {
        this.validationType = str;
    }
}
