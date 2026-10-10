.class public interface abstract Le30/a;
.super Ljava/lang/Object;
.source "ITradeSwitchAction.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH&J.\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0017\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/spot/trade/tradeSwitchAction/ITradeSwitchAction;",
        "",
        "clickPriceType",
        "",
        "tradeVerticalSubmitFragment",
        "Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;",
        "mParent",
        "Lcom/kubi/spot/business/ITradeParentBehavior;",
        "fragmentTradeVerticalBinding",
        "Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;",
        "checkPriceInput",
        "",
        "price",
        "Ljava/math/BigDecimal;",
        "subscriptionSocket",
        "fragment",
        "Lcom/kubi/spot/business/BaseTradeFragment;",
        "visibleDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "wsDataHelper",
        "Lcom/kubi/sdk/websocket/WsDataHelper;",
        "auction",
        "Lkotlin/Function0;",
        "SpotLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Ljava/math/BigDecimal;)Z
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract b(Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;Lcom/kubi/spot/business/b2;Lv30/y;)V
    .param p1    # Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/spot/business/b2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lv30/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract c(Lcom/kubi/spot/business/BaseTradeFragment;Lio/reactivex/disposables/CompositeDisposable;Lg10/r;Lkotlin/jvm/functions/Function0;)V
    .param p1    # Lcom/kubi/spot/business/BaseTradeFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/disposables/CompositeDisposable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lg10/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/business/BaseTradeFragment;",
            "Lio/reactivex/disposables/CompositeDisposable;",
            "Lg10/r;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
