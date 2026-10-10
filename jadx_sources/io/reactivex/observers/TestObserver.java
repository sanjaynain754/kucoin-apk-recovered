package io.reactivex.observers;

import androidx.camera.view.C1454t;
import com.google.api.client.googleapis.notifications.ResourceStates;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {
    private final Observer<? super T> downstream;

    /* JADX INFO: renamed from: qd */
    private QueueDisposable<T> f87223qd;
    private final AtomicReference<Disposable> upstream;

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public static <T> TestObserver<T> create() {
        return new TestObserver<>();
    }

    public TestObserver(Observer<? super T> observer) {
        this.upstream = new AtomicReference<>();
        this.downstream = observer;
    }

    public static <T> TestObserver<T> create(Observer<? super T> observer) {
        return new TestObserver<>(observer);
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

    public final TestObserver<T> assertFuseable() {
        if (this.f87223qd != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestObserver<T> assertFusionMode(int i11) {
        int i12 = this.establishedFusionMode;
        if (i12 == i11) {
            return this;
        }
        if (this.f87223qd == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i11) + ", actual: " + fusionModeToString(i12));
    }

    public final TestObserver<T> assertNotFuseable() {
        if (this.f87223qd == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // io.reactivex.Observer
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

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            if (th2 == null) {
                this.errors.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th2);
            }
            this.downstream.onError(th2);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.Observer
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
                T tPoll = this.f87223qd.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th2) {
                this.errors.add(th2);
                this.f87223qd.dispose();
                return;
            }
        }
    }

    public final TestObserver<T> setInitialFusionMode(int i11) {
        this.initialFusionMode = i11;
        return this;
    }

    public final TestObserver<T> assertOf(Consumer<? super TestObserver<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    public final void cancel() {
        dispose();
    }

    public final boolean isCancelled() {
        return getDisposed();
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        this.lastThread = Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!C1454t.m2255a(this.upstream, null, disposable)) {
            disposable.dispose();
            if (this.upstream.get() != DisposableHelper.DISPOSED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
                return;
            }
            return;
        }
        int i11 = this.initialFusionMode;
        if (i11 != 0 && (disposable instanceof QueueDisposable)) {
            QueueDisposable<T> queueDisposable = (QueueDisposable) disposable;
            this.f87223qd = queueDisposable;
            int iRequestFusion = queueDisposable.requestFusion(i11);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f87223qd.poll();
                        if (tPoll != null) {
                            this.values.add(tPoll);
                        } else {
                            this.completions++;
                            this.upstream.lazySet(DisposableHelper.DISPOSED);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.errors.add(th2);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(disposable);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t11) {
        onNext(t11);
        onComplete();
    }

    public enum EmptyObserver implements Observer<Object> {
        INSTANCE;

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }
    }
}
