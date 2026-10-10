.class public final Lcom/geetest/gtc4/l5;
.super Lcom/geetest/gtc4/z;
.source "SourceFile"


# instance fields
.field public b:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/z;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/l5;->b:[B

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
    .locals 2

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/l5;->b:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_0

    .line 5
    array-length v0, v0

    .line 6
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1

    .line 7
    :cond_0
    new-instance v0, Lcom/geetest/gtc4/z2;

    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/z2;-><init>([Lcom/geetest/gtc4/f;)V

    .line 8
    invoke-virtual {v0, p1}, Lcom/geetest/gtc4/z2;->a(Z)I

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(I)Lcom/geetest/gtc4/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->n()V

    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/l5;->b:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_0

    const/16 v1, 0x30

    .line 11
    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void

    .line 12
    :cond_0
    new-instance v0, Lcom/geetest/gtc4/z2;

    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/z2;-><init>([Lcom/geetest/gtc4/f;)V

    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/geetest/gtc4/z2;->a(Lcom/geetest/gtc4/u;Z)V

    return-void

    :catchall_0
    move-exception p1

    .line 14
    monitor-exit p0

    throw p1
.end method

.method public final g()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->n()V

    .line 4
    .line 5
    new-instance v0, Lcom/geetest/gtc4/m2;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/m2;-><init>([Lcom/geetest/gtc4/f;)V

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

.method public final h()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->n()V

    .line 4
    .line 5
    new-instance v0, Lcom/geetest/gtc4/z2;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/z2;-><init>([Lcom/geetest/gtc4/f;)V

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

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->n()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/geetest/gtc4/z;->hashCode()I

    .line 7
    move-result v0

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

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->n()V

    .line 4
    .line 5
    new-instance v0, Lcom/geetest/gtc4/n0;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/n0;-><init>([Ljava/lang/Object;)V

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

.method public final k()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->n()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 6
    array-length v0, v0

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

.method public final l()Lcom/geetest/gtc4/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->h()Lcom/geetest/gtc4/w;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/geetest/gtc4/z;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/geetest/gtc4/z;->l()Lcom/geetest/gtc4/b;

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

.method public final m()Lcom/geetest/gtc4/s;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/l5;->h()Lcom/geetest/gtc4/w;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/geetest/gtc4/z;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/geetest/gtc4/z;->m()Lcom/geetest/gtc4/s;

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

.method public final declared-synchronized n()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/l5;->b:[B

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    new-instance v0, Lcom/geetest/gtc4/m;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/geetest/gtc4/l5;->b:[B

    .line 10
    .line 11
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 15
    array-length v1, v1

    .line 16
    const/4 v3, 0x1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v1, v3}, Lcom/geetest/gtc4/m;-><init>(Ljava/io/ByteArrayInputStream;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_1
    invoke-virtual {v0}, Lcom/geetest/gtc4/m;->a()Lcom/geetest/gtc4/w;

    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lcom/geetest/gtc4/g;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Lcom/geetest/gtc4/g;-><init>(I)V

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_4

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_2

    .line 37
    .line 38
    :cond_0
    new-instance v4, Lcom/geetest/gtc4/g;

    .line 39
    .line 40
    const/16 v5, 0xa

    .line 41
    .line 42
    .line 43
    invoke-direct {v4, v5}, Lcom/geetest/gtc4/g;-><init>(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v4, v1}, Lcom/geetest/gtc4/g;->a(Lcom/geetest/gtc4/f;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/geetest/gtc4/m;->a()Lcom/geetest/gtc4/w;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    move-object v1, v4

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 57
    .line 58
    iget v0, v1, Lcom/geetest/gtc4/g;->b:I

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    sget-object v0, Lcom/geetest/gtc4/g;->d:[Lcom/geetest/gtc4/f;

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :cond_2
    iget-object v4, v1, Lcom/geetest/gtc4/g;->a:[Lcom/geetest/gtc4/f;

    .line 66
    array-length v5, v4

    .line 67
    .line 68
    if-ne v5, v0, :cond_3

    .line 69
    .line 70
    iput-boolean v3, v1, Lcom/geetest/gtc4/g;->c:Z

    .line 71
    move-object v0, v4

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_3
    new-array v1, v0, [Lcom/geetest/gtc4/f;

    .line 75
    .line 76
    .line 77
    invoke-static {v4, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    move-object v0, v1

    .line 79
    .line 80
    :goto_1
    iput-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 81
    const/4 v0, 0x0

    .line 82
    .line 83
    iput-object v0, p0, Lcom/geetest/gtc4/l5;->b:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    goto :goto_3

    .line 85
    .line 86
    :goto_2
    :try_start_2
    new-instance v1, Lcom/geetest/gtc4/v;

    .line 87
    .line 88
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v3, "malformed ASN.1: "

    .line 91
    .line 92
    .line 93
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v2, v0}, Lcom/geetest/gtc4/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    :cond_4
    :goto_3
    monitor-exit p0

    .line 106
    return-void

    .line 107
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    throw v0
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
