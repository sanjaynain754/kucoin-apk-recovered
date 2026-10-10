package com.kubi.payment.p2p.data.source;

import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.data.entities.BadgeInfo;
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
import com.kubi.payment.p2p.data.source.remote.P2PRemoteDataSource;
import com.kubi.payment.util.RepositoryExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0096@¢\u0006\u0002\u0010\u0013J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00120\tH\u0096@¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00120\tH\u0096@¢\u0006\u0002\u0010!J\"\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120\t2\u0006\u0010&\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00120\t2\u0006\u0010)\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\tH\u0096@¢\u0006\u0002\u0010!J\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\tH\u0096@¢\u0006\u0002\u0010!J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\t2\u0006\u0010/\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\tH\u0096@¢\u0006\u0002\u0010!J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ$\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u00108\u001a\b\u0012\u0004\u0012\u0002090\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\tH\u0096@¢\u0006\u0002\u0010!J\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\t2\u0006\u0010>\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\t2\b\u0010)\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ(\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010B\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0002\u0010\u001cJ\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\t2\u0006\u0010F\u001a\u00020GH\u0096@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\t2\u0006\u0010F\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\tH\u0096@¢\u0006\u0002\u0010!J\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0096@¢\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/source/P2PRepositoryImpl;", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "remoteDataSource", "Lcom/kubi/payment/p2p/data/source/remote/P2PRemoteDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/p2p/data/source/remote/P2PRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadOrderInfo", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "orderId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPayMoney", "", "payTypeId", "payVoucherFileIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "validationToken", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAppeal", "consentAppeal", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectAppeal", "notifyPayCoin", "loadUploadFileSize", "Lcom/kubi/payment/p2p/data/entities/FileSizeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;", "loadCryptoCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyCrypto;", "legal", "loadMarketPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "fiatCurrency", "loadUserTradeInfo", "Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "loadMerchantFiat", "loadTradeDetailInfo", "Lcom/kubi/otc/entity/OtcInfoEntity;", "id", "loadPaymentMethodIcons", "Lcom/kubi/payment/p2p/data/entities/TradePayMethodIcon;", "markPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;", "(Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelHedge", "goonHedge", "quoteId", "loadQuote", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "loadP2PConfigInfo", "Lcom/kubi/payment/p2p/data/entities/P2PConfigInfo;", "loadTaxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "type", "loadP2PBanner", "Lcom/kubi/payment/data/entities/BannerInfo;", "blockUser", "adId", "loadBlockStatus", "loadTradingPairInfo", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "request", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;", "(Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expressBuyPreCheck", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;", "(Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBadgeInfo", "Lcom/kubi/payment/p2p/data/entities/BadgeInfo;", "heartBeatReport", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PRepositoryImpl implements IP2PRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final P2PRemoteDataSource f39707a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f39708b;

    public P2PRepositoryImpl(@NotNull P2PRemoteDataSource remoteDataSource, @NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f39707a = remoteDataSource;
        this.f39708b = dispatcher;
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: A0 */
    public Object mo48474A0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$rejectAppeal$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: B */
    public Object mo48475B(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<P2PMarketPaymentMethod>>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadMarketPaymentMethod$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: D */
    public Object mo48476D(@NotNull Continuation<? super AbstractC42878k<TradeInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadUserTradeInfo$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: O */
    public Object mo48477O(@NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$heartBeatReport$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: R */
    public Object mo48478R(@Nullable String str, @NotNull Continuation<? super AbstractC42878k<String>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadBlockStatus$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: S */
    public Object mo48479S(@NotNull MarkPaymentMethod markPaymentMethod, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$markPaymentMethod$2(this, markPaymentMethod, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: W */
    public Object mo48480W(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<TaxInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadTaxInfo$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: Y */
    public Object mo48481Y(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$cancelAppeal$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo48482b(@Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull Continuation<? super AbstractC42878k<ReleaseCrypto>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$releaseCrypto$2(this, str, str2, str3, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public Object mo48483d0(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$confirmPayMoney$2(this, str, str2, list, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo48484e(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<P2PExpress.HedgeResponse>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadQuote$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public Object mo48485f0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<OrderDetailInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadOrderInfo$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo48486i(@NotNull ExpressBuyPreCheck.Request request, @NotNull Continuation<? super AbstractC42878k<ExpressBuyPreCheck.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$expressBuyPreCheck$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Object mo48487i0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$consentAppeal$2(this, str, str2, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo48488k(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends List<TradeCurrencyCrypto>>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadCryptoCurrencyList$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo48489l(@Nullable String str, @NotNull Continuation<? super AbstractC42878k<BannerInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadP2PBanner$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: l0 */
    public Object mo48490l0(@NotNull Continuation<? super AbstractC42878k<? extends List<FileSizeResponse>>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadUploadFileSize$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public Object mo48491n0(@NotNull Continuation<? super AbstractC42878k<? extends List<TradePayMethodIcon>>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadPaymentMethodIcons$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public Object mo48492q0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$goonHedge$2(this, str, str2, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo48493r(@NotNull Continuation<? super AbstractC42878k<P2PConfigInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadP2PConfigInfo$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: r0 */
    public Object mo48494r0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$notifyPayCoin$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo48495t(@NotNull Continuation<? super AbstractC42878k<BadgeInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadBadgeInfo$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: u0 */
    public Object mo48496u0(@NotNull Continuation<? super AbstractC42878k<? extends List<TradeCurrencyFiat>>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadFiatCurrencyList$2(this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: v */
    public Object mo48497v(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<OtcInfoEntity>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadTradeDetailInfo$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: v0 */
    public Object mo48498v0(@NotNull P2PTradingPairInfo.Request request, @NotNull Continuation<? super AbstractC42878k<P2PTradingPairInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$loadTradingPairInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: x0 */
    public Object mo48499x0(@Nullable String str, @Nullable String str2, @NotNull Continuation<? super AbstractC42878k<String>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$blockUser$2(str, str2, this, null), continuation);
    }

    @Override // com.kubi.payment.p2p.data.source.IP2PRepository
    @Nullable
    /* JADX INFO: renamed from: y0 */
    public Object mo48500y0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f39708b, new P2PRepositoryImpl$cancelHedge$2(this, str, null), continuation);
    }
}
