package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m12837a(WorkInitializer workInitializer) {
        Iterator<TransportContext> it = workInitializer.store.loadActiveContexts().iterator();
        while (it.hasNext()) {
            workInitializer.scheduler.schedule(it.next(), 1);
        }
        return null;
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // java.lang.Runnable
            public final void run() {
                WorkInitializer workInitializer = this.f11643b;
                workInitializer.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return WorkInitializer.m12837a(workInitializer);
                    }
                });
            }
        });
    }

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }
}
