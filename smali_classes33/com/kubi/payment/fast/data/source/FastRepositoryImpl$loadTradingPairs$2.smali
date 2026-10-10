.class final Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FastRepositoryImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;->o0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lnt/k<",
        "+",
        "Lcom/kubi/otc/entity/FastSymbol;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/kubi/payment/base/Result;",
        "Lcom/kubi/otc/entity/FastSymbol;",
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
    c = "com.kubi.payment.fast.data.source.FastRepositoryImpl$loadTradingPairs$2"
    f = "FastRepositoryImpl.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x34,
        0x110
    }
    m = "invokeSuspend"
    n = {
        "remoteResult",
        "cache",
        "this_$iv",
        "json$iv",
        "$i$f$fromJsonOrNull"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFastRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastRepositoryImpl.kt\ncom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,269:1\n196#2,3:270\n*S KotlinDebug\n*F\n+ 1 FastRepositoryImpl.kt\ncom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2\n*L\n65#1:270,3\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;


# direct methods
.method public constructor <init>(Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->this$0:Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;

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
    new-instance p1, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->this$0:Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;-><init>(Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lnt/k<",
            "Lcom/kubi/otc/entity/FastSymbol;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$3:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$2:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lcom/kubi/utils/x;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$1:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lnt/k;

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    throw p1

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->this$0:Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;->D0(Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;)Lkotlinx/coroutines/j0;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    new-instance v1, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2$remoteResult$1;

    .line 60
    .line 61
    iget-object v5, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->this$0:Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v5, v3}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2$remoteResult$1;-><init>(Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    .line 65
    .line 66
    iput v2, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->label:I

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v1, p0}, Lcom/kubi/payment/util/RepositoryExtKt;->a(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    if-ne p1, v0, :cond_3

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_3
    :goto_0
    check-cast p1, Lnt/k;

    .line 76
    .line 77
    instance-of v1, p1, Lnt/k$b;

    .line 78
    const/4 v2, 0x0

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    sget-object v0, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/kubi/payment/util/i;->l()Ly70/g;

    .line 86
    move-result-object v0

    .line 87
    move-object v1, p1

    .line 88
    .line 89
    check-cast v1, Lnt/k$b;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2, v4, v3}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 101
    return-object p1

    .line 102
    .line 103
    :cond_4
    sget-object v1, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/kubi/payment/util/i;->l()Ly70/g;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    const-string v5, ""

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v5}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 117
    move-result v5

    .line 118
    .line 119
    if-lez v5, :cond_7

    .line 120
    .line 121
    sget-object v5, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 122
    .line 123
    new-instance v6, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2$invokeSuspend$$inlined$fromJsonOrNull$1;

    .line 124
    .line 125
    .line 126
    invoke-direct {v6, v1, v3}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2$invokeSuspend$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 134
    move-result-object v6

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v6}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    iput-object p1, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    move-result-object v6

    .line 145
    .line 146
    iput-object v6, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$1:Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    iput-object v5, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$2:Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    iput-object v1, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->L$3:Ljava/lang/Object;

    .line 159
    .line 160
    iput v2, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->I$0:I

    .line 161
    .line 162
    iput v4, p0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2;->label:I

    .line 163
    .line 164
    .line 165
    invoke-static {v3, p0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    if-ne v1, v0, :cond_5

    .line 169
    :goto_1
    return-object v0

    .line 170
    :cond_5
    move-object v0, p1

    .line 171
    move-object p1, v1

    .line 172
    .line 173
    :goto_2
    check-cast p1, Lcom/kubi/otc/entity/FastSymbol;

    .line 174
    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    new-instance v0, Lnt/k$b;

    .line 178
    .line 179
    .line 180
    invoke-direct {v0, p1}, Lnt/k$b;-><init>(Ljava/lang/Object;)V

    .line 181
    :cond_6
    return-object v0

    .line 182
    :cond_7
    return-object p1
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
.end method
