package com.kubi.kumex.service;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.kumex.entity.ContractOpenNotice;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
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
import p765xl.InterfaceC46260a;
import p765xl.InterfaceC46261b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.service.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuMexServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004JK\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0096\u0001J1\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017H\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0001J\u0013\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0001J#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0096\u0001J\t\u0010\"\u001a\u00020\u0006H\u0096\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u000fH\u0096\u0001J\u0011\u0010&\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0011\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0096\u0001J\u0011\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\nH\u0096\u0001J\t\u0010,\u001a\u00020-H\u0096\u0001J!\u0010.\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0/2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0011\u00100\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u000f\u00102\u001a\b\u0012\u0004\u0012\u0002030 H\u0096\u0001J\t\u00104\u001a\u000205H\u0096\u0001J\u001b\u00106\u001a\u0004\u0018\u00010\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0096\u0001J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\n0 2\u0006\u00107\u001a\u00020\nH\u0096\u0001J\t\u0010:\u001a\u00020\nH\u0096\u0001J\t\u0010;\u001a\u00020\nH\u0096\u0001JU\u0010<\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2(\u0010\r\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0096\u0001J\u0011\u0010D\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0013\u0010E\u001a\u0004\u0018\u00010\n2\u0006\u0010F\u001a\u00020\nH\u0096\u0001J\u001d\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B0A2\u0006\u0010F\u001a\u00020\nH\u0096\u0001J\u001b\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B0A0 H\u0096\u0001J\u001d\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B0A2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u000b\u0010J\u001a\u0004\u0018\u00010\u001aH\u0096\u0001J\t\u0010K\u001a\u00020LH\u0096\u0001J\u0013\u0010M\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\t\u0010N\u001a\u00020\nH\u0096\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010F\u001a\u0004\u0018\u00010\nH\u0096\u0001J\t\u0010Q\u001a\u00020\nH\u0096\u0001J\t\u0010R\u001a\u00020PH\u0096\u0001J\t\u0010S\u001a\u00020\u000fH\u0096\u0001J\u0019\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020\u000fH\u0096\u0001J_\u0010W\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B\u0018\u00010A2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J\u0019\u0010Z\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u000fH\u0096\u0001J\u0011\u0010\\\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J-\u0010]\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010^\u001a\u00020_H\u0096\u0001J\t\u0010`\u001a\u00020\u0006H\u0096\u0001J\u001d\u0010a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010B0A0bH\u0096\u0001JA\u0010c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\n2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J\u0011\u0010e\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u001aH\u0096\u0001J\u0013\u0010f\u001a\u00020\u00062\b\u0010U\u001a\u0004\u0018\u00010\u001aH\u0096\u0001J?\u0010g\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010h\u001a\u00020\n2\u0006\u0010i\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J?\u0010j\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010h\u001a\u00020\n2\u0006\u0010i\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001JW\u0010k\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\n2\u0014\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020B\u0018\u00010A2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J\u0011\u0010l\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u000fH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006n"}, m90084d2 = {"Lcom/kubi/kumex/service/KuMexServiceImpl;", "Lcom/kubi/kumex/api/IKuMexService;", "delegate", "<init>", "(Lcom/kubi/kumex/api/IKuMexService;)V", "cancelFuturesOrder", "", "ctx", "Landroid/content/Context;", "orderId", "", "orderInfo", "tpslOrderInfo", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "changeCacheFavorite", "symbols", "favourite", "changeFavourite", "symbol", "isNetwork", "Lkotlin/Function0;", "checkQuotesNotice", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "checkUpgrade", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fetchQuotesListBySymbolsForDistribution", "Lio/reactivex/Observable;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "fetchSystemConfig", "formatSymbolWithTag", "Lcom/kubi/utils/StyledText;", "withTag", "formatSymbolWithoutPerp", "futuresContainerRouterIntercept", "Lcom/kubi/router/model/Postcard;", "originPostcard", "futuresRobotVisible", "type", "getAssetsService", "Lcom/kubi/kumex/api/IFuturesAssetsService;", "getContractCurrencyInfo", "Lkotlin/Pair;", "getContractEntityMapBean", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "getContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContractNotice", "Lcom/kubi/kumex/entity/ContractOpenNotice;", "getContractSymbol", "baseCurrency", "quoteCurrency", "getContractSymbolList", "getContractTradeUnit", "getContractWelfare", "getFeaturesConfig", "objects", "Ljava/lang/Object;", "source", "tabType", "", "", "getFutureFavorList", "getFutureTag", "getFuturesCoinAvatar", FirebaseAnalytics.Param.CURRENCY, "getFuturesCoinConfig", "getFuturesCoinConfigList", "getFuturesConfig", "getFuturesFragment", "getFuturesGridService", "Lcom/kubi/kumex/api/IFuturesGridService;", "getKlineContractConfigJson", "getKuMexPageId", "getLongPrecision", "", "getMarketsPageId", "getMaxLeverage", "getRewardConfig", "handleKlineInMaintenance", "futuresFragment", TIMPushProvider.f75062n, "handleMenuAction", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, ReportDataTable.COLUMN_PARAMS, "hasContract", "wait", "isFavor", "jumpFuturesDelegationDetail", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "loadNoticeConfig", "map2UnifyContractConfig", "Lkotlinx/coroutines/flow/Flow;", "modifyFuturesOrder", "targetPrice", "refreshFuturesFragment", "releaseOptionEngine", "requestFutureMarketClosePosition", "subUid", "positionJson", "requestFuturePositionTpSl", "shareFuturesPositionPnl", "synchronized", "force", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuMexServiceImpl implements IKuMexService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final IKuMexService f30410b;

    /* JADX WARN: Multi-variable type inference failed */
    public KuMexServiceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public KuMexServiceImpl(@NotNull IKuMexService delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f30410b = delegate;
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: A */
    public List<Map<String, Object>> mo33252A() {
        return this.f30410b.mo33252A();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: B */
    public boolean mo33253B(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33253B(symbol, z11);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: C */
    public boolean mo33254C(@Nullable FragmentManager fragmentManager) {
        return this.f30410b.mo33254C(fragmentManager);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: D */
    public C27096v0 mo33255D(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33255D(symbol, z11);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: E */
    public void mo33256E(@NotNull String symbols, boolean z11) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        this.f30410b.mo33256E(symbols, z11);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: F */
    public String mo33257F(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33257F(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: G */
    public void mo33258G(@NotNull Context ctx, @NotNull String orderInfo, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33258G(ctx, orderInfo, str, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: H */
    public void mo33259H(@NotNull Context ctx, @Nullable String str, @Nullable String str2, @NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
        this.f30410b.mo33259H(ctx, str, str2, orderEntity);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo33260I() {
        return this.f30410b.mo33260I();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: J */
    public String mo33261J(@NotNull String baseCurrency, @NotNull String quoteCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        return this.f30410b.mo33261J(baseCurrency, quoteCurrency);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: K */
    public boolean mo33262K(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33262K(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: L */
    public void mo33263L(@NotNull Context ctx, @NotNull String orderId, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33263L(ctx, orderId, str, str2, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: M */
    public String mo33264M(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33264M(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: O */
    public void mo33265O(@Nullable BaseFragment baseFragment) {
        this.f30410b.mo33265O(baseFragment);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: P */
    public List<String> mo33266P(@NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return this.f30410b.mo33266P(baseCurrency);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: Q */
    public void mo33267Q(@NotNull BaseFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        this.f30410b.mo33267Q(futuresFragment);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: R */
    public void mo33268R(@NotNull String symbol, boolean z11, boolean z12, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f30410b.mo33268R(symbol, z11, z12, function0);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: S */
    public Map<String, Object> mo33269S(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f30410b.mo33269S(currency);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @Nullable
    /* JADX INFO: renamed from: U */
    public BaseFragment mo33270U() {
        return this.f30410b.mo33270U();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: V */
    public C4400a mo33271V(@NotNull C4400a originPostcard) {
        Intrinsics.checkNotNullParameter(originPostcard, "originPostcard");
        return this.f30410b.mo33271V(originPostcard);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: W */
    public void mo33272W(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        this.f30410b.mo33272W(baseFragment);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: X */
    public void mo33273X(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33273X(ctx, obj, source, map, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: a */
    public void mo33274a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String actionId, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33274a(ctx, obj, source, actionId, map, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: c */
    public void mo33275c(boolean z11) {
        this.f30410b.mo33275c(z11);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: d */
    public void mo33276d(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33276d(ctx, subUid, positionJson, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: e */
    public int mo33277e() {
        return this.f30410b.mo33277e();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: f */
    public void mo33278f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tabType, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33278f(ctx, obj, source, tabType, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: g */
    public void mo33279g() {
        this.f30410b.mo33279g();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: h */
    public void mo33280h() {
        this.f30410b.mo33280h();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: i */
    public void mo33281i(@NotNull BaseFragment futuresFragment, boolean z11) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        this.f30410b.mo33281i(futuresFragment, z11);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: j */
    public void mo33282j(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30410b.mo33282j(ctx, subUid, positionJson, callback);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: k */
    public List<ContractEntity> mo33283k() {
        return this.f30410b.mo33283k();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: l */
    public boolean mo33284l() {
        return this.f30410b.mo33284l();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: n */
    public InterfaceC46261b mo33285n() {
        return this.f30410b.mo33285n();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: o */
    public Map<String, Object> mo33286o(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33286o(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: p */
    public ContractOpenNotice mo33287p() {
        return this.f30410b.mo33287p();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo33288r() {
        return this.f30410b.mo33288r();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo33289s(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33289s(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: t */
    public InterfaceC46260a mo33290t() {
        return this.f30410b.mo33290t();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: u */
    public String mo33291u() {
        return this.f30410b.mo33291u();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo33292v() {
        return this.f30410b.mo33292v();
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: w */
    public int mo33293w(@Nullable String str) {
        return this.f30410b.mo33293w(str);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: x */
    public Observable<List<QuotesEntity>> mo33294x(@NotNull List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return this.f30410b.mo33294x(symbols);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    @NotNull
    /* JADX INFO: renamed from: y */
    public ContractEntityOpenData mo33295y(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f30410b.mo33295y(symbol);
    }

    @Override // com.kubi.kumex.api.IKuMexService
    /* JADX INFO: renamed from: z */
    public boolean mo33296z(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f30410b.mo33296z(type);
    }

    public /* synthetic */ KuMexServiceImpl(IKuMexService iKuMexService, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C24129b.m58030b(SiteVisibleConfigKey.Futures) ? new KuMexService() : new KuMexDisabledService() : iKuMexService);
    }
}
