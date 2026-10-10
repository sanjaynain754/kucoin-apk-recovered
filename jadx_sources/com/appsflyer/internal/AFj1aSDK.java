package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1aSDK implements AFk1ySDK {
    @Override // com.appsflyer.internal.AFk1ySDK
    @NotNull
    public final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getMonetizationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
