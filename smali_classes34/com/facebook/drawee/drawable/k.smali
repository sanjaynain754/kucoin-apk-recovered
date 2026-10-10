.class public Lcom/facebook/drawee/drawable/k;
.super Lcom/facebook/drawee/drawable/m;
.source "RoundedBitmapDrawable.java"


# static fields
.field public static K:Z


# instance fields
.field public final E:Landroid/graphics/Paint;

.field public final F:Landroid/graphics/Paint;

.field public final G:Landroid/graphics/Bitmap;

.field public H:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public I:Z

.field public J:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public constructor <init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Landroid/graphics/Paint;Z)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/facebook/drawee/drawable/m;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    new-instance p1, Landroid/graphics/Paint;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/Paint;

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/drawee/drawable/k;->F:Landroid/graphics/Paint;

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    iput-object v2, p0, Lcom/facebook/drawee/drawable/k;->J:Landroid/graphics/RectF;

    .line 27
    .line 28
    iput-object p2, p0, Lcom/facebook/drawee/drawable/k;->G:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 37
    .line 38
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    iput-boolean p4, p0, Lcom/facebook/drawee/drawable/k;->I:Z

    .line 44
    return-void
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
.end method

.method public static n()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/facebook/drawee/drawable/k;->K:Z

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


# virtual methods
.method public d(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/drawee/drawable/k;->I:Z

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

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

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
    const-string v0, "RoundedBitmapDrawable#draw"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/k;->k()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/m;->draw(Landroid/graphics/Canvas;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ld6/b;->d()Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ld6/b;->b()V

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/k;->m()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/m;->l()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/k;->o()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 43
    move-result v0

    .line 44
    .line 45
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->v:Landroid/graphics/Matrix;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    iget-boolean v1, p0, Lcom/facebook/drawee/drawable/k;->I:Z

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lcom/facebook/drawee/drawable/k;->J:Landroid/graphics/RectF;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 60
    move-result v1

    .line 61
    .line 62
    iget-object v2, p0, Lcom/facebook/drawee/drawable/k;->J:Landroid/graphics/RectF;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 66
    .line 67
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 68
    .line 69
    iget-object v3, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_2
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->f:Landroid/graphics/Path;

    .line 79
    .line 80
    iget-object v2, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 84
    .line 85
    :goto_0
    iget v1, p0, Lcom/facebook/drawee/drawable/m;->e:F

    .line 86
    const/4 v2, 0x0

    .line 87
    .line 88
    cmpl-float v2, v1, v2

    .line 89
    .line 90
    if-lez v2, :cond_3

    .line 91
    .line 92
    iget-object v2, p0, Lcom/facebook/drawee/drawable/k;->F:Landroid/graphics/Paint;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 96
    .line 97
    iget-object v1, p0, Lcom/facebook/drawee/drawable/k;->F:Landroid/graphics/Paint;

    .line 98
    .line 99
    iget v2, p0, Lcom/facebook/drawee/drawable/m;->h:I

    .line 100
    .line 101
    iget-object v3, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    .line 105
    move-result v3

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v3}, Lcom/facebook/drawee/drawable/e;->c(II)I

    .line 109
    move-result v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->i:Landroid/graphics/Path;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/facebook/drawee/drawable/k;->F:Landroid/graphics/Paint;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Ld6/b;->d()Z

    .line 126
    move-result p1

    .line 127
    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ld6/b;->b()V

    .line 132
    :cond_4
    return-void
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

.method public k()Z
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/facebook/drawee/drawable/m;->k()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->G:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public m()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/facebook/drawee/drawable/m;->m()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/k;->I:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->J:Landroid/graphics/RectF;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/facebook/drawee/drawable/k;->J:Landroid/graphics/RectF;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/drawable/m;->y:Landroid/graphics/Matrix;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/facebook/drawee/drawable/k;->J:Landroid/graphics/RectF;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/drawee/drawable/m;->o:Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 28
    :cond_1
    return-void
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

.method public final o()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->H:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/drawee/drawable/k;->G:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/drawee/drawable/k;->G:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/facebook/drawee/drawable/k;->H:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->G:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 28
    .line 29
    new-instance v1, Landroid/graphics/BitmapShader;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/facebook/drawee/drawable/k;->G:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v2, v3, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 40
    const/4 v0, 0x1

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->g:Z

    .line 43
    .line 44
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->g:Z

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-object v1, p0, Lcom/facebook/drawee/drawable/m;->y:Landroid/graphics/Matrix;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 60
    const/4 v0, 0x0

    .line 61
    .line 62
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/m;->g:Z

    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/m;->i()Z

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/m;->setAlpha(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 17
    .line 18
    .line 19
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/m;->setAlpha(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/facebook/drawee/drawable/m;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/k;->E:Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

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
