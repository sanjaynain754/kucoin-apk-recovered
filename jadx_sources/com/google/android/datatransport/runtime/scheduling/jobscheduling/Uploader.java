package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class Uploader {
    private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final ClientHealthMetricsStore clientHealthMetricsStore;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final Clock uptimeClock;
    private final WorkScheduler workScheduler;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m12829b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j11) {
        uploader.eventStore.recordFailure(iterable);
        uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + j11);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m12830c(Uploader uploader) {
        uploader.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m12832e(Uploader uploader, Iterable iterable) {
        uploader.eventStore.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m12833f(Uploader uploader, TransportContext transportContext, int i11) {
        uploader.workScheduler.schedule(transportContext, i11 + 1);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m12834g(Uploader uploader, TransportContext transportContext, long j11) {
        uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + j11);
        return null;
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.guard;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new EncodedPayload(Encoding.m12812of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return clientHealthMetricsStore.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @CanIgnoreReturnValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i11) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        BackendResponse backendResponseM12816ok = BackendResponse.m12816ok(0L);
        final long j11 = 0;
        while (((Boolean) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return Boolean.valueOf(this.f11630a.eventStore.hasPendingEventsFor(transportContext));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return this.f11632a.eventStore.loadBatch(transportContext);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseM12816ok;
            }
            if (transportBackend == null) {
                Logging.m12818d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).getEvent());
                }
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    arrayList.add(createMetricsEvent(transportBackend));
                }
                backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            backendResponseM12816ok = backendResponseSend;
            if (backendResponseM12816ok.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                final TransportContext transportContext2 = transportContext;
                this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m12829b(this.f11634a, iterable, transportContext2, j11);
                    }
                });
                this.workScheduler.schedule(transportContext2, i11 + 1, true);
                return backendResponseM12816ok;
            }
            TransportContext transportContext3 = transportContext;
            this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Uploader.m12832e(this.f11638a, iterable);
                }
            });
            if (backendResponseM12816ok.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j11, backendResponseM12816ok.getNextRequestWaitMillis());
                if (transportContext3.shouldUploadClientHealthMetrics()) {
                    this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.m12830c(this.f11640a);
                        }
                    });
                }
                j11 = jMax;
            } else if (backendResponseM12816ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m12835h(this.f11641a, map);
                    }
                });
            }
            transportContext = transportContext3;
        }
        final TransportContext transportContext4 = transportContext;
        this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return Uploader.m12834g(this.f11619a, transportContext4, j11);
            }
        });
        return backendResponseM12816ok;
    }

    public void upload(final TransportContext transportContext, final int i11, final Runnable runnable) {
        this.executor.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
            @Override // java.lang.Runnable
            public final void run() {
                Uploader.m12836i(this.f11625b, transportContext, i11, runnable);
            }
        });
    }

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m12835h(Uploader uploader, Map map) {
        uploader.getClass();
        for (Map.Entry entry : map.entrySet()) {
            uploader.clientHealthMetricsStore.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m12836i(final Uploader uploader, final TransportContext transportContext, final int i11, Runnable runnable) {
        uploader.getClass();
        try {
            SynchronizationGuard synchronizationGuard = uploader.guard;
            final EventStore eventStore = uploader.eventStore;
            Objects.requireNonNull(eventStore);
            synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Integer.valueOf(eventStore.cleanUp());
                }
            });
            if (!uploader.isNetworkAvailable()) {
                uploader.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m12833f(this.f11622a, transportContext, i11);
                    }
                });
            } else {
                uploader.logAndUpdateState(transportContext, i11);
            }
        } catch (SynchronizationException unused) {
            uploader.workScheduler.schedule(transportContext, i11 + 1);
        } finally {
            runnable.run();
        }
    }
}
