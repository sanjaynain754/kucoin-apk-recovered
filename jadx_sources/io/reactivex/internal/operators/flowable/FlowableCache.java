package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {
    static final CacheSubscription[] EMPTY = new CacheSubscription[0];
    static final CacheSubscription[] TERMINATED = new CacheSubscription[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicBoolean once;
    volatile long size;
    final AtomicReference<CacheSubscription<T>[]> subscribers;
    Node<T> tail;
    int tailOffset;

    public static final class CacheSubscription<T> extends AtomicInteger implements InterfaceC44418d {
        private static final long serialVersionUID = 6770240836423125754L;
        final InterfaceC44417c<? super T> downstream;
        long index;
        Node<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public CacheSubscription(InterfaceC44417c<? super T> interfaceC44417c, FlowableCache<T> flowableCache) {
            this.downstream = interfaceC44417c;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.addCancel(this.requested, j11);
                this.parent.replay(this);
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i11) {
            this.values = (T[]) new Object[i11];
        }
    }

    public void add(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            if (cacheSubscriptionArr == TERMINATED) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!C1454t.m2255a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    public long cachedEventCount() {
        return this.size;
    }

    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    public boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.error = th2;
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        int i11 = this.tailOffset;
        if (i11 == this.capacityHint) {
            Node<T> node = new Node<>(i11);
            node.values[0] = t11;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i11] = t11;
            this.tailOffset = i11 + 1;
        }
        this.size++;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    public void remove(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (cacheSubscriptionArr[i11] == cacheSubscription) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr2 = EMPTY;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i11);
                System.arraycopy(cacheSubscriptionArr, i11 + 1, cacheSubscriptionArr3, i11, (length - i11) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!C1454t.m2255a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    public void replay(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j11 = cacheSubscription.index;
        int i11 = cacheSubscription.offset;
        Node<T> node = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        InterfaceC44417c<? super T> interfaceC44417c = cacheSubscription.downstream;
        int i12 = this.capacityHint;
        int iAddAndGet = 1;
        while (true) {
            boolean z11 = this.done;
            boolean z12 = this.size == j11;
            if (z11 && z12) {
                cacheSubscription.node = null;
                Throwable th2 = this.error;
                if (th2 != null) {
                    interfaceC44417c.onError(th2);
                    return;
                } else {
                    interfaceC44417c.onComplete();
                    return;
                }
            }
            if (!z12) {
                long j12 = atomicLong.get();
                if (j12 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j12 != j11) {
                    if (i11 == i12) {
                        node = node.next;
                        i11 = 0;
                    }
                    interfaceC44417c.onNext(node.values[i11]);
                    i11++;
                    j11++;
                }
            }
            cacheSubscription.index = j11;
            cacheSubscription.offset = i11;
            cacheSubscription.node = node;
            iAddAndGet = cacheSubscription.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(interfaceC44417c, this);
        interfaceC44417c.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            replay(cacheSubscription);
        } else {
            this.source.subscribe((FlowableSubscriber) this);
        }
    }

    public FlowableCache(Flowable<T> flowable, int i11) {
        super(flowable);
        this.capacityHint = i11;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i11);
        this.head = node;
        this.tail = node;
        this.subscribers = new AtomicReference<>(EMPTY);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        interfaceC44418d.request(Long.MAX_VALUE);
    }
}
