package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1zSDK {
    @NonNull
    AFd1mSDK AFAdRevenueData();

    @NonNull
    AFc1fSDK AFInAppEventParameterName();

    @NonNull
    AFc1tSDK AFInAppEventType();

    @NonNull
    AFf1fSDK AFKeystoreWrapper();

    @NonNull
    AFj1sSDK AFLogger();

    @NonNull
    AFf1dSDK afDebugLog();

    @Nullable
    @WorkerThread
    AFi1fSDK afErrorLog();

    @NonNull
    AFd1uSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFb1bSDK afInfoLog();

    @NonNull
    AFb1gSDK afLogForce();

    @Nullable
    AFh1qSDK afRDLog();

    @NonNull
    AFa1jSDK afWarnLog();

    @NonNull
    AFf1iSDK areAllFieldsValid();

    @NonNull
    PurchaseHandler component1();

    @NonNull
    AFg1pSDK component2();

    @NonNull
    AFh1tSDK component3();

    @NonNull
    AFc1pSDK component4();

    @NonNull
    AFd1kSDK copy();

    @NonNull
    AFj1nSDK copydefault();

    @NonNull
    /* JADX INFO: renamed from: d */
    AFi1rSDK mo5946d();

    @NonNull
    /* JADX INFO: renamed from: e */
    AFa1qSDK mo5947e();

    @NonNull
    AFe1nSDK equals();

    @NonNull
    AFg1aSDK force();

    @NonNull
    AFc1kSDK getCurrencyIso4217Code();

    @NonNull
    AFe1uSDK getMediationNetwork();

    @NonNull
    ExecutorService getMonetizationNetwork();

    @NonNull
    ScheduledExecutorService getRevenue();

    @NonNull
    /* JADX INFO: renamed from: i */
    AFi1nSDK mo5948i();

    @NonNull
    AFe1vSDK registerClient();

    @NonNull
    AFi1mSDK unregisterClient();

    @NonNull
    /* JADX INFO: renamed from: v */
    AFc1iSDK mo5949v();

    @NonNull
    /* JADX INFO: renamed from: w */
    AFa1aSDK mo5950w();
}
