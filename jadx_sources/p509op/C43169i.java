package p509op;

import com.kubi.margin.entity.MarginBannerV2;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p768xo.InterfaceC46305f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: op.i */
/* JADX INFO: compiled from: MarginBannerDataManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/margin/trade/banner/MarginBannerDataManager;", "", "<init>", "()V", "cacheBannerData", "Lcom/kubi/margin/trade/banner/MarginBannerDataOperator;", "requestMarginBannersV2", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function0;", "", "getDisplayList", "", "Lcom/kubi/margin/trade/banner/DisplayBanner;", "closeBanner", "data", "clearCache", "jumpToBannerDetail", "content", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43169i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43169i f95330a = new C43169i();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static C43170j f95331b;

    /* JADX INFO: renamed from: g */
    public final void m94777g() {
        f95331b = null;
    }

    /* JADX INFO: renamed from: l */
    public static final C43170j m94771l(MarginBannerV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new C43170j(it);
    }

    /* JADX INFO: renamed from: m */
    public static final C43170j m94772m(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (C43170j) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m94773n(Function0 function0, C43170j c43170j) {
        f95331b = c43170j;
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final void m94778h(@Nullable InterfaceC43161a interfaceC43161a) {
        C43170j c43170j = f95331b;
        if (c43170j != null) {
            c43170j.m94782a(interfaceC43161a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC43161a> m94779i() {
        List<InterfaceC43161a> listM94783b;
        C43170j c43170j = f95331b;
        return (c43170j == null || (listM94783b = c43170j.m94783b()) == null) ? CollectionsKt.emptyList() : listM94783b;
    }

    /* JADX INFO: renamed from: j */
    public final void m94780j(@Nullable MarqueeTextView.InterfaceC22932e interfaceC22932e) {
        if (interfaceC22932e instanceof InterfaceC43161a.ContentItem) {
            Router.f46192a.m56184f(C27041f.m66668h(((InterfaceC43161a.ContentItem) interfaceC22932e).getWebUrl())).m4048k();
        } else {
            C44128b.m97260d("margin banner url exception");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Disposable m94781k(@NotNull final Function0<Unit> complete) {
        Intrinsics.checkNotNullParameter(complete, "complete");
        Observable<R> observableCompose = ((InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class)).m102073I().compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: op.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43169i.m94771l((MarginBannerV2) obj);
            }
        };
        Observable observableObserveOn = observableCompose.map(new Function() { // from class: op.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43169i.m94772m(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: op.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43169i.m94773n(complete, (C43170j) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: op.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43169i.m94774o(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: op.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43169i.m94775p((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: op.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C43169i.m94776q(function3, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final void m94774o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m94775p(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m94776q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
