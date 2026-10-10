.class public final Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->b:Ljava/lang/Object;

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
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->a:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lkotlinx/coroutines/m0;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    :cond_0
    move-object v3, v1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 36
    move-object v1, p1

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {v1}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 45
    .line 46
    sget-object p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->f:Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;->a()Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    iget-wide v3, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->a:J

    .line 53
    .line 54
    const-wide/16 v5, 0x1

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4, v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 58
    move-result-wide v3

    .line 59
    .line 60
    const-wide/16 v5, 0x3e8

    .line 61
    mul-long/2addr v3, v5

    .line 62
    .line 63
    sget-object p1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v4, p1}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    .line 67
    move-result-wide v3

    .line 68
    .line 69
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->b:Ljava/lang/Object;

    .line 70
    .line 71
    iput v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->a:I

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    if-ne p1, v0, :cond_0

    .line 78
    return-object v0

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-static {v3}, Lkotlinx/coroutines/n0;->g(Lkotlinx/coroutines/m0;)V

    .line 82
    .line 83
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 86
    .line 87
    const-string v1, "DataRepository"

    .line 88
    .line 89
    const-string v4, "Manually updating data"

    .line 90
    const/4 v5, 0x0

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v4, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    new-instance v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/D;

    .line 96
    .line 97
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 98
    .line 99
    .line 100
    invoke-direct {v6, p1, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/D;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 101
    const/4 v7, 0x3

    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    .line 105
    .line 106
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 107
    move-object v1, v3

    .line 108
    goto :goto_0

    .line 109
    .line 110
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    return-object p1
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
