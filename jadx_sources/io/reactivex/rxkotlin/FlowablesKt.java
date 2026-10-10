package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
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
import sh0.InterfaceC44416b;

/* JADX INFO: compiled from: Flowables.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\\\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u001a\b\u0004\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\u000b\u001av\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042 \b\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010H\u0087\b¢\u0006\u0004\b\b\u0010\u0011\u001a_\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00120\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0013\u001a\u0090\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0014\"\u0004\b\u0004\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042&\b\u0004\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0016H\u0087\b¢\u0006\u0004\b\b\u0010\u0017\u001aª\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0014\"\u0004\b\u0004\u0010\u0018\"\u0004\b\u0005\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042,\b\u0004\u0010\u0007\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001aH\u0087\b¢\u0006\u0004\b\b\u0010\u001b\u001a\\\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u001a\b\u0004\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0087\b¢\u0006\u0004\b\u001d\u0010\t\u001aE\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "U", "R", "Lio/reactivex/Flowable;", "Lsh0/b;", "other", "Lkotlin/Function2;", "combiner", "withLatestFrom", "(Lio/reactivex/Flowable;Lsh0/b;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Flowable;", "Lkotlin/Pair;", "(Lio/reactivex/Flowable;Lsh0/b;)Lio/reactivex/Flowable;", "T1", "T2", "o1", "o2", "Lkotlin/Function3;", "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function3;)Lio/reactivex/Flowable;", "Lkotlin/Triple;", "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;)Lio/reactivex/Flowable;", "T3", "o3", "Lkotlin/Function4;", "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function4;)Lio/reactivex/Flowable;", "T4", "o4", "Lkotlin/Function5;", "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function5;)Lio/reactivex/Flowable;", "zipper", "zipWith", "rxkotlin"}, m90085k = 2, m90086mv = {1, 4, 0})
public final class FlowablesKt {
    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<U> interfaceC44416b, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(interfaceC44416b, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t11, U u11) {
                return (R) function2.invoke(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(other, Bi…combiner.invoke(t, u)  })");
        return flowableWithLatestFrom;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> zipWith(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<U> interfaceC44416b, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Flowable<R> flowableZipWith = flowable.zipWith(interfaceC44416b, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.zipWith.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t11, U u11) {
                return (R) function2.invoke(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return flowableZipWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<U> interfaceC44416b) {
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.withLatestFrom(interfaceC44416b, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T, U> apply(T t11, U u11) {
                return new Pair<>(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "withLatestFrom(other, Bi…on{ t, u -> Pair(t,u)  })");
        return flowable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> zipWith(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<U> interfaceC44416b) {
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.zipWith(interfaceC44416b, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.FlowablesKt.zipWith.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T, U> apply(T t11, U u11) {
                return new Pair<>(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<T1> interfaceC44416b, @NotNull InterfaceC44416b<T2> interfaceC44416b2, @NotNull final Function3<? super T, ? super T1, ? super T2, ? extends R> function3) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(interfaceC44416b, interfaceC44416b2, new io.reactivex.functions.Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T t11, T1 t12, T2 t13) {
                return (R) function3.invoke(t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return flowableWithLatestFrom;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2> Flowable<Triple<T, T1, T2>> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<T1> interfaceC44416b, @NotNull InterfaceC44416b<T2> interfaceC44416b2) {
        Flowable<Triple<T, T1, T2>> flowable2 = (Flowable<Triple<T, T1, T2>>) flowable.withLatestFrom(interfaceC44416b, interfaceC44416b2, new io.reactivex.functions.Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T, T1, T2> apply(T t11, T1 t12, T2 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<T1> interfaceC44416b, @NotNull InterfaceC44416b<T2> interfaceC44416b2, @NotNull InterfaceC44416b<T3> interfaceC44416b3, @NotNull final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> function4) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(interfaceC44416b, interfaceC44416b2, interfaceC44416b3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T t11, T1 t12, T2 t13, T3 t14) {
                return (R) function4.invoke(t11, t12, t13, t14);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return flowableWithLatestFrom;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull InterfaceC44416b<T1> interfaceC44416b, @NotNull InterfaceC44416b<T2> interfaceC44416b2, @NotNull InterfaceC44416b<T3> interfaceC44416b3, @NotNull InterfaceC44416b<T4> interfaceC44416b4, @NotNull final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function5) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(interfaceC44416b, interfaceC44416b2, interfaceC44416b3, interfaceC44416b4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T t11, T1 t12, T2 t13, T3 t14, T4 t15) {
                return (R) function5.invoke(t11, t12, t13, t14, t15);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return flowableWithLatestFrom;
    }
}
