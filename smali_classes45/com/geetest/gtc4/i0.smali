.class public abstract Lcom/geetest/gtc4/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:Lcom/geetest/gtc4/p1;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/p1;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/i0;->b:Lcom/geetest/gtc4/p1;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/geetest/gtc4/i0;->a:Ljava/io/InputStream;

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
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/i0;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 2
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Lcom/geetest/gtc4/q1;

    invoke-direct {v1, v0}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final a(I)J
    .locals 11

    .line 14
    sget-object v0, Lcom/geetest/gtc4/h0;->a:[I

    invoke-static {p1}, Lcom/geetest/gtc4/k0;->ofByte(I)Lcom/geetest/gtc4/k0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x10

    const/16 v2, 0x18

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/16 v8, 0x8

    packed-switch v0, :pswitch_data_0

    .line 15
    new-instance p1, Lcom/geetest/gtc4/q1;

    const-string v0, "Reserved additional information"

    invoke-direct {p1, v0}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const-wide/16 v0, -0x1

    return-wide v0

    .line 16
    :pswitch_1
    invoke-virtual {p0, v8}, Lcom/geetest/gtc4/i0;->c(I)[B

    move-result-object p1

    .line 17
    aget-byte v0, p1, v7

    and-int/lit16 v0, v0, 0xff

    int-to-long v9, v0

    const/16 v0, 0x38

    shl-long/2addr v9, v0

    .line 18
    aget-byte v0, p1, v6

    and-int/lit16 v0, v0, 0xff

    int-to-long v6, v0

    const/16 v0, 0x30

    shl-long/2addr v6, v0

    or-long/2addr v6, v9

    .line 19
    aget-byte v0, p1, v5

    and-int/lit16 v0, v0, 0xff

    int-to-long v9, v0

    const/16 v0, 0x28

    shl-long/2addr v9, v0

    or-long v5, v6, v9

    .line 20
    aget-byte v0, p1, v4

    and-int/lit16 v0, v0, 0xff

    int-to-long v9, v0

    const/16 v0, 0x20

    shl-long/2addr v9, v0

    or-long v4, v5, v9

    .line 21
    aget-byte v0, p1, v3

    and-int/lit16 v0, v0, 0xff

    int-to-long v6, v0

    shl-long v2, v6, v2

    or-long/2addr v2, v4

    const/4 v0, 0x5

    .line 22
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-long v4, v0

    shl-long v0, v4, v1

    or-long/2addr v0, v2

    const/4 v2, 0x6

    .line 23
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    shl-long/2addr v2, v8

    or-long/2addr v0, v2

    const/4 v2, 0x7

    .line 24
    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    int-to-long v2, p1

    or-long/2addr v0, v2

    return-wide v0

    .line 25
    :pswitch_2
    invoke-virtual {p0, v3}, Lcom/geetest/gtc4/i0;->c(I)[B

    move-result-object p1

    .line 26
    aget-byte v0, p1, v7

    and-int/lit16 v0, v0, 0xff

    int-to-long v9, v0

    shl-long v2, v9, v2

    .line 27
    aget-byte v0, p1, v6

    and-int/lit16 v0, v0, 0xff

    int-to-long v6, v0

    shl-long v0, v6, v1

    or-long/2addr v0, v2

    .line 28
    aget-byte v2, p1, v5

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    shl-long/2addr v2, v8

    or-long/2addr v0, v2

    .line 29
    aget-byte p1, p1, v4

    and-int/lit16 p1, p1, 0xff

    int-to-long v2, p1

    or-long/2addr v0, v2

    return-wide v0

    .line 30
    :pswitch_3
    invoke-virtual {p0, v5}, Lcom/geetest/gtc4/i0;->c(I)[B

    move-result-object p1

    .line 31
    aget-byte v0, p1, v7

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v8

    int-to-long v0, v0

    .line 32
    aget-byte p1, p1, v6

    and-int/lit16 p1, p1, 0xff

    int-to-long v2, p1

    or-long/2addr v0, v2

    return-wide v0

    .line 33
    :pswitch_4
    invoke-virtual {p0}, Lcom/geetest/gtc4/i0;->a()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :pswitch_5
    and-int/lit8 p1, p1, 0x1f

    int-to-long v0, p1

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(J)[B
    .locals 5

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_4

    .line 4
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    long-to-int v1, p1

    .line 5
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 6
    invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-wide/16 v2, 0x1000

    cmp-long v4, p1, v2

    if-lez v4, :cond_0

    move-wide p1, v2

    :cond_0
    long-to-int p1, p1

    .line 7
    new-array p2, p1, [B

    :goto_0
    if-lez v1, :cond_3

    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/geetest/gtc4/i0;->a:Ljava/io/InputStream;

    if-le v1, p1, :cond_1

    move v3, p1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v4, 0x0

    invoke-virtual {v2, p2, v4, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 9
    invoke-virtual {v0, p2, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    sub-int/2addr v1, v2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    .line 10
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :goto_2
    new-instance p2, Lcom/geetest/gtc4/q1;

    invoke-direct {p2, p1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 12
    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    .line 13
    :cond_4
    new-instance p1, Lcom/geetest/gtc4/q1;

    const-string p2, "Decoding fixed size items is limited to INTMAX"

    invoke-direct {p1, p2}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(I)Ljava/math/BigInteger;
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/geetest/gtc4/h0;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/geetest/gtc4/k0;->ofByte(I)Lcom/geetest/gtc4/k0;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v1

    .line 11
    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    const/16 v2, 0x18

    .line 17
    const/4 v3, 0x4

    .line 18
    const/4 v4, 0x3

    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    const/16 v8, 0x8

    .line 24
    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    new-instance p1, Lcom/geetest/gtc4/q1;

    .line 29
    .line 30
    const-string v0, "Reserved additional information"

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 34
    throw p1

    .line 35
    .line 36
    :pswitch_0
    const-wide/16 v0, -0x1

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    .line 43
    :pswitch_1
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v8}, Lcom/geetest/gtc4/i0;->c(I)[B

    .line 47
    move-result-object v0

    .line 48
    .line 49
    aget-byte v9, v0, v7

    .line 50
    .line 51
    and-int/lit16 v9, v9, 0xff

    .line 52
    int-to-long v9, v9

    .line 53
    .line 54
    .line 55
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 56
    move-result-object v9

    .line 57
    .line 58
    const/16 v10, 0x38

    .line 59
    .line 60
    .line 61
    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 62
    move-result-object v9

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v9}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    aget-byte v6, v0, v6

    .line 69
    .line 70
    and-int/lit16 v6, v6, 0xff

    .line 71
    int-to-long v9, v6

    .line 72
    .line 73
    .line 74
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    const/16 v9, 0x30

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v6}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    aget-byte v5, v0, v5

    .line 88
    .line 89
    and-int/lit16 v5, v5, 0xff

    .line 90
    int-to-long v5, v5

    .line 91
    .line 92
    .line 93
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 94
    move-result-object v5

    .line 95
    .line 96
    const/16 v6, 0x28

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 100
    move-result-object v5

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v5}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    aget-byte v4, v0, v4

    .line 107
    .line 108
    and-int/lit16 v4, v4, 0xff

    .line 109
    int-to-long v4, v4

    .line 110
    .line 111
    .line 112
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 113
    move-result-object v4

    .line 114
    .line 115
    const/16 v5, 0x20

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v4}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    aget-byte v3, v0, v3

    .line 126
    .line 127
    and-int/lit16 v3, v3, 0xff

    .line 128
    int-to-long v3, v3

    .line 129
    .line 130
    .line 131
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 140
    move-result-object p1

    .line 141
    const/4 v2, 0x5

    .line 142
    .line 143
    aget-byte v2, v0, v2

    .line 144
    .line 145
    and-int/lit16 v2, v2, 0xff

    .line 146
    int-to-long v2, v2

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 158
    move-result-object p1

    .line 159
    const/4 v1, 0x6

    .line 160
    .line 161
    aget-byte v1, v0, v1

    .line 162
    .line 163
    and-int/lit16 v1, v1, 0xff

    .line 164
    int-to-long v1, v1

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 176
    move-result-object p1

    .line 177
    const/4 v1, 0x7

    .line 178
    .line 179
    aget-byte v0, v0, v1

    .line 180
    .line 181
    and-int/lit16 v0, v0, 0xff

    .line 182
    int-to-long v0, v0

    .line 183
    .line 184
    .line 185
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 194
    move-result-object p1

    .line 195
    return-object p1

    .line 196
    .line 197
    .line 198
    :pswitch_2
    invoke-virtual {p0, v3}, Lcom/geetest/gtc4/i0;->c(I)[B

    .line 199
    move-result-object p1

    .line 200
    .line 201
    aget-byte v0, p1, v7

    .line 202
    .line 203
    and-int/lit16 v0, v0, 0xff

    .line 204
    int-to-long v9, v0

    .line 205
    .line 206
    shl-long v2, v9, v2

    .line 207
    .line 208
    aget-byte v0, p1, v6

    .line 209
    .line 210
    and-int/lit16 v0, v0, 0xff

    .line 211
    int-to-long v6, v0

    .line 212
    .line 213
    shl-long v0, v6, v1

    .line 214
    or-long/2addr v0, v2

    .line 215
    .line 216
    aget-byte v2, p1, v5

    .line 217
    .line 218
    and-int/lit16 v2, v2, 0xff

    .line 219
    int-to-long v2, v2

    .line 220
    shl-long/2addr v2, v8

    .line 221
    or-long/2addr v0, v2

    .line 222
    .line 223
    aget-byte p1, p1, v4

    .line 224
    .line 225
    and-int/lit16 p1, p1, 0xff

    .line 226
    int-to-long v2, p1

    .line 227
    or-long/2addr v0, v2

    .line 228
    .line 229
    .line 230
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 231
    move-result-object p1

    .line 232
    return-object p1

    .line 233
    .line 234
    .line 235
    :pswitch_3
    invoke-virtual {p0, v5}, Lcom/geetest/gtc4/i0;->c(I)[B

    .line 236
    move-result-object p1

    .line 237
    .line 238
    aget-byte v0, p1, v7

    .line 239
    .line 240
    and-int/lit16 v0, v0, 0xff

    .line 241
    shl-int/2addr v0, v8

    .line 242
    int-to-long v0, v0

    .line 243
    .line 244
    aget-byte p1, p1, v6

    .line 245
    .line 246
    and-int/lit16 p1, p1, 0xff

    .line 247
    int-to-long v2, p1

    .line 248
    or-long/2addr v0, v2

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 252
    move-result-object p1

    .line 253
    return-object p1

    .line 254
    .line 255
    .line 256
    :pswitch_4
    invoke-virtual {p0}, Lcom/geetest/gtc4/i0;->a()I

    .line 257
    move-result p1

    .line 258
    int-to-long v0, p1

    .line 259
    .line 260
    .line 261
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 262
    move-result-object p1

    .line 263
    return-object p1

    .line 264
    .line 265
    :pswitch_5
    and-int/lit8 p1, p1, 0x1f

    .line 266
    int-to-long v0, p1

    .line 267
    .line 268
    .line 269
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 270
    move-result-object p1

    .line 271
    return-object p1

    .line 272
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final c(I)[B
    .locals 6

    .line 1
    .line 2
    :try_start_0
    new-array v0, p1, [B

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/i0;->a:Ljava/io/InputStream;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    .line 8
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    :cond_0
    const-string v2, "Unexpected end of stream"

    .line 14
    const/4 v3, -0x1

    .line 15
    .line 16
    if-eq v1, v3, :cond_3

    .line 17
    .line 18
    sub-int v1, p1, v1

    .line 19
    .line 20
    :goto_0
    if-lez v1, :cond_2

    .line 21
    .line 22
    :try_start_1
    iget-object v4, p0, Lcom/geetest/gtc4/i0;->a:Ljava/io/InputStream;

    .line 23
    .line 24
    sub-int v5, p1, v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v0, v5, v1}, Ljava/io/InputStream;->read([BII)I

    .line 28
    move-result v4

    .line 29
    .line 30
    if-eq v4, v3, :cond_1

    .line 31
    sub-int/2addr v1, v4

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1

    .line 39
    :catch_0
    move-exception p1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    return-object v0

    .line 42
    .line 43
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    :goto_2
    new-instance v0, Lcom/geetest/gtc4/q1;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p1}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    throw v0
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
.end method
