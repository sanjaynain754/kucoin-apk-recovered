package io.reactivex.subjects;

import androidx.camera.view.C1454t;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ReplaySubject<T> extends Subject<T> {
    final ReplayBuffer<T> buffer;
    boolean done;
    final AtomicReference<ReplayDisposable<T>[]> observers = new AtomicReference<>(EMPTY);
    static final ReplayDisposable[] EMPTY = new ReplayDisposable[0];
    static final ReplayDisposable[] TERMINATED = new ReplayDisposable[0];
    private static final Object[] EMPTY_ARRAY = new Object[0];

    public interface ReplayBuffer<T> {
        void add(T t11);

        void addFinal(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @Nullable
        T getValue();

        T[] getValues(T[] tArr);

        void replay(ReplayDisposable<T> replayDisposable);

        int size();

        void trimHead();
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final Observer<? super T> downstream;
        Object index;
        final ReplaySubject<T> state;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        public ReplayDisposable(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.downstream = observer;
            this.state = replaySubject;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile TimedNode<Object> head;
        final long maxAge;
        final int maxSize;
        final Scheduler scheduler;
        int size;
        TimedNode<Object> tail;
        final TimeUnit unit;

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T t11) {
            TimedNode<Object> timedNode = new TimedNode<>(t11, this.scheduler.now(this.unit));
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.lazySet(timedNode);
            trimFinal();
            this.done = true;
        }

        public TimedNode<Object> getHead() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.head;
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        @Nullable
        public T getValue() {
            T t11;
            TimedNode<Object> timedNode = this.head;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.time >= this.scheduler.now(this.unit) - this.maxAge && (t11 = (T) timedNode.value) != null) {
                return (NotificationLite.isComplete(t11) || NotificationLite.isError(t11)) ? (T) timedNode2.value : t11;
            }
            return null;
        }

        public int size(TimedNode<Object> timedNode) {
            int i11 = 0;
            while (i11 != Integer.MAX_VALUE) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    Object obj = timedNode.value;
                    if (!NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
                        break;
                    }
                    return i11 - 1;
                }
                i11++;
                timedNode = timedNode2;
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
            TimedNode<Object> timedNode = this.head;
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
            TimedNode<Object> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.value == null) {
                        this.head = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.head = timedNode3;
                    return;
                }
                if (timedNode2.time > jNow) {
                    if (timedNode.value == null) {
                        this.head = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0L);
                    timedNode4.lazySet(timedNode.get());
                    this.head = timedNode4;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
            TimedNode<Object> timedNode = this.head;
            if (timedNode.value != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.head = timedNode2;
            }
        }

        public SizeAndTimeBoundReplayBuffer(int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.maxSize = ObjectHelper.verifyPositive(i11, "maxSize");
            this.maxAge = ObjectHelper.verifyPositive(j11, "maxAge");
            this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            TimedNode<Object> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                TimedNode<Object> head = (TimedNode) replayDisposable.index;
                if (head == null) {
                    head = getHead();
                }
                int iAddAndGet = 1;
                while (!replayDisposable.cancelled) {
                    while (true) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        TimedNode<T> timedNode = head.get();
                        if (timedNode == null) {
                            break;
                        }
                        T t11 = timedNode.value;
                        if (this.done && timedNode.get() == null) {
                            if (NotificationLite.isComplete(t11)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.getError(t11));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(t11);
                        head = timedNode;
                    }
                    if (head.get() == null) {
                        replayDisposable.index = head;
                        iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile Node<Object> head;
        final int maxSize;
        int size;
        Node<Object> tail;

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T t11) {
            Node<Object> node = new Node<>(t11);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        @Nullable
        public T getValue() {
            Node<Object> node = this.head;
            Node<Object> node2 = null;
            while (true) {
                Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t11 = (T) node.value;
            if (t11 == null) {
                return null;
            }
            return (NotificationLite.isComplete(t11) || NotificationLite.isError(t11)) ? (T) node2.value : t11;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
            int size = size();
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
                node = node.get();
                tArr[i11] = node.value;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            Node<Object> node = this.head;
            int i11 = 0;
            while (i11 != Integer.MAX_VALUE) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    Object obj = node.value;
                    if (!NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
                        break;
                    }
                    return i11 - 1;
                }
                i11++;
                node = node2;
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
            Node<Object> node = this.head;
            if (node.value != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.head = node2;
            }
        }

        public SizeBoundReplayBuffer(int i11) {
            this.maxSize = ObjectHelper.verifyPositive(i11, "maxSize");
            Node<Object> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                Node<Object> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                int iAddAndGet = 1;
                while (!replayDisposable.cancelled) {
                    Node<T> node2 = node.get();
                    if (node2 == null) {
                        if (node.get() != null) {
                            continue;
                        } else {
                            replayDisposable.index = node;
                            iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    } else {
                        T t11 = node2.value;
                        if (this.done && node2.get() == null) {
                            if (NotificationLite.isComplete(t11)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.getError(t11));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(t11);
                        node = node2;
                    }
                }
                replayDisposable.index = null;
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile boolean done;
        volatile int size;

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T t11) {
            this.buffer.add(t11);
            this.size++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(Object obj) {
            this.buffer.add(obj);
            trimHead();
            this.size++;
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        @Nullable
        public T getValue() {
            int i11 = this.size;
            if (i11 == 0) {
                return null;
            }
            List<Object> list = this.buffer;
            T t11 = (T) list.get(i11 - 1);
            if (!NotificationLite.isComplete(t11) && !NotificationLite.isError(t11)) {
                return t11;
            }
            if (i11 == 1) {
                return null;
            }
            return (T) list.get(i11 - 2);
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i11 = this.size;
            if (i11 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.buffer;
            Object obj = list.get(i11 - 1);
            if ((NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) && (i11 = i11 - 1) == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            int i11 = this.size;
            if (i11 == 0) {
                return 0;
            }
            int i12 = i11 - 1;
            Object obj = this.buffer.get(i12);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i12 : i11;
        }

        public UnboundedReplayBuffer(int i11) {
            this.buffer = new ArrayList(ObjectHelper.verifyPositive(i11, "capacityHint"));
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(ReplayDisposable<T> replayDisposable) {
            int iIntValue;
            int i11;
            if (replayDisposable.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                Observer<? super T> observer = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                    replayDisposable.index = 0;
                }
                int iAddAndGet = 1;
                while (!replayDisposable.cancelled) {
                    int i12 = this.size;
                    while (i12 != iIntValue) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        Object obj = list.get(iIntValue);
                        if (this.done && (i11 = iIntValue + 1) == i12 && i11 == (i12 = this.size)) {
                            if (NotificationLite.isComplete(obj)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.getError(obj));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(obj);
                        iIntValue++;
                    }
                    if (iIntValue == this.size) {
                        replayDisposable.index = Integer.valueOf(iIntValue);
                        iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void trimHead() {
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
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
    public static <T> ReplaySubject<T> create(int i11) {
        return new ReplaySubject<>(new UnboundedReplayBuffer(i11));
    }

    public static <T> ReplaySubject<T> createUnbounded() {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithSize(int i11) {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(i11));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTime(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j11, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTimeAndSize(long j11, TimeUnit timeUnit, Scheduler scheduler, int i11) {
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(i11, j11, timeUnit, scheduler));
    }

    public boolean add(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.observers.get();
            if (replayDisposableArr == TERMINATED) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!C1454t.m2255a(this.observers, replayDisposableArr, replayDisposableArr2));
        return true;
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.buffer.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        return this.buffer.getValue();
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.buffer.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(this.buffer.get());
    }

    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    public int observerCount() {
        return this.observers.get().length;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        Object objComplete = NotificationLite.complete();
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(objComplete);
        for (ReplayDisposable<T> replayDisposable : terminate(objComplete)) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.done = true;
        Object objError = NotificationLite.error(th2);
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.addFinal(objError);
        for (ReplayDisposable<T> replayDisposable : terminate(objError)) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            return;
        }
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.add(t11);
        for (ReplayDisposable<T> replayDisposable : this.observers.get()) {
            replayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.done) {
            disposable.dispose();
        }
    }

    public void remove(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.observers.get();
            if (replayDisposableArr == TERMINATED || replayDisposableArr == EMPTY) {
                return;
            }
            int length = replayDisposableArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (replayDisposableArr[i11] == replayDisposable) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = EMPTY;
            } else {
                ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i11);
                System.arraycopy(replayDisposableArr, i11 + 1, replayDisposableArr3, i11, (length - i11) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!C1454t.m2255a(this.observers, replayDisposableArr, replayDisposableArr2));
    }

    public int size() {
        return this.buffer.size();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(observer, this);
        observer.onSubscribe(replayDisposable);
        if (replayDisposable.cancelled) {
            return;
        }
        if (add(replayDisposable) && replayDisposable.cancelled) {
            remove(replayDisposable);
        } else {
            this.buffer.replay(replayDisposable);
        }
    }

    public ReplayDisposable<T>[] terminate(Object obj) {
        return this.buffer.compareAndSet(null, obj) ? this.observers.getAndSet(TERMINATED) : TERMINATED;
    }

    public ReplaySubject(ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    public T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }
}
