.class public La3d20260409/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:La3d20260409/e;

.field public g:La3d20260409/d;

.field public h:J


# direct methods
.method public constructor <init>(La3d20260409/d;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, La3d20260409/d;->i()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iput-wide v0, p0, La3d20260409/c;->h:J

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, La3d20260409/d;->d()I

    .line 15
    move-result p1

    .line 16
    .line 17
    iput p1, p0, La3d20260409/c;->d:I

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 7
    .line 8
    .line 9
    invoke-static {}, La3d20260409/v;->v()Z

    .line 10
    move-result v3

    .line 11
    .line 12
    const/16 v4, 0x50

    .line 13
    .line 14
    const/16 v5, 0x12c

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v4, v5, v3}, La3d20260409/d;->m(IIZ)[B

    .line 18
    move-result-object v2

    .line 19
    .line 20
    iput-object v2, p0, La3d20260409/c;->a:[B

    .line 21
    .line 22
    iput v5, p0, La3d20260409/c;->b:I

    .line 23
    .line 24
    iput v5, p0, La3d20260409/c;->c:I

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    move-result-wide v2

    .line 29
    sub-long/2addr v2, v0

    .line 30
    long-to-int v0, v2

    .line 31
    .line 32
    iput v0, p0, La3d20260409/c;->e:I

    .line 33
    return-void
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
.end method

.method public final b()[B
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 3
    .line 4
    .line 5
    invoke-static {}, La3d20260409/v;->A()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-static {}, La3d20260409/v;->v()Z

    .line 10
    move-result v2

    .line 11
    .line 12
    const/16 v3, 0x12c

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v3, v2}, La3d20260409/d;->j(IIZ)Landroid/graphics/Bitmap;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {}, La3d20260409/v;->A()I

    .line 24
    move-result v2

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 32
    return-object v1
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
.end method

.method public final c()[B
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, La3d20260409/v;->S()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x46

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const/16 v0, 0x32

    .line 12
    .line 13
    :goto_0
    iget-object v1, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 14
    .line 15
    .line 16
    invoke-static {}, La3d20260409/v;->v()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    const/16 v3, 0x100

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v3, v2}, La3d20260409/d;->j(IIZ)Landroid/graphics/Bitmap;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 35
    return-object v0
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
.end method

.method public d(La3d20260409/oOooooooo0000000000;)[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, La3d20260409/c$a;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :pswitch_0
    invoke-virtual {p0}, La3d20260409/c;->h()[B

    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    .line 20
    .line 21
    :pswitch_1
    invoke-virtual {p0}, La3d20260409/c;->g()[B

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :pswitch_2
    invoke-virtual {p0}, La3d20260409/c;->k()[B

    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    .line 30
    .line 31
    :pswitch_3
    invoke-virtual {p0}, La3d20260409/c;->i()[B

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    .line 35
    .line 36
    :pswitch_4
    invoke-virtual {p0}, La3d20260409/c;->b()[B

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    .line 41
    :pswitch_5
    invoke-virtual {p0}, La3d20260409/c;->c()[B

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    .line 45
    .line 46
    :pswitch_6
    invoke-virtual {p0}, La3d20260409/c;->j()[B

    .line 47
    move-result-object p1

    .line 48
    return-object p1

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final e(Landroid/graphics/Bitmap;)[B
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/c;->f:La3d20260409/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    :cond_0
    :try_start_0
    iget-object v0, v0, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 11
    .line 12
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 13
    sub-float/2addr v2, v0

    .line 14
    .line 15
    const/high16 v3, 0x40000000    # 2.0f

    .line 16
    div-float/2addr v2, v3

    .line 17
    add-float/2addr v2, v0

    .line 18
    .line 19
    iget v0, p0, La3d20260409/c;->b:I

    .line 20
    int-to-float v0, v0

    .line 21
    div-float/2addr v2, v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    mul-float/2addr v2, v0

    .line 28
    .line 29
    iget-object v0, p0, La3d20260409/c;->f:La3d20260409/e;

    .line 30
    .line 31
    iget-object v0, v0, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 32
    .line 33
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 34
    .line 35
    iget v3, p0, La3d20260409/c;->c:I

    .line 36
    int-to-float v3, v3

    .line 37
    div-float/2addr v0, v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 41
    move-result v3

    .line 42
    int-to-float v3, v3

    .line 43
    mul-float/2addr v0, v3

    .line 44
    .line 45
    iget-object v3, p0, La3d20260409/c;->f:La3d20260409/e;

    .line 46
    .line 47
    iget-object v3, v3, La3d20260409/e;->a:Landroid/graphics/RectF;

    .line 48
    .line 49
    iget v4, v3, Landroid/graphics/RectF;->bottom:F

    .line 50
    .line 51
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 52
    sub-float/2addr v4, v3

    .line 53
    .line 54
    iget v3, p0, La3d20260409/c;->c:I

    .line 55
    int-to-float v3, v3

    .line 56
    div-float/2addr v4, v3

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 60
    move-result v3

    .line 61
    int-to-float v3, v3

    .line 62
    mul-float/2addr v4, v3

    .line 63
    .line 64
    .line 65
    const v3, 0x3f8ccccd    # 1.1f

    .line 66
    mul-float/2addr v4, v3

    .line 67
    float-to-int v3, v4

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 71
    move-result v4

    .line 72
    .line 73
    const/16 v5, 0x12c

    .line 74
    .line 75
    if-ge v3, v4, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 79
    move-result v4

    .line 80
    .line 81
    if-lt v3, v4, :cond_1

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_1
    div-int/lit8 v4, v3, 0x2

    .line 85
    int-to-float v4, v4

    .line 86
    sub-float/2addr v2, v4

    .line 87
    float-to-int v2, v2

    .line 88
    float-to-int v0, v0

    .line 89
    .line 90
    add-int v4, v0, v3

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 94
    move-result v6

    .line 95
    .line 96
    if-le v4, v6, :cond_2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 100
    move-result v4

    .line 101
    sub-int/2addr v4, v0

    .line 102
    goto :goto_0

    .line 103
    :catch_0
    move-exception v0

    .line 104
    move-object p1, v0

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    move v4, v3

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-static {p1, v2, v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v5}, Lk/a;->k(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 118
    .line 119
    .line 120
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    .line 124
    invoke-static {}, La3d20260409/v;->A()I

    .line 125
    move-result v2

    .line 126
    .line 127
    .line 128
    invoke-static {v0, p1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 133
    return-object p1

    .line 134
    .line 135
    .line 136
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 137
    move-result v9

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 141
    move-result v10

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v12, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    move-object v6, p1

    .line 147
    .line 148
    .line 149
    invoke-static/range {v6 .. v12}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v5}, Lk/a;->k(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    .line 157
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    invoke-static {}, La3d20260409/v;->A()I

    .line 162
    move-result v2

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v0, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 166
    move-result-object v0

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    return-object v0

    .line 171
    .line 172
    .line 173
    :goto_2
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, p1}, Lf/h;->H(Ljava/lang/Throwable;)V

    .line 178
    return-object v1
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
.end method

.method public f()[[B
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 3
    .line 4
    .line 5
    invoke-static {}, La3d20260409/v;->A()I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget-object v2, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/YuvImage;->getHeight()I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-static {}, La3d20260409/v;->v()Z

    .line 16
    move-result v3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, La3d20260409/d;->f(IIZ)Landroid/graphics/Bitmap;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, La3d20260409/c;->e(Landroid/graphics/Bitmap;)[B

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-static {}, La3d20260409/v;->A()I

    .line 32
    move-result v3

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, v3}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-static {}, La3d20260409/s;->l()I

    .line 40
    move-result v3

    .line 41
    .line 42
    .line 43
    invoke-static {}, La3d20260409/v;->D()Z

    .line 44
    move-result v4

    .line 45
    .line 46
    .line 47
    invoke-static {}, La3d20260409/v;->E()F

    .line 48
    move-result v5

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v3, v4, v5}, Lk/a;->l(Landroid/graphics/Bitmap;IZF)Landroid/graphics/Bitmap;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    .line 59
    invoke-static {}, La3d20260409/v;->A()I

    .line 60
    move-result v5

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v4, v5}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 64
    move-result-object v4

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 71
    move-result v3

    .line 72
    .line 73
    if-nez v3, :cond_0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 77
    .line 78
    .line 79
    :cond_0
    filled-new-array {v4, v2, v1}, [[B

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
.end method

.method public final g()[B
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, La3d20260409/j3d20260409;->oOOO()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    :cond_0
    iget v1, p0, La3d20260409/c;->b:I

    .line 11
    .line 12
    iget v2, p0, La3d20260409/c;->c:I

    .line 13
    .line 14
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget-object v2, p0, La3d20260409/c;->a:[B

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lk/a;->k(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const/16 v2, 0x32

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 45
    return-object v1
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
.end method

.method public final h()[B
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, La3d20260409/s;->d:Z

    .line 3
    const/4 v0, 0x0

    .line 4
    throw v0
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
.end method

.method public final i()[B
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 3
    .line 4
    .line 5
    invoke-static {}, La3d20260409/v;->A()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-static {}, La3d20260409/v;->w()I

    .line 10
    move-result v2

    .line 11
    .line 12
    .line 13
    invoke-static {}, La3d20260409/v;->v()Z

    .line 14
    move-result v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, La3d20260409/d;->f(IIZ)Landroid/graphics/Bitmap;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {}, La3d20260409/v;->A()I

    .line 26
    move-result v2

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 34
    return-object v1
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
.end method

.method public final j()[B
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 3
    .line 4
    .line 5
    invoke-static {}, La3d20260409/v;->A()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-static {}, La3d20260409/s;->l()I

    .line 10
    move-result v2

    .line 11
    .line 12
    .line 13
    invoke-static {}, La3d20260409/v;->v()Z

    .line 14
    move-result v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, La3d20260409/d;->f(IIZ)Landroid/graphics/Bitmap;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {}, La3d20260409/v;->A()I

    .line 26
    move-result v2

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 34
    return-object v1
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
.end method

.method public final k()[B
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/c;->g:La3d20260409/d;

    .line 3
    .line 4
    .line 5
    invoke-static {}, La3d20260409/v;->A()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, La3d20260409/d;->e(I)Landroid/graphics/Bitmap;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {}, La3d20260409/v;->A()I

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 26
    return-object v1
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
.end method
