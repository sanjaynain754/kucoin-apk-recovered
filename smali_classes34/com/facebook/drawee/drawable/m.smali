.class public abstract Lcom/facebook/drawee/drawable/m;
.super Landroid/graphics/drawable/Drawable;
.source "RoundedDrawable.java"

# interfaces
.implements Lcom/facebook/drawee/drawable/j;
.implements Lcom/facebook/drawee/drawable/d0;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Lcom/facebook/drawee/drawable/e0;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final b:Landroid/graphics/drawable/Drawable;

.field public c:Z

.field public d:Z

.field public e:F

.field public final f:Landroid/graphics/Path;

.field public g:Z

.field public h:I

.field public final i:Landroid/graphics/Path;

.field public final j:[F

.field public final k:[F
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public l:[F
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final m:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final n:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final o:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final p:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public q:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final r:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final s:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final t:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final u:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final v:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public w:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public x:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public final y:Landroid/graphics/Matrix;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public z:F


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->c:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    iput v1, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 12
    .line 13
    new-instance v2, Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 17
    .line 18
    iput-object v2, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    iput-boolean v2, p0, Lcom/facebook/drawee/drawable/m;->g:Z

    .line 22
    .line 23
    iput v0, p0, Lcom/facebook/drawee/drawable/m;->h:I

    .line 24
    .line 25
    new-instance v3, Landroid/graphics/Path;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 29
    .line 30
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->i:Landroid/graphics/Path;

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    new-array v4, v3, [F

    .line 35
    .line 36
    iput-object v4, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 37
    .line 38
    new-array v3, v3, [F

    .line 39
    .line 40
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->k:[F

    .line 41
    .line 42
    new-instance v3, Landroid/graphics/RectF;

    .line 43
    .line 44
    .line 45
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 48
    .line 49
    new-instance v3, Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->n:Landroid/graphics/RectF;

    .line 55
    .line 56
    new-instance v3, Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 60
    .line 61
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->o:Landroid/graphics/RectF;

    .line 62
    .line 63
    new-instance v3, Landroid/graphics/RectF;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 67
    .line 68
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->p:Landroid/graphics/RectF;

    .line 69
    .line 70
    new-instance v3, Landroid/graphics/Matrix;

    .line 71
    .line 72
    .line 73
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 74
    .line 75
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->r:Landroid/graphics/Matrix;

    .line 76
    .line 77
    new-instance v3, Landroid/graphics/Matrix;

    .line 78
    .line 79
    .line 80
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 81
    .line 82
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->s:Landroid/graphics/Matrix;

    .line 83
    .line 84
    new-instance v3, Landroid/graphics/Matrix;

    .line 85
    .line 86
    .line 87
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 88
    .line 89
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 90
    .line 91
    new-instance v3, Landroid/graphics/Matrix;

    .line 92
    .line 93
    .line 94
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 95
    .line 96
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->u:Landroid/graphics/Matrix;

    .line 97
    .line 98
    new-instance v3, Landroid/graphics/Matrix;

    .line 99
    .line 100
    .line 101
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 102
    .line 103
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->v:Landroid/graphics/Matrix;

    .line 104
    .line 105
    new-instance v3, Landroid/graphics/Matrix;

    .line 106
    .line 107
    .line 108
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 109
    .line 110
    iput-object v3, p0, Lcom/facebook/drawee/drawable/m;->y:Landroid/graphics/Matrix;

    .line 111
    .line 112
    iput v1, p0, Lcom/facebook/drawee/drawable/m;->z:F

    .line 113
    .line 114
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 115
    .line 116
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->B:Z

    .line 117
    .line 118
    iput-boolean v2, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 119
    .line 120
    iput-object p1, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 121
    return-void
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
.end method

.method public static g(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1
    .param p0    # Landroid/graphics/Matrix;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static j(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z
    .locals 0
    .param p0    # Landroid/graphics/Matrix;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    .line 8
    :cond_0
    if-eqz p0, :cond_2

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0, p1}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
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
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->c:Z

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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

.method public b(F)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/m;->z:F

    .line 3
    .line 4
    cmpl-float v0, v0, p1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/facebook/drawee/drawable/m;->z:F

    .line 9
    const/4 p1, 0x1

    .line 10
    .line 11
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public c(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    move v3, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v3, v1

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v3}, Lw3/h;->i(Z)V

    .line 14
    .line 15
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 16
    .line 17
    .line 18
    invoke-static {v3, p1}, Ljava/util/Arrays;->fill([FF)V

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    move v1, v2

    .line 22
    .line 23
    :cond_1
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 24
    .line 25
    iput-boolean v2, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 29
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
.end method

.method public clearColorFilter()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

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
.end method

.method public d(Z)V
    .locals 0

    .line 1
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "RoundedDrawable#draw"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ld6/b;->d()Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ld6/b;->b()V

    .line 26
    :cond_1
    return-void
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

.method public e(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->B:Z

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->B:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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

.method public f(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 7
    const/4 p1, 0x1

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    :cond_0
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

.method public getAlpha()I
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x13
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

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

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

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

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

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

.method public getOpacity()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

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

.method public h([F)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([FF)V

    .line 11
    .line 12
    iput-boolean v2, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 13
    goto :goto_3

    .line 14
    :cond_0
    array-length v3, p1

    .line 15
    .line 16
    const/16 v4, 0x8

    .line 17
    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    move v3, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v3, v2

    .line 22
    .line 23
    .line 24
    :goto_0
    const-string/jumbo v5, "radii should have exactly 8 values"

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v5}, Lw3/h;->c(ZLjava/lang/Object;)V

    .line 28
    .line 29
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    iput-boolean v2, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 35
    move v3, v2

    .line 36
    .line 37
    :goto_1
    if-ge v3, v4, :cond_3

    .line 38
    .line 39
    iget-boolean v5, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 40
    .line 41
    aget v6, p1, v3

    .line 42
    .line 43
    cmpl-float v6, v6, v0

    .line 44
    .line 45
    if-lez v6, :cond_2

    .line 46
    move v6, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v6, v2

    .line 49
    :goto_2
    or-int/2addr v5, v6

    .line 50
    .line 51
    iput-boolean v5, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_3
    :goto_3
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 60
    return-void
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

.method public i()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->B:Z

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

.method public k()Z
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 20
    return v0
    .line 21
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
    .line 76
    .line 77
.end method

.method public l()V
    .locals 8

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 3
    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->i:Landroid/graphics/Path;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 12
    .line 13
    iget v1, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 14
    .line 15
    const/high16 v2, 0x40000000    # 2.0f

    .line 16
    .line 17
    div-float v3, v1, v2

    .line 18
    div-float/2addr v1, v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->c:Z

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 32
    move-result v0

    .line 33
    .line 34
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 38
    move-result v3

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    .line 42
    move-result v0

    .line 43
    div-float/2addr v0, v2

    .line 44
    .line 45
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->i:Landroid/graphics/Path;

    .line 46
    .line 47
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    .line 51
    move-result v4

    .line 52
    .line 53
    iget-object v5, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    .line 57
    move-result v5

    .line 58
    .line 59
    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4, v5, v0, v6}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    move v0, v1

    .line 65
    .line 66
    :goto_0
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->k:[F

    .line 67
    array-length v4, v3

    .line 68
    .line 69
    if-ge v0, v4, :cond_1

    .line 70
    .line 71
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 72
    .line 73
    aget v4, v4, v0

    .line 74
    .line 75
    iget v5, p0, Lcom/facebook/drawee/drawable/m;->z:F

    .line 76
    add-float/2addr v4, v5

    .line 77
    .line 78
    iget v5, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 79
    div-float/2addr v5, v2

    .line 80
    sub-float/2addr v4, v5

    .line 81
    .line 82
    aput v4, v3, v0

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x1

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->i:Landroid/graphics/Path;

    .line 88
    .line 89
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 90
    .line 91
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4, v3, v5}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 95
    .line 96
    :goto_1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 97
    .line 98
    iget v3, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 99
    neg-float v4, v3

    .line 100
    div-float/2addr v4, v2

    .line 101
    neg-float v3, v3

    .line 102
    div-float/2addr v3, v2

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v4, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 106
    .line 107
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 111
    .line 112
    iget v0, p0, Lcom/facebook/drawee/drawable/m;->z:F

    .line 113
    .line 114
    iget-boolean v3, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 115
    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    iget v3, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    const/4 v3, 0x0

    .line 121
    :goto_2
    add-float/2addr v0, v3

    .line 122
    .line 123
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 127
    .line 128
    iget-boolean v3, p0, Lcom/facebook/drawee/drawable/m;->c:Z

    .line 129
    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 133
    .line 134
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    .line 138
    move-result v4

    .line 139
    .line 140
    iget-object v5, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    .line 144
    move-result v5

    .line 145
    .line 146
    iget-object v6, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 150
    move-result v6

    .line 151
    .line 152
    iget-object v7, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    .line 156
    move-result v7

    .line 157
    .line 158
    .line 159
    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    .line 160
    move-result v6

    .line 161
    div-float/2addr v6, v2

    .line 162
    .line 163
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v4, v5, v6, v2}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 167
    goto :goto_4

    .line 168
    .line 169
    :cond_3
    iget-boolean v2, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 170
    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->l:[F

    .line 174
    .line 175
    if-nez v2, :cond_4

    .line 176
    .line 177
    const/16 v2, 0x8

    .line 178
    .line 179
    new-array v2, v2, [F

    .line 180
    .line 181
    iput-object v2, p0, Lcom/facebook/drawee/drawable/m;->l:[F

    .line 182
    :cond_4
    move v2, v1

    .line 183
    .line 184
    :goto_3
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->k:[F

    .line 185
    array-length v3, v3

    .line 186
    .line 187
    if-ge v2, v3, :cond_5

    .line 188
    .line 189
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->l:[F

    .line 190
    .line 191
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 192
    .line 193
    aget v4, v4, v2

    .line 194
    .line 195
    iget v5, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 196
    sub-float/2addr v4, v5

    .line 197
    .line 198
    aput v4, v3, v2

    .line 199
    .line 200
    add-int/lit8 v2, v2, 0x1

    .line 201
    goto :goto_3

    .line 202
    .line 203
    :cond_5
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 204
    .line 205
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 206
    .line 207
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->l:[F

    .line 208
    .line 209
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v3, v4, v5}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 213
    goto :goto_4

    .line 214
    .line 215
    :cond_6
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 216
    .line 217
    iget-object v3, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 218
    .line 219
    iget-object v4, p0, Lcom/facebook/drawee/drawable/m;->j:[F

    .line 220
    .line 221
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v3, v4, v5}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 225
    .line 226
    :goto_4
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 227
    neg-float v0, v0

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 231
    .line 232
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 233
    .line 234
    sget-object v2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 238
    .line 239
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 240
    :cond_7
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
.end method

.method public m()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->D:Lcom/facebook/drawee/drawable/e0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/facebook/drawee/drawable/e0;->getTransform(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->D:Lcom/facebook/drawee/drawable/e0;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lcom/facebook/drawee/drawable/e0;->getRootBounds(Landroid/graphics/RectF;)V

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 32
    .line 33
    :goto_0
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->o:Landroid/graphics/RectF;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/m;->getIntrinsicWidth()I

    .line 37
    move-result v1

    .line 38
    int-to-float v1, v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/m;->getIntrinsicHeight()I

    .line 42
    move-result v2

    .line 43
    int-to-float v2, v2

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 48
    .line 49
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->p:Landroid/graphics/RectF;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->r:Landroid/graphics/Matrix;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->o:Landroid/graphics/RectF;

    .line 63
    .line 64
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->p:Landroid/graphics/RectF;

    .line 65
    .line 66
    sget-object v3, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 70
    .line 71
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->q:Landroid/graphics/RectF;

    .line 76
    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    new-instance v0, Landroid/graphics/RectF;

    .line 80
    .line 81
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 82
    .line 83
    .line 84
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 85
    .line 86
    iput-object v0, p0, Lcom/facebook/drawee/drawable/m;->q:Landroid/graphics/RectF;

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_1
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 93
    .line 94
    :goto_1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->q:Landroid/graphics/RectF;

    .line 95
    .line 96
    iget v1, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 100
    .line 101
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 102
    .line 103
    if-nez v0, :cond_2

    .line 104
    .line 105
    new-instance v0, Landroid/graphics/Matrix;

    .line 106
    .line 107
    .line 108
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 109
    .line 110
    iput-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 111
    .line 112
    :cond_2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 113
    .line 114
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->q:Landroid/graphics/RectF;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 120
    goto :goto_2

    .line 121
    .line 122
    :cond_3
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 128
    .line 129
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 130
    .line 131
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->u:Landroid/graphics/Matrix;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    .line 135
    move-result v0

    .line 136
    const/4 v1, 0x1

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->r:Landroid/graphics/Matrix;

    .line 141
    .line 142
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->s:Landroid/graphics/Matrix;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    .line 146
    move-result v0

    .line 147
    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->x:Landroid/graphics/Matrix;

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v2}, Lcom/facebook/drawee/drawable/m;->j(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 158
    move-result v0

    .line 159
    .line 160
    if-nez v0, :cond_9

    .line 161
    .line 162
    :cond_5
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/m;->g:Z

    .line 163
    .line 164
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 165
    .line 166
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->v:Landroid/graphics/Matrix;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 170
    .line 171
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->y:Landroid/graphics/Matrix;

    .line 172
    .line 173
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 177
    .line 178
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 179
    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 183
    .line 184
    if-eqz v0, :cond_6

    .line 185
    .line 186
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->y:Landroid/graphics/Matrix;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 190
    .line 191
    :cond_6
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->y:Landroid/graphics/Matrix;

    .line 192
    .line 193
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->r:Landroid/graphics/Matrix;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 197
    .line 198
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->u:Landroid/graphics/Matrix;

    .line 199
    .line 200
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->t:Landroid/graphics/Matrix;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 204
    .line 205
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->s:Landroid/graphics/Matrix;

    .line 206
    .line 207
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->r:Landroid/graphics/Matrix;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 211
    .line 212
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->A:Z

    .line 213
    .line 214
    if-eqz v0, :cond_8

    .line 215
    .line 216
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->x:Landroid/graphics/Matrix;

    .line 217
    .line 218
    if-nez v0, :cond_7

    .line 219
    .line 220
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 221
    .line 222
    .line 223
    invoke-static {v0}, Lcom/facebook/drawee/drawable/m;->g(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 224
    move-result-object v0

    .line 225
    .line 226
    iput-object v0, p0, Lcom/facebook/drawee/drawable/m;->x:Landroid/graphics/Matrix;

    .line 227
    goto :goto_3

    .line 228
    .line 229
    :cond_7
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->w:Landroid/graphics/Matrix;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 233
    goto :goto_3

    .line 234
    .line 235
    :cond_8
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->x:Landroid/graphics/Matrix;

    .line 236
    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 241
    .line 242
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 243
    .line 244
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->n:Landroid/graphics/RectF;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->equals(Ljava/lang/Object;)Z

    .line 248
    move-result v0

    .line 249
    .line 250
    if-nez v0, :cond_a

    .line 251
    .line 252
    iput-boolean v1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 253
    .line 254
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->n:Landroid/graphics/RectF;

    .line 255
    .line 256
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->m:Landroid/graphics/RectF;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 260
    :cond_a
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

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

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

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

.method public setBorder(IF)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/drawee/drawable/m;->h:I

    .line 3
    .line 4
    if-ne v0, p1, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 7
    .line 8
    cmpl-float v0, v0, p2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    .line 14
    :cond_1
    :goto_0
    iput p1, p0, Lcom/facebook/drawee/drawable/m;->h:I

    .line 15
    .line 16
    iput p2, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 17
    const/4 p1, 0x1

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/m;->C:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    return-void
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
.end method

.method public setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1
    .param p1    # Landroid/graphics/ColorFilter;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setTransformCallback(Lcom/facebook/drawee/drawable/e0;)V
    .locals 0
    .param p1    # Lcom/facebook/drawee/drawable/e0;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/drawee/drawable/m;->D:Lcom/facebook/drawee/drawable/e0;

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
