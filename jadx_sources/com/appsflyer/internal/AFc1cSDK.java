package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1cSDK {
    @WorkerThread
    int AFAdRevenueData();

    @WorkerThread
    boolean getMediationNetwork();

    @WorkerThread
    @Nullable
    String getMonetizationNetwork(@NotNull Throwable th2, @NotNull String str);

    @WorkerThread
    void getMonetizationNetwork(int i11, int i12);

    @WorkerThread
    @NotNull
    List<ExceptionInfo> getRevenue();

    @WorkerThread
    boolean getRevenue(@NotNull String... strArr);
}
