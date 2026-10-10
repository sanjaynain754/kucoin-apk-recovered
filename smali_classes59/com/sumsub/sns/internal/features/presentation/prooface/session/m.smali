.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/prooface/session/d0;


# instance fields
.field public final a:Lkotlinx/coroutines/m0;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;

.field public final c:Lkotlinx/coroutines/flow/e;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Lkotlinx/coroutines/flow/m;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/m0;Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;Lcom/sumsub/sns/internal/features/presentation/prooface/session/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->a:Lkotlinx/coroutines/m0;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->c:Lkotlinx/coroutines/flow/e;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;

    .line 12
    .line 13
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/b;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->e:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->f:Lkotlinx/coroutines/flow/n;

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    const/4 p2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    const/4 p1, 0x0

    .line 31
    const/4 p3, 0x7

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p2, p1, p3, p1}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->h:Lkotlinx/coroutines/flow/m;

    .line 38
    return-void
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
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
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


# virtual methods
.method public final a(FLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 52
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->c:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->e:Lkotlinx/coroutines/flow/n;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;-><init>(F)V

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->c:I

    invoke-interface {p2, v2, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    .line 54
    :cond_5
    :goto_1
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->c:I

    const-wide/16 p1, 0xfa

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    .line 55
    :cond_6
    :goto_2
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/camera/x;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 21
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-eqz v2, :cond_5

    if-eq v2, v4, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/camera/x;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/x;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 22
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calibration phase: started. exposure: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 23
    iget p2, p1, Lcom/sumsub/sns/internal/core/presentation/camera/x;->b:F

    .line 24
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->a(FLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    .line 25
    :cond_6
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 26
    iget v2, p1, Lcom/sumsub/sns/internal/core/presentation/camera/x;->c:F

    .line 27
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->a(FLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v8, v2

    move-object v2, p1

    move-object p1, p2

    move-object p2, v8

    .line 28
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 29
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->e:Lkotlinx/coroutines/flow/n;

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;

    .line 30
    iget v2, v2, Lcom/sumsub/sns/internal/core/presentation/camera/x;->a:F

    .line 31
    invoke-direct {v7, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;-><init>(F)V

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    invoke-interface {v4, v7, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v2, p1

    move-object p1, p2

    .line 32
    :goto_3
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->b:Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g;->e:I

    const-wide/16 v3, 0xfa

    invoke-static {v3, v4, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    move-object v0, v2

    .line 33
    :goto_5
    filled-new-array {v0, p1}, [Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 34
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const-string v0, "fail"

    if-ge p2, v6, :cond_a

    goto :goto_8

    .line 35
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 36
    iget v1, v1, Lcom/sumsub/sns/internal/features/data/model/prooface/f;->b:F

    .line 37
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 38
    iget v2, v2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;->b:F

    .line 39
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    goto :goto_6

    .line 40
    :cond_b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 41
    iget v2, v2, Lcom/sumsub/sns/internal/features/data/model/prooface/f;->b:F

    .line 42
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 43
    iget v3, v3, Lcom/sumsub/sns/internal/features/data/model/prooface/f;->b:F

    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    goto :goto_7

    :cond_c
    const/4 p2, 0x0

    cmpl-float p2, v1, p2

    if-lez p2, :cond_d

    sub-float p2, v1, v2

    div-float/2addr p2, v1

    const v1, 0x3e99999a    # 0.3f

    cmpl-float p2, p2, v1

    if-lez p2, :cond_d

    .line 45
    const-string/jumbo v0, "ok"

    .line 46
    :cond_d
    :goto_8
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 47
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 48
    invoke-direct {p2, v0, p1, v5}, Lcom/sumsub/sns/internal/features/data/model/prooface/c;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 49
    const-string p1, "Calibration phase: finished"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object p2

    .line 50
    :cond_e
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    .line 51
    :cond_f
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;Lcom/sumsub/sns/internal/features/presentation/prooface/session/i0;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    const-string p1, "Calibration phase: started"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;

    .line 5
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;->b:Z

    if-nez p1, :cond_4

    .line 6
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    goto :goto_4

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->c:Lkotlinx/coroutines/flow/e;

    .line 9
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/j;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/j;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 10
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;->c:I

    invoke-static {v2, v0}, Lkotlinx/coroutines/flow/g;->F(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    .line 11
    :cond_5
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/L0;

    .line 12
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/L0;->a:Lcom/sumsub/sns/internal/core/presentation/camera/x;

    .line 13
    iget v2, p1, Lcom/sumsub/sns/internal/core/presentation/camera/x;->b:F

    .line 14
    iget v4, p1, Lcom/sumsub/sns/internal/core/presentation/camera/x;->c:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_6

    .line 15
    const-string p1, "Calibration phase: exposure min=max, zeroCalibration"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 16
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->f:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    goto :goto_4

    .line 18
    :cond_6
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/k;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->a(Lcom/sumsub/sns/internal/core/presentation/camera/x;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    .line 19
    :cond_7
    :goto_3
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 20
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Calibration phase: finished: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object p1
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)Z
    .locals 6

    .line 56
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 57
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;

    invoke-virtual {p2, p1, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/n;->a(Landroidx/camera/core/ImageProxy;F)Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    move-result-object p1

    .line 58
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Calibration phase: processed. img.exposure: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, ", calibration: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->a:Lkotlinx/coroutines/m0;

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;Lcom/sumsub/sns/internal/features/data/model/prooface/f;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;->c:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 58
    .line 59
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->h:Lkotlinx/coroutines/flow/m;

    .line 60
    .line 61
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/l;->c:I

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->F(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    return-object v1

    .line 69
    .line 70
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/f;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    const/4 v1, 0x0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 77
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    const-string v1, "Calibration phase: collected: "

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 97
    return-object p1
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

.method public final getState()Lkotlinx/coroutines/flow/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/m;->f:Lkotlinx/coroutines/flow/n;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method
