package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1gSDK {
    public final long AFAdRevenueData;

    @Nullable
    public final String getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1gSDK)) {
            return false;
        }
        AFi1gSDK aFi1gSDK = (AFi1gSDK) obj;
        return this.AFAdRevenueData == aFi1gSDK.AFAdRevenueData && this.getMonetizationNetwork == aFi1gSDK.getMonetizationNetwork && Intrinsics.areEqual(this.getMediationNetwork, aFi1gSDK.getMediationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1gSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.AFAdRevenueData) * 31) + Long.hashCode(this.getMonetizationNetwork)) * 31;
        String str = this.getMediationNetwork;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.AFAdRevenueData + ", ttrMillis=" + this.getMonetizationNetwork + ", piaToken=" + this.getMediationNetwork + ", errorCode=" + this.getCurrencyIso4217Code + ")";
    }

    public AFi1gSDK(long j11, long j12, @Nullable String str, @Nullable String str2) {
        this.AFAdRevenueData = j11;
        this.getMonetizationNetwork = j12;
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }
}
