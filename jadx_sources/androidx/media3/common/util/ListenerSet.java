package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.FlagSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 1;
    private final Clock clock;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T> iterationFinishedEvent;
    private final CopyOnWriteArraySet<ListenerHolder<T>> listeners;
    private final ArrayDeque<Runnable> queuedEvents;

    @GuardedBy("releasedLock")
    private boolean released;
    private final Object releasedLock;
    private boolean throwsWhenUsingWrongThread;

    public interface Event<T> {
        void invoke(T t11);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t11, FlagSet flagSet);
    }

    public static final class ListenerHolder<T> {
        private FlagSet.Builder flagsBuilder = new FlagSet.Builder();
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public void release(IterationFinishedEvent<T> iterationFinishedEvent) {
            this.released = true;
            if (this.needsIterationFinishedEvent) {
                this.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(this.listener, this.flagsBuilder.build());
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((ListenerHolder) obj).listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        public void invoke(int i11, Event<T> event) {
            if (this.released) {
                return;
            }
            if (i11 != -1) {
                this.flagsBuilder.add(i11);
            }
            this.needsIterationFinishedEvent = true;
            event.invoke(this.listener);
        }

        public void iterationFinished(IterationFinishedEvent<T> iterationFinishedEvent) {
            if (this.released || !this.needsIterationFinishedEvent) {
                return;
            }
            FlagSet flagSetBuild = this.flagsBuilder.build();
            this.flagsBuilder = new FlagSet.Builder();
            this.needsIterationFinishedEvent = false;
            iterationFinishedEvent.invoke(this.listener, flagSetBuild);
        }

        public ListenerHolder(T t11) {
            this.listener = t11;
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent, true);
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    private ListenerSet(CopyOnWriteArraySet<ListenerHolder<T>> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent, boolean z11) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.releasedLock = new Object();
        this.flushingEvents = new ArrayDeque<>();
        this.queuedEvents = new ArrayDeque<>();
        this.handler = clock.createHandler(looper, new Handler.Callback() { // from class: androidx.media3.common.util.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f2890b.handleMessage(message);
            }
        });
        this.throwsWhenUsingWrongThread = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        Iterator<ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.iterationFinishedEvent);
            if (this.handler.hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    private void verifyCurrentThread() {
        if (this.throwsWhenUsingWrongThread) {
            Assertions.checkState(Thread.currentThread() == this.handler.getLooper().getThread());
        }
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        return new ListenerSet<>(this.listeners, looper, clock, iterationFinishedEvent, this.throwsWhenUsingWrongThread);
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z11) {
        this.throwsWhenUsingWrongThread = z11;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2953a(CopyOnWriteArraySet copyOnWriteArraySet, int i11, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).invoke(i11, event);
        }
    }

    public void add(T t11) {
        Assertions.checkNotNull(t11);
        synchronized (this.releasedLock) {
            try {
                if (this.released) {
                    return;
                }
                this.listeners.add(new ListenerHolder<>(t11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clear() {
        verifyCurrentThread();
        Iterator<ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (!this.queuedEvents.isEmpty()) {
            if (!this.handler.hasMessages(1)) {
                HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(1));
            }
            boolean zIsEmpty = this.flushingEvents.isEmpty();
            this.flushingEvents.addAll(this.queuedEvents);
            this.queuedEvents.clear();
            if (zIsEmpty) {
                while (!this.flushingEvents.isEmpty()) {
                    this.flushingEvents.peekFirst().run();
                    this.flushingEvents.removeFirst();
                }
            }
        }
    }

    public void queueEvent(final int i11, final Event<T> event) {
        verifyCurrentThread();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.listeners);
        this.queuedEvents.add(new Runnable() { // from class: androidx.media3.common.util.b
            @Override // java.lang.Runnable
            public final void run() {
                ListenerSet.m2953a(copyOnWriteArraySet, i11, event);
            }
        });
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.releasedLock) {
            this.released = true;
        }
        Iterator<ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
    }

    public void remove(T t11) {
        verifyCurrentThread();
        for (ListenerHolder<T> listenerHolder : this.listeners) {
            if (listenerHolder.listener.equals(t11)) {
                listenerHolder.release(this.iterationFinishedEvent);
                this.listeners.remove(listenerHolder);
            }
        }
    }

    public void sendEvent(int i11, Event<T> event) {
        queueEvent(i11, event);
        flushEvents();
    }

    public int size() {
        verifyCurrentThread();
        return this.listeners.size();
    }
}
