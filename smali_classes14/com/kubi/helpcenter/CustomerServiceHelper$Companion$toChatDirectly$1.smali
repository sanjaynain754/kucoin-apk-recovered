.class final Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerServiceHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/helpcenter/CustomerServiceHelper$Companion;->toChatDirectly(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/helpcenter/api/CustomerServiceType;Ljava/util/HashMap;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.kubi.helpcenter.CustomerServiceHelper$Companion$toChatDirectly$1"
    f = "CustomerServiceHelper.kt"
    i = {}
    l = {
        0x61
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomerServiceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerServiceHelper.kt\ncom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HelpCenterIssue.kt\ncom/kubi/helpcenter/exception/HelpCenterIssueKt\n*L\n1#1,152:1\n25#2:153\n26#2:157\n1#3:154\n44#4,2:155\n*S KotlinDebug\n*F\n+ 1 CustomerServiceHelper.kt\ncom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1\n*L\n105#1:153\n105#1:157\n105#1:154\n109#1:155,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $configMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $from:Ljava/lang/String;

.field final synthetic $isReset:Z

.field final synthetic $source:Lcom/kubi/helpcenter/api/CustomerServiceType;

.field label:I


# direct methods
.method public constructor <init>(Lcom/kubi/helpcenter/api/CustomerServiceType;Ljava/lang/String;Landroid/content/Context;Ljava/util/HashMap;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/helpcenter/api/CustomerServiceType;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$from:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$context:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$configMap:Ljava/util/HashMap;

    .line 9
    .line 10
    iput-boolean p5, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$isReset:Z

    .line 11
    const/4 p1, 0x2

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$from:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$context:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$configMap:Ljava/util/HashMap;

    .line 11
    .line 12
    iget-boolean v5, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$isReset:Z

    .line 13
    move-object v6, p2

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;-><init>(Lcom/kubi/helpcenter/api/CustomerServiceType;Ljava/lang/String;Landroid/content/Context;Ljava/util/HashMap;ZLkotlin/coroutines/Continuation;)V

    .line 17
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    move-result-object p1

    const-class v1, Lvi/a;

    invoke-virtual {p1, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/a;

    .line 3
    iget-object v1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    invoke-virtual {v1}, Lcom/kubi/helpcenter/api/CustomerServiceType;->getServiceType()Ljava/lang/String;

    move-result-object v6

    .line 4
    new-instance v3, Lcom/kubi/helpcenter/entity/QueryBotTypeParams;

    const/16 v8, 0x9

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/kubi/helpcenter/entity/QueryBotTypeParams;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    invoke-interface {p1, v3}, Lvi/a;->b(Lcom/kubi/helpcenter/entity/QueryBotTypeParams;)Lkotlinx/coroutines/flow/e;

    move-result-object v4

    .line 6
    new-instance v5, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;

    iget-object v6, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$from:Ljava/lang/String;

    iget-object v7, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    iget-object v8, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$context:Landroid/content/Context;

    iget-object v9, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$configMap:Ljava/util/HashMap;

    iget-boolean v10, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->$isReset:Z

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;-><init>(Ljava/lang/String;Lcom/kubi/helpcenter/api/CustomerServiceType;Landroid/content/Context;Ljava/util/HashMap;ZLkotlin/coroutines/Continuation;)V

    iput v2, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->label:I

    move-object v6, v5

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 7
    :cond_2
    :goto_0
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 8
    invoke-virtual {p1}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 9
    sget-object p1, Lvi/b;->a:Lvi/b;

    sget-object v0, Lcom/kubi/helpcenter/api/CustomerServiceType;->NONE:Lcom/kubi/helpcenter/api/CustomerServiceType;

    invoke-virtual {v0}, Lcom/kubi/helpcenter/api/CustomerServiceType;->getServiceType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvi/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    .line 10
    invoke-static {p1, v0, v7, v8}, Lcom/kubi/user/api/d;->d(Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 11
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    invoke-virtual {v0, p1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    move-result-object p1

    invoke-virtual {p1}, Lay/a;->k()Z

    .line 12
    new-instance v0, Lcom/kubi/helpcenter/exception/HelpCenterException;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "CustomerServiceHelper"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/kubi/helpcenter/exception/HelpCenterException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v8, v7, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 13
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
