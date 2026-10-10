package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final InterfaceC44416b<? extends T>[] sources;
    final Iterable<? extends InterfaceC44416b<? extends T>> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements InterfaceC44418d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final InterfaceC44417c<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                zipSubscriber.cancel();
            }
        }

        public void drain() {
            long j11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.current;
            int iAddAndGet = 1;
            do {
                long j12 = this.requested.get();
                long j13 = 0;
                while (true) {
                    if (j12 == j13) {
                        j11 = 0;
                        break;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC44417c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z11 = false;
                    for (int i11 = 0; i11 < length; i11++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i11];
                        if (objArr[i11] == null) {
                            try {
                                boolean z12 = zipSubscriber.done;
                                SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                T tPoll = simpleQueue != null ? simpleQueue.poll() : null;
                                boolean z13 = tPoll == null;
                                if (z12 && z13) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        interfaceC44417c.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        interfaceC44417c.onComplete();
                                        return;
                                    }
                                }
                                if (z13) {
                                    z11 = true;
                                } else {
                                    objArr[i11] = tPoll;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.errors.addThrowable(th2);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC44417c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                    j11 = 0;
                    if (z11) {
                        break;
                    }
                    try {
                        interfaceC44417c.onNext((Object) ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                        j13++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        cancelAll();
                        this.errors.addThrowable(th3);
                        interfaceC44417c.onError(this.errors.terminate());
                        return;
                    }
                }
                if (j12 == j13) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC44417c.onError(this.errors.terminate());
                        return;
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i12];
                        if (objArr[i12] == null) {
                            try {
                                boolean z14 = zipSubscriber2.done;
                                SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                T tPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z15 = tPoll2 == null;
                                if (z14 && z15) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        interfaceC44417c.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        interfaceC44417c.onComplete();
                                        return;
                                    }
                                }
                                if (!z15) {
                                    objArr[i12] = tPoll2;
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                this.errors.addThrowable(th4);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC44417c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j13 != j11) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j13);
                    }
                    if (j12 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j13);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void error(ZipSubscriber<T, R> zipSubscriber, Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                zipSubscriber.done = true;
                drain();
            }
        }

        public void subscribe(InterfaceC44416b<? extends T>[] interfaceC44416bArr, int i11) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i12 = 0; i12 < i11 && !this.cancelled; i12++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                interfaceC44416bArr[i12].subscribe(zipSubscriberArr[i12]);
            }
        }

        public ZipCoordinator(InterfaceC44417c<? super R> interfaceC44417c, Function<? super Object[], ? extends R> function, int i11, int i12, boolean z11) {
            this.downstream = interfaceC44417c;
            this.zipper = function;
            this.delayErrors = z11;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                zipSubscriberArr[i13] = new ZipSubscriber<>(this, i12);
            }
            this.current = new Object[i11];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.error(this, th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.sourceMode != 2) {
                this.queue.offer(t11);
            }
            this.parent.drain();
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (this.sourceMode != 1) {
                long j12 = this.produced + j11;
                if (j12 < this.limit) {
                    this.produced = j12;
                } else {
                    this.produced = 0L;
                    get().request(j12);
                }
            }
        }

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i11) {
            this.parent = zipCoordinator;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        interfaceC44418d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                interfaceC44418d.request(this.prefetch);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        int length;
        InterfaceC44416b<? extends T>[] interfaceC44416bArr = this.sources;
        if (interfaceC44416bArr == null) {
            interfaceC44416bArr = new InterfaceC44416b[8];
            length = 0;
            for (InterfaceC44416b<? extends T> interfaceC44416b : this.sourcesIterable) {
                if (length == interfaceC44416bArr.length) {
                    InterfaceC44416b<? extends T>[] interfaceC44416bArr2 = new InterfaceC44416b[(length >> 2) + length];
                    System.arraycopy(interfaceC44416bArr, 0, interfaceC44416bArr2, 0, length);
                    interfaceC44416bArr = interfaceC44416bArr2;
                }
                interfaceC44416bArr[length] = interfaceC44416b;
                length++;
            }
        } else {
            length = interfaceC44416bArr.length;
        }
        int i11 = length;
        if (i11 == 0) {
            EmptySubscription.complete(interfaceC44417c);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(interfaceC44417c, this.zipper, i11, this.bufferSize, this.delayError);
        interfaceC44417c.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(interfaceC44416bArr, i11);
    }

    public FlowableZip(InterfaceC44416b<? extends T>[] interfaceC44416bArr, Iterable<? extends InterfaceC44416b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i11, boolean z11) {
        this.sources = interfaceC44416bArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
