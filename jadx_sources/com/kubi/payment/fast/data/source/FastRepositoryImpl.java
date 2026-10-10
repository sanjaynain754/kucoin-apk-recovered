package com.kubi.payment.fast.data.source;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import com.kubi.payment.fast.data.source.remote.FastRemoteDataSource;
import com.kubi.payment.util.RepositoryExtKt;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0096@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0010\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001dJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0010\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\t2\u0006\u0010#\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\t2\u0006\u0010\u0010\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\t2\u0006\u0010+\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010$J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\t2\u0006\u0010\u0010\u001a\u00020.H\u0096@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020-0\t2\u0006\u0010#\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010$JH\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b2\b\u00106\u001a\u0004\u0018\u00010\u001b2\b\u00107\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0002\u00108JT\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010;J<\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\t2\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010CJ\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\t2\u0006\u0010\u0010\u001a\u00020FH\u0096@¢\u0006\u0002\u0010GJ\"\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0\t2\u0006\u0010\u0010\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020&0\t2\u0006\u0010N\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010$J\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020&0\t2\u0006\u0010\u0010\u001a\u00020PH\u0096@¢\u0006\u0002\u0010QJ$\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\t2\u0006\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010VJ\"\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0I0\t2\u0006\u0010\u0010\u001a\u00020YH\u0096@¢\u0006\u0002\u0010ZJ\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\t2\u0006\u0010\u0010\u001a\u00020]H\u0096@¢\u0006\u0002\u0010^J&\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020aH\u0096@¢\u0006\u0002\u0010bJ\"\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0I0\t2\u0006\u0010\u0010\u001a\u00020eH\u0096@¢\u0006\u0002\u0010fJ\"\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0I0\t2\u0006\u0010\u0010\u001a\u00020iH\u0096@¢\u0006\u0002\u0010jJ\"\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0I0\t2\u0006\u0010\u0010\u001a\u00020mH\u0096@¢\u0006\u0002\u0010nJ\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020p0\t2\u0006\u0010\u0010\u001a\u00020qH\u0096@¢\u0006\u0002\u0010rJ\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020t0\t2\u0006\u0010\u0010\u001a\u00020uH\u0096@¢\u0006\u0002\u0010vJ$\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\t2\u0006\u0010y\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020zH\u0096@¢\u0006\u0002\u0010{J\u001c\u0010|\u001a\b\u0012\u0004\u0012\u00020}0\t2\u0006\u0010\u0010\u001a\u00020~H\u0096@¢\u0006\u0002\u0010\u007fJ \u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\t2\u0007\u0010\u0010\u001a\u00030\u0082\u0001H\u0096@¢\u0006\u0003\u0010\u0083\u0001J \u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\t2\u0007\u0010\u0010\u001a\u00030\u0086\u0001H\u0096@¢\u0006\u0003\u0010\u0087\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0088\u0001"}, m90084d2 = {"Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "remoteDataSource", "Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadUserInfo", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTradingPairs", "Lcom/kubi/otc/entity/FastSymbol;", "loadTradingPairInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "request", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;", "validationToken", "", "url", "(Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sellCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;", "(Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalanceOrderDetail", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "orderId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBankCardCvv", "", "Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRiskSession", "Lcom/kubi/payment/fast/data/entities/RiskSession;", "bizType", "buyCryptoByBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCollectStatus", "requestOtcOrderBuy", "adId", "currencyAmount", "legalCurrencyAmount", "orderPrice", "quoteId", "payTypeCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestP2POrderSell", "businessType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFastQuotes", "Lcom/kubi/otc/entity/FastQuotesModel;", "amount", "fiatCurrency", "cryptoCurrency", "quoteType", "side", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeOrder", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;", "(Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentMethodList", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needCVVInput", "cardId", "deleteBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", FirebaseAnalytics.Param.CURRENCY, "sceneCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPreviewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBankCardSellOrder", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Response;", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCryptoCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPaymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPreviewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyP2POrder", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Response;", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyCommonOrder", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;", "colorTheme", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCouponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponInfoList", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponDiscountInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastRepositoryImpl implements IFastRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FastRemoteDataSource f38591a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f38592b;

    public FastRepositoryImpl(@NotNull FastRemoteDataSource remoteDataSource, @NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f38591a = remoteDataSource;
        this.f38592b = dispatcher;
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: B0 */
    public Object mo46412B0(@NotNull TradingPairInfo.Request request, @NotNull Continuation<? super AbstractC42878k<TradingPairInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadTradingPairInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: H */
    public Object mo46413H(@NotNull FiatCouponListInfo.Request request, @NotNull Continuation<? super AbstractC42878k<FiatCouponListInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadCouponInfoList$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: I */
    public Object mo46414I(@NotNull BankCard.DeleteRequest deleteRequest, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$deleteBankCard$2(this, deleteRequest, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: J */
    public Object mo46415J(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<BalanceOrder.OrderDetail>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadBalanceOrderDetail$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: L */
    public Object mo46416L(@Nullable String str, @NotNull PlaceSellOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PlaceSellOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$placeBankCardSellOrder$2(this, str, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: M */
    public Object mo46417M(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<RiskSession>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadRiskSession$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: P */
    public Object mo46418P(@NotNull FastTradeCryptoCurrency.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<FastTradeCryptoCurrency.Response>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadCryptoCurrencyList$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: Q */
    public Object mo46419Q(@NotNull String str, @NotNull PlaceBuyOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PlaceBuyOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$placeBuyCommonOrder$2(this, str, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: T */
    public Object mo46420T(@NotNull FastTradeFiatCurrency.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<FastTradeFiatCurrency.Response>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadFiatCurrencyList$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: X */
    public Object mo46421X(@NotNull BuyPreviewOrder.Request request, @NotNull Continuation<? super AbstractC42878k<BuyPreviewOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadBuyPreviewOrder$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: Z */
    public Object mo46422Z(@NotNull PreviewOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PreviewOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$previewOrder$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo46423a(@NotNull Continuation<? super AbstractC42878k<FiatUserInfo>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadUserInfo$2(this, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: a0 */
    public Object mo46424a0(@NotNull PlaceOrder.PlaceOrderRequest placeOrderRequest, @NotNull Continuation<? super AbstractC42878k<PlaceOrder.PlaceOrderResponse>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$placeOrder$2(this, placeOrderRequest, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public Object mo46425b0(@NotNull PaymentMethodList.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<PaymentMethodList.Response>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadPaymentMethodList$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo46426d(@NotNull SellPreviewOrder.Request request, @NotNull Continuation<? super AbstractC42878k<SellPreviewOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadSellPreviewOrder$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: g0 */
    public Object mo46427g0(@NotNull BalanceOrder.BuyRequest buyRequest, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<BalanceOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$buyCryptoByBalance$2(this, buyRequest, str, str2, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: h0 */
    public Object mo46428h0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<Balance.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadBalance$2(this, str, str2, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo46429j(@NotNull FiatCouponInfo.Request request, @NotNull Continuation<? super AbstractC42878k<FiatCouponInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadFiatCouponInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: j0 */
    public Object mo46430j0(@NotNull BalanceOrder.SellRequest sellRequest, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<BalanceOrder.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$sellCryptoByBalance$2(this, sellRequest, str, str2, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: k0 */
    public Object mo46431k0(@NotNull BankCard.BuyRequest buyRequest, @NotNull Continuation<? super AbstractC42878k<BankCard.BuyResponse>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$buyCryptoByBankCard$2(this, buyRequest, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: m */
    public Object mo46432m(@NotNull BuyPaymentMethod.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<BuyPaymentMethod.Response>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadBuyPaymentMethod$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: m0 */
    public Object mo46433m0(@NotNull BankCard.SaveCvvRequest saveCvvRequest, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$saveBankCardCvv$2(this, saveCvvRequest, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public Object mo46434o0(@NotNull Continuation<? super AbstractC42878k<FastSymbol>> continuation) {
        return C41686h.m91049g(this.f38592b, new FastRepositoryImpl$loadTradingPairs$2(this, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo46435p(@NotNull Request request, @NotNull Continuation<? super AbstractC42878k<Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$placeBuyP2POrder$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: s */
    public Object mo46436s(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<BankCard.BuyResponse>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$queryCollectStatus$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: t0 */
    public Object mo46437t0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$needCVVInput$2(this, str, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: u */
    public Object mo46438u(@NotNull FiatCouponDiscountInfo.Request request, @NotNull Continuation<? super AbstractC42878k<FiatCouponDiscountInfo.Response>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadCouponDiscountInfo$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: w0 */
    public Object mo46439w0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull Continuation<? super AbstractC42878k<String>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$requestOtcOrderBuy$2(this, str, str2, str3, str4, str5, str6, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: x */
    public Object mo46440x(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Continuation<? super AbstractC42878k<String>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$requestP2POrderSell$2(this, str, str2, str3, str4, str5, str6, str7, str8, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: y */
    public Object mo46441y(@NotNull SellPaymentMethod.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<SellPaymentMethod.Response>>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$loadSellPaymentMethod$2(this, request, null), continuation);
    }

    @Override // com.kubi.payment.fast.data.source.IFastRepository
    @Nullable
    /* JADX INFO: renamed from: z0 */
    public Object mo46442z0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Continuation<? super AbstractC42878k<FastQuotesModel>> continuation) {
        return RepositoryExtKt.m49806a(this.f38592b, new FastRepositoryImpl$requestFastQuotes$2(this, str, str2, str3, str4, str5, null), continuation);
    }
}
