package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1pSDK {

    @Nullable
    public final String getCurrencyIso4217Code;

    @NotNull
    public final String getMediationNetwork;

    @Nullable
    public final Intent getRevenue;

    public AFh1pSDK(@NotNull Activity activity, @NotNull AFi1nSDK aFi1nSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        this.getRevenue = activity.getIntent();
        this.getMediationNetwork = aFi1nSDK.AFAdRevenueData(activity);
        this.getCurrencyIso4217Code = aFi1nSDK.getMonetizationNetwork(activity);
    }
}
