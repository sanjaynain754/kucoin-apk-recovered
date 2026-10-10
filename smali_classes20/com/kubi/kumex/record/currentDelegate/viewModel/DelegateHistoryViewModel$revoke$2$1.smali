.class final Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DelegateHistViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$revoke$2$1"
    f = "DelegateHistViewModel.kt"
    i = {}
    l = {
        0x18c,
        0x18d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $assetType:Ljava/lang/String;

.field final synthetic $curLastPage:J

.field final synthetic $lastPageOrdersFetcher:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

.field final synthetic $symbol:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;


# direct methods
.method public constructor <init>(Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;Lcom/kubi/kumex/data/trade/model/OrderEntity;Lkotlin/jvm/functions/Function4;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/PageEntity<",
            "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$lastPageOrdersFetcher:Lkotlin/jvm/functions/Function4;

    .line 7
    .line 8
    iput-wide p4, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$curLastPage:J

    .line 9
    .line 10
    iput-object p6, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$assetType:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p7, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$symbol:Ljava/lang/String;

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 17
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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
    new-instance v0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$lastPageOrdersFetcher:Lkotlin/jvm/functions/Function4;

    .line 9
    .line 10
    iget-wide v4, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$curLastPage:J

    .line 11
    .line 12
    iget-object v6, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$assetType:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v7, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$symbol:Ljava/lang/String;

    .line 15
    move-object v8, p1

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;-><init>(Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;Lcom/kubi/kumex/data/trade/model/OrderEntity;Lkotlin/jvm/functions/Function4;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    .line 2
    const-string v1, "futures_order_revoke"

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v2, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->label:I

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_2

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    throw p1

    .line 31
    .line 32
    .line 33
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;->C(Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    :try_start_2
    sget-object p1, Lcom/kubi/broker/m;->a:Lcom/kubi/broker/m;

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v6, v5, v6}, Lcom/kubi/broker/m;->s(Lcom/kubi/broker/m;Lcom/kubi/broker/MultiBizType;ILjava/lang/Object;)Lrg/i;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    iget-object v2, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSymbol()Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    iget-object v7, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getId()Ljava/lang/String;

    .line 68
    move-result-object v7

    .line 69
    .line 70
    .line 71
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object v7

    .line 73
    .line 74
    iget-object v8, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->isTrialFunds()Z

    .line 78
    move-result v8

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, v8, v2, v7}, Lrg/d;->i1(ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    sget-object p1, Lui/e;->a:Lui/e;

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v1, v6, v4, v6}, Lui/e;->c(Lui/e;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    .line 88
    :try_start_3
    iput v5, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->label:I

    .line 89
    .line 90
    const-wide/16 v1, 0xc8

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    if-ne p1, v0, :cond_3

    .line 97
    goto :goto_1

    .line 98
    .line 99
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$lastPageOrdersFetcher:Lkotlin/jvm/functions/Function4;

    .line 100
    .line 101
    iget-wide v1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$curLastPage:J

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    iget-object v2, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$assetType:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v5, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$symbol:Ljava/lang/String;

    .line 110
    .line 111
    iput v4, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->label:I

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, v1, v2, v5, p0}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    if-ne p1, v0, :cond_4

    .line 118
    :goto_1
    return-object v0

    .line 119
    .line 120
    :cond_4
    :goto_2
    check-cast p1, Lcom/kubi/sdk/PageEntity;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    goto :goto_3

    .line 122
    :catchall_0
    move-object p1, v6

    .line 123
    .line 124
    :goto_3
    iget-object v7, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;

    .line 125
    .line 126
    iget-wide v8, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$curLastPage:J

    .line 127
    .line 128
    iget-object v0, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$order:Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getId()Ljava/lang/String;

    .line 132
    move-result-object v10

    .line 133
    .line 134
    if-eqz p1, :cond_5

    .line 135
    .line 136
    iget-object v0, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;

    .line 137
    .line 138
    iget-wide v1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->$curLastPage:J

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, p1, v1, v2}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;->l0(Lcom/kubi/sdk/PageEntity;J)Ljava/util/List;

    .line 142
    move-result-object v0

    .line 143
    move-object v11, v0

    .line 144
    goto :goto_4

    .line 145
    :cond_5
    move-object v11, v6

    .line 146
    .line 147
    :goto_4
    if-eqz p1, :cond_6

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/kubi/sdk/PageEntity;->getHasNext()Z

    .line 151
    move-result p1

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 155
    move-result-object v6

    .line 156
    :cond_6
    move-object v12, v6

    .line 157
    .line 158
    .line 159
    invoke-static/range {v7 .. v12}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;->w(Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;JLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V

    .line 160
    .line 161
    iget-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel$revoke$2$1;->this$0:Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;->C(Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 165
    move-result-object p1

    .line 166
    .line 167
    .line 168
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 173
    .line 174
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 175
    return-object p1

    .line 176
    :catchall_1
    move-exception v0

    .line 177
    move-object p1, v0

    .line 178
    .line 179
    .line 180
    invoke-static {p1, v6, v4, v6}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 181
    .line 182
    sget-object v0, Lui/e;->a:Lui/e;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1, p1}, Lui/e;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    throw p1
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
.end method
