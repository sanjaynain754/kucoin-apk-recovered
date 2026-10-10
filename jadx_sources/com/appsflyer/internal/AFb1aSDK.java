package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1aSDK implements AFb1bSDK {

    @Nullable
    private AFb1kSDK AFAdRevenueData;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    private final AFi1nSDK getMonetizationNetwork;

    @NotNull
    private final AFa1qSDK getRevenue;

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getCurrencyIso4217Code(@NotNull Context context, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFAdRevenueData != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFb1kSDK aFb1kSDK = new AFb1kSDK(this.getMediationNetwork, this.getRevenue, this.getMonetizationNetwork, aFa1zSDK);
        this.AFAdRevenueData = aFb1kSDK;
        if (context instanceof Activity) {
            aFb1kSDK.onActivityResumed((Activity) context);
        }
        Application applicationM5999O_ = AFj1jSDK.m5999O_(context);
        if (applicationM5999O_ != null) {
            applicationM5999O_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }

    public AFb1aSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1qSDK aFa1qSDK, @NotNull AFi1nSDK aFi1nSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        this.getMediationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1qSDK;
        this.getMonetizationNetwork = aFi1nSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getMediationNetwork() {
        return this.AFAdRevenueData != null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getCurrencyIso4217Code() {
        AFb1bSDK.AFa1zSDK aFa1zSDK;
        AFb1kSDK aFb1kSDK = this.AFAdRevenueData;
        if (aFb1kSDK == null || (aFa1zSDK = aFb1kSDK.AFAdRevenueData) == null) {
            return;
        }
        aFa1zSDK.getRevenue();
    }
}
