package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final InterfaceC44416b<? extends T>[] sources;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final InterfaceC44417c<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final InterfaceC44416b<? extends T>[] sources;
        final AtomicInteger wip;

        public ConcatArraySubscriber(InterfaceC44416b<? extends T>[] interfaceC44416bArr, boolean z11, InterfaceC44417c<? super T> interfaceC44417c) {
            super(false);
            this.downstream = interfaceC44417c;
            this.sources = interfaceC44416bArr;
            this.delayError = z11;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC44416b<? extends T>[] interfaceC44416bArr = this.sources;
                int length = interfaceC44416bArr.length;
                int i11 = this.index;
                while (i11 != length) {
                    InterfaceC44416b<? extends T> interfaceC44416b = interfaceC44416bArr[i11];
                    if (interfaceC44416b == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.errors;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i11) + 1);
                            this.errors = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i11++;
                    } else {
                        long j11 = this.produced;
                        if (j11 != 0) {
                            this.produced = 0L;
                            produced(j11);
                        }
                        interfaceC44416b.subscribe(this);
                        i11++;
                        this.index = i11;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.errors;
                if (list == null) {
                    this.downstream.onComplete();
                } else if (list.size() == 1) {
                    this.downstream.onError(list.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.delayError) {
                this.downstream.onError(th2);
                return;
            }
            List arrayList = this.errors;
            if (arrayList == null) {
                arrayList = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = arrayList;
            }
            arrayList.add(th2);
            onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.produced++;
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            setSubscription(interfaceC44418d);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, interfaceC44417c);
        interfaceC44417c.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }

    public FlowableConcatArray(InterfaceC44416b<? extends T>[] interfaceC44416bArr, boolean z11) {
        this.sources = interfaceC44416bArr;
        this.delayError = z11;
    }
}
