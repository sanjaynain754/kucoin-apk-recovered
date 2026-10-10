package com.kubi.utils;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowableCompat.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aA\u0010\u0007\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00050\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\n\u001aA\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\f\u0010\n\u001aA\u0010\r\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\r\u0010\n\u001a\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "Lio/reactivex/disposables/Disposable;", "c", "(Lio/reactivex/Observable;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Flowable;", "kotlin.jvm.PlatformType", "j", "(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "k", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "m", CmcdData.Factory.STREAMING_FORMAT_HLS, "f", "", "i", "()J", CmcdData.Factory.STREAM_TYPE_LIVE, "g", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FlowableCompatKt {
    @SuppressLint({"CheckResult"})
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> Disposable m66389c(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final FlowableCompatKt$emptySubscribe$1 flowableCompatKt$emptySubscribe$1 = new Function1<T, Unit>() { // from class: com.kubi.utils.FlowableCompatKt$emptySubscribe$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t11) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }
        };
        Consumer<? super T> consumer = new Consumer() { // from class: com.kubi.utils.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlowableCompatKt.m66390d(flowableCompatKt$emptySubscribe$1, obj);
            }
        };
        final FlowableCompatKt$emptySubscribe$2 flowableCompatKt$emptySubscribe$2 = new Function1<Throwable, Unit>() { // from class: com.kubi.utils.FlowableCompatKt$emptySubscribe$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                th2.printStackTrace();
            }
        };
        Disposable disposableSubscribe = observable.subscribe(consumer, new Consumer() { // from class: com.kubi.utils.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlowableCompatKt.m66391e(flowableCompatKt$emptySubscribe$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "this.subscribe({ }, { it.printStackTrace() })");
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: d */
    public static final void m66390d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static final void m66391e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static final <T> Observable<T> m66392f(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return observable.delaySubscription(6L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: g */
    public static final long m66393g() {
        return ThemisUtils.f54260a.m66413b() ? 1000L : 100L;
    }

    /* JADX INFO: renamed from: h */
    public static final <T> Observable<T> m66394h(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return observable.throttleLatest(m66393g(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: i */
    public static final long m66395i() {
        return 1000L;
    }

    /* JADX INFO: renamed from: j */
    public static final <T> Flowable<T> m66396j(@NotNull Flowable<T> flowable) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        return flowable.throttleLatest(m66395i(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: k */
    public static final <T> Observable<T> m66397k(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return observable.throttleLatest(m66395i(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: l */
    public static final long m66398l() {
        return ThemisUtils.f54260a.m66413b() ? 1000L : 500L;
    }

    /* JADX INFO: renamed from: m */
    public static final <T> Observable<T> m66399m(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return observable.throttleLatest(m66398l(), TimeUnit.MILLISECONDS);
    }
}
