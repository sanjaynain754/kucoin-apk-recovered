package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableConcatArray extends Completable {
    final CompletableSource[] sources;

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableObserver downstream;
        int index;

        /* JADX INFO: renamed from: sd */
        final SequentialDisposable f87132sd = new SequentialDisposable();
        final CompletableSource[] sources;

        public void next() {
            if (!this.f87132sd.getDisposed() && getAndIncrement() == 0) {
                CompletableSource[] completableSourceArr = this.sources;
                while (!this.f87132sd.getDisposed()) {
                    int i11 = this.index;
                    this.index = i11 + 1;
                    if (i11 == completableSourceArr.length) {
                        this.downstream.onComplete();
                        return;
                    } else {
                        completableSourceArr[i11].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f87132sd.replace(disposable);
        }

        public ConcatInnerObserver(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.downstream = completableObserver;
            this.sources = completableSourceArr;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            next();
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, this.sources);
        completableObserver.onSubscribe(concatInnerObserver.f87132sd);
        concatInnerObserver.next();
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.sources = completableSourceArr;
    }
}
