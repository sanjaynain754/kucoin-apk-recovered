package io.reactivex.processors;

import androidx.camera.view.C1454t;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {
    final ReplayBuffer<T> buffer;
    boolean done;
    final AtomicReference<ReplaySubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final ReplaySubscription[] EMPTY = new ReplaySubscription[0];
    static final ReplaySubscription[] TERMINATED = new ReplaySubscription[0];

    public interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th2);

        Throwable getError();

        @Nullable
        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t11);

        void replay(ReplaySubscription<T> replaySubscription);

        int size();

        void trimHead();
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements InterfaceC44418d {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final InterfaceC44417c<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final ReplayProcessor<T> state;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        public ReplaySubscription(InterfaceC44417c<? super T> interfaceC44417c, ReplayProcessor<T> replayProcessor) {
            this.downstream = interfaceC44417c;
            this.state = replayProcessor;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                this.state.buffer.replay(this);
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile TimedNode<T> head;
        final long maxAge;
        final int maxSize;
        final Scheduler scheduler;
        int size;
        TimedNode<T> tail;
        final TimeUnit unit;

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        public TimedNode<T> getHead() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.head;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > jNow) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        @Nullable
        public T getValue() {
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.time < this.scheduler.now(this.unit) - this.maxAge) {
                return null;
            }
            return timedNode.value;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t11) {
            TimedNode<T> timedNode = new TimedNode<>(t11, this.scheduler.now(this.unit));
            TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        public int size(TimedNode<T> timedNode) {
            int i11 = 0;
            while (i11 != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i11++;
            }
            return i11;
        }

        public void trim() {
            int i11 = this.size;
            if (i11 > this.maxSize) {
                this.size = i11 - 1;
                this.head = this.head.get();
            }
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else {
                    if (timedNode2.time > jNow) {
                        this.head = timedNode;
                        return;
                    }
                    timedNode = timedNode2;
                }
            }
        }

        public void trimFinal() {
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.value != null) {
                        this.head = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.head = timedNode;
                        return;
                    }
                }
                if (timedNode2.time > jNow) {
                    if (timedNode.value == null) {
                        this.head = timedNode;
                        return;
                    }
                    TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.head = timedNode3;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                timedNode.lazySet(this.head.get());
                this.head = timedNode;
            }
        }

        public SizeAndTimeBoundReplayBuffer(int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.maxSize = ObjectHelper.verifyPositive(i11, "maxSize");
            this.maxAge = ObjectHelper.verifyPositive(j11, "maxAge");
            this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimFinal();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th2) {
            trimFinal();
            this.error = th2;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            TimedNode<T> head = getHead();
            int size = size(head);
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i11 = 0; i11 != size; i11++) {
                head = head.get();
                tArr[i11] = head.value;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            boolean z11;
            if (replaySubscription.getAndIncrement() == 0) {
                InterfaceC44417c<? super T> interfaceC44417c = replaySubscription.downstream;
                TimedNode<T> head = (TimedNode) replaySubscription.index;
                if (head == null) {
                    head = getHead();
                }
                long j11 = replaySubscription.emitted;
                int iAddAndGet = 1;
                do {
                    long j12 = replaySubscription.requested.get();
                    while (j11 != j12) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z12 = this.done;
                        TimedNode<T> timedNode = head.get();
                        if (timedNode == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.error;
                            if (th2 == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onError(th2);
                                return;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC44417c.onNext(timedNode.value);
                        j11++;
                        head = timedNode;
                    }
                    if (j11 == j12) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        if (this.done && head.get() == null) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th3 = this.error;
                            if (th3 == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onError(th3);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = head;
                    replaySubscription.emitted = j11;
                    iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile Node<T> head;
        final int maxSize;
        int size;
        Node<T> tail;

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th2) {
            this.error = th2;
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
            Node<T> node2 = node;
            int i11 = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i11++;
            }
            if (tArr.length < i11) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
            }
            for (int i12 = 0; i12 < i11; i12++) {
                node = node.get();
                tArr[i12] = node.value;
            }
            if (tArr.length > i11) {
                tArr[i11] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t11) {
            Node<T> node = new Node<>(t11);
            Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            Node<T> node = this.head;
            int i11 = 0;
            while (i11 != Integer.MAX_VALUE && (node = node.get()) != null) {
                i11++;
            }
            return i11;
        }

        public void trim() {
            int i11 = this.size;
            if (i11 > this.maxSize) {
                this.size = i11 - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.head.get());
                this.head = node;
            }
        }

        public SizeBoundReplayBuffer(int i11) {
            this.maxSize = ObjectHelper.verifyPositive(i11, "maxSize");
            Node<T> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            boolean z11;
            if (replaySubscription.getAndIncrement() == 0) {
                InterfaceC44417c<? super T> interfaceC44417c = replaySubscription.downstream;
                Node<T> node = (Node) replaySubscription.index;
                if (node == null) {
                    node = this.head;
                }
                long j11 = replaySubscription.emitted;
                int iAddAndGet = 1;
                do {
                    long j12 = replaySubscription.requested.get();
                    while (j11 != j12) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z12 = this.done;
                        Node<T> node2 = node.get();
                        if (node2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.error;
                            if (th2 == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onError(th2);
                                return;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC44417c.onNext(node2.value);
                        j11++;
                        node = node2;
                    }
                    if (j11 == j12) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        if (this.done && node.get() == null) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th3 = this.error;
                            if (th3 == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onError(th3);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = node;
                    replaySubscription.emitted = j11;
                    iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
        final List<T> buffer;
        volatile boolean done;
        Throwable error;
        volatile int size;

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th2) {
            this.error = th2;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        @Nullable
        public T getValue() {
            int i11 = this.size;
            if (i11 == 0) {
                return null;
            }
            return this.buffer.get(i11 - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i11 = this.size;
            if (i11 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.buffer;
            if (tArr.length < i11) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
            }
            for (int i12 = 0; i12 < i11; i12++) {
                tArr[i12] = list.get(i12);
            }
            if (tArr.length > i11) {
                tArr[i11] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t11) {
            this.buffer.add(t11);
            this.size++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return this.size;
        }

        public UnboundedReplayBuffer(int i11) {
            this.buffer = new ArrayList(ObjectHelper.verifyPositive(i11, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            int iIntValue;
            if (replaySubscription.getAndIncrement() == 0) {
                List<T> list = this.buffer;
                InterfaceC44417c<? super T> interfaceC44417c = replaySubscription.downstream;
                Integer num = (Integer) replaySubscription.index;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                    replaySubscription.index = 0;
                }
                long j11 = replaySubscription.emitted;
                int iAddAndGet = 1;
                do {
                    long j12 = replaySubscription.requested.get();
                    while (j11 != j12) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z11 = this.done;
                        int i11 = this.size;
                        if (z11 && iIntValue == i11) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.error;
                            if (th2 == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onError(th2);
                                return;
                            }
                        }
                        if (iIntValue == i11) {
                            break;
                        }
                        interfaceC44417c.onNext(list.get(iIntValue));
                        iIntValue++;
                        j11++;
                    }
                    if (j11 == j12) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z12 = this.done;
                        int i12 = this.size;
                        if (z12 && iIntValue == i12) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th3 = this.error;
                            if (th3 == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onError(th3);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = Integer.valueOf(iIntValue);
                    replaySubscription.emitted = j11;
                    iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new UnboundedReplayBuffer(16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public Node(T t11) {
            this.value = t11;
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        public TimedNode(T t11, long j11) {
            this.value = t11;
            this.time = j11;
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i11) {
        return new ReplayProcessor<>(new UnboundedReplayBuffer(i11));
    }

    public static <T> ReplayProcessor<T> createUnbounded() {
        return new ReplayProcessor<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i11) {
        return new ReplayProcessor<>(new SizeBoundReplayBuffer(i11));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayProcessor<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j11, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j11, TimeUnit timeUnit, Scheduler scheduler, int i11) {
        return new ReplayProcessor<>(new SizeAndTimeBoundReplayBuffer(i11, j11, timeUnit, scheduler));
    }

    public boolean add(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!C1454t.m2255a(this.subscribers, replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        if (replayBuffer.isDone()) {
            return replayBuffer.getError();
        }
        return null;
    }

    public T getValue() {
        return this.buffer.getValue();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        return replayBuffer.isDone() && replayBuffer.getError() == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        return replayBuffer.isDone() && replayBuffer.getError() != null;
    }

    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.complete();
        for (ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.done = true;
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.error(th2);
        for (ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            return;
        }
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.next(t11);
        for (ReplaySubscription<T> replaySubscription : this.subscribers.get()) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (this.done) {
            interfaceC44418d.cancel();
        } else {
            interfaceC44418d.request(Long.MAX_VALUE);
        }
    }

    public void remove(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED || replaySubscriptionArr == EMPTY) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (replaySubscriptionArr[i11] == replaySubscription) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = EMPTY;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i11);
                System.arraycopy(replaySubscriptionArr, i11 + 1, replaySubscriptionArr3, i11, (length - i11) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!C1454t.m2255a(this.subscribers, replaySubscriptionArr, replaySubscriptionArr2));
    }

    public int size() {
        return this.buffer.size();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(interfaceC44417c, this);
        interfaceC44417c.onSubscribe(replaySubscription);
        if (add(replaySubscription) && replaySubscription.cancelled) {
            remove(replaySubscription);
        } else {
            this.buffer.replay(replaySubscription);
        }
    }

    public int subscriberCount() {
        return this.subscribers.get().length;
    }

    public ReplayProcessor(ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    public T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }
}
