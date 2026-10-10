package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.getMonetizationNetwork == aFg1ySDK.getMonetizationNetwork && this.AFAdRevenueData == aFg1ySDK.AFAdRevenueData && this.getRevenue == aFg1ySDK.getRevenue && this.getCurrencyIso4217Code == aFg1ySDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getMediationNetwork, aFg1ySDK.getMediationNetwork);
    }

    public AFg1ySDK(int i11, int i12, int i13, int i14, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = i11;
        this.AFAdRevenueData = i12;
        this.getRevenue = i13;
        this.getCurrencyIso4217Code = i14;
        this.getMediationNetwork = str;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.getMonetizationNetwork) * 31) + Integer.hashCode(this.AFAdRevenueData)) * 31) + Integer.hashCode(this.getRevenue)) * 31) + Integer.hashCode(this.getCurrencyIso4217Code)) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getMonetizationNetwork + ", gdprApplies=" + this.AFAdRevenueData + ", cmpSdkId=" + this.getRevenue + ", cmpSdkVersion=" + this.getCurrencyIso4217Code + ", tcString=" + this.getMediationNetwork + ")";
    }
}
