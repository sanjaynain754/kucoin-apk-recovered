.class public Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "DashManifestParser.java"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/xml/sax/helpers/DefaultHandler;",
        "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
        "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
        ">;"
    }
.end annotation


# static fields
.field private static final CEA_608_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

.field private static final CEA_708_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

.field private static final FRAME_RATE_PATTERN:Ljava/util/regex/Pattern;

.field private static final MPEG_CHANNEL_CONFIGURATION_MAPPING:[I

.field private static final TAG:Ljava/lang/String; = "MpdParser"


# instance fields
.field private final xmlParserFactory:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "(\\d+)(?:/(\\d+))?"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->FRAME_RATE_PATTERN:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "CC([1-4])=.*"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_608_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    const-string v0, "([1-9]|[1-5][0-9]|6[0-3])=.*"

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_708_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 25
    .line 26
    const/16 v0, 0x15

    .line 27
    .line 28
    new-array v0, v0, [I

    .line 29
    .line 30
    .line 31
    fill-array-data v0, :array_0

    .line 32
    .line 33
    sput-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->MPEG_CHANNEL_CONFIGURATION_MAPPING:[I

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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :array_0
    .array-data 4
        -0x1
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        0x2
        0x3
        0x4
        0x7
        0x8
        0x18
        0x8
        0xc
        0xa
        0xc
        0xe
        0xc
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->xmlParserFactory:Lorg/xmlpull/v1/XmlPullParserFactory;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-void

    .line 11
    :catch_0
    move-exception v0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    throw v1
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
.end method

.method private addSegmentTimelineElementsToList(Ljava/util/List;JJIJ)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;JJIJ)J"
        }
    .end annotation

    .line 1
    .line 2
    if-ltz p6, :cond_0

    .line 3
    .line 4
    add-int/lit8 p6, p6, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-long/2addr p7, p2

    .line 7
    .line 8
    .line 9
    invoke-static {p7, p8, p4, p5}, Landroidx/media3/common/util/Util;->ceilDivide(JJ)J

    .line 10
    move-result-wide p6

    .line 11
    long-to-int p6, p6

    .line 12
    :goto_0
    const/4 p7, 0x0

    .line 13
    .line 14
    :goto_1
    if-ge p7, p6, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSegmentTimelineElement(JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;

    .line 18
    move-result-object p8

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    add-long/2addr p2, p4

    .line 23
    .line 24
    add-int/lit8 p7, p7, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    return-wide p2
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
.end method

.method private static checkContentTypeConsistency(II)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    if-ne p1, v0, :cond_1

    .line 7
    return p0

    .line 8
    .line 9
    :cond_1
    if-ne p0, p1, :cond_2

    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_2
    const/4 p1, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 16
    return p0
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

.method private static checkLanguageConsistency(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    return-object p1

    .line 4
    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    return-object p0

    .line 7
    .line 8
    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 14
    return-object p0
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

.method private static fillInClearKeyInformation(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 15
    .line 16
    sget-object v3, Landroidx/media3/common/C;->CLEARKEY_UUID:Ljava/util/UUID;

    .line 17
    .line 18
    iget-object v4, v2, Landroidx/media3/common/DrmInitData$SchemeData;->uuid:Ljava/util/UUID;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v3

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-object v2, v2, Landroidx/media3/common/DrmInitData$SchemeData;->licenseServerUrl:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v2, 0x0

    .line 37
    .line 38
    :goto_1
    if-nez v2, :cond_2

    .line 39
    goto :goto_3

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 43
    move-result v1

    .line 44
    .line 45
    if-ge v0, v1, :cond_4

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    check-cast v1, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 52
    .line 53
    sget-object v3, Landroidx/media3/common/C;->COMMON_PSSH_UUID:Ljava/util/UUID;

    .line 54
    .line 55
    iget-object v4, v1, Landroidx/media3/common/DrmInitData$SchemeData;->uuid:Ljava/util/UUID;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    iget-object v3, v1, Landroidx/media3/common/DrmInitData$SchemeData;->licenseServerUrl:Ljava/lang/String;

    .line 64
    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    new-instance v3, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 68
    .line 69
    sget-object v4, Landroidx/media3/common/C;->CLEARKEY_UUID:Ljava/util/UUID;

    .line 70
    .line 71
    iget-object v5, v1, Landroidx/media3/common/DrmInitData$SchemeData;->mimeType:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, v1, Landroidx/media3/common/DrmInitData$SchemeData;->data:[B

    .line 74
    .line 75
    .line 76
    invoke-direct {v3, v4, v2, v5, v1}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_3
    return-void
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
.end method

.method private static filterRedundantIncompleteSchemeDatas(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    :goto_0
    if-ltz v0, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    check-cast v1, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/media3/common/DrmInitData$SchemeData;->hasData()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 25
    move-result v3

    .line 26
    .line 27
    if-ge v2, v3, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    check-cast v3, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Landroidx/media3/common/DrmInitData$SchemeData;->canReplace(Landroidx/media3/common/DrmInitData$SchemeData;)Z

    .line 37
    move-result v3

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_1
    :goto_2
    add-int/lit8 v0, v0, -0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
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
.end method

.method private static getFinalAvailabilityTimeOffset(JJ)J
    .locals 3

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    cmp-long v2, p2, v0

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide p0, p2

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :goto_0
    const-wide p2, 0x7fffffffffffffffL

    .line 17
    .line 18
    cmp-long p2, p0, p2

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    return-wide v0

    .line 22
    :cond_1
    return-wide p0
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

.method private static getSampleMimeType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/media3/common/MimeTypes;->isAudio(Ljava/lang/String;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroidx/media3/common/MimeTypes;->getAudioMediaMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Landroidx/media3/common/MimeTypes;->isVideo(Ljava/lang/String;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Landroidx/media3/common/MimeTypes;->getVideoMediaMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {p0}, Landroidx/media3/common/MimeTypes;->isText(Ljava/lang/String;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-static {p0}, Landroidx/media3/common/MimeTypes;->isImage(Ljava/lang/String;)Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    :goto_0
    return-object p0

    .line 37
    .line 38
    :cond_3
    const-string v0, "application/mp4"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p0

    .line 43
    .line 44
    if-eqz p0, :cond_5

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Landroidx/media3/common/MimeTypes;->getMediaMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    .line 51
    const-string/jumbo p1, "text/vtt"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    move-result p1

    .line 56
    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    const-string p0, "application/x-mp4-vtt"

    .line 60
    :cond_4
    return-object p0

    .line 61
    :cond_5
    const/4 p0, 0x0

    .line 62
    return-object p0
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

.method private isDvbProfileDeclared([Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v3, p1, v2

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "urn:dvb:dash:profile:dvb-dash:"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    move-result v3

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
    .line 23
.end method

.method public static maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    .line 10
    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-static {p0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 26
    move-result v1

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_3
    :goto_1
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
.end method

.method public static parseCea608AccessibilityChannel(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    move-result v1

    .line 6
    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "urn:scte:dash:cc:cea-608:2015"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    sget-object v3, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_608_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 38
    move-result v3

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    const/4 p0, 0x1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    .line 52
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    const-string v3, "Unable to parse CEA-608 channel number from: "

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    const-string v2, "MpdParser"

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 p0, -0x1

    .line 79
    return p0
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
.end method

.method public static parseCea708AccessibilityChannel(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    move-result v1

    .line 6
    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "urn:scte:dash:cc:cea-708:2015"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    sget-object v3, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->CEA_708_ACCESSIBILITY_PATTERN:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 38
    move-result v3

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    const/4 p0, 0x1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    .line 52
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    const-string v3, "Unable to parse CEA-708 service block number from: "

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    const-string v2, "MpdParser"

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 p0, -0x1

    .line 79
    return p0
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
.end method

.method public static parseDateTime(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    return-wide p2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Landroidx/media3/common/util/Util;->parseXsDateTime(Ljava/lang/String;)J

    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
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
.end method

.method public static parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "schemeIdUri"

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "value"

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v3, "id"

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v3, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 30
    move-result v3

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    new-instance p0, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/Descriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static parseDolbyChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    const-string/jumbo v3, "value"

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    const/4 v2, -0x1

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    return v2

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lcom/google/common/base/Ascii;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 25
    move-result v3

    .line 26
    .line 27
    .line 28
    sparse-switch v3, :sswitch_data_0

    .line 29
    :goto_0
    move p0, v2

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :sswitch_0
    const-string v3, "fa01"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result p0

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x4

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :sswitch_1
    const-string v3, "f801"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    move-result p0

    .line 48
    .line 49
    if-nez p0, :cond_2

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 p0, 0x3

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :sswitch_2
    const-string v3, "f800"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    move-result p0

    .line 59
    .line 60
    if-nez p0, :cond_3

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move p0, v0

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :sswitch_3
    const-string v3, "a000"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    move-result p0

    .line 70
    .line 71
    if-nez p0, :cond_4

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move p0, v1

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :sswitch_4
    const-string v3, "4000"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    move-result p0

    .line 81
    .line 82
    if-nez p0, :cond_5

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/4 p0, 0x0

    .line 85
    .line 86
    .line 87
    :goto_1
    packed-switch p0, :pswitch_data_0

    .line 88
    return v2

    .line 89
    .line 90
    :pswitch_0
    const/16 p0, 0x8

    .line 91
    return p0

    .line 92
    :pswitch_1
    const/4 p0, 0x6

    .line 93
    return p0

    .line 94
    :pswitch_2
    const/4 p0, 0x5

    .line 95
    return p0

    .line 96
    :pswitch_3
    return v0

    .line 97
    :pswitch_4
    return v1

    .line 98
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x185d7c -> :sswitch_4
        0x2cd22f -> :sswitch_3
        0x2f3612 -> :sswitch_2
        0x2f3613 -> :sswitch_1
        0x2fcffc -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static parseDtsChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "value"

    .line 4
    const/4 v1, -0x1

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 8
    move-result p0

    .line 9
    .line 10
    if-lez p0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x21

    .line 13
    .line 14
    if-ge p0, v0, :cond_0

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static parseDtsxChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    const-string/jumbo v1, "value"

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object p0

    .line 9
    const/4 v0, -0x1

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    return v0

    .line 13
    .line 14
    :cond_0
    const/16 v1, 0x10

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 18
    move-result p0

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    .line 22
    move-result p0

    .line 23
    .line 24
    if-nez p0, :cond_1

    .line 25
    return v0

    .line 26
    :cond_1
    return p0
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
.end method

.method public static parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    return-wide p2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Landroidx/media3/common/util/Util;->parseXsDuration(Ljava/lang/String;)J

    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
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
.end method

.method public static parseEac3SupplementalProperties(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    move-result v1

    .line 6
    .line 7
    if-ge v0, v1, :cond_3

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v3

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const-string v3, "JOC"

    .line 27
    .line 28
    iget-object v4, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v3

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    .line 37
    :cond_0
    const-string/jumbo v3, "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    move-result v2

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const-string v2, "ec+3"

    .line 46
    .line 47
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result v1

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    :cond_1
    const-string p0, "audio/eac3-joc"

    .line 56
    return-object p0

    .line 57
    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_3
    const-string p0, "audio/eac3"

    .line 62
    return-object p0
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

.method public static parseFloat(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;F)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    return p2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

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

.method public static parseFrameRate(Lorg/xmlpull/v1/XmlPullParser;F)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "frameRate"

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->FRAME_RATE_PATTERN:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    const/4 p1, 0x1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    int-to-float p1, p1

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    move-result p0

    .line 47
    int-to-float p0, p0

    .line 48
    div-float/2addr p1, p0

    .line 49
    return p1

    .line 50
    :cond_0
    int-to-float p0, p1

    .line 51
    return p0

    .line 52
    :cond_1
    return p1
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
.end method

.method public static parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    return p2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

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

.method public static parseLastSegmentNumberSupplementalProperty(Ljava/util/List;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)J"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    move-result v1

    .line 6
    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "http://dashif.org/guidelines/last-segment-number"

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v2}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 21
    move-result v2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object p0, v1, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    const-wide/16 v0, -0x1

    .line 36
    return-wide v0
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

.method public static parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    return-wide p2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
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
.end method

.method public static parseMpegChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "value"

    .line 4
    const/4 v1, -0x1

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 8
    move-result p0

    .line 9
    .line 10
    if-ltz p0, :cond_0

    .line 11
    .line 12
    sget-object v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->MPEG_CHANNEL_CONFIGURATION_MAPPING:[I

    .line 13
    array-length v2, v0

    .line 14
    .line 15
    if-ge p0, v2, :cond_0

    .line 16
    .line 17
    aget p0, v0, p0

    .line 18
    return p0

    .line 19
    :cond_0
    return v1
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    return-object p2

    .line 9
    :cond_0
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

.method public static parseText(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x4

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {p0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-static {p0, p1}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    return-object v0
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


# virtual methods
.method public buildAdaptationSet(JILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Representation;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    move-object v7, p7

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;-><init>(JILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 12
    return-object v0
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
.end method

.method public buildEvent(Ljava/lang/String;Ljava/lang/String;JJ[B)Landroidx/media3/extractor/metadata/emsg/EventMessage;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/extractor/metadata/emsg/EventMessage;

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-wide v5, p3

    .line 6
    move-wide v3, p5

    .line 7
    move-object v7, p7

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v7}, Landroidx/media3/extractor/metadata/emsg/EventMessage;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 11
    return-object v0
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
.end method

.method public buildEventStream(Ljava/lang/String;Ljava/lang/String;J[J[Landroidx/media3/extractor/metadata/emsg/EventMessage;)Landroidx/media3/exoplayer/dash/manifest/EventStream;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/EventStream;

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-wide v3, p3

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/manifest/EventStream;-><init>(Ljava/lang/String;Ljava/lang/String;J[J[Landroidx/media3/extractor/metadata/emsg/EventMessage;)V

    .line 11
    return-object v0
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
.end method

.method public buildFormat(Ljava/lang/String;Ljava/lang/String;IIFIIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Landroidx/media3/common/Format;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIFIII",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroidx/media3/common/Format;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p10

    .line 3
    .line 4
    move-object/from16 v1, p13

    .line 5
    .line 6
    move-object/from16 v2, p12

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->getSampleMimeType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    const-string v4, "audio/eac3"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static/range {p14 .. p14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEac3SupplementalProperties(Ljava/util/List;)Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    const-string v4, "audio/eac3-joc"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    move-result v4

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    const-string v2, "ec+3"

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSelectionFlagsFromRoleDescriptors(Ljava/util/List;)I

    .line 36
    move-result v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromRoleDescriptors(Ljava/util/List;)I

    .line 40
    move-result v0

    .line 41
    .line 42
    move-object/from16 v5, p11

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromAccessibilityDescriptors(Ljava/util/List;)I

    .line 46
    move-result v6

    .line 47
    or-int/2addr v0, v6

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromProperties(Ljava/util/List;)I

    .line 51
    move-result v6

    .line 52
    or-int/2addr v0, v6

    .line 53
    .line 54
    move-object/from16 v6, p14

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromProperties(Ljava/util/List;)I

    .line 58
    move-result v6

    .line 59
    or-int/2addr v0, v6

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseTileCountFromProperties(Ljava/util/List;)Landroid/util/Pair;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    new-instance v6, Landroidx/media3/common/Format$Builder;

    .line 66
    .line 67
    .line 68
    invoke-direct {v6}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, p1}, Landroidx/media3/common/Format$Builder;->setId(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroidx/media3/common/Format$Builder;->setContainerMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v3}, Landroidx/media3/common/Format$Builder;->setSampleMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v2}, Landroidx/media3/common/Format$Builder;->setCodecs(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p8}, Landroidx/media3/common/Format$Builder;->setPeakBitrate(I)Landroidx/media3/common/Format$Builder;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, Landroidx/media3/common/Format$Builder;->setSelectionFlags(I)Landroidx/media3/common/Format$Builder;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroidx/media3/common/Format$Builder;->setRoleFlags(I)Landroidx/media3/common/Format$Builder;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    move-object/from16 p2, p9

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroidx/media3/common/Format$Builder;->setLanguage(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 102
    move-result-object p1

    .line 103
    const/4 p2, -0x1

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    move-result v0

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    move v0, p2

    .line 116
    .line 117
    .line 118
    :goto_0
    invoke-virtual {p1, v0}, Landroidx/media3/common/Format$Builder;->setTileCountHorizontal(I)Landroidx/media3/common/Format$Builder;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 129
    move-result v0

    .line 130
    goto :goto_1

    .line 131
    :cond_2
    move v0, p2

    .line 132
    .line 133
    .line 134
    :goto_1
    invoke-virtual {p1, v0}, Landroidx/media3/common/Format$Builder;->setTileCountVertical(I)Landroidx/media3/common/Format$Builder;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    .line 138
    invoke-static {v3}, Landroidx/media3/common/MimeTypes;->isVideo(Ljava/lang/String;)Z

    .line 139
    move-result v0

    .line 140
    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p3}, Landroidx/media3/common/Format$Builder;->setWidth(I)Landroidx/media3/common/Format$Builder;

    .line 145
    move-result-object p2

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, p4}, Landroidx/media3/common/Format$Builder;->setHeight(I)Landroidx/media3/common/Format$Builder;

    .line 149
    move-result-object p2

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, p5}, Landroidx/media3/common/Format$Builder;->setFrameRate(F)Landroidx/media3/common/Format$Builder;

    .line 153
    goto :goto_3

    .line 154
    .line 155
    .line 156
    :cond_3
    invoke-static {v3}, Landroidx/media3/common/MimeTypes;->isAudio(Ljava/lang/String;)Z

    .line 157
    move-result p5

    .line 158
    .line 159
    if-eqz p5, :cond_4

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p6}, Landroidx/media3/common/Format$Builder;->setChannelCount(I)Landroidx/media3/common/Format$Builder;

    .line 163
    move-result-object p2

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p7}, Landroidx/media3/common/Format$Builder;->setSampleRate(I)Landroidx/media3/common/Format$Builder;

    .line 167
    goto :goto_3

    .line 168
    .line 169
    .line 170
    :cond_4
    invoke-static {v3}, Landroidx/media3/common/MimeTypes;->isText(Ljava/lang/String;)Z

    .line 171
    move-result p5

    .line 172
    .line 173
    if-eqz p5, :cond_7

    .line 174
    .line 175
    const-string p3, "application/cea-608"

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    move-result p3

    .line 180
    .line 181
    if-eqz p3, :cond_5

    .line 182
    .line 183
    .line 184
    invoke-static {v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseCea608AccessibilityChannel(Ljava/util/List;)I

    .line 185
    move-result p2

    .line 186
    goto :goto_2

    .line 187
    .line 188
    :cond_5
    const-string p3, "application/cea-708"

    .line 189
    .line 190
    .line 191
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    move-result p3

    .line 193
    .line 194
    if-eqz p3, :cond_6

    .line 195
    .line 196
    .line 197
    invoke-static {v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseCea708AccessibilityChannel(Ljava/util/List;)I

    .line 198
    move-result p2

    .line 199
    .line 200
    .line 201
    :cond_6
    :goto_2
    invoke-virtual {p1, p2}, Landroidx/media3/common/Format$Builder;->setAccessibilityChannel(I)Landroidx/media3/common/Format$Builder;

    .line 202
    goto :goto_3

    .line 203
    .line 204
    .line 205
    :cond_7
    invoke-static {v3}, Landroidx/media3/common/MimeTypes;->isImage(Ljava/lang/String;)Z

    .line 206
    move-result p2

    .line 207
    .line 208
    if-eqz p2, :cond_8

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p3}, Landroidx/media3/common/Format$Builder;->setWidth(I)Landroidx/media3/common/Format$Builder;

    .line 212
    move-result-object p2

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2, p4}, Landroidx/media3/common/Format$Builder;->setHeight(I)Landroidx/media3/common/Format$Builder;

    .line 216
    .line 217
    .line 218
    :cond_8
    :goto_3
    invoke-virtual {p1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 219
    move-result-object p1

    .line 220
    return-object p1
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
.end method

.method public buildMediaPresentationDescription(JJJZJJJJLandroidx/media3/exoplayer/dash/manifest/ProgramInformation;Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;Landroid/net/Uri;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 21
    .param p16    # Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p18    # Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p19    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJZJJJJ",
            "Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;",
            "Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;",
            "Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Period;",
            ">;)",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifest;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    .line 3
    .line 4
    move-wide/from16 v1, p1

    .line 5
    .line 6
    move-wide/from16 v3, p3

    .line 7
    .line 8
    move-wide/from16 v5, p5

    .line 9
    .line 10
    move/from16 v7, p7

    .line 11
    .line 12
    move-wide/from16 v8, p8

    .line 13
    .line 14
    move-wide/from16 v10, p10

    .line 15
    .line 16
    move-wide/from16 v12, p12

    .line 17
    .line 18
    move-wide/from16 v14, p14

    .line 19
    .line 20
    move-object/from16 v16, p16

    .line 21
    .line 22
    move-object/from16 v17, p17

    .line 23
    .line 24
    move-object/from16 v18, p18

    .line 25
    .line 26
    move-object/from16 v19, p19

    .line 27
    .line 28
    move-object/from16 v20, p20

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v0 .. v20}, Landroidx/media3/exoplayer/dash/manifest/DashManifest;-><init>(JJJZJJJJLandroidx/media3/exoplayer/dash/manifest/ProgramInformation;Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;Landroid/net/Uri;Ljava/util/List;)V

    .line 32
    return-object v0
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
.end method

.method public buildPeriod(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/Descriptor;)Landroidx/media3/exoplayer/dash/manifest/Period;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/media3/exoplayer/dash/manifest/Descriptor;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/EventStream;",
            ">;",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ")",
            "Landroidx/media3/exoplayer/dash/manifest/Period;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/Period;

    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object v6, p6

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/manifest/Period;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/Descriptor;)V

    .line 11
    return-object v0
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
.end method

.method public buildRangedUri(Ljava/lang/String;JJ)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    .line 7
    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/RangedUri;-><init>(Ljava/lang/String;JJ)V

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

.method public buildRepresentation(Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Landroidx/media3/exoplayer/dash/manifest/Representation;
    .locals 13
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/common/Label;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroidx/media3/exoplayer/dash/manifest/Representation;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v1, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->format:Landroidx/media3/common/Format;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/common/Format;->buildUpon()Landroidx/media3/common/Format$Builder;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 12
    move-result v2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p2}, Landroidx/media3/common/Format$Builder;->setLabel(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    move-object/from16 v0, p3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroidx/media3/common/Format$Builder;->setLabels(Ljava/util/List;)Landroidx/media3/common/Format$Builder;

    .line 24
    .line 25
    :goto_0
    iget-object v0, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->drmSchemeType:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    move-object/from16 v0, p4

    .line 30
    .line 31
    :cond_1
    iget-object v2, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->drmSchemeDatas:Ljava/util/ArrayList;

    .line 32
    .line 33
    move-object/from16 v3, p5

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->fillInClearKeyInformation(Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->filterRedundantIncompleteSchemeDatas(Ljava/util/ArrayList;)V

    .line 49
    .line 50
    new-instance v3, Landroidx/media3/common/DrmInitData;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, v0, v2}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Landroidx/media3/common/Format$Builder;->setDrmInitData(Landroidx/media3/common/DrmInitData;)Landroidx/media3/common/Format$Builder;

    .line 57
    .line 58
    :cond_2
    iget-object v9, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->inbandEventStreams:Ljava/util/ArrayList;

    .line 59
    .line 60
    move-object/from16 v0, p6

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    iget-wide v4, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->revisionId:J

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    iget-object v7, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->baseUrls:Lcom/google/common/collect/ImmutableList;

    .line 72
    .line 73
    iget-object v8, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->segmentBase:Landroidx/media3/exoplayer/dash/manifest/SegmentBase;

    .line 74
    .line 75
    iget-object v10, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->essentialProperties:Ljava/util/List;

    .line 76
    .line 77
    iget-object v11, p1, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->supplementalProperties:Ljava/util/List;

    .line 78
    const/4 v12, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v4 .. v12}, Landroidx/media3/exoplayer/dash/manifest/Representation;->newInstance(JLandroidx/media3/common/Format;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 82
    move-result-object p1

    .line 83
    return-object p1
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

.method public buildSegmentList(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJLjava/util/List;JLjava/util/List;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;
    .locals 18
    .param p10    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            "JJJJ",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;J",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            ">;JJ)",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 3
    .line 4
    .line 5
    invoke-static/range {p14 .. p15}, Landroidx/media3/common/util/Util;->msToUs(J)J

    .line 6
    move-result-wide v14

    .line 7
    .line 8
    .line 9
    invoke-static/range {p16 .. p17}, Landroidx/media3/common/util/Util;->msToUs(J)J

    .line 10
    move-result-wide v16

    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    move-wide/from16 v2, p2

    .line 15
    .line 16
    move-wide/from16 v4, p4

    .line 17
    .line 18
    move-wide/from16 v6, p6

    .line 19
    .line 20
    move-wide/from16 v8, p8

    .line 21
    .line 22
    move-object/from16 v10, p10

    .line 23
    .line 24
    move-wide/from16 v11, p11

    .line 25
    .line 26
    move-object/from16 v13, p13

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v0 .. v17}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJLjava/util/List;JLjava/util/List;JJ)V

    .line 30
    return-object v0
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
.end method

.method public buildSegmentTemplate(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJJLjava/util/List;JLandroidx/media3/exoplayer/dash/manifest/UrlTemplate;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;
    .locals 21
    .param p15    # Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            "JJJJJ",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;J",
            "Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;",
            "Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;",
            "JJ)",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 3
    .line 4
    .line 5
    invoke-static/range {p17 .. p18}, Landroidx/media3/common/util/Util;->msToUs(J)J

    .line 6
    move-result-wide v17

    .line 7
    .line 8
    .line 9
    invoke-static/range {p19 .. p20}, Landroidx/media3/common/util/Util;->msToUs(J)J

    .line 10
    move-result-wide v19

    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    move-wide/from16 v2, p2

    .line 15
    .line 16
    move-wide/from16 v4, p4

    .line 17
    .line 18
    move-wide/from16 v6, p6

    .line 19
    .line 20
    move-wide/from16 v8, p8

    .line 21
    .line 22
    move-wide/from16 v10, p10

    .line 23
    .line 24
    move-object/from16 v12, p12

    .line 25
    .line 26
    move-wide/from16 v13, p13

    .line 27
    .line 28
    move-object/from16 v15, p15

    .line 29
    .line 30
    move-object/from16 v16, p16

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v0 .. v20}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJJLjava/util/List;JLandroidx/media3/exoplayer/dash/manifest/UrlTemplate;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;JJ)V

    .line 34
    return-object v0
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
.end method

.method public buildSegmentTimelineElement(JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;-><init>(JJ)V

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
.end method

.method public buildSingleSegmentBase(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
    .locals 10

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 3
    move-object v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    .line 7
    move-wide/from16 v6, p6

    .line 8
    .line 9
    move-wide/from16 v8, p8

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;-><init>(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)V

    .line 13
    return-object v0
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
.end method

.method public buildUtcTimingElement(Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method public parse(Landroid/net/Uri;Ljava/io/InputStream;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->xmlParserFactory:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    .line 3
    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 4
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p2

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    .line 5
    const-string p2, "MPD"

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p0, v1, p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseMediaPresentationDescription(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 7
    :cond_0
    const-string p1, "inputStream does not contain a valid media presentation description"

    invoke-static {p1, v0}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :goto_0
    invoke-static {v0, p1}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic parse(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parse(Landroid/net/Uri;Ljava/io/InputStream;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    move-result-object p1

    return-object p1
.end method

.method public parseAdaptationSet(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;
    .locals 43
    .param p3    # Landroidx/media3/exoplayer/dash/manifest/SegmentBase;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase;",
            "JJJJJZ)",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "id"

    .line 7
    .line 8
    const-wide/16 v3, -0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 12
    move-result-wide v28

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentType(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 16
    move-result v2

    .line 17
    .line 18
    const-string v3, "mimeType"

    .line 19
    const/4 v4, 0x0

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    const-string v5, "codecs"

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v4, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    .line 32
    const-string/jumbo v6, "width"

    .line 33
    const/4 v7, -0x1

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v6, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 37
    move-result v6

    .line 38
    .line 39
    const-string v8, "height"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v8, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 43
    move-result v8

    .line 44
    .line 45
    const/high16 v9, -0x40800000    # -1.0f

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v9}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFrameRate(Lorg/xmlpull/v1/XmlPullParser;F)F

    .line 49
    move-result v9

    .line 50
    .line 51
    const-string v10, "audioSamplingRate"

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v10, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 55
    move-result v10

    .line 56
    .line 57
    const-string v11, "lang"

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v4, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v12

    .line 62
    .line 63
    const-string v13, "label"

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v4, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v30

    .line 68
    .line 69
    new-instance v13, Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    new-instance v14, Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    new-instance v15, Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    move-object/from16 v16, v13

    .line 85
    .line 86
    new-instance v13, Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    move-object/from16 v17, v12

    .line 92
    .line 93
    new-instance v12, Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    new-instance v7, Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    move-object/from16 v19, v15

    .line 104
    .line 105
    new-instance v15, Ljava/util/ArrayList;

    .line 106
    .line 107
    .line 108
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    new-instance v4, Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    move/from16 v21, v2

    .line 116
    .line 117
    new-instance v2, Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    const/16 v31, 0x0

    .line 123
    .line 124
    move-wide/from16 v23, p8

    .line 125
    .line 126
    move-object/from16 v18, v3

    .line 127
    .line 128
    move-object/from16 v22, v5

    .line 129
    .line 130
    move/from16 v25, v6

    .line 131
    .line 132
    move/from16 v26, v8

    .line 133
    move v8, v9

    .line 134
    .line 135
    move-object/from16 v6, v17

    .line 136
    .line 137
    move/from16 v5, v21

    .line 138
    .line 139
    move/from16 v32, v31

    .line 140
    const/4 v9, -0x1

    .line 141
    .line 142
    const/16 v33, 0x0

    .line 143
    .line 144
    move-object/from16 v17, p3

    .line 145
    .line 146
    move-object/from16 v21, v4

    .line 147
    .line 148
    move-wide/from16 v3, p6

    .line 149
    .line 150
    .line 151
    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 152
    .line 153
    move/from16 p3, v8

    .line 154
    .line 155
    const-string v8, "BaseURL"

    .line 156
    .line 157
    .line 158
    invoke-static {v1, v8}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 159
    move-result v8

    .line 160
    .line 161
    if-eqz v8, :cond_1

    .line 162
    .line 163
    if-nez v32, :cond_0

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 167
    move-result-wide v3

    .line 168
    .line 169
    const/16 v32, 0x1

    .line 170
    .line 171
    :cond_0
    move-object/from16 v8, p2

    .line 172
    .line 173
    move-wide/from16 p6, v3

    .line 174
    .line 175
    move/from16 v3, p14

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1, v8, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    .line 179
    move-result-object v4

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 183
    .line 184
    move-object/from16 v40, v2

    .line 185
    .line 186
    move-object/from16 v35, v11

    .line 187
    .line 188
    move-object/from16 v37, v14

    .line 189
    move-object v3, v15

    .line 190
    .line 191
    move-object/from16 v4, v17

    .line 192
    .line 193
    move-object/from16 v2, v19

    .line 194
    .line 195
    move-object/from16 p9, v21

    .line 196
    .line 197
    const/16 v34, 0x0

    .line 198
    .line 199
    move/from16 v14, p3

    .line 200
    .line 201
    move-object/from16 v19, v7

    .line 202
    .line 203
    move/from16 v21, v9

    .line 204
    move v15, v10

    .line 205
    .line 206
    move-object/from16 v17, v12

    .line 207
    .line 208
    move-object/from16 v9, v16

    .line 209
    .line 210
    move-wide/from16 v7, p6

    .line 211
    .line 212
    :goto_1
    move-object/from16 v16, v13

    .line 213
    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_1
    move-object/from16 v8, p2

    .line 217
    .line 218
    move-wide/from16 v34, v3

    .line 219
    .line 220
    move/from16 v3, p14

    .line 221
    .line 222
    const-string v4, "ContentProtection"

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 226
    move-result v4

    .line 227
    .line 228
    if-eqz v4, :cond_4

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentProtection(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    .line 232
    move-result-object v4

    .line 233
    .line 234
    iget-object v0, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 235
    .line 236
    if-eqz v0, :cond_2

    .line 237
    .line 238
    move-object/from16 v33, v0

    .line 239
    .line 240
    check-cast v33, Ljava/lang/String;

    .line 241
    .line 242
    :cond_2
    iget-object v0, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 243
    .line 244
    if-eqz v0, :cond_3

    .line 245
    .line 246
    check-cast v0, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    :cond_3
    move-object/from16 v40, v2

    .line 252
    .line 253
    move-object/from16 v37, v14

    .line 254
    move-object v3, v15

    .line 255
    .line 256
    move-object/from16 v4, v17

    .line 257
    .line 258
    move-object/from16 v2, v19

    .line 259
    .line 260
    move-object/from16 p9, v21

    .line 261
    .line 262
    move/from16 v14, p3

    .line 263
    .line 264
    move-object/from16 v19, v7

    .line 265
    .line 266
    move/from16 v21, v9

    .line 267
    move v15, v10

    .line 268
    .line 269
    move-object/from16 v17, v12

    .line 270
    .line 271
    move-object/from16 v9, v16

    .line 272
    .line 273
    move-wide/from16 v7, v34

    .line 274
    .line 275
    const/16 v34, 0x0

    .line 276
    .line 277
    :goto_2
    move-object/from16 v35, v11

    .line 278
    goto :goto_1

    .line 279
    .line 280
    :cond_4
    const-string v0, "ContentComponent"

    .line 281
    .line 282
    .line 283
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 284
    move-result v0

    .line 285
    .line 286
    if-eqz v0, :cond_5

    .line 287
    const/4 v0, 0x0

    .line 288
    .line 289
    .line 290
    invoke-interface {v1, v0, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    move-result-object v4

    .line 292
    .line 293
    .line 294
    invoke-static {v6, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->checkLanguageConsistency(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    move-result-object v4

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentType(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 299
    move-result v6

    .line 300
    .line 301
    .line 302
    invoke-static {v5, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->checkContentTypeConsistency(II)I

    .line 303
    move-result v5

    .line 304
    .line 305
    move-object/from16 v40, v2

    .line 306
    move-object v6, v4

    .line 307
    .line 308
    move-object/from16 v37, v14

    .line 309
    move-object v3, v15

    .line 310
    .line 311
    move-object/from16 v4, v17

    .line 312
    .line 313
    move-object/from16 v2, v19

    .line 314
    .line 315
    move-object/from16 p9, v21

    .line 316
    .line 317
    move/from16 v14, p3

    .line 318
    .line 319
    move-object/from16 v19, v7

    .line 320
    .line 321
    move/from16 v21, v9

    .line 322
    move v15, v10

    .line 323
    .line 324
    move-object/from16 v17, v12

    .line 325
    .line 326
    move-object/from16 v9, v16

    .line 327
    .line 328
    move-wide/from16 v7, v34

    .line 329
    .line 330
    move-object/from16 v34, v0

    .line 331
    goto :goto_2

    .line 332
    :cond_5
    const/4 v0, 0x0

    .line 333
    .line 334
    const-string v4, "Role"

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 338
    move-result v20

    .line 339
    .line 340
    if-eqz v20, :cond_6

    .line 341
    .line 342
    .line 343
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 344
    move-result-object v4

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    :goto_3
    move-object/from16 v40, v2

    .line 350
    .line 351
    move-object/from16 v20, v6

    .line 352
    .line 353
    move-object/from16 v37, v14

    .line 354
    move-object v3, v15

    .line 355
    .line 356
    move-object/from16 v4, v17

    .line 357
    .line 358
    move-object/from16 v2, v19

    .line 359
    .line 360
    move-object/from16 p9, v21

    .line 361
    .line 362
    move/from16 v14, p3

    .line 363
    .line 364
    move-object/from16 v19, v7

    .line 365
    .line 366
    move/from16 v21, v9

    .line 367
    move v15, v10

    .line 368
    .line 369
    move-object/from16 v17, v12

    .line 370
    .line 371
    move-object/from16 v9, v16

    .line 372
    .line 373
    move-wide/from16 v7, v34

    .line 374
    .line 375
    move-object/from16 v34, v0

    .line 376
    .line 377
    move-object/from16 v35, v11

    .line 378
    .line 379
    move-object/from16 v16, v13

    .line 380
    .line 381
    move-wide/from16 v41, v23

    .line 382
    .line 383
    move/from16 v23, v5

    .line 384
    .line 385
    move-wide/from16 v5, v41

    .line 386
    .line 387
    goto/16 :goto_7

    .line 388
    .line 389
    :cond_6
    const-string v4, "AudioChannelConfiguration"

    .line 390
    .line 391
    .line 392
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 393
    move-result v4

    .line 394
    .line 395
    if-eqz v4, :cond_7

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAudioChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 399
    move-result v4

    .line 400
    .line 401
    move-object/from16 v40, v2

    .line 402
    .line 403
    move-object/from16 v37, v14

    .line 404
    move-object v3, v15

    .line 405
    .line 406
    move-object/from16 v9, v16

    .line 407
    .line 408
    move-object/from16 v2, v19

    .line 409
    .line 410
    move-object/from16 p9, v21

    .line 411
    .line 412
    move/from16 v14, p3

    .line 413
    .line 414
    move/from16 v21, v4

    .line 415
    .line 416
    move-object/from16 v19, v7

    .line 417
    move v15, v10

    .line 418
    .line 419
    move-object/from16 v16, v13

    .line 420
    .line 421
    move-object/from16 v4, v17

    .line 422
    .line 423
    move-wide/from16 v7, v34

    .line 424
    .line 425
    move-object/from16 v34, v0

    .line 426
    .line 427
    move-object/from16 v35, v11

    .line 428
    .line 429
    move-object/from16 v17, v12

    .line 430
    .line 431
    goto/16 :goto_8

    .line 432
    .line 433
    :cond_7
    const-string v4, "Accessibility"

    .line 434
    .line 435
    .line 436
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 437
    move-result v20

    .line 438
    .line 439
    if-eqz v20, :cond_8

    .line 440
    .line 441
    .line 442
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 443
    move-result-object v4

    .line 444
    .line 445
    .line 446
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    goto :goto_3

    .line 448
    .line 449
    :cond_8
    const-string v4, "EssentialProperty"

    .line 450
    .line 451
    .line 452
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 453
    move-result v20

    .line 454
    .line 455
    if-eqz v20, :cond_9

    .line 456
    .line 457
    .line 458
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 459
    move-result-object v4

    .line 460
    .line 461
    .line 462
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    goto :goto_3

    .line 464
    .line 465
    :cond_9
    const-string v4, "SupplementalProperty"

    .line 466
    .line 467
    .line 468
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 469
    move-result v20

    .line 470
    .line 471
    if-eqz v20, :cond_a

    .line 472
    .line 473
    .line 474
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 475
    move-result-object v4

    .line 476
    .line 477
    .line 478
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    goto/16 :goto_3

    .line 481
    .line 482
    :cond_a
    const-string v4, "Representation"

    .line 483
    .line 484
    .line 485
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 486
    move-result v4

    .line 487
    .line 488
    if-eqz v4, :cond_c

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 492
    move-result v4

    .line 493
    .line 494
    move-object/from16 v40, v2

    .line 495
    .line 496
    move/from16 v27, v3

    .line 497
    .line 498
    if-nez v4, :cond_b

    .line 499
    .line 500
    move-object/from16 v3, v40

    .line 501
    .line 502
    move/from16 v8, p3

    .line 503
    .line 504
    move-object/from16 v37, v14

    .line 505
    .line 506
    move-object/from16 v36, v16

    .line 507
    .line 508
    move-object/from16 v16, v17

    .line 509
    .line 510
    move-object/from16 v4, v18

    .line 511
    .line 512
    move-object/from16 v38, v19

    .line 513
    .line 514
    move-object/from16 v39, v21

    .line 515
    .line 516
    :goto_4
    move-wide/from16 v19, p4

    .line 517
    .line 518
    move-wide/from16 v17, p10

    .line 519
    move-object v2, v1

    .line 520
    move-object v14, v7

    .line 521
    .line 522
    move/from16 v7, v26

    .line 523
    .line 524
    move-object/from16 v1, p0

    .line 525
    .line 526
    move-wide/from16 v41, v34

    .line 527
    .line 528
    move-object/from16 v34, v0

    .line 529
    move v0, v5

    .line 530
    .line 531
    move-object/from16 v35, v11

    .line 532
    .line 533
    move-object/from16 v5, v22

    .line 534
    .line 535
    move-wide/from16 v21, v41

    .line 536
    move-object v11, v6

    .line 537
    .line 538
    move/from16 v6, v25

    .line 539
    .line 540
    move-wide/from16 v25, p12

    .line 541
    goto :goto_5

    .line 542
    :cond_b
    move-object v3, v8

    .line 543
    .line 544
    move-object/from16 v37, v14

    .line 545
    .line 546
    move-object/from16 v36, v16

    .line 547
    .line 548
    move-object/from16 v16, v17

    .line 549
    .line 550
    move-object/from16 v4, v18

    .line 551
    .line 552
    move-object/from16 v38, v19

    .line 553
    .line 554
    move-object/from16 v39, v21

    .line 555
    .line 556
    move/from16 v8, p3

    .line 557
    goto :goto_4

    .line 558
    .line 559
    .line 560
    :goto_5
    invoke-virtual/range {v1 .. v27}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRepresentation(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIFIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;

    .line 561
    move-result-object v3

    .line 562
    .line 563
    move-object/from16 v18, v4

    .line 564
    .line 565
    move/from16 v25, v6

    .line 566
    .line 567
    move/from16 v26, v7

    .line 568
    .line 569
    move-object/from16 v20, v11

    .line 570
    .line 571
    move-object/from16 v17, v12

    .line 572
    .line 573
    move-object/from16 v19, v14

    .line 574
    .line 575
    move-object/from16 v4, v16

    .line 576
    move v14, v8

    .line 577
    .line 578
    move-object/from16 v16, v13

    .line 579
    move-object v13, v15

    .line 580
    .line 581
    move-wide/from16 v7, v21

    .line 582
    .line 583
    move-object/from16 v22, v5

    .line 584
    .line 585
    move/from16 v21, v9

    .line 586
    move v15, v10

    .line 587
    .line 588
    move-wide/from16 v5, v23

    .line 589
    .line 590
    iget-object v9, v3, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;->format:Landroidx/media3/common/Format;

    .line 591
    .line 592
    iget-object v9, v9, Landroidx/media3/common/Format;->sampleMimeType:Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    invoke-static {v9}, Landroidx/media3/common/MimeTypes;->getTrackType(Ljava/lang/String;)I

    .line 596
    move-result v9

    .line 597
    .line 598
    .line 599
    invoke-static {v0, v9}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->checkContentTypeConsistency(II)I

    .line 600
    move-result v0

    .line 601
    .line 602
    move-object/from16 v9, v39

    .line 603
    .line 604
    .line 605
    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 606
    move-object v1, v2

    .line 607
    .line 608
    :goto_6
    move-object/from16 p9, v9

    .line 609
    move-object v3, v13

    .line 610
    .line 611
    move-object/from16 v6, v20

    .line 612
    .line 613
    move-object/from16 v9, v36

    .line 614
    .line 615
    move-object/from16 v2, v38

    .line 616
    move v5, v0

    .line 617
    .line 618
    goto/16 :goto_8

    .line 619
    .line 620
    :cond_c
    move-object/from16 v4, v21

    .line 621
    .line 622
    move/from16 v21, v9

    .line 623
    move-object v9, v4

    .line 624
    .line 625
    move-object/from16 v40, v2

    .line 626
    .line 627
    move-object/from16 v20, v6

    .line 628
    .line 629
    move-object/from16 v37, v14

    .line 630
    .line 631
    move-object/from16 v36, v16

    .line 632
    .line 633
    move-object/from16 v4, v17

    .line 634
    .line 635
    move-object/from16 v38, v19

    .line 636
    .line 637
    move/from16 v14, p3

    .line 638
    move-object v2, v1

    .line 639
    .line 640
    move-object/from16 v19, v7

    .line 641
    .line 642
    move-object/from16 v17, v12

    .line 643
    .line 644
    move-object/from16 v16, v13

    .line 645
    move-object v13, v15

    .line 646
    .line 647
    move-wide/from16 v7, v34

    .line 648
    .line 649
    move-object/from16 v1, p0

    .line 650
    .line 651
    move-object/from16 v34, v0

    .line 652
    move v0, v5

    .line 653
    move v15, v10

    .line 654
    .line 655
    move-object/from16 v35, v11

    .line 656
    .line 657
    move-wide/from16 v5, v23

    .line 658
    .line 659
    const-string v3, "SegmentBase"

    .line 660
    .line 661
    .line 662
    invoke-static {v2, v3}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 663
    move-result v3

    .line 664
    .line 665
    if-eqz v3, :cond_d

    .line 666
    move-object v3, v4

    .line 667
    .line 668
    check-cast v3, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 672
    move-result-object v3

    .line 673
    move-object v1, v2

    .line 674
    move-object v4, v3

    .line 675
    .line 676
    move-wide/from16 v23, v5

    .line 677
    goto :goto_6

    .line 678
    .line 679
    :cond_d
    const-string v3, "SegmentList"

    .line 680
    .line 681
    .line 682
    invoke-static {v2, v3}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 683
    move-result v3

    .line 684
    .line 685
    if-eqz v3, :cond_e

    .line 686
    .line 687
    move-object/from16 v39, v9

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1, v2, v5, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 691
    move-result-wide v9

    .line 692
    move-object v2, v4

    .line 693
    .line 694
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 695
    .line 696
    move-wide/from16 v5, p4

    .line 697
    .line 698
    move-wide/from16 v3, p10

    .line 699
    .line 700
    move-wide/from16 v11, p12

    .line 701
    .line 702
    move/from16 v23, v0

    .line 703
    move-object v0, v1

    .line 704
    .line 705
    move-object/from16 p9, v39

    .line 706
    .line 707
    move-object/from16 v1, p1

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 711
    move-result-object v2

    .line 712
    move-object v4, v2

    .line 713
    move-object v3, v13

    .line 714
    .line 715
    move-object/from16 v6, v20

    .line 716
    .line 717
    move/from16 v5, v23

    .line 718
    .line 719
    move-object/from16 v2, v38

    .line 720
    .line 721
    move-wide/from16 v23, v9

    .line 722
    .line 723
    move-object/from16 v9, v36

    .line 724
    .line 725
    goto/16 :goto_8

    .line 726
    .line 727
    :cond_e
    move/from16 v23, v0

    .line 728
    move-object v0, v1

    .line 729
    move-object v1, v2

    .line 730
    .line 731
    move-object/from16 p9, v9

    .line 732
    .line 733
    const-string v2, "SegmentTemplate"

    .line 734
    .line 735
    .line 736
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 737
    move-result v2

    .line 738
    .line 739
    if-eqz v2, :cond_f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0, v1, v5, v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 743
    move-result-wide v10

    .line 744
    move-object v2, v4

    .line 745
    .line 746
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 747
    .line 748
    move-wide/from16 v4, p10

    .line 749
    move-wide v8, v7

    .line 750
    move-object v3, v13

    .line 751
    .line 752
    move-wide/from16 v6, p4

    .line 753
    .line 754
    move-wide/from16 v12, p12

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 758
    move-result-object v2

    .line 759
    move-wide v7, v8

    .line 760
    move-object v4, v2

    .line 761
    .line 762
    move-object/from16 v6, v20

    .line 763
    .line 764
    move/from16 v5, v23

    .line 765
    .line 766
    move-object/from16 v9, v36

    .line 767
    .line 768
    move-object/from16 v2, v38

    .line 769
    .line 770
    move-wide/from16 v23, v10

    .line 771
    goto :goto_8

    .line 772
    :cond_f
    move-object v3, v13

    .line 773
    .line 774
    const-string v0, "InbandEventStream"

    .line 775
    .line 776
    .line 777
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 778
    move-result v2

    .line 779
    .line 780
    if-eqz v2, :cond_10

    .line 781
    .line 782
    .line 783
    invoke-static {v1, v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 784
    move-result-object v0

    .line 785
    .line 786
    move-object/from16 v2, v38

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    .line 791
    move-object/from16 v9, v36

    .line 792
    goto :goto_7

    .line 793
    .line 794
    :cond_10
    move-object/from16 v2, v38

    .line 795
    .line 796
    const-string v0, "Label"

    .line 797
    .line 798
    .line 799
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 800
    move-result v0

    .line 801
    .line 802
    if-eqz v0, :cond_11

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLabel(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/common/Label;

    .line 806
    move-result-object v0

    .line 807
    .line 808
    move-object/from16 v9, v36

    .line 809
    .line 810
    .line 811
    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 812
    goto :goto_7

    .line 813
    .line 814
    :cond_11
    move-object/from16 v9, v36

    .line 815
    .line 816
    .line 817
    invoke-static {v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 818
    move-result v0

    .line 819
    .line 820
    if-eqz v0, :cond_12

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAdaptationSetChild(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 824
    .line 825
    :cond_12
    :goto_7
    move-wide/from16 v41, v5

    .line 826
    .line 827
    move/from16 v5, v23

    .line 828
    .line 829
    move-wide/from16 v23, v41

    .line 830
    .line 831
    move-object/from16 v6, v20

    .line 832
    .line 833
    :goto_8
    const-string v0, "AdaptationSet"

    .line 834
    .line 835
    .line 836
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 837
    move-result v0

    .line 838
    .line 839
    if-eqz v0, :cond_14

    .line 840
    .line 841
    new-instance v0, Ljava/util/ArrayList;

    .line 842
    .line 843
    .line 844
    invoke-interface/range {p9 .. p9}, Ljava/util/List;->size()I

    .line 845
    move-result v1

    .line 846
    .line 847
    .line 848
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 849
    .line 850
    move/from16 v1, v31

    .line 851
    .line 852
    .line 853
    :goto_9
    invoke-interface/range {p9 .. p9}, Ljava/util/List;->size()I

    .line 854
    move-result v4

    .line 855
    .line 856
    if-ge v1, v4, :cond_13

    .line 857
    .line 858
    move-object/from16 v10, p9

    .line 859
    .line 860
    .line 861
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 862
    move-result-object v4

    .line 863
    .line 864
    check-cast v4, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;

    .line 865
    .line 866
    move-object/from16 p1, p0

    .line 867
    .line 868
    move-object/from16 p7, v2

    .line 869
    .line 870
    move-object/from16 p2, v4

    .line 871
    .line 872
    move-object/from16 p4, v9

    .line 873
    .line 874
    move-object/from16 p3, v30

    .line 875
    .line 876
    move-object/from16 p5, v33

    .line 877
    .line 878
    move-object/from16 p6, v37

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {p1 .. p7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildRepresentation(Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 882
    move-result-object v2

    .line 883
    .line 884
    move-object/from16 v9, p3

    .line 885
    .line 886
    move-object/from16 v36, p4

    .line 887
    .line 888
    move-object/from16 v38, p7

    .line 889
    .line 890
    .line 891
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 892
    .line 893
    add-int/lit8 v1, v1, 0x1

    .line 894
    .line 895
    move-object/from16 v30, v9

    .line 896
    .line 897
    move-object/from16 v9, v36

    .line 898
    .line 899
    move-object/from16 v2, v38

    .line 900
    goto :goto_9

    .line 901
    .line 902
    :cond_13
    move-object/from16 p1, p0

    .line 903
    .line 904
    move-object/from16 p5, v0

    .line 905
    .line 906
    move-object/from16 p8, v3

    .line 907
    .line 908
    move/from16 p4, v5

    .line 909
    .line 910
    move-object/from16 p6, v16

    .line 911
    .line 912
    move-object/from16 p7, v19

    .line 913
    .line 914
    move-wide/from16 p2, v28

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {p1 .. p8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildAdaptationSet(JILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 918
    move-result-object v0

    .line 919
    return-object v0

    .line 920
    .line 921
    :cond_14
    move-object/from16 v0, p0

    .line 922
    move v10, v15

    .line 923
    .line 924
    move-object/from16 v13, v16

    .line 925
    .line 926
    move-object/from16 v12, v17

    .line 927
    .line 928
    move-object/from16 v11, v35

    .line 929
    move-object v15, v3

    .line 930
    .line 931
    move-object/from16 v17, v4

    .line 932
    move-wide v3, v7

    .line 933
    .line 934
    move-object/from16 v16, v9

    .line 935
    move v8, v14

    .line 936
    .line 937
    move-object/from16 v7, v19

    .line 938
    .line 939
    move/from16 v9, v21

    .line 940
    .line 941
    move-object/from16 v14, v37

    .line 942
    .line 943
    move-object/from16 v21, p9

    .line 944
    .line 945
    move-object/from16 v19, v2

    .line 946
    .line 947
    move-object/from16 v2, v40

    .line 948
    goto/16 :goto_0
.end method

.method public parseAdaptationSetChild(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

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

.method public parseAudioChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "schemeIdUri"

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    const/4 v1, -0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    sparse-switch v2, :sswitch_data_0

    .line 20
    :goto_0
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :sswitch_0
    const-string/jumbo v2, "urn:dolby:dash:audio_channel_configuration:2011"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x6

    .line 33
    goto :goto_1

    .line 34
    .line 35
    .line 36
    :sswitch_1
    const-string/jumbo v2, "tag:dts.com,2018:uhd:audio_channel_configuration"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x5

    .line 45
    goto :goto_1

    .line 46
    .line 47
    .line 48
    :sswitch_2
    const-string/jumbo v2, "tag:dts.com,2014:dash:audio_channel_configuration:2012"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v0, 0x4

    .line 57
    goto :goto_1

    .line 58
    .line 59
    .line 60
    :sswitch_3
    const-string/jumbo v2, "urn:mpeg:mpegB:cicp:ChannelConfiguration"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_3

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 v0, 0x3

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :sswitch_4
    const-string/jumbo v2, "tag:dolby.com,2014:dash:audio_channel_configuration:2011"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const/4 v0, 0x2

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :sswitch_5
    const-string/jumbo v2, "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result v0

    .line 89
    .line 90
    if-nez v0, :cond_5

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    const/4 v0, 0x1

    .line 93
    goto :goto_1

    .line 94
    .line 95
    .line 96
    :sswitch_6
    const-string/jumbo v2, "urn:dts:dash:audio_channel_configuration:2012"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-nez v0, :cond_6

    .line 103
    goto :goto_0

    .line 104
    :cond_6
    const/4 v0, 0x0

    .line 105
    .line 106
    .line 107
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :pswitch_0
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDtsxChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 112
    move-result v1

    .line 113
    goto :goto_2

    .line 114
    .line 115
    .line 116
    :pswitch_1
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseMpegChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 117
    move-result v1

    .line 118
    goto :goto_2

    .line 119
    .line 120
    .line 121
    :pswitch_2
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDolbyChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 122
    move-result v1

    .line 123
    goto :goto_2

    .line 124
    .line 125
    .line 126
    :pswitch_3
    const-string/jumbo v0, "value"

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 130
    move-result v1

    .line 131
    goto :goto_2

    .line 132
    .line 133
    .line 134
    :pswitch_4
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDtsChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 135
    move-result v1

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 139
    .line 140
    const-string v0, "AudioChannelConfiguration"

    .line 141
    .line 142
    .line 143
    invoke-static {p1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 144
    move-result v0

    .line 145
    .line 146
    if-eqz v0, :cond_7

    .line 147
    return v1

    .line 148
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x7ee09c90 -> :sswitch_6
        -0x50a2db6e -> :sswitch_5
        -0x43d6a909 -> :sswitch_4
        -0x3aced4cf -> :sswitch_3
        -0x4b58cf3 -> :sswitch_2
        0x129b7989 -> :sswitch_1
        0x79657164 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_2
    .end packed-switch
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

.method public parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "availabilityTimeOffset"

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    return-wide p2

    .line 11
    .line 12
    :cond_0
    const-string p2, "INF"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result p2

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const-wide p1, 0x7fffffffffffffffL

    .line 24
    return-wide p1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 28
    move-result p1

    .line 29
    .line 30
    .line 31
    const p2, 0x49742400    # 1000000.0f

    .line 32
    mul-float/2addr p1, p2

    .line 33
    float-to-long p1, p1

    .line 34
    return-wide p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;Z)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dvb:priority"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    if-eqz p3, :cond_1

    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_1
    const/high16 v0, -0x80000000

    .line 22
    .line 23
    :goto_0
    const-string v3, "dvb:weight"

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 33
    move-result v2

    .line 34
    .line 35
    .line 36
    :cond_2
    const-string/jumbo v3, "serviceLocation"

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v3, "BaseURL"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseText(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Landroidx/media3/common/util/UriUtil;->isAbsolute(Ljava/lang/String;)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    move-object v1, p1

    .line 56
    .line 57
    :cond_3
    new-instance p2, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 58
    .line 59
    .line 60
    invoke-direct {p2, p1, v1, v0, v2}, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    filled-new-array {p2}, [Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/google/common/collect/Lists;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    .line 71
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 75
    const/4 v4, 0x0

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 79
    move-result v5

    .line 80
    .line 81
    if-ge v4, v5, :cond_7

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    check-cast v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 88
    .line 89
    iget-object v6, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-static {v6, p1}, Landroidx/media3/common/util/UriUtil;->resolve(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    move-result-object v6

    .line 94
    .line 95
    if-nez v1, :cond_5

    .line 96
    move-object v7, v6

    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move-object v7, v1

    .line 99
    .line 100
    :goto_2
    if-eqz p3, :cond_6

    .line 101
    .line 102
    iget v0, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->priority:I

    .line 103
    .line 104
    iget v2, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->weight:I

    .line 105
    .line 106
    iget-object v7, v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->serviceLocation:Ljava/lang/String;

    .line 107
    .line 108
    :cond_6
    new-instance v5, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 109
    .line 110
    .line 111
    invoke-direct {v5, v6, v7, v0, v2}, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    add-int/lit8 v4, v4, 0x1

    .line 117
    goto :goto_1

    .line 118
    :cond_7
    return-object v3
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
.end method

.method public parseContentProtection(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/DrmInitData$SchemeData;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    const-string/jumbo v1, "schemeIdUri"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const-string v3, "MpdParser"

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/google/common/base/Ascii;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    const/4 v5, -0x1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 26
    move-result v6

    .line 27
    .line 28
    .line 29
    sparse-switch v6, :sswitch_data_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :sswitch_0
    const-string/jumbo v6, "urn:mpeg:dash:mp4protection:2011"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v5, 0x3

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :sswitch_1
    const-string/jumbo v6, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v5, 0x2

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :sswitch_2
    const-string/jumbo v6, "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v5, v0

    .line 66
    goto :goto_0

    .line 67
    .line 68
    .line 69
    :sswitch_3
    const-string/jumbo v6, "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    move-result v1

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v5, v4

    .line 78
    .line 79
    .line 80
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 81
    goto :goto_5

    .line 82
    .line 83
    .line 84
    :pswitch_0
    const-string/jumbo v1, "value"

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    const-string v5, "default_KID"

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v5}, Landroidx/media3/common/util/XmlPullParserUtil;->getAttributeValueIgnorePrefix(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v5

    .line 95
    .line 96
    .line 97
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    move-result v6

    .line 99
    .line 100
    if-nez v6, :cond_5

    .line 101
    .line 102
    const-string v6, "00000000-0000-0000-0000-000000000000"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v6

    .line 107
    .line 108
    if-nez v6, :cond_5

    .line 109
    .line 110
    const-string v6, "\\s+"

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 114
    move-result-object v5

    .line 115
    array-length v6, v5

    .line 116
    .line 117
    new-array v6, v6, [Ljava/util/UUID;

    .line 118
    move v7, v4

    .line 119
    :goto_1
    array-length v8, v5

    .line 120
    .line 121
    if-ge v7, v8, :cond_4

    .line 122
    .line 123
    aget-object v8, v5, v7

    .line 124
    .line 125
    .line 126
    invoke-static {v8}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 127
    move-result-object v8

    .line 128
    .line 129
    aput-object v8, v6, v7

    .line 130
    add-int/2addr v7, v0

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_4
    sget-object v0, Landroidx/media3/common/C;->COMMON_PSSH_UUID:Ljava/util/UUID;

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v6, v2}, Landroidx/media3/extractor/mp4/PsshAtomUtil;->buildPsshAtom(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 137
    move-result-object v5

    .line 138
    move-object v6, v2

    .line 139
    goto :goto_6

    .line 140
    .line 141
    :cond_5
    const-string v0, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute."

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v0}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    move-object v0, v2

    .line 146
    move-object v5, v0

    .line 147
    :goto_2
    move-object v6, v5

    .line 148
    goto :goto_6

    .line 149
    .line 150
    :pswitch_1
    sget-object v0, Landroidx/media3/common/C;->WIDEVINE_UUID:Ljava/util/UUID;

    .line 151
    :goto_3
    move-object v1, v2

    .line 152
    :goto_4
    move-object v5, v1

    .line 153
    goto :goto_2

    .line 154
    .line 155
    :pswitch_2
    sget-object v0, Landroidx/media3/common/C;->PLAYREADY_UUID:Ljava/util/UUID;

    .line 156
    goto :goto_3

    .line 157
    .line 158
    :pswitch_3
    sget-object v0, Landroidx/media3/common/C;->CLEARKEY_UUID:Ljava/util/UUID;

    .line 159
    goto :goto_3

    .line 160
    :cond_6
    :goto_5
    move-object v0, v2

    .line 161
    move-object v1, v0

    .line 162
    goto :goto_4

    .line 163
    .line 164
    .line 165
    :cond_7
    :goto_6
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 166
    .line 167
    const-string v7, "clearkey:Laurl"

    .line 168
    .line 169
    .line 170
    invoke-static {p1, v7}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 171
    move-result v7

    .line 172
    const/4 v8, 0x4

    .line 173
    .line 174
    if-nez v7, :cond_8

    .line 175
    .line 176
    const-string v7, "dashif:Laurl"

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v7}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 180
    move-result v7

    .line 181
    .line 182
    if-eqz v7, :cond_9

    .line 183
    .line 184
    .line 185
    :cond_8
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 186
    move-result v7

    .line 187
    .line 188
    if-ne v7, v8, :cond_9

    .line 189
    .line 190
    .line 191
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 192
    move-result-object v6

    .line 193
    goto :goto_7

    .line 194
    .line 195
    :cond_9
    const-string v7, "ms:laurl"

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v7}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 199
    move-result v7

    .line 200
    .line 201
    if-eqz v7, :cond_a

    .line 202
    .line 203
    const-string v6, "licenseUrl"

    .line 204
    .line 205
    .line 206
    invoke-interface {p1, v2, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    move-result-object v6

    .line 208
    goto :goto_7

    .line 209
    .line 210
    :cond_a
    if-nez v5, :cond_c

    .line 211
    .line 212
    .line 213
    const-string/jumbo v7, "pssh"

    .line 214
    .line 215
    .line 216
    invoke-static {p1, v7}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTagIgnorePrefix(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 217
    move-result v7

    .line 218
    .line 219
    if-eqz v7, :cond_c

    .line 220
    .line 221
    .line 222
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 223
    move-result v7

    .line 224
    .line 225
    if-ne v7, v8, :cond_c

    .line 226
    .line 227
    .line 228
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 229
    move-result-object v0

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 233
    move-result-object v0

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Landroidx/media3/extractor/mp4/PsshAtomUtil;->parseUuid([B)Ljava/util/UUID;

    .line 237
    move-result-object v5

    .line 238
    .line 239
    if-nez v5, :cond_b

    .line 240
    .line 241
    const-string v0, "Skipping malformed cenc:pssh data"

    .line 242
    .line 243
    .line 244
    invoke-static {v3, v0}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    move-object v0, v5

    .line 246
    move-object v5, v2

    .line 247
    goto :goto_7

    .line 248
    :cond_b
    move-object v10, v5

    .line 249
    move-object v5, v0

    .line 250
    move-object v0, v10

    .line 251
    goto :goto_7

    .line 252
    .line 253
    :cond_c
    if-nez v5, :cond_d

    .line 254
    .line 255
    sget-object v7, Landroidx/media3/common/C;->PLAYREADY_UUID:Ljava/util/UUID;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 259
    move-result v9

    .line 260
    .line 261
    if-eqz v9, :cond_d

    .line 262
    .line 263
    const-string v9, "mspr:pro"

    .line 264
    .line 265
    .line 266
    invoke-static {p1, v9}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 267
    move-result v9

    .line 268
    .line 269
    if-eqz v9, :cond_d

    .line 270
    .line 271
    .line 272
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 273
    move-result v9

    .line 274
    .line 275
    if-ne v9, v8, :cond_d

    .line 276
    .line 277
    .line 278
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 279
    move-result-object v5

    .line 280
    .line 281
    .line 282
    invoke-static {v5, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 283
    move-result-object v5

    .line 284
    .line 285
    .line 286
    invoke-static {v7, v5}, Landroidx/media3/extractor/mp4/PsshAtomUtil;->buildPsshAtom(Ljava/util/UUID;[B)[B

    .line 287
    move-result-object v5

    .line 288
    goto :goto_7

    .line 289
    .line 290
    .line 291
    :cond_d
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 292
    .line 293
    :goto_7
    const-string v7, "ContentProtection"

    .line 294
    .line 295
    .line 296
    invoke-static {p1, v7}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 297
    move-result v7

    .line 298
    .line 299
    if-eqz v7, :cond_7

    .line 300
    .line 301
    if-eqz v0, :cond_e

    .line 302
    .line 303
    new-instance v2, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 304
    .line 305
    .line 306
    const-string/jumbo p1, "video/mp4"

    .line 307
    .line 308
    .line 309
    invoke-direct {v2, v0, v6, p1, v5}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 310
    .line 311
    .line 312
    :cond_e
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 313
    move-result-object p1

    .line 314
    return-object p1

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
    :sswitch_data_0
    .sparse-switch
        -0x7610741f -> :sswitch_3
        0x1d2c5beb -> :sswitch_2
        0x2d06c692 -> :sswitch_1
        0x6c0c9d2a -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public parseContentType(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "contentType"

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    return v1

    .line 16
    .line 17
    :cond_0
    const-string v0, "audio"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    .line 27
    .line 28
    :cond_1
    const-string/jumbo v0, "video"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    const/4 p1, 0x2

    .line 36
    return p1

    .line 37
    .line 38
    .line 39
    :cond_2
    const-string/jumbo v0, "text"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    const/4 p1, 0x3

    .line 47
    return p1

    .line 48
    .line 49
    :cond_3
    const-string v0, "image"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result p1

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    const/4 p1, 0x4

    .line 57
    return p1

    .line 58
    :cond_4
    return v1
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

.method public parseEvent(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;JJLjava/io/ByteArrayOutputStream;)Landroid/util/Pair;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/io/ByteArrayOutputStream;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Landroidx/media3/extractor/metadata/emsg/EventMessage;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "id"

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 10
    move-result-wide v7

    .line 11
    .line 12
    const-string v1, "duration"

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 21
    move-result-wide v9

    .line 22
    .line 23
    .line 24
    const-string/jumbo v1, "presentationTime"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 28
    move-result-wide v1

    .line 29
    .line 30
    const-wide/16 v11, 0x3e8

    .line 31
    .line 32
    move-wide/from16 v13, p4

    .line 33
    .line 34
    .line 35
    invoke-static/range {v9 .. v14}, Landroidx/media3/common/util/Util;->scaleLargeTimestamp(JJJ)J

    .line 36
    move-result-wide v9

    .line 37
    .line 38
    sub-long v11, v1, p6

    .line 39
    .line 40
    .line 41
    const-wide/32 v13, 0xf4240

    .line 42
    .line 43
    move-wide/from16 v15, p4

    .line 44
    .line 45
    .line 46
    invoke-static/range {v11 .. v16}, Landroidx/media3/common/util/Util;->scaleLargeTimestamp(JJJ)J

    .line 47
    move-result-wide v1

    .line 48
    .line 49
    const-string v3, "messageData"

    .line 50
    const/4 v4, 0x0

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    move-object/from16 v4, p0

    .line 57
    .line 58
    move-object/from16 v5, p8

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v0, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEventObject(Lorg/xmlpull/v1/XmlPullParser;Ljava/io/ByteArrayOutputStream;)[B

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    if-nez v3, :cond_0

    .line 69
    .line 70
    :goto_0
    move-object/from16 v5, p2

    .line 71
    .line 72
    move-object/from16 v6, p3

    .line 73
    move-object v11, v0

    .line 74
    goto :goto_1

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-static {v3}, Landroidx/media3/common/util/Util;->getUtf8Bytes(Ljava/lang/String;)[B

    .line 78
    move-result-object v0

    .line 79
    goto :goto_0

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual/range {v4 .. v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildEvent(Ljava/lang/String;Ljava/lang/String;JJ[B)Landroidx/media3/extractor/metadata/emsg/EventMessage;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 87
    move-result-object v0

    .line 88
    return-object v0
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

.method public parseEventObject(Lorg/xmlpull/v1/XmlPullParser;Ljava/io/ByteArrayOutputStream;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p2, v1}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 20
    .line 21
    :goto_0
    const-string v1, "Event"

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 31
    move-result v1

    .line 32
    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    .line 39
    :pswitch_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->docdecl(Ljava/lang/String;)V

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    .line 48
    :pswitch_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->comment(Ljava/lang/String;)V

    .line 53
    goto :goto_2

    .line 54
    .line 55
    .line 56
    :pswitch_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->processingInstruction(Ljava/lang/String;)V

    .line 61
    goto :goto_2

    .line 62
    .line 63
    .line 64
    :pswitch_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->ignorableWhitespace(Ljava/lang/String;)V

    .line 69
    goto :goto_2

    .line 70
    .line 71
    .line 72
    :pswitch_4
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->entityRef(Ljava/lang/String;)V

    .line 77
    goto :goto_2

    .line 78
    .line 79
    .line 80
    :pswitch_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->cdsect(Ljava/lang/String;)V

    .line 85
    goto :goto_2

    .line 86
    .line 87
    .line 88
    :pswitch_6
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 93
    goto :goto_2

    .line 94
    .line 95
    .line 96
    :pswitch_7
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 105
    goto :goto_2

    .line 106
    .line 107
    .line 108
    :pswitch_8
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 117
    const/4 v1, 0x0

    .line 118
    .line 119
    .line 120
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 121
    move-result v2

    .line 122
    .line 123
    if-ge v1, v2, :cond_0

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    .line 127
    move-result-object v2

    .line 128
    .line 129
    .line 130
    invoke-interface {p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 131
    move-result-object v3

    .line 132
    .line 133
    .line 134
    invoke-interface {p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 135
    move-result-object v4

    .line 136
    .line 137
    .line 138
    invoke-interface {v0, v2, v3, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    goto :goto_1

    .line 142
    .line 143
    .line 144
    :pswitch_9
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 145
    goto :goto_2

    .line 146
    .line 147
    :pswitch_a
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    const/4 v2, 0x0

    .line 149
    .line 150
    .line 151
    invoke-interface {v0, v2, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 152
    .line 153
    .line 154
    :cond_0
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    .line 159
    :cond_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 163
    move-result-object p1

    .line 164
    return-object p1

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
    :pswitch_data_0
    .packed-switch 0x0
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

.method public parseEventStream(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/EventStream;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "schemeIdUri"

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object v3

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "value"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "timescale"

    .line 20
    .line 21
    const-wide/16 v1, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 25
    move-result-wide v5

    .line 26
    .line 27
    .line 28
    const-string/jumbo v0, "presentationTimeOffset"

    .line 29
    .line 30
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 34
    move-result-wide v8

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 42
    .line 43
    const/16 v1, 0x200

    .line 44
    .line 45
    .line 46
    invoke-direct {v10, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 50
    .line 51
    const-string v1, "Event"

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    move-object v2, p0

    .line 59
    move-wide v6, v5

    .line 60
    move-object v5, v4

    .line 61
    move-object v4, v3

    .line 62
    move-object v3, p1

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {v2 .. v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEvent(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;JJLjava/io/ByteArrayOutputStream;)Landroid/util/Pair;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    move-wide v6, v5

    .line 72
    move-object v5, v4

    .line 73
    move-object v4, v3

    .line 74
    move-object v3, p1

    .line 75
    .line 76
    .line 77
    invoke-static {v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 78
    .line 79
    :goto_1
    const-string p1, "EventStream"

    .line 80
    .line 81
    .line 82
    invoke-static {v3, p1}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 83
    move-result p1

    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 89
    move-result p1

    .line 90
    .line 91
    new-array p1, p1, [J

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 95
    move-result v1

    .line 96
    .line 97
    new-array v8, v1, [Landroidx/media3/extractor/metadata/emsg/EventMessage;

    .line 98
    const/4 v1, 0x0

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 102
    move-result v2

    .line 103
    .line 104
    if-ge v1, v2, :cond_1

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    check-cast v2, Landroid/util/Pair;

    .line 111
    .line 112
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 118
    move-result-wide v9

    .line 119
    .line 120
    aput-wide v9, p1, v1

    .line 121
    .line 122
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, Landroidx/media3/extractor/metadata/emsg/EventMessage;

    .line 125
    .line 126
    aput-object v2, v8, v1

    .line 127
    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    goto :goto_2

    .line 130
    :cond_1
    move-object v2, p0

    .line 131
    move-object v3, v4

    .line 132
    move-object v4, v5

    .line 133
    move-wide v5, v6

    .line 134
    move-object v7, p1

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v2 .. v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildEventStream(Ljava/lang/String;Ljava/lang/String;J[J[Landroidx/media3/extractor/metadata/emsg/EventMessage;)Landroidx/media3/exoplayer/dash/manifest/EventStream;

    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    :cond_2
    move-object p1, v3

    .line 141
    move-object v3, v4

    .line 142
    move-object v4, v5

    .line 143
    move-wide v5, v6

    .line 144
    goto :goto_0
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

.method public parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sourceURL"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "range"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRangedUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public parseLabel(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/common/Label;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "lang"

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-string v1, "Label"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseText(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    new-instance v1, Landroidx/media3/common/Label;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Landroidx/media3/common/Label;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    return-object v1
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public parseMediaPresentationDescription(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 38
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    new-array v3, v2, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "profiles"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v4, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseProfiles(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->isDvbProfileDeclared([Ljava/lang/String;)Z

    .line 18
    move-result v11

    .line 19
    .line 20
    const-string v3, "availabilityStartTime"

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDateTime(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 29
    move-result-wide v7

    .line 30
    .line 31
    const-string v3, "mediaPresentationDuration"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 35
    move-result-wide v14

    .line 36
    .line 37
    const-string v3, "minBufferTime"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 41
    move-result-wide v16

    .line 42
    .line 43
    .line 44
    const-string/jumbo v3, "type"

    .line 45
    const/4 v4, 0x0

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    const-string v5, "dynamic"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    move-result v18

    .line 56
    .line 57
    if-eqz v18, :cond_0

    .line 58
    .line 59
    const-string v3, "minimumUpdatePeriod"

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 63
    move-result-wide v5

    .line 64
    .line 65
    move-wide/from16 v19, v5

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_0
    move-wide/from16 v19, v12

    .line 69
    .line 70
    :goto_0
    if-eqz v18, :cond_1

    .line 71
    .line 72
    .line 73
    const-string/jumbo v3, "timeShiftBufferDepth"

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 77
    move-result-wide v5

    .line 78
    move-wide v9, v5

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move-wide v9, v12

    .line 81
    .line 82
    :goto_1
    if-eqz v18, :cond_2

    .line 83
    .line 84
    .line 85
    const-string/jumbo v3, "suggestedPresentationDelay"

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 89
    move-result-wide v5

    .line 90
    .line 91
    move-wide/from16 v21, v5

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_2
    move-wide/from16 v21, v12

    .line 95
    .line 96
    .line 97
    :goto_2
    const-string/jumbo v3, "publishTime"

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDateTime(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 101
    move-result-wide v23

    .line 102
    .line 103
    const-wide/16 v5, 0x0

    .line 104
    .line 105
    if-eqz v18, :cond_3

    .line 106
    .line 107
    move-wide/from16 v25, v5

    .line 108
    goto :goto_3

    .line 109
    .line 110
    :cond_3
    move-wide/from16 v25, v12

    .line 111
    .line 112
    :goto_3
    new-instance v3, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 120
    move-result-object v4

    .line 121
    .line 122
    move-wide/from16 v29, v12

    .line 123
    const/4 v12, 0x1

    .line 124
    .line 125
    if-eqz v11, :cond_4

    .line 126
    move v13, v12

    .line 127
    goto :goto_4

    .line 128
    .line 129
    :cond_4
    const/high16 v13, -0x80000000

    .line 130
    .line 131
    .line 132
    :goto_4
    invoke-direct {v3, v2, v4, v13, v12}, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    filled-new-array {v3}, [Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Lcom/google/common/collect/Lists;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 140
    move-result-object v13

    .line 141
    .line 142
    new-instance v2, Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    new-instance v3, Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    if-eqz v18, :cond_5

    .line 153
    .line 154
    move-wide/from16 v5, v29

    .line 155
    .line 156
    :cond_5
    move-object/from16 v31, v13

    .line 157
    .line 158
    move-wide/from16 v12, v25

    .line 159
    .line 160
    const/16 v25, 0x0

    .line 161
    .line 162
    const/16 v27, 0x0

    .line 163
    .line 164
    const/16 v32, 0x0

    .line 165
    .line 166
    const/16 v33, 0x0

    .line 167
    .line 168
    const/16 v34, 0x0

    .line 169
    .line 170
    const/16 v35, 0x0

    .line 171
    .line 172
    .line 173
    :goto_5
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 174
    .line 175
    const-string v4, "BaseURL"

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 179
    move-result v4

    .line 180
    .line 181
    if-eqz v4, :cond_7

    .line 182
    .line 183
    if-nez v27, :cond_6

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1, v12, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 187
    move-result-wide v12

    .line 188
    .line 189
    const/16 v27, 0x1

    .line 190
    .line 191
    :cond_6
    move-object/from16 v4, v31

    .line 192
    .line 193
    move-object/from16 v31, v2

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v1, v4, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    .line 197
    move-result-object v2

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 201
    .line 202
    :goto_6
    move-object/from16 v28, v3

    .line 203
    .line 204
    move-object/from16 v2, v31

    .line 205
    .line 206
    move-object/from16 v31, v4

    .line 207
    .line 208
    goto/16 :goto_c

    .line 209
    .line 210
    :cond_7
    move-object/from16 v4, v31

    .line 211
    .line 212
    move-object/from16 v31, v2

    .line 213
    .line 214
    const-string v2, "ProgramInformation"

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 218
    move-result v2

    .line 219
    .line 220
    if-eqz v2, :cond_8

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseProgramInformation(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;

    .line 224
    move-result-object v32

    .line 225
    goto :goto_6

    .line 226
    .line 227
    :cond_8
    const-string v2, "UTCTiming"

    .line 228
    .line 229
    .line 230
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 231
    move-result v2

    .line 232
    .line 233
    if-eqz v2, :cond_9

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseUtcTiming(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;

    .line 237
    move-result-object v33

    .line 238
    goto :goto_6

    .line 239
    .line 240
    :cond_9
    const-string v2, "Location"

    .line 241
    .line 242
    .line 243
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 244
    move-result v2

    .line 245
    .line 246
    if-eqz v2, :cond_a

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 250
    move-result-object v2

    .line 251
    .line 252
    .line 253
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 254
    move-result-object v0

    .line 255
    .line 256
    .line 257
    invoke-static {v2, v0}, Landroidx/media3/common/util/UriUtil;->resolveToUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 258
    move-result-object v34

    .line 259
    goto :goto_6

    .line 260
    .line 261
    :cond_a
    const-string v0, "ServiceDescription"

    .line 262
    .line 263
    .line 264
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 265
    move-result v0

    .line 266
    .line 267
    if-eqz v0, :cond_b

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseServiceDescription(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;

    .line 271
    move-result-object v35

    .line 272
    goto :goto_6

    .line 273
    .line 274
    :cond_b
    const-string v0, "Period"

    .line 275
    .line 276
    .line 277
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 278
    move-result v0

    .line 279
    .line 280
    if-eqz v0, :cond_10

    .line 281
    .line 282
    if-nez v25, :cond_10

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 286
    move-result v0

    .line 287
    .line 288
    if-nez v0, :cond_c

    .line 289
    move-object v2, v3

    .line 290
    .line 291
    move-object/from16 v28, v2

    .line 292
    .line 293
    move-object/from16 v37, v31

    .line 294
    .line 295
    move-object/from16 v31, v4

    .line 296
    move-wide v3, v5

    .line 297
    move-wide v5, v12

    .line 298
    .line 299
    move-object/from16 v13, v37

    .line 300
    .line 301
    :goto_7
    move-object/from16 v0, p0

    .line 302
    const/4 v12, 0x0

    .line 303
    goto :goto_8

    .line 304
    .line 305
    :cond_c
    move-object/from16 v28, v3

    .line 306
    move-object v2, v4

    .line 307
    move-wide v3, v5

    .line 308
    move-wide v5, v12

    .line 309
    .line 310
    move-object/from16 v13, v31

    .line 311
    .line 312
    move-object/from16 v31, v2

    .line 313
    goto :goto_7

    .line 314
    .line 315
    .line 316
    :goto_8
    invoke-virtual/range {v0 .. v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parsePeriod(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;JJJJZ)Landroid/util/Pair;

    .line 317
    move-result-object v2

    .line 318
    .line 319
    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Landroidx/media3/exoplayer/dash/manifest/Period;

    .line 322
    .line 323
    move-object/from16 v36, v13

    .line 324
    .line 325
    iget-wide v12, v0, Landroidx/media3/exoplayer/dash/manifest/Period;->startMs:J

    .line 326
    .line 327
    cmp-long v12, v12, v29

    .line 328
    .line 329
    if-nez v12, :cond_e

    .line 330
    .line 331
    if-eqz v18, :cond_d

    .line 332
    .line 333
    move-object/from16 v2, v36

    .line 334
    .line 335
    const/16 v25, 0x1

    .line 336
    goto :goto_b

    .line 337
    .line 338
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    const-string v1, "Unable to determine start of period "

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-interface/range {v36 .. v36}, Ljava/util/List;->size()I

    .line 350
    move-result v1

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    move-result-object v0

    .line 358
    const/4 v12, 0x0

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v12}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 362
    move-result-object v0

    .line 363
    throw v0

    .line 364
    .line 365
    :cond_e
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, Ljava/lang/Long;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 371
    move-result-wide v2

    .line 372
    .line 373
    cmp-long v4, v2, v29

    .line 374
    .line 375
    if-nez v4, :cond_f

    .line 376
    .line 377
    move-wide/from16 v12, v29

    .line 378
    .line 379
    :goto_9
    move-object/from16 v2, v36

    .line 380
    goto :goto_a

    .line 381
    .line 382
    :cond_f
    iget-wide v12, v0, Landroidx/media3/exoplayer/dash/manifest/Period;->startMs:J

    .line 383
    add-long/2addr v12, v2

    .line 384
    goto :goto_9

    .line 385
    .line 386
    .line 387
    :goto_a
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 388
    move-wide v3, v12

    .line 389
    :goto_b
    move-wide v12, v5

    .line 390
    move-wide v5, v3

    .line 391
    goto :goto_c

    .line 392
    .line 393
    :cond_10
    move-object/from16 v28, v3

    .line 394
    .line 395
    move-object/from16 v2, v31

    .line 396
    .line 397
    move-object/from16 v31, v4

    .line 398
    move-wide v3, v5

    .line 399
    move-wide v5, v12

    .line 400
    .line 401
    .line 402
    invoke-static {v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 403
    goto :goto_b

    .line 404
    .line 405
    :goto_c
    const-string v0, "MPD"

    .line 406
    .line 407
    .line 408
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 409
    move-result v0

    .line 410
    .line 411
    if-eqz v0, :cond_15

    .line 412
    .line 413
    cmp-long v0, v14, v29

    .line 414
    .line 415
    if-nez v0, :cond_12

    .line 416
    .line 417
    cmp-long v0, v5, v29

    .line 418
    .line 419
    if-eqz v0, :cond_11

    .line 420
    move-wide v4, v5

    .line 421
    const/4 v12, 0x0

    .line 422
    goto :goto_e

    .line 423
    .line 424
    :cond_11
    if-eqz v18, :cond_13

    .line 425
    :cond_12
    const/4 v12, 0x0

    .line 426
    goto :goto_d

    .line 427
    .line 428
    :cond_13
    const-string v0, "Unable to determine duration of static manifest."

    .line 429
    const/4 v12, 0x0

    .line 430
    .line 431
    .line 432
    invoke-static {v0, v12}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 433
    move-result-object v0

    .line 434
    throw v0

    .line 435
    :goto_d
    move-wide v4, v14

    .line 436
    .line 437
    .line 438
    :goto_e
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 439
    move-result v0

    .line 440
    .line 441
    if-nez v0, :cond_14

    .line 442
    .line 443
    move-object/from16 v1, p0

    .line 444
    move-wide v11, v9

    .line 445
    .line 446
    move-wide/from16 v9, v19

    .line 447
    .line 448
    move-wide/from16 v13, v21

    .line 449
    .line 450
    move-object/from16 v20, v34

    .line 451
    .line 452
    move-object/from16 v19, v35

    .line 453
    .line 454
    move-object/from16 v21, v2

    .line 455
    move-wide v2, v7

    .line 456
    .line 457
    move-wide/from16 v6, v16

    .line 458
    .line 459
    move/from16 v8, v18

    .line 460
    .line 461
    move-wide/from16 v15, v23

    .line 462
    .line 463
    move-object/from16 v17, v32

    .line 464
    .line 465
    move-object/from16 v18, v33

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v1 .. v21}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildMediaPresentationDescription(JJJZJJJJLandroidx/media3/exoplayer/dash/manifest/ProgramInformation;Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;Landroid/net/Uri;Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    .line 469
    move-result-object v0

    .line 470
    return-object v0

    .line 471
    :cond_14
    move-object v0, v12

    .line 472
    .line 473
    const-string v1, "No periods found."

    .line 474
    .line 475
    .line 476
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 477
    move-result-object v0

    .line 478
    throw v0

    .line 479
    .line 480
    :cond_15
    move-object/from16 v36, v2

    .line 481
    .line 482
    move-wide/from16 v2, v16

    .line 483
    .line 484
    move/from16 v4, v18

    .line 485
    .line 486
    move-object/from16 v17, v32

    .line 487
    .line 488
    move-object/from16 v18, v33

    .line 489
    .line 490
    move-wide/from16 v32, v23

    .line 491
    .line 492
    move-wide/from16 v23, v21

    .line 493
    .line 494
    move-wide/from16 v21, v9

    .line 495
    .line 496
    move-wide/from16 v9, v19

    .line 497
    .line 498
    move-object/from16 v20, v34

    .line 499
    .line 500
    move-object/from16 v19, v35

    .line 501
    .line 502
    move-object/from16 v0, p0

    .line 503
    .line 504
    move-wide/from16 v19, v9

    .line 505
    .line 506
    move-wide/from16 v9, v21

    .line 507
    .line 508
    move-wide/from16 v21, v23

    .line 509
    .line 510
    move-wide/from16 v23, v32

    .line 511
    .line 512
    move-object/from16 v32, v17

    .line 513
    .line 514
    move-object/from16 v33, v18

    .line 515
    .line 516
    move-wide/from16 v16, v2

    .line 517
    .line 518
    move/from16 v18, v4

    .line 519
    .line 520
    move-object/from16 v3, v28

    .line 521
    .line 522
    move-object/from16 v2, v36

    .line 523
    .line 524
    goto/16 :goto_5
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
.end method

.method public parsePeriod(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;JJJJZ)Landroid/util/Pair;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;JJJJZ)",
            "Landroid/util/Pair<",
            "Landroidx/media3/exoplayer/dash/manifest/Period;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "id"

    .line 7
    const/4 v15, 0x0

    .line 8
    .line 9
    .line 10
    invoke-interface {v1, v15, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v16

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "start"

    .line 15
    .line 16
    move-wide/from16 v3, p3

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2, v3, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 20
    move-result-wide v17

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    cmp-long v4, p7, v2

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    add-long v4, p7, v17

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-wide v4, v2

    .line 34
    .line 35
    :goto_0
    const-string v6, "duration"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v6, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDuration(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 39
    move-result-wide v6

    .line 40
    .line 41
    new-instance v8, Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    new-instance v9, Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    new-instance v10, Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 55
    const/4 v11, 0x0

    .line 56
    move-wide v13, v2

    .line 57
    .line 58
    move-object/from16 v20, v9

    .line 59
    .line 60
    move/from16 v19, v11

    .line 61
    .line 62
    move-object/from16 v21, v15

    .line 63
    .line 64
    move-wide/from16 v11, p5

    .line 65
    move-object v2, v8

    .line 66
    .line 67
    move-object/from16 v3, v21

    .line 68
    move-wide v8, v13

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 72
    .line 73
    const-string v13, "BaseURL"

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v13}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 77
    move-result v13

    .line 78
    .line 79
    if-eqz v13, :cond_2

    .line 80
    .line 81
    if-nez v19, :cond_1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v11, v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 85
    move-result-wide v11

    .line 86
    .line 87
    const/16 v19, 0x1

    .line 88
    .line 89
    :cond_1
    move-object/from16 v13, p2

    .line 90
    .line 91
    move/from16 v14, p11

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v13, v14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    .line 95
    move-result-object v15

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    move-object/from16 v24, v2

    .line 101
    .line 102
    move-wide/from16 v26, v8

    .line 103
    .line 104
    move-wide/from16 v28, v11

    .line 105
    .line 106
    move-object/from16 v25, v20

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    const/16 v22, 0x0

    .line 114
    move-wide v8, v4

    .line 115
    move-wide v12, v6

    .line 116
    .line 117
    move-object/from16 v20, v10

    .line 118
    .line 119
    move-object/from16 v6, v21

    .line 120
    move-object v7, v1

    .line 121
    :goto_2
    move-object v10, v3

    .line 122
    .line 123
    goto/16 :goto_8

    .line 124
    .line 125
    :cond_2
    move-object/from16 v13, p2

    .line 126
    .line 127
    move/from16 v14, p11

    .line 128
    .line 129
    const-string v15, "AdaptationSet"

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v15}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 133
    move-result v15

    .line 134
    .line 135
    if-eqz v15, :cond_4

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 139
    move-result v15

    .line 140
    .line 141
    if-nez v15, :cond_3

    .line 142
    move-object v15, v2

    .line 143
    move-object v2, v10

    .line 144
    .line 145
    move-object/from16 v25, v20

    .line 146
    .line 147
    move-object/from16 v20, v2

    .line 148
    .line 149
    :goto_3
    move-wide/from16 v30, v11

    .line 150
    .line 151
    move-wide/from16 v12, p9

    .line 152
    move-wide v10, v4

    .line 153
    move-wide v4, v6

    .line 154
    .line 155
    move-wide/from16 v6, v30

    .line 156
    goto :goto_4

    .line 157
    :cond_3
    move-object v15, v2

    .line 158
    move-object v2, v13

    .line 159
    .line 160
    move-object/from16 v25, v20

    .line 161
    .line 162
    move-object/from16 v20, v10

    .line 163
    goto :goto_3

    .line 164
    .line 165
    .line 166
    :goto_4
    invoke-virtual/range {v0 .. v14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAdaptationSet(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 167
    move-result-object v2

    .line 168
    .line 169
    move-wide/from16 v30, v6

    .line 170
    move-wide v6, v4

    .line 171
    move-wide v4, v10

    .line 172
    move-wide v10, v8

    .line 173
    .line 174
    move-wide/from16 v8, v30

    .line 175
    .line 176
    .line 177
    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    :goto_5
    move-object/from16 p3, v3

    .line 180
    move-wide v12, v6

    .line 181
    .line 182
    move-object/from16 v24, v15

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    move-object v7, v1

    .line 191
    move-wide v0, v8

    .line 192
    move-wide v8, v4

    .line 193
    .line 194
    goto/16 :goto_7

    .line 195
    :cond_4
    move-object v15, v2

    .line 196
    .line 197
    move-object/from16 v25, v20

    .line 198
    .line 199
    move-object/from16 v20, v10

    .line 200
    .line 201
    move-wide/from16 v30, v11

    .line 202
    move-wide v10, v8

    .line 203
    .line 204
    move-wide/from16 v8, v30

    .line 205
    .line 206
    const-string v2, "EventStream"

    .line 207
    .line 208
    .line 209
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 210
    move-result v2

    .line 211
    .line 212
    if-eqz v2, :cond_5

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseEventStream(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/EventStream;

    .line 216
    move-result-object v2

    .line 217
    .line 218
    move-object/from16 v14, v25

    .line 219
    .line 220
    .line 221
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    goto :goto_5

    .line 223
    .line 224
    :cond_5
    move-object/from16 v14, v25

    .line 225
    .line 226
    const-string v2, "SegmentBase"

    .line 227
    .line 228
    .line 229
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 230
    move-result v2

    .line 231
    .line 232
    if-eqz v2, :cond_6

    .line 233
    const/4 v13, 0x0

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1, v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 237
    move-result-object v3

    .line 238
    .line 239
    move-wide/from16 v28, v8

    .line 240
    .line 241
    move-wide/from16 v26, v10

    .line 242
    .line 243
    move-object/from16 v22, v13

    .line 244
    .line 245
    move-object/from16 v25, v14

    .line 246
    .line 247
    move-object/from16 v24, v15

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 253
    move-object v10, v3

    .line 254
    :goto_6
    move-wide v8, v4

    .line 255
    move-wide v12, v6

    .line 256
    .line 257
    move-object/from16 v6, v21

    .line 258
    move-object v7, v1

    .line 259
    .line 260
    goto/16 :goto_8

    .line 261
    :cond_6
    const/4 v13, 0x0

    .line 262
    .line 263
    const-string v2, "SegmentList"

    .line 264
    .line 265
    .line 266
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 267
    move-result v2

    .line 268
    .line 269
    if-eqz v2, :cond_7

    .line 270
    .line 271
    move-wide/from16 v22, v4

    .line 272
    move-wide v5, v6

    .line 273
    move-wide v7, v8

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 282
    move-result-wide v9

    .line 283
    move-wide v3, v2

    .line 284
    const/4 v2, 0x0

    .line 285
    .line 286
    move-wide/from16 v11, p9

    .line 287
    .line 288
    move-object/from16 v25, v14

    .line 289
    .line 290
    move-object/from16 v24, v15

    .line 291
    move-wide v14, v3

    .line 292
    .line 293
    move-wide/from16 v3, v22

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 297
    move-result-object v2

    .line 298
    move-wide v10, v9

    .line 299
    move-wide v8, v7

    .line 300
    move-wide v6, v5

    .line 301
    move-wide v4, v3

    .line 302
    .line 303
    move-wide/from16 v28, v8

    .line 304
    .line 305
    move-wide/from16 v26, v10

    .line 306
    .line 307
    move-object/from16 v22, v13

    .line 308
    move-object v10, v2

    .line 309
    goto :goto_6

    .line 310
    .line 311
    :cond_7
    move-object/from16 p3, v3

    .line 312
    .line 313
    move-object/from16 v25, v14

    .line 314
    .line 315
    move-object/from16 v24, v15

    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 321
    .line 322
    const-string v2, "SegmentTemplate"

    .line 323
    .line 324
    .line 325
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 326
    move-result v2

    .line 327
    .line 328
    if-eqz v2, :cond_8

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v1, v14, v15}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 332
    move-result-wide v10

    .line 333
    const/4 v2, 0x0

    .line 334
    .line 335
    .line 336
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    .line 337
    move-result-object v3

    .line 338
    .line 339
    move-object/from16 v22, v13

    .line 340
    .line 341
    move-wide/from16 v12, p9

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 345
    move-result-object v3

    .line 346
    move-wide v12, v6

    .line 347
    move-object v7, v1

    .line 348
    move-wide v0, v8

    .line 349
    move-wide v8, v4

    .line 350
    .line 351
    move-wide/from16 v28, v0

    .line 352
    .line 353
    move-wide/from16 v26, v10

    .line 354
    .line 355
    move-object/from16 v6, v21

    .line 356
    .line 357
    goto/16 :goto_2

    .line 358
    .line 359
    :cond_8
    move-object/from16 v22, v13

    .line 360
    move-wide v12, v6

    .line 361
    move-object v7, v1

    .line 362
    move-wide v0, v8

    .line 363
    move-wide v8, v4

    .line 364
    .line 365
    const-string v2, "AssetIdentifier"

    .line 366
    .line 367
    .line 368
    invoke-static {v7, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 369
    move-result v3

    .line 370
    .line 371
    if-eqz v3, :cond_9

    .line 372
    .line 373
    .line 374
    invoke-static {v7, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 375
    move-result-object v21

    .line 376
    .line 377
    :goto_7
    move-wide/from16 v28, v0

    .line 378
    .line 379
    move-wide/from16 v26, v10

    .line 380
    .line 381
    move-object/from16 v6, v21

    .line 382
    .line 383
    move-object/from16 v10, p3

    .line 384
    goto :goto_8

    .line 385
    .line 386
    .line 387
    :cond_9
    invoke-static {v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 388
    goto :goto_7

    .line 389
    .line 390
    :goto_8
    const-string v0, "Period"

    .line 391
    .line 392
    .line 393
    invoke-static {v7, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 394
    move-result v0

    .line 395
    .line 396
    if-eqz v0, :cond_a

    .line 397
    .line 398
    move-object/from16 v0, p0

    .line 399
    .line 400
    move-object/from16 v1, v16

    .line 401
    .line 402
    move-wide/from16 v2, v17

    .line 403
    .line 404
    move-object/from16 v4, v24

    .line 405
    .line 406
    move-object/from16 v5, v25

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildPeriod(Ljava/lang/String;JLjava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/Descriptor;)Landroidx/media3/exoplayer/dash/manifest/Period;

    .line 410
    move-result-object v1

    .line 411
    .line 412
    .line 413
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 414
    move-result-object v0

    .line 415
    .line 416
    .line 417
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 418
    move-result-object v0

    .line 419
    return-object v0

    .line 420
    .line 421
    :cond_a
    move-object/from16 v0, p0

    .line 422
    .line 423
    move-object/from16 v21, v6

    .line 424
    move-object v1, v7

    .line 425
    move-wide v4, v8

    .line 426
    move-object v3, v10

    .line 427
    move-wide v6, v12

    .line 428
    move-wide v13, v14

    .line 429
    .line 430
    move-object/from16 v10, v20

    .line 431
    .line 432
    move-object/from16 v15, v22

    .line 433
    .line 434
    move-object/from16 v2, v24

    .line 435
    .line 436
    move-object/from16 v20, v25

    .line 437
    .line 438
    move-wide/from16 v8, v26

    .line 439
    .line 440
    move-wide/from16 v11, v28

    .line 441
    .line 442
    goto/16 :goto_1
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
.end method

.method public parseProfiles(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    return-object p3

    .line 9
    .line 10
    :cond_0
    const-string p2, ","

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public parseProgramInformation(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "moreInformationURL"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object v6

    .line 8
    .line 9
    const-string v0, "lang"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v7

    .line 14
    move-object v0, v1

    .line 15
    move-object v2, v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 19
    .line 20
    const-string v3, "Title"

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v3}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 24
    move-result v3

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    :goto_1
    move-object v4, v0

    .line 32
    move-object v3, v1

    .line 33
    move-object v5, v2

    .line 34
    goto :goto_2

    .line 35
    .line 36
    :cond_0
    const-string v3, "Source"

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v3}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_1
    const-string v3, "Copyright"

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v3}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 53
    move-result v3

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 59
    move-result-object v2

    .line 60
    goto :goto_1

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :goto_2
    const-string v0, "ProgramInformation"

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 70
    move-result v0

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    new-instance v2, Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/dash/manifest/ProgramInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    return-object v2

    .line 79
    :cond_3
    move-object v1, v3

    .line 80
    move-object v0, v4

    .line 81
    move-object v2, v5

    .line 82
    goto :goto_0
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
.end method

.method public parseRangedUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object v2

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0, p3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-wide/16 p2, -0x1

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const-string v0, "-"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    aget-object v0, p1, v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 26
    move-result-wide v0

    .line 27
    array-length v3, p1

    .line 28
    const/4 v4, 0x2

    .line 29
    .line 30
    if-ne v3, v4, :cond_0

    .line 31
    const/4 p2, 0x1

    .line 32
    .line 33
    aget-object p1, p1, p2

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 37
    move-result-wide p1

    .line 38
    sub-long/2addr p1, v0

    .line 39
    .line 40
    const-wide/16 v3, 0x1

    .line 41
    .line 42
    add-long p2, p1, v3

    .line 43
    :cond_0
    :goto_0
    move-wide v5, p2

    .line 44
    move-wide v3, v0

    .line 45
    move-object v1, p0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_1
    const-wide/16 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildRangedUri(Ljava/lang/String;JJ)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 53
    move-result-object p1

    .line 54
    return-object p1
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

.method public parseRepresentation(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIFIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;JJJJJZ)Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;
    .locals 32
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Landroidx/media3/exoplayer/dash/manifest/SegmentBase;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/BaseUrl;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIFII",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase;",
            "JJJJJZ)",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    const-string v2, "id"

    const/4 v3, 0x0

    invoke-interface {v1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 2
    const-string v2, "bandwidth"

    const/4 v4, -0x1

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v15

    .line 3
    const-string v2, "mimeType"

    move-object/from16 v4, p3

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 4
    const-string v2, "codecs"

    move-object/from16 v4, p4

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseString(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 5
    const-string/jumbo v2, "width"

    move/from16 v4, p5

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v18

    .line 6
    const-string v2, "height"

    move/from16 v4, p6

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v19

    move/from16 v2, p7

    .line 7
    invoke-static {v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFrameRate(Lorg/xmlpull/v1/XmlPullParser;F)F

    move-result v20

    .line 8
    const-string v2, "audioSamplingRate"

    move/from16 v4, p9

    invoke-static {v1, v2, v4}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v21

    .line 9
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v5, p13

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v22, v14

    .line 12
    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 v5, p14

    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    move/from16 v23, p8

    move-wide/from16 v9, p22

    move-object/from16 v24, v3

    move/from16 v25, v7

    move-object/from16 v3, p15

    move-wide/from16 v7, p20

    .line 14
    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 15
    const-string v11, "BaseURL"

    invoke-static {v1, v11}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    if-nez v25, :cond_0

    .line 16
    invoke-virtual {v0, v1, v7, v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v7

    const/16 v25, 0x1

    :cond_0
    move-object/from16 v11, p2

    move/from16 v12, p26

    move-object/from16 p7, v2

    .line 17
    invoke-virtual {v0, v1, v11, v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseBaseUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    move-object/from16 v27, v6

    move-wide/from16 v28, v9

    move-object v2, v14

    move/from16 v26, v15

    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v15, p7

    move-object/from16 v23, v3

    move-wide/from16 v24, v7

    :goto_1
    move-object v14, v13

    move-object v13, v4

    goto/16 :goto_6

    :cond_1
    move-object/from16 v11, p2

    move/from16 v12, p26

    move-object/from16 p7, v2

    .line 18
    const-string v2, "AudioChannelConfiguration"

    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 19
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAudioChannelConfiguration(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v2

    move-object v0, v1

    move-object/from16 v23, v3

    move-object/from16 v27, v6

    move-wide/from16 v28, v9

    move/from16 v26, v15

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v15, p7

    move v6, v2

    :goto_2
    move-wide/from16 v24, v7

    move-object v2, v14

    goto :goto_1

    .line 20
    :cond_2
    const-string v2, "SegmentBase"

    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 21
    check-cast v3, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    invoke-virtual {v0, v1, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    move-result-object v2

    move-object v0, v1

    move-object/from16 v27, v6

    move-wide/from16 v28, v9

    move/from16 v26, v15

    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v15, p7

    move-object/from16 v23, v2

    goto :goto_2

    .line 22
    :cond_3
    const-string v2, "SegmentList"

    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 23
    invoke-virtual {v0, v1, v9, v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v9

    .line 24
    move-object v2, v3

    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    move-wide/from16 v11, p24

    move-object/from16 v27, v6

    move-object/from16 p9, v14

    move/from16 v26, v15

    move-object/from16 v15, p7

    move-wide/from16 v5, p18

    move-object v14, v4

    move-wide/from16 v3, p16

    .line 25
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    move-result-object v2

    move-object v0, v14

    move-object v14, v13

    move-object v13, v0

    move-object v0, v1

    move-wide/from16 v28, v9

    :goto_3
    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v23, v2

    move-wide/from16 v24, v7

    move-object/from16 v2, p9

    goto/16 :goto_6

    :cond_4
    move-object/from16 v27, v6

    move-object/from16 p9, v14

    move/from16 v26, v15

    move-object/from16 v15, p7

    move-object v14, v4

    .line 26
    const-string v2, "SegmentTemplate"

    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 27
    invoke-virtual {v0, v1, v9, v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseAvailabilityTimeOffsetUs(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v10

    .line 28
    move-object v2, v3

    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    move-object/from16 v3, p14

    move-wide/from16 v4, p16

    move-wide v8, v7

    move-object/from16 p8, v14

    move-wide/from16 v6, p18

    move-object v14, v13

    move-wide/from16 v12, p24

    .line 29
    invoke-virtual/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    move-result-object v2

    move-object v0, v1

    move-wide v7, v8

    move-object/from16 v13, p8

    move-wide/from16 v28, v10

    goto :goto_3

    :cond_5
    move-object v0, v1

    move-object/from16 p8, v14

    move-object v14, v13

    .line 30
    const-string v1, "ContentProtection"

    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 31
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseContentProtection(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    move-result-object v1

    .line 32
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v2, :cond_6

    .line 33
    move-object/from16 v24, v2

    check-cast v24, Ljava/lang/String;

    .line 34
    :cond_6
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v1, :cond_7

    .line 35
    check-cast v1, Landroidx/media3/common/DrmInitData$SchemeData;

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v13, p8

    :goto_4
    move-object/from16 v2, p9

    :goto_5
    move-wide/from16 v28, v9

    move/from16 v6, v23

    move-object/from16 v30, v24

    move/from16 v31, v25

    move-object/from16 v23, v3

    move-wide/from16 v24, v7

    goto :goto_6

    .line 36
    :cond_8
    const-string v1, "InbandEventStream"

    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 37
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v13, p8

    goto :goto_4

    .line 38
    :cond_9
    const-string v1, "EssentialProperty"

    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 39
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    move-result-object v1

    move-object/from16 v13, p8

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    move-object/from16 v13, p8

    .line 40
    const-string v1, "SupplementalProperty"

    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 41
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseDescriptor(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    move-result-object v1

    move-object/from16 v2, p9

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    move-object/from16 v2, p9

    .line 42
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_5

    .line 43
    :goto_6
    const-string v1, "Representation"

    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    move-object v0, v14

    move-object v14, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, v17

    move/from16 v3, v18

    move/from16 v4, v19

    move/from16 v5, v20

    move/from16 v7, v21

    move-object/from16 v1, v22

    move/from16 v8, v26

    .line 44
    invoke-virtual/range {v0 .. v14}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildFormat(Ljava/lang/String;Ljava/lang/String;IIFIIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Landroidx/media3/common/Format;

    move-result-object v1

    if-eqz v23, :cond_c

    goto :goto_7

    .line 45
    :cond_c
    new-instance v23, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    invoke-direct/range {v23 .. v23}, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;-><init>()V

    .line 46
    :goto_7
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;

    .line 47
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v27, p2

    :goto_8
    const-wide/16 v2, -0x1

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move-wide/from16 p10, v2

    move-object/from16 p8, v13

    move-object/from16 p9, v14

    move-object/from16 p7, v15

    move-object/from16 p6, v16

    move-object/from16 p4, v23

    move-object/from16 p3, v27

    move-object/from16 p5, v30

    invoke-direct/range {p1 .. p11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser$RepresentationInfo;-><init>(Landroidx/media3/common/Format;Ljava/util/List;Landroidx/media3/exoplayer/dash/manifest/SegmentBase;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;J)V

    return-object v0

    :cond_e
    move-object v1, v2

    move-object/from16 v0, v30

    move-object/from16 v5, p14

    move-object v4, v13

    move-object v13, v14

    move-object v2, v15

    move-object/from16 v3, v23

    move-wide/from16 v7, v24

    move/from16 v15, v26

    move-wide/from16 v9, v28

    move/from16 v25, v31

    move-object/from16 v24, v0

    move-object v14, v1

    move/from16 v23, v6

    move-object/from16 v6, v27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_0
.end method

.method public parseRoleFlagsFromAccessibilityDescriptors(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v0, v2, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 15
    .line 16
    iget-object v3, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v4, "urn:mpeg:dash:role:2011"

    .line 20
    .line 21
    .line 22
    invoke-static {v4, v3}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 23
    move-result v3

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromDashRoleScheme(Ljava/lang/String;)I

    .line 31
    move-result v2

    .line 32
    :goto_1
    or-int/2addr v1, v2

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_0
    const-string/jumbo v3, "urn:tva:metadata:cs:AudioPurposeCS:2007"

    .line 37
    .line 38
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseTvaAudioPurposeCsValue(Ljava/lang/String;)I

    .line 50
    move-result v2

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_1
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return v1
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

.method public parseRoleFlagsFromDashRoleScheme(Ljava/lang/String;)I
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    return v4

    .line 10
    :cond_0
    const/4 v5, -0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    move-result v6

    .line 15
    .line 16
    .line 17
    sparse-switch v6, :sswitch_data_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    .line 22
    :sswitch_0
    const-string/jumbo v6, "supplementary"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result p1

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_1
    const/16 v5, 0xc

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :sswitch_1
    const-string v6, "emergency"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_2
    const/16 v5, 0xb

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :sswitch_2
    const-string v6, "commentary"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result p1

    .line 55
    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_3
    const/16 v5, 0xa

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :sswitch_3
    const-string v6, "caption"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_4
    const/16 v5, 0x9

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    .line 79
    :sswitch_4
    const-string/jumbo v6, "sign"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    move-result p1

    .line 84
    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    :cond_5
    move v5, v0

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :sswitch_5
    const-string v6, "main"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    move-result p1

    .line 97
    .line 98
    if-nez p1, :cond_6

    .line 99
    goto :goto_0

    .line 100
    :cond_6
    const/4 v5, 0x7

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :sswitch_6
    const-string v6, "dub"

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    move-result p1

    .line 108
    .line 109
    if-nez p1, :cond_7

    .line 110
    goto :goto_0

    .line 111
    :cond_7
    const/4 v5, 0x6

    .line 112
    goto :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v6, "forced-subtitle"

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    move-result p1

    .line 119
    .line 120
    if-nez p1, :cond_8

    .line 121
    goto :goto_0

    .line 122
    :cond_8
    const/4 v5, 0x5

    .line 123
    goto :goto_0

    .line 124
    .line 125
    :sswitch_8
    const-string v6, "alternate"

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    move-result p1

    .line 130
    .line 131
    if-nez p1, :cond_9

    .line 132
    goto :goto_0

    .line 133
    :cond_9
    move v5, v1

    .line 134
    goto :goto_0

    .line 135
    .line 136
    :sswitch_9
    const-string v6, "forced_subtitle"

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    move-result p1

    .line 141
    .line 142
    if-nez p1, :cond_a

    .line 143
    goto :goto_0

    .line 144
    :cond_a
    const/4 v5, 0x3

    .line 145
    goto :goto_0

    .line 146
    .line 147
    :sswitch_a
    const-string v6, "enhanced-audio-intelligibility"

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    move-result p1

    .line 152
    .line 153
    if-nez p1, :cond_b

    .line 154
    goto :goto_0

    .line 155
    :cond_b
    move v5, v2

    .line 156
    goto :goto_0

    .line 157
    .line 158
    :sswitch_b
    const-string v6, "description"

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    move-result p1

    .line 163
    .line 164
    if-nez p1, :cond_c

    .line 165
    goto :goto_0

    .line 166
    :cond_c
    move v5, v3

    .line 167
    goto :goto_0

    .line 168
    .line 169
    .line 170
    :sswitch_c
    const-string/jumbo v6, "subtitle"

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    move-result p1

    .line 175
    .line 176
    if-nez p1, :cond_d

    .line 177
    goto :goto_0

    .line 178
    :cond_d
    move v5, v4

    .line 179
    .line 180
    .line 181
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 182
    return v4

    .line 183
    :pswitch_0
    return v1

    .line 184
    .line 185
    :pswitch_1
    const/16 p1, 0x20

    .line 186
    return p1

    .line 187
    :pswitch_2
    return v0

    .line 188
    .line 189
    :pswitch_3
    const/16 p1, 0x40

    .line 190
    return p1

    .line 191
    .line 192
    :pswitch_4
    const/16 p1, 0x100

    .line 193
    return p1

    .line 194
    :pswitch_5
    return v3

    .line 195
    .line 196
    :pswitch_6
    const/16 p1, 0x10

    .line 197
    return p1

    .line 198
    :pswitch_7
    return v2

    .line 199
    .line 200
    :pswitch_8
    const/16 p1, 0x800

    .line 201
    return p1

    .line 202
    .line 203
    :pswitch_9
    const/16 p1, 0x200

    .line 204
    return p1

    .line 205
    .line 206
    :pswitch_a
    const/16 p1, 0x80

    .line 207
    return p1

    .line 208
    nop

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    :sswitch_data_0
    .sparse-switch
        -0x7ad0b3e8 -> :sswitch_c
        -0x66ca7c04 -> :sswitch_b
        -0x5e3a5c50 -> :sswitch_a
        -0x5dde3142 -> :sswitch_9
        -0x53ecbf86 -> :sswitch_8
        -0x533bdf74 -> :sswitch_7
        0x185f1 -> :sswitch_6
        0x3305b9 -> :sswitch_5
        0x35ddbd -> :sswitch_4
        0x20ef99e6 -> :sswitch_3
        0x3597fba9 -> :sswitch_2
        0x6118c591 -> :sswitch_1
        0x6e96bb0f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public parseRoleFlagsFromProperties(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 15
    .line 16
    const-string v3, "http://dashif.org/guidelines/trickmode"

    .line 17
    .line 18
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/16 v1, 0x4000

    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1
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

.method public parseRoleFlagsFromRoleDescriptors(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 15
    .line 16
    iget-object v3, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v4, "urn:mpeg:dash:role:2011"

    .line 20
    .line 21
    .line 22
    invoke-static {v4, v3}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 23
    move-result v3

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRoleFlagsFromDashRoleScheme(Ljava/lang/String;)I

    .line 31
    move-result v2

    .line 32
    or-int/2addr v1, v2

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1
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

.method public parseSegmentBase(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
    .locals 17
    .param p2    # Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-wide v4, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    .line 14
    .line 15
    :goto_0
    const-string/jumbo v6, "timescale"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v6, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 19
    move-result-wide v9

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-wide v6, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-wide v6, v4

    .line 28
    .line 29
    .line 30
    :goto_1
    const-string/jumbo v8, "presentationTimeOffset"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v8, v6, v7}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 34
    move-result-wide v11

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-wide v6, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexStart:J

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-wide v6, v4

    .line 41
    .line 42
    :goto_2
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-wide v4, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;->indexLength:J

    .line 45
    .line 46
    :cond_3
    const-string v8, "indexRange"

    .line 47
    const/4 v13, 0x0

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v13, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object v8

    .line 52
    .line 53
    if-eqz v8, :cond_4

    .line 54
    .line 55
    const-string v4, "-"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    const/4 v5, 0x0

    .line 61
    .line 62
    aget-object v5, v4, v5

    .line 63
    .line 64
    .line 65
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 66
    move-result-wide v6

    .line 67
    const/4 v5, 0x1

    .line 68
    .line 69
    aget-object v4, v4, v5

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 73
    move-result-wide v4

    .line 74
    sub-long/2addr v4, v6

    .line 75
    add-long/2addr v4, v2

    .line 76
    :cond_4
    move-wide v15, v4

    .line 77
    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    iget-object v13, v1, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 81
    .line 82
    .line 83
    :cond_5
    :goto_3
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 84
    .line 85
    const-string v1, "Initialization"

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 95
    move-result-object v13

    .line 96
    :goto_4
    move-object v8, v13

    .line 97
    goto :goto_5

    .line 98
    .line 99
    .line 100
    :cond_6
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 101
    goto :goto_4

    .line 102
    .line 103
    :goto_5
    const-string v1, "SegmentBase"

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-eqz v1, :cond_7

    .line 110
    move-wide v13, v6

    .line 111
    .line 112
    move-object/from16 v7, p0

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v7 .. v16}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSingleSegmentBase(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SingleSegmentBase;

    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :cond_7
    move-object v13, v8

    .line 119
    goto :goto_3
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

.method public parseSegmentList(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;
    .locals 24
    .param p2    # Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    move-object/from16 v6, p2

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    if-eqz v6, :cond_0

    .line 9
    .line 10
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    .line 14
    .line 15
    :goto_0
    const-string/jumbo v0, "timescale"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 19
    move-result-wide v8

    .line 20
    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_1
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    .line 29
    :goto_1
    const-string/jumbo v0, "presentationTimeOffset"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 33
    move-result-wide v10

    .line 34
    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->duration:J

    .line 38
    goto :goto_2

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    :cond_2
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    :goto_2
    const-string v0, "duration"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 49
    move-result-wide v14

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    iget-wide v2, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->startNumber:J

    .line 54
    .line 55
    .line 56
    :cond_3
    const-string/jumbo v0, "startNumber"

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 60
    move-result-wide v12

    .line 61
    .line 62
    .line 63
    invoke-static/range {p7 .. p10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->getFinalAvailabilityTimeOffset(JJ)J

    .line 64
    move-result-wide v17

    .line 65
    const/4 v0, 0x0

    .line 66
    move-object v7, v0

    .line 67
    .line 68
    move-object/from16 v16, v7

    .line 69
    .line 70
    move-object/from16 v19, v16

    .line 71
    .line 72
    .line 73
    :goto_3
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 74
    .line 75
    const-string v0, "Initialization"

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 79
    move-result v0

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    move-object/from16 v16, v0

    .line 88
    move-wide v2, v8

    .line 89
    goto :goto_4

    .line 90
    .line 91
    :cond_4
    const-string v0, "SegmentTimeline"

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 95
    move-result v0

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    move-object/from16 v0, p0

    .line 100
    .line 101
    move-wide/from16 v4, p5

    .line 102
    move-wide v2, v8

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTimeline(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/List;

    .line 106
    move-result-object v8

    .line 107
    .line 108
    move-object/from16 v19, v8

    .line 109
    goto :goto_4

    .line 110
    :cond_5
    move-wide v2, v8

    .line 111
    .line 112
    const-string v0, "SegmentURL"

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 116
    move-result v0

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    if-nez v7, :cond_6

    .line 121
    .line 122
    new-instance v7, Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentUrl(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    goto :goto_4

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-static {v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 137
    .line 138
    :goto_4
    const-string v0, "SegmentList"

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 142
    move-result v0

    .line 143
    .line 144
    if-eqz v0, :cond_c

    .line 145
    .line 146
    if-eqz v6, :cond_b

    .line 147
    .line 148
    if-eqz v16, :cond_8

    .line 149
    goto :goto_5

    .line 150
    .line 151
    :cond_8
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 152
    .line 153
    move-object/from16 v16, v0

    .line 154
    .line 155
    :goto_5
    if-eqz v19, :cond_9

    .line 156
    goto :goto_6

    .line 157
    .line 158
    :cond_9
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->segmentTimeline:Ljava/util/List;

    .line 159
    .line 160
    move-object/from16 v19, v0

    .line 161
    .line 162
    :goto_6
    if-eqz v7, :cond_a

    .line 163
    goto :goto_7

    .line 164
    .line 165
    :cond_a
    iget-object v7, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;->mediaSegments:Ljava/util/List;

    .line 166
    .line 167
    :cond_b
    :goto_7
    move-object/from16 v6, v19

    .line 168
    .line 169
    move-object/from16 v19, v7

    .line 170
    .line 171
    move-object/from16 v7, v16

    .line 172
    .line 173
    move-object/from16 v16, v6

    .line 174
    .line 175
    move-object/from16 v6, p0

    .line 176
    .line 177
    move-wide/from16 v22, p3

    .line 178
    .line 179
    move-wide/from16 v20, p11

    .line 180
    move-wide v8, v2

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v6 .. v23}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSegmentList(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJLjava/util/List;JLjava/util/List;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentList;

    .line 184
    move-result-object v0

    .line 185
    return-object v0

    .line 186
    :cond_c
    move-wide v8, v2

    .line 187
    goto :goto_3
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
.end method

.method public parseSegmentTemplate(Lorg/xmlpull/v1/XmlPullParser;Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;Ljava/util/List;JJJJJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;
    .locals 22
    .param p2    # Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;JJJJJ)",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v6, p2

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    .line 10
    if-eqz v6, :cond_0

    .line 11
    .line 12
    iget-wide v4, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->timescale:J

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v4, v2

    .line 15
    .line 16
    .line 17
    :goto_0
    const-string/jumbo v7, "timescale"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v7, v4, v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 21
    move-result-wide v4

    .line 22
    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    iget-wide v7, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->presentationTimeOffset:J

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    const-wide/16 v7, 0x0

    .line 29
    .line 30
    .line 31
    :goto_1
    const-string/jumbo v9, "presentationTimeOffset"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v9, v7, v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 35
    move-result-wide v7

    .line 36
    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    iget-wide v9, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->duration:J

    .line 40
    goto :goto_2

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :cond_2
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    :goto_2
    const-string v11, "duration"

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v11, v9, v10}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 51
    move-result-wide v11

    .line 52
    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    iget-wide v2, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->startNumber:J

    .line 56
    .line 57
    .line 58
    :cond_3
    const-string/jumbo v9, "startNumber"

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v9, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 62
    move-result-wide v9

    .line 63
    .line 64
    .line 65
    invoke-static/range {p3 .. p3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLastSegmentNumberSupplementalProperty(Ljava/util/List;)J

    .line 66
    move-result-wide v13

    .line 67
    .line 68
    .line 69
    invoke-static/range {p8 .. p11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->getFinalAvailabilityTimeOffset(JJ)J

    .line 70
    move-result-wide v15

    .line 71
    .line 72
    if-eqz v6, :cond_4

    .line 73
    .line 74
    iget-object v3, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;->mediaTemplate:Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    const/4 v3, 0x0

    .line 77
    .line 78
    :goto_3
    const-string v2, "media"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseUrlTemplate(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 82
    move-result-object v17

    .line 83
    .line 84
    if-eqz v6, :cond_5

    .line 85
    .line 86
    iget-object v2, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;->initializationTemplate:Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 87
    goto :goto_4

    .line 88
    :cond_5
    const/4 v2, 0x0

    .line 89
    .line 90
    :goto_4
    const-string v3, "initialization"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1, v3, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseUrlTemplate(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 94
    move-result-object v18

    .line 95
    .line 96
    const/16 v19, 0x0

    .line 97
    .line 98
    const/16 v20, 0x0

    .line 99
    .line 100
    .line 101
    :goto_5
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 102
    .line 103
    const-string v2, "Initialization"

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 107
    move-result v2

    .line 108
    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInitialization(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    move-object/from16 v19, v2

    .line 116
    move-wide v2, v4

    .line 117
    goto :goto_6

    .line 118
    .line 119
    :cond_6
    const-string v2, "SegmentTimeline"

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v2}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 123
    move-result v2

    .line 124
    .line 125
    if-eqz v2, :cond_7

    .line 126
    move-wide v2, v4

    .line 127
    .line 128
    move-wide/from16 v4, p6

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSegmentTimeline(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/List;

    .line 132
    move-result-object v20

    .line 133
    goto :goto_6

    .line 134
    :cond_7
    move-wide v2, v4

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 138
    .line 139
    :goto_6
    const-string v0, "SegmentTemplate"

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v0}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 143
    move-result v0

    .line 144
    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    if-eqz v6, :cond_a

    .line 148
    .line 149
    if-eqz v19, :cond_8

    .line 150
    goto :goto_7

    .line 151
    .line 152
    :cond_8
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase;->initialization:Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 153
    .line 154
    move-object/from16 v19, v0

    .line 155
    .line 156
    :goto_7
    if-eqz v20, :cond_9

    .line 157
    goto :goto_8

    .line 158
    .line 159
    :cond_9
    iget-object v0, v6, Landroidx/media3/exoplayer/dash/manifest/SegmentBase$MultiSegmentBase;->segmentTimeline:Ljava/util/List;

    .line 160
    .line 161
    move-object/from16 v20, v0

    .line 162
    .line 163
    :cond_a
    :goto_8
    move-object/from16 v1, p0

    .line 164
    move-wide v3, v2

    .line 165
    move-wide v5, v7

    .line 166
    move-wide v7, v9

    .line 167
    move-wide v9, v13

    .line 168
    move-wide v14, v15

    .line 169
    .line 170
    move-object/from16 v16, v18

    .line 171
    .line 172
    move-object/from16 v2, v19

    .line 173
    .line 174
    move-object/from16 v13, v20

    .line 175
    .line 176
    move-wide/from16 v20, p4

    .line 177
    .line 178
    move-wide/from16 v18, p12

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v1 .. v21}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildSegmentTemplate(Landroidx/media3/exoplayer/dash/manifest/RangedUri;JJJJJLjava/util/List;JLandroidx/media3/exoplayer/dash/manifest/UrlTemplate;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;JJ)Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTemplate;

    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :cond_b
    move-wide v4, v7

    .line 185
    move-wide v7, v9

    .line 186
    move-wide v9, v13

    .line 187
    move-wide v14, v15

    .line 188
    .line 189
    move-object/from16 v0, p0

    .line 190
    move-wide v15, v14

    .line 191
    move-wide v13, v9

    .line 192
    move-wide v9, v7

    .line 193
    move-wide v7, v4

    .line 194
    move-wide v4, v2

    .line 195
    goto :goto_5
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

.method public parseSegmentTimeline(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "JJ)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/SegmentBase$SegmentTimelineElement;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    const/4 v12, 0x0

    .line 16
    move-wide v3, v2

    .line 17
    move-wide v5, v10

    .line 18
    move v2, v12

    .line 19
    move v7, v2

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 23
    .line 24
    const-string v8, "S"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v8}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 28
    move-result v8

    .line 29
    .line 30
    if-eqz v8, :cond_3

    .line 31
    .line 32
    .line 33
    const-string/jumbo v8, "t"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v8, v10, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 37
    move-result-wide v8

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    move-object v2, v1

    .line 41
    .line 42
    move-object/from16 v1, p0

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->addSegmentTimelineElementsToList(Ljava/util/List;JJIJ)J

    .line 46
    move-result-wide v3

    .line 47
    move-object v1, v2

    .line 48
    .line 49
    :cond_1
    cmp-long v2, v8, v10

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    move-wide v3, v8

    .line 53
    .line 54
    :cond_2
    const-string v2, "d"

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2, v10, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 58
    move-result-wide v5

    .line 59
    .line 60
    .line 61
    const-string/jumbo v2, "r"

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v2, v12}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseInt(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    .line 65
    move-result v7

    .line 66
    const/4 v2, 0x1

    .line 67
    goto :goto_0

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->maybeSkipTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 71
    .line 72
    :goto_0
    const-string v8, "SegmentTimeline"

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v8}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 76
    move-result v8

    .line 77
    .line 78
    if-eqz v8, :cond_0

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    const-wide/16 v17, 0x3e8

    .line 83
    .line 84
    move-wide/from16 v15, p2

    .line 85
    .line 86
    move-wide/from16 v13, p4

    .line 87
    .line 88
    .line 89
    invoke-static/range {v13 .. v18}, Landroidx/media3/common/util/Util;->scaleLargeTimestamp(JJJ)J

    .line 90
    move-result-wide v8

    .line 91
    .line 92
    move-object/from16 v0, p0

    .line 93
    move-wide v2, v3

    .line 94
    move-wide v4, v5

    .line 95
    move v6, v7

    .line 96
    move-wide v7, v8

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->addSegmentTimelineElementsToList(Ljava/util/List;JJIJ)J

    .line 100
    :cond_4
    return-object v1
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
.end method

.method public parseSegmentUrl(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;
    .locals 2

    .line 1
    .line 2
    const-string v0, "media"

    .line 3
    .line 4
    const-string v1, "mediaRange"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, v0, v1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseRangedUrl(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public parseSelectionFlagsFromDashRoleScheme(Ljava/lang/String;)I
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    const-string v1, "forced_subtitle"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    const-string v1, "forced-subtitle"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    move-result p1

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p1, 0x2

    .line 23
    return p1
.end method

.method public parseSelectionFlagsFromRoleDescriptors(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 15
    .line 16
    iget-object v3, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v4, "urn:mpeg:dash:role:2011"

    .line 20
    .line 21
    .line 22
    invoke-static {v4, v3}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 23
    move-result v3

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseSelectionFlagsFromDashRoleScheme(Ljava/lang/String;)I

    .line 31
    move-result v2

    .line 32
    or-int/2addr v1, v2

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1
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

.method public parseServiceDescription(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    const v3, -0x800001

    .line 11
    move-wide v4, v1

    .line 12
    move-wide v6, v4

    .line 13
    move-wide v8, v6

    .line 14
    move v10, v3

    .line 15
    move v11, v10

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 19
    .line 20
    const-string v12, "Latency"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v12}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 24
    move-result v12

    .line 25
    .line 26
    const-string v13, "max"

    .line 27
    .line 28
    const-string v14, "min"

    .line 29
    .line 30
    if-eqz v12, :cond_1

    .line 31
    .line 32
    .line 33
    const-string/jumbo v4, "target"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v4, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 37
    move-result-wide v4

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v14, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 41
    move-result-wide v6

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v13, v1, v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseLong(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 45
    move-result-wide v8

    .line 46
    :cond_0
    :goto_1
    move-wide v13, v4

    .line 47
    move-wide v15, v6

    .line 48
    .line 49
    move-wide/from16 v17, v8

    .line 50
    .line 51
    move/from16 v19, v10

    .line 52
    .line 53
    move/from16 v20, v11

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :cond_1
    const-string v12, "PlaybackRate"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v12}, Landroidx/media3/common/util/XmlPullParserUtil;->isStartTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 60
    move-result v12

    .line 61
    .line 62
    if-eqz v12, :cond_0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v14, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFloat(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;F)F

    .line 66
    move-result v10

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v13, v3}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->parseFloat(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;F)F

    .line 70
    move-result v11

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :goto_2
    const-string v4, "ServiceDescription"

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v4}, Landroidx/media3/common/util/XmlPullParserUtil;->isEndTag(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 77
    move-result v4

    .line 78
    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    new-instance v12, Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;

    .line 82
    .line 83
    .line 84
    invoke-direct/range {v12 .. v20}, Landroidx/media3/exoplayer/dash/manifest/ServiceDescriptionElement;-><init>(JJJFF)V

    .line 85
    return-object v12

    .line 86
    :cond_2
    move-wide v4, v13

    .line 87
    move-wide v6, v15

    .line 88
    .line 89
    move-wide/from16 v8, v17

    .line 90
    .line 91
    move/from16 v10, v19

    .line 92
    .line 93
    move/from16 v11, v20

    .line 94
    goto :goto_0
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
.end method

.method public parseTileCountFromProperties(Ljava/util/List;)Landroid/util/Pair;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/dash/manifest/Descriptor;",
            ">;)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v2

    .line 7
    .line 8
    if-ge v1, v2, :cond_3

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;

    .line 15
    .line 16
    iget-object v3, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 17
    .line 18
    const-string v4, "http://dashif.org/thumbnail_tile"

    .line 19
    .line 20
    .line 21
    invoke-static {v4, v3}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 22
    move-result v3

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    const-string v3, "http://dashif.org/guidelines/thumbnail_tile"

    .line 27
    .line 28
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->schemeIdUri:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    move-result v3

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    iget-object v2, v2, Landroidx/media3/exoplayer/dash/manifest/Descriptor;->value:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    .line 41
    const-string/jumbo v3, "x"

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    array-length v3, v2

    .line 47
    const/4 v4, 0x2

    .line 48
    .line 49
    if-eq v3, v4, :cond_1

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_1
    :try_start_0
    aget-object v3, v2, v0

    .line 53
    .line 54
    .line 55
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 56
    move-result v3

    .line 57
    const/4 v4, 0x1

    .line 58
    .line 59
    aget-object v2, v2, v4

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 63
    move-result v2

    .line 64
    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 75
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    return-object p1

    .line 77
    .line 78
    :catch_0
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    const/4 p1, 0x0

    .line 81
    return-object p1
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
.end method

.method public parseTvaAudioPurposeCsValue(Ljava/lang/String;)I
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    return v2

    .line 7
    :cond_0
    const/4 v3, -0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v4

    .line 12
    .line 13
    .line 14
    packed-switch v4, :pswitch_data_0

    .line 15
    :pswitch_0
    goto :goto_0

    .line 16
    .line 17
    :pswitch_1
    const-string v4, "6"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v3, v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :pswitch_2
    const-string v4, "4"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v3, 0x3

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :pswitch_3
    const-string v4, "3"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    if-nez p1, :cond_3

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const/4 v3, 0x2

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :pswitch_4
    const-string v4, "2"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result p1

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    goto :goto_0

    .line 58
    :cond_4
    move v3, v1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :pswitch_5
    const-string v4, "1"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result p1

    .line 66
    .line 67
    if-nez p1, :cond_5

    .line 68
    goto :goto_0

    .line 69
    :cond_5
    move v3, v2

    .line 70
    .line 71
    .line 72
    :goto_0
    packed-switch v3, :pswitch_data_1

    .line 73
    return v2

    .line 74
    :pswitch_6
    return v1

    .line 75
    .line 76
    :pswitch_7
    const/16 p1, 0x8

    .line 77
    return p1

    .line 78
    :pswitch_8
    return v0

    .line 79
    .line 80
    :pswitch_9
    const/16 p1, 0x800

    .line 81
    return p1

    .line 82
    .line 83
    :pswitch_a
    const/16 p1, 0x200

    .line 84
    return p1

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
    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
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

.method public parseUrlTemplate(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;
    .locals 1
    .param p3    # Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;->compile(Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/UrlTemplate;

    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    return-object p3
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
.end method

.method public parseUtcTiming(Lorg/xmlpull/v1/XmlPullParser;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "schemeIdUri"

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "value"

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;->buildUtcTimingElement(Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/UtcTimingElement;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
.end method
