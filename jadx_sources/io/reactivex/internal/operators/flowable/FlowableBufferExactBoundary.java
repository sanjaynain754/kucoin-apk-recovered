package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    final InterfaceC44416b<B> boundary;
    final Callable<U> bufferSupplier;

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        final BufferExactBoundarySubscriber<T, U, B> parent;

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.onError(th2);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(B b11) {
            this.parent.next();
        }

        public BufferBoundarySubscriber(BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.parent = bufferExactBoundarySubscriber;
        }
    }

    public static final class BufferExactBoundarySubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, InterfaceC44418d, Disposable {
        final InterfaceC44416b<B> boundary;
        U buffer;
        final Callable<U> bufferSupplier;
        Disposable other;
        InterfaceC44418d upstream;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(InterfaceC44417c interfaceC44417c, Object obj) {
            return accept((InterfaceC44417c<? super Collection>) interfaceC44417c, (Collection) obj);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            synchronized (this) {
                try {
                    U u11 = this.buffer;
                    if (u11 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u11);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    U u11 = this.buffer;
                    if (u11 == null) {
                        return;
                    }
                    u11.add(t11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public BufferExactBoundarySubscriber(InterfaceC44417c<? super U> interfaceC44417c, Callable<U> callable, InterfaceC44416b<B> interfaceC44416b) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundary = interfaceC44416b;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(InterfaceC44417c<? super U> interfaceC44417c, U u11) {
            this.downstream.onNext((Object) u11);
            return true;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.other.dispose();
            this.upstream.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        public void next() {
            try {
                U u11 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u12 = this.buffer;
                        if (u12 == null) {
                            return;
                        }
                        this.buffer = u11;
                        fastPathEmitMax(u12, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    this.other = bufferBoundarySubscriber;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    interfaceC44418d.request(Long.MAX_VALUE);
                    this.boundary.subscribe(bufferBoundarySubscriber);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    interfaceC44418d.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            cancel();
            this.downstream.onError(th2);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super U> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new BufferExactBoundarySubscriber(new SerializedSubscriber(interfaceC44417c), this.bufferSupplier, this.boundary));
    }

    public FlowableBufferExactBoundary(Flowable<T> flowable, InterfaceC44416b<B> interfaceC44416b, Callable<U> callable) {
        super(flowable);
        this.boundary = interfaceC44416b;
        this.bufferSupplier = callable;
    }
}
