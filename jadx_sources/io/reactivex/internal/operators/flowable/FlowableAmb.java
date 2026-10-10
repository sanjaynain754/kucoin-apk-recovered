package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final InterfaceC44416b<? extends T>[] sources;
    final Iterable<? extends InterfaceC44416b<? extends T>> sourcesIterable;

    public static final class AmbCoordinator<T> implements InterfaceC44418d {
        final InterfaceC44417c<? super T> downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        public void subscribe(InterfaceC44416b<? extends T>[] interfaceC44416bArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                ambInnerSubscriberArr[i11] = new AmbInnerSubscriber<>(this, i12, this.downstream);
                i11 = i12;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i13 = 0; i13 < length && this.winner.get() == 0; i13++) {
                interfaceC44416bArr[i13].subscribe(ambInnerSubscriberArr[i13]);
            }
        }

        public boolean win(int i11) {
            int i12 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i11)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i11) {
                    ambInnerSubscriberArr[i12].cancel();
                }
                i12 = i13;
            }
            return true;
        }

        public AmbCoordinator(InterfaceC44417c<? super T> interfaceC44417c, int i11) {
            this.downstream = interfaceC44417c;
            this.subscribers = new AmbInnerSubscriber[i11];
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                int i11 = this.winner.get();
                if (i11 > 0) {
                    this.subscribers[i11 - 1].request(j11);
                    return;
                }
                if (i11 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j11);
                    }
                }
            }
        }
    }

    public static final class AmbInnerSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -1185974347409665484L;
        final InterfaceC44417c<? super T> downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.won) {
                this.downstream.onError(th2);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th2);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.won) {
                this.downstream.onNext(t11);
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onNext(t11);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j11);
        }

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i11, InterfaceC44417c<? super T> interfaceC44417c) {
            this.parent = ambCoordinator;
            this.index = i11;
            this.downstream = interfaceC44417c;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        int length;
        InterfaceC44416b<? extends T>[] interfaceC44416bArr = this.sources;
        if (interfaceC44416bArr == null) {
            interfaceC44416bArr = new InterfaceC44416b[8];
            try {
                length = 0;
                for (InterfaceC44416b<? extends T> interfaceC44416b : this.sourcesIterable) {
                    if (interfaceC44416b == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), interfaceC44417c);
                        return;
                    }
                    if (length == interfaceC44416bArr.length) {
                        InterfaceC44416b<? extends T>[] interfaceC44416bArr2 = new InterfaceC44416b[(length >> 2) + length];
                        System.arraycopy(interfaceC44416bArr, 0, interfaceC44416bArr2, 0, length);
                        interfaceC44416bArr = interfaceC44416bArr2;
                    }
                    int i11 = length + 1;
                    interfaceC44416bArr[length] = interfaceC44416b;
                    length = i11;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC44417c);
                return;
            }
        } else {
            length = interfaceC44416bArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(interfaceC44417c);
        } else if (length == 1) {
            interfaceC44416bArr[0].subscribe(interfaceC44417c);
        } else {
            new AmbCoordinator(interfaceC44417c, length).subscribe(interfaceC44416bArr);
        }
    }

    public FlowableAmb(InterfaceC44416b<? extends T>[] interfaceC44416bArr, Iterable<? extends InterfaceC44416b<? extends T>> iterable) {
        this.sources = interfaceC44416bArr;
        this.sourcesIterable = iterable;
    }
}
