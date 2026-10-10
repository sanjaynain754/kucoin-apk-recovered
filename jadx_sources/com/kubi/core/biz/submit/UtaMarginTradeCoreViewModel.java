package com.kubi.core.biz.submit;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.core.biz.loan.entity.MarginLeverageEntity;
import com.kubi.sdk.BaseViewModel;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p593rd.InterfaceC43990a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaMarginTradeCoreViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "loanApi", "Lcom/kubi/core/biz/loan/ILoanApi;", "getLoanApi", "()Lcom/kubi/core/biz/loan/ILoanApi;", "loanApi$delegate", "Lkotlin/Lazy;", "_isSideOfBuy", "Landroidx/lifecycle/MutableLiveData;", "", "isSideOfBuy", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_marginLeverage", "Lcom/kubi/core/biz/loan/entity/MarginLeverageEntity;", "marginLeverage", "getMarginLeverage", "changeIsSideOfBuy", "", "isBuy", "fetchMarginLeverageBySymbol", "symbol", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaMarginTradeCoreViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20669X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.k2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtaMarginTradeCoreViewModel.m22506x();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f20670Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<Boolean> f20671Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<MarginLeverageEntity> f20672a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<MarginLeverageEntity> f20673b0;

    @MainThread
    /* JADX INFO: renamed from: s */
    public final void m22507s(boolean z11) {
        this.f20670Y.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: t */
    public final void m22508t(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1(this, symbol, null), 2, null);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC43990a m22509u() {
        Object value = this.f20669X.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC43990a) value;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final LiveData<MarginLeverageEntity> m22510v() {
        return this.f20673b0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<Boolean> m22511w() {
        return this.f20671Z;
    }

    public UtaMarginTradeCoreViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f20670Y = mutableLiveData;
        this.f20671Z = mutableLiveData;
        MutableLiveData<MarginLeverageEntity> mutableLiveData2 = new MutableLiveData<>();
        this.f20672a0 = mutableLiveData2;
        this.f20673b0 = mutableLiveData2;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC43990a m22506x() {
        return (InterfaceC43990a) C42597a.m93388d().create(InterfaceC43990a.class);
    }
}
