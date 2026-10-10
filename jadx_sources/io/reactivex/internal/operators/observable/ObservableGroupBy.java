package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractObservableWithUpstream<T, GroupedObservable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final Function<? super T, ? extends K> keySelector;
    final Function<? super T, ? extends V> valueSelector;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        final Observer<? super GroupedObservable<K, V>> downstream;
        final Function<? super T, ? extends K> keySelector;
        Disposable upstream;
        final Function<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final Map<Object, GroupedUnicast<K, V>> groups = new ConcurrentHashMap();

        public void cancel(K k11) {
            if (k11 == null) {
                k11 = (K) NULL_KEY;
            }
            this.groups.remove(k11);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled.get();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GroupedUnicast) it.next()).onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GroupedUnicast) it.next()).onError(th2);
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            try {
                K kApply = this.keySelector.apply(t11);
                Object obj = kApply != null ? kApply : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicast = this.groups.get(obj);
                GroupedUnicast groupedUnicast2 = groupedUnicast;
                if (groupedUnicast == false) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    GroupedUnicast<K, V> groupedUnicastCreateWith = GroupedUnicast.createWith(kApply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicastCreateWith);
                    getAndIncrement();
                    this.downstream.onNext(groupedUnicastCreateWith);
                    groupedUnicast2 = groupedUnicastCreateWith;
                }
                try {
                    groupedUnicast2.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t11), "The value supplied is null"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.upstream.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public GroupByObserver(Observer<? super GroupedObservable<K, V>> observer, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i11, boolean z11) {
            this.downstream = observer;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i11;
            this.delayError = z11;
            lazySet(1);
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {
        final State<T, K> state;

        public static <T, K> GroupedUnicast<K, T> createWith(K k11, int i11, GroupByObserver<?, K, T> groupByObserver, boolean z11) {
            return new GroupedUnicast<>(k11, new State(i11, groupByObserver, k11, z11));
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

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer<? super T> observer) {
            this.state.subscribe(observer);
        }

        public GroupedUnicast(K k11, State<T, K> state) {
            super(k11);
            this.state = state;
        }
    }

    public static final class State<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final GroupByObserver<?, K, T> parent;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicReference<Observer<? super T>> actual = new AtomicReference<>();

        public void onComplete() {
            this.done = true;
            drain();
        }

        public boolean checkTerminated(boolean z11, boolean z12, Observer<? super T> observer, boolean z13) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                this.actual.lazySet(null);
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
                this.actual.lazySet(null);
                if (th2 != null) {
                    observer.onError(th2);
                } else {
                    observer.onComplete();
                }
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.queue.clear();
                this.actual.lazySet(null);
                observer.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            this.actual.lazySet(null);
            observer.onComplete();
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                this.parent.cancel(this.key);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled.get();
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

        @Override // io.reactivex.ObservableSource
        public void subscribe(Observer<? super T> observer) {
            if (!this.once.compareAndSet(false, true)) {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), observer);
                return;
            }
            observer.onSubscribe(this);
            this.actual.lazySet(observer);
            if (this.cancelled.get()) {
                this.actual.lazySet(null);
            } else {
                drain();
            }
        }

        public State(int i11, GroupByObserver<?, K, T> groupByObserver, K k11, boolean z11) {
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.parent = groupByObserver;
            this.key = k11;
            this.delayError = z11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
                boolean z12 = this.delayError;
                Observer<? super T> observer = this.actual.get();
                int iAddAndGet = 1;
                while (true) {
                    if (observer != null) {
                        while (true) {
                            boolean z13 = this.done;
                            T tPoll = spscLinkedArrayQueue.poll();
                            if (tPoll == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!checkTerminated(z13, z11, observer, z12)) {
                                if (z11) {
                                    break;
                                } else {
                                    observer.onNext(tPoll);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                    if (observer == null) {
                        observer = this.actual.get();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super GroupedObservable<K, V>> observer) {
        this.source.subscribe(new GroupByObserver(observer, this.keySelector, this.valueSelector, this.bufferSize, this.delayError));
    }

    public ObservableGroupBy(ObservableSource<T> observableSource, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i11, boolean z11) {
        super(observableSource);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
