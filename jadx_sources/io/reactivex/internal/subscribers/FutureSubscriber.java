package io.reactivex.internal.subscribers;

import androidx.camera.view.C1454t;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, InterfaceC44418d {
    Throwable error;
    final AtomicReference<InterfaceC44418d> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
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
        InterfaceC44418d interfaceC44418d;
        SubscriptionHelper subscriptionHelper;
        do {
            interfaceC44418d = this.upstream.get();
            if (interfaceC44418d == this || interfaceC44418d == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!C1454t.m2255a(this.upstream, interfaceC44418d, subscriptionHelper));
        if (interfaceC44418d != null) {
            interfaceC44418d.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        InterfaceC44418d interfaceC44418d;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC44418d = this.upstream.get();
            if (interfaceC44418d == this || interfaceC44418d == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!C1454t.m2255a(this.upstream, interfaceC44418d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        InterfaceC44418d interfaceC44418d;
        do {
            interfaceC44418d = this.upstream.get();
            if (interfaceC44418d == this || interfaceC44418d == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
        } while (!C1454t.m2255a(this.upstream, interfaceC44418d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.value == null) {
            this.value = t11;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        SubscriptionHelper.setOnce(this.upstream, interfaceC44418d, Long.MAX_VALUE);
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

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
    }
}
