package io.reactivex.internal.observers;

import androidx.camera.view.C1454t;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class FutureSingleObserver<T> extends CountDownLatch implements SingleObserver<T>, Future<T>, Disposable {
    Throwable error;
    final AtomicReference<Disposable> upstream;
    T value;

    public FutureSingleObserver() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.error;
        if (th2 == null) {
            return this.value;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        Disposable disposable;
        DisposableHelper disposableHelper;
        do {
            disposable = this.upstream.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!C1454t.m2255a(this.upstream, disposable, disposableHelper));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        Disposable disposable;
        do {
            disposable = this.upstream.get();
            if (disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
        } while (!C1454t.m2255a(this.upstream, disposable, this));
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t11) {
        Disposable disposable = this.upstream.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return;
        }
        this.value = t11;
        C1454t.m2255a(this.upstream, disposable, this);
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j11, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j11, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.error;
            if (th2 == null) {
                return this.value;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }
}
