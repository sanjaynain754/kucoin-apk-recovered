.class public final Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;
.super Ljava/lang/Object;
.source "DefaultDashChunkSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DefaultDashChunkSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RepresentationHolder"
.end annotation


# instance fields
.field final chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final periodDurationUs:J

.field public final representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

.field public final segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final segmentNumShift:J

.field public final selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;


# direct methods
.method public constructor <init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V
    .locals 0
    .param p5    # Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Landroidx/media3/exoplayer/dash/DashSegmentIndex;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 6
    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 8
    .line 9
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 10
    .line 11
    iput-wide p6, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 12
    .line 13
    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 16
    return-void
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
.end method

.method public static synthetic access$000(Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 3
    return-wide v0
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


# virtual methods
.method public copyWithNewRepresentation(JLandroidx/media3/exoplayer/dash/manifest/Representation;)Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;
    .locals 21
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/source/BehindLiveWindowException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getIndex()Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 8
    move-result-object v9

    .line 9
    move-object v1, v9

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p3 .. p3}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getIndex()Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 13
    move-result-object v9

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    move-object v9, v1

    .line 17
    .line 18
    new-instance v1, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;

    .line 19
    .line 20
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 21
    .line 22
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 23
    .line 24
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 25
    .line 26
    move-wide/from16 v2, p1

    .line 27
    .line 28
    move-object/from16 v4, p3

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;-><init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V

    .line 32
    return-object v1

    .line 33
    .line 34
    :cond_0
    move-object/from16 v20, v9

    .line 35
    move-object v9, v1

    .line 36
    .line 37
    move-object/from16 v1, v20

    .line 38
    .line 39
    .line 40
    invoke-interface {v9}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->isExplicit()Z

    .line 41
    move-result v2

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    move-object v9, v1

    .line 45
    .line 46
    new-instance v1, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;

    .line 47
    .line 48
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 49
    .line 50
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 51
    .line 52
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 53
    .line 54
    move-wide/from16 v2, p1

    .line 55
    .line 56
    move-object/from16 v4, p3

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;-><init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V

    .line 60
    return-object v1

    .line 61
    :cond_1
    move-object v2, v9

    .line 62
    move-object v9, v1

    .line 63
    move-object v1, v2

    .line 64
    .line 65
    move-wide/from16 v2, p1

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentCount(J)J

    .line 69
    move-result-wide v4

    .line 70
    .line 71
    const-wide/16 v6, 0x0

    .line 72
    .line 73
    cmp-long v6, v4, v6

    .line 74
    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    new-instance v1, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;

    .line 78
    .line 79
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 80
    .line 81
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 82
    .line 83
    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 84
    .line 85
    move-object/from16 v4, p3

    .line 86
    .line 87
    .line 88
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;-><init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V

    .line 89
    return-object v1

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-static {v9}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-interface {v1}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getFirstSegmentNum()J

    .line 96
    move-result-wide v6

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, v6, v7}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getTimeUs(J)J

    .line 100
    move-result-wide v10

    .line 101
    add-long/2addr v4, v6

    .line 102
    .line 103
    const-wide/16 v12, 0x1

    .line 104
    .line 105
    sub-long v12, v4, v12

    .line 106
    .line 107
    .line 108
    invoke-interface {v1, v12, v13}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getTimeUs(J)J

    .line 109
    move-result-wide v14

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, v12, v13, v2, v3}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getDurationUs(JJ)J

    .line 113
    move-result-wide v12

    .line 114
    add-long/2addr v14, v12

    .line 115
    .line 116
    .line 117
    invoke-interface {v9}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getFirstSegmentNum()J

    .line 118
    move-result-wide v12

    .line 119
    .line 120
    move-wide/from16 v16, v4

    .line 121
    .line 122
    .line 123
    invoke-interface {v9, v12, v13}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getTimeUs(J)J

    .line 124
    move-result-wide v4

    .line 125
    .line 126
    move-wide/from16 v18, v6

    .line 127
    .line 128
    iget-wide v6, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 129
    .line 130
    cmp-long v8, v14, v4

    .line 131
    .line 132
    if-nez v8, :cond_3

    .line 133
    .line 134
    sub-long v4, v16, v12

    .line 135
    :goto_0
    add-long/2addr v6, v4

    .line 136
    :goto_1
    move-wide v7, v6

    .line 137
    goto :goto_2

    .line 138
    .line 139
    :cond_3
    if-ltz v8, :cond_5

    .line 140
    .line 141
    cmp-long v8, v4, v10

    .line 142
    .line 143
    if-gez v8, :cond_4

    .line 144
    .line 145
    .line 146
    invoke-interface {v9, v10, v11, v2, v3}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentNum(JJ)J

    .line 147
    move-result-wide v4

    .line 148
    .line 149
    sub-long v4, v4, v18

    .line 150
    sub-long/2addr v6, v4

    .line 151
    goto :goto_1

    .line 152
    .line 153
    .line 154
    :cond_4
    invoke-interface {v1, v4, v5, v2, v3}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentNum(JJ)J

    .line 155
    move-result-wide v4

    .line 156
    sub-long/2addr v4, v12

    .line 157
    goto :goto_0

    .line 158
    .line 159
    :goto_2
    new-instance v1, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;

    .line 160
    .line 161
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 162
    .line 163
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 164
    .line 165
    move-object/from16 v4, p3

    .line 166
    .line 167
    .line 168
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;-><init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V

    .line 169
    return-object v1

    .line 170
    .line 171
    :cond_5
    new-instance v1, Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 172
    .line 173
    .line 174
    invoke-direct {v1}, Landroidx/media3/exoplayer/source/BehindLiveWindowException;-><init>()V

    .line 175
    throw v1
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

.method public copyWithNewSegmentIndex(Landroidx/media3/exoplayer/dash/DashSegmentIndex;)Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;
    .locals 9
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;

    .line 3
    .line 4
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 5
    .line 6
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 7
    .line 8
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->selectedBaseUrl:Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 9
    .line 10
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 11
    .line 12
    iget-wide v6, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 13
    move-object v8, p1

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;-><init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public copyWithNewSelectedBaseUrl(Landroidx/media3/exoplayer/dash/manifest/BaseUrl;)Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;
    .locals 9
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;

    .line 3
    .line 4
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 5
    .line 6
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 7
    .line 8
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 9
    .line 10
    iget-wide v6, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 11
    .line 12
    iget-object v8, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 13
    move-object v4, p1

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;-><init>(JLandroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/BaseUrl;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;JLandroidx/media3/exoplayer/dash/DashSegmentIndex;)V

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getFirstAvailableSegmentNum(J)J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1, v2, p1, p2}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getFirstAvailableSegmentNum(JJ)J

    .line 14
    move-result-wide p1

    .line 15
    .line 16
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 17
    add-long/2addr p1, v0

    .line 18
    return-wide p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getFirstSegmentNum()J
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getFirstSegmentNum()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iget-wide v2, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 15
    add-long/2addr v0, v2

    .line 16
    return-wide v0
    .line 17
    .line 18
.end method

.method public getLastAvailableSegmentNum(J)J
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->getFirstAvailableSegmentNum(J)J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    check-cast v2, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 13
    .line 14
    iget-wide v3, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 15
    .line 16
    .line 17
    invoke-interface {v2, v3, v4, p1, p2}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getAvailableSegmentCount(JJ)J

    .line 18
    move-result-wide p1

    .line 19
    add-long/2addr v0, p1

    .line 20
    .line 21
    const-wide/16 p1, 0x1

    .line 22
    sub-long/2addr v0, p1

    .line 23
    return-wide v0
.end method

.method public getSegmentCount()J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentCount(J)J

    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
.end method

.method public getSegmentEndTimeUs(J)J
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->getSegmentStartTimeUs(J)J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    check-cast v2, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 13
    .line 14
    iget-wide v3, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 15
    sub-long/2addr p1, v3

    .line 16
    .line 17
    iget-wide v3, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 18
    .line 19
    .line 20
    invoke-interface {v2, p1, p2, v3, v4}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getDurationUs(JJ)J

    .line 21
    move-result-wide p1

    .line 22
    add-long/2addr v0, p1

    .line 23
    return-wide v0
.end method

.method public getSegmentNum(J)J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->periodDurationUs:J

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1, p2, v1, v2}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentNum(JJ)J

    .line 14
    move-result-wide p1

    .line 15
    .line 16
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 17
    add-long/2addr p1, v0

    .line 18
    return-wide p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getSegmentStartTimeUs(J)J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 11
    sub-long/2addr p1, v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getTimeUs(J)J

    .line 15
    move-result-wide p1

    .line 16
    return-wide p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getSegmentUrl(J)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentNumShift:J

    .line 11
    sub-long/2addr p1, v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentUrl(J)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isSegmentAvailableAtFullNetworkSpeed(JJ)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->segmentIndex:Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->isExplicit()Z

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    return v1

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    cmp-long v0, p3, v2

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/DefaultDashChunkSource$RepresentationHolder;->getSegmentEndTimeUs(J)J

    .line 29
    move-result-wide p1

    .line 30
    .line 31
    cmp-long p1, p1, p3

    .line 32
    .line 33
    if-gtz p1, :cond_1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    return p1

    .line 37
    :cond_2
    :goto_0
    return v1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method
