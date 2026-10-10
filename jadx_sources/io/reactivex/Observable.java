package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.observers.BlockingFirstObserver;
import io.reactivex.internal.observers.BlockingLastObserver;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.FutureObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.BlockingObservableLatest;
import io.reactivex.internal.operators.observable.BlockingObservableMostRecent;
import io.reactivex.internal.operators.observable.BlockingObservableNext;
import io.reactivex.internal.operators.observable.ObservableAllSingle;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableAnySingle;
import io.reactivex.internal.operators.observable.ObservableBlockingSubscribe;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableBufferExactBoundary;
import io.reactivex.internal.operators.observable.ObservableBufferTimed;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCollectSingle;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCountSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounce;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.internal.operators.observable.ObservableDelay;
import io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther;
import io.reactivex.internal.operators.observable.ObservableDematerialize;
import io.reactivex.internal.operators.observable.ObservableDetach;
import io.reactivex.internal.operators.observable.ObservableDistinct;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.internal.operators.observable.ObservableDoAfterNext;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.internal.operators.observable.ObservableElementAtMaybe;
import io.reactivex.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import io.reactivex.internal.operators.observable.ObservableError;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.internal.operators.observable.ObservableFromArray;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import io.reactivex.internal.operators.observable.ObservableFromFuture;
import io.reactivex.internal.operators.observable.ObservableFromIterable;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.internal.operators.observable.ObservableFromUnsafeSource;
import io.reactivex.internal.operators.observable.ObservableGenerate;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableHide;
import io.reactivex.internal.operators.observable.ObservableIgnoreElements;
import io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.internal.operators.observable.ObservableLastMaybe;
import io.reactivex.internal.operators.observable.ObservableLastSingle;
import io.reactivex.internal.operators.observable.ObservableLift;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableMapNotification;
import io.reactivex.internal.operators.observable.ObservableMaterialize;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableNever;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableReduceMaybe;
import io.reactivex.internal.operators.observable.ObservableReduceSeedSingle;
import io.reactivex.internal.operators.observable.ObservableReduceWithSingle;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableScan;
import io.reactivex.internal.operators.observable.ObservableScanSeed;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSerialized;
import io.reactivex.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.observable.ObservableSkip;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSkipUntil;
import io.reactivex.internal.operators.observable.ObservableSkipWhile;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTake;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastOne;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate;
import io.reactivex.internal.operators.observable.ObservableTakeWhile;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeInterval;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableToList;
import io.reactivex.internal.operators.observable.ObservableToListSingle;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWindowTimed;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.operators.observable.ObservableZipIterable;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.observers.SafeObserver;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.Timed;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Observable<T> implements ObservableSource<T> {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(Function<? super Object[], ? extends R> function, int i11, ObservableSource<? extends T>... observableSourceArr) {
        return combineLatest(observableSourceArr, function, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(observableSourceArr, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concat(Iterable<? extends ObservableSource<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity(), bufferSize(), false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArray(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : RxJavaPlugins.onAssembly(new ObservableConcatMap(fromArray(observableSourceArr), Functions.identity(), bufferSize(), ErrorMode.BOUNDARY));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : concatDelayError(fromArray(observableSourceArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEager(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEager(bufferSize(), bufferSize(), observableSourceArr);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEagerDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), observableSourceArr);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concatDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEager(observableSource, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    private Observable<T> doOnEach(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.requireNonNull(action2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnEach(this, consumer, consumer2, action, action2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> error(Callable<? extends Throwable> callable) {
        ObjectHelper.requireNonNull(callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableError(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromFuture(Future<? extends T> future) {
        ObjectHelper.requireNonNull(future, "future is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future, 0L, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> generate(Consumer<Emitter<T>> consumer) {
        ObjectHelper.requireNonNull(consumer, "generator is null");
        return generate(Functions.nullSupplier(), ObservableInternalHelper.simpleGenerator(consumer), Functions.emptyConsumer());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public static Observable<Long> interval(long j11, long j12, TimeUnit timeUnit) {
        return interval(j11, j12, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public static Observable<Long> intervalRange(long j11, long j12, long j13, long j14, TimeUnit timeUnit) {
        return intervalRange(j11, j12, j13, j14, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11) {
        ObjectHelper.requireNonNull(t11, "item is null");
        return RxJavaPlugins.onAssembly(new ObservableJust(t11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i11, int i12) {
        return fromIterable(iterable).flatMap(Functions.identity(), false, i11, i12);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArray(int i11, int i12, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), false, i11, i12);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArrayDelayError(int i11, int i12, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), true, i11, i12);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity(), true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.equalsPredicate(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource, Functions.identity(), i11, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNextDelayError(observableSource, bufferSize());
    }

    private Observable<T> timeout0(long j11, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "timeUnit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeoutTimed(this, j11, timeUnit, scheduler, observableSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public static Observable<Long> timer(long j11, TimeUnit timeUnit) {
        return timer(j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, D> Observable<T> using(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer) {
        return using(callable, function, consumer, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable, function, bufferSize(), false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zipArray(Function<? super Object[], ? extends R> function, boolean z11, int i11, ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return empty();
        }
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(observableSourceArr, null, function, i11, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingFirst() {
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T tBlockingGet = blockingFirstObserver.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingLast() {
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe(blockingLastObserver);
        T tBlockingGet = blockingLastObserver.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingSingle() {
        T tBlockingGet = singleElement().blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        ObservableBlockingSubscribe.subscribe(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<List<T>> buffer(int i11) {
        return buffer(i11, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMap(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapDelayError(function, bufferSize(), true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapEager(function, Integer.MAX_VALUE, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z11) {
        return concatMapEagerDelayError(function, Integer.MAX_VALUE, bufferSize(), z11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return concat(this, observableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> debounce(Function<? super T, ? extends ObservableSource<U>> function) {
        ObjectHelper.requireNonNull(function, "debounceSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounce(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> delay(Function<? super T, ? extends ObservableSource<U>> function) {
        ObjectHelper.requireNonNull(function, "itemDelay is null");
        return (Observable<T>) flatMap(ObservableInternalHelper.itemDelay(function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> delaySubscription(ObservableSource<U> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableDelaySubscriptionOther(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Deprecated
    public final <T2> Observable<T2> dematerialize() {
        return RxJavaPlugins.onAssembly(new ObservableDematerialize(this, Functions.identity()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> distinct() {
        return distinct(Functions.identity(), Functions.createHashSet());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Maybe<T> elementAt(long j11) {
        if (j11 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableElementAtMaybe(this, j11));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return flatMap((Function) function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEachWhile(Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<GroupedObservable<K, T>> groupBy(Function<? super T, ? extends K> function) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.identity(), false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return merge(this, observableSource);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> observeOn(Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorResumeNext(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        ObjectHelper.requireNonNull(function, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorNext(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final ConnectableObservable<T> publish() {
        return ObservablePublish.create(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Maybe<T> reduce(BiFunction<T, T, T> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceMaybe(this, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final ConnectableObservable<T> replay() {
        return ObservableReplay.createFrom(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry() {
        return retry(Long.MAX_VALUE, Functions.alwaysTrue());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> sample(long j11, TimeUnit timeUnit) {
        return sample(j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> scan(BiFunction<T, T, T> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScan(this, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> skip(long j11) {
        return j11 <= 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkip(this, j11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> skipLast(int i11) {
        if (i11 >= 0) {
            return i11 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkipLast(this, i11));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> sorted() {
        return toList().toObservable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.emptyConsumer());
    }

    public abstract void subscribeActual(Observer<? super T> observer);

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> take(long j11) {
        if (j11 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableTake(this, j11));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> takeLast(int i11) {
        if (i11 >= 0) {
            if (i11 == 0) {
                return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this));
            }
            return i11 == 1 ? RxJavaPlugins.onAssembly(new ObservableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new ObservableTakeLast(this, i11));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> takeUntil(ObservableSource<U> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntil(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> throttleFirst(long j11, TimeUnit timeUnit) {
        return throttleFirst(j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> throttleLast(long j11, TimeUnit timeUnit) {
        return sample(j11, timeUnit);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j11, TimeUnit timeUnit) {
        return throttleLatest(j11, timeUnit, Schedulers.computation(), false);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> throttleWithTimeout(long j11, TimeUnit timeUnit) {
        return debounce(j11, timeUnit);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function) {
        return timeout0(null, function, null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toList() {
        return toList(16);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Single<Map<K, T>> toMap(Function<? super T, ? extends K> function) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        return (Single<Map<K, T>>) collect(HashMapSupplier.asCallable(), Functions.toMapKeySelector(function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Single<Map<K, Collection<T>>> toMultimap(Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<T>>>) toMultimap(function, Functions.identity(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList() {
        return toSortedList(Functions.naturalOrder());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11) {
        return window(j11, j11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> withLatestFrom(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        ObjectHelper.requireNonNull(biFunction, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFrom(this, biFunction, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(iterable, "other is null");
        ObjectHelper.requireNonNull(biFunction, "zipper is null");
        return RxJavaPlugins.onAssembly(new ObservableZipIterable(this, iterable, biFunction));
    }

    /* JADX INFO: renamed from: io.reactivex.Observable$1 */
    /* JADX INFO: loaded from: classes60.dex */
    public static /* synthetic */ class C392211 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureStrategy = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(Function<? super Object[], ? extends R> function, int i11, ObservableSource<? extends T>... observableSourceArr) {
        return combineLatestDelayError(observableSourceArr, function, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEager(int i11, int i12, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.identity(), i11, i12, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEagerDelayError(int i11, int i12, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.identity(), i11, i12, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11, int i12) {
        return wrap(observableSource).concatMapEager(Functions.identity(), i11, i12);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> empty() {
        return RxJavaPlugins.onAssembly(ObservableEmpty.INSTANCE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromArray(T... tArr) {
        ObjectHelper.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        return tArr.length == 1 ? just(tArr[0]) : RxJavaPlugins.onAssembly(new ObservableFromArray(tArr));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    @NonNull
    public static Observable<Long> interval(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableInterval(Math.max(0L, j11), Math.max(0L, j12), timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    @NonNull
    public static Observable<Long> intervalRange(long j11, long j12, long j13, long j14, TimeUnit timeUnit, Scheduler scheduler) {
        if (j12 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j12);
        }
        if (j12 == 0) {
            return empty().delay(j13, timeUnit, scheduler);
        }
        long j15 = (j12 - 1) + j11;
        if (j11 > 0 && j15 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableIntervalRange(j11, j15, Math.max(0L, j13), Math.max(0L, j14), timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArray(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), observableSourceArr.length);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), true, observableSourceArr.length);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i11, int i12) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i11, i12);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> never() {
        return RxJavaPlugins.onAssembly(ObservableNever.INSTANCE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static Observable<Integer> range(int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i12);
        }
        if (i12 == 0) {
            return empty();
        }
        if (i12 == 1) {
            return just(Integer.valueOf(i11));
        }
        if (((long) i11) + ((long) (i12 - 1)) <= 2147483647L) {
            return RxJavaPlugins.onAssembly(new ObservableRange(i11, i12));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static Observable<Long> rangeLong(long j11, long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j12);
        }
        if (j12 == 0) {
            return empty();
        }
        if (j12 == 1) {
            return just(Long.valueOf(j11));
        }
        long j13 = (j12 - 1) + j11;
        if (j11 <= 0 || j13 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableRangeLong(j11, j12));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
        return sequenceEqual(observableSource, observableSource2, biPredicate, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource, Functions.identity(), i11, true));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Observable<Long> timer(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimer(Math.max(j11, 0L), timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, D> Observable<T> using(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z11) {
        ObjectHelper.requireNonNull(callable, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function, "sourceSupplier is null");
        ObjectHelper.requireNonNull(consumer, "disposer is null");
        return RxJavaPlugins.onAssembly(new ObservableUsing(callable, function, consumer, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* JADX INFO: renamed from: as */
    public final <R> R m87963as(@NonNull ObservableConverter<T, ? extends R> observableConverter) {
        return (R) ((ObservableConverter) ObjectHelper.requireNonNull(observableConverter, "converter is null")).apply(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingIterable(int i11) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return new BlockingObservableIterable(this, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingLatest() {
        return new BlockingObservableLatest(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingMostRecent(T t11) {
        return new BlockingObservableMostRecent(this, t11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingNext() {
        return new BlockingObservableNext(this);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer) {
        ObservableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<List<T>> buffer(int i11, int i12) {
        return (Observable<List<T>>) buffer(i11, i12, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> cacheWithInitialCapacity(int i11) {
        ObjectHelper.verifyPositive(i11, "initialCapacity");
        return RxJavaPlugins.onAssembly(new ObservableCache(this, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> cast(Class<U> cls) {
        ObjectHelper.requireNonNull(cls, "clazz is null");
        return (Observable<U>) map(Functions.castFunction(cls));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<U> collect(Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        ObjectHelper.requireNonNull(callable, "initialValueSupplier is null");
        ObjectHelper.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly(new ObservableCollectSingle(this, callable, biConsumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<U> collectInto(U u11, BiConsumer<? super U, ? super T> biConsumer) {
        ObjectHelper.requireNonNull(u11, "initialValue is null");
        return collect(Functions.justCallable(u11), biConsumer);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> compose(ObservableTransformer<? super T, ? extends R> observableTransformer) {
        return wrap(((ObservableTransformer) ObjectHelper.requireNonNull(observableTransformer, "composer is null")).apply(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function, i11, ErrorMode.IMMEDIATE));
        }
        Object objCall = ((ScalarCallable) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.scalarXMap(objCall, function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function, ErrorMode.IMMEDIATE, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z11) {
        return concatMapCompletableDelayError(function, z11, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11, boolean z11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function, i11, z11 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object objCall = ((ScalarCallable) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.scalarXMap(objCall, function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11, int i12) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "maxConcurrency");
        ObjectHelper.verifyPositive(i12, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function, ErrorMode.IMMEDIATE, i11, i12));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11, int i12, boolean z11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "maxConcurrency");
        ObjectHelper.verifyPositive(i12, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function, z11 ? ErrorMode.END : ErrorMode.BOUNDARY, i11, i12));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function, ErrorMode.IMMEDIATE, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z11) {
        return concatMapMaybeDelayError(function, z11, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function, ErrorMode.IMMEDIATE, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11) {
        return concatMapSingleDelayError(function, z11, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> contains(Object obj) {
        ObjectHelper.requireNonNull(obj, "element is null");
        return any(Functions.equalsWith(obj));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Long> count() {
        return RxJavaPlugins.onAssembly(new ObservableCountSingle(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> defaultIfEmpty(T t11) {
        ObjectHelper.requireNonNull(t11, "defaultItem is null");
        return switchIfEmpty(just(t11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Experimental
    public final <R> Observable<R> dematerialize(Function<? super T, Notification<R>> function) {
        ObjectHelper.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservableDematerialize(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<T> distinct(Function<? super T, K> function) {
        return distinct(function, Functions.createHashSet());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<T> distinctUntilChanged(Function<? super T, K> function) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, function, ObjectHelper.equalsPredicate()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> elementAtOrError(long j11) {
        if (j11 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, j11, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> first(T t11) {
        return elementAt(0L, t11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Maybe<T> firstElement() {
        return elementAt(0L);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z11) {
        return flatMap(function, z11, Integer.MAX_VALUE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function, boolean z11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletableCompletable(this, function, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapMaybe(this, function, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapSingle(this, function, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<GroupedObservable<K, T>> groupBy(Function<? super T, ? extends K> function, boolean z11) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.identity(), z11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> hide() {
        return RxJavaPlugins.onAssembly(new ObservableHide(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElementsCompletable(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> last(T t11) {
        ObjectHelper.requireNonNull(t11, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, t11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Maybe<T> lastElement() {
        return RxJavaPlugins.onAssembly(new ObservableLastMaybe(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> lastOrError() {
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new ObservableMaterialize(this));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> observeOn(Scheduler scheduler, boolean z11) {
        return observeOn(scheduler, z11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> ofType(Class<U> cls) {
        ObjectHelper.requireNonNull(cls, "clazz is null");
        return filter(Functions.isInstanceOf(cls)).cast(cls);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorReturnItem(T t11) {
        ObjectHelper.requireNonNull(t11, "item is null");
        return onErrorReturn(Functions.justFunction(t11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new ObservableDetach(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> publish(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        ObjectHelper.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservablePublishSelector(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeat(long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? empty() : RxJavaPlugins.onAssembly(new ObservableRepeat(this, j11));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeatWhen(Function<? super Observable<Object>, ? extends ObservableSource<?>> function) {
        ObjectHelper.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatWhen(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        ObjectHelper.requireNonNull(function, "selector is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this), function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        ObjectHelper.requireNonNull(biPredicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryBiPredicate(this, biPredicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retryWhen(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        ObjectHelper.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryWhen(this, function));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> sample(long j11, TimeUnit timeUnit, boolean z11) {
        return sample(j11, timeUnit, Schedulers.computation(), z11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> serialize() {
        return RxJavaPlugins.onAssembly(new ObservableSerialized(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> single(T t11) {
        ObjectHelper.requireNonNull(t11, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, t11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Maybe<T> singleElement() {
        return RxJavaPlugins.onAssembly(new ObservableSingleMaybe(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> singleOrError() {
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> sorted(Comparator<? super T> comparator) {
        ObjectHelper.requireNonNull(comparator, "sortFunction is null");
        return toList().toObservable().map(Functions.listSorter(comparator)).flatMapIterable(Functions.identity());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWith(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return concatArray(observableSource, this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.emptyConsumer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function, i11, false));
        }
        Object objCall = ((ScalarCallable) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.scalarXMap(objCall, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function, i11, true));
        }
        Object objCall = ((ScalarCallable) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.scalarXMap(objCall, function);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleFirst(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleFirstTimed(this, j11, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleLast(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return sample(j11, timeUnit, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j11, TimeUnit timeUnit, boolean z11) {
        return throttleLatest(j11, timeUnit, Schedulers.computation(), z11);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleWithTimeout(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return debounce(j11, timeUnit, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return timeout0(null, function, observableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* JADX INFO: renamed from: to */
    public final <R> R m87964to(Function<? super Observable<T>, R> function) {
        try {
            return (R) ((Function) ObjectHelper.requireNonNull(function, "converter is null")).apply(this);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Flowable<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int i11 = C392211.$SwitchMap$io$reactivex$BackpressureStrategy[backpressureStrategy.ordinal()];
        if (i11 == 1) {
            return flowableFromObservable.onBackpressureDrop();
        }
        if (i11 == 2) {
            return flowableFromObservable.onBackpressureLatest();
        }
        if (i11 != 3) {
            return i11 != 4 ? flowableFromObservable.onBackpressureBuffer() : RxJavaPlugins.onAssembly(new FlowableOnBackpressureError(flowableFromObservable));
        }
        return flowableFromObservable;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureObserver());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toList(int i11) {
        ObjectHelper.verifyPositive(i11, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator) {
        ObjectHelper.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList().map(Functions.listSorter(comparator));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, long j12) {
        return window(j11, j12, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> amb(Iterable<? extends ObservableSource<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableAmb(null, iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> ambArray(ObservableSource<? extends T>... observableSourceArr) {
        ObjectHelper.requireNonNull(observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(observableSourceArr[0]);
        }
        return RxJavaPlugins.onAssembly(new ObservableAmb(observableSourceArr, null));
    }

    public static int bufferSize() {
        return Flowable.bufferSize();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i11) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable, function, i11 << 1, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, R> Observable<R> combineLatestDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i11) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        ObjectHelper.requireNonNull(function, "combiner is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(observableSourceArr, null, function, i11 << 1, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concat(observableSource, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatDelayError(observableSource, bufferSize(), true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> create(ObservableOnSubscribe<T> observableOnSubscribe) {
        ObjectHelper.requireNonNull(observableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableCreate(observableOnSubscribe));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> defer(Callable<? extends ObservableSource<? extends T>> callable) {
        ObjectHelper.requireNonNull(callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDefer(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> error(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "exception is null");
        return error((Callable<? extends Throwable>) Functions.justCallable(th2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromCallable(Callable<? extends T> callable) {
        ObjectHelper.requireNonNull(callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCallable(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        ObjectHelper.requireNonNull(future, "future is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future, j11, timeUnit));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromIterable(Iterable<? extends T> iterable) {
        ObjectHelper.requireNonNull(iterable, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableFromIterable(iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromPublisher(InterfaceC44416b<? extends T> interfaceC44416b) {
        ObjectHelper.requireNonNull(interfaceC44416b, "publisher is null");
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(interfaceC44416b));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        return fromArray(t11, t12);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i11) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(biPredicate, "isEqual is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqualSingle(observableSource, observableSource2, biPredicate, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> unsafeCreate(ObservableSource<T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "onSubscribe is null");
        if (!(observableSource instanceof Observable)) {
            return RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> wrap(ObservableSource<T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "source is null");
        if (observableSource instanceof Observable) {
            return RxJavaPlugins.onAssembly((Observable) observableSource);
        }
        return RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zipIterable(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, boolean z11, int i11) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable, function, i11, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> all(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAllSingle(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> ambWith(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return ambArray(this, observableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> any(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAnySingle(this, predicate));
    }

    @SchedulerSupport("none")
    public final void blockingForEach(Consumer<? super T> consumer) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                ((Disposable) it).dispose();
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingSingle(T t11) {
        return single(t11).blockingGet();
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(int i11, int i12, Callable<U> callable) {
        ObjectHelper.verifyPositive(i11, "count");
        ObjectHelper.verifyPositive(i12, "skip");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBuffer(this, i11, i12, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z11, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function, z11 ? ErrorMode.END : ErrorMode.BOUNDARY, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return (Observable<U>) concatMap(ObservableInternalHelper.flatMapIntoIterable(function), i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z11, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function, z11 ? ErrorMode.END : ErrorMode.BOUNDARY, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function, z11 ? ErrorMode.END : ErrorMode.BOUNDARY, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(@NonNull SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithSingle(this, singleSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> debounce(long j11, TimeUnit timeUnit) {
        return debounce(j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> delay(long j11, TimeUnit timeUnit) {
        return delay(j11, timeUnit, Schedulers.computation(), false);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> delaySubscription(long j11, TimeUnit timeUnit) {
        return delaySubscription(j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<T> distinct(Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(callable, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinct(this, function, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doAfterNext(Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new ObservableDoAfterNext(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doAfterTerminate(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return doOnEach(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doFinally(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new ObservableDoFinally(this, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnComplete(Action action) {
        return doOnEach(Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnDispose(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnError(Consumer<? super Throwable> consumer) {
        Consumer<? super T> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnEach(consumerEmptyConsumer, consumer, action, action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnLifecycle(Consumer<? super Disposable> consumer, Action action) {
        ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        ObjectHelper.requireNonNull(action, "onDispose is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnLifecycle(this, consumer, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnNext(Consumer<? super T> consumer) {
        Consumer<? super Throwable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnEach(consumer, consumerEmptyConsumer, action, action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnTerminate(Action action) {
        ObjectHelper.requireNonNull(action, "onTerminate is null");
        return doOnEach(Functions.emptyConsumer(), Functions.actionConsumer(action), action, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> elementAt(long j11, T t11) {
        if (j11 >= 0) {
            ObjectHelper.requireNonNull(t11, "defaultItem is null");
            return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, j11, t11));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> filter(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableFilter(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z11, int i11) {
        return flatMap(function, z11, i11, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return (Observable<V>) flatMap(ObservableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEach(Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        ObjectHelper.requireNonNull(predicate, "onNext is null");
        ObjectHelper.requireNonNull(consumer, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(predicate, consumer, action);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> groupJoin(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super Observable<TRight>, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        ObjectHelper.requireNonNull(function, "leftEnd is null");
        ObjectHelper.requireNonNull(function2, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableGroupJoin(this, observableSource, function, function2, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> isEmpty() {
        return all(Functions.alwaysFalse());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> join(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        ObjectHelper.requireNonNull(function, "leftEnd is null");
        ObjectHelper.requireNonNull(function2, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableJoin(this, observableSource, function, function2, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> lift(ObservableOperator<? extends R, ? super T> observableOperator) {
        ObjectHelper.requireNonNull(observableOperator, "lifter is null");
        return RxJavaPlugins.onAssembly(new ObservableLift(this, observableOperator));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> map(Function<? super T, ? extends R> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMap(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(@NonNull SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithSingle(this, singleSource));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> observeOn(Scheduler scheduler, boolean z11, int i11) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableObserveOn(this, scheduler, z11, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorResumeNext(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "next is null");
        return onErrorResumeNext(Functions.justFunction(observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorReturn(Function<? super Throwable, ? extends T> function) {
        ObjectHelper.requireNonNull(function, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorReturn(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onExceptionResumeNext(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "next is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorNext(this, Functions.justFunction(observableSource), true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> reduce(R r11, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(r11, "seed is null");
        ObjectHelper.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceSeedSingle(this, r11, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> reduceWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(callable, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceWithSingle(this, callable, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        ObjectHelper.requireNonNull(booleanSupplier, "stop is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatUntil(this, booleanSupplier));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retryUntil(BooleanSupplier booleanSupplier) {
        ObjectHelper.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.predicateReverseFor(booleanSupplier));
    }

    @SchedulerSupport("none")
    public final void safeSubscribe(Observer<? super T> observer) {
        ObjectHelper.requireNonNull(observer, "observer is null");
        if (observer instanceof SafeObserver) {
            subscribe(observer);
        } else {
            subscribe(new SafeObserver(observer));
        }
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> sample(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, j11, timeUnit, scheduler, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> scan(R r11, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(r11, "initialValue is null");
        return scanWith(Functions.justCallable(r11), biFunction);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> scanWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(callable, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScanSeed(this, callable, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> share() {
        return publish().refCount();
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> skip(long j11, TimeUnit timeUnit) {
        return skipUntil(timer(j11, timeUnit));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> skipUntil(ObservableSource<U> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipUntil(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> skipWhile(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipWhile(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWithArray(T... tArr) {
        Observable observableFromArray = fromArray(tArr);
        if (observableFromArray == empty()) {
            return RxJavaPlugins.onAssembly(this);
        }
        return concatArray(observableFromArray, this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.EMPTY_ACTION, Functions.emptyConsumer());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> subscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSubscribeOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <E extends Observer<? super T>> E subscribeWith(E e11) {
        subscribe(e11);
        return e11;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> switchIfEmpty(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchIfEmpty(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable switchMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable switchMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Observable<R> switchMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Observable<R> switchMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> take(long j11, TimeUnit timeUnit) {
        return takeUntil(timer(j11, timeUnit));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> takeUntil(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntilPredicate(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> takeWhile(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeWhile(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final TestObserver<T> test(boolean z11) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z11) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return throttleLatest(j11, timeUnit, scheduler, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(HashMapSupplier.asCallable(), Functions.toMapKeyValueSelector(function, function2));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> unsubscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableUnsubscribeOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, long j12, int i11) {
        ObjectHelper.verifyPositive(j11, "count");
        ObjectHelper.verifyPositive(j12, "skip");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindow(this, j11, j12, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, Functions.identity(), i11, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11, boolean z11) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i11, "prefetch is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, Functions.identity(), i11, z11 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable, int i11, int i12) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.identity(), i11, i12, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), false, Integer.MAX_VALUE, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), true, Integer.MAX_VALUE, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNext(observableSource, bufferSize());
    }

    private <U, V> Observable<T> timeout0(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.requireNonNull(function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeout(this, observableSource, function, observableSource2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zip(ObservableSource<? extends ObservableSource<? extends T>> observableSource, Function<? super Object[], ? extends R> function) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableToList(observableSource, 16).flatMap(ObservableInternalHelper.zipIterable(function)));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, action);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> debounce(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounceTimed(this, j11, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> delay(long j11, TimeUnit timeUnit, boolean z11) {
        return delay(j11, timeUnit, Schedulers.computation(), z11);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> delaySubscription(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(timer(j11, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> distinctUntilChanged(BiPredicate<? super T, ? super T> biPredicate) {
        ObjectHelper.requireNonNull(biPredicate, "comparer is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, Functions.identity(), biPredicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z11, int i11, int i12) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i11, "maxConcurrency");
        ObjectHelper.verifyPositive(i12, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object objCall = ((ScalarCallable) this).call();
            if (objCall == null) {
                return empty();
            }
            return ObservableScalarXMap.scalarXMap(objCall, function);
        }
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(this, function, z11, i11, i12));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z11) {
        return groupBy(function, function2, z11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i11) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, i11), function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(long j11) {
        return retry(j11, Functions.alwaysTrue());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skip(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return skipUntil(timer(j11, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.TRAMPOLINE)
    @CheckReturnValue
    public final Observable<T> skipLast(long j11, TimeUnit timeUnit) {
        return skipLast(j11, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWith(T t11) {
        ObjectHelper.requireNonNull(t11, "item is null");
        return concatArray(just(t11), this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return subscribe(consumer, consumer2, action, Functions.emptyConsumer());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> take(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return takeUntil(timer(j11, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleLatest(this, j11, timeUnit, scheduler, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeInterval(this, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> timeout(long j11, TimeUnit timeUnit) {
        return timeout0(j11, timeUnit, null, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Timed<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return (Observable<Timed<T>>) map(Functions.timestampWith(timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Single<U> toList(Callable<U> callable) {
        ObjectHelper.requireNonNull(callable, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator, int i11) {
        ObjectHelper.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList(i11).map(Functions.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, Function3<? super T, ? super T1, ? super T2, R> function3) {
        ObjectHelper.requireNonNull(observableSource, "o1 is null");
        ObjectHelper.requireNonNull(observableSource2, "o2 is null");
        ObjectHelper.requireNonNull(function3, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2}, Functions.toFunction(function3));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return zip(this, observableSource, biFunction);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, S> Observable<T> generate(Callable<S> callable, BiConsumer<S, Emitter<T>> biConsumer) {
        ObjectHelper.requireNonNull(biConsumer, "generator is null");
        return generate(callable, ObservableInternalHelper.simpleBiGenerator(biConsumer), Functions.emptyConsumer());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public static Observable<Long> interval(long j11, TimeUnit timeUnit) {
        return interval(j11, j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingFirst(T t11) {
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T tBlockingGet = blockingFirstObserver.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t11;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingLast(T t11) {
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe(blockingLastObserver);
        T tBlockingGet = blockingLastObserver.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t11;
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Observer<? super T> observer) {
        ObservableBlockingSubscribe.subscribe(this, observer);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(@NonNull MaybeSource<? extends T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithMaybe(this, maybeSource));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> delay(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j11, timeUnit, scheduler, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z11, int i11) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableGroupBy(this, function, function2, i11, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(@NonNull MaybeSource<? extends T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithMaybe(this, maybeSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(long j11, Predicate<? super Throwable> predicate) {
        if (j11 >= 0) {
            ObjectHelper.requireNonNull(predicate, "predicate is null");
            return RxJavaPlugins.onAssembly(new ObservableRetryPredicate(this, j11, predicate));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j11);
    }

    @SchedulerSupport(SchedulerSupport.TRAMPOLINE)
    @CheckReturnValue
    public final Observable<T> skipLast(long j11, TimeUnit timeUnit, boolean z11) {
        return skipLast(j11, timeUnit, Schedulers.trampoline(), z11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.requireNonNull(consumer3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, consumer3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @SchedulerSupport(SchedulerSupport.TRAMPOLINE)
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, long j12, TimeUnit timeUnit) {
        return takeLast(j11, j12, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> timeout(long j11, TimeUnit timeUnit, ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return timeout0(j11, timeUnit, observableSource, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return fromFuture(future, j11, timeUnit).subscribeOn(scheduler);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Observable<Long> interval(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return interval(j11, j11, timeUnit, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        return fromArray(t11, t12, t13);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i11, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), false, i11, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i11) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i11, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), true, i11, bufferSize()));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> delay(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDelay(this, j11, timeUnit, scheduler, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnEach(Consumer<? super Notification<T>> consumer) {
        ObjectHelper.requireNonNull(consumer, "onNotification is null");
        return doOnEach(Functions.notificationOnNext(consumer), Functions.notificationOnError(consumer), Functions.notificationOnComplete(consumer), Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> sample(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, j11, timeUnit, scheduler, z11));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skipLast(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return skipLast(j11, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j11, j12, timeUnit, scheduler, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, V>> callable) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.requireNonNull(callable, "mapSupplier is null");
        return (Single<Map<K, V>>) collect(callable, Functions.toMapKeyValueSelector(function, function2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList(int i11) {
        return toSortedList(Functions.naturalOrder(), i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z11) {
        return zip(this, observableSource, biFunction, z11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatest(observableSourceArr, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return concatArray(observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, S> Observable<T> generate(Callable<S> callable, BiConsumer<S, Emitter<T>> biConsumer, Consumer<? super S> consumer) {
        ObjectHelper.requireNonNull(biConsumer, "generator is null");
        return generate(callable, ObservableInternalHelper.simpleBiGenerator(biConsumer), consumer);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(int i11, Callable<U> callable) {
        return buffer(i11, i11, callable);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(@NonNull CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithCompletable(this, completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(@NonNull CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithCompletable(this, completableSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i11, long j11, TimeUnit timeUnit) {
        return replay(function, i11, j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skipLast(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        return skipLast(j11, timeUnit, scheduler, z11, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, boolean z11, int i11) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        if (j11 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableTakeLastTimed(this, j11, j12, timeUnit, scheduler, i11, z11));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j11);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> timeout(long j11, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return timeout0(j11, timeUnit, observableSource, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, long j12, TimeUnit timeUnit) {
        return window(j11, j12, timeUnit, Schedulers.computation(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z11, int i11) {
        return zip(this, observableSource, biFunction, z11, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, R> Observable<R> combineLatest(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i11) {
        ObjectHelper.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(observableSourceArr, null, function, i11 << 1, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, int i11) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.equalsPredicate(), i11);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j11, long j12, TimeUnit timeUnit) {
        return (Observable<List<T>>) buffer(j11, j12, timeUnit, Schedulers.computation(), ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, i11, j11, timeUnit, scheduler), function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(Predicate<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skipLast(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11, int i11) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSkipLastTimed(this, j11, timeUnit, scheduler, i11 << 1, z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, Collection<V>>> callable, Function<? super K, ? extends Collection<? super V>> function3) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.requireNonNull(callable, "mapSupplier is null");
        ObjectHelper.requireNonNull(function3, "collectionFactory is null");
        return (Single<Map<K, Collection<V>>>) collect(callable, Functions.toMultimapKeyValueSelector(function, function2, function3));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j11, j12, timeUnit, scheduler, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i11) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable, function, i11 << 1, true));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> fromFuture(Future<? extends T> future, Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return fromFuture(future).subscribeOn(scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, S> Observable<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(callable, biFunction, Functions.emptyConsumer());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.identity(), false, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.identity(), true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), false, bufferSize(), observableSource, observableSource2);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j11, j12, timeUnit, scheduler, ArrayListSupplier.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<T> delay(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        return delaySubscription(observableSource).delay(function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> sample(ObservableSource<U> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource, false));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> timeout(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j11, timeUnit, null, scheduler);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, int i11) {
        ObjectHelper.verifyPositive(j11, "timespan");
        ObjectHelper.verifyPositive(j12, "timeskip");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, j11, j12, timeUnit, scheduler, Long.MAX_VALUE, i11, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        ObjectHelper.requireNonNull(observableSource, "o1 is null");
        ObjectHelper.requireNonNull(observableSource2, "o2 is null");
        ObjectHelper.requireNonNull(observableSource3, "o3 is null");
        ObjectHelper.requireNonNull(function4, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.toFunction(function4));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        return concatArray(observableSource, observableSource2, observableSource3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, S> Observable<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        ObjectHelper.requireNonNull(callable, "initialState is null");
        ObjectHelper.requireNonNull(biFunction, "generator is null");
        ObjectHelper.requireNonNull(consumer, "disposeState is null");
        return RxJavaPlugins.onAssembly(new ObservableGenerate(callable, biFunction, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        return fromArray(t11, t12, t13, t14);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, j11, j12, timeUnit, scheduler, callable, Integer.MAX_VALUE, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        ObjectHelper.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        return timeout0(observableSource, function, null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnEach(Observer<? super T> observer) {
        ObjectHelper.requireNonNull(observer, "observer is null");
        return doOnEach(ObservableInternalHelper.observerOnNext(observer), ObservableInternalHelper.observerOnError(observer), ObservableInternalHelper.observerOnComplete(observer), Functions.EMPTY_ACTION);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> sample(ObservableSource<U> observableSource, boolean z11) {
        ObjectHelper.requireNonNull(observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource, z11));
    }

    @Override // io.reactivex.ObservableSource
    @SchedulerSupport("none")
    public final void subscribe(Observer<? super T> observer) {
        ObjectHelper.requireNonNull(observer, "observer is null");
        try {
            Observer<? super T> observerOnSubscribe = RxJavaPlugins.onSubscribe(this, observer);
            ObjectHelper.requireNonNull(observerOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(observerOnSubscribe);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.identity(), false, 3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.identity(), true, 3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z11) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), z11, bufferSize(), observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        ObjectHelper.requireNonNull(function, "onNextMapper is null");
        ObjectHelper.requireNonNull(function2, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new ObservableMapNotification(this, function, function2, callable));
    }

    @SchedulerSupport(SchedulerSupport.TRAMPOLINE)
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, TimeUnit timeUnit) {
        return takeLast(j11, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        ObjectHelper.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        ObjectHelper.requireNonNull(observableSource2, "other is null");
        return timeout0(observableSource, function, observableSource2);
    }

    @SchedulerSupport(SchedulerSupport.TRAMPOLINE)
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, TimeUnit timeUnit, boolean z11) {
        return takeLast(j11, timeUnit, Schedulers.trampoline(), z11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(function, function2, callable, ArrayListSupplier.asFunction());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return combineLatest(Functions.toFunction(biFunction), bufferSize(), observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        return concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j11, TimeUnit timeUnit) {
        return buffer(j11, timeUnit, Schedulers.computation(), Integer.MAX_VALUE);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i11, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, i11), ObservableInternalHelper.replayFunction(function, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j11, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14, T t15) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        ObjectHelper.requireNonNull(t15, "item5 is null");
        return fromArray(t11, t12, t13, t14, t15);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z11, int i11) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), z11, i11, observableSource, observableSource2);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j11, TimeUnit timeUnit, int i11) {
        return buffer(j11, timeUnit, Schedulers.computation(), i11);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        return takeLast(j11, timeUnit, scheduler, z11, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit) {
        return window(j11, timeUnit, Schedulers.computation(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        ObjectHelper.requireNonNull(observableSource, "o1 is null");
        ObjectHelper.requireNonNull(observableSource2, "o2 is null");
        ObjectHelper.requireNonNull(observableSource3, "o3 is null");
        ObjectHelper.requireNonNull(observableSource4, "o4 is null");
        ObjectHelper.requireNonNull(function5, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.toFunction(function5));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.identity(), false, 4);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.identity(), true, 4);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j11, TimeUnit timeUnit, Scheduler scheduler, int i11) {
        return (Observable<List<T>>) buffer(j11, timeUnit, scheduler, i11, ArrayListSupplier.asCallable(), false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable, int i11) {
        ObjectHelper.requireNonNull(function, "onNextMapper is null");
        ObjectHelper.requireNonNull(function2, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new ObservableMapNotification(this, function, function2, callable), i11);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11, int i11) {
        return takeLast(Long.MAX_VALUE, j11, timeUnit, scheduler, z11, i11);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit, long j12) {
        return window(j11, timeUnit, Schedulers.computation(), j12, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        return combineLatest(Functions.toFunction(function3), bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, Callable<U> callable, boolean z11) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        ObjectHelper.verifyPositive(i11, "count");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, j11, j11, timeUnit, scheduler, callable, i11, z11));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit, long j12, boolean z11) {
        return window(j11, timeUnit, Schedulers.computation(), j12, z11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        return zipArray(Functions.toFunction(function3), false, bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j11, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit, Scheduler scheduler, long j12) {
        return window(j11, timeUnit, scheduler, j12, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i11) {
        return flatMap((Function) function, false, i11, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j11, TimeUnit timeUnit) {
        return replay(function, j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, boolean z11) {
        return window(j11, timeUnit, scheduler, j12, z11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        return combineLatest(Functions.toFunction(function4), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14, T t15, T t16) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        ObjectHelper.requireNonNull(t15, "item5 is null");
        ObjectHelper.requireNonNull(t16, "item6 is null");
        return fromArray(t11, t12, t13, t14, t15, t16);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this, j11, timeUnit, scheduler), function);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, boolean z11, int i11) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(j12, "count");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, j11, j11, timeUnit, scheduler, j12, i11, z11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        return zipArray(Functions.toFunction(function4), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j11, timeUnit, scheduler, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z11) {
        return flatMap(function, biFunction, z11, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> withLatestFrom(ObservableSource<?>[] observableSourceArr, Function<? super Object[], R> function) {
        ObjectHelper.requireNonNull(observableSourceArr, "others is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, observableSourceArr, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TOpening, TClosing> Observable<List<T>> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function) {
        return (Observable<List<T>>) buffer(observableSource, function, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z11, int i11) {
        return flatMap(function, biFunction, z11, i11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TOpening, TClosing, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function, Callable<U> callable) {
        ObjectHelper.requireNonNull(observableSource, "openingIndicator is null");
        ObjectHelper.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferBoundary(this, observableSource, function, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z11, int i11, int i12) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.requireNonNull(biFunction, "combiner is null");
        return flatMap(ObservableInternalHelper.flatMapWithCombiner(function, biFunction), z11, i11, i12);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replayCallable(this), ObservableInternalHelper.replayFunction(function, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> withLatestFrom(Iterable<? extends ObservableSource<?>> iterable, Function<? super Object[], R> function) {
        ObjectHelper.requireNonNull(iterable, "others is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, iterable, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        return combineLatest(Functions.toFunction(function5), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource) {
        return window(observableSource, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        return zipArray(Functions.toFunction(function5), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, int i11) {
        return flatMap(function, biFunction, false, i11, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource, int i11) {
        ObjectHelper.requireNonNull(observableSource, "boundary is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundary(this, observableSource, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        ObjectHelper.requireNonNull(t15, "item5 is null");
        ObjectHelper.requireNonNull(t16, "item6 is null");
        ObjectHelper.requireNonNull(t17, "item7 is null");
        return fromArray(t11, t12, t13, t14, t15, t16, t17);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource) {
        return (Observable<List<T>>) buffer(observableSource, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource, int i11) {
        ObjectHelper.verifyPositive(i11, "initialCapacity");
        return (Observable<List<T>>) buffer(observableSource, Functions.createArrayList(i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final ConnectableObservable<T> replay(int i11) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return ObservableReplay.create(this, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function) {
        return window(observableSource, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<B> observableSource, Callable<U> callable) {
        ObjectHelper.requireNonNull(observableSource, "boundary is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferExactBoundary(this, observableSource, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function, int i11) {
        ObjectHelper.requireNonNull(observableSource, "openingIndicator is null");
        ObjectHelper.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundarySelector(this, observableSource, function, i11));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        return combineLatest(Functions.toFunction(function6), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final ConnectableObservable<T> replay(int i11, long j11, TimeUnit timeUnit) {
        return replay(i11, j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        return zipArray(Functions.toFunction(function6), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final ConnectableObservable<T> replay(int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j11, timeUnit, scheduler, i11);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<List<T>> buffer(Callable<? extends ObservableSource<B>> callable) {
        return (Observable<List<T>>) buffer(callable, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B, U extends Collection<? super T>> Observable<U> buffer(Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        ObjectHelper.requireNonNull(callable, "boundarySupplier is null");
        ObjectHelper.requireNonNull(callable2, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferBoundarySupplier(this, callable, callable2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(Callable<? extends ObservableSource<B>> callable) {
        return window(callable, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        ObjectHelper.requireNonNull(t15, "item5 is null");
        ObjectHelper.requireNonNull(t16, "item6 is null");
        ObjectHelper.requireNonNull(t17, "item7 is null");
        ObjectHelper.requireNonNull(t18, "item8 is null");
        return fromArray(t11, t12, t13, t14, t15, t16, t17, t18);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(Callable<? extends ObservableSource<B>> callable, int i11) {
        ObjectHelper.requireNonNull(callable, "boundary is null");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundarySupplier(this, callable, i11));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final ConnectableObservable<T> replay(int i11, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return ObservableReplay.observeOn(replay(i11), scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        ObjectHelper.requireNonNull(observableSource7, "source7 is null");
        return combineLatest(Functions.toFunction(function7), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final ConnectableObservable<T> replay(long j11, TimeUnit timeUnit) {
        return replay(j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        ObjectHelper.requireNonNull(observableSource7, "source7 is null");
        return zipArray(Functions.toFunction(function7), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final ConnectableObservable<T> replay(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j11, timeUnit, scheduler);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final ConnectableObservable<T> replay(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.observeOn(replay(), scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        ObjectHelper.requireNonNull(t15, "item5 is null");
        ObjectHelper.requireNonNull(t16, "item6 is null");
        ObjectHelper.requireNonNull(t17, "item7 is null");
        ObjectHelper.requireNonNull(t18, "item8 is null");
        ObjectHelper.requireNonNull(t19, "item9 is null");
        return fromArray(t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        ObjectHelper.requireNonNull(observableSource7, "source7 is null");
        ObjectHelper.requireNonNull(observableSource8, "source8 is null");
        return combineLatest(Functions.toFunction(function8), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        ObjectHelper.requireNonNull(observableSource7, "source7 is null");
        ObjectHelper.requireNonNull(observableSource8, "source8 is null");
        return zipArray(Functions.toFunction(function8), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> just(T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19, T t21) {
        ObjectHelper.requireNonNull(t11, "item1 is null");
        ObjectHelper.requireNonNull(t12, "item2 is null");
        ObjectHelper.requireNonNull(t13, "item3 is null");
        ObjectHelper.requireNonNull(t14, "item4 is null");
        ObjectHelper.requireNonNull(t15, "item5 is null");
        ObjectHelper.requireNonNull(t16, "item6 is null");
        ObjectHelper.requireNonNull(t17, "item7 is null");
        ObjectHelper.requireNonNull(t18, "item8 is null");
        ObjectHelper.requireNonNull(t19, "item9 is null");
        ObjectHelper.requireNonNull(t21, "item10 is null");
        return fromArray(t11, t12, t13, t14, t15, t16, t17, t18, t19, t21);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        ObjectHelper.requireNonNull(observableSource7, "source7 is null");
        ObjectHelper.requireNonNull(observableSource8, "source8 is null");
        ObjectHelper.requireNonNull(observableSource9, "source9 is null");
        return combineLatest(Functions.toFunction(function9), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        ObjectHelper.requireNonNull(observableSource, "source1 is null");
        ObjectHelper.requireNonNull(observableSource2, "source2 is null");
        ObjectHelper.requireNonNull(observableSource3, "source3 is null");
        ObjectHelper.requireNonNull(observableSource4, "source4 is null");
        ObjectHelper.requireNonNull(observableSource5, "source5 is null");
        ObjectHelper.requireNonNull(observableSource6, "source6 is null");
        ObjectHelper.requireNonNull(observableSource7, "source7 is null");
        ObjectHelper.requireNonNull(observableSource8, "source8 is null");
        ObjectHelper.requireNonNull(observableSource9, "source9 is null");
        return zipArray(Functions.toFunction(function9), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }
}
