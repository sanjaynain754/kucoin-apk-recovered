package com.kubi.futures.trade;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.FuturesAirdropProfitEntity;
import com.kubi.kumex.data.platform.model.FuturesBannerEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.sdk.BaseViewModel;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0016\u0010!\u001a\u00020\u001e2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#J\u0016\u0010%\u001a\u00020\u001e2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0#J\u0006\u0010'\u001a\u00020\u001eJ\u0006\u0010(\u001a\u00020\u001eJ\u0006\u0010)\u001a\u00020\u001eJ\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000eJ\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u000eJ\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eJ\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u000eH\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00120\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/futures/trade/FuturesViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "adLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/ad/api/entity/ResAdEntity;", "getAdLiveData", "()Landroidx/lifecycle/MutableLiveData;", "fundingRateChangeData", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "getFundingRateChangeData", "airdropPopInfo", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "getAirdropPopInfo", "showCopyTradingGuide", "", "getShowCopyTradingGuide", "bannerListLiveData", "", "Lcom/kubi/kumex/data/platform/model/FuturesBannerEntity;", "getBannerListLiveData", "lowLiquidityPeriod", "kotlin.jvm.PlatformType", "getLowLiquidityPeriod", "lowLiquidityPollingJob", "Lkotlinx/coroutines/Job;", "startLowLiquidityPolling", "", "stopLowLiquidityPolling", "fetchAndCheckShowCopyTradingGuide", "obsDistributionData", "consumer", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "obsAirdropRealisedData", "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "fetchHedgeDiscountRate", "fetchSymbolConfig", "fetchFuturesAd", "getFundingRateChange", "symbol", "fetchAirdropBonusPopInfo", "airdropCode", "fetchBannerList", "lang", "closeBanner", "banner", "shouldDisplayBanner", "bannerId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,408:1\n75#2,2:409\n75#2,2:411\n84#2:413\n*S KotlinDebug\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel\n*L\n393#1:409,2\n395#1:411,2\n403#1:413\n*E\n"})
public final class FuturesViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f23633e0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<ResAdEntity> f23634X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<TickerEntity> f23635Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Pair<String, AirdropBonusEntity>> f23636Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f23637a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<FuturesBannerEntity>> f23638b0 = new MutableLiveData<>(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f23639c0 = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public InterfaceC41775x1 f23640d0;

    /* JADX INFO: compiled from: FuturesViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/FuturesViewModel$Companion;", "", "<init>", "()V", "BANNER_CATEGORIES", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Pair<String, AirdropBonusEntity>> m26713A() {
        return this.f23636Z;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<List<FuturesBannerEntity>> m26714B() {
        return this.f23638b0;
    }

    /* JADX INFO: renamed from: C */
    public final void m26715C(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FuturesViewModel$getFundingRateChange$1(symbol, this, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final MutableLiveData<TickerEntity> m26716D() {
        return this.f23635Y;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final MutableLiveData<Boolean> m26717E() {
        return this.f23639c0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final MutableLiveData<Boolean> m26718F() {
        return this.f23637a0;
    }

    /* JADX INFO: renamed from: G */
    public final void m26719G(@NotNull Consumer<FuturesAirdropProfitEntity> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FuturesViewModel$obsAirdropRealisedData$1(consumer, null), 3, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m26720H(@NotNull Consumer<FuturesWelfareTrialItemEntity> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FuturesViewModel$obsDistributionData$1(consumer, null), 3, null);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m26721I(String str) {
        return RepositoryServiceLocator.f19236a.m20288g().mo25031v() - C46392a.m102324f(C46894j.f104736a.m103267f(str), 0L) > ((long) 864000000);
    }

    /* JADX INFO: renamed from: J */
    public final void m26722J() {
        InterfaceC41775x1 interfaceC41775x1 = this.f23640d0;
        if (interfaceC41775x1 == null || !interfaceC41775x1.isActive()) {
            this.f23640d0 = C41636g.m90891O(C41636g.m90896T(C41636g.m90890N(C41636g.m90892P(C41636g.m90887K(new FuturesViewModel$startLowLiquidityPolling$1(null)), new FuturesViewModel$startLowLiquidityPolling$2(this, null)), C42911a.m94120b()), new FuturesViewModel$startLowLiquidityPolling$3(this, null)), ViewModelKt.getViewModelScope(this));
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m26723K() {
        InterfaceC41775x1 interfaceC41775x1 = this.f23640d0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f23640d0 = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m26724r(@NotNull FuturesBannerEntity banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        String strM66668h = C27041f.m66668h(banner.getId());
        long jMo25031v = RepositoryServiceLocator.f19236a.m20288g().mo25031v();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jMo25031v);
        int i11 = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.add(6, 1);
        if (i11 < 0 || i11 >= 20) {
            calendar2.set(11, 4);
        } else {
            calendar2.set(11, 0);
        }
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long timeInMillis = calendar2.getTimeInMillis() / 1000;
        C46894j c46894j = C46894j.f104736a;
        C46392a.m102330m(c46894j.m103276o(), timeInMillis);
        C44128b.m97258b("bieber. close banner " + timeInMillis + "..... " + strM66668h + ",,,,,, " + banner.getTitle());
        C46392a.m102330m(c46894j.m103267f(strM66668h), jMo25031v);
    }

    /* JADX INFO: renamed from: s */
    public final void m26725s(@NotNull String airdropCode) {
        Intrinsics.checkNotNullParameter(airdropCode, "airdropCode");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new FuturesViewModel$fetchAirdropBonusPopInfo$1(airdropCode, this, null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m26726t() {
        if (KuMexDepend.f30378a.m35905g().c()) {
            C24129b.m58033e(SiteVisibleConfigKey.CopyTrading, new Function0() { // from class: com.kubi.futures.trade.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesViewModel.m26712u(this.f24969b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m26727v(@NotNull String lang, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new FuturesViewModel$fetchBannerList$1(lang, symbol, this, null), 2, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m26729x() {
        if (KuMexDepend.f30378a.m35905g().c()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new FuturesViewModel$fetchHedgeDiscountRate$1(null), 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final MutableLiveData<ResAdEntity> m26731z() {
        return this.f23634X;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m26712u(FuturesViewModel futuresViewModel) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(futuresViewModel), C42911a.m94120b().plus(C37213a.m83253c()), null, new FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1(futuresViewModel, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public final void m26728w() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new FuturesViewModel$fetchFuturesAd$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m26730y() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new FuturesViewModel$fetchSymbolConfig$1(null), 2, null);
    }
}
