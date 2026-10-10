package com.kubi.kumex.market.p091v2.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/viewModel/MarketInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_showMarketCoinInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/market/v2/viewModel/MarketCoinInfoUiStatus;", "showMarketCoinInfo", "Landroidx/lifecycle/LiveData;", "getShowMarketCoinInfo", "()Landroidx/lifecycle/LiveData;", "_usStockMarketStatus", "Lcom/kubi/kumex/market/v2/viewModel/UsStockMarketStatus;", "kotlin.jvm.PlatformType", "usStockMarketStatus", "getUsStockMarketStatus", "lowLiquidityPollingJob", "Lkotlinx/coroutines/Job;", "updateMarketCoinInfoTabUiStatus", "", "symbol", "", "hasCoinInfo", "", "startLowLiquidityPolling", "isUsStock", "stopLowLiquidityPolling", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketInfoViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<MarketCoinInfoUiStatus> f29855V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<MarketCoinInfoUiStatus> f29856W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<UsStockMarketStatus> f29857X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<UsStockMarketStatus> f29858Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f29859Z;

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<MarketCoinInfoUiStatus> m35119n() {
        return this.f29856W;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<UsStockMarketStatus> m35120o() {
        return this.f29858Y;
    }

    /* JADX INFO: renamed from: p */
    public final void m35121p(boolean z11) {
        InterfaceC41775x1 interfaceC41775x1 = this.f29859Z;
        if (interfaceC41775x1 == null || !interfaceC41775x1.isActive()) {
            this.f29859Z = C41636g.m90891O(C41636g.m90896T(C41636g.m90890N(C41636g.m90892P(C41636g.m90887K(new MarketInfoViewModel$startLowLiquidityPolling$1(null)), new MarketInfoViewModel$startLowLiquidityPolling$2(z11, this, null)), C41782z0.m91392b()), new MarketInfoViewModel$startLowLiquidityPolling$3(this, null)), ViewModelKt.getViewModelScope(this));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m35122q() {
        InterfaceC41775x1 interfaceC41775x1 = this.f29859Z;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f29859Z = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m35123r(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f29855V.postValue(new MarketCoinInfoUiStatus(symbol, z11));
    }

    public MarketInfoViewModel() {
        MutableLiveData<MarketCoinInfoUiStatus> mutableLiveData = new MutableLiveData<>();
        this.f29855V = mutableLiveData;
        this.f29856W = mutableLiveData;
        MutableLiveData<UsStockMarketStatus> mutableLiveData2 = new MutableLiveData<>(new UsStockMarketStatus(false, null, 3, null));
        this.f29857X = mutableLiveData2;
        this.f29858Y = mutableLiveData2;
    }
}
