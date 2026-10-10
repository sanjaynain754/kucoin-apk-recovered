.class public final Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lkotlinx/coroutines/flow/n;

.field public b:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->e:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

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
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->e:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->e:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->d:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->b:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

    .line 16
    .line 17
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->a:Lkotlinx/coroutines/flow/n;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    throw p1

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->e:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

    .line 35
    .line 36
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;->e:Lkotlinx/coroutines/flow/n;

    .line 37
    move-object v3, p1

    .line 38
    move-object v4, v1

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v1

    .line 43
    move-object p1, v1

    .line 44
    .line 45
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/k;

    .line 46
    .line 47
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->a:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->b:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

    .line 50
    .line 51
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->d:I

    .line 54
    .line 55
    .line 56
    const-string/jumbo p1, "sns_exit_survey_thanks"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p1, p0}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    return-object v0

    .line 64
    .line 65
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;->g:[Lkotlin/reflect/KProperty;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;->e()Ljava/util/Set;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/j;

    .line 74
    .line 75
    .line 76
    invoke-direct {v6, p1, v5}, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/j;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v4, v1, v6}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    move-result p1

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/p;->e:Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;

    .line 85
    .line 86
    new-instance v6, Lcom/sumsub/sns/internal/core/common/v;

    .line 87
    .line 88
    .line 89
    invoke-direct {v6}, Lcom/sumsub/sns/internal/core/common/v;-><init>()V

    .line 90
    .line 91
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 92
    .line 93
    const-wide/16 v0, 0x2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 97
    move-result-wide v0

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 101
    move-result-object v8

    .line 102
    .line 103
    const/16 v10, 0xa

    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v7, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v5 .. v11}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 110
    .line 111
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 112
    return-object p1
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
