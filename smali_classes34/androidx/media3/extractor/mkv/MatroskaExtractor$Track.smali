.class public final Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;
.super Ljava/lang/Object;
.source "MatroskaExtractor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/mkv/MatroskaExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Track"
.end annotation


# static fields
.field private static final DEFAULT_MAX_CLL:I = 0x3e8

.field private static final DEFAULT_MAX_FALL:I = 0xc8

.field private static final DISPLAY_UNIT_PIXELS:I = 0x0

.field private static final MAX_CHROMATICITY:I = 0xc350


# instance fields
.field public audioBitDepth:I

.field public bitsPerChannel:I

.field private blockAddIdType:I

.field public channelCount:I

.field public codecDelayNs:J

.field public codecId:Ljava/lang/String;

.field public codecPrivate:[B

.field public colorRange:I

.field public colorSpace:I

.field public colorTransfer:I

.field public cryptoData:Landroidx/media3/extractor/TrackOutput$CryptoData;

.field public defaultSampleDurationNs:I

.field public displayHeight:I

.field public displayUnit:I

.field public displayWidth:I

.field public dolbyVisionConfigBytes:[B

.field public drmInitData:Landroidx/media3/common/DrmInitData;

.field public flagDefault:Z

.field public flagForced:Z

.field public hasColorInfo:Z

.field public hasContentEncryption:Z

.field public height:I

.field private language:Ljava/lang/String;

.field public maxBlockAdditionId:I

.field public maxContentLuminance:I

.field public maxFrameAverageLuminance:I

.field public maxMasteringLuminance:F

.field public minMasteringLuminance:F

.field public nalUnitLengthFieldLength:I

.field public name:Ljava/lang/String;

.field public number:I

.field public output:Landroidx/media3/extractor/TrackOutput;

.field public primaryBChromaticityX:F

.field public primaryBChromaticityY:F

.field public primaryGChromaticityX:F

.field public primaryGChromaticityY:F

.field public primaryRChromaticityX:F

.field public primaryRChromaticityY:F

.field public projectionData:[B

.field public projectionPosePitch:F

.field public projectionPoseRoll:F

.field public projectionPoseYaw:F

.field public projectionType:I

.field public sampleRate:I

.field public sampleStrippedBytes:[B

.field public seekPreRollNs:J

.field public stereoMode:I

.field public trueHdSampleRechunker:Landroidx/media3/extractor/TrueHdSampleRechunker;

.field public type:I

.field public whitePointChromaticityX:F

.field public whitePointChromaticityY:F

.field public width:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->width:I

    .line 7
    .line 8
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->height:I

    .line 9
    .line 10
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->bitsPerChannel:I

    .line 11
    .line 12
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayWidth:I

    .line 13
    .line 14
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayHeight:I

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayUnit:I

    .line 18
    .line 19
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionType:I

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    iput v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseYaw:F

    .line 23
    .line 24
    iput v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPosePitch:F

    .line 25
    .line 26
    iput v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseRoll:F

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    iput-object v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionData:[B

    .line 30
    .line 31
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->stereoMode:I

    .line 32
    .line 33
    iput-boolean v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->hasColorInfo:Z

    .line 34
    .line 35
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->colorSpace:I

    .line 36
    .line 37
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->colorTransfer:I

    .line 38
    .line 39
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->colorRange:I

    .line 40
    .line 41
    const/16 v1, 0x3e8

    .line 42
    .line 43
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxContentLuminance:I

    .line 44
    .line 45
    const/16 v1, 0xc8

    .line 46
    .line 47
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxFrameAverageLuminance:I

    .line 48
    .line 49
    const/high16 v1, -0x40800000    # -1.0f

    .line 50
    .line 51
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryRChromaticityX:F

    .line 52
    .line 53
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryRChromaticityY:F

    .line 54
    .line 55
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryGChromaticityX:F

    .line 56
    .line 57
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryGChromaticityY:F

    .line 58
    .line 59
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryBChromaticityX:F

    .line 60
    .line 61
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryBChromaticityY:F

    .line 62
    .line 63
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->whitePointChromaticityX:F

    .line 64
    .line 65
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->whitePointChromaticityY:F

    .line 66
    .line 67
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxMasteringLuminance:F

    .line 68
    .line 69
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->minMasteringLuminance:F

    .line 70
    const/4 v1, 0x1

    .line 71
    .line 72
    iput v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->channelCount:I

    .line 73
    .line 74
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 75
    .line 76
    const/16 v0, 0x1f40

    .line 77
    .line 78
    iput v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->sampleRate:I

    .line 79
    .line 80
    const-wide/16 v2, 0x0

    .line 81
    .line 82
    iput-wide v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecDelayNs:J

    .line 83
    .line 84
    iput-wide v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->seekPreRollNs:J

    .line 85
    .line 86
    iput-boolean v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->flagDefault:Z

    .line 87
    .line 88
    const-string v0, "eng"

    .line 89
    .line 90
    iput-object v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->language:Ljava/lang/String;

    .line 91
    return-void
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
.end method

.method public static synthetic access$100(Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->assertOutputInitialized()V

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
.end method

.method public static synthetic access$200(Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->blockAddIdType:I

    .line 3
    return p0
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
.end method

.method public static synthetic access$202(Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;I)I
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->blockAddIdType:I

    .line 3
    return p1
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
.end method

.method public static synthetic access$302(Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->language:Ljava/lang/String;

    .line 3
    return-object p1
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
.end method

.method public static synthetic access$400(Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;Z)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->samplesHaveSupplementalData(Z)Z

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method private assertOutputInitialized()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->output:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method private getCodecPrivate(Ljava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecPrivate:[B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "Missing CodecPrivate for codec "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 27
    move-result-object p1

    .line 28
    throw p1
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
.end method

.method private getHdrStaticInfo()[B
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryRChromaticityX:F

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryRChromaticityY:F

    .line 11
    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryGChromaticityX:F

    .line 17
    .line 18
    cmpl-float v0, v0, v1

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryGChromaticityY:F

    .line 23
    .line 24
    cmpl-float v0, v0, v1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryBChromaticityX:F

    .line 29
    .line 30
    cmpl-float v0, v0, v1

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryBChromaticityY:F

    .line 35
    .line 36
    cmpl-float v0, v0, v1

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->whitePointChromaticityX:F

    .line 41
    .line 42
    cmpl-float v0, v0, v1

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->whitePointChromaticityY:F

    .line 47
    .line 48
    cmpl-float v0, v0, v1

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxMasteringLuminance:F

    .line 53
    .line 54
    cmpl-float v0, v0, v1

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iget v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->minMasteringLuminance:F

    .line 59
    .line 60
    cmpl-float v0, v0, v1

    .line 61
    .line 62
    if-nez v0, :cond_0

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_0
    const/16 v0, 0x19

    .line 66
    .line 67
    new-array v0, v0, [B

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 77
    move-result-object v1

    .line 78
    const/4 v2, 0x0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryRChromaticityX:F

    .line 84
    .line 85
    .line 86
    const v3, 0x47435000    # 50000.0f

    .line 87
    mul-float/2addr v2, v3

    .line 88
    .line 89
    const/high16 v4, 0x3f000000    # 0.5f

    .line 90
    add-float/2addr v2, v4

    .line 91
    float-to-int v2, v2

    .line 92
    int-to-short v2, v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryRChromaticityY:F

    .line 98
    mul-float/2addr v2, v3

    .line 99
    add-float/2addr v2, v4

    .line 100
    float-to-int v2, v2

    .line 101
    int-to-short v2, v2

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryGChromaticityX:F

    .line 107
    mul-float/2addr v2, v3

    .line 108
    add-float/2addr v2, v4

    .line 109
    float-to-int v2, v2

    .line 110
    int-to-short v2, v2

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryGChromaticityY:F

    .line 116
    mul-float/2addr v2, v3

    .line 117
    add-float/2addr v2, v4

    .line 118
    float-to-int v2, v2

    .line 119
    int-to-short v2, v2

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryBChromaticityX:F

    .line 125
    mul-float/2addr v2, v3

    .line 126
    add-float/2addr v2, v4

    .line 127
    float-to-int v2, v2

    .line 128
    int-to-short v2, v2

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 132
    .line 133
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->primaryBChromaticityY:F

    .line 134
    mul-float/2addr v2, v3

    .line 135
    add-float/2addr v2, v4

    .line 136
    float-to-int v2, v2

    .line 137
    int-to-short v2, v2

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->whitePointChromaticityX:F

    .line 143
    mul-float/2addr v2, v3

    .line 144
    add-float/2addr v2, v4

    .line 145
    float-to-int v2, v2

    .line 146
    int-to-short v2, v2

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->whitePointChromaticityY:F

    .line 152
    mul-float/2addr v2, v3

    .line 153
    add-float/2addr v2, v4

    .line 154
    float-to-int v2, v2

    .line 155
    int-to-short v2, v2

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxMasteringLuminance:F

    .line 161
    add-float/2addr v2, v4

    .line 162
    float-to-int v2, v2

    .line 163
    int-to-short v2, v2

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->minMasteringLuminance:F

    .line 169
    add-float/2addr v2, v4

    .line 170
    float-to-int v2, v2

    .line 171
    int-to-short v2, v2

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 175
    .line 176
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxContentLuminance:I

    .line 177
    int-to-short v2, v2

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 181
    .line 182
    iget v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxFrameAverageLuminance:I

    .line 183
    int-to-short v2, v2

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 187
    return-object v0

    .line 188
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 189
    return-object v0
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
.end method

.method private static parseFourCcPrivate(Landroidx/media3/common/util/ParsableByteArray;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/util/ParsableByteArray;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "[B>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedInt()J

    .line 10
    move-result-wide v2

    .line 11
    .line 12
    .line 13
    const-wide/32 v4, 0x58564944

    .line 14
    .line 15
    cmp-long v0, v2, v4

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance p0, Landroid/util/Pair;

    .line 20
    .line 21
    .line 22
    const-string/jumbo v0, "video/divx"

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    return-object p0

    .line 27
    .line 28
    .line 29
    :cond_0
    const-wide/32 v4, 0x33363248

    .line 30
    .line 31
    cmp-long v0, v2, v4

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    new-instance p0, Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    const-string/jumbo v0, "video/3gpp"

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    return-object p0

    .line 43
    .line 44
    .line 45
    :cond_1
    const-wide/32 v4, 0x31435657

    .line 46
    .line 47
    cmp-long v0, v2, v4

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 53
    move-result v0

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x14

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 59
    move-result-object p0

    .line 60
    :goto_0
    array-length v2, p0

    .line 61
    .line 62
    add-int/lit8 v2, v2, -0x4

    .line 63
    .line 64
    if-ge v0, v2, :cond_3

    .line 65
    .line 66
    aget-byte v2, p0, v0

    .line 67
    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    add-int/lit8 v2, v0, 0x1

    .line 71
    .line 72
    aget-byte v2, p0, v2

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    add-int/lit8 v2, v0, 0x2

    .line 77
    .line 78
    aget-byte v2, p0, v2

    .line 79
    const/4 v3, 0x1

    .line 80
    .line 81
    if-ne v2, v3, :cond_2

    .line 82
    .line 83
    add-int/lit8 v2, v0, 0x3

    .line 84
    .line 85
    aget-byte v2, p0, v2

    .line 86
    .line 87
    const/16 v3, 0xf

    .line 88
    .line 89
    if-ne v2, v3, :cond_2

    .line 90
    array-length v2, p0

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 94
    move-result-object p0

    .line 95
    .line 96
    new-instance v0, Landroid/util/Pair;

    .line 97
    .line 98
    .line 99
    const-string/jumbo v2, "video/wvc1"

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    move-result-object p0

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, v2, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    return-object v0

    .line 108
    .line 109
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :cond_3
    const-string p0, "Failed to find FourCC VC1 initialization data"

    .line 113
    .line 114
    .line 115
    invoke-static {p0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 116
    move-result-object p0

    .line 117
    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    :cond_4
    const-string p0, "MatroskaExtractor"

    .line 120
    .line 121
    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 122
    .line 123
    .line 124
    invoke-static {p0, v0}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    new-instance p0, Landroid/util/Pair;

    .line 127
    .line 128
    .line 129
    const-string/jumbo v0, "video/x-unknown"

    .line 130
    .line 131
    .line 132
    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    return-object p0

    .line 134
    .line 135
    :catch_0
    const-string p0, "Error parsing FourCC private data"

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 139
    move-result-object p0

    .line 140
    throw p0
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
.end method

.method private static parseMsAcmCodecPrivate(Landroidx/media3/common/util/ParsableByteArray;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedShort()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    const v2, 0xfffe

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x18

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readLong()J

    .line 23
    move-result-wide v4

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroidx/media3/extractor/mkv/MatroskaExtractor;->access$700()Ljava/util/UUID;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 31
    move-result-wide v6

    .line 32
    .line 33
    cmp-long v0, v4, v6

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readLong()J

    .line 39
    move-result-wide v4

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroidx/media3/extractor/mkv/MatroskaExtractor;->access$700()Ljava/util/UUID;

    .line 43
    move-result-object p0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 47
    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    cmp-long p0, v4, v6

    .line 50
    .line 51
    if-nez p0, :cond_1

    .line 52
    return v1

    .line 53
    :cond_1
    return v3

    .line 54
    .line 55
    :catch_0
    const-string p0, "Error parsing MS/ACM codec private"

    .line 56
    const/4 v0, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v0}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 60
    move-result-object p0

    .line 61
    throw p0
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
.end method

.method private static parseVorbisCodecPrivate([B)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "Error parsing vorbis codec private"

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :try_start_0
    aget-byte v3, p0, v2

    .line 7
    const/4 v4, 0x2

    .line 8
    .line 9
    if-ne v3, v4, :cond_5

    .line 10
    const/4 v3, 0x1

    .line 11
    move v6, v2

    .line 12
    move v5, v3

    .line 13
    .line 14
    :goto_0
    aget-byte v7, p0, v5

    .line 15
    .line 16
    and-int/lit16 v8, v7, 0xff

    .line 17
    .line 18
    const/16 v9, 0xff

    .line 19
    .line 20
    if-ne v8, v9, :cond_0

    .line 21
    .line 22
    add-int/lit16 v6, v6, 0xff

    .line 23
    .line 24
    add-int/lit8 v5, v5, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    add-int/2addr v5, v3

    .line 27
    and-int/2addr v7, v9

    .line 28
    add-int/2addr v6, v7

    .line 29
    move v7, v2

    .line 30
    .line 31
    :goto_1
    aget-byte v8, p0, v5

    .line 32
    .line 33
    and-int/lit16 v10, v8, 0xff

    .line 34
    .line 35
    if-ne v10, v9, :cond_1

    .line 36
    .line 37
    add-int/lit16 v7, v7, 0xff

    .line 38
    .line 39
    add-int/lit8 v5, v5, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/2addr v5, v3

    .line 42
    and-int/2addr v8, v9

    .line 43
    add-int/2addr v7, v8

    .line 44
    .line 45
    aget-byte v8, p0, v5

    .line 46
    .line 47
    if-ne v8, v3, :cond_4

    .line 48
    .line 49
    new-array v3, v6, [B

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v5, v3, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    add-int/2addr v5, v6

    .line 54
    .line 55
    aget-byte v6, p0, v5

    .line 56
    const/4 v8, 0x3

    .line 57
    .line 58
    if-ne v6, v8, :cond_3

    .line 59
    add-int/2addr v5, v7

    .line 60
    .line 61
    aget-byte v6, p0, v5

    .line 62
    const/4 v7, 0x5

    .line 63
    .line 64
    if-ne v6, v7, :cond_2

    .line 65
    array-length v6, p0

    .line 66
    sub-int/2addr v6, v5

    .line 67
    .line 68
    new-array v6, v6, [B

    .line 69
    array-length v7, p0

    .line 70
    sub-int/2addr v7, v5

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v5, v6, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    new-instance p0, Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-interface {p0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    return-object p0

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-static {v0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 89
    move-result-object p0

    .line 90
    throw p0

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-static {v0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 94
    move-result-object p0

    .line 95
    throw p0

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-static {v0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 99
    move-result-object p0

    .line 100
    throw p0

    .line 101
    .line 102
    .line 103
    :cond_5
    invoke-static {v0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 104
    move-result-object p0

    .line 105
    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    :catch_0
    invoke-static {v0, v1}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 109
    move-result-object p0

    .line 110
    throw p0
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
.end method

.method private samplesHaveSupplementalData(Z)Z
    .locals 2

    .line 1
    .line 2
    const-string v0, "A_OPUS"

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return p1

    .line 12
    .line 13
    :cond_0
    iget p1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->maxBlockAdditionId:I

    .line 14
    .line 15
    if-lez p1, :cond_1

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public initializeOutput(Landroidx/media3/extractor/ExtractorOutput;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    iget-object v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    const-string v7, "application/dvbsubs"

    .line 12
    .line 13
    const-string v8, "application/vobsub"

    .line 14
    .line 15
    const-string v9, "application/pgs"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v11, "text/x-ssa"

    .line 19
    .line 20
    .line 21
    const-string/jumbo v12, "text/vtt"

    .line 22
    .line 23
    const-string v13, "application/x-subrip"

    .line 24
    .line 25
    const/16 v15, 0x8

    .line 26
    const/4 v3, 0x3

    .line 27
    .line 28
    const-string v6, ". Setting mimeType to "

    .line 29
    .line 30
    const-string v16, "audio/raw"

    .line 31
    .line 32
    const-string v4, "MatroskaExtractor"

    .line 33
    .line 34
    const-string v14, "audio/x-unknown"

    .line 35
    const/4 v10, 0x0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 39
    move-result v17

    .line 40
    .line 41
    .line 42
    sparse-switch v17, :sswitch_data_0

    .line 43
    :goto_0
    const/4 v1, -0x1

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :sswitch_0
    const-string v1, "A_OPUS"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result v1

    .line 52
    .line 53
    if-nez v1, :cond_0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_0
    const/16 v1, 0x20

    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :sswitch_1
    const-string v1, "A_FLAC"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-nez v1, :cond_1

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_1
    const/16 v1, 0x1f

    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :sswitch_2
    const-string v1, "A_EAC3"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result v1

    .line 78
    .line 79
    if-nez v1, :cond_2

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_2
    const/16 v1, 0x1e

    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :sswitch_3
    const-string v1, "V_MPEG2"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result v1

    .line 91
    .line 92
    if-nez v1, :cond_3

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :cond_3
    const/16 v1, 0x1d

    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :sswitch_4
    const-string v1, "S_TEXT/UTF8"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    move-result v1

    .line 104
    .line 105
    if-nez v1, :cond_4

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :cond_4
    const/16 v1, 0x1c

    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :sswitch_5
    const-string v1, "S_TEXT/WEBVTT"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result v1

    .line 117
    .line 118
    if-nez v1, :cond_5

    .line 119
    goto :goto_0

    .line 120
    .line 121
    :cond_5
    const/16 v1, 0x1b

    .line 122
    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :sswitch_6
    const-string v1, "V_MPEGH/ISO/HEVC"

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    move-result v1

    .line 130
    .line 131
    if-nez v1, :cond_6

    .line 132
    goto :goto_0

    .line 133
    .line 134
    :cond_6
    const/16 v1, 0x1a

    .line 135
    .line 136
    goto/16 :goto_1

    .line 137
    .line 138
    :sswitch_7
    const-string v1, "S_TEXT/ASS"

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    move-result v1

    .line 143
    .line 144
    if-nez v1, :cond_7

    .line 145
    goto :goto_0

    .line 146
    .line 147
    :cond_7
    const/16 v1, 0x19

    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    :sswitch_8
    const-string v1, "A_PCM/INT/LIT"

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    move-result v1

    .line 156
    .line 157
    if-nez v1, :cond_8

    .line 158
    goto :goto_0

    .line 159
    .line 160
    :cond_8
    const/16 v1, 0x18

    .line 161
    .line 162
    goto/16 :goto_1

    .line 163
    .line 164
    :sswitch_9
    const-string v1, "A_PCM/INT/BIG"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    move-result v1

    .line 169
    .line 170
    if-nez v1, :cond_9

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_9
    const/16 v1, 0x17

    .line 175
    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :sswitch_a
    const-string v1, "A_PCM/FLOAT/IEEE"

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    move-result v1

    .line 183
    .line 184
    if-nez v1, :cond_a

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_a
    const/16 v1, 0x16

    .line 189
    .line 190
    goto/16 :goto_1

    .line 191
    .line 192
    :sswitch_b
    const-string v1, "A_DTS/EXPRESS"

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    move-result v1

    .line 197
    .line 198
    if-nez v1, :cond_b

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_b
    const/16 v1, 0x15

    .line 203
    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :sswitch_c
    const-string v1, "V_THEORA"

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    move-result v1

    .line 211
    .line 212
    if-nez v1, :cond_c

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_c
    const/16 v1, 0x14

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :sswitch_d
    const-string v1, "S_HDMV/PGS"

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    move-result v1

    .line 225
    .line 226
    if-nez v1, :cond_d

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_d
    const/16 v1, 0x13

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :sswitch_e
    const-string v1, "V_VP9"

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    move-result v1

    .line 239
    .line 240
    if-nez v1, :cond_e

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_e
    const/16 v1, 0x12

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :sswitch_f
    const-string v1, "V_VP8"

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    move-result v1

    .line 253
    .line 254
    if-nez v1, :cond_f

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_f
    const/16 v1, 0x11

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :sswitch_10
    const-string v1, "V_AV1"

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    move-result v1

    .line 267
    .line 268
    if-nez v1, :cond_10

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    :cond_10
    move v1, v2

    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :sswitch_11
    const-string v1, "A_DTS"

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    move-result v1

    .line 280
    .line 281
    if-nez v1, :cond_11

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_11
    const/16 v1, 0xf

    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :sswitch_12
    const-string v1, "A_AC3"

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    move-result v1

    .line 294
    .line 295
    if-nez v1, :cond_12

    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_12
    const/16 v1, 0xe

    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :sswitch_13
    const-string v1, "A_AAC"

    .line 304
    .line 305
    .line 306
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    move-result v1

    .line 308
    .line 309
    if-nez v1, :cond_13

    .line 310
    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_13
    const/16 v1, 0xd

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :sswitch_14
    const-string v1, "A_DTS/LOSSLESS"

    .line 318
    .line 319
    .line 320
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    move-result v1

    .line 322
    .line 323
    if-nez v1, :cond_14

    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :cond_14
    const/16 v1, 0xc

    .line 328
    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :sswitch_15
    const-string v1, "S_VOBSUB"

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 335
    move-result v1

    .line 336
    .line 337
    if-nez v1, :cond_15

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_15
    const/16 v1, 0xb

    .line 342
    .line 343
    goto/16 :goto_1

    .line 344
    .line 345
    :sswitch_16
    const-string v1, "V_MPEG4/ISO/AVC"

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    move-result v1

    .line 350
    .line 351
    if-nez v1, :cond_16

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_16
    const/16 v1, 0xa

    .line 356
    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :sswitch_17
    const-string v1, "V_MPEG4/ISO/ASP"

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    move-result v1

    .line 364
    .line 365
    if-nez v1, :cond_17

    .line 366
    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :cond_17
    const/16 v1, 0x9

    .line 370
    .line 371
    goto/16 :goto_1

    .line 372
    .line 373
    :sswitch_18
    const-string v1, "S_DVBSUB"

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    move-result v1

    .line 378
    .line 379
    if-nez v1, :cond_18

    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    :cond_18
    move v1, v15

    .line 383
    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :sswitch_19
    const-string v1, "V_MS/VFW/FOURCC"

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    move-result v1

    .line 391
    .line 392
    if-nez v1, :cond_19

    .line 393
    .line 394
    goto/16 :goto_0

    .line 395
    :cond_19
    const/4 v1, 0x7

    .line 396
    goto :goto_1

    .line 397
    .line 398
    :sswitch_1a
    const-string v1, "A_MPEG/L3"

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    move-result v1

    .line 403
    .line 404
    if-nez v1, :cond_1a

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    :cond_1a
    const/4 v1, 0x6

    .line 408
    goto :goto_1

    .line 409
    .line 410
    :sswitch_1b
    const-string v1, "A_MPEG/L2"

    .line 411
    .line 412
    .line 413
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    move-result v1

    .line 415
    .line 416
    if-nez v1, :cond_1b

    .line 417
    .line 418
    goto/16 :goto_0

    .line 419
    :cond_1b
    const/4 v1, 0x5

    .line 420
    goto :goto_1

    .line 421
    .line 422
    :sswitch_1c
    const-string v1, "A_VORBIS"

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    move-result v1

    .line 427
    .line 428
    if-nez v1, :cond_1c

    .line 429
    .line 430
    goto/16 :goto_0

    .line 431
    :cond_1c
    const/4 v1, 0x4

    .line 432
    goto :goto_1

    .line 433
    .line 434
    :sswitch_1d
    const-string v1, "A_TRUEHD"

    .line 435
    .line 436
    .line 437
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    move-result v1

    .line 439
    .line 440
    if-nez v1, :cond_1d

    .line 441
    .line 442
    goto/16 :goto_0

    .line 443
    :cond_1d
    move v1, v3

    .line 444
    goto :goto_1

    .line 445
    .line 446
    :sswitch_1e
    const-string v1, "A_MS/ACM"

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    move-result v1

    .line 451
    .line 452
    if-nez v1, :cond_1e

    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    :cond_1e
    const/4 v1, 0x2

    .line 456
    goto :goto_1

    .line 457
    .line 458
    :sswitch_1f
    const-string v1, "V_MPEG4/ISO/SP"

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    move-result v1

    .line 463
    .line 464
    if-nez v1, :cond_1f

    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    :cond_1f
    const/4 v1, 0x1

    .line 468
    goto :goto_1

    .line 469
    .line 470
    :sswitch_20
    const-string v1, "V_MPEG4/ISO/AP"

    .line 471
    .line 472
    .line 473
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    move-result v1

    .line 475
    .line 476
    if-nez v1, :cond_20

    .line 477
    .line 478
    goto/16 :goto_0

    .line 479
    :cond_20
    const/4 v1, 0x0

    .line 480
    .line 481
    .line 482
    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 483
    .line 484
    const-string v1, "Unrecognized codec identifier."

    .line 485
    .line 486
    .line 487
    invoke-static {v1, v10}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 488
    move-result-object v1

    .line 489
    throw v1

    .line 490
    .line 491
    :pswitch_0
    new-instance v1, Ljava/util/ArrayList;

    .line 492
    .line 493
    .line 494
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 495
    .line 496
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    invoke-direct {v0, v2}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 500
    move-result-object v2

    .line 501
    .line 502
    .line 503
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    invoke-static {v15}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 507
    move-result-object v2

    .line 508
    .line 509
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 513
    move-result-object v2

    .line 514
    .line 515
    iget-wide v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecDelayNs:J

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 519
    move-result-object v2

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 523
    move-result-object v2

    .line 524
    .line 525
    .line 526
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    invoke-static {v15}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 530
    move-result-object v2

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 534
    move-result-object v2

    .line 535
    .line 536
    iget-wide v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->seekPreRollNs:J

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 540
    move-result-object v2

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 544
    move-result-object v2

    .line 545
    .line 546
    .line 547
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    const-string v16, "audio/opus"

    .line 550
    .line 551
    const/16 v6, 0x1680

    .line 552
    move-object v2, v10

    .line 553
    const/4 v5, 0x0

    .line 554
    :goto_2
    const/4 v14, -0x1

    .line 555
    .line 556
    goto/16 :goto_f

    .line 557
    .line 558
    :pswitch_1
    iget-object v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    invoke-direct {v0, v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 562
    move-result-object v1

    .line 563
    .line 564
    .line 565
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 566
    move-result-object v1

    .line 567
    .line 568
    const-string v16, "audio/flac"

    .line 569
    :goto_3
    move-object v2, v10

    .line 570
    :goto_4
    const/4 v5, 0x0

    .line 571
    :goto_5
    const/4 v6, -0x1

    .line 572
    goto :goto_2

    .line 573
    .line 574
    :pswitch_2
    const-string v16, "audio/eac3"

    .line 575
    :goto_6
    move-object v1, v10

    .line 576
    move-object v2, v1

    .line 577
    goto :goto_4

    .line 578
    .line 579
    .line 580
    :pswitch_3
    const-string/jumbo v16, "video/mpeg2"

    .line 581
    goto :goto_6

    .line 582
    :pswitch_4
    move-object v1, v10

    .line 583
    move-object v2, v1

    .line 584
    .line 585
    move-object/from16 v16, v13

    .line 586
    goto :goto_4

    .line 587
    :pswitch_5
    move-object v1, v10

    .line 588
    move-object v2, v1

    .line 589
    .line 590
    move-object/from16 v16, v12

    .line 591
    goto :goto_4

    .line 592
    .line 593
    :pswitch_6
    new-instance v1, Landroidx/media3/common/util/ParsableByteArray;

    .line 594
    .line 595
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    invoke-direct {v0, v2}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 599
    move-result-object v2

    .line 600
    .line 601
    .line 602
    invoke-direct {v1, v2}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 603
    .line 604
    .line 605
    invoke-static {v1}, Landroidx/media3/extractor/HevcConfig;->parse(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/extractor/HevcConfig;

    .line 606
    move-result-object v1

    .line 607
    .line 608
    iget-object v2, v1, Landroidx/media3/extractor/HevcConfig;->initializationData:Ljava/util/List;

    .line 609
    .line 610
    iget v4, v1, Landroidx/media3/extractor/HevcConfig;->nalUnitLengthFieldLength:I

    .line 611
    .line 612
    iput v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->nalUnitLengthFieldLength:I

    .line 613
    .line 614
    iget-object v1, v1, Landroidx/media3/extractor/HevcConfig;->codecs:Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    const-string/jumbo v16, "video/hevc"

    .line 618
    :goto_7
    move-object v5, v2

    .line 619
    move-object v2, v1

    .line 620
    move-object v1, v5

    .line 621
    goto :goto_4

    .line 622
    .line 623
    .line 624
    :pswitch_7
    invoke-static {}, Landroidx/media3/extractor/mkv/MatroskaExtractor;->access$500()[B

    .line 625
    move-result-object v1

    .line 626
    .line 627
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    invoke-direct {v0, v2}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 631
    move-result-object v2

    .line 632
    .line 633
    .line 634
    invoke-static {v1, v2}, Lcom/google/common/collect/ImmutableList;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    .line 635
    move-result-object v1

    .line 636
    move-object v2, v10

    .line 637
    .line 638
    move-object/from16 v16, v11

    .line 639
    goto :goto_4

    .line 640
    .line 641
    :pswitch_8
    iget v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 642
    .line 643
    .line 644
    invoke-static {v1}, Landroidx/media3/common/util/Util;->getPcmEncoding(I)I

    .line 645
    move-result v1

    .line 646
    .line 647
    if-nez v1, :cond_21

    .line 648
    .line 649
    new-instance v1, Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 653
    .line 654
    const-string v2, "Unsupported little endian PCM bit depth: "

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    iget v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 660
    .line 661
    .line 662
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    move-result-object v1

    .line 673
    .line 674
    .line 675
    invoke-static {v4, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 676
    :goto_8
    move-object v1, v10

    .line 677
    move-object v2, v1

    .line 678
    .line 679
    move-object/from16 v16, v14

    .line 680
    goto :goto_4

    .line 681
    :cond_21
    move v14, v1

    .line 682
    :goto_9
    move-object v1, v10

    .line 683
    move-object v2, v1

    .line 684
    const/4 v5, 0x0

    .line 685
    :goto_a
    const/4 v6, -0x1

    .line 686
    .line 687
    goto/16 :goto_f

    .line 688
    .line 689
    :pswitch_9
    iget v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 690
    .line 691
    if-ne v1, v15, :cond_22

    .line 692
    move v14, v3

    .line 693
    goto :goto_9

    .line 694
    .line 695
    :cond_22
    if-ne v1, v2, :cond_23

    .line 696
    .line 697
    const/high16 v14, 0x10000000

    .line 698
    goto :goto_9

    .line 699
    .line 700
    :cond_23
    const/16 v2, 0x18

    .line 701
    .line 702
    if-ne v1, v2, :cond_24

    .line 703
    .line 704
    const/high16 v14, 0x50000000

    .line 705
    goto :goto_9

    .line 706
    .line 707
    :cond_24
    const/16 v2, 0x20

    .line 708
    .line 709
    if-ne v1, v2, :cond_25

    .line 710
    .line 711
    const/high16 v14, 0x60000000

    .line 712
    goto :goto_9

    .line 713
    .line 714
    :cond_25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 718
    .line 719
    const-string v2, "Unsupported big endian PCM bit depth: "

    .line 720
    .line 721
    .line 722
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    iget v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    move-result-object v1

    .line 738
    .line 739
    .line 740
    invoke-static {v4, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 741
    goto :goto_8

    .line 742
    .line 743
    :pswitch_a
    iget v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 744
    .line 745
    const/16 v2, 0x20

    .line 746
    .line 747
    if-ne v1, v2, :cond_26

    .line 748
    move-object v1, v10

    .line 749
    move-object v2, v1

    .line 750
    const/4 v5, 0x0

    .line 751
    const/4 v6, -0x1

    .line 752
    const/4 v14, 0x4

    .line 753
    .line 754
    goto/16 :goto_f

    .line 755
    .line 756
    :cond_26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 760
    .line 761
    const-string v2, "Unsupported floating point PCM bit depth: "

    .line 762
    .line 763
    .line 764
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    iget v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 767
    .line 768
    .line 769
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 779
    move-result-object v1

    .line 780
    .line 781
    .line 782
    invoke-static {v4, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    goto :goto_8

    .line 784
    .line 785
    .line 786
    :pswitch_b
    const-string/jumbo v16, "video/x-unknown"

    .line 787
    .line 788
    goto/16 :goto_6

    .line 789
    .line 790
    :pswitch_c
    move-object/from16 v16, v9

    .line 791
    .line 792
    goto/16 :goto_6

    .line 793
    .line 794
    .line 795
    :pswitch_d
    const-string/jumbo v16, "video/x-vnd.on2.vp9"

    .line 796
    .line 797
    goto/16 :goto_6

    .line 798
    .line 799
    .line 800
    :pswitch_e
    const-string/jumbo v16, "video/x-vnd.on2.vp8"

    .line 801
    .line 802
    goto/16 :goto_6

    .line 803
    .line 804
    .line 805
    :pswitch_f
    const-string/jumbo v16, "video/av01"

    .line 806
    .line 807
    goto/16 :goto_6

    .line 808
    .line 809
    :pswitch_10
    const-string v16, "audio/vnd.dts"

    .line 810
    .line 811
    goto/16 :goto_6

    .line 812
    .line 813
    :pswitch_11
    const-string v16, "audio/ac3"

    .line 814
    .line 815
    goto/16 :goto_6

    .line 816
    .line 817
    :pswitch_12
    iget-object v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    invoke-direct {v0, v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 821
    move-result-object v1

    .line 822
    .line 823
    .line 824
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 825
    move-result-object v1

    .line 826
    .line 827
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecPrivate:[B

    .line 828
    .line 829
    .line 830
    invoke-static {v2}, Landroidx/media3/extractor/AacUtil;->parseAudioSpecificConfig([B)Landroidx/media3/extractor/AacUtil$Config;

    .line 831
    move-result-object v2

    .line 832
    .line 833
    iget v4, v2, Landroidx/media3/extractor/AacUtil$Config;->sampleRateHz:I

    .line 834
    .line 835
    iput v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->sampleRate:I

    .line 836
    .line 837
    iget v4, v2, Landroidx/media3/extractor/AacUtil$Config;->channelCount:I

    .line 838
    .line 839
    iput v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->channelCount:I

    .line 840
    .line 841
    iget-object v2, v2, Landroidx/media3/extractor/AacUtil$Config;->codecs:Ljava/lang/String;

    .line 842
    .line 843
    const-string v16, "audio/mp4a-latm"

    .line 844
    .line 845
    goto/16 :goto_4

    .line 846
    .line 847
    :pswitch_13
    const-string v16, "audio/vnd.dts.hd"

    .line 848
    .line 849
    goto/16 :goto_6

    .line 850
    .line 851
    :pswitch_14
    iget-object v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    invoke-direct {v0, v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 855
    move-result-object v1

    .line 856
    .line 857
    .line 858
    invoke-static {v1}, Lcom/google/common/collect/ImmutableList;->of(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    .line 859
    move-result-object v1

    .line 860
    .line 861
    move-object/from16 v16, v8

    .line 862
    .line 863
    goto/16 :goto_3

    .line 864
    .line 865
    :pswitch_15
    new-instance v1, Landroidx/media3/common/util/ParsableByteArray;

    .line 866
    .line 867
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    invoke-direct {v0, v2}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 871
    move-result-object v2

    .line 872
    .line 873
    .line 874
    invoke-direct {v1, v2}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 875
    .line 876
    .line 877
    invoke-static {v1}, Landroidx/media3/extractor/AvcConfig;->parse(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/extractor/AvcConfig;

    .line 878
    move-result-object v1

    .line 879
    .line 880
    iget-object v2, v1, Landroidx/media3/extractor/AvcConfig;->initializationData:Ljava/util/List;

    .line 881
    .line 882
    iget v4, v1, Landroidx/media3/extractor/AvcConfig;->nalUnitLengthFieldLength:I

    .line 883
    .line 884
    iput v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->nalUnitLengthFieldLength:I

    .line 885
    .line 886
    iget-object v1, v1, Landroidx/media3/extractor/AvcConfig;->codecs:Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    const-string/jumbo v16, "video/avc"

    .line 890
    .line 891
    goto/16 :goto_7

    .line 892
    :pswitch_16
    const/4 v1, 0x4

    .line 893
    .line 894
    new-array v2, v1, [B

    .line 895
    .line 896
    iget-object v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    invoke-direct {v0, v4}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 900
    move-result-object v4

    .line 901
    const/4 v5, 0x0

    .line 902
    .line 903
    .line 904
    invoke-static {v4, v5, v2, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 905
    .line 906
    .line 907
    invoke-static {v2}, Lcom/google/common/collect/ImmutableList;->of(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    .line 908
    move-result-object v1

    .line 909
    .line 910
    move-object/from16 v16, v7

    .line 911
    :goto_b
    move-object v2, v10

    .line 912
    .line 913
    goto/16 :goto_5

    .line 914
    :pswitch_17
    const/4 v5, 0x0

    .line 915
    .line 916
    new-instance v1, Landroidx/media3/common/util/ParsableByteArray;

    .line 917
    .line 918
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    invoke-direct {v0, v2}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 922
    move-result-object v2

    .line 923
    .line 924
    .line 925
    invoke-direct {v1, v2}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 926
    .line 927
    .line 928
    invoke-static {v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->parseFourCcPrivate(Landroidx/media3/common/util/ParsableByteArray;)Landroid/util/Pair;

    .line 929
    move-result-object v1

    .line 930
    .line 931
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 932
    .line 933
    move-object/from16 v16, v2

    .line 934
    .line 935
    check-cast v16, Ljava/lang/String;

    .line 936
    .line 937
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v1, Ljava/util/List;

    .line 940
    goto :goto_b

    .line 941
    :pswitch_18
    const/4 v5, 0x0

    .line 942
    .line 943
    const-string v16, "audio/mpeg"

    .line 944
    :goto_c
    move-object v1, v10

    .line 945
    move-object v2, v1

    .line 946
    .line 947
    const/16 v6, 0x1000

    .line 948
    .line 949
    goto/16 :goto_2

    .line 950
    :pswitch_19
    const/4 v5, 0x0

    .line 951
    .line 952
    const-string v16, "audio/mpeg-L2"

    .line 953
    goto :goto_c

    .line 954
    :pswitch_1a
    const/4 v5, 0x0

    .line 955
    .line 956
    iget-object v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    invoke-direct {v0, v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 960
    move-result-object v1

    .line 961
    .line 962
    .line 963
    invoke-static {v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->parseVorbisCodecPrivate([B)Ljava/util/List;

    .line 964
    move-result-object v1

    .line 965
    .line 966
    const-string v16, "audio/vorbis"

    .line 967
    .line 968
    const/16 v6, 0x2000

    .line 969
    move-object v2, v10

    .line 970
    .line 971
    goto/16 :goto_2

    .line 972
    :pswitch_1b
    const/4 v5, 0x0

    .line 973
    .line 974
    new-instance v1, Landroidx/media3/extractor/TrueHdSampleRechunker;

    .line 975
    .line 976
    .line 977
    invoke-direct {v1}, Landroidx/media3/extractor/TrueHdSampleRechunker;-><init>()V

    .line 978
    .line 979
    iput-object v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->trueHdSampleRechunker:Landroidx/media3/extractor/TrueHdSampleRechunker;

    .line 980
    .line 981
    const-string v16, "audio/true-hd"

    .line 982
    move-object v1, v10

    .line 983
    move-object v2, v1

    .line 984
    .line 985
    goto/16 :goto_5

    .line 986
    :pswitch_1c
    const/4 v5, 0x0

    .line 987
    .line 988
    new-instance v1, Landroidx/media3/common/util/ParsableByteArray;

    .line 989
    .line 990
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecId:Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    invoke-direct {v0, v2}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getCodecPrivate(Ljava/lang/String;)[B

    .line 994
    move-result-object v2

    .line 995
    .line 996
    .line 997
    invoke-direct {v1, v2}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 998
    .line 999
    .line 1000
    invoke-static {v1}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->parseMsAcmCodecPrivate(Landroidx/media3/common/util/ParsableByteArray;)Z

    .line 1001
    move-result v1

    .line 1002
    .line 1003
    if-eqz v1, :cond_28

    .line 1004
    .line 1005
    iget v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 1006
    .line 1007
    .line 1008
    invoke-static {v1}, Landroidx/media3/common/util/Util;->getPcmEncoding(I)I

    .line 1009
    move-result v1

    .line 1010
    .line 1011
    if-nez v1, :cond_27

    .line 1012
    .line 1013
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1014
    .line 1015
    .line 1016
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1017
    .line 1018
    const-string v2, "Unsupported PCM bit depth: "

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    iget v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->audioBitDepth:I

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1036
    move-result-object v1

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v4, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1040
    :goto_d
    move-object v1, v10

    .line 1041
    move-object v2, v1

    .line 1042
    .line 1043
    move-object/from16 v16, v14

    .line 1044
    .line 1045
    goto/16 :goto_5

    .line 1046
    :cond_27
    move v14, v1

    .line 1047
    move-object v1, v10

    .line 1048
    move-object v2, v1

    .line 1049
    .line 1050
    goto/16 :goto_a

    .line 1051
    .line 1052
    :cond_28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1053
    .line 1054
    .line 1055
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1056
    .line 1057
    const-string v2, "Non-PCM MS/ACM is unsupported. Setting mimeType to "

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1067
    move-result-object v1

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v4, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1071
    goto :goto_d

    .line 1072
    :pswitch_1d
    const/4 v5, 0x0

    .line 1073
    .line 1074
    iget-object v1, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->codecPrivate:[B

    .line 1075
    .line 1076
    if-nez v1, :cond_29

    .line 1077
    move-object v1, v10

    .line 1078
    goto :goto_e

    .line 1079
    .line 1080
    .line 1081
    :cond_29
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1082
    move-result-object v1

    .line 1083
    .line 1084
    .line 1085
    :goto_e
    const-string/jumbo v16, "video/mp4v-es"

    .line 1086
    .line 1087
    goto/16 :goto_b

    .line 1088
    .line 1089
    :goto_f
    iget-object v4, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->dolbyVisionConfigBytes:[B

    .line 1090
    .line 1091
    if-eqz v4, :cond_2a

    .line 1092
    .line 1093
    new-instance v4, Landroidx/media3/common/util/ParsableByteArray;

    .line 1094
    .line 1095
    iget-object v15, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->dolbyVisionConfigBytes:[B

    .line 1096
    .line 1097
    .line 1098
    invoke-direct {v4, v15}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 1099
    .line 1100
    .line 1101
    invoke-static {v4}, Landroidx/media3/extractor/DolbyVisionConfig;->parse(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/extractor/DolbyVisionConfig;

    .line 1102
    move-result-object v4

    .line 1103
    .line 1104
    if-eqz v4, :cond_2a

    .line 1105
    .line 1106
    iget-object v2, v4, Landroidx/media3/extractor/DolbyVisionConfig;->codecs:Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    const-string/jumbo v16, "video/dolby-vision"

    .line 1110
    .line 1111
    :cond_2a
    move-object/from16 v4, v16

    .line 1112
    .line 1113
    iget-boolean v15, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->flagDefault:Z

    .line 1114
    .line 1115
    iget-boolean v3, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->flagForced:Z

    .line 1116
    .line 1117
    if-eqz v3, :cond_2b

    .line 1118
    const/4 v3, 0x2

    .line 1119
    goto :goto_10

    .line 1120
    :cond_2b
    move v3, v5

    .line 1121
    :goto_10
    or-int/2addr v3, v15

    .line 1122
    .line 1123
    new-instance v15, Landroidx/media3/common/Format$Builder;

    .line 1124
    .line 1125
    .line 1126
    invoke-direct {v15}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    invoke-static {v4}, Landroidx/media3/common/MimeTypes;->isAudio(Ljava/lang/String;)Z

    .line 1130
    move-result v16

    .line 1131
    .line 1132
    if-eqz v16, :cond_2c

    .line 1133
    .line 1134
    iget v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->channelCount:I

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v15, v5}, Landroidx/media3/common/Format$Builder;->setChannelCount(I)Landroidx/media3/common/Format$Builder;

    .line 1138
    move-result-object v5

    .line 1139
    .line 1140
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->sampleRate:I

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v5, v7}, Landroidx/media3/common/Format$Builder;->setSampleRate(I)Landroidx/media3/common/Format$Builder;

    .line 1144
    move-result-object v5

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v5, v14}, Landroidx/media3/common/Format$Builder;->setPcmEncoding(I)Landroidx/media3/common/Format$Builder;

    .line 1148
    const/4 v5, 0x1

    .line 1149
    .line 1150
    goto/16 :goto_16

    .line 1151
    .line 1152
    .line 1153
    :cond_2c
    invoke-static {v4}, Landroidx/media3/common/MimeTypes;->isVideo(Ljava/lang/String;)Z

    .line 1154
    move-result v14

    .line 1155
    .line 1156
    if-eqz v14, :cond_38

    .line 1157
    .line 1158
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayUnit:I

    .line 1159
    .line 1160
    if-nez v7, :cond_2f

    .line 1161
    .line 1162
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayWidth:I

    .line 1163
    const/4 v8, -0x1

    .line 1164
    .line 1165
    if-ne v7, v8, :cond_2d

    .line 1166
    .line 1167
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->width:I

    .line 1168
    .line 1169
    :cond_2d
    iput v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayWidth:I

    .line 1170
    .line 1171
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayHeight:I

    .line 1172
    .line 1173
    if-ne v7, v8, :cond_2e

    .line 1174
    .line 1175
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->height:I

    .line 1176
    .line 1177
    :cond_2e
    iput v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayHeight:I

    .line 1178
    goto :goto_11

    .line 1179
    :cond_2f
    const/4 v8, -0x1

    .line 1180
    .line 1181
    :goto_11
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayWidth:I

    .line 1182
    .line 1183
    if-eq v7, v8, :cond_30

    .line 1184
    .line 1185
    iget v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->displayHeight:I

    .line 1186
    .line 1187
    if-eq v9, v8, :cond_30

    .line 1188
    .line 1189
    iget v11, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->height:I

    .line 1190
    mul-int/2addr v11, v7

    .line 1191
    int-to-float v7, v11

    .line 1192
    .line 1193
    iget v11, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->width:I

    .line 1194
    mul-int/2addr v11, v9

    .line 1195
    int-to-float v9, v11

    .line 1196
    div-float/2addr v7, v9

    .line 1197
    goto :goto_12

    .line 1198
    .line 1199
    :cond_30
    const/high16 v7, -0x40800000    # -1.0f

    .line 1200
    .line 1201
    :goto_12
    iget-boolean v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->hasColorInfo:Z

    .line 1202
    .line 1203
    if-eqz v9, :cond_31

    .line 1204
    .line 1205
    .line 1206
    invoke-direct {v0}, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->getHdrStaticInfo()[B

    .line 1207
    move-result-object v9

    .line 1208
    .line 1209
    new-instance v10, Landroidx/media3/common/ColorInfo$Builder;

    .line 1210
    .line 1211
    .line 1212
    invoke-direct {v10}, Landroidx/media3/common/ColorInfo$Builder;-><init>()V

    .line 1213
    .line 1214
    iget v11, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->colorSpace:I

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v10, v11}, Landroidx/media3/common/ColorInfo$Builder;->setColorSpace(I)Landroidx/media3/common/ColorInfo$Builder;

    .line 1218
    move-result-object v10

    .line 1219
    .line 1220
    iget v11, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->colorRange:I

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v10, v11}, Landroidx/media3/common/ColorInfo$Builder;->setColorRange(I)Landroidx/media3/common/ColorInfo$Builder;

    .line 1224
    move-result-object v10

    .line 1225
    .line 1226
    iget v11, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->colorTransfer:I

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v10, v11}, Landroidx/media3/common/ColorInfo$Builder;->setColorTransfer(I)Landroidx/media3/common/ColorInfo$Builder;

    .line 1230
    move-result-object v10

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v10, v9}, Landroidx/media3/common/ColorInfo$Builder;->setHdrStaticInfo([B)Landroidx/media3/common/ColorInfo$Builder;

    .line 1234
    move-result-object v9

    .line 1235
    .line 1236
    iget v10, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->bitsPerChannel:I

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v9, v10}, Landroidx/media3/common/ColorInfo$Builder;->setLumaBitdepth(I)Landroidx/media3/common/ColorInfo$Builder;

    .line 1240
    move-result-object v9

    .line 1241
    .line 1242
    iget v10, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->bitsPerChannel:I

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v9, v10}, Landroidx/media3/common/ColorInfo$Builder;->setChromaBitdepth(I)Landroidx/media3/common/ColorInfo$Builder;

    .line 1246
    move-result-object v9

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v9}, Landroidx/media3/common/ColorInfo$Builder;->build()Landroidx/media3/common/ColorInfo;

    .line 1250
    move-result-object v10

    .line 1251
    .line 1252
    :cond_31
    iget-object v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->name:Ljava/lang/String;

    .line 1253
    .line 1254
    if-eqz v9, :cond_32

    .line 1255
    .line 1256
    .line 1257
    invoke-static {}, Landroidx/media3/extractor/mkv/MatroskaExtractor;->access$600()Ljava/util/Map;

    .line 1258
    move-result-object v9

    .line 1259
    .line 1260
    iget-object v11, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->name:Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    invoke-interface {v9, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1264
    move-result v9

    .line 1265
    .line 1266
    if-eqz v9, :cond_32

    .line 1267
    .line 1268
    .line 1269
    invoke-static {}, Landroidx/media3/extractor/mkv/MatroskaExtractor;->access$600()Ljava/util/Map;

    .line 1270
    move-result-object v8

    .line 1271
    .line 1272
    iget-object v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->name:Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1276
    move-result-object v8

    .line 1277
    .line 1278
    check-cast v8, Ljava/lang/Integer;

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1282
    move-result v8

    .line 1283
    .line 1284
    :cond_32
    iget v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionType:I

    .line 1285
    .line 1286
    if-nez v9, :cond_37

    .line 1287
    .line 1288
    iget v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseYaw:F

    .line 1289
    const/4 v11, 0x0

    .line 1290
    .line 1291
    .line 1292
    invoke-static {v9, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1293
    move-result v9

    .line 1294
    .line 1295
    if-nez v9, :cond_37

    .line 1296
    .line 1297
    iget v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPosePitch:F

    .line 1298
    .line 1299
    .line 1300
    invoke-static {v9, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1301
    move-result v9

    .line 1302
    .line 1303
    if-nez v9, :cond_37

    .line 1304
    .line 1305
    iget v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseRoll:F

    .line 1306
    .line 1307
    .line 1308
    invoke-static {v9, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1309
    move-result v9

    .line 1310
    .line 1311
    if-nez v9, :cond_33

    .line 1312
    goto :goto_14

    .line 1313
    .line 1314
    :cond_33
    iget v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseRoll:F

    .line 1315
    .line 1316
    const/high16 v9, 0x42b40000    # 90.0f

    .line 1317
    .line 1318
    .line 1319
    invoke-static {v5, v9}, Ljava/lang/Float;->compare(FF)I

    .line 1320
    move-result v5

    .line 1321
    .line 1322
    if-nez v5, :cond_34

    .line 1323
    .line 1324
    const/16 v5, 0x5a

    .line 1325
    goto :goto_14

    .line 1326
    .line 1327
    :cond_34
    iget v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseRoll:F

    .line 1328
    .line 1329
    const/high16 v9, -0x3ccc0000    # -180.0f

    .line 1330
    .line 1331
    .line 1332
    invoke-static {v5, v9}, Ljava/lang/Float;->compare(FF)I

    .line 1333
    move-result v5

    .line 1334
    .line 1335
    if-eqz v5, :cond_36

    .line 1336
    .line 1337
    iget v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseRoll:F

    .line 1338
    .line 1339
    const/high16 v9, 0x43340000    # 180.0f

    .line 1340
    .line 1341
    .line 1342
    invoke-static {v5, v9}, Ljava/lang/Float;->compare(FF)I

    .line 1343
    move-result v5

    .line 1344
    .line 1345
    if-nez v5, :cond_35

    .line 1346
    goto :goto_13

    .line 1347
    .line 1348
    :cond_35
    iget v5, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionPoseRoll:F

    .line 1349
    .line 1350
    const/high16 v9, -0x3d4c0000    # -90.0f

    .line 1351
    .line 1352
    .line 1353
    invoke-static {v5, v9}, Ljava/lang/Float;->compare(FF)I

    .line 1354
    move-result v5

    .line 1355
    .line 1356
    if-nez v5, :cond_37

    .line 1357
    .line 1358
    const/16 v5, 0x10e

    .line 1359
    goto :goto_14

    .line 1360
    .line 1361
    :cond_36
    :goto_13
    const/16 v5, 0xb4

    .line 1362
    goto :goto_14

    .line 1363
    :cond_37
    move v5, v8

    .line 1364
    .line 1365
    :goto_14
    iget v8, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->width:I

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v15, v8}, Landroidx/media3/common/Format$Builder;->setWidth(I)Landroidx/media3/common/Format$Builder;

    .line 1369
    move-result-object v8

    .line 1370
    .line 1371
    iget v9, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->height:I

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v8, v9}, Landroidx/media3/common/Format$Builder;->setHeight(I)Landroidx/media3/common/Format$Builder;

    .line 1375
    move-result-object v8

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v8, v7}, Landroidx/media3/common/Format$Builder;->setPixelWidthHeightRatio(F)Landroidx/media3/common/Format$Builder;

    .line 1379
    move-result-object v7

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v7, v5}, Landroidx/media3/common/Format$Builder;->setRotationDegrees(I)Landroidx/media3/common/Format$Builder;

    .line 1383
    move-result-object v5

    .line 1384
    .line 1385
    iget-object v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->projectionData:[B

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v5, v7}, Landroidx/media3/common/Format$Builder;->setProjectionData([B)Landroidx/media3/common/Format$Builder;

    .line 1389
    move-result-object v5

    .line 1390
    .line 1391
    iget v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->stereoMode:I

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v5, v7}, Landroidx/media3/common/Format$Builder;->setStereoMode(I)Landroidx/media3/common/Format$Builder;

    .line 1395
    move-result-object v5

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v5, v10}, Landroidx/media3/common/Format$Builder;->setColorInfo(Landroidx/media3/common/ColorInfo;)Landroidx/media3/common/Format$Builder;

    .line 1399
    const/4 v5, 0x2

    .line 1400
    goto :goto_16

    .line 1401
    .line 1402
    .line 1403
    :cond_38
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1404
    move-result v5

    .line 1405
    .line 1406
    if-nez v5, :cond_3a

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1410
    move-result v5

    .line 1411
    .line 1412
    if-nez v5, :cond_3a

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1416
    move-result v5

    .line 1417
    .line 1418
    if-nez v5, :cond_3a

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1422
    move-result v5

    .line 1423
    .line 1424
    if-nez v5, :cond_3a

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1428
    move-result v5

    .line 1429
    .line 1430
    if-nez v5, :cond_3a

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1434
    move-result v5

    .line 1435
    .line 1436
    if-eqz v5, :cond_39

    .line 1437
    goto :goto_15

    .line 1438
    .line 1439
    :cond_39
    const-string v1, "Unexpected MIME type."

    .line 1440
    .line 1441
    .line 1442
    invoke-static {v1, v10}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 1443
    move-result-object v1

    .line 1444
    throw v1

    .line 1445
    :cond_3a
    :goto_15
    const/4 v5, 0x3

    .line 1446
    .line 1447
    :goto_16
    iget-object v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->name:Ljava/lang/String;

    .line 1448
    .line 1449
    if-eqz v7, :cond_3b

    .line 1450
    .line 1451
    .line 1452
    invoke-static {}, Landroidx/media3/extractor/mkv/MatroskaExtractor;->access$600()Ljava/util/Map;

    .line 1453
    move-result-object v7

    .line 1454
    .line 1455
    iget-object v8, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->name:Ljava/lang/String;

    .line 1456
    .line 1457
    .line 1458
    invoke-interface {v7, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1459
    move-result v7

    .line 1460
    .line 1461
    if-nez v7, :cond_3b

    .line 1462
    .line 1463
    iget-object v7, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->name:Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v15, v7}, Landroidx/media3/common/Format$Builder;->setLabel(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 1467
    .line 1468
    :cond_3b
    move/from16 v7, p2

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v15, v7}, Landroidx/media3/common/Format$Builder;->setId(I)Landroidx/media3/common/Format$Builder;

    .line 1472
    move-result-object v7

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v7, v4}, Landroidx/media3/common/Format$Builder;->setSampleMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 1476
    move-result-object v4

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v4, v6}, Landroidx/media3/common/Format$Builder;->setMaxInputSize(I)Landroidx/media3/common/Format$Builder;

    .line 1480
    move-result-object v4

    .line 1481
    .line 1482
    iget-object v6, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->language:Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v4, v6}, Landroidx/media3/common/Format$Builder;->setLanguage(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 1486
    move-result-object v4

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v4, v3}, Landroidx/media3/common/Format$Builder;->setSelectionFlags(I)Landroidx/media3/common/Format$Builder;

    .line 1490
    move-result-object v3

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v3, v1}, Landroidx/media3/common/Format$Builder;->setInitializationData(Ljava/util/List;)Landroidx/media3/common/Format$Builder;

    .line 1494
    move-result-object v1

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setCodecs(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 1498
    move-result-object v1

    .line 1499
    .line 1500
    iget-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->drmInitData:Landroidx/media3/common/DrmInitData;

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setDrmInitData(Landroidx/media3/common/DrmInitData;)Landroidx/media3/common/Format$Builder;

    .line 1504
    move-result-object v1

    .line 1505
    .line 1506
    .line 1507
    invoke-virtual {v1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 1508
    move-result-object v1

    .line 1509
    .line 1510
    iget v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->number:I

    .line 1511
    .line 1512
    move-object/from16 v3, p1

    .line 1513
    .line 1514
    .line 1515
    invoke-interface {v3, v2, v5}, Landroidx/media3/extractor/ExtractorOutput;->track(II)Landroidx/media3/extractor/TrackOutput;

    .line 1516
    move-result-object v2

    .line 1517
    .line 1518
    iput-object v2, v0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->output:Landroidx/media3/extractor/TrackOutput;

    .line 1519
    .line 1520
    .line 1521
    invoke-interface {v2, v1}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 1522
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_1d
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_10
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
    .end packed-switch
.end method

.method public outputPendingSampleMetadata()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->trueHdSampleRechunker:Landroidx/media3/extractor/TrueHdSampleRechunker;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->output:Landroidx/media3/extractor/TrackOutput;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->cryptoData:Landroidx/media3/extractor/TrackOutput$CryptoData;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroidx/media3/extractor/TrueHdSampleRechunker;->outputPendingSampleMetadata(Landroidx/media3/extractor/TrackOutput;Landroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public reset()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/mkv/MatroskaExtractor$Track;->trueHdSampleRechunker:Landroidx/media3/extractor/TrueHdSampleRechunker;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/media3/extractor/TrueHdSampleRechunker;->reset()V

    .line 8
    :cond_0
    return-void
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
.end method
