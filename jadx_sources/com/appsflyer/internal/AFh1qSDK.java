package com.appsflyer.internal;

import android.content.Intent;
import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public interface AFh1qSDK {
    @WorkerThread
    void AFAdRevenueData(@NotNull AFh1mSDK aFh1mSDK);

    boolean getCurrencyIso4217Code();

    @WorkerThread
    void getMediationNetwork(@NotNull AFh1mSDK aFh1mSDK);

    void getMonetizationNetwork();

    @WorkerThread
    void getMonetizationNetwork(@NotNull AFf1sSDK aFf1sSDK, @NotNull Function0<Unit> function0);

    void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK);

    boolean getRevenue();

    /* JADX INFO: renamed from: u_ */
    void mo5984u_(@NotNull Intent intent, @NotNull AFa1qSDK aFa1qSDK);
}
