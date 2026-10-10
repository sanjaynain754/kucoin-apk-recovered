package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Observables.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007\u001ao\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072 \b\u0004\u0010\n\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t0\u000bH\u0087\b\u001a\u0089\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\f\"\u0004\b\u0004\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072&\b\u0004\u0010\n\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\t0\u000eH\u0087\b\u001a£\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\f\"\u0004\b\u0004\u0010\u000f\"\u0004\b\u0005\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072,\b\u0004\u0010\n\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\b\u001a>\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00130\u00120\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007H\u0007\u001aU\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\t0\u0015H\u0087\b\u001a>\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00130\u00120\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007H\u0007\u001aU\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u001a\b\u0004\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\t0\u0015H\u0087\b¨\u0006\u0018"}, m90084d2 = {"withLatestFrom", "Lio/reactivex/Observable;", "Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "T1", "T2", "o1", "Lio/reactivex/ObservableSource;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, m90085k = 2, m90086mv = {1, 1, 11})
public final class ObservablesKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, U, R> Observable<R> withLatestFrom(@NotNull Observable<T> observable, @NotNull ObservableSource<U> observableSource, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Observable<R> observableWithLatestFrom = observable.withLatestFrom(observableSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t11, U u11) {
                return (R) function2.invoke(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return observableWithLatestFrom;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, U, R> Observable<R> zipWith(@NotNull Observable<T> observable, @NotNull ObservableSource<U> observableSource, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Observable<R> observableZipWith = observable.zipWith(observableSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.zipWith.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t11, U u11) {
                return (R) function2.invoke(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return observableZipWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, U> Observable<Pair<T, U>> withLatestFrom(@NotNull Observable<T> observable, @NotNull ObservableSource<U> observableSource) {
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.withLatestFrom(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T, U> apply(T t11, U u11) {
                return new Pair<>(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "withLatestFrom(other, Bi…ion{ t, u -> Pair(t,u) })");
        return observable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, U> Observable<Pair<T, U>> zipWith(@NotNull Observable<T> observable, @NotNull ObservableSource<U> observableSource) {
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.zipWith(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.zipWith.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T, U> apply(T t11, U u11) {
                return new Pair<>(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, T1, T2, R> Observable<R> withLatestFrom(@NotNull Observable<T> observable, @NotNull ObservableSource<T1> observableSource, @NotNull ObservableSource<T2> observableSource2, @NotNull final Function3<? super T, ? super T1, ? super T2, ? extends R> function3) {
        Observable<R> observableWithLatestFrom = observable.withLatestFrom(observableSource, observableSource2, new io.reactivex.functions.Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T t11, T1 t12, T2 t13) {
                return (R) function3.invoke(t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return observableWithLatestFrom;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, T1, T2> Observable<Triple<T, T1, T2>> withLatestFrom(@NotNull Observable<T> observable, @NotNull ObservableSource<T1> observableSource, @NotNull ObservableSource<T2> observableSource2) {
        Observable<Triple<T, T1, T2>> observable2 = (Observable<Triple<T, T1, T2>>) observable.withLatestFrom(observableSource, observableSource2, new io.reactivex.functions.Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T, T1, T2> apply(T t11, T1 t12, T2 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, T1, T2, T3, R> Observable<R> withLatestFrom(@NotNull Observable<T> observable, @NotNull ObservableSource<T1> observableSource, @NotNull ObservableSource<T2> observableSource2, @NotNull ObservableSource<T3> observableSource3, @NotNull final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> function4) {
        Observable<R> observableWithLatestFrom = observable.withLatestFrom(observableSource, observableSource2, observableSource3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T t11, T1 t12, T2 t13, T3 t14) {
                return (R) function4.invoke(t11, t12, t13, t14);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return observableWithLatestFrom;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, T1, T2, T3, T4, R> Observable<R> withLatestFrom(@NotNull Observable<T> observable, @NotNull ObservableSource<T1> observableSource, @NotNull ObservableSource<T2> observableSource2, @NotNull ObservableSource<T3> observableSource3, @NotNull ObservableSource<T4> observableSource4, @NotNull final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function5) {
        Observable<R> observableWithLatestFrom = observable.withLatestFrom(observableSource, observableSource2, observableSource3, observableSource4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T t11, T1 t12, T2 t13, T3 t14, T4 t15) {
                return (R) function5.invoke(t11, t12, t13, t14, t15);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return observableWithLatestFrom;
    }
}
