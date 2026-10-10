.class public final Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;
.super Lcom/sumsub/sns/internal/features/presentation/common/G;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic W:I


# instance fields
.field public final f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final g:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

.field public final h:Lcom/sumsub/sns/internal/features/domain/documents/v;

.field public final i:Lcom/sumsub/sns/internal/features/domain/c0;

.field public final j:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final k:Lcom/sumsub/sns/internal/features/domain/utils/b;

.field public final l:Z

.field public final m:Z

.field public final n:Lkotlinx/coroutines/flow/n;

.field public final o:Lkotlinx/coroutines/flow/n;

.field public p:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/a;Lcom/sumsub/sns/internal/features/domain/documents/v;Lcom/sumsub/sns/internal/features/domain/c0;Lcom/sumsub/sns/internal/core/domain/d;Lcom/sumsub/sns/internal/features/domain/utils/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3, p4, p5, p9}, Lcom/sumsub/sns/internal/features/presentation/common/G;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/domain/utils/a;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->g:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->h:Lcom/sumsub/sns/internal/features/domain/documents/v;

    .line 10
    .line 11
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->i:Lcom/sumsub/sns/internal/features/domain/c0;

    .line 12
    .line 13
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->j:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 14
    .line 15
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 16
    .line 17
    const-string p3, "SNSBankCardUpload"

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p3, p9}, Lcom/sumsub/sns/internal/features/domain/utils/b;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/utils/a;)V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 23
    .line 24
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;->ONE:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 25
    const/4 p3, 0x0

    .line 26
    const/4 p4, 0x1

    .line 27
    .line 28
    if-eq p2, p1, :cond_0

    .line 29
    move p1, p4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, p3

    .line 32
    .line 33
    :goto_0
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->l:Z

    .line 34
    .line 35
    sget-object p6, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;->TWO:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 36
    .line 37
    if-ne p2, p6, :cond_1

    .line 38
    move p3, p4

    .line 39
    .line 40
    :cond_1
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->m:Z

    .line 41
    const/4 p2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->o:Lkotlinx/coroutines/flow/n;

    .line 56
    .line 57
    iget-object p2, p5, Lcom/sumsub/sns/internal/features/presentation/utils/M;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 58
    .line 59
    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 60
    .line 61
    aget-object p3, p3, p4

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    iget-object p3, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 68
    .line 69
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    return-void
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
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 92
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->c:Lcom/sumsub/sns/internal/features/domain/documents/p;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->a:Lcom/sumsub/sns/internal/features/domain/documents/v;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    const-string v2, "Show warnings"

    invoke-static {p2, v2}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 94
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->h:Lcom/sumsub/sns/internal/features/domain/documents/v;

    .line 95
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 96
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->v:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 97
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->a:Lcom/sumsub/sns/internal/features/domain/documents/v;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->c:Lcom/sumsub/sns/internal/features/domain/documents/p;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/t;->f:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, v0

    move-object v0, p2

    move-object p2, v1

    move-object v1, v2

    .line 98
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 99
    invoke-virtual {v0, v1, p1, p2}, Lcom/sumsub/sns/internal/features/domain/documents/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/documents/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/Object;

    move-result-object p1

    .line 100
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    move-object p1, v0

    :cond_4
    check-cast p1, Ljava/util/Map;

    .line 101
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->p:Ljava/util/Map;

    .line 102
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 103
    :cond_5
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 104
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_7

    .line 105
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 107
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/documents/w;

    if-eqz p1, :cond_6

    .line 108
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/documents/w;->e:Ljava/lang/String;

    .line 109
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    goto :goto_3

    :cond_6
    move-object v5, v0

    .line 110
    :goto_3
    sget-object v6, Lcom/sumsub/sns/internal/features/domain/documents/O;->a:Lcom/sumsub/sns/internal/features/domain/documents/O;

    const/16 v7, 0x1f

    const/4 v8, 0x0

    .line 111
    invoke-static {v4, v8, v5, v6, v7}, Lcom/sumsub/sns/internal/features/domain/documents/w;->a(Lcom/sumsub/sns/internal/features/domain/documents/w;ILjava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/documents/T;I)Lcom/sumsub/sns/internal/features/domain/documents/w;

    move-result-object v4

    .line 112
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    move-object v3, v0

    .line 113
    :cond_8
    invoke-interface {p2, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 114
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 46
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "onDocumentsUploadCompleted, "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 48
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->o:Lkotlinx/coroutines/flow/n;

    .line 49
    :cond_4
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 50
    move-object v5, v2

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    .line 51
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 52
    invoke-interface {p2, v2, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 53
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/l;

    if-eqz p2, :cond_7

    .line 54
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->i:Lcom/sumsub/sns/internal/features/domain/c0;

    .line 55
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;

    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;-><init>()V

    .line 56
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;->c:I

    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/features/domain/c0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    .line 57
    :cond_5
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 58
    const-string p2, "PAYMENT_METHODS"

    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 60
    :cond_6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 61
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->g()V

    .line 62
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/i;

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/i;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_4

    .line 63
    :cond_7
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/p;

    if-eqz p2, :cond_9

    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/p;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/s;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->a(Lcom/sumsub/sns/internal/features/domain/documents/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    .line 64
    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 65
    :cond_9
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/e;

    if-nez p2, :cond_b

    .line 66
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/j;

    if-nez p2, :cond_b

    .line 67
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/n;

    if-eqz p1, :cond_a

    goto :goto_4

    .line 68
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 69
    :cond_b
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;)Lkotlin/Unit;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onDocumentsSelected, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->a:Ljava/util/Map;

    .line 3
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->b:Ljava/util/Map;

    .line 4
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 7
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 9
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 11
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 12
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_2

    move-object v5, v2

    goto :goto_4

    .line 13
    :cond_2
    new-instance v5, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 14
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/graphics/Bitmap;

    .line 15
    iget-object v7, v3, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 16
    invoke-interface {p1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/domain/documents/c;

    if-eqz v3, :cond_3

    .line 17
    iget v3, v3, Lcom/sumsub/sns/internal/features/domain/documents/c;->a:I

    :goto_1
    move v8, v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    .line 18
    :goto_2
    invoke-interface {p1, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    .line 19
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->p:Ljava/util/Map;

    if-eqz v3, :cond_4

    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    move-object v11, v3

    goto :goto_3

    :cond_4
    move-object v11, v2

    :goto_3
    const/16 v12, 0x40

    .line 20
    invoke-direct/range {v5 .. v12}, Lcom/sumsub/sns/internal/features/domain/documents/w;-><init>(Landroid/graphics/Bitmap;Ljava/io/File;IZLjava/lang/String;Ljava/lang/CharSequence;I)V

    :goto_4
    if-eqz v5, :cond_1

    .line 21
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 23
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->l:Z

    if-eqz p1, :cond_6

    .line 24
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 25
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i()V

    .line 26
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ILjava/io/File;)V
    .locals 7

    .line 82
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 83
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 84
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 85
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 87
    check-cast v5, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 88
    iget-object v6, v5, Lcom/sumsub/sns/internal/features/domain/documents/w;->b:Ljava/io/File;

    .line 89
    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x7b

    invoke-static {v5, p1, v3, v3, v6}, Lcom/sumsub/sns/internal/features/domain/documents/w;->a(Lcom/sumsub/sns/internal/features/domain/documents/w;ILjava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/documents/T;I)Lcom/sumsub/sns/internal/features/domain/documents/w;

    move-result-object v5

    .line 90
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v3, v4

    .line 91
    :cond_3
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V
    .locals 7

    .line 27
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Upload progress "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", total:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 28
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->o:Lkotlinx/coroutines/flow/n;

    .line 29
    :cond_0
    invoke-interface {p3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 30
    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    invoke-interface {p3, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 34
    :cond_1
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p3

    .line 35
    move-object v1, p3

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 36
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 38
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 39
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/documents/w;->e:Ljava/lang/String;

    .line 40
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz v6, :cond_2

    .line 42
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v2

    .line 43
    :goto_1
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    const/16 v6, 0x3f

    invoke-static {v4, v5, v2, p2, v6}, Lcom/sumsub/sns/internal/features/domain/documents/w;->a(Lcom/sumsub/sns/internal/features/domain/documents/w;ILjava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/documents/T;I)Lcom/sumsub/sns/internal/features/domain/documents/w;

    move-result-object v4

    .line 44
    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object v2, v3

    .line 45
    :cond_5
    invoke-interface {v0, p3, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 8

    .line 70
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 71
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/domain/utils/b;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 72
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/utils/b;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 74
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 75
    const-string/jumbo v2, "onDocumentsUploadError"

    invoke-virtual {v1, v0, v2, p2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->o:Lkotlinx/coroutines/flow/n;

    .line 77
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 78
    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    .line 81
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->o:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/r;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v2, p1, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/r;-><init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final e()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->k:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "uploadDocuments"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    .line 36
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 37
    .line 38
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/documents/w;->f:Ljava/lang/CharSequence;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 44
    move-result v4

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v3, v2

    .line 49
    .line 50
    :cond_2
    check-cast v3, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v3, v2

    .line 53
    .line 54
    :goto_1
    if-eqz v3, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/u;

    .line 61
    .line 62
    .line 63
    invoke-direct {v7, p0, v3, v2}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;Lcom/sumsub/sns/internal/features/domain/documents/w;Lkotlin/coroutines/Continuation;)V

    .line 64
    const/4 v8, 0x3

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    .line 69
    .line 70
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 71
    return-void

    .line 72
    .line 73
    :cond_4
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->p:Ljava/util/Map;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 76
    .line 77
    const-string v3, "SNSImageDocumentsAwareViewModel"

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v3, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/common/F;

    .line 87
    .line 88
    .line 89
    invoke-direct {v7, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/common/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Lkotlin/coroutines/Continuation;)V

    .line 90
    const/4 v8, 0x3

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    .line 95
    .line 96
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 97
    return-void
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
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "PAYMENT_METHODS"

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

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/j;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 7
    move-object v1, p1

    .line 8
    .line 9
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/j;

    .line 10
    .line 11
    iget p1, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/j;->a:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(I)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->n:Lkotlinx/coroutines/flow/n;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    move-object v2, p1

    .line 22
    .line 23
    check-cast v2, Ljava/util/List;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget v3, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/j;->a:I

    .line 34
    .line 35
    .line 36
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {v0, p1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    return-void

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 49
    return-void
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
