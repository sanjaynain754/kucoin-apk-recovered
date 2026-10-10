.class public final Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;
.super Ljava/lang/Object;
.source "IOrderApiDelegate.kt"

# interfaces
.implements Lrg/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001e\u0010\u001d\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\"\u0010\'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016J&\u0010,\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001fH\u0016J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016JT\u00101\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001022\u0006\u00104\u001a\u00020&2\u0008\u00105\u001a\u0004\u0018\u0001032\u0008\u00106\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020@H\u0016J\u001c\u0010A\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J$\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J$\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J$\u0010F\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J\u001e\u0010G\u001a\u0004\u0018\u00010H2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J\n\u0010G\u001a\u0004\u0018\u00010IH\u0016J\u0018\u0010J\u001a\u0008\u0012\u0004\u0012\u00020D0C*\u0008\u0012\u0004\u0012\u00020L0KH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\n\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006M"
    }
    d2 = {
        "Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;",
        "Lcom/kubi/function/common/IMultiOrderApi;",
        "<init>",
        "()V",
        "api",
        "Lcom/kubi/unify/unify/common/order/api/IOrderApi;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/unify/unify/common/order/api/IOrderApi;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "flowApi",
        "getFlowApi",
        "flowApi$delegate",
        "multiBizType",
        "Lcom/kubi/broker/MultiBizType;",
        "pauseOrRestartTwapOrder",
        "",
        "orderId",
        "",
        "status",
        "cancelTwapOrder",
        "cancelAllTwapOrder",
        "symbol",
        "advancedType",
        "submitModifyTwapOrder",
        "Lcom/kubi/kumex/data/trade/model/OrderResult;",
        "entity",
        "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;",
        "submitTwapOrder",
        "request",
        "",
        "submitScaledOrder",
        "body",
        "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;",
        "fetchUserMaxLeverage",
        "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;",
        "isTrial",
        "",
        "cancelOrder",
        "cancelAllOrder",
        "params",
        "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;",
        "cancelAllAdvancedOrders",
        "submitOrder",
        "submitStopOrder",
        "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;",
        "fetchCouponDetail",
        "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;",
        "fetchEsAccountRiskRateChange",
        "Lkotlin/Pair;",
        "Ljava/math/BigDecimal;",
        "trial",
        "qty",
        "price",
        "orderType",
        "side",
        "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "submitReversePositionOrder",
        "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;",
        "submitModifyOrder",
        "createSubmitModifyOrderEntity",
        "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;",
        "submitAlterTpslOrder",
        "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;",
        "submitChaseOrder",
        "fetchActiveOrders",
        "Lcom/kubi/sdk/PageEntity;",
        "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
        "fetchHistoryOrders",
        "fetchAdvancedOrders",
        "fetchTwapOrders",
        "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;",
        "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;",
        "unifyPage2PageEntity",
        "Lcom/kubi/unify/entity/UnifyPageEntity;",
        "Lcom/kubi/unify/entity/UnifyOrderEntity;",
        "BUnifyAccountLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIOrderApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1#2:423\n295#3,2:424\n1563#3:426\n1634#3,3:427\n*S KotlinDebug\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate\n*L\n375#1:424,2\n412#1:426\n412#1:427,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/unify/unify/common/order/delegate/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/unify/unify/common/order/delegate/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/unify/unify/common/order/delegate/b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/unify/unify/common/order/delegate/b;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->b:Lkotlin/Lazy;

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final F0()Lr60/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lr60/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lr60/a;

    .line 13
    return-object v0
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
.end method

.method public static synthetic U()Lr60/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->F0()Lr60/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic a0()Lr60/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->x0()Lr60/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final x0()Lr60/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->g()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lr60/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lr60/a;

    .line 13
    return-object v0
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
.end method


# virtual methods
.method public B(Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 2
    .param p1    # Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "entity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x3

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0, v0, v1, v0}, Lcom/kubi/kumex/data/trade/model/OrderResult;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    return-object p1
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
.end method

.method public H0(ZLjava/util/Map;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 46
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/kumex/data/trade/model/OrderResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    const-string v1, "params"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 13
    const/4 v2, 0x3

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v1, v2, v1}, Lcom/kubi/kumex/data/trade/model/OrderResult;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_0
    const-string v2, "side"

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    const-string v4, "buy"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    move-result v3

    .line 30
    .line 31
    const-string v4, "stop"

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v5

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    .line 39
    if-eqz v5, :cond_1

    .line 40
    move v5, v7

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v5, v6

    .line 43
    .line 44
    :goto_0
    const-string v8, "triggerStopUpPrice"

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    move-result-object v9

    .line 49
    .line 50
    const-string v10, "triggerStopDownPrice"

    .line 51
    .line 52
    if-nez v9, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object v9

    .line 57
    .line 58
    if-eqz v9, :cond_2

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v9, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    move v9, v7

    .line 63
    .line 64
    :goto_2
    if-eqz v3, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    move-result-object v11

    .line 69
    .line 70
    check-cast v11, Ljava/lang/String;

    .line 71
    .line 72
    :goto_3
    move-object/from16 v28, v11

    .line 73
    goto :goto_4

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-result-object v11

    .line 78
    .line 79
    check-cast v11, Ljava/lang/String;

    .line 80
    goto :goto_3

    .line 81
    .line 82
    :goto_4
    if-nez v3, :cond_5

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    check-cast v3, Ljava/lang/String;

    .line 89
    .line 90
    :goto_5
    move-object/from16 v30, v3

    .line 91
    goto :goto_6

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    check-cast v3, Ljava/lang/String;

    .line 98
    goto :goto_5

    .line 99
    .line 100
    :goto_6
    const-string v3, "symbol"

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    move-object/from16 v22, v3

    .line 107
    .line 108
    check-cast v22, Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    check-cast v2, Ljava/lang/String;

    .line 115
    .line 116
    const-string v3, "toUpperCase(...)"

    .line 117
    .line 118
    const-string v8, "ENGLISH"

    .line 119
    .line 120
    if-eqz v2, :cond_6

    .line 121
    .line 122
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 123
    .line 124
    .line 125
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    .line 132
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    move-object/from16 v20, v2

    .line 135
    goto :goto_7

    .line 136
    .line 137
    :cond_6
    move-object/from16 v20, v1

    .line 138
    .line 139
    :goto_7
    const-string v2, "type"

    .line 140
    .line 141
    .line 142
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    check-cast v2, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 150
    .line 151
    .line 152
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    move-object/from16 v19, v2

    .line 162
    goto :goto_8

    .line 163
    .line 164
    :cond_7
    move-object/from16 v19, v1

    .line 165
    .line 166
    :goto_8
    const-string v2, "size"

    .line 167
    .line 168
    .line 169
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    move-result-object v2

    .line 171
    .line 172
    move-object/from16 v21, v2

    .line 173
    .line 174
    check-cast v21, Ljava/lang/String;

    .line 175
    .line 176
    const-string v2, "price"

    .line 177
    .line 178
    .line 179
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    move-result-object v2

    .line 181
    .line 182
    move-object/from16 v23, v2

    .line 183
    .line 184
    check-cast v23, Ljava/lang/String;

    .line 185
    .line 186
    const-string v2, "marginMode"

    .line 187
    .line 188
    .line 189
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    check-cast v2, Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v2, :cond_9

    .line 195
    .line 196
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 197
    .line 198
    .line 199
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 203
    move-result-object v2

    .line 204
    .line 205
    .line 206
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    if-nez v2, :cond_8

    .line 209
    goto :goto_a

    .line 210
    .line 211
    :cond_8
    :goto_9
    move-object/from16 v18, v2

    .line 212
    goto :goto_b

    .line 213
    .line 214
    :cond_9
    :goto_a
    const-string v2, "CROSS"

    .line 215
    goto :goto_9

    .line 216
    .line 217
    :goto_b
    const-string v2, "bboSideType"

    .line 218
    .line 219
    .line 220
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    move-result-object v2

    .line 222
    .line 223
    move-object/from16 v24, v2

    .line 224
    .line 225
    check-cast v24, Ljava/lang/String;

    .line 226
    .line 227
    const-string v2, "bboLevel"

    .line 228
    .line 229
    .line 230
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object v2

    .line 232
    .line 233
    move-object/from16 v25, v2

    .line 234
    .line 235
    check-cast v25, Ljava/lang/String;

    .line 236
    .line 237
    const-string v2, "isFullPercent"

    .line 238
    .line 239
    .line 240
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    move-result-object v2

    .line 242
    .line 243
    check-cast v2, Ljava/lang/String;

    .line 244
    .line 245
    if-eqz v2, :cond_a

    .line 246
    .line 247
    .line 248
    invoke-static {v2, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 249
    move-result v2

    .line 250
    .line 251
    .line 252
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    move-result-object v2

    .line 254
    .line 255
    move-object/from16 v26, v2

    .line 256
    goto :goto_c

    .line 257
    .line 258
    :cond_a
    move-object/from16 v26, v1

    .line 259
    .line 260
    :goto_c
    const-string v2, "leverage"

    .line 261
    .line 262
    .line 263
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    move-result-object v2

    .line 265
    .line 266
    move-object/from16 v27, v2

    .line 267
    .line 268
    check-cast v27, Ljava/lang/String;

    .line 269
    .line 270
    const-string v2, "timeInForce"

    .line 271
    .line 272
    .line 273
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    move-result-object v2

    .line 275
    .line 276
    move-object/from16 v32, v2

    .line 277
    .line 278
    check-cast v32, Ljava/lang/String;

    .line 279
    .line 280
    const-string v2, "closeOnly"

    .line 281
    .line 282
    .line 283
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    move-result-object v2

    .line 285
    .line 286
    check-cast v2, Ljava/lang/String;

    .line 287
    .line 288
    if-eqz v2, :cond_b

    .line 289
    .line 290
    .line 291
    invoke-static {v2, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 292
    move-result v2

    .line 293
    .line 294
    .line 295
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 296
    move-result-object v2

    .line 297
    .line 298
    move-object/from16 v37, v2

    .line 299
    goto :goto_d

    .line 300
    .line 301
    :cond_b
    move-object/from16 v37, v1

    .line 302
    .line 303
    :goto_d
    const-string v2, "closeOrder"

    .line 304
    .line 305
    .line 306
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    move-result-object v2

    .line 308
    .line 309
    check-cast v2, Ljava/lang/String;

    .line 310
    .line 311
    if-eqz v2, :cond_c

    .line 312
    .line 313
    .line 314
    invoke-static {v2, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 315
    move-result v2

    .line 316
    .line 317
    .line 318
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    move-object/from16 v41, v2

    .line 322
    goto :goto_e

    .line 323
    .line 324
    :cond_c
    move-object/from16 v41, v1

    .line 325
    .line 326
    :goto_e
    const-string v2, "fromReduce"

    .line 327
    .line 328
    .line 329
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    move-result-object v2

    .line 331
    .line 332
    check-cast v2, Ljava/lang/String;

    .line 333
    .line 334
    if-eqz v2, :cond_d

    .line 335
    .line 336
    .line 337
    invoke-static {v2, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 338
    move-result v2

    .line 339
    .line 340
    .line 341
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 342
    move-result-object v2

    .line 343
    .line 344
    move-object/from16 v42, v2

    .line 345
    goto :goto_f

    .line 346
    .line 347
    :cond_d
    move-object/from16 v42, v1

    .line 348
    .line 349
    :goto_f
    const-string v2, "hidden"

    .line 350
    .line 351
    .line 352
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    move-result-object v2

    .line 354
    .line 355
    check-cast v2, Ljava/lang/String;

    .line 356
    .line 357
    if-eqz v2, :cond_e

    .line 358
    .line 359
    .line 360
    invoke-static {v2, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 361
    move-result v2

    .line 362
    .line 363
    .line 364
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    move-object/from16 v34, v2

    .line 368
    goto :goto_10

    .line 369
    .line 370
    :cond_e
    move-object/from16 v34, v1

    .line 371
    .line 372
    :goto_10
    const-string v2, "iceberg"

    .line 373
    .line 374
    .line 375
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    move-result-object v2

    .line 377
    .line 378
    check-cast v2, Ljava/lang/String;

    .line 379
    .line 380
    if-eqz v2, :cond_f

    .line 381
    .line 382
    .line 383
    invoke-static {v2, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 384
    move-result v2

    .line 385
    .line 386
    .line 387
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 388
    move-result-object v2

    .line 389
    .line 390
    move-object/from16 v35, v2

    .line 391
    goto :goto_11

    .line 392
    .line 393
    :cond_f
    move-object/from16 v35, v1

    .line 394
    .line 395
    :goto_11
    const-string v2, "visibleSize"

    .line 396
    .line 397
    .line 398
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    move-result-object v2

    .line 400
    .line 401
    move-object/from16 v36, v2

    .line 402
    .line 403
    check-cast v36, Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    move-result-object v2

    .line 408
    .line 409
    check-cast v2, Ljava/lang/String;

    .line 410
    .line 411
    if-eqz v2, :cond_10

    .line 412
    .line 413
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 414
    .line 415
    .line 416
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 420
    move-result-object v2

    .line 421
    .line 422
    .line 423
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    move-object/from16 v38, v2

    .line 426
    goto :goto_12

    .line 427
    .line 428
    :cond_10
    move-object/from16 v38, v1

    .line 429
    .line 430
    :goto_12
    const-string v2, "stopPrice"

    .line 431
    .line 432
    .line 433
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    move-result-object v2

    .line 435
    .line 436
    move-object/from16 v39, v2

    .line 437
    .line 438
    check-cast v39, Ljava/lang/String;

    .line 439
    .line 440
    const-string v2, "stopPriceType"

    .line 441
    .line 442
    if-eqz v5, :cond_11

    .line 443
    .line 444
    .line 445
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    move-result-object v3

    .line 447
    .line 448
    check-cast v3, Ljava/lang/String;

    .line 449
    .line 450
    move-object/from16 v40, v3

    .line 451
    goto :goto_13

    .line 452
    .line 453
    :cond_11
    move-object/from16 v40, v1

    .line 454
    .line 455
    :goto_13
    if-eqz v9, :cond_12

    .line 456
    .line 457
    if-eqz v28, :cond_12

    .line 458
    .line 459
    .line 460
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    move-result-object v3

    .line 462
    .line 463
    check-cast v3, Ljava/lang/String;

    .line 464
    .line 465
    move-object/from16 v29, v3

    .line 466
    goto :goto_14

    .line 467
    .line 468
    :cond_12
    move-object/from16 v29, v1

    .line 469
    .line 470
    :goto_14
    const-string v3, "postOnly"

    .line 471
    .line 472
    .line 473
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    move-result-object v3

    .line 475
    .line 476
    check-cast v3, Ljava/lang/String;

    .line 477
    .line 478
    if-eqz v3, :cond_13

    .line 479
    .line 480
    .line 481
    invoke-static {v3, v6, v7, v1}, Lcom/kubi/utils/extensions/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 482
    move-result v3

    .line 483
    .line 484
    .line 485
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 486
    move-result-object v3

    .line 487
    .line 488
    move-object/from16 v33, v3

    .line 489
    goto :goto_15

    .line 490
    .line 491
    :cond_13
    move-object/from16 v33, v1

    .line 492
    .line 493
    :goto_15
    if-eqz v9, :cond_14

    .line 494
    .line 495
    if-eqz v30, :cond_14

    .line 496
    .line 497
    .line 498
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    move-result-object v1

    .line 500
    .line 501
    check-cast v1, Ljava/lang/String;

    .line 502
    .line 503
    :cond_14
    move-object/from16 v31, v1

    .line 504
    .line 505
    new-instance v12, Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;

    .line 506
    .line 507
    .line 508
    const v44, 0x4000001f    # 2.0000074f

    .line 509
    .line 510
    const/16 v45, 0x0

    .line 511
    const/4 v13, 0x0

    .line 512
    const/4 v14, 0x0

    .line 513
    const/4 v15, 0x0

    .line 514
    .line 515
    const/16 v16, 0x0

    .line 516
    .line 517
    const/16 v17, 0x0

    .line 518
    .line 519
    const/16 v43, 0x0

    .line 520
    .line 521
    .line 522
    invoke-direct/range {v12 .. v45}, Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 523
    .line 524
    const-string v1, "X-VALIDATION-TOKEN"

    .line 525
    .line 526
    .line 527
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    move-result-object v0

    .line 529
    .line 530
    check-cast v0, Ljava/lang/String;

    .line 531
    .line 532
    if-eqz v0, :cond_16

    .line 533
    .line 534
    .line 535
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 536
    move-result v1

    .line 537
    .line 538
    if-nez v1, :cond_15

    .line 539
    goto :goto_16

    .line 540
    .line 541
    .line 542
    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 543
    move-result-object v1

    .line 544
    .line 545
    .line 546
    invoke-interface {v1, v12, v0}, Lr60/a;->l(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 547
    move-result-object v0

    .line 548
    return-object v0

    .line 549
    .line 550
    .line 551
    :cond_16
    :goto_16
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 552
    move-result-object v0

    .line 553
    .line 554
    .line 555
    invoke-interface {v0, v12}, Lr60/a;->w(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 556
    move-result-object v0

    .line 557
    return-object v0
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
.end method

.method public J(Lcm/f;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcm/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcm/f;->a()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "trialFunds"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sget-object v1, Lhf/i;->a:Lhf/i;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lhf/i;->a()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    sget-object v2, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    const-string v3, "tradeType"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcm/f;->d()Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    const-string v3, "symbol"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v1, v2}, Lr60/a;->r(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    return-object p1
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
.end method

.method public L0(ZLjava/lang/String;)Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;

    .line 10
    .line 11
    const/16 v6, 0xf

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    return-object v1

    .line 21
    .line 22
    :cond_0
    new-instance v2, Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2}, Lr60/a;->a(Ljava/lang/String;)Lcom/kubi/unify/entity/UnifyLeverageEntity;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyLeverageEntity;->getLeverage()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    const/16 v7, 0xd

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v2 .. v8}, Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    return-object v2
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
.end method

.method public final T0()Lr60/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lr60/a;

    .line 9
    return-object v0
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
.end method

.method public final V0()Lr60/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lr60/a;

    .line 9
    return-object v0
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
.end method

.method public final W0(Lcom/kubi/unify/entity/UnifyPageEntity;)Lcom/kubi/sdk/PageEntity;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/unify/entity/UnifyPageEntity<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPageEntity;->getItems()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Lcom/kubi/unify/entity/UnifyOrderEntity;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->toOrderEntity()Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    .line 44
    :cond_1
    if-nez v1, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPageEntity;->getTotalPage()Ljava/lang/Integer;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 60
    move-result v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPageEntity;->getCurrentPage()Ljava/lang/Integer;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 68
    move-result v1

    .line 69
    const/4 v2, 0x1

    .line 70
    .line 71
    if-le v0, v1, :cond_3

    .line 72
    move v4, v2

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/4 v0, 0x0

    .line 75
    move v4, v0

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPageEntity;->getCurrentPage()Ljava/lang/Integer;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 83
    move-result v0

    .line 84
    .line 85
    add-int/lit8 v6, v0, 0x1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPageEntity;->getTotalNum()Ljava/lang/Long;

    .line 89
    move-result-object v8

    .line 90
    .line 91
    new-instance v2, Lcom/kubi/sdk/PageEntity;

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v7, -0x1

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/PageEntity;-><init>(Ljava/util/List;ZLcom/kubi/sdk/PageContext;IILjava/lang/Long;)V

    .line 97
    return-object v2
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
.end method

.method public d0(ZLjava/lang/String;)Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p1, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
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
.end method

.method public d1(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .param p2    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "+",
            "Ljava/math/BigDecimal;",
            "+",
            "Ljava/math/BigDecimal;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p7

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->label:I

    .line 23
    .line 24
    move-object/from16 v3, p0

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    new-instance v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;

    .line 28
    .line 29
    move-object/from16 v3, p0

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;-><init>(Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;Lkotlin/coroutines/Continuation;)V

    .line 33
    .line 34
    :goto_0
    iget-object v1, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->result:Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    iget v5, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->label:I

    .line 41
    const/4 v6, 0x1

    .line 42
    const/4 v7, 0x0

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    iget-object v0, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v0, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Ljava/math/BigDecimal;

    .line 63
    .line 64
    iget-object v0, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/math/BigDecimal;

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    throw v0

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static/range {p3 .. p3}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 86
    move-result v1

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    return-object v7

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-static/range {p2 .. p2}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 93
    move-result v1

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    return-object v7

    .line 97
    .line 98
    :cond_4
    if-eqz v0, :cond_5

    .line 99
    return-object v7

    .line 100
    .line 101
    .line 102
    :cond_5
    invoke-virtual {v3}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->V0()Lr60/a;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    sget-object v5, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 109
    move-result-object v5

    .line 110
    .line 111
    const-string v8, "tradeType"

    .line 112
    .line 113
    .line 114
    invoke-static {v8, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 115
    move-result-object v9

    .line 116
    .line 117
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 118
    .line 119
    const-string v8, "ENGLISH"

    .line 120
    .line 121
    .line 122
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    move-object/from16 v15, p4

    .line 125
    .line 126
    .line 127
    invoke-virtual {v15, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 128
    move-result-object v10

    .line 129
    .line 130
    const-string v11, "toUpperCase(...)"

    .line 131
    .line 132
    .line 133
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    const-string v12, "orderType"

    .line 136
    .line 137
    .line 138
    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 139
    move-result-object v10

    .line 140
    .line 141
    const-string v12, "symbol"

    .line 142
    .line 143
    move-object/from16 v13, p5

    .line 144
    .line 145
    .line 146
    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 147
    move-result-object v12

    .line 148
    .line 149
    .line 150
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    move-object/from16 v8, p6

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 156
    move-result-object v5

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    const-string v11, "side"

    .line 162
    .line 163
    .line 164
    invoke-static {v11, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 165
    move-result-object v5

    .line 166
    .line 167
    if-eqz p2, :cond_6

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {p2 .. p2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 171
    move-result-object v11

    .line 172
    goto :goto_1

    .line 173
    :cond_6
    move-object v11, v7

    .line 174
    .line 175
    :goto_1
    const-string v14, "size"

    .line 176
    .line 177
    .line 178
    invoke-static {v14, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 179
    move-result-object v11

    .line 180
    .line 181
    if-eqz p3, :cond_7

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {p3 .. p3}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 185
    move-result-object v14

    .line 186
    goto :goto_2

    .line 187
    :cond_7
    move-object v14, v7

    .line 188
    .line 189
    :goto_2
    const-string v7, "price"

    .line 190
    .line 191
    .line 192
    invoke-static {v7, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 193
    move-result-object v14

    .line 194
    move-object v13, v11

    .line 195
    move-object v11, v12

    .line 196
    move-object v12, v5

    .line 197
    .line 198
    .line 199
    filled-new-array/range {v9 .. v14}, [Lkotlin/Pair;

    .line 200
    move-result-object v5

    .line 201
    .line 202
    .line 203
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 204
    move-result-object v5

    .line 205
    .line 206
    .line 207
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    move-result-object v7

    .line 209
    .line 210
    iput-object v7, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$0:Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    move-result-object v7

    .line 215
    .line 216
    iput-object v7, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$1:Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    move-result-object v7

    .line 221
    .line 222
    iput-object v7, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$2:Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    invoke-static/range {p5 .. p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    move-result-object v7

    .line 227
    .line 228
    iput-object v7, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$3:Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    move-result-object v7

    .line 233
    .line 234
    iput-object v7, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->L$4:Ljava/lang/Object;

    .line 235
    .line 236
    iput-boolean v0, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->Z$0:Z

    .line 237
    .line 238
    iput v6, v2, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate$fetchEsAccountRiskRateChange$1;->label:I

    .line 239
    .line 240
    .line 241
    invoke-interface {v1, v5, v2}, Lr60/a;->s(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 242
    move-result-object v1

    .line 243
    .line 244
    if-ne v1, v4, :cond_8

    .line 245
    return-object v4

    .line 246
    .line 247
    :cond_8
    :goto_3
    check-cast v1, Ljava/util/HashMap;

    .line 248
    .line 249
    const-string v0, "riskRatio"

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    move-result-object v0

    .line 254
    .line 255
    if-eqz v0, :cond_9

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    move-result-object v0

    .line 260
    goto :goto_4

    .line 261
    :cond_9
    const/4 v0, 0x0

    .line 262
    .line 263
    .line 264
    :goto_4
    invoke-static {v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    new-instance v1, Lkotlin/Pair;

    .line 268
    .line 269
    sget-object v2, Lcom/kubi/unify/stream/UnifyDataStreamManager;->a:Lcom/kubi/unify/stream/UnifyDataStreamManager;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Lcom/kubi/unify/stream/UnifyDataStreamManager;->u()Lcom/kubi/unify/stream/b;

    .line 273
    move-result-object v2

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Lcom/kubi/unify/stream/b;->b()Lkotlinx/coroutines/flow/w;

    .line 277
    move-result-object v2

    .line 278
    .line 279
    .line 280
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 281
    move-result-object v2

    .line 282
    .line 283
    check-cast v2, Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;

    .line 284
    .line 285
    if-eqz v2, :cond_a

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;->getDisplayRiskRatio()Ljava/math/BigDecimal;

    .line 289
    move-result-object v2

    .line 290
    goto :goto_5

    .line 291
    :cond_a
    const/4 v2, 0x0

    .line 292
    .line 293
    :goto_5
    if-eqz v0, :cond_b

    .line 294
    .line 295
    .line 296
    invoke-static {v0}, Lm60/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 297
    move-result-object v7

    .line 298
    goto :goto_6

    .line 299
    :cond_b
    const/4 v7, 0x0

    .line 300
    .line 301
    .line 302
    :goto_6
    invoke-direct {v1, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 303
    return-object v1
.end method

.method public e1(Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 3
    .param p1    # Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "body"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;->getValidationToken()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget-object v1, Lhf/i;->a:Lhf/i;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lhf/i;->g()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;->getValidationToken()Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1, p1, v2}, Lr60/a;->o(Ljava/lang/String;Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sget-object v1, Lhf/i;->a:Lhf/i;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lhf/i;->f()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1, p1}, Lr60/a;->q(Ljava/lang/String;Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 51
    move-result-object p1

    .line 52
    return-object p1
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
.end method

.method public f(Ljava/util/Map;)Lcom/kubi/sdk/PageEntity;
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fundsType"

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v1, "trialFunds"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    sget-object v0, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "tradeType"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-string v1, "orderFilter"

    .line 36
    .line 37
    const-string v2, "NORMAL"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    const-string v1, "symbol"

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    :cond_1
    const-string v1, "pageSize"

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    :cond_2
    const-string v1, "currentPage"

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, v0}, Lr60/a;->k(Ljava/util/Map;)Lcom/kubi/unify/entity/UnifyPageEntity;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->W0(Lcom/kubi/unify/entity/UnifyPageEntity;)Lcom/kubi/sdk/PageEntity;

    .line 106
    move-result-object p1

    .line 107
    return-object p1
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
.end method

.method public g(Ljava/util/Map;)Lcom/kubi/sdk/PageEntity;
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fundsType"

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v1, "trialFunds"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    sget-object v0, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "tradeType"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-string v1, "orderFilter"

    .line 36
    .line 37
    const-string v2, "ADVANCED"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    const-string v1, "symbol"

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    :cond_1
    const-string v1, "pageSize"

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    :cond_2
    const-string v1, "currentPage"

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, v0}, Lr60/a;->k(Ljava/util/Map;)Lcom/kubi/unify/entity/UnifyPageEntity;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->W0(Lcom/kubi/unify/entity/UnifyPageEntity;)Lcom/kubi/sdk/PageEntity;

    .line 106
    move-result-object p1

    .line 107
    return-object p1
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
.end method

.method public h(Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 17
    .param p1    # Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "createSubmitModifyOrderEntity"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getSide()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v2, "buy"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getTriggerStopUpPrice()Ljava/math/BigDecimal;

    .line 23
    move-result-object v2

    .line 24
    :goto_0
    move-object v9, v2

    .line 25
    goto :goto_1

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getTriggerStopDownPrice()Ljava/math/BigDecimal;

    .line 29
    move-result-object v2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :goto_1
    if-nez v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getTriggerStopUpPrice()Ljava/math/BigDecimal;

    .line 36
    move-result-object v0

    .line 37
    :goto_2
    move-object v11, v0

    .line 38
    goto :goto_3

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getTriggerStopDownPrice()Ljava/math/BigDecimal;

    .line 42
    move-result-object v0

    .line 43
    goto :goto_2

    .line 44
    .line 45
    .line 46
    :goto_3
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getSymbol()Ljava/lang/String;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getOrderId()Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getPrice()Ljava/math/BigDecimal;

    .line 55
    move-result-object v6

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getSize()Ljava/math/BigDecimal;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getVisibleSize()Ljava/math/BigDecimal;

    .line 63
    move-result-object v8

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getStopPriceType()Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    const/4 v2, 0x0

    .line 69
    .line 70
    if-eqz v9, :cond_2

    .line 71
    move-object v10, v0

    .line 72
    goto :goto_4

    .line 73
    :cond_2
    move-object v10, v2

    .line 74
    .line 75
    .line 76
    :goto_4
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getStopPriceType()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    if-eqz v11, :cond_3

    .line 80
    move-object v12, v0

    .line 81
    goto :goto_5

    .line 82
    :cond_3
    move-object v12, v2

    .line 83
    .line 84
    .line 85
    :goto_5
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getChannel()Ljava/lang/String;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    const-string v2, "ANDROID"

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v13

    .line 93
    .line 94
    new-instance v3, Lcom/kubi/unify/unify/common/order/delegate/UtaModifyOrderParams;

    .line 95
    const/4 v14, 0x0

    .line 96
    .line 97
    const/16 v15, 0x400

    .line 98
    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    .line 102
    invoke-direct/range {v3 .. v16}, Lcom/kubi/unify/unify/common/order/delegate/UtaModifyOrderParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;->getValidationToken()Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 112
    move-result v1

    .line 113
    .line 114
    if-nez v1, :cond_4

    .line 115
    goto :goto_6

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-interface {v1, v3, v0}, Lr60/a;->n(Lcom/kubi/unify/unify/common/order/delegate/UtaModifyOrderParams;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    .line 126
    .line 127
    :cond_5
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v3}, Lr60/a;->p(Lcom/kubi/unify/unify/common/order/delegate/UtaModifyOrderParams;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 132
    move-result-object v0

    .line 133
    return-object v0
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
.end method

.method public i(Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 1
    .param p1    # Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "entity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    const-string v0, "\u7edf\u4e00\u8d26\u6237\u4e0d\u652f\u6301twap"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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
.end method

.method public i1(ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "orderId"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    sget-object v1, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-string v2, "tradeType"

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    move-result-object p3

    .line 34
    .line 35
    .line 36
    filled-new-array {v1, p3}, [Lkotlin/Pair;

    .line 37
    move-result-object p3

    .line 38
    .line 39
    .line 40
    invoke-static {p3}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 41
    move-result-object p3

    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    const-string v0, "symbol"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-interface {p1, p3}, Lr60/a;->m(Ljava/util/Map;)Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    return-object p1
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
.end method

.method public j(Ljava/util/Map;)Lcom/kubi/sdk/PageEntity;
    .locals 6
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fundsType"

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v1, "trialFunds"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    return-object v1

    .line 22
    .line 23
    :cond_0
    sget-object v0, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v2, "tradeType"

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    const-string v2, "symbol"

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    :cond_1
    const-string v2, "pageSize"

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v3

    .line 64
    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    :cond_2
    const-string v2, "currentPage"

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    check-cast v3, Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    :cond_3
    const-string v2, "type"

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    check-cast v2, Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getEntries()Lkotlin/enums/EnumEntries;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    .line 106
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    move-result v4

    .line 112
    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    move-result-object v4

    .line 118
    move-object v5, v4

    .line 119
    .line 120
    check-cast v5, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getTradeType()Ljava/lang/String;

    .line 124
    move-result-object v5

    .line 125
    .line 126
    .line 127
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    move-result v5

    .line 129
    .line 130
    if-eqz v5, :cond_4

    .line 131
    move-object v1, v4

    .line 132
    .line 133
    :cond_5
    check-cast v1, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 134
    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getType()I

    .line 139
    move-result v1

    .line 140
    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 147
    move-result v1

    .line 148
    .line 149
    const-string v2, "orderDisplayType"

    .line 150
    .line 151
    .line 152
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    :cond_6
    const-string v1, "start"

    .line 159
    .line 160
    .line 161
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    check-cast v1, Ljava/lang/String;

    .line 165
    .line 166
    if-eqz v1, :cond_7

    .line 167
    .line 168
    const-string v2, "startAt"

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    check-cast v1, Ljava/lang/String;

    .line 175
    .line 176
    :cond_7
    const-string v1, "end"

    .line 177
    .line 178
    .line 179
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    check-cast p1, Ljava/lang/String;

    .line 183
    .line 184
    if-eqz p1, :cond_8

    .line 185
    .line 186
    const-string v1, "endAt"

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 193
    move-result-object p1

    .line 194
    .line 195
    .line 196
    invoke-interface {p1, v0}, Lr60/a;->j(Ljava/util/Map;)Lcom/kubi/unify/entity/UnifyPageEntity;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p1}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->W0(Lcom/kubi/unify/entity/UnifyPageEntity;)Lcom/kubi/sdk/PageEntity;

    .line 201
    move-result-object p1

    .line 202
    return-object p1
    .line 203
    .line 204
    .line 205
.end method

.method public k(Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 9
    .param p1    # Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "entity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/unify/entity/UnifyReversePositionParams;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getSymbol()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getChannel()Ljava/lang/String;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getLeverage()Ljava/math/BigDecimal;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getPositionSide()Ljava/lang/String;

    .line 23
    move-result-object v5

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getSide()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    const-string v0, "toUpperCase(...)"

    .line 40
    .line 41
    .line 42
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getQty()Ljava/math/BigDecimal;

    .line 46
    move-result-object v0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x1

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v7, v8, v7}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 52
    move-result-object v7

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;->getMarginMode()Ljava/lang/String;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v8

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v1 .. v8}, Lcom/kubi/unify/entity/UnifyReversePositionParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    sget-object v0, Lhf/i;->a:Lhf/i;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lhf/i;->e()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v0, v1}, Lr60/a;->v(Ljava/lang/String;Lcom/kubi/unify/entity/UnifyReversePositionParams;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 77
    move-result-object p1

    .line 78
    return-object p1
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
.end method

.method public l0(ZLcm/p;)Ljava/lang/Object;
    .locals 48
    .param p2    # Lcm/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, Lcm/p;->j()Ljava/lang/String;

    .line 19
    move-result-object v12

    .line 20
    .line 21
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 22
    .line 23
    const-string v2, "ENGLISH"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    const-string v3, "market"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    move-result-object v9

    .line 33
    .line 34
    const-string v3, "toUpperCase(...)"

    .line 35
    .line 36
    .line 37
    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcm/p;->g()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    move-result-object v10

    .line 49
    .line 50
    .line 51
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcm/p;->h()Ljava/lang/String;

    .line 55
    move-result-object v11

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcm/p;->d()Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    move-result-object v8

    .line 67
    .line 68
    .line 69
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    new-instance v13, Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;

    .line 72
    .line 73
    sget-object v16, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    sget-object v31, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    const/16 v34, 0x181f

    .line 78
    .line 79
    const/16 v35, 0x0

    .line 80
    move-object v4, v3

    .line 81
    const/4 v3, 0x0

    .line 82
    move-object v5, v4

    .line 83
    const/4 v4, 0x0

    .line 84
    move-object v6, v5

    .line 85
    const/4 v5, 0x0

    .line 86
    move-object v7, v6

    .line 87
    const/4 v6, 0x0

    .line 88
    move-object v14, v7

    .line 89
    const/4 v7, 0x0

    .line 90
    move-object v15, v2

    .line 91
    move-object v2, v13

    .line 92
    const/4 v13, 0x0

    .line 93
    .line 94
    move-object/from16 v17, v14

    .line 95
    const/4 v14, 0x0

    .line 96
    .line 97
    move-object/from16 v18, v15

    .line 98
    const/4 v15, 0x0

    .line 99
    .line 100
    move-object/from16 v19, v17

    .line 101
    .line 102
    const-string v17, "1"

    .line 103
    .line 104
    move-object/from16 v20, v18

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    move-object/from16 v21, v19

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    move-object/from16 v22, v20

    .line 113
    .line 114
    const/16 v20, 0x0

    .line 115
    .line 116
    move-object/from16 v23, v21

    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    move-object/from16 v24, v22

    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    move-object/from16 v25, v23

    .line 125
    .line 126
    const/16 v23, 0x0

    .line 127
    .line 128
    move-object/from16 v26, v24

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    move-object/from16 v27, v25

    .line 133
    .line 134
    const/16 v25, 0x0

    .line 135
    .line 136
    move-object/from16 v28, v26

    .line 137
    .line 138
    const/16 v26, 0x0

    .line 139
    .line 140
    move-object/from16 v29, v27

    .line 141
    .line 142
    const/16 v27, 0x0

    .line 143
    .line 144
    move-object/from16 v30, v28

    .line 145
    .line 146
    const/16 v28, 0x0

    .line 147
    .line 148
    move-object/from16 v32, v29

    .line 149
    .line 150
    const/16 v29, 0x0

    .line 151
    .line 152
    move-object/from16 v33, v30

    .line 153
    .line 154
    const/16 v30, 0x0

    .line 155
    .line 156
    move-object/from16 v36, v32

    .line 157
    .line 158
    const/16 v32, 0x0

    .line 159
    .line 160
    move-object/from16 v37, v33

    .line 161
    .line 162
    move-object/from16 v33, v31

    .line 163
    .line 164
    move-object/from16 v47, v36

    .line 165
    .line 166
    move-object/from16 v1, v37

    .line 167
    .line 168
    .line 169
    invoke-direct/range {v2 .. v35}, Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    move-object v13, v2

    .line 171
    .line 172
    move-object/from16 v2, v31

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {p2 .. p2}, Lcm/p;->n()Ljava/lang/String;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {p2 .. p2}, Lcm/p;->k()Ljava/math/BigDecimal;

    .line 180
    move-result-object v4

    .line 181
    .line 182
    if-eqz v4, :cond_4

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {p2 .. p2}, Lcm/p;->l()Ljava/lang/String;

    .line 186
    move-result-object v6

    .line 187
    .line 188
    if-eqz v6, :cond_1

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 195
    move-result-object v6

    .line 196
    .line 197
    move-object/from16 v7, v47

    .line 198
    .line 199
    .line 200
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    move-object/from16 v39, v6

    .line 203
    goto :goto_0

    .line 204
    .line 205
    :cond_1
    move-object/from16 v7, v47

    .line 206
    .line 207
    move-object/from16 v39, v5

    .line 208
    .line 209
    .line 210
    :goto_0
    invoke-virtual {v4}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 211
    move-result-object v40

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {p2 .. p2}, Lcm/p;->m()Ljava/lang/String;

    .line 215
    move-result-object v41

    .line 216
    .line 217
    .line 218
    const v45, 0x71ffffff

    .line 219
    .line 220
    const/16 v46, 0x0

    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    const/16 v18, 0x0

    .line 229
    .line 230
    const/16 v19, 0x0

    .line 231
    .line 232
    const/16 v20, 0x0

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    const/16 v22, 0x0

    .line 237
    .line 238
    const/16 v23, 0x0

    .line 239
    .line 240
    const/16 v24, 0x0

    .line 241
    .line 242
    const/16 v25, 0x0

    .line 243
    .line 244
    const/16 v26, 0x0

    .line 245
    .line 246
    const/16 v27, 0x0

    .line 247
    .line 248
    const/16 v28, 0x0

    .line 249
    .line 250
    const/16 v29, 0x0

    .line 251
    .line 252
    const/16 v30, 0x0

    .line 253
    .line 254
    const/16 v31, 0x0

    .line 255
    .line 256
    const/16 v32, 0x0

    .line 257
    .line 258
    const/16 v33, 0x0

    .line 259
    .line 260
    const/16 v34, 0x0

    .line 261
    .line 262
    const/16 v35, 0x0

    .line 263
    .line 264
    const/16 v36, 0x0

    .line 265
    .line 266
    const/16 v37, 0x0

    .line 267
    .line 268
    const/16 v38, 0x0

    .line 269
    .line 270
    const/16 v42, 0x0

    .line 271
    .line 272
    const/16 v43, 0x0

    .line 273
    .line 274
    const/16 v44, 0x0

    .line 275
    .line 276
    .line 277
    invoke-static/range {v13 .. v46}, Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;->copy$default(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;

    .line 278
    move-result-object v4

    .line 279
    .line 280
    if-eqz v3, :cond_3

    .line 281
    .line 282
    .line 283
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 284
    move-result v6

    .line 285
    .line 286
    if-nez v6, :cond_2

    .line 287
    goto :goto_1

    .line 288
    .line 289
    .line 290
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 291
    move-result-object v6

    .line 292
    .line 293
    .line 294
    invoke-interface {v6, v4, v3}, Lr60/a;->l(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 295
    goto :goto_2

    .line 296
    .line 297
    .line 298
    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 299
    move-result-object v6

    .line 300
    .line 301
    .line 302
    invoke-interface {v6, v4}, Lr60/a;->w(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 303
    goto :goto_2

    .line 304
    .line 305
    :cond_4
    move-object/from16 v7, v47

    .line 306
    .line 307
    .line 308
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcm/p;->a()Ljava/math/BigDecimal;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    if-eqz v4, :cond_8

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {p2 .. p2}, Lcm/p;->b()Ljava/lang/String;

    .line 315
    move-result-object v6

    .line 316
    .line 317
    if-eqz v6, :cond_5

    .line 318
    .line 319
    .line 320
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 324
    move-result-object v5

    .line 325
    .line 326
    .line 327
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    .line 329
    :cond_5
    move-object/from16 v39, v5

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 333
    move-result-object v40

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {p2 .. p2}, Lcm/p;->c()Ljava/lang/String;

    .line 337
    move-result-object v41

    .line 338
    .line 339
    .line 340
    const v45, 0x71ffffff

    .line 341
    .line 342
    const/16 v46, 0x0

    .line 343
    const/4 v14, 0x0

    .line 344
    const/4 v15, 0x0

    .line 345
    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/16 v18, 0x0

    .line 351
    .line 352
    const/16 v19, 0x0

    .line 353
    .line 354
    const/16 v20, 0x0

    .line 355
    .line 356
    const/16 v21, 0x0

    .line 357
    .line 358
    const/16 v22, 0x0

    .line 359
    .line 360
    const/16 v23, 0x0

    .line 361
    .line 362
    const/16 v24, 0x0

    .line 363
    .line 364
    const/16 v25, 0x0

    .line 365
    .line 366
    const/16 v26, 0x0

    .line 367
    .line 368
    const/16 v27, 0x0

    .line 369
    .line 370
    const/16 v28, 0x0

    .line 371
    .line 372
    const/16 v29, 0x0

    .line 373
    .line 374
    const/16 v30, 0x0

    .line 375
    .line 376
    const/16 v31, 0x0

    .line 377
    .line 378
    const/16 v32, 0x0

    .line 379
    .line 380
    const/16 v33, 0x0

    .line 381
    .line 382
    const/16 v34, 0x0

    .line 383
    .line 384
    const/16 v35, 0x0

    .line 385
    .line 386
    const/16 v36, 0x0

    .line 387
    .line 388
    const/16 v37, 0x0

    .line 389
    .line 390
    const/16 v38, 0x0

    .line 391
    .line 392
    const/16 v42, 0x0

    .line 393
    .line 394
    const/16 v43, 0x0

    .line 395
    .line 396
    const/16 v44, 0x0

    .line 397
    .line 398
    .line 399
    invoke-static/range {v13 .. v46}, Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;->copy$default(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;

    .line 400
    move-result-object v0

    .line 401
    .line 402
    if-eqz v3, :cond_7

    .line 403
    .line 404
    .line 405
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 406
    move-result v1

    .line 407
    .line 408
    if-nez v1, :cond_6

    .line 409
    goto :goto_3

    .line 410
    .line 411
    .line 412
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 413
    move-result-object v1

    .line 414
    .line 415
    .line 416
    invoke-interface {v1, v0, v3}, Lr60/a;->l(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 417
    goto :goto_4

    .line 418
    .line 419
    .line 420
    :cond_7
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 421
    move-result-object v1

    .line 422
    .line 423
    .line 424
    invoke-interface {v1, v0}, Lr60/a;->w(Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;)Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 425
    :cond_8
    :goto_4
    return-object v2
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
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
.end method

.method public m(Ljava/util/Map;)Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    const-string v0, "\u7edf\u4e00\u8d26\u6237\u4e0d\u652f\u6301twap"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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
.end method

.method public r(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 3
    .line 4
    const-string v0, "\u7edf\u4e00\u8d26\u6237\u4e0d\u652f\u6301twap"

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 8
    throw p1
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
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p1, "advancedType"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    const-string p2, "\u7edf\u4e00\u8d26\u6237\u4e0d\u652f\u6301twap"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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
.end method

.method public v(Ljava/util/Map;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/kumex/data/trade/model/OrderResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    const-string v0, "\u7edf\u4e00\u8d26\u6237\u4e0d\u652f\u6301twap"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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
.end method

.method public x()Lcom/kubi/broker/MultiBizType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/MultiBizType;->UNIFIED:Lcom/kubi/broker/MultiBizType;

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method

.method public y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p1, "status"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    const-string p2, "\u7edf\u4e00\u8d26\u6237\u4e0d\u652f\u6301twap"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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
.end method

.method public z(Ljava/util/Map;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/kumex/data/trade/model/OrderResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "entity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Lcom/kubi/kumex/data/trade/model/OrderResult;

    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x3

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0, v0, v1, v0}, Lcom/kubi/kumex/data/trade/model/OrderResult;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    return-object p1
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
.end method

.method public z0(Lcm/f;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcm/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "params"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcm/f;->a()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "trialFunds"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;->T0()Lr60/a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sget-object v1, Lhf/i;->a:Lhf/i;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lhf/i;->b()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    sget-object v2, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    const-string v3, "tradeType"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcm/f;->d()Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    const-string v3, "symbol"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v1, v2}, Lr60/a;->u(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    return-object p1
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
.end method
