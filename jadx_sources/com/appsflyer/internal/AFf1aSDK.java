package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1aSDK {

    @JvmField
    public final long AFAdRevenueData;

    @JvmField
    public final boolean getCurrencyIso4217Code;

    @JvmField
    @NotNull
    public final String getMediationNetwork;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFf1aSDK.getMediationNetwork) && this.AFAdRevenueData == aFf1aSDK.AFAdRevenueData && this.getCurrencyIso4217Code == aFf1aSDK.getCurrencyIso4217Code;
    }

    public AFf1aSDK(@NotNull String str, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMediationNetwork = str;
        this.AFAdRevenueData = j11;
        this.getCurrencyIso4217Code = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iHashCode = ((this.getMediationNetwork.hashCode() * 31) + Long.hashCode(this.AFAdRevenueData)) * 31;
        boolean z11 = this.getCurrencyIso4217Code;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.getMediationNetwork + ", receivedTime=" + this.AFAdRevenueData + ", isQueued=" + this.getCurrencyIso4217Code + ")";
    }
}
