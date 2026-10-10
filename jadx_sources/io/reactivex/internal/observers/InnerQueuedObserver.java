package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final InnerQueuedObserverSupport<T> parent;
    final int prefetch;
    SimpleQueue<T> queue;

    public void setDone() {
        this.done = true;
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.parent.innerError(this, th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t11) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t11);
        } else {
            this.parent.drain();
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    public InnerQueuedObserver(InnerQueuedObserverSupport<T> innerQueuedObserverSupport, int i11) {
        this.parent = innerQueuedObserverSupport;
        this.prefetch = i11;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueDisposable;
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(-this.prefetch);
        }
    }
}
