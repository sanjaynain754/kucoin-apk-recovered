.class public final Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;
.super Ljava/lang/Object;
.source "ImageEditorModuleImpl.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 82\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J[\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000c\"\u0004\u0008\u0000\u0010\t2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJi\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000cH\u0002\u00a2\u0006\u0004\u0008%\u0010&Jy\u0010-\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000cH\u0002\u00a2\u0006\u0004\u0008-\u0010.JA\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0010\u001a\u00020\u000b2&\u0010#\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000cH\u0002\u00a2\u0006\u0004\u00080\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u0006:"
    }
    d2 = {
        "Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;",
        "",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "",
        "n",
        "()V",
        "V",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "map",
        "p",
        "(Ljava/util/HashMap;)Ljava/util/HashMap;",
        "uri",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "options",
        "Lcom/facebook/react/bridge/Promise;",
        "promise",
        "l",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V",
        "j",
        "Ljava/io/File;",
        "directory",
        "h",
        "(Ljava/io/File;)V",
        "Landroid/graphics/BitmapFactory$Options;",
        "outOptions",
        "",
        "x",
        "y",
        "width",
        "height",
        "headers",
        "Landroid/graphics/Bitmap;",
        "m",
        "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIILjava/util/HashMap;)Landroid/graphics/Bitmap;",
        "xPos",
        "yPos",
        "rectWidth",
        "rectHeight",
        "outputWidth",
        "outputHeight",
        "k",
        "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIIIILjava/util/HashMap;)Landroid/graphics/Bitmap;",
        "Ljava/io/InputStream;",
        "o",
        "(Ljava/lang/String;Ljava/util/HashMap;)Ljava/io/InputStream;",
        "a",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "Lkotlinx/coroutines/m0;",
        "b",
        "Lkotlinx/coroutines/m0;",
        "moduleCoroutineScope",
        "c",
        "Companion",
        "react-native-community_image-editor_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nImageEditorModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditorModuleImpl.kt\ncom/reactnativecommunity/imageeditor/ImageEditorModuleImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,672:1\n503#2,7:673\n1#3:680\n216#4,2:681\n*S KotlinDebug\n*F\n+ 1 ImageEditorModuleImpl.kt\ncom/reactnativecommunity/imageeditor/ImageEditorModuleImpl\n*L\n96#1:673,7\n357#1:681,2\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:[Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/facebook/react/bridge/ReactApplicationContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 92

    .line 1
    .line 2
    new-instance v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->c:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;

    .line 9
    .line 10
    const-string v0, "content"

    .line 11
    .line 12
    const-string v1, "android.resource"

    .line 13
    .line 14
    const-string v2, "file"

    .line 15
    .line 16
    .line 17
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->d:Ljava/util/List;

    .line 25
    .line 26
    const-string v90, "UserComment"

    .line 27
    .line 28
    const-string v91, "WhiteBalance"

    .line 29
    .line 30
    const-string v1, "ApertureValue"

    .line 31
    .line 32
    const-string v2, "MaxApertureValue"

    .line 33
    .line 34
    const-string v3, "MeteringMode"

    .line 35
    .line 36
    const-string v4, "Artist"

    .line 37
    .line 38
    const-string v5, "BitsPerSample"

    .line 39
    .line 40
    const-string v6, "Compression"

    .line 41
    .line 42
    const-string v7, "BodySerialNumber"

    .line 43
    .line 44
    const-string v8, "BrightnessValue"

    .line 45
    .line 46
    const-string v9, "Contrast"

    .line 47
    .line 48
    const-string v10, "CameraOwnerName"

    .line 49
    .line 50
    const-string v11, "ColorSpace"

    .line 51
    .line 52
    const-string v12, "Copyright"

    .line 53
    .line 54
    const-string v13, "DateTime"

    .line 55
    .line 56
    const-string v14, "DateTimeDigitized"

    .line 57
    .line 58
    const-string v15, "DateTimeOriginal"

    .line 59
    .line 60
    const-string v16, "DeviceSettingDescription"

    .line 61
    .line 62
    const-string v17, "DigitalZoomRatio"

    .line 63
    .line 64
    const-string v18, "ExifVersion"

    .line 65
    .line 66
    const-string v19, "ExposureBiasValue"

    .line 67
    .line 68
    const-string v20, "ExposureIndex"

    .line 69
    .line 70
    const-string v21, "ExposureMode"

    .line 71
    .line 72
    const-string v22, "ExposureTime"

    .line 73
    .line 74
    const-string v23, "ExposureProgram"

    .line 75
    .line 76
    const-string v24, "Flash"

    .line 77
    .line 78
    const-string v25, "FlashEnergy"

    .line 79
    .line 80
    const-string v26, "FocalLength"

    .line 81
    .line 82
    const-string v27, "FocalLengthIn35mmFilm"

    .line 83
    .line 84
    const-string v28, "FocalPlaneResolutionUnit"

    .line 85
    .line 86
    const-string v29, "FocalPlaneXResolution"

    .line 87
    .line 88
    const-string v30, "FocalPlaneYResolution"

    .line 89
    .line 90
    const-string v31, "PhotometricInterpretation"

    .line 91
    .line 92
    const-string v32, "PlanarConfiguration"

    .line 93
    .line 94
    const-string v33, "FNumber"

    .line 95
    .line 96
    const-string v34, "GainControl"

    .line 97
    .line 98
    const-string v35, "Gamma"

    .line 99
    .line 100
    const-string v36, "GPSAltitude"

    .line 101
    .line 102
    const-string v37, "GPSAltitudeRef"

    .line 103
    .line 104
    const-string v38, "GPSAreaInformation"

    .line 105
    .line 106
    const-string v39, "GPSDateStamp"

    .line 107
    .line 108
    const-string v40, "GPSDOP"

    .line 109
    .line 110
    const-string v41, "GPSLatitude"

    .line 111
    .line 112
    const-string v42, "GPSLatitudeRef"

    .line 113
    .line 114
    const-string v43, "GPSLongitude"

    .line 115
    .line 116
    const-string v44, "GPSLongitudeRef"

    .line 117
    .line 118
    const-string v45, "GPSStatus"

    .line 119
    .line 120
    const-string v46, "GPSDestBearing"

    .line 121
    .line 122
    const-string v47, "GPSDestBearingRef"

    .line 123
    .line 124
    const-string v48, "GPSDestDistance"

    .line 125
    .line 126
    const-string v49, "GPSDestDistanceRef"

    .line 127
    .line 128
    const-string v50, "GPSDestLatitude"

    .line 129
    .line 130
    const-string v51, "GPSDestLatitudeRef"

    .line 131
    .line 132
    const-string v52, "GPSDestLongitude"

    .line 133
    .line 134
    const-string v53, "GPSDestLongitudeRef"

    .line 135
    .line 136
    const-string v54, "GPSDifferential"

    .line 137
    .line 138
    const-string v55, "GPSImgDirection"

    .line 139
    .line 140
    const-string v56, "GPSImgDirectionRef"

    .line 141
    .line 142
    const-string v57, "GPSMapDatum"

    .line 143
    .line 144
    const-string v58, "GPSMeasureMode"

    .line 145
    .line 146
    const-string v59, "GPSProcessingMethod"

    .line 147
    .line 148
    const-string v60, "GPSSatellites"

    .line 149
    .line 150
    const-string v61, "GPSSpeed"

    .line 151
    .line 152
    const-string v62, "GPSSpeedRef"

    .line 153
    .line 154
    const-string v63, "GPSStatus"

    .line 155
    .line 156
    const-string v64, "GPSTimeStamp"

    .line 157
    .line 158
    const-string v65, "GPSTrack"

    .line 159
    .line 160
    const-string v66, "GPSTrackRef"

    .line 161
    .line 162
    const-string v67, "GPSVersionID"

    .line 163
    .line 164
    const-string v68, "ImageDescription"

    .line 165
    .line 166
    const-string v69, "ImageUniqueID"

    .line 167
    .line 168
    const-string v70, "ISOSpeed"

    .line 169
    .line 170
    const-string v71, "PhotographicSensitivity"

    .line 171
    .line 172
    const-string v72, "JPEGInterchangeFormat"

    .line 173
    .line 174
    const-string v73, "JPEGInterchangeFormatLength"

    .line 175
    .line 176
    const-string v74, "LensMake"

    .line 177
    .line 178
    const-string v75, "LensModel"

    .line 179
    .line 180
    const-string v76, "LensSerialNumber"

    .line 181
    .line 182
    const-string v77, "LensSpecification"

    .line 183
    .line 184
    const-string v78, "LightSource"

    .line 185
    .line 186
    const-string v79, "Make"

    .line 187
    .line 188
    const-string v80, "MakerNote"

    .line 189
    .line 190
    const-string v81, "Model"

    .line 191
    .line 192
    const-string v82, "Orientation"

    .line 193
    .line 194
    const-string v83, "Saturation"

    .line 195
    .line 196
    const-string v84, "Sharpness"

    .line 197
    .line 198
    const-string v85, "ShutterSpeedValue"

    .line 199
    .line 200
    const-string v86, "Software"

    .line 201
    .line 202
    const-string v87, "SubjectDistance"

    .line 203
    .line 204
    const-string v88, "SubjectDistanceRange"

    .line 205
    .line 206
    const-string v89, "SubjectLocation"

    .line 207
    .line 208
    .line 209
    filled-new-array/range {v1 .. v91}, [Ljava/lang/String;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    sput-object v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->e:[Ljava/lang/String;

    .line 213
    return-void
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

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reactContext"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lkotlinx/coroutines/z0;->a()Lkotlinx/coroutines/j0;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->b:Lkotlinx/coroutines/m0;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->j()V

    .line 25
    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->i(Ljava/io/File;Ljava/lang/String;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic b(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Ljava/io/File;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->h(Ljava/io/File;)V

    .line 4
    return-void
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

.method public static final synthetic c(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIIIILjava/util/HashMap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p9}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->k(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIIIILjava/util/HashMap;)Landroid/graphics/Bitmap;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic d(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIILjava/util/HashMap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->m(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIILjava/util/HashMap;)Landroid/graphics/Bitmap;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic e()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->e:[Ljava/lang/String;

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

.method public static final synthetic f()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->d:Ljava/util/List;

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

.method public static final synthetic g(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    return-object p0
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

.method public static final i(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    const/4 p0, 0x2

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-string v1, "ReactNative_cropped_image_"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    move-result p0

    .line 13
    return p0
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
.method public final h(Ljava/io/File;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/reactnativecommunity/imageeditor/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/reactnativecommunity/imageeditor/b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast v0, Ljava/io/File;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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
.end method

.method public final j()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cleanTask$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, v1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cleanTask$1;-><init>(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public final k(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIIIILjava/util/HashMap;)Landroid/graphics/Bitmap;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/BitmapFactory$Options;",
            "Ljava/lang/String;",
            "IIIIII",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    move-object/from16 v3, p9

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->o(Ljava/lang/String;Ljava/util/HashMap;)Ljava/io/InputStream;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    if-eqz v3, :cond_d

    .line 18
    .line 19
    :try_start_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v6, 0x1f

    .line 22
    const/4 v7, 0x0

    .line 23
    .line 24
    if-lt v5, v6, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Lcom/reactnativecommunity/imageeditor/a;->a(Ljava/io/InputStream;)Landroid/graphics/BitmapRegionDecoder;

    .line 28
    move-result-object v5

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object v1, v0

    .line 32
    .line 33
    goto/16 :goto_a

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-static {v3, v7}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    :goto_0
    if-eqz v5, :cond_c

    .line 40
    .line 41
    sget-object v6, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->c:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;

    .line 42
    .line 43
    iget-object v8, v1, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    const-string/jumbo v9, "parse(...)"

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v8, v2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$getOrientation(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Landroid/content/Context;Landroid/net/Uri;)I

    .line 57
    move-result v2

    .line 58
    .line 59
    const/16 v8, 0x10e

    .line 60
    .line 61
    const/16 v9, 0x5a

    .line 62
    .line 63
    if-eq v2, v9, :cond_3

    .line 64
    .line 65
    const/16 v10, 0xb4

    .line 66
    .line 67
    if-eq v2, v10, :cond_2

    .line 68
    .line 69
    if-eq v2, v8, :cond_1

    .line 70
    .line 71
    .line 72
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    move-result-object v10

    .line 74
    .line 75
    .line 76
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    move-result-object v11

    .line 78
    .line 79
    .line 80
    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 81
    move-result-object v10

    .line 82
    goto :goto_1

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-virtual {v5}, Landroid/graphics/BitmapRegionDecoder;->getWidth()I

    .line 86
    move-result v10

    .line 87
    .line 88
    sub-int v10, v10, p6

    .line 89
    .line 90
    sub-int v10, v10, p4

    .line 91
    .line 92
    .line 93
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    move-result-object v10

    .line 95
    .line 96
    .line 97
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    move-result-object v11

    .line 99
    .line 100
    .line 101
    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 102
    move-result-object v10

    .line 103
    goto :goto_1

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/BitmapRegionDecoder;->getWidth()I

    .line 107
    move-result v10

    .line 108
    .line 109
    sub-int v10, v10, p5

    .line 110
    .line 111
    sub-int v10, v10, p3

    .line 112
    .line 113
    .line 114
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    move-result-object v10

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Landroid/graphics/BitmapRegionDecoder;->getHeight()I

    .line 119
    move-result v11

    .line 120
    .line 121
    sub-int v11, v11, p6

    .line 122
    .line 123
    sub-int v11, v11, p4

    .line 124
    .line 125
    .line 126
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    move-result-object v11

    .line 128
    .line 129
    .line 130
    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 131
    move-result-object v10

    .line 132
    goto :goto_1

    .line 133
    .line 134
    .line 135
    :cond_3
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    move-result-object v10

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Landroid/graphics/BitmapRegionDecoder;->getHeight()I

    .line 140
    move-result v11

    .line 141
    .line 142
    sub-int v11, v11, p5

    .line 143
    .line 144
    sub-int v11, v11, p3

    .line 145
    .line 146
    .line 147
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    move-result-object v11

    .line 149
    .line 150
    .line 151
    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 152
    move-result-object v10

    .line 153
    .line 154
    .line 155
    :goto_1
    invoke-virtual {v10}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 156
    move-result-object v11

    .line 157
    .line 158
    check-cast v11, Ljava/lang/Number;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 162
    move-result v11

    .line 163
    .line 164
    .line 165
    invoke-virtual {v10}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 166
    move-result-object v10

    .line 167
    .line 168
    check-cast v10, Ljava/lang/Number;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 172
    move-result v10

    .line 173
    .line 174
    if-eq v2, v9, :cond_4

    .line 175
    .line 176
    if-eq v2, v8, :cond_4

    .line 177
    .line 178
    .line 179
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    move-result-object v12

    .line 181
    .line 182
    .line 183
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    move-result-object v13

    .line 185
    .line 186
    .line 187
    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 188
    move-result-object v12

    .line 189
    goto :goto_2

    .line 190
    .line 191
    .line 192
    :cond_4
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    move-result-object v12

    .line 194
    .line 195
    .line 196
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    move-result-object v13

    .line 198
    .line 199
    .line 200
    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 201
    move-result-object v12

    .line 202
    .line 203
    .line 204
    :goto_2
    invoke-virtual {v12}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 205
    move-result-object v13

    .line 206
    .line 207
    check-cast v13, Ljava/lang/Number;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 211
    move-result v13

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 215
    move-result-object v12

    .line 216
    .line 217
    check-cast v12, Ljava/lang/Number;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 221
    move-result v12

    .line 222
    .line 223
    if-eq v2, v9, :cond_5

    .line 224
    .line 225
    if-eq v2, v8, :cond_5

    .line 226
    .line 227
    .line 228
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    move-result-object v2

    .line 230
    .line 231
    .line 232
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    move-result-object v8

    .line 234
    .line 235
    .line 236
    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 237
    move-result-object v2

    .line 238
    goto :goto_3

    .line 239
    .line 240
    .line 241
    :cond_5
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    move-result-object v2

    .line 243
    .line 244
    .line 245
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    move-result-object v8

    .line 247
    .line 248
    .line 249
    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 250
    move-result-object v2

    .line 251
    .line 252
    .line 253
    :goto_3
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 254
    move-result-object v8

    .line 255
    .line 256
    check-cast v8, Ljava/lang/Number;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 260
    move-result v8

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 264
    move-result-object v2

    .line 265
    .line 266
    check-cast v2, Ljava/lang/Number;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 270
    move-result v2

    .line 271
    int-to-float v9, v13

    .line 272
    int-to-float v14, v12

    .line 273
    .line 274
    div-float v15, v9, v14

    .line 275
    int-to-float v4, v8

    .line 276
    int-to-float v7, v2

    .line 277
    .line 278
    div-float v16, v4, v7

    .line 279
    .line 280
    cmpl-float v15, v15, v16

    .line 281
    .line 282
    if-lez v15, :cond_6

    .line 283
    const/4 v15, 0x1

    .line 284
    goto :goto_4

    .line 285
    :cond_6
    const/4 v15, 0x0

    .line 286
    .line 287
    :goto_4
    if-eqz v15, :cond_7

    .line 288
    .line 289
    mul-float v17, v14, v16

    .line 290
    goto :goto_5

    .line 291
    .line 292
    :cond_7
    move/from16 v17, v9

    .line 293
    .line 294
    :goto_5
    if-eqz v15, :cond_8

    .line 295
    .line 296
    move/from16 v16, v14

    .line 297
    goto :goto_6

    .line 298
    .line 299
    :cond_8
    div-float v16, v9, v16

    .line 300
    :goto_6
    const/4 v1, 0x2

    .line 301
    .line 302
    if-eqz v15, :cond_9

    .line 303
    int-to-float v11, v11

    .line 304
    .line 305
    sub-float v18, v9, v17

    .line 306
    .line 307
    move/from16 p2, v4

    .line 308
    int-to-float v4, v1

    .line 309
    .line 310
    div-float v18, v18, v4

    .line 311
    .line 312
    add-float v11, v11, v18

    .line 313
    goto :goto_7

    .line 314
    .line 315
    :cond_9
    move/from16 p2, v4

    .line 316
    int-to-float v11, v11

    .line 317
    .line 318
    :goto_7
    if-eqz v15, :cond_a

    .line 319
    int-to-float v1, v10

    .line 320
    goto :goto_8

    .line 321
    :cond_a
    int-to-float v4, v10

    .line 322
    .line 323
    sub-float v10, v14, v16

    .line 324
    int-to-float v1, v1

    .line 325
    div-float/2addr v10, v1

    .line 326
    .line 327
    add-float v1, v4, v10

    .line 328
    .line 329
    :goto_8
    if-eqz v15, :cond_b

    .line 330
    div-float/2addr v7, v14

    .line 331
    goto :goto_9

    .line 332
    .line 333
    :cond_b
    div-float v7, p2, v9

    .line 334
    .line 335
    .line 336
    :goto_9
    invoke-static {v6, v13, v12, v8, v2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$getDecodeSampleSize(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;IIII)I

    .line 337
    move-result v2

    .line 338
    .line 339
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 340
    int-to-float v2, v2

    .line 341
    div-float/2addr v11, v2

    .line 342
    .line 343
    .line 344
    invoke-static {v11}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 345
    move-result v2

    .line 346
    .line 347
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 348
    int-to-float v4, v4

    .line 349
    div-float/2addr v1, v4

    .line 350
    .line 351
    .line 352
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 353
    move-result v1

    .line 354
    .line 355
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 356
    int-to-float v4, v4

    .line 357
    .line 358
    div-float v17, v17, v4

    .line 359
    .line 360
    .line 361
    invoke-static/range {v17 .. v17}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 362
    move-result v4

    .line 363
    .line 364
    iget v6, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 365
    int-to-float v6, v6

    .line 366
    .line 367
    div-float v16, v16, v6

    .line 368
    .line 369
    .line 370
    invoke-static/range {v16 .. v16}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 371
    move-result v6

    .line 372
    .line 373
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 374
    int-to-float v8, v8

    .line 375
    mul-float/2addr v7, v8

    .line 376
    .line 377
    new-instance v8, Landroid/graphics/Matrix;

    .line 378
    .line 379
    .line 380
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v8, v7, v7}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 384
    .line 385
    new-instance v7, Landroid/graphics/Rect;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v5}, Landroid/graphics/BitmapRegionDecoder;->getWidth()I

    .line 389
    move-result v9

    .line 390
    .line 391
    .line 392
    invoke-virtual {v5}, Landroid/graphics/BitmapRegionDecoder;->getHeight()I

    .line 393
    move-result v10

    .line 394
    const/4 v11, 0x0

    .line 395
    .line 396
    .line 397
    invoke-direct {v7, v11, v11, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v5, v7, v0}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 401
    move-result-object v0

    .line 402
    const/4 v5, 0x1

    .line 403
    .line 404
    move-object/from16 p1, v0

    .line 405
    .line 406
    move/from16 p3, v1

    .line 407
    .line 408
    move/from16 p2, v2

    .line 409
    .line 410
    move/from16 p4, v4

    .line 411
    .line 412
    move/from16 p7, v5

    .line 413
    .line 414
    move/from16 p5, v6

    .line 415
    .line 416
    move-object/from16 p6, v8

    .line 417
    .line 418
    .line 419
    invoke-static/range {p1 .. p7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 420
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 421
    const/4 v1, 0x0

    .line 422
    .line 423
    .line 424
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 425
    return-object v0

    .line 426
    .line 427
    :cond_c
    :try_start_1
    new-instance v0, Ljava/lang/Error;

    .line 428
    .line 429
    new-instance v1, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 433
    .line 434
    const-string v4, "Could not create bitmap decoder. Uri: "

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    move-result-object v1

    .line 445
    .line 446
    .line 447
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 448
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 449
    :goto_a
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 450
    :catchall_1
    move-exception v0

    .line 451
    .line 452
    .line 453
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 454
    throw v0

    .line 455
    :cond_d
    const/4 v1, 0x0

    .line 456
    return-object v1
.end method

.method public final l(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 20
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/react/bridge/Promise;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v3, p0

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    move-object/from16 v12, p3

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "options"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "promise"

    .line 16
    .line 17
    .line 18
    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    const-string v1, "headers"

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    .line 34
    .line 35
    if-ne v2, v5, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v1, v4

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v3, v1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->p(Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 51
    move-result-object v1

    .line 52
    move-object v9, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v9, v4

    .line 55
    .line 56
    :goto_1
    const-string v1, "format"

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 60
    move-result v2

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v1

    .line 67
    move-object v10, v1

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move-object v10, v4

    .line 70
    .line 71
    .line 72
    :goto_2
    const-string/jumbo v1, "offset"

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 82
    move-result-object v1

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move-object v1, v4

    .line 85
    .line 86
    .line 87
    :goto_3
    const-string/jumbo v2, "size"

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 91
    move-result v5

    .line 92
    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    :cond_4
    const-string v2, "includeBase64"

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 103
    move-result v5

    .line 104
    .line 105
    if-eqz v5, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 109
    move-result v2

    .line 110
    move v13, v2

    .line 111
    goto :goto_4

    .line 112
    :cond_5
    const/4 v13, 0x0

    .line 113
    .line 114
    .line 115
    :goto_4
    const-string/jumbo v2, "quality"

    .line 116
    .line 117
    .line 118
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 119
    move-result v5

    .line 120
    .line 121
    const/16 v7, 0x64

    .line 122
    .line 123
    if-eqz v5, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 127
    move-result-wide v14

    .line 128
    const/4 v2, 0x0

    .line 129
    int-to-double v5, v7

    .line 130
    mul-double/2addr v14, v5

    .line 131
    double-to-int v5, v14

    .line 132
    :goto_5
    move v11, v5

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    const/4 v2, 0x0

    .line 135
    .line 136
    const/16 v5, 0x5a

    .line 137
    goto :goto_5

    .line 138
    .line 139
    :goto_6
    if-eqz v1, :cond_b

    .line 140
    .line 141
    if-eqz v4, :cond_b

    .line 142
    .line 143
    .line 144
    const-string/jumbo v5, "x"

    .line 145
    .line 146
    .line 147
    invoke-interface {v1, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 148
    move-result v6

    .line 149
    .line 150
    if-eqz v6, :cond_b

    .line 151
    .line 152
    .line 153
    const-string/jumbo v6, "y"

    .line 154
    .line 155
    .line 156
    invoke-interface {v1, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 157
    move-result v8

    .line 158
    .line 159
    if-eqz v8, :cond_b

    .line 160
    .line 161
    .line 162
    const-string/jumbo v8, "width"

    .line 163
    .line 164
    .line 165
    invoke-interface {v4, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 166
    move-result v14

    .line 167
    .line 168
    if-eqz v14, :cond_b

    .line 169
    .line 170
    const-string v14, "height"

    .line 171
    .line 172
    .line 173
    invoke-interface {v4, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 174
    move-result v15

    .line 175
    .line 176
    if-eqz v15, :cond_b

    .line 177
    .line 178
    if-eqz p1, :cond_a

    .line 179
    .line 180
    .line 181
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 182
    move-result v15

    .line 183
    .line 184
    if-eqz v15, :cond_a

    .line 185
    .line 186
    if-gt v11, v7, :cond_9

    .line 187
    .line 188
    if-gez v11, :cond_7

    .line 189
    .line 190
    goto/16 :goto_8

    .line 191
    :cond_7
    move v7, v2

    .line 192
    .line 193
    .line 194
    invoke-interface {v1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 195
    move-result-wide v2

    .line 196
    double-to-int v5, v2

    .line 197
    .line 198
    .line 199
    invoke-interface {v1, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 200
    move-result-wide v1

    .line 201
    double-to-int v6, v1

    .line 202
    .line 203
    .line 204
    invoke-interface {v4, v8}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 205
    move-result-wide v1

    .line 206
    double-to-int v1, v1

    .line 207
    .line 208
    .line 209
    invoke-interface {v4, v14}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 210
    move-result-wide v2

    .line 211
    double-to-int v2, v2

    .line 212
    .line 213
    const-string v3, "displaySize"

    .line 214
    .line 215
    .line 216
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 217
    move-result v4

    .line 218
    .line 219
    if-eqz v4, :cond_8

    .line 220
    .line 221
    .line 222
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 227
    .line 228
    new-instance v3, Lkotlin/Pair;

    .line 229
    .line 230
    .line 231
    invoke-interface {v0, v8}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 232
    move-result-wide v7

    .line 233
    double-to-int v4, v7

    .line 234
    .line 235
    .line 236
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-interface {v0, v14}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 241
    move-result-wide v7

    .line 242
    double-to-int v0, v7

    .line 243
    .line 244
    .line 245
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    move-result-object v0

    .line 247
    .line 248
    .line 249
    invoke-direct {v3, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    goto :goto_7

    .line 251
    .line 252
    :cond_8
    new-instance v3, Lkotlin/Pair;

    .line 253
    .line 254
    .line 255
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    move-result-object v0

    .line 257
    .line 258
    .line 259
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    move-result-object v4

    .line 261
    .line 262
    .line 263
    invoke-direct {v3, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :goto_7
    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 267
    move-result-object v0

    .line 268
    .line 269
    check-cast v0, Ljava/lang/Number;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 273
    move-result v0

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 277
    move-result-object v3

    .line 278
    .line 279
    check-cast v3, Ljava/lang/Number;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 283
    move-result v3

    .line 284
    .line 285
    move-object/from16 v4, p0

    .line 286
    .line 287
    iget-object v15, v4, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->b:Lkotlinx/coroutines/m0;

    .line 288
    .line 289
    new-instance v17, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;

    .line 290
    const/4 v14, 0x0

    .line 291
    move v7, v1

    .line 292
    move v8, v2

    .line 293
    move v2, v3

    .line 294
    move-object v3, v4

    .line 295
    .line 296
    move-object/from16 v4, p1

    .line 297
    move v1, v0

    .line 298
    .line 299
    move-object/from16 v0, v17

    .line 300
    .line 301
    .line 302
    invoke-direct/range {v0 .. v14}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;-><init>(IILcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Ljava/lang/String;IIIILjava/util/HashMap;Ljava/lang/String;ILcom/facebook/react/bridge/Promise;ZLkotlin/coroutines/Continuation;)V

    .line 303
    .line 304
    const/16 v18, 0x3

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    move-object v14, v15

    .line 308
    const/4 v15, 0x0

    .line 309
    .line 310
    const/16 v16, 0x0

    .line 311
    .line 312
    .line 313
    invoke-static/range {v14 .. v19}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 314
    return-void

    .line 315
    .line 316
    :cond_9
    :goto_8
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    .line 317
    .line 318
    .line 319
    const-string/jumbo v1, "quality must be a number between 0 and 1"

    .line 320
    .line 321
    .line 322
    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v12, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 326
    return-void

    .line 327
    .line 328
    :cond_a
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    .line 329
    .line 330
    const-string v1, "Please specify a URI"

    .line 331
    .line 332
    .line 333
    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 334
    throw v0

    .line 335
    .line 336
    :cond_b
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    .line 337
    .line 338
    const-string v1, "Please specify offset and size"

    .line 339
    .line 340
    .line 341
    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 342
    throw v0
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
.end method

.method public final m(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIILjava/util/HashMap;)Landroid/graphics/Bitmap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/BitmapFactory$Options;",
            "Ljava/lang/String;",
            "IIII",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2, p7}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->o(Ljava/lang/String;Ljava/util/HashMap;)Ljava/io/InputStream;

    .line 4
    move-result-object p7

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p7, :cond_6

    .line 8
    .line 9
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {p7}, Lcom/reactnativecommunity/imageeditor/a;->a(Ljava/io/InputStream;)Landroid/graphics/BitmapRegionDecoder;

    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static {p7, v1}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    :goto_0
    if-eqz v1, :cond_5

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->getHeight()I

    .line 32
    move-result v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->getWidth()I

    .line 36
    move-result v3

    .line 37
    .line 38
    sget-object v4, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->c:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;

    .line 39
    .line 40
    iget-object v5, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    .line 47
    const-string/jumbo v6, "parse(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5, p2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$getOrientation(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Landroid/content/Context;Landroid/net/Uri;)I

    .line 54
    move-result p2

    .line 55
    .line 56
    const/16 v4, 0x10e

    .line 57
    .line 58
    const/16 v5, 0x5a

    .line 59
    .line 60
    if-eq p2, v5, :cond_3

    .line 61
    .line 62
    const/16 v6, 0xb4

    .line 63
    .line 64
    if-eq p2, v6, :cond_2

    .line 65
    .line 66
    if-eq p2, v4, :cond_1

    .line 67
    .line 68
    .line 69
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    move-result-object p3

    .line 71
    .line 72
    .line 73
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    move-result-object p4

    .line 75
    .line 76
    .line 77
    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    move-result-object p3

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    sub-int/2addr v3, p6

    .line 81
    sub-int/2addr v3, p4

    .line 82
    .line 83
    .line 84
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    move-result-object p4

    .line 86
    .line 87
    .line 88
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    move-result-object p3

    .line 90
    .line 91
    .line 92
    invoke-static {p4, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    move-result-object p3

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sub-int/2addr v3, p5

    .line 96
    sub-int/2addr v3, p3

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    move-result-object p3

    .line 101
    sub-int/2addr v2, p6

    .line 102
    sub-int/2addr v2, p4

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    move-result-object p4

    .line 107
    .line 108
    .line 109
    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 110
    move-result-object p3

    .line 111
    goto :goto_1

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    move-result-object p4

    .line 116
    sub-int/2addr v2, p5

    .line 117
    sub-int/2addr v2, p3

    .line 118
    .line 119
    .line 120
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    move-result-object p3

    .line 122
    .line 123
    .line 124
    invoke-static {p4, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 125
    move-result-object p3

    .line 126
    .line 127
    .line 128
    :goto_1
    invoke-virtual {p3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 129
    move-result-object p4

    .line 130
    .line 131
    check-cast p4, Ljava/lang/Number;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 135
    move-result p4

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 139
    move-result-object p3

    .line 140
    .line 141
    check-cast p3, Ljava/lang/Number;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 145
    move-result p3

    .line 146
    .line 147
    if-eq p2, v5, :cond_4

    .line 148
    .line 149
    if-eq p2, v4, :cond_4

    .line 150
    add-int/2addr p5, p4

    .line 151
    .line 152
    .line 153
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    move-result-object p2

    .line 155
    add-int/2addr p6, p3

    .line 156
    .line 157
    .line 158
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    move-result-object p5

    .line 160
    .line 161
    .line 162
    invoke-static {p2, p5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 163
    move-result-object p2

    .line 164
    goto :goto_2

    .line 165
    :cond_4
    add-int/2addr p6, p4

    .line 166
    .line 167
    .line 168
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    move-result-object p2

    .line 170
    add-int/2addr p5, p3

    .line 171
    .line 172
    .line 173
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    move-result-object p5

    .line 175
    .line 176
    .line 177
    invoke-static {p2, p5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 178
    move-result-object p2

    .line 179
    .line 180
    .line 181
    :goto_2
    invoke-virtual {p2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 182
    move-result-object p5

    .line 183
    .line 184
    check-cast p5, Ljava/lang/Number;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 188
    move-result p5

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 192
    move-result-object p2

    .line 193
    .line 194
    check-cast p2, Ljava/lang/Number;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 198
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    .line 200
    :try_start_1
    new-instance p6, Landroid/graphics/Rect;

    .line 201
    .line 202
    .line 203
    invoke-direct {p6, p4, p3, p5, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, p6, p1}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 207
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 208
    .line 209
    .line 210
    :try_start_2
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    .line 212
    .line 213
    invoke-static {p7, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 214
    return-object p1

    .line 215
    :catchall_1
    move-exception p1

    .line 216
    .line 217
    .line 218
    :try_start_3
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    .line 219
    throw p1

    .line 220
    .line 221
    :cond_5
    new-instance p1, Ljava/lang/Error;

    .line 222
    .line 223
    new-instance p3, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    const-string p4, "Could not create bitmap decoder. Uri: "

    .line 229
    .line 230
    .line 231
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    move-result-object p2

    .line 239
    .line 240
    .line 241
    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 242
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 243
    :goto_3
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 244
    :catchall_2
    move-exception p2

    .line 245
    .line 246
    .line 247
    invoke-static {p7, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 248
    throw p2

    .line 249
    :cond_6
    return-object v0
.end method

.method public final n()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->b:Lkotlinx/coroutines/m0;

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->j()V

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

.method public final o(Ljava/lang/String;Ljava/util/HashMap;)Ljava/io/InputStream;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/io/InputStream;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const-string v2, "data:"

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 v8, 0x6

    .line 13
    const/4 v9, 0x0

    .line 14
    .line 15
    const-string v5, ","

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    move-object v4, p1

    .line 19
    .line 20
    .line 21
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 22
    move-result p1

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    const-string/jumbo p2, "substring(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    new-instance p2, Ljava/io/ByteArrayInputStream;

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 44
    return-object p2

    .line 45
    :cond_0
    move-object v4, p1

    .line 46
    .line 47
    sget-object p1, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->c:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v4}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$isLocalUri(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Ljava/lang/String;)Z

    .line 51
    move-result p1

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    iget-object p1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    .line 70
    :cond_1
    new-instance p1, Ljava/net/URL;

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    check-cast p1, Ljava/net/URLConnection;

    .line 84
    .line 85
    if-eqz p2, :cond_3

    .line 86
    .line 87
    .line 88
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    .line 96
    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    move-result v0

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    .line 102
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    check-cast v0, Ljava/util/Map$Entry;

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    check-cast v1, Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    instance-of v2, v0, Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    check-cast v0, Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    goto :goto_0

    .line 126
    .line 127
    .line 128
    :cond_3
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 129
    move-result-object p1

    .line 130
    return-object p1
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
.end method

.method public final p(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 4
    .param p1    # Ljava/util/HashMap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "TV;>;)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Ljava/util/Map$Entry;

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v0

    .line 48
    .line 49
    :cond_2
    if-eqz v1, :cond_3

    .line 50
    return-object v1

    .line 51
    :cond_3
    return-object v0
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
