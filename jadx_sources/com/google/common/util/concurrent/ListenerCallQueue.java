package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
final class ListenerCallQueue<L> {
    private static final LazyLogger logger = new LazyLogger(ListenerCallQueue.class);
    private final List<PerListenerQueue<L>> listeners = Collections.synchronizedList(new ArrayList());

    public interface Event<L> {
        void call(L l11);
    }

    public void dispatch() throws Exception {
        for (int i11 = 0; i11 < this.listeners.size(); i11++) {
            this.listeners.get(i11).dispatch();
        }
    }

    public void enqueue(Event<L> event) {
        enqueueHelper(event, event);
    }

    public static final class PerListenerQueue<L> implements Runnable {
        final Executor executor;

        @GuardedBy("this")
        boolean isThreadScheduled;
        final L listener;

        @GuardedBy("this")
        final Queue<Event<L>> waitQueue = Queues.newArrayDeque();

        @GuardedBy("this")
        final Queue<Object> labelQueue = Queues.newArrayDeque();

        public synchronized void add(Event<L> event, Object obj) {
            this.waitQueue.add(event);
            this.labelQueue.add(obj);
        }

        public void dispatch() throws Exception {
            boolean z11;
            synchronized (this) {
                try {
                    if (this.isThreadScheduled) {
                        z11 = false;
                    } else {
                        z11 = true;
                        this.isThreadScheduled = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                try {
                    this.executor.execute(this);
                } catch (Exception e11) {
                    synchronized (this) {
                        this.isThreadScheduled = false;
                        ListenerCallQueue.logger.get().log(Level.SEVERE, "Exception while running callbacks for " + this.listener + " on " + this.executor, (Throwable) e11);
                        throw e11;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
        /* JADX WARN: Code duplicated, block: B:28:0x0062  */
        /* JADX WARN: Code duplicated, block: B:38:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.call(r9.listener);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            com.google.common.util.concurrent.ListenerCallQueue.logger.get().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.listener + com.tencent.bugly.proguard.C33627eb.f69716f + r3, (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws Throwable {
            boolean z11;
            Throwable th2;
            while (true) {
                boolean z12 = true;
                try {
                    synchronized (this) {
                        try {
                            Preconditions.checkState(this.isThreadScheduled);
                            Event<L> eventPoll = this.waitQueue.poll();
                            Object objPoll = this.labelQueue.poll();
                            if (eventPoll == null) {
                                this.isThreadScheduled = false;
                                try {
                                    return;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    z11 = false;
                                }
                            }
                        } catch (Throwable th4) {
                            z11 = true;
                            th2 = th4;
                        }
                        while (true) {
                        }
                    }
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        boolean z13 = z11;
                        th = th5;
                        z12 = z13;
                        if (z12) {
                            synchronized (this) {
                                this.isThreadScheduled = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (z12) {
                        synchronized (this) {
                            this.isThreadScheduled = false;
                        }
                    }
                    throw th;
                }
            }
        }

        public PerListenerQueue(L l11, Executor executor) {
            this.listener = (L) Preconditions.checkNotNull(l11);
            this.executor = (Executor) Preconditions.checkNotNull(executor);
        }
    }

    private void enqueueHelper(Event<L> event, Object obj) {
        Preconditions.checkNotNull(event, "event");
        Preconditions.checkNotNull(obj, Constants.ScionAnalytics.PARAM_LABEL);
        synchronized (this.listeners) {
            try {
                Iterator<PerListenerQueue<L>> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().add(event, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addListener(L l11, Executor executor) {
        Preconditions.checkNotNull(l11, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkNotNull(executor, "executor");
        this.listeners.add(new PerListenerQueue<>(l11, executor));
    }

    public void enqueue(Event<L> event, String str) {
        enqueueHelper(event, str);
    }
}
