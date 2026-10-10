.class public abstract Lcom/geetest/gtc4/b0;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final a:[Lcom/geetest/gtc4/f;

.field public b:[Lcom/geetest/gtc4/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 2
    sget-object v0, Lcom/geetest/gtc4/g;->d:[Lcom/geetest/gtc4/f;

    iput-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 3
    iput-object v0, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    return-void
.end method

.method public constructor <init>(Lcom/geetest/gtc4/g;)V
    .locals 3

    .line 4
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    if-eqz p1, :cond_3

    .line 5
    iget v0, p1, Lcom/geetest/gtc4/g;->b:I

    if-nez v0, :cond_0

    .line 6
    sget-object p1, Lcom/geetest/gtc4/g;->d:[Lcom/geetest/gtc4/f;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p1, Lcom/geetest/gtc4/g;->a:[Lcom/geetest/gtc4/f;

    array-length v2, v1

    if-ne v2, v0, :cond_1

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p1, Lcom/geetest/gtc4/g;->c:Z

    move-object p1, v1

    goto :goto_0

    .line 9
    :cond_1
    new-array p1, v0, [Lcom/geetest/gtc4/f;

    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    :goto_0
    iput-object p1, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 12
    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    return-void

    .line 13
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'elementVector\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Z[Lcom/geetest/gtc4/f;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 15
    iput-object p2, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    if-nez p1, :cond_1

    .line 16
    array-length p1, p2

    const/4 v0, 0x2

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    iput-object p2, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    return-void
.end method

.method public constructor <init>([Lcom/geetest/gtc4/f;[Lcom/geetest/gtc4/f;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 19
    iput-object p2, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    return-void
.end method

.method public static a([B[B)Z
    .locals 6

    const/4 v0, 0x0

    .line 17
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xdf

    .line 18
    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xdf

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    if-ge v1, v2, :cond_0

    return v3

    :cond_0
    return v0

    .line 19
    :cond_1
    array-length v1, p0

    array-length v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr v1, v3

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_4

    .line 20
    aget-byte v4, p0, v2

    aget-byte v5, p1, v2

    if-eq v4, v5, :cond_3

    and-int/lit16 p0, v4, 0xff

    and-int/lit16 p1, v5, 0xff

    if-ge p0, p1, :cond_2

    return v3

    :cond_2
    return v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21
    :cond_4
    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    if-gt p0, p1, :cond_5

    return v3

    :cond_5
    return v0
.end method

.method public static a(Lcom/geetest/gtc4/f;)[B
    .locals 2

    .line 11
    :try_start_0
    invoke-interface {p0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 13
    new-instance v1, Lcom/geetest/gtc4/k2;

    invoke-direct {v1, v0}, Lcom/geetest/gtc4/k2;-><init>(Ljava/io/ByteArrayOutputStream;)V

    .line 14
    invoke-virtual {v1, p0}, Lcom/geetest/gtc4/k2;->a(Lcom/geetest/gtc4/w;)V

    .line 15
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 16
    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot encode object added to SET"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/geetest/gtc4/b0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/b0;

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    array-length v0, v0

    .line 4
    iget-object v2, p1, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 5
    array-length v2, v2

    if-eq v2, v0, :cond_1

    return v1

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/geetest/gtc4/b0;->g()Lcom/geetest/gtc4/w;

    move-result-object v2

    check-cast v2, Lcom/geetest/gtc4/n2;

    .line 7
    invoke-virtual {p1}, Lcom/geetest/gtc4/b0;->g()Lcom/geetest/gtc4/w;

    move-result-object p1

    check-cast p1, Lcom/geetest/gtc4/n2;

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_3

    .line 8
    iget-object v4, v2, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    aget-object v4, v4, v3

    invoke-interface {v4}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v4

    .line 9
    iget-object v5, p1, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    aget-object v5, v5, v3

    invoke-interface {v5}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v5

    if-eq v4, v5, :cond_2

    .line 10
    invoke-virtual {v4, v5}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/w;)Z

    move-result v4

    if-nez v4, :cond_2

    return v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public g()Lcom/geetest/gtc4/w;
    .locals 14

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    .line 3
    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, [Lcom/geetest/gtc4/f;->clone()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, [Lcom/geetest/gtc4/f;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    .line 15
    array-length v1, v0

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    .line 23
    aget-object v3, v0, v3

    .line 24
    const/4 v4, 0x1

    .line 25
    .line 26
    aget-object v5, v0, v4

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, Lcom/geetest/gtc4/b0;->a(Lcom/geetest/gtc4/f;)[B

    .line 30
    move-result-object v6

    .line 31
    .line 32
    .line 33
    invoke-static {v5}, Lcom/geetest/gtc4/b0;->a(Lcom/geetest/gtc4/f;)[B

    .line 34
    move-result-object v7

    .line 35
    .line 36
    .line 37
    invoke-static {v7, v6}, Lcom/geetest/gtc4/b0;->a([B[B)Z

    .line 38
    move-result v8

    .line 39
    .line 40
    if-eqz v8, :cond_1

    .line 41
    move-object v13, v5

    .line 42
    move-object v5, v3

    .line 43
    move-object v3, v13

    .line 44
    move-object v13, v7

    .line 45
    move-object v7, v6

    .line 46
    move-object v6, v13

    .line 47
    .line 48
    :cond_1
    :goto_0
    if-ge v2, v1, :cond_6

    .line 49
    .line 50
    aget-object v8, v0, v2

    .line 51
    .line 52
    .line 53
    invoke-static {v8}, Lcom/geetest/gtc4/b0;->a(Lcom/geetest/gtc4/f;)[B

    .line 54
    move-result-object v9

    .line 55
    .line 56
    .line 57
    invoke-static {v7, v9}, Lcom/geetest/gtc4/b0;->a([B[B)Z

    .line 58
    move-result v10

    .line 59
    .line 60
    if-eqz v10, :cond_2

    .line 61
    .line 62
    add-int/lit8 v6, v2, -0x2

    .line 63
    .line 64
    aput-object v3, v0, v6

    .line 65
    move-object v3, v5

    .line 66
    move-object v6, v7

    .line 67
    move-object v5, v8

    .line 68
    move-object v7, v9

    .line 69
    goto :goto_3

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-static {v6, v9}, Lcom/geetest/gtc4/b0;->a([B[B)Z

    .line 73
    move-result v10

    .line 74
    .line 75
    if-eqz v10, :cond_3

    .line 76
    .line 77
    add-int/lit8 v6, v2, -0x2

    .line 78
    .line 79
    aput-object v3, v0, v6

    .line 80
    move-object v3, v8

    .line 81
    move-object v6, v9

    .line 82
    goto :goto_3

    .line 83
    .line 84
    :cond_3
    add-int/lit8 v10, v2, -0x1

    .line 85
    .line 86
    :goto_1
    add-int/lit8 v11, v10, -0x1

    .line 87
    .line 88
    if-lez v11, :cond_5

    .line 89
    .line 90
    add-int/lit8 v10, v10, -0x2

    .line 91
    .line 92
    aget-object v10, v0, v10

    .line 93
    .line 94
    .line 95
    invoke-static {v10}, Lcom/geetest/gtc4/b0;->a(Lcom/geetest/gtc4/f;)[B

    .line 96
    move-result-object v12

    .line 97
    .line 98
    .line 99
    invoke-static {v12, v9}, Lcom/geetest/gtc4/b0;->a([B[B)Z

    .line 100
    move-result v12

    .line 101
    .line 102
    if-eqz v12, :cond_4

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_4
    aput-object v10, v0, v11

    .line 106
    move v10, v11

    .line 107
    goto :goto_1

    .line 108
    .line 109
    :cond_5
    :goto_2
    aput-object v8, v0, v11

    .line 110
    .line 111
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 112
    goto :goto_0

    .line 113
    .line 114
    :cond_6
    add-int/lit8 v2, v1, -0x2

    .line 115
    .line 116
    aput-object v3, v0, v2

    .line 117
    sub-int/2addr v1, v4

    .line 118
    .line 119
    aput-object v5, v0, v1

    .line 120
    .line 121
    :cond_7
    :goto_4
    new-instance v0, Lcom/geetest/gtc4/n2;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/n2;-><init>([Lcom/geetest/gtc4/f;)V

    .line 127
    return-object v0
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

.method public h()Lcom/geetest/gtc4/w;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/b3;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/geetest/gtc4/b0;->b:[Lcom/geetest/gtc4/f;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/geetest/gtc4/b3;-><init>([Lcom/geetest/gtc4/f;[Lcom/geetest/gtc4/f;)V

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
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    add-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 12
    .line 13
    aget-object v2, v2, v0

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/geetest/gtc4/w;->hashCode()I

    .line 21
    move-result v2

    .line 22
    add-int/2addr v1, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return v1
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

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/n0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    sget-object v1, Lcom/geetest/gtc4/g;->d:[Lcom/geetest/gtc4/f;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1}, [Lcom/geetest/gtc4/f;->clone()Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, [Lcom/geetest/gtc4/f;

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/n0;-><init>([Ljava/lang/Object;)V

    .line 21
    return-object v0
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

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "[]"

    .line 8
    return-object v0

    .line 9
    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    .line 11
    .line 12
    const-string v2, "["

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    .line 19
    .line 20
    aget-object v3, v3, v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    if-lt v2, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x5d

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    .line 39
    :cond_1
    const-string v3, ", "

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 43
    goto :goto_0
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
