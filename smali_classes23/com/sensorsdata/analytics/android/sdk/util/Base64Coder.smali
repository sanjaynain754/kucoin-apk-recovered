.class public Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;
.super Ljava/lang/Object;
.source "Base64Coder.java"


# static fields
.field public static final CHARSET_UTF8:Ljava/lang/String; = "UTF-8"

.field private static map1:[C

.field private static map2:[B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const/16 v0, 0x40

    .line 3
    .line 4
    new-array v1, v0, [C

    .line 5
    .line 6
    sput-object v1, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    .line 7
    .line 8
    const/16 v1, 0x80

    .line 9
    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    sput-object v1, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map2:[B

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    const/16 v2, 0x41

    .line 16
    move v3, v1

    .line 17
    .line 18
    :goto_0
    const/16 v4, 0x5a

    .line 19
    .line 20
    if-gt v2, v4, :cond_0

    .line 21
    .line 22
    sget-object v4, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    .line 23
    .line 24
    add-int/lit8 v5, v3, 0x1

    .line 25
    .line 26
    aput-char v2, v4, v3

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    int-to-char v2, v2

    .line 30
    move v3, v5

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    const/16 v2, 0x61

    .line 34
    .line 35
    :goto_1
    const/16 v4, 0x7a

    .line 36
    .line 37
    if-gt v2, v4, :cond_1

    .line 38
    .line 39
    sget-object v4, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    aput-char v2, v4, v3

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    int-to-char v2, v2

    .line 47
    move v3, v5

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_1
    const/16 v2, 0x30

    .line 51
    .line 52
    :goto_2
    const/16 v4, 0x39

    .line 53
    .line 54
    if-gt v2, v4, :cond_2

    .line 55
    .line 56
    sget-object v4, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    .line 57
    .line 58
    add-int/lit8 v5, v3, 0x1

    .line 59
    .line 60
    aput-char v2, v4, v3

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    int-to-char v2, v2

    .line 64
    move v3, v5

    .line 65
    goto :goto_2

    .line 66
    .line 67
    :cond_2
    sget-object v2, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    .line 68
    .line 69
    add-int/lit8 v4, v3, 0x1

    .line 70
    .line 71
    const/16 v5, 0x2b

    .line 72
    .line 73
    aput-char v5, v2, v3

    .line 74
    .line 75
    const/16 v3, 0x2f

    .line 76
    .line 77
    aput-char v3, v2, v4

    .line 78
    move v2, v1

    .line 79
    .line 80
    :goto_3
    sget-object v3, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map2:[B

    .line 81
    array-length v4, v3

    .line 82
    .line 83
    if-ge v2, v4, :cond_3

    .line 84
    const/4 v4, -0x1

    .line 85
    .line 86
    aput-byte v4, v3, v2

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    goto :goto_3

    .line 90
    .line 91
    :cond_3
    :goto_4
    if-ge v1, v0, :cond_4

    .line 92
    .line 93
    sget-object v2, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map2:[B

    .line 94
    .line 95
    sget-object v3, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    .line 96
    .line 97
    aget-char v3, v3, v1

    .line 98
    int-to-byte v4, v1

    .line 99
    .line 100
    aput-byte v4, v2, v3

    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    return-void
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
.end method

.method public constructor <init>()V
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
    .line 19
    .line 20
.end method

.method public static decode(Ljava/lang/String;)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-static {p0}, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->decode([C)[B

    move-result-object p0

    return-object p0
.end method

.method public static decode([C)[B
    .locals 12

    .line 2
    array-length v0, p0

    .line 3
    rem-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_8

    :goto_0
    if-lez v0, :cond_0

    add-int/lit8 v1, v0, -0x1

    .line 4
    aget-char v1, p0, v1

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v0, 0x3

    .line 5
    div-int/lit8 v1, v1, 0x4

    .line 6
    new-array v2, v1, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v3, v0, :cond_7

    add-int/lit8 v5, v3, 0x1

    .line 7
    aget-char v6, p0, v3

    add-int/lit8 v7, v3, 0x2

    .line 8
    aget-char v5, p0, v5

    const/16 v8, 0x41

    if-ge v7, v0, :cond_1

    add-int/lit8 v3, v3, 0x3

    .line 9
    aget-char v7, p0, v7

    goto :goto_2

    :cond_1
    move v3, v7

    move v7, v8

    :goto_2
    if-ge v3, v0, :cond_2

    add-int/lit8 v8, v3, 0x1

    .line 10
    aget-char v3, p0, v3

    move v11, v8

    move v8, v3

    move v3, v11

    .line 11
    :cond_2
    const-string v9, "Illegal character in Base64 encoded data."

    const/16 v10, 0x7f

    if-gt v6, v10, :cond_6

    if-gt v5, v10, :cond_6

    if-gt v7, v10, :cond_6

    if-gt v8, v10, :cond_6

    .line 12
    sget-object v10, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map2:[B

    aget-byte v6, v10, v6

    .line 13
    aget-byte v5, v10, v5

    .line 14
    aget-byte v7, v10, v7

    .line 15
    aget-byte v8, v10, v8

    if-ltz v6, :cond_5

    if-ltz v5, :cond_5

    if-ltz v7, :cond_5

    if-ltz v8, :cond_5

    shl-int/lit8 v6, v6, 0x2

    ushr-int/lit8 v9, v5, 0x4

    or-int/2addr v6, v9

    and-int/lit8 v5, v5, 0xf

    shl-int/lit8 v5, v5, 0x4

    ushr-int/lit8 v9, v7, 0x2

    or-int/2addr v5, v9

    and-int/lit8 v7, v7, 0x3

    shl-int/lit8 v7, v7, 0x6

    or-int/2addr v7, v8

    add-int/lit8 v8, v4, 0x1

    int-to-byte v6, v6

    .line 16
    aput-byte v6, v2, v4

    if-ge v8, v1, :cond_3

    add-int/lit8 v4, v4, 0x2

    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v8

    move v8, v4

    :cond_3
    if-ge v8, v1, :cond_4

    add-int/lit8 v4, v8, 0x1

    int-to-byte v5, v7

    .line 18
    aput-byte v5, v2, v8

    goto :goto_1

    :cond_4
    move v4, v8

    goto :goto_1

    .line 19
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 20
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    return-object v2

    .line 21
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Length of Base64 encoded input string is not a multiple of 4."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static decodeString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->decode(Ljava/lang/String;)[B

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    .line 10
    return-object v0
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

.method public static encode([B)[C
    .locals 1

    .line 1
    array-length v0, p0

    invoke-static {p0, v0}, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->encode([BI)[C

    move-result-object p0

    return-object p0
.end method

.method public static encode([BI)[C
    .locals 11

    mul-int/lit8 v0, p1, 0x4

    add-int/lit8 v0, v0, 0x2

    .line 2
    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v1, p1, 0x2

    .line 3
    div-int/lit8 v1, v1, 0x3

    mul-int/lit8 v1, v1, 0x4

    .line 4
    new-array v1, v1, [C

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, p1, :cond_4

    add-int/lit8 v5, v3, 0x1

    .line 5
    aget-byte v6, p0, v3

    and-int/lit16 v7, v6, 0xff

    if-ge v5, p1, :cond_0

    add-int/lit8 v3, v3, 0x2

    .line 6
    aget-byte v5, p0, v5

    and-int/lit16 v5, v5, 0xff

    goto :goto_1

    :cond_0
    move v3, v5

    move v5, v2

    :goto_1
    if-ge v3, p1, :cond_1

    add-int/lit8 v8, v3, 0x1

    .line 7
    aget-byte v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    goto :goto_2

    :cond_1
    move v8, v3

    move v3, v2

    :goto_2
    ushr-int/lit8 v7, v7, 0x2

    and-int/lit8 v6, v6, 0x3

    shl-int/lit8 v6, v6, 0x4

    ushr-int/lit8 v9, v5, 0x4

    or-int/2addr v6, v9

    and-int/lit8 v5, v5, 0xf

    shl-int/lit8 v5, v5, 0x2

    ushr-int/lit8 v9, v3, 0x6

    or-int/2addr v5, v9

    and-int/lit8 v3, v3, 0x3f

    add-int/lit8 v9, v4, 0x1

    .line 8
    sget-object v10, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->map1:[C

    aget-char v7, v10, v7

    aput-char v7, v1, v4

    add-int/lit8 v7, v4, 0x2

    .line 9
    aget-char v6, v10, v6

    aput-char v6, v1, v9

    const/16 v6, 0x3d

    if-ge v7, v0, :cond_2

    .line 10
    aget-char v5, v10, v5

    goto :goto_3

    :cond_2
    move v5, v6

    :goto_3
    aput-char v5, v1, v7

    add-int/lit8 v5, v4, 0x3

    if-ge v5, v0, :cond_3

    .line 11
    aget-char v6, v10, v3

    :cond_3
    aput-char v6, v1, v5

    add-int/lit8 v4, v4, 0x4

    move v3, v8

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method public static encodeString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "UTF-8"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->encode([B)[C

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object v0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    return-object p0
    .line 24
.end method
