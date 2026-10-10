.class public interface abstract Lcom/kubi/payment/fast/data/source/remote/a;
.super Ljava/lang/Object;
.source "FastWebService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e6\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0003\u0010\n\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000f\u001a\u00020\t2\u0008\u0008\u0003\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0002\u0010\u0016J4\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00032\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u001a2\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ4\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00032\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u001e2\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020!0\u00032\u0008\u0008\u0001\u0010\"\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010#J(\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0014\u001a\u00020%H\u00a7@\u00a2\u0006\u0002\u0010&J\u001e\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020(0\u00032\u0008\u0008\u0001\u0010)\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010#J4\u0010*\u001a\u0008\u0012\u0004\u0012\u00020+0\u00032\u0014\u0008\u0001\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0-2\u0008\u0008\u0001\u0010\u0014\u001a\u00020.H\u00a7@\u00a2\u0006\u0002\u0010/J\u001e\u00100\u001a\u0008\u0012\u0004\u0012\u00020+0\u00032\u0008\u0008\u0001\u0010\"\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010#J`\u00101\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00032\u0008\u0008\u0001\u00102\u001a\u00020\t2\u0008\u0008\u0001\u00103\u001a\u00020\t2\u0008\u0008\u0001\u00104\u001a\u00020\t2\u0008\u0008\u0001\u00105\u001a\u00020\t2\n\u0008\u0001\u00106\u001a\u0004\u0018\u00010\t2\n\u0008\u0001\u00107\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u00108\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u00109Jf\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00032\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t2\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0001\u00102\u001a\u00020\t2\u0008\u0008\u0001\u00103\u001a\u00020\t2\u0008\u0008\u0001\u00104\u001a\u00020\t2\u0008\u0008\u0001\u00105\u001a\u00020\t2\u0008\u0008\u0001\u00107\u001a\u00020\t2\u0008\u0008\u0001\u0010;\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010<Jd\u0010=\u001a\u0008\u0012\u0004\u0012\u00020>0\u00032\u0008\u0008\u0001\u0010?\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000f\u001a\u00020\t2\u0008\u0008\u0001\u0010@\u001a\u00020\t2\u0008\u0008\u0001\u0010A\u001a\u00020\t2\u0008\u0008\u0003\u0010B\u001a\u00020\t2\u0008\u0008\u0003\u0010\n\u001a\u00020\t2\u0008\u0008\u0003\u0010\u0008\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010<J$\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0D2\u0008\u0008\u0001\u0010F\u001a\u00020\t2\u0008\u0008\u0001\u0010G\u001a\u00020\tH\'J\u001e\u0010H\u001a\u0008\u0012\u0004\u0012\u00020I0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020JH\u00a7@\u00a2\u0006\u0002\u0010KJ$\u0010L\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020N0M0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020OH\u00a7@\u00a2\u0006\u0002\u0010PJ(\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010\u0019\u001a\u00020\t2\u0008\u0008\u0001\u0010R\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010T\u001a\u00020UH\u00a7@\u00a2\u0006\u0002\u0010VJ.\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0Y0\u00030X2\u0008\u0008\u0001\u0010[\u001a\u00020\\2\u0008\u0008\u0003\u0010]\u001a\u00020\\H\'J\u001e\u0010^\u001a\u0008\u0012\u0004\u0012\u00020_0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020`H\u00a7@\u00a2\u0006\u0002\u0010aJ$\u0010b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020c0M0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020dH\u00a7@\u00a2\u0006\u0002\u0010eJ\u001e\u0010f\u001a\u0008\u0012\u0004\u0012\u00020g0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020hH\u00a7@\u00a2\u0006\u0002\u0010iJ*\u0010j\u001a\u0008\u0012\u0004\u0012\u00020k0\u00032\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0001\u0010\u0014\u001a\u00020lH\u00a7@\u00a2\u0006\u0002\u0010mJ$\u0010n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020o0M0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020pH\u00a7@\u00a2\u0006\u0002\u0010qJ$\u0010r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020s0M0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020tH\u00a7@\u00a2\u0006\u0002\u0010uJ$\u0010v\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020w0M0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020xH\u00a7@\u00a2\u0006\u0002\u0010yJ\u001e\u0010z\u001a\u0008\u0012\u0004\u0012\u00020{0\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020|H\u00a7@\u00a2\u0006\u0002\u0010}J \u0010~\u001a\u0008\u0012\u0004\u0012\u00020\u007f0\u00032\t\u0008\u0001\u0010\u0014\u001a\u00030\u0080\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u0081\u0001J-\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u00032\t\u0008\u0001\u0010\u0084\u0001\u001a\u00020\t2\t\u0008\u0001\u0010\u0014\u001a\u00030\u0085\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u0086\u0001J\"\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00032\t\u0008\u0001\u0010\u0014\u001a\u00030\u0089\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u008a\u0001J\"\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u00032\t\u0008\u0001\u0010\u0014\u001a\u00030\u008d\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u008e\u0001J\"\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u00032\t\u0008\u0001\u0010\u0014\u001a\u00030\u0091\u0001H\u00a7@\u00a2\u0006\u0003\u0010\u0092\u0001\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0093\u0001\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/payment/fast/data/source/remote/FastWebService;",
        "",
        "loadUserInfo",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/otc/entity/FiatUserInfo;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadTradingPairs",
        "Lcom/kubi/otc/entity/FastSymbol;",
        "version",
        "",
        "platform",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadTradingPairInfo",
        "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;",
        "fiatCurrency",
        "cryptoCurrency",
        "tradeType",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "previewOrder",
        "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;",
        "request",
        "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;",
        "(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buyCryptoByBalance",
        "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;",
        "url",
        "Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;",
        "validationToken",
        "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sellCryptoByBalance",
        "Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;",
        "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadBalanceOrderDetail",
        "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;",
        "orderId",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "saveBankCardCvv",
        "Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;",
        "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadRiskSession",
        "Lcom/kubi/payment/fast/data/entities/RiskSession;",
        "bizType",
        "buyCryptoByBankCard",
        "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;",
        "headers",
        "",
        "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;",
        "(Ljava/util/Map;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "queryCollectStatus",
        "requestOtcOrderBuy",
        "adId",
        "currencyAmount",
        "legalCurrencyAmount",
        "orderPrice",
        "quoteId",
        "payTypeCode",
        "orderType",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requestP2POrderSell",
        "businessType",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requestFastQuotes",
        "Lcom/kubi/otc/entity/FastQuotesModel;",
        "amount",
        "quoteType",
        "side",
        "source",
        "fetchTradeConfig",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/payment/fast/data/entities/TradeConfig;",
        "legal",
        "key",
        "placeOrder",
        "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;",
        "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;",
        "(Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadPaymentMethodList",
        "",
        "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;",
        "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;",
        "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "needCVVInput",
        "cardToken",
        "deleteBankCard",
        "deleteRequest",
        "Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;",
        "(Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadRecurringPlanList",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "Lcom/kubi/payment/fast/data/entities/RecurringPlan;",
        "page",
        "",
        "pageSize",
        "loadBalance",
        "Lcom/kubi/payment/fast/data/entities/Balance$Response;",
        "Lcom/kubi/payment/fast/data/entities/Balance$Request;",
        "(Lcom/kubi/payment/fast/data/entities/Balance$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadSellPaymentMethod",
        "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;",
        "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;",
        "(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadSellPreviewOrder",
        "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;",
        "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;",
        "(Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "placeBankCardSellOrder",
        "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Response;",
        "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;",
        "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadFiatCurrencyList",
        "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;",
        "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;",
        "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadCryptoCurrencyList",
        "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;",
        "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;",
        "(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadBuyPaymentMethod",
        "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;",
        "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;",
        "(Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadBuyPreviewOrder",
        "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;",
        "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;",
        "(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "placeBuyP2POrder",
        "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Response;",
        "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;",
        "(Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "placeBuyCommonOrder",
        "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;",
        "colorTheme",
        "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;",
        "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadFiatCouponInfo",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;",
        "(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadCouponInfoList",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;",
        "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadCouponDiscountInfo",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;",
        "(Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic f(Lcom/kubi/payment/fast/data/source/remote/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    if-nez p5, :cond_2

    .line 3
    .line 4
    and-int/lit8 p5, p4, 0x1

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    const-string p1, "v2"

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 11
    .line 12
    if-eqz p4, :cond_1

    .line 13
    .line 14
    const-string p2, "KUCOIN"

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/kubi/payment/fast/data/source/remote/a;->l(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    const-string p1, "Super calls with default arguments not supported in this target, function: loadTradingPairs"

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
.end method

.method public static synthetic k(Lcom/kubi/payment/fast/data/source/remote/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    .line 2
    move/from16 v0, p10

    .line 3
    .line 4
    if-nez p11, :cond_3

    .line 5
    .line 6
    and-int/lit8 v1, v0, 0x20

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "ANDROID"

    .line 11
    move-object v8, v1

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    move-object/from16 v8, p6

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v1, v0, 0x40

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const-string v1, "KUCOIN"

    .line 21
    move-object v9, v1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_1
    move-object/from16 v9, p7

    .line 25
    .line 26
    :goto_1
    and-int/lit16 v0, v0, 0x80

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const-string v0, "v2"

    .line 31
    move-object v10, v0

    .line 32
    :goto_2
    move-object v2, p0

    .line 33
    move-object v3, p1

    .line 34
    move-object v4, p2

    .line 35
    move-object v5, p3

    .line 36
    .line 37
    move-object/from16 v6, p4

    .line 38
    .line 39
    move-object/from16 v7, p5

    .line 40
    .line 41
    move-object/from16 v11, p9

    .line 42
    goto :goto_3

    .line 43
    .line 44
    :cond_2
    move-object/from16 v10, p8

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :goto_3
    invoke-interface/range {v2 .. v11}, Lcom/kubi/payment/fast/data/source/remote/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    .line 52
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 53
    .line 54
    const-string p1, "Super calls with default arguments not supported in this target, function: requestFastQuotes"

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
.end method

.method public static synthetic n(Lcom/kubi/payment/fast/data/source/remote/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    if-nez p6, :cond_1

    .line 3
    .line 4
    and-int/lit8 p5, p5, 0x4

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    const-string p3, "BUY"

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/kubi/payment/fast/data/source/remote/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: loadTradingPairInfo"

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
.end method

.method public static synthetic v(Lcom/kubi/payment/fast/data/source/remote/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    if-nez p10, :cond_1

    .line 3
    .line 4
    and-int/lit8 v0, p9, 0x40

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "DISPATCH"

    .line 9
    move-object v8, v0

    .line 10
    :goto_0
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p4

    .line 15
    move-object v6, p5

    .line 16
    .line 17
    move-object/from16 v7, p6

    .line 18
    .line 19
    move-object/from16 v9, p8

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    move-object/from16 v8, p7

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-interface/range {v1 .. v9}, Lcom/kubi/payment/fast/data/source/remote/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    const-string p1, "Super calls with default arguments not supported in this target, function: requestOtcOrderBuy"

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 36
    throw p0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method


# virtual methods
.method public abstract H(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/payment/fiat/coupon/list"
    .end annotation
.end method

.method public abstract I(Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/deposit/card/delete"
    .end annotation
.end method

.method public abstract J(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "orderId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/order/trade/details"
    .end annotation
.end method

.method public abstract L(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/PlaceSellOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:fast-sell-bankcard"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/fast/trade/bankcard/sell"
    .end annotation
.end method

.method public abstract M(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "bizType"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/RiskSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/deposit/risk/session/id"
    .end annotation
.end method

.method public abstract P(Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/v2/symbol/supported"
    .end annotation
.end method

.method public abstract Q(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-COLOR-THEME"
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/PlaceBuyOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:fast-buy"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/fast/trade/buy"
    .end annotation
.end method

.method public abstract T(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/v2/symbol/bases"
    .end annotation
.end method

.method public abstract X(Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/fast/trade/buy/confirm"
    .end annotation
.end method

.method public abstract Z(Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/v1/secondary/quote"
    .end annotation
.end method

.method public abstract a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/otc/entity/FiatUserInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/common/get/userInfo"
    .end annotation
.end method

.method public abstract a0(Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:fast-popular-pay-buy"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "payment_mobile_gateway/v2/orders/trade"
    .end annotation
.end method

.method public abstract b0(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/v2/payment/list"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "fiatCurrency"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "cryptoCurrency"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "tradeType"
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "pmtapi/v2/symbol/info"
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:fastbuy_recurring_option"
        }
    .end annotation
.end method

.method public abstract d(Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/fast/trade/sell/confirm"
    .end annotation
.end method

.method public abstract e(Ljava/util/Map;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/HeaderMap;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "needEncrypt: true",
            "HEADER_FINGER_EVENT:otc-bank-buy-bank"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/v2/fastBuy/bankcard/trade"
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:otc-bank-buy-wallet"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
    .end annotation
.end method

.method public abstract h(II)Lio/reactivex/Observable;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "page"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/payment/fast/data/entities/RecurringPlan;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "pmtapi/v1/recurring/plan/list"
    .end annotation
.end method

.method public abstract i(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "cardToken"
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
    .end annotation
.end method

.method public abstract j(Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/payment/fiat/coupon/popup"
    .end annotation
.end method

.method public abstract l(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "version"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "platform"
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/otc/entity/FastSymbol;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/dispatch/symbols"
    .end annotation
.end method

.method public abstract m(Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/payment/list/buy"
    .end annotation
.end method

.method public abstract o(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "legal"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "key"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/payment/fast/data/entities/TradeConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/otc/trade/config"
    .end annotation
.end method

.method public abstract p(Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/P2PPlaceBuyOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:otc-deposit"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/fast/trade/p2p/buy"
    .end annotation
.end method

.method public abstract q(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
    .end annotation
.end method

.method public abstract r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "adId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "currencyAmount"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "legalCurrencyAmount"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "orderPrice"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "quoteId"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "payTypeCode"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "orderType"
        .end annotation
    .end param
    .param p8    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:otc-deposit"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/otc/order/buy"
    .end annotation
.end method

.method public abstract s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Path;
            value = "orderId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "pmtapi/v1/order/queryMiddleState/{orderId}"
    .end annotation
.end method

.method public abstract t(Lcom/kubi/payment/fast/data/entities/Balance$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/Balance$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/Balance$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/Balance$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/user/balance"
    .end annotation
.end method

.method public abstract u(Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/payment/fiat/coupon/discount"
    .end annotation
.end method

.method public abstract w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "amount"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "fiatCurrency"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "cryptoCurrency"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "quoteType"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "side"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "source"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "platform"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "version"
        .end annotation
    .end param
    .param p9    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/otc/entity/FastQuotesModel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/app/quotes"
    .end annotation
.end method

.method public abstract x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "adId"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "currencyAmount"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "legalCurrencyAmount"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "orderPrice"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "payTypeCode"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "businessType"
        .end annotation
    .end param
    .param p9    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:otc-order"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
    .end annotation
.end method

.method public abstract y(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/payment/list/sell"
    .end annotation
.end method

.method public abstract z(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:fast-balance-sell"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
    .end annotation
.end method
