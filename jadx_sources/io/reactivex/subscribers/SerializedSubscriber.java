package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, InterfaceC44418d {
    static final int QUEUE_LINK_SIZE = 4;
    final boolean delayError;
    volatile boolean done;
    final InterfaceC44417c<? super T> downstream;
    boolean emitting;
    AppendOnlyLinkedArrayList<Object> queue;
    InterfaceC44418d upstream;

    public SerializedSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
        this(interfaceC44417c, false);
    }

    public void emitLoop() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.downstream));
    }

    public SerializedSubscriber(InterfaceC44417c<? super T> interfaceC44417c, boolean z11) {
        this.downstream = interfaceC44417c;
        this.delayError = z11;
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (!this.emitting) {
                    this.done = true;
                    this.emitting = true;
                    this.downstream.onComplete();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.done) {
                    if (this.emitting) {
                        this.done = true;
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        Object objError = NotificationLite.error(th2);
                        if (this.delayError) {
                            appendOnlyLinkedArrayList.add(objError);
                        } else {
                            appendOnlyLinkedArrayList.setFirst(objError);
                        }
                        return;
                    }
                    this.done = true;
                    this.emitting = true;
                    z11 = false;
                }
                if (z11) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.downstream.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.done) {
            return;
        }
        if (t11 == null) {
            this.upstream.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (!this.emitting) {
                    this.emitting = true;
                    this.downstream.onNext(t11);
                    emitLoop();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
            this.upstream = interfaceC44418d;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        this.upstream.request(j11);
    }
}
