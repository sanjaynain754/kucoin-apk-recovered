package io.reactivex.processors;

import androidx.camera.view.C1454t;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {
    static final AsyncSubscription[] EMPTY = new AsyncSubscription[0];
    static final AsyncSubscription[] TERMINATED = new AsyncSubscription[0];
    Throwable error;
    final AtomicReference<AsyncSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    T value;

    @Deprecated
    public Object[] getValues() {
        T value = getValue();
        return value != null ? new Object[]{value} : new Object[0];
    }

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        public AsyncSubscription(InterfaceC44417c<? super T> interfaceC44417c, AsyncProcessor<T> asyncProcessor) {
            super(interfaceC44417c);
            this.parent = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            if (super.tryCancel()) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (!isCancelled()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (isCancelled()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncProcessor<T> create() {
        return new AsyncProcessor<>();
    }

    public boolean add(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.subscribers.get();
            if (asyncSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!C1454t.m2255a(this.subscribers, asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.subscribers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.subscribers.get() == TERMINATED && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.subscribers.get() == TERMINATED && this.error != null;
    }

    public boolean hasValue() {
        return this.subscribers.get() == TERMINATED && this.value != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = TERMINATED;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t11 = this.value;
        AsyncSubscription<T>[] andSet = this.subscribers.getAndSet(asyncSubscriptionArr2);
        int i11 = 0;
        if (t11 == null) {
            int length = andSet.length;
            while (i11 < length) {
                andSet[i11].onComplete();
                i11++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i11 < length2) {
            andSet[i11].complete(t11);
            i11++;
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = TERMINATED;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.value = null;
        this.error = th2;
        for (AsyncSubscription<T> asyncSubscription : this.subscribers.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(th2);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() == TERMINATED) {
            return;
        }
        this.value = t11;
    }

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (this.subscribers.get() == TERMINATED) {
            interfaceC44418d.cancel();
        } else {
            interfaceC44418d.request(Long.MAX_VALUE);
        }
    }

    public void remove(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.subscribers.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (asyncSubscriptionArr[i11] == asyncSubscription) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = EMPTY;
            } else {
                AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i11);
                System.arraycopy(asyncSubscriptionArr, i11 + 1, asyncSubscriptionArr3, i11, (length - i11) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!C1454t.m2255a(this.subscribers, asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(interfaceC44417c, this);
        interfaceC44417c.onSubscribe(asyncSubscription);
        if (add(asyncSubscription)) {
            if (asyncSubscription.isCancelled()) {
                remove(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            interfaceC44417c.onError(th2);
            return;
        }
        T t11 = this.value;
        if (t11 != null) {
            asyncSubscription.complete(t11);
        } else {
            asyncSubscription.onComplete();
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }
}
