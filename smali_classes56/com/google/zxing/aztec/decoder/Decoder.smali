.class public final Lcom/google/zxing/aztec/decoder/Decoder;
.super Ljava/lang/Object;
.source "Decoder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/zxing/aztec/decoder/Decoder$Table;
    }
.end annotation


# static fields
.field private static final DIGIT_TABLE:[Ljava/lang/String;

.field private static final LOWER_TABLE:[Ljava/lang/String;

.field private static final MIXED_TABLE:[Ljava/lang/String;

.field private static final PUNCT_TABLE:[Ljava/lang/String;

.field private static final UPPER_TABLE:[Ljava/lang/String;


# instance fields
.field private ddata:Lcom/google/zxing/aztec/AztecDetectorResult;


# direct methods
.method static constructor <clinit>()V
    .locals 33

    .line 1
    .line 2
    const-string v31, "CTRL_DL"

    .line 3
    .line 4
    const-string v32, "CTRL_BS"

    .line 5
    .line 6
    const-string v1, "CTRL_PS"

    .line 7
    .line 8
    const-string v2, " "

    .line 9
    .line 10
    const-string v3, "A"

    .line 11
    .line 12
    const-string v4, "B"

    .line 13
    .line 14
    const-string v5, "C"

    .line 15
    .line 16
    const-string v6, "D"

    .line 17
    .line 18
    const-string v7, "E"

    .line 19
    .line 20
    const-string v8, "F"

    .line 21
    .line 22
    const-string v9, "G"

    .line 23
    .line 24
    const-string v10, "H"

    .line 25
    .line 26
    const-string v11, "I"

    .line 27
    .line 28
    const-string v12, "J"

    .line 29
    .line 30
    const-string v13, "K"

    .line 31
    .line 32
    const-string v14, "L"

    .line 33
    .line 34
    const-string v15, "M"

    .line 35
    .line 36
    const-string v16, "N"

    .line 37
    .line 38
    const-string v17, "O"

    .line 39
    .line 40
    const-string v18, "P"

    .line 41
    .line 42
    const-string v19, "Q"

    .line 43
    .line 44
    const-string v20, "R"

    .line 45
    .line 46
    const-string v21, "S"

    .line 47
    .line 48
    const-string v22, "T"

    .line 49
    .line 50
    const-string v23, "U"

    .line 51
    .line 52
    const-string v24, "V"

    .line 53
    .line 54
    const-string v25, "W"

    .line 55
    .line 56
    const-string v26, "X"

    .line 57
    .line 58
    const-string v27, "Y"

    .line 59
    .line 60
    const-string v28, "Z"

    .line 61
    .line 62
    const-string v29, "CTRL_LL"

    .line 63
    .line 64
    const-string v30, "CTRL_ML"

    .line 65
    .line 66
    .line 67
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->UPPER_TABLE:[Ljava/lang/String;

    .line 71
    .line 72
    const-string v31, "CTRL_DL"

    .line 73
    .line 74
    const-string v32, "CTRL_BS"

    .line 75
    .line 76
    const-string v1, "CTRL_PS"

    .line 77
    .line 78
    const-string v2, " "

    .line 79
    .line 80
    const-string v3, "a"

    .line 81
    .line 82
    const-string v4, "b"

    .line 83
    .line 84
    const-string v5, "c"

    .line 85
    .line 86
    const-string v6, "d"

    .line 87
    .line 88
    const-string v7, "e"

    .line 89
    .line 90
    const-string v8, "f"

    .line 91
    .line 92
    const-string v9, "g"

    .line 93
    .line 94
    const-string v10, "h"

    .line 95
    .line 96
    const-string v11, "i"

    .line 97
    .line 98
    const-string v12, "j"

    .line 99
    .line 100
    const-string v13, "k"

    .line 101
    .line 102
    const-string v14, "l"

    .line 103
    .line 104
    const-string v15, "m"

    .line 105
    .line 106
    const-string v16, "n"

    .line 107
    .line 108
    const-string v17, "o"

    .line 109
    .line 110
    const-string v18, "p"

    .line 111
    .line 112
    const-string v19, "q"

    .line 113
    .line 114
    const-string v20, "r"

    .line 115
    .line 116
    const-string v21, "s"

    .line 117
    .line 118
    const-string v22, "t"

    .line 119
    .line 120
    const-string v23, "u"

    .line 121
    .line 122
    const-string v24, "v"

    .line 123
    .line 124
    const-string v25, "w"

    .line 125
    .line 126
    const-string v26, "x"

    .line 127
    .line 128
    const-string v27, "y"

    .line 129
    .line 130
    const-string v28, "z"

    .line 131
    .line 132
    const-string v29, "CTRL_US"

    .line 133
    .line 134
    const-string v30, "CTRL_ML"

    .line 135
    .line 136
    .line 137
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->LOWER_TABLE:[Ljava/lang/String;

    .line 141
    .line 142
    const-string v31, "CTRL_PL"

    .line 143
    .line 144
    const-string v32, "CTRL_BS"

    .line 145
    .line 146
    const-string v1, "CTRL_PS"

    .line 147
    .line 148
    const-string v2, " "

    .line 149
    .line 150
    const-string v3, "\u0001"

    .line 151
    .line 152
    const-string v4, "\u0002"

    .line 153
    .line 154
    const-string v5, "\u0003"

    .line 155
    .line 156
    const-string v6, "\u0004"

    .line 157
    .line 158
    const-string v7, "\u0005"

    .line 159
    .line 160
    const-string v8, "\u0006"

    .line 161
    .line 162
    const-string v9, "\u0007"

    .line 163
    .line 164
    const-string v10, "\u0008"

    .line 165
    .line 166
    const-string v11, "\t"

    .line 167
    .line 168
    const-string v12, "\n"

    .line 169
    .line 170
    const-string v13, "\u000b"

    .line 171
    .line 172
    const-string v14, "\u000c"

    .line 173
    .line 174
    const-string v15, "\r"

    .line 175
    .line 176
    const-string v16, "\u001b"

    .line 177
    .line 178
    const-string v17, "\u001c"

    .line 179
    .line 180
    const-string v18, "\u001d"

    .line 181
    .line 182
    const-string v19, "\u001e"

    .line 183
    .line 184
    const-string v20, "\u001f"

    .line 185
    .line 186
    const-string v21, "@"

    .line 187
    .line 188
    const-string v22, "\\"

    .line 189
    .line 190
    const-string v23, "^"

    .line 191
    .line 192
    const-string v24, "_"

    .line 193
    .line 194
    const-string v25, "`"

    .line 195
    .line 196
    const-string v26, "|"

    .line 197
    .line 198
    const-string v27, "~"

    .line 199
    .line 200
    const-string v28, "\u007f"

    .line 201
    .line 202
    const-string v29, "CTRL_LL"

    .line 203
    .line 204
    const-string v30, "CTRL_UL"

    .line 205
    .line 206
    .line 207
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 208
    move-result-object v0

    .line 209
    .line 210
    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->MIXED_TABLE:[Ljava/lang/String;

    .line 211
    .line 212
    const-string v31, "}"

    .line 213
    .line 214
    const-string v32, "CTRL_UL"

    .line 215
    .line 216
    const-string v1, ""

    .line 217
    .line 218
    const-string v2, "\r"

    .line 219
    .line 220
    const-string v3, "\r\n"

    .line 221
    .line 222
    const-string v4, ". "

    .line 223
    .line 224
    const-string v5, ", "

    .line 225
    .line 226
    const-string v6, ": "

    .line 227
    .line 228
    const-string v7, "!"

    .line 229
    .line 230
    const-string v8, "\""

    .line 231
    .line 232
    const-string v9, "#"

    .line 233
    .line 234
    const-string v10, "$"

    .line 235
    .line 236
    const-string v11, "%"

    .line 237
    .line 238
    const-string v12, "&"

    .line 239
    .line 240
    const-string v13, "\'"

    .line 241
    .line 242
    const-string v14, "("

    .line 243
    .line 244
    const-string v15, ")"

    .line 245
    .line 246
    const-string v16, "*"

    .line 247
    .line 248
    const-string v17, "+"

    .line 249
    .line 250
    const-string v18, ","

    .line 251
    .line 252
    const-string v19, "-"

    .line 253
    .line 254
    const-string v20, "."

    .line 255
    .line 256
    const-string v21, "/"

    .line 257
    .line 258
    const-string v22, ":"

    .line 259
    .line 260
    const-string v23, ";"

    .line 261
    .line 262
    const-string v24, "<"

    .line 263
    .line 264
    const-string v25, "="

    .line 265
    .line 266
    const-string v26, ">"

    .line 267
    .line 268
    const-string v27, "?"

    .line 269
    .line 270
    const-string v28, "["

    .line 271
    .line 272
    const-string v29, "]"

    .line 273
    .line 274
    const-string v30, "{"

    .line 275
    .line 276
    .line 277
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 278
    move-result-object v0

    .line 279
    .line 280
    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->PUNCT_TABLE:[Ljava/lang/String;

    .line 281
    .line 282
    const-string v15, "CTRL_UL"

    .line 283
    .line 284
    const-string v16, "CTRL_US"

    .line 285
    .line 286
    const-string v1, "CTRL_PS"

    .line 287
    .line 288
    const-string v2, " "

    .line 289
    .line 290
    const-string v3, "0"

    .line 291
    .line 292
    const-string v4, "1"

    .line 293
    .line 294
    const-string v5, "2"

    .line 295
    .line 296
    const-string v6, "3"

    .line 297
    .line 298
    const-string v7, "4"

    .line 299
    .line 300
    const-string v8, "5"

    .line 301
    .line 302
    const-string v9, "6"

    .line 303
    .line 304
    const-string v10, "7"

    .line 305
    .line 306
    const-string v11, "8"

    .line 307
    .line 308
    const-string v12, "9"

    .line 309
    .line 310
    const-string v13, ","

    .line 311
    .line 312
    const-string v14, "."

    .line 313
    .line 314
    .line 315
    filled-new-array/range {v1 .. v16}, [Ljava/lang/String;

    .line 316
    move-result-object v0

    .line 317
    .line 318
    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->DIGIT_TABLE:[Ljava/lang/String;

    .line 319
    return-void
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
.end method

.method public static convertBoolArrayToByteArray([Z)[B
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    div-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    new-array v1, v0, [B

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    shl-int/lit8 v3, v2, 0x3

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v3}, Lcom/google/zxing/aztec/decoder/Decoder;->readByte([ZI)B

    .line 16
    move-result v3

    .line 17
    .line 18
    aput-byte v3, v1, v2

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v1
    .line 23
    .line 24
.end method

.method private correctBits([Z)[Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_6:Lcom/google/zxing/common/reedsolomon/GenericGF;

    .line 12
    const/4 v2, 0x6

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    .line 19
    move-result v0

    .line 20
    .line 21
    const/16 v2, 0x8

    .line 22
    .line 23
    if-gt v0, v2, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_8:Lcom/google/zxing/common/reedsolomon/GenericGF;

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    .line 32
    move-result v0

    .line 33
    .line 34
    const/16 v2, 0x16

    .line 35
    .line 36
    if-gt v0, v2, :cond_2

    .line 37
    .line 38
    sget-object v0, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_10:Lcom/google/zxing/common/reedsolomon/GenericGF;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    sget-object v0, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_12:Lcom/google/zxing/common/reedsolomon/GenericGF;

    .line 44
    .line 45
    const/16 v2, 0xc

    .line 46
    .line 47
    :goto_0
    iget-object v3, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbDatablocks()I

    .line 51
    move-result v3

    .line 52
    array-length v4, p1

    .line 53
    div-int/2addr v4, v2

    .line 54
    .line 55
    if-lt v4, v3, :cond_e

    .line 56
    array-length v5, p1

    .line 57
    rem-int/2addr v5, v2

    .line 58
    .line 59
    new-array v6, v4, [I

    .line 60
    const/4 v7, 0x0

    .line 61
    move v8, v7

    .line 62
    .line 63
    :goto_1
    if-ge v8, v4, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v5, v2}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 67
    move-result v9

    .line 68
    .line 69
    aput v9, v6, v8

    .line 70
    .line 71
    add-int/lit8 v8, v8, 0x1

    .line 72
    add-int/2addr v5, v2

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_3
    :try_start_0
    new-instance p1, Lcom/google/zxing/common/reedsolomon/ReedSolomonDecoder;

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, v0}, Lcom/google/zxing/common/reedsolomon/ReedSolomonDecoder;-><init>(Lcom/google/zxing/common/reedsolomon/GenericGF;)V

    .line 79
    sub-int/2addr v4, v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v6, v4}, Lcom/google/zxing/common/reedsolomon/ReedSolomonDecoder;->decode([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    const/4 p1, 0x1

    .line 84
    .line 85
    shl-int v0, p1, v2

    .line 86
    .line 87
    add-int/lit8 v4, v0, -0x1

    .line 88
    move v5, v7

    .line 89
    move v8, v5

    .line 90
    .line 91
    :goto_2
    if-ge v5, v3, :cond_7

    .line 92
    .line 93
    aget v9, v6, v5

    .line 94
    .line 95
    if-eqz v9, :cond_6

    .line 96
    .line 97
    if-eq v9, v4, :cond_6

    .line 98
    .line 99
    if-eq v9, p1, :cond_4

    .line 100
    .line 101
    add-int/lit8 v10, v0, -0x2

    .line 102
    .line 103
    if-ne v9, v10, :cond_5

    .line 104
    .line 105
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 106
    .line 107
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :cond_6
    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    .line 112
    move-result-object p1

    .line 113
    throw p1

    .line 114
    .line 115
    :cond_7
    mul-int v4, v3, v2

    .line 116
    sub-int/2addr v4, v8

    .line 117
    .line 118
    new-array v4, v4, [Z

    .line 119
    move v5, v7

    .line 120
    move v8, v5

    .line 121
    .line 122
    :goto_3
    if-ge v5, v3, :cond_d

    .line 123
    .line 124
    aget v9, v6, v5

    .line 125
    .line 126
    if-eq v9, p1, :cond_a

    .line 127
    .line 128
    add-int/lit8 v10, v0, -0x2

    .line 129
    .line 130
    if-ne v9, v10, :cond_8

    .line 131
    goto :goto_6

    .line 132
    .line 133
    :cond_8
    add-int/lit8 v10, v2, -0x1

    .line 134
    .line 135
    :goto_4
    if-ltz v10, :cond_c

    .line 136
    .line 137
    add-int/lit8 v11, v8, 0x1

    .line 138
    .line 139
    shl-int v12, p1, v10

    .line 140
    and-int/2addr v12, v9

    .line 141
    .line 142
    if-eqz v12, :cond_9

    .line 143
    move v12, p1

    .line 144
    goto :goto_5

    .line 145
    :cond_9
    move v12, v7

    .line 146
    .line 147
    :goto_5
    aput-boolean v12, v4, v8

    .line 148
    .line 149
    add-int/lit8 v10, v10, -0x1

    .line 150
    move v8, v11

    .line 151
    goto :goto_4

    .line 152
    .line 153
    :cond_a
    :goto_6
    add-int v10, v8, v2

    .line 154
    sub-int/2addr v10, p1

    .line 155
    .line 156
    if-le v9, p1, :cond_b

    .line 157
    move v9, p1

    .line 158
    goto :goto_7

    .line 159
    :cond_b
    move v9, v7

    .line 160
    .line 161
    .line 162
    :goto_7
    invoke-static {v4, v8, v10, v9}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 163
    .line 164
    add-int/lit8 v9, v2, -0x1

    .line 165
    add-int/2addr v8, v9

    .line 166
    .line 167
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 168
    goto :goto_3

    .line 169
    :cond_d
    return-object v4

    .line 170
    :catch_0
    move-exception p1

    .line 171
    .line 172
    .line 173
    invoke-static {p1}, Lcom/google/zxing/FormatException;->getFormatInstance(Ljava/lang/Throwable;)Lcom/google/zxing/FormatException;

    .line 174
    move-result-object p1

    .line 175
    throw p1

    .line 176
    .line 177
    .line 178
    :cond_e
    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    .line 179
    move-result-object p1

    .line 180
    throw p1
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
.end method

.method private extractBits(Lcom/google/zxing/common/BitMatrix;)[Z
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/google/zxing/aztec/AztecDetectorResult;->isCompact()Z

    .line 10
    move-result v2

    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    .line 16
    move-result v3

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/16 v4, 0xb

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    const/16 v4, 0xe

    .line 24
    .line 25
    :goto_0
    shl-int/lit8 v5, v3, 0x2

    .line 26
    add-int/2addr v4, v5

    .line 27
    .line 28
    new-array v5, v4, [I

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v2}, Lcom/google/zxing/aztec/decoder/Decoder;->totalBitsInLayer(IZ)I

    .line 32
    move-result v6

    .line 33
    .line 34
    new-array v6, v6, [Z

    .line 35
    const/4 v8, 0x2

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    :goto_1
    if-ge v9, v4, :cond_2

    .line 41
    .line 42
    aput v9, v5, v9

    .line 43
    .line 44
    add-int/lit8 v9, v9, 0x1

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_1
    add-int/lit8 v9, v4, 0x1

    .line 48
    .line 49
    div-int/lit8 v10, v4, 0x2

    .line 50
    .line 51
    add-int/lit8 v11, v10, -0x1

    .line 52
    .line 53
    div-int/lit8 v11, v11, 0xf

    .line 54
    mul-int/2addr v11, v8

    .line 55
    add-int/2addr v9, v11

    .line 56
    div-int/2addr v9, v8

    .line 57
    const/4 v11, 0x0

    .line 58
    .line 59
    :goto_2
    if-ge v11, v10, :cond_2

    .line 60
    .line 61
    div-int/lit8 v12, v11, 0xf

    .line 62
    add-int/2addr v12, v11

    .line 63
    .line 64
    sub-int v13, v10, v11

    .line 65
    .line 66
    add-int/lit8 v13, v13, -0x1

    .line 67
    .line 68
    sub-int v14, v9, v12

    .line 69
    .line 70
    add-int/lit8 v14, v14, -0x1

    .line 71
    .line 72
    aput v14, v5, v13

    .line 73
    .line 74
    add-int v13, v10, v11

    .line 75
    add-int/2addr v12, v9

    .line 76
    .line 77
    add-int/lit8 v12, v12, 0x1

    .line 78
    .line 79
    aput v12, v5, v13

    .line 80
    .line 81
    add-int/lit8 v11, v11, 0x1

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x0

    .line 85
    .line 86
    :goto_3
    if-ge v9, v3, :cond_6

    .line 87
    .line 88
    sub-int v11, v3, v9

    .line 89
    shl-int/2addr v11, v8

    .line 90
    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    const/16 v12, 0x9

    .line 94
    goto :goto_4

    .line 95
    .line 96
    :cond_3
    const/16 v12, 0xc

    .line 97
    :goto_4
    add-int/2addr v11, v12

    .line 98
    .line 99
    shl-int/lit8 v12, v9, 0x1

    .line 100
    .line 101
    add-int/lit8 v13, v4, -0x1

    .line 102
    sub-int/2addr v13, v12

    .line 103
    const/4 v14, 0x0

    .line 104
    .line 105
    :goto_5
    if-ge v14, v11, :cond_5

    .line 106
    .line 107
    shl-int/lit8 v15, v14, 0x1

    .line 108
    const/4 v7, 0x0

    .line 109
    .line 110
    :goto_6
    if-ge v7, v8, :cond_4

    .line 111
    .line 112
    add-int v16, v10, v15

    .line 113
    .line 114
    add-int v16, v16, v7

    .line 115
    .line 116
    add-int v17, v12, v7

    .line 117
    .line 118
    aget v8, v5, v17

    .line 119
    .line 120
    add-int v18, v12, v14

    .line 121
    .line 122
    aget v0, v5, v18

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v8, v0}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 126
    move-result v0

    .line 127
    .line 128
    aput-boolean v0, v6, v16

    .line 129
    .line 130
    mul-int/lit8 v0, v11, 0x2

    .line 131
    add-int/2addr v0, v10

    .line 132
    add-int/2addr v0, v15

    .line 133
    add-int/2addr v0, v7

    .line 134
    .line 135
    aget v8, v5, v18

    .line 136
    .line 137
    sub-int v16, v13, v7

    .line 138
    .line 139
    move/from16 v18, v0

    .line 140
    .line 141
    aget v0, v5, v16

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v8, v0}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 145
    move-result v0

    .line 146
    .line 147
    aput-boolean v0, v6, v18

    .line 148
    .line 149
    mul-int/lit8 v0, v11, 0x4

    .line 150
    add-int/2addr v0, v10

    .line 151
    add-int/2addr v0, v15

    .line 152
    add-int/2addr v0, v7

    .line 153
    .line 154
    aget v8, v5, v16

    .line 155
    .line 156
    sub-int v16, v13, v14

    .line 157
    .line 158
    move/from16 v18, v0

    .line 159
    .line 160
    aget v0, v5, v16

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v8, v0}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 164
    move-result v0

    .line 165
    .line 166
    aput-boolean v0, v6, v18

    .line 167
    .line 168
    mul-int/lit8 v0, v11, 0x6

    .line 169
    add-int/2addr v0, v10

    .line 170
    add-int/2addr v0, v15

    .line 171
    add-int/2addr v0, v7

    .line 172
    .line 173
    aget v8, v5, v16

    .line 174
    .line 175
    move/from16 v16, v0

    .line 176
    .line 177
    aget v0, v5, v17

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v8, v0}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 181
    move-result v0

    .line 182
    .line 183
    aput-boolean v0, v6, v16

    .line 184
    .line 185
    add-int/lit8 v7, v7, 0x1

    .line 186
    .line 187
    move-object/from16 v0, p0

    .line 188
    const/4 v8, 0x2

    .line 189
    goto :goto_6

    .line 190
    .line 191
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 192
    .line 193
    move-object/from16 v0, p0

    .line 194
    const/4 v8, 0x2

    .line 195
    goto :goto_5

    .line 196
    .line 197
    :cond_5
    shl-int/lit8 v0, v11, 0x3

    .line 198
    add-int/2addr v10, v0

    .line 199
    .line 200
    add-int/lit8 v9, v9, 0x1

    .line 201
    .line 202
    move-object/from16 v0, p0

    .line 203
    const/4 v8, 0x2

    .line 204
    goto :goto_3

    .line 205
    :cond_6
    return-object v6
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
.end method

.method private static getCharacter(Lcom/google/zxing/aztec/decoder/Decoder$Table;I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$1;->$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p0

    .line 7
    .line 8
    aget p0, v0, p0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p0, v0, :cond_4

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p0, v0, :cond_3

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p0, v0, :cond_2

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-eq p0, v0, :cond_1

    .line 21
    const/4 v0, 0x5

    .line 22
    .line 23
    if-ne p0, v0, :cond_0

    .line 24
    .line 25
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder;->DIGIT_TABLE:[Ljava/lang/String;

    .line 26
    .line 27
    aget-object p0, p0, p1

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string p1, "Bad table"

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    throw p0

    .line 37
    .line 38
    :cond_1
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder;->PUNCT_TABLE:[Ljava/lang/String;

    .line 39
    .line 40
    aget-object p0, p0, p1

    .line 41
    return-object p0

    .line 42
    .line 43
    :cond_2
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder;->MIXED_TABLE:[Ljava/lang/String;

    .line 44
    .line 45
    aget-object p0, p0, p1

    .line 46
    return-object p0

    .line 47
    .line 48
    :cond_3
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder;->LOWER_TABLE:[Ljava/lang/String;

    .line 49
    .line 50
    aget-object p0, p0, p1

    .line 51
    return-object p0

    .line 52
    .line 53
    :cond_4
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder;->UPPER_TABLE:[Ljava/lang/String;

    .line 54
    .line 55
    aget-object p0, p0, p1

    .line 56
    return-object p0
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

.method private static getEncodedData([Z)Ljava/lang/String;
    .locals 10

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    sget-object v1, Lcom/google/zxing/aztec/decoder/Decoder$Table;->UPPER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const/16 v3, 0x14

    .line 8
    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 11
    const/4 v3, 0x0

    .line 12
    move-object v4, v1

    .line 13
    move v5, v3

    .line 14
    .line 15
    :goto_0
    if-ge v5, v0, :cond_7

    .line 16
    .line 17
    sget-object v6, Lcom/google/zxing/aztec/decoder/Decoder$Table;->BINARY:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 18
    const/4 v7, 0x5

    .line 19
    .line 20
    if-ne v1, v6, :cond_3

    .line 21
    .line 22
    sub-int v1, v0, v5

    .line 23
    .line 24
    if-lt v1, v7, :cond_7

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v5, v7}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 28
    move-result v1

    .line 29
    .line 30
    add-int/lit8 v6, v5, 0x5

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    sub-int v1, v0, v6

    .line 35
    .line 36
    const/16 v7, 0xb

    .line 37
    .line 38
    if-lt v1, v7, :cond_7

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v6, v7}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 42
    move-result v1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    add-int/lit8 v6, v5, 0x10

    .line 47
    :cond_0
    move v5, v3

    .line 48
    .line 49
    :goto_1
    if-ge v5, v1, :cond_2

    .line 50
    .line 51
    sub-int v7, v0, v6

    .line 52
    .line 53
    const/16 v8, 0x8

    .line 54
    .line 55
    if-ge v7, v8, :cond_1

    .line 56
    move v5, v0

    .line 57
    goto :goto_2

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {p0, v6, v8}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 61
    move-result v7

    .line 62
    int-to-char v7, v7

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    add-int/lit8 v6, v6, 0x8

    .line 68
    .line 69
    add-int/lit8 v5, v5, 0x1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move v5, v6

    .line 72
    :goto_2
    move-object v1, v4

    .line 73
    goto :goto_0

    .line 74
    .line 75
    :cond_3
    sget-object v6, Lcom/google/zxing/aztec/decoder/Decoder$Table;->DIGIT:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 76
    .line 77
    if-ne v1, v6, :cond_4

    .line 78
    const/4 v6, 0x4

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move v6, v7

    .line 81
    .line 82
    :goto_3
    sub-int v8, v0, v5

    .line 83
    .line 84
    if-lt v8, v6, :cond_7

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v5, v6}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 88
    move-result v8

    .line 89
    add-int/2addr v5, v6

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v8}, Lcom/google/zxing/aztec/decoder/Decoder;->getCharacter(Lcom/google/zxing/aztec/decoder/Decoder$Table;I)Ljava/lang/String;

    .line 93
    move-result-object v6

    .line 94
    .line 95
    const-string v8, "CTRL_"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 99
    move-result v8

    .line 100
    .line 101
    if-eqz v8, :cond_6

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 105
    move-result v4

    .line 106
    .line 107
    .line 108
    invoke-static {v4}, Lcom/google/zxing/aztec/decoder/Decoder;->getTable(C)Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 109
    move-result-object v4

    .line 110
    const/4 v7, 0x6

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 114
    move-result v6

    .line 115
    .line 116
    const/16 v7, 0x4c

    .line 117
    .line 118
    if-ne v6, v7, :cond_5

    .line 119
    goto :goto_2

    .line 120
    :cond_5
    move-object v9, v4

    .line 121
    move-object v4, v1

    .line 122
    move-object v1, v9

    .line 123
    goto :goto_0

    .line 124
    .line 125
    .line 126
    :cond_6
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    goto :goto_2

    .line 128
    .line 129
    .line 130
    :cond_7
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    move-result-object p0

    .line 132
    return-object p0
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
.end method

.method private static getTable(C)Lcom/google/zxing/aztec/decoder/Decoder$Table;
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x42

    .line 3
    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/16 v0, 0x44

    .line 7
    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    const/16 v0, 0x50

    .line 11
    .line 12
    if-eq p0, v0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0x4c

    .line 15
    .line 16
    if-eq p0, v0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x4d

    .line 19
    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->UPPER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_0
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->MIXED:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 26
    return-object p0

    .line 27
    .line 28
    :cond_1
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->LOWER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_2
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->PUNCT:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 32
    return-object p0

    .line 33
    .line 34
    :cond_3
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->DIGIT:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    sget-object p0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->BINARY:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    .line 38
    return-object p0
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

.method public static highLevelDecode([Z)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/zxing/aztec/decoder/Decoder;->getEncodedData([Z)Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private static readByte([ZI)B
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    sub-int/2addr v0, p1

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1, v1}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 10
    move-result p0

    .line 11
    :goto_0
    int-to-byte p0, p0

    .line 12
    return p0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    .line 16
    move-result p0

    .line 17
    sub-int/2addr v1, v0

    .line 18
    shl-int/2addr p0, v1

    .line 19
    goto :goto_0
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

.method private static readCode([ZII)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, p1

    .line 3
    .line 4
    :goto_0
    add-int v2, p1, p2

    .line 5
    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    shl-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    aget-boolean v2, p0, v1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    or-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return v0
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
.end method

.method private static totalBitsInLayer(IZ)I
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/16 p1, 0x58

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    const/16 p1, 0x70

    .line 8
    .line 9
    :goto_0
    shl-int/lit8 v0, p0, 0x4

    .line 10
    add-int/2addr p1, v0

    .line 11
    mul-int/2addr p1, p0

    .line 12
    return p1
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
.end method


# virtual methods
.method public decode(Lcom/google/zxing/aztec/AztecDetectorResult;)Lcom/google/zxing/common/DecoderResult;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/zxing/common/DetectorResult;->getBits()Lcom/google/zxing/common/BitMatrix;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/zxing/aztec/decoder/Decoder;->extractBits(Lcom/google/zxing/common/BitMatrix;)[Z

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/google/zxing/aztec/decoder/Decoder;->correctBits([Z)[Z

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lcom/google/zxing/aztec/decoder/Decoder;->convertBoolArrayToByteArray([Z)[B

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/google/zxing/aztec/decoder/Decoder;->getEncodedData([Z)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    new-instance v2, Lcom/google/zxing/common/DecoderResult;

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1, v3, v3}, Lcom/google/zxing/common/DecoderResult;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 29
    array-length p1, p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p1}, Lcom/google/zxing/common/DecoderResult;->setNumBits(I)V

    .line 33
    return-object v2
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
