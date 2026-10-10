.class public final Lcom/fasterxml/jackson/core/io/a;
.super Ljava/lang/Object;
.source "BigDecimalParser.java"


# instance fields
.field public final a:[C


# direct methods
.method public constructor <init>([C)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/fasterxml/jackson/core/io/a;->a:[C

    .line 6
    return-void
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

.method public static b(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/a;->c([C)Ljava/math/BigDecimal;

    .line 8
    move-result-object p0

    .line 9
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
.end method

.method public static c([C)Ljava/math/BigDecimal;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    const/16 v1, 0x1f4

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>([C)V

    .line 11
    return-object v0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Lcom/fasterxml/jackson/core/io/a;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/fasterxml/jackson/core/io/a;-><init>([C)V

    .line 19
    .line 20
    div-int/lit8 v0, v0, 0xa

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/a;->e(I)Ljava/math/BigDecimal;

    .line 24
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "Not a valid number representation"

    .line 34
    :cond_1
    array-length v1, p0

    .line 35
    .line 36
    const/16 v2, 0x3e8

    .line 37
    .line 38
    if-gt v1, v2, :cond_2

    .line 39
    .line 40
    new-instance v1, Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0}, Ljava/lang/String;-><init>([C)V

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    new-instance v3, Ljava/lang/String;

    .line 52
    const/4 v4, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v4, v2}, Ljava/util/Arrays;->copyOfRange([CII)[C

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([C)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "(truncated, full length is "

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    array-length p0, p0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string p0, " chars)"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    :goto_1
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    const-string v3, "Value \""

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "\" can not be represented as `java.math.BigDecimal`, reason: "

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 111
    throw p0
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
.end method

.method public static d([CII)Ljava/math/BigDecimal;
    .locals 1

    .line 1
    .line 2
    if-gtz p1, :cond_0

    .line 3
    array-length v0, p0

    .line 4
    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    :cond_0
    add-int/2addr p2, p1

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([CII)[C

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/a;->c([C)Ljava/math/BigDecimal;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
.end method


# virtual methods
.method public final a(IJ)I
    .locals 5

    .line 1
    int-to-long v0, p1

    .line 2
    sub-long/2addr v0, p2

    .line 3
    .line 4
    .line 5
    const-wide/32 v2, 0x7fffffff

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    .line 12
    const-wide/32 v2, -0x80000000

    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-ltz v2, :cond_0

    .line 17
    long-to-int p1, v0

    .line 18
    return p1

    .line 19
    .line 20
    :cond_0
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    const-string v4, "Scale out of range: "

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v0, " while adjusting scale "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string p1, " to exponent "

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 57
    throw v2
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
.end method

.method public final e(I)Ljava/math/BigDecimal;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lcom/fasterxml/jackson/core/io/a;->a:[C

    .line 7
    array-length v2, v2

    .line 8
    const/4 v4, -0x1

    .line 9
    move v6, v4

    .line 10
    move v8, v6

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v12, 0x0

    .line 17
    .line 18
    :goto_0
    if-ge v5, v2, :cond_d

    .line 19
    .line 20
    iget-object v14, v0, Lcom/fasterxml/jackson/core/io/a;->a:[C

    .line 21
    .line 22
    aget-char v14, v14, v5

    .line 23
    .line 24
    const/16 v15, 0x2b

    .line 25
    .line 26
    const-string v3, "Multiple signs in number"

    .line 27
    .line 28
    const/16 v16, 0x1

    .line 29
    .line 30
    const-string v13, "Multiple signs in exponent"

    .line 31
    .line 32
    if-eq v14, v15, :cond_8

    .line 33
    .line 34
    const/16 v15, 0x45

    .line 35
    .line 36
    if-eq v14, v15, :cond_6

    .line 37
    .line 38
    const/16 v15, 0x65

    .line 39
    .line 40
    if-eq v14, v15, :cond_6

    .line 41
    .line 42
    const/16 v15, 0x2d

    .line 43
    .line 44
    if-eq v14, v15, :cond_2

    .line 45
    .line 46
    const/16 v3, 0x2e

    .line 47
    .line 48
    if-eq v14, v3, :cond_0

    .line 49
    .line 50
    if-ltz v8, :cond_b

    .line 51
    .line 52
    if-ne v6, v4, :cond_b

    .line 53
    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    goto :goto_2

    .line 56
    .line 57
    :cond_0
    if-gez v8, :cond_1

    .line 58
    move v8, v5

    .line 59
    goto :goto_2

    .line 60
    .line 61
    :cond_1
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 62
    .line 63
    const-string v2, "Multiple decimal points"

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 67
    throw v1

    .line 68
    .line 69
    :cond_2
    if-ltz v6, :cond_4

    .line 70
    .line 71
    if-nez v10, :cond_3

    .line 72
    .line 73
    :goto_1
    move/from16 v10, v16

    .line 74
    goto :goto_2

    .line 75
    .line 76
    :cond_3
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v13}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v1

    .line 81
    .line 82
    :cond_4
    if-nez v9, :cond_5

    .line 83
    .line 84
    add-int/lit8 v11, v5, 0x1

    .line 85
    .line 86
    move/from16 v9, v16

    .line 87
    move v12, v9

    .line 88
    goto :goto_2

    .line 89
    .line 90
    :cond_5
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 94
    throw v1

    .line 95
    .line 96
    :cond_6
    if-gez v6, :cond_7

    .line 97
    move v6, v5

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :cond_7
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 101
    .line 102
    const-string v2, "Multiple exponent markers"

    .line 103
    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 106
    throw v1

    .line 107
    .line 108
    :cond_8
    if-ltz v6, :cond_a

    .line 109
    .line 110
    if-nez v10, :cond_9

    .line 111
    goto :goto_1

    .line 112
    .line 113
    :cond_9
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 114
    .line 115
    .line 116
    invoke-direct {v1, v13}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v1

    .line 118
    .line 119
    :cond_a
    if-nez v9, :cond_c

    .line 120
    .line 121
    add-int/lit8 v11, v5, 0x1

    .line 122
    .line 123
    move/from16 v9, v16

    .line 124
    .line 125
    :cond_b
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 126
    goto :goto_0

    .line 127
    .line 128
    :cond_c
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 129
    .line 130
    .line 131
    invoke-direct {v1, v3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 132
    throw v1

    .line 133
    .line 134
    :cond_d
    const/16 v16, 0x1

    .line 135
    .line 136
    if-ltz v6, :cond_e

    .line 137
    .line 138
    new-instance v3, Ljava/lang/String;

    .line 139
    .line 140
    iget-object v4, v0, Lcom/fasterxml/jackson/core/io/a;->a:[C

    .line 141
    .line 142
    add-int/lit8 v5, v6, 0x1

    .line 143
    sub-int/2addr v2, v6

    .line 144
    .line 145
    add-int/lit8 v2, v2, -0x1

    .line 146
    .line 147
    .line 148
    invoke-direct {v3, v4, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 149
    .line 150
    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 152
    move-result v3

    .line 153
    int-to-long v4, v3

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v7, v4, v5}, Lcom/fasterxml/jackson/core/io/a;->a(IJ)I

    .line 157
    move-result v7

    .line 158
    move v2, v6

    .line 159
    goto :goto_3

    .line 160
    :cond_e
    const/4 v3, 0x0

    .line 161
    .line 162
    :goto_3
    if-ltz v8, :cond_f

    .line 163
    .line 164
    sub-int v4, v8, v11

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v11, v4, v3, v1}, Lcom/fasterxml/jackson/core/io/a;->f(IIII)Ljava/math/BigDecimal;

    .line 168
    move-result-object v4

    .line 169
    sub-int/2addr v2, v8

    .line 170
    .line 171
    add-int/lit8 v2, v2, -0x1

    .line 172
    .line 173
    add-int/lit8 v8, v8, 0x1

    .line 174
    sub-int/2addr v3, v2

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v8, v2, v3, v1}, Lcom/fasterxml/jackson/core/io/a;->f(IIII)Ljava/math/BigDecimal;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 182
    move-result-object v1

    .line 183
    goto :goto_4

    .line 184
    :cond_f
    sub-int/2addr v2, v11

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v11, v2, v3, v1}, Lcom/fasterxml/jackson/core/io/a;->f(IIII)Ljava/math/BigDecimal;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    :goto_4
    if-eqz v7, :cond_10

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v7}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    :cond_10
    if-eqz v12, :cond_11

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 200
    move-result-object v1

    .line 201
    :cond_11
    return-object v1
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
.end method

.method public final f(IIII)Ljava/math/BigDecimal;
    .locals 2

    .line 1
    .line 2
    if-le p2, p4, :cond_0

    .line 3
    .line 4
    div-int/lit8 v0, p2, 0x2

    .line 5
    .line 6
    add-int v1, p3, p2

    .line 7
    sub-int/2addr v1, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0, v1, p4}, Lcom/fasterxml/jackson/core/io/a;->f(IIII)Ljava/math/BigDecimal;

    .line 11
    move-result-object v1

    .line 12
    add-int/2addr p1, v0

    .line 13
    sub-int/2addr p2, v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/core/io/a;->f(IIII)Ljava/math/BigDecimal;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    .line 24
    :cond_0
    if-nez p2, :cond_1

    .line 25
    .line 26
    sget-object p1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_1
    new-instance p4, Ljava/math/BigDecimal;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/a;->a:[C

    .line 32
    .line 33
    .line 34
    invoke-direct {p4, v0, p1, p2}, Ljava/math/BigDecimal;-><init>([CII)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4, p3}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method
