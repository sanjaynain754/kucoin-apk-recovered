package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final Function<? super T, ? extends K> keySelector;
    final Function<? super Consumer<Object>, ? extends Map<K, Object>> mapFactory;
    final Function<? super T, ? extends V> valueSelector;

    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        final Queue<GroupedUnicast<K, V>> evictedGroups;

        @Override // io.reactivex.functions.Consumer
        public void accept(GroupedUnicast<K, V> groupedUnicast) {
            this.evictedGroups.offer(groupedUnicast);
        }

        public EvictionAction(Queue<GroupedUnicast<K, V>> queue) {
            this.evictedGroups = queue;
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        boolean done;
        final InterfaceC44417c<? super GroupedFlowable<K, V>> downstream;
        Throwable error;
        final Queue<GroupedUnicast<K, V>> evictedGroups;
        volatile boolean finished;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final SpscLinkedArrayQueue<GroupedFlowable<K, V>> queue;
        InterfaceC44418d upstream;
        final Function<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger groupCount = new AtomicInteger(1);

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i11 = 0;
                while (true) {
                    GroupedUnicast<K, V> groupedUnicastPoll = this.evictedGroups.poll();
                    if (groupedUnicastPoll == null) {
                        break;
                    }
                    groupedUnicastPoll.onComplete();
                    i11++;
                }
                if (i11 != 0) {
                    this.groupCount.addAndGet(-i11);
                }
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.delayError) {
                if (!z11 || !z12) {
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    interfaceC44417c.onError(th2);
                } else {
                    interfaceC44417c.onComplete();
                }
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                spscLinkedArrayQueue.clear();
                interfaceC44417c.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            interfaceC44417c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drainFused() {
            Throwable th2;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC44417c<? super GroupedFlowable<K, V>> interfaceC44417c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled.get()) {
                boolean z11 = this.finished;
                if (z11 && !this.delayError && (th2 = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC44417c.onError(th2);
                    return;
                }
                interfaceC44417c.onNext(null);
                if (z11) {
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        interfaceC44417c.onError(th3);
                        return;
                    } else {
                        interfaceC44417c.onComplete();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void drainNormal() {
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC44417c<? super GroupedFlowable<K, V>> interfaceC44417c = this.downstream;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.finished;
                    GroupedFlowable<K, V> groupedFlowablePoll = spscLinkedArrayQueue.poll();
                    boolean z12 = groupedFlowablePoll == null;
                    if (checkTerminated(z11, z12, interfaceC44417c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    interfaceC44417c.onNext(groupedFlowablePoll);
                    j12++;
                }
                if (j12 == j11 && checkTerminated(this.finished, spscLinkedArrayQueue.isEmpty(), interfaceC44417c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j12 != 0) {
                    if (j11 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j12);
                    }
                    this.upstream.request(j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.done = true;
            this.finished = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.error = th2;
            this.finished = true;
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            boolean z11;
            GroupedUnicast groupedUnicast;
            if (this.done) {
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            try {
                K kApply = this.keySelector.apply(t11);
                Object obj = kApply != null ? kApply : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicast2 = this.groups.get(obj);
                if (groupedUnicast2 != null) {
                    z11 = false;
                    groupedUnicast = groupedUnicast2;
                } else {
                    if (this.cancelled.get()) {
                        return;
                    }
                    GroupedUnicast groupedUnicastCreateWith = GroupedUnicast.createWith(kApply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicastCreateWith);
                    this.groupCount.getAndIncrement();
                    z11 = true;
                    groupedUnicast = groupedUnicastCreateWith;
                }
                try {
                    groupedUnicast.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t11), "The valueSelector returned null"));
                    completeEvictions();
                    if (z11) {
                        spscLinkedArrayQueue.offer(groupedUnicast);
                        drain();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.upstream.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(this.bufferSize);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public GroupedFlowable<K, V> poll() {
            return this.queue.poll();
        }

        public GroupBySubscriber(InterfaceC44417c<? super GroupedFlowable<K, V>> interfaceC44417c, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i11, boolean z11, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.downstream = interfaceC44417c;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i11;
            this.delayError = z11;
            this.groups = map;
            this.evictedGroups = queue;
            this.queue = new SpscLinkedArrayQueue<>(i11);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }

        public void cancel(K k11) {
            if (k11 == null) {
                k11 = (K) NULL_KEY;
            }
            this.groups.remove(k11);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        final State<T, K> state;

        public static <T, K> GroupedUnicast<K, T> createWith(K k11, int i11, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z11) {
            return new GroupedUnicast<>(k11, new State(i11, groupBySubscriber, k11, z11));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th2) {
            this.state.onError(th2);
        }

        public void onNext(T t11) {
            this.state.onNext(t11);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
            this.state.subscribe(interfaceC44417c);
        }

        public GroupedUnicast(K k11, State<T, K> state) {
            super(k11);
            this.state = state;
        }
    }

    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements InterfaceC44416b<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        boolean outputFused;
        final GroupBySubscriber<?, K, T> parent;
        int produced;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<InterfaceC44417c<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();

        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<? super T> interfaceC44417c, boolean z13) {
            if (this.cancelled.get()) {
                this.queue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (z13) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    interfaceC44417c.onError(th2);
                } else {
                    interfaceC44417c.onComplete();
                }
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.queue.clear();
                interfaceC44417c.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            interfaceC44417c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drainFused() {
            Throwable th2;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            InterfaceC44417c<? super T> interfaceC44417c = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (interfaceC44417c != null) {
                    if (this.cancelled.get()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && !this.delayError && (th2 = this.error) != null) {
                        spscLinkedArrayQueue.clear();
                        interfaceC44417c.onError(th2);
                        return;
                    }
                    interfaceC44417c.onNext(null);
                    if (z11) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            interfaceC44417c.onError(th3);
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (interfaceC44417c == null) {
                    interfaceC44417c = this.actual.get();
                }
            }
        }

        public void drainNormal() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z11 = this.delayError;
            InterfaceC44417c<? super T> interfaceC44417c = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (interfaceC44417c != null) {
                    long j11 = this.requested.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        boolean z12 = this.done;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z13 = tPoll == null;
                        if (checkTerminated(z12, z13, interfaceC44417c, z11)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        interfaceC44417c.onNext(tPoll);
                        j12++;
                    }
                    if (j12 == j11 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC44417c, z11)) {
                        return;
                    }
                    if (j12 != 0) {
                        if (j11 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j12);
                        }
                        this.parent.upstream.request(j12);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (interfaceC44417c == null) {
                    interfaceC44417c = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        public void onNext(T t11) {
            this.queue.offer(t11);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T tPoll = this.queue.poll();
            if (tPoll != null) {
                this.produced++;
                return tPoll;
            }
            int i11 = this.produced;
            if (i11 == 0) {
                return null;
            }
            this.produced = 0;
            this.parent.upstream.request(i11);
            return null;
        }

        @Override // sh0.InterfaceC44416b
        public void subscribe(InterfaceC44417c<? super T> interfaceC44417c) {
            if (!this.once.compareAndSet(false, true)) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), interfaceC44417c);
                return;
            }
            interfaceC44417c.onSubscribe(this);
            this.actual.lazySet(interfaceC44417c);
            drain();
        }

        public State(int i11, GroupBySubscriber<?, K, T> groupBySubscriber, K k11, boolean z11) {
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.parent = groupBySubscriber;
            this.key = k11;
            this.delayError = z11;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super GroupedFlowable<K, V>> interfaceC44417c) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        try {
            if (this.mapFactory == null) {
                mapApply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = this.mapFactory.apply(new EvictionAction(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(interfaceC44417c, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, mapApply, concurrentLinkedQueue));
        } catch (Exception e11) {
            Exceptions.throwIfFatal(e11);
            interfaceC44417c.onSubscribe(EmptyComponent.INSTANCE);
            interfaceC44417c.onError(e11);
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i11, boolean z11, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i11;
        this.delayError = z11;
        this.mapFactory = function3;
    }
}
