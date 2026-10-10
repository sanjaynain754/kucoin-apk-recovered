package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p070v1.CpuMetricReading;
import com.google.firebase.perf.util.Timer;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
public class CpuGaugeCollector {
    private static final int CSTIME_POSITION_IN_PROC_PID_STAT = 16;
    private static final int CUTIME_POSITION_IN_PROC_PID_STAT = 15;
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = -1;
    private static final int INVALID_SC_PER_CPU_CLOCK_TICK = -1;
    private static final int STIME_POSITION_IN_PROC_PID_STAT = 14;
    private static final int UNSET_CPU_METRIC_COLLECTION_RATE = -1;
    private static final int UTIME_POSITION_IN_PROC_PID_STAT = 13;
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs;
    private final ScheduledExecutorService cpuMetricCollectorExecutor;

    @Nullable
    private ScheduledFuture cpuMetricCollectorJob;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings;
    private final String procFileName;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final long MICROSECONDS_PER_SECOND = TimeUnit.SECONDS.toMicros(1);

    @SuppressLint({"ThreadPoolCreation"})
    public CpuGaugeCollector() {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = Executors.newSingleThreadScheduledExecutor();
        this.procFileName = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
        this.clockTicksPerSecond = getClockTicksPerSecond();
    }

    private long convertClockTicksToMicroseconds(long j11) {
        return Math.round((j11 / this.clockTicksPerSecond) * MICROSECONDS_PER_SECOND);
    }

    private synchronized void scheduleCpuMetricCollectionOnce(final Timer timer) {
        try {
            this.cpuMetricCollectorExecutor.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    CpuGaugeCollector.m13832b(this.f12607b, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.warn("Unable to collect Cpu Metric: " + e11.getMessage());
        }
    }

    private synchronized void scheduleCpuMetricCollectionWithRate(long j11, final Timer timer) {
        this.cpuMetricCollectionRateMs = j11;
        try {
            this.cpuMetricCollectorJob = this.cpuMetricCollectorExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    CpuGaugeCollector.m13831a(this.f12605b, timer);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.warn("Unable to start collecting Cpu Metrics: " + e11.getMessage());
        }
    }

    @Nullable
    private CpuMetricReading syncCollectCpuMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.procFileName));
            try {
                long currentTimestampMicros = timer.getCurrentTimestampMicros();
                String[] strArrSplit = bufferedReader.readLine().split(C33627eb.f69716f);
                CpuMetricReading cpuMetricReadingBuild = CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).setUserTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return cpuMetricReadingBuild;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            logger.warn("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            e = e12;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e14) {
            e = e14;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    private long getClockTicksPerSecond() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean isInvalidCollectionFrequency(long j11) {
        return j11 <= 0;
    }

    public void startCollecting(long j11, Timer timer) {
        long j12 = this.clockTicksPerSecond;
        if (j12 == -1 || j12 == 0 || isInvalidCollectionFrequency(j11)) {
            return;
        }
        if (this.cpuMetricCollectorJob == null) {
            scheduleCpuMetricCollectionWithRate(j11, timer);
        } else if (this.cpuMetricCollectionRateMs != j11) {
            stopCollecting();
            scheduleCpuMetricCollectionWithRate(j11, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13831a(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = cpuGaugeCollector.syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            cpuGaugeCollector.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13832b(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = cpuGaugeCollector.syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            cpuGaugeCollector.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    public void collectOnce(Timer timer) {
        scheduleCpuMetricCollectionOnce(timer);
    }

    @VisibleForTesting
    public CpuGaugeCollector(ScheduledExecutorService scheduledExecutorService, String str, long j11) {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = scheduledExecutorService;
        this.procFileName = str;
        this.clockTicksPerSecond = j11;
    }
}
