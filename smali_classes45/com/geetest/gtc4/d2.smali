.class public final Lcom/geetest/gtc4/d2;
.super Lcom/geetest/gtc4/k;
.source "SourceFile"


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/k;-><init>([B)V

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
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/geetest/gtc4/d2;->i()[B

    move-result-object v0

    array-length v0, v0

    .line 2
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/d2;->i()[B

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final g()Lcom/geetest/gtc4/w;
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

.method public final h()Lcom/geetest/gtc4/w;
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

.method public final i()[B
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    aget-byte v1, v0, v1

    .line 8
    .line 9
    const/16 v2, 0x5a

    .line 10
    .line 11
    if-ne v1, v2, :cond_8

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/k;->a(I)Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    const/16 v0, 0xb

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/k;->a(I)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_6

    .line 29
    .line 30
    const/16 v0, 0xc

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/k;->a(I)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    const/16 v0, 0xd

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/k;->a(I)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    move v0, v1

    .line 46
    .line 47
    :goto_0
    iget-object v3, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 48
    array-length v4, v3

    .line 49
    .line 50
    if-eq v0, v4, :cond_3

    .line 51
    .line 52
    aget-byte v4, v3, v0

    .line 53
    .line 54
    const/16 v5, 0x2e

    .line 55
    .line 56
    if-ne v4, v5, :cond_2

    .line 57
    .line 58
    const/16 v4, 0xe

    .line 59
    .line 60
    if-ne v0, v4, :cond_2

    .line 61
    array-length v0, v3

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x2

    .line 64
    .line 65
    :goto_1
    if-lez v0, :cond_0

    .line 66
    .line 67
    iget-object v3, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 68
    .line 69
    aget-byte v3, v3, v0

    .line 70
    .line 71
    const/16 v4, 0x30

    .line 72
    .line 73
    if-ne v3, v4, :cond_0

    .line 74
    .line 75
    add-int/lit8 v0, v0, -0x1

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_0
    iget-object v3, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 79
    .line 80
    aget-byte v4, v3, v0

    .line 81
    .line 82
    if-ne v4, v5, :cond_1

    .line 83
    .line 84
    add-int/lit8 v4, v0, 0x1

    .line 85
    .line 86
    new-array v4, v4, [B

    .line 87
    .line 88
    .line 89
    invoke-static {v3, v1, v4, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    aput-byte v2, v4, v0

    .line 92
    return-object v4

    .line 93
    .line 94
    :cond_1
    add-int/lit8 v4, v0, 0x2

    .line 95
    .line 96
    new-array v4, v4, [B

    .line 97
    .line 98
    add-int/lit8 v0, v0, 0x1

    .line 99
    .line 100
    .line 101
    invoke-static {v3, v1, v4, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 102
    .line 103
    aput-byte v2, v4, v0

    .line 104
    return-object v4

    .line 105
    .line 106
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 107
    goto :goto_0

    .line 108
    :cond_3
    return-object v3

    .line 109
    .line 110
    :cond_4
    iget-object v0, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 111
    array-length v2, v0

    .line 112
    .line 113
    add-int/lit8 v2, v2, 0x2

    .line 114
    .line 115
    new-array v2, v2, [B

    .line 116
    array-length v3, v0

    .line 117
    .line 118
    add-int/lit8 v3, v3, -0x1

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    .line 123
    sget v0, Lcom/geetest/gtc4/n7;->a:I

    .line 124
    const/4 v0, 0x3

    .line 125
    .line 126
    new-array v3, v0, [B

    .line 127
    move v4, v1

    .line 128
    .line 129
    :goto_2
    if-eq v4, v0, :cond_5

    .line 130
    .line 131
    const-string v5, "00Z"

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 135
    move-result v5

    .line 136
    int-to-byte v5, v5

    .line 137
    .line 138
    aput-byte v5, v3, v4

    .line 139
    .line 140
    add-int/lit8 v4, v4, 0x1

    .line 141
    goto :goto_2

    .line 142
    .line 143
    :cond_5
    iget-object v4, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 144
    array-length v4, v4

    .line 145
    .line 146
    add-int/lit8 v4, v4, -0x1

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v1, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 150
    return-object v2

    .line 151
    .line 152
    :cond_6
    iget-object v0, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 153
    array-length v2, v0

    .line 154
    .line 155
    add-int/lit8 v2, v2, 0x4

    .line 156
    .line 157
    new-array v2, v2, [B

    .line 158
    array-length v3, v0

    .line 159
    .line 160
    add-int/lit8 v3, v3, -0x1

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 164
    .line 165
    sget v0, Lcom/geetest/gtc4/n7;->a:I

    .line 166
    const/4 v0, 0x5

    .line 167
    .line 168
    new-array v3, v0, [B

    .line 169
    move v4, v1

    .line 170
    .line 171
    :goto_3
    if-eq v4, v0, :cond_7

    .line 172
    .line 173
    const-string v5, "0000Z"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 177
    move-result v5

    .line 178
    int-to-byte v5, v5

    .line 179
    .line 180
    aput-byte v5, v3, v4

    .line 181
    .line 182
    add-int/lit8 v4, v4, 0x1

    .line 183
    goto :goto_3

    .line 184
    .line 185
    :cond_7
    iget-object v4, p0, Lcom/geetest/gtc4/k;->a:[B

    .line 186
    array-length v4, v4

    .line 187
    .line 188
    add-int/lit8 v4, v4, -0x1

    .line 189
    .line 190
    .line 191
    invoke-static {v3, v1, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 192
    return-object v2

    .line 193
    :cond_8
    return-object v0
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
