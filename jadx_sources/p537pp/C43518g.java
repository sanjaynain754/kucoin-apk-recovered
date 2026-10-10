package p537pp;

import android.view.View;
import com.kubi.margin.entity.NewUpCoin;
import com.kubi.sdk.util.C24217a1;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.LinkedHashSet;
import java.util.Set;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p318hp.C38274t;
import p768xo.InterfaceC46305f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: renamed from: pp.g */
/* JADX INFO: compiled from: NewCoinNotifyBiz.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a$\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0000\u001a\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"MARGIN_NEW_COIN_CATEGORY", "", "KEY", "launchNewCoinPopBubble", "", "anchor", "Landroid/view/View;", "composite", "Lio/reactivex/disposables/CompositeDisposable;", "fetchNewCoinInfo", "disposable", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/margin/entity/NewUpCoin;", "markUserClose", "coinId", "hasCloseByUser", "", "isAllowShowNewCoinNotify", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43518g {
    /* JADX INFO: renamed from: g */
    public static final void m95748g(@NotNull CompositeDisposable disposable, @NotNull final Function1<? super NewUpCoin, Unit> callback) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Observable observableObserveOn = ((InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class)).m102105q().compose(C24217a1.m58390n()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: pp.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43518g.m95749h(callback, (NewUpCoin) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: pp.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43518g.m95750i(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: pp.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43518g.m95751j((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: pp.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43518g.m95752k(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, disposable);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m95753l(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return C46396e.m102352i("margin_new_coin_category", "margin_new_coin_set", new LinkedHashSet()).contains(str);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m95754m(@Nullable String str) {
        return (C38274t.f85990a.m86354A() || m95753l(str)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public static final void m95755n(@Nullable final View view, @NotNull CompositeDisposable composite) {
        Intrinsics.checkNotNullParameter(composite, "composite");
        m95748g(composite, new Function1() { // from class: pp.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43518g.m95756o(view, (NewUpCoin) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m95756o(View view, final NewUpCoin coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        if (m95754m(coin.getId()) && view != null) {
            C43520i.m95761c(view, coin, new Function1() { // from class: pp.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43518g.m95757p(coin, (NewUpCoin) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m95757p(NewUpCoin newUpCoin, NewUpCoin it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m95758q(newUpCoin.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m95758q(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Set<String> setM102352i = C46396e.m102352i("margin_new_coin_category", "margin_new_coin_set", new LinkedHashSet());
        setM102352i.add(str);
        C46396e.m102359p("margin_new_coin_category", "margin_new_coin_set", setM102352i);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m95749h(Function1 function1, NewUpCoin newUpCoin) {
        Intrinsics.checkNotNull(newUpCoin);
        function1.invoke(newUpCoin);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m95750i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m95751j(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m95752k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
