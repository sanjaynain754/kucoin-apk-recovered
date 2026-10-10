package com.kubi.tradingbotkit.business.dialogs.protocol;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.sdk.BaseViewModel;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignProtocolViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/dialogs/protocol/SignProtocolViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "signProtocolApi", "Lcom/kubi/tradingbotkit/business/dialogs/protocol/ISignProtocolApi;", "kotlin.jvm.PlatformType", "getSignProtocolApi", "()Lcom/kubi/tradingbotkit/business/dialogs/protocol/ISignProtocolApi;", "signProtocolApi$delegate", "Lkotlin/Lazy;", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_signedSuccess", "signedSuccess", "getSignedSuccess", "signProtocols", "", "strategyTemplateId", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SignProtocolViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52338X = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.dialogs.protocol.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SignProtocolViewModel.m63949w();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f52339Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<Boolean> f52340Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f52341a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<Boolean> f52342b0;

    /* JADX INFO: renamed from: t */
    public final ISignProtocolApi m63950t() {
        return (ISignProtocolApi) this.f52338X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final LiveData<Boolean> m63951u() {
        return this.f52342b0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final LiveData<Boolean> m63952v() {
        return this.f52340Z;
    }

    /* JADX INFO: renamed from: x */
    public final void m63953x(@NotNull String strategyTemplateId) {
        Intrinsics.checkNotNullParameter(strategyTemplateId, "strategyTemplateId");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new SignProtocolViewModel$signProtocols$1(this, strategyTemplateId, null), 2, null);
    }

    public SignProtocolViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f52339Y = mutableLiveData;
        this.f52340Z = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f52341a0 = mutableLiveData2;
        this.f52342b0 = mutableLiveData2;
    }

    /* JADX INFO: renamed from: w */
    public static final ISignProtocolApi m63949w() {
        return (ISignProtocolApi) C42597a.m93387c().create(ISignProtocolApi.class);
    }
}
