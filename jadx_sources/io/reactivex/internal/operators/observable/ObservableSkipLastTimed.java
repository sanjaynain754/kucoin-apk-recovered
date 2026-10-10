package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final Observer<? super T> downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        Disposable upstream;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z11 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j11 = this.time;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z12 = this.done;
                Long l11 = (Long) spscLinkedArrayQueue.peek();
                boolean z13 = l11 == null;
                long jNow = scheduler.now(timeUnit);
                if (!z13 && l11.longValue() > jNow - j11) {
                    z13 = true;
                }
                if (z12) {
                    if (!z11) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.queue.clear();
                            observer.onError(th2);
                            return;
                        } else if (z13) {
                            observer.onComplete();
                            return;
                        }
                    } else if (z13) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            observer.onError(th3);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    spscLinkedArrayQueue.poll();
                    observer.onNext(spscLinkedArrayQueue.poll());
                }
            }
            this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t11);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public SkipLastTimedObserver(Observer<? super T> observer, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, boolean z11) {
            this.downstream = observer;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.delayError = z11;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new SkipLastTimedObserver(observer, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }

    public ObservableSkipLastTimed(ObservableSource<T> observableSource, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, boolean z11) {
        super(observableSource);
        this.time = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
