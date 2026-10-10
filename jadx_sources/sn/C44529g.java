package sn;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sn.g */
/* JADX INFO: compiled from: PlatformPermissionHelper.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0000¨\u0006\t"}, m90084d2 = {"subscribePermissionResult", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Observable;", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "onDenied", "Lkotlin/Function0;", "KycLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44529g {
    /* JADX INFO: renamed from: e */
    public static final void m98540e(AtomicBoolean atomicBoolean, Function1 function1) {
        if (atomicBoolean.compareAndSet(false, true)) {
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m98541f(AtomicBoolean atomicBoolean, Function1 function1, Function0 function0, Boolean bool) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Intrinsics.checkNotNull(bool);
            function1.invoke(bool);
            if (!bool.booleanValue()) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Disposable m98539d(@NotNull Observable<Boolean> observable, @NotNull final Function1<? super Boolean, Unit> callback, @NotNull final Function0<Unit> onDenied) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onDenied, "onDenied");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Observable<Boolean> observableDoOnDispose = observable.doOnDispose(new Action() { // from class: sn.d
            @Override // io.reactivex.functions.Action
            public final void run() {
                C44529g.m98540e(atomicBoolean, callback);
            }
        });
        final Function1 function1 = new Function1() { // from class: sn.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44529g.m98541f(atomicBoolean, callback, onDenied, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnDispose.subscribe(new Consumer() { // from class: sn.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44529g.m98542g(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: g */
    public static final void m98542g(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
