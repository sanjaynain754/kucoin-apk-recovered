package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {
    final Iterable<? extends MaybeSource<? extends T>> sources;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, InterfaceC44418d {
        private static final long serialVersionUID = 3520831347801429610L;
        final InterfaceC44417c<? super T> downstream;
        long produced;
        final Iterator<? extends MaybeSource<? extends T>> sources;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable disposables = new SequentialDisposable();
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

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
            this.downstream.onError(th2);
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

        public ConcatMaybeObserver(InterfaceC44417c<? super T> interfaceC44417c, Iterator<? extends MaybeSource<? extends T>> it) {
            this.downstream = interfaceC44417c;
            this.sources = it;
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
                            try {
                                if (this.sources.hasNext()) {
                                    try {
                                        ((MaybeSource) ObjectHelper.requireNonNull(this.sources.next(), "The source Iterator returned a null MaybeSource")).subscribe(this);
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        interfaceC44417c.onError(th2);
                                        return;
                                    }
                                } else {
                                    interfaceC44417c.onComplete();
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                interfaceC44417c.onError(th3);
                                return;
                            }
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
        try {
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(interfaceC44417c, (Iterator) ObjectHelper.requireNonNull(this.sources.iterator(), "The sources Iterable returned a null Iterator"));
            interfaceC44417c.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.drain();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public MaybeConcatIterable(Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.sources = iterable;
    }
}
