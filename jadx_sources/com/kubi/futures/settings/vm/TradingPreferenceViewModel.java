package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.network.retrofit.utils.C19331c;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0012J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012J\b\u0010\u001f\u001a\u00020\u0017H\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b¨\u0006 "}, m90084d2 = {"Lcom/kubi/futures/settings/vm/TradingPreferenceViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "riskLimitCallback", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "getRiskLimitCallback", "()Landroidx/lifecycle/MutableLiveData;", "autoMargin", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "getAutoMargin", "marginMode", "", "getMarginMode", "positionMode", "getPositionMode", "fetchResult", "", "getFetchResult", "hedgeAvailable", "getHedgeAvailable", "fetchPreferenceData", "", "symbol", "isTrial", "fetchAutoMarginByHedge", "fetchUserRiskLimit", "submitOneWayAutoDepositMargin", "isChecked", "isIsolated", "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingPreferenceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingPreferenceViewModel.kt\ncom/kubi/futures/settings/vm/TradingPreferenceViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,152:1\n47#2,4:153\n*S KotlinDebug\n*F\n+ 1 TradingPreferenceViewModel.kt\ncom/kubi/futures/settings/vm/TradingPreferenceViewModel\n*L\n47#1:153,4\n*E\n"})
public final class TradingPreferenceViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<ContractRiskLimitEntity> f23497V = new MutableLiveData<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<AutoDepositStatus> f23498W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<String> f23499X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<String> f23500Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f23501Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f23502a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.TradingPreferenceViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 TradingPreferenceViewModel.kt\ncom/kubi/futures/settings/vm/TradingPreferenceViewModel\n*L\n1#1,49:1\n48#2,3:50\n*E\n"})
    public static final class C13512a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TradingPreferenceViewModel f23503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13512a(CoroutineExceptionHandler.Companion companion, TradingPreferenceViewModel tradingPreferenceViewModel) {
            super(companion);
            this.f23503b = tradingPreferenceViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f23503b.m26414o().postValue(Boolean.TRUE);
            C19331c.m42836c(exception, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m26409g(String str, boolean z11) {
        if (BrokerConfig.f19211a.m20201d().mo20222A0()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new TradingPreferenceViewModel$fetchUserRiskLimit$1(z11, str, this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m26410e(String str, boolean z11) {
        if (BrokerConfig.f19211a.m20201d().mo20223C0()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new TradingPreferenceViewModel$fetchAutoMarginByHedge$1(z11, str, this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m26411f(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C13512a(CoroutineExceptionHandler.INSTANCE, this)), null, new TradingPreferenceViewModel$fetchPreferenceData$1(this, symbol, z11, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final MutableLiveData<String> m26412l() {
        return this.f23499X;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<AutoDepositStatus> m26413n() {
        return this.f23498W;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<Boolean> m26414o() {
        return this.f23501Z;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> m26415p() {
        return this.f23502a0;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final MutableLiveData<String> m26416q() {
        return this.f23500Y;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<ContractRiskLimitEntity> m26417r() {
        return this.f23497V;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m26418s() {
        return Intrinsics.areEqual(this.f23499X.getValue(), SharedPositionInfo.MARGIN_MODE_ISOLATED);
    }

    /* JADX INFO: renamed from: t */
    public final void m26419t(boolean z11, @NotNull String symbol, boolean z12) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1(z11, symbol, z12, this, null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
