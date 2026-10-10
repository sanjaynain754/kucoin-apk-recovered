package com.appsflyer.internal;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1tSDK extends AFh1mSDK {
    @Override // com.appsflyer.internal.AFh1mSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @SuppressLint({"VisibleForTests"})
    public AFg1tSDK() {
        super("Register", null, Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1oSDK AFAdRevenueData() {
        return AFe1oSDK.REGISTER;
    }
}
