package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    final Callable<U> bufferSupplier;
    final int count;
    final int skip;

    public static final class BufferExactObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        final int count;
        final Observer<? super U> downstream;
        int size;
        Disposable upstream;

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.buffer = null;
            this.downstream.onError(th2);
        }

        public boolean createBuffer() {
            try {
                this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.buffer = null;
                Disposable disposable = this.upstream;
                if (disposable == null) {
                    EmptyDisposable.error(th2, this.downstream);
                    return false;
                }
                disposable.dispose();
                this.downstream.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream.getDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u11 = this.buffer;
            if (u11 != null) {
                this.buffer = null;
                if (!u11.isEmpty()) {
                    this.downstream.onNext(u11);
                }
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            U u11 = this.buffer;
            if (u11 != null) {
                u11.add(t11);
                int i11 = this.size + 1;
                this.size = i11;
                if (i11 >= this.count) {
                    this.downstream.onNext(u11);
                    this.size = 0;
                    createBuffer();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public BufferExactObserver(Observer<? super U> observer, int i11, Callable<U> callable) {
            this.downstream = observer;
            this.count = i11;
            this.bufferSupplier = callable;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final Observer<? super U> downstream;
        long index;
        final int skip;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream.getDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.buffers.clear();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            long j11 = this.index;
            this.index = 1 + j11;
            if (j11 % ((long) this.skip) == 0) {
                try {
                    this.buffers.offer((U) ((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th2) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t11);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public BufferSkipObserver(Observer<? super U> observer, int i11, int i12, Callable<U> callable) {
            this.downstream = observer;
            this.count = i11;
            this.skip = i12;
            this.bufferSupplier = callable;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        int i11 = this.skip;
        int i12 = this.count;
        if (i11 != i12) {
            this.source.subscribe(new BufferSkipObserver(observer, this.count, this.skip, this.bufferSupplier));
            return;
        }
        BufferExactObserver bufferExactObserver = new BufferExactObserver(observer, i12, this.bufferSupplier);
        if (bufferExactObserver.createBuffer()) {
            this.source.subscribe(bufferExactObserver);
        }
    }

    public ObservableBuffer(ObservableSource<T> observableSource, int i11, int i12, Callable<U> callable) {
        super(observableSource);
        this.count = i11;
        this.skip = i12;
        this.bufferSupplier = callable;
    }
}
