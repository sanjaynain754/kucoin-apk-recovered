.class public final Lcom/sumsub/sns/internal/features/domain/J;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/sumsub/sns/internal/features/domain/L;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/L;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/J;->b:Lcom/sumsub/sns/internal/features/domain/L;

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

.method public static final a(Lcom/sumsub/sns/internal/features/domain/L;)Z
    .locals 5

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/domain/L;->c:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 3
    .line 4
    check-cast p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->f:Lcom/sumsub/sns/internal/util/root/a;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/util/root/a;->a:Lkotlin/Lazy;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/sumsub/sns/internal/util/root/b;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/util/root/b;->b()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->g:Lcom/sumsub/sentry/android/g;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/sumsub/sentry/android/g;->f:Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/sumsub/sentry/android/i;

    .line 29
    .line 30
    iget-boolean v2, v1, Lcom/sumsub/sentry/android/i;->a:Z

    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    iget-boolean v2, v1, Lcom/sumsub/sentry/android/i;->b:Z

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    iget-boolean v2, v1, Lcom/sumsub/sentry/android/i;->c:Z

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    iget-boolean v1, v1, Lcom/sumsub/sentry/android/i;->d:Z

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->e:Lcom/sumsub/sentry/android/a;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/sumsub/sentry/android/a;->a()Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v1, v4

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    move v1, v3

    .line 60
    .line 61
    :goto_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->h:Lcom/sumsub/sns/internal/util/root/c;

    .line 62
    .line 63
    iget-object p0, p0, Lcom/sumsub/sns/internal/util/root/c;->a:Lkotlin/Lazy;

    .line 64
    .line 65
    .line 66
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 67
    move-result-object p0

    .line 68
    .line 69
    check-cast p0, Lcom/sumsub/sns/internal/util/root/d;

    .line 70
    .line 71
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/util/root/d;->a:Z

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    iget-boolean p0, p0, Lcom/sumsub/sns/internal/util/root/d;->b:Z

    .line 76
    .line 77
    if-eqz p0, :cond_3

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move p0, v4

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_2
    move p0, v3

    .line 82
    .line 83
    :goto_3
    if-nez v0, :cond_6

    .line 84
    .line 85
    if-nez v1, :cond_6

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    goto :goto_4

    .line 89
    :cond_5
    return v4

    .line 90
    :cond_6
    :goto_4
    return v3
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


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/J;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/J;->b:Lcom/sumsub/sns/internal/features/domain/L;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/domain/J;-><init>(Lcom/sumsub/sns/internal/features/domain/L;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/J;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/J;->b:Lcom/sumsub/sns/internal/features/domain/L;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/domain/J;-><init>(Lcom/sumsub/sns/internal/features/domain/L;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/domain/J;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/domain/J;->a:I

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
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/domain/J;->b:Lcom/sumsub/sns/internal/features/domain/L;

    .line 29
    .line 30
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/domain/L;->f:Lkotlinx/coroutines/j0;

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/x0;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/domain/x0;-><init>(Lcom/sumsub/sns/internal/features/domain/L;)V

    .line 36
    .line 37
    iput v2, p0, Lcom/sumsub/sns/internal/features/domain/J;->a:I

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/InterruptibleKt;->b(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    return-object v0

    .line 45
    :cond_2
    return-object p1
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
.end method
