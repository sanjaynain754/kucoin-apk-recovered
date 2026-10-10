package com.kubi.kumex.service;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.kumex.entity.ContractOpenNotice;
import com.kubi.kumex.entity.PositionWrapperEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p236em.C37214b;
import p765xl.InterfaceC46260a;
import p765xl.InterfaceC46261b;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KuMexDisabledService.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 n2\u00020\u0001:\u0001nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J \u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0017J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0015H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020%H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u0015H\u0016J\u0012\u0010.\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u0010,\u001a\u00020*H\u0016J\b\u00100\u001a\u00020%H\u0016J\u0010\u00101\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J0\u00102\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00152\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000106H\u0016J\u0018\u00107\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0015H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0010\u00109\u001a\u00020:2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\bH\u0016J\u0010\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020*H\u0016J\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020BH\u0016J>\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u001c\u00105\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016J>\u0010J\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u001c\u00105\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016J\u001c\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M0L2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u001c\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M0L2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u001a\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M0L0\bH\u0016J\u001c\u0010Q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010M0L0RH\u0016J\u0018\u0010S\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0015H\u0016J\u0010\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020VH\u0016J\u0010\u0010X\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0005H\u0016J@\u0010Z\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u0006\u0010[\u001a\u00020\u00052\b\u0010\\\u001a\u0004\u0018\u00010\u00052\u001c\u00105\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016JJ\u0010]\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u0006\u0010^\u001a\u00020\u00052\b\u0010[\u001a\u0004\u0018\u00010\u00052\b\u0010_\u001a\u0004\u0018\u00010\u00052\u001c\u00105\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016J,\u0010`\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\b\u0010^\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010a\u001a\u00020bH\u0016J\b\u0010c\u001a\u00020\u0005H\u0016J\b\u0010d\u001a\u00020%H\u0002JT\u0010e\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\b\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u00052(\u00105\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M\u0018\u00010L\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016J^\u0010j\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\b\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020\u00052\u0006\u0010k\u001a\u00020\u00052\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M\u0018\u00010L2\u001c\u00105\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016JV\u0010m\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\b\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020\u00052\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M\u0018\u00010L2\u001c\u00105\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010I\u0012\u0004\u0012\u00020%0HH\u0016¨\u0006o"}, m90084d2 = {"Lcom/kubi/kumex/service/KuMexDisabledService;", "Lcom/kubi/kumex/api/IKuMexService;", "<init>", "()V", "getKuMexPageId", "", "fetchQuotesListBySymbolsForDistribution", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "symbols", "getContractSymbol", "baseCurrency", "quoteCurrency", "getContractSymbolList", "getContractCurrencyInfo", "Lkotlin/Pair;", "symbol", "formatSymbolWithTag", "Lcom/kubi/utils/StyledText;", "withTag", "", "getFutureTag", "formatSymbolWithoutPerp", "getFuturesCoinAvatar", FirebaseAnalytics.Param.CURRENCY, "getFuturesGridService", "Lcom/kubi/kumex/api/IFuturesGridService;", "getLongPrecision", "", "checkUpgrade", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getMaxLeverage", "getRewardConfig", "getContractWelfare", "synchronized", "", "force", "getMarketsPageId", "fetchSystemConfig", "getFuturesFragment", "Lcom/kubi/sdk/BaseFragment;", "handleKlineInMaintenance", "futuresFragment", TIMPushProvider.f75062n, "releaseOptionEngine", "refreshFuturesFragment", "loadNoticeConfig", "isFavor", "changeFavourite", "favourite", "isNetwork", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "changeCacheFavorite", "getFutureFavorList", "getContractEntityMapBean", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "getContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "checkQuotesNotice", "baseFragment", "getContractNotice", "Lcom/kubi/kumex/entity/ContractOpenNotice;", "getAssetsService", "Lcom/kubi/kumex/api/IFuturesAssetsService;", "requestFutureMarketClosePosition", "ctx", "Landroid/content/Context;", "subUid", "positionJson", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "requestFuturePositionTpSl", "getFuturesConfig", "", "", "getKlineContractConfigJson", "getFuturesCoinConfig", "getFuturesCoinConfigList", "map2UnifyContractConfig", "Lkotlinx/coroutines/flow/Flow;", "hasContract", "wait", "futuresContainerRouterIntercept", "Lcom/kubi/router/model/Postcard;", "originPostcard", "futuresRobotVisible", "type", "modifyFuturesOrder", "orderInfo", "targetPrice", "cancelFuturesOrder", "orderId", "tpslOrderInfo", "jumpFuturesDelegationDetail", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getContractTradeUnit", "assertInDebugMode", "getFeaturesConfig", "objects", "Ljava/lang/Object;", "source", "tabType", "handleMenuAction", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, ReportDataTable.COLUMN_PARAMS, "shareFuturesPositionPnl", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexDisabledService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexDisabledService.kt\ncom/kubi/kumex/service/KuMexDisabledService\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,343:1\n16#2:344\n*S KotlinDebug\n*F\n+ 1 KuMexDisabledService.kt\ncom/kubi/kumex/service/KuMexDisabledService\n*L\n116#1:344\n*E\n"})
public final class KuMexDisabledService implements IKuMexService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f30375b = new Companion(null);

    /* JADX INFO: compiled from: KuMexDisabledService.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/service/KuMexDisabledService$Companion;", "", "<init>", "()V", "DEFAULT_MAX_LEVERAGE", "", "TAG", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexDisabledService$a */
    /* JADX INFO: compiled from: KuMexDisabledService.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/service/KuMexDisabledService$getAssetsService$1", "Lcom/kubi/kumex/api/IFuturesAssetsService;", "observePositionList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kumex/entity/PositionWrapperEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16781a implements InterfaceC46260a {
        public C16781a() {
        }

        @Override // p765xl.InterfaceC46260a
        /* JADX INFO: renamed from: a */
        public InterfaceC41634e<List<PositionWrapperEntity>> mo35844a() {
            KuMexDisabledService.this.m35843Y();
            return C41636g.m90889M(CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.service.KuMexDisabledService$b */
    /* JADX INFO: compiled from: KuMexDisabledService.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/kumex/service/KuMexDisabledService$getFuturesGridService$1", "Lcom/kubi/kumex/api/IFuturesGridService;", "getContractDrawerFragment", "Lcom/kubi/sdk/BaseFragment;", "observeCheckSymbol", "Lio/reactivex/Flowable;", "", "updateCheckSymbol", "", "symbol", "getFuturesGridContractFirst", "getSymbolPricePrecision", "", "symbolCode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16782b implements InterfaceC46261b {
        public C16782b() {
        }

        @Override // p765xl.InterfaceC46261b
        /* JADX INFO: renamed from: a */
        public int mo35845a(String symbolCode) {
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            KuMexDisabledService.this.m35843Y();
            return 4;
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: U */
    public BaseFragment mo33270U() {
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: B */
    public boolean mo33253B(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return false;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: D */
    public C27096v0 mo33255D(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return new C27096v0();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: E */
    public void mo33256E(@NotNull String symbols, boolean z11) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: F */
    public String mo33257F(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: G */
    public void mo33258G(@NotNull Context ctx, @NotNull String orderInfo, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: H */
    public void mo33259H(@NotNull Context ctx, @Nullable String str, @Nullable String str2, @NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo33260I() {
        return "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: J */
    public String mo33261J(@NotNull String baseCurrency, @NotNull String quoteCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        m35843Y();
        return null;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: K */
    public boolean mo33262K(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return false;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: L */
    public void mo33263L(@NotNull Context ctx, @NotNull String orderId, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: M */
    public String mo33264M(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: P */
    public List<String> mo33266P(@NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: Q */
    public void mo33267Q(@NotNull BaseFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: R */
    public void mo33268R(@NotNull String symbol, boolean z11, boolean z12, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: S */
    public Map<String, Object> mo33269S(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        m35843Y();
        return MapsKt.emptyMap();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: V */
    public C4400a mo33271V(@NotNull C4400a originPostcard) {
        Intrinsics.checkNotNullParameter(originPostcard, "originPostcard");
        return originPostcard;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: W */
    public void mo33272W(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: X */
    public void mo33273X(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: Y */
    public final void m35843Y() {
        C37214b.m83255a(new IllegalStateException("Futures service not available"), "KuMexDisabledService");
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: a */
    public void mo33274a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String actionId, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: d */
    public void mo33276d(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: f */
    public void mo33278f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tabType, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(null, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: i */
    public void mo33281i(@NotNull BaseFragment futuresFragment, boolean z11) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: j */
    public void mo33282j(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m35843Y();
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Deprecated(message = "迁移到机器人内部实现")
    @NotNull
    /* JADX INFO: renamed from: n */
    public InterfaceC46261b mo33285n() {
        return new C16782b();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: o */
    public Map<String, Object> mo33286o(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return MapsKt.emptyMap();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo33289s(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: t */
    public InterfaceC46260a mo33290t() {
        return new C16781a();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo33292v() {
        return "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: x */
    public Observable<List<QuotesEntity>> mo33294x(@NotNull List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Observable<List<QuotesEntity>> observableJust = Observable.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: y */
    public ContractEntityOpenData mo33295y(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m35843Y();
        return new ContractEntityOpenData(null, false, null, null, null, null, null, 0L, 0L, 0L, null, 0L, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, null, null, null, null, null, null, -1, 32767, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: z */
    public boolean mo33296z(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return false;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: A */
    public List<Map<String, Object>> mo33252A() {
        m35843Y();
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: C */
    public boolean mo33254C(@Nullable FragmentManager fragmentManager) {
        m35843Y();
        return true;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: c */
    public void mo33275c(boolean z11) {
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: e */
    public int mo33277e() {
        m35843Y();
        return 100;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: g */
    public void mo33279g() {
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: h */
    public void mo33280h() {
        m35843Y();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: k */
    public List<ContractEntity> mo33283k() {
        m35843Y();
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: l */
    public boolean mo33284l() {
        m35843Y();
        return false;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: p */
    public ContractOpenNotice mo33287p() {
        m35843Y();
        return new ContractOpenNotice(null, null, null, null, null, 31, null);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo33288r() {
        m35843Y();
        return "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: u */
    public String mo33291u() {
        m35843Y();
        return "";
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: w */
    public int mo33293w(@Nullable String str) {
        Integer displayPrecision;
        m35843Y();
        PropertyEntity properties = new CoinEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null).getProperties();
        if (properties != null) {
            displayPrecision = properties.getDisplayPrecision();
        } else {
            displayPrecision = null;
        }
        return C27039d.m66651k(displayPrecision, 8);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: O */
    public void mo33265O(@Nullable BaseFragment baseFragment) {
    }
}
