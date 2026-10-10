package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableFromSingle<T> extends Completable {
    final SingleSource<T> single;

    public static final class CompletableFromSingleObserver<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: co */
        final CompletableObserver f87135co;

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f87135co.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f87135co.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t11) {
            this.f87135co.onComplete();
        }

        public CompletableFromSingleObserver(CompletableObserver completableObserver) {
            this.f87135co = completableObserver;
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.single.subscribe(new CompletableFromSingleObserver(completableObserver));
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.single = singleSource;
    }
}
