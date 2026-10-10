.class final Landroidx/media3/common/audio/Sonic;
.super Ljava/lang/Object;
.source "Sonic.java"


# static fields
.field private static final AMDF_FREQUENCY:I = 0xfa0

.field private static final BYTES_PER_SAMPLE:I = 0x2

.field private static final MAXIMUM_PITCH:I = 0x190

.field private static final MINIMUM_PITCH:I = 0x41


# instance fields
.field private accumulatedSpeedAdjustmentError:D

.field private final channelCount:I

.field private final downSampleBuffer:[S

.field private inputBuffer:[S

.field private inputFrameCount:I

.field private final inputSampleRateHz:I

.field private maxDiff:I

.field private final maxPeriod:I

.field private final maxRequiredFrameCount:I

.field private minDiff:I

.field private final minPeriod:I

.field private newRatePosition:I

.field private oldRatePosition:I

.field private outputBuffer:[S

.field private outputFrameCount:I

.field private final pitch:F

.field private pitchBuffer:[S

.field private pitchFrameCount:I

.field private prevMinDiff:I

.field private prevPeriod:I

.field private final rate:F

.field private remainingInputToCopyFrameCount:I

.field private final speed:F


# direct methods
.method public constructor <init>(IIFFI)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->inputSampleRateHz:I

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 8
    .line 9
    iput p3, p0, Landroidx/media3/common/audio/Sonic;->speed:F

    .line 10
    .line 11
    iput p4, p0, Landroidx/media3/common/audio/Sonic;->pitch:F

    .line 12
    int-to-float p3, p1

    .line 13
    int-to-float p4, p5

    .line 14
    div-float/2addr p3, p4

    .line 15
    .line 16
    iput p3, p0, Landroidx/media3/common/audio/Sonic;->rate:F

    .line 17
    .line 18
    div-int/lit16 p3, p1, 0x190

    .line 19
    .line 20
    iput p3, p0, Landroidx/media3/common/audio/Sonic;->minPeriod:I

    .line 21
    .line 22
    div-int/lit8 p1, p1, 0x41

    .line 23
    .line 24
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->maxPeriod:I

    .line 25
    .line 26
    mul-int/lit8 p1, p1, 0x2

    .line 27
    .line 28
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 29
    .line 30
    new-array p3, p1, [S

    .line 31
    .line 32
    iput-object p3, p0, Landroidx/media3/common/audio/Sonic;->downSampleBuffer:[S

    .line 33
    .line 34
    mul-int p3, p1, p2

    .line 35
    .line 36
    new-array p3, p3, [S

    .line 37
    .line 38
    iput-object p3, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 39
    .line 40
    mul-int p3, p1, p2

    .line 41
    .line 42
    new-array p3, p3, [S

    .line 43
    .line 44
    iput-object p3, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 45
    mul-int/2addr p1, p2

    .line 46
    .line 47
    new-array p1, p1, [S

    .line 48
    .line 49
    iput-object p1, p0, Landroidx/media3/common/audio/Sonic;->pitchBuffer:[S

    .line 50
    return-void
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
.end method

.method private adjustRate(FI)V
    .locals 12

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputSampleRateHz:I

    .line 8
    int-to-float v1, v0

    .line 9
    div-float/2addr v1, p1

    .line 10
    float-to-long v1, v1

    .line 11
    int-to-long v3, v0

    .line 12
    move-wide v10, v1

    .line 13
    move-wide v8, v3

    .line 14
    .line 15
    :goto_0
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    cmp-long p1, v10, v0

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    cmp-long p1, v8, v0

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    const-wide/16 v2, 0x2

    .line 26
    .line 27
    rem-long v4, v10, v2

    .line 28
    .line 29
    cmp-long p1, v4, v0

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    rem-long v4, v8, v2

    .line 34
    .line 35
    cmp-long p1, v4, v0

    .line 36
    .line 37
    if-nez p1, :cond_1

    .line 38
    div-long/2addr v10, v2

    .line 39
    div-long/2addr v8, v2

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-direct {p0, p2}, Landroidx/media3/common/audio/Sonic;->moveNewSamplesToPitchBuffer(I)V

    .line 44
    const/4 p1, 0x0

    .line 45
    move p2, p1

    .line 46
    .line 47
    :goto_1
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 48
    .line 49
    add-int/lit8 v1, v0, -0x1

    .line 50
    const/4 v2, 0x1

    .line 51
    .line 52
    if-ge p2, v1, :cond_6

    .line 53
    .line 54
    :goto_2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->oldRatePosition:I

    .line 55
    .line 56
    add-int/lit8 v1, v0, 0x1

    .line 57
    int-to-long v3, v1

    .line 58
    mul-long/2addr v3, v10

    .line 59
    .line 60
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->newRatePosition:I

    .line 61
    int-to-long v5, v1

    .line 62
    mul-long/2addr v5, v8

    .line 63
    .line 64
    cmp-long v3, v3, v5

    .line 65
    .line 66
    if-lez v3, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 69
    .line 70
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 74
    move-result-object v0

    .line 75
    .line 76
    iput-object v0, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 77
    move v0, p1

    .line 78
    .line 79
    :goto_3
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 80
    .line 81
    if-ge v0, v1, :cond_2

    .line 82
    .line 83
    iget-object v3, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 84
    .line 85
    iget v4, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 86
    mul-int/2addr v4, v1

    .line 87
    add-int/2addr v4, v0

    .line 88
    .line 89
    iget-object v6, p0, Landroidx/media3/common/audio/Sonic;->pitchBuffer:[S

    .line 90
    mul-int/2addr v1, p2

    .line 91
    .line 92
    add-int v7, v1, v0

    .line 93
    move-object v5, p0

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v5 .. v11}, Landroidx/media3/common/audio/Sonic;->interpolate([SIJJ)S

    .line 97
    move-result v1

    .line 98
    .line 99
    aput-short v1, v3, v4

    .line 100
    .line 101
    add-int/lit8 v0, v0, 0x1

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    move-object v5, p0

    .line 104
    .line 105
    iget v0, v5, Landroidx/media3/common/audio/Sonic;->newRatePosition:I

    .line 106
    add-int/2addr v0, v2

    .line 107
    .line 108
    iput v0, v5, Landroidx/media3/common/audio/Sonic;->newRatePosition:I

    .line 109
    .line 110
    iget v0, v5, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 111
    add-int/2addr v0, v2

    .line 112
    .line 113
    iput v0, v5, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move-object v5, p0

    .line 116
    .line 117
    add-int/lit8 v0, v0, 0x1

    .line 118
    .line 119
    iput v0, v5, Landroidx/media3/common/audio/Sonic;->oldRatePosition:I

    .line 120
    int-to-long v3, v0

    .line 121
    .line 122
    cmp-long v0, v3, v8

    .line 123
    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    iput p1, v5, Landroidx/media3/common/audio/Sonic;->oldRatePosition:I

    .line 127
    int-to-long v0, v1

    .line 128
    .line 129
    cmp-long v0, v0, v10

    .line 130
    .line 131
    if-nez v0, :cond_4

    .line 132
    goto :goto_4

    .line 133
    :cond_4
    move v2, p1

    .line 134
    .line 135
    .line 136
    :goto_4
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 137
    .line 138
    iput p1, v5, Landroidx/media3/common/audio/Sonic;->newRatePosition:I

    .line 139
    .line 140
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    move-object v5, p0

    .line 143
    sub-int/2addr v0, v2

    .line 144
    .line 145
    .line 146
    invoke-direct {p0, v0}, Landroidx/media3/common/audio/Sonic;->removePitchFrames(I)V

    .line 147
    return-void
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
.end method

.method private changeSpeed(D)V
    .locals 8

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    move v4, v1

    .line 10
    .line 11
    :goto_0
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 12
    .line 13
    if-lez v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v4}, Landroidx/media3/common/audio/Sonic;->copyInputToOutput(I)I

    .line 17
    move-result v1

    .line 18
    add-int/2addr v4, v1

    .line 19
    move-object v2, p0

    .line 20
    move-wide v5, p1

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_1
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v1, v4}, Landroidx/media3/common/audio/Sonic;->findPitchPeriod([SI)I

    .line 27
    move-result v7

    .line 28
    .line 29
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 30
    .line 31
    cmpl-double v1, p1, v1

    .line 32
    .line 33
    if-lez v1, :cond_2

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 36
    move-object v2, p0

    .line 37
    move-wide v5, p1

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v2 .. v7}, Landroidx/media3/common/audio/Sonic;->skipPitchPeriod([SIDI)I

    .line 41
    move-result p1

    .line 42
    add-int/2addr v7, p1

    .line 43
    add-int/2addr v4, v7

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v2, p0

    .line 46
    move-wide v5, p1

    .line 47
    .line 48
    iget-object v3, v2, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v2 .. v7}, Landroidx/media3/common/audio/Sonic;->insertPitchPeriod([SIDI)I

    .line 52
    move-result p1

    .line 53
    add-int/2addr v4, p1

    .line 54
    .line 55
    :goto_1
    iget p1, v2, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 56
    add-int/2addr p1, v4

    .line 57
    .line 58
    if-le p1, v0, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v4}, Landroidx/media3/common/audio/Sonic;->removeProcessedInputFrames(I)V

    .line 62
    return-void

    .line 63
    :cond_3
    move-wide p1, v5

    .line 64
    goto :goto_0
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method

.method private copyInputToOutput(I)I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 8
    move-result v0

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v1, p1, v0}, Landroidx/media3/common/audio/Sonic;->copyToOutput([SII)V

    .line 14
    .line 15
    iget p1, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 16
    sub-int/2addr p1, v0

    .line 17
    .line 18
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private copyToOutput([SII)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p3}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 11
    .line 12
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 13
    mul-int/2addr p2, v1

    .line 14
    .line 15
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 16
    mul-int/2addr v2, v1

    .line 17
    mul-int/2addr v1, p3

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    iget p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 23
    add-int/2addr p1, p3

    .line 24
    .line 25
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 26
    return-void
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
.end method

.method private downSampleInput([SII)V
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 3
    div-int/2addr v0, p3

    .line 4
    .line 5
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 6
    mul-int/2addr p3, v1

    .line 7
    mul-int/2addr p2, v1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    move v3, v1

    .line 13
    move v4, v3

    .line 14
    .line 15
    :goto_1
    if-ge v3, p3, :cond_0

    .line 16
    .line 17
    mul-int v5, v2, p3

    .line 18
    add-int/2addr v5, p2

    .line 19
    add-int/2addr v5, v3

    .line 20
    .line 21
    aget-short v5, p1, v5

    .line 22
    add-int/2addr v4, v5

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    div-int/2addr v4, p3

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/media3/common/audio/Sonic;->downSampleBuffer:[S

    .line 29
    int-to-short v4, v4

    .line 30
    .line 31
    aput-short v4, v3, v2

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
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
.end method

.method private ensureSpaceForAdditionalFrames([SII)[S
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 4
    div-int/2addr v0, v1

    .line 5
    add-int/2addr p2, p3

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    return-object p1

    .line 9
    .line 10
    :cond_0
    mul-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    div-int/lit8 v0, v0, 0x2

    .line 13
    add-int/2addr v0, p3

    .line 14
    mul-int/2addr v0, v1

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([SI)[S

    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
.end method

.method private findPitchPeriod([SI)I
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputSampleRateHz:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    const/16 v2, 0xfa0

    .line 6
    .line 7
    if-le v0, v2, :cond_0

    .line 8
    div-int/2addr v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    .line 12
    :goto_0
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 13
    .line 14
    if-ne v2, v1, :cond_1

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->minPeriod:I

    .line 19
    .line 20
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->maxPeriod:I

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/common/audio/Sonic;->findPitchPeriodInRange([SIII)I

    .line 24
    move-result p1

    .line 25
    goto :goto_1

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/common/audio/Sonic;->downSampleInput([SII)V

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/media3/common/audio/Sonic;->downSampleBuffer:[S

    .line 31
    .line 32
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->minPeriod:I

    .line 33
    div-int/2addr v3, v0

    .line 34
    .line 35
    iget v4, p0, Landroidx/media3/common/audio/Sonic;->maxPeriod:I

    .line 36
    div-int/2addr v4, v0

    .line 37
    const/4 v5, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v2, v5, v3, v4}, Landroidx/media3/common/audio/Sonic;->findPitchPeriodInRange([SIII)I

    .line 41
    move-result v2

    .line 42
    .line 43
    if-eq v0, v1, :cond_5

    .line 44
    mul-int/2addr v2, v0

    .line 45
    .line 46
    mul-int/lit8 v0, v0, 0x4

    .line 47
    .line 48
    sub-int v3, v2, v0

    .line 49
    add-int/2addr v2, v0

    .line 50
    .line 51
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->minPeriod:I

    .line 52
    .line 53
    if-ge v3, v0, :cond_2

    .line 54
    move v3, v0

    .line 55
    .line 56
    :cond_2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->maxPeriod:I

    .line 57
    .line 58
    if-le v2, v0, :cond_3

    .line 59
    move v2, v0

    .line 60
    .line 61
    :cond_3
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 62
    .line 63
    if-ne v0, v1, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, p2, v3, v2}, Landroidx/media3/common/audio/Sonic;->findPitchPeriodInRange([SIII)I

    .line 67
    move-result p1

    .line 68
    goto :goto_1

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-direct {p0, p1, p2, v1}, Landroidx/media3/common/audio/Sonic;->downSampleInput([SII)V

    .line 72
    .line 73
    iget-object p1, p0, Landroidx/media3/common/audio/Sonic;->downSampleBuffer:[S

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, p1, v5, v3, v2}, Landroidx/media3/common/audio/Sonic;->findPitchPeriodInRange([SIII)I

    .line 77
    move-result p1

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    move p1, v2

    .line 80
    .line 81
    :goto_1
    iget p2, p0, Landroidx/media3/common/audio/Sonic;->minDiff:I

    .line 82
    .line 83
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->maxDiff:I

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, p2, v0}, Landroidx/media3/common/audio/Sonic;->previousPeriodBetter(II)Z

    .line 87
    move-result p2

    .line 88
    .line 89
    if-eqz p2, :cond_6

    .line 90
    .line 91
    iget p2, p0, Landroidx/media3/common/audio/Sonic;->prevPeriod:I

    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move p2, p1

    .line 94
    .line 95
    :goto_2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->minDiff:I

    .line 96
    .line 97
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->prevMinDiff:I

    .line 98
    .line 99
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->prevPeriod:I

    .line 100
    return p2
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
.end method

.method private findPitchPeriodInRange([SIII)I
    .locals 9

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 3
    mul-int/2addr p2, v0

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    const/16 v1, 0xff

    .line 7
    const/4 v2, 0x1

    .line 8
    move v3, v0

    .line 9
    move v4, v3

    .line 10
    .line 11
    :goto_0
    if-gt p3, p4, :cond_3

    .line 12
    move v5, v0

    .line 13
    move v6, v5

    .line 14
    .line 15
    :goto_1
    if-ge v5, p3, :cond_0

    .line 16
    .line 17
    add-int v7, p2, v5

    .line 18
    .line 19
    aget-short v7, p1, v7

    .line 20
    .line 21
    add-int v8, p2, p3

    .line 22
    add-int/2addr v8, v5

    .line 23
    .line 24
    aget-short v8, p1, v8

    .line 25
    sub-int/2addr v7, v8

    .line 26
    .line 27
    .line 28
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 29
    move-result v7

    .line 30
    add-int/2addr v6, v7

    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_0
    mul-int v5, v6, v3

    .line 36
    .line 37
    mul-int v7, v2, p3

    .line 38
    .line 39
    if-ge v5, v7, :cond_1

    .line 40
    move v3, p3

    .line 41
    move v2, v6

    .line 42
    .line 43
    :cond_1
    mul-int v5, v6, v1

    .line 44
    .line 45
    mul-int v7, v4, p3

    .line 46
    .line 47
    if-le v5, v7, :cond_2

    .line 48
    move v1, p3

    .line 49
    move v4, v6

    .line 50
    .line 51
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    div-int/2addr v2, v3

    .line 54
    .line 55
    iput v2, p0, Landroidx/media3/common/audio/Sonic;->minDiff:I

    .line 56
    div-int/2addr v4, v1

    .line 57
    .line 58
    iput v4, p0, Landroidx/media3/common/audio/Sonic;->maxDiff:I

    .line 59
    return v3
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
.end method

.method private insertPitchPeriod([SIDI)I
    .locals 14

    .line 1
    .line 2
    move/from16 v0, p5

    .line 3
    .line 4
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    .line 5
    .line 6
    cmpg-double v1, p3, v1

    .line 7
    .line 8
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 9
    .line 10
    if-gez v1, :cond_0

    .line 11
    int-to-double v4, v0

    .line 12
    .line 13
    mul-double v4, v4, p3

    .line 14
    .line 15
    sub-double v2, v2, p3

    .line 16
    div-double/2addr v4, v2

    .line 17
    .line 18
    iget-wide v1, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 19
    add-double/2addr v4, v1

    .line 20
    .line 21
    .line 22
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 23
    move-result-wide v1

    .line 24
    long-to-int v1, v1

    .line 25
    int-to-double v2, v1

    .line 26
    sub-double/2addr v4, v2

    .line 27
    .line 28
    iput-wide v4, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 29
    move v6, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    int-to-double v4, v0

    .line 32
    .line 33
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 34
    .line 35
    mul-double v6, v6, p3

    .line 36
    sub-double/2addr v6, v2

    .line 37
    mul-double/2addr v4, v6

    .line 38
    .line 39
    sub-double v2, v2, p3

    .line 40
    div-double/2addr v4, v2

    .line 41
    .line 42
    iget-wide v1, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 43
    add-double/2addr v4, v1

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 47
    move-result-wide v1

    .line 48
    long-to-int v1, v1

    .line 49
    .line 50
    iput v1, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 51
    int-to-double v1, v1

    .line 52
    sub-double/2addr v4, v1

    .line 53
    .line 54
    iput-wide v4, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 55
    move v6, v0

    .line 56
    .line 57
    :goto_0
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 58
    .line 59
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 60
    .line 61
    add-int v3, v0, v6

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v1, v2, v3}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 65
    move-result-object v1

    .line 66
    .line 67
    iput-object v1, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 68
    .line 69
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 70
    .line 71
    mul-int v4, p2, v2

    .line 72
    .line 73
    iget v5, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 74
    mul-int/2addr v5, v2

    .line 75
    mul-int/2addr v2, v0

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v4, v1, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    iget v7, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 81
    .line 82
    iget-object v8, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 83
    .line 84
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 85
    .line 86
    add-int v9, v1, v0

    .line 87
    .line 88
    add-int v11, p2, v0

    .line 89
    move-object v12, p1

    .line 90
    move-object v10, p1

    .line 91
    .line 92
    move/from16 v13, p2

    .line 93
    .line 94
    .line 95
    invoke-static/range {v6 .. v13}, Landroidx/media3/common/audio/Sonic;->overlapAdd(II[SI[SI[SI)V

    .line 96
    .line 97
    iget p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 98
    add-int/2addr p1, v3

    .line 99
    .line 100
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 101
    return v6
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
.end method

.method private interpolate([SIJJ)S
    .locals 5

    .line 1
    .line 2
    aget-short v0, p1, p2

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 5
    add-int/2addr p2, v1

    .line 6
    .line 7
    aget-short p1, p1, p2

    .line 8
    .line 9
    iget p2, p0, Landroidx/media3/common/audio/Sonic;->newRatePosition:I

    .line 10
    int-to-long v1, p2

    .line 11
    mul-long/2addr v1, p3

    .line 12
    .line 13
    iget p2, p0, Landroidx/media3/common/audio/Sonic;->oldRatePosition:I

    .line 14
    int-to-long p3, p2

    .line 15
    mul-long/2addr p3, p5

    .line 16
    .line 17
    add-int/lit8 p2, p2, 0x1

    .line 18
    int-to-long v3, p2

    .line 19
    mul-long/2addr v3, p5

    .line 20
    .line 21
    sub-long p5, v3, v1

    .line 22
    sub-long/2addr v3, p3

    .line 23
    int-to-long p2, v0

    .line 24
    mul-long/2addr p2, p5

    .line 25
    .line 26
    sub-long p4, v3, p5

    .line 27
    int-to-long v0, p1

    .line 28
    mul-long/2addr p4, v0

    .line 29
    add-long/2addr p2, p4

    .line 30
    div-long/2addr p2, v3

    .line 31
    long-to-int p1, p2

    .line 32
    int-to-short p1, p1

    .line 33
    return p1
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
.end method

.method private moveNewSamplesToPitchBuffer(I)V
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 3
    sub-int/2addr v0, p1

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->pitchBuffer:[S

    .line 6
    .line 7
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v1, v2, v0}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 11
    move-result-object v1

    .line 12
    .line 13
    iput-object v1, p0, Landroidx/media3/common/audio/Sonic;->pitchBuffer:[S

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 16
    .line 17
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 18
    .line 19
    mul-int v4, p1, v3

    .line 20
    .line 21
    iget v5, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 22
    mul-int/2addr v5, v3

    .line 23
    mul-int/2addr v3, v0

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v4, v1, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 29
    .line 30
    iget p1, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 31
    add-int/2addr p1, v0

    .line 32
    .line 33
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

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

.method private static overlapAdd(II[SI[SI[SI)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    if-ge v1, p1, :cond_1

    .line 5
    .line 6
    mul-int v2, p3, p1

    .line 7
    add-int/2addr v2, v1

    .line 8
    .line 9
    mul-int v3, p7, p1

    .line 10
    add-int/2addr v3, v1

    .line 11
    .line 12
    mul-int v4, p5, p1

    .line 13
    add-int/2addr v4, v1

    .line 14
    move v5, v0

    .line 15
    .line 16
    :goto_1
    if-ge v5, p0, :cond_0

    .line 17
    .line 18
    aget-short v6, p4, v4

    .line 19
    .line 20
    sub-int v7, p0, v5

    .line 21
    mul-int/2addr v6, v7

    .line 22
    .line 23
    aget-short v7, p6, v3

    .line 24
    mul-int/2addr v7, v5

    .line 25
    add-int/2addr v6, v7

    .line 26
    div-int/2addr v6, p0

    .line 27
    int-to-short v6, v6

    .line 28
    .line 29
    aput-short v6, p2, v2

    .line 30
    add-int/2addr v2, p1

    .line 31
    add-int/2addr v4, p1

    .line 32
    add-int/2addr v3, p1

    .line 33
    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
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
.end method

.method private previousPeriodBetter(II)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->prevPeriod:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    mul-int/lit8 v1, p1, 0x3

    .line 11
    .line 12
    if-le p2, v1, :cond_1

    .line 13
    return v0

    .line 14
    .line 15
    :cond_1
    mul-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    iget p2, p0, Landroidx/media3/common/audio/Sonic;->prevMinDiff:I

    .line 18
    .line 19
    mul-int/lit8 p2, p2, 0x3

    .line 20
    .line 21
    if-gt p1, p2, :cond_2

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_3
    :goto_0
    return v0
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

.method private processStreamInput()V
    .locals 7

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->speed:F

    .line 5
    .line 6
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->pitch:F

    .line 7
    div-float/2addr v1, v2

    .line 8
    float-to-double v3, v1

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->rate:F

    .line 11
    mul-float/2addr v1, v2

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v5, 0x3ff0000a7c5ac472L    # 1.00001

    .line 17
    .line 18
    cmpl-double v2, v3, v5

    .line 19
    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v5, 0x3fefffeb074a771dL    # 0.99999

    .line 26
    .line 27
    cmpg-double v2, v3, v5

    .line 28
    .line 29
    if-gez v2, :cond_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget-object v2, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 33
    .line 34
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v2, v4, v3}, Landroidx/media3/common/audio/Sonic;->copyToOutput([SII)V

    .line 39
    .line 40
    iput v4, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 41
    goto :goto_1

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    invoke-direct {p0, v3, v4}, Landroidx/media3/common/audio/Sonic;->changeSpeed(D)V

    .line 45
    .line 46
    :goto_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    cmpl-float v2, v1, v2

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v1, v0}, Landroidx/media3/common/audio/Sonic;->adjustRate(FI)V

    .line 54
    :cond_2
    return-void
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
.end method

.method private removePitchFrames(I)V
    .locals 4

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/media3/common/audio/Sonic;->pitchBuffer:[S

    .line 6
    .line 7
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 8
    .line 9
    mul-int v2, p1, v1

    .line 10
    .line 11
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 12
    sub-int/2addr v3, p1

    .line 13
    mul-int/2addr v3, v1

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 20
    sub-int/2addr v0, p1

    .line 21
    .line 22
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 23
    return-void
.end method

.method private removeProcessedInputFrames(I)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 3
    sub-int/2addr v0, p1

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 6
    .line 7
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 8
    mul-int/2addr p1, v2

    .line 9
    const/4 v3, 0x0

    .line 10
    mul-int/2addr v2, v0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p1, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private skipPitchPeriod([SIDI)I
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p5

    .line 5
    .line 6
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 7
    .line 8
    cmpl-double v4, p3, v2

    .line 9
    .line 10
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 11
    .line 12
    if-ltz v4, :cond_0

    .line 13
    int-to-double v2, v1

    .line 14
    .line 15
    sub-double v4, p3, v5

    .line 16
    div-double/2addr v2, v4

    .line 17
    .line 18
    iget-wide v4, v0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 19
    add-double/2addr v2, v4

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 23
    move-result-wide v4

    .line 24
    long-to-int v4, v4

    .line 25
    int-to-double v5, v4

    .line 26
    sub-double/2addr v2, v5

    .line 27
    .line 28
    iput-wide v2, v0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 29
    move v9, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    int-to-double v7, v1

    .line 32
    .line 33
    sub-double v2, v2, p3

    .line 34
    mul-double/2addr v7, v2

    .line 35
    .line 36
    sub-double v2, p3, v5

    .line 37
    div-double/2addr v7, v2

    .line 38
    .line 39
    iget-wide v2, v0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 40
    add-double/2addr v7, v2

    .line 41
    .line 42
    .line 43
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 44
    move-result-wide v2

    .line 45
    long-to-int v2, v2

    .line 46
    .line 47
    iput v2, v0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 48
    int-to-double v2, v2

    .line 49
    sub-double/2addr v7, v2

    .line 50
    .line 51
    iput-wide v7, v0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 52
    move v9, v1

    .line 53
    .line 54
    :goto_0
    iget-object v2, v0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 55
    .line 56
    iget v3, v0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v2, v3, v9}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 60
    move-result-object v11

    .line 61
    .line 62
    iput-object v11, v0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 63
    .line 64
    iget v10, v0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 65
    .line 66
    iget v12, v0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 67
    .line 68
    add-int v16, p2, v1

    .line 69
    .line 70
    move-object/from16 v15, p1

    .line 71
    .line 72
    move-object/from16 v13, p1

    .line 73
    .line 74
    move/from16 v14, p2

    .line 75
    .line 76
    .line 77
    invoke-static/range {v9 .. v16}, Landroidx/media3/common/audio/Sonic;->overlapAdd(II[SI[SI[SI)V

    .line 78
    .line 79
    iget v1, v0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 80
    add-int/2addr v1, v9

    .line 81
    .line 82
    iput v1, v0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 83
    return v9
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
.end method


# virtual methods
.method public flush()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 8
    .line 9
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->oldRatePosition:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->newRatePosition:I

    .line 12
    .line 13
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 14
    .line 15
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->prevPeriod:I

    .line 16
    .line 17
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->prevMinDiff:I

    .line 18
    .line 19
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->minDiff:I

    .line 20
    .line 21
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->maxDiff:I

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 26
    return-void
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
.end method

.method public getOutput(Ljava/nio/ShortBuffer;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 7
    div-int/2addr v0, v1

    .line 8
    .line 9
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 13
    move-result v0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 16
    .line 17
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 18
    mul-int/2addr v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, v3, v2}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    .line 23
    .line 24
    iget p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 25
    sub-int/2addr p1, v0

    .line 26
    .line 27
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->outputBuffer:[S

    .line 30
    .line 31
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 32
    mul-int/2addr v0, v2

    .line 33
    mul-int/2addr p1, v2

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    return-void
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

.method public getOutputSize()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 5
    mul-int/2addr v0, v1

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    return v0
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

.method public getPendingInputBytes()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 5
    mul-int/2addr v0, v1

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    return v0
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

.method public queueEndOfStream()V
    .locals 10

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->speed:F

    .line 5
    .line 6
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->pitch:F

    .line 7
    div-float/2addr v1, v2

    .line 8
    float-to-double v3, v1

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->rate:F

    .line 11
    mul-float/2addr v1, v2

    .line 12
    float-to-double v1, v1

    .line 13
    .line 14
    iget v5, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 15
    .line 16
    sub-int v6, v0, v5

    .line 17
    .line 18
    iget v7, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 19
    int-to-double v8, v6

    .line 20
    div-double/2addr v8, v3

    .line 21
    int-to-double v3, v5

    .line 22
    add-double/2addr v8, v3

    .line 23
    .line 24
    iget-wide v3, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 25
    add-double/2addr v8, v3

    .line 26
    .line 27
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 28
    int-to-double v3, v3

    .line 29
    add-double/2addr v8, v3

    .line 30
    div-double/2addr v8, v1

    .line 31
    .line 32
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    .line 33
    add-double/2addr v8, v1

    .line 34
    double-to-int v1, v8

    .line 35
    add-int/2addr v7, v1

    .line 36
    .line 37
    const-wide/16 v1, 0x0

    .line 38
    .line 39
    iput-wide v1, p0, Landroidx/media3/common/audio/Sonic;->accumulatedSpeedAdjustmentError:D

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 42
    .line 43
    iget v2, p0, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 44
    .line 45
    mul-int/lit8 v2, v2, 0x2

    .line 46
    add-int/2addr v2, v0

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v1, v0, v2}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 50
    move-result-object v1

    .line 51
    .line 52
    iput-object v1, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 53
    const/4 v1, 0x0

    .line 54
    move v2, v1

    .line 55
    .line 56
    :goto_0
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->maxRequiredFrameCount:I

    .line 57
    .line 58
    mul-int/lit8 v4, v3, 0x2

    .line 59
    .line 60
    iget v5, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 61
    mul-int/2addr v4, v5

    .line 62
    .line 63
    if-ge v2, v4, :cond_0

    .line 64
    .line 65
    iget-object v3, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 66
    mul-int/2addr v5, v0

    .line 67
    add-int/2addr v5, v2

    .line 68
    .line 69
    aput-short v1, v3, v5

    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_0
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 75
    .line 76
    mul-int/lit8 v3, v3, 0x2

    .line 77
    add-int/2addr v0, v3

    .line 78
    .line 79
    iput v0, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, Landroidx/media3/common/audio/Sonic;->processStreamInput()V

    .line 83
    .line 84
    iget v0, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 85
    .line 86
    if-le v0, v7, :cond_1

    .line 87
    .line 88
    iput v7, p0, Landroidx/media3/common/audio/Sonic;->outputFrameCount:I

    .line 89
    .line 90
    :cond_1
    iput v1, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 91
    .line 92
    iput v1, p0, Landroidx/media3/common/audio/Sonic;->remainingInputToCopyFrameCount:I

    .line 93
    .line 94
    iput v1, p0, Landroidx/media3/common/audio/Sonic;->pitchFrameCount:I

    .line 95
    return-void
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

.method public queueInput(Ljava/nio/ShortBuffer;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 7
    div-int/2addr v0, v1

    .line 8
    mul-int/2addr v1, v0

    .line 9
    .line 10
    mul-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 13
    .line 14
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v2, v3, v0}, Landroidx/media3/common/audio/Sonic;->ensureSpaceForAdditionalFrames([SII)[S

    .line 18
    move-result-object v2

    .line 19
    .line 20
    iput-object v2, p0, Landroidx/media3/common/audio/Sonic;->inputBuffer:[S

    .line 21
    .line 22
    iget v3, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 23
    .line 24
    iget v4, p0, Landroidx/media3/common/audio/Sonic;->channelCount:I

    .line 25
    mul-int/2addr v3, v4

    .line 26
    .line 27
    div-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    .line 31
    .line 32
    iget p1, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 33
    add-int/2addr p1, v0

    .line 34
    .line 35
    iput p1, p0, Landroidx/media3/common/audio/Sonic;->inputFrameCount:I

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Landroidx/media3/common/audio/Sonic;->processStreamInput()V

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
.end method
