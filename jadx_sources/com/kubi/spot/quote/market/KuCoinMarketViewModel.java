package com.kubi.spot.quote.market;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.entity.TagEntity;
import com.kubi.spot.exeption.SpotMessage;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.tencent.bugly.proguard.C33616e0;
import e20.InterfaceC37053d;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KuCoinMarketViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "info", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "getInfo", "()Landroidx/lifecycle/MutableLiveData;", C33616e0.f69644s, "Lcom/kubi/spot/entity/TagEntity;", "getTags", "flash", "", "getFlash", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getFlashTrade", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinMarketViewModel.kt\ncom/kubi/spot/quote/market/KuCoinMarketViewModel\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,81:1\n52#2,2:82\n*S KotlinDebug\n*F\n+ 1 KuCoinMarketViewModel.kt\ncom/kubi/spot/quote/market/KuCoinMarketViewModel\n*L\n67#1:82,2\n*E\n"})
public final class KuCoinMarketViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50877V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinMarketViewModel.m62347w();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<MarketCoinInfo> f50878W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<TagEntity> f50879X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f50880Y = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> m62348p() {
        return this.f50880Y;
    }

    /* JADX INFO: renamed from: q */
    public final void m62349q(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
        if ((symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null) == null) {
            C43846g.m96568c(new SpotMessage("KuCoinMarketViewModel: baseCurrency is null", "getFlashTrade", false, 4, null), null, 2, null);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new KuCoinMarketViewModel$getFlashTrade$1(this, tradeItemBean, null), 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<MarketCoinInfo> m62350r() {
        return this.f50878W;
    }

    /* JADX INFO: renamed from: s */
    public final void m62351s(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new KuCoinMarketViewModel$getInfo$1(this, tradeItemBean, null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC37053d m62352t() {
        return (InterfaceC37053d) this.f50877V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<TagEntity> m62353u() {
        return this.f50879X;
    }

    /* JADX INFO: renamed from: v */
    public final void m62354v(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new KuCoinMarketViewModel$getTags$1(this, tradeItemBean, null), 2, null);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC37053d m62347w() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }
}
