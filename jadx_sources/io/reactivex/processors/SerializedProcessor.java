package io.reactivex.processors;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {
    final FlowableProcessor<T> actual;
    volatile boolean done;
    boolean emitting;
    AppendOnlyLinkedArrayList<Object> queue;

    public void emitLoop() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
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
            appendOnlyLinkedArrayList.accept(this.actual);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        return this.actual.getThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.actual.hasComplete();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.actual.hasSubscribers();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.actual.hasThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                this.done = true;
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.queue = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(NotificationLite.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.done) {
                    this.done = true;
                    if (this.emitting) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.emitting = true;
                    z11 = false;
                }
                if (z11) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.actual.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onNext(t11);
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

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        boolean z11 = true;
        if (!this.done) {
            synchronized (this) {
                try {
                    if (!this.done) {
                        if (this.emitting) {
                            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                                this.queue = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.subscription(interfaceC44418d));
                            return;
                        }
                        this.emitting = true;
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z11) {
            interfaceC44418d.cancel();
        } else {
            this.actual.onSubscribe(interfaceC44418d);
            emitLoop();
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.actual.subscribe(interfaceC44417c);
    }

    public SerializedProcessor(FlowableProcessor<T> flowableProcessor) {
        this.actual = flowableProcessor;
    }
}
