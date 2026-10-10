package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {
    final MaybeSource<? extends T>[] sources;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, InterfaceC44418d {
        private static final long serialVersionUID = 3520831347801429610L;
        final InterfaceC44417c<? super T> downstream;
        int index;
        long produced;
        final MaybeSource<? extends T>[] sources;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable disposables = new SequentialDisposable();
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);
        final AtomicThrowable errors = new AtomicThrowable();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.disposables.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.current.lazySet(NotificationLite.COMPLETE);
            if (this.errors.addThrowable(th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.disposables.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            this.current.lazySet(t11);
            drain();
        }

        public ConcatMaybeObserver(InterfaceC44417c<? super T> interfaceC44417c, MaybeSource<? extends T>[] maybeSourceArr) {
            this.downstream = interfaceC44417c;
            this.sources = maybeSourceArr;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.current;
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                SequentialDisposable sequentialDisposable = this.disposables;
                while (!sequentialDisposable.getDisposed()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        if (obj != NotificationLite.COMPLETE) {
                            long j11 = this.produced;
                            if (j11 != this.requested.get()) {
                                this.produced = j11 + 1;
                                atomicReference.lazySet(null);
                                interfaceC44417c.onNext(obj);
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (!sequentialDisposable.getDisposed()) {
                            int i11 = this.index;
                            MaybeSource<? extends T>[] maybeSourceArr = this.sources;
                            if (i11 == maybeSourceArr.length) {
                                if (this.errors.get() != null) {
                                    interfaceC44417c.onError(this.errors.terminate());
                                    return;
                                } else {
                                    interfaceC44417c.onComplete();
                                    return;
                                }
                            }
                            this.index = i11 + 1;
                            maybeSourceArr[i11].subscribe(this);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(interfaceC44417c, this.sources);
        interfaceC44417c.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.drain();
    }

    public MaybeConcatArrayDelayError(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }
}
