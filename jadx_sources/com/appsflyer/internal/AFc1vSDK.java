package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFc1vSDK {

    @NotNull
    final String AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final List<AFe1oSDK> getMonetizationNetwork;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1vSDK)) {
            return false;
        }
        AFc1vSDK aFc1vSDK = (AFc1vSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFc1vSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1vSDK.getMonetizationNetwork) && this.getCurrencyIso4217Code == aFc1vSDK.getCurrencyIso4217Code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1vSDK(@NotNull String str, @NotNull List<? extends AFe1oSDK> list, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = list;
        this.getCurrencyIso4217Code = i11;
    }

    public final int hashCode() {
        return (((this.AFAdRevenueData.hashCode() * 31) + this.getMonetizationNetwork.hashCode()) * 31) + Integer.hashCode(this.getCurrencyIso4217Code);
    }

    @NotNull
    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.AFAdRevenueData + ", eventTypes=" + this.getMonetizationNetwork + ", maxCapacity=" + this.getCurrencyIso4217Code + ")";
    }
}
