.class public final Lcom/sumsub/sns/internal/features/presentation/verification/b;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(JLkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->e:J

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/b;

    .line 3
    .line 4
    iget-wide v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->e:J

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/b;-><init>(JLkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/b;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->e:J

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/b;-><init>(JLkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->c:I

    .line 7
    .line 8
    const-wide/16 v2, 0x3e8

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v6, :cond_2

    .line 16
    .line 17
    if-eq v1, v5, :cond_1

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    move-object p1, v1

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1

    .line 38
    .line 39
    :cond_1
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->a:I

    .line 40
    .line 41
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, Lkotlinx/coroutines/flow/f;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    move-object p1, v7

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    iget-wide v7, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->b:J

    .line 51
    .line 52
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->a:I

    .line 53
    .line 54
    iget-object v9, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v9, Lkotlinx/coroutines/flow/f;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    move-object p1, v9

    .line 61
    goto :goto_1

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 69
    const/4 v1, 0x0

    .line 70
    .line 71
    :cond_4
    :goto_0
    if-nez v1, :cond_8

    .line 72
    .line 73
    iget-wide v7, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->e:J

    .line 74
    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    move-result-wide v9

    .line 78
    sub-long/2addr v7, v9

    .line 79
    .line 80
    const-wide/16 v9, 0x0

    .line 81
    .line 82
    cmp-long v9, v7, v9

    .line 83
    .line 84
    if-lez v9, :cond_6

    .line 85
    long-to-float v9, v7

    .line 86
    long-to-float v10, v2

    .line 87
    div-float/2addr v9, v10

    .line 88
    float-to-double v9, v9

    .line 89
    .line 90
    .line 91
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 92
    move-result-wide v9

    .line 93
    double-to-float v9, v9

    .line 94
    float-to-long v9, v9

    .line 95
    .line 96
    .line 97
    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 98
    move-result-object v9

    .line 99
    .line 100
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 101
    .line 102
    iput v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->a:I

    .line 103
    .line 104
    iput-wide v7, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->b:J

    .line 105
    .line 106
    iput v6, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->c:I

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, v9, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    move-result-object v9

    .line 111
    .line 112
    if-ne v9, v0, :cond_5

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    :goto_1
    rem-long/2addr v7, v2

    .line 115
    .line 116
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 117
    .line 118
    iput v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->a:I

    .line 119
    .line 120
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->c:I

    .line 121
    .line 122
    .line 123
    invoke-static {v7, v8, p0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 124
    move-result-object v7

    .line 125
    .line 126
    if-ne v7, v0, :cond_4

    .line 127
    goto :goto_2

    .line 128
    .line 129
    :cond_6
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->d:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/verification/b;->c:I

    .line 132
    const/4 v1, 0x0

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    if-ne v1, v0, :cond_7

    .line 139
    :goto_2
    return-object v0

    .line 140
    :cond_7
    :goto_3
    move v1, v6

    .line 141
    goto :goto_0

    .line 142
    .line 143
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 144
    return-object p1
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
.end method
