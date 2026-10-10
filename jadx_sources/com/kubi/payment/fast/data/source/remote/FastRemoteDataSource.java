package com.kubi.payment.fast.data.source.remote;

import com.kubi.otc.entity.FastQuotesModel;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.fast.data.entities.BalanceOrder;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.fast.data.entities.FiatCouponDiscountInfo;
import com.kubi.payment.fast.data.entities.FiatCouponInfo;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.data.entities.PlaceBuyOrder;
import com.kubi.payment.fast.data.entities.PlaceOrder;
import com.kubi.payment.fast.data.entities.PlaceSellOrder;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.payment.fast.data.entities.Request;
import com.kubi.payment.fast.data.entities.Response;
import com.kubi.payment.fast.data.entities.RiskSession;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fast.data.entities.TradingPairInfo;
import com.kubi.sdk.base.entity.BaseEntity;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0086@¢\u0006\u0002\u0010\u000bJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\u0006\u0010\u0016\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u001eJ,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\u0006\u0010\u0016\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010$\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0016\u001a\u00020'H\u0086@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\t2\u0006\u0010+\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010%J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\t2\u0006\u0010\u0016\u001a\u00020.H\u0086@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020-0\t2\u0006\u0010$\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010%JH\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u00108JT\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010;J<\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\t2\u0006\u0010>\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010AJ\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\t2\u0006\u0010\u0016\u001a\u00020DH\u0086@¢\u0006\u0002\u0010EJ\"\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0\t2\u0006\u0010\u0016\u001a\u00020IH\u0086@¢\u0006\u0002\u0010JJ\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010L\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010%J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0016\u001a\u00020NH\u0086@¢\u0006\u0002\u0010OJ\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\t2\u0006\u0010\u0016\u001a\u00020RH\u0086@¢\u0006\u0002\u0010SJ\"\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0G0\t2\u0006\u0010\u0016\u001a\u00020VH\u0086@¢\u0006\u0002\u0010WJ\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\t2\u0006\u0010\u0016\u001a\u00020ZH\u0086@¢\u0006\u0002\u0010[J&\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020^H\u0086@¢\u0006\u0002\u0010_J\"\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0G0\t2\u0006\u0010\u0016\u001a\u00020bH\u0086@¢\u0006\u0002\u0010cJ\"\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0G0\t2\u0006\u0010\u0016\u001a\u00020fH\u0086@¢\u0006\u0002\u0010gJ\"\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0G0\t2\u0006\u0010\u0016\u001a\u00020jH\u0086@¢\u0006\u0002\u0010kJ\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\t2\u0006\u0010\u0016\u001a\u00020nH\u0086@¢\u0006\u0002\u0010oJ\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\t2\u0006\u0010\u0016\u001a\u00020rH\u0086@¢\u0006\u0002\u0010sJ$\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\t2\u0006\u0010v\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020wH\u0086@¢\u0006\u0002\u0010xJ\u001c\u0010y\u001a\b\u0012\u0004\u0012\u00020z0\t2\u0006\u0010\u0016\u001a\u00020{H\u0086@¢\u0006\u0002\u0010|J\u001d\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\t2\u0006\u0010\u0016\u001a\u00020\u007fH\u0086@¢\u0006\u0003\u0010\u0080\u0001J \u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\t2\u0007\u0010\u0016\u001a\u00030\u0083\u0001H\u0086@¢\u0006\u0003\u0010\u0084\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0085\u0001"}, m90084d2 = {"Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;", "", "webService", "Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/fast/data/source/remote/FastWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadUserInfo", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTradingPairs", "Lcom/kubi/otc/entity/FastSymbol;", "loadTradingPairInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "fiatCurrency", "", "cryptoCurrency", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "request", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;", "validationToken", "url", "(Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sellCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;", "(Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalanceOrderDetail", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "orderId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBankCardCvv", "Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRiskSession", "Lcom/kubi/payment/fast/data/entities/RiskSession;", "bizType", "buyCryptoByBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCollectStatus", "requestOtcOrderBuy", "adId", "currencyAmount", "legalCurrencyAmount", "orderPrice", "quoteId", "payTypeCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestP2POrderSell", "businessType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFastQuotes", "Lcom/kubi/otc/entity/FastQuotesModel;", "amount", "quoteType", "side", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeOrder", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;", "(Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentMethodList", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needCVVInput", "cardToken", "deleteBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "Lcom/kubi/payment/fast/data/entities/Balance$Request;", "(Lcom/kubi/payment/fast/data/entities/Balance$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPreviewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBankCardSellOrder", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Response;", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCryptoCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPaymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPreviewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyP2POrder", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Response;", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyCommonOrder", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;", "colorTheme", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCouponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponInfoList", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponDiscountInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FastWebService f38593a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f38594b;

    public FastRemoteDataSource(@NotNull FastWebService webService, @NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f38593a = webService;
        this.f38594b = dispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final Object m46447A(@NotNull String str, @NotNull Continuation<? super BaseEntity<BankCard.BuyResponse>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$queryCollectStatus$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m46448B(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Continuation<? super BaseEntity<FastQuotesModel>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$requestFastQuotes$2(this, str, str2, str3, str4, str5, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public final Object m46449C(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull Continuation<? super BaseEntity<String>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$requestOtcOrderBuy$2(this, str, str2, str3, str4, str5, str6, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public final Object m46450D(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Continuation<? super BaseEntity<String>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$requestP2POrderSell$2(this, str, str2, str3, str4, str5, str6, str7, str8, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public final Object m46451E(@NotNull BankCard.SaveCvvRequest saveCvvRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$saveBankCardCvv$2(this, saveCvvRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final Object m46452F(@NotNull BalanceOrder.SellRequest sellRequest, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super BaseEntity<BalanceOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$sellCryptoByBalance$2(this, str2, sellRequest, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m46453b(@NotNull BalanceOrder.BuyRequest buyRequest, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super BaseEntity<BalanceOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$buyCryptoByBalance$2(this, str2, buyRequest, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m46454c(@NotNull BankCard.BuyRequest buyRequest, @NotNull Continuation<? super BaseEntity<BankCard.BuyResponse>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$buyCryptoByBankCard$2(this, buyRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m46455d(@NotNull BankCard.DeleteRequest deleteRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$deleteBankCard$2(this, deleteRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m46456e(@NotNull Balance.Request request, @NotNull Continuation<? super BaseEntity<Balance.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadBalance$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m46457f(@NotNull String str, @NotNull Continuation<? super BaseEntity<BalanceOrder.OrderDetail>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadBalanceOrderDetail$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m46458g(@NotNull BuyPaymentMethod.Request request, @NotNull Continuation<? super BaseEntity<List<BuyPaymentMethod.Response>>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadBuyPaymentMethod$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m46459h(@NotNull BuyPreviewOrder.Request request, @NotNull Continuation<? super BaseEntity<BuyPreviewOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadBuyPreviewOrder$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m46460i(@NotNull FiatCouponDiscountInfo.Request request, @NotNull Continuation<? super BaseEntity<FiatCouponDiscountInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadCouponDiscountInfo$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m46461j(@NotNull FiatCouponListInfo.Request request, @NotNull Continuation<? super BaseEntity<FiatCouponListInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadCouponInfoList$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m46462k(@NotNull FastTradeCryptoCurrency.Request request, @NotNull Continuation<? super BaseEntity<List<FastTradeCryptoCurrency.Response>>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadCryptoCurrencyList$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m46463l(@NotNull FiatCouponInfo.Request request, @NotNull Continuation<? super BaseEntity<FiatCouponInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadFiatCouponInfo$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m46464m(@NotNull FastTradeFiatCurrency.Request request, @NotNull Continuation<? super BaseEntity<List<FastTradeFiatCurrency.Response>>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadFiatCurrencyList$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m46465n(@NotNull PaymentMethodList.Request request, @NotNull Continuation<? super BaseEntity<List<PaymentMethodList.Response>>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadPaymentMethodList$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m46466o(@NotNull String str, @NotNull Continuation<? super BaseEntity<RiskSession>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadRiskSession$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m46467p(@NotNull SellPaymentMethod.Request request, @NotNull Continuation<? super BaseEntity<List<SellPaymentMethod.Response>>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadSellPaymentMethod$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m46468q(@NotNull SellPreviewOrder.Request request, @NotNull Continuation<? super BaseEntity<SellPreviewOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadSellPreviewOrder$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m46469r(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super BaseEntity<TradingPairInfo.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadTradingPairInfo$2(this, str, str2, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m46470s(@NotNull Continuation<? super BaseEntity<FastSymbol>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadTradingPairs$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Object m46471t(@NotNull Continuation<? super BaseEntity<FiatUserInfo>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$loadUserInfo$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Object m46472u(@NotNull String str, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$needCVVInput$2(this, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final Object m46473v(@Nullable String str, @NotNull PlaceSellOrder.Request request, @NotNull Continuation<? super BaseEntity<PlaceSellOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$placeBankCardSellOrder$2(this, str, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final Object m46474w(@NotNull String str, @NotNull PlaceBuyOrder.Request request, @NotNull Continuation<? super BaseEntity<PlaceBuyOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$placeBuyCommonOrder$2(this, str, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m46475x(@NotNull Request request, @NotNull Continuation<? super BaseEntity<Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$placeBuyP2POrder$2(this, request, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final Object m46476y(@NotNull PlaceOrder.PlaceOrderRequest placeOrderRequest, @NotNull Continuation<? super BaseEntity<PlaceOrder.PlaceOrderResponse>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$placeOrder$2(this, placeOrderRequest, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Object m46477z(@NotNull PreviewOrder.Request request, @NotNull Continuation<? super BaseEntity<PreviewOrder.Response>> continuation) {
        return C41686h.m91049g(this.f38594b, new FastRemoteDataSource$previewOrder$2(this, request, null), continuation);
    }
}
