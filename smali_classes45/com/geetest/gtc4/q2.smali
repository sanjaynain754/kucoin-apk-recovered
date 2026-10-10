.class public final Lcom/geetest/gtc4/q2;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/q2;->a:[B

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


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/geetest/gtc4/q2;->a:[B

    array-length v0, v0

    .line 6
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/geetest/gtc4/q2;->a:[B

    const/16 v1, 0xc

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/geetest/gtc4/q2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/q2;

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/q2;->a:[B

    iget-object p1, p1, Lcom/geetest/gtc4/q2;->a:[B

    .line 4
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/q2;->a:[B

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/geetest/gtc4/o0;->b([B)I

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
    .line 17
    .line 18
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/q2;->a:[B

    .line 3
    .line 4
    sget v1, Lcom/geetest/gtc4/n7;->a:I

    .line 5
    array-length v1, v0

    .line 6
    .line 7
    new-array v2, v1, [C

    .line 8
    .line 9
    sget-object v3, Lcom/geetest/gtc4/q7;->a:[S

    .line 10
    array-length v3, v0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    move v6, v5

    .line 14
    .line 15
    :goto_0
    if-ge v5, v3, :cond_8

    .line 16
    .line 17
    add-int/lit8 v7, v5, 0x1

    .line 18
    .line 19
    aget-byte v5, v0, v5

    .line 20
    .line 21
    if-ltz v5, :cond_1

    .line 22
    .line 23
    if-lt v6, v1, :cond_0

    .line 24
    goto :goto_3

    .line 25
    .line 26
    :cond_0
    add-int/lit8 v8, v6, 0x1

    .line 27
    int-to-char v5, v5

    .line 28
    .line 29
    aput-char v5, v2, v6

    .line 30
    move v5, v7

    .line 31
    move v6, v8

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    sget-object v8, Lcom/geetest/gtc4/q7;->a:[S

    .line 35
    .line 36
    and-int/lit8 v5, v5, 0x7f

    .line 37
    .line 38
    aget-short v5, v8, v5

    .line 39
    .line 40
    ushr-int/lit8 v8, v5, 0x8

    .line 41
    int-to-byte v5, v5

    .line 42
    .line 43
    :goto_1
    if-ltz v5, :cond_3

    .line 44
    .line 45
    if-lt v7, v3, :cond_2

    .line 46
    goto :goto_3

    .line 47
    .line 48
    :cond_2
    add-int/lit8 v9, v7, 0x1

    .line 49
    .line 50
    aget-byte v7, v0, v7

    .line 51
    .line 52
    shl-int/lit8 v8, v8, 0x6

    .line 53
    .line 54
    and-int/lit8 v10, v7, 0x3f

    .line 55
    or-int/2addr v8, v10

    .line 56
    .line 57
    sget-object v10, Lcom/geetest/gtc4/q7;->b:[B

    .line 58
    .line 59
    and-int/lit16 v7, v7, 0xff

    .line 60
    .line 61
    ushr-int/lit8 v7, v7, 0x4

    .line 62
    add-int/2addr v5, v7

    .line 63
    .line 64
    aget-byte v5, v10, v5

    .line 65
    move v7, v9

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v9, -0x2

    .line 68
    .line 69
    if-ne v5, v9, :cond_4

    .line 70
    goto :goto_3

    .line 71
    .line 72
    .line 73
    :cond_4
    const v5, 0xffff

    .line 74
    .line 75
    if-gt v8, v5, :cond_6

    .line 76
    .line 77
    if-lt v6, v1, :cond_5

    .line 78
    goto :goto_3

    .line 79
    .line 80
    :cond_5
    add-int/lit8 v5, v6, 0x1

    .line 81
    int-to-char v8, v8

    .line 82
    .line 83
    aput-char v8, v2, v6

    .line 84
    move v6, v5

    .line 85
    :goto_2
    move v5, v7

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_6
    add-int/lit8 v5, v1, -0x1

    .line 89
    .line 90
    if-lt v6, v5, :cond_7

    .line 91
    :goto_3
    const/4 v6, -0x1

    .line 92
    goto :goto_4

    .line 93
    .line 94
    :cond_7
    add-int/lit8 v5, v6, 0x1

    .line 95
    .line 96
    ushr-int/lit8 v9, v8, 0xa

    .line 97
    .line 98
    .line 99
    const v10, 0xd7c0

    .line 100
    add-int/2addr v9, v10

    .line 101
    int-to-char v9, v9

    .line 102
    .line 103
    aput-char v9, v2, v6

    .line 104
    .line 105
    add-int/lit8 v6, v6, 0x2

    .line 106
    .line 107
    and-int/lit16 v8, v8, 0x3ff

    .line 108
    .line 109
    .line 110
    const v9, 0xdc00

    .line 111
    or-int/2addr v8, v9

    .line 112
    int-to-char v8, v8

    .line 113
    .line 114
    aput-char v8, v2, v5

    .line 115
    goto :goto_2

    .line 116
    .line 117
    :cond_8
    :goto_4
    if-ltz v6, :cond_9

    .line 118
    .line 119
    new-instance v0, Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, v2, v4, v6}, Ljava/lang/String;-><init>([CII)V

    .line 123
    return-object v0

    .line 124
    .line 125
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 126
    .line 127
    const-string v1, "Invalid UTF-8 input"

    .line 128
    .line 129
    .line 130
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 131
    throw v0
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
