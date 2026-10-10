package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "AFExecutors")
public final class AFc1oSDK {

    @NotNull
    private static final Lazy getCurrencyIso4217Code = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1oSDK.5
        @Override // p852kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    @NotNull
    public static final ScheduledExecutorService getCurrencyIso4217Code() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    @NotNull
    public static final ExecutorService getMonetizationNetwork() {
        Object value = getCurrencyIso4217Code.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    @NotNull
    public static final ExecutorService getRevenue() {
        AFc1qSDK aFc1qSDK = new AFc1qSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1qSDK.allowCoreThreadTimeOut(true);
        return aFc1qSDK;
    }

    @NotNull
    public static final ScheduledExecutorService AFAdRevenueData() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }
}
