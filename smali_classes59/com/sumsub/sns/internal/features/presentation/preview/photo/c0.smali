.class public abstract Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;
.super Lcom/sumsub/sns/internal/features/presentation/preview/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/utils/N;


# static fields
.field public static final synthetic l:[Lkotlin/reflect/KProperty;


# instance fields
.field public final g:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

.field public final i:Lcom/sumsub/sns/internal/features/domain/documents/t;

.field public final j:Lcom/sumsub/sns/internal/features/domain/mrtd/b;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getShowPhotoPickerOnStart()Z"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "showPhotoPickerOnStart"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->l:[Lkotlin/reflect/KProperty;

    .line 20
    return-void
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
    .line 38
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/domain/documents/t;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/mrtd/b;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p2

    .line 4
    move-object v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p8

    .line 7
    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/e;)V

    .line 10
    .line 11
    iput-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->g:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 12
    .line 13
    iput-object p6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 14
    .line 15
    iput-object p7, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->i:Lcom/sumsub/sns/internal/features/domain/documents/t;

    .line 16
    .line 17
    iput-object p9, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->j:Lcom/sumsub/sns/internal/features/domain/mrtd/b;

    .line 18
    .line 19
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 20
    .line 21
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    const-string/jumbo p3, "showPhotoPickerOnStart"

    .line 25
    const/4 p4, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v2, p3, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 29
    .line 30
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 31
    .line 32
    iput-object v0, p6, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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

.method public static a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->g:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->g:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 24
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->g:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->d:Ljava/util/Map;

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->c:Ljava/util/Map;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->b:Ljava/util/List;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v21, v1

    move-object v1, v0

    move-object v0, v3

    move-object v3, v2

    move-object/from16 v2, v21

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->a:Ljava/util/Map;

    .line 26
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->b:Ljava/util/Map;

    .line 27
    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    move-object/from16 v5, p2

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->b:Ljava/util/List;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->c:Ljava/util/Map;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->d:Ljava/util/Map;

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/y;->g:I

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_3

    return-object v4

    :cond_3
    move-object v4, v5

    .line 28
    :goto_1
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    .line 29
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-nez v5, :cond_9

    .line 30
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 31
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 32
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz v10, :cond_4

    .line 33
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 34
    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v10, v8

    :goto_3
    if-ge v10, v9, :cond_8

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v10, v10, 0x1

    .line 36
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 37
    sget-object v12, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_6

    const-string v12, ""

    .line 38
    :cond_6
    new-instance v13, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 39
    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/graphics/Bitmap;

    .line 40
    iget-object v15, v11, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 41
    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/sumsub/sns/internal/features/domain/documents/c;

    if-eqz v11, :cond_7

    .line 42
    iget v11, v11, Lcom/sumsub/sns/internal/features/domain/documents/c;->a:I

    move/from16 v16, v11

    goto :goto_4

    :cond_7
    move/from16 v16, v8

    .line 43
    :goto_4
    invoke-interface {v1, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v17

    const/16 v19, 0x0

    const/16 v20, 0x70

    const/16 v18, 0x0

    .line 44
    invoke-direct/range {v13 .. v20}, Lcom/sumsub/sns/internal/features/domain/documents/w;-><init>(Landroid/graphics/Bitmap;Ljava/io/File;IZLjava/lang/String;Ljava/lang/CharSequence;I)V

    .line 45
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 46
    :cond_8
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;

    invoke-direct {v1, v4, v6, v3, v7}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;-><init>(Ljava/util/ArrayList;ZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;I)V

    goto :goto_6

    .line 47
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 49
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 50
    new-instance v9, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 51
    iget-object v11, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    const/4 v15, 0x0

    const/16 v16, 0x70

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 52
    invoke-direct/range {v9 .. v16}, Lcom/sumsub/sns/internal/features/domain/documents/w;-><init>(Landroid/graphics/Bitmap;Ljava/io/File;IZLjava/lang/String;Ljava/lang/CharSequence;I)V

    .line 53
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 54
    :cond_a
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;

    invoke-direct {v2, v1, v8, v3, v7}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;-><init>(Ljava/util/ArrayList;ZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;I)V

    move-object v1, v2

    .line 55
    :goto_6
    invoke-virtual {v0, v8}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 56
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/z;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v8, v2, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 57
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 18
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->d:I

    .line 20
    invoke-static {p0, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepare$suspendImpl(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Q;->d:I

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 22
    :cond_5
    :goto_3
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/S;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v4, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(I)V
    .locals 3

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onPageSelected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 152
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 153
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 154
    const-string v1, "DocCapture"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/A2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 141
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->a:Lcom/sumsub/sns/internal/features/data/model/common/A2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v4

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 142
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->j:Lcom/sumsub/sns/internal/features/domain/mrtd/b;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->a:Lcom/sumsub/sns/internal/features/data/model/common/A2;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/E;->e:I

    invoke-virtual {p2, p1, v0}, Lcom/sumsub/sns/internal/features/domain/mrtd/b;->a(Lcom/sumsub/sns/internal/features/data/model/common/A2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    move-object p2, p0

    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 143
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/r;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->d()Lcom/sumsub/sns/internal/features/data/model/common/Document;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/r;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;)V

    goto :goto_2

    .line 144
    :cond_4
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/q;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/q;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/A2;)V

    .line 145
    :goto_2
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 146
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->l:[Lkotlin/reflect/KProperty;

    const/4 p3, 0x0

    aget-object v0, p2, p3

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object p2, p2, p3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 6
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->b(Z)V

    .line 8
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 61
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const/4 v6, 0x0

    const-string/jumbo v7, "sns_preview_idDocError_action_retake"

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    packed-switch v5, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Throwable;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_1
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Throwable;

    iget-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v9, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v19, v9

    move-object v9, v5

    move-object/from16 v5, v19

    goto/16 :goto_e

    :pswitch_2
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_4
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->f:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v8, Landroid/text/Spanned;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v11, Ljava/lang/CharSequence;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_5
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v8, Landroid/text/Spanned;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v11, Ljava/lang/CharSequence;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_6
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v8, Landroid/text/Spanned;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v11, Ljava/lang/CharSequence;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_7
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->f:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v11, Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v12, Ljava/lang/CharSequence;

    iget-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v14, Lcom/sumsub/sns/internal/features/domain/documents/q;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_8
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v8, Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v11, Ljava/lang/CharSequence;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v13, Lcom/sumsub/sns/internal/features/domain/documents/q;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v14, v8

    move-object v8, v5

    move-object v5, v14

    move-object v14, v13

    goto/16 :goto_3

    :pswitch_9
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/documents/p;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    check-cast v12, Lcom/sumsub/sns/internal/features/domain/documents/t;

    iget-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    check-cast v14, Lcom/sumsub/sns/internal/features/domain/documents/q;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_a
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/p;

    if-eqz v2, :cond_f

    .line 63
    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/documents/p;

    .line 64
    iget-object v2, v5, Lcom/sumsub/sns/internal/features/domain/documents/p;->d:Ljava/util/List;

    .line 65
    iget-boolean v11, v5, Lcom/sumsub/sns/internal/features/domain/documents/p;->a:Z

    .line 66
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->i:Lcom/sumsub/sns/internal/features/domain/documents/t;

    .line 67
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v13

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    iput-boolean v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v4, :cond_1

    goto/16 :goto_10

    :cond_1
    move-object/from16 v19, v14

    move-object v14, v1

    move v1, v11

    move-object v11, v13

    move-object v13, v2

    move-object/from16 v2, v19

    .line 68
    :goto_1
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 69
    invoke-virtual {v12, v11, v5, v2}, Lcom/sumsub/sns/internal/features/domain/documents/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/documents/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/Object;

    move-result-object v2

    .line 70
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v2, v10

    :cond_2
    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    if-eqz v5, :cond_3

    move-object v11, v5

    goto :goto_2

    :cond_4
    move-object v11, v10

    .line 71
    :goto_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->g:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 72
    move-object v5, v14

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/documents/p;

    .line 73
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/domain/documents/p;->e:Ljava/lang/String;

    .line 74
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/data/model/common/g2;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/q2;

    move-result-object v5

    .line 75
    iput-object v14, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_5

    goto/16 :goto_10

    :cond_5
    move-object v12, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v12

    move-object v12, v13

    .line 76
    :goto_3
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 77
    iput-object v14, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->f:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    const/4 v13, 0x3

    iput v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const-string/jumbo v13, "sns_preview_photo_title"

    invoke-virtual {v0, v13, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_6

    goto/16 :goto_10

    :cond_6
    move-object/from16 v19, v5

    move-object v5, v2

    move-object v2, v13

    move-object v13, v12

    move-object v12, v11

    move-object/from16 v11, v19

    .line 78
    :goto_4
    check-cast v2, Ljava/lang/CharSequence;

    .line 79
    invoke-virtual {v8, v5, v2}, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 80
    check-cast v11, Lcom/sumsub/sns/internal/core/domain/d;

    .line 81
    iget-object v5, v11, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 82
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 83
    invoke-static {v2, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v8

    .line 84
    check-cast v14, Lcom/sumsub/sns/internal/features/domain/documents/p;

    .line 85
    iget-object v2, v14, Lcom/sumsub/sns/internal/features/domain/documents/p;->d:Ljava/util/List;

    .line 86
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 87
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 88
    check-cast v11, Lcom/sumsub/sns/internal/features/domain/h0;

    if-eqz v11, :cond_8

    .line 89
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v11, :cond_8

    .line 90
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    goto :goto_6

    :cond_8
    move-object v11, v10

    :goto_6
    if-eqz v11, :cond_7

    .line 91
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 92
    :cond_9
    iget-object v2, v14, Lcom/sumsub/sns/internal/features/domain/documents/p;->b:Ljava/util/List;

    if-eqz v1, :cond_b

    .line 93
    iput-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->f:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    const/4 v11, 0x4

    iput v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_a

    goto/16 :goto_10

    :cond_a
    move-object v11, v5

    move-object v5, v2

    move-object v2, v7

    move-object v7, v11

    move-object v11, v12

    move-object v12, v13

    :goto_7
    check-cast v2, Ljava/lang/String;

    goto :goto_9

    .line 94
    :cond_b
    iput-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->f:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    const/4 v7, 0x5

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const-string/jumbo v7, "sns_preview_idDocWarning_action_continue"

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_c

    goto/16 :goto_10

    :cond_c
    move-object v11, v5

    move-object v5, v2

    move-object v2, v7

    move-object v7, v11

    move-object v11, v12

    move-object v12, v13

    .line 95
    :goto_8
    check-cast v2, Ljava/lang/String;

    :goto_9
    if-eqz v1, :cond_d

    move-object v14, v2

    move-object v15, v10

    move-object v3, v12

    :goto_a
    move/from16 v16, v1

    move-object/from16 v17, v5

    move-object/from16 v18, v7

    move-object v13, v11

    goto :goto_c

    .line 96
    :cond_d
    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->e:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->f:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->g:Z

    const/4 v13, 0x6

    iput v13, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const-string/jumbo v13, "sns_preview_idDocWarning_action_retake"

    invoke-virtual {v0, v13, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_e

    goto/16 :goto_10

    :cond_e
    move-object v4, v2

    move-object v2, v3

    move-object v3, v12

    .line 97
    :goto_b
    check-cast v2, Ljava/lang/String;

    move-object v15, v2

    move-object v14, v4

    goto :goto_a

    .line 98
    :goto_c
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

    invoke-direct/range {v12 .. v18}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 99
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/K;

    invoke-direct {v1, v8, v12, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/K;-><init>(Landroid/text/Spanned;Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v6, v1, v9, v10}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 100
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 101
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 102
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Got warnings: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 104
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v2, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v2}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v2

    .line 105
    invoke-static {v2}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v2

    .line 106
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-direct {v4, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_11

    .line 107
    :cond_f
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/i;

    if-eqz v2, :cond_10

    .line 108
    check-cast v1, Lcom/sumsub/sns/internal/features/domain/documents/i;

    .line 109
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/i;->a:Lcom/sumsub/sns/internal/features/data/model/common/A2;

    const/4 v2, 0x7

    .line 110
    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->a(Lcom/sumsub/sns/internal/features/data/model/common/A2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_17

    goto/16 :goto_10

    .line 111
    :cond_10
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/g;

    if-eqz v2, :cond_14

    .line 112
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v11

    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/preview/photo/T;

    invoke-direct {v14, v0, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/T;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 113
    check-cast v1, Lcom/sumsub/sns/internal/features/domain/documents/g;

    .line 114
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/g;->a:Ljava/lang/Exception;

    .line 115
    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const-string/jumbo v2, "sns_mrtdscan_error_chipIsNotReadable_title"

    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_11

    goto/16 :goto_10

    :cond_11
    move-object v5, v0

    .line 116
    :goto_d
    check-cast v2, Ljava/lang/String;

    .line 117
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    const/16 v9, 0x9

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    const-string/jumbo v9, "sns_mrtdscan_error_chipIsNotReadable_subtitle"

    invoke-virtual {v0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_12

    goto :goto_10

    :cond_12
    move-object/from16 v19, v9

    move-object v9, v1

    move-object v1, v2

    move-object/from16 v2, v19

    .line 118
    :goto_e
    check-cast v2, Ljava/lang/String;

    .line 119
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->a:Ljava/lang/Object;

    iput-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->d:Ljava/lang/Object;

    const/16 v11, 0xa

    iput v11, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_13

    goto :goto_10

    :cond_13
    move-object v4, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v5

    move-object v5, v9

    .line 120
    :goto_f
    check-cast v2, Ljava/lang/String;

    .line 121
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    const/16 v9, 0x18

    invoke-direct {v7, v9, v4, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    invoke-direct {v1, v5, v10, v7, v8}, Lcom/sumsub/sns/internal/features/data/model/common/g0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 123
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 124
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 125
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 126
    new-instance v4, Lcom/sumsub/sns/core/presentation/base/m;

    .line 127
    invoke-direct {v4, v1, v2, v10, v10}, Lcom/sumsub/sns/core/presentation/base/m;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 128
    invoke-virtual {v3, v4}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_11

    .line 129
    :cond_14
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/e;

    if-eqz v2, :cond_15

    const/16 v1, 0xb

    .line 130
    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/J;->j:I

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->g()Lkotlin/Unit;

    move-result-object v1

    if-ne v1, v4, :cond_17

    :goto_10
    return-object v4

    .line 131
    :cond_15
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/domain/documents/l;

    if-eqz v2, :cond_16

    .line 132
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v11

    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/preview/photo/M;

    invoke-direct {v14, v0, v10}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/M;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 133
    check-cast v1, Lcom/sumsub/sns/internal/features/domain/documents/l;

    .line 134
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/l;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 135
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/b;

    invoke-direct {v2, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    invoke-virtual {v0, v2}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 136
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->g()V

    goto :goto_11

    .line 137
    :cond_16
    instance-of v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/n;

    if-eqz v1, :cond_18

    .line 138
    :cond_17
    :goto_11
    invoke-virtual {v0, v6}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 139
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 140
    :cond_18
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 147
    const-string/jumbo v0, "sns_preview_photo_action_accept"

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 9
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;->c:I

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

    .line 10
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 11
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 12
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/w;->c:I

    invoke-static {p1, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/S;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 13
    :cond_3
    :goto_1
    move-object v1, p1

    check-cast v1, Lcom/sumsub/sns/internal/core/common/w;

    if-eqz v1, :cond_4

    .line 14
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 15
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->onLoad()V

    .line 17
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Z)V
    .locals 7

    if-eqz p1, :cond_0

    .line 58
    sget-object v1, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    const/4 p1, 0x1

    .line 59
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->c(Z)V

    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    return-void
.end method

.method public a(ZLandroid/os/Parcelable;)V
    .locals 6

    .line 148
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "On instructions showed, success="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", payload="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    if-nez p1, :cond_0

    goto :goto_0

    .line 149
    :cond_0
    instance-of p1, p2, Lcom/sumsub/sns/core/presentation/base/r;

    if-eqz p1, :cond_1

    .line 150
    check-cast p2, Lcom/sumsub/sns/core/presentation/base/r;

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 17
    const-string/jumbo v0, "sns_preview_photo_action_retake"

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->d:Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->c:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->b:Ljava/lang/CharSequence;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->a:Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->c:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->b:Ljava/lang/CharSequence;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->a:Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v5, v2

    move-object v2, v7

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->a:Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    .line 3
    :cond_6
    :goto_1
    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    .line 4
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->a:Ljava/lang/CharSequence;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    .line 5
    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/CharSequence;

    .line 6
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;->CONTINUE:Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;

    .line 7
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->a:Ljava/lang/CharSequence;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->b:Ljava/lang/CharSequence;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->c:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v7, v4

    move-object v4, p1

    move-object p1, v7

    .line 8
    :goto_3
    check-cast p1, Ljava/lang/CharSequence;

    .line 9
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;

    invoke-direct {v6, v5, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;Ljava/lang/CharSequence;)V

    .line 10
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;->TRY_AGAIN:Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;

    .line 11
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->a:Ljava/lang/CharSequence;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->b:Ljava/lang/CharSequence;

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->c:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->d:Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/x;->g:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, v2

    move-object v2, v4

    move-object v3, v6

    .line 12
    :goto_5
    check-cast p1, Ljava/lang/CharSequence;

    .line 13
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;

    invoke-direct {v4, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$ButtonAction;Ljava/lang/CharSequence;)V

    .line 14
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$State;->OK:Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$State;

    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    const/4 v6, 0x0

    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;Lcom/sumsub/sns/internal/features/presentation/preview/photo/n;Lcom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentViewModel$Content$State;Lcom/sumsub/sns/internal/features/presentation/preview/photo/o;)V

    return-object v0
.end method

.method public final b(Z)V
    .locals 6

    .line 18
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/C;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;ZLkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 2
    const-string/jumbo v0, "sns_preview_photo_subtitle"

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Z;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Z;-><init>(ZLkotlin/coroutines/Continuation;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 23
    const-string/jumbo v0, "sns_preview_photo_title"

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Z)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 2
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/G;

    invoke-direct {v5, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/G;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 7
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    const/16 v4, 0x1ff

    .line 8
    invoke-static {v3, v0, v0, v0, v4}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object v3

    .line 9
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 12
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    .line 14
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 15
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 17
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 18
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    if-nez v0, :cond_3

    goto :goto_2

    .line 19
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 20
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/b;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 21
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->g()V

    return-void

    .line 22
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->f()V

    return-void
.end method

.method public final e()Ljava/util/LinkedHashMap;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    :goto_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 25
    .line 26
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 27
    const/4 v5, 0x2

    .line 28
    .line 29
    aget-object v4, v4, v5

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x1

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    iget-boolean v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/J;->b:Z

    .line 42
    .line 43
    if-ne v3, v5, :cond_1

    .line 44
    move v3, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v3, v4

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    const-string v6, "isSeamless"

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    .line 62
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    move-result-object v3

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    move-result v6

    .line 68
    const/4 v7, 0x0

    .line 69
    .line 70
    if-eqz v6, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    move-result-object v6

    .line 75
    move-object v8, v6

    .line 76
    .line 77
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 78
    .line 79
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 80
    .line 81
    if-ne v8, v1, :cond_2

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move-object v6, v7

    .line 84
    .line 85
    :goto_2
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 86
    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    iget-object v1, v6, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 90
    .line 91
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    move-result v1

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v1, v4

    .line 98
    .line 99
    .line 100
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    const-string v3, "isAutocaptured"

    .line 104
    .line 105
    .line 106
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v6, :cond_5

    .line 109
    .line 110
    iget-boolean v1, v6, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 111
    .line 112
    if-ne v1, v5, :cond_5

    .line 113
    move v4, v5

    .line 114
    .line 115
    .line 116
    :cond_5
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    const-string v3, "isFromGallery"

    .line 120
    .line 121
    .line 122
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    move-result v1

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    move-result-object v1

    .line 141
    move-object v3, v1

    .line 142
    .line 143
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 144
    .line 145
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 146
    .line 147
    const-string v4, "IDENTITY_VIDEO"

    .line 148
    .line 149
    .line 150
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    move-result v3

    .line 152
    .line 153
    if-eqz v3, :cond_6

    .line 154
    move-object v7, v1

    .line 155
    .line 156
    :cond_7
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 157
    .line 158
    if-eqz v7, :cond_8

    .line 159
    .line 160
    iget-object v0, v7, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 161
    .line 162
    if-eqz v0, :cond_8

    .line 163
    .line 164
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 170
    .line 171
    .line 172
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 173
    .line 174
    iget v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/S;->a:I

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    const-string v4, "duration"

    .line 181
    .line 182
    .line 183
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    iget-wide v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/S;->b:J

    .line 186
    .line 187
    .line 188
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    const-string v3, "fileSize"

    .line 192
    .line 193
    .line 194
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    const-string/jumbo v0, "seamlessVideo"

    .line 198
    .line 199
    .line 200
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    :cond_8
    return-object v2
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public final f()V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "DocCapture"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "onUploadDocuments"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/a0;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    .line 19
    const/4 v1, 0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v2, v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance v5, Lcom/sumsub/sns/internal/core/common/t;

    .line 38
    .line 39
    .line 40
    invoke-direct {v5, v2}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    .line 41
    .line 42
    const/16 v9, 0xe

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    move-object v4, p0

    .line 48
    .line 49
    .line 50
    invoke-static/range {v4 .. v10}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 51
    return-void

    .line 52
    :cond_0
    move-object v4, p0

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 56
    move-result-object v5

    .line 57
    .line 58
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Y;

    .line 59
    .line 60
    .line 61
    invoke-direct {v8, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/Y;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Lkotlin/coroutines/Continuation;)V

    .line 62
    const/4 v9, 0x3

    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    .line 67
    .line 68
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 69
    return-void
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
.end method

.method public g()Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h()Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/v;->a:[I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v0

    .line 11
    .line 12
    aget v0, v1, v0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    const/4 v1, 0x3

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->d(Z)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 32
    throw v0

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->d(Z)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/P;->a:Lcom/sumsub/sns/internal/features/presentation/utils/P;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 42
    .line 43
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object v0
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

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v3, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;-><init>(Ljava/util/ArrayList;ZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;I)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public h()Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->b:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/l;->b:[I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    move-result v0

    .line 13
    .line 14
    aget v0, v1, v0

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->Proceed:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 23
    return-object v0

    .line 24
    .line 25
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    throw v0

    .line 30
    .line 31
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->Prompt:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 32
    return-object v0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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
.end method

.method public final onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v6, 0xf

    .line 7
    const/4 v7, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Preview photo error handling... "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    .line 23
    const-string v2, "DocCapture"

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->f()V

    .line 35
    :cond_0
    return-void
    .line 36
    .line 37
    .line 38
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
.end method

.method public final onLoad()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;->h:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/photo/O;

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v5, p0, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/O;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 23
    const/4 v6, 0x3

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-super {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->onLoad()V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
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
.end method
