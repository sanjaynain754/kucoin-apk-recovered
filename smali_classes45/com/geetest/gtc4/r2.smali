.class public final Lcom/geetest/gtc4/r2;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# static fields
.field public static final b:[C


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [C

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/geetest/gtc4/r2;->b:[C

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/r2;->a:[B

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

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/r2;->a:[B

    array-length v0, v0

    .line 2
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/r2;->a:[B

    const/16 v1, 0x1c

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    .line 4
    instance-of v0, p1, Lcom/geetest/gtc4/r2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/r2;

    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/r2;->a:[B

    iget-object p1, p1, Lcom/geetest/gtc4/r2;->a:[B

    .line 7
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
    iget-object v0, p0, Lcom/geetest/gtc4/r2;->a:[B

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
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/r2;->a:[B

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuffer;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/geetest/gtc4/u;->a(I)I

    .line 9
    move-result v2

    .line 10
    add-int/2addr v2, v0

    .line 11
    .line 12
    mul-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x3

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 18
    .line 19
    const-string v2, "#1C"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 23
    .line 24
    const/16 v2, 0x80

    .line 25
    .line 26
    if-ge v0, v2, :cond_0

    .line 27
    .line 28
    sget-object v2, Lcom/geetest/gtc4/r2;->b:[C

    .line 29
    .line 30
    ushr-int/lit8 v3, v0, 0x4

    .line 31
    .line 32
    and-int/lit8 v3, v3, 0xf

    .line 33
    .line 34
    aget-char v3, v2, v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 38
    .line 39
    and-int/lit8 v3, v0, 0xf

    .line 40
    .line 41
    aget-char v2, v2, v3

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    const/4 v3, 0x5

    .line 47
    .line 48
    new-array v4, v3, [B

    .line 49
    move v5, v0

    .line 50
    move v6, v3

    .line 51
    .line 52
    :goto_0
    add-int/lit8 v7, v6, -0x1

    .line 53
    int-to-byte v8, v5

    .line 54
    .line 55
    aput-byte v8, v4, v7

    .line 56
    .line 57
    ushr-int/lit8 v5, v5, 0x8

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    rsub-int/lit8 v5, v7, 0x5

    .line 62
    .line 63
    add-int/lit8 v6, v6, -0x2

    .line 64
    or-int/2addr v2, v5

    .line 65
    int-to-byte v2, v2

    .line 66
    .line 67
    aput-byte v2, v4, v6

    .line 68
    .line 69
    :goto_1
    add-int/lit8 v2, v6, 0x1

    .line 70
    .line 71
    aget-byte v5, v4, v6

    .line 72
    .line 73
    sget-object v6, Lcom/geetest/gtc4/r2;->b:[C

    .line 74
    .line 75
    ushr-int/lit8 v7, v5, 0x4

    .line 76
    .line 77
    and-int/lit8 v7, v7, 0xf

    .line 78
    .line 79
    aget-char v7, v6, v7

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 83
    .line 84
    and-int/lit8 v5, v5, 0xf

    .line 85
    .line 86
    aget-char v5, v6, v5

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 90
    .line 91
    if-lt v2, v3, :cond_2

    .line 92
    :goto_2
    const/4 v2, 0x0

    .line 93
    .line 94
    :goto_3
    if-ge v2, v0, :cond_1

    .line 95
    .line 96
    iget-object v3, p0, Lcom/geetest/gtc4/r2;->a:[B

    .line 97
    .line 98
    aget-byte v3, v3, v2

    .line 99
    .line 100
    sget-object v4, Lcom/geetest/gtc4/r2;->b:[C

    .line 101
    .line 102
    ushr-int/lit8 v5, v3, 0x4

    .line 103
    .line 104
    and-int/lit8 v5, v5, 0xf

    .line 105
    .line 106
    aget-char v5, v4, v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 110
    .line 111
    and-int/lit8 v3, v3, 0xf

    .line 112
    .line 113
    aget-char v3, v4, v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 117
    .line 118
    add-int/lit8 v2, v2, 0x1

    .line 119
    goto :goto_3

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :cond_2
    move v6, v2

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move v6, v7

    .line 128
    goto :goto_0
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
