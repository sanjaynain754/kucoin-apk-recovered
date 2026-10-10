.class public final Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# static fields
.field public static final m:Lcom/sumsub/sns/internal/features/data/repository/dynamic/o;

.field public static final n:Ljava/util/List;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/b;

.field public final b:Lkotlinx/coroutines/m0;

.field public final c:Lkotlinx/coroutines/j0;

.field public final d:Lcom/sumsub/sns/internal/core/domain/k;

.field public final e:Lcom/sumsub/sns/internal/core/domain/g;

.field public f:Lkotlinx/coroutines/x1;

.field public g:Lkotlinx/coroutines/x1;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

.field public final k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

.field public final l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/o;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/o;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->m:Lcom/sumsub/sns/internal/features/data/repository/dynamic/o;

    .line 8
    .line 9
    const-string v11, "BEL"

    .line 10
    .line 11
    const-string v12, "BEN"

    .line 12
    .line 13
    const-string v1, "ARG"

    .line 14
    .line 15
    const-string v2, "BRA"

    .line 16
    .line 17
    const-string v3, "ARM"

    .line 18
    .line 19
    const-string v4, "ATA"

    .line 20
    .line 21
    const-string v5, "ATF"

    .line 22
    .line 23
    const-string v6, "ATG"

    .line 24
    .line 25
    const-string v7, "AUS"

    .line 26
    .line 27
    const-string v8, "AUT"

    .line 28
    .line 29
    const-string v9, "AZE"

    .line 30
    .line 31
    const-string v10, "BDI"

    .line 32
    .line 33
    .line 34
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->n:Ljava/util/List;

    .line 42
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/b;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/j0;Lcom/sumsub/sns/internal/core/domain/r;Lcom/sumsub/sns/internal/core/domain/g;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a:Lcom/sumsub/sns/internal/features/data/repository/common/b;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c:Lkotlinx/coroutines/j0;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->d:Lcom/sumsub/sns/internal/core/domain/k;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->e:Lcom/sumsub/sns/internal/core/domain/g;

    .line 14
    const/4 p1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 18
    move-result-object p4

    .line 19
    .line 20
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->h:Lkotlinx/coroutines/flow/n;

    .line 21
    .line 22
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->i:Lkotlinx/coroutines/flow/n;

    .line 23
    .line 24
    new-instance p4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 25
    .line 26
    new-instance p5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/p;

    .line 27
    .line 28
    .line 29
    invoke-direct {p5, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/p;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v0, " Applicant"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-direct {p4, p2, p3, p5, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;-><init>(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/j0;Lkotlin/jvm/functions/Function3;Ljava/lang/String;)V

    .line 54
    .line 55
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 56
    .line 57
    new-instance p4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 58
    .line 59
    new-instance p5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/q;

    .line 60
    .line 61
    .line 62
    invoke-direct {p5, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/q;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v0, " Config and FFs"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-direct {p4, p2, p3, p5, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;-><init>(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/j0;Lkotlin/jvm/functions/Function3;Ljava/lang/String;)V

    .line 87
    .line 88
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 89
    .line 90
    new-instance p4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 91
    .line 92
    new-instance p5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/F;

    .line 93
    .line 94
    .line 95
    invoke-direct {p5, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/F;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string p1, " Strings"

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-direct {p4, p2, p3, p5, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;-><init>(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/j0;Lkotlin/jvm/functions/Function3;Ljava/lang/String;)V

    .line 120
    .line 121
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 122
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlinx/coroutines/m0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->a:Lkotlinx/coroutines/m0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p1

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->g:Lkotlinx/coroutines/x1;

    if-eqz p2, :cond_1

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->a:Lkotlinx/coroutines/m0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/H;->d:I

    invoke-interface {p2, v0}, Lkotlinx/coroutines/x1;->E(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_1

    return-object v1

    .line 4
    :goto_1
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c:Lkotlinx/coroutines/j0;

    new-instance v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/I;

    const/4 p1, 0x0

    invoke-direct {v5, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/I;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->g:Lkotlinx/coroutines/x1;

    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/features/data/model/common/h;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 7
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 8
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 24
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->a:Ljava/lang/Object;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/G;->d:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 26
    :cond_3
    :goto_1
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 27
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c()V

    :cond_4
    return-object p3
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x1

    const/4 v1, 0x2

    instance-of v2, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;

    iget v3, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->c:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->c:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;

    invoke-direct {v2, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 10
    iget v4, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->c:I

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v0, :cond_3

    if-eq v4, v1, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->g:Lkotlinx/coroutines/x1;

    if-eqz p1, :cond_5

    iput v0, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->c:I

    invoke-interface {p1, v2}, Lkotlinx/coroutines/x1;->E(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_5

    goto :goto_3

    .line 12
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    iput v1, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->c:I

    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_6

    goto :goto_3

    .line 13
    :cond_6
    :goto_2
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b:Lkotlinx/coroutines/m0;

    new-instance v10, Lcom/sumsub/sns/internal/features/data/repository/dynamic/s;

    invoke-direct {v10, p0, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/s;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    move-result-object p1

    .line 14
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b:Lkotlinx/coroutines/m0;

    new-instance v10, Lcom/sumsub/sns/internal/features/data/repository/dynamic/t;

    invoke-direct {v10, p0, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/t;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    move-result-object v4

    new-array v1, v1, [Lkotlinx/coroutines/r0;

    const/4 v7, 0x0

    aput-object p1, v1, v7

    aput-object v4, v1, v0

    .line 15
    iput v5, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/r;->c:I

    invoke-static {v1, v2}, Lkotlinx/coroutines/AwaitKt;->b([Lkotlinx/coroutines/r0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_7

    :goto_3
    return-object v3

    .line 16
    :cond_7
    :goto_4
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b:Lkotlinx/coroutines/m0;

    new-instance v10, Lcom/sumsub/sns/internal/features/data/repository/dynamic/u;

    invoke-direct {v10, p0, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/u;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 21
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 22
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 23
    new-instance v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/v;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/v;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;ZLkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 18
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/w;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 16
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/B;->c:I

    .line 17
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 18
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 19
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 20
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/A;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/A;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 21
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 3
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 4
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object p2

    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;

    invoke-direct {v2, p0, p1, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;ZLkotlin/coroutines/Continuation;)V

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/x;->d:I

    invoke-virtual {p0, p2, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 5
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    if-eqz p1, :cond_4

    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_4

    .line 9
    new-instance p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;-><init>(Ljava/lang/Object;)V

    return-object p2

    .line 10
    :cond_4
    instance-of p1, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    if-eqz p1, :cond_6

    .line 11
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    if-eqz p1, :cond_5

    .line 12
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 13
    :cond_5
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;->a:Ljava/lang/Throwable;

    .line 14
    new-instance p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    invoke-direct {p2, p1, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;-><init>(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object p2

    .line 15
    :cond_6
    new-instance p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;-><init>()V

    return-object p1
.end method

.method public final b()V
    .locals 9

    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->f:Lkotlinx/coroutines/x1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 23
    :cond_0
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b:Lkotlinx/coroutines/m0;

    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c:Lkotlinx/coroutines/j0;

    new-instance v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;

    invoke-direct {v6, p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/E;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->f:Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/z;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 4
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz v0, :cond_0

    .line 6
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v8, v2

    goto :goto_0

    :cond_0
    move v8, v1

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 9
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 11
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 12
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 13
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 14
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 15
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 16
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->a()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1

    move v1, v2

    .line 17
    :cond_1
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    const/4 v9, 0x0

    if-eqz v2, :cond_2

    .line 19
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz v2, :cond_2

    .line 20
    new-instance v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    invoke-direct {v5, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    .line 21
    :cond_2
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    if-eqz v2, :cond_4

    .line 22
    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    if-eqz v5, :cond_3

    .line 23
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    goto :goto_1

    :cond_3
    move-object v5, v9

    .line 24
    :goto_1
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;->a:Ljava/lang/Throwable;

    .line 25
    new-instance v7, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    invoke-direct {v7, v2, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;-><init>(Ljava/lang/Throwable;Ljava/lang/Object;)V

    move-object v5, v7

    goto :goto_2

    .line 26
    :cond_4
    new-instance v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;

    invoke-direct {v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;-><init>()V

    .line 27
    :goto_2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    if-eqz v2, :cond_5

    .line 28
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/k;

    .line 29
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/M;-><init>(Ljava/lang/Object;)V

    :goto_3
    move-object v7, v2

    goto :goto_5

    .line 30
    :cond_5
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    if-eqz v2, :cond_7

    .line 31
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;

    if-eqz v2, :cond_6

    .line 32
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/h;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/k;

    goto :goto_4

    :cond_6
    move-object v2, v9

    .line 33
    :goto_4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;->a:Ljava/lang/Throwable;

    .line 34
    new-instance v7, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;

    invoke-direct {v7, v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/L;-><init>(Ljava/lang/Throwable;Ljava/lang/Object;)V

    goto :goto_5

    .line 35
    :cond_7
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/K;-><init>()V

    goto :goto_3

    .line 36
    :goto_5
    invoke-direct/range {v3 .. v8}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;Z)V

    .line 37
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    if-nez v1, :cond_8

    .line 38
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 39
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 40
    const-string v1, "DataRepository"

    const-string/jumbo v2, "updateDataFlow: skipping ..."

    invoke-virtual {v0, v1, v2, v9}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 41
    :cond_8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->h:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method
