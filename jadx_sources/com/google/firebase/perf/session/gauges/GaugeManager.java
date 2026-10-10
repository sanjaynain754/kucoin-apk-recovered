package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p070v1.ApplicationProcessState;
import com.google.firebase.perf.p070v1.GaugeMetadata;
import com.google.firebase.perf.p070v1.GaugeMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final ConfigResolver configResolver;
    private final Lazy<CpuGaugeCollector> cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final Lazy<ScheduledExecutorService> gaugeManagerExecutor;

    @Nullable
    private GaugeMetadataManager gaugeMetadataManager;
    private final Lazy<MemoryGaugeCollector> memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final TransportManager transportManager;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new Lazy(new Provider() { // from class: com.google.firebase.perf.session.gauges.e
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), TransportManager.getInstance(), ConfigResolver.getInstance(), null, new Lazy(new Provider() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return GaugeManager.m13835c();
            }
        }), new Lazy(new Provider() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return GaugeManager.m13834b();
            }
        }));
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void startCollectingGauges(PerfSession perfSession, final ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.getTimer());
        if (jStartCollectingGauges == -1) {
            logger.warn("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strSessionId = perfSession.sessionId();
        this.sessionId = strSessionId;
        this.applicationProcessState = applicationProcessState;
        try {
            long j11 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12612b.syncFlush(strSessionId, applicationProcessState);
                }
            }, j11, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.warn("Unable to start collecting Gauges: " + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.session.gauges.GaugeManager$1 */
    /* JADX INFO: loaded from: classes56.dex */
    public static /* synthetic */ class C87891 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState;

        static {
            int[] iArr = new int[ApplicationProcessState.values().length];
            $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState = iArr;
            try {
                iArr[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MemoryGaugeCollector m13834b() {
        return new MemoryGaugeCollector();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ CpuGaugeCollector m13835c() {
        return new CpuGaugeCollector();
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        cpuGaugeCollector.collectOnce(timer);
        memoryGaugeCollector.collectOnce(timer);
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long sessionsCpuCaptureFrequencyBackgroundMs;
        int i11 = C87891.$SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState[applicationProcessState.ordinal()];
        if (i11 != 1) {
            sessionsCpuCaptureFrequencyBackgroundMs = i11 != 2 ? -1L : this.configResolver.getSessionsCpuCaptureFrequencyForegroundMs();
        } else {
            sessionsCpuCaptureFrequencyBackgroundMs = this.configResolver.getSessionsCpuCaptureFrequencyBackgroundMs();
        }
        if (CpuGaugeCollector.isInvalidCollectionFrequency(sessionsCpuCaptureFrequencyBackgroundMs)) {
            return -1L;
        }
        return sessionsCpuCaptureFrequencyBackgroundMs;
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long sessionsMemoryCaptureFrequencyBackgroundMs;
        int i11 = C87891.$SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState[applicationProcessState.ordinal()];
        if (i11 != 1) {
            sessionsMemoryCaptureFrequencyBackgroundMs = i11 != 2 ? -1L : this.configResolver.getSessionsMemoryCaptureFrequencyForegroundMs();
        } else {
            sessionsMemoryCaptureFrequencyBackgroundMs = this.configResolver.getSessionsMemoryCaptureFrequencyBackgroundMs();
        }
        if (MemoryGaugeCollector.isInvalidCollectionFrequency(sessionsMemoryCaptureFrequencyBackgroundMs)) {
            return -1L;
        }
        return sessionsMemoryCaptureFrequencyBackgroundMs;
    }

    private boolean startCollectingCpuMetrics(long j11, Timer timer) {
        if (j11 == -1) {
            logger.debug("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().startCollecting(j11, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j11, Timer timer) {
        if (j11 == -1) {
            logger.debug("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().startCollecting(j11, timer);
        return true;
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new GaugeMetadataManager(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.log(GaugeMetric.newBuilder().setSessionId(str).setGaugeMetadata(getGaugeMetadata()).build(), applicationProcessState);
        return true;
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final ApplicationProcessState applicationProcessState = this.applicationProcessState;
        this.cpuGaugeCollector.get().stopCollecting();
        this.memoryGaugeCollector.get().stopCollecting();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f12609b.syncFlush(str, applicationProcessState);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private GaugeMetadata getGaugeMetadata() {
        return GaugeMetadata.newBuilder().setDeviceRamSizeKb(this.gaugeMetadataManager.getDeviceRamSizeKb()).setMaxAppJavaHeapMemoryKb(this.gaugeMetadataManager.getMaxAppJavaHeapMemoryKb()).setMaxEncouragedAppJavaHeapMemoryKb(this.gaugeMetadataManager.getMaxEncouragedAppJavaHeapMemoryKb()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncFlush(String str, ApplicationProcessState applicationProcessState) {
        GaugeMetric.Builder builderNewBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().cpuMetricReadings.isEmpty()) {
            builderNewBuilder.addCpuMetricReadings(this.cpuGaugeCollector.get().cpuMetricReadings.poll());
        }
        while (!this.memoryGaugeCollector.get().memoryMetricReadings.isEmpty()) {
            builderNewBuilder.addAndroidMemoryReadings(this.memoryGaugeCollector.get().memoryMetricReadings.poll());
        }
        builderNewBuilder.setSessionId(str);
        this.transportManager.log(builderNewBuilder.build(), applicationProcessState);
    }

    @VisibleForTesting
    public GaugeManager(Lazy<ScheduledExecutorService> lazy, TransportManager transportManager, ConfigResolver configResolver, GaugeMetadataManager gaugeMetadataManager, Lazy<CpuGaugeCollector> lazy2, Lazy<MemoryGaugeCollector> lazy3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lazy;
        this.transportManager = transportManager;
        this.configResolver = configResolver;
        this.gaugeMetadataManager = gaugeMetadataManager;
        this.cpuGaugeCollector = lazy2;
        this.memoryGaugeCollector = lazy3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
