.class public final Lokio/Options$Companion;
.super Ljava/lang/Object;
.source "Options.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokio/Options;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JT\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lokio/Options$Companion;",
        "",
        "()V",
        "intCount",
        "",
        "Lokio/Buffer;",
        "getIntCount",
        "(Lokio/Buffer;)J",
        "buildTrieRecursive",
        "",
        "nodeOffset",
        "node",
        "byteStringOffset",
        "",
        "byteStrings",
        "",
        "Lokio/ByteString;",
        "fromIndex",
        "toIndex",
        "indexes",
        "of",
        "Lokio/Options;",
        "",
        "([Lokio/ByteString;)Lokio/Options;",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokio/Options$Companion;-><init>()V

    return-void
.end method

.method private final buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lokio/Buffer;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lokio/ByteString;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v9, p3

    .line 5
    .line 6
    move/from16 v10, p4

    .line 7
    .line 8
    move-object/from16 v5, p5

    .line 9
    .line 10
    move/from16 v1, p6

    .line 11
    .line 12
    move/from16 v11, p7

    .line 13
    .line 14
    move-object/from16 v8, p8

    .line 15
    .line 16
    const-string v2, "Failed requirement."

    .line 17
    .line 18
    if-ge v1, v11, :cond_11

    .line 19
    move v3, v1

    .line 20
    .line 21
    :goto_0
    if-ge v3, v11, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    check-cast v4, Lokio/ByteString;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Lokio/ByteString;->size()I

    .line 31
    move-result v4

    .line 32
    .line 33
    if-lt v4, v10, :cond_0

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    throw v1

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface/range {p5 .. p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    check-cast v2, Lokio/ByteString;

    .line 49
    .line 50
    add-int/lit8 v3, v11, -0x1

    .line 51
    .line 52
    .line 53
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    check-cast v3, Lokio/ByteString;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 60
    move-result v4

    .line 61
    .line 62
    if-ne v10, v4, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    check-cast v2, Ljava/lang/Number;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 72
    move-result v2

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    .line 77
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    move-result-object v4

    .line 79
    .line 80
    check-cast v4, Lokio/ByteString;

    .line 81
    move v6, v1

    .line 82
    move v1, v2

    .line 83
    move-object v2, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v6, v1

    .line 86
    const/4 v1, -0x1

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-virtual {v2, v10}, Lokio/ByteString;->getByte(I)B

    .line 90
    move-result v4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v10}, Lokio/ByteString;->getByte(I)B

    .line 94
    move-result v7

    .line 95
    const/4 v13, 0x2

    .line 96
    .line 97
    if-eq v4, v7, :cond_c

    .line 98
    .line 99
    add-int/lit8 v2, v6, 0x1

    .line 100
    const/4 v3, 0x1

    .line 101
    .line 102
    :goto_2
    if-ge v2, v11, :cond_4

    .line 103
    .line 104
    add-int/lit8 v4, v2, -0x1

    .line 105
    .line 106
    .line 107
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    check-cast v4, Lokio/ByteString;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v10}, Lokio/ByteString;->getByte(I)B

    .line 114
    move-result v4

    .line 115
    .line 116
    .line 117
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    move-result-object v7

    .line 119
    .line 120
    check-cast v7, Lokio/ByteString;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v10}, Lokio/ByteString;->getByte(I)B

    .line 124
    move-result v7

    .line 125
    .line 126
    if-eq v4, v7, :cond_3

    .line 127
    .line 128
    add-int/lit8 v3, v3, 0x1

    .line 129
    .line 130
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 131
    goto :goto_2

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-direct {v0, v9}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 135
    move-result-wide v14

    .line 136
    .line 137
    add-long v14, p1, v14

    .line 138
    .line 139
    const/16 v16, -0x1

    .line 140
    int-to-long v12, v13

    .line 141
    add-long/2addr v14, v12

    .line 142
    .line 143
    mul-int/lit8 v2, v3, 0x2

    .line 144
    int-to-long v12, v2

    .line 145
    add-long/2addr v14, v12

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9, v3}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 152
    move v1, v6

    .line 153
    .line 154
    :goto_3
    if-ge v1, v11, :cond_7

    .line 155
    .line 156
    .line 157
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    check-cast v2, Lokio/ByteString;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v10}, Lokio/ByteString;->getByte(I)B

    .line 164
    move-result v2

    .line 165
    .line 166
    if-eq v1, v6, :cond_5

    .line 167
    .line 168
    add-int/lit8 v3, v1, -0x1

    .line 169
    .line 170
    .line 171
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    check-cast v3, Lokio/ByteString;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v10}, Lokio/ByteString;->getByte(I)B

    .line 178
    move-result v3

    .line 179
    .line 180
    if-eq v2, v3, :cond_6

    .line 181
    .line 182
    :cond_5
    and-int/lit16 v2, v2, 0xff

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v2}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 186
    .line 187
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 188
    goto :goto_3

    .line 189
    .line 190
    :cond_7
    new-instance v3, Lokio/Buffer;

    .line 191
    .line 192
    .line 193
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 194
    .line 195
    :goto_4
    if-ge v6, v11, :cond_b

    .line 196
    .line 197
    .line 198
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    check-cast v1, Lokio/ByteString;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v10}, Lokio/ByteString;->getByte(I)B

    .line 205
    move-result v1

    .line 206
    .line 207
    add-int/lit8 v2, v6, 0x1

    .line 208
    move v4, v2

    .line 209
    .line 210
    :goto_5
    if-ge v4, v11, :cond_9

    .line 211
    .line 212
    .line 213
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    move-result-object v7

    .line 215
    .line 216
    check-cast v7, Lokio/ByteString;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v10}, Lokio/ByteString;->getByte(I)B

    .line 220
    move-result v7

    .line 221
    .line 222
    if-eq v1, v7, :cond_8

    .line 223
    move v7, v4

    .line 224
    goto :goto_6

    .line 225
    .line 226
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 227
    goto :goto_5

    .line 228
    :cond_9
    move v7, v11

    .line 229
    .line 230
    :goto_6
    if-ne v2, v7, :cond_a

    .line 231
    .line 232
    add-int/lit8 v1, v10, 0x1

    .line 233
    .line 234
    .line 235
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    move-result-object v2

    .line 237
    .line 238
    check-cast v2, Lokio/ByteString;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 242
    move-result v2

    .line 243
    .line 244
    if-ne v1, v2, :cond_a

    .line 245
    .line 246
    .line 247
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    move-result-object v1

    .line 249
    .line 250
    check-cast v1, Ljava/lang/Number;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 254
    move-result v1

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 258
    move-wide v1, v14

    .line 259
    goto :goto_7

    .line 260
    .line 261
    .line 262
    :cond_a
    invoke-direct {v0, v3}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 263
    move-result-wide v1

    .line 264
    add-long/2addr v1, v14

    .line 265
    long-to-int v1, v1

    .line 266
    .line 267
    mul-int/lit8 v1, v1, -0x1

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 271
    .line 272
    add-int/lit8 v4, v10, 0x1

    .line 273
    move-wide v1, v14

    .line 274
    .line 275
    .line 276
    invoke-direct/range {v0 .. v8}, Lokio/Options$Companion;->buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V

    .line 277
    :goto_7
    move-wide v14, v1

    .line 278
    move v6, v7

    .line 279
    goto :goto_4

    .line 280
    .line 281
    .line 282
    :cond_b
    invoke-virtual {v9, v3}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 283
    return-void

    .line 284
    .line 285
    :cond_c
    const/16 v16, -0x1

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 289
    move-result v4

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Lokio/ByteString;->size()I

    .line 293
    move-result v7

    .line 294
    .line 295
    .line 296
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 297
    move-result v4

    .line 298
    const/4 v7, 0x0

    .line 299
    move v12, v10

    .line 300
    .line 301
    :goto_8
    if-ge v12, v4, :cond_d

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v12}, Lokio/ByteString;->getByte(I)B

    .line 305
    move-result v14

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3, v12}, Lokio/ByteString;->getByte(I)B

    .line 309
    move-result v15

    .line 310
    .line 311
    if-ne v14, v15, :cond_d

    .line 312
    .line 313
    add-int/lit8 v7, v7, 0x1

    .line 314
    .line 315
    add-int/lit8 v12, v12, 0x1

    .line 316
    goto :goto_8

    .line 317
    .line 318
    .line 319
    :cond_d
    invoke-direct {v0, v9}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 320
    move-result-wide v3

    .line 321
    .line 322
    add-long v3, p1, v3

    .line 323
    int-to-long v12, v13

    .line 324
    add-long/2addr v3, v12

    .line 325
    int-to-long v12, v7

    .line 326
    add-long/2addr v3, v12

    .line 327
    .line 328
    const-wide/16 v12, 0x1

    .line 329
    add-long/2addr v3, v12

    .line 330
    neg-int v12, v7

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9, v12}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 337
    .line 338
    add-int v1, v10, v7

    .line 339
    .line 340
    :goto_9
    if-ge v10, v1, :cond_e

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v10}, Lokio/ByteString;->getByte(I)B

    .line 344
    move-result v7

    .line 345
    .line 346
    and-int/lit16 v7, v7, 0xff

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9, v7}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 350
    .line 351
    add-int/lit8 v10, v10, 0x1

    .line 352
    goto :goto_9

    .line 353
    .line 354
    :cond_e
    add-int/lit8 v2, v6, 0x1

    .line 355
    .line 356
    if-ne v2, v11, :cond_10

    .line 357
    .line 358
    .line 359
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 360
    move-result-object v2

    .line 361
    .line 362
    check-cast v2, Lokio/ByteString;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 366
    move-result v2

    .line 367
    .line 368
    if-ne v1, v2, :cond_f

    .line 369
    .line 370
    .line 371
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 372
    move-result-object v1

    .line 373
    .line 374
    check-cast v1, Ljava/lang/Number;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 378
    move-result v1

    .line 379
    .line 380
    .line 381
    invoke-virtual {v9, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 382
    return-void

    .line 383
    .line 384
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    const-string v2, "Check failed."

    .line 387
    .line 388
    .line 389
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 390
    throw v1

    .line 391
    .line 392
    :cond_10
    move-wide/from16 v17, v3

    .line 393
    move v4, v1

    .line 394
    .line 395
    move-wide/from16 v1, v17

    .line 396
    .line 397
    new-instance v3, Lokio/Buffer;

    .line 398
    .line 399
    .line 400
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-direct {v0, v3}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 404
    move-result-wide v12

    .line 405
    add-long/2addr v12, v1

    .line 406
    long-to-int v7, v12

    .line 407
    .line 408
    mul-int/lit8 v7, v7, -0x1

    .line 409
    .line 410
    .line 411
    invoke-virtual {v9, v7}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 412
    move v7, v11

    .line 413
    .line 414
    .line 415
    invoke-direct/range {v0 .. v8}, Lokio/Options$Companion;->buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v9, v3}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 419
    return-void

    .line 420
    .line 421
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 422
    .line 423
    .line 424
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 425
    throw v0
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
.end method

.method public static synthetic buildTrieRecursive$default(Lokio/Options$Companion;JLokio/Buffer;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V
    .locals 9

    .line 1
    .line 2
    and-int/lit8 v0, p9, 0x1

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-wide/16 p1, 0x0

    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    .line 9
    and-int/lit8 p1, p9, 0x4

    .line 10
    const/4 p2, 0x0

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    move v4, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move v4, p4

    .line 16
    .line 17
    :goto_0
    and-int/lit8 p1, p9, 0x10

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    move v6, p2

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    move v6, p6

    .line 23
    .line 24
    :goto_1
    and-int/lit8 p1, p9, 0x20

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    .line 29
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 30
    move-result p1

    .line 31
    move v7, p1

    .line 32
    :goto_2
    move-object v0, p0

    .line 33
    move-object v3, p3

    .line 34
    move-object v5, p5

    .line 35
    .line 36
    move-object/from16 v8, p8

    .line 37
    goto :goto_3

    .line 38
    .line 39
    :cond_3
    move/from16 v7, p7

    .line 40
    goto :goto_2

    .line 41
    .line 42
    .line 43
    :goto_3
    invoke-direct/range {v0 .. v8}, Lokio/Options$Companion;->buildTrieRecursive(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V

    .line 44
    return-void
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
.end method

.method private final getIntCount(Lokio/Buffer;)J
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 4
    move-result-wide v0

    .line 5
    const/4 p1, 0x4

    .line 6
    int-to-long v2, p1

    .line 7
    div-long/2addr v0, v2

    .line 8
    return-wide v0
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
.end method


# virtual methods
.method public final varargs of([Lokio/ByteString;)Lokio/Options;
    .locals 16
    .param p1    # [Lokio/ByteString;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "byteStrings"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, -0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v0, Lokio/Options;

    .line 16
    .line 17
    new-array v1, v4, [Lokio/ByteString;

    .line 18
    .line 19
    .line 20
    filled-new-array {v4, v3}, [I

    .line 21
    move-result-object v3

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v3, v2}, Lokio/Options;-><init>([Lokio/ByteString;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    return-object v0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toMutableList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    .line 32
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->sort(Ljava/util/List;)V

    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    array-length v6, v0

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    array-length v6, v0

    .line 40
    move v7, v4

    .line 41
    .line 42
    :goto_0
    if-ge v7, v6, :cond_1

    .line 43
    .line 44
    aget-object v8, v0, v7

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v8

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    add-int/lit8 v7, v7, 0x1

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_1
    new-array v3, v4, [Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, [Ljava/lang/Integer;

    .line 63
    array-length v3, v1

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    move-result-object v13

    .line 72
    array-length v1, v0

    .line 73
    move v3, v4

    .line 74
    move v11, v3

    .line 75
    .line 76
    :goto_1
    if-ge v3, v1, :cond_2

    .line 77
    .line 78
    aget-object v6, v0, v3

    .line 79
    .line 80
    add-int/lit8 v12, v11, 0x1

    .line 81
    const/4 v9, 0x6

    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static/range {v5 .. v10}, Lkotlin/collections/CollectionsKt;->binarySearch$default(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    .line 88
    move-result v6

    .line 89
    .line 90
    .line 91
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    move-result-object v7

    .line 93
    .line 94
    .line 95
    invoke-interface {v13, v6, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x1

    .line 98
    move v11, v12

    .line 99
    goto :goto_1

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    check-cast v1, Lokio/ByteString;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lokio/ByteString;->size()I

    .line 109
    move-result v1

    .line 110
    .line 111
    if-lez v1, :cond_8

    .line 112
    move v1, v4

    .line 113
    .line 114
    .line 115
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 116
    move-result v3

    .line 117
    .line 118
    if-ge v1, v3, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    check-cast v3, Lokio/ByteString;

    .line 125
    .line 126
    add-int/lit8 v6, v1, 0x1

    .line 127
    move v7, v6

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 131
    move-result v8

    .line 132
    .line 133
    if-ge v7, v8, :cond_5

    .line 134
    .line 135
    .line 136
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    move-result-object v8

    .line 138
    .line 139
    check-cast v8, Lokio/ByteString;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, v3}, Lokio/ByteString;->startsWith(Lokio/ByteString;)Z

    .line 143
    move-result v9

    .line 144
    .line 145
    if-eqz v9, :cond_5

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Lokio/ByteString;->size()I

    .line 149
    move-result v9

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Lokio/ByteString;->size()I

    .line 153
    move-result v10

    .line 154
    .line 155
    if-eq v9, v10, :cond_4

    .line 156
    .line 157
    .line 158
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    move-result-object v8

    .line 160
    .line 161
    check-cast v8, Ljava/lang/Number;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 165
    move-result v8

    .line 166
    .line 167
    .line 168
    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    move-result-object v9

    .line 170
    .line 171
    check-cast v9, Ljava/lang/Number;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 175
    move-result v9

    .line 176
    .line 177
    if-le v8, v9, :cond_3

    .line 178
    .line 179
    .line 180
    invoke-interface {v5, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    invoke-interface {v13, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 184
    goto :goto_3

    .line 185
    .line 186
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 187
    goto :goto_3

    .line 188
    .line 189
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    const-string v1, "duplicate option: "

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    .line 213
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 214
    throw v1

    .line 215
    :cond_5
    move v1, v6

    .line 216
    goto :goto_2

    .line 217
    .line 218
    :cond_6
    new-instance v8, Lokio/Buffer;

    .line 219
    .line 220
    .line 221
    invoke-direct {v8}, Lokio/Buffer;-><init>()V

    .line 222
    .line 223
    const/16 v14, 0x35

    .line 224
    const/4 v15, 0x0

    .line 225
    .line 226
    const-wide/16 v6, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v11, 0x0

    .line 229
    const/4 v12, 0x0

    .line 230
    move-object v10, v5

    .line 231
    .line 232
    move-object/from16 v5, p0

    .line 233
    .line 234
    .line 235
    invoke-static/range {v5 .. v15}, Lokio/Options$Companion;->buildTrieRecursive$default(Lokio/Options$Companion;JLokio/Buffer;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-direct {v5, v8}, Lokio/Options$Companion;->getIntCount(Lokio/Buffer;)J

    .line 239
    move-result-wide v6

    .line 240
    long-to-int v1, v6

    .line 241
    .line 242
    new-array v1, v1, [I

    .line 243
    .line 244
    .line 245
    :goto_4
    invoke-virtual {v8}, Lokio/Buffer;->exhausted()Z

    .line 246
    move-result v3

    .line 247
    .line 248
    if-nez v3, :cond_7

    .line 249
    .line 250
    add-int/lit8 v3, v4, 0x1

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8}, Lokio/Buffer;->readInt()I

    .line 254
    move-result v6

    .line 255
    .line 256
    aput v6, v1, v4

    .line 257
    move v4, v3

    .line 258
    goto :goto_4

    .line 259
    .line 260
    :cond_7
    new-instance v3, Lokio/Options;

    .line 261
    array-length v4, v0

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    const-string v4, "copyOf(this, size)"

    .line 268
    .line 269
    .line 270
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    check-cast v0, [Lokio/ByteString;

    .line 273
    .line 274
    .line 275
    invoke-direct {v3, v0, v1, v2}, Lokio/Options;-><init>([Lokio/ByteString;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 276
    return-object v3

    .line 277
    .line 278
    :cond_8
    move-object/from16 v5, p0

    .line 279
    .line 280
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 281
    .line 282
    .line 283
    const-string/jumbo v1, "the empty byte string is not a supported option"

    .line 284
    .line 285
    .line 286
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 287
    throw v0
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
.end method
