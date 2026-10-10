package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1kSDK implements AFi1nSDK {

    @Nullable
    private String AFAdRevenueData;

    private static String getCurrencyIso4217Code(Activity activity) {
        Uri uriM5942k_ = AFb1tSDK.m5942k_(activity != null ? activity.getIntent() : null);
        String string = uriM5942k_ != null ? uriM5942k_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (getMediationNetwork(string)) {
            return null;
        }
        return string;
    }

    private static boolean getMediationNetwork(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    @NotNull
    public final String AFAdRevenueData(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    @Nullable
    public final String getMonetizationNetwork(@Nullable Activity activity) {
        String str = this.AFAdRevenueData;
        this.AFAdRevenueData = null;
        return (str == null || str.length() == 0) ? getCurrencyIso4217Code(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    public final void getRevenue(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFAdRevenueData;
        if (str == null || str.length() == 0) {
            this.AFAdRevenueData = getCurrencyIso4217Code(activity);
        }
    }
}
