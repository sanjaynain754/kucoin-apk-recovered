.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:J

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->d:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->d:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

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
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->d:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->b:I

    .line 7
    .line 8
    const-wide/16 v2, 0x1

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
    goto :goto_0

    .line 21
    .line 22
    :cond_0
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
    :cond_1
    iget-wide v6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->a:J

    .line 31
    .line 32
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    goto :goto_2

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-wide v6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->a:J

    .line 41
    .line 42
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 56
    .line 57
    const-wide/16 v7, 0x0

    .line 58
    .line 59
    .line 60
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iput-wide v7, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->a:J

    .line 66
    .line 67
    iput v6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->b:I

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    if-ne v1, v0, :cond_4

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object v1, p1

    .line 76
    move-wide v6, v7

    .line 77
    .line 78
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->d:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;

    .line 79
    .line 80
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->d:Z

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 88
    move-result-wide v8

    .line 89
    .line 90
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 91
    .line 92
    iput-wide v6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->a:J

    .line 93
    .line 94
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->b:I

    .line 95
    .line 96
    .line 97
    invoke-static {v8, v9, p0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    if-ne p1, v0, :cond_6

    .line 101
    goto :goto_3

    .line 102
    .line 103
    :cond_6
    :goto_2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 107
    move-result-wide v8

    .line 108
    add-long/2addr v6, v8

    .line 109
    .line 110
    .line 111
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->c:Ljava/lang/Object;

    .line 115
    .line 116
    iput-wide v6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->a:J

    .line 117
    .line 118
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;->b:I

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, p1, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    if-ne p1, v0, :cond_5

    .line 125
    :goto_3
    return-object v0

    .line 126
    .line 127
    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 128
    return-object p1
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
