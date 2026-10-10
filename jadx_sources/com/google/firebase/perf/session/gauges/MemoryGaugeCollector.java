package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p070v1.AndroidMemoryReading;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = -1;
    private static final int UNSET_MEMORY_METRIC_COLLECTION_RATE = -1;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;

    @Nullable
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    @SuppressLint({"ThreadPoolCreation"})
    public MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private synchronized void scheduleMemoryMetricCollectionOnce(final Timer timer) {
        try {
            this.memoryMetricCollectorExecutor.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.i
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.m13838b(this.f12617b, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.warn("Unable to collect Memory Metric: " + e11.getMessage());
        }
    }

    private synchronized void scheduleMemoryMetricCollectionWithRate(long j11, final Timer timer) {
        this.memoryMetricCollectionRateMs = j11;
        try {
            this.memoryMetricCollectorJob = this.memoryMetricCollectorExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.h
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.m13837a(this.f12615b, timer);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.warn("Unable to start collecting Memory Metrics: " + e11.getMessage());
        }
    }

    @VisibleForTesting
    public MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
        this.memoryMetricCollectorExecutor = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.runtime = runtime;
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    public static boolean isInvalidCollectionFrequency(long j11) {
        return j11 <= 0;
    }

    @Nullable
    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(getCurrentUsedAppJavaHeapMemoryKb()).build();
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13837a(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = memoryGaugeCollector.syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            memoryGaugeCollector.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13838b(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = memoryGaugeCollector.syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            memoryGaugeCollector.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    public void collectOnce(Timer timer) {
        scheduleMemoryMetricCollectionOnce(timer);
    }

    public void startCollecting(long j11, Timer timer) {
        if (!isInvalidCollectionFrequency(j11)) {
            if (this.memoryMetricCollectorJob != null) {
                if (this.memoryMetricCollectionRateMs != j11) {
                    stopCollecting();
                    scheduleMemoryMetricCollectionWithRate(j11, timer);
                    return;
                }
                return;
            }
            scheduleMemoryMetricCollectionWithRate(j11, timer);
        }
    }
}
