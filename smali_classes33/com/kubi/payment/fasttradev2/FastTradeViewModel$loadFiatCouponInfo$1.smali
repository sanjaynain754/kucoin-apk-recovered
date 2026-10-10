.class final Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FastTradeViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fasttradev2/FastTradeViewModel;->I0()V
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
    c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadFiatCouponInfo$1"
    f = "FastTradeViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2
    }
    l = {
        0x2ef,
        0x2c7,
        0x2cd
    }
    m = "invokeSuspend"
    n = {
        "expireTimeObj",
        "this_$iv",
        "json$iv",
        "$i$f$fromJsonOrNull",
        "expireTimeObj",
        "pair",
        "frequency",
        "lastShowTime",
        "expireTimeObj"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "L$0",
        "L$1",
        "F$0",
        "J$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,748:1\n196#2,3:749\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1\n*L\n705#1:749,3\n*E\n"
    }
.end annotation


# instance fields
.field F$0:F

.field I$0:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/payment/fasttradev2/FastTradeViewModel;


# direct methods
.method public constructor <init>(Lcom/kubi/payment/fasttradev2/FastTradeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->this$0:Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

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
    new-instance p1, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->this$0:Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;-><init>(Lcom/kubi/payment/fasttradev2/FastTradeViewModel;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->label:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v4, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p1

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lkotlin/Pair;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_2
    iget-object v1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lcom/kubi/utils/x;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    sget-object p1, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/payment/util/i;->c()Ly70/g;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    const-string v1, ""

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 83
    move-result p1

    .line 84
    .line 85
    if-lez p1, :cond_6

    .line 86
    .line 87
    sget-object p1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 88
    .line 89
    new-instance v6, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1$invokeSuspend$$inlined$fromJsonOrNull$1;

    .line 90
    .line 91
    .line 92
    invoke-direct {v6, v1, v5}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1$invokeSuspend$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 96
    move-result-object v6

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 100
    move-result-object v7

    .line 101
    .line 102
    .line 103
    invoke-static {v6, v7}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 104
    move-result-object v6

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    move-result-object v7

    .line 109
    .line 110
    iput-object v7, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$0:Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$2:Ljava/lang/Object;

    .line 123
    const/4 p1, 0x0

    .line 124
    .line 125
    iput p1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->I$0:I

    .line 126
    .line 127
    iput v4, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->label:I

    .line 128
    .line 129
    .line 130
    invoke-static {v6, p0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    if-ne p1, v0, :cond_4

    .line 134
    goto :goto_2

    .line 135
    .line 136
    :cond_4
    :goto_0
    check-cast p1, Lkotlin/Pair;

    .line 137
    .line 138
    if-eqz p1, :cond_6

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    check-cast v2, Ljava/lang/Number;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 148
    move-result v2

    .line 149
    .line 150
    .line 151
    const v4, 0x36ee80

    .line 152
    int-to-float v4, v4

    .line 153
    mul-float/2addr v2, v4

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    check-cast v4, Ljava/lang/Number;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 163
    move-result-wide v6

    .line 164
    .line 165
    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 167
    move-result-wide v8

    .line 168
    sub-long/2addr v8, v6

    .line 169
    long-to-float v4, v8

    .line 170
    .line 171
    cmpl-float v4, v4, v2

    .line 172
    .line 173
    if-lez v4, :cond_5

    .line 174
    .line 175
    iget-object v4, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->this$0:Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

    .line 176
    .line 177
    .line 178
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    iput-object v1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$1:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v5, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$2:Ljava/lang/Object;

    .line 190
    .line 191
    iput v2, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->F$0:F

    .line 192
    .line 193
    iput-wide v6, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->J$0:J

    .line 194
    .line 195
    iput v3, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->label:I

    .line 196
    .line 197
    .line 198
    invoke-static {v4, p0}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel;->S(Lcom/kubi/payment/fasttradev2/FastTradeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    if-ne p1, v0, :cond_5

    .line 202
    goto :goto_2

    .line 203
    .line 204
    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 205
    return-object p1

    .line 206
    .line 207
    :cond_6
    iget-object p1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->this$0:Lcom/kubi/payment/fasttradev2/FastTradeViewModel;

    .line 208
    .line 209
    .line 210
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    move-result-object v1

    .line 212
    .line 213
    iput-object v1, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v5, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v5, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->L$2:Ljava/lang/Object;

    .line 218
    .line 219
    iput v2, p0, Lcom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1;->label:I

    .line 220
    .line 221
    .line 222
    invoke-static {p1, p0}, Lcom/kubi/payment/fasttradev2/FastTradeViewModel;->S(Lcom/kubi/payment/fasttradev2/FastTradeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 223
    move-result-object p1

    .line 224
    .line 225
    if-ne p1, v0, :cond_7

    .line 226
    :goto_2
    return-object v0

    .line 227
    .line 228
    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    return-object p1
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
