package com.kubi.tradingbotkit.service;

import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.tradingbotkit.business.asset.BotAssetsFragment;
import com.kubi.tradingbotkit.widget.C26257h;
import java.math.BigDecimal;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradingBotDisabledService.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0017H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\u001e\u00100\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000702H\u0016J\b\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u0007H\u0016J\"\u00106\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u000107j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`8H\u0096@¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0007H\u0002¨\u0006?"}, m90084d2 = {"Lcom/kubi/tradingbotkit/service/TradingBotDisabledService;", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "<init>", "()V", "providerRobotAssetsPage", "Lcom/kubi/sdk/BaseFragment;", "updateInfo", "", "mBotAssetsFragment", "baseCurrencyName", "", "assetsValue", "assetsValueLegal", "getBotTotalBalance", "Ljava/math/BigDecimal;", "updateStrategyListCurSymbol", "curSymbol", "strategyListFragment", "getStrategyListFragment", "", "type", "jumpToRobotH5", "tradingEntranceVisible", "", "getRobotSpotType", "", "getFuturesGridType", "getGridTradingTypeKey", "getContractGrid", "getSpotGrid", "getGridDialogOpenedKey", "Lcom/kubi/utils/storage/StorageId;", "getRobotSpotFragment", "getFuturesGridFragment", "dialogAutoShowHelperDismiss", "canShowPutValue", "newValue", "updateFragment", "tradeFragment", "autoShowHandlerRequest", "getFirDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "updateSelectedGrid", "registerObserver", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "dialogAutoIsShowing", "autoShowDialog", "observerSelectGridType", "function", "Lkotlin/Function0;", "requestGridTradingList", "onDestroy", "jumpToRobotH5HistoryPage", "fetchSpotGridSymbols", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpToWebBot", "getWidgetOfCopyTradingRobot", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "assertInDebugMode", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingBotDisabledService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingBotDisabledService.kt\ncom/kubi/tradingbotkit/service/TradingBotDisabledService\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,171:1\n44#2,2:172\n*S KotlinDebug\n*F\n+ 1 TradingBotDisabledService.kt\ncom/kubi/tradingbotkit/service/TradingBotDisabledService\n*L\n169#1:172,2\n*E\n"})
public final class TradingBotDisabledService implements ITradingBotService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f52486b = new Companion(null);

    /* JADX INFO: compiled from: TradingBotDisabledService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradingbotkit/service/TradingBotDisabledService$Companion;", "", "<init>", "()V", "TAG", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: d */
    public int mo63680d() {
        return 4;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: i */
    public int mo63684i() {
        return 5;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: k */
    public boolean mo63686k() {
        return false;
    }

    @Override // e40.InterfaceC37073a
    @Nullable
    /* JADX INFO: renamed from: e */
    public BigDecimal mo64267e(@NotNull BaseFragment mBotAssetsFragment) {
        Intrinsics.checkNotNullParameter(mBotAssetsFragment, "mBotAssetsFragment");
        m64270n();
        return null;
    }

    @Override // e40.InterfaceC37073a
    /* JADX INFO: renamed from: m */
    public void mo64269m(@NotNull BaseFragment mBotAssetsFragment, @NotNull String baseCurrencyName, @NotNull String assetsValue, @NotNull String assetsValueLegal) {
        Intrinsics.checkNotNullParameter(mBotAssetsFragment, "mBotAssetsFragment");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        m64270n();
    }

    /* JADX INFO: renamed from: n */
    public final void m64270n() {
        C43846g.m96568c(new KCConfigException(new IllegalStateException("TradingBot service not available"), "TradingBotDisabledService", false, null, 8, null), null, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public Void m64271o(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: b */
    public void mo63678b() {
        m64270n();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @NotNull
    /* JADX INFO: renamed from: f */
    public ClassMappingV2 mo63681f() {
        return C26257h.m64363a();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ BaseFragment mo63682g(String str) {
        return (BaseFragment) m64271o(str);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo63685j(@NotNull Continuation<? super HashSet<String>> continuation) {
        m64270n();
        return null;
    }

    @Override // e40.InterfaceC37073a
    @NotNull
    /* JADX INFO: renamed from: l */
    public BaseFragment mo64268l() {
        m64270n();
        return BotAssetsFragment.f52214a0.newInstance();
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: c */
    public void mo63679c() {
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: h */
    public void mo63683h() {
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: a */
    public void mo63677a(@Nullable String str, @Nullable BaseFragment baseFragment) {
    }
}
