.class final Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "EditTradeAvgCostBottomSheetHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V
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
    c = "com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$7"
    f = "EditTradeAvgCostBottomSheetHelper.kt"
    i = {}
    l = {
        0xbb
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEditTradeAvgCostBottomSheetHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n25#2:199\n26#2:201\n1#3:200\n*S KotlinDebug\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7\n*L\n190#1:199\n190#1:201\n190#1:200\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $currency:Ljava/lang/String;

.field final synthetic $etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

.field final synthetic $isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

.field final synthetic $precision:I

.field final synthetic $totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/math/BigDecimal;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tvApprox:Landroid/widget/TextView;

.field final synthetic $unit:Ljava/lang/String;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Landroid/content/Context;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/math/BigDecimal;",
            ">;",
            "Lcom/kubi/numeric/financial/widget/FinancialInputEditText;",
            "Lcom/kubi/resources/widget/button/KcPrimaryButton;",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "Landroid/widget/TextView;",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$currency:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$tvApprox:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$ctx:Landroid/content/Context;

    .line 15
    .line 16
    iput p8, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$precision:I

    .line 17
    .line 18
    iput-object p9, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$unit:Ljava/lang/String;

    .line 19
    const/4 p1, 0x2

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 23
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 11
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
    new-instance v0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$currency:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$tvApprox:Landroid/widget/TextView;

    .line 15
    .line 16
    iget-object v7, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$ctx:Landroid/content/Context;

    .line 17
    .line 18
    iget v8, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$precision:I

    .line 19
    .line 20
    iget-object v9, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$unit:Ljava/lang/String;

    .line 21
    move-object v10, p2

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v0 .. v10}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Landroid/content/Context;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 25
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v3, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v6

    .line 7
    .line 8
    iget v0, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->label:I

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    throw v0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    sget-object v0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;->a:Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;->f(Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;)Lcom/kubi/assets/h0;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iget-object v2, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$currency:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v2}, Lcom/kubi/assets/h0;->Q(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    new-instance v2, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;

    .line 53
    .line 54
    iget-object v8, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 55
    .line 56
    iget-object v9, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 57
    .line 58
    iget-object v10, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 59
    .line 60
    iget-object v11, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 61
    .line 62
    iget-object v12, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$tvApprox:Landroid/widget/TextView;

    .line 63
    .line 64
    iget-object v13, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$ctx:Landroid/content/Context;

    .line 65
    .line 66
    iget v14, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$precision:I

    .line 67
    .line 68
    iget-object v15, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$unit:Ljava/lang/String;

    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    move-object v7, v2

    .line 72
    .line 73
    .line 74
    invoke-direct/range {v7 .. v16}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Landroid/content/Context;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 75
    .line 76
    iput v1, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->label:I

    .line 77
    const/4 v1, 0x0

    .line 78
    const/4 v4, 0x1

    .line 79
    const/4 v5, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static/range {v0 .. v5}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    if-ne v0, v6, :cond_2

    .line 86
    return-object v6

    .line 87
    .line 88
    :cond_2
    :goto_0
    check-cast v0, Lcom/kubi/network/retrofit/utils/f;

    .line 89
    .line 90
    iget-object v8, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 91
    .line 92
    iget-object v4, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 93
    .line 94
    iget-object v5, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 95
    .line 96
    iget-object v6, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 97
    .line 98
    iget-object v7, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$tvApprox:Landroid/widget/TextView;

    .line 99
    .line 100
    iget-object v9, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$ctx:Landroid/content/Context;

    .line 101
    .line 102
    iget v10, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$precision:I

    .line 103
    .line 104
    iget-object v11, v3, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->$unit:Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    const-string v1, "EditTradeAvgCostSheet"

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v0}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    const/4 v0, 0x0

    .line 117
    .line 118
    iput-object v0, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-static/range {v4 .. v11}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;->e(Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/Context;ILjava/lang/String;)V

    .line 122
    .line 123
    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 124
    return-object v0
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
.end method
