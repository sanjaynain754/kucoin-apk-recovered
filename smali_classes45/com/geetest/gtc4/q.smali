.class public final Lcom/geetest/gtc4/q;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final a:[B

.field public b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/geetest/gtc4/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

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
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/q;->a:[B

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/geetest/gtc4/q;->b:Ljava/lang/String;

    .line 9
    return-void
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
    iget-object v0, p0, Lcom/geetest/gtc4/q;->a:[B

    array-length v0, v0

    .line 2
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/q;->a:[B

    const/4 v1, 0x6

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/geetest/gtc4/q;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_1
    check-cast p1, Lcom/geetest/gtc4/q;

    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/q;->a:[B

    iget-object p1, p1, Lcom/geetest/gtc4/q;->a:[B

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
    iget-object v0, p0, Lcom/geetest/gtc4/q;->a:[B

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
    .locals 17

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    monitor-enter p0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v1, Lcom/geetest/gtc4/q;->b:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    iget-object v0, v1, Lcom/geetest/gtc4/q;->a:[B

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v7, 0x0

    .line 17
    .line 18
    const-wide/16 v8, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    :goto_0
    array-length v11, v0

    .line 21
    .line 22
    if-eq v7, v11, :cond_8

    .line 23
    .line 24
    aget-byte v11, v0, v7

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const-wide v12, 0xffffffffffff80L

    .line 30
    .line 31
    cmp-long v12, v8, v12

    .line 32
    const/4 v13, 0x7

    .line 33
    .line 34
    const/16 v14, 0x2e

    .line 35
    .line 36
    const/16 v4, 0x32

    .line 37
    .line 38
    const-wide/16 v15, 0x50

    .line 39
    .line 40
    if-gtz v12, :cond_4

    .line 41
    .line 42
    and-int/lit8 v12, v11, 0x7f

    .line 43
    int-to-long v5, v12

    .line 44
    add-long/2addr v8, v5

    .line 45
    .line 46
    and-int/lit16 v5, v11, 0x80

    .line 47
    .line 48
    if-nez v5, :cond_3

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    const-wide/16 v5, 0x28

    .line 53
    .line 54
    cmp-long v3, v8, v5

    .line 55
    .line 56
    if-gez v3, :cond_0

    .line 57
    .line 58
    const/16 v3, 0x30

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto :goto_3

    .line 65
    .line 66
    :cond_0
    cmp-long v3, v8, v15

    .line 67
    .line 68
    if-gez v3, :cond_1

    .line 69
    .line 70
    const/16 v3, 0x31

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    sub-long/2addr v8, v5

    .line 75
    goto :goto_1

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    sub-long/2addr v8, v15

    .line 80
    :goto_1
    const/4 v3, 0x0

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-wide/16 v8, 0x0

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    shl-long/2addr v8, v13

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_4
    if-nez v10, :cond_5

    .line 94
    .line 95
    .line 96
    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 97
    move-result-object v10

    .line 98
    .line 99
    :cond_5
    and-int/lit8 v5, v11, 0x7f

    .line 100
    int-to-long v5, v5

    .line 101
    .line 102
    .line 103
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 104
    move-result-object v5

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v5}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    and-int/lit16 v6, v11, 0x80

    .line 111
    .line 112
    if-nez v6, :cond_7

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-static/range {v15 .. v16}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v3}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 125
    move-result-object v5

    .line 126
    const/4 v3, 0x0

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-wide/16 v8, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    goto :goto_2

    .line 137
    .line 138
    .line 139
    :cond_7
    invoke-virtual {v5, v13}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 140
    move-result-object v10

    .line 141
    .line 142
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 143
    goto :goto_0

    .line 144
    .line 145
    .line 146
    :cond_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    iput-object v0, v1, Lcom/geetest/gtc4/q;->b:Ljava/lang/String;

    .line 150
    .line 151
    :cond_9
    iget-object v0, v1, Lcom/geetest/gtc4/q;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit p0

    .line 153
    return-object v0

    .line 154
    :goto_3
    monitor-exit p0

    .line 155
    throw v0
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
