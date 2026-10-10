.class public final Lcom/sumsub/sns/internal/features/presentation/camera/video/v;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

.field public b:I

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->b:I

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_1

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
    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p1, ".mp4"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    const-string v3, "File name is "

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    :try_start_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 75
    .line 76
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->a:Lcom/sumsub/sns/internal/features/domain/o;

    .line 77
    .line 78
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 79
    .line 80
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->b:I

    .line 81
    .line 82
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/domain/o;->a:Lcom/sumsub/sns/internal/features/data/repository/cache/b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    new-instance v4, Lcom/sumsub/sns/internal/features/data/repository/cache/a;

    .line 92
    const/4 v5, 0x0

    .line 93
    .line 94
    .line 95
    invoke-direct {v4, v2, p1, v5}, Lcom/sumsub/sns/internal/features/data/repository/cache/a;-><init>(Lcom/sumsub/sns/internal/features/data/repository/cache/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    if-ne p1, v0, :cond_2

    .line 102
    return-object v0

    .line 103
    :cond_2
    move-object v0, v1

    .line 104
    .line 105
    :goto_0
    check-cast p1, Ljava/io/File;

    .line 106
    .line 107
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->g:Ljava/io/File;

    .line 108
    .line 109
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 110
    .line 111
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/k;

    .line 112
    .line 113
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->g:Ljava/io/File;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/video/k;-><init>(Ljava/io/File;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    goto :goto_2

    .line 121
    .line 122
    :goto_1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 123
    .line 124
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 125
    .line 126
    const-string v1, "SumSubVideoSelfie"

    .line 127
    .line 128
    const-string v2, "An error while creating new video selfie file..."

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;->c:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 134
    .line 135
    const/16 v8, 0xf

    .line 136
    const/4 v9, 0x0

    .line 137
    const/4 v4, 0x0

    .line 138
    const/4 v5, 0x0

    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v7, 0x0

    .line 141
    .line 142
    .line 143
    invoke-static/range {v3 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 144
    .line 145
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 146
    return-object p1
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
