package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class AFi1vSDK {

    @Nullable
    public final String AFAdRevenueData;

    @Nullable
    public final AFi1xSDK areAllFieldsValid;

    @Nullable
    public final Throwable component1;

    @Nullable
    public final String component4;
    public final int getCurrencyIso4217Code;
    public final long getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1vSDK(@Nullable String str, @NonNull String str2, long j11, long j12, int i11, @Nullable AFi1xSDK aFi1xSDK, @Nullable String str3, Throwable th2) {
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getMediationNetwork = j11;
        this.getRevenue = j12;
        this.getCurrencyIso4217Code = i11;
        this.areAllFieldsValid = aFi1xSDK;
        this.component4 = str3;
        this.component1 = th2;
    }
}
