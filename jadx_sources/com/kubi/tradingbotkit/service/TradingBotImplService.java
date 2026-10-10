package com.kubi.tradingbotkit.service;

import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.tradingbotkit.api.ITradingBotService;
import java.math.BigDecimal;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradingBotImplService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u0010\u000b\u001a\u00020\nH\u0096\u0001J\t\u0010\f\u001a\u00020\u0006H\u0096\u0001J\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010H\u0096A¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\t\u0010\u0016\u001a\u00020\u000fH\u0096\u0001J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0001J\t\u0010\u0019\u001a\u00020\u0015H\u0096\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001dH\u0096\u0001J\t\u0010\u001e\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u001f\u001a\u00020\u0015H\u0096\u0001J\t\u0010 \u001a\u00020\u001bH\u0096\u0001J\t\u0010!\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010#\u001a\u00020\u000fH\u0096\u0001J\t\u0010$\u001a\u00020%H\u0096\u0001J\t\u0010&\u001a\u00020\u0006H\u0096\u0001J\t\u0010'\u001a\u00020\u0006H\u0096\u0001J\t\u0010(\u001a\u00020\u0006H\u0096\u0001J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060-H\u0096\u0001J\t\u0010.\u001a\u00020\u0006H\u0096\u0001J\t\u0010/\u001a\u00020\u0015H\u0096\u0001J\u0011\u00100\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+H\u0096\u0001J\t\u00101\u001a\u00020\u0006H\u0096\u0001J\t\u00102\u001a\u00020\nH\u0096\u0001J\u0011\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0015H\u0096\u0001J)\u00105\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0096\u0001J\t\u00109\u001a\u00020\u0006H\u0096\u0001J\u001d\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/tradingbotkit/service/TradingBotImplService;", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "delegate", "<init>", "(Lcom/kubi/tradingbotkit/api/ITradingBotService;)V", "autoShowDialog", "", "autoShowHandlerRequest", "canShowPutValue", "newValue", "", "dialogAutoIsShowing", "dialogAutoShowHelperDismiss", "fetchSpotGridSymbols", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBotTotalBalance", "Ljava/math/BigDecimal;", "mBotAssetsFragment", "Lcom/kubi/sdk/BaseFragment;", "getContractGrid", "getFirDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "getFuturesGridFragment", "getFuturesGridType", "", "getGridDialogOpenedKey", "Lcom/kubi/utils/storage/StorageId;", "getGridTradingTypeKey", "getRobotSpotFragment", "getRobotSpotType", "getSpotGrid", "getStrategyListFragment", "type", "getWidgetOfCopyTradingRobot", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "jumpToRobotH5", "jumpToRobotH5HistoryPage", "jumpToWebBot", "observerSelectGridType", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "function", "Lkotlin/Function0;", "onDestroy", "providerRobotAssetsPage", "registerObserver", "requestGridTradingList", "tradingEntranceVisible", "updateFragment", "tradeFragment", "updateInfo", "baseCurrencyName", "assetsValue", "assetsValueLegal", "updateSelectedGrid", "updateStrategyListCurSymbol", "curSymbol", "strategyListFragment", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingBotImplService implements ITradingBotService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ITradingBotService f52487b;

    /* JADX WARN: Multi-variable type inference failed */
    public TradingBotImplService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TradingBotImplService(@NotNull ITradingBotService delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f52487b = delegate;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: a */
    public void mo63677a(@Nullable String str, @Nullable BaseFragment baseFragment) {
        this.f52487b.mo63677a(str, baseFragment);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: b */
    public void mo63678b() {
        this.f52487b.mo63678b();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: c */
    public void mo63679c() {
        this.f52487b.mo63679c();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: d */
    public int mo63680d() {
        return this.f52487b.mo63680d();
    }

    @Override // e40.InterfaceC37073a
    @Nullable
    /* JADX INFO: renamed from: e */
    public BigDecimal mo64267e(@NotNull BaseFragment mBotAssetsFragment) {
        Intrinsics.checkNotNullParameter(mBotAssetsFragment, "mBotAssetsFragment");
        return this.f52487b.mo64267e(mBotAssetsFragment);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @NotNull
    /* JADX INFO: renamed from: f */
    public ClassMappingV2 mo63681f() {
        return this.f52487b.mo63681f();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @Nullable
    /* JADX INFO: renamed from: g */
    public BaseFragment mo63682g(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f52487b.mo63682g(type);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: h */
    public void mo63683h() {
        this.f52487b.mo63683h();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: i */
    public int mo63684i() {
        return this.f52487b.mo63684i();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo63685j(@NotNull Continuation<? super HashSet<String>> continuation) {
        return this.f52487b.mo63685j(continuation);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: k */
    public boolean mo63686k() {
        return this.f52487b.mo63686k();
    }

    @Override // e40.InterfaceC37073a
    @NotNull
    /* JADX INFO: renamed from: l */
    public BaseFragment mo64268l() {
        return this.f52487b.mo64268l();
    }

    @Override // e40.InterfaceC37073a
    /* JADX INFO: renamed from: m */
    public void mo64269m(@NotNull BaseFragment mBotAssetsFragment, @NotNull String baseCurrencyName, @NotNull String assetsValue, @NotNull String assetsValueLegal) {
        Intrinsics.checkNotNullParameter(mBotAssetsFragment, "mBotAssetsFragment");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        this.f52487b.mo64269m(mBotAssetsFragment, baseCurrencyName, assetsValue, assetsValueLegal);
    }

    public /* synthetic */ TradingBotImplService(ITradingBotService iTradingBotService, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C24129b.m58030b(SiteVisibleConfigKey.TradingBot) ? new TradingBotService() : new TradingBotDisabledService() : iTradingBotService);
    }
}
