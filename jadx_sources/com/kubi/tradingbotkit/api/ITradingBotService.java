package com.kubi.tradingbotkit.api;

import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import e40.InterfaceC37073a;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ITradingBotService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 22\u00020\u0001:\u00012J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\fH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H&J\b\u0010\u001c\u001a\u00020\u0003H&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\b\u0010\u001f\u001a\u00020\u0003H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020\fH&J\b\u0010$\u001a\u00020\u0003H&J\u001e\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030'H&J\b\u0010(\u001a\u00020\u0003H&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H&J\"\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010,j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`-H¦@¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u000201H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/api/ITradingBotService;", "Lcom/kubi/tradingbotkit/api/ITradingBotAssetService;", "updateStrategyListCurSymbol", "", "curSymbol", "", "strategyListFragment", "Lcom/kubi/sdk/BaseFragment;", "getStrategyListFragment", "type", "jumpToRobotH5", "tradingEntranceVisible", "", "getRobotSpotType", "", "getFuturesGridType", "getGridTradingTypeKey", "getContractGrid", "getSpotGrid", "getGridDialogOpenedKey", "Lcom/kubi/utils/storage/StorageId;", "getRobotSpotFragment", "getFuturesGridFragment", "dialogAutoShowHelperDismiss", "canShowPutValue", "newValue", "updateFragment", "tradeFragment", "autoShowHandlerRequest", "getFirDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "updateSelectedGrid", "registerObserver", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "dialogAutoIsShowing", "autoShowDialog", "observerSelectGridType", "function", "Lkotlin/Function0;", "requestGridTradingList", "onDestroy", "jumpToRobotH5HistoryPage", "fetchSpotGridSymbols", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpToWebBot", "getWidgetOfCopyTradingRobot", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "Companion", "TradingBotKitApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradingBotService extends InterfaceC37073a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f52126a = Companion.f52127a;

    /* JADX INFO: compiled from: ITradingBotService.kt */
    /* JADX INFO: loaded from: classes51.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradingbotkit/api/ITradingBotService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "TradingBotKitApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f52127a = new Companion();

        @NotNull
        public final ITradingBotService get() {
            return (ITradingBotService) Router.f46192a.m56192n(ITradingBotService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo63677a(@Nullable String str, @Nullable BaseFragment baseFragment);

    /* JADX INFO: renamed from: b */
    void mo63678b();

    /* JADX INFO: renamed from: c */
    void mo63679c();

    /* JADX INFO: renamed from: d */
    int mo63680d();

    @NotNull
    /* JADX INFO: renamed from: f */
    ClassMappingV2 mo63681f();

    @Nullable
    /* JADX INFO: renamed from: g */
    BaseFragment mo63682g(@NotNull String str);

    /* JADX INFO: renamed from: h */
    void mo63683h();

    /* JADX INFO: renamed from: i */
    int mo63684i();

    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo63685j(@NotNull Continuation<? super HashSet<String>> continuation);

    /* JADX INFO: renamed from: k */
    boolean mo63686k();
}
