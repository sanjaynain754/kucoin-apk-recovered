package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class AFb1kSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    final AFb1bSDK.AFa1zSDK AFAdRevenueData;

    @NotNull
    private final Runnable areAllFieldsValid;

    @Nullable
    private ScheduledFuture<?> component1;

    @NotNull
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private volatile boolean getMediationNetwork;

    @NotNull
    private final AFa1qSDK getMonetizationNetwork;

    @NotNull
    private final AFi1nSDK getRevenue;

    public AFb1kSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1qSDK aFa1qSDK, @NotNull AFi1nSDK aFi1nSDK, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1qSDK;
        this.getRevenue = aFi1nSDK;
        this.AFAdRevenueData = aFa1zSDK;
        this.areAllFieldsValid = new Runnable() { // from class: com.appsflyer.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.getRevenue(this.f6339b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1kSDK aFb1kSDK, AFh1pSDK aFh1pSDK) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        try {
            Result.Companion companion = Result.INSTANCE;
            aFb1kSDK.AFAdRevenueData.getMonetizationNetwork(aFh1pSDK);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", thM103847exceptionOrNullimpl, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFb1kSDK aFb1kSDK) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        aFb1kSDK.getMediationNetwork = false;
        try {
            Result.Companion companion = Result.INSTANCE;
            aFb1kSDK.AFAdRevenueData.getRevenue();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", thM103847exceptionOrNullimpl);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1qSDK aFa1qSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1qSDK.getMediationNetwork) {
            aFa1qSDK.getMediationNetwork = intent;
        }
        this.getRevenue.getRevenue(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.getMediationNetwork) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.areAllFieldsValid;
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            this.component1 = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.getMediationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.getMediationNetwork) {
            this.getMediationNetwork = true;
            final AFh1pSDK aFh1pSDK = new AFh1pSDK(activity, this.getRevenue);
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1kSDK.getMediationNetwork(this.f6337b, aFh1pSDK);
                }
            });
        } else {
            ScheduledFuture<?> scheduledFuture = this.component1;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
