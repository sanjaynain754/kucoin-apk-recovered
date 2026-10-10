package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super T, ? extends InterfaceC44416b<U>> debounceSelector;

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 6725975399620862591L;
        final Function<? super T, ? extends InterfaceC44416b<U>> debounceSelector;
        final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        boolean done;
        final InterfaceC44417c<? super T> downstream;
        volatile long index;
        InterfaceC44418d upstream;

        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            boolean done;
            final long index;
            final AtomicBoolean once = new AtomicBoolean();
            final DebounceSubscriber<T, U> parent;
            final T value;

            public void emit() {
                if (this.once.compareAndSet(false, true)) {
                    this.parent.emit(this.index, this.value);
                }
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onComplete() {
                if (this.done) {
                    return;
                }
                this.done = true;
                emit();
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onError(Throwable th2) {
                if (this.done) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.done = true;
                    this.parent.onError(th2);
                }
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onNext(U u11) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cancel();
                emit();
            }

            public DebounceInnerSubscriber(DebounceSubscriber<T, U> debounceSubscriber, long j11, T t11) {
                this.parent = debounceSubscriber;
                this.index = j11;
                this.value = t11;
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.debouncer);
        }

        public void emit(long j11, T t11) {
            if (j11 == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t11);
                    BackpressureHelper.produced(this, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            Disposable disposable = this.debouncer.get();
            if (DisposableHelper.isDisposed(disposable)) {
                return;
            }
            ((DebounceInnerSubscriber) disposable).emit();
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            long j11 = this.index + 1;
            this.index = j11;
            Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.debounceSelector.apply(t11), "The publisher supplied is null");
                DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j11, t11);
                if (C1454t.m2255a(this.debouncer, disposable, debounceInnerSubscriber)) {
                    interfaceC44416b.subscribe(debounceInnerSubscriber);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public DebounceSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<U>> function) {
            this.downstream = interfaceC44417c;
            this.debounceSelector = function;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this, j11);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new DebounceSubscriber(new SerializedSubscriber(interfaceC44417c), this.debounceSelector));
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends InterfaceC44416b<U>> function) {
        super(flowable);
        this.debounceSelector = function;
    }
}
