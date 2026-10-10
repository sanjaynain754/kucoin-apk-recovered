package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final Observer<? super T> downstream;
        Throwable error;
        boolean outputFused;
        SimpleQueue<T> queue;
        int sourceMode;
        Disposable upstream;
        final Scheduler.Worker worker;

        public void drainFused() {
            int iAddAndGet = 1;
            while (!this.disposed) {
                boolean z11 = this.done;
                Throwable th2 = this.error;
                if (!this.delayError && z11 && th2 != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z11) {
                    this.disposed = true;
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        this.downstream.onError(th3);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public boolean checkTerminated(boolean z11, boolean z12, Observer<? super T> observer) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.error;
            if (this.delayError) {
                if (!z12) {
                    return false;
                }
                this.disposed = true;
                if (th2 != null) {
                    observer.onError(th2);
                } else {
                    observer.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th2 != null) {
                this.disposed = true;
                this.queue.clear();
                observer.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z12) {
                return false;
            }
            this.disposed = true;
            observer.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drainNormal() {
            SimpleQueue<T> simpleQueue = this.queue;
            Observer<? super T> observer = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminated(this.done, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z11 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z12 = tPoll == null;
                        if (checkTerminated(z11, z12, observer)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            observer.onNext(tPoll);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.disposed = true;
                        this.upstream.dispose();
                        simpleQueue.clear();
                        observer.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t11);
            }
            schedule();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public ObserveOnObserver(Observer<? super T> observer, Scheduler.Worker worker, boolean z11, int i11) {
            this.downstream = observer;
            this.worker = worker;
            this.delayError = z11;
            this.bufferSize = i11;
        }

        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Scheduler scheduler = this.scheduler;
        if (scheduler instanceof TrampolineScheduler) {
            this.source.subscribe(observer);
        } else {
            this.source.subscribe(new ObserveOnObserver(observer, scheduler.createWorker(), this.delayError, this.bufferSize));
        }
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler, boolean z11, int i11) {
        super(observableSource);
        this.scheduler = scheduler;
        this.delayError = z11;
        this.bufferSize = i11;
    }
}
