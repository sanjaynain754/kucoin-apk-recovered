package com.kubi.futures.dialog.vm;

import androidx.lifecycle.MutableLiveData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.FlowableCompat;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.dialog.vm.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FundingRateViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/dialog/vm/FundingRateViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", ViewProps.POSITION, "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Landroidx/lifecycle/MutableLiveData;", "fetchPosition", "", "symbol", "", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FundingRateViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<List<PositionEntity>> f22964X = new MutableLiveData<>();

    /* JADX INFO: renamed from: v */
    public static final List m25484v(boolean z11, String str) {
        return MultiBizFacadeManager.f19232a.m20276t().mo83155S(z11, str);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m25485w(FundingRateViewModel fundingRateViewModel, List list) {
        fundingRateViewModel.f22964X.setValue(list);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<List<PositionEntity>> m25489A() {
        return this.f22964X;
    }

    /* JADX INFO: renamed from: u */
    public final void m25490u(@NotNull final String symbol, final boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.dialog.vm.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FundingRateViewModel.m25484v(z11, symbol);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.dialog.vm.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FundingRateViewModel.m25485w(this.f22961b, (List) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.futures.dialog.vm.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FundingRateViewModel.m25486x(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.dialog.vm.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FundingRateViewModel.m25487y((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.dialog.vm.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FundingRateViewModel.m25488z(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getF46845W());
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m25486x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m25487y(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "FundingRateViewModel");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m25488z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
