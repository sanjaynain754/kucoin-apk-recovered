package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableCreate<T> extends Flowable<T> {
    final BackpressureStrategy backpressure;
    final FlowableOnSubscribe<T> source;

    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, InterfaceC44418d {
        private static final long serialVersionUID = 7326289992464377023L;
        final InterfaceC44417c<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        @Override // sh0.InterfaceC44418d
        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        public boolean error(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th2);
                return true;
            } finally {
                this.serial.dispose();
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.serial.getDisposed();
        }

        @Override // io.reactivex.FlowableEmitter
        public final FlowableEmitter<T> serialize() {
            return new SerializedEmitter(this);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(Disposable disposable) {
            this.serial.update(disposable);
        }

        public BaseEmitter(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }

        public void complete() {
            if (isCancelled()) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                this.serial.dispose();
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (!tryOnError(th2)) {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // sh0.InterfaceC44418d
        public final void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this, j11);
                onRequested();
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return get();
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th2) {
            return error(th2);
        }

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicInteger wip;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j11 = get();
                long j12 = 0;
                while (j12 != j11) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    T tPoll = spscLinkedArrayQueue.poll();
                    boolean z12 = tPoll == null;
                    if (z11 && z12) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            error(th2);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    interfaceC44417c.onNext(tPoll);
                    j12++;
                }
                if (j12 == j11) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z13 = this.done;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z13 && zIsEmpty) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            error(th3);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this, j12);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t11) {
            if (this.done || isCancelled()) {
                return;
            }
            if (t11 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.offer(t11);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th2) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th2;
            this.done = true;
            drain();
            return true;
        }

        public BufferAsyncEmitter(InterfaceC44417c<? super T> interfaceC44417c, int i11) {
            super(interfaceC44417c);
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onRequested() {
            drain();
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }

        public ErrorAsyncEmitter(InterfaceC44417c<? super T> interfaceC44417c) {
            super(interfaceC44417c);
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            AtomicReference<T> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j11 = get();
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        break;
                    }
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z11 = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z12 = andSet == null;
                    if (z11 && z12) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            error(th2);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    interfaceC44417c.onNext(andSet);
                    j12++;
                }
                if (j12 == j11) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z13 = this.done;
                    boolean z14 = atomicReference.get() == null;
                    if (z13 && z14) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            error(th3);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this, j12);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t11) {
            if (this.done || isCancelled()) {
                return;
            }
            if (t11 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.set(t11);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th2) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th2;
            this.done = true;
            drain();
            return true;
        }

        public LatestAsyncEmitter(InterfaceC44417c<? super T> interfaceC44417c) {
            super(interfaceC44417c);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onRequested() {
            drain();
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final BaseEmitter<T> emitter;
        final AtomicThrowable error = new AtomicThrowable();
        final SimplePlainQueue<T> queue = new SpscLinkedArrayQueue(16);

        public void drainLoop() {
            BaseEmitter<T> baseEmitter = this.emitter;
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int iAddAndGet = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    simplePlainQueue.clear();
                    baseEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z11 = this.done;
                T tPoll = simplePlainQueue.poll();
                boolean z12 = tPoll == null;
                if (z11 && z12) {
                    baseEmitter.onComplete();
                    return;
                } else if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    baseEmitter.onNext(tPoll);
                }
            }
            simplePlainQueue.clear();
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.emitter.isCancelled() || this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t11) {
            if (this.emitter.isCancelled() || this.done) {
                return;
            }
            if (t11 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.emitter.onNext(t11);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                synchronized (simplePlainQueue) {
                    simplePlainQueue.offer(t11);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableEmitter
        public long requested() {
            return this.emitter.requested();
        }

        @Override // io.reactivex.FlowableEmitter
        public void setCancellable(Cancellable cancellable) {
            this.emitter.setCancellable(cancellable);
        }

        @Override // io.reactivex.FlowableEmitter
        public void setDisposable(Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.emitter.toString();
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th2) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th2)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        public SerializedEmitter(BaseEmitter<T> baseEmitter) {
            this.emitter = baseEmitter;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th2) {
            if (!tryOnError(th2)) {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public FlowableEmitter<T> serialize() {
            return this;
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 */
    public static /* synthetic */ class C392261 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureStrategy = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(InterfaceC44417c<? super T> interfaceC44417c) {
            super(interfaceC44417c);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public MissingEmitter(InterfaceC44417c<? super T> interfaceC44417c) {
            super(interfaceC44417c);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t11) {
            long j11;
            if (!isCancelled()) {
                if (t11 != null) {
                    this.downstream.onNext(t11);
                    do {
                        j11 = get();
                        if (j11 == 0) {
                            return;
                        }
                    } while (!compareAndSet(j11, j11 - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public abstract void onOverflow();

        public NoOverflowBaseAsyncEmitter(InterfaceC44417c<? super T> interfaceC44417c) {
            super(interfaceC44417c);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t11) {
            if (isCancelled()) {
                return;
            }
            if (t11 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.downstream.onNext(t11);
                BackpressureHelper.produced(this, 1L);
            } else {
                onOverflow();
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        BaseEmitter missingEmitter;
        int i11 = C392261.$SwitchMap$io$reactivex$BackpressureStrategy[this.backpressure.ordinal()];
        if (i11 == 1) {
            missingEmitter = new MissingEmitter(interfaceC44417c);
        } else if (i11 == 2) {
            missingEmitter = new ErrorAsyncEmitter(interfaceC44417c);
        } else if (i11 != 3) {
            missingEmitter = i11 != 4 ? new BufferAsyncEmitter(interfaceC44417c, Flowable.bufferSize()) : new LatestAsyncEmitter(interfaceC44417c);
        } else {
            missingEmitter = new DropAsyncEmitter(interfaceC44417c);
        }
        interfaceC44417c.onSubscribe(missingEmitter);
        try {
            this.source.subscribe(missingEmitter);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            missingEmitter.onError(th2);
        }
    }

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.source = flowableOnSubscribe;
        this.backpressure = backpressureStrategy;
    }
}
