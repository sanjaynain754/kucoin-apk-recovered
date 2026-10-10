package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {
    final Iterable<? extends CompletableSource> sources;

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.sources.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            while (!compositeDisposable.getDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeDisposable.getDisposed()) {
                            return;
                        }
                        try {
                            CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (compositeDisposable.getDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completableSource.subscribe(new CompletableMergeDelayErrorArray.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            atomicThrowable.addThrowable(th2);
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    atomicThrowable.addThrowable(th3);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate == null) {
                        completableObserver.onComplete();
                        return;
                    } else {
                        completableObserver.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            completableObserver.onError(th4);
        }
    }

    public CompletableMergeDelayErrorIterable(Iterable<? extends CompletableSource> iterable) {
        this.sources = iterable;
    }
}
