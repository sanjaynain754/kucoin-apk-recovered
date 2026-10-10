.class final Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AssetsSelectedDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrepayment/dialog/AssetsSelectedDialog$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lrepayment/b;",
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
        "it",
        "Lrepayment/RepayContract$UiState;"
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
    c = "repayment.dialog.AssetsSelectedDialog$initData$1$1"
    f = "AssetsSelectedDialog.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lrepayment/dialog/AssetsSelectedDialog;


# direct methods
.method public constructor <init>(Lrepayment/dialog/AssetsSelectedDialog;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/dialog/AssetsSelectedDialog;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

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
    new-instance v0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;

    .line 3
    .line 4
    iget-object v1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;-><init>(Lrepayment/dialog/AssetsSelectedDialog;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->L$0:Ljava/lang/Object;

    .line 10
    return-object v0
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
    check-cast p1, Lrepayment/b;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->invoke(Lrepayment/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lrepayment/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->L$0:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lrepayment/b;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    iget v1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->label:I

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    instance-of p1, v0, Lrepayment/b$c;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lrepayment/dialog/AssetsSelectedDialog;->s4(Lrepayment/dialog/AssetsSelectedDialog;)V

    .line 24
    .line 25
    iget-object p1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lrepayment/dialog/AssetsSelectedDialog;->t4(Lrepayment/dialog/AssetsSelectedDialog;)V

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_0
    instance-of p1, v0, Lrepayment/b$a;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lrepayment/dialog/AssetsSelectedDialog;->p4(Lrepayment/dialog/AssetsSelectedDialog;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    sget v0, Lcom/kubi/unify/R$string;->no_records:I

    .line 44
    .line 45
    sget v1, Lcom/kubi/unify/R$drawable;->ic2_common_empty:I

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1, v2}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->showEmpty(IILandroid/view/View$OnClickListener;)V

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_1
    instance-of p1, v0, Lrepayment/b$b;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

    .line 57
    .line 58
    check-cast v0, Lrepayment/b$b;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lrepayment/b$b;->c()Ljava/util/List;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iget-object v1, p0, Lrepayment/dialog/AssetsSelectedDialog$initData$1$1;->this$0:Lrepayment/dialog/AssetsSelectedDialog;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lrepayment/dialog/AssetsSelectedDialog;->q4(Lrepayment/dialog/AssetsSelectedDialog;)Lrepayment/RepayVM;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lrepayment/RepayVM;->v()Lkotlinx/coroutines/flow/w;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    check-cast v1, Ljava/util/List;

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0, v1}, Lrepayment/dialog/AssetsSelectedDialog;->r4(Lrepayment/dialog/AssetsSelectedDialog;Ljava/util/List;Ljava/util/List;)V

    .line 82
    .line 83
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    throw p1
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
.end method
