.class public final Lcom/sumsub/sns/internal/features/presentation/preview/f;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/data/model/common/p;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/preview/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/h;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/f;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/h;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/f;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/h;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->b:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p1

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lkotlinx/coroutines/m0;

    .line 41
    .line 42
    .line 43
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    check-cast p1, Lkotlin/Result;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 49
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    goto :goto_2

    .line 51
    .line 52
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lkotlinx/coroutines/m0;

    .line 55
    .line 56
    .line 57
    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    goto :goto_0

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 66
    .line 67
    :try_start_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v5}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 71
    .line 72
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v4}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->c(Z)V

    .line 76
    .line 77
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 78
    .line 79
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/h;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 80
    .line 81
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 82
    .line 83
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->b:I

    .line 84
    .line 85
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v4, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    if-ne v1, v0, :cond_4

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    :cond_4
    move-object v7, v1

    .line 95
    move-object v1, p1

    .line 96
    move-object p1, v7

    .line 97
    .line 98
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->d()Ljava/lang/Object;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 105
    .line 106
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 107
    .line 108
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 112
    move-result-object v6

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v6}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 116
    move-result-object v6

    .line 117
    .line 118
    if-eqz v6, :cond_5

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/m;->c()Z

    .line 122
    move-result v6

    .line 123
    .line 124
    if-ne v6, v5, :cond_5

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move v5, v4

    .line 127
    .line 128
    :goto_1
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 129
    .line 130
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/presentation/preview/h;->d:Lcom/sumsub/sns/internal/features/domain/e;

    .line 131
    .line 132
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 135
    .line 136
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->b:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v5, p0}, Lcom/sumsub/sns/internal/features/domain/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    if-ne v3, v0, :cond_6

    .line 143
    goto :goto_4

    .line 144
    :cond_6
    move-object v7, v1

    .line 145
    move-object v1, p1

    .line 146
    move-object p1, v3

    .line 147
    move-object v3, v7

    .line 148
    .line 149
    .line 150
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 151
    move-result v5

    .line 152
    .line 153
    if-nez v5, :cond_9

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 157
    move-result v5

    .line 158
    const/4 v6, 0x0

    .line 159
    .line 160
    if-eqz v5, :cond_7

    .line 161
    move-object v5, v6

    .line 162
    goto :goto_3

    .line 163
    :cond_7
    move-object v5, p1

    .line 164
    .line 165
    :goto_3
    if-nez v5, :cond_8

    .line 166
    goto :goto_5

    .line 167
    .line 168
    :cond_8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 169
    .line 170
    .line 171
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 172
    .line 173
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/n;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/domain/n;)V

    .line 177
    .line 178
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 182
    .line 183
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->c:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 192
    .line 193
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->b:I

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v1, v3, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    if-ne p1, v0, :cond_b

    .line 200
    :goto_4
    return-object v0

    .line 201
    .line 202
    .line 203
    :cond_9
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 204
    move-result-object p1

    .line 205
    .line 206
    check-cast p1, Ljava/lang/Exception;

    .line 207
    .line 208
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 209
    .line 210
    .line 211
    invoke-static {v3}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    move-result-object v0

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 216
    move-result-object v1

    .line 217
    .line 218
    if-nez v1, :cond_a

    .line 219
    .line 220
    const-string v1, ""

    .line 221
    .line 222
    :cond_a
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0, v1, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 226
    .line 227
    new-instance v0, Ljava/lang/Exception;

    .line 228
    .line 229
    .line 230
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 231
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 232
    .line 233
    :goto_6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/f;->d:Lcom/sumsub/sns/internal/features/presentation/preview/h;

    .line 234
    .line 235
    .line 236
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/presentation/preview/h;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    :cond_b
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 239
    return-object p1
.end method
