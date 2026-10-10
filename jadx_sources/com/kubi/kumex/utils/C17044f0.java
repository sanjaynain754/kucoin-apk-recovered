package com.kubi.kumex.utils;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.f0 */
/* JADX INFO: compiled from: ObservebleEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\b"}, m90084d2 = {"subscribeWithCatch", "Lio/reactivex/disposables/Disposable;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "consumer", "Lkotlin/Function1;", "", "Lio/reactivex/Flowable;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17044f0 {
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final <T> Disposable m36504i(@NotNull Flowable<T> flowable, @NotNull final Function1<? super T, Unit> consumer) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.utils.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17044f0.m36510o(consumer, obj);
            }
        };
        Consumer<? super T> consumer2 = new Consumer() { // from class: com.kubi.kumex.utils.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C17044f0.m36511p(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.utils.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17044f0.m36512q((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowable.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.utils.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C17044f0.m36513r(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final <T> Disposable m36505j(@NotNull Observable<T> observable, @NotNull final Function1<? super T, Unit> consumer) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.utils.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17044f0.m36506k(consumer, obj);
            }
        };
        Consumer<? super T> consumer2 = new Consumer() { // from class: com.kubi.kumex.utils.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C17044f0.m36507l(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.utils.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17044f0.m36508m((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observable.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.utils.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C17044f0.m36509n(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m36506k(Function1 function1, Object obj) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m36507l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m36508m(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ObservableEx");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m36509n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m36510o(Function1 function1, Object obj) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m36511p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m36512q(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ObservableEx");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m36513r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
