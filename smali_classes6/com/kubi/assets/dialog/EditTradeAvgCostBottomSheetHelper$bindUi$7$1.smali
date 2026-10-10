.class final Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "EditTradeAvgCostBottomSheetHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/kubi/assets/entity/UserAssetCostDetailEntity;",
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
        "detail",
        "Lcom/kubi/assets/entity/UserAssetCostDetailEntity;"
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
    c = "com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$7$1"
    f = "EditTradeAvgCostBottomSheetHelper.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

.field final synthetic $ctx:Landroid/content/Context;

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

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Landroid/content/Context;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$tvApprox:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$ctx:Landroid/content/Context;

    .line 13
    .line 14
    iput p7, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$precision:I

    .line 15
    .line 16
    iput-object p8, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$unit:Ljava/lang/String;

    .line 17
    const/4 p1, 0x2

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 21
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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
    new-instance v0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$tvApprox:Landroid/widget/TextView;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$ctx:Landroid/content/Context;

    .line 15
    .line 16
    iget v7, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$precision:I

    .line 17
    .line 18
    iget-object v8, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$unit:Ljava/lang/String;

    .line 19
    move-object v9, p2

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v9}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Landroid/content/Context;ILjava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    iput-object p1, v0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->L$0:Ljava/lang/Object;

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

.method public final invoke(Lcom/kubi/assets/entity/UserAssetCostDetailEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/UserAssetCostDetailEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/kubi/assets/entity/UserAssetCostDetailEntity;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->invoke(Lcom/kubi/assets/entity/UserAssetCostDetailEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->L$0:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/kubi/assets/entity/UserAssetCostDetailEntity;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    iget v1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->label:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    iget-object p1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/assets/entity/UserAssetCostDetailEntity;->getTotalAmount()Ljava/math/BigDecimal;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$etInput:Lcom/kubi/numeric/financial/widget/FinancialInputEditText;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$btnModify:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$isAvgMode:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$tvApprox:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v5, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$totalBalance:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 33
    .line 34
    iget-object v6, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$ctx:Landroid/content/Context;

    .line 35
    .line 36
    iget v7, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$precision:I

    .line 37
    .line 38
    iget-object v8, p0, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7$1;->$unit:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v8}, Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;->e(Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Lcom/kubi/resources/widget/button/KcPrimaryButton;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/widget/TextView;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/Context;ILjava/lang/String;)V

    .line 42
    .line 43
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object p1

    .line 45
    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p1
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
.end method
