package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: single.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001aF\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00050\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\t0\bH\u0007\u001aF\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00050\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001aF\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u000b0\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u000bH\u0007¨\u0006\f"}, m90084d2 = {"cast", "Lio/reactivex/Single;", "R", "", "concatAll", "Lio/reactivex/Flowable;", ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "", "Lio/reactivex/SingleSource;", "mergeAllSingles", "Lio/reactivex/Observable;", "rxkotlin"}, m90085k = 2, m90086mv = {1, 1, 11})
public final class SingleKt {
    private static final <R> Single<R> cast(@NotNull Single<?> single) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Single<R> single2 = (Single<R>) single.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(single2, "cast(R::class.java)");
        return single2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> mergeAllSingles(@NotNull Observable<Single<T>> observable) {
        return (Observable<T>) observable.flatMapSingle(new Function<T, SingleSource<? extends R>>() { // from class: io.reactivex.rxkotlin.SingleKt.mergeAllSingles.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Single<T> apply(@NotNull Single<T> single) {
                return single;
            }
        });
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllSingles(@NotNull Flowable<Single<T>> flowable) {
        return (Flowable<T>) flowable.flatMapSingle(new Function<T, SingleSource<? extends R>>() { // from class: io.reactivex.rxkotlin.SingleKt.mergeAllSingles.2
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Single<T> apply(@NotNull Single<T> single) {
                return single;
            }
        });
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends SingleSource<T>> iterable) {
        return Single.concat(iterable);
    }
}
