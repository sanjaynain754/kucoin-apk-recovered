package com.kubi.futures.compliance.leverage;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlinx.coroutines.C41696j;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import sg.InterfaceC44404a;
import sh.EuropeUnlockLeverageBonusEntity;

/* JADX INFO: compiled from: EuropeTrialSimulationOrderViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fR%\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "modifyLeverageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "getModifyLeverageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "trialLiveData", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageBonusEntity;", "getTrialLiveData", "submitLeverage", "", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "fetchEuropeUnlockLeverageTrial", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EuropeTrialSimulationOrderViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f22607X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<EuropeUnlockLeverageBonusEntity, Throwable>> f22608Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: x */
    public static final Object m24610x(String str, BigDecimal bigDecimal) {
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        MarginModeInfoEntity marginModeInfoEntity = MultiBizFacadeManager.m20256j(multiBizFacadeManager, null, 1, null).mo24484i0(true, str).get(str);
        if (Intrinsics.areEqual(C27041f.m66669i(marginModeInfoEntity != null ? marginModeInfoEntity.getMarginMode() : null, SharedPositionInfo.MARGIN_MODE_ISOLATED), SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            HashMap map = new HashMap();
            map.put("leverage", C6447a.m11724a(bigDecimal).toPlainString());
            map.put("symbol", str);
            return RepositoryServiceLocator.f19236a.m20288g().mo24999a(map);
        }
        InterfaceC44404a interfaceC44404aM20256j = MultiBizFacadeManager.m20256j(multiBizFacadeManager, null, 1, null);
        String plainString = C6447a.m11724a(bigDecimal).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return Boolean.valueOf(interfaceC44404aM20256j.mo24481f0(true, new SubmitCrossLeverageEntity(str, plainString)));
    }

    /* JADX INFO: renamed from: y */
    public static final void m24611y(EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModel, Object obj) {
        europeTrialSimulationOrderViewModel.f22607X.postValue(new Pair<>(Boolean.TRUE, null));
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m24612z(EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModel, Throwable th2) {
        europeTrialSimulationOrderViewModel.f22607X.postValue(new Pair<>(Boolean.FALSE, th2));
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Pair<Boolean, Throwable>> m24614u() {
        return this.f22607X;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final MutableLiveData<Pair<EuropeUnlockLeverageBonusEntity, Throwable>> m24615v() {
        return this.f22608Y;
    }

    /* JADX INFO: renamed from: w */
    public final void m24616w(@NotNull final String symbol, @NotNull final BigDecimal leverage) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Flowable flowableSubscribeOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.compliance.leverage.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeTrialSimulationOrderViewModel.m24610x(symbol, leverage);
            }
        }).subscribeOn(C42916f.m94127f());
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.compliance.leverage.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EuropeTrialSimulationOrderViewModel.m24611y(this.f22657b, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.compliance.leverage.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeTrialSimulationOrderViewModel.m24612z(this.f22658b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.compliance.leverage.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EuropeTrialSimulationOrderViewModel.m24605A(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    /* JADX INFO: renamed from: A */
    public static final void m24605A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public final void m24613t() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C12880x12821da1(this, null), 3, null);
    }
}
