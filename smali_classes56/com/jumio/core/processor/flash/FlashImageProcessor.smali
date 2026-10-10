.class public final Lcom/jumio/core/processor/flash/FlashImageProcessor;
.super Lcom/jumio/core/processor/SingleImageProcessorBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jumio/core/processor/SingleImageProcessorBase<",
        "Lcom/jumio/core/processor/flash/FlashProcessorConfig;",
        "Lcom/jumio/core/processor/ProcessorImage$FlashImage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010\'\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\n\u0010,\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."
    }
    d2 = {
        "Lcom/jumio/core/processor/flash/FlashImageProcessor;",
        "Lcom/jumio/core/processor/SingleImageProcessorBase;",
        "Lcom/jumio/core/processor/flash/FlashProcessorConfig;",
        "Lcom/jumio/core/processor/ProcessorImage$FlashImage;",
        "config",
        "flashRetryCounter",
        "",
        "toolkitProvider",
        "Lcom/jumio/core/toolkit/ToolkitProviderInterface;",
        "<init>",
        "(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;)V",
        "result",
        "Lcom/jumio/core/processor/flash/FlashProcessingResult;",
        "colorSpikeTime",
        "",
        "captureTime",
        "requestedState",
        "Lcom/jumio/sdk/enums/JumioFlashState;",
        "checkRequirements",
        "",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "reset",
        "",
        "process",
        "Lcom/jumio/core/processor/ProcessorState;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "extractionArea",
        "Landroid/graphics/Rect;",
        "metadata",
        "Lcom/jumio/commons/camera/Frame$Metadata;",
        "parameterInterface",
        "Lcom/jumio/core/processor/ProcessorParameterInterface;",
        "internalProcess",
        "currentFrame",
        "Lcom/jumio/core/processor/flash/FlashFrame;",
        "processFrame",
        "handleColorSpikeDetection",
        "isColorSpikeDetected",
        "referenceFrame",
        "handleLuxStabilization",
        "isLuxStabilized",
        "checkLuxVariationStability",
        "getReferenceFrame",
        "takePicture",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlashImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlashImageProcessor.kt\ncom/jumio/core/processor/flash/FlashImageProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n543#2,6:193\n295#2,2:200\n1#3:199\n*S KotlinDebug\n*F\n+ 1 FlashImageProcessor.kt\ncom/jumio/core/processor/flash/FlashImageProcessor\n*L\n158#1:193,6\n169#1:200,2\n*E\n"
    }
.end annotation


# instance fields
.field private captureTime:J

.field private colorSpikeTime:J

.field private flashRetryCounter:I

.field private requestedState:Lcom/jumio/sdk/enums/JumioFlashState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final result:Ljumio/core/u1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final toolkitProvider:Lcom/jumio/core/toolkit/ToolkitProviderInterface;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;)V
    .locals 1
    .param p1    # Lcom/jumio/core/processor/flash/FlashProcessorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/core/toolkit/ToolkitProviderInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toolkitProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/SingleImageProcessorBase;-><init>(Lcom/jumio/core/processor/SingleImageProcessorConfig;)V

    .line 4
    iput p2, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->flashRetryCounter:I

    .line 5
    iput-object p3, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->toolkitProvider:Lcom/jumio/core/toolkit/ToolkitProviderInterface;

    .line 6
    new-instance p1, Ljumio/core/u1;

    invoke-direct {p1}, Ljumio/core/u1;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    const-wide/16 p1, -0x1

    .line 7
    iput-wide p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->colorSpikeTime:J

    .line 8
    iput-wide p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->captureTime:J

    .line 9
    sget-object p1, Lcom/jumio/sdk/enums/JumioFlashState;->OFF:Lcom/jumio/sdk/enums/JumioFlashState;

    iput-object p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->requestedState:Lcom/jumio/sdk/enums/JumioFlashState;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x3

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 1
    new-instance p3, Lcom/jumio/core/toolkit/DefaultToolkitProvider;

    invoke-direct {p3}, Lcom/jumio/core/toolkit/DefaultToolkitProvider;-><init>()V

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/jumio/core/processor/flash/FlashImageProcessor;-><init>(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;)V

    return-void
.end method

.method private final checkLuxVariationStability(Ljumio/core/s1;)Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 3
    .line 4
    iget-object v0, v0, Ljumio/core/u1;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    move-object v3, v1

    .line 25
    .line 26
    check-cast v3, Ljumio/core/s1;

    .line 27
    .line 28
    iget-object v4, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 32
    move-result-wide v4

    .line 33
    .line 34
    iget-object v3, v3, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 38
    move-result-wide v6

    .line 39
    sub-long/2addr v4, v6

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    check-cast v3, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/jumio/core/models/FlashSettings;->getFlashAdaption()Lcom/jumio/core/models/FlashAdaption;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/jumio/core/models/FlashAdaption;->getLuxTimeWindow()J

    .line 61
    move-result-wide v6

    .line 62
    .line 63
    cmp-long v3, v4, v6

    .line 64
    .line 65
    if-lez v3, :cond_0

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move-object v1, v2

    .line 68
    .line 69
    :goto_0
    check-cast v1, Ljumio/core/s1;

    .line 70
    const/4 v0, 0x0

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-wide v3, v1, Ljumio/core/s1;->c:D

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    const-wide/16 v5, 0x0

    .line 81
    .line 82
    cmpl-double v3, v3, v5

    .line 83
    .line 84
    if-lez v3, :cond_2

    .line 85
    move-object v2, v1

    .line 86
    .line 87
    :cond_2
    if-eqz v2, :cond_3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 91
    move-result-wide v1

    .line 92
    .line 93
    iget-wide v3, p1, Ljumio/core/s1;->c:D

    .line 94
    div-double/2addr v3, v1

    .line 95
    .line 96
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 97
    sub-double/2addr v3, v1

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 101
    move-result-wide v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    check-cast p1, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/jumio/core/models/FlashSettings;->getFlashAdaption()Lcom/jumio/core/models/FlashAdaption;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/jumio/core/models/FlashAdaption;->getLuxThreshold()D

    .line 123
    move-result-wide v3

    .line 124
    .line 125
    cmpg-double p1, v1, v3

    .line 126
    .line 127
    if-gez p1, :cond_3

    .line 128
    const/4 p1, 0x1

    .line 129
    return p1

    .line 130
    :cond_3
    return v0
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
.end method

.method private final getReferenceFrame()Ljumio/core/s1;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->requestedState:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 3
    .line 4
    sget-object v1, Ljumio/core/t1;->a:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-ne v0, v1, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 19
    .line 20
    iget-object v0, v0, Ljumio/core/u1;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v1

    .line 35
    move-object v2, v1

    .line 36
    .line 37
    check-cast v2, Ljumio/core/s1;

    .line 38
    .line 39
    iget-object v2, v2, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 43
    move-result-wide v2

    .line 44
    .line 45
    iget-wide v4, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->captureTime:J

    .line 46
    .line 47
    cmp-long v2, v2, v4

    .line 48
    .line 49
    if-nez v2, :cond_0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    .line 53
    :goto_0
    check-cast v1, Ljumio/core/s1;

    .line 54
    return-object v1

    .line 55
    .line 56
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 60
    throw v0

    .line 61
    .line 62
    :cond_3
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 63
    .line 64
    iget-object v0, v0, Ljumio/core/u1;->a:Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    check-cast v0, Ljumio/core/s1;

    .line 71
    return-object v0
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
.end method

.method private final handleColorSpikeDetection(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->getReferenceFrame()Ljumio/core/s1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Ljumio/core/v1;->a:Ljumio/core/v1;

    .line 9
    return-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->isColorSpikeDetected(Ljumio/core/s1;Ljumio/core/s1;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 21
    move-result-wide v1

    .line 22
    .line 23
    iput-wide v1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->colorSpikeTime:J

    .line 24
    .line 25
    iget-object v1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->requestedState:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 26
    .line 27
    sget-object v2, Lcom/jumio/sdk/enums/JumioFlashState;->ON:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 28
    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 32
    .line 33
    iget-object p1, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 37
    move-result-wide v2

    .line 38
    .line 39
    iget-object p1, v0, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 43
    move-result-wide v4

    .line 44
    sub-long/2addr v2, v4

    .line 45
    .line 46
    iput-wide v2, v1, Ljumio/core/u1;->b:J

    .line 47
    .line 48
    :cond_1
    new-instance v4, Lcom/jumio/commons/camera/MeteringConfig$Builder;

    .line 49
    .line 50
    .line 51
    invoke-direct {v4}, Lcom/jumio/commons/camera/MeteringConfig$Builder;-><init>()V

    .line 52
    .line 53
    const/high16 p1, 0x3f000000    # 0.5f

    .line 54
    .line 55
    const/high16 v0, 0x3f800000    # 1.0f

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, p1, p1, v0, v0}, Lcom/jumio/commons/camera/MeteringConfig$Builder;->point(FFFF)Lcom/jumio/commons/camera/MeteringConfig$Builder;

    .line 59
    const/4 v8, 0x6

    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v5, 0x1

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static/range {v4 .. v9}, Lcom/jumio/commons/camera/MeteringConfig$Builder;->mode$default(Lcom/jumio/commons/camera/MeteringConfig$Builder;ZZZILjava/lang/Object;)Lcom/jumio/commons/camera/MeteringConfig$Builder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Lcom/jumio/commons/camera/MeteringConfig$Builder;->build()Lcom/jumio/commons/camera/MeteringConfig;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    new-instance v0, Lcom/jumio/core/processor/ProcessorState$RequestMetering;

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, p1}, Lcom/jumio/core/processor/ProcessorState$RequestMetering;-><init>(Lcom/jumio/commons/camera/MeteringConfig;)V

    .line 76
    return-object v0

    .line 77
    .line 78
    :cond_2
    sget-object p1, Ljumio/core/v1;->a:Ljumio/core/v1;

    .line 79
    return-object p1
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
.end method

.method private final handleLuxStabilization(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->getReferenceFrame()Ljumio/core/s1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Ljumio/core/w1;->a:Ljumio/core/w1;

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    iget-object v1, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 15
    move-result-wide v1

    .line 16
    .line 17
    iget-object v0, v0, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 21
    move-result-wide v3

    .line 22
    sub-long/2addr v1, v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/jumio/core/processor/SingleImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/jumio/core/models/FlashSettings;->getMinimumCaptureTime()J

    .line 36
    move-result-wide v3

    .line 37
    .line 38
    cmp-long v0, v1, v3

    .line 39
    .line 40
    if-ltz v0, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->isLuxStabilized(Ljumio/core/s1;)Z

    .line 44
    move-result v0

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 55
    .line 56
    iget-object v1, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 60
    move-result-wide v1

    .line 61
    .line 62
    iget-wide v3, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->colorSpikeTime:J

    .line 63
    sub-long/2addr v1, v3

    .line 64
    .line 65
    iput-wide v1, v0, Ljumio/core/u1;->c:J

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->takePicture(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;

    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    .line 72
    :cond_1
    iget-object p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 73
    .line 74
    const-string v0, "<this>"

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    sget-object p1, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 80
    .line 81
    sget-object p1, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 82
    .line 83
    new-instance p1, Lcom/jumio/core/processor/ProcessorState$Finished;

    .line 84
    .line 85
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 86
    .line 87
    const-string v1, "FRONT_WITH_FLASH"

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, v1, v0}, Lcom/jumio/core/processor/ProcessorState$Finished;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    return-object p1

    .line 92
    .line 93
    :cond_2
    sget-object p1, Ljumio/core/w1;->a:Ljumio/core/w1;

    .line 94
    return-object p1
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
.end method

.method private final internalProcess(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v0, v0, Lcom/jumio/core/processor/ProcessorState$TakePicture;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/jumio/sdk/enums/JumioFlashState;->OFF:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->requestedState:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 13
    .line 14
    new-instance v0, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;-><init>(Lcom/jumio/sdk/enums/JumioFlashState;)V

    .line 18
    return-object v0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    instance-of v0, v0, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->handleColorSpikeDetection(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;

    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->shouldStart()Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    sget-object p1, Lcom/jumio/sdk/enums/JumioFlashState;->ON:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->requestedState:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 48
    .line 49
    new-instance v0, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p1}, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;-><init>(Lcom/jumio/sdk/enums/JumioFlashState;)V

    .line 53
    return-object v0

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    instance-of v0, v0, Ljumio/core/v1;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->handleColorSpikeDetection(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;

    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    instance-of v0, v0, Lcom/jumio/core/processor/ProcessorState$RequestMetering;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    sget-object p1, Ljumio/core/w1;->a:Ljumio/core/w1;

    .line 77
    return-object p1

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    instance-of v0, v0, Ljumio/core/w1;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->handleLuxStabilization(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;

    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    .line 92
    :cond_5
    sget-object p1, Lcom/jumio/core/processor/ProcessorState$Processing;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Processing;

    .line 93
    return-object p1
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
.end method

.method private final isColorSpikeDetected(Ljumio/core/s1;Ljumio/core/s1;)Z
    .locals 6

    .line 1
    .line 2
    iget-object v0, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p2, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 12
    move-result-wide v2

    .line 13
    sub-long/2addr v0, v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashSettings;->getFlashDetection()Lcom/jumio/core/models/FlashDetection;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashDetection;->getTimeout()J

    .line 35
    move-result-wide v2

    .line 36
    .line 37
    cmp-long v0, v0, v2

    .line 38
    const/4 v1, 0x1

    .line 39
    .line 40
    if-lez v0, :cond_0

    .line 41
    return v1

    .line 42
    .line 43
    :cond_0
    iget-wide v2, p1, Ljumio/core/s1;->b:D

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    cmpg-double p1, v2, v4

    .line 48
    const/4 v0, 0x0

    .line 49
    .line 50
    if-lez p1, :cond_2

    .line 51
    .line 52
    iget-wide p1, p2, Ljumio/core/s1;->b:D

    .line 53
    .line 54
    cmpg-double v4, p1, v4

    .line 55
    .line 56
    if-gtz v4, :cond_1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    div-double/2addr v2, p1

    .line 59
    .line 60
    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 61
    sub-double/2addr v2, p1

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 65
    move-result-wide p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    check-cast v2, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashSettings;->getFlashDetection()Lcom/jumio/core/models/FlashDetection;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashDetection;->getColorShiftThreshold()D

    .line 87
    move-result-wide v2

    .line 88
    .line 89
    cmpl-double p1, p1, v2

    .line 90
    .line 91
    if-lez p1, :cond_2

    .line 92
    return v1

    .line 93
    :cond_2
    :goto_0
    return v0
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
.end method

.method private final isLuxStabilized(Ljumio/core/s1;)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->colorSpikeTime:J

    .line 9
    sub-long/2addr v0, v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    check-cast v2, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashSettings;->getFlashAdaption()Lcom/jumio/core/models/FlashAdaption;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashAdaption;->getLuxTimeWindow()J

    .line 31
    move-result-wide v2

    .line 32
    .line 33
    cmp-long v2, v0, v2

    .line 34
    .line 35
    if-gez v2, :cond_0

    .line 36
    const/4 p1, 0x0

    .line 37
    return p1

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/jumio/core/processor/ProcessorImage$FlashImage;->getSettings()Lcom/jumio/core/models/FlashSettings;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashSettings;->getFlashAdaption()Lcom/jumio/core/models/FlashAdaption;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/jumio/core/models/FlashAdaption;->getTimeout()J

    .line 59
    move-result-wide v2

    .line 60
    .line 61
    cmp-long v0, v0, v2

    .line 62
    .line 63
    if-lez v0, :cond_1

    .line 64
    const/4 p1, 0x1

    .line 65
    return p1

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->checkLuxVariationStability(Ljumio/core/s1;)Z

    .line 69
    move-result p1

    .line 70
    return p1
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
.end method

.method private final processFrame(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/Frame$Metadata;)Ljumio/core/s1;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getIso()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getShutterSpeed()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getAperture()F

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getAperture()F

    .line 24
    move-result v1

    .line 25
    mul-float/2addr v1, v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getShutterSpeed()J

    .line 29
    move-result-wide v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Frame$Metadata;->getIso()I

    .line 33
    move-result v0

    .line 34
    int-to-long v4, v0

    .line 35
    mul-long/2addr v2, v4

    .line 36
    long-to-float v0, v2

    .line 37
    div-float/2addr v1, v0

    .line 38
    float-to-double v0, v1

    .line 39
    :goto_0
    move-wide v6, v0

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_0
    const-wide/16 v0, 0x0

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->toolkitProvider:Lcom/jumio/core/toolkit/ToolkitProviderInterface;

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Lcom/jumio/core/toolkit/ToolkitProviderInterface;->create()Lcom/jumio/core/toolkit/ToolkitInterface;

    .line 49
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    const/4 v0, 0x2

    .line 51
    const/4 v2, 0x0

    .line 52
    .line 53
    .line 54
    :try_start_1
    invoke-static {v1, p1, v2, v0, v2}, Lcom/jumio/core/toolkit/ToolkitInterface;->averageColor$default(Lcom/jumio/core/toolkit/ToolkitInterface;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)I

    .line 55
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    :try_start_2
    invoke-static {v1, v2}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 59
    :goto_2
    move v3, p1

    .line 60
    goto :goto_4

    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    goto :goto_3

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    :catchall_1
    move-exception v0

    .line 68
    .line 69
    .line 70
    :try_start_4
    invoke-static {v1, p1}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 71
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 72
    .line 73
    .line 74
    :goto_3
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 75
    const/4 p1, 0x0

    .line 76
    goto :goto_2

    .line 77
    .line 78
    .line 79
    :goto_4
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 80
    move-result p1

    .line 81
    .line 82
    .line 83
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 84
    move-result v0

    .line 85
    add-int/2addr v0, p1

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 89
    move-result p1

    .line 90
    add-int/2addr p1, v0

    .line 91
    int-to-double v0, p1

    .line 92
    .line 93
    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    .line 94
    .line 95
    div-double v4, v0, v4

    .line 96
    .line 97
    new-instance v2, Ljumio/core/s1;

    .line 98
    move-object v8, p2

    .line 99
    .line 100
    .line 101
    invoke-direct/range {v2 .. v8}, Ljumio/core/s1;-><init>(IDDLcom/jumio/commons/camera/Frame$Metadata;)V

    .line 102
    .line 103
    iget-object p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->result:Ljumio/core/u1;

    .line 104
    .line 105
    iget-object p1, p1, Ljumio/core/u1;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    return-object v2
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
.end method

.method private final takePicture(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->hasFlashFired()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/jumio/core/processor/a;->setImageStarted(Z)V

    .line 13
    .line 14
    iget-object p1, p1, Ljumio/core/s1;->d:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame$Metadata;->getTimestamp()J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->captureTime:J

    .line 21
    const/4 p1, 0x3

    .line 22
    .line 23
    iput p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->flashRetryCounter:I

    .line 24
    .line 25
    new-instance v0, Lcom/jumio/core/processor/ProcessorState$TakePicture;

    .line 26
    const/4 v4, 0x6

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    const-string v1, "FRONT_WITH_FLASH"

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/processor/ProcessorState$TakePicture;-><init>(Ljava/lang/String;Lcom/jumio/commons/camera/ImageMetadata;Lcom/jumio/commons/camera/Size;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    return-object v0

    .line 36
    .line 37
    :cond_0
    iget p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->flashRetryCounter:I

    .line 38
    .line 39
    if-lez p1, :cond_1

    .line 40
    .line 41
    add-int/lit8 p1, p1, -0x1

    .line 42
    .line 43
    iput p1, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->flashRetryCounter:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->resetStart()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->shouldStart()Z

    .line 50
    .line 51
    sget-object p1, Lcom/jumio/core/processor/ProcessorState$Processing;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Processing;

    .line 52
    return-object p1

    .line 53
    .line 54
    :cond_1
    sget-object p1, Lcom/jumio/core/processor/ProcessorState$Skip;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Skip;

    .line 55
    return-object p1
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
.end method


# virtual methods
.method public checkRequirements(Lcom/jumio/commons/camera/CameraSettings;)Z
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "cameraSettings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lcom/jumio/commons/camera/CameraCapabilities;->getHasFlash()Z

    .line 13
    move-result p1

    .line 14
    return p1
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
.end method

.method public process(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;)Lcom/jumio/core/processor/ProcessorState;
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/commons/camera/Frame$Metadata;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/core/processor/ProcessorParameterInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "bitmap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "cameraSettings"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p2, "extractionArea"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string p2, "metadata"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string p2, "parameterInterface"

    .line 23
    .line 24
    .line 25
    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, p4}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->processFrame(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/Frame$Metadata;)Ljumio/core/s1;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/flash/FlashImageProcessor;->internalProcess(Ljumio/core/s1;)Lcom/jumio/core/processor/ProcessorState;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    sget-object p2, Lcom/jumio/core/processor/ProcessorState$Processing;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Processing;

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result p2

    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/jumio/core/processor/a;->setCurrentState(Lcom/jumio/core/processor/ProcessorState;)V

    .line 45
    :cond_0
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
.end method

.method public reset()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/processor/a;->reset()V

    .line 4
    const/4 v0, 0x3

    .line 5
    .line 6
    iput v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->flashRetryCounter:I

    .line 7
    .line 8
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->colorSpikeTime:J

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->captureTime:J

    .line 13
    .line 14
    sget-object v0, Lcom/jumio/sdk/enums/JumioFlashState;->OFF:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/jumio/core/processor/flash/FlashImageProcessor;->requestedState:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 17
    return-void
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
.end method
