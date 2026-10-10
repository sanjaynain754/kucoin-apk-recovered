package com.kubi.margin.market;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.entity.TagEntity;
import com.kubi.margin.exception.MarginMessage;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.tencent.bugly.proguard.C33616e0;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p768xo.InterfaceC46307h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginMarketViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/margin/market/MarginMarketViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "mApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/margin/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "info", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/margin/market/info/MarketCoinInfo;", "getInfo", "()Landroidx/lifecycle/MutableLiveData;", C33616e0.f69644s, "Lcom/kubi/margin/entity/TagEntity;", "getTags", "flash", "", "getFlash", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getFlashTrade", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketViewModel.kt\ncom/kubi/margin/market/MarginMarketViewModel\n+ 2 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n*L\n1#1,83:1\n48#2,2:84\n*S KotlinDebug\n*F\n+ 1 MarginMarketViewModel.kt\ncom/kubi/margin/market/MarginMarketViewModel\n*L\n69#1:84,2\n*E\n"})
public final class MarginMarketViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33207V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketViewModel.m38818w();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<MarketCoinInfo> f33208W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<TagEntity> f33209X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f33210Y = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> m38819p() {
        return this.f33210Y;
    }

    /* JADX INFO: renamed from: q */
    public final void m38820q(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
        if ((symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null) == null) {
            C43846g.m96568c(new MarginMessage("MarginMarketViewModel: baseCurrency is null", "getFlashTrade", false, 4, null), null, 2, null);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new MarginMarketViewModel$getFlashTrade$1(this, tradeItemBean, null), 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<MarketCoinInfo> m38821r() {
        return this.f33208W;
    }

    /* JADX INFO: renamed from: s */
    public final void m38822s(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new MarginMarketViewModel$getInfo$1(this, tradeItemBean, null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC46307h m38823t() {
        return (InterfaceC46307h) this.f33207V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<TagEntity> m38824u() {
        return this.f33209X;
    }

    /* JADX INFO: renamed from: v */
    public final void m38825v(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new MarginMarketViewModel$getTags$1(this, tradeItemBean, null), 2, null);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC46307h m38818w() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }
}
