.class final Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AssetV2IsolatedHeaderView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
    c = "com.kubi.assets.margin.isolated.AssetV2IsolatedHeaderView$initListener$5$1"
    f = "AssetV2IsolatedHeaderView.kt"
    i = {}
    l = {
        0xb8
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 5
    return-void
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


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 6
    return-object v0
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v2, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;->label:I

    .line 9
    const/4 v3, 0x1

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    move-object/from16 v2, p1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    throw v1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    sget-object v2, Lcom/kubi/transfer/api/ITransferService;->a:Lcom/kubi/transfer/api/ITransferService$Companion;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/kubi/transfer/api/ITransferService$Companion;->get()Lcom/kubi/transfer/api/ITransferService;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-interface {v2}, Lcom/kubi/transfer/api/ITransferService;->a()Lkotlinx/coroutines/flow/e;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    iput v3, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedHeaderView$initListener$5$1;->label:I

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->k(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    if-ne v2, v1, :cond_2

    .line 49
    return-object v1

    .line 50
    .line 51
    :cond_2
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 52
    .line 53
    if-eqz v2, :cond_6

    .line 54
    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    move-result v1

    .line 58
    const/4 v3, 0x0

    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    const/4 v1, 0x0

    .line 62
    .line 63
    .line 64
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    check-cast v1, Lcom/kubi/transfer/entity/SearchSymbolEntity;

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move-object v1, v3

    .line 70
    .line 71
    :goto_1
    if-eqz v1, :cond_5

    .line 72
    .line 73
    sget-object v4, Lcom/kubi/data/coin/TransferJumper;->a:Lcom/kubi/data/coin/TransferJumper$Companion;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/kubi/transfer/entity/SearchSymbolEntity;->getQuote()Lcom/kubi/transfer/entity/Quote;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lcom/kubi/transfer/entity/Quote;->getCurrency()Ljava/lang/String;

    .line 83
    move-result-object v3

    .line 84
    :cond_4
    move-object v5, v3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/kubi/transfer/entity/SearchSymbolEntity;->getSymbol()Ljava/lang/String;

    .line 88
    move-result-object v7

    .line 89
    .line 90
    const-string v1, "transfer"

    .line 91
    .line 92
    const-string v2, "1"

    .line 93
    .line 94
    const-string v3, "B4isolatedMarginAssetsDetails"

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v1, v2}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    move-result-object v11

    .line 99
    .line 100
    const/16 v12, 0x22

    .line 101
    const/4 v13, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    .line 104
    const-string v8, "TRADE"

    .line 105
    .line 106
    const-string v9, "ISOLATED"

    .line 107
    const/4 v10, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v4 .. v13}, Lcom/kubi/data/coin/TransferJumper$Companion;->jumpToTransfer$default(Lcom/kubi/data/coin/TransferJumper$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 111
    goto :goto_2

    .line 112
    .line 113
    :cond_5
    sget-object v14, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 114
    .line 115
    const/16 v18, 0x7

    .line 116
    .line 117
    const/16 v19, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    .line 125
    invoke-static/range {v14 .. v19}, Lcom/kubi/assets/service/AssetsHelper;->N(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 126
    .line 127
    :cond_6
    :goto_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 128
    return-object v1
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
