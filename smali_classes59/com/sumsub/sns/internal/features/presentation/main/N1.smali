.class public final Lcom/sumsub/sns/internal/features/presentation/main/N1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:I

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/sumsub/sns/internal/features/presentation/main/a2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->f:Lcom/sumsub/sns/internal/features/presentation/main/a2;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/N1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->f:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/N1;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->f:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/N1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->d:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->c:I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->a:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    move-object v8, v1

    .line 28
    move-object v5, v2

    .line 29
    goto :goto_2

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->c:I

    .line 40
    .line 41
    iget v5, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->b:I

    .line 42
    .line 43
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->f:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 59
    .line 60
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

    .line 61
    .line 62
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->b:I

    .line 63
    .line 64
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->c:I

    .line 65
    .line 66
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->d:I

    .line 67
    .line 68
    .line 69
    const-string/jumbo v5, "sns_general_progress_text"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v5, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    if-ne v1, v0, :cond_3

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v6, p1

    .line 78
    move-object p1, v1

    .line 79
    move v1, v3

    .line 80
    move v5, v1

    .line 81
    .line 82
    :goto_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 83
    .line 84
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->f:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 85
    .line 86
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->e:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->a:Ljava/lang/CharSequence;

    .line 89
    .line 90
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->b:I

    .line 91
    .line 92
    iput v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->c:I

    .line 93
    .line 94
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/N1;->d:I

    .line 95
    .line 96
    .line 97
    const-string/jumbo v2, "sns_general_loadingTakesTooLong"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v2, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    if-ne v2, v0, :cond_4

    .line 104
    :goto_1
    return-object v0

    .line 105
    :cond_4
    move-object v8, p1

    .line 106
    move v0, v1

    .line 107
    move-object p1, v2

    .line 108
    move-object v5, v6

    .line 109
    .line 110
    :goto_2
    if-eqz v0, :cond_5

    .line 111
    move v7, v4

    .line 112
    goto :goto_3

    .line 113
    :cond_5
    move v7, v3

    .line 114
    :goto_3
    move-object v9, p1

    .line 115
    .line 116
    check-cast v9, Ljava/lang/CharSequence;

    .line 117
    const/4 v10, 0x7

    .line 118
    const/4 v6, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/main/f2;->a(Lcom/sumsub/sns/internal/features/presentation/main/f2;Ljava/lang/Boolean;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;I)Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 122
    move-result-object p1

    .line 123
    return-object p1
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
