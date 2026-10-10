.class public final Lcom/geetest/gtc4/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/ByteArrayInputStream;

.field public final b:Lcom/geetest/gtc4/u7;

.field public final c:Lcom/geetest/gtc4/z5;

.field public final d:Lcom/geetest/gtc4/n1;

.field public final e:Lcom/geetest/gtc4/s7;

.field public final f:Lcom/geetest/gtc4/m0;

.field public final g:Lcom/geetest/gtc4/r5;

.field public final h:Lcom/geetest/gtc4/p7;

.field public final i:Lcom/geetest/gtc4/j7;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/p1;->a:Ljava/io/ByteArrayInputStream;

    .line 6
    .line 7
    new-instance v0, Lcom/geetest/gtc4/u7;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/u7;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->b:Lcom/geetest/gtc4/u7;

    .line 13
    .line 14
    new-instance v0, Lcom/geetest/gtc4/z5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/z5;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->c:Lcom/geetest/gtc4/z5;

    .line 20
    .line 21
    new-instance v0, Lcom/geetest/gtc4/n1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/n1;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->d:Lcom/geetest/gtc4/n1;

    .line 27
    .line 28
    new-instance v0, Lcom/geetest/gtc4/s7;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/s7;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 32
    .line 33
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->e:Lcom/geetest/gtc4/s7;

    .line 34
    .line 35
    new-instance v0, Lcom/geetest/gtc4/m0;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/m0;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 39
    .line 40
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->f:Lcom/geetest/gtc4/m0;

    .line 41
    .line 42
    new-instance v0, Lcom/geetest/gtc4/r5;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/r5;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 46
    .line 47
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->g:Lcom/geetest/gtc4/r5;

    .line 48
    .line 49
    new-instance v0, Lcom/geetest/gtc4/p7;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/p7;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 53
    .line 54
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->h:Lcom/geetest/gtc4/p7;

    .line 55
    .line 56
    new-instance v0, Lcom/geetest/gtc4/j7;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/j7;-><init>(Lcom/geetest/gtc4/p1;Ljava/io/ByteArrayInputStream;)V

    .line 60
    .line 61
    iput-object v0, p0, Lcom/geetest/gtc4/p1;->i:Lcom/geetest/gtc4/j7;

    .line 62
    return-void
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
.end method


# virtual methods
.method public final a()Lcom/geetest/gtc4/f3;
    .locals 14

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/p1;->a:Ljava/io/ByteArrayInputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, -0x1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    return-object v1

    .line 12
    .line 13
    :cond_0
    sget-object v3, Lcom/geetest/gtc4/o1;->a:[I

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/geetest/gtc4/p5;->ofByte(I)Lcom/geetest/gtc4/p5;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 21
    move-result v4

    .line 22
    .line 23
    aget v3, v3, v4

    .line 24
    .line 25
    const-wide/16 v4, 0x1

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    const-wide/16 v8, -0x1

    .line 30
    .line 31
    const-string v10, "Unexpected end of stream"

    .line 32
    const/4 v11, 0x0

    .line 33
    const/4 v12, 0x2

    .line 34
    const/4 v13, 0x1

    .line 35
    .line 36
    .line 37
    packed-switch v3, :pswitch_data_0

    .line 38
    .line 39
    new-instance v1, Lcom/geetest/gtc4/q1;

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "Not implemented major type "

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 57
    throw v1

    .line 58
    .line 59
    :pswitch_0
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->h:Lcom/geetest/gtc4/p7;

    .line 60
    .line 61
    new-instance v2, Lcom/geetest/gtc4/o7;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/i0;->a(I)J

    .line 65
    move-result-wide v0

    .line 66
    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, Lcom/geetest/gtc4/o7;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    if-eqz v0, :cond_c

    .line 75
    .line 76
    iget-wide v3, v2, Lcom/geetest/gtc4/o7;->c:J

    .line 77
    .line 78
    const-wide/16 v5, 0x1e

    .line 79
    .line 80
    cmp-long v1, v3, v5

    .line 81
    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    instance-of v1, v0, Lcom/geetest/gtc4/l0;

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    check-cast v0, Lcom/geetest/gtc4/l0;

    .line 89
    .line 90
    iget-object v1, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 94
    move-result v1

    .line 95
    .line 96
    if-ne v1, v12, :cond_3

    .line 97
    .line 98
    iget-object v1, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    check-cast v1, Lcom/geetest/gtc4/f3;

    .line 105
    .line 106
    instance-of v2, v1, Lcom/geetest/gtc4/d6;

    .line 107
    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    iget-object v0, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    check-cast v0, Lcom/geetest/gtc4/f3;

    .line 117
    .line 118
    instance-of v2, v0, Lcom/geetest/gtc4/d6;

    .line 119
    .line 120
    if-eqz v2, :cond_1

    .line 121
    .line 122
    check-cast v1, Lcom/geetest/gtc4/d6;

    .line 123
    .line 124
    check-cast v0, Lcom/geetest/gtc4/d6;

    .line 125
    .line 126
    new-instance v2, Lcom/geetest/gtc4/q6;

    .line 127
    .line 128
    .line 129
    invoke-direct {v2, v1, v0}, Lcom/geetest/gtc4/q6;-><init>(Lcom/geetest/gtc4/d6;Lcom/geetest/gtc4/d6;)V

    .line 130
    return-object v2

    .line 131
    .line 132
    :cond_1
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 133
    .line 134
    const-string v1, "Error decoding RationalNumber: second data item is not a number"

    .line 135
    .line 136
    .line 137
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 138
    throw v0

    .line 139
    .line 140
    :cond_2
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 141
    .line 142
    const-string v1, "Error decoding RationalNumber: first data item is not a number"

    .line 143
    .line 144
    .line 145
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 146
    throw v0

    .line 147
    .line 148
    :cond_3
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 149
    .line 150
    const-string v1, "Error decoding RationalNumber: array size is not 2"

    .line 151
    .line 152
    .line 153
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 154
    throw v0

    .line 155
    .line 156
    :cond_4
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 157
    .line 158
    const-string v1, "Error decoding RationalNumber: not an array"

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 162
    throw v0

    .line 163
    .line 164
    :cond_5
    const-wide/16 v5, 0x26

    .line 165
    .line 166
    cmp-long v1, v3, v5

    .line 167
    .line 168
    if-nez v1, :cond_a

    .line 169
    .line 170
    instance-of v1, v0, Lcom/geetest/gtc4/l0;

    .line 171
    .line 172
    if-eqz v1, :cond_9

    .line 173
    .line 174
    check-cast v0, Lcom/geetest/gtc4/l0;

    .line 175
    .line 176
    iget-object v1, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 180
    move-result v1

    .line 181
    .line 182
    if-ne v1, v12, :cond_8

    .line 183
    .line 184
    iget-object v1, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    check-cast v1, Lcom/geetest/gtc4/f3;

    .line 191
    .line 192
    instance-of v2, v1, Lcom/geetest/gtc4/r7;

    .line 193
    .line 194
    if-eqz v2, :cond_7

    .line 195
    .line 196
    iget-object v0, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 200
    move-result-object v0

    .line 201
    .line 202
    check-cast v0, Lcom/geetest/gtc4/f3;

    .line 203
    .line 204
    instance-of v2, v0, Lcom/geetest/gtc4/r7;

    .line 205
    .line 206
    if-eqz v2, :cond_6

    .line 207
    .line 208
    check-cast v1, Lcom/geetest/gtc4/r7;

    .line 209
    .line 210
    check-cast v0, Lcom/geetest/gtc4/r7;

    .line 211
    .line 212
    new-instance v2, Lcom/geetest/gtc4/k5;

    .line 213
    .line 214
    .line 215
    invoke-direct {v2, v1, v0}, Lcom/geetest/gtc4/k5;-><init>(Lcom/geetest/gtc4/r7;Lcom/geetest/gtc4/r7;)V

    .line 216
    return-object v2

    .line 217
    .line 218
    :cond_6
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 219
    .line 220
    const-string v1, "Error decoding LanguageTaggedString: second data item is not an UnicodeString"

    .line 221
    .line 222
    .line 223
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 224
    throw v0

    .line 225
    .line 226
    :cond_7
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 227
    .line 228
    const-string v1, "Error decoding LanguageTaggedString: first data item is not an UnicodeString"

    .line 229
    .line 230
    .line 231
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 232
    throw v0

    .line 233
    .line 234
    :cond_8
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 235
    .line 236
    const-string v1, "Error decoding LanguageTaggedString: array size is not 2"

    .line 237
    .line 238
    .line 239
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 240
    throw v0

    .line 241
    .line 242
    :cond_9
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 243
    .line 244
    const-string v1, "Error decoding LanguageTaggedString: not an array"

    .line 245
    .line 246
    .line 247
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 248
    throw v0

    .line 249
    :cond_a
    move-object v1, v0

    .line 250
    .line 251
    :goto_0
    iget-object v3, v1, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 252
    .line 253
    if-eqz v3, :cond_b

    .line 254
    move-object v1, v3

    .line 255
    goto :goto_0

    .line 256
    .line 257
    :cond_b
    iput-object v2, v1, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 258
    return-object v0

    .line 259
    .line 260
    :cond_c
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 261
    .line 262
    const-string v1, "Unexpected end of stream: tag without following data item."

    .line 263
    .line 264
    .line 265
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 266
    throw v0

    .line 267
    .line 268
    :pswitch_1
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->i:Lcom/geetest/gtc4/j7;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    sget-object v3, Lcom/geetest/gtc4/i7;->b:[I

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, Lcom/geetest/gtc4/k7;->ofByte(I)Lcom/geetest/gtc4/k7;

    .line 277
    move-result-object v4

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 281
    move-result v4

    .line 282
    .line 283
    aget v3, v3, v4

    .line 284
    .line 285
    const/16 v4, 0x1f

    .line 286
    const/4 v5, 0x5

    .line 287
    .line 288
    const-string v6, "Not implemented"

    .line 289
    const/4 v7, 0x4

    .line 290
    const/4 v8, 0x3

    .line 291
    .line 292
    const/16 v9, 0x8

    .line 293
    .line 294
    .line 295
    packed-switch v3, :pswitch_data_1

    .line 296
    .line 297
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 298
    .line 299
    .line 300
    invoke-direct {v0, v6}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 301
    throw v0

    .line 302
    .line 303
    :pswitch_2
    new-instance v0, Lcom/geetest/gtc4/u6;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Lcom/geetest/gtc4/i0;->a()I

    .line 307
    move-result v1

    .line 308
    .line 309
    .line 310
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/u6;-><init>(I)V

    .line 311
    return-object v0

    .line 312
    .line 313
    :pswitch_3
    iget-object v0, v1, Lcom/geetest/gtc4/j7;->e:Lcom/geetest/gtc4/k3;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v9}, Lcom/geetest/gtc4/i0;->c(I)[B

    .line 317
    move-result-object v0

    .line 318
    .line 319
    aget-byte v1, v0, v11

    .line 320
    .line 321
    and-int/lit16 v1, v1, 0xff

    .line 322
    int-to-long v1, v1

    .line 323
    shl-long/2addr v1, v9

    .line 324
    .line 325
    aget-byte v3, v0, v13

    .line 326
    .line 327
    and-int/lit16 v3, v3, 0xff

    .line 328
    int-to-long v3, v3

    .line 329
    or-long/2addr v1, v3

    .line 330
    shl-long/2addr v1, v9

    .line 331
    .line 332
    aget-byte v3, v0, v12

    .line 333
    .line 334
    and-int/lit16 v3, v3, 0xff

    .line 335
    int-to-long v3, v3

    .line 336
    or-long/2addr v1, v3

    .line 337
    shl-long/2addr v1, v9

    .line 338
    .line 339
    aget-byte v3, v0, v8

    .line 340
    .line 341
    and-int/lit16 v3, v3, 0xff

    .line 342
    int-to-long v3, v3

    .line 343
    or-long/2addr v1, v3

    .line 344
    shl-long/2addr v1, v9

    .line 345
    .line 346
    aget-byte v3, v0, v7

    .line 347
    .line 348
    and-int/lit16 v3, v3, 0xff

    .line 349
    int-to-long v3, v3

    .line 350
    or-long/2addr v1, v3

    .line 351
    shl-long/2addr v1, v9

    .line 352
    .line 353
    aget-byte v3, v0, v5

    .line 354
    .line 355
    and-int/lit16 v3, v3, 0xff

    .line 356
    int-to-long v3, v3

    .line 357
    or-long/2addr v1, v3

    .line 358
    shl-long/2addr v1, v9

    .line 359
    const/4 v3, 0x6

    .line 360
    .line 361
    aget-byte v3, v0, v3

    .line 362
    .line 363
    and-int/lit16 v3, v3, 0xff

    .line 364
    int-to-long v3, v3

    .line 365
    or-long/2addr v1, v3

    .line 366
    shl-long/2addr v1, v9

    .line 367
    const/4 v3, 0x7

    .line 368
    .line 369
    aget-byte v0, v0, v3

    .line 370
    .line 371
    and-int/lit16 v0, v0, 0xff

    .line 372
    int-to-long v3, v0

    .line 373
    .line 374
    or-long v0, v1, v3

    .line 375
    .line 376
    new-instance v2, Lcom/geetest/gtc4/j3;

    .line 377
    .line 378
    .line 379
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 380
    move-result-wide v0

    .line 381
    .line 382
    .line 383
    invoke-direct {v2, v0, v1}, Lcom/geetest/gtc4/j3;-><init>(D)V

    .line 384
    return-object v2

    .line 385
    .line 386
    :pswitch_4
    iget-object v0, v1, Lcom/geetest/gtc4/j7;->d:Lcom/geetest/gtc4/x6;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v7}, Lcom/geetest/gtc4/i0;->c(I)[B

    .line 390
    move-result-object v0

    .line 391
    .line 392
    aget-byte v1, v0, v11

    .line 393
    .line 394
    and-int/lit16 v1, v1, 0xff

    .line 395
    shl-int/2addr v1, v9

    .line 396
    .line 397
    aget-byte v2, v0, v13

    .line 398
    .line 399
    and-int/lit16 v2, v2, 0xff

    .line 400
    or-int/2addr v1, v2

    .line 401
    shl-int/2addr v1, v9

    .line 402
    .line 403
    aget-byte v2, v0, v12

    .line 404
    .line 405
    and-int/lit16 v2, v2, 0xff

    .line 406
    or-int/2addr v1, v2

    .line 407
    shl-int/2addr v1, v9

    .line 408
    .line 409
    aget-byte v0, v0, v8

    .line 410
    .line 411
    and-int/lit16 v0, v0, 0xff

    .line 412
    or-int/2addr v0, v1

    .line 413
    .line 414
    new-instance v1, Lcom/geetest/gtc4/w6;

    .line 415
    .line 416
    .line 417
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 418
    move-result v0

    .line 419
    .line 420
    .line 421
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/w6;-><init>(F)V

    .line 422
    return-object v1

    .line 423
    .line 424
    :pswitch_5
    iget-object v0, v1, Lcom/geetest/gtc4/j7;->c:Lcom/geetest/gtc4/a4;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v12}, Lcom/geetest/gtc4/i0;->c(I)[B

    .line 428
    move-result-object v0

    .line 429
    .line 430
    aget-byte v1, v0, v11

    .line 431
    .line 432
    and-int/lit16 v1, v1, 0xff

    .line 433
    shl-int/2addr v1, v9

    .line 434
    .line 435
    aget-byte v0, v0, v13

    .line 436
    .line 437
    and-int/lit16 v0, v0, 0xff

    .line 438
    or-int/2addr v0, v1

    .line 439
    .line 440
    new-instance v1, Lcom/geetest/gtc4/z3;

    .line 441
    .line 442
    .line 443
    const v3, 0x8000

    .line 444
    and-int/2addr v3, v0

    .line 445
    .line 446
    shr-int/lit8 v3, v3, 0xf

    .line 447
    .line 448
    and-int/lit16 v5, v0, 0x7c00

    .line 449
    .line 450
    shr-int/lit8 v5, v5, 0xa

    .line 451
    .line 452
    and-int/lit16 v0, v0, 0x3ff

    .line 453
    .line 454
    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    .line 455
    .line 456
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 457
    .line 458
    if-nez v5, :cond_e

    .line 459
    .line 460
    if-eqz v3, :cond_d

    .line 461
    goto :goto_1

    .line 462
    :cond_d
    move v2, v13

    .line 463
    :goto_1
    int-to-double v2, v2

    .line 464
    .line 465
    const-wide/high16 v4, -0x3fd4000000000000L    # -14.0

    .line 466
    .line 467
    .line 468
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 469
    move-result-wide v4

    .line 470
    mul-double/2addr v4, v2

    .line 471
    int-to-double v2, v0

    .line 472
    .line 473
    .line 474
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 475
    move-result-wide v6

    .line 476
    div-double/2addr v2, v6

    .line 477
    :goto_2
    mul-double/2addr v2, v4

    .line 478
    double-to-float v0, v2

    .line 479
    goto :goto_5

    .line 480
    .line 481
    :cond_e
    if-ne v5, v4, :cond_11

    .line 482
    .line 483
    if-eqz v0, :cond_f

    .line 484
    .line 485
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 486
    goto :goto_5

    .line 487
    .line 488
    :cond_f
    if-eqz v3, :cond_10

    .line 489
    goto :goto_3

    .line 490
    :cond_10
    move v2, v13

    .line 491
    :goto_3
    int-to-float v0, v2

    .line 492
    .line 493
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 494
    mul-float/2addr v0, v2

    .line 495
    goto :goto_5

    .line 496
    .line 497
    :cond_11
    if-eqz v3, :cond_12

    .line 498
    goto :goto_4

    .line 499
    :cond_12
    move v2, v13

    .line 500
    :goto_4
    int-to-double v2, v2

    .line 501
    .line 502
    add-int/lit8 v5, v5, -0xf

    .line 503
    int-to-double v4, v5

    .line 504
    .line 505
    .line 506
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 507
    move-result-wide v4

    .line 508
    mul-double/2addr v4, v2

    .line 509
    int-to-double v2, v0

    .line 510
    .line 511
    .line 512
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 513
    move-result-wide v6

    .line 514
    div-double/2addr v2, v6

    .line 515
    .line 516
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 517
    add-double/2addr v2, v6

    .line 518
    goto :goto_2

    .line 519
    .line 520
    .line 521
    :goto_5
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/z3;-><init>(F)V

    .line 522
    return-object v1

    .line 523
    .line 524
    :pswitch_6
    sget-object v1, Lcom/geetest/gtc4/i7;->a:[I

    .line 525
    .line 526
    .line 527
    invoke-static {v0}, Lcom/geetest/gtc4/v6;->ofByte(I)Lcom/geetest/gtc4/v6;

    .line 528
    move-result-object v2

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 532
    move-result v2

    .line 533
    .line 534
    aget v1, v1, v2

    .line 535
    .line 536
    if-eq v1, v13, :cond_17

    .line 537
    .line 538
    if-eq v1, v12, :cond_16

    .line 539
    .line 540
    if-eq v1, v8, :cond_15

    .line 541
    .line 542
    if-eq v1, v7, :cond_14

    .line 543
    .line 544
    if-ne v1, v5, :cond_13

    .line 545
    .line 546
    new-instance v1, Lcom/geetest/gtc4/u6;

    .line 547
    and-int/2addr v0, v4

    .line 548
    .line 549
    .line 550
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/u6;-><init>(I)V

    .line 551
    return-object v1

    .line 552
    .line 553
    :cond_13
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 554
    .line 555
    .line 556
    invoke-direct {v0, v6}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 557
    throw v0

    .line 558
    .line 559
    :cond_14
    sget-object v0, Lcom/geetest/gtc4/u6;->j:Lcom/geetest/gtc4/u6;

    .line 560
    return-object v0

    .line 561
    .line 562
    :cond_15
    sget-object v0, Lcom/geetest/gtc4/u6;->i:Lcom/geetest/gtc4/u6;

    .line 563
    return-object v0

    .line 564
    .line 565
    :cond_16
    sget-object v0, Lcom/geetest/gtc4/u6;->h:Lcom/geetest/gtc4/u6;

    .line 566
    return-object v0

    .line 567
    .line 568
    :cond_17
    sget-object v0, Lcom/geetest/gtc4/u6;->g:Lcom/geetest/gtc4/u6;

    .line 569
    return-object v0

    .line 570
    .line 571
    :pswitch_7
    sget-object v0, Lcom/geetest/gtc4/h7;->d:Lcom/geetest/gtc4/h7;

    .line 572
    return-object v0

    .line 573
    .line 574
    :pswitch_8
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->b:Lcom/geetest/gtc4/u7;

    .line 575
    .line 576
    new-instance v2, Lcom/geetest/gtc4/t7;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/i0;->b(I)Ljava/math/BigInteger;

    .line 580
    move-result-object v0

    .line 581
    .line 582
    .line 583
    invoke-direct {v2, v0}, Lcom/geetest/gtc4/t7;-><init>(Ljava/math/BigInteger;)V

    .line 584
    return-object v2

    .line 585
    .line 586
    :pswitch_9
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->e:Lcom/geetest/gtc4/s7;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/s7;->d(I)Lcom/geetest/gtc4/r7;

    .line 590
    move-result-object v0

    .line 591
    return-object v0

    .line 592
    .line 593
    :pswitch_a
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->c:Lcom/geetest/gtc4/z5;

    .line 594
    .line 595
    new-instance v2, Lcom/geetest/gtc4/y5;

    .line 596
    .line 597
    sget-object v3, Lcom/geetest/gtc4/z5;->c:Ljava/math/BigInteger;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/i0;->b(I)Ljava/math/BigInteger;

    .line 601
    move-result-object v0

    .line 602
    .line 603
    .line 604
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 605
    move-result-object v0

    .line 606
    .line 607
    .line 608
    invoke-direct {v2, v0}, Lcom/geetest/gtc4/y5;-><init>(Ljava/math/BigInteger;)V

    .line 609
    return-object v2

    .line 610
    .line 611
    :pswitch_b
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->g:Lcom/geetest/gtc4/r5;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/i0;->a(I)J

    .line 615
    move-result-wide v2

    .line 616
    .line 617
    cmp-long v0, v2, v8

    .line 618
    .line 619
    if-nez v0, :cond_1b

    .line 620
    .line 621
    new-instance v0, Lcom/geetest/gtc4/q5;

    .line 622
    .line 623
    .line 624
    invoke-direct {v0}, Lcom/geetest/gtc4/q5;-><init>()V

    .line 625
    .line 626
    iput-boolean v13, v0, Lcom/geetest/gtc4/s1;->c:Z

    .line 627
    .line 628
    iget-object v2, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    :cond_18
    :goto_6
    iget-object v2, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v2}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 637
    move-result-object v2

    .line 638
    .line 639
    sget-object v3, Lcom/geetest/gtc4/h7;->d:Lcom/geetest/gtc4/h7;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v3, v2}, Lcom/geetest/gtc4/h7;->equals(Ljava/lang/Object;)Z

    .line 643
    move-result v3

    .line 644
    .line 645
    if-eqz v3, :cond_19

    .line 646
    return-object v0

    .line 647
    .line 648
    :cond_19
    iget-object v3, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v3}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 652
    move-result-object v3

    .line 653
    .line 654
    if-eqz v2, :cond_1a

    .line 655
    .line 656
    if-eqz v3, :cond_1a

    .line 657
    .line 658
    iget-object v4, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    iget-object v4, v0, Lcom/geetest/gtc4/q5;->d:Ljava/util/LinkedHashMap;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v4, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    move-result-object v3

    .line 668
    .line 669
    if-nez v3, :cond_18

    .line 670
    .line 671
    iget-object v3, v0, Lcom/geetest/gtc4/q5;->e:Ljava/util/LinkedList;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 675
    goto :goto_6

    .line 676
    .line 677
    :cond_1a
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 678
    .line 679
    .line 680
    invoke-direct {v0, v10}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 681
    throw v0

    .line 682
    .line 683
    :cond_1b
    new-instance v0, Lcom/geetest/gtc4/q5;

    .line 684
    long-to-int v8, v2

    .line 685
    .line 686
    .line 687
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 688
    move-result v8

    .line 689
    .line 690
    .line 691
    invoke-direct {v0, v8}, Lcom/geetest/gtc4/q5;-><init>(I)V

    .line 692
    .line 693
    :goto_7
    cmp-long v8, v6, v2

    .line 694
    .line 695
    if-gez v8, :cond_1e

    .line 696
    .line 697
    iget-object v8, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v8}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 701
    move-result-object v8

    .line 702
    .line 703
    iget-object v9, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v9}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 707
    move-result-object v9

    .line 708
    .line 709
    if-eqz v8, :cond_1d

    .line 710
    .line 711
    if-eqz v9, :cond_1d

    .line 712
    .line 713
    iget-object v11, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    iget-object v11, v0, Lcom/geetest/gtc4/q5;->d:Ljava/util/LinkedHashMap;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v11, v8, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    move-result-object v9

    .line 723
    .line 724
    if-nez v9, :cond_1c

    .line 725
    .line 726
    iget-object v9, v0, Lcom/geetest/gtc4/q5;->e:Ljava/util/LinkedList;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v9, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 730
    :cond_1c
    add-long/2addr v6, v4

    .line 731
    goto :goto_7

    .line 732
    .line 733
    :cond_1d
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 734
    .line 735
    .line 736
    invoke-direct {v0, v10}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 737
    throw v0

    .line 738
    :cond_1e
    return-object v0

    .line 739
    .line 740
    :pswitch_c
    iget-object v2, p0, Lcom/geetest/gtc4/p1;->d:Lcom/geetest/gtc4/n1;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2, v0}, Lcom/geetest/gtc4/i0;->a(I)J

    .line 744
    move-result-wide v3

    .line 745
    .line 746
    cmp-long v0, v3, v8

    .line 747
    .line 748
    if-nez v0, :cond_24

    .line 749
    .line 750
    iget-object v0, v2, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 756
    .line 757
    .line 758
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 759
    .line 760
    :cond_1f
    :goto_8
    iget-object v3, v2, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v3}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 764
    move-result-object v3

    .line 765
    .line 766
    if-eqz v3, :cond_23

    .line 767
    .line 768
    iget-object v4, v3, Lcom/geetest/gtc4/f3;->a:Lcom/geetest/gtc4/p5;

    .line 769
    .line 770
    sget-object v5, Lcom/geetest/gtc4/h7;->d:Lcom/geetest/gtc4/h7;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v5, v3}, Lcom/geetest/gtc4/h7;->equals(Ljava/lang/Object;)Z

    .line 774
    move-result v5

    .line 775
    .line 776
    if-eqz v5, :cond_20

    .line 777
    .line 778
    new-instance v1, Lcom/geetest/gtc4/m1;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 782
    move-result-object v0

    .line 783
    .line 784
    .line 785
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/m1;-><init>([B)V

    .line 786
    return-object v1

    .line 787
    .line 788
    :cond_20
    sget-object v5, Lcom/geetest/gtc4/p5;->BYTE_STRING:Lcom/geetest/gtc4/p5;

    .line 789
    .line 790
    if-ne v4, v5, :cond_22

    .line 791
    .line 792
    check-cast v3, Lcom/geetest/gtc4/m1;

    .line 793
    .line 794
    iget-object v3, v3, Lcom/geetest/gtc4/m1;->d:[B

    .line 795
    .line 796
    if-nez v3, :cond_21

    .line 797
    move-object v3, v1

    .line 798
    .line 799
    :cond_21
    if-eqz v3, :cond_1f

    .line 800
    array-length v4, v3

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v3, v11, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 804
    goto :goto_8

    .line 805
    .line 806
    :cond_22
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 807
    .line 808
    new-instance v1, Ljava/lang/StringBuilder;

    .line 809
    .line 810
    const-string v2, "Unexpected major type "

    .line 811
    .line 812
    .line 813
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 820
    move-result-object v1

    .line 821
    .line 822
    .line 823
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 824
    throw v0

    .line 825
    .line 826
    :cond_23
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 827
    .line 828
    .line 829
    invoke-direct {v0, v10}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 830
    throw v0

    .line 831
    .line 832
    :cond_24
    new-instance v0, Lcom/geetest/gtc4/m1;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v3, v4}, Lcom/geetest/gtc4/i0;->a(J)[B

    .line 836
    move-result-object v1

    .line 837
    .line 838
    .line 839
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/m1;-><init>([B)V

    .line 840
    return-object v0

    .line 841
    .line 842
    :pswitch_d
    iget-object v1, p0, Lcom/geetest/gtc4/p1;->f:Lcom/geetest/gtc4/m0;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/i0;->a(I)J

    .line 846
    move-result-wide v2

    .line 847
    .line 848
    cmp-long v0, v2, v8

    .line 849
    .line 850
    if-nez v0, :cond_27

    .line 851
    .line 852
    new-instance v0, Lcom/geetest/gtc4/l0;

    .line 853
    .line 854
    .line 855
    invoke-direct {v0}, Lcom/geetest/gtc4/l0;-><init>()V

    .line 856
    .line 857
    iput-boolean v13, v0, Lcom/geetest/gtc4/s1;->c:Z

    .line 858
    .line 859
    iget-object v2, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    :goto_9
    iget-object v2, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v2}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 868
    move-result-object v2

    .line 869
    .line 870
    if-eqz v2, :cond_26

    .line 871
    .line 872
    sget-object v3, Lcom/geetest/gtc4/h7;->d:Lcom/geetest/gtc4/h7;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v3, v2}, Lcom/geetest/gtc4/h7;->equals(Ljava/lang/Object;)Z

    .line 876
    move-result v4

    .line 877
    .line 878
    if-eqz v4, :cond_25

    .line 879
    .line 880
    iget-object v1, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 884
    return-object v0

    .line 885
    .line 886
    :cond_25
    iget-object v3, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 890
    goto :goto_9

    .line 891
    .line 892
    :cond_26
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 893
    .line 894
    .line 895
    invoke-direct {v0, v10}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 896
    throw v0

    .line 897
    .line 898
    :cond_27
    new-instance v0, Lcom/geetest/gtc4/l0;

    .line 899
    long-to-int v8, v2

    .line 900
    .line 901
    .line 902
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 903
    move-result v8

    .line 904
    .line 905
    .line 906
    invoke-direct {v0, v8}, Lcom/geetest/gtc4/l0;-><init>(I)V

    .line 907
    .line 908
    :goto_a
    cmp-long v8, v6, v2

    .line 909
    .line 910
    if-gez v8, :cond_29

    .line 911
    .line 912
    iget-object v8, v1, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v8}, Lcom/geetest/gtc4/p1;->a()Lcom/geetest/gtc4/f3;

    .line 916
    move-result-object v8

    .line 917
    .line 918
    if-eqz v8, :cond_28

    .line 919
    .line 920
    iget-object v9, v0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 924
    add-long/2addr v6, v4

    .line 925
    goto :goto_a

    .line 926
    .line 927
    :cond_28
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 928
    .line 929
    .line 930
    invoke-direct {v0, v10}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 931
    throw v0

    .line 932
    :cond_29
    return-object v0

    .line 933
    :catch_0
    move-exception v0

    .line 934
    .line 935
    new-instance v1, Lcom/geetest/gtc4/q1;

    .line 936
    .line 937
    .line 938
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/Throwable;)V

    .line 939
    throw v1

    .line 940
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
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
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method
