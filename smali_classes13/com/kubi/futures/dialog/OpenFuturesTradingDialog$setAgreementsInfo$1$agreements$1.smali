.class final Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "OpenFuturesTradingDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;",
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
    c = "com.kubi.futures.dialog.OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1"
    f = "OpenFuturesTradingDialog.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x13b
    }
    m = "invokeSuspend"
    n = {
        "it",
        "this_$iv",
        "json$iv",
        "$completion$iv",
        "$i$a$-let-OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1$1",
        "$i$f$fromJsonOrNull"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOpenFuturesTradingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,312:1\n196#2,3:313\n*S KotlinDebug\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1\n*L\n137#1:313,3\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->this$0:Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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
    new-instance p1, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->this$0:Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;-><init>(Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$3:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$2:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$1:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lcom/kubi/utils/x;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    throw p1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    iget-object p1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->this$0:Lcom/kubi/futures/dialog/OpenFuturesTradingDialog;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const-string v3, "AgreementsOfOpenFuturesStr"

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v3}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    sget-object v3, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 62
    .line 63
    new-instance v4, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1$invokeSuspend$lambda$0$$inlined$fromJsonOrNull$1;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4, p1, v1}, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1$invokeSuspend$lambda$0$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v4}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    iput-object v4, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    iput-object v3, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    iput-object p1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$2:Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    iput-object p1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->L$3:Ljava/lang/Object;

    .line 103
    const/4 p1, 0x0

    .line 104
    .line 105
    iput p1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->I$0:I

    .line 106
    .line 107
    iput p1, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->I$1:I

    .line 108
    .line 109
    iput v2, p0, Lcom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1;->label:I

    .line 110
    .line 111
    .line 112
    invoke-static {v1, p0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    if-ne p1, v0, :cond_2

    .line 116
    return-object v0

    .line 117
    .line 118
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 119
    return-object p1

    .line 120
    :cond_3
    return-object v1
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
.end method
