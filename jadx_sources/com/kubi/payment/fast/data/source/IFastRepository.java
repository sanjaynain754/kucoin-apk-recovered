package com.kubi.payment.fast.data.source;

import androidx.annotation.WorkerThread;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p477nt.InterfaceC42877j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.payment.fast.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IFastRepository.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\n\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\n\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0017J0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\n\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0006\u0010\u001d\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0006\u0010\n\u001a\u00020!H§@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010%\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u001eJ\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\u0006\u0010\n\u001a\u00020(H§@¢\u0006\u0002\u0010)J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00032\u0006\u0010\u001d\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u001eJH\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u00152\b\u00101\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0002\u00102JT\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015H§@¢\u0006\u0002\u00105J<\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0015H§@¢\u0006\u0002\u0010=J\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\u0006\u0010\n\u001a\u00020@H§@¢\u0006\u0002\u0010AJ\"\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0\u00032\u0006\u0010\n\u001a\u00020EH§@¢\u0006\u0002\u0010FJ\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0006\u0010H\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u001eJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0006\u0010\n\u001a\u00020JH§@¢\u0006\u0002\u0010KJ$\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\u0006\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u0015H§@¢\u0006\u0002\u0010PJ\"\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0C0\u00032\u0006\u0010\n\u001a\u00020SH§@¢\u0006\u0002\u0010TJ\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u00032\u0006\u0010\n\u001a\u00020WH§@¢\u0006\u0002\u0010XJ&\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020[H§@¢\u0006\u0002\u0010\\J\"\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0C0\u00032\u0006\u0010\n\u001a\u00020_H§@¢\u0006\u0002\u0010`J\"\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0C0\u00032\u0006\u0010\n\u001a\u00020cH§@¢\u0006\u0002\u0010dJ\"\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0C0\u00032\u0006\u0010\n\u001a\u00020gH§@¢\u0006\u0002\u0010hJ\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020j0\u00032\u0006\u0010\n\u001a\u00020kH§@¢\u0006\u0002\u0010lJ\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u00032\u0006\u0010\n\u001a\u00020oH§@¢\u0006\u0002\u0010pJ&\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00032\b\b\u0002\u0010s\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020tH§@¢\u0006\u0002\u0010uJ\u001c\u0010v\u001a\b\u0012\u0004\u0012\u00020w0\u00032\u0006\u0010\n\u001a\u00020xH§@¢\u0006\u0002\u0010yJ\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u00032\u0006\u0010\n\u001a\u00020|H§@¢\u0006\u0002\u0010}J\u001e\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00032\u0007\u0010\n\u001a\u00030\u0080\u0001H§@¢\u0006\u0003\u0010\u0081\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0082\u0001À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/fast/data/source/IFastRepository;", "Lcom/kubi/payment/base/IRepository;", "loadUserInfo", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTradingPairs", "Lcom/kubi/otc/entity/FastSymbol;", "loadTradingPairInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "request", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;", "validationToken", "", "url", "(Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sellCryptoByBalance", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;", "(Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalanceOrderDetail", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "orderId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBankCardCvv", "", "Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRiskSession", "Lcom/kubi/payment/fast/data/entities/RiskSession;", "bizType", "buyCryptoByBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCollectStatus", "requestOtcOrderBuy", "adId", "currencyAmount", "legalCurrencyAmount", "orderPrice", "quoteId", "payTypeCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestP2POrderSell", "businessType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFastQuotes", "Lcom/kubi/otc/entity/FastQuotesModel;", "amount", "fiatCurrency", "cryptoCurrency", "quoteType", "side", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeOrder", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;", "(Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentMethodList", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needCVVInput", "cardToken", "deleteBankCard", "Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;", "(Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBalance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", FirebaseAnalytics.Param.CURRENCY, "sceneCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSellPreviewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBankCardSellOrder", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Response;", "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCryptoCurrencyList", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;", "(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPaymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBuyPreviewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyP2POrder", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Response;", "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;", "(Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeBuyCommonOrder", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;", "colorTheme", "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatCouponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponInfoList", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCouponDiscountInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;", "(Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IFastRepository extends InterfaceC42877j {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: B0 */
    Object mo46412B0(@NotNull TradingPairInfo.Request request, @NotNull Continuation<? super AbstractC42878k<TradingPairInfo.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: H */
    Object mo46413H(@NotNull FiatCouponListInfo.Request request, @NotNull Continuation<? super AbstractC42878k<FiatCouponListInfo.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: I */
    Object mo46414I(@NotNull BankCard.DeleteRequest deleteRequest, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: J */
    Object mo46415J(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<BalanceOrder.OrderDetail>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: L */
    Object mo46416L(@Nullable String str, @NotNull PlaceSellOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PlaceSellOrder.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: M */
    Object mo46417M(@NotNull @Query("bizType") String str, @NotNull Continuation<? super AbstractC42878k<RiskSession>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: P */
    Object mo46418P(@NotNull FastTradeCryptoCurrency.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<FastTradeCryptoCurrency.Response>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: Q */
    Object mo46419Q(@NotNull String str, @NotNull PlaceBuyOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PlaceBuyOrder.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: T */
    Object mo46420T(@NotNull FastTradeFiatCurrency.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<FastTradeFiatCurrency.Response>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: X */
    Object mo46421X(@NotNull BuyPreviewOrder.Request request, @NotNull Continuation<? super AbstractC42878k<BuyPreviewOrder.Response>> continuation);

    @Nullable
    /* JADX INFO: renamed from: Z */
    Object mo46422Z(@NotNull PreviewOrder.Request request, @NotNull Continuation<? super AbstractC42878k<PreviewOrder.Response>> continuation);

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo46423a(@NotNull Continuation<? super AbstractC42878k<FiatUserInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a0 */
    Object mo46424a0(@NotNull PlaceOrder.PlaceOrderRequest placeOrderRequest, @NotNull Continuation<? super AbstractC42878k<PlaceOrder.PlaceOrderResponse>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: b0 */
    Object mo46425b0(@NotNull PaymentMethodList.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<PaymentMethodList.Response>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo46426d(@NotNull SellPreviewOrder.Request request, @NotNull Continuation<? super AbstractC42878k<SellPreviewOrder.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: g0 */
    Object mo46427g0(@NotNull BalanceOrder.BuyRequest buyRequest, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<BalanceOrder.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: h0 */
    Object mo46428h0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<Balance.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo46429j(@NotNull FiatCouponInfo.Request request, @NotNull Continuation<? super AbstractC42878k<FiatCouponInfo.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: j0 */
    Object mo46430j0(@NotNull BalanceOrder.SellRequest sellRequest, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super AbstractC42878k<BalanceOrder.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: k0 */
    Object mo46431k0(@NotNull BankCard.BuyRequest buyRequest, @NotNull Continuation<? super AbstractC42878k<BankCard.BuyResponse>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: m */
    Object mo46432m(@NotNull BuyPaymentMethod.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<BuyPaymentMethod.Response>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: m0 */
    Object mo46433m0(@NotNull BankCard.SaveCvvRequest saveCvvRequest, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: o0 */
    Object mo46434o0(@NotNull Continuation<? super AbstractC42878k<FastSymbol>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: p */
    Object mo46435p(@NotNull Request request, @NotNull Continuation<? super AbstractC42878k<Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: s */
    Object mo46436s(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<BankCard.BuyResponse>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: t0 */
    Object mo46437t0(@NotNull String str, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: u */
    Object mo46438u(@NotNull FiatCouponDiscountInfo.Request request, @NotNull Continuation<? super AbstractC42878k<FiatCouponDiscountInfo.Response>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: w0 */
    Object mo46439w0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull Continuation<? super AbstractC42878k<String>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: x */
    Object mo46440x(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Continuation<? super AbstractC42878k<String>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: y */
    Object mo46441y(@NotNull SellPaymentMethod.Request request, @NotNull Continuation<? super AbstractC42878k<? extends List<SellPaymentMethod.Response>>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: z0 */
    Object mo46442z0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Continuation<? super AbstractC42878k<FastQuotesModel>> continuation);

    /* JADX INFO: renamed from: C0 */
    static /* synthetic */ Object m46443C0(IFastRepository iFastRepository, String str, PlaceBuyOrder.Request request, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeBuyCommonOrder");
        }
        if ((i11 & 1) != 0) {
            str = "";
        }
        return iFastRepository.mo46419Q(str, request, continuation);
    }

    /* JADX INFO: renamed from: p0 */
    static /* synthetic */ Object m46444p0(IFastRepository iFastRepository, BalanceOrder.SellRequest sellRequest, String str, String str2, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sellCryptoByBalance");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return iFastRepository.mo46430j0(sellRequest, str, str2, continuation);
    }

    /* JADX INFO: renamed from: s0 */
    static /* synthetic */ Object m46445s0(IFastRepository iFastRepository, BalanceOrder.BuyRequest buyRequest, String str, String str2, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buyCryptoByBalance");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return iFastRepository.mo46427g0(buyRequest, str, str2, continuation);
    }
}
