package io.reactivex.internal.schedulers;

import androidx.camera.view.C1454t;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    static final String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS;
    static final String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> POOLS = new ConcurrentHashMap();

    public static final class ScheduledTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(SchedulerPoolFactory.POOLS.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static final class PurgeProperties {
        boolean purgeEnable;
        int purgePeriod;

        public void load(Properties properties) {
            if (properties.containsKey(SchedulerPoolFactory.PURGE_ENABLED_KEY)) {
                this.purgeEnable = Boolean.parseBoolean(properties.getProperty(SchedulerPoolFactory.PURGE_ENABLED_KEY));
            } else {
                this.purgeEnable = true;
            }
            if (this.purgeEnable && properties.containsKey(SchedulerPoolFactory.PURGE_PERIOD_SECONDS_KEY)) {
                try {
                    this.purgePeriod = Integer.parseInt(properties.getProperty(SchedulerPoolFactory.PURGE_PERIOD_SECONDS_KEY));
                    return;
                } catch (NumberFormatException unused) {
                    this.purgePeriod = 1;
                    return;
                }
            }
            this.purgePeriod = 1;
        }
    }

    static {
        Properties properties = System.getProperties();
        PurgeProperties purgeProperties = new PurgeProperties();
        purgeProperties.load(properties);
        PURGE_ENABLED = purgeProperties.purgeEnable;
        PURGE_PERIOD_SECONDS = purgeProperties.purgePeriod;
        start();
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    public static void tryPutIntoPool(boolean z11, ScheduledExecutorService scheduledExecutorService) {
        if (z11 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            POOLS.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void tryStart(boolean z11) {
        if (!z11) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE_THREAD;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (C1454t.m2255a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                ScheduledTask scheduledTask = new ScheduledTask();
                int i11 = PURGE_PERIOD_SECONDS;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(scheduledTask, i11, i11, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    private SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }
}
