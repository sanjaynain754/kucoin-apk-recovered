.class final Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerServiceHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/kubi/helpcenter/entity/BotTypeEntity;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "botTypeEntity",
        "Lcom/kubi/helpcenter/entity/BotTypeEntity;"
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
    c = "com.kubi.helpcenter.CustomerServiceHelper$Companion$toChatDirectly$1$1"
    f = "CustomerServiceHelper.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
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

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kubi/helpcenter/api/CustomerServiceType;Landroid/content/Context;Ljava/util/HashMap;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/helpcenter/api/CustomerServiceType;",
            "Landroid/content/Context;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$from:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$context:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$configMap:Ljava/util/HashMap;

    .line 9
    .line 10
    iput-boolean p5, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$isReset:Z

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
    new-instance v0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$from:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$context:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$configMap:Ljava/util/HashMap;

    .line 11
    .line 12
    iget-boolean v5, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$isReset:Z

    .line 13
    move-object v6, p2

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;-><init>(Ljava/lang/String;Lcom/kubi/helpcenter/api/CustomerServiceType;Landroid/content/Context;Ljava/util/HashMap;ZLkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    iput-object p1, v0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->L$0:Ljava/lang/Object;

    .line 19
    return-object v0
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

.method public final invoke(Lcom/kubi/helpcenter/entity/BotTypeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/helpcenter/entity/BotTypeEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/kubi/helpcenter/entity/BotTypeEntity;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->invoke(Lcom/kubi/helpcenter/entity/BotTypeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/kubi/helpcenter/entity/BotTypeEntity;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 1
    iget v1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->label:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {v0}, Lcom/kubi/helpcenter/entity/BotTypeEntity;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ADA_BOT_SDK"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$from:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$from:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$source:Lcom/kubi/helpcenter/api/CustomerServiceType;

    invoke-virtual {p1}, Lcom/kubi/helpcenter/api/CustomerServiceType;->getServiceType()Ljava/lang/String;

    move-result-object p1

    .line 4
    :goto_0
    sget-object v0, Lcom/kubi/helpcenter/CustomerServiceHelper;->a:Lcom/kubi/helpcenter/CustomerServiceHelper$Companion;

    iget-object v1, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$configMap:Ljava/util/HashMap;

    iget-boolean v3, p0, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion$toChatDirectly$1$1;->$isReset:Z

    invoke-static {v0, v1, p1, v2, v3}, Lcom/kubi/helpcenter/CustomerServiceHelper$Companion;->access$invokeAdaBotSdk(Lcom/kubi/helpcenter/CustomerServiceHelper$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Z)V

    goto :goto_1

    .line 5
    :cond_1
    sget-object p1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    invoke-virtual {v0}, Lcom/kubi/helpcenter/entity/BotTypeEntity;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    move-result-object p1

    invoke-virtual {p1}, Lay/a;->k()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 6
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
