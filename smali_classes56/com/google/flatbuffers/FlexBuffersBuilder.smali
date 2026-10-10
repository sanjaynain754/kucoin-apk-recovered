.class public Lcom/google/flatbuffers/FlexBuffersBuilder;
.super Ljava/lang/Object;
.source "FlexBuffersBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final BUILDER_FLAG_NONE:I = 0x0

.field public static final BUILDER_FLAG_SHARE_ALL:I = 0x7

.field public static final BUILDER_FLAG_SHARE_KEYS:I = 0x1

.field public static final BUILDER_FLAG_SHARE_KEYS_AND_STRINGS:I = 0x3

.field public static final BUILDER_FLAG_SHARE_KEY_VECTORS:I = 0x4

.field public static final BUILDER_FLAG_SHARE_STRINGS:I = 0x2

.field private static final WIDTH_16:I = 0x1

.field private static final WIDTH_32:I = 0x2

.field private static final WIDTH_64:I = 0x3

.field private static final WIDTH_8:I


# instance fields
.field private final bb:Lcom/google/flatbuffers/ReadWriteBuf;

.field private finished:Z

.field private final flags:I

.field private keyComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/flatbuffers/FlexBuffersBuilder$Value;",
            ">;"
        }
    .end annotation
.end field

.field private final keyPool:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final stack:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/flatbuffers/FlexBuffersBuilder$Value;",
            ">;"
        }
    .end annotation
.end field

.field private final stringPool:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x100

    .line 2
    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/flatbuffers/ArrayReadWriteBuf;

    invoke-direct {v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;-><init>(I)V

    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(Lcom/google/flatbuffers/ReadWriteBuf;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/flatbuffers/ReadWriteBuf;I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->finished:Z

    .line 9
    new-instance v0, Lcom/google/flatbuffers/FlexBuffersBuilder$1;

    invoke-direct {v0, p0}, Lcom/google/flatbuffers/FlexBuffersBuilder$1;-><init>(Lcom/google/flatbuffers/FlexBuffersBuilder;)V

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyComparator:Ljava/util/Comparator;

    .line 10
    iput-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 11
    iput p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->flags:I

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    new-instance v0, Lcom/google/flatbuffers/ArrayReadWriteBuf;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/flatbuffers/ArrayReadWriteBuf;-><init>([B)V

    invoke-direct {p0, v0, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;-><init>(Lcom/google/flatbuffers/ReadWriteBuf;I)V

    return-void
.end method

.method public static synthetic access$000(Lcom/google/flatbuffers/FlexBuffersBuilder;)Lcom/google/flatbuffers/ReadWriteBuf;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

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
.end method

.method private align(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    shl-int p1, v0, p1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$100(II)I

    .line 13
    move-result v0

    .line 14
    .line 15
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v2}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 24
    move v0, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return p1
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
.end method

.method private createKeyVector(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 13

    .line 1
    int-to-long v0, p2

    .line 2
    .line 3
    .line 4
    invoke-static {v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    .line 5
    move-result p2

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    .line 10
    move-result p2

    .line 11
    move v6, p2

    .line 12
    move p2, p1

    .line 13
    .line 14
    :goto_0
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-ge p2, v3, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    check-cast v3, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 29
    .line 30
    iget v3, v3, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 31
    int-to-long v9, v3

    .line 32
    .line 33
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 34
    .line 35
    .line 36
    invoke-interface {v3}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 37
    move-result v11

    .line 38
    .line 39
    add-int/lit8 v12, p2, 0x1

    .line 40
    const/4 v7, 0x4

    .line 41
    const/4 v8, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v7 .. v12}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$500(IIJII)I

    .line 45
    move-result p2

    .line 46
    .line 47
    .line 48
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    .line 49
    move-result v6

    .line 50
    move p2, v12

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-direct {p0, v6}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    .line 55
    move-result p2

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 59
    .line 60
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 64
    move-result v0

    .line 65
    .line 66
    :goto_1
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 70
    move-result v1

    .line 71
    .line 72
    if-ge p1, v1, :cond_1

    .line 73
    .line 74
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    check-cast v1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 81
    .line 82
    iget v1, v1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 83
    .line 84
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    check-cast v1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 91
    .line 92
    iget v1, v1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 93
    int-to-long v3, v1

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, v3, v4, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeOffset(JI)V

    .line 97
    .line 98
    add-int/lit8 p1, p1, 0x1

    .line 99
    goto :goto_1

    .line 100
    .line 101
    :cond_1
    new-instance v3, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 102
    const/4 p1, 0x4

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v2}, Lcom/google/flatbuffers/FlexBuffers;->toTypedVector(II)I

    .line 106
    move-result v5

    .line 107
    int-to-long v7, v0

    .line 108
    const/4 v4, -0x1

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v3 .. v8}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    .line 112
    return-object v3
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
.end method

.method private createVector(IIIZZLcom/google/flatbuffers/FlexBuffersBuilder$Value;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 14

    .line 1
    .line 2
    move-object/from16 v0, p6

    .line 3
    .line 4
    move/from16 v1, p3

    .line 5
    int-to-long v2, v1

    .line 6
    .line 7
    .line 8
    invoke-static {v2, v3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    .line 9
    move-result v4

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 14
    move-result v4

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 19
    .line 20
    .line 21
    invoke-interface {v6}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 22
    move-result v6

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v6, v5}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I

    .line 26
    move-result v6

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 30
    move-result v4

    .line 31
    const/4 v6, 0x3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v6, 0x1

    .line 34
    :goto_0
    const/4 v7, 0x4

    .line 35
    move v11, v4

    .line 36
    .line 37
    move/from16 v4, p2

    .line 38
    .line 39
    :goto_1
    iget-object v8, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 43
    move-result v8

    .line 44
    .line 45
    if-ge v4, v8, :cond_3

    .line 46
    .line 47
    iget-object v8, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    move-result-object v8

    .line 52
    .line 53
    check-cast v8, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 54
    .line 55
    iget-object v9, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 56
    .line 57
    .line 58
    invoke-interface {v9}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 59
    move-result v9

    .line 60
    .line 61
    add-int v10, v4, v6

    .line 62
    .line 63
    .line 64
    invoke-static {v8, v9, v10}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I

    .line 65
    move-result v8

    .line 66
    .line 67
    .line 68
    invoke-static {v11, v8}, Ljava/lang/Math;->max(II)I

    .line 69
    move-result v11

    .line 70
    .line 71
    move/from16 v8, p2

    .line 72
    .line 73
    if-eqz p4, :cond_2

    .line 74
    .line 75
    if-ne v4, v8, :cond_2

    .line 76
    .line 77
    iget-object v7, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    move-result-object v7

    .line 82
    .line 83
    check-cast v7, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 84
    .line 85
    iget v7, v7, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    .line 86
    .line 87
    .line 88
    invoke-static {v7}, Lcom/google/flatbuffers/FlexBuffers;->isTypedVectorElementType(I)Z

    .line 89
    move-result v9

    .line 90
    .line 91
    if-eqz v9, :cond_1

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_1
    new-instance p1, Lcom/google/flatbuffers/FlexBuffers$FlexBufferException;

    .line 95
    .line 96
    const-string v0, "TypedVector does not support this element type"

    .line 97
    .line 98
    .line 99
    invoke-direct {p1, v0}, Lcom/google/flatbuffers/FlexBuffers$FlexBufferException;-><init>(Ljava/lang/String;)V

    .line 100
    throw p1

    .line 101
    .line 102
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_3
    move/from16 v8, p2

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v11}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    .line 109
    move-result v4

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    iget-wide v9, v0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 114
    .line 115
    .line 116
    invoke-direct {p0, v9, v10, v4}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeOffset(JI)V

    .line 117
    .line 118
    const-wide/16 v9, 0x1

    .line 119
    .line 120
    iget v6, v0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->minBitWidth:I

    .line 121
    shl-long/2addr v9, v6

    .line 122
    .line 123
    .line 124
    invoke-direct {p0, v9, v10, v4}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 125
    .line 126
    :cond_4
    if-nez p5, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-direct {p0, v2, v3, v4}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 130
    .line 131
    :cond_5
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 132
    .line 133
    .line 134
    invoke-interface {v2}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 135
    move-result v2

    .line 136
    move v3, v8

    .line 137
    .line 138
    :goto_3
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 142
    move-result v6

    .line 143
    .line 144
    if-ge v3, v6, :cond_6

    .line 145
    .line 146
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    move-result-object v6

    .line 151
    .line 152
    check-cast v6, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 153
    .line 154
    .line 155
    invoke-direct {p0, v6, v4}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeAny(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)V

    .line 156
    .line 157
    add-int/lit8 v3, v3, 0x1

    .line 158
    goto :goto_3

    .line 159
    .line 160
    :cond_6
    if-nez p4, :cond_7

    .line 161
    .line 162
    :goto_4
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 166
    move-result v3

    .line 167
    .line 168
    if-ge v8, v3, :cond_7

    .line 169
    .line 170
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 171
    .line 172
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    move-result-object v4

    .line 177
    .line 178
    check-cast v4, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 179
    .line 180
    .line 181
    invoke-static {v4, v11}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$400(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)B

    .line 182
    move-result v4

    .line 183
    .line 184
    .line 185
    invoke-interface {v3, v4}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 186
    .line 187
    add-int/lit8 v8, v8, 0x1

    .line 188
    goto :goto_4

    .line 189
    .line 190
    :cond_7
    new-instance v8, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 191
    .line 192
    if-eqz v0, :cond_8

    .line 193
    .line 194
    const/16 v0, 0x9

    .line 195
    :goto_5
    move v10, v0

    .line 196
    goto :goto_7

    .line 197
    .line 198
    :cond_8
    if-eqz p4, :cond_a

    .line 199
    .line 200
    if-eqz p5, :cond_9

    .line 201
    goto :goto_6

    .line 202
    :cond_9
    move v1, v5

    .line 203
    .line 204
    .line 205
    :goto_6
    invoke-static {v7, v1}, Lcom/google/flatbuffers/FlexBuffers;->toTypedVector(II)I

    .line 206
    move-result v0

    .line 207
    goto :goto_5

    .line 208
    .line 209
    :cond_a
    const/16 v0, 0xa

    .line 210
    goto :goto_5

    .line 211
    :goto_7
    int-to-long v12, v2

    .line 212
    move v9, p1

    .line 213
    .line 214
    .line 215
    invoke-direct/range {v8 .. v13}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;-><init>(IIIJ)V

    .line 216
    return-object v8
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
.end method

.method private putKey(Ljava/lang/String;)I
    .locals 5

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, -0x1

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->flags:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 33
    move-result-object v1

    .line 34
    .line 35
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 36
    array-length v4, v1

    .line 37
    .line 38
    .line 39
    invoke-interface {v3, v1, v2, v4}, Lcom/google/flatbuffers/ReadWriteBuf;->put([BII)V

    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v2}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 45
    .line 46
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    return v0

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 58
    move-result p1

    .line 59
    return p1

    .line 60
    .line 61
    :cond_2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 65
    move-result-object v1

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 68
    array-length v4, v1

    .line 69
    .line 70
    .line 71
    invoke-interface {v3, v1, v2, v4}, Lcom/google/flatbuffers/ReadWriteBuf;->put([BII)V

    .line 72
    .line 73
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v2}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 77
    .line 78
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyPool:Ljava/util/HashMap;

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    return v0
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
.end method

.method private putUInt(Ljava/lang/String;J)V
    .locals 2

    .line 3
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    .line 4
    invoke-static {p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result v0

    if-nez v0, :cond_0

    long-to-int p2, p2

    .line 5
    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt8(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    long-to-int p2, p2

    .line 6
    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt16(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    long-to-int p2, p2

    .line 7
    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt32(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    .line 9
    :goto_0
    iget-object p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private putUInt64(Ljava/lang/String;J)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->uInt64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static widthUInBits(J)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->byteToUnsignedInt(B)I

    .line 5
    move-result v1

    .line 6
    int-to-long v1, v1

    .line 7
    .line 8
    cmp-long v1, p0, v1

    .line 9
    .line 10
    if-gtz v1, :cond_0

    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->shortToUnsignedInt(S)I

    .line 16
    move-result v1

    .line 17
    int-to-long v1, v1

    .line 18
    .line 19
    cmp-long v1, p0, v1

    .line 20
    .line 21
    if-gtz v1, :cond_1

    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffers$Unsigned;->intToUnsignedLong(I)J

    .line 27
    move-result-wide v0

    .line 28
    .line 29
    cmp-long p0, p0, v0

    .line 30
    .line 31
    if-gtz p0, :cond_2

    .line 32
    const/4 p0, 0x2

    .line 33
    return p0

    .line 34
    :cond_2
    const/4 p0, 0x3

    .line 35
    return p0
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
.end method

.method private writeAny(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->type:I

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    const/4 v1, 0x3

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x1a

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    iget-wide v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeOffset(JI)V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    iget-wide v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->dValue:D

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeDouble(DI)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    iget-wide v0, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0, v1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 35
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
.end method

.method private writeBlob(I[BIZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    int-to-long v0, v0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    .line 10
    move-result v1

    .line 11
    array-length v2, p2

    .line 12
    int-to-long v2, v2

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v2, v3, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 21
    move-result v1

    .line 22
    .line 23
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 24
    array-length v3, p2

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, p2, v4, v3}, Lcom/google/flatbuffers/ReadWriteBuf;->put([BII)V

    .line 29
    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    iget-object p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 33
    .line 34
    .line 35
    invoke-interface {p2, v4}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {p1, v1, p3, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->blob(IIII)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 39
    move-result-object p1

    .line 40
    return-object p1
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
.end method

.method private writeDouble(DI)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 6
    double-to-float p1, p1

    .line 7
    .line 8
    .line 9
    invoke-interface {p3, p1}, Lcom/google/flatbuffers/ReadWriteBuf;->putFloat(F)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    const/16 v0, 0x8

    .line 13
    .line 14
    if-ne p3, v0, :cond_1

    .line 15
    .line 16
    iget-object p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, p1, p2}, Lcom/google/flatbuffers/ReadWriteBuf;->putDouble(D)V

    .line 20
    :cond_1
    return-void
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
.end method

.method private writeInt(JI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p3, v0, :cond_3

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p3, v0, :cond_2

    .line 7
    const/4 v0, 0x4

    .line 8
    .line 9
    if-eq p3, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    if-eq p3, v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, p1, p2}, Lcom/google/flatbuffers/ReadWriteBuf;->putLong(J)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_1
    iget-object p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 23
    long-to-int p1, p1

    .line 24
    .line 25
    .line 26
    invoke-interface {p3, p1}, Lcom/google/flatbuffers/ReadWriteBuf;->putInt(I)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_2
    iget-object p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 30
    long-to-int p1, p1

    .line 31
    int-to-short p1, p1

    .line 32
    .line 33
    .line 34
    invoke-interface {p3, p1}, Lcom/google/flatbuffers/ReadWriteBuf;->putShort(S)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_3
    iget-object p3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 38
    long-to-int p1, p1

    .line 39
    int-to-byte p1, p1

    .line 40
    .line 41
    .line 42
    invoke-interface {p3, p1}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method private writeOffset(JI)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    sub-long/2addr v0, p1

    .line 9
    long-to-int p1, v0

    .line 10
    int-to-long p1, p1

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeInt(JI)V

    .line 14
    return-void
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
.end method

.method private writeString(ILjava/lang/String;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeBlob(I[BIZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method


# virtual methods
.method public endMap(Ljava/lang/String;I)I
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    .line 4
    move-result v1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->keyComparator:Ljava/util/Comparator;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 25
    move-result p1

    .line 26
    sub-int/2addr p1, p2

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p2, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->createKeyVector(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 30
    move-result-object v6

    .line 31
    .line 32
    iget-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 36
    move-result p1

    .line 37
    .line 38
    sub-int v3, p1, p2

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v0, p0

    .line 42
    move v2, p2

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v0 .. v6}, Lcom/google/flatbuffers/FlexBuffersBuilder;->createVector(IIIZZLcom/google/flatbuffers/FlexBuffersBuilder$Value;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    :goto_0
    iget-object p2, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 52
    move-result p2

    .line 53
    .line 54
    if-le p2, v2, :cond_0

    .line 55
    .line 56
    iget-object p2, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 60
    move-result v1

    .line 61
    .line 62
    add-int/lit8 v1, v1, -0x1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_0
    iget-object p2, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    iget-wide p1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 74
    long-to-int p1, p1

    .line 75
    return p1
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
.end method

.method public endVector(Ljava/lang/String;IZZ)I
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    .line 4
    move-result v1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 10
    move-result p1

    .line 11
    .line 12
    sub-int v3, p1, p2

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v0, p0

    .line 15
    move v2, p2

    .line 16
    move v4, p3

    .line 17
    move v5, p4

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v6}, Lcom/google/flatbuffers/FlexBuffersBuilder;->createVector(IIIZZLcom/google/flatbuffers/FlexBuffersBuilder$Value;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    :goto_0
    iget-object p2, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 27
    move-result p2

    .line 28
    .line 29
    if-le p2, v2, :cond_0

    .line 30
    .line 31
    iget-object p2, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    move-result p3

    .line 36
    .line 37
    add-int/lit8 p3, p3, -0x1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_0
    iget-object p2, v0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    iget-wide p1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    .line 49
    long-to-int p1, p1

    .line 50
    return p1
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
.end method

.method public finish()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 12
    .line 13
    .line 14
    invoke-interface {v2}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$200(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;II)I

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->align(I)I

    .line 23
    move-result v0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v2, v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeAny(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;I)V

    .line 35
    .line 36
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    check-cast v3, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->access$300(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;)B

    .line 48
    move-result v3

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v3}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 52
    .line 53
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 54
    int-to-byte v0, v0

    .line 55
    .line 56
    .line 57
    invoke-interface {v2, v0}, Lcom/google/flatbuffers/ReadWriteBuf;->put(B)V

    .line 58
    const/4 v0, 0x1

    .line 59
    .line 60
    iput-boolean v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->finished:Z

    .line 61
    .line 62
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Lcom/google/flatbuffers/ReadBuf;->data()[B

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Lcom/google/flatbuffers/ReadWriteBuf;->writePosition()I

    .line 72
    move-result v2

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 76
    move-result-object v0

    .line 77
    return-object v0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public getBuffer()Lcom/google/flatbuffers/ReadWriteBuf;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->bb:Lcom/google/flatbuffers/ReadWriteBuf;

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
.end method

.method public putBlob(Ljava/lang/String;[B)I
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0x19

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeBlob(I[BIZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    .line 4
    iget-object p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-wide p1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int p1, p1

    return p1
.end method

.method public putBlob([B)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putBlob(Ljava/lang/String;[B)I

    move-result p1

    return p1
.end method

.method public putBoolean(Ljava/lang/String;Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->bool(IZ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public putBoolean(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public putFloat(D)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putFloat(Ljava/lang/String;D)V

    return-void
.end method

.method public putFloat(F)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putFloat(Ljava/lang/String;F)V

    return-void
.end method

.method public putFloat(Ljava/lang/String;D)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->float64(ID)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public putFloat(Ljava/lang/String;F)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->float32(IF)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public putInt(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public putInt(J)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putInt(Ljava/lang/String;J)V

    return-void
.end method

.method public putInt(Ljava/lang/String;I)V
    .locals 2

    int-to-long v0, p2

    .line 2
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putInt(Ljava/lang/String;J)V

    return-void
.end method

.method public putInt(Ljava/lang/String;J)V
    .locals 2

    .line 3
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    const-wide/16 v0, -0x80

    cmp-long v0, v0, p2

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x7f

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    long-to-int p2, p2

    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int8(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-wide/16 v0, -0x8000

    cmp-long v0, v0, p2

    if-gtz v0, :cond_1

    const-wide/16 v0, 0x7fff

    cmp-long v0, p2, v0

    if-gtz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    long-to-int p2, p2

    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int16(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const-wide/32 v0, -0x80000000

    cmp-long v0, v0, p2

    if-gtz v0, :cond_2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p2, v0

    if-gtz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    long-to-int p2, p2

    invoke-static {p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int32(II)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-static {p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->int64(IJ)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public putString(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putString(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 2
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putKey(Ljava/lang/String;)I

    move-result p1

    .line 3
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeString(ILjava/lang/String;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stringPool:Ljava/util/HashMap;

    iget-wide v1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-wide p1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int p1, p1

    return p1

    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    int-to-long v1, p2

    invoke-static {v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->widthUInBits(J)I

    move-result p2

    .line 10
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x5

    invoke-static {p1, v2, v3, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->blob(IIII)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->writeString(ILjava/lang/String;)Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    move-result-object p1

    .line 13
    iget-object p2, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    iget-wide p1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->iValue:J

    long-to-int p1, p1

    return p1
.end method

.method public putUInt(I)V
    .locals 3

    const/4 v0, 0x0

    int-to-long v1, p1

    .line 1
    invoke-direct {p0, v0, v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putUInt(Ljava/lang/String;J)V

    return-void
.end method

.method public putUInt(J)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putUInt(Ljava/lang/String;J)V

    return-void
.end method

.method public putUInt64(Ljava/math/BigInteger;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/flatbuffers/FlexBuffersBuilder;->putUInt64(Ljava/lang/String;J)V

    return-void
.end method

.method public startMap()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public startVector()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder;->stack:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method
