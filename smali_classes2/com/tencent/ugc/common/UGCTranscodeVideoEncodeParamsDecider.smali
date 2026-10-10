.class public Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::ugc"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "UGCTranscodeVideoEncodeParamsDecider"


# instance fields
.field private mEncodeProfile:Lcom/tencent/liteav/videobase/common/d;

.field private mFullIFrame:Z

.field private final mNativeHandler:J

.field private mSourceFpsArray:[I

.field private mVideoMediaFormatList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mFullIFrame:Z

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/liteav/videobase/common/d;->d:Lcom/tencent/liteav/videobase/common/d;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mEncodeProfile:Lcom/tencent/liteav/videobase/common/d;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeCreate()J

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

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
.end method

.method private static createVideoSize(II)Lcom/tencent/liteav/base/util/Size;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

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
.end method

.method private getDecidedGOP()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mVideoMediaFormatList:Ljava/util/List;

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mVideoMediaFormatList:Ljava/util/List;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Landroid/media/MediaFormat;

    .line 22
    .line 23
    const-string v2, "i-frame-interval"

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, v2, v1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getNumberFromMediaFormat(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 27
    move-result v0

    .line 28
    return v0

    .line 29
    :cond_1
    :goto_0
    return v1
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
.end method

.method private getDecidedVideoBitrate(Lcom/tencent/liteav/base/util/Size;)I
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mFullIFrame:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v0, p1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 7
    .line 8
    const/16 v1, 0x500

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    iget p1, p1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 13
    .line 14
    if-ge p1, v1, :cond_0

    .line 15
    .line 16
    const/16 p1, 0x3a98

    .line 17
    return p1

    .line 18
    .line 19
    :cond_0
    const/16 p1, 0x5dc0

    .line 20
    return p1

    .line 21
    .line 22
    :cond_1
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeGetSelectedBitrate(J)I

    .line 26
    move-result p1

    .line 27
    return p1
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
.end method

.method private getNumberFromMediaFormat(Landroid/media/MediaFormat;Ljava/lang/String;I)I
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 13
    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return p1

    .line 15
    :catch_0
    move-exception v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-string v1, "getNumberFromMediaFormat integer ClassCastException: "

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-string v1, "UGCTranscodeVideoEncodeParamsDecider"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 34
    move-result p1
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 35
    float-to-int p3, p1

    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception p1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    const-string p2, "getNumberFromMediaFormat float ClassCastException: "

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    :cond_1
    :goto_0
    return p3
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
.end method

.method private getSizeFromMediaFormat(Landroid/media/MediaFormat;)Lcom/tencent/liteav/base/util/Size;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 6
    .line 7
    const-string v1, "width"

    .line 8
    .line 9
    const/16 v2, 0x2d0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, v1, v2}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getNumberFromMediaFormat(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 13
    move-result v1

    .line 14
    .line 15
    iput v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 16
    .line 17
    const-string v1, "height"

    .line 18
    .line 19
    const/16 v2, 0x500

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, v1, v2}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getNumberFromMediaFormat(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 23
    move-result v1

    .line 24
    .line 25
    iput v1, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 29
    move-result v1

    .line 30
    .line 31
    const/16 v2, 0x17

    .line 32
    .line 33
    if-lt v1, v2, :cond_1

    .line 34
    .line 35
    const-string v1, "rotation-degrees"

    .line 36
    const/4 v2, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v1, v2}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getNumberFromMediaFormat(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 40
    move-result p1

    .line 41
    .line 42
    const/16 v1, 0x5a

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    const/16 v1, 0x10e

    .line 47
    .line 48
    if-ne p1, v1, :cond_1

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->swap()V

    .line 52
    :cond_1
    return-object v0
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
.end method

.method private static native nativeCreate()J
.end method

.method private static native nativeDestroy(J)V
.end method

.method private static native nativeGetSelectedBitrate(J)I
.end method

.method private static native nativeGetSelectedFramerate(J)I
.end method

.method private static native nativeGetSelectedResolution(J)Lcom/tencent/liteav/base/util/Size;
.end method

.method private static native nativeSetCanvasSize(JII)V
.end method

.method private static native nativeSetEncodeBitrate(JI)V
.end method

.method private static native nativeSetEncodeFramerate(JI)V
.end method

.method private static native nativeSetEncodeResolution(JI)V
.end method

.method private static native nativeSetEncodeRotation(JI)V
.end method

.method private static native nativeSetSourceVideoInfo(J[I[I[I)V
.end method


# virtual methods
.method public finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeDestroy(J)V

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
.end method

.method public getDecidedEncodeParams()Lcom/tencent/ugc/encoder/VideoEncodeParams;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/ugc/encoder/VideoEncodeParams;-><init>()V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    iput-boolean v1, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->annexb:Z

    .line 9
    .line 10
    sget-object v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;->c:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    .line 11
    .line 12
    iput-object v1, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->bitrateMode:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    iput-boolean v1, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->fullIFrame:Z

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mEncodeProfile:Lcom/tencent/liteav/videobase/common/d;

    .line 18
    .line 19
    iput-object v1, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videobase/common/d;

    .line 20
    .line 21
    iget-boolean v1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mFullIFrame:Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/tencent/ugc/encoder/VideoEncodeParams;->setFullIFrame(Z)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getDecidedGOP()I

    .line 28
    move-result v1

    .line 29
    .line 30
    iput v1, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->gop:I

    .line 31
    .line 32
    iget-wide v1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeGetSelectedResolution(J)Lcom/tencent/liteav/base/util/Size;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 39
    .line 40
    iput v2, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->width:I

    .line 41
    .line 42
    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 43
    .line 44
    iput v2, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->height:I

    .line 45
    .line 46
    iget-wide v2, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeGetSelectedFramerate(J)I

    .line 50
    move-result v2

    .line 51
    .line 52
    iput v2, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->fps:I

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getDecidedVideoBitrate(Lcom/tencent/liteav/base/util/Size;)I

    .line 56
    move-result v1

    .line 57
    .line 58
    iput v1, v0, Lcom/tencent/ugc/encoder/VideoEncodeParams;->bitrate:I

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    const-string v2, "getVideoEncodeParams: "

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    const-string v2, "UGCTranscodeVideoEncodeParamsDecider"

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    return-object v0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public isNeedFilterFrame()Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mSourceFpsArray:[I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    array-length v0, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    iget-wide v2, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeGetSelectedFramerate(J)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mSourceFpsArray:[I

    .line 18
    array-length v3, v2

    .line 19
    move v4, v1

    .line 20
    .line 21
    :goto_0
    if-ge v4, v3, :cond_2

    .line 22
    .line 23
    aget v5, v2, v4

    .line 24
    const/4 v6, 0x1

    .line 25
    .line 26
    add-int/lit8 v7, v0, 0x1

    .line 27
    .line 28
    if-le v5, v7, :cond_1

    .line 29
    return v6

    .line 30
    .line 31
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :goto_1
    return v1
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

.method public setEncodeBitrate(I)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeSetEncodeBitrate(JI)V

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
.end method

.method public setEncodeFramerate(Lcom/tencent/ugc/TXVideoEditConstants$VideoFrameRateLevel;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/tencent/ugc/TXVideoEditConstants$VideoFrameRateLevel;->asInt()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeSetEncodeFramerate(JI)V

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
.end method

.method public setEncodeProfile(I)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "setEncodeProfile "

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "UGCTranscodeVideoEncodeParamsDecider"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    const/4 v0, 0x2

    .line 17
    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    sget-object p1, Lcom/tencent/liteav/videobase/common/d;->c:Lcom/tencent/liteav/videobase/common/d;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mEncodeProfile:Lcom/tencent/liteav/videobase/common/d;

    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v0, 0x1

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    sget-object p1, Lcom/tencent/liteav/videobase/common/d;->b:Lcom/tencent/liteav/videobase/common/d;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mEncodeProfile:Lcom/tencent/liteav/videobase/common/d;

    .line 31
    return-void

    .line 32
    .line 33
    :cond_1
    sget-object p1, Lcom/tencent/liteav/videobase/common/d;->d:Lcom/tencent/liteav/videobase/common/d;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mEncodeProfile:Lcom/tencent/liteav/videobase/common/d;

    .line 36
    return-void
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
.end method

.method public setEncodeRotation(Lcom/tencent/liteav/base/util/l;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 3
    .line 4
    iget p1, p1, Lcom/tencent/liteav/base/util/l;->mValue:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeSetEncodeRotation(JI)V

    .line 8
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
.end method

.method public setFullIFrame(Z)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mFullIFrame:Z

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    const-string v0, "setFullIFrame "

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "UGCTranscodeVideoEncodeParamsDecider"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    iput-boolean p1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mFullIFrame:Z

    .line 23
    return-void
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
.end method

.method public setInputCanvasSize(Lcom/tencent/liteav/base/util/Size;)V
    .locals 3

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-string v1, "set input canvas size :"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "UGCTranscodeVideoEncodeParamsDecider"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 21
    .line 22
    iget v2, p1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 23
    .line 24
    iget p1, p1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2, p1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeSetCanvasSize(JII)V

    .line 28
    return-void
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
.end method

.method public setInputVideoMediaFormat(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mVideoMediaFormatList:Ljava/util/List;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    move-result v0

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    move-result v1

    .line 16
    .line 17
    new-array v1, v1, [I

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    move-result v2

    .line 22
    .line 23
    new-array v2, v2, [I

    .line 24
    .line 25
    iput-object v2, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mSourceFpsArray:[I

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    move-result v3

    .line 31
    .line 32
    if-ge v2, v3, :cond_1

    .line 33
    .line 34
    iget-object v3, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mVideoMediaFormatList:Ljava/util/List;

    .line 35
    .line 36
    .line 37
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    check-cast v3, Landroid/media/MediaFormat;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v3}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getSizeFromMediaFormat(Landroid/media/MediaFormat;)Lcom/tencent/liteav/base/util/Size;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 47
    .line 48
    aput v5, v0, v2

    .line 49
    .line 50
    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 51
    .line 52
    aput v5, v1, v2

    .line 53
    .line 54
    iget-object v5, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mSourceFpsArray:[I

    .line 55
    .line 56
    const-string v6, "frame-rate"

    .line 57
    .line 58
    const/16 v7, 0x1e

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v3, v6, v7}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->getNumberFromMediaFormat(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    .line 62
    move-result v3

    .line 63
    .line 64
    aput v3, v5, v2

    .line 65
    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v5, "source video fps = "

    .line 69
    .line 70
    .line 71
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    iget-object v5, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mSourceFpsArray:[I

    .line 74
    .line 75
    aget v5, v5, v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v5, " resolution = "

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    const-string v4, "UGCTranscodeVideoEncodeParamsDecider"

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_1
    iget-wide v2, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 101
    .line 102
    iget-object p1, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mSourceFpsArray:[I

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v3, v0, v1, p1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeSetSourceVideoInfo(J[I[I[I)V

    .line 106
    return-void
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
.end method

.method public setOutputResolution(I)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->mNativeHandler:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/ugc/common/UGCTranscodeVideoEncodeParamsDecider;->nativeSetEncodeResolution(JI)V

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
.end method
