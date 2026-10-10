package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    static final Callable DEFAULT_UNBOUNDED_FACTORY = new DefaultUnboundedFactory();
    final Callable<? extends ReplayBuffer<T>> bufferFactory;
    final AtomicReference<ReplaySubscriber<T>> current;
    final InterfaceC44416b<T> onSubscribe;
    final Flowable<T> source;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void replay(InnerSubscription<T> innerSubscription) {
            Node node;
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.emitting) {
                        innerSubscription.missed = true;
                        return;
                    }
                    innerSubscription.emitting = true;
                    while (!innerSubscription.getDisposed()) {
                        long j11 = innerSubscription.get();
                        boolean z11 = j11 == Long.MAX_VALUE;
                        Node head = (Node) innerSubscription.index();
                        if (head == null) {
                            head = getHead();
                            innerSubscription.index = head;
                            BackpressureHelper.add(innerSubscription.totalRequested, head.index);
                        }
                        long j12 = 0;
                        while (j11 != 0 && (node = head.get()) != null) {
                            Object objLeaveTransform = leaveTransform(node.value);
                            try {
                                if (NotificationLite.accept(objLeaveTransform, innerSubscription.child)) {
                                    innerSubscription.index = null;
                                    return;
                                }
                                j12++;
                                j11--;
                                if (innerSubscription.getDisposed()) {
                                    innerSubscription.index = null;
                                    return;
                                }
                                head = node;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                innerSubscription.index = null;
                                innerSubscription.dispose();
                                if (NotificationLite.isError(objLeaveTransform) || NotificationLite.isComplete(objLeaveTransform)) {
                                    return;
                                }
                                innerSubscription.child.onError(th2);
                                return;
                            }
                        }
                        if (j12 != 0) {
                            innerSubscription.index = head;
                            if (!z11) {
                                innerSubscription.produced(j12);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.missed) {
                                    innerSubscription.emitting = false;
                                    return;
                                }
                                innerSubscription.missed = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    innerSubscription.index = null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isComplete(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isError(leaveTransform(obj));
        }

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.tail = node;
            set(node);
        }

        public final void collect(Collection<? super T> collection) {
            Node head = getHead();
            while (true) {
                head = head.get();
                if (head != null) {
                    Object objLeaveTransform = leaveTransform(head.value);
                    if (!NotificationLite.isComplete(objLeaveTransform) && !NotificationLite.isError(objLeaveTransform)) {
                        collection.add((Object) NotificationLite.getValue(objLeaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
            Object objEnterTransform = enterTransform(NotificationLite.complete());
            long j11 = this.index + 1;
            this.index = j11;
            addLast(new Node(objEnterTransform, j11));
            truncateFinal();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void error(Throwable th2) {
            Object objEnterTransform = enterTransform(NotificationLite.error(th2));
            long j11 = this.index + 1;
            this.index = j11;
            addLast(new Node(objEnterTransform, j11));
            truncateFinal();
        }

        public Node getHead() {
            return get();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void next(T t11) {
            Object objEnterTransform = enterTransform(NotificationLite.next(t11));
            long j11 = this.index + 1;
            this.index = j11;
            addLast(new Node(objEnterTransform, j11));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            if (node != null) {
                this.size--;
                setFirst(node);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        public final void removeSome(int i11) {
            Node node = get();
            while (i11 > 0) {
                node = node.get();
                i11--;
                this.size--;
            }
            setFirst(node);
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public void truncateFinal() {
            trimHead();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        public void truncate() {
        }
    }

    public static final class ConnectableFlowableReplay<T> extends ConnectableFlowable<T> {

        /* JADX INFO: renamed from: cf */
        private final ConnectableFlowable<T> f87152cf;
        private final Flowable<T> flowable;

        @Override // io.reactivex.flowables.ConnectableFlowable
        public void connect(Consumer<? super Disposable> consumer) {
            this.f87152cf.connect(consumer);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
            this.flowable.subscribe(interfaceC44417c);
        }

        public ConnectableFlowableReplay(ConnectableFlowable<T> connectableFlowable, Flowable<T> flowable) {
            this.f87152cf = connectableFlowable;
            this.flowable = flowable;
        }
    }

    public static final class DefaultUnboundedFactory implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements InterfaceC44418d, Disposable {
        static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final InterfaceC44417c<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.manageRequests();
                this.index = null;
            }
        }

        public <U> U index() {
            return (U) this.index;
        }

        public InnerSubscription(ReplaySubscriber<T> replaySubscriber, InterfaceC44417c<? super T> interfaceC44417c) {
            this.parent = replaySubscriber;
            this.child = interfaceC44417c;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public long produced(long j11) {
            return BackpressureHelper.producedCancel(this, j11);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11) && BackpressureHelper.addCancel(this, j11) != Long.MIN_VALUE) {
                BackpressureHelper.add(this.totalRequested, j11);
                this.parent.manageRequests();
                this.parent.buffer.replay(this);
            }
        }
    }

    public static final class MulticastFlowable<R, U> extends Flowable<R> {
        private final Callable<? extends ConnectableFlowable<U>> connectableFactory;
        private final Function<? super Flowable<U>, ? extends InterfaceC44416b<R>> selector;

        public final class DisposableConsumer implements Consumer<Disposable> {
            private final SubscriberResourceWrapper<R> srw;

            public DisposableConsumer(SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.srw = subscriberResourceWrapper;
            }

            @Override // io.reactivex.functions.Consumer
            public void accept(Disposable disposable) {
                this.srw.setResource(disposable);
            }
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
            try {
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) ObjectHelper.requireNonNull(this.connectableFactory.call(), "The connectableFactory returned null");
                try {
                    InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.selector.apply(connectableFlowable), "The selector returned a null Publisher");
                    SubscriberResourceWrapper subscriberResourceWrapper = new SubscriberResourceWrapper(interfaceC44417c);
                    interfaceC44416b.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new DisposableConsumer(subscriberResourceWrapper));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, interfaceC44417c);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC44417c);
            }
        }

        public MulticastFlowable(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends InterfaceC44416b<R>> function) {
            this.connectableFactory = callable;
            this.selector = function;
        }
    }

    public interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th2);

        void next(T t11);

        void replay(InnerSubscription<T> innerSubscription);
    }

    public static final class ReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        private final int bufferSize;

        @Override // java.util.concurrent.Callable
        public ReplayBuffer<T> call() {
            return new SizeBoundReplayBuffer(this.bufferSize);
        }

        public ReplayBufferTask(int i11) {
            this.bufferSize = i11;
        }
    }

    public static final class ReplayPublisher<T> implements InterfaceC44416b<T> {
        private final Callable<? extends ReplayBuffer<T>> bufferFactory;
        private final AtomicReference<ReplaySubscriber<T>> curr;

        @Override // sh0.InterfaceC44416b
        public void subscribe(InterfaceC44417c<? super T> interfaceC44417c) {
            ReplaySubscriber<T> replaySubscriber;
            while (true) {
                replaySubscriber = this.curr.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.call());
                    if (C1454t.m2255a(this.curr, null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, interfaceC44417c);
                    return;
                }
            }
            InnerSubscription<T> innerSubscription = new InnerSubscription<>(replaySubscriber, interfaceC44417c);
            interfaceC44417c.onSubscribe(innerSubscription);
            replaySubscriber.add(innerSubscription);
            if (innerSubscription.getDisposed()) {
                replaySubscriber.remove(innerSubscription);
            } else {
                replaySubscriber.manageRequests();
                replaySubscriber.buffer.replay(innerSubscription);
            }
        }

        public ReplayPublisher(AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends ReplayBuffer<T>> callable) {
            this.curr = atomicReference;
            this.bufferFactory = callable;
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final ReplayBuffer<T> buffer;
        boolean done;
        long maxChildRequested;
        long maxUpstreamRequested;
        final AtomicInteger management = new AtomicInteger();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.set(TERMINATED);
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        public void manageRequests() {
            if (this.management.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!getDisposed()) {
                InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                long j11 = this.maxChildRequested;
                long jMax = j11;
                for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                    jMax = Math.max(jMax, innerSubscription.totalRequested.get());
                }
                long j12 = this.maxUpstreamRequested;
                InterfaceC44418d interfaceC44418d = get();
                long j13 = jMax - j11;
                if (j13 != 0) {
                    this.maxChildRequested = jMax;
                    if (interfaceC44418d == null) {
                        long j14 = j12 + j13;
                        if (j14 < 0) {
                            j14 = Long.MAX_VALUE;
                        }
                        this.maxUpstreamRequested = j14;
                    } else if (j12 != 0) {
                        this.maxUpstreamRequested = 0L;
                        interfaceC44418d.request(j12 + j13);
                    } else {
                        interfaceC44418d.request(j13);
                    }
                } else if (j12 != 0 && interfaceC44418d != null) {
                    this.maxUpstreamRequested = 0L;
                    interfaceC44418d.request(j12);
                }
                iAddAndGet = this.management.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.buffer.error(th2);
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            this.buffer.next(t11);
            for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                this.buffer.replay(innerSubscription);
            }
        }

        public void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (innerSubscriptionArr[i11].equals(innerSubscription)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = EMPTY;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i11);
                    System.arraycopy(innerSubscriptionArr, i11 + 1, innerSubscriptionArr3, i11, (length - i11) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!C1454t.m2255a(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
        }

        public ReplaySubscriber(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
        }

        public boolean add(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            innerSubscription.getClass();
            do {
                innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!C1454t.m2255a(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
                manageRequests();
                for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                    this.buffer.replay(innerSubscription);
                }
            }
        }
    }

    public static final class ScheduledReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        private final int bufferSize;
        private final long maxAge;
        private final Scheduler scheduler;
        private final TimeUnit unit;

        @Override // java.util.concurrent.Callable
        public ReplayBuffer<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.bufferSize, this.maxAge, this.unit, this.scheduler);
        }

        public ScheduledReplayBufferTask(int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.bufferSize = i11;
            this.maxAge = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final Scheduler scheduler;
        final TimeUnit unit;

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new Timed(obj, this.scheduler.now(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public Node getHead() {
            Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                Timed timed = (Timed) node2.value;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i11 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i12 = this.size;
                    if (i12 <= this.limit) {
                        if (((Timed) node2.value).time() > jNow) {
                            break;
                        }
                        i11++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i11++;
                        this.size = i12 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i11 != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void truncateFinal() {
            Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i11 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((Timed) node2.value).time() > jNow) {
                    break;
                }
                i11++;
                this.size--;
                node3 = node2.get();
            }
            if (i11 != 0) {
                setFirst(node);
            }
        }

        public SizeAndTimeBoundReplayBuffer(int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i11;
            this.maxAge = j11;
            this.unit = timeUnit;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }

        public SizeBoundReplayBuffer(int i11) {
            this.limit = i11;
        }
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i11) {
        return i11 == Integer.MAX_VALUE ? createFrom(flowable) : create(flowable, new ReplayBufferTask(i11));
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        public Node(Object obj, long j11) {
            this.value = obj;
            this.index = j11;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void replay(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.emitting) {
                        innerSubscription.missed = true;
                        return;
                    }
                    innerSubscription.emitting = true;
                    InterfaceC44417c<? super T> interfaceC44417c = innerSubscription.child;
                    while (!innerSubscription.getDisposed()) {
                        int i11 = this.size;
                        Integer num = (Integer) innerSubscription.index();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j11 = innerSubscription.get();
                        long j12 = j11;
                        long j13 = 0;
                        while (j12 != 0 && iIntValue < i11) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.accept(obj, interfaceC44417c) || innerSubscription.getDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j12--;
                                j13++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                innerSubscription.dispose();
                                if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                                    return;
                                }
                                interfaceC44417c.onError(th2);
                                return;
                            }
                        }
                        if (j13 != 0) {
                            innerSubscription.index = Integer.valueOf(iIntValue);
                            if (j11 != Long.MAX_VALUE) {
                                innerSubscription.produced(j13);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.missed) {
                                    innerSubscription.emitting = false;
                                    return;
                                }
                                innerSubscription.missed = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public UnboundedReplayBuffer(int i11) {
            super(i11);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void next(T t11) {
            add(NotificationLite.next(t11));
            this.size++;
        }
    }

    public static <T> ConnectableFlowable<T> createFrom(Flowable<? extends T> flowable) {
        return create(flowable, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static <U, R> Flowable<R> multicastSelector(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends InterfaceC44416b<R>> function) {
        return new MulticastFlowable(callable, function);
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.current.get();
            if (replaySubscriber != null && !replaySubscriber.getDisposed()) {
                break;
            }
            try {
                ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.call());
                if (C1454t.m2255a(this.current, replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }
        boolean z11 = !replaySubscriber.shouldConnect.get() && replaySubscriber.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z11) {
                this.source.subscribe((FlowableSubscriber) replaySubscriber);
            }
        } catch (Throwable th3) {
            if (z11) {
                replaySubscriber.shouldConnect.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th3);
            throw ExceptionHelper.wrapOrThrow(th3);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        C1454t.m2255a(this.current, (ReplaySubscriber) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public InterfaceC44416b<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.onSubscribe.subscribe(interfaceC44417c);
    }

    private FlowableReplay(InterfaceC44416b<T> interfaceC44416b, Flowable<T> flowable, AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends ReplayBuffer<T>> callable) {
        this.onSubscribe = interfaceC44416b;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferFactory = callable;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return create(flowable, j11, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableFlowable<T> observeOn(ConnectableFlowable<T> connectableFlowable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new ConnectableFlowableReplay(connectableFlowable, connectableFlowable.observeOn(scheduler)));
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11) {
        return create(flowable, new ScheduledReplayBufferTask(i11, j11, timeUnit, scheduler));
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, Callable<? extends ReplayBuffer<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowableReplay(new ReplayPublisher(atomicReference, callable), flowable, atomicReference, callable));
    }
}
