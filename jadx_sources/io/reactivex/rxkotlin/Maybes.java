package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
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
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.functions.Function8;
import p852kotlin.jvm.functions.Function9;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Maybes.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00050\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007Js\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0087\bJ\u008d\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2&\b\u0004\u0010\u000e\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\r0\u0012H\u0087\bJ§\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2,\b\u0004\u0010\u000e\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\bJÁ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n22\b\u0004\u0010\u000e\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\r0\u0018H\u0087\bJÛ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\u0019\"\u0004\b\u0007\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n28\b\u0004\u0010\u000e\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\r0\u001bH\u0087\bJõ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\u0019\"\u0004\b\u0007\u0010\u001c\"\u0004\b\b\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2>\b\u0004\u0010\u000e\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\r0\u001eH\u0087\bJ\u008f\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\u0019\"\u0004\b\u0007\u0010\u001c\"\u0004\b\b\u0010\u001f\"\u0004\b\t\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0\n2D\b\u0004\u0010\u000e\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\r0!H\u0087\bJB\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"0\u0004\"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\nH\u0007JY\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\r0%H\u0087\b¨\u0006&"}, m90084d2 = {"Lio/reactivex/rxkotlin/Maybes;", "", "()V", "zip", "Lio/reactivex/Maybe;", "Lkotlin/Triple;", "T1", "T2", "T3", ICustomDataEditor.STRING_PARAM_1, "Lio/reactivex/MaybeSource;", ICustomDataEditor.STRING_PARAM_2, ICustomDataEditor.STRING_PARAM_3, "R", "zipper", "Lkotlin/Function3;", "T4", ICustomDataEditor.STRING_PARAM_4, "Lkotlin/Function4;", "T5", ICustomDataEditor.STRING_PARAM_5, "Lkotlin/Function5;", "T6", ICustomDataEditor.STRING_PARAM_6, "Lkotlin/Function6;", "T7", ICustomDataEditor.STRING_PARAM_7, "Lkotlin/Function7;", "T8", ICustomDataEditor.STRING_PARAM_8, "Lkotlin/Function8;", "T9", ICustomDataEditor.STRING_PARAM_9, "Lkotlin/Function9;", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "U", "Lkotlin/Function2;", "rxkotlin"}, m90085k = 1, m90086mv = {1, 1, 11})
public final class Maybes {
    public static final Maybes INSTANCE = new Maybes();

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T, U, R> Maybe<R> zip(@NotNull MaybeSource<T> s11, @NotNull MaybeSource<U> s12, @NotNull final Function2<? super T, ? super U, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t11, U u11) {
                return (R) zipper.invoke(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, BiFunc…-> zipper.invoke(t, u) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T, U> Maybe<Pair<T, U>> zip(@NotNull MaybeSource<T> s11, @NotNull MaybeSource<U> s12) {
        Maybe<Pair<T, U>> maybeZip = Maybe.zip(s11, s12, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.Maybes.zip.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T, U> apply(T t11, U u11) {
                return new Pair<>(t11, u11);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, BiFunc…on { t, u -> Pair(t,u) })");
        return maybeZip;
    }

    private Maybes() {
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull final Function3<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, new io.reactivex.functions.Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t11, T2 t12, T3 t13) {
                return (R) zipper.invoke(t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, Fu…per.invoke(t1, t2, t3) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3> Maybe<Triple<T1, T2, T3>> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13) {
        Maybe<Triple<T1, T2, T3>> maybeZip = Maybe.zip(s11, s12, s13, new io.reactivex.functions.Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Maybes.zip.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T1, T2, T3> apply(T1 t11, T2 t12, T3 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, Fu…t3 -> Triple(t1,t2,t3) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull MaybeSource<T4> s14, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, s14, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14) {
                return (R) zipper.invoke(t11, t12, t13, t14);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, s4…invoke(t1, t2, t3, t4) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull MaybeSource<T4> s14, @NotNull MaybeSource<T5> s15, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, s14, s15, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15) {
                return (R) zipper.invoke(t11, t12, t13, t14, t15);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, s4…ke(t1, t2, t3, t4, t5) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull MaybeSource<T4> s14, @NotNull MaybeSource<T5> s15, @NotNull MaybeSource<T6> s16, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, s14, s15, s16, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16) {
                return (R) zipper.invoke(t11, t12, t13, t14, t15, t16);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, s4…1, t2, t3, t4, t5, t6) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, T7, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull MaybeSource<T4> s14, @NotNull MaybeSource<T5> s15, @NotNull MaybeSource<T6> s16, @NotNull MaybeSource<T7> s17, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, s14, s15, s16, s17, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17) {
                return (R) zipper.invoke(t11, t12, t13, t14, t15, t16, t17);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, s4…2, t3, t4, t5, t6, t7) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull MaybeSource<T4> s14, @NotNull MaybeSource<T5> s15, @NotNull MaybeSource<T6> s16, @NotNull MaybeSource<T7> s17, @NotNull MaybeSource<T8> s18, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, s14, s15, s16, s17, s18, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18) {
                return (R) zipper.invoke(t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, s4…3, t4, t5, t6, t7, t8) })");
        return maybeZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Maybe<R> zip(@NotNull MaybeSource<T1> s11, @NotNull MaybeSource<T2> s12, @NotNull MaybeSource<T3> s13, @NotNull MaybeSource<T4> s14, @NotNull MaybeSource<T5> s15, @NotNull MaybeSource<T6> s16, @NotNull MaybeSource<T7> s17, @NotNull MaybeSource<T8> s18, @NotNull MaybeSource<T9> s19, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
        Maybe<R> maybeZip = Maybe.zip(s11, s12, s13, s14, s15, s16, s17, s18, s19, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Maybes.zip.10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18, T9 t19) {
                return (R) zipper.invoke(t11, t12, t13, t14, t15, t16, t17, t18, t19);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2, s3, s4…4, t5, t6, t7, t8, t9) })");
        return maybeZip;
    }
}
