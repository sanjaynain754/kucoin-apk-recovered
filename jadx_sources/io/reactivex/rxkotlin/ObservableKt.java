package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TypeCastException;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import p852kotlin.ranges.IntProgression;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: observable.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000±\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001c\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a^\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b\u001aF\u0010\r\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001aF\u0010\r\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000f0\u0006H\u0007\u001a*\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001a*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001aI\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u00012\u001a\b\u0004\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00140\bH\u0087\b\u001a*\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001aF\u0010\u0016\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a*\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010\u0019\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a(\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a'\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u001c\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001dH\u0002¢\u0006\u0002\u0010\u001e\u001aÇ\u0001\u0010\u001f\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010$0! \u000e*J\u0012D\u0012B\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010$0!\u0018\u00010 0 \"\b\b\u0000\u0010\"*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H#0%0\u0001H\u0007\u001a¸\u0002\u0010&\u001a\u0087\u0002\u0012|\u0012z\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0' \u000e*<\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0'\u0018\u00010$0! \u000e*\u0082\u0001\u0012|\u0012z\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0' \u000e*<\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0'\u0018\u00010$0!\u0018\u00010 0 \"\b\b\u0000\u0010\"*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H#0%0\u0001H\u0007\u001a'\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050*H\u0007¢\u0006\u0002\u0010+\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020,0\u0001*\u00020-H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020.0\u0001*\u00020/H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002000\u0001*\u000201H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002020\u0001*\u000203H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002040\u0001*\u000205H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u000207H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002080\u0001*\u000209H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020;H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0006H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001dH\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u00020<H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0014H\u0007\u001a^\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010>\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¨\u0006?"}, m90084d2 = {"cast", "Lio/reactivex/Observable;", "R", "", "combineLatest", ExifInterface.GPS_DIRECTION_TRUE, "", "combineFunction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "args", "concatAll", "kotlin.jvm.PlatformType", "Lio/reactivex/ObservableSource;", "concatMapIterable", "flatMapIterable", "flatMapSequence", TtmlNode.TAG_BODY, "Lkotlin/sequences/Sequence;", "merge", "mergeAll", "mergeDelayError", "ofType", "switchLatest", "switchOnNext", "toIterable", "io/reactivex/rxkotlin/ObservableKt$toIterable$1", "", "(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/ObservableKt$toIterable$1;", "toMap", "Lio/reactivex/Single;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "", "Lkotlin/Pair;", "toMultimap", "", "", "toObservable", "", "([Ljava/lang/Object;)Lio/reactivex/Observable;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Lkotlin/ranges/IntProgression;", "zip", "zipFunction", "rxkotlin"}, m90085k = 2, m90086mv = {1, 1, 11})
public final class ObservableKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.ObservableKt$toIterable$1 */
    /* JADX INFO: compiled from: observable.kt */
    @Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, m90084d2 = {"io/reactivex/rxkotlin/ObservableKt$toIterable$1", "", "iterator", "", "rxkotlin"}, m90085k = 1, m90086mv = {1, 1, 11})
    public static final class C393031<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Iterator receiver$0;

        public C393031(Iterator<? extends T> it) {
            this.receiver$0 = it;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return this.receiver$0;
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    private static final <R> Observable<R> cast(@NotNull Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable2 = (Observable<R>) observable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "cast(R::class.java)");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> concatAll(@NotNull Observable<Observable<T>> observable) {
        return (Observable<T>) observable.concatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.concatAll.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Observable<T> apply(@NotNull Observable<T> observable2) {
                return observable2;
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    private static final <R> Observable<R> ofType(@NotNull Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable2 = (Observable<R>) observable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "ofType(R::class.java)");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Boolean> toObservable(@NotNull boolean[] zArr) {
        return toObservable(ArraysKt.asIterable(zArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> combineLatest(@NotNull Iterable<? extends Observable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Observable<R> observableCombineLatest = Observable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt.combineLatest.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] objArr) {
                Function1 function2 = function1;
                List listAsList = ArraysKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                for (T t11 : listAsList) {
                    if (t11 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t11);
                }
                return (R) function2.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return observableCombineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> concatAll(@NotNull Iterable<? extends ObservableSource<T>> iterable) {
        return Observable.concat(iterable);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.concatMapIterable(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt.concatMapIterable.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Iterable<Object> apply(@NotNull Iterable<Object> iterable) {
                return iterable;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "concatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> flatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMapIterable(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt.flatMapIterable.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Iterable<Object> apply(@NotNull Iterable<Object> iterable) {
                return iterable;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> flatMapSequence(@NotNull Observable<T> observable, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Observable<R> observableFlatMap = observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.flatMapSequence.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Observable<R> apply(@NotNull T t11) {
                return ObservableKt.toObservable((Sequence) function1.invoke(t11));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableFlatMap, "flatMap { body(it).toObservable() }");
        return observableFlatMap;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> mergeAll(@NotNull Observable<Observable<T>> observable) {
        return (Observable<T>) observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.mergeAll.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Observable<T> apply(@NotNull Observable<T> observable2) {
                return observable2;
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> switchLatest(@NotNull Observable<Observable<T>> observable) {
        return (Observable<T>) observable.switchMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.switchLatest.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Observable<T> apply(@NotNull Observable<T> observable2) {
                return observable2;
            }
        });
    }

    private static final <T> C393031 toIterable(@NotNull Iterator<? extends T> it) {
        return new C393031(it);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Observable<Pair<A, B>> observable) {
        return (Single<Map<A, B>>) observable.toMap(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt.toMap.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.ObservableKt.toMap.2
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Observable<Pair<A, B>> observable) {
        return (Single<Map<A, Collection<B>>>) observable.toMultimap(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt.toMultimap.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.ObservableKt.toMultimap.2
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Byte> toObservable(@NotNull byte[] bArr) {
        return toObservable(ArraysKt.asIterable(bArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> zip(@NotNull Iterable<? extends Observable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Observable<R> observableZip = Observable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt.zip.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] objArr) {
                Function1 function2 = function1;
                List listAsList = ArraysKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                for (T t11 : listAsList) {
                    if (t11 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t11);
                }
                return (R) function2.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(this) { z…List().map { it as T }) }");
        return observableZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> merge(@NotNull Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> observableMerge = Observable.merge(toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(observableMerge, "Observable.merge(this.toObservable())");
        return observableMerge;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeDelayError(@NotNull Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> observableMergeDelayError = Observable.mergeDelayError(toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(observableMergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return observableMergeDelayError;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> switchOnNext(@NotNull Observable<Observable<T>> observable) {
        Observable<T> observableSwitchOnNext = Observable.switchOnNext(observable);
        Intrinsics.checkExpressionValueIsNotNull(observableSwitchOnNext, "Observable.switchOnNext(this)");
        return observableSwitchOnNext;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Character> toObservable(@NotNull char[] cArr) {
        return toObservable(ArraysKt.asIterable(cArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Short> toObservable(@NotNull short[] sArr) {
        return toObservable(ArraysKt.asIterable(sArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull int[] iArr) {
        return toObservable(ArraysKt.asIterable(iArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Long> toObservable(@NotNull long[] jArr) {
        return toObservable(ArraysKt.asIterable(jArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Float> toObservable(@NotNull float[] fArr) {
        return toObservable(ArraysKt.asIterable(fArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Double> toObservable(@NotNull double[] dArr) {
        return toObservable(ArraysKt.asIterable(dArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull T[] tArr) {
        Observable<T> observableFromArray = Observable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(observableFromArray, "Observable.fromArray(*this)");
        return observableFromArray;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull IntProgression intProgression) {
        if (intProgression.getStep() != 1 || ((long) intProgression.getLast()) - ((long) intProgression.getFirst()) >= Integer.MAX_VALUE) {
            Observable<Integer> observableFromIterable = Observable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
            return observableFromIterable;
        }
        Observable<Integer> observableRange = Observable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(observableRange, "Observable.range(first, …max(0, last - first + 1))");
        return observableRange;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterator<? extends T> it) {
        return toObservable(toIterable(it));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterable<? extends T> iterable) {
        Observable<T> observableFromIterable = Observable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
        return observableFromIterable;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Sequence<? extends T> sequence) {
        return toObservable(SequencesKt.asIterable(sequence));
    }
}
