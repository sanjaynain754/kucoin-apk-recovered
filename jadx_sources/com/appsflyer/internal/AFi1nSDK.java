package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1nSDK {
    @NotNull
    String AFAdRevenueData(@Nullable Activity activity);

    @Nullable
    String getMonetizationNetwork(@Nullable Activity activity);

    void getRevenue(@NotNull Activity activity);
}
