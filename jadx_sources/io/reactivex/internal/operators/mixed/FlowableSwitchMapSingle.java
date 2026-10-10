package io.reactivex.internal.operators.mixed;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Flowable<T> source;

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        long emitted;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        InterfaceC44418d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th2) {
                this.parent.innerError(this, th2);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r11) {
                this.item = r11;
                this.parent.drain();
            }

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th2) {
            if (!C1454t.m2255a(this.inner, switchMapSingleObserver, null) || !this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.cancel();
                disposeInner();
            }
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
            if (switchMapSingleObserver2 != null) {
                switchMapSingleObserver2.dispose();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.inner.get();
                    if (switchMapSingleObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!C1454t.m2255a(this.inner, switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.subscribe(switchMapSingleObserver3);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
                onError(th2);
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

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            BackpressureHelper.add(this.requested, j11);
            drain();
        }

        public SwitchMapSingleSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.delayErrors = z11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j11 = this.emitted;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        interfaceC44417c.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z12 = this.done;
                    SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    if (switchMapSingleObserver == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z11) {
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (thTerminate != null) {
                            interfaceC44417c.onError(thTerminate);
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                    if (!z11 && switchMapSingleObserver.item != null && j11 != atomicLong.get()) {
                        C1454t.m2255a(atomicReference, switchMapSingleObserver, null);
                        interfaceC44417c.onNext(switchMapSingleObserver.item);
                        j11++;
                    } else {
                        this.emitted = j11;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapSingleSubscriber(interfaceC44417c, this.mapper, this.delayErrors));
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z11;
    }
}
