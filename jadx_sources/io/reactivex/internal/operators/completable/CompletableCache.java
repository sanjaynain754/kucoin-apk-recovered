package io.reactivex.internal.operators.completable;

import androidx.camera.view.C1454t;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableCache extends Completable implements CompletableObserver {
    static final InnerCompletableCache[] EMPTY = new InnerCompletableCache[0];
    static final InnerCompletableCache[] TERMINATED = new InnerCompletableCache[0];
    Throwable error;
    final AtomicReference<InnerCompletableCache[]> observers = new AtomicReference<>(EMPTY);
    final AtomicBoolean once = new AtomicBoolean();
    final CompletableSource source;

    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 8943152917179642732L;
        final CompletableObserver downstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.remove(this);
            }
        }

        public InnerCompletableCache(CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return get();
        }
    }

    public boolean add(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.observers.get();
            if (innerCompletableCacheArr == TERMINATED) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!C1454t.m2255a(this.observers, innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        for (InnerCompletableCache innerCompletableCache : this.observers.getAndSet(TERMINATED)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        this.error = th2;
        for (InnerCompletableCache innerCompletableCache : this.observers.getAndSet(TERMINATED)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onError(th2);
            }
        }
    }

    public void remove(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.observers.get();
            int length = innerCompletableCacheArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (innerCompletableCacheArr[i11] == innerCompletableCache) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr2 = EMPTY;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i11);
                System.arraycopy(innerCompletableCacheArr, i11 + 1, innerCompletableCacheArr3, i11, (length - i11) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!C1454t.m2255a(this.observers, innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        InnerCompletableCache innerCompletableCache = new InnerCompletableCache(completableObserver);
        completableObserver.onSubscribe(innerCompletableCache);
        if (add(innerCompletableCache)) {
            if (innerCompletableCache.getDisposed()) {
                remove(innerCompletableCache);
            }
            if (this.once.compareAndSet(false, true)) {
                this.source.subscribe(this);
                return;
            }
            return;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            completableObserver.onError(th2);
        } else {
            completableObserver.onComplete();
        }
    }

    public CompletableCache(CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
    }
}
