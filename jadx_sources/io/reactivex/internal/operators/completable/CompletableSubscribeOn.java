package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableSubscribeOn extends Completable {
    final Scheduler scheduler;
    final CompletableSource source;

    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final CompletableObserver downstream;
        final CompletableSource source;
        final SequentialDisposable task = new SequentialDisposable();

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.subscribe(this);
        }

        public SubscribeOnObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.downstream = completableObserver;
            this.source = completableSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(completableObserver, this.source);
        completableObserver.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.scheduler.scheduleDirect(subscribeOnObserver));
    }

    public CompletableSubscribeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.source = completableSource;
        this.scheduler = scheduler;
    }
}
