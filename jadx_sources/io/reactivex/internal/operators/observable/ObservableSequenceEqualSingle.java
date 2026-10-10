package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {
    final int bufferSize;
    final BiPredicate<? super T, ? super T> comparer;
    final ObservableSource<? extends T> first;
    final ObservableSource<? extends T> second;

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final BiPredicate<? super T, ? super T> comparer;
        final SingleObserver<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final EqualObserver<T>[] observers;
        final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
        final ObservableSource<? extends T> second;

        /* JADX INFO: renamed from: v1 */
        T f87184v1;

        /* JADX INFO: renamed from: v2 */
        T f87185v2;

        public void cancel(SpscLinkedArrayQueue<T> spscLinkedArrayQueue, SpscLinkedArrayQueue<T> spscLinkedArrayQueue2) {
            this.cancelled = true;
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver<T>[] equalObserverArr = this.observers;
                equalObserverArr[0].queue.clear();
                equalObserverArr[1].queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        public boolean setDisposable(Disposable disposable, int i11) {
            return this.resources.setResource(i11, disposable);
        }

        public void subscribe() {
            EqualObserver<T>[] equalObserverArr = this.observers;
            this.first.subscribe(equalObserverArr[0]);
            this.second.subscribe(equalObserverArr[1]);
        }

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i11, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = biPredicate;
            this.observers = new EqualObserver[]{new EqualObserver<>(this, 0, i11), new EqualObserver<>(this, 1, i11)};
        }

        public void drain() {
            boolean z11;
            boolean z12;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() == 0) {
                EqualObserver<T>[] equalObserverArr = this.observers;
                EqualObserver<T> equalObserver = equalObserverArr[0];
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.queue;
                EqualObserver<T> equalObserver2 = equalObserverArr[1];
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.queue;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z13 = equalObserver.done;
                    if (z13 && (th3 = equalObserver.error) != null) {
                        cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.downstream.onError(th3);
                        return;
                    }
                    boolean z14 = equalObserver2.done;
                    if (z14 && (th2 = equalObserver2.error) != null) {
                        cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.downstream.onError(th2);
                        return;
                    }
                    if (this.f87184v1 == null) {
                        this.f87184v1 = spscLinkedArrayQueue.poll();
                    }
                    if (this.f87184v1 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f87185v2 == null) {
                        this.f87185v2 = spscLinkedArrayQueue2.poll();
                    }
                    T t11 = this.f87185v2;
                    if (t11 == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z13 && z14 && z11 && z12) {
                        this.downstream.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z13 && z14 && z11 != z12) {
                        cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.downstream.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (!z11 && !z12) {
                        try {
                            if (!this.comparer.test(this.f87184v1, t11)) {
                                cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                                this.downstream.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f87184v1 = null;
                                this.f87185v2 = null;
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.downstream.onError(th4);
                            return;
                        }
                    }
                    if (z11 || z12) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
                spscLinkedArrayQueue2.clear();
            }
        }
    }

    public static final class EqualObserver<T> implements Observer<T> {
        volatile boolean done;
        Throwable error;
        final int index;
        final EqualCoordinator<T> parent;
        final SpscLinkedArrayQueue<T> queue;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.queue.offer(t11);
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.parent.setDisposable(disposable, this.index);
        }

        public EqualObserver(EqualCoordinator<T> equalCoordinator, int i11, int i12) {
            this.parent = equalCoordinator;
            this.index = i11;
            this.queue = new SpscLinkedArrayQueue<>(i12);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqual(this.first, this.second, this.comparer, this.bufferSize));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.bufferSize, this.first, this.second, this.comparer);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }

    public ObservableSequenceEqualSingle(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i11) {
        this.first = observableSource;
        this.second = observableSource2;
        this.comparer = biPredicate;
        this.bufferSize = i11;
    }
}
