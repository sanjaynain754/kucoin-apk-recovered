.class final Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepayVM.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/kubi/unify/entity/RepayAsset;",
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
        "repayAsset",
        "Lcom/kubi/unify/entity/RepayAsset;"
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
    c = "repayment.RepayVM$loadUnifyLiabilityAndAssetsData$1$1"
    f = "RepayVM.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepayVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $currencyCode:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lrepayment/RepayVM;


# direct methods
.method public constructor <init>(Lrepayment/RepayVM;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/RepayVM;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->this$0:Lrepayment/RepayVM;

    .line 3
    .line 4
    iput-object p2, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->$currencyCode:Ljava/lang/String;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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
    new-instance v0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;

    .line 3
    .line 4
    iget-object v1, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->this$0:Lrepayment/RepayVM;

    .line 5
    .line 6
    iget-object v2, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->$currencyCode:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;-><init>(Lrepayment/RepayVM;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->L$0:Ljava/lang/Object;

    .line 12
    return-object v0
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

.method public final invoke(Lcom/kubi/unify/entity/RepayAsset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/unify/entity/RepayAsset;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/kubi/unify/entity/RepayAsset;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->invoke(Lcom/kubi/unify/entity/RepayAsset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->L$0:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/kubi/unify/entity/RepayAsset;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    iget v1, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->label:I

    .line 10
    .line 11
    if-nez v1, :cond_5

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lrepayment/ext/i;->b(Lcom/kubi/unify/entity/RepayAsset;)Lrepayment/b$b;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iget-object v0, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->this$0:Lrepayment/RepayVM;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lrepayment/RepayVM;->o(Lrepayment/RepayVM;)Lkotlinx/coroutines/flow/n;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lrepayment/b$b;->d()Lrepayment/RepayAssetData;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lrepayment/RepayAssetData;->getUnifyLiabilityList()Ljava/util/List;

    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-object v3, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->$currencyCode:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v4

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v4

    .line 52
    move-object v5, v4

    .line 53
    .line 54
    check-cast v5, Lrepayment/UnifyLiabilityData;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Lrepayment/UnifyLiabilityData;->getCurrencyCode()Ljava/lang/String;

    .line 58
    move-result-object v5

    .line 59
    .line 60
    .line 61
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result v5

    .line 63
    .line 64
    if-eqz v5, :cond_0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move-object v4, v2

    .line 67
    .line 68
    :goto_0
    check-cast v4, Lrepayment/UnifyLiabilityData;

    .line 69
    .line 70
    if-nez v4, :cond_2

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v2, v4

    .line 73
    goto :goto_2

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lrepayment/b$b;->d()Lrepayment/RepayAssetData;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lrepayment/RepayAssetData;->getUnifyLiabilityList()Ljava/util/List;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    move-result-object v1

    .line 88
    move-object v2, v1

    .line 89
    .line 90
    check-cast v2, Lrepayment/UnifyLiabilityData;

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_2
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    iget-object v0, p0, Lrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1;->this$0:Lrepayment/RepayVM;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lrepayment/RepayVM;->t()Lkotlinx/coroutines/flow/n;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    return-object p1

    .line 106
    .line 107
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 110
    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    throw p1
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
