package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        private final int bufferSize;
        private final Observable<T> parent;

        @Override // java.util.concurrent.Callable
        public ConnectableObservable<T> call() {
            return this.parent.replay(this.bufferSize);
        }

        public BufferedReplayCallable(Observable<T> observable, int i11) {
            this.parent = observable;
            this.bufferSize = i11;
        }
    }

    public static final class BufferedTimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        private final int bufferSize;
        private final Observable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        @Override // java.util.concurrent.Callable
        public ConnectableObservable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }

        public BufferedTimedReplayCallable(Observable<T> observable, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = observable;
            this.bufferSize = i11;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        @Override // io.reactivex.functions.Function
        public ObservableSource<U> apply(T t11) throws Exception {
            return new ObservableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null Iterable"));
        }

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* JADX INFO: renamed from: t */
        private final T f87178t;

        @Override // io.reactivex.functions.Function
        public R apply(U u11) throws Exception {
            return this.combiner.apply(this.f87178t, u11);
        }

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t11) {
            this.combiner = biFunction;
            this.f87178t = t11;
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends ObservableSource<? extends U>> mapper;

        @Override // io.reactivex.functions.Function
        public ObservableSource<R> apply(T t11) throws Exception {
            return new ObservableMap((ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null ObservableSource"), new FlatMapWithCombinerInner(this.combiner, t11));
        }

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends ObservableSource<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        final Function<? super T, ? extends ObservableSource<U>> itemDelay;

        @Override // io.reactivex.functions.Function
        public ObservableSource<T> apply(T t11) throws Exception {
            return new ObservableTake((ObservableSource) ObjectHelper.requireNonNull(this.itemDelay.apply(t11), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.justFunction(t11)).defaultIfEmpty(t11);
        }

        public ItemDelayFunction(Function<? super T, ? extends ObservableSource<U>> function) {
            this.itemDelay = function;
        }
    }

    public enum MapToInt implements Function<Object, Object> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    public static final class ObserverOnComplete<T> implements Action {
        final Observer<T> observer;

        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            this.observer.onComplete();
        }

        public ObserverOnComplete(Observer<T> observer) {
            this.observer = observer;
        }
    }

    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        final Observer<T> observer;

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th2) throws Exception {
            this.observer.onError(th2);
        }

        public ObserverOnError(Observer<T> observer) {
            this.observer = observer;
        }
    }

    public static final class ObserverOnNext<T> implements Consumer<T> {
        final Observer<T> observer;

        @Override // io.reactivex.functions.Consumer
        public void accept(T t11) throws Exception {
            this.observer.onNext(t11);
        }

        public ObserverOnNext(Observer<T> observer) {
            this.observer = observer;
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        private final Observable<T> parent;

        @Override // java.util.concurrent.Callable
        public ConnectableObservable<T> call() {
            return this.parent.replay();
        }

        public ReplayCallable(Observable<T> observable) {
            this.parent = observable;
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Observable<T>, ObservableSource<R>> {
        private final Scheduler scheduler;
        private final Function<? super Observable<T>, ? extends ObservableSource<R>> selector;

        @Override // io.reactivex.functions.Function
        public ObservableSource<R> apply(Observable<T> observable) throws Exception {
            return Observable.wrap((ObservableSource) ObjectHelper.requireNonNull(this.selector.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.scheduler);
        }

        public ReplayFunction(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        @Override // io.reactivex.functions.BiFunction
        public S apply(S s11, Emitter<T> emitter) throws Exception {
            this.consumer.accept(s11, emitter);
            return s11;
        }

        public SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        @Override // io.reactivex.functions.BiFunction
        public S apply(S s11, Emitter<T> emitter) throws Exception {
            this.consumer.accept(emitter);
            return s11;
        }

        public SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }
    }

    public static final class TimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        private final Observable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        @Override // java.util.concurrent.Callable
        public ConnectableObservable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }

        public TimedReplayCallable(Observable<T> observable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = observable;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        private final Function<? super Object[], ? extends R> zipper;

        @Override // io.reactivex.functions.Function
        public ObservableSource<? extends R> apply(List<ObservableSource<? extends T>> list) {
            return Observable.zipIterable(list, this.zipper, false, Observable.bufferSize());
        }

        public ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable) {
        return new ReplayCallable(observable);
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new ObserverOnComplete(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new ObserverOnError(observer);
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new ObserverOnNext(observer);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i11) {
        return new BufferedReplayCallable(observable, i11);
    }

    public static <T, R> Function<Observable<T>, ObservableSource<R>> replayFunction(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }

    private ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplayCallable(observable, i11, j11, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplayCallable(observable, j11, timeUnit, scheduler);
    }
}
