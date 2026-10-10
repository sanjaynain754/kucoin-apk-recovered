.class final Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;
.super Ljava/lang/Object;
.source "SessionDescriptionParser.java"


# static fields
.field private static final ATTRIBUTE_PATTERN:Ljava/util/regex/Pattern;

.field private static final ATTRIBUTE_TYPE:Ljava/lang/String; = "a"

.field private static final BANDWIDTH_TYPE:Ljava/lang/String; = "b"

.field private static final CONNECTION_TYPE:Ljava/lang/String; = "c"

.field private static final EMAIL_TYPE:Ljava/lang/String; = "e"

.field private static final INFORMATION_TYPE:Ljava/lang/String; = "i"

.field private static final KEY_TYPE:Ljava/lang/String; = "k"

.field private static final MEDIA_DESCRIPTION_PATTERN:Ljava/util/regex/Pattern;

.field private static final MEDIA_TYPE:Ljava/lang/String; = "m"

.field private static final ORIGIN_TYPE:Ljava/lang/String; = "o"

.field private static final PHONE_NUMBER_TYPE:Ljava/lang/String; = "p"

.field private static final REPEAT_TYPE:Ljava/lang/String; = "r"

.field private static final SDP_LINE_PATTERN:Ljava/util/regex/Pattern;

.field private static final SDP_LINE_WITH_EMPTY_VALUE_PATTERN:Ljava/util/regex/Pattern;

.field private static final SESSION_TYPE:Ljava/lang/String; = "s"

.field private static final TAG:Ljava/lang/String; = "SDPParser"

.field private static final TIMING_TYPE:Ljava/lang/String; = "t"

.field private static final URI_TYPE:Ljava/lang/String; = "u"

.field private static final VERSION_TYPE:Ljava/lang/String; = "v"

.field private static final ZONE_TYPE:Ljava/lang/String; = "z"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "([a-z])=\\s?(.+)"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->SDP_LINE_PATTERN:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "^([a-z])=$"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->SDP_LINE_WITH_EMPTY_VALUE_PATTERN:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    const-string v0, "([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?"

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sput-object v0, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->ATTRIBUTE_PATTERN:Ljava/util/regex/Pattern;

    .line 25
    .line 26
    const-string v0, "(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)"

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->MEDIA_DESCRIPTION_PATTERN:Ljava/util/regex/Pattern;

    .line 33
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method private static addMediaDescriptionToSession(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;->build()Landroidx/media3/exoplayer/rtsp/MediaDescription;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->addMediaDescription(Landroidx/media3/exoplayer/rtsp/MediaDescription;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p0

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 14
    move-result-object p0

    .line 15
    throw p0
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

.method public static parse(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->splitRtspMessageBody(Ljava/lang/String;)[Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    move-object v5, v2

    .line 14
    move v4, v3

    .line 15
    move v6, v4

    .line 16
    .line 17
    :goto_0
    if-ge v4, v1, :cond_13

    .line 18
    .line 19
    aget-object v7, p0, v4

    .line 20
    .line 21
    const-string v8, ""

    .line 22
    .line 23
    .line 24
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    move-result v8

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    sget-object v8, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->SDP_LINE_PATTERN:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v8, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 35
    move-result-object v8

    .line 36
    .line 37
    .line 38
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 39
    move-result v9

    .line 40
    .line 41
    const-string v10, "i"

    .line 42
    const/4 v11, 0x1

    .line 43
    .line 44
    if-nez v9, :cond_2

    .line 45
    .line 46
    sget-object v8, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->SDP_LINE_WITH_EMPTY_VALUE_PATTERN:Ljava/util/regex/Pattern;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 50
    move-result-object v8

    .line 51
    .line 52
    .line 53
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 54
    move-result v9

    .line 55
    .line 56
    if-eqz v9, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 60
    move-result-object v8

    .line 61
    .line 62
    .line 63
    invoke-static {v8, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v8

    .line 65
    .line 66
    if-eqz v8, :cond_1

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    const-string v0, "Malformed SDP line: "

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object p0

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v2}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 89
    move-result-object p0

    .line 90
    throw p0

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {v8, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 94
    move-result-object v9

    .line 95
    .line 96
    .line 97
    invoke-static {v9}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    move-result-object v9

    .line 99
    .line 100
    check-cast v9, Ljava/lang/String;

    .line 101
    const/4 v12, 0x2

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 105
    move-result-object v8

    .line 106
    .line 107
    .line 108
    invoke-static {v8}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v8

    .line 110
    .line 111
    check-cast v8, Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 115
    move-result v13

    .line 116
    .line 117
    .line 118
    packed-switch v13, :pswitch_data_0

    .line 119
    .line 120
    :pswitch_0
    goto/16 :goto_1

    .line 121
    .line 122
    .line 123
    :pswitch_1
    const-string/jumbo v10, "z"

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    move-result v9

    .line 128
    .line 129
    if-eqz v9, :cond_3

    .line 130
    .line 131
    const/16 v9, 0xe

    .line 132
    .line 133
    goto/16 :goto_2

    .line 134
    .line 135
    .line 136
    :pswitch_2
    const-string/jumbo v10, "v"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    move-result v9

    .line 141
    .line 142
    if-eqz v9, :cond_3

    .line 143
    move v9, v3

    .line 144
    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    .line 148
    :pswitch_3
    const-string/jumbo v10, "u"

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    move-result v9

    .line 153
    .line 154
    if-eqz v9, :cond_3

    .line 155
    const/4 v9, 0x4

    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    .line 160
    :pswitch_4
    const-string/jumbo v10, "t"

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    move-result v9

    .line 165
    .line 166
    if-eqz v9, :cond_3

    .line 167
    .line 168
    const/16 v9, 0x9

    .line 169
    .line 170
    goto/16 :goto_2

    .line 171
    .line 172
    .line 173
    :pswitch_5
    const-string/jumbo v10, "s"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    move-result v9

    .line 178
    .line 179
    if-eqz v9, :cond_3

    .line 180
    move v9, v12

    .line 181
    .line 182
    goto/16 :goto_2

    .line 183
    .line 184
    .line 185
    :pswitch_6
    const-string/jumbo v10, "r"

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    move-result v9

    .line 190
    .line 191
    if-eqz v9, :cond_3

    .line 192
    .line 193
    const/16 v9, 0xd

    .line 194
    goto :goto_2

    .line 195
    .line 196
    .line 197
    :pswitch_7
    const-string/jumbo v10, "p"

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    move-result v9

    .line 202
    .line 203
    if-eqz v9, :cond_3

    .line 204
    const/4 v9, 0x6

    .line 205
    goto :goto_2

    .line 206
    .line 207
    :pswitch_8
    const-string v10, "o"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    move-result v9

    .line 212
    .line 213
    if-eqz v9, :cond_3

    .line 214
    move v9, v11

    .line 215
    goto :goto_2

    .line 216
    .line 217
    :pswitch_9
    const-string v10, "m"

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    move-result v9

    .line 222
    .line 223
    if-eqz v9, :cond_3

    .line 224
    .line 225
    const/16 v9, 0xc

    .line 226
    goto :goto_2

    .line 227
    .line 228
    :pswitch_a
    const-string v10, "k"

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    move-result v9

    .line 233
    .line 234
    if-eqz v9, :cond_3

    .line 235
    .line 236
    const/16 v9, 0xa

    .line 237
    goto :goto_2

    .line 238
    .line 239
    .line 240
    :pswitch_b
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    move-result v9

    .line 242
    .line 243
    if-eqz v9, :cond_3

    .line 244
    const/4 v9, 0x3

    .line 245
    goto :goto_2

    .line 246
    .line 247
    :pswitch_c
    const-string v10, "e"

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    move-result v9

    .line 252
    .line 253
    if-eqz v9, :cond_3

    .line 254
    const/4 v9, 0x5

    .line 255
    goto :goto_2

    .line 256
    .line 257
    :pswitch_d
    const-string v10, "c"

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    move-result v9

    .line 262
    .line 263
    if-eqz v9, :cond_3

    .line 264
    const/4 v9, 0x7

    .line 265
    goto :goto_2

    .line 266
    .line 267
    :pswitch_e
    const-string v10, "b"

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    move-result v9

    .line 272
    .line 273
    if-eqz v9, :cond_3

    .line 274
    .line 275
    const/16 v9, 0x8

    .line 276
    goto :goto_2

    .line 277
    .line 278
    :pswitch_f
    const-string v10, "a"

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    move-result v9

    .line 283
    .line 284
    if-eqz v9, :cond_3

    .line 285
    .line 286
    const/16 v9, 0xb

    .line 287
    goto :goto_2

    .line 288
    :cond_3
    :goto_1
    const/4 v9, -0x1

    .line 289
    .line 290
    .line 291
    :goto_2
    packed-switch v9, :pswitch_data_1

    .line 292
    .line 293
    goto/16 :goto_4

    .line 294
    .line 295
    :pswitch_10
    if-eqz v5, :cond_4

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v5}, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->addMediaDescriptionToSession(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;)V

    .line 299
    .line 300
    .line 301
    :cond_4
    invoke-static {v8}, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->parseMediaDescriptionLine(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 302
    move-result-object v5

    .line 303
    .line 304
    if-nez v5, :cond_5

    .line 305
    move v6, v11

    .line 306
    .line 307
    goto/16 :goto_4

    .line 308
    :cond_5
    move v6, v3

    .line 309
    .line 310
    goto/16 :goto_4

    .line 311
    .line 312
    :pswitch_11
    if-eqz v6, :cond_6

    .line 313
    .line 314
    goto/16 :goto_4

    .line 315
    .line 316
    :cond_6
    sget-object v9, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->ATTRIBUTE_PATTERN:Ljava/util/regex/Pattern;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v9, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 320
    move-result-object v8

    .line 321
    .line 322
    .line 323
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 324
    move-result v9

    .line 325
    .line 326
    if-eqz v9, :cond_8

    .line 327
    .line 328
    .line 329
    invoke-virtual {v8, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 330
    move-result-object v7

    .line 331
    .line 332
    .line 333
    invoke-static {v7}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    move-result-object v7

    .line 335
    .line 336
    check-cast v7, Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 340
    move-result-object v8

    .line 341
    .line 342
    .line 343
    invoke-static {v8}, Lcom/google/common/base/Strings;->nullToEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    move-result-object v8

    .line 345
    .line 346
    if-nez v5, :cond_7

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v7, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->addAttribute(Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 350
    .line 351
    goto/16 :goto_4

    .line 352
    .line 353
    .line 354
    :cond_7
    invoke-virtual {v5, v7, v8}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;->addAttribute(Ljava/lang/String;Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 355
    .line 356
    goto/16 :goto_4

    .line 357
    .line 358
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    const-string v0, "Malformed Attribute line: "

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    move-result-object p0

    .line 374
    .line 375
    .line 376
    invoke-static {p0, v2}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 377
    move-result-object p0

    .line 378
    throw p0

    .line 379
    .line 380
    :pswitch_12
    if-eqz v6, :cond_9

    .line 381
    .line 382
    goto/16 :goto_4

    .line 383
    .line 384
    :cond_9
    if-nez v5, :cond_a

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setKey(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 388
    .line 389
    goto/16 :goto_4

    .line 390
    .line 391
    .line 392
    :cond_a
    invoke-virtual {v5, v8}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;->setKey(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 393
    .line 394
    goto/16 :goto_4

    .line 395
    .line 396
    .line 397
    :pswitch_13
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setTiming(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 398
    .line 399
    goto/16 :goto_4

    .line 400
    .line 401
    :pswitch_14
    if-eqz v6, :cond_b

    .line 402
    .line 403
    goto/16 :goto_4

    .line 404
    .line 405
    :cond_b
    const-string v7, ":\\s?"

    .line 406
    .line 407
    .line 408
    invoke-static {v8, v7}, Landroidx/media3/common/util/Util;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 409
    move-result-object v7

    .line 410
    array-length v8, v7

    .line 411
    .line 412
    if-ne v8, v12, :cond_c

    .line 413
    move v8, v11

    .line 414
    goto :goto_3

    .line 415
    :cond_c
    move v8, v3

    .line 416
    .line 417
    .line 418
    :goto_3
    invoke-static {v8}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 419
    .line 420
    aget-object v7, v7, v11

    .line 421
    .line 422
    .line 423
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 424
    move-result v7

    .line 425
    .line 426
    if-nez v5, :cond_d

    .line 427
    .line 428
    mul-int/lit16 v7, v7, 0x3e8

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v7}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setBitrate(I)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 432
    goto :goto_4

    .line 433
    .line 434
    :cond_d
    mul-int/lit16 v7, v7, 0x3e8

    .line 435
    .line 436
    .line 437
    invoke-virtual {v5, v7}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;->setBitrate(I)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 438
    goto :goto_4

    .line 439
    .line 440
    :pswitch_15
    if-eqz v6, :cond_e

    .line 441
    goto :goto_4

    .line 442
    .line 443
    :cond_e
    if-nez v5, :cond_f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setConnection(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 447
    goto :goto_4

    .line 448
    .line 449
    .line 450
    :cond_f
    invoke-virtual {v5, v8}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;->setConnection(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 451
    goto :goto_4

    .line 452
    .line 453
    .line 454
    :pswitch_16
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setPhoneNumber(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 455
    goto :goto_4

    .line 456
    .line 457
    .line 458
    :pswitch_17
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setEmailAddress(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 459
    goto :goto_4

    .line 460
    .line 461
    .line 462
    :pswitch_18
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 463
    move-result-object v7

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v7}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setUri(Landroid/net/Uri;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 467
    goto :goto_4

    .line 468
    .line 469
    :pswitch_19
    if-eqz v6, :cond_10

    .line 470
    goto :goto_4

    .line 471
    .line 472
    :cond_10
    if-nez v5, :cond_11

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setSessionInfo(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 476
    goto :goto_4

    .line 477
    .line 478
    .line 479
    :cond_11
    invoke-virtual {v5, v8}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;->setMediaTitle(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 480
    goto :goto_4

    .line 481
    .line 482
    .line 483
    :pswitch_1a
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setSessionName(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 484
    goto :goto_4

    .line 485
    .line 486
    .line 487
    :pswitch_1b
    invoke-virtual {v0, v8}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->setOrigin(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;

    .line 488
    goto :goto_4

    .line 489
    .line 490
    :pswitch_1c
    const-string v7, "0"

    .line 491
    .line 492
    .line 493
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    move-result v7

    .line 495
    .line 496
    if-eqz v7, :cond_12

    .line 497
    .line 498
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :cond_12
    const-string p0, "SDP version %s is not supported."

    .line 503
    .line 504
    .line 505
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 506
    move-result-object v0

    .line 507
    .line 508
    .line 509
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 510
    move-result-object p0

    .line 511
    .line 512
    .line 513
    invoke-static {p0, v2}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 514
    move-result-object p0

    .line 515
    throw p0

    .line 516
    .line 517
    :cond_13
    if-eqz v5, :cond_14

    .line 518
    .line 519
    .line 520
    invoke-static {v0, v5}, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->addMediaDescriptionToSession(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;)V

    .line 521
    .line 522
    .line 523
    :cond_14
    :try_start_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->build()Landroidx/media3/exoplayer/rtsp/SessionDescription;

    .line 524
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 525
    return-object p0

    .line 526
    :catch_0
    move-exception p0

    .line 527
    goto :goto_5

    .line 528
    :catch_1
    move-exception p0

    .line 529
    .line 530
    .line 531
    :goto_5
    invoke-static {v2, p0}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 532
    move-result-object p0

    .line 533
    throw p0

    .line 534
    nop

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
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
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

.method private static parseMediaDescriptionLine(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;
    .locals 7
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/media3/exoplayer/rtsp/SessionDescriptionParser;->MEDIA_DESCRIPTION_PATTERN:Ljava/util/regex/Pattern;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    const-string v3, "Malformed SDP media description line: "

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    const/4 v4, 0x2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    .line 34
    invoke-static {v4}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    const/4 v5, 0x3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    .line 45
    invoke-static {v5}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    const/4 v6, 0x4

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    :try_start_0
    new-instance v6, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 65
    move-result v4

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 69
    move-result v0

    .line 70
    .line 71
    .line 72
    invoke-direct {v6, v1, v4, v5, v0}, Landroidx/media3/exoplayer/rtsp/MediaDescription$Builder;-><init>(Ljava/lang/String;ILjava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    return-object v6

    .line 74
    :catch_0
    move-exception v0

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    const-string v1, "SDPParser"

    .line 92
    .line 93
    .line 94
    invoke-static {v1, p0, v0}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    return-object v2

    .line 96
    .line 97
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    move-result-object p0

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v2}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 114
    move-result-object p0

    .line 115
    throw p0
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
