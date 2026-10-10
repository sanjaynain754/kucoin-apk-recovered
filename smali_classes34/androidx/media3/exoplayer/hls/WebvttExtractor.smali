.class public final Landroidx/media3/exoplayer/hls/WebvttExtractor;
.super Ljava/lang/Object;
.source "WebvttExtractor.java"

# interfaces
.implements Landroidx/media3/extractor/Extractor;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# static fields
.field private static final HEADER_MAX_LENGTH:I = 0x9

.field private static final HEADER_MIN_LENGTH:I = 0x6

.field private static final LOCAL_TIMESTAMP:Ljava/util/regex/Pattern;

.field private static final MEDIA_TIMESTAMP:Ljava/util/regex/Pattern;


# instance fields
.field private final language:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private output:Landroidx/media3/extractor/ExtractorOutput;

.field private final parseSubtitlesDuringExtraction:Z

.field private sampleData:[B

.field private final sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

.field private sampleSize:I

.field private final subtitleParserFactory:Landroidx/media3/extractor/text/SubtitleParser$Factory;

.field private final timestampAdjuster:Landroidx/media3/common/util/TimestampAdjuster;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "LOCAL:([^,]+)"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->LOCAL_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "MPEGTS:(-?\\d+)"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->MEDIA_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 17
    return-void
    .line 18
.end method

.method public constructor <init>(Ljava/lang/String;Landroidx/media3/common/util/TimestampAdjuster;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/extractor/text/SubtitleParser$Factory;->UNSUPPORTED:Landroidx/media3/extractor/text/SubtitleParser$Factory;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/exoplayer/hls/WebvttExtractor;-><init>(Ljava/lang/String;Landroidx/media3/common/util/TimestampAdjuster;Landroidx/media3/extractor/text/SubtitleParser$Factory;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroidx/media3/common/util/TimestampAdjuster;Landroidx/media3/extractor/text/SubtitleParser$Factory;Z)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->language:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->timestampAdjuster:Landroidx/media3/common/util/TimestampAdjuster;

    .line 5
    new-instance p1, Landroidx/media3/common/util/ParsableByteArray;

    invoke-direct {p1}, Landroidx/media3/common/util/ParsableByteArray;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    const/16 p1, 0x400

    .line 6
    new-array p1, p1, [B

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->subtitleParserFactory:Landroidx/media3/extractor/text/SubtitleParser$Factory;

    .line 8
    iput-boolean p4, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->parseSubtitlesDuringExtraction:Z

    return-void
.end method

.method private buildTrackOutput(J)Landroidx/media3/extractor/TrackOutput;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Landroidx/media3/extractor/ExtractorOutput;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Landroidx/media3/extractor/ExtractorOutput;->track(II)Landroidx/media3/extractor/TrackOutput;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Landroidx/media3/common/Format$Builder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "text/vtt"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setSampleMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->language:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setLanguage(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1, p2}, Landroidx/media3/common/Format$Builder;->setSubsampleOffsetUs(J)Landroidx/media3/common/Format$Builder;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p1}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 38
    .line 39
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Landroidx/media3/extractor/ExtractorOutput;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorOutput;->endTracks()V

    .line 43
    return-object v0
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

.method private processSample()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/extractor/text/webvtt/WebvttParserUtil;->validateWebvttHeaderLine(Landroidx/media3/common/util/ParsableByteArray;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readLine()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    move-wide v4, v2

    .line 18
    move-wide v6, v4

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    move-result v8

    .line 23
    const/4 v9, 0x1

    .line 24
    .line 25
    if-nez v8, :cond_3

    .line 26
    .line 27
    const-string v8, "X-TIMESTAMP-MAP"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    move-result v8

    .line 32
    .line 33
    if-eqz v8, :cond_2

    .line 34
    .line 35
    sget-object v4, Landroidx/media3/exoplayer/hls/WebvttExtractor;->LOCAL_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x0

    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    sget-object v5, Landroidx/media3/exoplayer/hls/WebvttExtractor;->MEDIA_TIMESTAMP:Ljava/util/regex/Pattern;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 52
    move-result-object v5

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 56
    move-result v7

    .line 57
    .line 58
    if-eqz v7, :cond_0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Landroidx/media3/extractor/text/webvtt/WebvttParserUtil;->parseTimestampUs(Ljava/lang/String;)J

    .line 72
    move-result-wide v6

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    check-cast v1, Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 86
    move-result-wide v4

    .line 87
    .line 88
    .line 89
    invoke-static {v4, v5}, Landroidx/media3/common/util/TimestampAdjuster;->ptsToUs(J)J

    .line 90
    move-result-wide v4

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v6}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 112
    move-result-object v0

    .line 113
    throw v0

    .line 114
    .line 115
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v6}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 134
    move-result-object v0

    .line 135
    throw v0

    .line 136
    .line 137
    .line 138
    :cond_2
    :goto_1
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readLine()Ljava/lang/String;

    .line 139
    move-result-object v1

    .line 140
    goto :goto_0

    .line 141
    .line 142
    .line 143
    :cond_3
    invoke-static {v0}, Landroidx/media3/extractor/text/webvtt/WebvttParserUtil;->findNextCueHeader(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/regex/Matcher;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    if-nez v0, :cond_4

    .line 147
    .line 148
    .line 149
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/hls/WebvttExtractor;->buildTrackOutput(J)Landroidx/media3/extractor/TrackOutput;

    .line 150
    return-void

    .line 151
    .line 152
    .line 153
    :cond_4
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    check-cast v0, Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, Landroidx/media3/extractor/text/webvtt/WebvttParserUtil;->parseTimestampUs(Ljava/lang/String;)J

    .line 164
    move-result-wide v0

    .line 165
    .line 166
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->timestampAdjuster:Landroidx/media3/common/util/TimestampAdjuster;

    .line 167
    add-long/2addr v4, v0

    .line 168
    sub-long/2addr v4, v6

    .line 169
    .line 170
    .line 171
    invoke-static {v4, v5}, Landroidx/media3/common/util/TimestampAdjuster;->usToWrappedPts(J)J

    .line 172
    move-result-wide v3

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v3, v4}, Landroidx/media3/common/util/TimestampAdjuster;->adjustTsTimestamp(J)J

    .line 176
    move-result-wide v6

    .line 177
    .line 178
    sub-long v0, v6, v0

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/hls/WebvttExtractor;->buildTrackOutput(J)Landroidx/media3/extractor/TrackOutput;

    .line 182
    move-result-object v5

    .line 183
    .line 184
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    .line 185
    .line 186
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 187
    .line 188
    iget v2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/util/ParsableByteArray;->reset([BI)V

    .line 192
    .line 193
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    .line 194
    .line 195
    iget v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 196
    .line 197
    .line 198
    invoke-interface {v5, v0, v1}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 199
    .line 200
    iget v9, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v8, 0x1

    .line 204
    .line 205
    .line 206
    invoke-interface/range {v5 .. v11}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 207
    return-void
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


# virtual methods
.method public init(Landroidx/media3/extractor/ExtractorOutput;)V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->parseSubtitlesDuringExtraction:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroidx/media3/extractor/text/SubtitleTranscodingExtractorOutput;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->subtitleParserFactory:Landroidx/media3/extractor/text/SubtitleParser$Factory;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Landroidx/media3/extractor/text/SubtitleTranscodingExtractorOutput;-><init>(Landroidx/media3/extractor/ExtractorOutput;Landroidx/media3/extractor/text/SubtitleParser$Factory;)V

    .line 12
    move-object p1, v0

    .line 13
    .line 14
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Landroidx/media3/extractor/ExtractorOutput;

    .line 15
    .line 16
    new-instance v0, Landroidx/media3/extractor/SeekMap$Unseekable;

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Landroidx/media3/extractor/SeekMap$Unseekable;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroidx/media3/extractor/ExtractorOutput;->seekMap(Landroidx/media3/extractor/SeekMap;)V

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
.end method

.method public read(Landroidx/media3/extractor/ExtractorInput;Landroidx/media3/extractor/PositionHolder;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->output:Landroidx/media3/extractor/ExtractorOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorInput;->getLength()J

    .line 9
    move-result-wide v0

    .line 10
    long-to-int p2, v0

    .line 11
    .line 12
    iget v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, -0x1

    .line 17
    .line 18
    if-ne v0, v2, :cond_1

    .line 19
    .line 20
    if-eq p2, v3, :cond_0

    .line 21
    move v0, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    array-length v0, v1

    .line 24
    .line 25
    :goto_0
    mul-int/lit8 v0, v0, 0x3

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 36
    .line 37
    iget v1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 38
    array-length v2, v0

    .line 39
    sub-int/2addr v2, v1

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0, v1, v2}, Landroidx/media3/extractor/ExtractorInput;->read([BII)I

    .line 43
    move-result p1

    .line 44
    .line 45
    if-eq p1, v3, :cond_3

    .line 46
    .line 47
    iget v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 48
    add-int/2addr v0, p1

    .line 49
    .line 50
    iput v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleSize:I

    .line 51
    .line 52
    if-eq p2, v3, :cond_2

    .line 53
    .line 54
    if-eq v0, p2, :cond_3

    .line 55
    :cond_2
    const/4 p1, 0x0

    .line 56
    return p1

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/WebvttExtractor;->processSample()V

    .line 60
    return v3
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
.end method

.method public release()V
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
.end method

.method public seek(JJ)V
    .locals 0

    .line 1
    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 6
    throw p1
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

.method public sniff(Landroidx/media3/extractor/ExtractorInput;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1, v2, v1}, Landroidx/media3/extractor/ExtractorInput;->peekFully([BIIZ)Z

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v3, v2}, Landroidx/media3/common/util/ParsableByteArray;->reset([BI)V

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/media3/extractor/text/webvtt/WebvttParserUtil;->isWebvttHeaderLine(Landroidx/media3/common/util/ParsableByteArray;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 27
    const/4 v3, 0x3

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0, v2, v3, v1}, Landroidx/media3/extractor/ExtractorInput;->peekFully([BIIZ)Z

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleData:[B

    .line 35
    .line 36
    const/16 v1, 0x9

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->reset([BI)V

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/WebvttExtractor;->sampleDataWrapper:Landroidx/media3/common/util/ParsableByteArray;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/extractor/text/webvtt/WebvttParserUtil;->isWebvttHeaderLine(Landroidx/media3/common/util/ParsableByteArray;)Z

    .line 45
    move-result p1

    .line 46
    return p1
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
