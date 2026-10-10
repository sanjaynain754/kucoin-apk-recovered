.class public Lj7/a;
.super Lj7/b;
.source "NonBlockingJsonParser.java"


# static fields
.field public static final l0:I

.field public static final m0:I

.field public static final n0:I

.field public static final o0:I

.field public static final p0:I

.field public static final q0:I

.field public static final r0:I

.field public static final s0:[I

.field public static final t0:[I


# instance fields
.field public k0:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_TRAILING_COMMA:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Lj7/a;->l0:I

    .line 9
    .line 10
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NUMERIC_LEADING_ZEROS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 14
    move-result v0

    .line 15
    .line 16
    sput v0, Lj7/a;->m0:I

    .line 17
    .line 18
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_MISSING_VALUES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 22
    move-result v0

    .line 23
    .line 24
    sput v0, Lj7/a;->n0:I

    .line 25
    .line 26
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_SINGLE_QUOTES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 30
    move-result v0

    .line 31
    .line 32
    sput v0, Lj7/a;->o0:I

    .line 33
    .line 34
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_UNQUOTED_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 38
    move-result v0

    .line 39
    .line 40
    sput v0, Lj7/a;->p0:I

    .line 41
    .line 42
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 46
    move-result v0

    .line 47
    .line 48
    sput v0, Lj7/a;->q0:I

    .line 49
    .line 50
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_YAML_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 54
    move-result v0

    .line 55
    .line 56
    sput v0, Lj7/a;->r0:I

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->j()[I

    .line 60
    move-result-object v0

    .line 61
    .line 62
    sput-object v0, Lj7/a;->s0:[I

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->h()[I

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sput-object v0, Lj7/a;->t0:[I

    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;ILk7/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lj7/b;-><init>(Lcom/fasterxml/jackson/core/io/d;ILk7/a;)V

    .line 4
    .line 5
    sget-object p1, Lf7/c;->g:[B

    .line 6
    .line 7
    iput-object p1, p0, Lj7/a;->k0:[B

    .line 8
    return-void
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
.method public final A2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 3
    .line 4
    sget v1, Lj7/a;->r0:I

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x23

    .line 10
    .line 11
    const-string v1, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_YAML_COMMENTS\' not enabled for parser)"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 15
    .line 16
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 17
    .line 18
    iget v1, p0, Lf7/b;->t:I

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x37

    .line 23
    .line 24
    iput v0, p0, Lj7/b;->c0:I

    .line 25
    .line 26
    iput p1, p0, Lj7/b;->W:I

    .line 27
    .line 28
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 29
    .line 30
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 34
    .line 35
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    iput v2, p0, Lf7/b;->s:I

    .line 38
    .line 39
    aget-byte v0, v1, v0

    .line 40
    .line 41
    and-int/lit16 v0, v0, 0xff

    .line 42
    .line 43
    const/16 v1, 0x20

    .line 44
    .line 45
    if-ge v0, v1, :cond_0

    .line 46
    .line 47
    const/16 v1, 0xa

    .line 48
    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    iget v0, p0, Lf7/b;->v:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    iput v0, p0, Lf7/b;->v:I

    .line 56
    .line 57
    iput v2, p0, Lf7/b;->w:I

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_2
    const/16 v1, 0xd

    .line 61
    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    iget v0, p0, Lj7/b;->h0:I

    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    iput v0, p0, Lj7/b;->h0:I

    .line 69
    .line 70
    iput v2, p0, Lf7/b;->w:I

    .line 71
    .line 72
    .line 73
    :goto_1
    invoke-virtual {p0, p1}, Lj7/a;->T2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    .line 77
    :cond_3
    const/16 v1, 0x9

    .line 78
    .line 79
    if-eq v0, v1, :cond_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 83
    goto :goto_0
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
.end method

.method public B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    :goto_0
    iget v1, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget v2, p0, Lf7/b;->t:I

    .line 9
    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    iput p2, p0, Lj7/b;->W:I

    .line 13
    .line 14
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    .line 16
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 20
    .line 21
    aget-byte v1, v2, v1

    .line 22
    .line 23
    if-ne p2, v0, :cond_2

    .line 24
    .line 25
    const/16 v0, 0x30

    .line 26
    .line 27
    if-lt v1, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x5d

    .line 30
    .line 31
    if-eq v1, v0, :cond_1

    .line 32
    .line 33
    const/16 v0, 0x7d

    .line 34
    .line 35
    if-ne v1, v0, :cond_3

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0, p3}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 44
    move-result v2

    .line 45
    .line 46
    if-eq v1, v2, :cond_4

    .line 47
    .line 48
    :cond_3
    const/16 p3, 0x32

    .line 49
    .line 50
    iput p3, p0, Lj7/b;->c0:I

    .line 51
    .line 52
    iget-object p3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 53
    const/4 v0, 0x0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p1, v0, p2}, Lcom/fasterxml/jackson/core/util/i;->y(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lj7/a;->v2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    .line 63
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 64
    .line 65
    iget v1, p0, Lf7/b;->s:I

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    iput v1, p0, Lf7/b;->s:I

    .line 70
    goto :goto_0
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

.method public C2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    iput-object p3, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    return-object p3

    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, p1, v0, p2}, Lcom/fasterxml/jackson/core/util/i;->y(Ljava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lj7/a;->w2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public D2(II)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lj7/b;->U1(I)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    move-result v1

    .line 9
    .line 10
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 11
    .line 12
    iget v3, p0, Lf7/b;->t:I

    .line 13
    .line 14
    if-lt v2, v3, :cond_0

    .line 15
    .line 16
    iput p1, p0, Lj7/b;->f0:I

    .line 17
    .line 18
    iput p2, p0, Lj7/b;->W:I

    .line 19
    .line 20
    const/16 p1, 0x13

    .line 21
    .line 22
    iput p1, p0, Lj7/b;->c0:I

    .line 23
    .line 24
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    .line 26
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_0
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 30
    .line 31
    aget-byte v2, v3, v2

    .line 32
    .line 33
    if-ne p2, v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x30

    .line 36
    .line 37
    if-lt v2, v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x5d

    .line 40
    .line 41
    if-eq v2, v1, :cond_1

    .line 42
    .line 43
    const/16 v1, 0x7d

    .line 44
    .line 45
    if-ne v2, v1, :cond_3

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0, p1}, Lj7/b;->f2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v0, p2}, Ljava/lang/String;->charAt(I)C

    .line 54
    move-result v3

    .line 55
    .line 56
    if-eq v2, v3, :cond_4

    .line 57
    .line 58
    :cond_3
    const/16 p1, 0x32

    .line 59
    .line 60
    iput p1, p0, Lj7/b;->c0:I

    .line 61
    .line 62
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 63
    const/4 v1, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v1, p2}, Lcom/fasterxml/jackson/core/util/i;->y(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lj7/a;->v2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    iget v2, p0, Lf7/b;->s:I

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    iput v2, p0, Lf7/b;->s:I

    .line 80
    goto :goto_0
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

.method public E2(II)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lj7/b;->U1(I)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lj7/b;->f2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, p2}, Lcom/fasterxml/jackson/core/util/i;->y(Ljava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lj7/a;->w2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public F2([CI)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lf7/b;->N:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, -0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    iget v1, p0, Lf7/b;->s:I

    .line 10
    .line 11
    iget v2, p0, Lf7/b;->t:I

    .line 12
    .line 13
    if-lt v1, v2, :cond_1

    .line 14
    .line 15
    const/16 p1, 0x1a

    .line 16
    .line 17
    iput p1, p0, Lj7/b;->c0:I

    .line 18
    .line 19
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 23
    .line 24
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    .line 26
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_1
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 30
    .line 31
    aget-byte v2, v2, v1

    .line 32
    .line 33
    and-int/lit16 v2, v2, 0xff

    .line 34
    .line 35
    const/16 v3, 0x30

    .line 36
    .line 37
    if-ge v2, v3, :cond_2

    .line 38
    .line 39
    const/16 v3, 0x2e

    .line 40
    .line 41
    if-ne v2, v3, :cond_3

    .line 42
    add-int/2addr v0, p2

    .line 43
    .line 44
    iput v0, p0, Lf7/b;->O:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    iput v1, p0, Lf7/b;->s:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, p2, v2}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    .line 55
    :cond_2
    const/16 v3, 0x39

    .line 56
    .line 57
    if-le v2, v3, :cond_5

    .line 58
    .line 59
    const/16 v3, 0x65

    .line 60
    .line 61
    if-eq v2, v3, :cond_4

    .line 62
    .line 63
    const/16 v3, 0x45

    .line 64
    .line 65
    if-ne v2, v3, :cond_3

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    add-int/2addr v0, p2

    .line 68
    .line 69
    iput v0, p0, Lf7/b;->O:I

    .line 70
    .line 71
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 75
    .line 76
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_4
    :goto_1
    add-int/2addr v0, p2

    .line 83
    .line 84
    iput v0, p0, Lf7/b;->O:I

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    iput v1, p0, Lf7/b;->s:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, p2, v2}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    .line 95
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    iput v1, p0, Lf7/b;->s:I

    .line 98
    array-length v1, p1

    .line 99
    .line 100
    if-lt p2, v1, :cond_6

    .line 101
    .line 102
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 106
    move-result-object p1

    .line 107
    .line 108
    :cond_6
    add-int/lit8 v1, p2, 0x1

    .line 109
    int-to-char v2, v2

    .line 110
    .line 111
    aput-char v2, p1, p2

    .line 112
    move p2, v1

    .line 113
    goto :goto_0
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

.method public G2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x19

    .line 9
    .line 10
    iput v0, p0, Lj7/b;->c0:I

    .line 11
    .line 12
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, Lf7/b;->s:I

    .line 22
    .line 23
    aget-byte v0, v1, v0

    .line 24
    .line 25
    and-int/lit16 v0, v0, 0xff

    .line 26
    const/4 v1, 0x2

    .line 27
    .line 28
    const/16 v2, 0x2d

    .line 29
    const/4 v3, 0x0

    .line 30
    .line 31
    const/16 v4, 0x30

    .line 32
    const/4 v5, 0x1

    .line 33
    .line 34
    if-ge v0, v4, :cond_1

    .line 35
    .line 36
    const/16 v6, 0x2e

    .line 37
    .line 38
    if-ne v0, v6, :cond_3

    .line 39
    .line 40
    iget-object v6, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 44
    move-result-object v6

    .line 45
    .line 46
    aput-char v2, v6, v3

    .line 47
    .line 48
    aput-char v4, v6, v5

    .line 49
    .line 50
    iput v5, p0, Lf7/b;->O:I

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v6, v1, v0}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    .line 57
    :cond_1
    const/16 v6, 0x39

    .line 58
    .line 59
    if-le v0, v6, :cond_5

    .line 60
    .line 61
    const/16 v6, 0x65

    .line 62
    .line 63
    if-eq v0, v6, :cond_4

    .line 64
    .line 65
    const/16 v6, 0x45

    .line 66
    .line 67
    if-ne v0, v6, :cond_2

    .line 68
    goto :goto_1

    .line 69
    .line 70
    :cond_2
    const/16 v1, 0x5d

    .line 71
    .line 72
    if-eq v0, v1, :cond_3

    .line 73
    .line 74
    const/16 v1, 0x7d

    .line 75
    .line 76
    if-eq v0, v1, :cond_3

    .line 77
    .line 78
    const-string v1, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow \'0\'"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0, v1}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 82
    .line 83
    :cond_3
    iget v0, p0, Lf7/b;->s:I

    .line 84
    sub-int/2addr v0, v5

    .line 85
    .line 86
    iput v0, p0, Lf7/b;->s:I

    .line 87
    .line 88
    const-string v0, "0"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v3, v0}, Lj7/b;->e2(ILjava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    .line 95
    :cond_4
    :goto_1
    iget-object v6, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 99
    move-result-object v6

    .line 100
    .line 101
    aput-char v2, v6, v3

    .line 102
    .line 103
    aput-char v4, v6, v5

    .line 104
    .line 105
    iput v5, p0, Lf7/b;->O:I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v6, v1, v0}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    .line 112
    :cond_5
    iget v6, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 113
    .line 114
    sget v7, Lj7/a;->m0:I

    .line 115
    and-int/2addr v6, v7

    .line 116
    .line 117
    if-nez v6, :cond_6

    .line 118
    .line 119
    const-string v6, "Leading zeroes not allowed"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v6}, Lf7/c;->W0(Ljava/lang/String;)V

    .line 123
    .line 124
    :cond_6
    if-ne v0, v4, :cond_7

    .line 125
    goto :goto_0

    .line 126
    .line 127
    :cond_7
    iget-object v4, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 131
    move-result-object v4

    .line 132
    .line 133
    aput-char v2, v4, v3

    .line 134
    int-to-char v0, v0

    .line 135
    .line 136
    aput-char v0, v4, v5

    .line 137
    .line 138
    iput v5, p0, Lf7/b;->O:I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v4, v1}, Lj7/a;->F2([CI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 142
    move-result-object v0

    .line 143
    return-object v0
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
.end method

.method public H2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    iput v0, p0, Lj7/b;->c0:I

    .line 11
    .line 12
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, Lf7/b;->s:I

    .line 22
    .line 23
    aget-byte v0, v1, v0

    .line 24
    .line 25
    and-int/lit16 v0, v0, 0xff

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    const/16 v2, 0x30

    .line 29
    const/4 v3, 0x1

    .line 30
    .line 31
    if-ge v0, v2, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x2e

    .line 34
    .line 35
    if-ne v0, v4, :cond_3

    .line 36
    .line 37
    iget-object v4, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 41
    move-result-object v4

    .line 42
    .line 43
    aput-char v2, v4, v1

    .line 44
    .line 45
    iput v3, p0, Lf7/b;->O:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4, v3, v0}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    .line 52
    :cond_1
    const/16 v4, 0x39

    .line 53
    .line 54
    if-le v0, v4, :cond_5

    .line 55
    .line 56
    const/16 v4, 0x65

    .line 57
    .line 58
    if-eq v0, v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x45

    .line 61
    .line 62
    if-ne v0, v4, :cond_2

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :cond_2
    const/16 v2, 0x5d

    .line 66
    .line 67
    if-eq v0, v2, :cond_3

    .line 68
    .line 69
    const/16 v2, 0x7d

    .line 70
    .line 71
    if-eq v0, v2, :cond_3

    .line 72
    .line 73
    const-string v2, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow \'0\'"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0, v2}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 77
    .line 78
    :cond_3
    iget v0, p0, Lf7/b;->s:I

    .line 79
    sub-int/2addr v0, v3

    .line 80
    .line 81
    iput v0, p0, Lf7/b;->s:I

    .line 82
    .line 83
    const-string v0, "0"

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1, v0}, Lj7/b;->e2(ILjava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    .line 90
    :cond_4
    :goto_1
    iget-object v4, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 94
    move-result-object v4

    .line 95
    .line 96
    aput-char v2, v4, v1

    .line 97
    .line 98
    iput v3, p0, Lf7/b;->O:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v4, v3, v0}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    .line 105
    :cond_5
    iget v4, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 106
    .line 107
    sget v5, Lj7/a;->m0:I

    .line 108
    and-int/2addr v4, v5

    .line 109
    .line 110
    if-nez v4, :cond_6

    .line 111
    .line 112
    const-string v4, "Leading zeroes not allowed"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v4}, Lf7/c;->W0(Ljava/lang/String;)V

    .line 116
    .line 117
    :cond_6
    if-ne v0, v2, :cond_7

    .line 118
    goto :goto_0

    .line 119
    .line 120
    :cond_7
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 124
    move-result-object v2

    .line 125
    int-to-char v0, v0

    .line 126
    .line 127
    aput-char v0, v2, v1

    .line 128
    .line 129
    iput v3, p0, Lf7/b;->O:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v2, v3}, Lj7/a;->F2([CI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 133
    move-result-object v0

    .line 134
    return-object v0
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
.end method

.method public I2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    const-string v1, "expected digit (0-9) to follow minus sign, for valid numeric value"

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    if-gt p1, v2, :cond_1

    .line 8
    .line 9
    if-ne p1, v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lj7/a;->G2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1, v1}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    const/16 v2, 0x39

    .line 21
    .line 22
    if-le p1, v2, :cond_3

    .line 23
    .line 24
    const/16 v2, 0x49

    .line 25
    .line 26
    if-ne p1, v2, :cond_2

    .line 27
    const/4 p1, 0x3

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Lj7/a;->D2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0, p1, v1}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 36
    .line 37
    :cond_3
    :goto_0
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    .line 44
    const/16 v3, 0x2d

    .line 45
    .line 46
    aput-char v3, v1, v2

    .line 47
    int-to-char p1, p1

    .line 48
    const/4 v2, 0x1

    .line 49
    .line 50
    aput-char p1, v1, v2

    .line 51
    .line 52
    iput v2, p0, Lf7/b;->O:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Lj7/a;->F2([CI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 56
    move-result-object p1

    .line 57
    return-object p1
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
.end method

.method public final J2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lj7/a;->s0:[I

    .line 3
    .line 4
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 5
    .line 6
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 10
    move-result-object v2

    .line 11
    .line 12
    iget-object v3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 16
    move-result v3

    .line 17
    .line 18
    iget v4, p0, Lf7/b;->s:I

    .line 19
    .line 20
    iget v5, p0, Lf7/b;->t:I

    .line 21
    .line 22
    add-int/lit8 v5, v5, -0x5

    .line 23
    .line 24
    :cond_0
    :goto_0
    iget v6, p0, Lf7/b;->t:I

    .line 25
    .line 26
    const/16 v7, 0x28

    .line 27
    .line 28
    if-lt v4, v6, :cond_1

    .line 29
    .line 30
    iput v4, p0, Lf7/b;->s:I

    .line 31
    .line 32
    iput v7, p0, Lj7/b;->c0:I

    .line 33
    .line 34
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 38
    .line 39
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    .line 41
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 42
    return-object v0

    .line 43
    :cond_1
    array-length v6, v2

    .line 44
    const/4 v8, 0x0

    .line 45
    .line 46
    if-lt v3, v6, :cond_2

    .line 47
    .line 48
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 52
    move-result-object v2

    .line 53
    move v3, v8

    .line 54
    .line 55
    :cond_2
    iget v6, p0, Lf7/b;->t:I

    .line 56
    array-length v9, v2

    .line 57
    sub-int/2addr v9, v3

    .line 58
    add-int/2addr v9, v4

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v9}, Ljava/lang/Math;->min(II)I

    .line 62
    move-result v6

    .line 63
    .line 64
    :goto_1
    if-ge v4, v6, :cond_0

    .line 65
    .line 66
    add-int/lit8 v9, v4, 0x1

    .line 67
    .line 68
    aget-byte v10, v1, v4

    .line 69
    .line 70
    and-int/lit16 v10, v10, 0xff

    .line 71
    .line 72
    aget v11, v0, v10

    .line 73
    .line 74
    if-eqz v11, :cond_e

    .line 75
    .line 76
    const/16 v6, 0x22

    .line 77
    .line 78
    if-ne v10, v6, :cond_3

    .line 79
    .line 80
    iput v9, p0, Lf7/b;->s:I

    .line 81
    .line 82
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 86
    .line 87
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :cond_3
    const/4 v6, 0x1

    .line 94
    .line 95
    if-lt v9, v5, :cond_6

    .line 96
    .line 97
    iput v9, p0, Lf7/b;->s:I

    .line 98
    .line 99
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 103
    .line 104
    aget v2, v0, v10

    .line 105
    .line 106
    iget v3, p0, Lf7/b;->t:I

    .line 107
    .line 108
    if-ge v9, v3, :cond_4

    .line 109
    move v8, v6

    .line 110
    .line 111
    .line 112
    :cond_4
    invoke-virtual {p0, v10, v2, v8}, Lj7/a;->j2(IIZ)Z

    .line 113
    move-result v2

    .line 114
    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    iput v7, p0, Lj7/b;->d0:I

    .line 118
    .line 119
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 120
    .line 121
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 122
    return-object v0

    .line 123
    .line 124
    :cond_5
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 128
    move-result-object v2

    .line 129
    .line 130
    iget-object v3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 134
    move-result v3

    .line 135
    .line 136
    iget v4, p0, Lf7/b;->s:I

    .line 137
    goto :goto_0

    .line 138
    .line 139
    :cond_6
    if-eq v11, v6, :cond_c

    .line 140
    const/4 v6, 0x2

    .line 141
    .line 142
    if-eq v11, v6, :cond_b

    .line 143
    const/4 v6, 0x3

    .line 144
    .line 145
    if-eq v11, v6, :cond_a

    .line 146
    const/4 v6, 0x4

    .line 147
    .line 148
    if-eq v11, v6, :cond_8

    .line 149
    .line 150
    const/16 v4, 0x20

    .line 151
    .line 152
    if-ge v10, v4, :cond_7

    .line 153
    .line 154
    .line 155
    const-string/jumbo v4, "string value"

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v10, v4}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 159
    goto :goto_2

    .line 160
    .line 161
    .line 162
    :cond_7
    invoke-virtual {p0, v10}, Lj7/b;->W1(I)V

    .line 163
    :goto_2
    move v4, v9

    .line 164
    goto :goto_4

    .line 165
    .line 166
    :cond_8
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 167
    .line 168
    add-int/lit8 v7, v4, 0x2

    .line 169
    .line 170
    aget-byte v9, v6, v9

    .line 171
    .line 172
    add-int/lit8 v11, v4, 0x3

    .line 173
    .line 174
    aget-byte v7, v6, v7

    .line 175
    .line 176
    add-int/lit8 v4, v4, 0x4

    .line 177
    .line 178
    aget-byte v6, v6, v11

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v10, v9, v7, v6}, Lj7/a;->o2(IIII)I

    .line 182
    move-result v6

    .line 183
    .line 184
    add-int/lit8 v7, v3, 0x1

    .line 185
    .line 186
    shr-int/lit8 v9, v6, 0xa

    .line 187
    .line 188
    .line 189
    const v10, 0xd800

    .line 190
    or-int/2addr v9, v10

    .line 191
    int-to-char v9, v9

    .line 192
    .line 193
    aput-char v9, v2, v3

    .line 194
    array-length v3, v2

    .line 195
    .line 196
    if-lt v7, v3, :cond_9

    .line 197
    .line 198
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 202
    move-result-object v2

    .line 203
    move v3, v8

    .line 204
    goto :goto_3

    .line 205
    :cond_9
    move v3, v7

    .line 206
    .line 207
    :goto_3
    and-int/lit16 v6, v6, 0x3ff

    .line 208
    .line 209
    .line 210
    const v7, 0xdc00

    .line 211
    .line 212
    or-int v10, v6, v7

    .line 213
    goto :goto_4

    .line 214
    .line 215
    :cond_a
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 216
    .line 217
    add-int/lit8 v7, v4, 0x2

    .line 218
    .line 219
    aget-byte v9, v6, v9

    .line 220
    .line 221
    add-int/lit8 v4, v4, 0x3

    .line 222
    .line 223
    aget-byte v6, v6, v7

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v10, v9, v6}, Lj7/a;->n2(III)I

    .line 227
    move-result v10

    .line 228
    goto :goto_4

    .line 229
    .line 230
    :cond_b
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 231
    .line 232
    add-int/lit8 v4, v4, 0x2

    .line 233
    .line 234
    aget-byte v6, v6, v9

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v10, v6}, Lj7/a;->m2(II)I

    .line 238
    move-result v10

    .line 239
    goto :goto_4

    .line 240
    .line 241
    :cond_c
    iput v9, p0, Lf7/b;->s:I

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Lj7/a;->h2()I

    .line 245
    move-result v10

    .line 246
    .line 247
    iget v4, p0, Lf7/b;->s:I

    .line 248
    :goto_4
    array-length v6, v2

    .line 249
    .line 250
    if-lt v3, v6, :cond_d

    .line 251
    .line 252
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 256
    move-result-object v2

    .line 257
    goto :goto_5

    .line 258
    :cond_d
    move v8, v3

    .line 259
    .line 260
    :goto_5
    add-int/lit8 v3, v8, 0x1

    .line 261
    int-to-char v6, v10

    .line 262
    .line 263
    aput-char v6, v2, v8

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_e
    add-int/lit8 v4, v3, 0x1

    .line 268
    int-to-char v10, v10

    .line 269
    .line 270
    aput-char v10, v2, v3

    .line 271
    move v3, v4

    .line 272
    move v4, v9

    .line 273
    .line 274
    goto/16 :goto_1
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

.method public final K2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lj7/b;->c0:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_9

    .line 6
    const/4 v2, 0x4

    .line 7
    .line 8
    if-eq v0, v2, :cond_8

    .line 9
    const/4 v2, 0x5

    .line 10
    .line 11
    if-eq v0, v2, :cond_7

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    packed-switch v0, :pswitch_data_1

    .line 18
    .line 19
    .line 20
    packed-switch v0, :pswitch_data_2

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    packed-switch v0, :pswitch_data_3

    .line 25
    .line 26
    const/16 v3, 0x2d

    .line 27
    .line 28
    .line 29
    packed-switch v0, :pswitch_data_4

    .line 30
    .line 31
    .line 32
    packed-switch v0, :pswitch_data_5

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/fasterxml/jackson/core/util/k;->c()V

    .line 36
    const/4 v0, 0x0

    .line 37
    return-object v0

    .line 38
    .line 39
    :pswitch_0
    iget v0, p0, Lj7/b;->W:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    .line 46
    :pswitch_1
    iget v0, p0, Lj7/b;->W:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lj7/a;->u2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    .line 53
    :pswitch_2
    iget v0, p0, Lj7/b;->W:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, v2}, Lj7/a;->t2(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    .line 60
    :pswitch_3
    iget v0, p0, Lj7/b;->W:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0, v1}, Lj7/a;->t2(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    .line 67
    :pswitch_4
    iget v0, p0, Lj7/b;->W:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    .line 74
    .line 75
    :pswitch_5
    invoke-virtual {p0}, Lj7/a;->v2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    .line 79
    .line 80
    :pswitch_6
    invoke-virtual {p0}, Lj7/a;->r2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    .line 84
    :pswitch_7
    iget v0, p0, Lj7/b;->W:I

    .line 85
    .line 86
    iget v1, p0, Lj7/b;->X:I

    .line 87
    .line 88
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 89
    .line 90
    iget v4, p0, Lf7/b;->s:I

    .line 91
    .line 92
    add-int/lit8 v5, v4, 0x1

    .line 93
    .line 94
    iput v5, p0, Lf7/b;->s:I

    .line 95
    .line 96
    aget-byte v2, v2, v4

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0, v1, v2}, Lj7/a;->l2(III)Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-nez v0, :cond_0

    .line 103
    .line 104
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 105
    return-object v0

    .line 106
    .line 107
    :cond_0
    iget v0, p0, Lj7/b;->d0:I

    .line 108
    .line 109
    if-ne v0, v3, :cond_1

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lj7/a;->r2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-virtual {p0}, Lj7/a;->J2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 118
    move-result-object v0

    .line 119
    return-object v0

    .line 120
    .line 121
    :pswitch_8
    iget v0, p0, Lj7/b;->W:I

    .line 122
    .line 123
    iget v1, p0, Lj7/b;->X:I

    .line 124
    .line 125
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 126
    .line 127
    iget v4, p0, Lf7/b;->s:I

    .line 128
    .line 129
    add-int/lit8 v5, v4, 0x1

    .line 130
    .line 131
    iput v5, p0, Lf7/b;->s:I

    .line 132
    .line 133
    aget-byte v2, v2, v4

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0, v1, v2}, Lj7/a;->k2(III)Z

    .line 137
    move-result v0

    .line 138
    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 142
    return-object v0

    .line 143
    .line 144
    :cond_2
    iget v0, p0, Lj7/b;->d0:I

    .line 145
    .line 146
    if-ne v0, v3, :cond_3

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lj7/a;->r2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    .line 153
    .line 154
    :cond_3
    invoke-virtual {p0}, Lj7/a;->J2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    .line 158
    :pswitch_9
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 159
    .line 160
    iget v1, p0, Lj7/b;->W:I

    .line 161
    .line 162
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 163
    .line 164
    iget v4, p0, Lf7/b;->s:I

    .line 165
    .line 166
    add-int/lit8 v5, v4, 0x1

    .line 167
    .line 168
    iput v5, p0, Lf7/b;->s:I

    .line 169
    .line 170
    aget-byte v2, v2, v4

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v1, v2}, Lj7/a;->m2(II)I

    .line 174
    move-result v1

    .line 175
    int-to-char v1, v1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 179
    .line 180
    iget v0, p0, Lj7/b;->d0:I

    .line 181
    .line 182
    if-ne v0, v3, :cond_4

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lj7/a;->r2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    .line 189
    .line 190
    :cond_4
    invoke-virtual {p0}, Lj7/a;->J2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    .line 194
    :pswitch_a
    iget v0, p0, Lj7/b;->Y:I

    .line 195
    .line 196
    iget v1, p0, Lj7/b;->Z:I

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v0, v1}, Lj7/a;->i2(II)I

    .line 200
    move-result v0

    .line 201
    .line 202
    if-gez v0, :cond_5

    .line 203
    .line 204
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 205
    return-object v0

    .line 206
    .line 207
    :cond_5
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 208
    int-to-char v0, v0

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 212
    .line 213
    iget v0, p0, Lj7/b;->d0:I

    .line 214
    .line 215
    if-ne v0, v3, :cond_6

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Lj7/a;->r2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 219
    move-result-object v0

    .line 220
    return-object v0

    .line 221
    .line 222
    .line 223
    :cond_6
    invoke-virtual {p0}, Lj7/a;->J2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    .line 227
    .line 228
    :pswitch_b
    invoke-virtual {p0}, Lj7/a;->J2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    .line 232
    :pswitch_c
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 233
    .line 234
    iget v1, p0, Lf7/b;->s:I

    .line 235
    .line 236
    add-int/lit8 v3, v1, 0x1

    .line 237
    .line 238
    iput v3, p0, Lf7/b;->s:I

    .line 239
    .line 240
    aget-byte v0, v0, v1

    .line 241
    .line 242
    and-int/lit16 v0, v0, 0xff

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v2, v0}, Lj7/a;->y2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 246
    move-result-object v0

    .line 247
    return-object v0

    .line 248
    .line 249
    :pswitch_d
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 250
    .line 251
    iget v2, p0, Lf7/b;->s:I

    .line 252
    .line 253
    add-int/lit8 v3, v2, 0x1

    .line 254
    .line 255
    iput v3, p0, Lf7/b;->s:I

    .line 256
    .line 257
    aget-byte v0, v0, v2

    .line 258
    .line 259
    and-int/lit16 v0, v0, 0xff

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v1, v0}, Lj7/a;->y2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    .line 266
    .line 267
    :pswitch_e
    invoke-virtual {p0}, Lj7/a;->z2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 268
    move-result-object v0

    .line 269
    return-object v0

    .line 270
    .line 271
    :pswitch_f
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 275
    move-result-object v0

    .line 276
    .line 277
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 281
    move-result v1

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0, v0, v1}, Lj7/a;->F2([CI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 285
    move-result-object v0

    .line 286
    return-object v0

    .line 287
    .line 288
    .line 289
    :pswitch_10
    invoke-virtual {p0}, Lj7/a;->G2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    .line 293
    .line 294
    :pswitch_11
    invoke-virtual {p0}, Lj7/a;->H2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 295
    move-result-object v0

    .line 296
    return-object v0

    .line 297
    .line 298
    :pswitch_12
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 299
    .line 300
    iget v1, p0, Lf7/b;->s:I

    .line 301
    .line 302
    add-int/lit8 v2, v1, 0x1

    .line 303
    .line 304
    iput v2, p0, Lf7/b;->s:I

    .line 305
    .line 306
    aget-byte v0, v0, v1

    .line 307
    .line 308
    and-int/lit16 v0, v0, 0xff

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v0}, Lj7/a;->I2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    .line 315
    :pswitch_13
    iget v0, p0, Lj7/b;->f0:I

    .line 316
    .line 317
    iget v1, p0, Lj7/b;->W:I

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v0, v1}, Lj7/a;->D2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 321
    move-result-object v0

    .line 322
    return-object v0

    .line 323
    .line 324
    :pswitch_14
    iget v0, p0, Lj7/b;->W:I

    .line 325
    .line 326
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 327
    .line 328
    const-string v2, "false"

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, v2, v0, v1}, Lj7/a;->B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 332
    move-result-object v0

    .line 333
    return-object v0

    .line 334
    .line 335
    :pswitch_15
    iget v0, p0, Lj7/b;->W:I

    .line 336
    .line 337
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 338
    .line 339
    .line 340
    const-string/jumbo v2, "true"

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0, v2, v0, v1}, Lj7/a;->B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 344
    move-result-object v0

    .line 345
    return-object v0

    .line 346
    .line 347
    :pswitch_16
    iget v0, p0, Lj7/b;->W:I

    .line 348
    .line 349
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 350
    .line 351
    const-string v2, "null"

    .line 352
    .line 353
    .line 354
    invoke-virtual {p0, v2, v0, v1}, Lj7/a;->B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 355
    move-result-object v0

    .line 356
    return-object v0

    .line 357
    .line 358
    :pswitch_17
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 359
    .line 360
    iget v1, p0, Lf7/b;->s:I

    .line 361
    .line 362
    add-int/lit8 v2, v1, 0x1

    .line 363
    .line 364
    iput v2, p0, Lf7/b;->s:I

    .line 365
    .line 366
    aget-byte v0, v0, v1

    .line 367
    .line 368
    and-int/lit16 v0, v0, 0xff

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0, v0}, Lj7/a;->k3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 372
    move-result-object v0

    .line 373
    return-object v0

    .line 374
    .line 375
    :pswitch_18
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 376
    .line 377
    iget v1, p0, Lf7/b;->s:I

    .line 378
    .line 379
    add-int/lit8 v2, v1, 0x1

    .line 380
    .line 381
    iput v2, p0, Lf7/b;->s:I

    .line 382
    .line 383
    aget-byte v0, v0, v1

    .line 384
    .line 385
    and-int/lit16 v0, v0, 0xff

    .line 386
    .line 387
    .line 388
    invoke-virtual {p0, v0}, Lj7/a;->l3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 389
    move-result-object v0

    .line 390
    return-object v0

    .line 391
    .line 392
    :pswitch_19
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 393
    .line 394
    iget v1, p0, Lf7/b;->s:I

    .line 395
    .line 396
    add-int/lit8 v2, v1, 0x1

    .line 397
    .line 398
    iput v2, p0, Lf7/b;->s:I

    .line 399
    .line 400
    aget-byte v0, v0, v1

    .line 401
    .line 402
    and-int/lit16 v0, v0, 0xff

    .line 403
    .line 404
    .line 405
    invoke-virtual {p0, v0}, Lj7/a;->m3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 406
    move-result-object v0

    .line 407
    return-object v0

    .line 408
    .line 409
    :pswitch_1a
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 410
    .line 411
    iget v1, p0, Lf7/b;->s:I

    .line 412
    .line 413
    add-int/lit8 v2, v1, 0x1

    .line 414
    .line 415
    iput v2, p0, Lf7/b;->s:I

    .line 416
    .line 417
    aget-byte v0, v0, v1

    .line 418
    .line 419
    and-int/lit16 v0, v0, 0xff

    .line 420
    .line 421
    .line 422
    invoke-virtual {p0, v0}, Lj7/a;->j3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 423
    move-result-object v0

    .line 424
    return-object v0

    .line 425
    .line 426
    :pswitch_1b
    iget v0, p0, Lj7/b;->U:I

    .line 427
    .line 428
    iget v1, p0, Lj7/b;->W:I

    .line 429
    .line 430
    iget v2, p0, Lj7/b;->X:I

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0, v0, v1, v2}, Lj7/a;->M2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 434
    move-result-object v0

    .line 435
    return-object v0

    .line 436
    .line 437
    :pswitch_1c
    iget v0, p0, Lj7/b;->U:I

    .line 438
    .line 439
    iget v1, p0, Lj7/b;->W:I

    .line 440
    .line 441
    iget v2, p0, Lj7/b;->X:I

    .line 442
    .line 443
    .line 444
    invoke-virtual {p0, v0, v1, v2}, Lj7/a;->q2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 445
    move-result-object v0

    .line 446
    return-object v0

    .line 447
    .line 448
    .line 449
    :pswitch_1d
    invoke-virtual {p0}, Lj7/a;->x2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 450
    move-result-object v0

    .line 451
    return-object v0

    .line 452
    .line 453
    :pswitch_1e
    iget v0, p0, Lj7/b;->U:I

    .line 454
    .line 455
    iget v1, p0, Lj7/b;->W:I

    .line 456
    .line 457
    iget v2, p0, Lj7/b;->X:I

    .line 458
    .line 459
    .line 460
    invoke-virtual {p0, v0, v1, v2}, Lj7/a;->O2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 461
    move-result-object v0

    .line 462
    return-object v0

    .line 463
    .line 464
    :cond_7
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 465
    .line 466
    iget v1, p0, Lf7/b;->s:I

    .line 467
    .line 468
    add-int/lit8 v2, v1, 0x1

    .line 469
    .line 470
    iput v2, p0, Lf7/b;->s:I

    .line 471
    .line 472
    aget-byte v0, v0, v1

    .line 473
    .line 474
    and-int/lit16 v0, v0, 0xff

    .line 475
    .line 476
    .line 477
    invoke-virtual {p0, v0}, Lj7/a;->Y2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 478
    move-result-object v0

    .line 479
    return-object v0

    .line 480
    .line 481
    :cond_8
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 482
    .line 483
    iget v1, p0, Lf7/b;->s:I

    .line 484
    .line 485
    add-int/lit8 v2, v1, 0x1

    .line 486
    .line 487
    iput v2, p0, Lf7/b;->s:I

    .line 488
    .line 489
    aget-byte v0, v0, v1

    .line 490
    .line 491
    and-int/lit16 v0, v0, 0xff

    .line 492
    .line 493
    .line 494
    invoke-virtual {p0, v0}, Lj7/a;->X2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    .line 498
    :cond_9
    iget v0, p0, Lj7/b;->W:I

    .line 499
    .line 500
    .line 501
    invoke-virtual {p0, v0}, Lj7/a;->s2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 502
    move-result-object v0

    .line 503
    return-object v0

    .line 504
    nop

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
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x17
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x1e
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

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
    :pswitch_data_4
    .packed-switch 0x28
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

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
    :pswitch_data_5
    .packed-switch 0x32
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
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

.method public final L2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    iget v1, p0, Lj7/b;->c0:I

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    if-eq v1, v2, :cond_3

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    if-eq v1, v2, :cond_2

    .line 12
    .line 13
    const/16 v2, 0x32

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    packed-switch v1, :pswitch_data_1

    .line 23
    .line 24
    .line 25
    packed-switch v1, :pswitch_data_2

    .line 26
    .line 27
    .line 28
    packed-switch v1, :pswitch_data_3

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    const-string v2, ": was expecting rest of token (internal state: "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget v2, p0, Lj7/b;->c0:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, ")"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    iget-object v2, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, v2}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 58
    return-object v0

    .line 59
    .line 60
    :pswitch_0
    const-string v0, ": was expecting fraction after exponent marker"

    .line 61
    .line 62
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0, v1}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 66
    .line 67
    :pswitch_1
    const-string v0, ": was expecting closing \'*/\' for comment"

    .line 68
    .line 69
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0, v1}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 73
    .line 74
    .line 75
    :pswitch_2
    invoke-virtual {p0}, Lj7/b;->O1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    .line 79
    :pswitch_3
    iput v2, p0, Lf7/b;->Q:I

    .line 80
    .line 81
    :pswitch_4
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    .line 88
    :pswitch_5
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 92
    move-result v0

    .line 93
    .line 94
    iget-boolean v1, p0, Lf7/b;->N:Z

    .line 95
    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    add-int/lit8 v0, v0, -0x1

    .line 99
    .line 100
    :cond_0
    iput v0, p0, Lf7/b;->O:I

    .line 101
    .line 102
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    .line 109
    :pswitch_6
    const-string v0, "0"

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v2, v0}, Lj7/b;->e2(ILjava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    .line 116
    :pswitch_7
    iget v0, p0, Lj7/b;->f0:I

    .line 117
    .line 118
    iget v1, p0, Lj7/b;->W:I

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0, v1}, Lj7/a;->E2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    .line 125
    :pswitch_8
    iget v0, p0, Lj7/b;->W:I

    .line 126
    .line 127
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 128
    .line 129
    const-string v2, "false"

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v2, v0, v1}, Lj7/a;->C2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    .line 136
    :pswitch_9
    iget v0, p0, Lj7/b;->W:I

    .line 137
    .line 138
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 139
    .line 140
    .line 141
    const-string/jumbo v2, "true"

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v2, v0, v1}, Lj7/a;->C2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    .line 148
    :pswitch_a
    iget v0, p0, Lj7/b;->W:I

    .line 149
    .line 150
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 151
    .line 152
    const-string v2, "null"

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v2, v0, v1}, Lj7/a;->C2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    .line 159
    .line 160
    :cond_1
    invoke-virtual {p0}, Lj7/a;->w2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    .line 164
    .line 165
    :cond_2
    invoke-virtual {p0}, Lj7/b;->O1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    .line 169
    .line 170
    :cond_3
    invoke-virtual {p0}, Lj7/b;->O1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 171
    move-result-object v0

    .line 172
    return-object v0

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
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x18
        :pswitch_6
        :pswitch_6
        :pswitch_5
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x1e
        :pswitch_3
        :pswitch_0
        :pswitch_4
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x34
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
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
.end method

.method public final M2(III)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/b;->T:[I

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->k()[I

    .line 6
    move-result-object v1

    .line 7
    .line 8
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 9
    .line 10
    iget v3, p0, Lf7/b;->t:I

    .line 11
    .line 12
    if-lt v2, v3, :cond_0

    .line 13
    .line 14
    iput p1, p0, Lj7/b;->U:I

    .line 15
    .line 16
    iput p2, p0, Lj7/b;->W:I

    .line 17
    .line 18
    iput p3, p0, Lj7/b;->X:I

    .line 19
    .line 20
    const/16 p1, 0xa

    .line 21
    .line 22
    iput p1, p0, Lj7/b;->c0:I

    .line 23
    .line 24
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    .line 26
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_0
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 30
    .line 31
    aget-byte v3, v3, v2

    .line 32
    .line 33
    and-int/lit16 v3, v3, 0xff

    .line 34
    .line 35
    aget v4, v1, v3

    .line 36
    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    if-lez p3, :cond_2

    .line 40
    array-length v1, v0

    .line 41
    .line 42
    if-lt p1, v1, :cond_1

    .line 43
    array-length v1, v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lf7/b;->E1([II)[I

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lj7/b;->T:[I

    .line 50
    .line 51
    :cond_1
    add-int/lit8 v1, p1, 0x1

    .line 52
    .line 53
    aput p2, v0, p1

    .line 54
    move p1, v1

    .line 55
    .line 56
    :cond_2
    iget-object p2, p0, Lj7/b;->S:Lk7/a;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0, p1}, Lk7/a;->z([II)Ljava/lang/String;

    .line 60
    move-result-object p2

    .line 61
    .line 62
    if-nez p2, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0, p1, p3}, Lj7/b;->L1([III)Ljava/lang/String;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0, p2}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    iput v2, p0, Lf7/b;->s:I

    .line 76
    const/4 v2, 0x4

    .line 77
    .line 78
    if-ge p3, v2, :cond_5

    .line 79
    .line 80
    add-int/lit8 p3, p3, 0x1

    .line 81
    .line 82
    shl-int/lit8 p2, p2, 0x8

    .line 83
    or-int/2addr p2, v3

    .line 84
    goto :goto_0

    .line 85
    :cond_5
    array-length p3, v0

    .line 86
    .line 87
    if-lt p1, p3, :cond_6

    .line 88
    array-length p3, v0

    .line 89
    .line 90
    .line 91
    invoke-static {v0, p3}, Lf7/b;->E1([II)[I

    .line 92
    move-result-object v0

    .line 93
    .line 94
    iput-object v0, p0, Lj7/b;->T:[I

    .line 95
    .line 96
    :cond_6
    add-int/lit8 p3, p1, 0x1

    .line 97
    .line 98
    aput p2, v0, p1

    .line 99
    const/4 p1, 0x1

    .line 100
    move p2, p3

    .line 101
    move p3, p1

    .line 102
    move p1, p2

    .line 103
    move p2, v3

    .line 104
    goto :goto_0
.end method

.method public final N2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x23

    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-eq p1, v0, :cond_3

    .line 7
    .line 8
    const/16 v0, 0x27

    .line 9
    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/16 v0, 0x2f

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x5d

    .line 17
    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lj7/b;->M1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, v1}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 32
    .line 33
    sget v1, Lj7/a;->o0:I

    .line 34
    and-int/2addr v0, v1

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v2, v2, v2}, Lj7/a;->q2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    .line 43
    :cond_3
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 44
    .line 45
    sget v3, Lj7/a;->r0:I

    .line 46
    and-int/2addr v0, v3

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    .line 55
    :cond_4
    :goto_0
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 56
    .line 57
    sget v1, Lj7/a;->p0:I

    .line 58
    and-int/2addr v0, v1

    .line 59
    .line 60
    if-nez v0, :cond_5

    .line 61
    int-to-char v0, p1

    .line 62
    .line 63
    .line 64
    const-string/jumbo v1, "was expecting double-quote to start field name"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->k()[I

    .line 71
    move-result-object v0

    .line 72
    .line 73
    aget v0, v0, p1

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    .line 78
    const-string/jumbo v0, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 82
    :cond_6
    const/4 v0, 0x1

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v2, p1, v0}, Lj7/a;->M2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 86
    move-result-object p1

    .line 87
    return-object p1
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
.end method

.method public final O2(III)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/b;->T:[I

    .line 3
    .line 4
    sget-object v1, Lj7/a;->t0:[I

    .line 5
    .line 6
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget v3, p0, Lf7/b;->t:I

    .line 9
    const/4 v4, 0x7

    .line 10
    .line 11
    if-lt v2, v3, :cond_0

    .line 12
    .line 13
    iput p1, p0, Lj7/b;->U:I

    .line 14
    .line 15
    iput p2, p0, Lj7/b;->W:I

    .line 16
    .line 17
    iput p3, p0, Lj7/b;->X:I

    .line 18
    .line 19
    iput v4, p0, Lj7/b;->c0:I

    .line 20
    .line 21
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 22
    .line 23
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_0
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 27
    .line 28
    add-int/lit8 v5, v2, 0x1

    .line 29
    .line 30
    iput v5, p0, Lf7/b;->s:I

    .line 31
    .line 32
    aget-byte v2, v3, v2

    .line 33
    .line 34
    and-int/lit16 v2, v2, 0xff

    .line 35
    .line 36
    aget v3, v1, v2

    .line 37
    const/4 v5, 0x4

    .line 38
    const/4 v6, 0x1

    .line 39
    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    if-ge p3, v5, :cond_1

    .line 43
    .line 44
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 45
    .line 46
    shl-int/lit8 p2, p2, 0x8

    .line 47
    or-int/2addr p2, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    array-length p3, v0

    .line 50
    .line 51
    if-lt p1, p3, :cond_2

    .line 52
    array-length p3, v0

    .line 53
    .line 54
    .line 55
    invoke-static {v0, p3}, Lf7/b;->E1([II)[I

    .line 56
    move-result-object p3

    .line 57
    .line 58
    iput-object p3, p0, Lj7/b;->T:[I

    .line 59
    move-object v0, p3

    .line 60
    .line 61
    :cond_2
    add-int/lit8 p3, p1, 0x1

    .line 62
    .line 63
    aput p2, v0, p1

    .line 64
    :goto_2
    move p1, p3

    .line 65
    move p2, v2

    .line 66
    move p3, v6

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_3
    const/16 v3, 0x22

    .line 70
    .line 71
    if-ne v2, v3, :cond_8

    .line 72
    .line 73
    if-lez p3, :cond_5

    .line 74
    array-length v1, v0

    .line 75
    .line 76
    if-lt p1, v1, :cond_4

    .line 77
    array-length v1, v0

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, Lf7/b;->E1([II)[I

    .line 81
    move-result-object v0

    .line 82
    .line 83
    iput-object v0, p0, Lj7/b;->T:[I

    .line 84
    .line 85
    :cond_4
    add-int/lit8 v1, p1, 0x1

    .line 86
    .line 87
    .line 88
    invoke-static {p2, p3}, Lj7/b;->V1(II)I

    .line 89
    move-result p2

    .line 90
    .line 91
    aput p2, v0, p1

    .line 92
    move p1, v1

    .line 93
    goto :goto_3

    .line 94
    .line 95
    :cond_5
    if-nez p1, :cond_6

    .line 96
    .line 97
    const-string p1, ""

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    .line 104
    :cond_6
    :goto_3
    iget-object p2, p0, Lj7/b;->S:Lk7/a;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v0, p1}, Lk7/a;->z([II)Ljava/lang/String;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    if-nez p2, :cond_7

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0, p1, p3}, Lj7/b;->L1([III)Ljava/lang/String;

    .line 114
    move-result-object p2

    .line 115
    .line 116
    .line 117
    :cond_7
    invoke-virtual {p0, p2}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    .line 121
    :cond_8
    const/16 v3, 0x5c

    .line 122
    .line 123
    const/16 v7, 0x8

    .line 124
    .line 125
    if-eq v2, v3, :cond_9

    .line 126
    .line 127
    const-string v3, "name"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v2, v3}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 131
    goto :goto_4

    .line 132
    .line 133
    .line 134
    :cond_9
    invoke-virtual {p0}, Lj7/a;->g2()I

    .line 135
    move-result v2

    .line 136
    .line 137
    if-gez v2, :cond_a

    .line 138
    .line 139
    iput v7, p0, Lj7/b;->c0:I

    .line 140
    .line 141
    iput v4, p0, Lj7/b;->d0:I

    .line 142
    .line 143
    iput p1, p0, Lj7/b;->U:I

    .line 144
    .line 145
    iput p2, p0, Lj7/b;->W:I

    .line 146
    .line 147
    iput p3, p0, Lj7/b;->X:I

    .line 148
    .line 149
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 150
    .line 151
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 152
    return-object p1

    .line 153
    :cond_a
    :goto_4
    array-length v3, v0

    .line 154
    .line 155
    if-lt p1, v3, :cond_b

    .line 156
    array-length v3, v0

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v3}, Lf7/b;->E1([II)[I

    .line 160
    move-result-object v0

    .line 161
    .line 162
    iput-object v0, p0, Lj7/b;->T:[I

    .line 163
    .line 164
    :cond_b
    const/16 v3, 0x7f

    .line 165
    .line 166
    if-le v2, v3, :cond_f

    .line 167
    const/4 v3, 0x0

    .line 168
    .line 169
    if-lt p3, v5, :cond_c

    .line 170
    .line 171
    add-int/lit8 p3, p1, 0x1

    .line 172
    .line 173
    aput p2, v0, p1

    .line 174
    move p1, p3

    .line 175
    move p2, v3

    .line 176
    move p3, p2

    .line 177
    .line 178
    :cond_c
    const/16 v4, 0x800

    .line 179
    .line 180
    if-ge v2, v4, :cond_d

    .line 181
    .line 182
    shl-int/lit8 p2, p2, 0x8

    .line 183
    .line 184
    shr-int/lit8 v3, v2, 0x6

    .line 185
    .line 186
    or-int/lit16 v3, v3, 0xc0

    .line 187
    or-int/2addr p2, v3

    .line 188
    .line 189
    add-int/lit8 p3, p3, 0x1

    .line 190
    goto :goto_6

    .line 191
    .line 192
    :cond_d
    shl-int/lit8 p2, p2, 0x8

    .line 193
    .line 194
    shr-int/lit8 v4, v2, 0xc

    .line 195
    .line 196
    or-int/lit16 v4, v4, 0xe0

    .line 197
    or-int/2addr p2, v4

    .line 198
    .line 199
    add-int/lit8 p3, p3, 0x1

    .line 200
    .line 201
    if-lt p3, v5, :cond_e

    .line 202
    .line 203
    add-int/lit8 p3, p1, 0x1

    .line 204
    .line 205
    aput p2, v0, p1

    .line 206
    move p1, p3

    .line 207
    move p3, v3

    .line 208
    goto :goto_5

    .line 209
    :cond_e
    move v3, p2

    .line 210
    .line 211
    :goto_5
    shl-int/lit8 p2, v3, 0x8

    .line 212
    .line 213
    shr-int/lit8 v3, v2, 0x6

    .line 214
    .line 215
    and-int/lit8 v3, v3, 0x3f

    .line 216
    .line 217
    or-int/lit16 v3, v3, 0x80

    .line 218
    or-int/2addr p2, v3

    .line 219
    add-int/2addr p3, v6

    .line 220
    .line 221
    :goto_6
    and-int/lit8 v2, v2, 0x3f

    .line 222
    .line 223
    or-int/lit16 v2, v2, 0x80

    .line 224
    .line 225
    :cond_f
    if-ge p3, v5, :cond_10

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_10
    add-int/lit8 p3, p1, 0x1

    .line 230
    .line 231
    aput p2, v0, p1

    .line 232
    .line 233
    goto/16 :goto_2
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
.end method

.method public final P2(II)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 3
    .line 4
    sget-object v1, Lj7/a;->t0:[I

    .line 5
    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    aget-byte v3, v0, p1

    .line 9
    .line 10
    and-int/lit16 v3, v3, 0xff

    .line 11
    .line 12
    aget v4, v1, v3

    .line 13
    const/4 v5, 0x0

    .line 14
    .line 15
    const/16 v6, 0x22

    .line 16
    .line 17
    if-nez v4, :cond_6

    .line 18
    .line 19
    shl-int/lit8 p2, p2, 0x8

    .line 20
    or-int/2addr p2, v3

    .line 21
    .line 22
    add-int/lit8 v3, p1, 0x2

    .line 23
    .line 24
    aget-byte v2, v0, v2

    .line 25
    .line 26
    and-int/lit16 v2, v2, 0xff

    .line 27
    .line 28
    aget v4, v1, v2

    .line 29
    .line 30
    if-nez v4, :cond_4

    .line 31
    .line 32
    shl-int/lit8 p2, p2, 0x8

    .line 33
    or-int/2addr p2, v2

    .line 34
    .line 35
    add-int/lit8 v2, p1, 0x3

    .line 36
    .line 37
    aget-byte v3, v0, v3

    .line 38
    .line 39
    and-int/lit16 v3, v3, 0xff

    .line 40
    .line 41
    aget v4, v1, v3

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    shl-int/lit8 p2, p2, 0x8

    .line 46
    or-int/2addr p2, v3

    .line 47
    const/4 v3, 0x4

    .line 48
    add-int/2addr p1, v3

    .line 49
    .line 50
    aget-byte v0, v0, v2

    .line 51
    .line 52
    and-int/lit16 v0, v0, 0xff

    .line 53
    .line 54
    aget v1, v1, v0

    .line 55
    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v0, p2}, Lj7/a;->Q2(III)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    .line 63
    :cond_0
    if-ne v0, v6, :cond_1

    .line 64
    .line 65
    iput p1, p0, Lf7/b;->s:I

    .line 66
    .line 67
    iget p1, p0, Lj7/b;->V:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, p2, v3}, Lj7/b;->R1(III)Ljava/lang/String;

    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_1
    return-object v5

    .line 74
    .line 75
    :cond_2
    if-ne v3, v6, :cond_3

    .line 76
    .line 77
    iput v2, p0, Lf7/b;->s:I

    .line 78
    .line 79
    iget p1, p0, Lj7/b;->V:I

    .line 80
    const/4 v0, 0x3

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, p2, v0}, Lj7/b;->R1(III)Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :cond_3
    return-object v5

    .line 87
    .line 88
    :cond_4
    if-ne v2, v6, :cond_5

    .line 89
    .line 90
    iput v3, p0, Lf7/b;->s:I

    .line 91
    .line 92
    iget p1, p0, Lj7/b;->V:I

    .line 93
    const/4 v0, 0x2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1, p2, v0}, Lj7/b;->R1(III)Ljava/lang/String;

    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :cond_5
    return-object v5

    .line 100
    .line 101
    :cond_6
    if-ne v3, v6, :cond_7

    .line 102
    .line 103
    iput v2, p0, Lf7/b;->s:I

    .line 104
    .line 105
    iget p1, p0, Lj7/b;->V:I

    .line 106
    const/4 v0, 0x1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1, p2, v0}, Lj7/b;->R1(III)Ljava/lang/String;

    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_7
    return-object v5
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

.method public final Q2(III)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 3
    .line 4
    sget-object v1, Lj7/a;->t0:[I

    .line 5
    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    aget-byte v3, v0, p1

    .line 9
    .line 10
    and-int/lit16 v3, v3, 0xff

    .line 11
    .line 12
    aget v4, v1, v3

    .line 13
    const/4 v5, 0x0

    .line 14
    .line 15
    const/16 v6, 0x22

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    if-ne v3, v6, :cond_0

    .line 20
    .line 21
    iput v2, p0, Lf7/b;->s:I

    .line 22
    .line 23
    iget p1, p0, Lj7/b;->V:I

    .line 24
    const/4 v0, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p3, p2, v0}, Lj7/b;->S1(IIII)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    return-object v5

    .line 31
    .line 32
    :cond_1
    shl-int/lit8 p2, p2, 0x8

    .line 33
    or-int/2addr p2, v3

    .line 34
    .line 35
    add-int/lit8 v3, p1, 0x2

    .line 36
    .line 37
    aget-byte v2, v0, v2

    .line 38
    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    aget v4, v1, v2

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    if-ne v2, v6, :cond_2

    .line 46
    .line 47
    iput v3, p0, Lf7/b;->s:I

    .line 48
    .line 49
    iget p1, p0, Lj7/b;->V:I

    .line 50
    const/4 v0, 0x2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, p3, p2, v0}, Lj7/b;->S1(IIII)Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_2
    return-object v5

    .line 57
    .line 58
    :cond_3
    shl-int/lit8 p2, p2, 0x8

    .line 59
    or-int/2addr p2, v2

    .line 60
    .line 61
    add-int/lit8 v2, p1, 0x3

    .line 62
    .line 63
    aget-byte v3, v0, v3

    .line 64
    .line 65
    and-int/lit16 v3, v3, 0xff

    .line 66
    .line 67
    aget v1, v1, v3

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    if-ne v3, v6, :cond_4

    .line 72
    .line 73
    iput v2, p0, Lf7/b;->s:I

    .line 74
    .line 75
    iget p1, p0, Lj7/b;->V:I

    .line 76
    const/4 v0, 0x3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1, p3, p2, v0}, Lj7/b;->S1(IIII)Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_4
    return-object v5

    .line 83
    .line 84
    :cond_5
    shl-int/lit8 p2, p2, 0x8

    .line 85
    or-int/2addr p2, v3

    .line 86
    const/4 v1, 0x4

    .line 87
    add-int/2addr p1, v1

    .line 88
    .line 89
    aget-byte v0, v0, v2

    .line 90
    .line 91
    and-int/lit16 v0, v0, 0xff

    .line 92
    .line 93
    if-ne v0, v6, :cond_6

    .line 94
    .line 95
    iput p1, p0, Lf7/b;->s:I

    .line 96
    .line 97
    iget p1, p0, Lj7/b;->V:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, p3, p2, v1}, Lj7/b;->S1(IIII)Ljava/lang/String;

    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :cond_6
    return-object v5
    .line 104
.end method

.method public R2(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lf7/b;->w1()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "Unrecognized token \'%s\': was expecting %s"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1, p1, v0}, Lf7/c;->M0(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final S2(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    const/16 v0, 0x20

    .line 3
    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    if-ne p1, v1, :cond_1

    .line 9
    .line 10
    iget p1, p0, Lf7/b;->v:I

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    iput p1, p0, Lf7/b;->v:I

    .line 15
    .line 16
    iget p1, p0, Lf7/b;->s:I

    .line 17
    .line 18
    iput p1, p0, Lf7/b;->w:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_1
    const/16 v1, 0xd

    .line 22
    .line 23
    if-ne p1, v1, :cond_2

    .line 24
    .line 25
    iget p1, p0, Lj7/b;->h0:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    iput p1, p0, Lj7/b;->h0:I

    .line 30
    .line 31
    iget p1, p0, Lf7/b;->s:I

    .line 32
    .line 33
    iput p1, p0, Lf7/b;->w:I

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_2
    const/16 v1, 0x9

    .line 37
    .line 38
    if-eq p1, v1, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lf7/c;->U0(I)V

    .line 42
    .line 43
    :cond_3
    :goto_0
    iget p1, p0, Lf7/b;->s:I

    .line 44
    .line 45
    iget v1, p0, Lf7/b;->t:I

    .line 46
    .line 47
    if-lt p1, v1, :cond_4

    .line 48
    .line 49
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 50
    .line 51
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 52
    const/4 p1, 0x0

    .line 53
    return p1

    .line 54
    .line 55
    :cond_4
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 56
    .line 57
    add-int/lit8 v2, p1, 0x1

    .line 58
    .line 59
    iput v2, p0, Lf7/b;->s:I

    .line 60
    .line 61
    aget-byte p1, v1, p1

    .line 62
    .line 63
    and-int/lit16 p1, p1, 0xff

    .line 64
    .line 65
    if-le p1, v0, :cond_0

    .line 66
    return p1
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

.method public final T2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lj7/b;->c0:I

    .line 9
    .line 10
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 11
    .line 12
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 16
    .line 17
    add-int/lit8 v2, v0, 0x1

    .line 18
    .line 19
    iput v2, p0, Lf7/b;->s:I

    .line 20
    .line 21
    aget-byte v0, v1, v0

    .line 22
    .line 23
    and-int/lit16 v0, v0, 0xff

    .line 24
    const/4 v1, 0x4

    .line 25
    .line 26
    if-eq p1, v1, :cond_2

    .line 27
    const/4 v1, 0x5

    .line 28
    .line 29
    if-eq p1, v1, :cond_1

    .line 30
    .line 31
    .line 32
    packed-switch p1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/fasterxml/jackson/core/util/k;->c()V

    .line 36
    const/4 p1, 0x0

    .line 37
    return-object p1

    .line 38
    .line 39
    .line 40
    :pswitch_0
    invoke-virtual {p0, v0}, Lj7/a;->k3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    .line 44
    .line 45
    :pswitch_1
    invoke-virtual {p0, v0}, Lj7/a;->l3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    .line 49
    .line 50
    :pswitch_2
    invoke-virtual {p0, v0}, Lj7/a;->m3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    .line 54
    .line 55
    :pswitch_3
    invoke-virtual {p0, v0}, Lj7/a;->j3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0, v0}, Lj7/a;->Y2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0, v0}, Lj7/a;->X2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    nop

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
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public U2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget-object v2, Lj7/a;->s0:[I

    .line 11
    .line 12
    iget v3, p0, Lf7/b;->t:I

    .line 13
    array-length v4, v1

    .line 14
    add-int/2addr v4, v0

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 18
    move-result v3

    .line 19
    .line 20
    iget-object v4, p0, Lj7/a;->k0:[B

    .line 21
    const/4 v5, 0x0

    .line 22
    .line 23
    :goto_0
    if-ge v0, v3, :cond_2

    .line 24
    .line 25
    aget-byte v6, v4, v0

    .line 26
    .line 27
    and-int/lit16 v6, v6, 0xff

    .line 28
    .line 29
    const/16 v7, 0x27

    .line 30
    .line 31
    if-ne v6, v7, :cond_0

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    iput v0, p0, Lf7/b;->s:I

    .line 36
    .line 37
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 41
    .line 42
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    .line 49
    :cond_0
    aget v7, v2, v6

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    add-int/lit8 v7, v5, 0x1

    .line 57
    int-to-char v6, v6

    .line 58
    .line 59
    aput-char v6, v1, v5

    .line 60
    move v5, v7

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_2
    :goto_1
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 67
    .line 68
    iput v0, p0, Lf7/b;->s:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lj7/a;->r2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 72
    move-result-object v0

    .line 73
    return-object v0
    .line 74
    .line 75
.end method

.method public final V2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit16 p1, p1, 0xff

    .line 3
    .line 4
    const/16 v0, 0xef

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lj7/b;->c0:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lj7/a;->s2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    .line 18
    :cond_0
    :goto_0
    const/16 v0, 0x20

    .line 19
    .line 20
    if-gt p1, v0, :cond_7

    .line 21
    .line 22
    if-eq p1, v0, :cond_3

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    iget p1, p0, Lf7/b;->v:I

    .line 29
    add-int/2addr p1, v1

    .line 30
    .line 31
    iput p1, p0, Lf7/b;->v:I

    .line 32
    .line 33
    iget p1, p0, Lf7/b;->s:I

    .line 34
    .line 35
    iput p1, p0, Lf7/b;->w:I

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_1
    const/16 v0, 0xd

    .line 39
    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lj7/b;->h0:I

    .line 43
    add-int/2addr p1, v1

    .line 44
    .line 45
    iput p1, p0, Lj7/b;->h0:I

    .line 46
    .line 47
    iget p1, p0, Lf7/b;->s:I

    .line 48
    .line 49
    iput p1, p0, Lf7/b;->w:I

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_2
    const/16 v0, 0x9

    .line 53
    .line 54
    if-eq p1, v0, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lf7/c;->U0(I)V

    .line 58
    .line 59
    :cond_3
    :goto_1
    iget p1, p0, Lf7/b;->s:I

    .line 60
    .line 61
    iget v0, p0, Lf7/b;->t:I

    .line 62
    .line 63
    if-lt p1, v0, :cond_6

    .line 64
    const/4 p1, 0x3

    .line 65
    .line 66
    iput p1, p0, Lj7/b;->c0:I

    .line 67
    .line 68
    iget-boolean p1, p0, Lf7/b;->r:Z

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    const/4 p1, 0x0

    .line 72
    return-object p1

    .line 73
    .line 74
    :cond_4
    iget-boolean p1, p0, Lj7/b;->e0:Z

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lj7/b;->O1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_5
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_6
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 87
    .line 88
    add-int/lit8 v2, p1, 0x1

    .line 89
    .line 90
    iput v2, p0, Lf7/b;->s:I

    .line 91
    .line 92
    aget-byte p1, v0, p1

    .line 93
    .line 94
    and-int/lit16 p1, p1, 0xff

    .line 95
    goto :goto_0

    .line 96
    .line 97
    .line 98
    :cond_7
    invoke-virtual {p0, p1}, Lj7/a;->j3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 99
    move-result-object p1

    .line 100
    return-object p1
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
.end method

.method public W2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x4

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 11
    .line 12
    add-int/lit8 v2, v0, 0x1

    .line 13
    .line 14
    aget-byte v3, v1, v0

    .line 15
    .line 16
    const/16 v4, 0x61

    .line 17
    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x2

    .line 21
    .line 22
    aget-byte v2, v1, v2

    .line 23
    .line 24
    const/16 v4, 0x6c

    .line 25
    .line 26
    if-ne v2, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v2, v0, 0x3

    .line 29
    .line 30
    aget-byte v3, v1, v3

    .line 31
    .line 32
    const/16 v4, 0x73

    .line 33
    .line 34
    if-ne v3, v4, :cond_1

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x4

    .line 37
    .line 38
    aget-byte v2, v1, v2

    .line 39
    .line 40
    const/16 v3, 0x65

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    aget-byte v1, v1, v0

    .line 45
    .line 46
    and-int/lit16 v1, v1, 0xff

    .line 47
    .line 48
    const/16 v2, 0x30

    .line 49
    .line 50
    if-lt v1, v2, :cond_0

    .line 51
    .line 52
    const/16 v2, 0x5d

    .line 53
    .line 54
    if-eq v1, v2, :cond_0

    .line 55
    .line 56
    const/16 v2, 0x7d

    .line 57
    .line 58
    if-ne v1, v2, :cond_1

    .line 59
    .line 60
    :cond_0
    iput v0, p0, Lf7/b;->s:I

    .line 61
    .line 62
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    .line 69
    :cond_1
    const/16 v0, 0x12

    .line 70
    .line 71
    iput v0, p0, Lj7/b;->c0:I

    .line 72
    .line 73
    const-string v0, "false"

    .line 74
    .line 75
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 76
    const/4 v2, 0x1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0, v2, v1}, Lj7/a;->B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 80
    move-result-object v0

    .line 81
    return-object v0
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
.end method

.method public final X2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    if-gt p1, v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lj7/a;->S2(I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    if-gtz p1, :cond_0

    .line 11
    const/4 p1, 0x4

    .line 12
    .line 13
    iput p1, p0, Lj7/b;->c0:I

    .line 14
    .line 15
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    return-object p1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lj7/b;->c2()V

    .line 20
    .line 21
    const/16 v0, 0x22

    .line 22
    .line 23
    if-eq p1, v0, :cond_2

    .line 24
    .line 25
    const/16 v0, 0x7d

    .line 26
    .line 27
    if-ne p1, v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0, p1}, Lj7/a;->N2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    .line 39
    :cond_2
    iget p1, p0, Lf7/b;->s:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0xd

    .line 42
    .line 43
    iget v0, p0, Lf7/b;->t:I

    .line 44
    .line 45
    if-gt p1, v0, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lj7/a;->p2()Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_3
    const/4 p1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, p1, p1}, Lj7/a;->O2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 61
    move-result-object p1

    .line 62
    return-object p1
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

.method public final Y2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    if-gt p1, v1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lj7/a;->S2(I)I

    .line 9
    move-result p1

    .line 10
    .line 11
    if-gtz p1, :cond_0

    .line 12
    .line 13
    iput v0, p0, Lj7/b;->c0:I

    .line 14
    .line 15
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    return-object p1

    .line 17
    .line 18
    :cond_0
    const/16 v2, 0x2c

    .line 19
    .line 20
    const/16 v3, 0x7d

    .line 21
    .line 22
    if-eq p1, v2, :cond_4

    .line 23
    .line 24
    if-ne p1, v3, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_1
    const/16 v2, 0x23

    .line 32
    .line 33
    if-ne p1, v2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_2
    const/16 v2, 0x2f

    .line 41
    .line 42
    if-ne p1, v2, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    .line 49
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string/jumbo v2, "was expecting comma to separate "

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, " entries"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 80
    .line 81
    :cond_4
    iget p1, p0, Lf7/b;->s:I

    .line 82
    .line 83
    iget v0, p0, Lf7/b;->t:I

    .line 84
    const/4 v2, 0x4

    .line 85
    .line 86
    if-lt p1, v0, :cond_5

    .line 87
    .line 88
    iput v2, p0, Lj7/b;->c0:I

    .line 89
    .line 90
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 91
    .line 92
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 93
    return-object p1

    .line 94
    .line 95
    :cond_5
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 96
    .line 97
    aget-byte v0, v0, p1

    .line 98
    .line 99
    add-int/lit8 p1, p1, 0x1

    .line 100
    .line 101
    iput p1, p0, Lf7/b;->s:I

    .line 102
    .line 103
    if-gt v0, v1, :cond_6

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lj7/a;->S2(I)I

    .line 107
    move-result v0

    .line 108
    .line 109
    if-gtz v0, :cond_6

    .line 110
    .line 111
    iput v2, p0, Lj7/b;->c0:I

    .line 112
    .line 113
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 114
    return-object p1

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-virtual {p0}, Lj7/b;->c2()V

    .line 118
    .line 119
    const/16 p1, 0x22

    .line 120
    .line 121
    if-eq v0, p1, :cond_8

    .line 122
    .line 123
    if-ne v0, v3, :cond_7

    .line 124
    .line 125
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 126
    .line 127
    sget v1, Lj7/a;->l0:I

    .line 128
    and-int/2addr p1, v1

    .line 129
    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    .line 137
    .line 138
    :cond_7
    invoke-virtual {p0, v0}, Lj7/a;->N2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    .line 142
    :cond_8
    iget p1, p0, Lf7/b;->s:I

    .line 143
    .line 144
    add-int/lit8 p1, p1, 0xd

    .line 145
    .line 146
    iget v0, p0, Lf7/b;->t:I

    .line 147
    .line 148
    if-gt p1, v0, :cond_9

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lj7/a;->p2()Ljava/lang/String;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    if-eqz p1, :cond_9

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 158
    move-result-object p1

    .line 159
    return-object p1

    .line 160
    :cond_9
    const/4 p1, 0x0

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1, p1, p1}, Lj7/a;->O2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 164
    move-result-object p1

    .line 165
    return-object p1
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

.method public Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x39

    .line 3
    .line 4
    const/16 v1, 0x30

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const/16 v3, 0x2e

    .line 8
    .line 9
    if-ne p3, v3, :cond_5

    .line 10
    array-length p3, p1

    .line 11
    .line 12
    if-lt p2, p3, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 18
    move-result-object p1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 p3, p2, 0x1

    .line 21
    .line 22
    aput-char v3, p1, p2

    .line 23
    move p2, p3

    .line 24
    move p3, v2

    .line 25
    .line 26
    :goto_0
    iget v3, p0, Lf7/b;->s:I

    .line 27
    .line 28
    iget v4, p0, Lf7/b;->t:I

    .line 29
    .line 30
    if-lt v3, v4, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 36
    .line 37
    const/16 p1, 0x1e

    .line 38
    .line 39
    iput p1, p0, Lj7/b;->c0:I

    .line 40
    .line 41
    iput p3, p0, Lf7/b;->P:I

    .line 42
    .line 43
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 44
    .line 45
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 46
    return-object p1

    .line 47
    .line 48
    :cond_1
    iget-object v4, p0, Lj7/a;->k0:[B

    .line 49
    .line 50
    add-int/lit8 v5, v3, 0x1

    .line 51
    .line 52
    iput v5, p0, Lf7/b;->s:I

    .line 53
    .line 54
    aget-byte v3, v4, v3

    .line 55
    .line 56
    if-lt v3, v1, :cond_4

    .line 57
    .line 58
    if-le v3, v0, :cond_2

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    array-length v4, p1

    .line 61
    .line 62
    if-lt p2, v4, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 68
    move-result-object p1

    .line 69
    .line 70
    :cond_3
    add-int/lit8 v4, p2, 0x1

    .line 71
    int-to-char v3, v3

    .line 72
    .line 73
    aput-char v3, p1, p2

    .line 74
    .line 75
    add-int/lit8 p3, p3, 0x1

    .line 76
    move p2, v4

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_4
    :goto_1
    and-int/lit16 v3, v3, 0xff

    .line 80
    .line 81
    if-nez p3, :cond_6

    .line 82
    .line 83
    const-string v4, "Decimal point not followed by a digit"

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v3, v4}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 87
    goto :goto_2

    .line 88
    :cond_5
    move v3, p3

    .line 89
    move p3, v2

    .line 90
    .line 91
    :cond_6
    :goto_2
    iput p3, p0, Lf7/b;->P:I

    .line 92
    .line 93
    const/16 p3, 0x65

    .line 94
    .line 95
    if-eq v3, p3, :cond_7

    .line 96
    .line 97
    const/16 p3, 0x45

    .line 98
    .line 99
    if-ne v3, p3, :cond_11

    .line 100
    :cond_7
    array-length p3, p1

    .line 101
    .line 102
    if-lt p2, p3, :cond_8

    .line 103
    .line 104
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 108
    move-result-object p1

    .line 109
    .line 110
    :cond_8
    add-int/lit8 p3, p2, 0x1

    .line 111
    int-to-char v3, v3

    .line 112
    .line 113
    aput-char v3, p1, p2

    .line 114
    .line 115
    iget v3, p0, Lf7/b;->s:I

    .line 116
    .line 117
    iget v4, p0, Lf7/b;->t:I

    .line 118
    .line 119
    if-lt v3, v4, :cond_9

    .line 120
    .line 121
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 125
    .line 126
    const/16 p1, 0x1f

    .line 127
    .line 128
    iput p1, p0, Lj7/b;->c0:I

    .line 129
    .line 130
    iput v2, p0, Lf7/b;->Q:I

    .line 131
    .line 132
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 133
    .line 134
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 135
    return-object p1

    .line 136
    .line 137
    :cond_9
    iget-object v4, p0, Lj7/a;->k0:[B

    .line 138
    .line 139
    add-int/lit8 v5, v3, 0x1

    .line 140
    .line 141
    iput v5, p0, Lf7/b;->s:I

    .line 142
    .line 143
    aget-byte v3, v4, v3

    .line 144
    .line 145
    const/16 v4, 0x2d

    .line 146
    .line 147
    const/16 v5, 0x20

    .line 148
    .line 149
    if-eq v3, v4, :cond_b

    .line 150
    .line 151
    const/16 v4, 0x2b

    .line 152
    .line 153
    if-ne v3, v4, :cond_a

    .line 154
    goto :goto_4

    .line 155
    :cond_a
    :goto_3
    move p2, p3

    .line 156
    goto :goto_5

    .line 157
    :cond_b
    :goto_4
    array-length v4, p1

    .line 158
    .line 159
    if-lt p3, v4, :cond_c

    .line 160
    .line 161
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 165
    move-result-object p1

    .line 166
    .line 167
    :cond_c
    add-int/lit8 p2, p2, 0x2

    .line 168
    int-to-char v3, v3

    .line 169
    .line 170
    aput-char v3, p1, p3

    .line 171
    .line 172
    iget p3, p0, Lf7/b;->s:I

    .line 173
    .line 174
    iget v3, p0, Lf7/b;->t:I

    .line 175
    .line 176
    if-lt p3, v3, :cond_d

    .line 177
    .line 178
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 182
    .line 183
    iput v5, p0, Lj7/b;->c0:I

    .line 184
    .line 185
    iput v2, p0, Lf7/b;->Q:I

    .line 186
    .line 187
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 188
    .line 189
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 190
    return-object p1

    .line 191
    .line 192
    :cond_d
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 193
    .line 194
    add-int/lit8 v4, p3, 0x1

    .line 195
    .line 196
    iput v4, p0, Lf7/b;->s:I

    .line 197
    .line 198
    aget-byte v3, v3, p3

    .line 199
    .line 200
    :goto_5
    if-lt v3, v1, :cond_10

    .line 201
    .line 202
    if-gt v3, v0, :cond_10

    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x1

    .line 205
    array-length p3, p1

    .line 206
    .line 207
    if-lt p2, p3, :cond_e

    .line 208
    .line 209
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 213
    move-result-object p1

    .line 214
    .line 215
    :cond_e
    add-int/lit8 p3, p2, 0x1

    .line 216
    int-to-char v3, v3

    .line 217
    .line 218
    aput-char v3, p1, p2

    .line 219
    .line 220
    iget p2, p0, Lf7/b;->s:I

    .line 221
    .line 222
    iget v3, p0, Lf7/b;->t:I

    .line 223
    .line 224
    if-lt p2, v3, :cond_f

    .line 225
    .line 226
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 230
    .line 231
    iput v5, p0, Lj7/b;->c0:I

    .line 232
    .line 233
    iput v2, p0, Lf7/b;->Q:I

    .line 234
    .line 235
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 236
    .line 237
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 238
    return-object p1

    .line 239
    .line 240
    :cond_f
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 241
    .line 242
    add-int/lit8 v4, p2, 0x1

    .line 243
    .line 244
    iput v4, p0, Lf7/b;->s:I

    .line 245
    .line 246
    aget-byte v3, v3, p2

    .line 247
    goto :goto_3

    .line 248
    .line 249
    :cond_10
    and-int/lit16 p1, v3, 0xff

    .line 250
    .line 251
    if-nez v2, :cond_11

    .line 252
    .line 253
    const-string p3, "Exponent indicator not followed by a digit"

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, p1, p3}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 257
    .line 258
    :cond_11
    iget p1, p0, Lf7/b;->s:I

    .line 259
    .line 260
    add-int/lit8 p1, p1, -0x1

    .line 261
    .line 262
    iput p1, p0, Lf7/b;->s:I

    .line 263
    .line 264
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 268
    .line 269
    iput v2, p0, Lf7/b;->Q:I

    .line 270
    .line 271
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p1}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 275
    move-result-object p1

    .line 276
    return-object p1
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
.end method

.method public a3()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lf7/b;->N:Z

    .line 4
    .line 5
    iput v0, p0, Lf7/b;->O:I

    .line 6
    .line 7
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const/16 v2, 0x2e

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1, v0, v2}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public b3()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lf7/b;->N:Z

    .line 4
    .line 5
    iget v1, p0, Lf7/b;->s:I

    .line 6
    .line 7
    iget v2, p0, Lf7/b;->t:I

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x17

    .line 12
    .line 13
    iput v0, p0, Lj7/b;->c0:I

    .line 14
    .line 15
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    .line 17
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 21
    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    iput v3, p0, Lf7/b;->s:I

    .line 25
    .line 26
    aget-byte v1, v2, v1

    .line 27
    .line 28
    and-int/lit16 v1, v1, 0xff

    .line 29
    .line 30
    const/16 v2, 0x39

    .line 31
    .line 32
    const-string v3, "expected digit (0-9) to follow minus sign, for valid numeric value"

    .line 33
    const/4 v4, 0x2

    .line 34
    .line 35
    const/16 v5, 0x30

    .line 36
    .line 37
    if-gt v1, v5, :cond_2

    .line 38
    .line 39
    if-ne v1, v5, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lj7/a;->G2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0, v1, v3}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    if-le v1, v2, :cond_4

    .line 51
    .line 52
    const/16 v6, 0x49

    .line 53
    .line 54
    if-ne v1, v6, :cond_3

    .line 55
    const/4 v0, 0x3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0, v4}, Lj7/a;->D2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0, v1, v3}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 64
    .line 65
    :cond_4
    :goto_0
    iget-object v3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 69
    move-result-object v3

    .line 70
    const/4 v6, 0x0

    .line 71
    .line 72
    const/16 v7, 0x2d

    .line 73
    .line 74
    aput-char v7, v3, v6

    .line 75
    int-to-char v1, v1

    .line 76
    .line 77
    aput-char v1, v3, v0

    .line 78
    .line 79
    iget v1, p0, Lf7/b;->s:I

    .line 80
    .line 81
    iget v6, p0, Lf7/b;->t:I

    .line 82
    .line 83
    const/16 v7, 0x1a

    .line 84
    .line 85
    if-lt v1, v6, :cond_5

    .line 86
    .line 87
    iput v7, p0, Lj7/b;->c0:I

    .line 88
    .line 89
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 93
    .line 94
    iput v0, p0, Lf7/b;->O:I

    .line 95
    .line 96
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 97
    .line 98
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 99
    return-object v0

    .line 100
    .line 101
    :cond_5
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 102
    .line 103
    aget-byte v1, v6, v1

    .line 104
    .line 105
    :goto_1
    if-ge v1, v5, :cond_6

    .line 106
    .line 107
    const/16 v2, 0x2e

    .line 108
    .line 109
    if-ne v1, v2, :cond_7

    .line 110
    .line 111
    add-int/lit8 v2, v4, -0x1

    .line 112
    .line 113
    iput v2, p0, Lf7/b;->O:I

    .line 114
    .line 115
    iget v2, p0, Lf7/b;->s:I

    .line 116
    add-int/2addr v2, v0

    .line 117
    .line 118
    iput v2, p0, Lf7/b;->s:I

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v3, v4, v1}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    .line 125
    :cond_6
    if-le v1, v2, :cond_9

    .line 126
    .line 127
    const/16 v2, 0x65

    .line 128
    .line 129
    if-eq v1, v2, :cond_8

    .line 130
    .line 131
    const/16 v2, 0x45

    .line 132
    .line 133
    if-ne v1, v2, :cond_7

    .line 134
    goto :goto_2

    .line 135
    .line 136
    :cond_7
    add-int/lit8 v0, v4, -0x1

    .line 137
    .line 138
    iput v0, p0, Lf7/b;->O:I

    .line 139
    .line 140
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 144
    .line 145
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    .line 152
    :cond_8
    :goto_2
    add-int/lit8 v2, v4, -0x1

    .line 153
    .line 154
    iput v2, p0, Lf7/b;->O:I

    .line 155
    .line 156
    iget v2, p0, Lf7/b;->s:I

    .line 157
    add-int/2addr v2, v0

    .line 158
    .line 159
    iput v2, p0, Lf7/b;->s:I

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v3, v4, v1}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :cond_9
    array-length v6, v3

    .line 166
    .line 167
    if-lt v4, v6, :cond_a

    .line 168
    .line 169
    iget-object v3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 173
    move-result-object v3

    .line 174
    .line 175
    :cond_a
    add-int/lit8 v6, v4, 0x1

    .line 176
    int-to-char v1, v1

    .line 177
    .line 178
    aput-char v1, v3, v4

    .line 179
    .line 180
    iget v1, p0, Lf7/b;->s:I

    .line 181
    add-int/2addr v1, v0

    .line 182
    .line 183
    iput v1, p0, Lf7/b;->s:I

    .line 184
    .line 185
    iget v4, p0, Lf7/b;->t:I

    .line 186
    .line 187
    if-lt v1, v4, :cond_b

    .line 188
    .line 189
    iput v7, p0, Lj7/b;->c0:I

    .line 190
    .line 191
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v6}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 195
    .line 196
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 197
    .line 198
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 199
    return-object v0

    .line 200
    .line 201
    :cond_b
    iget-object v4, p0, Lj7/a;->k0:[B

    .line 202
    .line 203
    aget-byte v1, v4, v1

    .line 204
    .line 205
    and-int/lit16 v1, v1, 0xff

    .line 206
    move v4, v6

    .line 207
    goto :goto_1
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
.end method

.method public c3()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x3

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 11
    .line 12
    add-int/lit8 v2, v0, 0x1

    .line 13
    .line 14
    aget-byte v3, v1, v0

    .line 15
    .line 16
    const/16 v4, 0x75

    .line 17
    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x2

    .line 21
    .line 22
    aget-byte v2, v1, v2

    .line 23
    .line 24
    const/16 v4, 0x6c

    .line 25
    .line 26
    if-ne v2, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x3

    .line 29
    .line 30
    aget-byte v2, v1, v3

    .line 31
    .line 32
    if-ne v2, v4, :cond_1

    .line 33
    .line 34
    aget-byte v1, v1, v0

    .line 35
    .line 36
    and-int/lit16 v1, v1, 0xff

    .line 37
    .line 38
    const/16 v2, 0x30

    .line 39
    .line 40
    if-lt v1, v2, :cond_0

    .line 41
    .line 42
    const/16 v2, 0x5d

    .line 43
    .line 44
    if-eq v1, v2, :cond_0

    .line 45
    .line 46
    const/16 v2, 0x7d

    .line 47
    .line 48
    if-ne v1, v2, :cond_1

    .line 49
    .line 50
    :cond_0
    iput v0, p0, Lf7/b;->s:I

    .line 51
    .line 52
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    .line 59
    :cond_1
    const/16 v0, 0x10

    .line 60
    .line 61
    iput v0, p0, Lj7/b;->c0:I

    .line 62
    .line 63
    const-string v0, "null"

    .line 64
    .line 65
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 66
    const/4 v2, 0x1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0, v2, v1}, Lj7/a;->B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 70
    move-result-object v0

    .line 71
    return-object v0
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public d3()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    iput v0, p0, Lj7/b;->c0:I

    .line 11
    .line 12
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    aget-byte v0, v1, v0

    .line 22
    .line 23
    and-int/lit16 v0, v0, 0xff

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    const/16 v3, 0x30

    .line 27
    const/4 v4, 0x1

    .line 28
    .line 29
    if-ge v0, v3, :cond_1

    .line 30
    .line 31
    const/16 v5, 0x2e

    .line 32
    .line 33
    if-ne v0, v5, :cond_3

    .line 34
    .line 35
    iput v2, p0, Lf7/b;->s:I

    .line 36
    .line 37
    iput v4, p0, Lf7/b;->O:I

    .line 38
    .line 39
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 43
    move-result-object v2

    .line 44
    .line 45
    aput-char v3, v2, v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2, v4, v0}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    .line 52
    :cond_1
    const/16 v5, 0x39

    .line 53
    .line 54
    if-le v0, v5, :cond_5

    .line 55
    .line 56
    const/16 v5, 0x65

    .line 57
    .line 58
    if-eq v0, v5, :cond_4

    .line 59
    .line 60
    const/16 v5, 0x45

    .line 61
    .line 62
    if-ne v0, v5, :cond_2

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_2
    const/16 v2, 0x5d

    .line 66
    .line 67
    if-eq v0, v2, :cond_3

    .line 68
    .line 69
    const/16 v2, 0x7d

    .line 70
    .line 71
    if-eq v0, v2, :cond_3

    .line 72
    .line 73
    const-string v2, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow \'0\'"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0, v2}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 77
    .line 78
    :cond_3
    const-string v0, "0"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1, v0}, Lj7/b;->e2(ILjava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    .line 85
    :cond_4
    :goto_0
    iput v2, p0, Lf7/b;->s:I

    .line 86
    .line 87
    iput v4, p0, Lf7/b;->O:I

    .line 88
    .line 89
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 93
    move-result-object v2

    .line 94
    .line 95
    aput-char v3, v2, v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v2, v4, v0}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    .line 102
    .line 103
    :cond_5
    invoke-virtual {p0}, Lj7/a;->H2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 104
    move-result-object v0

    .line 105
    return-object v0
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
.end method

.method public e3(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lf7/b;->N:Z

    .line 4
    .line 5
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 9
    move-result-object v1

    .line 10
    int-to-char p1, p1

    .line 11
    .line 12
    aput-char p1, v1, v0

    .line 13
    .line 14
    iget p1, p0, Lf7/b;->s:I

    .line 15
    .line 16
    iget v0, p0, Lf7/b;->t:I

    .line 17
    .line 18
    const/16 v2, 0x1a

    .line 19
    const/4 v3, 0x1

    .line 20
    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    iput v2, p0, Lj7/b;->c0:I

    .line 24
    .line 25
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 29
    .line 30
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    .line 32
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 33
    return-object p1

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 36
    .line 37
    aget-byte p1, v0, p1

    .line 38
    .line 39
    and-int/lit16 p1, p1, 0xff

    .line 40
    move v0, v3

    .line 41
    .line 42
    :goto_0
    const/16 v4, 0x30

    .line 43
    .line 44
    if-ge p1, v4, :cond_1

    .line 45
    .line 46
    const/16 v2, 0x2e

    .line 47
    .line 48
    if-ne p1, v2, :cond_2

    .line 49
    .line 50
    iput v0, p0, Lf7/b;->O:I

    .line 51
    .line 52
    iget v2, p0, Lf7/b;->s:I

    .line 53
    add-int/2addr v2, v3

    .line 54
    .line 55
    iput v2, p0, Lf7/b;->s:I

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1, v0, p1}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    .line 62
    :cond_1
    const/16 v4, 0x39

    .line 63
    .line 64
    if-le p1, v4, :cond_4

    .line 65
    .line 66
    const/16 v2, 0x65

    .line 67
    .line 68
    if-eq p1, v2, :cond_3

    .line 69
    .line 70
    const/16 v2, 0x45

    .line 71
    .line 72
    if-ne p1, v2, :cond_2

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_2
    iput v0, p0, Lf7/b;->O:I

    .line 76
    .line 77
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 81
    .line 82
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    .line 89
    :cond_3
    :goto_1
    iput v0, p0, Lf7/b;->O:I

    .line 90
    .line 91
    iget v2, p0, Lf7/b;->s:I

    .line 92
    add-int/2addr v2, v3

    .line 93
    .line 94
    iput v2, p0, Lf7/b;->s:I

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1, v0, p1}, Lj7/a;->Z2([CII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :cond_4
    array-length v4, v1

    .line 101
    .line 102
    if-lt v0, v4, :cond_5

    .line 103
    .line 104
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 108
    move-result-object v1

    .line 109
    .line 110
    :cond_5
    add-int/lit8 v4, v0, 0x1

    .line 111
    int-to-char p1, p1

    .line 112
    .line 113
    aput-char p1, v1, v0

    .line 114
    .line 115
    iget p1, p0, Lf7/b;->s:I

    .line 116
    add-int/2addr p1, v3

    .line 117
    .line 118
    iput p1, p0, Lf7/b;->s:I

    .line 119
    .line 120
    iget v0, p0, Lf7/b;->t:I

    .line 121
    .line 122
    if-lt p1, v0, :cond_6

    .line 123
    .line 124
    iput v2, p0, Lj7/b;->c0:I

    .line 125
    .line 126
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 130
    .line 131
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 132
    .line 133
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 134
    return-object p1

    .line 135
    .line 136
    :cond_6
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 137
    .line 138
    aget-byte p1, v0, p1

    .line 139
    .line 140
    and-int/lit16 p1, p1, 0xff

    .line 141
    move v0, v4

    .line 142
    goto :goto_0
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

.method public final f3(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 3
    .line 4
    sget v1, Lj7/a;->q0:I

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lf7/b;->s:I

    .line 17
    .line 18
    iget v2, p0, Lf7/b;->t:I

    .line 19
    .line 20
    if-lt v0, v2, :cond_1

    .line 21
    .line 22
    iput p1, p0, Lj7/b;->W:I

    .line 23
    .line 24
    const/16 p1, 0x33

    .line 25
    .line 26
    iput p1, p0, Lj7/b;->c0:I

    .line 27
    .line 28
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 29
    .line 30
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_1
    iget-object v2, p0, Lj7/a;->k0:[B

    .line 34
    .line 35
    add-int/lit8 v3, v0, 0x1

    .line 36
    .line 37
    iput v3, p0, Lf7/b;->s:I

    .line 38
    .line 39
    aget-byte v0, v2, v0

    .line 40
    .line 41
    const/16 v2, 0x2a

    .line 42
    .line 43
    if-ne v0, v2, :cond_2

    .line 44
    const/4 v0, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v0}, Lj7/a;->t2(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    .line 51
    :cond_2
    if-ne v0, v1, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lj7/a;->u2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_3
    and-int/lit16 p1, v0, 0xff

    .line 59
    .line 60
    .line 61
    const-string/jumbo v0, "was expecting either \'*\' or \'/\' for a comment"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 65
    const/4 p1, 0x0

    .line 66
    return-object p1
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

.method public final g2()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->t:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->s:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/4 v1, 0x5

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, -0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lj7/a;->i2(II)I

    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lj7/a;->h2()I

    .line 19
    move-result v0

    .line 20
    return v0
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
.end method

.method public g3()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget-object v2, Lj7/a;->s0:[I

    .line 11
    .line 12
    iget v3, p0, Lf7/b;->t:I

    .line 13
    array-length v4, v1

    .line 14
    add-int/2addr v4, v0

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 18
    move-result v3

    .line 19
    .line 20
    iget-object v4, p0, Lj7/a;->k0:[B

    .line 21
    const/4 v5, 0x0

    .line 22
    .line 23
    :goto_0
    if-ge v0, v3, :cond_1

    .line 24
    .line 25
    aget-byte v6, v4, v0

    .line 26
    .line 27
    and-int/lit16 v6, v6, 0xff

    .line 28
    .line 29
    aget v7, v2, v6

    .line 30
    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    const/16 v1, 0x22

    .line 34
    .line 35
    if-ne v6, v1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    iput v0, p0, Lf7/b;->s:I

    .line 40
    .line 41
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 45
    .line 46
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    .line 53
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    add-int/lit8 v7, v5, 0x1

    .line 56
    int-to-char v6, v6

    .line 57
    .line 58
    aput-char v6, v1, v5

    .line 59
    move v5, v7

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_1
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 66
    .line 67
    iput v0, p0, Lf7/b;->s:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lj7/a;->J2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 71
    move-result-object v0

    .line 72
    return-object v0
    .line 73
    .line 74
    .line 75
.end method

.method public final h2()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->s:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    iput v2, p0, Lf7/b;->s:I

    .line 9
    .line 10
    aget-byte v3, v0, v1

    .line 11
    .line 12
    const/16 v4, 0x22

    .line 13
    .line 14
    if-eq v3, v4, :cond_8

    .line 15
    .line 16
    const/16 v4, 0x2f

    .line 17
    .line 18
    if-eq v3, v4, :cond_8

    .line 19
    .line 20
    const/16 v4, 0x5c

    .line 21
    .line 22
    if-eq v3, v4, :cond_8

    .line 23
    .line 24
    const/16 v4, 0x62

    .line 25
    .line 26
    if-eq v3, v4, :cond_7

    .line 27
    .line 28
    const/16 v4, 0x66

    .line 29
    .line 30
    if-eq v3, v4, :cond_6

    .line 31
    .line 32
    const/16 v4, 0x6e

    .line 33
    .line 34
    if-eq v3, v4, :cond_5

    .line 35
    .line 36
    const/16 v4, 0x72

    .line 37
    .line 38
    if-eq v3, v4, :cond_4

    .line 39
    .line 40
    const/16 v4, 0x74

    .line 41
    .line 42
    if-eq v3, v4, :cond_3

    .line 43
    .line 44
    const/16 v4, 0x75

    .line 45
    .line 46
    if-eq v3, v4, :cond_0

    .line 47
    int-to-char v0, v3

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lf7/b;->n1(C)C

    .line 51
    move-result v0

    .line 52
    return v0

    .line 53
    .line 54
    :cond_0
    add-int/lit8 v1, v1, 0x2

    .line 55
    .line 56
    iput v1, p0, Lf7/b;->s:I

    .line 57
    .line 58
    aget-byte v0, v0, v2

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 62
    move-result v1

    .line 63
    .line 64
    if-ltz v1, :cond_2

    .line 65
    .line 66
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 67
    .line 68
    iget v2, p0, Lf7/b;->s:I

    .line 69
    .line 70
    add-int/lit8 v3, v2, 0x1

    .line 71
    .line 72
    iput v3, p0, Lf7/b;->s:I

    .line 73
    .line 74
    aget-byte v0, v0, v2

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 78
    move-result v2

    .line 79
    .line 80
    if-ltz v2, :cond_2

    .line 81
    .line 82
    shl-int/lit8 v0, v1, 0x4

    .line 83
    or-int/2addr v0, v2

    .line 84
    .line 85
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 86
    .line 87
    iget v2, p0, Lf7/b;->s:I

    .line 88
    .line 89
    add-int/lit8 v3, v2, 0x1

    .line 90
    .line 91
    iput v3, p0, Lf7/b;->s:I

    .line 92
    .line 93
    aget-byte v1, v1, v2

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 97
    move-result v2

    .line 98
    .line 99
    if-ltz v2, :cond_1

    .line 100
    .line 101
    shl-int/lit8 v0, v0, 0x4

    .line 102
    or-int/2addr v0, v2

    .line 103
    .line 104
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 105
    .line 106
    iget v2, p0, Lf7/b;->s:I

    .line 107
    .line 108
    add-int/lit8 v3, v2, 0x1

    .line 109
    .line 110
    iput v3, p0, Lf7/b;->s:I

    .line 111
    .line 112
    aget-byte v1, v1, v2

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 116
    move-result v2

    .line 117
    .line 118
    if-ltz v2, :cond_1

    .line 119
    .line 120
    shl-int/lit8 v0, v0, 0x4

    .line 121
    or-int/2addr v0, v2

    .line 122
    return v0

    .line 123
    :cond_1
    move v0, v1

    .line 124
    .line 125
    :cond_2
    and-int/lit16 v0, v0, 0xff

    .line 126
    .line 127
    const-string v1, "expected a hex-digit for character escape sequence"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 131
    const/4 v0, -0x1

    .line 132
    return v0

    .line 133
    .line 134
    :cond_3
    const/16 v0, 0x9

    .line 135
    return v0

    .line 136
    .line 137
    :cond_4
    const/16 v0, 0xd

    .line 138
    return v0

    .line 139
    .line 140
    :cond_5
    const/16 v0, 0xa

    .line 141
    return v0

    .line 142
    .line 143
    :cond_6
    const/16 v0, 0xc

    .line 144
    return v0

    .line 145
    .line 146
    :cond_7
    const/16 v0, 0x8

    .line 147
    return v0

    .line 148
    :cond_8
    int-to-char v0, v3

    .line 149
    return v0
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
.end method

.method public h3()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x3

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 11
    .line 12
    add-int/lit8 v2, v0, 0x1

    .line 13
    .line 14
    aget-byte v3, v1, v0

    .line 15
    .line 16
    const/16 v4, 0x72

    .line 17
    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x2

    .line 21
    .line 22
    aget-byte v2, v1, v2

    .line 23
    .line 24
    const/16 v4, 0x75

    .line 25
    .line 26
    if-ne v2, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x3

    .line 29
    .line 30
    aget-byte v2, v1, v3

    .line 31
    .line 32
    const/16 v3, 0x65

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    aget-byte v1, v1, v0

    .line 37
    .line 38
    and-int/lit16 v1, v1, 0xff

    .line 39
    .line 40
    const/16 v2, 0x30

    .line 41
    .line 42
    if-lt v1, v2, :cond_0

    .line 43
    .line 44
    const/16 v2, 0x5d

    .line 45
    .line 46
    if-eq v1, v2, :cond_0

    .line 47
    .line 48
    const/16 v2, 0x7d

    .line 49
    .line 50
    if-ne v1, v2, :cond_1

    .line 51
    .line 52
    :cond_0
    iput v0, p0, Lf7/b;->s:I

    .line 53
    .line 54
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    .line 61
    :cond_1
    const/16 v0, 0x11

    .line 62
    .line 63
    iput v0, p0, Lj7/b;->c0:I

    .line 64
    .line 65
    .line 66
    const-string/jumbo v0, "true"

    .line 67
    .line 68
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 69
    const/4 v2, 0x1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0, v2, v1}, Lj7/a;->B2(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 73
    move-result-object v0

    .line 74
    return-object v0
    .line 75
.end method

.method public final i2(II)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    const/4 v2, -0x1

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lj7/b;->Y:I

    .line 10
    .line 11
    iput p2, p0, Lj7/b;->Z:I

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 15
    .line 16
    add-int/lit8 v4, v0, 0x1

    .line 17
    .line 18
    iput v4, p0, Lf7/b;->s:I

    .line 19
    .line 20
    aget-byte v5, v3, v0

    .line 21
    .line 22
    if-ne p2, v2, :cond_9

    .line 23
    .line 24
    const/16 p2, 0x22

    .line 25
    .line 26
    if-eq v5, p2, :cond_8

    .line 27
    .line 28
    const/16 p2, 0x2f

    .line 29
    .line 30
    if-eq v5, p2, :cond_8

    .line 31
    .line 32
    const/16 p2, 0x5c

    .line 33
    .line 34
    if-eq v5, p2, :cond_8

    .line 35
    .line 36
    const/16 p2, 0x62

    .line 37
    .line 38
    if-eq v5, p2, :cond_7

    .line 39
    .line 40
    const/16 p2, 0x66

    .line 41
    .line 42
    if-eq v5, p2, :cond_6

    .line 43
    .line 44
    const/16 p2, 0x6e

    .line 45
    .line 46
    if-eq v5, p2, :cond_5

    .line 47
    .line 48
    const/16 p2, 0x72

    .line 49
    .line 50
    if-eq v5, p2, :cond_4

    .line 51
    .line 52
    const/16 p2, 0x74

    .line 53
    .line 54
    if-eq v5, p2, :cond_3

    .line 55
    .line 56
    const/16 p2, 0x75

    .line 57
    .line 58
    if-eq v5, p2, :cond_1

    .line 59
    int-to-char p1, v5

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lf7/b;->n1(C)C

    .line 63
    move-result p1

    .line 64
    return p1

    .line 65
    :cond_1
    const/4 p2, 0x0

    .line 66
    .line 67
    if-lt v4, v1, :cond_2

    .line 68
    .line 69
    iput p2, p0, Lj7/b;->Z:I

    .line 70
    .line 71
    iput p2, p0, Lj7/b;->Y:I

    .line 72
    return v2

    .line 73
    .line 74
    :cond_2
    add-int/lit8 v0, v0, 0x2

    .line 75
    .line 76
    iput v0, p0, Lf7/b;->s:I

    .line 77
    .line 78
    aget-byte v5, v3, v4

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_3
    const/16 p1, 0x9

    .line 82
    return p1

    .line 83
    .line 84
    :cond_4
    const/16 p1, 0xd

    .line 85
    return p1

    .line 86
    .line 87
    :cond_5
    const/16 p1, 0xa

    .line 88
    return p1

    .line 89
    .line 90
    :cond_6
    const/16 p1, 0xc

    .line 91
    return p1

    .line 92
    .line 93
    :cond_7
    const/16 p1, 0x8

    .line 94
    return p1

    .line 95
    :cond_8
    return v5

    .line 96
    .line 97
    :cond_9
    :goto_0
    and-int/lit16 v0, v5, 0xff

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 101
    move-result v1

    .line 102
    .line 103
    if-gez v1, :cond_a

    .line 104
    .line 105
    and-int/lit16 v0, v0, 0xff

    .line 106
    .line 107
    const-string v3, "expected a hex-digit for character escape sequence"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0, v3}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 111
    :cond_a
    const/4 v0, 0x4

    .line 112
    shl-int/2addr p1, v0

    .line 113
    or-int/2addr p1, v1

    .line 114
    .line 115
    add-int/lit8 p2, p2, 0x1

    .line 116
    .line 117
    if-ne p2, v0, :cond_b

    .line 118
    return p1

    .line 119
    .line 120
    :cond_b
    iget v0, p0, Lf7/b;->s:I

    .line 121
    .line 122
    iget v1, p0, Lf7/b;->t:I

    .line 123
    .line 124
    if-lt v0, v1, :cond_c

    .line 125
    .line 126
    iput p2, p0, Lj7/b;->Z:I

    .line 127
    .line 128
    iput p1, p0, Lj7/b;->Y:I

    .line 129
    return v2

    .line 130
    .line 131
    :cond_c
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 132
    .line 133
    add-int/lit8 v3, v0, 0x1

    .line 134
    .line 135
    iput v3, p0, Lf7/b;->s:I

    .line 136
    .line 137
    aget-byte v0, v1, v0

    .line 138
    .line 139
    and-int/lit16 v0, v0, 0xff

    .line 140
    goto :goto_1
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

.method public i3(ZI)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 p1, 0x27

    .line 3
    .line 4
    if-eq p2, p1, :cond_5

    .line 5
    .line 6
    const/16 p1, 0x49

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    if-eq p2, p1, :cond_4

    .line 10
    .line 11
    const/16 p1, 0x4e

    .line 12
    .line 13
    if-eq p2, p1, :cond_3

    .line 14
    .line 15
    const/16 p1, 0x5d

    .line 16
    .line 17
    if-eq p2, p1, :cond_1

    .line 18
    .line 19
    const/16 p1, 0x7d

    .line 20
    .line 21
    if-eq p2, p1, :cond_6

    .line 22
    .line 23
    const/16 p1, 0x2b

    .line 24
    .line 25
    if-eq p2, p1, :cond_0

    .line 26
    .line 27
    const/16 p1, 0x2c

    .line 28
    .line 29
    if-eq p2, p1, :cond_2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p1, 0x2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lj7/a;->D2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    .line 38
    :cond_1
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 51
    move-result p1

    .line 52
    .line 53
    if-nez p1, :cond_6

    .line 54
    .line 55
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 56
    .line 57
    sget v1, Lj7/a;->n0:I

    .line 58
    and-int/2addr p1, v1

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget p1, p0, Lf7/b;->s:I

    .line 63
    sub-int/2addr p1, v0

    .line 64
    .line 65
    iput p1, p0, Lf7/b;->s:I

    .line 66
    .line 67
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_3
    const/4 p1, 0x0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1, v0}, Lj7/a;->D2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {p0, v0, v0}, Lj7/a;->D2(II)Lcom/fasterxml/jackson/core/JsonToken;

    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    .line 85
    :cond_5
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 86
    .line 87
    sget v0, Lj7/a;->o0:I

    .line 88
    and-int/2addr p1, v0

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lj7/a;->U2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    .line 97
    :cond_6
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    const-string v0, "expected a valid value "

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lf7/b;->x1()Ljava/lang/String;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p2, p1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 120
    const/4 p1, 0x0

    .line 121
    return-object p1
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

.method public j1()C
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/fasterxml/jackson/core/util/k;->c()V

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    return v0
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

.method public final j2(IIZ)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-eq p2, v1, :cond_7

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    if-eq p2, v2, :cond_5

    .line 8
    const/4 v2, 0x3

    .line 9
    .line 10
    if-eq p2, v2, :cond_3

    .line 11
    const/4 v2, 0x4

    .line 12
    .line 13
    if-eq p2, v2, :cond_1

    .line 14
    .line 15
    const/16 p2, 0x20

    .line 16
    .line 17
    if-ge p1, p2, :cond_0

    .line 18
    .line 19
    .line 20
    const-string/jumbo p2, "string value"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Lj7/b;->W1(I)V

    .line 28
    .line 29
    :goto_0
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 30
    int-to-char p1, p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 34
    return v1

    .line 35
    .line 36
    :cond_1
    and-int/lit8 p1, p1, 0x7

    .line 37
    .line 38
    if-eqz p3, :cond_2

    .line 39
    .line 40
    iget-object p2, p0, Lj7/a;->k0:[B

    .line 41
    .line 42
    iget p3, p0, Lf7/b;->s:I

    .line 43
    .line 44
    add-int/lit8 v0, p3, 0x1

    .line 45
    .line 46
    iput v0, p0, Lf7/b;->s:I

    .line 47
    .line 48
    aget-byte p2, p2, p3

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, v1, p2}, Lj7/a;->l2(III)Z

    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    .line 55
    :cond_2
    iput p1, p0, Lj7/b;->W:I

    .line 56
    .line 57
    iput v1, p0, Lj7/b;->X:I

    .line 58
    .line 59
    const/16 p1, 0x2c

    .line 60
    .line 61
    iput p1, p0, Lj7/b;->c0:I

    .line 62
    return v0

    .line 63
    .line 64
    :cond_3
    and-int/lit8 p1, p1, 0xf

    .line 65
    .line 66
    if-eqz p3, :cond_4

    .line 67
    .line 68
    iget-object p2, p0, Lj7/a;->k0:[B

    .line 69
    .line 70
    iget p3, p0, Lf7/b;->s:I

    .line 71
    .line 72
    add-int/lit8 v0, p3, 0x1

    .line 73
    .line 74
    iput v0, p0, Lf7/b;->s:I

    .line 75
    .line 76
    aget-byte p2, p2, p3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1, v1, p2}, Lj7/a;->k2(III)Z

    .line 80
    move-result p1

    .line 81
    return p1

    .line 82
    .line 83
    :cond_4
    const/16 p2, 0x2b

    .line 84
    .line 85
    iput p2, p0, Lj7/b;->c0:I

    .line 86
    .line 87
    iput p1, p0, Lj7/b;->W:I

    .line 88
    .line 89
    iput v1, p0, Lj7/b;->X:I

    .line 90
    return v0

    .line 91
    .line 92
    :cond_5
    if-eqz p3, :cond_6

    .line 93
    .line 94
    iget-object p2, p0, Lj7/a;->k0:[B

    .line 95
    .line 96
    iget p3, p0, Lf7/b;->s:I

    .line 97
    .line 98
    add-int/lit8 v0, p3, 0x1

    .line 99
    .line 100
    iput v0, p0, Lf7/b;->s:I

    .line 101
    .line 102
    aget-byte p2, p2, p3

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, p2}, Lj7/a;->m2(II)I

    .line 106
    move-result p1

    .line 107
    .line 108
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 109
    int-to-char p1, p1

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 113
    return v1

    .line 114
    .line 115
    :cond_6
    const/16 p2, 0x2a

    .line 116
    .line 117
    iput p2, p0, Lj7/b;->c0:I

    .line 118
    .line 119
    iput p1, p0, Lj7/b;->W:I

    .line 120
    return v0

    .line 121
    :cond_7
    const/4 p1, -0x1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0, p1}, Lj7/a;->i2(II)I

    .line 125
    move-result p1

    .line 126
    .line 127
    if-gez p1, :cond_8

    .line 128
    .line 129
    const/16 p1, 0x29

    .line 130
    .line 131
    iput p1, p0, Lj7/b;->c0:I

    .line 132
    return v0

    .line 133
    .line 134
    :cond_8
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 135
    int-to-char p1, p1

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 139
    return v1
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
.end method

.method public final j3(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    const/16 v1, 0xc

    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lj7/a;->S2(I)I

    .line 10
    move-result p1

    .line 11
    .line 12
    if-gtz p1, :cond_0

    .line 13
    .line 14
    iput v1, p0, Lj7/b;->c0:I

    .line 15
    .line 16
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lj7/b;->c2()V

    .line 21
    .line 22
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Li7/d;->p()Z

    .line 26
    .line 27
    const/16 v0, 0x22

    .line 28
    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lj7/a;->g3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    .line 36
    :cond_1
    const/16 v0, 0x23

    .line 37
    .line 38
    if-eq p1, v0, :cond_a

    .line 39
    .line 40
    const/16 v0, 0x5b

    .line 41
    .line 42
    if-eq p1, v0, :cond_9

    .line 43
    .line 44
    const/16 v0, 0x5d

    .line 45
    .line 46
    if-eq p1, v0, :cond_8

    .line 47
    .line 48
    const/16 v0, 0x66

    .line 49
    .line 50
    if-eq p1, v0, :cond_7

    .line 51
    .line 52
    const/16 v0, 0x6e

    .line 53
    .line 54
    if-eq p1, v0, :cond_6

    .line 55
    .line 56
    const/16 v0, 0x74

    .line 57
    .line 58
    if-eq p1, v0, :cond_5

    .line 59
    .line 60
    const/16 v0, 0x7b

    .line 61
    .line 62
    if-eq p1, v0, :cond_4

    .line 63
    .line 64
    const/16 v0, 0x7d

    .line 65
    .line 66
    if-eq p1, v0, :cond_3

    .line 67
    .line 68
    .line 69
    packed-switch p1, :pswitch_data_0

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :pswitch_0
    invoke-virtual {p0, p1}, Lj7/a;->e3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    .line 77
    .line 78
    :pswitch_1
    invoke-virtual {p0}, Lj7/a;->d3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    .line 82
    .line 83
    :pswitch_2
    invoke-virtual {p0, v1}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    .line 87
    :pswitch_3
    sget-object v0, Lcom/fasterxml/jackson/core/json/JsonReadFeature;->ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/json/JsonReadFeature;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadFeature;->mappedFeature()Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->m0(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    .line 95
    move-result v0

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lj7/a;->a3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0, p1}, Lj7/a;->i3(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    .line 110
    .line 111
    :pswitch_4
    invoke-virtual {p0}, Lj7/a;->b3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-virtual {p0}, Lj7/b;->b2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {p0}, Lj7/a;->h3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-virtual {p0}, Lj7/a;->c3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-virtual {p0}, Lj7/a;->W2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    .line 140
    .line 141
    :cond_8
    invoke-virtual {p0}, Lj7/b;->M1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    .line 145
    .line 146
    :cond_9
    invoke-virtual {p0}, Lj7/b;->a2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    .line 150
    .line 151
    :cond_a
    invoke-virtual {p0, v1}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    nop

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
    :pswitch_data_0
    .packed-switch 0x2d
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final k2(III)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x80

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ne p2, v1, :cond_2

    .line 6
    .line 7
    and-int/lit16 p2, p3, 0xc0

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    and-int/lit16 p2, p3, 0xff

    .line 12
    .line 13
    iget v2, p0, Lf7/b;->s:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2, v2}, Lj7/b;->Z1(II)V

    .line 17
    .line 18
    :cond_0
    shl-int/lit8 p1, p1, 0x6

    .line 19
    .line 20
    and-int/lit8 p2, p3, 0x3f

    .line 21
    or-int/2addr p1, p2

    .line 22
    .line 23
    iget p2, p0, Lf7/b;->s:I

    .line 24
    .line 25
    iget p3, p0, Lf7/b;->t:I

    .line 26
    .line 27
    if-lt p2, p3, :cond_1

    .line 28
    .line 29
    const/16 p2, 0x2b

    .line 30
    .line 31
    iput p2, p0, Lj7/b;->c0:I

    .line 32
    .line 33
    iput p1, p0, Lj7/b;->W:I

    .line 34
    const/4 p1, 0x2

    .line 35
    .line 36
    iput p1, p0, Lj7/b;->X:I

    .line 37
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    .line 40
    :cond_1
    iget-object p3, p0, Lj7/a;->k0:[B

    .line 41
    .line 42
    add-int/lit8 v2, p2, 0x1

    .line 43
    .line 44
    iput v2, p0, Lf7/b;->s:I

    .line 45
    .line 46
    aget-byte p3, p3, p2

    .line 47
    .line 48
    :cond_2
    and-int/lit16 p2, p3, 0xc0

    .line 49
    .line 50
    if-eq p2, v0, :cond_3

    .line 51
    .line 52
    and-int/lit16 p2, p3, 0xff

    .line 53
    .line 54
    iget v0, p0, Lf7/b;->s:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p2, v0}, Lj7/b;->Z1(II)V

    .line 58
    .line 59
    :cond_3
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 60
    .line 61
    shl-int/lit8 p1, p1, 0x6

    .line 62
    .line 63
    and-int/lit8 p3, p3, 0x3f

    .line 64
    or-int/2addr p1, p3

    .line 65
    int-to-char p1, p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 69
    return v1
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

.method public final k3(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    const/16 v1, 0xf

    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lj7/a;->S2(I)I

    .line 10
    move-result p1

    .line 11
    .line 12
    if-gtz p1, :cond_0

    .line 13
    .line 14
    iput v1, p0, Lj7/b;->c0:I

    .line 15
    .line 16
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lj7/b;->c2()V

    .line 21
    .line 22
    const/16 v0, 0x22

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lj7/a;->g3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_1
    const/16 v0, 0x23

    .line 32
    .line 33
    if-eq p1, v0, :cond_b

    .line 34
    .line 35
    const/16 v0, 0x2d

    .line 36
    .line 37
    if-eq p1, v0, :cond_a

    .line 38
    .line 39
    const/16 v0, 0x5b

    .line 40
    .line 41
    if-eq p1, v0, :cond_9

    .line 42
    .line 43
    const/16 v0, 0x5d

    .line 44
    .line 45
    if-eq p1, v0, :cond_7

    .line 46
    .line 47
    const/16 v0, 0x66

    .line 48
    .line 49
    if-eq p1, v0, :cond_6

    .line 50
    .line 51
    const/16 v0, 0x6e

    .line 52
    .line 53
    if-eq p1, v0, :cond_5

    .line 54
    .line 55
    const/16 v0, 0x74

    .line 56
    .line 57
    if-eq p1, v0, :cond_4

    .line 58
    .line 59
    const/16 v0, 0x7b

    .line 60
    .line 61
    if-eq p1, v0, :cond_3

    .line 62
    .line 63
    const/16 v0, 0x7d

    .line 64
    .line 65
    if-eq p1, v0, :cond_2

    .line 66
    .line 67
    .line 68
    packed-switch p1, :pswitch_data_0

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :pswitch_0
    invoke-virtual {p0, p1}, Lj7/a;->e3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    .line 76
    .line 77
    :pswitch_1
    invoke-virtual {p0}, Lj7/a;->d3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    .line 81
    .line 82
    :pswitch_2
    invoke-virtual {p0, v1}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 87
    .line 88
    sget v1, Lj7/a;->l0:I

    .line 89
    and-int/2addr v0, v1

    .line 90
    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {p0}, Lj7/b;->b2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-virtual {p0}, Lj7/a;->h3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-virtual {p0}, Lj7/a;->c3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    .line 113
    .line 114
    :cond_6
    invoke-virtual {p0}, Lj7/a;->W2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    .line 118
    :cond_7
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 119
    .line 120
    sget v1, Lj7/a;->l0:I

    .line 121
    and-int/2addr v0, v1

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lj7/b;->M1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :cond_8
    :goto_0
    const/4 v0, 0x1

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v0, p1}, Lj7/a;->i3(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    .line 136
    .line 137
    :cond_9
    invoke-virtual {p0}, Lj7/b;->a2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    .line 141
    .line 142
    :cond_a
    invoke-virtual {p0}, Lj7/a;->b3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 143
    move-result-object p1

    .line 144
    return-object p1

    .line 145
    .line 146
    .line 147
    :cond_b
    invoke-virtual {p0, v1}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    nop

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
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final l2(III)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const/16 v1, 0x2c

    .line 4
    const/4 v2, 0x2

    .line 5
    .line 6
    const/16 v3, 0x80

    .line 7
    const/4 v4, 0x1

    .line 8
    .line 9
    if-ne p2, v4, :cond_2

    .line 10
    .line 11
    and-int/lit16 p2, p3, 0xc0

    .line 12
    .line 13
    if-eq p2, v3, :cond_0

    .line 14
    .line 15
    and-int/lit16 p2, p3, 0xff

    .line 16
    .line 17
    iget v5, p0, Lf7/b;->s:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2, v5}, Lj7/b;->Z1(II)V

    .line 21
    .line 22
    :cond_0
    shl-int/lit8 p1, p1, 0x6

    .line 23
    .line 24
    and-int/lit8 p2, p3, 0x3f

    .line 25
    or-int/2addr p1, p2

    .line 26
    .line 27
    iget p2, p0, Lf7/b;->s:I

    .line 28
    .line 29
    iget p3, p0, Lf7/b;->t:I

    .line 30
    .line 31
    if-lt p2, p3, :cond_1

    .line 32
    .line 33
    iput v1, p0, Lj7/b;->c0:I

    .line 34
    .line 35
    iput p1, p0, Lj7/b;->W:I

    .line 36
    .line 37
    iput v2, p0, Lj7/b;->X:I

    .line 38
    return v0

    .line 39
    .line 40
    :cond_1
    iget-object p3, p0, Lj7/a;->k0:[B

    .line 41
    .line 42
    add-int/lit8 v5, p2, 0x1

    .line 43
    .line 44
    iput v5, p0, Lf7/b;->s:I

    .line 45
    .line 46
    aget-byte p3, p3, p2

    .line 47
    move p2, v2

    .line 48
    .line 49
    :cond_2
    if-ne p2, v2, :cond_5

    .line 50
    .line 51
    and-int/lit16 p2, p3, 0xc0

    .line 52
    .line 53
    if-eq p2, v3, :cond_3

    .line 54
    .line 55
    and-int/lit16 p2, p3, 0xff

    .line 56
    .line 57
    iget v2, p0, Lf7/b;->s:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2, v2}, Lj7/b;->Z1(II)V

    .line 61
    .line 62
    :cond_3
    shl-int/lit8 p1, p1, 0x6

    .line 63
    .line 64
    and-int/lit8 p2, p3, 0x3f

    .line 65
    or-int/2addr p1, p2

    .line 66
    .line 67
    iget p2, p0, Lf7/b;->s:I

    .line 68
    .line 69
    iget p3, p0, Lf7/b;->t:I

    .line 70
    .line 71
    if-lt p2, p3, :cond_4

    .line 72
    .line 73
    iput v1, p0, Lj7/b;->c0:I

    .line 74
    .line 75
    iput p1, p0, Lj7/b;->W:I

    .line 76
    const/4 p1, 0x3

    .line 77
    .line 78
    iput p1, p0, Lj7/b;->X:I

    .line 79
    return v0

    .line 80
    .line 81
    :cond_4
    iget-object p3, p0, Lj7/a;->k0:[B

    .line 82
    .line 83
    add-int/lit8 v0, p2, 0x1

    .line 84
    .line 85
    iput v0, p0, Lf7/b;->s:I

    .line 86
    .line 87
    aget-byte p3, p3, p2

    .line 88
    .line 89
    :cond_5
    and-int/lit16 p2, p3, 0xc0

    .line 90
    .line 91
    if-eq p2, v3, :cond_6

    .line 92
    .line 93
    and-int/lit16 p2, p3, 0xff

    .line 94
    .line 95
    iget v0, p0, Lf7/b;->s:I

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p2, v0}, Lj7/b;->Z1(II)V

    .line 99
    .line 100
    :cond_6
    shl-int/lit8 p1, p1, 0x6

    .line 101
    .line 102
    and-int/lit8 p2, p3, 0x3f

    .line 103
    or-int/2addr p1, p2

    .line 104
    .line 105
    const/high16 p2, 0x10000

    .line 106
    sub-int/2addr p1, p2

    .line 107
    .line 108
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 109
    .line 110
    shr-int/lit8 p3, p1, 0xa

    .line 111
    .line 112
    .line 113
    const v0, 0xd800

    .line 114
    or-int/2addr p3, v0

    .line 115
    int-to-char p3, p3

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 119
    .line 120
    and-int/lit16 p1, p1, 0x3ff

    .line 121
    .line 122
    .line 123
    const p2, 0xdc00

    .line 124
    or-int/2addr p1, p2

    .line 125
    .line 126
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 127
    int-to-char p1, p1

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 131
    return v4
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
.end method

.method public final l3(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xe

    .line 3
    .line 4
    const/16 v1, 0x20

    .line 5
    .line 6
    if-gt p1, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lj7/a;->S2(I)I

    .line 10
    move-result p1

    .line 11
    .line 12
    if-gtz p1, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lj7/b;->c0:I

    .line 15
    .line 16
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    const/16 v2, 0x3a

    .line 20
    .line 21
    const/16 v3, 0x23

    .line 22
    .line 23
    if-eq p1, v2, :cond_3

    .line 24
    .line 25
    const/16 v2, 0x2f

    .line 26
    .line 27
    if-ne p1, v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    .line 34
    :cond_1
    if-ne p1, v3, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    .line 41
    .line 42
    :cond_2
    const-string/jumbo v0, "was expecting a colon to separate field name and value"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 46
    .line 47
    :cond_3
    iget p1, p0, Lf7/b;->s:I

    .line 48
    .line 49
    iget v0, p0, Lf7/b;->t:I

    .line 50
    .line 51
    const/16 v2, 0xc

    .line 52
    .line 53
    if-lt p1, v0, :cond_4

    .line 54
    .line 55
    iput v2, p0, Lj7/b;->c0:I

    .line 56
    .line 57
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 58
    .line 59
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 60
    return-object p1

    .line 61
    .line 62
    :cond_4
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 63
    .line 64
    aget-byte v0, v0, p1

    .line 65
    .line 66
    add-int/lit8 p1, p1, 0x1

    .line 67
    .line 68
    iput p1, p0, Lf7/b;->s:I

    .line 69
    .line 70
    if-gt v0, v1, :cond_5

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lj7/a;->S2(I)I

    .line 74
    move-result v0

    .line 75
    .line 76
    if-gtz v0, :cond_5

    .line 77
    .line 78
    iput v2, p0, Lj7/b;->c0:I

    .line 79
    .line 80
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 81
    return-object p1

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-virtual {p0}, Lj7/b;->c2()V

    .line 85
    .line 86
    const/16 p1, 0x22

    .line 87
    .line 88
    if-ne v0, p1, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lj7/a;->g3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    .line 95
    :cond_6
    if-eq v0, v3, :cond_d

    .line 96
    .line 97
    const/16 p1, 0x2d

    .line 98
    .line 99
    if-eq v0, p1, :cond_c

    .line 100
    .line 101
    const/16 p1, 0x5b

    .line 102
    .line 103
    if-eq v0, p1, :cond_b

    .line 104
    .line 105
    const/16 p1, 0x66

    .line 106
    .line 107
    if-eq v0, p1, :cond_a

    .line 108
    .line 109
    const/16 p1, 0x6e

    .line 110
    .line 111
    if-eq v0, p1, :cond_9

    .line 112
    .line 113
    const/16 p1, 0x74

    .line 114
    .line 115
    if-eq v0, p1, :cond_8

    .line 116
    .line 117
    const/16 p1, 0x7b

    .line 118
    .line 119
    if-eq v0, p1, :cond_7

    .line 120
    .line 121
    .line 122
    packed-switch v0, :pswitch_data_0

    .line 123
    const/4 p1, 0x0

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1, v0}, Lj7/a;->i3(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    .line 130
    .line 131
    :pswitch_0
    invoke-virtual {p0, v0}, Lj7/a;->e3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    .line 135
    .line 136
    :pswitch_1
    invoke-virtual {p0}, Lj7/a;->d3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    .line 140
    .line 141
    :pswitch_2
    invoke-virtual {p0, v2}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-virtual {p0}, Lj7/b;->b2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    .line 150
    .line 151
    :cond_8
    invoke-virtual {p0}, Lj7/a;->h3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    .line 155
    .line 156
    :cond_9
    invoke-virtual {p0}, Lj7/a;->c3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 157
    move-result-object p1

    .line 158
    return-object p1

    .line 159
    .line 160
    .line 161
    :cond_a
    invoke-virtual {p0}, Lj7/a;->W2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    .line 165
    .line 166
    :cond_b
    invoke-virtual {p0}, Lj7/b;->a2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    .line 170
    .line 171
    :cond_c
    invoke-virtual {p0}, Lj7/a;->b3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 172
    move-result-object p1

    .line 173
    return-object p1

    .line 174
    .line 175
    .line 176
    :cond_d
    invoke-virtual {p0, v2}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 177
    move-result-object p1

    .line 178
    return-object p1

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
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final m2(II)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit16 v0, p2, 0xc0

    .line 3
    .line 4
    const/16 v1, 0x80

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    and-int/lit16 v0, p2, 0xff

    .line 9
    .line 10
    iget v1, p0, Lf7/b;->s:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lj7/b;->Z1(II)V

    .line 14
    .line 15
    :cond_0
    and-int/lit8 p1, p1, 0x1f

    .line 16
    .line 17
    shl-int/lit8 p1, p1, 0x6

    .line 18
    .line 19
    and-int/lit8 p2, p2, 0x3f

    .line 20
    or-int/2addr p1, p2

    .line 21
    return p1
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
.end method

.method public final m3(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xd

    .line 3
    .line 4
    const/16 v1, 0x20

    .line 5
    .line 6
    if-gt p1, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lj7/a;->S2(I)I

    .line 10
    move-result p1

    .line 11
    .line 12
    if-gtz p1, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lj7/b;->c0:I

    .line 15
    .line 16
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    const/16 v2, 0x2c

    .line 20
    .line 21
    const/16 v3, 0x23

    .line 22
    .line 23
    const/16 v4, 0x7d

    .line 24
    .line 25
    const/16 v5, 0x5d

    .line 26
    .line 27
    if-eq p1, v2, :cond_5

    .line 28
    .line 29
    if-ne p1, v5, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lj7/b;->M1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    .line 36
    :cond_1
    if-ne p1, v4, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    .line 43
    :cond_2
    const/16 v2, 0x2f

    .line 44
    .line 45
    if-ne p1, v2, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    .line 52
    :cond_3
    if-ne p1, v3, :cond_4

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    .line 59
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string/jumbo v2, "was expecting comma to separate "

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v2, " entries"

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 90
    .line 91
    :cond_5
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Li7/d;->p()Z

    .line 95
    .line 96
    iget p1, p0, Lf7/b;->s:I

    .line 97
    .line 98
    iget v0, p0, Lf7/b;->t:I

    .line 99
    .line 100
    const/16 v2, 0xf

    .line 101
    .line 102
    if-lt p1, v0, :cond_6

    .line 103
    .line 104
    iput v2, p0, Lj7/b;->c0:I

    .line 105
    .line 106
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 107
    .line 108
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 109
    return-object p1

    .line 110
    .line 111
    :cond_6
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 112
    .line 113
    aget-byte v0, v0, p1

    .line 114
    const/4 v6, 0x1

    .line 115
    add-int/2addr p1, v6

    .line 116
    .line 117
    iput p1, p0, Lf7/b;->s:I

    .line 118
    .line 119
    if-gt v0, v1, :cond_7

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lj7/a;->S2(I)I

    .line 123
    move-result v0

    .line 124
    .line 125
    if-gtz v0, :cond_7

    .line 126
    .line 127
    iput v2, p0, Lj7/b;->c0:I

    .line 128
    .line 129
    iget-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 130
    return-object p1

    .line 131
    .line 132
    .line 133
    :cond_7
    invoke-virtual {p0}, Lj7/b;->c2()V

    .line 134
    .line 135
    const/16 p1, 0x22

    .line 136
    .line 137
    if-ne v0, p1, :cond_8

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lj7/a;->g3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    .line 144
    :cond_8
    if-eq v0, v3, :cond_12

    .line 145
    .line 146
    const/16 p1, 0x2d

    .line 147
    .line 148
    if-eq v0, p1, :cond_11

    .line 149
    .line 150
    const/16 p1, 0x5b

    .line 151
    .line 152
    if-eq v0, p1, :cond_10

    .line 153
    .line 154
    if-eq v0, v5, :cond_e

    .line 155
    .line 156
    const/16 p1, 0x66

    .line 157
    .line 158
    if-eq v0, p1, :cond_d

    .line 159
    .line 160
    const/16 p1, 0x6e

    .line 161
    .line 162
    if-eq v0, p1, :cond_c

    .line 163
    .line 164
    const/16 p1, 0x74

    .line 165
    .line 166
    if-eq v0, p1, :cond_b

    .line 167
    .line 168
    const/16 p1, 0x7b

    .line 169
    .line 170
    if-eq v0, p1, :cond_a

    .line 171
    .line 172
    if-eq v0, v4, :cond_9

    .line 173
    .line 174
    .line 175
    packed-switch v0, :pswitch_data_0

    .line 176
    goto :goto_0

    .line 177
    .line 178
    .line 179
    :pswitch_0
    invoke-virtual {p0, v0}, Lj7/a;->e3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 180
    move-result-object p1

    .line 181
    return-object p1

    .line 182
    .line 183
    .line 184
    :pswitch_1
    invoke-virtual {p0}, Lj7/a;->d3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 185
    move-result-object p1

    .line 186
    return-object p1

    .line 187
    .line 188
    .line 189
    :pswitch_2
    invoke-virtual {p0, v2}, Lj7/a;->f3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 190
    move-result-object p1

    .line 191
    return-object p1

    .line 192
    .line 193
    :cond_9
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 194
    .line 195
    sget v1, Lj7/a;->l0:I

    .line 196
    and-int/2addr p1, v1

    .line 197
    .line 198
    if-eqz p1, :cond_f

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lj7/b;->N1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 202
    move-result-object p1

    .line 203
    return-object p1

    .line 204
    .line 205
    .line 206
    :cond_a
    invoke-virtual {p0}, Lj7/b;->b2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 207
    move-result-object p1

    .line 208
    return-object p1

    .line 209
    .line 210
    .line 211
    :cond_b
    invoke-virtual {p0}, Lj7/a;->h3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 212
    move-result-object p1

    .line 213
    return-object p1

    .line 214
    .line 215
    .line 216
    :cond_c
    invoke-virtual {p0}, Lj7/a;->c3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 217
    move-result-object p1

    .line 218
    return-object p1

    .line 219
    .line 220
    .line 221
    :cond_d
    invoke-virtual {p0}, Lj7/a;->W2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 222
    move-result-object p1

    .line 223
    return-object p1

    .line 224
    .line 225
    :cond_e
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 226
    .line 227
    sget v1, Lj7/a;->l0:I

    .line 228
    and-int/2addr p1, v1

    .line 229
    .line 230
    if-eqz p1, :cond_f

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Lj7/b;->M1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 234
    move-result-object p1

    .line 235
    return-object p1

    .line 236
    .line 237
    .line 238
    :cond_f
    :goto_0
    invoke-virtual {p0, v6, v0}, Lj7/a;->i3(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 239
    move-result-object p1

    .line 240
    return-object p1

    .line 241
    .line 242
    .line 243
    :cond_10
    invoke-virtual {p0}, Lj7/b;->a2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 244
    move-result-object p1

    .line 245
    return-object p1

    .line 246
    .line 247
    .line 248
    :cond_11
    invoke-virtual {p0}, Lj7/a;->b3()Lcom/fasterxml/jackson/core/JsonToken;

    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    .line 252
    .line 253
    :cond_12
    invoke-virtual {p0, v2}, Lj7/a;->A2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 254
    move-result-object p1

    .line 255
    return-object p1

    .line 256
    nop

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
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final n2(III)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit8 p1, p1, 0xf

    .line 3
    .line 4
    and-int/lit16 v0, p2, 0xc0

    .line 5
    .line 6
    const/16 v1, 0x80

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    and-int/lit16 v0, p2, 0xff

    .line 11
    .line 12
    iget v2, p0, Lf7/b;->s:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v2}, Lj7/b;->Z1(II)V

    .line 16
    .line 17
    :cond_0
    shl-int/lit8 p1, p1, 0x6

    .line 18
    .line 19
    and-int/lit8 p2, p2, 0x3f

    .line 20
    or-int/2addr p1, p2

    .line 21
    .line 22
    and-int/lit16 p2, p3, 0xc0

    .line 23
    .line 24
    if-eq p2, v1, :cond_1

    .line 25
    .line 26
    and-int/lit16 p2, p3, 0xff

    .line 27
    .line 28
    iget v0, p0, Lf7/b;->s:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p2, v0}, Lj7/b;->Z1(II)V

    .line 32
    .line 33
    :cond_1
    shl-int/lit8 p1, p1, 0x6

    .line 34
    .line 35
    and-int/lit8 p2, p3, 0x3f

    .line 36
    or-int/2addr p1, p2

    .line 37
    return p1
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

.method public final o2(IIII)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit16 v0, p2, 0xc0

    .line 3
    .line 4
    const/16 v1, 0x80

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    and-int/lit16 v0, p2, 0xff

    .line 9
    .line 10
    iget v2, p0, Lf7/b;->s:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, v2}, Lj7/b;->Z1(II)V

    .line 14
    .line 15
    :cond_0
    and-int/lit8 p1, p1, 0x7

    .line 16
    .line 17
    shl-int/lit8 p1, p1, 0x6

    .line 18
    .line 19
    and-int/lit8 p2, p2, 0x3f

    .line 20
    or-int/2addr p1, p2

    .line 21
    .line 22
    and-int/lit16 p2, p3, 0xc0

    .line 23
    .line 24
    if-eq p2, v1, :cond_1

    .line 25
    .line 26
    and-int/lit16 p2, p3, 0xff

    .line 27
    .line 28
    iget v0, p0, Lf7/b;->s:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p2, v0}, Lj7/b;->Z1(II)V

    .line 32
    .line 33
    :cond_1
    shl-int/lit8 p1, p1, 0x6

    .line 34
    .line 35
    and-int/lit8 p2, p3, 0x3f

    .line 36
    or-int/2addr p1, p2

    .line 37
    .line 38
    and-int/lit16 p2, p4, 0xc0

    .line 39
    .line 40
    if-eq p2, v1, :cond_2

    .line 41
    .line 42
    and-int/lit16 p2, p4, 0xff

    .line 43
    .line 44
    iget p3, p0, Lf7/b;->s:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2, p3}, Lj7/b;->Z1(II)V

    .line 48
    .line 49
    :cond_2
    shl-int/lit8 p1, p1, 0x6

    .line 50
    .line 51
    and-int/lit8 p2, p4, 0x3f

    .line 52
    or-int/2addr p1, p2

    .line 53
    .line 54
    const/high16 p2, 0x10000

    .line 55
    sub-int/2addr p1, p2

    .line 56
    return p1
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

.method public final p2()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 3
    .line 4
    sget-object v1, Lj7/a;->t0:[I

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->s:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    aget-byte v4, v0, v2

    .line 11
    .line 12
    and-int/lit16 v4, v4, 0xff

    .line 13
    .line 14
    aget v5, v1, v4

    .line 15
    const/4 v6, 0x0

    .line 16
    .line 17
    const/16 v7, 0x22

    .line 18
    .line 19
    if-nez v5, :cond_8

    .line 20
    .line 21
    add-int/lit8 v5, v2, 0x2

    .line 22
    .line 23
    aget-byte v3, v0, v3

    .line 24
    .line 25
    and-int/lit16 v3, v3, 0xff

    .line 26
    .line 27
    aget v8, v1, v3

    .line 28
    .line 29
    if-nez v8, :cond_6

    .line 30
    .line 31
    shl-int/lit8 v4, v4, 0x8

    .line 32
    or-int/2addr v3, v4

    .line 33
    .line 34
    add-int/lit8 v4, v2, 0x3

    .line 35
    .line 36
    aget-byte v5, v0, v5

    .line 37
    .line 38
    and-int/lit16 v5, v5, 0xff

    .line 39
    .line 40
    aget v8, v1, v5

    .line 41
    .line 42
    if-nez v8, :cond_4

    .line 43
    .line 44
    shl-int/lit8 v3, v3, 0x8

    .line 45
    or-int/2addr v3, v5

    .line 46
    .line 47
    add-int/lit8 v5, v2, 0x4

    .line 48
    .line 49
    aget-byte v4, v0, v4

    .line 50
    .line 51
    and-int/lit16 v4, v4, 0xff

    .line 52
    .line 53
    aget v8, v1, v4

    .line 54
    .line 55
    if-nez v8, :cond_2

    .line 56
    .line 57
    shl-int/lit8 v3, v3, 0x8

    .line 58
    or-int/2addr v3, v4

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x5

    .line 61
    .line 62
    aget-byte v0, v0, v5

    .line 63
    .line 64
    and-int/lit16 v0, v0, 0xff

    .line 65
    .line 66
    aget v1, v1, v0

    .line 67
    .line 68
    if-nez v1, :cond_0

    .line 69
    .line 70
    iput v3, p0, Lj7/b;->V:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v2, v0}, Lj7/a;->P2(II)Ljava/lang/String;

    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    .line 77
    :cond_0
    if-ne v0, v7, :cond_1

    .line 78
    .line 79
    iput v2, p0, Lf7/b;->s:I

    .line 80
    const/4 v0, 0x4

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v3, v0}, Lj7/b;->Q1(II)Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :cond_1
    return-object v6

    .line 87
    .line 88
    :cond_2
    if-ne v4, v7, :cond_3

    .line 89
    .line 90
    iput v5, p0, Lf7/b;->s:I

    .line 91
    const/4 v0, 0x3

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v3, v0}, Lj7/b;->Q1(II)Ljava/lang/String;

    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_3
    return-object v6

    .line 98
    .line 99
    :cond_4
    if-ne v5, v7, :cond_5

    .line 100
    .line 101
    iput v4, p0, Lf7/b;->s:I

    .line 102
    const/4 v0, 0x2

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v3, v0}, Lj7/b;->Q1(II)Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    :cond_5
    return-object v6

    .line 109
    .line 110
    :cond_6
    if-ne v3, v7, :cond_7

    .line 111
    .line 112
    iput v5, p0, Lf7/b;->s:I

    .line 113
    const/4 v0, 0x1

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v4, v0}, Lj7/b;->Q1(II)Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_7
    return-object v6

    .line 120
    .line 121
    :cond_8
    if-ne v4, v7, :cond_9

    .line 122
    .line 123
    iput v3, p0, Lf7/b;->s:I

    .line 124
    .line 125
    const-string v0, ""

    .line 126
    return-object v0

    .line 127
    :cond_9
    return-object v6
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
.end method

.method public final q2(III)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lj7/b;->T:[I

    .line 3
    .line 4
    sget-object v1, Lj7/a;->t0:[I

    .line 5
    .line 6
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget v3, p0, Lf7/b;->t:I

    .line 9
    .line 10
    const/16 v4, 0x9

    .line 11
    .line 12
    if-lt v2, v3, :cond_0

    .line 13
    .line 14
    iput p1, p0, Lj7/b;->U:I

    .line 15
    .line 16
    iput p2, p0, Lj7/b;->W:I

    .line 17
    .line 18
    iput p3, p0, Lj7/b;->X:I

    .line 19
    .line 20
    iput v4, p0, Lj7/b;->c0:I

    .line 21
    .line 22
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 23
    .line 24
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    return-object p1

    .line 26
    .line 27
    :cond_0
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 28
    .line 29
    add-int/lit8 v5, v2, 0x1

    .line 30
    .line 31
    iput v5, p0, Lf7/b;->s:I

    .line 32
    .line 33
    aget-byte v2, v3, v2

    .line 34
    .line 35
    and-int/lit16 v2, v2, 0xff

    .line 36
    .line 37
    const/16 v3, 0x27

    .line 38
    .line 39
    if-ne v2, v3, :cond_5

    .line 40
    .line 41
    if-lez p3, :cond_2

    .line 42
    array-length v1, v0

    .line 43
    .line 44
    if-lt p1, v1, :cond_1

    .line 45
    array-length v1, v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lf7/b;->E1([II)[I

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lj7/b;->T:[I

    .line 52
    .line 53
    :cond_1
    add-int/lit8 v1, p1, 0x1

    .line 54
    .line 55
    .line 56
    invoke-static {p2, p3}, Lj7/b;->V1(II)I

    .line 57
    move-result p2

    .line 58
    .line 59
    aput p2, v0, p1

    .line 60
    move p1, v1

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_2
    if-nez p1, :cond_3

    .line 64
    .line 65
    const-string p1, ""

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    .line 72
    :cond_3
    :goto_1
    iget-object p2, p0, Lj7/b;->S:Lk7/a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v0, p1}, Lk7/a;->z([II)Ljava/lang/String;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    if-nez p2, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0, p1, p3}, Lj7/b;->L1([III)Ljava/lang/String;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {p0, p2}, Lj7/b;->P1(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    .line 89
    :cond_5
    const/16 v3, 0x22

    .line 90
    const/4 v5, 0x4

    .line 91
    const/4 v6, 0x1

    .line 92
    .line 93
    if-eq v2, v3, :cond_d

    .line 94
    .line 95
    aget v3, v1, v2

    .line 96
    .line 97
    if-eqz v3, :cond_d

    .line 98
    .line 99
    const/16 v3, 0x5c

    .line 100
    .line 101
    const/16 v7, 0x8

    .line 102
    .line 103
    if-eq v2, v3, :cond_6

    .line 104
    .line 105
    const-string v3, "name"

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v2, v3}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 109
    goto :goto_2

    .line 110
    .line 111
    .line 112
    :cond_6
    invoke-virtual {p0}, Lj7/a;->g2()I

    .line 113
    move-result v2

    .line 114
    .line 115
    if-gez v2, :cond_7

    .line 116
    .line 117
    iput v7, p0, Lj7/b;->c0:I

    .line 118
    .line 119
    iput v4, p0, Lj7/b;->d0:I

    .line 120
    .line 121
    iput p1, p0, Lj7/b;->U:I

    .line 122
    .line 123
    iput p2, p0, Lj7/b;->W:I

    .line 124
    .line 125
    iput p3, p0, Lj7/b;->X:I

    .line 126
    .line 127
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 128
    .line 129
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 130
    return-object p1

    .line 131
    .line 132
    :cond_7
    :goto_2
    const/16 v3, 0x7f

    .line 133
    .line 134
    if-le v2, v3, :cond_d

    .line 135
    const/4 v3, 0x0

    .line 136
    .line 137
    if-lt p3, v5, :cond_9

    .line 138
    array-length p3, v0

    .line 139
    .line 140
    if-lt p1, p3, :cond_8

    .line 141
    array-length p3, v0

    .line 142
    .line 143
    .line 144
    invoke-static {v0, p3}, Lf7/b;->E1([II)[I

    .line 145
    move-result-object v0

    .line 146
    .line 147
    iput-object v0, p0, Lj7/b;->T:[I

    .line 148
    .line 149
    :cond_8
    add-int/lit8 p3, p1, 0x1

    .line 150
    .line 151
    aput p2, v0, p1

    .line 152
    move p1, p3

    .line 153
    move p2, v3

    .line 154
    move p3, p2

    .line 155
    .line 156
    :cond_9
    const/16 v4, 0x800

    .line 157
    .line 158
    if-ge v2, v4, :cond_a

    .line 159
    .line 160
    shl-int/lit8 p2, p2, 0x8

    .line 161
    .line 162
    shr-int/lit8 v3, v2, 0x6

    .line 163
    .line 164
    or-int/lit16 v3, v3, 0xc0

    .line 165
    or-int/2addr p2, v3

    .line 166
    .line 167
    add-int/lit8 p3, p3, 0x1

    .line 168
    goto :goto_4

    .line 169
    .line 170
    :cond_a
    shl-int/lit8 p2, p2, 0x8

    .line 171
    .line 172
    shr-int/lit8 v4, v2, 0xc

    .line 173
    .line 174
    or-int/lit16 v4, v4, 0xe0

    .line 175
    or-int/2addr p2, v4

    .line 176
    .line 177
    add-int/lit8 p3, p3, 0x1

    .line 178
    .line 179
    if-lt p3, v5, :cond_c

    .line 180
    array-length p3, v0

    .line 181
    .line 182
    if-lt p1, p3, :cond_b

    .line 183
    array-length p3, v0

    .line 184
    .line 185
    .line 186
    invoke-static {v0, p3}, Lf7/b;->E1([II)[I

    .line 187
    move-result-object v0

    .line 188
    .line 189
    iput-object v0, p0, Lj7/b;->T:[I

    .line 190
    .line 191
    :cond_b
    add-int/lit8 p3, p1, 0x1

    .line 192
    .line 193
    aput p2, v0, p1

    .line 194
    move p1, p3

    .line 195
    move p3, v3

    .line 196
    goto :goto_3

    .line 197
    :cond_c
    move v3, p2

    .line 198
    .line 199
    :goto_3
    shl-int/lit8 p2, v3, 0x8

    .line 200
    .line 201
    shr-int/lit8 v3, v2, 0x6

    .line 202
    .line 203
    and-int/lit8 v3, v3, 0x3f

    .line 204
    .line 205
    or-int/lit16 v3, v3, 0x80

    .line 206
    or-int/2addr p2, v3

    .line 207
    add-int/2addr p3, v6

    .line 208
    .line 209
    :goto_4
    and-int/lit8 v2, v2, 0x3f

    .line 210
    .line 211
    or-int/lit16 v2, v2, 0x80

    .line 212
    .line 213
    :cond_d
    if-ge p3, v5, :cond_e

    .line 214
    .line 215
    add-int/lit8 p3, p3, 0x1

    .line 216
    .line 217
    shl-int/lit8 p2, p2, 0x8

    .line 218
    or-int/2addr p2, v2

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    :cond_e
    array-length p3, v0

    .line 222
    .line 223
    if-lt p1, p3, :cond_f

    .line 224
    array-length p3, v0

    .line 225
    .line 226
    .line 227
    invoke-static {v0, p3}, Lf7/b;->E1([II)[I

    .line 228
    move-result-object v0

    .line 229
    .line 230
    iput-object v0, p0, Lj7/b;->T:[I

    .line 231
    .line 232
    :cond_f
    add-int/lit8 p3, p1, 0x1

    .line 233
    .line 234
    aput p2, v0, p1

    .line 235
    move p1, p3

    .line 236
    move p2, v2

    .line 237
    move p3, v6

    .line 238
    .line 239
    goto/16 :goto_0
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
.end method

.method public final r2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lj7/a;->s0:[I

    .line 3
    .line 4
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 5
    .line 6
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 10
    move-result-object v2

    .line 11
    .line 12
    iget-object v3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 16
    move-result v3

    .line 17
    .line 18
    iget v4, p0, Lf7/b;->s:I

    .line 19
    .line 20
    iget v5, p0, Lf7/b;->t:I

    .line 21
    .line 22
    add-int/lit8 v5, v5, -0x5

    .line 23
    .line 24
    :cond_0
    :goto_0
    iget v6, p0, Lf7/b;->t:I

    .line 25
    .line 26
    const/16 v7, 0x2d

    .line 27
    .line 28
    if-lt v4, v6, :cond_1

    .line 29
    .line 30
    iput v4, p0, Lf7/b;->s:I

    .line 31
    .line 32
    iput v7, p0, Lj7/b;->c0:I

    .line 33
    .line 34
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 38
    .line 39
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    .line 41
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 42
    return-object v0

    .line 43
    :cond_1
    array-length v6, v2

    .line 44
    const/4 v8, 0x0

    .line 45
    .line 46
    if-lt v3, v6, :cond_2

    .line 47
    .line 48
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 52
    move-result-object v2

    .line 53
    move v3, v8

    .line 54
    .line 55
    :cond_2
    iget v6, p0, Lf7/b;->t:I

    .line 56
    array-length v9, v2

    .line 57
    sub-int/2addr v9, v3

    .line 58
    add-int/2addr v9, v4

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v9}, Ljava/lang/Math;->min(II)I

    .line 62
    move-result v6

    .line 63
    .line 64
    :goto_1
    if-ge v4, v6, :cond_0

    .line 65
    .line 66
    add-int/lit8 v9, v4, 0x1

    .line 67
    .line 68
    aget-byte v10, v1, v4

    .line 69
    .line 70
    and-int/lit16 v10, v10, 0xff

    .line 71
    .line 72
    aget v11, v0, v10

    .line 73
    .line 74
    if-eqz v11, :cond_d

    .line 75
    .line 76
    const/16 v12, 0x22

    .line 77
    .line 78
    if-eq v10, v12, :cond_d

    .line 79
    const/4 v6, 0x1

    .line 80
    .line 81
    if-lt v9, v5, :cond_5

    .line 82
    .line 83
    iput v9, p0, Lf7/b;->s:I

    .line 84
    .line 85
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 89
    .line 90
    aget v2, v0, v10

    .line 91
    .line 92
    iget v3, p0, Lf7/b;->t:I

    .line 93
    .line 94
    if-ge v9, v3, :cond_3

    .line 95
    move v8, v6

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {p0, v10, v2, v8}, Lj7/a;->j2(IIZ)Z

    .line 99
    move-result v2

    .line 100
    .line 101
    if-nez v2, :cond_4

    .line 102
    .line 103
    iput v7, p0, Lj7/b;->d0:I

    .line 104
    .line 105
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 106
    .line 107
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 108
    return-object v0

    .line 109
    .line 110
    :cond_4
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 114
    move-result-object v2

    .line 115
    .line 116
    iget-object v3, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 120
    move-result v3

    .line 121
    .line 122
    iget v4, p0, Lf7/b;->s:I

    .line 123
    goto :goto_0

    .line 124
    .line 125
    :cond_5
    if-eq v11, v6, :cond_b

    .line 126
    const/4 v6, 0x2

    .line 127
    .line 128
    if-eq v11, v6, :cond_a

    .line 129
    const/4 v6, 0x3

    .line 130
    .line 131
    if-eq v11, v6, :cond_9

    .line 132
    const/4 v6, 0x4

    .line 133
    .line 134
    if-eq v11, v6, :cond_7

    .line 135
    .line 136
    const/16 v4, 0x20

    .line 137
    .line 138
    if-ge v10, v4, :cond_6

    .line 139
    .line 140
    .line 141
    const-string/jumbo v4, "string value"

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v10, v4}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 145
    goto :goto_2

    .line 146
    .line 147
    .line 148
    :cond_6
    invoke-virtual {p0, v10}, Lj7/b;->W1(I)V

    .line 149
    :goto_2
    move v4, v9

    .line 150
    goto :goto_4

    .line 151
    .line 152
    :cond_7
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 153
    .line 154
    add-int/lit8 v7, v4, 0x2

    .line 155
    .line 156
    aget-byte v9, v6, v9

    .line 157
    .line 158
    add-int/lit8 v11, v4, 0x3

    .line 159
    .line 160
    aget-byte v7, v6, v7

    .line 161
    .line 162
    add-int/lit8 v4, v4, 0x4

    .line 163
    .line 164
    aget-byte v6, v6, v11

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v10, v9, v7, v6}, Lj7/a;->o2(IIII)I

    .line 168
    move-result v6

    .line 169
    .line 170
    add-int/lit8 v7, v3, 0x1

    .line 171
    .line 172
    shr-int/lit8 v9, v6, 0xa

    .line 173
    .line 174
    .line 175
    const v10, 0xd800

    .line 176
    or-int/2addr v9, v10

    .line 177
    int-to-char v9, v9

    .line 178
    .line 179
    aput-char v9, v2, v3

    .line 180
    array-length v3, v2

    .line 181
    .line 182
    if-lt v7, v3, :cond_8

    .line 183
    .line 184
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 188
    move-result-object v2

    .line 189
    move v3, v8

    .line 190
    goto :goto_3

    .line 191
    :cond_8
    move v3, v7

    .line 192
    .line 193
    :goto_3
    and-int/lit16 v6, v6, 0x3ff

    .line 194
    .line 195
    .line 196
    const v7, 0xdc00

    .line 197
    .line 198
    or-int v10, v6, v7

    .line 199
    goto :goto_4

    .line 200
    .line 201
    :cond_9
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 202
    .line 203
    add-int/lit8 v7, v4, 0x2

    .line 204
    .line 205
    aget-byte v9, v6, v9

    .line 206
    .line 207
    add-int/lit8 v4, v4, 0x3

    .line 208
    .line 209
    aget-byte v6, v6, v7

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v10, v9, v6}, Lj7/a;->n2(III)I

    .line 213
    move-result v10

    .line 214
    goto :goto_4

    .line 215
    .line 216
    :cond_a
    iget-object v6, p0, Lj7/a;->k0:[B

    .line 217
    .line 218
    add-int/lit8 v4, v4, 0x2

    .line 219
    .line 220
    aget-byte v6, v6, v9

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v10, v6}, Lj7/a;->m2(II)I

    .line 224
    move-result v10

    .line 225
    goto :goto_4

    .line 226
    .line 227
    :cond_b
    iput v9, p0, Lf7/b;->s:I

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lj7/a;->h2()I

    .line 231
    move-result v10

    .line 232
    .line 233
    iget v4, p0, Lf7/b;->s:I

    .line 234
    :goto_4
    array-length v6, v2

    .line 235
    .line 236
    if-lt v3, v6, :cond_c

    .line 237
    .line 238
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 242
    move-result-object v2

    .line 243
    goto :goto_5

    .line 244
    :cond_c
    move v8, v3

    .line 245
    .line 246
    :goto_5
    add-int/lit8 v3, v8, 0x1

    .line 247
    int-to-char v6, v10

    .line 248
    .line 249
    aput-char v6, v2, v8

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_d
    const/16 v4, 0x27

    .line 254
    .line 255
    if-ne v10, v4, :cond_e

    .line 256
    .line 257
    iput v9, p0, Lf7/b;->s:I

    .line 258
    .line 259
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 263
    .line 264
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 268
    move-result-object v0

    .line 269
    return-object v0

    .line 270
    .line 271
    :cond_e
    add-int/lit8 v4, v3, 0x1

    .line 272
    int-to-char v10, v10

    .line 273
    .line 274
    aput-char v10, v2, v3

    .line 275
    move v3, v4

    .line 276
    move v4, v9

    .line 277
    .line 278
    goto/16 :goto_1
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

.method public final s2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-ge v0, v1, :cond_4

    .line 8
    .line 9
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 10
    .line 11
    add-int/lit8 v3, v0, 0x1

    .line 12
    .line 13
    iput v3, p0, Lf7/b;->s:I

    .line 14
    .line 15
    aget-byte v0, v1, v0

    .line 16
    .line 17
    and-int/lit16 v0, v0, 0xff

    .line 18
    .line 19
    if-eq p1, v2, :cond_2

    .line 20
    const/4 v1, 0x2

    .line 21
    .line 22
    if-eq p1, v1, :cond_1

    .line 23
    const/4 v1, 0x3

    .line 24
    .line 25
    if-eq p1, v1, :cond_0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    iget-wide v1, p0, Lf7/b;->u:J

    .line 29
    .line 30
    const-wide/16 v3, 0x3

    .line 31
    sub-long/2addr v1, v3

    .line 32
    .line 33
    iput-wide v1, p0, Lf7/b;->u:J

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lj7/a;->V2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_1
    const/16 v1, 0xbf

    .line 41
    .line 42
    if-eq v0, v1, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    const-string v1, "Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1, v0}, Lf7/c;->L0(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_2
    const/16 v1, 0xbb

    .line 55
    .line 56
    if-eq v0, v1, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    const-string v1, "Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM"

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Lf7/c;->L0(Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_4
    iput p1, p0, Lj7/b;->W:I

    .line 71
    .line 72
    iput v2, p0, Lj7/b;->c0:I

    .line 73
    .line 74
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 75
    .line 76
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 77
    return-object p1
    .line 78
.end method

.method public t0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-lt v0, v1, :cond_3

    .line 8
    .line 9
    iget-boolean v0, p0, Lf7/b;->r:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-object v2

    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Lj7/b;->e0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 19
    .line 20
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lj7/a;->L2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lj7/b;->O1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    .line 34
    :cond_2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 35
    return-object v0

    .line 36
    .line 37
    :cond_3
    iget-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 38
    .line 39
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    .line 41
    if-ne v1, v3, :cond_4

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lj7/a;->K2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_4
    const/4 v1, 0x0

    .line 48
    .line 49
    iput v1, p0, Lf7/b;->H:I

    .line 50
    .line 51
    iget-wide v3, p0, Lf7/b;->u:J

    .line 52
    int-to-long v5, v0

    .line 53
    add-long/2addr v3, v5

    .line 54
    .line 55
    iput-wide v3, p0, Lf7/b;->x:J

    .line 56
    .line 57
    iput-object v2, p0, Lf7/b;->G:[B

    .line 58
    .line 59
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 60
    .line 61
    add-int/lit8 v3, v0, 0x1

    .line 62
    .line 63
    iput v3, p0, Lf7/b;->s:I

    .line 64
    .line 65
    aget-byte v0, v1, v0

    .line 66
    .line 67
    and-int/lit16 v0, v0, 0xff

    .line 68
    .line 69
    iget v1, p0, Lj7/b;->a0:I

    .line 70
    .line 71
    .line 72
    packed-switch v1, :pswitch_data_0

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/fasterxml/jackson/core/util/k;->c()V

    .line 76
    return-object v2

    .line 77
    .line 78
    .line 79
    :pswitch_0
    invoke-virtual {p0, v0}, Lj7/a;->m3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    .line 83
    .line 84
    :pswitch_1
    invoke-virtual {p0, v0}, Lj7/a;->j3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    .line 88
    .line 89
    :pswitch_2
    invoke-virtual {p0, v0}, Lj7/a;->l3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    .line 93
    .line 94
    :pswitch_3
    invoke-virtual {p0, v0}, Lj7/a;->Y2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    .line 98
    .line 99
    :pswitch_4
    invoke-virtual {p0, v0}, Lj7/a;->X2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 100
    move-result-object v0

    .line 101
    return-object v0

    .line 102
    .line 103
    .line 104
    :pswitch_5
    invoke-virtual {p0, v0}, Lj7/a;->j3(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    .line 108
    .line 109
    :pswitch_6
    invoke-virtual {p0, v0}, Lj7/a;->V2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    nop

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final t2(IZ)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const/16 p2, 0x34

    .line 11
    goto :goto_1

    .line 12
    .line 13
    :cond_0
    const/16 p2, 0x35

    .line 14
    .line 15
    :goto_1
    iput p2, p0, Lj7/b;->c0:I

    .line 16
    .line 17
    iput p1, p0, Lj7/b;->W:I

    .line 18
    .line 19
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 20
    .line 21
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 22
    return-object p1

    .line 23
    .line 24
    :cond_1
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 25
    .line 26
    add-int/lit8 v2, v0, 0x1

    .line 27
    .line 28
    iput v2, p0, Lf7/b;->s:I

    .line 29
    .line 30
    aget-byte v0, v1, v0

    .line 31
    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    const/4 v3, 0x1

    .line 36
    .line 37
    if-ge v0, v1, :cond_4

    .line 38
    .line 39
    const/16 p2, 0xa

    .line 40
    .line 41
    if-ne v0, p2, :cond_2

    .line 42
    .line 43
    iget p2, p0, Lf7/b;->v:I

    .line 44
    add-int/2addr p2, v3

    .line 45
    .line 46
    iput p2, p0, Lf7/b;->v:I

    .line 47
    .line 48
    iput v2, p0, Lf7/b;->w:I

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_2
    const/16 p2, 0xd

    .line 52
    .line 53
    if-ne v0, p2, :cond_3

    .line 54
    .line 55
    iget p2, p0, Lj7/b;->h0:I

    .line 56
    add-int/2addr p2, v3

    .line 57
    .line 58
    iput p2, p0, Lj7/b;->h0:I

    .line 59
    .line 60
    iput v2, p0, Lf7/b;->w:I

    .line 61
    goto :goto_2

    .line 62
    .line 63
    :cond_3
    const/16 p2, 0x9

    .line 64
    .line 65
    if-eq v0, p2, :cond_6

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 69
    goto :goto_2

    .line 70
    .line 71
    :cond_4
    const/16 v1, 0x2a

    .line 72
    .line 73
    if-ne v0, v1, :cond_5

    .line 74
    move p2, v3

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :cond_5
    const/16 v1, 0x2f

    .line 78
    .line 79
    if-ne v0, v1, :cond_6

    .line 80
    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lj7/a;->T2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :cond_6
    :goto_2
    const/4 p2, 0x0

    .line 88
    goto :goto_0
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

.method public final u2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v0, 0x36

    .line 9
    .line 10
    iput v0, p0, Lj7/b;->c0:I

    .line 11
    .line 12
    iput p1, p0, Lj7/b;->W:I

    .line 13
    .line 14
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    .line 16
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_1
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 20
    .line 21
    add-int/lit8 v2, v0, 0x1

    .line 22
    .line 23
    iput v2, p0, Lf7/b;->s:I

    .line 24
    .line 25
    aget-byte v0, v1, v0

    .line 26
    .line 27
    and-int/lit16 v0, v0, 0xff

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    if-ge v0, v1, :cond_0

    .line 32
    .line 33
    const/16 v1, 0xa

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    iget v0, p0, Lf7/b;->v:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    iput v0, p0, Lf7/b;->v:I

    .line 42
    .line 43
    iput v2, p0, Lf7/b;->w:I

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_2
    const/16 v1, 0xd

    .line 47
    .line 48
    if-ne v0, v1, :cond_3

    .line 49
    .line 50
    iget v0, p0, Lj7/b;->h0:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iput v0, p0, Lj7/b;->h0:I

    .line 55
    .line 56
    iput v2, p0, Lf7/b;->w:I

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {p0, p1}, Lj7/a;->T2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    .line 63
    :cond_3
    const/16 v1, 0x9

    .line 64
    .line 65
    if-eq v0, v1, :cond_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 69
    goto :goto_0
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

.method public v2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 9
    .line 10
    add-int/lit8 v2, v0, 0x1

    .line 11
    .line 12
    iput v2, p0, Lf7/b;->s:I

    .line 13
    .line 14
    aget-byte v0, v1, v0

    .line 15
    int-to-char v0, v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 27
    .line 28
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 32
    move-result v0

    .line 33
    .line 34
    const/16 v1, 0x100

    .line 35
    .line 36
    if-ge v0, v1, :cond_0

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lj7/a;->R2(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    .line 50
    :cond_1
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 51
    .line 52
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 53
    return-object v0
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
.end method

.method public w2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lj7/a;->R2(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final x2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lj7/b;->Y:I

    .line 3
    .line 4
    iget v1, p0, Lj7/b;->Z:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lj7/a;->i2(II)I

    .line 8
    move-result v0

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    iput v1, p0, Lj7/b;->c0:I

    .line 15
    .line 16
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_0
    iget v2, p0, Lj7/b;->U:I

    .line 20
    .line 21
    iget-object v3, p0, Lj7/b;->T:[I

    .line 22
    array-length v4, v3

    .line 23
    .line 24
    if-lt v2, v4, :cond_1

    .line 25
    .line 26
    const/16 v2, 0x20

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v2}, Lf7/b;->E1([II)[I

    .line 30
    move-result-object v2

    .line 31
    .line 32
    iput-object v2, p0, Lj7/b;->T:[I

    .line 33
    .line 34
    :cond_1
    iget v2, p0, Lj7/b;->W:I

    .line 35
    .line 36
    iget v3, p0, Lj7/b;->X:I

    .line 37
    .line 38
    const/16 v4, 0x7f

    .line 39
    const/4 v5, 0x4

    .line 40
    const/4 v6, 0x1

    .line 41
    .line 42
    if-le v0, v4, :cond_5

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    if-lt v3, v5, :cond_2

    .line 46
    .line 47
    iget-object v3, p0, Lj7/b;->T:[I

    .line 48
    .line 49
    iget v7, p0, Lj7/b;->U:I

    .line 50
    .line 51
    add-int/lit8 v8, v7, 0x1

    .line 52
    .line 53
    iput v8, p0, Lj7/b;->U:I

    .line 54
    .line 55
    aput v2, v3, v7

    .line 56
    move v2, v4

    .line 57
    move v3, v2

    .line 58
    .line 59
    :cond_2
    const/16 v7, 0x800

    .line 60
    .line 61
    if-ge v0, v7, :cond_3

    .line 62
    shl-int/2addr v2, v1

    .line 63
    .line 64
    shr-int/lit8 v4, v0, 0x6

    .line 65
    .line 66
    or-int/lit16 v4, v4, 0xc0

    .line 67
    :goto_0
    or-int/2addr v2, v4

    .line 68
    add-int/2addr v3, v6

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    shl-int/2addr v2, v1

    .line 71
    .line 72
    shr-int/lit8 v7, v0, 0xc

    .line 73
    .line 74
    or-int/lit16 v7, v7, 0xe0

    .line 75
    or-int/2addr v2, v7

    .line 76
    add-int/2addr v3, v6

    .line 77
    .line 78
    if-lt v3, v5, :cond_4

    .line 79
    .line 80
    iget-object v3, p0, Lj7/b;->T:[I

    .line 81
    .line 82
    iget v7, p0, Lj7/b;->U:I

    .line 83
    .line 84
    add-int/lit8 v8, v7, 0x1

    .line 85
    .line 86
    iput v8, p0, Lj7/b;->U:I

    .line 87
    .line 88
    aput v2, v3, v7

    .line 89
    move v3, v4

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move v4, v2

    .line 92
    .line 93
    :goto_1
    shl-int/lit8 v2, v4, 0x8

    .line 94
    .line 95
    shr-int/lit8 v4, v0, 0x6

    .line 96
    .line 97
    and-int/lit8 v4, v4, 0x3f

    .line 98
    .line 99
    or-int/lit16 v4, v4, 0x80

    .line 100
    goto :goto_0

    .line 101
    .line 102
    :goto_2
    and-int/lit8 v0, v0, 0x3f

    .line 103
    .line 104
    or-int/lit16 v0, v0, 0x80

    .line 105
    .line 106
    :cond_5
    if-ge v3, v5, :cond_6

    .line 107
    add-int/2addr v6, v3

    .line 108
    .line 109
    shl-int/lit8 v1, v2, 0x8

    .line 110
    or-int/2addr v0, v1

    .line 111
    goto :goto_3

    .line 112
    .line 113
    :cond_6
    iget-object v1, p0, Lj7/b;->T:[I

    .line 114
    .line 115
    iget v3, p0, Lj7/b;->U:I

    .line 116
    .line 117
    add-int/lit8 v4, v3, 0x1

    .line 118
    .line 119
    iput v4, p0, Lj7/b;->U:I

    .line 120
    .line 121
    aput v2, v1, v3

    .line 122
    .line 123
    :goto_3
    iget v1, p0, Lj7/b;->d0:I

    .line 124
    .line 125
    const/16 v2, 0x9

    .line 126
    .line 127
    if-ne v1, v2, :cond_7

    .line 128
    .line 129
    iget v1, p0, Lj7/b;->U:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v1, v0, v6}, Lj7/a;->q2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    .line 136
    :cond_7
    iget v1, p0, Lj7/b;->U:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v1, v0, v6}, Lj7/a;->O2(III)Lcom/fasterxml/jackson/core/JsonToken;

    .line 140
    move-result-object v0

    .line 141
    return-object v0
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
.end method

.method public y2(ZI)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    const/16 p1, 0x20

    .line 5
    .line 6
    iput p1, p0, Lj7/b;->c0:I

    .line 7
    .line 8
    const/16 v0, 0x2d

    .line 9
    .line 10
    if-eq p2, v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x2b

    .line 13
    .line 14
    if-ne p2, v0, :cond_2

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 17
    int-to-char p2, p2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 21
    .line 22
    iget p2, p0, Lf7/b;->s:I

    .line 23
    .line 24
    iget v0, p0, Lf7/b;->t:I

    .line 25
    .line 26
    if-lt p2, v0, :cond_1

    .line 27
    .line 28
    iput p1, p0, Lj7/b;->c0:I

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    iput p1, p0, Lf7/b;->Q:I

    .line 32
    .line 33
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 34
    return-object p1

    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Lj7/a;->k0:[B

    .line 37
    .line 38
    add-int/lit8 v0, p2, 0x1

    .line 39
    .line 40
    iput v0, p0, Lf7/b;->s:I

    .line 41
    .line 42
    aget-byte p2, p1, p2

    .line 43
    .line 44
    :cond_2
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 54
    move-result v0

    .line 55
    .line 56
    iget v1, p0, Lf7/b;->Q:I

    .line 57
    .line 58
    :goto_0
    const/16 v2, 0x30

    .line 59
    .line 60
    if-lt p2, v2, :cond_5

    .line 61
    .line 62
    const/16 v2, 0x39

    .line 63
    .line 64
    if-gt p2, v2, :cond_5

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    array-length v2, p1

    .line 68
    .line 69
    if-lt v0, v2, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 75
    move-result-object p1

    .line 76
    .line 77
    :cond_3
    add-int/lit8 v2, v0, 0x1

    .line 78
    int-to-char p2, p2

    .line 79
    .line 80
    aput-char p2, p1, v0

    .line 81
    .line 82
    iget p2, p0, Lf7/b;->s:I

    .line 83
    .line 84
    iget v0, p0, Lf7/b;->t:I

    .line 85
    .line 86
    if-lt p2, v0, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 92
    .line 93
    iput v1, p0, Lf7/b;->Q:I

    .line 94
    .line 95
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 96
    return-object p1

    .line 97
    .line 98
    :cond_4
    iget-object v0, p0, Lj7/a;->k0:[B

    .line 99
    .line 100
    add-int/lit8 v3, p2, 0x1

    .line 101
    .line 102
    iput v3, p0, Lf7/b;->s:I

    .line 103
    .line 104
    aget-byte p2, v0, p2

    .line 105
    move v0, v2

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :cond_5
    and-int/lit16 p1, p2, 0xff

    .line 109
    .line 110
    if-nez v1, :cond_6

    .line 111
    .line 112
    const-string p2, "Exponent indicator not followed by a digit"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 116
    .line 117
    :cond_6
    iget p1, p0, Lf7/b;->s:I

    .line 118
    .line 119
    add-int/lit8 p1, p1, -0x1

    .line 120
    .line 121
    iput p1, p0, Lf7/b;->s:I

    .line 122
    .line 123
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 127
    .line 128
    iput v1, p0, Lf7/b;->Q:I

    .line 129
    .line 130
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 134
    move-result-object p1

    .line 135
    return-object p1
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

.method public z2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->P:I

    .line 3
    .line 4
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->r()[C

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 14
    move-result v2

    .line 15
    .line 16
    :goto_0
    iget-object v3, p0, Lj7/a;->k0:[B

    .line 17
    .line 18
    iget v4, p0, Lf7/b;->s:I

    .line 19
    .line 20
    add-int/lit8 v5, v4, 0x1

    .line 21
    .line 22
    iput v5, p0, Lf7/b;->s:I

    .line 23
    .line 24
    aget-byte v3, v3, v4

    .line 25
    .line 26
    const/16 v4, 0x30

    .line 27
    .line 28
    if-lt v3, v4, :cond_2

    .line 29
    .line 30
    const/16 v4, 0x39

    .line 31
    .line 32
    if-gt v3, v4, :cond_2

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    array-length v4, v1

    .line 36
    .line 37
    if-lt v2, v4, :cond_0

    .line 38
    .line 39
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 43
    move-result-object v1

    .line 44
    .line 45
    :cond_0
    add-int/lit8 v4, v2, 0x1

    .line 46
    int-to-char v3, v3

    .line 47
    .line 48
    aput-char v3, v1, v2

    .line 49
    .line 50
    iget v2, p0, Lf7/b;->s:I

    .line 51
    .line 52
    iget v3, p0, Lf7/b;->t:I

    .line 53
    .line 54
    if-lt v2, v3, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 60
    .line 61
    iput v0, p0, Lf7/b;->P:I

    .line 62
    .line 63
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 64
    return-object v0

    .line 65
    :cond_1
    move v2, v4

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_2
    if-nez v0, :cond_3

    .line 69
    .line 70
    const-string v1, "Decimal point not followed by a digit"

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v3, v1}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 74
    .line 75
    :cond_3
    iput v0, p0, Lf7/b;->P:I

    .line 76
    .line 77
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 81
    .line 82
    const/16 v0, 0x65

    .line 83
    const/4 v1, 0x0

    .line 84
    const/4 v4, 0x1

    .line 85
    .line 86
    if-eq v3, v0, :cond_5

    .line 87
    .line 88
    const/16 v0, 0x45

    .line 89
    .line 90
    if-ne v3, v0, :cond_4

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_4
    iget v0, p0, Lf7/b;->s:I

    .line 94
    sub-int/2addr v0, v4

    .line 95
    .line 96
    iput v0, p0, Lf7/b;->s:I

    .line 97
    .line 98
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 102
    .line 103
    iput v1, p0, Lf7/b;->Q:I

    .line 104
    .line 105
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lj7/b;->d2(Lcom/fasterxml/jackson/core/JsonToken;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    .line 112
    :cond_5
    :goto_1
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 113
    int-to-char v2, v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    .line 117
    .line 118
    iput v1, p0, Lf7/b;->Q:I

    .line 119
    .line 120
    iget v0, p0, Lf7/b;->s:I

    .line 121
    .line 122
    iget v1, p0, Lf7/b;->t:I

    .line 123
    .line 124
    if-lt v0, v1, :cond_6

    .line 125
    .line 126
    const/16 v0, 0x1f

    .line 127
    .line 128
    iput v0, p0, Lj7/b;->c0:I

    .line 129
    .line 130
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 131
    return-object v0

    .line 132
    .line 133
    :cond_6
    const/16 v1, 0x20

    .line 134
    .line 135
    iput v1, p0, Lj7/b;->c0:I

    .line 136
    .line 137
    iget-object v1, p0, Lj7/a;->k0:[B

    .line 138
    .line 139
    add-int/lit8 v2, v0, 0x1

    .line 140
    .line 141
    iput v2, p0, Lf7/b;->s:I

    .line 142
    .line 143
    aget-byte v0, v1, v0

    .line 144
    .line 145
    and-int/lit16 v0, v0, 0xff

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v4, v0}, Lj7/a;->y2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 149
    move-result-object v0

    .line 150
    return-object v0
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
.end method
