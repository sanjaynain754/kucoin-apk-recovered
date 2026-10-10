.class final Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lma0/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lma0/c;",
        "session",
        "",
        "invoke",
        "(Lma0/c;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $merchantPublicKey:Ljava/lang/String;

.field final synthetic $requestShipping:Z

.field final synthetic this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->$merchantPublicKey:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->$requestShipping:Z

    .line 7
    const/4 p1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lma0/c;

    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->invoke(Lma0/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lma0/c;)V
    .locals 18
    .param p1    # Lma0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    .line 2
    const-string/jumbo v1, "session"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    invoke-virtual {v1}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->h()V

    iget-object v1, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    new-instance v3, Lcom/revolut/revolutpay/polling/b;

    invoke-static {v1}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->c(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    const-string/jumbo v4, "orderToken"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v5

    move-object v6, v4

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    new-instance v5, Lcom/revolut/revolutpay/polling/a;

    iget-object v7, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    invoke-static {v7}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->a(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)Landroidx/lifecycle/Lifecycle;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, "lifecycle"

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v6, v7

    :goto_1
    invoke-direct {v5, v6}, Lcom/revolut/revolutpay/polling/a;-><init>(Landroidx/lifecycle/Lifecycle;)V

    new-instance v6, Lcom/revolut/revolutpay/polling/e;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    const-string/jumbo v8, "newCachedThreadPool()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v8

    const-string/jumbo v9, "newSingleThreadScheduledExecutor()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v6, v7, v8, v9}, Lcom/revolut/revolutpay/polling/e;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    new-instance v7, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7$1;

    iget-object v8, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    invoke-direct {v7, v8}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7$1;-><init>(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)V

    new-instance v8, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7$2;

    iget-object v9, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    invoke-direct {v8, v9}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7$2;-><init>(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;)V

    sget-object v9, Lcom/revolut/revolutpay/data/a;->a:Lcom/revolut/revolutpay/data/a;

    const/16 v16, 0x3c0

    const/16 v17, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lcom/revolut/revolutpay/polling/b;-><init>(Ljava/lang/String;Lcom/revolut/revolutpay/polling/a;Lcom/revolut/revolutpay/polling/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lja0/d;Lcom/revolut/revolutpay/polling/i;JJLjava/util/concurrent/TimeUnit;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/revolut/revolutpay/polling/b;->s()V

    invoke-static {v1, v3}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->e(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;Lcom/revolut/revolutpay/polling/b;)V

    iget-object v1, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->this$0:Lcom/revolut/revolutpay/ui/controller/RevolutPayController;

    invoke-virtual {v2}, Lma0/c;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->$merchantPublicKey:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/revolut/revolutpay/ui/controller/RevolutPayController$continueConfirmationFlow$7;->$requestShipping:Z

    invoke-static {v1, v2, v3, v4}, Lcom/revolut/revolutpay/ui/controller/RevolutPayController;->d(Lcom/revolut/revolutpay/ui/controller/RevolutPayController;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
