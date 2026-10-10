.class public Lv5/f;
.super Ljava/lang/Object;
.source "ProgressiveJpegParser.java"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public final h:Lz3/a;


# direct methods
.method public constructor <init>(Lz3/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lz3/a;

    .line 10
    .line 11
    iput-object p1, p0, Lv5/f;->h:Lz3/a;

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    iput p1, p0, Lv5/f;->c:I

    .line 15
    .line 16
    iput p1, p0, Lv5/f;->b:I

    .line 17
    .line 18
    iput p1, p0, Lv5/f;->d:I

    .line 19
    .line 20
    iput p1, p0, Lv5/f;->f:I

    .line 21
    .line 22
    iput p1, p0, Lv5/f;->e:I

    .line 23
    .line 24
    iput p1, p0, Lv5/f;->a:I

    .line 25
    return-void
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
.end method

.method public static b(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-ne p0, v1, :cond_0

    .line 5
    return v0

    .line 6
    .line 7
    :cond_0
    const/16 v2, 0xd0

    .line 8
    .line 9
    if-lt p0, v2, :cond_1

    .line 10
    .line 11
    const/16 v2, 0xd7

    .line 12
    .line 13
    if-gt p0, v2, :cond_1

    .line 14
    return v0

    .line 15
    .line 16
    :cond_1
    const/16 v2, 0xd9

    .line 17
    .line 18
    if-eq p0, v2, :cond_2

    .line 19
    .line 20
    const/16 v2, 0xd8

    .line 21
    .line 22
    if-eq p0, v2, :cond_2

    .line 23
    return v1

    .line 24
    :cond_2
    return v0
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
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)Z
    .locals 11

    .line 1
    .line 2
    iget v0, p0, Lv5/f;->e:I

    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x6

    .line 6
    .line 7
    :try_start_0
    iget v4, p0, Lv5/f;->a:I

    .line 8
    .line 9
    if-eq v4, v3, :cond_f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 13
    move-result v4

    .line 14
    const/4 v5, -0x1

    .line 15
    .line 16
    if-eq v4, v5, :cond_f

    .line 17
    .line 18
    iget v5, p0, Lv5/f;->c:I

    .line 19
    .line 20
    add-int/lit8 v6, v5, 0x1

    .line 21
    .line 22
    iput v6, p0, Lv5/f;->c:I

    .line 23
    .line 24
    iget-boolean v6, p0, Lv5/f;->g:Z

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    iput v3, p0, Lv5/f;->a:I

    .line 29
    .line 30
    iput-boolean v1, p0, Lv5/f;->g:Z

    .line 31
    return v1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_0
    iget v6, p0, Lv5/f;->a:I

    .line 37
    .line 38
    const/16 v7, 0xff

    .line 39
    .line 40
    if-eqz v6, :cond_c

    .line 41
    const/4 v8, 0x2

    .line 42
    .line 43
    if-eq v6, v2, :cond_a

    .line 44
    const/4 v9, 0x3

    .line 45
    .line 46
    if-eq v6, v8, :cond_9

    .line 47
    const/4 v10, 0x4

    .line 48
    .line 49
    if-eq v6, v9, :cond_3

    .line 50
    const/4 v5, 0x5

    .line 51
    .line 52
    if-eq v6, v10, :cond_2

    .line 53
    .line 54
    if-eq v6, v5, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lw3/h;->i(Z)V

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_1
    iget v5, p0, Lv5/f;->b:I

    .line 61
    .line 62
    shl-int/lit8 v5, v5, 0x8

    .line 63
    add-int/2addr v5, v4

    .line 64
    sub-int/2addr v5, v8

    .line 65
    int-to-long v6, v5

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v6, v7}, Ld4/c;->a(Ljava/io/InputStream;J)J

    .line 69
    .line 70
    iget v6, p0, Lv5/f;->c:I

    .line 71
    add-int/2addr v6, v5

    .line 72
    .line 73
    iput v6, p0, Lv5/f;->c:I

    .line 74
    .line 75
    iput v8, p0, Lv5/f;->a:I

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_2
    iput v5, p0, Lv5/f;->a:I

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_3
    if-ne v4, v7, :cond_4

    .line 82
    .line 83
    iput v9, p0, Lv5/f;->a:I

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_4
    if-nez v4, :cond_5

    .line 87
    .line 88
    iput v8, p0, Lv5/f;->a:I

    .line 89
    goto :goto_1

    .line 90
    .line 91
    :cond_5
    const/16 v6, 0xd9

    .line 92
    .line 93
    if-ne v4, v6, :cond_6

    .line 94
    .line 95
    iput-boolean v2, p0, Lv5/f;->g:Z

    .line 96
    .line 97
    add-int/lit8 v5, v5, -0x1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v5}, Lv5/f;->f(I)V

    .line 101
    .line 102
    iput v8, p0, Lv5/f;->a:I

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_6
    const/16 v6, 0xda

    .line 106
    .line 107
    if-ne v4, v6, :cond_7

    .line 108
    .line 109
    add-int/lit8 v5, v5, -0x1

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v5}, Lv5/f;->f(I)V

    .line 113
    .line 114
    .line 115
    :cond_7
    invoke-static {v4}, Lv5/f;->b(I)Z

    .line 116
    move-result v5

    .line 117
    .line 118
    if-eqz v5, :cond_8

    .line 119
    .line 120
    iput v10, p0, Lv5/f;->a:I

    .line 121
    goto :goto_1

    .line 122
    .line 123
    :cond_8
    iput v8, p0, Lv5/f;->a:I

    .line 124
    goto :goto_1

    .line 125
    .line 126
    :cond_9
    if-ne v4, v7, :cond_e

    .line 127
    .line 128
    iput v9, p0, Lv5/f;->a:I

    .line 129
    goto :goto_1

    .line 130
    .line 131
    :cond_a
    const/16 v5, 0xd8

    .line 132
    .line 133
    if-ne v4, v5, :cond_b

    .line 134
    .line 135
    iput v8, p0, Lv5/f;->a:I

    .line 136
    goto :goto_1

    .line 137
    .line 138
    :cond_b
    iput v3, p0, Lv5/f;->a:I

    .line 139
    goto :goto_1

    .line 140
    .line 141
    :cond_c
    if-ne v4, v7, :cond_d

    .line 142
    .line 143
    iput v2, p0, Lv5/f;->a:I

    .line 144
    goto :goto_1

    .line 145
    .line 146
    :cond_d
    iput v3, p0, Lv5/f;->a:I

    .line 147
    .line 148
    :cond_e
    :goto_1
    iput v4, p0, Lv5/f;->b:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    .line 153
    :goto_2
    invoke-static {p1}, Lw3/m;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 154
    .line 155
    :cond_f
    iget p1, p0, Lv5/f;->a:I

    .line 156
    .line 157
    if-eq p1, v3, :cond_10

    .line 158
    .line 159
    iget p1, p0, Lv5/f;->e:I

    .line 160
    .line 161
    if-eq p1, v0, :cond_10

    .line 162
    move v1, v2

    .line 163
    :cond_10
    return v1
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

.method public c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lv5/f;->f:I

    .line 3
    return v0
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

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lv5/f;->e:I

    .line 3
    return v0
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

.method public e()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lv5/f;->g:Z

    .line 3
    return v0
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

.method public final f(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lv5/f;->d:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lv5/f;->f:I

    .line 7
    .line 8
    :cond_0
    add-int/lit8 p1, v0, 0x1

    .line 9
    .line 10
    iput p1, p0, Lv5/f;->d:I

    .line 11
    .line 12
    iput v0, p0, Lv5/f;->e:I

    .line 13
    return-void
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

.method public g(Lx5/i;)Z
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lv5/f;->a:I

    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    return v2

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lx5/i;->q()I

    .line 11
    move-result v0

    .line 12
    .line 13
    iget v1, p0, Lv5/f;->c:I

    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    return v2

    .line 17
    .line 18
    :cond_1
    new-instance v0, Lz3/g;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lx5/i;->o()Ljava/io/InputStream;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iget-object v1, p0, Lv5/f;->h:Lz3/a;

    .line 25
    .line 26
    const/16 v3, 0x4000

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v3}, Lz3/f;->get(I)Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, [B

    .line 33
    .line 34
    iget-object v3, p0, Lv5/f;->h:Lz3/a;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1, v1, v3}, Lz3/g;-><init>(Ljava/io/InputStream;[BLa4/h;)V

    .line 38
    .line 39
    :try_start_0
    iget p1, p0, Lv5/f;->c:I

    .line 40
    int-to-long v3, p1

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3, v4}, Ld4/c;->a(Ljava/io/InputStream;J)J

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lv5/f;->a(Ljava/io/InputStream;)Z

    .line 47
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lw3/b;->b(Ljava/io/InputStream;)V

    .line 51
    return p1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-static {p1}, Lw3/m;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lw3/b;->b(Ljava/io/InputStream;)V

    .line 61
    return v2

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-static {v0}, Lw3/b;->b(Ljava/io/InputStream;)V

    .line 65
    throw p1
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method
