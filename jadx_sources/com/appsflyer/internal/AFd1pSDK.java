package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getMonetizationNetwork(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1zSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1zSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1rSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> revenue = AFd1rSDK.getRevenue(str2);
        if (mediationNetwork2 != -1 && currencyIso4217Code == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (revenue != null) {
            return revenue.getFirst().intValue() <= mediationNetwork && mediationNetwork <= revenue.getSecond().intValue();
        }
        return currencyIso4217Code != null && currencyIso4217Code.getFirst().intValue() <= mediationNetwork && mediationNetwork <= currencyIso4217Code.getSecond().intValue();
    }
}
