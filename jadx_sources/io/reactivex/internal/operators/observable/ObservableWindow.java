package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableWindow<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int capacityHint;
    final long count;
    final long skip;

    public static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final Observer<? super Observable<T>> downstream;
        long size;
        Disposable upstream;
        UnicastSubject<T> window;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onError(th2);
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            UnicastSubject<T> unicastSubjectCreate = this.window;
            if (unicastSubjectCreate == null && !this.cancelled) {
                unicastSubjectCreate = UnicastSubject.create(this.capacityHint, this);
                this.window = unicastSubjectCreate;
                this.downstream.onNext(unicastSubjectCreate);
            }
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t11);
                long j11 = this.size + 1;
                this.size = j11;
                if (j11 >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    unicastSubjectCreate.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
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

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }

        public WindowExactObserver(Observer<? super Observable<T>> observer, long j11, int i11) {
            this.downstream = observer;
            this.count = j11;
            this.capacityHint = i11;
        }
    }

    public static final class WindowSkipObserver<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final Observer<? super Observable<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        Disposable upstream;
        final AtomicInteger wip = new AtomicInteger();
        final ArrayDeque<UnicastSubject<T>> windows = new ArrayDeque<>();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
            long j11 = this.index;
            long j12 = this.skip;
            if (j11 % j12 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.capacityHint, this);
                arrayDeque.offer(unicastSubjectCreate);
                this.downstream.onNext(unicastSubjectCreate);
            }
            long j13 = this.firstEmission + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t11);
            }
            if (j13 >= this.count) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = j13 - j12;
            } else {
                this.firstEmission = j13;
            }
            this.index = j11 + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }

        public WindowSkipObserver(Observer<? super Observable<T>> observer, long j11, long j12, int i11) {
            this.downstream = observer;
            this.count = j11;
            this.skip = j12;
            this.capacityHint = i11;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        if (this.count == this.skip) {
            this.source.subscribe(new WindowExactObserver(observer, this.count, this.capacityHint));
        } else {
            this.source.subscribe(new WindowSkipObserver(observer, this.count, this.skip, this.capacityHint));
        }
    }

    public ObservableWindow(ObservableSource<T> observableSource, long j11, long j12, int i11) {
        super(observableSource);
        this.count = j11;
        this.skip = j12;
        this.capacityHint = i11;
    }
}
