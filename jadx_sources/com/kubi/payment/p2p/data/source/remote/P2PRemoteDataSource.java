package com.kubi.payment.p2p.data.source.remote;

import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.data.entities.BadgeInfo;
import com.kubi.payment.p2p.data.entities.BlockUser;
import com.kubi.payment.p2p.data.entities.ExpressBuyPreCheck;
import com.kubi.payment.p2p.data.entities.FileSizeResponse;
import com.kubi.payment.p2p.data.entities.MarkPaymentMethod;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.P2PConfigInfo;
import com.kubi.payment.p2p.data.entities.P2PExpress;
import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.data.entities.P2PTradingPairInfo;
import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.p2p.data.entities.TradeCurrencyCrypto;
import com.kubi.payment.p2p.data.entities.TradeCurrencyFiat;
import com.kubi.payment.p2p.data.entities.TradeInfo;
import com.kubi.payment.p2p.data.entities.TradePayMethodIcon;
import com.kubi.sdk.base.entity.BaseEntity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086@¢\u0006\u0002\u0010\u0012J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00110\tH\u0086@¢\u0006\u0002\u0010 J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00110\tH\u0086@¢\u0006\u0002\u0010 J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00110\t2\u0006\u0010%\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\"\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00110\t2\u0006\u0010%\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\tH\u0086@¢\u0006\u0002\u0010 J\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\tH\u0086@¢\u0006\u0002\u0010 J\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00110\tH\u0086@¢\u0006\u0002\u0010 J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\t2\u0006\u0010/\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u00100\u001a\u000201H\u0086@¢\u0006\u0002\u00102J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u00104\u001a\u000205H\u0086@¢\u0006\u0002\u00106J\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u00104\u001a\u000205H\u0086@¢\u0006\u0002\u00106J\u001c\u00108\u001a\b\u0012\u0004\u0012\u0002090\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\tH\u0086@¢\u0006\u0002\u0010 J\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\t2\u0006\u0010>\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\t2\u0006\u0010%\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010A\u001a\u00020BH\u0086@¢\u0006\u0002\u0010CJ\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\t2\u0006\u00104\u001a\u00020GH\u0086@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\t2\u0006\u00104\u001a\u00020KH\u0086@¢\u0006\u0002\u0010LJ\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\tH\u0086@¢\u0006\u0002\u0010 J\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0086@¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/source/remote/P2PRemoteDataSource;", "", "webService", "Lcom/kubi/payment/p2p/data/source/remote/P2PWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/p2p/data/source/remote/P2PWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadOrderInfo", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "orderId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPayMoney", "payTypeId", "payVoucherFileIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "validationToken", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAppeal", "consentAppeal", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectAppeal", "notifyPayCoin", "loadUploadFileSize", "Lcom/kubi/payment/p2p/data/entities/FileSizeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;", "loadCryptoCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyCrypto;", "fiatCurrency", "loadMarketPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "loadUserTradeInfo", "Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "loadMerchantFiat", "loadPaymentMethodIcons", "Lcom/kubi/payment/p2p/data/entities/TradePayMethodIcon;", "loadTradeDetailInfo", "Lcom/kubi/otc/entity/OtcInfoEntity;", "id", "markPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;", "(Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelHedge", "request", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeRequest;", "(Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goonHedge", "loadQuote", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "loadP2PConfigInfo", "Lcom/kubi/payment/p2p/data/entities/P2PConfigInfo;", "loadTaxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "type", "loadP2PBanner", "Lcom/kubi/payment/data/entities/BannerInfo;", "blockUser", "Lcom/kubi/payment/p2p/data/entities/BlockUser;", "(Lcom/kubi/payment/p2p/data/entities/BlockUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlockStatus", "loadTradingPairInfo", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;", "(Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expressBuyPreCheck", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;", "(Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBadgeInfo", "Lcom/kubi/payment/p2p/data/entities/BadgeInfo;", "heartBeatReport", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final P2PWebService f39709a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f39710b;

    public P2PRemoteDataSource(@NotNull P2PWebService webService, @NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f39709a = webService;
        this.f39710b = dispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final Object m48502A(@NotNull String str, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$rejectAppeal$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m48503B(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull Continuation<? super BaseEntity<ReleaseCrypto>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$releaseCrypto$2(this, str3, str, str2, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m48504b(@NotNull BlockUser blockUser, @NotNull Continuation<? super BaseEntity<String>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$blockUser$2(this, blockUser, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m48505c(@NotNull String str, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$cancelAppeal$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m48506d(@NotNull P2PExpress.HedgeRequest hedgeRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$cancelHedge$2(this, hedgeRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m48507e(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$confirmPayMoney$2(this, str, str2, list, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m48508f(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$consentAppeal$2(this, str, str2, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m48509g(@NotNull ExpressBuyPreCheck.Request request, @NotNull Continuation<? super BaseEntity<ExpressBuyPreCheck.Response>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$expressBuyPreCheck$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m48510h(@NotNull P2PExpress.HedgeRequest hedgeRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$goonHedge$2(this, hedgeRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m48511i(@NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$heartBeatReport$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m48512j(@NotNull Continuation<? super BaseEntity<BadgeInfo>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadBadgeInfo$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m48513k(@NotNull String str, @NotNull Continuation<? super BaseEntity<String>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadBlockStatus$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m48514l(@NotNull String str, @NotNull Continuation<? super BaseEntity<List<TradeCurrencyCrypto>>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadCryptoCurrencyList$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m48515m(@NotNull Continuation<? super BaseEntity<List<TradeCurrencyFiat>>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadFiatCurrencyList$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m48516n(@NotNull String str, @NotNull Continuation<? super BaseEntity<List<P2PMarketPaymentMethod>>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadMarketPaymentMethod$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m48517o(@NotNull String str, @NotNull Continuation<? super BaseEntity<OrderDetailInfo>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadOrderInfo$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m48518p(@NotNull String str, @NotNull Continuation<? super BaseEntity<BannerInfo>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadP2PBanner$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m48519q(@NotNull Continuation<? super BaseEntity<P2PConfigInfo>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadP2PConfigInfo$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m48520r(@NotNull Continuation<? super BaseEntity<List<TradePayMethodIcon>>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadPaymentMethodIcons$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m48521s(@NotNull String str, @NotNull Continuation<? super BaseEntity<P2PExpress.HedgeResponse>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadQuote$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Object m48522t(@NotNull String str, @NotNull Continuation<? super BaseEntity<TaxInfo>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadTaxInfo$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Object m48523u(@NotNull String str, @NotNull Continuation<? super BaseEntity<OtcInfoEntity>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadTradeDetailInfo$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final Object m48524v(@NotNull P2PTradingPairInfo.Request request, @NotNull Continuation<? super BaseEntity<P2PTradingPairInfo.Response>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadTradingPairInfo$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final Object m48525w(@NotNull Continuation<? super BaseEntity<List<FileSizeResponse>>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadUploadFileSize$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m48526x(@NotNull Continuation<? super BaseEntity<TradeInfo>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$loadUserTradeInfo$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final Object m48527y(@NotNull MarkPaymentMethod markPaymentMethod, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$markPaymentMethod$2(this, markPaymentMethod, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Object m48528z(@NotNull String str, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f39710b, new P2PRemoteDataSource$notifyPayCoin$2(this, str, null), continuation);
    }
}
