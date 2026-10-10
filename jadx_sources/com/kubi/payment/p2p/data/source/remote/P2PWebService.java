package com.kubi.payment.p2p.data.source.remote;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.data.entities.AppealConsentRequest;
import com.kubi.payment.p2p.data.entities.BadgeInfo;
import com.kubi.payment.p2p.data.entities.BlockUser;
import com.kubi.payment.p2p.data.entities.ExpressBuyPreCheck;
import com.kubi.payment.p2p.data.entities.FileSizeResponse;
import com.kubi.payment.p2p.data.entities.MarkPaymentMethod;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.OrderIdRequest;
import com.kubi.payment.p2p.data.entities.P2PConfigInfo;
import com.kubi.payment.p2p.data.entities.P2PExpress;
import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.data.entities.P2PTradingPairInfo;
import com.kubi.payment.p2p.data.entities.PayMoneyRequest;
import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.p2p.data.entities.TradeCurrencyCrypto;
import com.kubi.payment.p2p.data.entities.TradeCurrencyFiat;
import com.kubi.payment.p2p.data.entities.TradeInfo;
import com.kubi.payment.p2p.data.entities.TradePayMethodIcon;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import io.reactivex.Observable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: renamed from: com.kubi.payment.p2p.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: P2PWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001MJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J8\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00062\b\b\u0003\u0010\u001f\u001a\u00020\u00062\b\b\u0003\u0010 \u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001a0\u00032\b\b\u0001\u0010%\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H§@¢\u0006\u0002\u0010(J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u0003H§@¢\u0006\u0002\u0010(J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010,\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J8\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001a0\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00062\b\b\u0003\u0010\u001f\u001a\u00020\u00062\b\b\u0003\u0010 \u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010/\u001a\u000200H§@¢\u0006\u0002\u00101J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u000203H§@¢\u0006\u0002\u00104J\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u000203H§@¢\u0006\u0002\u00104J\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0003H§@¢\u0006\u0002\u0010(J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010%\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010>\u001a\u00020?H§@¢\u0006\u0002\u0010@J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u00062\b\b\u0001\u0010E\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00032\b\b\u0001\u0010\u000e\u001a\u00020HH§@¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0003H§@¢\u0006\u0002\u0010(J\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H§@¢\u0006\u0002\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/source/remote/P2PWebService;", "", "getOrderInfo", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "orderId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "url", "validationToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPayMoney", "request", "Lcom/kubi/payment/p2p/data/entities/PayMoneyRequest;", "(Lcom/kubi/payment/p2p/data/entities/PayMoneyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAppeal", "consentAppeal", "Lcom/kubi/payment/p2p/data/entities/AppealConsentRequest;", "(Lcom/kubi/payment/p2p/data/entities/AppealConsentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectAppeal", "Lcom/kubi/payment/p2p/data/entities/OrderIdRequest;", "(Lcom/kubi/payment/p2p/data/entities/OrderIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyPayCoin", "getUploadFileSize", "", "Lcom/kubi/payment/p2p/data/entities/FileSizeResponse;", "type", "loadFiatCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyFiat;", "legal", "version", "loadCryptoCurrencyList", "Lcom/kubi/payment/p2p/data/entities/TradeCurrencyCrypto;", "loadMarketPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "fiatCurrency", "loadUserTradeInfo", "Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMerchantFiat", "loadTradeDetailInfo", "Lcom/kubi/otc/entity/OtcInfoEntity;", "id", "loadPaymentMethodIcons", "Lcom/kubi/payment/p2p/data/entities/TradePayMethodIcon;", "markPaymentMethod", "Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;", "(Lcom/kubi/payment/p2p/data/entities/MarkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelHedge", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeRequest;", "(Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goonHedge", "loadQuote", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "loadP2PConfigInfo", "Lcom/kubi/payment/p2p/data/entities/P2PConfigInfo;", "loadTaxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "loadP2PBanner", "Lcom/kubi/payment/data/entities/BannerInfo;", "blockUser", "Lcom/kubi/payment/p2p/data/entities/BlockUser;", "(Lcom/kubi/payment/p2p/data/entities/BlockUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlockStatus", "loadTradingPairInfo", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "cryptoCurrency", "tradeType", "expressBuyPreCheck", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;", "(Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBadgeInfo", "Lcom/kubi/payment/p2p/data/entities/BadgeInfo;", "heartBeatReport", "Paging", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface P2PWebService {

    /* JADX INFO: renamed from: com.kubi.payment.p2p.data.source.remote.a$a */
    /* JADX INFO: compiled from: P2PWebService.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u008b\u0001\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u000eH'¢\u0006\u0002\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/source/remote/P2PWebService$Paging;", "", "getOtcList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/otc/entity/OtcInfoEntity;", FirebaseAnalytics.Param.CURRENCY, "", "legal", "payTypeCodes", "amount", "sortCode", "highQualityMerchant", "", "canDealOrder", "", "side", "page", "size", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;II)Lio/reactivex/Observable;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        @GET("v1/otc/ad/list")
        @NotNull
        /* JADX INFO: renamed from: a */
        Observable<BaseEntity<BasePageEntity<OtcInfoEntity>>> m48559a(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("legal") String str2, @Nullable @Query("payTypeCodes") String str3, @NotNull @Query("amount") String str4, @Nullable @Query("sortCode") String str5, @Nullable @Query("highQualityMerchant") Integer num, @Nullable @Query("canDealOrder") Boolean bool, @NotNull @Query("side") String str6, @Query("page") int i11, @Query("size") int i12);
    }

    @GET("v1/otc/legal/payTypes")
    @Nullable
    /* JADX INFO: renamed from: B */
    Object m48532B(@NotNull @Query("legal") String str, @NotNull Continuation<? super BaseEntity<List<P2PMarketPaymentMethod>>> continuation);

    @GET("v1/otc/user/tradeFloatingWindow")
    @Nullable
    /* JADX INFO: renamed from: D */
    Object m48533D(@NotNull Continuation<? super BaseEntity<TradeInfo>> continuation);

    @POST("pmtapi/v1/otc/presence/heartbeat/report")
    @Nullable
    /* JADX INFO: renamed from: O */
    Object m48534O(@NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/user/blacklist/status")
    @Nullable
    /* JADX INFO: renamed from: R */
    Object m48535R(@NotNull @Query("orderId") String str, @NotNull Continuation<? super BaseEntity<String>> continuation);

    @POST("v1/otc/order/pay-mark")
    @Nullable
    /* JADX INFO: renamed from: S */
    Object m48536S(@Body @NotNull MarkPaymentMethod markPaymentMethod, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/user/taxRule")
    @Nullable
    /* JADX INFO: renamed from: W */
    Object m48537W(@NotNull @Query("type") String str, @NotNull Continuation<? super BaseEntity<TaxInfo>> continuation);

    @FormUrlEncoded
    @POST("payment_mobile_gateway/v1/otc/appeal/cancel")
    @Nullable
    /* JADX INFO: renamed from: Y */
    Object m48538Y(@Field("orderId") @NotNull String str, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @POST("v1/otc/order/cancelHedge")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m48539a(@Body @NotNull P2PExpress.HedgeRequest hedgeRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-settlement"})
    @POST
    /* JADX INFO: renamed from: b */
    Object m48540b(@Url @NotNull String str, @Field("orderId") @NotNull String str2, @Header("X-VALIDATION-TOKEN") @Nullable String str3, @NotNull Continuation<? super BaseEntity<ReleaseCrypto>> continuation);

    @GET("pmtapi/p2pExpress/symbol/info")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m48541c(@NotNull @Query("fiatCurrency") String str, @NotNull @Query("cryptoCurrency") String str2, @NotNull @Query("tradeType") String str3, @NotNull Continuation<? super BaseEntity<P2PTradingPairInfo.Response>> continuation);

    @Headers({"HEADER_FINGER_EVENT:otc-pay-mark"})
    @POST("v2/otc/order/pay-money")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m48542d(@Body @NotNull PayMoneyRequest payMoneyRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/order/expressQuote")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m48543e(@NotNull @Query("orderId") String str, @NotNull Continuation<? super BaseEntity<P2PExpress.HedgeResponse>> continuation);

    @GET("v3/otc/order/info")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m48544g(@NotNull @Query("orderId") String str, @NotNull Continuation<? super BaseEntity<OrderDetailInfo>> continuation);

    @GET("v1/otc/dictionary/data")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m48545h(@NotNull @Query("type") String str, @NotNull @Query("legal") String str2, @NotNull @Query("version") String str3, @NotNull Continuation<? super BaseEntity<List<TradeCurrencyFiat>>> continuation);

    @POST("pmtapi/p2p/express/buy/preCheck")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m48546i(@Body @NotNull ExpressBuyPreCheck.Request request, @NotNull Continuation<? super BaseEntity<ExpressBuyPreCheck.Response>> continuation);

    @POST("payment_mobile_gateway/v2/otc/appeal/consent")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m48547j(@Body @NotNull AppealConsentRequest appealConsentRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/symbol/support")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m48548k(@NotNull @Query("legal") String str, @NotNull Continuation<? super BaseEntity<List<TradeCurrencyCrypto>>> continuation);

    @GET("v1/otc/banner/carousel")
    @Nullable
    /* JADX INFO: renamed from: l */
    Object m48549l(@NotNull @Query("fiatCurrency") String str, @NotNull Continuation<? super BaseEntity<BannerInfo>> continuation);

    @POST("v1/otc/user/blacklist/add")
    @Nullable
    /* JADX INFO: renamed from: m */
    Object m48550m(@Body @NotNull BlockUser blockUser, @NotNull Continuation<? super BaseEntity<String>> continuation);

    @POST("payment_mobile_gateway/v1/otc/appeal/reject")
    @Nullable
    /* JADX INFO: renamed from: n */
    Object m48551n(@Body @NotNull OrderIdRequest orderIdRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @POST("v1/otc/order/goonHedge")
    @Nullable
    /* JADX INFO: renamed from: o */
    Object m48552o(@Body @NotNull P2PExpress.HedgeRequest hedgeRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/dictionary/data")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m48553p(@NotNull @Query("type") String str, @NotNull @Query("legal") String str2, @NotNull @Query("version") String str3, @NotNull Continuation<? super BaseEntity<List<TradePayMethodIcon>>> continuation);

    @POST("v1/otc/order/notifyPayCoin")
    @Nullable
    /* JADX INFO: renamed from: q */
    Object m48554q(@Body @NotNull OrderIdRequest orderIdRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/base/config")
    @Nullable
    /* JADX INFO: renamed from: r */
    Object m48555r(@NotNull Continuation<? super BaseEntity<P2PConfigInfo>> continuation);

    @GET("v1/otc/dictionary/data")
    @Nullable
    /* JADX INFO: renamed from: s */
    Object m48556s(@NotNull @Query("type") String str, @NotNull Continuation<? super BaseEntity<List<FileSizeResponse>>> continuation);

    @GET("pmtapi/otc/v1/badge/info")
    @Nullable
    /* JADX INFO: renamed from: t */
    Object m48557t(@NotNull Continuation<? super BaseEntity<BadgeInfo>> continuation);

    @GET("v1/otc/ad/info")
    @Nullable
    /* JADX INFO: renamed from: v */
    Object m48558v(@NotNull @Query("id") String str, @NotNull Continuation<? super BaseEntity<OtcInfoEntity>> continuation);

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m48529f(P2PWebService p2PWebService, String str, String str2, String str3, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPaymentMethodIcons");
        }
        if ((i11 & 1) != 0) {
            str = "PAYTYPE";
        }
        if ((i11 & 2) != 0) {
            str2 = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(str2, "getCurrentCurrency(...)");
        }
        if ((i11 & 4) != 0) {
            str3 = "v2";
        }
        return p2PWebService.m48553p(str, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: u */
    static /* synthetic */ Object m48530u(P2PWebService p2PWebService, String str, String str2, String str3, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFiatCurrencyList");
        }
        if ((i11 & 1) != 0) {
            str = "LEGAL";
        }
        if ((i11 & 2) != 0) {
            str2 = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(str2, "getCurrentCurrency(...)");
        }
        if ((i11 & 4) != 0) {
            str3 = "v2";
        }
        return p2PWebService.m48545h(str, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: w */
    static /* synthetic */ Object m48531w(P2PWebService p2PWebService, String str, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUploadFileSize");
        }
        if ((i11 & 1) != 0) {
            str = "PAYMONEY_FILE_SINGLE_SIZE";
        }
        return p2PWebService.m48556s(str, continuation);
    }
}
