package com.kubi.spot.quote.coin;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.spot.quote.market.info.CoinWrapEntity;
import e20.InterfaceC37053d;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCoinCoinViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/api/MarketApi;", "api$delegate", "Lkotlin/Lazy;", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/spot/quote/market/info/CoinWrapEntity;", "getData", "()Landroidx/lifecycle/MutableLiveData;", "flash", "", "getFlash", "getInfo", "", "coin", "", "getFlashTrade", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCoinCoinViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50788V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinCoinViewModel.m62200p();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<CoinWrapEntity> f50789W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f50790X = new MutableLiveData<>();

    /* JADX INFO: renamed from: q */
    public final InterfaceC37053d m62201q() {
        return (InterfaceC37053d) this.f50788V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<CoinWrapEntity> m62202r() {
        return this.f50789W;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Boolean> m62203s() {
        return this.f50790X;
    }

    /* JADX INFO: renamed from: t */
    public final void m62204t(@NotNull String coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new KuCoinCoinViewModel$getFlashTrade$1(this, coin, null), 2, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m62205u(@NotNull String coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new KuCoinCoinViewModel$getInfo$1(this, coin, null), 2, null);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC37053d m62200p() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }
}
