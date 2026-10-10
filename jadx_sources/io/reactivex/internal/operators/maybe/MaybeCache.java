package io.reactivex.internal.operators.maybe;

import androidx.camera.view.C1454t;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {
    static final CacheDisposable[] EMPTY = new CacheDisposable[0];
    static final CacheDisposable[] TERMINATED = new CacheDisposable[0];
    Throwable error;
    final AtomicReference<CacheDisposable<T>[]> observers = new AtomicReference<>(EMPTY);
    final AtomicReference<MaybeSource<T>> source;
    T value;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        final MaybeObserver<? super T> downstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        public CacheDisposable(MaybeObserver<? super T> maybeObserver, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    public boolean add(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!C1454t.m2255a(this.observers, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.getDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th2) {
        this.error = th2;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.getDisposed()) {
                cacheDisposable.downstream.onError(th2);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t11) {
        this.value = t11;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.getDisposed()) {
                cacheDisposable.downstream.onSuccess(t11);
            }
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

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(cacheDisposable);
        if (add(cacheDisposable)) {
            if (cacheDisposable.getDisposed()) {
                remove(cacheDisposable);
                return;
            }
            MaybeSource<T> andSet = this.source.getAndSet(null);
            if (andSet != null) {
                andSet.subscribe(this);
                return;
            }
            return;
        }
        if (cacheDisposable.getDisposed()) {
            return;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            maybeObserver.onError(th2);
            return;
        }
        T t11 = this.value;
        if (t11 != null) {
            maybeObserver.onSuccess(t11);
        } else {
            maybeObserver.onComplete();
        }
    }

    public MaybeCache(MaybeSource<T> maybeSource) {
        this.source = new AtomicReference<>(maybeSource);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
    }
}
