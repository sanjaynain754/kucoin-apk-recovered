package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m12824a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        defaultScheduler.eventStore.persist(transportContext, eventInternal);
        defaultScheduler.workScheduler.schedule(transportContext, 1);
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(new Runnable() { // from class: p8.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.m12825b(this.f95853b, transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12825b(final DefaultScheduler defaultScheduler, final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        defaultScheduler.getClass();
        try {
            TransportBackend transportBackend = defaultScheduler.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String str = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(str);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
            } else {
                final EventInternal eventInternalDecorate = transportBackend.decorate(eventInternal);
                defaultScheduler.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: p8.b
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return DefaultScheduler.m12824a(this.f95857a, transportContext, eventInternalDecorate);
                    }
                });
                transportScheduleCallback.onSchedule(null);
            }
        } catch (Exception e11) {
            LOGGER.warning("Error scheduling event " + e11.getMessage());
            transportScheduleCallback.onSchedule(e11);
        }
    }
}
