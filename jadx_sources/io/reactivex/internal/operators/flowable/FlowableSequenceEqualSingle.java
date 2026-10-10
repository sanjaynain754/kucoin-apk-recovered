package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {
    final BiPredicate<? super T, ? super T> comparer;
    final InterfaceC44416b<? extends T> first;
    final int prefetch;
    final InterfaceC44416b<? extends T> second;

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final BiPredicate<? super T, ? super T> comparer;
        final SingleObserver<? super Boolean> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final FlowableSequenceEqual.EqualSubscriber<T> first;
        final FlowableSequenceEqual.EqualSubscriber<T> second;

        /* JADX INFO: renamed from: v1 */
        T f87157v1;

        /* JADX INFO: renamed from: v2 */
        T f87158v2;

        public void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.first.cancel();
            this.second.cancel();
            if (getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(Throwable th2) {
            if (this.error.addThrowable(th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.first.get() == SubscriptionHelper.CANCELLED;
        }

        public void subscribe(InterfaceC44416b<? extends T> interfaceC44416b, InterfaceC44416b<? extends T> interfaceC44416b2) {
            interfaceC44416b.subscribe(this.first);
            interfaceC44416b2.subscribe(this.second);
        }

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i11, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.comparer = biPredicate;
            this.first = new FlowableSequenceEqual.EqualSubscriber<>(this, i11);
            this.second = new FlowableSequenceEqual.EqualSubscriber<>(this, i11);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    SimpleQueue<T> simpleQueue = this.first.queue;
                    SimpleQueue<T> simpleQueue2 = this.second.queue;
                    if (simpleQueue != null && simpleQueue2 != null) {
                        while (true) {
                            if (getDisposed()) {
                                this.first.clear();
                                this.second.clear();
                                return;
                            }
                            if (this.error.get() != null) {
                                cancelAndClear();
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                            boolean z12 = this.first.done;
                            T tPoll = this.f87157v1;
                            if (tPoll == null) {
                                try {
                                    tPoll = simpleQueue.poll();
                                    this.f87157v1 = tPoll;
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cancelAndClear();
                                    this.error.addThrowable(th2);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                            boolean z13 = false;
                            if (tPoll == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z14 = this.second.done;
                            T tPoll2 = this.f87158v2;
                            if (tPoll2 == null) {
                                try {
                                    tPoll2 = simpleQueue2.poll();
                                    this.f87158v2 = tPoll2;
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    cancelAndClear();
                                    this.error.addThrowable(th3);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                            if (tPoll2 == null) {
                                z13 = true;
                            }
                            if (z12 && z14 && z11 && z13) {
                                this.downstream.onSuccess(Boolean.TRUE);
                                return;
                            }
                            if (z12 && z14 && z11 != z13) {
                                cancelAndClear();
                                this.downstream.onSuccess(Boolean.FALSE);
                                return;
                            }
                            if (z11 || z13) {
                                break;
                            }
                            try {
                                if (!this.comparer.test(tPoll, tPoll2)) {
                                    cancelAndClear();
                                    this.downstream.onSuccess(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f87157v1 = null;
                                    this.f87158v2 = null;
                                    this.first.request();
                                    this.second.request();
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                cancelAndClear();
                                this.error.addThrowable(th4);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                    } else if (getDisposed()) {
                        this.first.clear();
                        this.second.clear();
                        return;
                    } else if (this.error.get() != null) {
                        cancelAndClear();
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqual(this.first, this.second, this.comparer, this.prefetch));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.prefetch, this.comparer);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }

    public FlowableSequenceEqualSingle(InterfaceC44416b<? extends T> interfaceC44416b, InterfaceC44416b<? extends T> interfaceC44416b2, BiPredicate<? super T, ? super T> biPredicate, int i11) {
        this.first = interfaceC44416b;
        this.second = interfaceC44416b2;
        this.comparer = biPredicate;
        this.prefetch = i11;
    }
}
