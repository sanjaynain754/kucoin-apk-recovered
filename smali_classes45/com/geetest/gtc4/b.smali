.class public abstract Lcom/geetest/gtc4/b;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/c;


# static fields
.field public static final b:Lcom/geetest/gtc4/a;

.field public static final c:[C


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/geetest/gtc4/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/geetest/gtc4/b;->b:Lcom/geetest/gtc4/a;

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    .line 14
    fill-array-data v0, :array_0

    .line 15
    .line 16
    sput-object v0, Lcom/geetest/gtc4/b;->c:[C

    .line 17
    return-void

    .line 18
    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/geetest/gtc4/b;->a:[B

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    if-eqz p1, :cond_3

    .line 2
    array-length v0, p1

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "zero length data with non-zero pad bits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x7

    if-gt p2, v0, :cond_2

    if-ltz p2, :cond_2

    int-to-byte p2, p2

    .line 4
    array-length v0, p1

    add-int/lit8 v1, v0, 0x1

    .line 5
    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 6
    invoke-static {p1, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    aput-byte p2, v1, v2

    .line 8
    iput-object v1, p0, Lcom/geetest/gtc4/b;->a:[B

    return-void

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "pad bits cannot be greater than 7 or less than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "\'data\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a([B)Lcom/geetest/gtc4/b;
    .locals 5

    .line 11
    array-length v0, p0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    const/4 v2, 0x0

    .line 12
    aget-byte v2, p0, v2

    const/16 v3, 0xff

    and-int/2addr v2, v3

    if-lez v2, :cond_1

    const/4 v4, 0x7

    if-gt v2, v4, :cond_0

    const/4 v4, 0x2

    if-lt v0, v4, :cond_0

    sub-int/2addr v0, v1

    .line 13
    aget-byte v0, p0, v0

    shl-int v1, v3, v2

    and-int/2addr v1, v0

    int-to-byte v1, v1

    if-eq v0, v1, :cond_1

    .line 14
    new-instance v0, Lcom/geetest/gtc4/u2;

    invoke-direct {v0, p0}, Lcom/geetest/gtc4/u2;-><init>([B)V

    return-object v0

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid pad bits detected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 16
    :cond_1
    new-instance v0, Lcom/geetest/gtc4/z1;

    invoke-direct {v0, p0}, Lcom/geetest/gtc4/z1;-><init>([B)V

    return-object v0

    .line 17
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "truncated BIT STRING detected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-direct {v0, v1, v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    return-object v0
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 7

    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/b;

    .line 4
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    iget-object p1, p1, Lcom/geetest/gtc4/b;->a:[B

    .line 5
    array-length v2, v0

    .line 6
    array-length v3, p1

    if-eq v3, v2, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    return v3

    :cond_2
    sub-int/2addr v2, v3

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_4

    .line 7
    aget-byte v5, v0, v4

    aget-byte v6, p1, v4

    if-eq v5, v6, :cond_3

    return v1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 8
    :cond_4
    aget-byte v4, v0, v1

    const/16 v5, 0xff

    and-int/2addr v4, v5

    .line 9
    aget-byte v0, v0, v2

    shl-int v4, v5, v4

    and-int/2addr v0, v4

    int-to-byte v0, v0

    .line 10
    aget-byte p1, p1, v2

    and-int/2addr p1, v4

    int-to-byte p1, p1

    if-ne v0, p1, :cond_5

    return v3

    :cond_5
    return v1
.end method

.method public final b()Lcom/geetest/gtc4/w;
    .locals 0

    .line 1
    return-object p0
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
    .line 17
    .line 18
.end method

.method public final e()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    return v0
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

.method public g()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/z1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/b;->a:[B

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/z1;-><init>([B)V

    .line 8
    return-object v0
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

.method public h()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/u2;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/b;->a:[B

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/u2;-><init>([B)V

    .line 8
    return-object v0
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

.method public final hashCode()I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x2

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    .line 11
    aget-byte v1, v0, v1

    .line 12
    .line 13
    const/16 v2, 0xff

    .line 14
    and-int/2addr v1, v2

    .line 15
    array-length v3, v0

    .line 16
    .line 17
    add-int/lit8 v4, v3, -0x1

    .line 18
    .line 19
    aget-byte v5, v0, v4

    .line 20
    .line 21
    shl-int v1, v2, v1

    .line 22
    and-int/2addr v1, v5

    .line 23
    int-to-byte v1, v1

    .line 24
    .line 25
    :goto_0
    add-int/lit8 v4, v4, -0x1

    .line 26
    .line 27
    if-ltz v4, :cond_1

    .line 28
    .line 29
    mul-int/lit16 v3, v3, 0x101

    .line 30
    .line 31
    aget-byte v2, v0, v4

    .line 32
    xor-int/2addr v3, v2

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    mul-int/lit16 v3, v3, 0x101

    .line 36
    .line 37
    xor-int v0, v3, v1

    .line 38
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/geetest/gtc4/u;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/u;-><init>(Ljava/io/ByteArrayOutputStream;)V

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v2}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 18
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuffer;

    .line 21
    array-length v3, v0

    .line 22
    .line 23
    mul-int/lit8 v3, v3, 0x2

    .line 24
    add-int/2addr v3, v2

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v3}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 28
    .line 29
    const/16 v2, 0x23

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    array-length v3, v0

    .line 35
    .line 36
    if-eq v2, v3, :cond_0

    .line 37
    .line 38
    aget-byte v3, v0, v2

    .line 39
    .line 40
    sget-object v4, Lcom/geetest/gtc4/b;->c:[C

    .line 41
    .line 42
    ushr-int/lit8 v5, v3, 0x4

    .line 43
    .line 44
    and-int/lit8 v5, v5, 0xf

    .line 45
    .line 46
    aget-char v5, v4, v5

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0xf

    .line 52
    .line 53
    aget-char v3, v4, v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    .line 67
    new-instance v1, Lcom/geetest/gtc4/v;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, "Internal error encoding BitString: "

    .line 72
    .line 73
    .line 74
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    .line 88
    invoke-direct {v1, v2, v0}, Lcom/geetest/gtc4/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    throw v1
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
