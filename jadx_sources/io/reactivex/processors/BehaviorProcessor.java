package io.reactivex.processors;

import androidx.camera.view.C1454t;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes23.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {
    long index;
    final ReadWriteLock lock;
    final Lock readLock;
    final AtomicReference<BehaviorSubscription<T>[]> subscribers;
    final AtomicReference<Throwable> terminalEvent;
    final AtomicReference<Object> value;
    final Lock writeLock;
    static final Object[] EMPTY_ARRAY = new Object[0];
    static final BehaviorSubscription[] EMPTY = new BehaviorSubscription[0];
    static final BehaviorSubscription[] TERMINATED = new BehaviorSubscription[0];

    public static final class BehaviorSubscription<T> extends AtomicLong implements InterfaceC44418d, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final InterfaceC44417c<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        AppendOnlyLinkedArrayList<Object> queue;
        final BehaviorProcessor<T> state;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        public void emitFirst() {
            if (this.cancelled) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.cancelled) {
                        return;
                    }
                    if (this.next) {
                        return;
                    }
                    BehaviorProcessor<T> behaviorProcessor = this.state;
                    Lock lock = behaviorProcessor.readLock;
                    lock.lock();
                    this.index = behaviorProcessor.index;
                    Object obj = behaviorProcessor.value.get();
                    lock.unlock();
                    this.emitting = obj != null;
                    this.next = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    emitLoop();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void emitLoop() {
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
            while (!this.cancelled) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            this.emitting = false;
                            return;
                        }
                        this.queue = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                appendOnlyLinkedArrayList.forEachWhile(this);
            }
        }

        public void emitNext(Object obj, long j11) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        if (this.index == j11) {
                            return;
                        }
                        if (this.emitting) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.queue = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.next = true;
                        this.fastPath = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.downstream.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.downstream.onError(NotificationLite.getError(obj));
                return true;
            }
            long j11 = get();
            if (j11 == 0) {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.downstream.onNext((Object) NotificationLite.getValue(obj));
            if (j11 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }

        public BehaviorSubscription(InterfaceC44417c<? super T> interfaceC44417c, BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = interfaceC44417c;
            this.state = behaviorProcessor;
        }

        public boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this, j11);
            }
        }
    }

    public BehaviorProcessor() {
        this.value = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.terminalEvent = new AtomicReference<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    public boolean offer(T t11) {
        if (t11 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        BehaviorSubscription<T>[] behaviorSubscriptionArr = this.subscribers.get();
        for (BehaviorSubscription<T> behaviorSubscription : behaviorSubscriptionArr) {
            if (behaviorSubscription.isFull()) {
                return false;
            }
        }
        Object next = NotificationLite.next(t11);
        setCurrent(next);
        for (BehaviorSubscription<T> behaviorSubscription2 : behaviorSubscriptionArr) {
            behaviorSubscription2.emitNext(next, this.index);
        }
        return true;
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorProcessor<T> create() {
        return new BehaviorProcessor<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorProcessor<T> createDefault(T t11) {
        ObjectHelper.requireNonNull(t11, "defaultValue is null");
        return new BehaviorProcessor<>(t11);
    }

    public boolean add(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.subscribers.get();
            if (behaviorSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!C1454t.m2255a(this.subscribers, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.value.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.value.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.value.get());
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return NotificationLite.isError(this.value.get());
    }

    public boolean hasValue() {
        Object obj = this.value.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        if (C1454t.m2255a(this.terminalEvent, null, ExceptionHelper.TERMINATED)) {
            Object objComplete = NotificationLite.complete();
            for (BehaviorSubscription<T> behaviorSubscription : terminate(objComplete)) {
                behaviorSubscription.emitNext(objComplete, this.index);
            }
        }
    }

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (this.terminalEvent.get() != null) {
            interfaceC44418d.cancel();
        } else {
            interfaceC44418d.request(Long.MAX_VALUE);
        }
    }

    public void remove(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.subscribers.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (behaviorSubscriptionArr[i11] == behaviorSubscription) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = EMPTY;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i11);
                System.arraycopy(behaviorSubscriptionArr, i11 + 1, behaviorSubscriptionArr3, i11, (length - i11) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!C1454t.m2255a(this.subscribers, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    public void setCurrent(Object obj) {
        Lock lock = this.writeLock;
        lock.lock();
        this.index++;
        this.value.lazySet(obj);
        lock.unlock();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        BehaviorSubscription<T> behaviorSubscription = new BehaviorSubscription<>(interfaceC44417c, this);
        interfaceC44417c.onSubscribe(behaviorSubscription);
        if (add(behaviorSubscription)) {
            if (behaviorSubscription.cancelled) {
                remove(behaviorSubscription);
                return;
            } else {
                behaviorSubscription.emitFirst();
                return;
            }
        }
        Throwable th2 = this.terminalEvent.get();
        if (th2 == ExceptionHelper.TERMINATED) {
            interfaceC44417c.onComplete();
        } else {
            interfaceC44417c.onError(th2);
        }
    }

    public int subscriberCount() {
        return this.subscribers.get().length;
    }

    public BehaviorSubscription<T>[] terminate(Object obj) {
        BehaviorSubscription<T>[] andSet = this.subscribers.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr = TERMINATED;
        if (andSet != behaviorSubscriptionArr && (andSet = this.subscribers.getAndSet(behaviorSubscriptionArr)) != behaviorSubscriptionArr) {
            setCurrent(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C1454t.m2255a(this.terminalEvent, null, th2)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        Object objError = NotificationLite.error(th2);
        for (BehaviorSubscription<T> behaviorSubscription : terminate(objError)) {
            behaviorSubscription.emitNext(objError, this.index);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.terminalEvent.get() == null) {
            Object next = NotificationLite.next(t11);
            setCurrent(next);
            for (BehaviorSubscription<T> behaviorSubscription : this.subscribers.get()) {
                behaviorSubscription.emitNext(next, this.index);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] getValues(T[] tArr) {
        Object obj = this.value.get();
        if (obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            Object value = NotificationLite.getValue(obj);
            if (tArr.length != 0) {
                tArr[0] = value;
                if (tArr.length != 1) {
                    tArr[1] = 0;
                }
                return tArr;
            }
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            tArr2[0] = value;
            return tArr2;
        }
        if (tArr.length != 0) {
            tArr[0] = 0;
        }
        return tArr;
    }

    public BehaviorProcessor(T t11) {
        this();
        this.value.lazySet(ObjectHelper.requireNonNull(t11, "defaultValue is null"));
    }
}
