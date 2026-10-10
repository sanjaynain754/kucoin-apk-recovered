.class final Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MarginConfigManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/margin/trade/MarginConfigManager;->A0(Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Lkotlinx/coroutines/flow/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Pair<",
        "+",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        "+",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        "base",
        "quote"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.margin.trade.MarginConfigManager$fetchMarginCoupons$1"
    f = "MarginConfigManager.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
.end method


# virtual methods
.method public final invoke(Lcom/kubi/margin/api/entity/CouponsOverview;Lcom/kubi/margin/api/entity/CouponsOverview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/margin/api/entity/CouponsOverview;",
            "Lcom/kubi/margin/api/entity/CouponsOverview;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Lcom/kubi/margin/api/entity/CouponsOverview;",
            "Lcom/kubi/margin/api/entity/CouponsOverview;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;

    invoke-direct {v0, p3}, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/kubi/margin/api/entity/CouponsOverview;

    check-cast p2, Lcom/kubi/margin/api/entity/CouponsOverview;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->invoke(Lcom/kubi/margin/api/entity/CouponsOverview;Lcom/kubi/margin/api/entity/CouponsOverview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->L$0:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/kubi/margin/api/entity/CouponsOverview;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->L$1:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lcom/kubi/margin/api/entity/CouponsOverview;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 12
    .line 13
    iget v2, p0, Lcom/kubi/margin/trade/MarginConfigManager$fetchMarginCoupons$1;->label:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    .line 20
    new-instance p1, Lkotlin/Pair;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    throw p1
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
.end method
