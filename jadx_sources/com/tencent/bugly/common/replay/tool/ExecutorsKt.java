package com.tencent.bugly.common.replay.tool;

import android.annotation.SuppressLint;
import com.tencent.bugly.common.replay.tool.ExecutorsKt;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a:\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u001a\"\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011*\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"shutdownTimeoutMillis", "", "gracefullyShutdown", "", "Ljava/util/concurrent/ExecutorService;", "scheduleAtFixedRateSafely", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "taskName", "", "initialDelay", "period", "unit", "Ljava/util/concurrent/TimeUnit;", "task", "Ljava/lang/Runnable;", "submitSafely", "Ljava/util/concurrent/Future;", "bugly-pro_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ExecutorsKt {
    private static final long shutdownTimeoutMillis = 2000;

    public static final void gracefullyShutdown(@NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
                if (!executorService.awaitTermination(2000L, TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    @Nullable
    public static final ScheduledFuture<?> scheduleAtFixedRateSafely(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull final String taskName, long j11, long j12, @NotNull TimeUnit unit, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "<this>");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: cc0.b
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.m103816scheduleAtFixedRateSafely$lambda2(task, taskName);
                }
            }, j11, j12, unit);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("Failed to schedule task " + taskName, th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scheduleAtFixedRateSafely$lambda-2, reason: not valid java name */
    public static final void m103816scheduleAtFixedRateSafely$lambda2(Runnable task, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("Failed to execute task " + taskName, th2);
        }
    }

    @Nullable
    public static final Future<?> submitSafely(@NotNull ExecutorService executorService, @NotNull final String taskName, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return executorService.submit(new Runnable() { // from class: cc0.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.m103817submitSafely$lambda1(task, taskName);
                }
            });
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submitSafely$lambda-1, reason: not valid java name */
    public static final void m103817submitSafely$lambda1(Runnable task, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("Failed to execute task " + taskName, th2);
        }
    }
}
