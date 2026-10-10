package com.kubi.kumex.api;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.kumex.entity.ContractOpenNotice;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27096v0;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p705vx.InterfaceC45661b;
import p765xl.InterfaceC46260a;
import p765xl.InterfaceC46261b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IKuMexService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 j2\u00020\u0001:\u0001jJ\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\n\u001a\u00020\u0003H&J \u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H&J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0019H&J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H&J\u0014\u0010\u001c\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\b\u0010\u001f\u001a\u00020\u001bH&J\b\u0010 \u001a\u00020\u0013H&J\b\u0010!\u001a\u00020\u0003H&J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020#H&J\n\u0010'\u001a\u0004\u0018\u00010(H&J\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0013H&J\u0012\u0010,\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010(H&J\u0010\u0010-\u001a\u00020#2\u0006\u0010*\u001a\u00020(H&J\b\u0010.\u001a\u00020#H&J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0003H&J4\u00100\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u00020\u00132\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000104H&J\u0018\u00105\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0013H&J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J\u0010\u00107\u001a\u0002082\u0006\u0010\u000f\u001a\u00020\u0003H&J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0006H&J\u0010\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020(H&J\b\u0010=\u001a\u00020>H&J\b\u0010?\u001a\u00020@H&J>\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00032\u001c\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&J>\u0010H\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00032\u001c\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&J\u001c\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010J2\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0012\u0010K\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u001c\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010J2\u0006\u0010\u0017\u001a\u00020\u0003H&J\u001a\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010J0\u0006H&J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020OH&J\u001c\u0010Q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010J0RH&J\u001a\u0010S\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u0013H&J\u0010\u0010U\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0003H&J@\u0010W\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\u0006\u0010X\u001a\u00020\u00032\b\u0010Y\u001a\u0004\u0018\u00010\u00032\u001c\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&JJ\u0010Z\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\u0006\u0010[\u001a\u00020\u00032\b\u0010X\u001a\u0004\u0018\u00010\u00032\b\u0010\\\u001a\u0004\u0018\u00010\u00032\u001c\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&J,\u0010]\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\b\u0010[\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010^\u001a\u00020_H&J\b\u0010`\u001a\u00020\u0003H&J^\u0010a\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\u00032\u0014\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010J2\u001c\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&JT\u0010g\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00032(\u00103\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010J\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&JV\u0010i\u001a\u00020#2\u0006\u0010B\u001a\u00020C2\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020\u00032\u0014\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010J2\u001c\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020#0FH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006kÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kumex/api/IKuMexService;", "", "getKuMexPageId", "", "fetchQuotesListBySymbolsForDistribution", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "symbols", "getContractSymbol", "baseCurrency", "quoteCurrency", "getContractSymbolList", "getContractCurrencyInfo", "Lkotlin/Pair;", "symbol", "formatSymbolWithTag", "Lcom/kubi/utils/StyledText;", "withTag", "", "getFutureTag", "formatSymbolWithoutPerp", "getFuturesCoinAvatar", FirebaseAnalytics.Param.CURRENCY, "getFuturesGridService", "Lcom/kubi/kumex/api/IFuturesGridService;", "getLongPrecision", "", "checkUpgrade", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getMaxLeverage", "getRewardConfig", "getContractWelfare", "synchronized", "", "force", "getMarketsPageId", "fetchSystemConfig", "getFuturesFragment", "Lcom/kubi/sdk/BaseFragment;", "handleKlineInMaintenance", "futuresFragment", TIMPushProvider.f75062n, "releaseOptionEngine", "refreshFuturesFragment", "loadNoticeConfig", "isFavor", "changeFavourite", "favourite", "isNetwork", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "changeCacheFavorite", "getFutureFavorList", "getContractEntityMapBean", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "getContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "checkQuotesNotice", "baseFragment", "getContractNotice", "Lcom/kubi/kumex/entity/ContractOpenNotice;", "getAssetsService", "Lcom/kubi/kumex/api/IFuturesAssetsService;", "requestFutureMarketClosePosition", "ctx", "Landroid/content/Context;", "subUid", "positionJson", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "requestFuturePositionTpSl", "getFuturesConfig", "", "getKlineContractConfigJson", "getFuturesCoinConfig", "getFuturesCoinConfigList", "futuresContainerRouterIntercept", "Lcom/kubi/router/model/Postcard;", "originPostcard", "map2UnifyContractConfig", "Lkotlinx/coroutines/flow/Flow;", "hasContract", "wait", "futuresRobotVisible", "type", "modifyFuturesOrder", "orderInfo", "targetPrice", "cancelFuturesOrder", "orderId", "tpslOrderInfo", "jumpFuturesDelegationDetail", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getContractTradeUnit", "handleMenuAction", "objects", "Ljava/lang/Object;", "source", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, ReportDataTable.COLUMN_PARAMS, "getFeaturesConfig", "tabType", "shareFuturesPositionPnl", "Companion", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKuMexService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f28731a = Companion.f28732a;

    /* JADX INFO: compiled from: IKuMexService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/api/IKuMexService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/kumex/api/IKuMexService;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f28732a = new Companion();

        @NotNull
        public final IKuMexService get() {
            return (IKuMexService) Router.f46192a.m56192n(IKuMexService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    List<Map<String, Object>> mo33252A();

    /* JADX INFO: renamed from: B */
    boolean mo33253B(@NotNull String str, boolean z11);

    /* JADX INFO: renamed from: C */
    boolean mo33254C(@Nullable FragmentManager fragmentManager);

    @NotNull
    /* JADX INFO: renamed from: D */
    C27096v0 mo33255D(@NotNull String str, boolean z11);

    /* JADX INFO: renamed from: E */
    void mo33256E(@NotNull String str, boolean z11);

    @Nullable
    /* JADX INFO: renamed from: F */
    String mo33257F(@NotNull String str);

    /* JADX INFO: renamed from: G */
    void mo33258G(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    /* JADX INFO: renamed from: H */
    void mo33259H(@NotNull Context context, @Nullable String str, @Nullable String str2, @NotNull OrderEntity orderEntity);

    @NotNull
    /* JADX INFO: renamed from: I */
    String mo33260I();

    @Nullable
    /* JADX INFO: renamed from: J */
    String mo33261J(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: K */
    boolean mo33262K(@NotNull String str);

    /* JADX INFO: renamed from: L */
    void mo33263L(@NotNull Context context, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    @NotNull
    /* JADX INFO: renamed from: M */
    String mo33264M(@NotNull String str);

    /* JADX INFO: renamed from: O */
    void mo33265O(@Nullable BaseFragment baseFragment);

    @NotNull
    /* JADX INFO: renamed from: P */
    List<String> mo33266P(@NotNull String str);

    /* JADX INFO: renamed from: Q */
    void mo33267Q(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: R */
    void mo33268R(@NotNull String str, boolean z11, boolean z12, @Nullable Function0<Unit> function0);

    @NotNull
    /* JADX INFO: renamed from: S */
    Map<String, Object> mo33269S(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: U */
    BaseFragment mo33270U();

    @NotNull
    /* JADX INFO: renamed from: V */
    C4400a mo33271V(@NotNull C4400a c4400a);

    /* JADX INFO: renamed from: W */
    void mo33272W(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: X */
    void mo33273X(@NotNull Context context, @Nullable Object obj, @NotNull String str, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    /* JADX INFO: renamed from: a */
    void mo33274a(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    /* JADX INFO: renamed from: c */
    void mo33275c(boolean z11);

    /* JADX INFO: renamed from: d */
    void mo33276d(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    /* JADX INFO: renamed from: e */
    int mo33277e();

    /* JADX INFO: renamed from: f */
    void mo33278f(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2);

    /* JADX INFO: renamed from: g */
    void mo33279g();

    /* JADX INFO: renamed from: h */
    void mo33280h();

    /* JADX INFO: renamed from: i */
    void mo33281i(@NotNull BaseFragment baseFragment, boolean z11);

    /* JADX INFO: renamed from: j */
    void mo33282j(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2);

    @NotNull
    /* JADX INFO: renamed from: k */
    List<ContractEntity> mo33283k();

    /* JADX INFO: renamed from: l */
    boolean mo33284l();

    @NotNull
    /* JADX INFO: renamed from: n */
    InterfaceC46261b mo33285n();

    @NotNull
    /* JADX INFO: renamed from: o */
    Map<String, Object> mo33286o(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: p */
    ContractOpenNotice mo33287p();

    @NotNull
    /* JADX INFO: renamed from: r */
    String mo33288r();

    @NotNull
    /* JADX INFO: renamed from: s */
    String mo33289s(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: t */
    InterfaceC46260a mo33290t();

    @NotNull
    /* JADX INFO: renamed from: u */
    String mo33291u();

    @NotNull
    /* JADX INFO: renamed from: v */
    String mo33292v();

    /* JADX INFO: renamed from: w */
    int mo33293w(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: x */
    Observable<List<QuotesEntity>> mo33294x(@NotNull List<String> list);

    @NotNull
    /* JADX INFO: renamed from: y */
    ContractEntityOpenData mo33295y(@NotNull String str);

    /* JADX INFO: renamed from: z */
    boolean mo33296z(@NotNull String str);

    /* JADX INFO: renamed from: N */
    static /* synthetic */ boolean m33248N(IKuMexService iKuMexService, FragmentManager fragmentManager, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUpgrade");
        }
        if ((i11 & 1) != 0) {
            fragmentManager = null;
        }
        return iKuMexService.mo33254C(fragmentManager);
    }

    /* JADX INFO: renamed from: T */
    static /* synthetic */ C27096v0 m33249T(IKuMexService iKuMexService, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatSymbolWithTag");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return iKuMexService.mo33255D(str, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    static /* synthetic */ void m33250m(IKuMexService iKuMexService, String str, boolean z11, boolean z12, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeFavourite");
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        iKuMexService.mo33268R(str, z11, z12, function0);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ boolean m33251q(IKuMexService iKuMexService, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasContract");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return iKuMexService.mo33253B(str, z11);
    }
}
