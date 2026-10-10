package io.reactivex.subscribers;

import androidx.camera.view.C1454t;
import com.google.api.client.googleapis.notifications.ResourceStates;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, InterfaceC44418d, Disposable {
    private volatile boolean cancelled;
    private final InterfaceC44417c<? super T> downstream;
    private final AtomicLong missedRequested;

    /* JADX INFO: renamed from: qs */
    private QueueSubscription<T> f87225qs;
    private final AtomicReference<InterfaceC44418d> upstream;

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public TestSubscriber(long j11) {
        this(EmptySubscriber.INSTANCE, j11);
    }

    public static <T> TestSubscriber<T> create(long j11) {
        return new TestSubscriber<>(j11);
    }

    public static String fusionModeToString(int i11) {
        if (i11 == 0) {
            return "NONE";
        }
        if (i11 == 1) {
            return ResourceStates.SYNC;
        }
        if (i11 == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i11 + ")";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.f87225qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i11) {
        int i12 = this.establishedFusionMode;
        if (i12 == i11) {
            return this;
        }
        if (this.f87225qs == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i11) + ", actual: " + fusionModeToString(i12));
    }

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.f87225qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // sh0.InterfaceC44418d
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        SubscriptionHelper.cancel(this.upstream);
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th2);
            if (th2 == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th2);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t11);
            if (t11 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t11);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f87225qs.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th2) {
                this.errors.add(th2);
                this.f87225qs.cancel();
                return;
            }
        }
    }

    @Override // sh0.InterfaceC44418d
    public final void request(long j11) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j11);
    }

    public final TestSubscriber<T> setInitialFusionMode(int i11) {
        this.initialFusionMode = i11;
        return this;
    }

    public TestSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
        this(interfaceC44417c, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(InterfaceC44417c<? super T> interfaceC44417c) {
        return new TestSubscriber<>(interfaceC44417c);
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        this.lastThread = Thread.currentThread();
        if (interfaceC44418d == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!C1454t.m2255a(this.upstream, null, interfaceC44418d)) {
            interfaceC44418d.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC44418d));
                return;
            }
            return;
        }
        int i11 = this.initialFusionMode;
        if (i11 != 0 && (interfaceC44418d instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) interfaceC44418d;
            this.f87225qs = queueSubscription;
            int iRequestFusion = queueSubscription.requestFusion(i11);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f87225qs.poll();
                        if (tPoll != null) {
                            this.values.add(tPoll);
                        } else {
                            this.completions++;
                            return;
                        }
                    } catch (Throwable th2) {
                        this.errors.add(th2);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(interfaceC44418d);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            interfaceC44418d.request(andSet);
        }
        onStart();
    }

    public final TestSubscriber<T> requestMore(long j11) {
        request(j11);
        return this;
    }

    public TestSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11) {
        if (j11 >= 0) {
            this.downstream = interfaceC44417c;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j11);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }

    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
        }
    }

    public void onStart() {
    }
}
