package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes.dex */
public interface AFe1rSDK {
    @WorkerThread
    void AFAdRevenueData(@NonNull AFe1mSDK<?> aFe1mSDK, @NonNull AFe1qSDK aFe1qSDK);

    @WorkerThread
    void getMonetizationNetwork(@NonNull AFe1mSDK<?> aFe1mSDK);
}
