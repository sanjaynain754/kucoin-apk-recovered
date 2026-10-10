.class public interface abstract Lye/a;
.super Ljava/lang/Object;
.source "ITradeSwitchAction.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH&J\u0012\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0019H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001a\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/spot/trade/tradeSwitchAction/ITradeSwitchAction;",
        "",
        "clickPriceType",
        "",
        "supportTradeTypes",
        "",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData;",
        "tradeVerticalSubmitFragment",
        "Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;",
        "mParent",
        "Lcom/kubi/core/spot/business/ITradeParentBehavior;",
        "binding",
        "Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;",
        "checkPriceInput",
        "",
        "price",
        "Ljava/math/BigDecimal;",
        "subscriptionSocket",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "visibleDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "wsDataHelper",
        "Lcom/kubi/sdk/websocket/WsDataHelper;",
        "auction",
        "Lkotlin/Function0;",
        "TradeCoreBizLib_googleRelease"
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

.method public abstract b(Ljava/util/List;Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;Lhe/b;Lv30/v;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lhe/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lv30/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/core/biz/submit/j2;",
            ">;",
            "Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;",
            "Lhe/b;",
            "Lv30/v;",
            ")V"
        }
    .end annotation
.end method
