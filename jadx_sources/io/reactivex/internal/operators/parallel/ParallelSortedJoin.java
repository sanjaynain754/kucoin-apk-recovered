package io.reactivex.internal.operators.parallel;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    final Comparator<? super T> comparator;
    final ParallelFlowable<List<T>> source;

    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final SortedJoinSubscription<T> parent;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.innerError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }

        public SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i11) {
            this.parent = sortedJoinSubscription;
            this.index = i11;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
        }
    }

    public static final class SortedJoinSubscription<T> extends AtomicInteger implements InterfaceC44418d {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final InterfaceC44417c<? super T> downstream;
        final int[] indexes;
        final List<T>[] lists;
        final SortedJoinInnerSubscriber<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }

        public void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        public void drain() {
            int i11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            List<T>[] listArr = this.lists;
            int[] iArr = this.indexes;
            int length = iArr.length;
            int i12 = 1;
            while (true) {
                long j11 = this.requested.get();
                long j12 = 0;
                while (true) {
                    i11 = 0;
                    if (j12 != j11) {
                        if (this.cancelled) {
                            Arrays.fill(listArr, (Object) null);
                            return;
                        }
                        Throwable th2 = this.error.get();
                        if (th2 != null) {
                            cancelAll();
                            Arrays.fill(listArr, (Object) null);
                            interfaceC44417c.onError(th2);
                            return;
                        }
                        int i13 = -1;
                        T t11 = null;
                        while (i11 < length) {
                            List<T> list = listArr[i11];
                            int i14 = iArr[i11];
                            if (list.size() != i14) {
                                if (t11 == null) {
                                    t11 = list.get(i14);
                                } else {
                                    T t12 = list.get(i14);
                                    try {
                                        if (this.comparator.compare(t11, t12) > 0) {
                                            t11 = t12;
                                        }
                                    } catch (Throwable th3) {
                                        Exceptions.throwIfFatal(th3);
                                        cancelAll();
                                        Arrays.fill(listArr, (Object) null);
                                        if (!C1454t.m2255a(this.error, null, th3)) {
                                            RxJavaPlugins.onError(th3);
                                        }
                                        interfaceC44417c.onError(this.error.get());
                                        return;
                                    }
                                }
                                i13 = i11;
                            }
                            i11++;
                        }
                        if (t11 == null) {
                            Arrays.fill(listArr, (Object) null);
                            interfaceC44417c.onComplete();
                            return;
                        } else {
                            interfaceC44417c.onNext(t11);
                            iArr[i13] = iArr[i13] + 1;
                            j12++;
                        }
                    }
                }
                if (j12 == j11) {
                    if (this.cancelled) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th4 = this.error.get();
                    if (th4 != null) {
                        cancelAll();
                        Arrays.fill(listArr, (Object) null);
                        interfaceC44417c.onError(th4);
                        return;
                    } else {
                        while (true) {
                            if (i11 >= length) {
                                Arrays.fill(listArr, (Object) null);
                                interfaceC44417c.onComplete();
                                return;
                            } else if (iArr[i11] != listArr[i11].size()) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j12);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i12 && (iAddAndGet = addAndGet(-i12)) == 0) {
                    return;
                } else {
                    i12 = iAddAndGet;
                }
            }
        }

        public void innerError(Throwable th2) {
            if (C1454t.m2255a(this.error, null, th2)) {
                drain();
            } else if (th2 != this.error.get()) {
                RxJavaPlugins.onError(th2);
            }
        }

        public void innerNext(List<T> list, int i11) {
            this.lists[i11] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        public SortedJoinSubscription(InterfaceC44417c<? super T> interfaceC44417c, int i11, Comparator<? super T> comparator) {
            this.downstream = interfaceC44417c;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                sortedJoinInnerSubscriberArr[i12] = new SortedJoinInnerSubscriber<>(this, i12);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i11];
            this.indexes = new int[i11];
            this.remaining.lazySet(i11);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(interfaceC44417c, this.source.parallelism(), this.comparator);
        interfaceC44417c.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }
}
