.class final Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepayForAssetsVMExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrepayment/ext/RepayForAssetsVMExtKt;->d(Lrepayment/RepayVM;Lcom/kubi/unify/entity/PreRepayRequestBody;)Lkotlinx/coroutines/x1;
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
    c = "repayment.ext.RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1"
    f = "RepayForAssetsVMExt.kt"
    i = {}
    l = {
        0x6c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $requestEntity:Lcom/kubi/unify/entity/PreRepayRequestBody;

.field final synthetic $this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

.field label:I


# direct methods
.method public constructor <init>(Lrepayment/RepayVM;Lcom/kubi/unify/entity/PreRepayRequestBody;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/RepayVM;",
            "Lcom/kubi/unify/entity/PreRepayRequestBody;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 3
    .line 4
    iput-object p2, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$requestEntity:Lcom/kubi/unify/entity/PreRepayRequestBody;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    return-void
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
.end method

.method public static synthetic a(Lrepayment/RepayVM;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->f(Lrepayment/RepayVM;Ljava/lang/Throwable;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private static final f(Lrepayment/RepayVM;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string p1, "RepayVM"

    .line 3
    .line 4
    const-string v0, "fetchRepaySizePreCalculate: \u534f\u8bae\u5931\u8d25"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lrepayment/RepayVM;->u()Lkotlinx/coroutines/x1;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, p1, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 19
    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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
    new-instance p1, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;

    .line 3
    .line 4
    iget-object v0, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 5
    .line 6
    iget-object v1, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$requestEntity:Lcom/kubi/unify/entity/PreRepayRequestBody;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;-><init>(Lrepayment/RepayVM;Lcom/kubi/unify/entity/PreRepayRequestBody;Lkotlin/coroutines/Continuation;)V

    .line 10
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p1

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    :cond_2
    iget-object p1, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 33
    move-result p1

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    const/4 p1, 0x0

    .line 37
    .line 38
    :try_start_0
    iget-object v1, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lrepayment/RepayVM;->r()Li60/c;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    iget-object v4, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$requestEntity:Lcom/kubi/unify/entity/PreRepayRequestBody;

    .line 45
    .line 46
    .line 47
    invoke-interface {v3, v4}, Li60/c;->o(Lcom/kubi/unify/entity/PreRepayRequestBody;)Lkotlinx/coroutines/flow/e;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    new-instance v4, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1$1;

    .line 51
    .line 52
    iget-object v5, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, v5, p1}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1$1;-><init>(Lrepayment/RepayVM;Lkotlin/coroutines/Continuation;)V

    .line 56
    .line 57
    iget-object v5, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 58
    .line 59
    new-instance v6, Lrepayment/ext/f;

    .line 60
    .line 61
    .line 62
    invoke-direct {v6, v5}, Lrepayment/ext/f;-><init>(Lrepayment/RepayVM;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3, v4, v6}, Lrepayment/RepayVM;->F(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception v1

    .line 68
    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    const-string v4, "fetchRepaySizePreCalculate: "

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    const-string v3, "RepayVM"

    .line 87
    .line 88
    .line 89
    invoke-static {v3, v1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    iget-object v1, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->$this_startPreRepayPriceTimerTask:Lrepayment/RepayVM;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lrepayment/RepayVM;->u()Lkotlinx/coroutines/x1;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    .line 100
    invoke-static {v1, p1, v2, p1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 101
    .line 102
    :cond_3
    :goto_1
    iput v2, p0, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;->label:I

    .line 103
    .line 104
    .line 105
    const-wide/32 v3, 0xea60

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    if-ne p1, v0, :cond_2

    .line 112
    return-object v0

    .line 113
    .line 114
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 115
    return-object p1
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
