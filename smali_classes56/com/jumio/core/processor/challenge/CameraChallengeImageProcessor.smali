.class public final Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;
.super Lcom/jumio/core/processor/MultiImageProcessorBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jumio/core/processor/MultiImageProcessorBase<",
        "Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;",
        "Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0018\u0010!\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0008\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0010\u0010\'\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006-"
    }
    d2 = {
        "Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;",
        "Lcom/jumio/core/processor/MultiImageProcessorBase;",
        "Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;",
        "Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;",
        "config",
        "toolkitProvider",
        "Lcom/jumio/core/toolkit/ToolkitProviderInterface;",
        "<init>",
        "(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;)V",
        "result",
        "Lcom/jumio/core/processor/challenge/CameraChallengeResult;",
        "baseline",
        "Lcom/jumio/core/processor/challenge/CameraChallengeFrame;",
        "getBaseline",
        "()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;",
        "checkRequirements",
        "",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
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
        "reset",
        "",
        "processInternal",
        "currentData",
        "processFrame",
        "shouldSkipHoldStill",
        "shouldSkipCoolDown",
        "createCoolDownSettings",
        "Lcom/jumio/commons/camera/CaptureSettings;",
        "brightnessSetupAchieved",
        "brightnessCoolDownAchieved",
        "focusSetupAchieved",
        "focusCoolDownAchieved",
        "whiteBalanceSetupAchieved",
        "whiteBalanceCoolDownAchieved",
        "Companion",
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
        "SMAP\nCameraChallengeImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraChallengeImageProcessor.kt\ncom/jumio/core/processor/challenge/CameraChallengeImageProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,267:1\n1#2:268\n29#3,3:269\n29#3,3:272\n*S KotlinDebug\n*F\n+ 1 CameraChallengeImageProcessor.kt\ncom/jumio/core/processor/challenge/CameraChallengeImageProcessor\n*L\n117#1:269,3\n120#1:272,3\n*E\n"
    }
.end annotation


# static fields
.field public static final BATCH_ID:Ljava/lang/String; = "CAMERA_CHALLENGE"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final c:Lcom/jumio/core/toolkit/ToolkitProviderInterface;

.field public final d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->Companion:Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;)V
    .locals 7
    .param p1    # Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/toolkit/ToolkitProviderInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toolkitProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/MultiImageProcessorBase;-><init>(Lcom/jumio/core/processor/MultiImageProcessorConfig;)V

    .line 4
    iput-object p2, p0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->c:Lcom/jumio/core/toolkit/ToolkitProviderInterface;

    .line 5
    new-instance v1, Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {p1}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;->getCameraChallengeData()Ljumio/core/W;

    move-result-object p1

    .line 6
    iget-object v2, p1, Ljumio/core/W;->c:Ljava/lang/String;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 7
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;-><init>(Ljava/lang/String;Lcom/jumio/commons/camera/CameraCapabilities;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    new-instance p2, Lcom/jumio/core/toolkit/DefaultToolkitProvider;

    invoke-direct {p2}, Lcom/jumio/core/toolkit/DefaultToolkitProvider;-><init>()V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;-><init>(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/jumio/commons/camera/CaptureSettings;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v1, Lcom/jumio/commons/camera/ExposureLevel;->AUTO:Lcom/jumio/commons/camera/ExposureLevel;

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    new-instance v2, Lcom/jumio/commons/camera/CaptureSettings;

    .line 21
    .line 22
    sget-object v3, Lcom/jumio/commons/camera/ExposureLevel;->DEFAULT:Lcom/jumio/commons/camera/ExposureLevel;

    .line 23
    const/4 v6, 0x6

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v2 .. v7}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    return-object v2

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getDistance()Lcom/jumio/commons/camera/LensDistance;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sget-object v1, Lcom/jumio/commons/camera/LensDistance;->AUTO:Lcom/jumio/commons/camera/LensDistance;

    .line 47
    .line 48
    if-eq v0, v1, :cond_1

    .line 49
    .line 50
    new-instance v2, Lcom/jumio/commons/camera/CaptureSettings;

    .line 51
    .line 52
    sget-object v5, Lcom/jumio/commons/camera/LensDistance;->DEFAULT:Lcom/jumio/commons/camera/LensDistance;

    .line 53
    const/4 v6, 0x3

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v2 .. v7}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    return-object v2

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sget-object v1, Lcom/jumio/commons/camera/WhiteBalance;->AUTO:Lcom/jumio/commons/camera/WhiteBalance;

    .line 77
    .line 78
    if-eq v0, v1, :cond_2

    .line 79
    .line 80
    new-instance v2, Lcom/jumio/commons/camera/CaptureSettings;

    .line 81
    .line 82
    sget-object v4, Lcom/jumio/commons/camera/WhiteBalance;->DEFAULT:Lcom/jumio/commons/camera/WhiteBalance;

    .line 83
    const/4 v6, 0x5

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v2 .. v7}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    return-object v2

    .line 91
    .line 92
    :cond_2
    new-instance v3, Lcom/jumio/commons/camera/CaptureSettings;

    .line 93
    const/4 v7, 0x7

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v6, 0x0

    .line 98
    .line 99
    .line 100
    invoke-direct/range {v3 .. v8}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    return-object v3
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
.end method

.method public final b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getFrames()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    .line 14
    return-object v0
    .line 15
    .line 16
.end method

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
    iget-object v0, p0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lcom/jumio/commons/camera/CameraCapabilities;->copy()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->setCapabilities(Lcom/jumio/commons/camera/CameraCapabilities;)V

    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public process(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;)Lcom/jumio/core/processor/ProcessorState;
    .locals 20
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "bitmap"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cameraSettings"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "extractionArea"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "metadata"

    move-object/from16 v13, p4

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "parameterInterface"

    move-object/from16 v3, p5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 2
    new-instance v3, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    const/4 v15, 0x2

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    .line 3
    :try_start_0
    iget-object v7, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->c:Lcom/jumio/core/toolkit/ToolkitProviderInterface;

    invoke-interface {v7}, Lcom/jumio/core/toolkit/ToolkitProviderInterface;->create()Lcom/jumio/core/toolkit/ToolkitInterface;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 4
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const/4 v10, 0x0

    .line 5
    invoke-static {v7, v0, v10, v15, v10}, Lcom/jumio/core/toolkit/ToolkitInterface;->averageColor$default(Lcom/jumio/core/toolkit/ToolkitInterface;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)I

    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    sub-long v8, v16, v8

    .line 7
    iput-wide v8, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 9
    invoke-static {v7, v0, v10, v15, v10}, Lcom/jumio/core/toolkit/ToolkitInterface;->standardDeviationFast$default(Lcom/jumio/core/toolkit/ToolkitInterface;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)D

    move-result-wide v5

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    sub-long v8, v16, v8

    .line 11
    iput-wide v8, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 13
    :try_start_3
    invoke-static {v7, v10}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :goto_0
    move-wide v8, v5

    move v5, v11

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_1
    move-wide v8, v5

    move-object v5, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move v11, v4

    goto :goto_1

    :goto_2
    :try_start_4
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v7, v5}, Lkotlin/jdk7/AutoCloseableKt;->closeFinally(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v0

    move-wide v5, v8

    goto :goto_3

    :catch_2
    move-exception v0

    move v11, v4

    .line 14
    :goto_3
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 15
    :goto_4
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    .line 16
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v6

    check-cast v6, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v6}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getClassifier()Ljava/lang/String;

    move-result-object v6

    .line 17
    iget-wide v10, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 18
    iget-wide v2, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 19
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v7

    check-cast v7, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v7}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v12

    .line 20
    sget-object v14, Lcom/jumio/core/processor/challenge/CameraChallengeState;->SETUP:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    move-wide/from16 v18, v2

    move v2, v4

    move-object v4, v6

    move-wide v6, v10

    move-wide/from16 v10, v18

    move-object v3, v0

    .line 21
    invoke-direct/range {v3 .. v14}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;-><init>(Ljava/lang/String;IJDJLcom/jumio/commons/camera/CaptureSettings;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/challenge/CameraChallengeState;)V

    .line 22
    iget-object v0, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getFrames()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    move-result-object v0

    instance-of v0, v0, Lcom/jumio/core/processor/ProcessorState$TakePicture;

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    move-result-object v0

    instance-of v0, v0, Lcom/jumio/core/processor/ProcessorState$Skip;

    if-eqz v0, :cond_1

    .line 24
    :cond_0
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setState(Lcom/jumio/core/processor/challenge/CameraChallengeState;)V

    .line 25
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->a()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setSettings(Lcom/jumio/commons/camera/CaptureSettings;)V

    .line 26
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->startCoolDown()V

    .line 27
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;

    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->a()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;-><init>(Lcom/jumio/commons/camera/CaptureSettings;)V

    goto/16 :goto_b

    .line 28
    :cond_1
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    move-result v0

    const/4 v4, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getHoldStillTime()J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Lcom/jumio/core/processor/a;->shouldCoolDown(J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v0

    sget-object v8, Lcom/jumio/commons/camera/ExposureLevel;->AUTO:Lcom/jumio/commons/camera/ExposureLevel;

    if-eq v0, v8, :cond_6

    .line 30
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v0

    .line 31
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v8

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v9

    add-int/2addr v9, v8

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    add-int/2addr v0, v9

    div-int/lit8 v0, v0, 0x3

    .line 32
    invoke-virtual {v3}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v8

    .line 33
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    move-result v9

    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result v10

    add-int/2addr v10, v9

    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    move-result v8

    add-int/2addr v8, v10

    div-int/lit8 v8, v8, 0x3

    .line 34
    iget-object v9, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v9}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    move-result-object v9

    invoke-interface {v9}, Lcom/jumio/commons/camera/CameraCapabilities;->getCanAdjustExposure()Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    :goto_5
    move/from16 p1, v5

    goto/16 :goto_7

    .line 35
    :cond_3
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v9

    check-cast v9, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v9}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v9

    invoke-virtual {v9}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v9

    sget-object v10, Ljumio/core/X;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v10, v9

    if-eq v9, v4, :cond_5

    if-eq v9, v15, :cond_4

    goto/16 :goto_6

    :cond_4
    int-to-double v8, v8

    int-to-double v10, v0

    .line 36
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getCoolDownThreshold()F

    move-result v0

    float-to-double v12, v0

    sub-double v12, v6, v12

    mul-double/2addr v12, v10

    cmpl-double v0, v8, v12

    if-ltz v0, :cond_a

    goto :goto_5

    :cond_5
    int-to-double v8, v8

    int-to-double v10, v0

    .line 37
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getCoolDownThreshold()F

    move-result v0

    float-to-double v12, v0

    add-double/2addr v12, v6

    mul-double/2addr v12, v10

    cmpg-double v0, v8, v12

    if-gtz v0, :cond_a

    goto :goto_5

    .line 38
    :cond_6
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getDistance()Lcom/jumio/commons/camera/LensDistance;

    move-result-object v0

    sget-object v8, Lcom/jumio/commons/camera/LensDistance;->AUTO:Lcom/jumio/commons/camera/LensDistance;

    if-eq v0, v8, :cond_8

    .line 39
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getDeviation()D

    move-result-wide v8

    .line 40
    invoke-virtual {v3}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getDeviation()D

    move-result-wide v10

    .line 41
    iget-object v0, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    move-result-object v0

    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraCapabilities;->getCanAdjustFocus()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_5

    .line 42
    :cond_7
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getCoolDownThreshold()F

    move-result v0

    float-to-double v12, v0

    sub-double v12, v6, v12

    mul-double/2addr v12, v8

    cmpl-double v0, v10, v12

    if-ltz v0, :cond_a

    goto/16 :goto_5

    .line 43
    :cond_8
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    move-result-object v0

    sget-object v8, Lcom/jumio/commons/camera/WhiteBalance;->AUTO:Lcom/jumio/commons/camera/WhiteBalance;

    if-eq v0, v8, :cond_a

    .line 44
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v0

    .line 45
    invoke-virtual {v3}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v8

    .line 46
    iget-object v9, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v9}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    move-result-object v9

    invoke-interface {v9}, Lcom/jumio/commons/camera/CameraCapabilities;->getCanAdjustWhiteBalance()Z

    move-result v9

    if-nez v9, :cond_9

    goto/16 :goto_5

    .line 47
    :cond_9
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v9

    check-cast v9, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v9}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getCoolDownThreshold()F

    move-result v9

    .line 48
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v10

    .line 49
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v11

    .line 50
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    .line 51
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    move-result v12

    int-to-float v12, v12

    .line 52
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result v13

    int-to-float v13, v13

    .line 53
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    move-result v8

    int-to-float v8, v8

    int-to-float v10, v10

    sub-float v14, v5, v9

    move/from16 p1, v5

    mul-float v5, v10, v14

    add-float v9, v9, p1

    mul-float/2addr v10, v9

    .line 54
    invoke-static {v5, v10}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v5, v10}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v5

    if-eqz v5, :cond_a

    int-to-float v5, v11

    mul-float v10, v5, v14

    mul-float/2addr v5, v9

    .line 55
    invoke-static {v10, v5}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v5, v10}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v5

    if-eqz v5, :cond_a

    int-to-float v0, v0

    mul-float/2addr v14, v0

    mul-float/2addr v0, v9

    .line 56
    invoke-static {v14, v0}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v0, v5}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_7

    .line 57
    :cond_a
    :goto_6
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setState(Lcom/jumio/core/processor/challenge/CameraChallengeState;)V

    .line 58
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->a()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setSettings(Lcom/jumio/commons/camera/CaptureSettings;)V

    .line 59
    new-instance v0, Lcom/jumio/core/processor/ProcessorState$CoolDown;

    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v2}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getHoldStillTime()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Lcom/jumio/core/processor/ProcessorState$CoolDown;-><init>(J)V

    goto/16 :goto_b

    .line 60
    :goto_7
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getNextImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    if-nez v0, :cond_b

    .line 61
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setState(Lcom/jumio/core/processor/challenge/CameraChallengeState;)V

    .line 62
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->a()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setSettings(Lcom/jumio/commons/camera/CaptureSettings;)V

    .line 63
    iget-object v0, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    .line 64
    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    sget-object v0, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    sget-object v0, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 66
    new-instance v0, Lcom/jumio/core/processor/ProcessorState$Finished;

    iget-object v2, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    const-string v3, "CAMERA_CHALLENGE"

    invoke-direct {v0, v3, v2}, Lcom/jumio/core/processor/ProcessorState$Finished;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 67
    :cond_b
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->shouldStart()Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_a

    .line 68
    :cond_c
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getHoldStillTime()J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Lcom/jumio/core/processor/a;->shouldHoldStill(J)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 69
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v0

    sget-object v5, Lcom/jumio/commons/camera/ExposureLevel;->AUTO:Lcom/jumio/commons/camera/ExposureLevel;

    if-eq v0, v5, :cond_10

    .line 70
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v0

    .line 71
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v8

    add-int/2addr v8, v5

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    add-int/2addr v0, v8

    div-int/lit8 v0, v0, 0x3

    .line 72
    invoke-virtual {v3}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v5

    .line 73
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    move-result v8

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v9

    add-int/2addr v9, v8

    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    move-result v5

    add-int/2addr v5, v9

    div-int/lit8 v5, v5, 0x3

    .line 74
    iget-object v8, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v8}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    move-result-object v8

    invoke-interface {v8}, Lcom/jumio/commons/camera/CameraCapabilities;->getCanAdjustExposure()Z

    move-result v8

    if-nez v8, :cond_d

    goto/16 :goto_9

    .line 75
    :cond_d
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v8

    check-cast v8, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v8}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v8

    invoke-virtual {v8}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v8

    sget-object v9, Ljumio/core/X;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v9, v8

    if-eq v8, v4, :cond_f

    if-eq v8, v15, :cond_e

    goto/16 :goto_8

    :cond_e
    int-to-double v4, v5

    int-to-double v8, v0

    .line 76
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSetupThreshold()F

    move-result v0

    float-to-double v10, v0

    sub-double/2addr v6, v10

    mul-double/2addr v6, v8

    cmpg-double v0, v4, v6

    if-gez v0, :cond_14

    goto/16 :goto_9

    :cond_f
    int-to-double v4, v5

    int-to-double v8, v0

    .line 77
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSetupThreshold()F

    move-result v0

    float-to-double v10, v0

    add-double/2addr v10, v6

    mul-double/2addr v10, v8

    cmpl-double v0, v4, v10

    if-lez v0, :cond_14

    goto/16 :goto_9

    .line 78
    :cond_10
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getDistance()Lcom/jumio/commons/camera/LensDistance;

    move-result-object v0

    sget-object v4, Lcom/jumio/commons/camera/LensDistance;->AUTO:Lcom/jumio/commons/camera/LensDistance;

    if-eq v0, v4, :cond_12

    .line 79
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getDeviation()D

    move-result-wide v4

    .line 80
    invoke-virtual {v3}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getDeviation()D

    move-result-wide v8

    .line 81
    iget-object v0, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    move-result-object v0

    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraCapabilities;->getCanAdjustFocus()Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_9

    .line 82
    :cond_11
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSetupThreshold()F

    move-result v0

    float-to-double v10, v0

    sub-double/2addr v6, v10

    mul-double/2addr v6, v4

    cmpg-double v0, v8, v6

    if-gez v0, :cond_14

    goto/16 :goto_9

    .line 83
    :cond_12
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    move-result-object v0

    sget-object v4, Lcom/jumio/commons/camera/WhiteBalance;->AUTO:Lcom/jumio/commons/camera/WhiteBalance;

    if-eq v0, v4, :cond_14

    .line 84
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->b()Lcom/jumio/core/processor/challenge/CameraChallengeFrame;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v0

    .line 85
    invoke-virtual {v3}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->getColor()I

    move-result v4

    .line 86
    iget-object v5, v1, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    invoke-virtual {v5}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    move-result-object v5

    invoke-interface {v5}, Lcom/jumio/commons/camera/CameraCapabilities;->getCanAdjustWhiteBalance()Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_9

    .line 87
    :cond_13
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v5

    check-cast v5, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v5}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSetupThreshold()F

    move-result v5

    .line 88
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v6

    .line 89
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v7

    .line 90
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    .line 91
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v8

    int-to-float v8, v8

    .line 92
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    move-result v9

    int-to-float v9, v9

    .line 93
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    int-to-float v4, v4

    int-to-float v6, v6

    sub-float v10, p1, v5

    mul-float v11, v6, v10

    add-float v5, v5, p1

    mul-float/2addr v6, v5

    .line 94
    invoke-static {v11, v6}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v6, v8}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v6

    if-eqz v6, :cond_15

    int-to-float v6, v7

    mul-float v7, v6, v10

    mul-float/2addr v6, v5

    .line 95
    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-interface {v6, v7}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v6

    if-eqz v6, :cond_15

    int-to-float v0, v0

    mul-float/2addr v10, v0

    mul-float/2addr v0, v5

    .line 96
    invoke-static {v10, v0}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v0, v4}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_9

    .line 97
    :cond_14
    :goto_8
    sget-object v0, Lcom/jumio/core/processor/ProcessorState$Processing;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Processing;

    goto/16 :goto_b

    .line 98
    :cond_15
    :goto_9
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->shouldTakePicture()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 99
    invoke-virtual {v1, v2}, Lcom/jumio/core/processor/a;->setImageStarted(Z)V

    .line 100
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->IMAGE_TAKEN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setState(Lcom/jumio/core/processor/challenge/CameraChallengeState;)V

    .line 101
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getConfig()Lcom/jumio/core/processor/ImageProcessorConfig;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;

    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;->getCameraChallengeData()Ljumio/core/W;

    move-result-object v0

    .line 102
    iget-boolean v0, v0, Ljumio/core/W;->b:Z

    if-eqz v0, :cond_16

    .line 103
    new-instance v2, Lcom/jumio/core/processor/ProcessorState$TakePicture;

    new-instance v5, Lcom/jumio/commons/camera/Size;

    const/16 v0, 0x40

    invoke-direct {v5, v0, v0}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "CAMERA_CHALLENGE"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/jumio/core/processor/ProcessorState$TakePicture;-><init>(Ljava/lang/String;Lcom/jumio/commons/camera/ImageMetadata;Lcom/jumio/commons/camera/Size;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    goto :goto_b

    .line 104
    :cond_16
    sget-object v0, Lcom/jumio/core/processor/ProcessorState$Skip;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Skip;

    goto :goto_b

    .line 105
    :cond_17
    sget-object v0, Lcom/jumio/core/processor/ProcessorState$Processing;->INSTANCE:Lcom/jumio/core/processor/ProcessorState$Processing;

    goto :goto_b

    .line 106
    :cond_18
    :goto_a
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->getImageStarted()Z

    move-result v0

    if-nez v0, :cond_19

    .line 107
    sget-object v0, Lcom/jumio/core/processor/challenge/CameraChallengeState;->COOL_DOWN:Lcom/jumio/core/processor/challenge/CameraChallengeState;

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setState(Lcom/jumio/core/processor/challenge/CameraChallengeState;)V

    .line 108
    invoke-virtual {v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->a()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jumio/core/processor/challenge/CameraChallengeFrame;->setSettings(Lcom/jumio/commons/camera/CaptureSettings;)V

    .line 109
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->moveToNextImage()V

    .line 110
    :cond_19
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImages()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 111
    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jumio/commons/camera/CaptureSettings;->setStartChallenge(Z)V

    .line 112
    :cond_1a
    invoke-virtual {v1}, Lcom/jumio/core/processor/a;->startHoldStill()V

    .line 113
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;

    invoke-virtual {v1}, Lcom/jumio/core/processor/MultiImageProcessorBase;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;

    invoke-virtual {v2}, Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;-><init>(Lcom/jumio/commons/camera/CaptureSettings;)V

    .line 114
    :goto_b
    invoke-virtual {v1, v0}, Lcom/jumio/core/processor/a;->setCurrentState(Lcom/jumio/core/processor/ProcessorState;)V

    return-object v0
.end method

.method public reset()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/processor/MultiImageProcessorBase;->reset()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;->d:Lcom/jumio/core/processor/challenge/CameraChallengeResult;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/jumio/core/processor/challenge/CameraChallengeResult;->getFrames()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
.end method
