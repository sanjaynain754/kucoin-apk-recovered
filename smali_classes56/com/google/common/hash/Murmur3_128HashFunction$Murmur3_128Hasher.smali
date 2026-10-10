.class final Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;
.super Lcom/google/common/hash/AbstractStreamingHasher;
.source "Murmur3_128HashFunction.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/hash/Murmur3_128HashFunction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Murmur3_128Hasher"
.end annotation


# static fields
.field private static final C1:J = -0x783c846eeebdac2bL

.field private static final C2:J = 0x4cf5ad432745937fL

.field private static final CHUNK_SIZE:I = 0x10


# instance fields
.field private h1:J

.field private h2:J

.field private length:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/google/common/hash/AbstractStreamingHasher;-><init>(I)V

    .line 6
    int-to-long v0, p1

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    iput p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->length:I

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
.end method

.method private bmix64(JJ)V
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->mixK1(J)J

    .line 6
    move-result-wide p1

    .line 7
    xor-long/2addr p1, v0

    .line 8
    .line 9
    iput-wide p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 10
    .line 11
    const/16 v0, 0x1b

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2, v0}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 15
    move-result-wide p1

    .line 16
    .line 17
    iget-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 18
    add-long/2addr p1, v0

    .line 19
    .line 20
    const-wide/16 v2, 0x5

    .line 21
    mul-long/2addr p1, v2

    .line 22
    .line 23
    .line 24
    const-wide/32 v4, 0x52dce729

    .line 25
    add-long/2addr p1, v4

    .line 26
    .line 27
    iput-wide p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 28
    .line 29
    .line 30
    invoke-static {p3, p4}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->mixK2(J)J

    .line 31
    move-result-wide p1

    .line 32
    xor-long/2addr p1, v0

    .line 33
    .line 34
    iput-wide p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 35
    .line 36
    const/16 p3, 0x1f

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2, p3}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 40
    move-result-wide p1

    .line 41
    .line 42
    iget-wide p3, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 43
    add-long/2addr p1, p3

    .line 44
    mul-long/2addr p1, v2

    .line 45
    .line 46
    .line 47
    const-wide/32 p3, 0x38495ab5

    .line 48
    add-long/2addr p1, p3

    .line 49
    .line 50
    iput-wide p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 51
    return-void
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

.method private static fmix64(J)J
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x21

    .line 3
    .line 4
    ushr-long v1, p0, v0

    .line 5
    xor-long/2addr p0, v1

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v1, -0xae502812aa7333L

    .line 11
    mul-long/2addr p0, v1

    .line 12
    .line 13
    ushr-long v1, p0, v0

    .line 14
    xor-long/2addr p0, v1

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const-wide v1, -0x3b314601e57a13adL    # -2.902039044684214E23

    .line 20
    mul-long/2addr p0, v1

    .line 21
    .line 22
    ushr-long v0, p0, v0

    .line 23
    xor-long/2addr p0, v0

    .line 24
    return-wide p0
.end method

.method private static mixK1(J)J
    .locals 2

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, -0x783c846eeebdac2bL

    .line 6
    mul-long/2addr p0, v0

    .line 7
    .line 8
    const/16 v0, 0x1f

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v0}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 12
    move-result-wide p0

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v0, 0x4cf5ad432745937fL    # 5.573325460219186E62

    .line 18
    mul-long/2addr p0, v0

    .line 19
    return-wide p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static mixK2(J)J
    .locals 2

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x4cf5ad432745937fL    # 5.573325460219186E62

    .line 6
    mul-long/2addr p0, v0

    .line 7
    .line 8
    const/16 v0, 0x21

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v0}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 12
    move-result-wide p0

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v0, -0x783c846eeebdac2bL

    .line 18
    mul-long/2addr p0, v0

    .line 19
    return-wide p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public makeHash()Lcom/google/common/hash/HashCode;
    .locals 7

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 3
    .line 4
    iget v2, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->length:I

    .line 5
    int-to-long v3, v2

    .line 6
    xor-long/2addr v0, v3

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 9
    int-to-long v5, v2

    .line 10
    .line 11
    xor-long v2, v3, v5

    .line 12
    add-long/2addr v0, v2

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 15
    add-long/2addr v2, v0

    .line 16
    .line 17
    iput-wide v2, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->fmix64(J)J

    .line 21
    move-result-wide v0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 24
    .line 25
    iget-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->fmix64(J)J

    .line 29
    move-result-wide v0

    .line 30
    .line 31
    iget-wide v2, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 32
    add-long/2addr v2, v0

    .line 33
    .line 34
    iput-wide v2, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 35
    add-long/2addr v0, v2

    .line 36
    .line 37
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 38
    .line 39
    const/16 v0, 0x10

    .line 40
    .line 41
    new-array v0, v0, [B

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iget-wide v1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    iget-wide v1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/google/common/hash/HashCode;->fromBytesNoCopy([B)Lcom/google/common/hash/HashCode;

    .line 71
    move-result-object v0

    .line 72
    return-object v0
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
.end method

.method public process(Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->bmix64(JJ)V

    .line 12
    .line 13
    iget p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->length:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x10

    .line 16
    .line 17
    iput p1, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->length:I

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public processRemaining(Ljava/nio/ByteBuffer;)V
    .locals 13

    .line 1
    .line 2
    iget v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->length:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 6
    move-result v1

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    iput v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->length:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 13
    move-result v0

    .line 14
    .line 15
    const/16 v1, 0x10

    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    const/16 v4, 0x28

    .line 22
    .line 23
    const/16 v5, 0x30

    .line 24
    .line 25
    const/16 v6, 0x8

    .line 26
    .line 27
    const-wide/16 v7, 0x0

    .line 28
    .line 29
    .line 30
    packed-switch v0, :pswitch_data_0

    .line 31
    .line 32
    new-instance p1, Ljava/lang/AssertionError;

    .line 33
    .line 34
    const-string v0, "Should never get here."

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 38
    throw p1

    .line 39
    .line 40
    :pswitch_0
    const/16 v0, 0xe

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 44
    move-result v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 48
    move-result v0

    .line 49
    int-to-long v7, v0

    .line 50
    shl-long/2addr v7, v5

    .line 51
    .line 52
    :pswitch_1
    const/16 v0, 0xd

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 56
    move-result v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 60
    move-result v0

    .line 61
    int-to-long v9, v0

    .line 62
    .line 63
    shl-long v4, v9, v4

    .line 64
    xor-long/2addr v7, v4

    .line 65
    .line 66
    :pswitch_2
    const/16 v0, 0xc

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 70
    move-result v0

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 74
    move-result v0

    .line 75
    int-to-long v4, v0

    .line 76
    .line 77
    shl-long v3, v4, v3

    .line 78
    xor-long/2addr v7, v3

    .line 79
    .line 80
    :pswitch_3
    const/16 v0, 0xb

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 84
    move-result v0

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 88
    move-result v0

    .line 89
    int-to-long v3, v0

    .line 90
    .line 91
    shl-long v2, v3, v2

    .line 92
    xor-long/2addr v7, v2

    .line 93
    .line 94
    :pswitch_4
    const/16 v0, 0xa

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 98
    move-result v0

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 102
    move-result v0

    .line 103
    int-to-long v2, v0

    .line 104
    .line 105
    shl-long v0, v2, v1

    .line 106
    xor-long/2addr v7, v0

    .line 107
    .line 108
    :pswitch_5
    const/16 v0, 0x9

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 112
    move-result v0

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 116
    move-result v0

    .line 117
    int-to-long v0, v0

    .line 118
    shl-long/2addr v0, v6

    .line 119
    xor-long/2addr v7, v0

    .line 120
    .line 121
    .line 122
    :pswitch_6
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 123
    move-result v0

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 127
    move-result v0

    .line 128
    int-to-long v0, v0

    .line 129
    xor-long/2addr v7, v0

    .line 130
    .line 131
    .line 132
    :pswitch_7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 133
    move-result-wide v0

    .line 134
    goto :goto_6

    .line 135
    :pswitch_8
    const/4 v0, 0x6

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 139
    move-result v0

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 143
    move-result v0

    .line 144
    int-to-long v9, v0

    .line 145
    shl-long/2addr v9, v5

    .line 146
    goto :goto_0

    .line 147
    :pswitch_9
    move-wide v9, v7

    .line 148
    :goto_0
    const/4 v0, 0x5

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 152
    move-result v0

    .line 153
    .line 154
    .line 155
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 156
    move-result v0

    .line 157
    int-to-long v11, v0

    .line 158
    .line 159
    shl-long v4, v11, v4

    .line 160
    xor-long/2addr v4, v9

    .line 161
    goto :goto_1

    .line 162
    :pswitch_a
    move-wide v4, v7

    .line 163
    :goto_1
    const/4 v0, 0x4

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 167
    move-result v0

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 171
    move-result v0

    .line 172
    int-to-long v9, v0

    .line 173
    shl-long/2addr v9, v3

    .line 174
    .line 175
    xor-long v3, v4, v9

    .line 176
    goto :goto_2

    .line 177
    :pswitch_b
    move-wide v3, v7

    .line 178
    :goto_2
    const/4 v0, 0x3

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 182
    move-result v0

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 186
    move-result v0

    .line 187
    int-to-long v9, v0

    .line 188
    shl-long/2addr v9, v2

    .line 189
    .line 190
    xor-long v2, v3, v9

    .line 191
    goto :goto_3

    .line 192
    :pswitch_c
    move-wide v2, v7

    .line 193
    :goto_3
    const/4 v0, 0x2

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 197
    move-result v0

    .line 198
    .line 199
    .line 200
    invoke-static {v0}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 201
    move-result v0

    .line 202
    int-to-long v4, v0

    .line 203
    .line 204
    shl-long v0, v4, v1

    .line 205
    xor-long/2addr v0, v2

    .line 206
    goto :goto_4

    .line 207
    :pswitch_d
    move-wide v0, v7

    .line 208
    :goto_4
    const/4 v2, 0x1

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 212
    move-result v2

    .line 213
    .line 214
    .line 215
    invoke-static {v2}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 216
    move-result v2

    .line 217
    int-to-long v2, v2

    .line 218
    shl-long/2addr v2, v6

    .line 219
    xor-long/2addr v0, v2

    .line 220
    goto :goto_5

    .line 221
    :pswitch_e
    move-wide v0, v7

    .line 222
    :goto_5
    const/4 v2, 0x0

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 226
    move-result p1

    .line 227
    .line 228
    .line 229
    invoke-static {p1}, Lcom/google/common/primitives/UnsignedBytes;->toInt(B)I

    .line 230
    move-result p1

    .line 231
    int-to-long v2, p1

    .line 232
    xor-long/2addr v0, v2

    .line 233
    .line 234
    :goto_6
    iget-wide v2, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v1}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->mixK1(J)J

    .line 238
    move-result-wide v0

    .line 239
    xor-long/2addr v0, v2

    .line 240
    .line 241
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h1:J

    .line 242
    .line 243
    iget-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 244
    .line 245
    .line 246
    invoke-static {v7, v8}, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->mixK2(J)J

    .line 247
    move-result-wide v2

    .line 248
    xor-long/2addr v0, v2

    .line 249
    .line 250
    iput-wide v0, p0, Lcom/google/common/hash/Murmur3_128HashFunction$Murmur3_128Hasher;->h2:J

    .line 251
    return-void

    .line 252
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
.end method
