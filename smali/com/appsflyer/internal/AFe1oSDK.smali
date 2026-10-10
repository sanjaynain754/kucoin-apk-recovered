.class public final enum Lcom/appsflyer/internal/AFe1oSDK;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFe1oSDK;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AFAdRevenueData:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum AFInAppEventParameterName:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum AFInAppEventType:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum AFLogger:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum areAllFieldsValid:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum component1:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum component2:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum component3:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum component4:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum copy:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum copydefault:Lcom/appsflyer/internal/AFe1oSDK;

.field private static final synthetic e:[Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum equals:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum getMediationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum getMonetizationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum getRevenue:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum hashCode:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum toString:Lcom/appsflyer/internal/AFe1oSDK;

.field public static final enum unregisterClient:Lcom/appsflyer/internal/AFe1oSDK;


# instance fields
.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    .line 2
    new-instance v1, Lcom/appsflyer/internal/AFe1oSDK;

    .line 3
    .line 4
    const-string v0, "RC_CDN"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0, v2, v3}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v1, Lcom/appsflyer/internal/AFe1oSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

    .line 12
    .line 13
    new-instance v2, Lcom/appsflyer/internal/AFe1oSDK;

    .line 14
    .line 15
    const-string v0, "FETCH_ADVERTISING_ID"

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0, v3, v3}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v2, Lcom/appsflyer/internal/AFe1oSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1oSDK;

    .line 21
    .line 22
    new-instance v3, Lcom/appsflyer/internal/AFe1oSDK;

    .line 23
    .line 24
    const-string v0, "LOAD_CACHE"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v0, v4, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v3, Lcom/appsflyer/internal/AFe1oSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

    .line 31
    .line 32
    new-instance v0, Lcom/appsflyer/internal/AFe1oSDK;

    .line 33
    .line 34
    const-string v5, "CACHED_EVENT"

    .line 35
    const/4 v6, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v5, v6, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v0, Lcom/appsflyer/internal/AFe1oSDK;->getRevenue:Lcom/appsflyer/internal/AFe1oSDK;

    .line 41
    .line 42
    new-instance v5, Lcom/appsflyer/internal/AFe1oSDK;

    .line 43
    .line 44
    const-string v7, "CONVERSION"

    .line 45
    const/4 v8, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v5, v7, v8, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v5, Lcom/appsflyer/internal/AFe1oSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1oSDK;

    .line 51
    .line 52
    new-instance v7, Lcom/appsflyer/internal/AFe1oSDK;

    .line 53
    .line 54
    const-string v9, "PLAY_INTEGRITY_API"

    .line 55
    const/4 v10, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v7, v9, v10, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v7, Lcom/appsflyer/internal/AFe1oSDK;->component2:Lcom/appsflyer/internal/AFe1oSDK;

    .line 61
    move-object v9, v7

    .line 62
    .line 63
    new-instance v7, Lcom/appsflyer/internal/AFe1oSDK;

    .line 64
    .line 65
    const-string v10, "REGISTER_TRIGGER"

    .line 66
    const/4 v11, 0x6

    .line 67
    .line 68
    .line 69
    invoke-direct {v7, v10, v11, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 70
    .line 71
    sput-object v7, Lcom/appsflyer/internal/AFe1oSDK;->component1:Lcom/appsflyer/internal/AFe1oSDK;

    .line 72
    .line 73
    new-instance v10, Lcom/appsflyer/internal/AFe1oSDK;

    .line 74
    .line 75
    const-string v11, "ONELINK"

    .line 76
    const/4 v12, 0x7

    .line 77
    .line 78
    .line 79
    invoke-direct {v10, v11, v12, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 80
    .line 81
    sput-object v10, Lcom/appsflyer/internal/AFe1oSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFe1oSDK;

    .line 82
    move-object v11, v9

    .line 83
    .line 84
    new-instance v9, Lcom/appsflyer/internal/AFe1oSDK;

    .line 85
    .line 86
    const-string v12, "DLSDK"

    .line 87
    .line 88
    const/16 v13, 0x8

    .line 89
    .line 90
    .line 91
    invoke-direct {v9, v12, v13, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 92
    .line 93
    sput-object v9, Lcom/appsflyer/internal/AFe1oSDK;->component4:Lcom/appsflyer/internal/AFe1oSDK;

    .line 94
    move-object v12, v10

    .line 95
    .line 96
    new-instance v10, Lcom/appsflyer/internal/AFe1oSDK;

    .line 97
    .line 98
    const-string v13, "RESOLVE_ESP"

    .line 99
    .line 100
    const/16 v14, 0x9

    .line 101
    .line 102
    .line 103
    invoke-direct {v10, v13, v14, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 104
    .line 105
    sput-object v10, Lcom/appsflyer/internal/AFe1oSDK;->component3:Lcom/appsflyer/internal/AFe1oSDK;

    .line 106
    move-object v13, v11

    .line 107
    .line 108
    new-instance v11, Lcom/appsflyer/internal/AFe1oSDK;

    .line 109
    .line 110
    const-string v14, "ATTR"

    .line 111
    .line 112
    const/16 v15, 0xa

    .line 113
    .line 114
    .line 115
    invoke-direct {v11, v14, v15, v4}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 116
    .line 117
    sput-object v11, Lcom/appsflyer/internal/AFe1oSDK;->copy:Lcom/appsflyer/internal/AFe1oSDK;

    .line 118
    move-object v4, v12

    .line 119
    .line 120
    new-instance v12, Lcom/appsflyer/internal/AFe1oSDK;

    .line 121
    .line 122
    const-string v14, "GCDSDK"

    .line 123
    .line 124
    const/16 v15, 0xb

    .line 125
    .line 126
    .line 127
    invoke-direct {v12, v14, v15, v6}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 128
    .line 129
    sput-object v12, Lcom/appsflyer/internal/AFe1oSDK;->equals:Lcom/appsflyer/internal/AFe1oSDK;

    .line 130
    move-object v6, v13

    .line 131
    .line 132
    new-instance v13, Lcom/appsflyer/internal/AFe1oSDK;

    .line 133
    .line 134
    const-string v14, "REGISTER"

    .line 135
    .line 136
    const/16 v15, 0xc

    .line 137
    .line 138
    .line 139
    invoke-direct {v13, v14, v15, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 140
    .line 141
    sput-object v13, Lcom/appsflyer/internal/AFe1oSDK;->toString:Lcom/appsflyer/internal/AFe1oSDK;

    .line 142
    .line 143
    new-instance v14, Lcom/appsflyer/internal/AFe1oSDK;

    .line 144
    .line 145
    const-string v15, "LAUNCH"

    .line 146
    .line 147
    move-object/from16 v16, v0

    .line 148
    .line 149
    const/16 v0, 0xd

    .line 150
    .line 151
    .line 152
    invoke-direct {v14, v15, v0, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 153
    .line 154
    sput-object v14, Lcom/appsflyer/internal/AFe1oSDK;->copydefault:Lcom/appsflyer/internal/AFe1oSDK;

    .line 155
    .line 156
    new-instance v15, Lcom/appsflyer/internal/AFe1oSDK;

    .line 157
    .line 158
    const-string v0, "INAPP"

    .line 159
    .line 160
    move-object/from16 v17, v1

    .line 161
    .line 162
    const/16 v1, 0xe

    .line 163
    .line 164
    .line 165
    invoke-direct {v15, v0, v1, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 166
    .line 167
    sput-object v15, Lcom/appsflyer/internal/AFe1oSDK;->hashCode:Lcom/appsflyer/internal/AFe1oSDK;

    .line 168
    .line 169
    new-instance v0, Lcom/appsflyer/internal/AFe1oSDK;

    .line 170
    .line 171
    const-string v1, "MANUAL_PURCHASE_VALIDATION"

    .line 172
    .line 173
    move-object/from16 v18, v2

    .line 174
    .line 175
    const/16 v2, 0xf

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, v1, v2, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 179
    .line 180
    sput-object v0, Lcom/appsflyer/internal/AFe1oSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFe1oSDK;

    .line 181
    .line 182
    new-instance v1, Lcom/appsflyer/internal/AFe1oSDK;

    .line 183
    .line 184
    const-string v2, "PURCHASE_VALIDATE"

    .line 185
    .line 186
    move-object/from16 v19, v0

    .line 187
    .line 188
    const/16 v0, 0x10

    .line 189
    .line 190
    .line 191
    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 192
    .line 193
    sput-object v1, Lcom/appsflyer/internal/AFe1oSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1oSDK;

    .line 194
    .line 195
    new-instance v0, Lcom/appsflyer/internal/AFe1oSDK;

    .line 196
    .line 197
    const-string v2, "SDK_SERVICES"

    .line 198
    .line 199
    move-object/from16 v20, v1

    .line 200
    .line 201
    const/16 v1, 0x11

    .line 202
    .line 203
    .line 204
    invoke-direct {v0, v2, v1, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 205
    .line 206
    sput-object v0, Lcom/appsflyer/internal/AFe1oSDK;->AFLogger:Lcom/appsflyer/internal/AFe1oSDK;

    .line 207
    .line 208
    new-instance v1, Lcom/appsflyer/internal/AFe1oSDK;

    .line 209
    .line 210
    const-string v2, "IMPRESSIONS"

    .line 211
    .line 212
    move-object/from16 v21, v0

    .line 213
    .line 214
    const/16 v0, 0x12

    .line 215
    .line 216
    .line 217
    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 218
    .line 219
    sput-object v1, Lcom/appsflyer/internal/AFe1oSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFe1oSDK;

    .line 220
    .line 221
    new-instance v0, Lcom/appsflyer/internal/AFe1oSDK;

    .line 222
    .line 223
    const-string v2, "ARS_VALIDATE"

    .line 224
    .line 225
    move-object/from16 v22, v1

    .line 226
    .line 227
    const/16 v1, 0x13

    .line 228
    .line 229
    .line 230
    invoke-direct {v0, v2, v1, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 231
    .line 232
    sput-object v0, Lcom/appsflyer/internal/AFe1oSDK;->registerClient:Lcom/appsflyer/internal/AFe1oSDK;

    .line 233
    .line 234
    new-instance v1, Lcom/appsflyer/internal/AFe1oSDK;

    .line 235
    .line 236
    const-string v2, "ADREVENUE"

    .line 237
    .line 238
    move-object/from16 v23, v0

    .line 239
    .line 240
    const/16 v0, 0x14

    .line 241
    .line 242
    .line 243
    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFe1oSDK;-><init>(Ljava/lang/String;II)V

    .line 244
    .line 245
    sput-object v1, Lcom/appsflyer/internal/AFe1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFe1oSDK;

    .line 246
    move-object v8, v4

    .line 247
    .line 248
    move-object/from16 v4, v16

    .line 249
    .line 250
    move-object/from16 v2, v18

    .line 251
    .line 252
    move-object/from16 v16, v19

    .line 253
    .line 254
    move-object/from16 v18, v21

    .line 255
    .line 256
    move-object/from16 v19, v22

    .line 257
    .line 258
    move-object/from16 v21, v1

    .line 259
    .line 260
    move-object/from16 v1, v17

    .line 261
    .line 262
    move-object/from16 v17, v20

    .line 263
    .line 264
    move-object/from16 v20, v23

    .line 265
    .line 266
    .line 267
    filled-new-array/range {v1 .. v21}, [Lcom/appsflyer/internal/AFe1oSDK;

    .line 268
    move-result-object v0

    .line 269
    .line 270
    sput-object v0, Lcom/appsflyer/internal/AFe1oSDK;->e:[Lcom/appsflyer/internal/AFe1oSDK;

    .line 271
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/appsflyer/internal/AFe1oSDK;->d:I

    .line 6
    return-void
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFe1oSDK;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/appsflyer/internal/AFe1oSDK;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/appsflyer/internal/AFe1oSDK;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lcom/appsflyer/internal/AFe1oSDK;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFe1oSDK;->e:[Lcom/appsflyer/internal/AFe1oSDK;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFe1oSDK;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/appsflyer/internal/AFe1oSDK;

    .line 9
    return-object v0
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
.end method
