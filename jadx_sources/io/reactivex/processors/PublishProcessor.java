package io.reactivex.processors;

import androidx.camera.view.C1454t;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {
    Throwable error;
    final AtomicReference<PublishSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    static final PublishSubscription[] TERMINATED = new PublishSubscription[0];
    static final PublishSubscription[] EMPTY = new PublishSubscription[0];

    public static final class PublishSubscription<T> extends AtomicLong implements InterfaceC44418d {
        private static final long serialVersionUID = 3562861878281475070L;
        final InterfaceC44417c<? super T> downstream;
        final PublishProcessor<T> parent;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public PublishSubscription(InterfaceC44417c<? super T> interfaceC44417c, PublishProcessor<T> publishProcessor) {
            this.downstream = interfaceC44417c;
            this.parent = publishProcessor;
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        public void onNext(T t11) {
            long j11 = get();
            if (j11 == Long.MIN_VALUE) {
                return;
            }
            if (j11 != 0) {
                this.downstream.onNext(t11);
                BackpressureHelper.producedCancel(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.addCancel(this, j11);
            }
        }
    }

    public boolean offer(T t11) {
        if (t11 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        for (PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.isFull()) {
                return false;
            }
        }
        for (PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.onNext(t11);
        }
        return true;
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishProcessor<T> create() {
        return new PublishProcessor<>();
    }

    public boolean add(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!C1454t.m2255a(this.subscribers, publishSubscriptionArr, publishSubscriptionArr2));
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

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onComplete();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.error = th2;
        for (PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onError(th2);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription<T> publishSubscription : this.subscribers.get()) {
            publishSubscription.onNext(t11);
        }
    }

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (this.subscribers.get() == TERMINATED) {
            interfaceC44418d.cancel();
        } else {
            interfaceC44418d.request(Long.MAX_VALUE);
        }
    }

    public void remove(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED || publishSubscriptionArr == EMPTY) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (publishSubscriptionArr[i11] == publishSubscription) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = EMPTY;
            } else {
                PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i11);
                System.arraycopy(publishSubscriptionArr, i11 + 1, publishSubscriptionArr3, i11, (length - i11) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!C1454t.m2255a(this.subscribers, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(interfaceC44417c, this);
        interfaceC44417c.onSubscribe(publishSubscription);
        if (add(publishSubscription)) {
            if (publishSubscription.isCancelled()) {
                remove(publishSubscription);
            }
        } else {
            Throwable th2 = this.error;
            if (th2 != null) {
                interfaceC44417c.onError(th2);
            } else {
                interfaceC44417c.onComplete();
            }
        }
    }
}
