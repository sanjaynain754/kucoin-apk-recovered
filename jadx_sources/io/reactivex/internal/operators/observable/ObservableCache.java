package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {
    static final CacheDisposable[] EMPTY = new CacheDisposable[0];
    static final CacheDisposable[] TERMINATED = new CacheDisposable[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicReference<CacheDisposable<T>[]> observers;
    final AtomicBoolean once;
    volatile long size;
    Node<T> tail;
    int tailOffset;

    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        long index;
        Node<T> node;
        int offset;
        final ObservableCache<T> parent;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.parent.remove(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        public CacheDisposable(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.downstream = observer;
            this.parent = observableCache;
            this.node = observableCache.head;
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.done = true;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i11) {
            this.values = (T[]) new Object[i11];
        }
    }

    public void add(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!C1454t.m2255a(this.observers, cacheDisposableArr, cacheDisposableArr2));
    }

    public long cachedEventCount() {
        return this.size;
    }

    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    public boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.error = th2;
        this.done = true;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
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
        for (CacheDisposable<T> cacheDisposable : this.observers.get()) {
            replay(cacheDisposable);
        }
    }

    public void remove(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (cacheDisposableArr[i11] == cacheDisposable) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = EMPTY;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i11);
                System.arraycopy(cacheDisposableArr, i11 + 1, cacheDisposableArr3, i11, (length - i11) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!C1454t.m2255a(this.observers, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(observer, this);
        observer.onSubscribe(cacheDisposable);
        add(cacheDisposable);
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            replay(cacheDisposable);
        } else {
            this.source.subscribe(this);
        }
    }

    public ObservableCache(Observable<T> observable, int i11) {
        super(observable);
        this.capacityHint = i11;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i11);
        this.head = node;
        this.tail = node;
        this.observers = new AtomicReference<>(EMPTY);
    }

    public void replay(CacheDisposable<T> cacheDisposable) {
        boolean z11;
        if (cacheDisposable.getAndIncrement() == 0) {
            long j11 = cacheDisposable.index;
            int i11 = cacheDisposable.offset;
            Node<T> node = cacheDisposable.node;
            Observer<? super T> observer = cacheDisposable.downstream;
            int i12 = this.capacityHint;
            int iAddAndGet = 1;
            while (!cacheDisposable.disposed) {
                boolean z12 = this.done;
                if (this.size == j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 && z11) {
                    cacheDisposable.node = null;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (!z11) {
                    if (i11 == i12) {
                        node = node.next;
                        i11 = 0;
                    }
                    observer.onNext(node.values[i11]);
                    i11++;
                    j11++;
                } else {
                    cacheDisposable.index = j11;
                    cacheDisposable.offset = i11;
                    cacheDisposable.node = node;
                    iAddAndGet = cacheDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cacheDisposable.node = null;
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }
}
