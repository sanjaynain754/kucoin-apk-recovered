package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize);
        }

        public BufferedReplayCallable(Flowable<T> flowable, int i11) {
            this.parent = flowable;
            this.bufferSize = i11;
        }
    }

    public static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }

        public BufferedTimedReplay(Flowable<T> flowable, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i11;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, InterfaceC44416b<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        @Override // io.reactivex.functions.Function
        public InterfaceC44416b<U> apply(T t11) throws Exception {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null Iterable"));
        }

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* JADX INFO: renamed from: t */
        private final T f87147t;

        @Override // io.reactivex.functions.Function
        public R apply(U u11) throws Exception {
            return this.combiner.apply(this.f87147t, u11);
        }

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t11) {
            this.combiner = biFunction;
            this.f87147t = t11;
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, InterfaceC44416b<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends InterfaceC44416b<? extends U>> mapper;

        @Override // io.reactivex.functions.Function
        public InterfaceC44416b<R> apply(T t11) throws Exception {
            return new FlowableMapPublisher((InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null Publisher"), new FlatMapWithCombinerInner(this.combiner, t11));
        }

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends InterfaceC44416b<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, InterfaceC44416b<T>> {
        final Function<? super T, ? extends InterfaceC44416b<U>> itemDelay;

        @Override // io.reactivex.functions.Function
        public InterfaceC44416b<T> apply(T t11) throws Exception {
            return new FlowableTakePublisher((InterfaceC44416b) ObjectHelper.requireNonNull(this.itemDelay.apply(t11), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(t11)).defaultIfEmpty(t11);
        }

        public ItemDelayFunction(Function<? super T, ? extends InterfaceC44416b<U>> function) {
            this.itemDelay = function;
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay();
        }

        public ReplayCallable(Flowable<T> flowable) {
            this.parent = flowable;
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, InterfaceC44416b<R>> {
        private final Scheduler scheduler;
        private final Function<? super Flowable<T>, ? extends InterfaceC44416b<R>> selector;

        @Override // io.reactivex.functions.Function
        public InterfaceC44416b<R> apply(Flowable<T> flowable) throws Exception {
            return Flowable.fromPublisher((InterfaceC44416b) ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }

        public ReplayFunction(Function<? super Flowable<T>, ? extends InterfaceC44416b<R>> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }
    }

    public enum RequestMax implements Consumer<InterfaceC44418d> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(InterfaceC44418d interfaceC44418d) throws Exception {
            interfaceC44418d.request(Long.MAX_VALUE);
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

    public static final class SubscriberOnComplete<T> implements Action {
        final InterfaceC44417c<T> subscriber;

        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            this.subscriber.onComplete();
        }

        public SubscriberOnComplete(InterfaceC44417c<T> interfaceC44417c) {
            this.subscriber = interfaceC44417c;
        }
    }

    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        final InterfaceC44417c<T> subscriber;

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th2) throws Exception {
            this.subscriber.onError(th2);
        }

        public SubscriberOnError(InterfaceC44417c<T> interfaceC44417c) {
            this.subscriber = interfaceC44417c;
        }
    }

    public static final class SubscriberOnNext<T> implements Consumer<T> {
        final InterfaceC44417c<T> subscriber;

        @Override // io.reactivex.functions.Consumer
        public void accept(T t11) throws Exception {
            this.subscriber.onNext(t11);
        }

        public SubscriberOnNext(InterfaceC44417c<T> interfaceC44417c) {
            this.subscriber = interfaceC44417c;
        }
    }

    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }

        public TimedReplay(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<InterfaceC44416b<? extends T>>, InterfaceC44416b<? extends R>> {
        private final Function<? super Object[], ? extends R> zipper;

        @Override // io.reactivex.functions.Function
        public InterfaceC44416b<? extends R> apply(List<InterfaceC44416b<? extends T>> list) {
            return Flowable.zipIterable(list, this.zipper, false, Flowable.bufferSize());
        }

        public ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new ReplayCallable(flowable);
    }

    public static <T, U> Function<T, InterfaceC44416b<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, InterfaceC44416b<R>> flatMapWithCombiner(Function<? super T, ? extends InterfaceC44416b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, InterfaceC44416b<T>> itemDelay(Function<? super T, ? extends InterfaceC44416b<U>> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i11) {
        return new BufferedReplayCallable(flowable, i11);
    }

    public static <T, R> Function<Flowable<T>, InterfaceC44416b<R>> replayFunction(Function<? super Flowable<T>, ? extends InterfaceC44416b<R>> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(InterfaceC44417c<T> interfaceC44417c) {
        return new SubscriberOnComplete(interfaceC44417c);
    }

    public static <T> Consumer<Throwable> subscriberOnError(InterfaceC44417c<T> interfaceC44417c) {
        return new SubscriberOnError(interfaceC44417c);
    }

    public static <T> Consumer<T> subscriberOnNext(InterfaceC44417c<T> interfaceC44417c) {
        return new SubscriberOnNext(interfaceC44417c);
    }

    public static <T, R> Function<List<InterfaceC44416b<? extends T>>, InterfaceC44416b<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplay(flowable, i11, j11, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplay(flowable, j11, timeUnit, scheduler);
    }
}
