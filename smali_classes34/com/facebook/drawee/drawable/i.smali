.class public Lcom/facebook/drawee/drawable/i;
.super Lcom/facebook/drawee/drawable/g;
.source "OrientedDrawable.java"


# instance fields
.field public final b:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public c:I

.field public d:I

.field public final e:Landroid/graphics/Matrix;

.field public final f:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/drawee/drawable/g;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/drawee/drawable/i;->e:Landroid/graphics/Matrix;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/drawee/drawable/i;->f:Landroid/graphics/RectF;

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Matrix;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 25
    .line 26
    rem-int/lit8 p1, p2, 0x5a

    .line 27
    sub-int/2addr p2, p1

    .line 28
    .line 29
    iput p2, p0, Lcom/facebook/drawee/drawable/i;->c:I

    .line 30
    .line 31
    if-ltz p3, :cond_0

    .line 32
    .line 33
    const/16 p1, 0x8

    .line 34
    .line 35
    if-gt p3, p1, :cond_0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p3, 0x0

    .line 38
    .line 39
    :goto_0
    iput p3, p0, Lcom/facebook/drawee/drawable/i;->d:I

    .line 40
    return-void
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
    .line 81
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/i;->c:I

    .line 3
    .line 4
    if-gtz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/drawee/drawable/i;->d:I

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/g;->draw(Landroid/graphics/Canvas;)V

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 19
    move-result v0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/g;->draw(Landroid/graphics/Canvas;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 31
    return-void
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

.method public getIntrinsicHeight()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/i;->d:I

    .line 3
    const/4 v1, 0x5

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    const/4 v1, 0x7

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/facebook/drawee/drawable/i;->c:I

    .line 11
    .line 12
    rem-int/lit16 v0, v0, 0xb4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0}, Lcom/facebook/drawee/drawable/g;->getIntrinsicHeight()I

    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-super {p0}, Lcom/facebook/drawee/drawable/g;->getIntrinsicWidth()I

    .line 24
    move-result v0

    .line 25
    return v0
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
    .line 76
    .line 77
.end method

.method public getIntrinsicWidth()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/i;->d:I

    .line 3
    const/4 v1, 0x5

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    const/4 v1, 0x7

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/facebook/drawee/drawable/i;->c:I

    .line 11
    .line 12
    rem-int/lit16 v0, v0, 0xb4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0}, Lcom/facebook/drawee/drawable/g;->getIntrinsicWidth()I

    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-super {p0}, Lcom/facebook/drawee/drawable/g;->getIntrinsicHeight()I

    .line 24
    move-result v0

    .line 25
    return v0
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
    .line 76
    .line 77
.end method

.method public getTransform(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/drawable/g;->getParentTransform(Landroid/graphics/Matrix;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/g;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget v1, p0, Lcom/facebook/drawee/drawable/i;->c:I

    .line 10
    .line 11
    if-gtz v1, :cond_2

    .line 12
    .line 13
    iget v2, p0, Lcom/facebook/drawee/drawable/i;->d:I

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    const/4 v3, 0x1

    .line 17
    .line 18
    if-eq v2, v3, :cond_1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_2
    :goto_0
    iget v2, p0, Lcom/facebook/drawee/drawable/i;->d:I

    .line 26
    const/4 v3, 0x2

    .line 27
    .line 28
    const/high16 v4, 0x3f800000    # 1.0f

    .line 29
    .line 30
    const/high16 v5, -0x40800000    # -1.0f

    .line 31
    .line 32
    if-eq v2, v3, :cond_6

    .line 33
    const/4 v3, 0x7

    .line 34
    .line 35
    const/high16 v6, 0x43870000    # 270.0f

    .line 36
    .line 37
    if-eq v2, v3, :cond_5

    .line 38
    const/4 v3, 0x4

    .line 39
    .line 40
    if-eq v2, v3, :cond_4

    .line 41
    const/4 v3, 0x5

    .line 42
    .line 43
    if-eq v2, v3, :cond_3

    .line 44
    .line 45
    iget-object v2, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 46
    int-to-float v1, v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 50
    move-result v3

    .line 51
    int-to-float v3, v3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    .line 55
    move-result v4

    .line 56
    int-to-float v4, v4

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1, v3, v4}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_3
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 66
    move-result v2

    .line 67
    int-to-float v2, v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    .line 71
    move-result v3

    .line 72
    int-to-float v3, v3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v6, v2, v3}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 76
    .line 77
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_4
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_5
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 93
    move-result v2

    .line 94
    int-to-float v2, v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    .line 98
    move-result v3

    .line 99
    int-to-float v3, v3

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v6, v2, v3}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 103
    .line 104
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 108
    goto :goto_1

    .line 109
    .line 110
    :cond_6
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 114
    .line 115
    :goto_1
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->e:Landroid/graphics/Matrix;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 119
    .line 120
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->b:Landroid/graphics/Matrix;

    .line 121
    .line 122
    iget-object v2, p0, Lcom/facebook/drawee/drawable/i;->e:Landroid/graphics/Matrix;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 126
    .line 127
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->f:Landroid/graphics/RectF;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 131
    .line 132
    iget-object p1, p0, Lcom/facebook/drawee/drawable/i;->e:Landroid/graphics/Matrix;

    .line 133
    .line 134
    iget-object v1, p0, Lcom/facebook/drawee/drawable/i;->f:Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 138
    .line 139
    iget-object p1, p0, Lcom/facebook/drawee/drawable/i;->f:Landroid/graphics/RectF;

    .line 140
    .line 141
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 142
    float-to-int v1, v1

    .line 143
    .line 144
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 145
    float-to-int v2, v2

    .line 146
    .line 147
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 148
    float-to-int v3, v3

    .line 149
    .line 150
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 151
    float-to-int p1, p1

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 155
    return-void
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
.end method
