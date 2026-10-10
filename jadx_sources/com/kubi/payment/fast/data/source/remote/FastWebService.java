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
import com.kubi.payment.fast.data.entities.RecurringPlan;
import com.kubi.payment.fast.data.entities.Request;
import com.kubi.payment.fast.data.entities.Response;
import com.kubi.payment.fast.data.entities.RiskSession;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fast.data.entities.TradeConfig;
import com.kubi.payment.fast.data.entities.TradingPairInfo;
import com.kubi.payment.third.data.entities.ThirdOrderItem;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: renamed from: com.kubi.payment.fast.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FastWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000æ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u001a2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\u001cJ4\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u001e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020\tH§@¢\u0006\u0002\u0010#J(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020%H§@¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010)\u001a\u00020\tH§@¢\u0006\u0002\u0010#J4\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0014\b\u0001\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0-2\b\b\u0001\u0010\u0014\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\"\u001a\u00020\tH§@¢\u0006\u0002\u0010#J`\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u00102\u001a\u00020\t2\b\b\u0001\u00103\u001a\u00020\t2\b\b\u0001\u00104\u001a\u00020\t2\b\b\u0001\u00105\u001a\u00020\t2\n\b\u0001\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0003\u00108\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u00109Jf\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0019\u001a\u00020\t2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u00102\u001a\u00020\t2\b\b\u0001\u00103\u001a\u00020\t2\b\b\u0001\u00104\u001a\u00020\t2\b\b\u0001\u00105\u001a\u00020\t2\b\b\u0001\u00107\u001a\u00020\t2\b\b\u0001\u0010;\u001a\u00020\tH§@¢\u0006\u0002\u0010<Jd\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010?\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010@\u001a\u00020\t2\b\b\u0001\u0010A\u001a\u00020\t2\b\b\u0003\u0010B\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010<J$\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0D2\b\b\u0001\u0010F\u001a\u00020\t2\b\b\u0001\u0010G\u001a\u00020\tH'J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00032\b\b\u0001\u0010\u0014\u001a\u00020JH§@¢\u0006\u0002\u0010KJ$\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0\u00032\b\b\u0001\u0010\u0014\u001a\u00020OH§@¢\u0006\u0002\u0010PJ(\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010R\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010T\u001a\u00020UH§@¢\u0006\u0002\u0010VJ.\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0\u00030X2\b\b\u0001\u0010[\u001a\u00020\\2\b\b\u0003\u0010]\u001a\u00020\\H'J\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00032\b\b\u0001\u0010\u0014\u001a\u00020`H§@¢\u0006\u0002\u0010aJ$\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0M0\u00032\b\b\u0001\u0010\u0014\u001a\u00020dH§@¢\u0006\u0002\u0010eJ\u001e\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u00032\b\b\u0001\u0010\u0014\u001a\u00020hH§@¢\u0006\u0002\u0010iJ*\u0010j\u001a\b\u0012\u0004\u0012\u00020k0\u00032\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0014\u001a\u00020lH§@¢\u0006\u0002\u0010mJ$\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0M0\u00032\b\b\u0001\u0010\u0014\u001a\u00020pH§@¢\u0006\u0002\u0010qJ$\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0M0\u00032\b\b\u0001\u0010\u0014\u001a\u00020tH§@¢\u0006\u0002\u0010uJ$\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0M0\u00032\b\b\u0001\u0010\u0014\u001a\u00020xH§@¢\u0006\u0002\u0010yJ\u001e\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u00032\b\b\u0001\u0010\u0014\u001a\u00020|H§@¢\u0006\u0002\u0010}J \u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00032\t\b\u0001\u0010\u0014\u001a\u00030\u0080\u0001H§@¢\u0006\u0003\u0010\u0081\u0001J-\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u00032\t\b\u0001\u0010\u0084\u0001\u001a\u00020\t2\t\b\u0001\u0010\u0014\u001a\u00030\u0085\u0001H§@¢\u0006\u0003\u0010\u0086\u0001J\"\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00032\t\b\u0001\u0010\u0014\u001a\u00030\u0089\u0001H§@¢\u0006\u0003\u0010\u008a\u0001J\"\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u00032\t\b\u0001\u0010\u0014\u001a\u00030\u008d\u0001H§@¢\u0006\u0003\u0010\u008e\u0001J\"\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u00032\t\b\u0001\u0010\u0014\u001a\u00030\u0091\u0001H§@¢\u0006\u0003\u0010\u0092\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0093\u0001À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "", "loadUserInfo", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTradingPairs", "Lcom/kubi/otc/entity/FastSymbol;", "version", "", "platform", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTradingPairInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "fiatCurrency", "cryptoCurrency", "tradeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "request", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;", "url", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;", "validationToken", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sellCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalanceOrderDetail", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "orderId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBankCardCvv", "Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRiskSession", "Lcom/kubi/payment/fast/data/entities/RiskSession;", "bizType", "buyCryptoByBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;", "headers", "", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;", "(Ljava/util/Map;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCollectStatus", "requestOtcOrderBuy", "adId", "currencyAmount", "legalCurrencyAmount", "orderPrice", "quoteId", "payTypeCode", "orderType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestP2POrderSell", "businessType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFastQuotes", "Lcom/kubi/otc/entity/FastQuotesModel;", "amount", "quoteType", "side", "source", "fetchTradeConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/payment/fast/data/entities/TradeConfig;", "legal", "key", "placeOrder", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;", "(Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentMethodList", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needCVVInput", "cardToken", "deleteBankCard", "deleteRequest", "Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRecurringPlanList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/payment/fast/data/entities/RecurringPlan;", "page", "", "pageSize", "loadBalance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "Lcom/kubi/payment/fast/data/entities/Balance$Request;", "(Lcom/kubi/payment/fast/data/entities/Balance$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPreviewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBankCardSellOrder", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Response;", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCryptoCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPaymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPreviewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyP2POrder", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Response;", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyCommonOrder", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;", "colorTheme", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCouponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponInfoList", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponDiscountInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface FastWebService {
    @POST("pmtapi/payment/fiat/coupon/list")
    @Nullable
    /* JADX INFO: renamed from: H */
    Object m46482H(@Body @NotNull FiatCouponListInfo.Request request, @NotNull Continuation<? super BaseEntity<FiatCouponListInfo.Response>> continuation);

    @POST("v1/deposit/card/delete")
    @Nullable
    /* JADX INFO: renamed from: I */
    Object m46483I(@Body @NotNull BankCard.DeleteRequest deleteRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/order/trade/details")
    @Nullable
    /* JADX INFO: renamed from: J */
    Object m46484J(@NotNull @Query("orderId") String str, @NotNull Continuation<? super BaseEntity<BalanceOrder.OrderDetail>> continuation);

    @Headers({"HEADER_FINGER_EVENT:fast-sell-bankcard"})
    @POST("pmtapi/fast/trade/bankcard/sell")
    @Nullable
    /* JADX INFO: renamed from: L */
    Object m46485L(@Header("X-VALIDATION-TOKEN") @Nullable String str, @Body @NotNull PlaceSellOrder.Request request, @NotNull Continuation<? super BaseEntity<PlaceSellOrder.Response>> continuation);

    @GET("v1/deposit/risk/session/id")
    @Nullable
    /* JADX INFO: renamed from: M */
    Object m46486M(@NotNull @Query("bizType") String str, @NotNull Continuation<? super BaseEntity<RiskSession>> continuation);

    @POST("pmtapi/v2/symbol/supported")
    @Nullable
    /* JADX INFO: renamed from: P */
    Object m46487P(@Body @NotNull FastTradeCryptoCurrency.Request request, @NotNull Continuation<? super BaseEntity<List<FastTradeCryptoCurrency.Response>>> continuation);

    @Headers({"HEADER_FINGER_EVENT:fast-buy"})
    @POST("pmtapi/fast/trade/buy")
    @Nullable
    /* JADX INFO: renamed from: Q */
    Object m46488Q(@Header("X-COLOR-THEME") @NotNull String str, @Body @NotNull PlaceBuyOrder.Request request, @NotNull Continuation<? super BaseEntity<PlaceBuyOrder.Response>> continuation);

    @POST("pmtapi/v2/symbol/bases")
    @Nullable
    /* JADX INFO: renamed from: T */
    Object m46489T(@Body @NotNull FastTradeFiatCurrency.Request request, @NotNull Continuation<? super BaseEntity<List<FastTradeFiatCurrency.Response>>> continuation);

    @POST("pmtapi/fast/trade/buy/confirm")
    @Nullable
    /* JADX INFO: renamed from: X */
    Object m46490X(@Body @NotNull BuyPreviewOrder.Request request, @NotNull Continuation<? super BaseEntity<BuyPreviewOrder.Response>> continuation);

    @POST("pmtapi/v1/secondary/quote")
    @Nullable
    /* JADX INFO: renamed from: Z */
    Object m46491Z(@Body @NotNull PreviewOrder.Request request, @NotNull Continuation<? super BaseEntity<PreviewOrder.Response>> continuation);

    @GET("v1/common/get/userInfo")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m46492a(@NotNull Continuation<? super BaseEntity<FiatUserInfo>> continuation);

    @Headers({"HEADER_FINGER_EVENT:fast-popular-pay-buy"})
    @POST("payment_mobile_gateway/v2/orders/trade")
    @Nullable
    /* JADX INFO: renamed from: a0 */
    Object m46493a0(@Body @NotNull PlaceOrder.PlaceOrderRequest placeOrderRequest, @NotNull Continuation<? super BaseEntity<PlaceOrder.PlaceOrderResponse>> continuation);

    @POST("pmtapi/v2/payment/list")
    @Nullable
    /* JADX INFO: renamed from: b0 */
    Object m46494b0(@Body @NotNull PaymentMethodList.Request request, @NotNull Continuation<? super BaseEntity<List<PaymentMethodList.Response>>> continuation);

    @Headers({"HEADER_FINGER_EVENT:fastbuy_recurring_option"})
    @GET("pmtapi/v2/symbol/info")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m46495c(@NotNull @Query("fiatCurrency") String str, @NotNull @Query("cryptoCurrency") String str2, @NotNull @Query("tradeType") String str3, @NotNull Continuation<? super BaseEntity<TradingPairInfo.Response>> continuation);

    @POST("pmtapi/fast/trade/sell/confirm")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m46496d(@Body @NotNull SellPreviewOrder.Request request, @NotNull Continuation<? super BaseEntity<SellPreviewOrder.Response>> continuation);

    @Headers({"needEncrypt: true", "HEADER_FINGER_EVENT:otc-bank-buy-bank"})
    @POST("pmtapi/v2/fastBuy/bankcard/trade")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m46497e(@HeaderMap @NotNull Map<String, String> map, @Body @NotNull BankCard.BuyRequest buyRequest, @NotNull Continuation<? super BaseEntity<BankCard.BuyResponse>> continuation);

    @Headers({"HEADER_FINGER_EVENT:otc-bank-buy-wallet"})
    @POST
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m46498g(@Url @NotNull String str, @Body @NotNull BalanceOrder.BuyRequest buyRequest, @Header("X-VALIDATION-TOKEN") @Nullable String str2, @NotNull Continuation<? super BaseEntity<BalanceOrder.Response>> continuation);

    @GET("pmtapi/v1/recurring/plan/list")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<BasePageEntity<RecurringPlan>>> m46499h(@Query("page") int i11, @Query("pageSize") int i12);

    @GET
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m46500i(@Url @NotNull String str, @NotNull @Query("cardToken") String str2, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @POST("pmtapi/payment/fiat/coupon/popup")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m46501j(@Body @NotNull FiatCouponInfo.Request request, @NotNull Continuation<? super BaseEntity<FiatCouponInfo.Response>> continuation);

    @GET("v1/dispatch/symbols")
    @Nullable
    /* JADX INFO: renamed from: l */
    Object m46502l(@NotNull @Query("version") String str, @NotNull @Query("platform") String str2, @NotNull Continuation<? super BaseEntity<FastSymbol>> continuation);

    @POST("pmtapi/payment/list/buy")
    @Nullable
    /* JADX INFO: renamed from: m */
    Object m46503m(@Body @NotNull BuyPaymentMethod.Request request, @NotNull Continuation<? super BaseEntity<List<BuyPaymentMethod.Response>>> continuation);

    @GET("v1/otc/trade/config")
    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<TradeConfig> m46504o(@NotNull @Query("legal") String str, @NotNull @Query("key") String str2);

    @Headers({"HEADER_FINGER_EVENT:otc-deposit"})
    @POST("pmtapi/fast/trade/p2p/buy")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m46505p(@Body @NotNull Request request, @NotNull Continuation<? super BaseEntity<Response>> continuation);

    @POST
    @Nullable
    /* JADX INFO: renamed from: q */
    Object m46506q(@Url @NotNull String str, @Body @NotNull BankCard.SaveCvvRequest saveCvvRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-deposit"})
    @POST("v1/otc/order/buy")
    /* JADX INFO: renamed from: r */
    Object m46507r(@Field("adId") @NotNull String str, @Field("currencyAmount") @NotNull String str2, @Field("legalCurrencyAmount") @NotNull String str3, @Field("orderPrice") @NotNull String str4, @Field("quoteId") @Nullable String str5, @Field("payTypeCode") @Nullable String str6, @Field("orderType") @Nullable String str7, @NotNull Continuation<? super BaseEntity<String>> continuation);

    @GET("pmtapi/v1/order/queryMiddleState/{orderId}")
    @Nullable
    /* JADX INFO: renamed from: s */
    Object m46508s(@Path("orderId") @NotNull String str, @NotNull Continuation<? super BaseEntity<BankCard.BuyResponse>> continuation);

    @POST("pmtapi/user/balance")
    @Nullable
    /* JADX INFO: renamed from: t */
    Object m46509t(@Body @NotNull Balance.Request request, @NotNull Continuation<? super BaseEntity<Balance.Response>> continuation);

    @POST("pmtapi/payment/fiat/coupon/discount")
    @Nullable
    /* JADX INFO: renamed from: u */
    Object m46510u(@Body @NotNull FiatCouponDiscountInfo.Request request, @NotNull Continuation<? super BaseEntity<FiatCouponDiscountInfo.Response>> continuation);

    @GET("v1/app/quotes")
    @Nullable
    /* JADX INFO: renamed from: w */
    Object m46511w(@NotNull @Query("amount") String str, @NotNull @Query("fiatCurrency") String str2, @NotNull @Query("cryptoCurrency") String str3, @NotNull @Query("quoteType") String str4, @NotNull @Query("side") String str5, @NotNull @Query("source") String str6, @NotNull @Query("platform") String str7, @NotNull @Query("version") String str8, @NotNull Continuation<? super BaseEntity<FastQuotesModel>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-order"})
    @POST
    /* JADX INFO: renamed from: x */
    Object m46512x(@Url @NotNull String str, @Header("X-VALIDATION-TOKEN") @Nullable String str2, @Field("adId") @NotNull String str3, @Field("currencyAmount") @NotNull String str4, @Field("legalCurrencyAmount") @NotNull String str5, @Field("orderPrice") @NotNull String str6, @Field("payTypeCode") @NotNull String str7, @Field("businessType") @NotNull String str8, @NotNull Continuation<? super BaseEntity<String>> continuation);

    @POST("pmtapi/payment/list/sell")
    @Nullable
    /* JADX INFO: renamed from: y */
    Object m46513y(@Body @NotNull SellPaymentMethod.Request request, @NotNull Continuation<? super BaseEntity<List<SellPaymentMethod.Response>>> continuation);

    @Headers({"HEADER_FINGER_EVENT:fast-balance-sell"})
    @POST
    @Nullable
    /* JADX INFO: renamed from: z */
    Object m46514z(@Url @NotNull String str, @Body @NotNull BalanceOrder.SellRequest sellRequest, @Header("X-VALIDATION-TOKEN") @Nullable String str2, @NotNull Continuation<? super BaseEntity<BalanceOrder.Response>> continuation);

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m46478f(FastWebService fastWebService, String str, String str2, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTradingPairs");
        }
        if ((i11 & 1) != 0) {
            str = "v2";
        }
        if ((i11 & 2) != 0) {
            str2 = "KUCOIN";
        }
        return fastWebService.m46502l(str, str2, continuation);
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ Object m46479k(FastWebService fastWebService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Continuation continuation, int i11, Object obj) {
        if (obj == null) {
            return fastWebService.m46511w(str, str2, str3, str4, str5, (i11 & 32) != 0 ? "ANDROID" : str6, (i11 & 64) != 0 ? "KUCOIN" : str7, (i11 & 128) != 0 ? "v2" : str8, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFastQuotes");
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Object m46480n(FastWebService fastWebService, String str, String str2, String str3, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTradingPairInfo");
        }
        if ((i11 & 4) != 0) {
            str3 = "BUY";
        }
        return fastWebService.m46495c(str, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ Object m46481v(FastWebService fastWebService, String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation continuation, int i11, Object obj) {
        if (obj == null) {
            return fastWebService.m46507r(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? ThirdOrderItem.ORDER_DISPATCH : str7, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtcOrderBuy");
    }
}
