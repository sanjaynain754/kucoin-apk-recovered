package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> leftEnd;
    final ObservableSource<? extends TRight> other;
    final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> resultSelector;
    final Function<? super TRight, ? extends ObservableSource<TRightEnd>> rightEnd;

    public static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final Observer<? super R> downstream;
        final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> leftEnd;
        int leftIndex;
        final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> resultSelector;
        final Function<? super TRight, ? extends ObservableSource<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final CompositeDisposable disposables = new CompositeDisposable();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
        final Map<Integer, UnicastSubject<TRight>> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerClose(boolean z11, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                try {
                    this.queue.offer(z11 ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndObserver);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerValue(boolean z11, Object obj) {
            synchronized (this) {
                try {
                    this.queue.offer(z11 ? LEFT_VALUE : RIGHT_VALUE, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            drain();
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void errorAll(Observer<?> observer) {
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            Iterator<UnicastSubject<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.lefts.clear();
            this.rights.clear();
            observer.onError(thTerminate);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerCloseError(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.error, th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerComplete(LeftRightObserver leftRightObserver) {
            this.disposables.delete(leftRightObserver);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerError(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.error, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.active.decrementAndGet();
                drain();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        public GroupJoinDisposable(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
            this.downstream = observer;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        public void drain() {
            boolean z11;
            boolean z12;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
                Observer<? super R> observer = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        spscLinkedArrayQueue.clear();
                        cancelAll();
                        errorAll(observer);
                        return;
                    }
                    if (this.active.get() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Integer num = (Integer) spscLinkedArrayQueue.poll();
                    if (num == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 && z12) {
                        Iterator<UnicastSubject<TRight>> it = this.lefts.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        observer.onComplete();
                        return;
                    }
                    if (z12) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        Object objPoll = spscLinkedArrayQueue.poll();
                        if (num == LEFT_VALUE) {
                            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
                            int i11 = this.leftIndex;
                            this.leftIndex = i11 + 1;
                            this.lefts.put(Integer.valueOf(i11), (UnicastSubject<TRight>) unicastSubjectCreate);
                            try {
                                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.leftEnd.apply(objPoll), "The leftEnd returned a null ObservableSource");
                                LeftRightEndObserver leftRightEndObserver = new LeftRightEndObserver(this, true, i11);
                                this.disposables.add(leftRightEndObserver);
                                observableSource.subscribe(leftRightEndObserver);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(observer);
                                    return;
                                } else {
                                    try {
                                        observer.onNext((Object) ObjectHelper.requireNonNull(this.resultSelector.apply(objPoll, unicastSubjectCreate), "The resultSelector returned a null value"));
                                        Iterator<TRight> it2 = this.rights.values().iterator();
                                        while (it2.hasNext()) {
                                            unicastSubjectCreate.onNext(it2.next());
                                        }
                                    } catch (Throwable th2) {
                                        fail(th2, observer, spscLinkedArrayQueue);
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                fail(th3, observer, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == RIGHT_VALUE) {
                            int i12 = this.rightIndex;
                            this.rightIndex = i12 + 1;
                            this.rights.put(Integer.valueOf(i12), (TRight) objPoll);
                            try {
                                ObservableSource observableSource2 = (ObservableSource) ObjectHelper.requireNonNull(this.rightEnd.apply(objPoll), "The rightEnd returned a null ObservableSource");
                                LeftRightEndObserver leftRightEndObserver2 = new LeftRightEndObserver(this, false, i12);
                                this.disposables.add(leftRightEndObserver2);
                                observableSource2.subscribe(leftRightEndObserver2);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(observer);
                                    return;
                                } else {
                                    Iterator<UnicastSubject<TRight>> it3 = this.lefts.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(objPoll);
                                    }
                                }
                            } catch (Throwable th4) {
                                fail(th4, observer, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            LeftRightEndObserver leftRightEndObserver3 = (LeftRightEndObserver) objPoll;
                            UnicastSubject<TRight> unicastSubjectRemove = this.lefts.remove(Integer.valueOf(leftRightEndObserver3.index));
                            this.disposables.remove(leftRightEndObserver3);
                            if (unicastSubjectRemove != null) {
                                unicastSubjectRemove.onComplete();
                            }
                        } else if (num == RIGHT_CLOSE) {
                            LeftRightEndObserver leftRightEndObserver4 = (LeftRightEndObserver) objPoll;
                            this.rights.remove(Integer.valueOf(leftRightEndObserver4.index));
                            this.disposables.remove(leftRightEndObserver4);
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        public void fail(Throwable th2, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.error, th2);
            spscLinkedArrayQueue.clear();
            cancelAll();
            errorAll(observer);
        }
    }

    public interface JoinSupport {
        void innerClose(boolean z11, LeftRightEndObserver leftRightEndObserver);

        void innerCloseError(Throwable th2);

        void innerComplete(LeftRightObserver leftRightObserver);

        void innerError(Throwable th2);

        void innerValue(boolean z11, Object obj);
    }

    public static final class LeftRightEndObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final JoinSupport parent;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.parent.innerCloseError(th2);
        }

        public LeftRightEndObserver(JoinSupport joinSupport, boolean z11, int i11) {
            this.parent = joinSupport;
            this.isLeft = z11;
            this.index = i11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class LeftRightObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final JoinSupport parent;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.parent.innerError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        public LeftRightObserver(JoinSupport joinSupport, boolean z11) {
            this.parent = joinSupport;
            this.isLeft = z11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(observer, this.leftEnd, this.rightEnd, this.resultSelector);
        observer.onSubscribe(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.disposables.add(leftRightObserver);
        LeftRightObserver leftRightObserver2 = new LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.disposables.add(leftRightObserver2);
        this.source.subscribe(leftRightObserver);
        this.other.subscribe(leftRightObserver2);
    }

    public ObservableGroupJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.other = observableSource2;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }
}
