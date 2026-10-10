.class public final Lcom/sumsub/sns/internal/features/presentation/main/c2;
.super Lcom/sumsub/sns/internal/features/presentation/main/i2;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final C:Lcom/sumsub/sns/internal/features/presentation/main/x0;

.field public static final synthetic D:[Lkotlin/reflect/KProperty;


# instance fields
.field public final A:Lcom/sumsub/sns/internal/features/presentation/main/d;

.field public B:Lkotlin/jvm/functions/Function0;

.field public final d:Lcom/sumsub/sns/internal/features/domain/L;

.field public final e:Lcom/sumsub/sns/internal/features/domain/fisherman/f;

.field public final f:Lcom/sumsub/sns/internal/features/domain/O;

.field public final g:Lcom/sumsub/sns/internal/features/domain/appdata/f;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final i:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

.field public final j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final k:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

.field public final l:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/main/j2;

.field public final n:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

.field public final o:J

.field public p:Z

.field public q:Lkotlinx/coroutines/x1;

.field public final r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public t:Lkotlinx/coroutines/x1;

.field public final u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public v:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final w:Lkotlinx/coroutines/flow/n;

.field public final x:Lkotlinx/coroutines/flow/n;

.field public final y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

.field public final z:Lcom/sumsub/sns/internal/features/presentation/main/k2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;

    .line 3
    .line 4
    const-string v1, "currentLevelName"

    .line 5
    .line 6
    const-string v2, "getCurrentLevelName()Ljava/lang/String;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "isSDKPrepared"

    .line 14
    .line 15
    const-string v4, "isSDKPrepared()Z"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    const-string/jumbo v4, "verificationStarted"

    .line 23
    .line 24
    const-string v5, "getVerificationStarted()Z"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v0

    .line 29
    const/4 v4, 0x3

    .line 30
    .line 31
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 32
    .line 33
    aput-object v1, v4, v3

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    aput-object v2, v4, v1

    .line 37
    const/4 v1, 0x2

    .line 38
    .line 39
    aput-object v0, v4, v1

    .line 40
    .line 41
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/main/c2;->D:[Lkotlin/reflect/KProperty;

    .line 42
    .line 43
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/x0;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/main/x0;-><init>()V

    .line 47
    .line 48
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->C:Lcom/sumsub/sns/internal/features/presentation/main/x0;

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
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/L;Lcom/sumsub/sns/internal/features/domain/fisherman/f;Lcom/sumsub/sns/internal/features/domain/O;Lcom/sumsub/sns/internal/features/domain/appdata/f;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/settings/c;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/socket/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/presentation/main/j2;Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p6, p8}, Lcom/sumsub/sns/internal/features/presentation/main/i2;-><init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->d:Lcom/sumsub/sns/internal/features/domain/L;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->e:Lcom/sumsub/sns/internal/features/domain/fisherman/f;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->f:Lcom/sumsub/sns/internal/features/domain/O;

    .line 10
    .line 11
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->g:Lcom/sumsub/sns/internal/features/domain/appdata/f;

    .line 12
    .line 13
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->h:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 14
    .line 15
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->i:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 16
    .line 17
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 18
    .line 19
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->k:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

    .line 20
    .line 21
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->l:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 22
    .line 23
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->m:Lcom/sumsub/sns/internal/features/presentation/main/j2;

    .line 24
    .line 25
    iput-object p12, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->n:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    .line 26
    .line 27
    sget-object p2, Lcom/sumsub/sns/internal/ff/a;->L:Lcom/sumsub/sns/internal/ff/core/a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 31
    move-result p3

    .line 32
    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/ff/core/a;->b()Lcom/sumsub/sns/internal/ff/core/c;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    iget-object p2, p2, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 51
    move-result-wide p2

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_0
    const-wide/16 p2, 0x1388

    .line 55
    .line 56
    :goto_0
    iput-wide p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->o:J

    .line 57
    .line 58
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 59
    .line 60
    const-string p3, "KEY_CURRENT_LEVEL"

    .line 61
    const/4 p4, 0x0

    .line 62
    const/4 p5, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct {p2, p1, p3, p4, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 66
    .line 67
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 68
    .line 69
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 70
    .line 71
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 72
    .line 73
    const-string p6, "KEY_SDK_PREPARED"

    .line 74
    .line 75
    .line 76
    invoke-direct {p2, p1, p6, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 77
    .line 78
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 79
    .line 80
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    const-string p6, "VERIFICATION_STARTED"

    .line 83
    .line 84
    .line 85
    invoke-direct {p2, p1, p6, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 86
    .line 87
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 88
    .line 89
    .line 90
    invoke-static {p3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->w:Lkotlinx/coroutines/flow/n;

    .line 94
    .line 95
    .line 96
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    move-result-object p2

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->x:Lkotlinx/coroutines/flow/n;

    .line 104
    .line 105
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 106
    .line 107
    .line 108
    invoke-direct {p3}, Lcom/sumsub/sns/internal/features/presentation/main/k2;-><init>()V

    .line 109
    .line 110
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 111
    .line 112
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->z:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 113
    .line 114
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/d;

    .line 115
    .line 116
    .line 117
    invoke-direct {p3, p0}, Lcom/sumsub/sns/internal/features/presentation/main/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/i2;)V

    .line 118
    .line 119
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->A:Lcom/sumsub/sns/internal/features/presentation/main/d;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewModelInternalState()Lkotlinx/coroutines/flow/w;

    .line 123
    move-result-object p3

    .line 124
    .line 125
    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/main/V0;

    .line 126
    .line 127
    .line 128
    invoke-direct {p5, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/main/V0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p3, p1, p2, p5}, Lkotlinx/coroutines/flow/g;->q(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/main/w2;

    .line 135
    .line 136
    .line 137
    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/main/w2;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p2}, Lkotlinx/coroutines/flow/g;->u(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/e;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/main/j1;

    .line 144
    .line 145
    .line 146
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/main/j1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p2}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    .line 153
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 154
    move-result-object p2

    .line 155
    .line 156
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/w0;

    .line 157
    .line 158
    .line 159
    invoke-direct {p3, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/main/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;)V

    .line 160
    .line 161
    .line 162
    invoke-static {p1, p2, p3}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->h()Z

    .line 166
    move-result p1

    .line 167
    .line 168
    if-nez p1, :cond_1

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->onLoad()V

    .line 172
    :cond_1
    return-void
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
.end method

.method public static final a(Lkotlin/Pair;)J
    .locals 2

    .line 60
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/a;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/main/K0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/main/K0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->a:Lcom/sumsub/sns/internal/features/data/model/common/a;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/internal/features/presentation/main/e2;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/presentation/main/k2;)Lcom/sumsub/sns/internal/features/data/model/common/Document;

    move-result-object p2

    if-eqz p2, :cond_9

    .line 4
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->v:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p3

    goto :goto_1

    :cond_6
    move-object p3, v8

    :goto_1
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_9

    .line 5
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->a:Lcom/sumsub/sns/internal/features/data/model/common/a;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    goto :goto_5

    :cond_7
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    .line 6
    :goto_2
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/a;Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 7
    iput-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->a:Lcom/sumsub/sns/internal/features/data/model/common/a;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    goto :goto_5

    .line 8
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 9
    :cond_9
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_5

    .line 10
    :cond_a
    :goto_4
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/K0;->e:I

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_b

    :goto_5
    return-object v1

    .line 11
    :cond_b
    :goto_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 14

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    .line 12
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/main/M0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;

    invoke-direct {v3, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/M0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 13
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v5, :cond_6

    if-eq v5, v10, :cond_5

    if-eq v5, v9, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->d:Z

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v1

    move-object v1, v5

    move v5, v0

    move-object v0, v8

    goto/16 :goto_4

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v0

    move-object v0, v1

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 14
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    invoke-static {v1, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/e2;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/presentation/main/k2;)Lcom/sumsub/sns/internal/features/data/model/common/Document;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 15
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->v:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v5

    goto :goto_1

    :cond_7
    move-object v5, v12

    :goto_1
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    .line 16
    iput-object p1, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    iput v10, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    invoke-virtual {p0, v11, v3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_8

    goto :goto_6

    :cond_8
    move-object v0, p1

    .line 17
    :goto_2
    invoke-virtual {p0, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 18
    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    invoke-virtual {p0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v4, :cond_9

    goto :goto_6

    .line 19
    :cond_9
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 20
    :cond_a
    iput-object p1, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    move-object/from16 v2, p3

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    move/from16 v5, p4

    iput-boolean v5, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->d:Z

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    invoke-virtual {p0, v11, v3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_b

    goto :goto_6

    :cond_b
    move-object v0, p1

    .line 21
    :goto_4
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/p;)Ljava/util/ArrayList;

    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)Z

    move-result v0

    if-eqz v0, :cond_e

    if-eqz v5, :cond_c

    .line 23
    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    invoke-virtual {p0, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Ljava/util/ArrayList;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v4, :cond_d

    goto :goto_6

    .line 24
    :cond_c
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 25
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 26
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 27
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 28
    :cond_d
    :goto_5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 29
    :cond_e
    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->b:Ljava/lang/Object;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/main/M0;->g:I

    invoke-virtual {p0, v11, v3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v4, :cond_f

    :goto_6
    return-object v4

    .line 30
    :cond_f
    :goto_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 43
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/z0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/z0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 44
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->d:I

    .line 46
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 47
    :cond_4
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 48
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/z0;->d:I

    .line 49
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    .line 50
    :goto_3
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_7

    .line 51
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result p1

    if-nez p1, :cond_7

    const/4 p1, 0x0

    if-eqz v0, :cond_6

    .line 52
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v1

    .line 53
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_4

    :cond_6
    move-object v1, p1

    .line 54
    :goto_4
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Completed:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v1, v2, :cond_7

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->n()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 55
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 56
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 57
    const-string v1, "SNSAppViewModel"

    const-string v2, "Check init applicant status: completed and approved, closing sdk"

    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/main/s;->c:Lcom/sumsub/sns/internal/features/presentation/main/s;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 59
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/h;)Lkotlin/Unit;
    .locals 2

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/A0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/A0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 63
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->B:Lkotlin/jvm/functions/Function0;

    .line 64
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V
    .locals 3

    .line 252
    :try_start_0
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    .line 253
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t fire sns event "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 254
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 255
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 256
    const-string v2, "SNSAppViewModel"

    invoke-virtual {v1, v2, p0, v0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/C0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/C0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 214
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->c:Lcom/sumsub/sns/internal/features/presentation/main/c2;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 215
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->v:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 216
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/main/c2;->D:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x2

    aget-object v2, v2, v4

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 217
    iget-object v4, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 218
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, p2, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p2

    .line 220
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 221
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->i:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->b:Ljava/lang/String;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->c:Lcom/sumsub/sns/internal/features/presentation/main/c2;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/C0;->f:I

    invoke-virtual {v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p2

    move-object p2, v0

    move-object v0, p1

    move-object p1, p0

    .line 222
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 223
    new-instance v2, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;

    invoke-direct {v2, p2, v1}, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 225
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 226
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/StepAction;->Started:Lcom/sumsub/sns/internal/core/analytics/StepAction;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 227
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 228
    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/StepAction;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object p1

    .line 229
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p1, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    const/4 p2, 0x0

    .line 230
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 231
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/E0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/E0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 187
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 188
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->d:I

    .line 189
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v5, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    .line 190
    :cond_4
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 191
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz v2, :cond_9

    .line 192
    instance-of v4, v2, Lcom/sumsub/sns/internal/features/data/model/common/a;

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_8

    .line 193
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object p2

    .line 194
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 195
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/m;

    if-eqz p2, :cond_7

    const/4 p2, 0x0

    .line 196
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/E0;->d:I

    invoke-virtual {p0, v5, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->b(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    .line 197
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 198
    :cond_7
    new-instance p1, Ljava/security/InvalidParameterException;

    const-string p2, "No doc set item found"

    invoke-direct {p1, p2}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 199
    :cond_8
    new-instance p1, Ljava/security/InvalidParameterException;

    const-string p2, "Config for action is null"

    invoke-direct {p1, p2}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 200
    :cond_9
    :goto_4
    new-instance p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->a()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;-><init>(Ljava/lang/Throwable;)V

    .line 201
    invoke-virtual {p0, p1, v5}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    .line 202
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;ZZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p5, Lcom/sumsub/sns/internal/features/presentation/main/Z0;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;

    invoke-direct {v0, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/main/Z0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 286
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-boolean p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->d:Z

    iget-boolean p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->c:Z

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 287
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object p5

    .line 288
    iget-object p5, p5, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 289
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "proceedWithApplicantStatus: status="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, ", isCancelled="

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    .line 290
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 291
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 292
    const-string v5, "SNSAppViewModel"

    invoke-virtual {v2, v5, p5, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 293
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-boolean p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->c:Z

    iput-boolean p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->d:Z

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/Z0;->g:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    .line 294
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 295
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 296
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Init:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_5

    .line 297
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->d(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p3, :cond_5

    .line 298
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->d()Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p4, :cond_4

    .line 299
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 300
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto/16 :goto_2

    .line 301
    :cond_4
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->d(Z)V

    goto/16 :goto_2

    .line 302
    :cond_5
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 303
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v0, v1, :cond_6

    .line 304
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->c(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez p3, :cond_6

    .line 305
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 306
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto/16 :goto_2

    .line 307
    :cond_6
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 308
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 309
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Pending:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v0, v1, :cond_7

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->c(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-nez p5, :cond_7

    .line 310
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 311
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto/16 :goto_2

    .line 312
    :cond_7
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 313
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 314
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Prechecked:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v0, v1, :cond_8

    .line 315
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->c(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-nez p5, :cond_8

    .line 316
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 317
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto :goto_2

    .line 318
    :cond_8
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 319
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 320
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->RequiresAction:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-eq v0, v1, :cond_9

    .line 321
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 322
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 323
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->AwaitingService:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v0, v1, :cond_a

    .line 324
    :cond_9
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->c(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v0

    if-eqz v0, :cond_a

    if-nez p5, :cond_a

    .line 325
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 326
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto :goto_2

    .line 327
    :cond_a
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->o()Z

    move-result p5

    if-eqz p5, :cond_b

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->b(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result p5

    if-eqz p5, :cond_b

    .line 328
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 329
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto :goto_2

    .line 330
    :cond_b
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->p()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->e(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz p3, :cond_c

    if-nez p4, :cond_c

    .line 331
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/L0;

    invoke-direct {p1, p0, v4, v3}, Lcom/sumsub/sns/internal/features/presentation/main/L0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;ZLkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    goto :goto_2

    .line 332
    :cond_c
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 333
    invoke-virtual {p0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    goto :goto_2

    .line 334
    :cond_d
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 335
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 336
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 337
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 338
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/util/ArrayList;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/k1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/k1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 203
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->a:Ljava/util/ArrayList;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "startVideoIdentification: docs "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 205
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 206
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 207
    const-string v4, "SNSAppViewModel"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, p2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    const-string p2, "com.sumsub.sns.videoident.BuildConfig"

    invoke-static {p2}, Lcom/sumsub/sns/internal/core/common/N0;->a(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 209
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "VIDEO_IDENT"

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    invoke-direct {p2, v2, v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->a:Ljava/util/ArrayList;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/k1;->d:I

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 210
    :cond_3
    :goto_1
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/main/X;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/main/X;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_2

    .line 211
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->w:Lkotlinx/coroutines/flow/n;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 212
    new-instance v1, Ljava/lang/Exception;

    const-string p1, "VideoIdent not available"

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "VIDEO_IDENT"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 213
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/main/W0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/main/W0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 168
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->a:Z

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 169
    iget-object p3, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 170
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->b:Lcom/sumsub/sns/core/data/model/FlowType;

    .line 171
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "SDK is prepared. Applicant - "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", type="

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 172
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 173
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 174
    const-string v7, "SNSAppViewModel"

    invoke-virtual {v2, v7, p3, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 175
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/X0;

    invoke-direct {p3, v5}, Lcom/sumsub/sns/internal/features/presentation/main/X0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, p3, v6, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 176
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/main/c2;->D:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v6

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 177
    iget-object v7, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v7, p3, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 178
    new-instance p3, Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;

    .line 179
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 180
    invoke-direct {p3, v2}, Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 181
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->a:Z

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    if-nez p1, :cond_9

    .line 182
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/W0;->e:I

    .line 183
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 184
    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_5

    goto :goto_2

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    .line 185
    :cond_6
    invoke-virtual {p0, v3, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->b(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_7

    goto :goto_2

    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    .line 186
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/D0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/D0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 232
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->a:Z

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->c:Lcom/sumsub/sns/internal/features/presentation/main/c2;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 233
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->v:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz p2, :cond_4

    const/4 v2, 0x0

    .line 234
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->v:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 235
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/main/c2;->D:[Lkotlin/reflect/KProperty;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 236
    iget-object v5, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 237
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v2, v4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 238
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->i:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->c:Lcom/sumsub/sns/internal/features/presentation/main/c2;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->a:Z

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/D0;->f:I

    invoke-virtual {v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, v0

    move-object v0, p2

    move-object p2, v1

    move-object v1, p0

    .line 239
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 240
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 241
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 242
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/main/c2;->D:[Lkotlin/reflect/KProperty;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 243
    new-instance v4, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;

    invoke-direct {v4, p2, v2, p1, v3}, Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    if-nez p1, :cond_4

    .line 245
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 246
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/StepAction;->Completed:Lcom/sumsub/sns/internal/core/analytics/StepAction;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 247
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 248
    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/StepAction;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object p1

    .line 249
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p1, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 250
    invoke-virtual {p1, v5}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 251
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;
    .locals 7

    const/4 v0, 0x1

    .line 339
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->f(Z)V

    .line 340
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v1

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/J0;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/J0;-><init>(Lkotlin/jvm/functions/Function2;Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V
    .locals 11

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cancel verification with reason - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 150
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 151
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 152
    const-string v3, "SNSAppViewModel"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    .line 153
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 154
    new-instance v2, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 155
    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;->Dismiss:Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    .line 156
    iget-object v6, v2, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v7, Lcom/sumsub/sns/internal/core/analytics/Domain;->Sdk:Lcom/sumsub/sns/internal/core/analytics/Domain;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object v6, v2, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v5, "isDismissMethodCalled"

    invoke-static {v5, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    filled-new-array {p2}, [Lkotlin/Pair;

    move-result-object p2

    .line 159
    invoke-static {p2}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, v2, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 160
    invoke-virtual {v2, v0}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 161
    iget-object p2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 162
    const-string v1, "cancelWaitForLevelChange"

    invoke-virtual {p2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    if-eqz p2, :cond_0

    invoke-static {p2, v4, v0, v4}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 164
    :cond_0
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    const/4 p2, 0x0

    .line 165
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    .line 166
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/main/P0;

    invoke-direct {v8, p0, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/main/P0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/common/w;J)V
    .locals 8

    .line 342
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/B0;

    const/4 v3, 0x0

    move-object v7, p0

    move-object v2, p0

    move-object v6, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/presentation/main/B0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;JLcom/sumsub/sns/internal/core/common/w;Lcom/sumsub/sns/internal/features/presentation/main/c2;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V
    .locals 3

    .line 38
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A user has uploaded document: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 40
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 41
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 42
    const-string v1, "SNSAppViewModel"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/a;Lcom/sumsub/sns/internal/features/data/model/common/Document;)V
    .locals 7

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "startActionStep: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 138
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 139
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    .line 140
    invoke-static {p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/p;Z)Lcom/sumsub/sns/internal/features/presentation/main/Y;

    move-result-object p1

    .line 141
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Y;->b:Z

    if-nez v0, :cond_0

    .line 142
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    .line 143
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Step "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is NOT supported in actions"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    .line 146
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 147
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    :cond_0
    move-object v1, p0

    .line 148
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;)V
    .locals 4

    .line 31
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;->a:Ljava/lang/String;

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Postponing SDK init for restrictions prompt: restriction="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 33
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 34
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 35
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/x2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/x2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/h;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->B:Lkotlin/jvm/functions/Function0;

    .line 37
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/V;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/Document;)V
    .locals 6

    .line 117
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 118
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "startStep for document: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 120
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 121
    iget-object v3, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 122
    const-string v4, "SNSAppViewModel"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v0, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->b:Lcom/sumsub/sns/internal/log/logger/a;

    .line 124
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/log/logger/a;->a()V

    .line 125
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 126
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 127
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 128
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 129
    invoke-virtual {v2, v4, v0, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->w:Lkotlinx/coroutines/flow/n;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 131
    invoke-static {p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/p;Z)Lcom/sumsub/sns/internal/features/presentation/main/Y;

    move-result-object p1

    .line 132
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "navigation event: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "}"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 133
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 134
    invoke-virtual {v0, v4, p2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;)V
    .locals 7

    .line 167
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/c1;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/c1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;)V
    .locals 14

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 65
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v1

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/H0;

    invoke-direct {v4, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/H0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 66
    :cond_0
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 67
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    const-string v2, "SNSAppViewModel"

    if-eqz v1, :cond_3

    .line 68
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/a;

    if-eqz v3, :cond_1

    move-object v3, v1

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    if-eqz v3, :cond_3

    .line 69
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 70
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 71
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 72
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 73
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/h;->x:Lcom/sumsub/sns/internal/features/data/model/common/g;

    if-eqz v4, :cond_2

    .line 74
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/g;->b:Lcom/sumsub/sns/core/data/model/FlowActionType;

    if-eqz v4, :cond_2

    .line 75
    invoke-virtual {v4}, Lcom/sumsub/sns/core/data/model/FlowActionType;->getValue()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v0

    .line 76
    :goto_1
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 77
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 78
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Action state: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 79
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 80
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 81
    invoke-virtual {v4, v2, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    :cond_3
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/main/c2;->D:[Lkotlin/reflect/KProperty;

    const/4 v5, 0x0

    aget-object v6, v4, v5

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_5

    if-eqz v1, :cond_4

    .line 83
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 84
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/j3;->a:Lcom/sumsub/sns/internal/features/data/model/common/r2;

    .line 85
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/r2;->a:Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v3, v0

    .line 86
    :goto_2
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v7, v4, v5

    .line 87
    iget-object v7, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v7, v6, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    if-eqz v1, :cond_6

    .line 88
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 89
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/j3;->a:Lcom/sumsub/sns/internal/features/data/model/common/r2;

    .line 90
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/r2;->a:Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object v3, v0

    .line 91
    :goto_3
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v7, v4, v5

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 92
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_7

    if-eqz v3, :cond_7

    move v6, v7

    goto :goto_4

    :cond_7
    move v6, v5

    .line 93
    :goto_4
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v9, v4, v5

    .line 94
    iget-object v9, v8, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v9, v8, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v6, :cond_8

    .line 95
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 96
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 97
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    if-eqz v1, :cond_8

    .line 98
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 99
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v8

    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/main/F0;

    invoke-direct {v11, p0, v3, v0}, Lcom/sumsub/sns/internal/features/presentation/main/F0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 100
    :cond_8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v4, v4, v5

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 101
    iget-boolean v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    .line 102
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 103
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_9

    .line 104
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object p1

    .line 105
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_5

    :cond_9
    move-object p1, v0

    .line 106
    :goto_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Data updated: levelChanged="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ", level="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", isWaitingForLevelChange="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", applicant.status="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 107
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 108
    iget-object v4, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 109
    invoke-virtual {v4, v2, p1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    if-eqz p1, :cond_b

    if-eqz v6, :cond_b

    .line 111
    iget-object p1, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 112
    const-string v3, "cancelWaitForLevelChange"

    invoke-virtual {p1, v2, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    if-eqz p1, :cond_a

    invoke-static {p1, v0, v7, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 114
    :cond_a
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    .line 115
    iput-boolean v5, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    .line 116
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/G0;

    invoke-direct {p1, p0, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/G0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/p;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    :cond_b
    return-void
.end method

.method public final a(ZZ)V
    .locals 7

    .line 341
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/S0;

    const/4 v3, 0x0

    move-object v5, p0

    move-object v2, p0

    move v4, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/S0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;ZLcom/sumsub/sns/internal/features/presentation/main/c2;Z)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;Z)Z
    .locals 4

    .line 257
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/p;)Ljava/util/ArrayList;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    invoke-static {p1, p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 259
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v0

    .line 260
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 261
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "resolveApplicantStatusWithVideoIdent: applicantStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viStatus="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 262
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 263
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 264
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p3, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p3, 0x1

    if-eqz p4, :cond_0

    .line 265
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->d()Z

    move-result p4

    if-nez p4, :cond_0

    .line 266
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 267
    invoke-virtual {p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    return p3

    .line 268
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->d()Z

    move-result p4

    if-nez p4, :cond_6

    .line 269
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 271
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v3

    .line 272
    iget-boolean v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/n;->b:Z

    if-eqz v3, :cond_1

    .line 273
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v3

    .line 274
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/n;->d:Ljava/util/List;

    if-eqz v3, :cond_2

    .line 275
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 276
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 277
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, p3, :cond_2

    goto :goto_0

    .line 278
    :cond_2
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 279
    :cond_3
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    .line 280
    :cond_4
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p1

    move p2, v1

    :cond_5
    if-ge p2, p1, :cond_7

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p2, p2, 0x1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 281
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 282
    :cond_6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 283
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 284
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 285
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return p3

    :cond_7
    :goto_1
    return v1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/I0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/I0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 76
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 77
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/I0;->c:I

    .line 78
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 79
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_4

    .line 80
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 81
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/j3;->c:Lcom/sumsub/sns/internal/features/data/model/common/D3;

    if-eqz p1, :cond_4

    .line 82
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/D3;->a:Ljava/lang/Boolean;

    .line 83
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :cond_4
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/main/a1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/main/a1;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/main/a1;->k:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/main/a1;->k:I

    :goto_0
    move-object v5, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/a1;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/a1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object v2, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 20
    iget v3, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->k:I

    const/4 v4, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v9, "SNSAppViewModel"

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v10, :cond_3

    if-eq v3, v7, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->a:Z

    iget-object v3, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->h:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v7, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->g:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v12, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->f:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    iget-object v13, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iget-object v14, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->d:Ljava/util/List;

    iget-object v15, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v4, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move v4, v1

    move-object/from16 v1, v16

    goto/16 :goto_3

    :cond_3
    iget-boolean v1, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->a:Z

    iget-object v3, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "resolveApplicantStatus: isCancelled="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 22
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 23
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 24
    invoke-virtual {v3, v9, v2, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->g:Lcom/sumsub/sns/internal/features/domain/appdata/f;

    .line 26
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->l:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    move-object/from16 v4, p2

    .line 27
    iput-object v4, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-boolean v1, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->a:Z

    iput v10, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->k:I

    .line 28
    invoke-virtual {v2, v8, v3, v5}, Lcom/sumsub/sns/internal/features/domain/appdata/f;->a(ZLcom/sumsub/sns/internal/features/data/repository/applicant/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object v3, v4

    :goto_2
    if-eqz v3, :cond_12

    .line 29
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_8

    .line 30
    :cond_6
    iget-boolean v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    if-eqz v4, :cond_7

    .line 31
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 32
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 33
    const-string/jumbo v2, "resolveApplicantStatus: waiting for level change, do nothing"

    invoke-virtual {v1, v9, v2, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 35
    :cond_7
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/appdata/c;

    .line 36
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/domain/appdata/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 37
    iget-object v14, v2, Lcom/sumsub/sns/internal/features/domain/appdata/c;->b:Ljava/util/List;

    .line 38
    iget-object v13, v2, Lcom/sumsub/sns/internal/features/domain/appdata/c;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 39
    sget-object v12, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    iput-object v3, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v4, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v14, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->d:Ljava/util/List;

    iput-object v13, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iput-object v12, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->f:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    iput-object v3, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->g:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v4, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->h:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-boolean v1, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->a:Z

    iput v7, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->k:I

    invoke-virtual {v0, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_8

    goto/16 :goto_6

    :cond_8
    move-object v7, v3

    move-object v15, v4

    move v4, v1

    move-object v1, v7

    move-object v3, v15

    :goto_3
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 40
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->b:Ljava/util/List;

    .line 41
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v3, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 42
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/main/m;->c:Lcom/sumsub/sns/internal/features/presentation/main/m;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 43
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_9
    if-eqz v14, :cond_a

    .line 44
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_4

    .line 45
    :cond_a
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 46
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 47
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v3

    .line 48
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 49
    invoke-interface {v7, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_c
    move v3, v10

    goto :goto_5

    :cond_d
    :goto_4
    move v3, v8

    .line 50
    :goto_5
    invoke-virtual {v15}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v2

    .line 51
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/n;->b:Z

    if-eqz v2, :cond_e

    .line 52
    invoke-virtual {v0, v15, v14, v13, v4}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;Z)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 53
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 54
    :cond_e
    invoke-virtual {v15}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v2

    .line 55
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/j3;->c:Lcom/sumsub/sns/internal/features/data/model/common/D3;

    if-eqz v2, :cond_f

    .line 56
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/D3;->a:Ljava/lang/Boolean;

    .line 57
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    :cond_f
    if-eqz v8, :cond_10

    if-nez v3, :cond_10

    .line 58
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 59
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 60
    const-string/jumbo v3, "waiting for possible level change ..."

    invoke-virtual {v2, v9, v3, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/main/a0;->a:Lcom/sumsub/sns/internal/features/presentation/main/a0;

    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 62
    iput-boolean v10, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    .line 63
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/b1;

    const/4 v5, 0x0

    move-object v3, v1

    move-object v2, v15

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/main/b1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;ZLkotlin/coroutines/Continuation;)V

    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    move-result-object v1

    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    .line 64
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_10
    move-object v2, v1

    move-object v1, v15

    .line 65
    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->c:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->d:Ljava/util/List;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->f:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->g:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->h:Lcom/sumsub/sns/internal/features/data/model/common/p;

    const/4 v7, 0x3

    iput v7, v5, Lcom/sumsub/sns/internal/features/presentation/main/a1;->k:I

    invoke-virtual/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;ZZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_11

    :goto_6
    return-object v6

    .line 66
    :cond_11
    :goto_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_12
    :goto_8
    if-nez v3, :cond_13

    move v8, v10

    .line 67
    :cond_13
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Config is null ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ") or applicant update result ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "), going to status screen"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 68
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 69
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 70
    invoke-virtual {v2, v9, v1, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->y:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 72
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 73
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 74
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/main/q;->c:Lcom/sumsub/sns/internal/features/presentation/main/q;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 75
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v3, p2, Lcom/sumsub/sns/internal/features/presentation/main/Y0;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->d:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->d:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;

    invoke-direct {v3, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/Y0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->d:I

    const-string v7, "SNSAppViewModel"

    const/4 v6, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->a:Z

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "onStepComplete, isCancelled="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 4
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    invoke-virtual {v5, v7, v2, v9}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-boolean p1, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->a:Z

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->d:I

    .line 7
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto :goto_3

    :cond_4
    move v1, p1

    .line 8
    :goto_1
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 9
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->a()Ljava/lang/Throwable;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 10
    instance-of v1, v8, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_5

    goto :goto_2

    .line 11
    :cond_5
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    const/4 v2, 0x6

    invoke-direct {v1, v8, v9, v9, v2}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "TYPE_UNKNOWN"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->w:Lkotlinx/coroutines/flow/n;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 13
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 15
    const-string v2, "An error while preparing the sdk..."

    invoke-virtual {v1, v7, v2, v8}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    :goto_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 17
    :cond_6
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 18
    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/main/Y0;->d:I

    invoke-virtual {p0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->b(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    :goto_3
    return-object v4

    .line 19
    :cond_7
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 6

    .line 84
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/g1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/g1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/main/c2;Ljava/lang/String;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/f1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/f1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 5
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;->c:I

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

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/f1;->c:I

    .line 7
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 8
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_5

    .line 9
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v0

    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 11
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/j3;->d:Lcom/sumsub/sns/internal/features/data/model/common/B3;

    if-eqz v0, :cond_4

    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/B3;->a:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 13
    :goto_2
    invoke-static {p1, v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/H;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)Lcom/sumsub/sns/core/data/model/SNSSDKState;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->h:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 15
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final c()V
    .locals 4

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 3
    const-string v1, "Restrictions check passed. Continuing SDK init..."

    const/4 v2, 0x0

    const-string v3, "SNSAppViewModel"

    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->B:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->n:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a(Z)Lcom/sumsub/sns/internal/features/presentation/main/b0;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/L0;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/L0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;ZLkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 10
    return-void
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
.end method

.method public final e()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->n:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->b:Ljava/util/Set;

    .line 4
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->w:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()Lcom/sumsub/sns/internal/features/presentation/main/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->A:Lcom/sumsub/sns/internal/features/presentation/main/d;

    return-object v0
.end method

.method public final f(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->x:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    add-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 11

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 8
    .line 9
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    move-object v4, p1

    .line 13
    .line 14
    check-cast v4, Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/c1;

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v2, p0

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/c1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 27
    const/4 v9, 0x3

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v5, p1

    .line 31
    move-object v8, v1

    .line 32
    .line 33
    .line 34
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 39
    return-void
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

.method public final g()Lcom/sumsub/sns/internal/features/presentation/main/k2;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->z:Lcom/sumsub/sns/internal/features/presentation/main/k2;

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

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/main/f2;-><init>()V

    .line 6
    return-object v0
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

.method public final onCleared()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->g:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    .line 9
    const-string v2, "SNSAppViewModel"

    .line 10
    .line 11
    const-string v3, "cancelWaitForLevelChange"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0, v2, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 23
    .line 24
    :cond_0
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->q:Lkotlinx/coroutines/x1;

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->p:Z

    .line 28
    .line 29
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 30
    .line 31
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 32
    .line 33
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a()V

    .line 37
    .line 38
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a()V

    .line 42
    .line 43
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a()V

    .line 47
    .line 48
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->h:Lkotlinx/coroutines/flow/n;

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-super {p0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->onCleared()V

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final onLoad()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/c2;->h:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 10
    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/R0;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/R0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/c2;->a(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 19
    return-void
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

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/T0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;

    .line 22
    .line 23
    check-cast p1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/T0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;->c:I

    .line 35
    const/4 v3, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/T0;->c:I

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/internal/features/presentation/main/i2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    return-object v1

    .line 64
    .line 65
    :cond_3
    :goto_1
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/U0;

    .line 66
    const/4 v0, 0x0

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/U0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/c2;Lkotlin/coroutines/Continuation;)V

    .line 70
    const/4 v1, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v1, p1, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 76
    return-object p1
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
