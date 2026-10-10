.class public Lcom/facebook/drawee/drawable/f;
.super Lcom/facebook/drawee/drawable/a;
.source "FadeDrawable.java"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final j:[Landroid/graphics/drawable/Drawable;

.field public final k:Z

.field public final l:I

.field public final m:I

.field public n:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public o:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public p:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public q:[I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public r:[I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public s:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public t:[Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public u:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public v:Lg5/g;

.field public w:Z

.field public x:Z

.field public y:Z


# direct methods
.method public constructor <init>([Landroid/graphics/drawable/Drawable;ZI)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/drawee/drawable/a;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->y:Z

    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-lt v1, v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    .line 14
    :goto_0
    const-string v1, "At least one layer required!"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lw3/h;->j(ZLjava/lang/Object;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/facebook/drawee/drawable/f;->j:[Landroid/graphics/drawable/Drawable;

    .line 20
    array-length v0, p1

    .line 21
    .line 22
    new-array v0, v0, [I

    .line 23
    .line 24
    iput-object v0, p0, Lcom/facebook/drawee/drawable/f;->q:[I

    .line 25
    array-length v0, p1

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    iput-object v0, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 30
    .line 31
    const/16 v0, 0xff

    .line 32
    .line 33
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->s:I

    .line 34
    array-length p1, p1

    .line 35
    .line 36
    new-array p1, p1, [Z

    .line 37
    .line 38
    iput-object p1, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 39
    .line 40
    iput v2, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 41
    .line 42
    iput-boolean p2, p0, Lcom/facebook/drawee/drawable/f;->k:Z

    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    move v2, v0

    .line 46
    .line 47
    :cond_1
    iput v2, p0, Lcom/facebook/drawee/drawable/f;->l:I

    .line 48
    .line 49
    iput p3, p0, Lcom/facebook/drawee/drawable/f;->m:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->q()V

    .line 53
    return-void
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
    .locals 8

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    if-eq v0, v3, :cond_0

    .line 10
    goto :goto_5

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->o:I

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->m()J

    .line 24
    move-result-wide v4

    .line 25
    .line 26
    iget-wide v6, p0, Lcom/facebook/drawee/drawable/f;->p:J

    .line 27
    sub-long/2addr v4, v6

    .line 28
    long-to-float v0, v4

    .line 29
    .line 30
    iget v4, p0, Lcom/facebook/drawee/drawable/f;->o:I

    .line 31
    int-to-float v4, v4

    .line 32
    div-float/2addr v0, v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/facebook/drawee/drawable/f;->s(F)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v3

    .line 41
    .line 42
    :goto_1
    iput v1, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 43
    :goto_2
    move v3, v0

    .line 44
    goto :goto_5

    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 47
    .line 48
    iget-object v4, p0, Lcom/facebook/drawee/drawable/f;->q:[I

    .line 49
    .line 50
    iget-object v5, p0, Lcom/facebook/drawee/drawable/f;->j:[Landroid/graphics/drawable/Drawable;

    .line 51
    array-length v5, v5

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->m()J

    .line 58
    move-result-wide v4

    .line 59
    .line 60
    iput-wide v4, p0, Lcom/facebook/drawee/drawable/f;->p:J

    .line 61
    .line 62
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->o:I

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    const/high16 v0, 0x3f800000    # 1.0f

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/4 v0, 0x0

    .line 69
    .line 70
    .line 71
    :goto_3
    invoke-virtual {p0, v0}, Lcom/facebook/drawee/drawable/f;->s(F)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->o()V

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    move v1, v3

    .line 80
    .line 81
    :goto_4
    iput v1, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 82
    goto :goto_2

    .line 83
    .line 84
    :goto_5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->j:[Landroid/graphics/drawable/Drawable;

    .line 85
    array-length v1, v0

    .line 86
    .line 87
    if-ge v2, v1, :cond_6

    .line 88
    .line 89
    aget-object v0, v0, v2

    .line 90
    .line 91
    iget-object v1, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 92
    .line 93
    aget v1, v1, v2

    .line 94
    .line 95
    iget v4, p0, Lcom/facebook/drawee/drawable/f;->s:I

    .line 96
    mul-int/2addr v1, v4

    .line 97
    int-to-double v4, v1

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    const-wide v6, 0x406fe00000000000L    # 255.0

    .line 103
    div-double/2addr v4, v6

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 107
    move-result-wide v4

    .line 108
    double-to-int v1, v4

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/drawee/drawable/f;->g(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;I)V

    .line 112
    .line 113
    add-int/lit8 v2, v2, 0x1

    .line 114
    goto :goto_5

    .line 115
    .line 116
    :cond_6
    if-eqz v3, :cond_7

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->n()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->p()V

    .line 123
    return-void

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

    .line 127
    return-void
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
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 7
    return-void
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

.method public final g(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 1
    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    if-lez p3, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->y:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 21
    .line 22
    iget p3, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 23
    .line 24
    add-int/lit8 p3, p3, -0x1

    .line 25
    .line 26
    iput p3, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 30
    :cond_1
    return-void
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

.method public getAlpha()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->s:I

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

.method public h()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

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
.end method

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([ZZ)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public invalidateSelf()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->u:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    :cond_0
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

.method public j(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    aput-boolean v1, v0, p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

    .line 12
    return-void
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

.method public k(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 6
    .line 7
    aput-boolean v0, v1, p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

    .line 11
    return-void
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

.method public l()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/f;->j:[Landroid/graphics/drawable/Drawable;

    .line 8
    array-length v2, v2

    .line 9
    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 13
    .line 14
    iget-object v3, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 15
    .line 16
    aget-boolean v3, v3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const/16 v3, 0xff

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move v3, v0

    .line 23
    .line 24
    :goto_1
    aput v3, v2, v1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public m()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method public final n()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->w:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->w:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->v:Lg5/g;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lg5/g;->a()V

    .line 16
    :cond_1
    :goto_0
    return-void
    .line 17
    .line 18
.end method

.method public final o()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->m:I

    .line 8
    .line 9
    if-ltz v0, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 12
    array-length v2, v1

    .line 13
    .line 14
    if-lt v0, v2, :cond_1

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_1
    aget-boolean v0, v1, v0

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const/4 v0, 0x1

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->w:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->v:Lg5/g;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lg5/g;->b()V

    .line 31
    :cond_3
    :goto_0
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final p()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->x:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 13
    .line 14
    iget v1, p0, Lcom/facebook/drawee/drawable/f;->m:I

    .line 15
    .line 16
    aget-boolean v0, v0, v1

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->v:Lg5/g;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lg5/g;->c()V

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/f;->x:Z

    .line 29
    :cond_2
    :goto_0
    return-void
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

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    iput v0, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->q:[I

    .line 6
    .line 7
    iget v1, p0, Lcom/facebook/drawee/drawable/f;->l:I

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->q:[I

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    const/16 v2, 0xff

    .line 16
    .line 17
    aput v2, v0, v1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 20
    .line 21
    iget v3, p0, Lcom/facebook/drawee/drawable/f;->l:I

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([II)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 27
    .line 28
    aput v2, v0, v1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 31
    .line 32
    iget-boolean v2, p0, Lcom/facebook/drawee/drawable/f;->k:Z

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([ZZ)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 38
    const/4 v2, 0x1

    .line 39
    .line 40
    aput-boolean v2, v0, v1

    .line 41
    return-void
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

.method public r(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/drawee/drawable/f;->o:I

    .line 3
    .line 4
    iget p1, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    const/4 p1, 0x0

    .line 9
    .line 10
    iput p1, p0, Lcom/facebook/drawee/drawable/f;->n:I

    .line 11
    :cond_0
    return-void
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

.method public final s(F)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    .line 6
    :goto_0
    iget-object v4, p0, Lcom/facebook/drawee/drawable/f;->j:[Landroid/graphics/drawable/Drawable;

    .line 7
    array-length v4, v4

    .line 8
    .line 9
    if-ge v2, v4, :cond_5

    .line 10
    .line 11
    iget-object v4, p0, Lcom/facebook/drawee/drawable/f;->t:[Z

    .line 12
    .line 13
    aget-boolean v4, v4, v2

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    move v5, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v5, -0x1

    .line 19
    .line 20
    :goto_1
    iget-object v6, p0, Lcom/facebook/drawee/drawable/f;->r:[I

    .line 21
    .line 22
    iget-object v7, p0, Lcom/facebook/drawee/drawable/f;->q:[I

    .line 23
    .line 24
    aget v7, v7, v2

    .line 25
    int-to-float v7, v7

    .line 26
    .line 27
    const/16 v8, 0xff

    .line 28
    mul-int/2addr v5, v8

    .line 29
    int-to-float v5, v5

    .line 30
    mul-float/2addr v5, p1

    .line 31
    add-float/2addr v7, v5

    .line 32
    float-to-int v5, v7

    .line 33
    .line 34
    aput v5, v6, v2

    .line 35
    .line 36
    if-gez v5, :cond_1

    .line 37
    .line 38
    aput v1, v6, v2

    .line 39
    .line 40
    :cond_1
    aget v5, v6, v2

    .line 41
    .line 42
    if-le v5, v8, :cond_2

    .line 43
    .line 44
    aput v8, v6, v2

    .line 45
    .line 46
    :cond_2
    if-eqz v4, :cond_3

    .line 47
    .line 48
    aget v5, v6, v2

    .line 49
    .line 50
    if-ge v5, v8, :cond_3

    .line 51
    move v3, v1

    .line 52
    .line 53
    :cond_3
    if-nez v4, :cond_4

    .line 54
    .line 55
    aget v4, v6, v2

    .line 56
    .line 57
    if-lez v4, :cond_4

    .line 58
    move v3, v1

    .line 59
    .line 60
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 61
    goto :goto_0

    .line 62
    :cond_5
    return v3
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

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/f;->s:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/facebook/drawee/drawable/f;->s:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/f;->invalidateSelf()V

    .line 10
    :cond_0
    return-void
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

.method public setOnFadeListener(Lg5/g;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/drawee/drawable/f;->v:Lg5/g;

    .line 3
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
