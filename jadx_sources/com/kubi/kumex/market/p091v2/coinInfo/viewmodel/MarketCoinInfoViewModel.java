package com.kubi.kumex.market.p091v2.coinInfo.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/viewmodel/MarketCoinInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_isLoadingFailed", "isLoadingFailed", "_symbolCode", "", "symbolCode", "getSymbolCode", "_marketCoinInfo", "Lcom/kubi/kumex/market/v2/coinInfo/viewmodel/MarketCoinInfoWrapper;", "marketCoinInfo", "getMarketCoinInfo", "fetchCoinInfo", "", "symbol", "fetchSymbolInfo", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketCoinInfoViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Boolean> f29751V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<Boolean> f29752W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f29753X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Boolean> f29754Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f29755Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<String> f29756a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<MarketCoinInfoWrapper> f29757b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<MarketCoinInfoWrapper> f29758c0;

    /* JADX INFO: renamed from: g */
    public final void m35091g(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f29751V.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new MarketCoinInfoViewModel$fetchCoinInfo$1(symbol, this, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m35092h(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new MarketCoinInfoViewModel$fetchSymbolInfo$1(symbol, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<MarketCoinInfoWrapper> m35093n() {
        return this.f29758c0;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<String> m35094o() {
        return this.f29756a0;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<Boolean> m35095p() {
        return this.f29752W;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<Boolean> m35096q() {
        return this.f29754Y;
    }

    public MarketCoinInfoViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f29751V = mutableLiveData;
        this.f29752W = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f29753X = mutableLiveData2;
        this.f29754Y = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.f29755Z = mutableLiveData3;
        this.f29756a0 = mutableLiveData3;
        MutableLiveData<MarketCoinInfoWrapper> mutableLiveData4 = new MutableLiveData<>();
        this.f29757b0 = mutableLiveData4;
        this.f29758c0 = mutableLiveData4;
    }
}
