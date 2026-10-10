package com.kubi.tradingbotkit.service;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.host.HostManager;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.tradingbotkit.business.asset.BotAssetsFragment;
import com.kubi.tradingbotkit.business.spot.repostory.RobotSpotRepository;
import com.kubi.tradingbotkit.business.strategyList.StrategyListFragment;
import com.kubi.tradingbotkit.entity.SymbolEntity;
import com.kubi.tradingbotkit.widget.C26257h;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k50.C40911a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradingBotService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u001c\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\u0010\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\u001e\u00105\u001a\u00020\u00072\u0006\u00101\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000707H\u0016J\b\u00108\u001a\u00020\u0007H\u0016J\"\u00109\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010:j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`;H\u0096@¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u0007H\u0016J\b\u0010>\u001a\u00020\u0007H\u0016J\b\u0010?\u001a\u00020\u0007H\u0016J\b\u0010@\u001a\u00020AH\u0016R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/tradingbotkit/service/TradingBotService;", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "<init>", "()V", "providerRobotAssetsPage", "Lcom/kubi/sdk/BaseFragment;", "updateInfo", "", "mBotAssetsFragment", "baseCurrencyName", "", "assetsValue", "assetsValueLegal", "getBotTotalBalance", "Ljava/math/BigDecimal;", "getStrategyListFragment", "type", "updateStrategyListCurSymbol", "curSymbol", "strategyListFragment", "jumpToRobotH5", "tradingEntranceVisible", "", "getRobotSpotType", "", "getFuturesGridType", "getGridTradingTypeKey", "getContractGrid", "getSpotGrid", "getGridDialogOpenedKey", "Lcom/kubi/utils/storage/StorageId;", "getRobotSpotFragment", "getFuturesGridFragment", "gridTradingListModel", "Lcom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel;", "autoShowDialogViewModel", "Lcom/kubi/tradingbotkit/business/autoShowDialog/AutoShowDialogViewModel;", "tradeFragment", "dialogAutoShowHelper", "Lcom/kubi/tradingbotkit/business/autoShowDialog/DialogAutoShowHelper;", "updateFragment", "autoShowHandlerRequest", "getFirDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "dialogAutoShowHelperDismiss", "canShowPutValue", "newValue", "updateSelectedGrid", "registerObserver", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "dialogAutoIsShowing", "autoShowDialog", "observerSelectGridType", "function", "Lkotlin/Function0;", "requestGridTradingList", "fetchSpotGridSymbols", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpToWebBot", "onDestroy", "jumpToRobotH5HistoryPage", "getWidgetOfCopyTradingRobot", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingBotService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingBotService.kt\ncom/kubi/tradingbotkit/service/TradingBotService\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n172#2,9:219\n172#2,9:228\n1617#3,9:237\n1869#3:246\n1870#3:248\n1626#3:249\n1#4:247\n1#4:250\n*S KotlinDebug\n*F\n+ 1 TradingBotService.kt\ncom/kubi/tradingbotkit/service/TradingBotService\n*L\n127#1:219,9\n129#1:228,9\n194#1:237,9\n194#1:246\n194#1:248\n194#1:249\n194#1:247\n*E\n"})
public final class TradingBotService implements ITradingBotService {
    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: b */
    public void mo63678b() {
        C40911a.m89599c("/tabpage/profit/profitlist", null, false, 6, null);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: d */
    public int mo63680d() {
        return 4;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: h */
    public void mo63683h() {
        C40911a.m89599c("", null, false, 6, null);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: i */
    public int mo63684i() {
        return 5;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: a */
    public void mo63677a(@Nullable String str, @Nullable BaseFragment baseFragment) {
        if (str == null) {
            return;
        }
        StrategyListFragment strategyListFragment = baseFragment instanceof StrategyListFragment ? (StrategyListFragment) baseFragment : null;
        if (strategyListFragment != null) {
            strategyListFragment.m64121R3(str);
        }
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: c */
    public void mo63679c() {
        C37304a c37304a = C37304a.f82764a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.j());
        sb2.append("?loading=2&needLogin=true&lang=");
        sb2.append(MultiLanguageManager.f46811g.getLocale());
        sb2.append("&appNeedLang=true&night=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
        InterfaceC37766r.a.m85190a(c37304a, sb2.toString(), null, null, null, null, null, null, 126, null);
    }

    @Override // e40.InterfaceC37073a
    @Nullable
    /* JADX INFO: renamed from: e */
    public BigDecimal mo64267e(@NotNull BaseFragment mBotAssetsFragment) {
        Intrinsics.checkNotNullParameter(mBotAssetsFragment, "mBotAssetsFragment");
        BotAssetsFragment botAssetsFragment = mBotAssetsFragment instanceof BotAssetsFragment ? (BotAssetsFragment) mBotAssetsFragment : null;
        if (botAssetsFragment != null) {
            return botAssetsFragment.m63739S3();
        }
        return null;
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @Nullable
    /* JADX INFO: renamed from: g */
    public BaseFragment mo63682g(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (TradingBotKitDepend.f52488a.m64276c().mo33296z(type)) {
            return StrategyListFragment.f52409a0.newInstance(type);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo63685j(@NotNull Continuation<? super HashSet<String>> continuation) {
        TradingBotService$fetchSpotGridSymbols$1 tradingBotService$fetchSpotGridSymbols$1;
        if (continuation instanceof TradingBotService$fetchSpotGridSymbols$1) {
            tradingBotService$fetchSpotGridSymbols$1 = (TradingBotService$fetchSpotGridSymbols$1) continuation;
            int i11 = tradingBotService$fetchSpotGridSymbols$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradingBotService$fetchSpotGridSymbols$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradingBotService$fetchSpotGridSymbols$1 = new TradingBotService$fetchSpotGridSymbols$1(this, continuation);
            }
        } else {
            tradingBotService$fetchSpotGridSymbols$1 = new TradingBotService$fetchSpotGridSymbols$1(this, continuation);
        }
        TradingBotService$fetchSpotGridSymbols$1 tradingBotService$fetchSpotGridSymbols$2 = tradingBotService$fetchSpotGridSymbols$1;
        Object objM42826g = tradingBotService$fetchSpotGridSymbols$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradingBotService$fetchSpotGridSymbols$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e interfaceC41634eD = new RobotSpotRepository().d();
            tradingBotService$fetchSpotGridSymbols$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eD, false, null, tradingBotService$fetchSpotGridSymbols$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        List list = (List) ((C19334f) objM42826g).m42846a();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String symbol = ((SymbolEntity) it.next()).getSymbol();
            if (symbol != null) {
                arrayList.add(symbol);
            }
        }
        return new HashSet(arrayList);
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    /* JADX INFO: renamed from: k */
    public boolean mo63686k() {
        return C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid) || C24129b.m58030b(SiteVisibleConfigKey.BotFuturesContractGrid);
    }

    @Override // e40.InterfaceC37073a
    @NotNull
    /* JADX INFO: renamed from: l */
    public BaseFragment mo64268l() {
        return BotAssetsFragment.f52214a0.newInstance();
    }

    @Override // e40.InterfaceC37073a
    /* JADX INFO: renamed from: m */
    public void mo64269m(@NotNull BaseFragment mBotAssetsFragment, @NotNull String baseCurrencyName, @NotNull String assetsValue, @NotNull String assetsValueLegal) {
        Intrinsics.checkNotNullParameter(mBotAssetsFragment, "mBotAssetsFragment");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        BotAssetsFragment botAssetsFragment = mBotAssetsFragment instanceof BotAssetsFragment ? (BotAssetsFragment) mBotAssetsFragment : null;
        if (botAssetsFragment != null) {
            botAssetsFragment.m63751h4(baseCurrencyName, assetsValue, assetsValueLegal);
        }
    }

    @Override // com.kubi.tradingbotkit.api.ITradingBotService
    @NotNull
    /* JADX INFO: renamed from: f */
    public ClassMappingV2 mo63681f() {
        return C26257h.m64363a();
    }
}
