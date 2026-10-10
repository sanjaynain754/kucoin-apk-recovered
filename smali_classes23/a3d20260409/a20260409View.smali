.class La3d20260409/a20260409View;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/RectF;

.field public e:F

.field public f:F

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:Landroid/animation/TimeInterpolator;

.field public l:Ljava/lang/Long;

.field public m:Landroid/graphics/Path;

.field public n:Landroid/graphics/RectF;

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    const/16 p1, -0x7d

    .line 6
    .line 7
    iput p1, p0, La3d20260409/a20260409View;->o:I

    .line 8
    .line 9
    const/16 p1, 0xff

    .line 10
    .line 11
    iput p1, p0, La3d20260409/a20260409View;->q:I

    .line 12
    .line 13
    new-instance p1, Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 17
    .line 18
    iput-object p1, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    .line 24
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    const/4 v2, -0x1

    .line 29
    .line 30
    iput v2, p0, La3d20260409/a20260409View;->h:I

    .line 31
    .line 32
    const-string v2, "#F5F5F5"

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 36
    move-result v2

    .line 37
    .line 38
    iput v2, p0, La3d20260409/a20260409View;->j:I

    .line 39
    .line 40
    const-string v2, "#5BC413"

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 44
    move-result v2

    .line 45
    .line 46
    iput v2, p0, La3d20260409/a20260409View;->i:I

    .line 47
    .line 48
    iget v2, p0, La3d20260409/a20260409View;->j:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 52
    .line 53
    new-instance p1, Landroid/graphics/Paint;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 57
    .line 58
    iput-object p1, p0, La3d20260409/a20260409View;->c:Landroid/graphics/Paint;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    .line 66
    iget v0, p0, La3d20260409/a20260409View;->i:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    .line 71
    .line 72
    const p1, 0x3e8ccccd    # 0.275f

    .line 73
    .line 74
    iput p1, p0, La3d20260409/a20260409View;->f:F

    .line 75
    .line 76
    .line 77
    const p1, 0x3f39999a    # 0.725f

    .line 78
    .line 79
    iput p1, p0, La3d20260409/a20260409View;->e:F

    .line 80
    .line 81
    .line 82
    const p1, 0x3f4ccccd    # 0.8f

    .line 83
    .line 84
    iput p1, p0, La3d20260409/a20260409View;->g:F

    .line 85
    return-void
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
.end method

.method public static synthetic g(La3d20260409/a20260409View;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, La3d20260409/a20260409View;->r:Z

    .line 3
    return p1
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
.end method


# virtual methods
.method public O0OOOoOooo(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->i:I

    .line 3
    .line 4
    iget-object v0, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    iget-object v0, p0, La3d20260409/a20260409View;->c:Landroid/graphics/Paint;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public OOOoooooo(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->j:I

    .line 3
    .line 4
    iget-object v0, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
    .line 24
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    move-result v1

    .line 9
    .line 10
    iget-object v2, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 11
    int-to-float v0, v0

    .line 12
    .line 13
    .line 14
    const v3, 0x3c54fdf4    # 0.013f

    .line 15
    mul-float/2addr v3, v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 19
    .line 20
    iget v2, p0, La3d20260409/a20260409View;->e:F

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    cmpl-float v2, v2, v3

    .line 24
    .line 25
    if-lez v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, La3d20260409/a20260409View;->d:Landroid/graphics/RectF;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 35
    .line 36
    iput-object v2, p0, La3d20260409/a20260409View;->d:Landroid/graphics/RectF;

    .line 37
    .line 38
    :cond_0
    iget-object v2, p0, La3d20260409/a20260409View;->d:Landroid/graphics/RectF;

    .line 39
    .line 40
    iget v3, p0, La3d20260409/a20260409View;->f:F

    .line 41
    mul-float/2addr v3, v0

    .line 42
    .line 43
    iput v3, v2, Landroid/graphics/RectF;->left:F

    .line 44
    .line 45
    iget v3, p0, La3d20260409/a20260409View;->e:F

    .line 46
    mul-float/2addr v3, v0

    .line 47
    .line 48
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 49
    int-to-float v1, v1

    .line 50
    .line 51
    iget v3, p0, La3d20260409/a20260409View;->g:F

    .line 52
    .line 53
    const/high16 v4, 0x3f800000    # 1.0f

    .line 54
    .line 55
    sub-float v5, v4, v3

    .line 56
    mul-float/2addr v5, v1

    .line 57
    .line 58
    iput v5, v2, Landroid/graphics/RectF;->top:F

    .line 59
    mul-float/2addr v3, v1

    .line 60
    .line 61
    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 62
    .line 63
    iget-object v2, p0, La3d20260409/a20260409View;->s:Landroid/graphics/Path;

    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    new-instance v2, Landroid/graphics/Path;

    .line 68
    .line 69
    .line 70
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 71
    .line 72
    iput-object v2, p0, La3d20260409/a20260409View;->s:Landroid/graphics/Path;

    .line 73
    .line 74
    :cond_1
    iget-object v2, p0, La3d20260409/a20260409View;->s:Landroid/graphics/Path;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 78
    .line 79
    iget-object v2, p0, La3d20260409/a20260409View;->s:Landroid/graphics/Path;

    .line 80
    .line 81
    iget-object v3, p0, La3d20260409/a20260409View;->d:Landroid/graphics/RectF;

    .line 82
    .line 83
    sget-object v5, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 90
    .line 91
    iget-object v2, p0, La3d20260409/a20260409View;->s:Landroid/graphics/Path;

    .line 92
    .line 93
    sget-object v3, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 97
    .line 98
    iget v2, p0, La3d20260409/a20260409View;->h:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 105
    .line 106
    iget-object v2, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 110
    move-result v2

    .line 111
    .line 112
    const/high16 v3, 0x40000000    # 2.0f

    .line 113
    div-float/2addr v2, v3

    .line 114
    .line 115
    iget-object v3, p0, La3d20260409/a20260409View;->d:Landroid/graphics/RectF;

    .line 116
    .line 117
    iget v5, v3, Landroid/graphics/RectF;->left:F

    .line 118
    add-float/2addr v5, v2

    .line 119
    .line 120
    iput v5, v3, Landroid/graphics/RectF;->left:F

    .line 121
    .line 122
    iget v5, p0, La3d20260409/a20260409View;->e:F

    .line 123
    mul-float/2addr v0, v5

    .line 124
    sub-float/2addr v0, v2

    .line 125
    .line 126
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 127
    .line 128
    iget v0, p0, La3d20260409/a20260409View;->g:F

    .line 129
    sub-float/2addr v4, v0

    .line 130
    mul-float/2addr v4, v1

    .line 131
    add-float/2addr v4, v2

    .line 132
    .line 133
    iput v4, v3, Landroid/graphics/RectF;->top:F

    .line 134
    mul-float/2addr v1, v0

    .line 135
    sub-float/2addr v1, v2

    .line 136
    .line 137
    iput v1, v3, Landroid/graphics/RectF;->bottom:F

    .line 138
    .line 139
    iget-object v0, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 143
    :cond_2
    return-void
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
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "{\"ellipseXMin\":0.275,\"ellipseXMax\":0.725,\"ellipseYMax\":0.8}"

    .line 4
    return-object v0
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

.method public c(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->h:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
    .line 24
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/a20260409View;->c:Landroid/graphics/Paint;

    .line 3
    .line 4
    iget-object v1, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 12
    .line 13
    iget-object v0, p0, La3d20260409/a20260409View;->c:Landroid/graphics/Paint;

    .line 14
    .line 15
    iget v1, p0, La3d20260409/a20260409View;->q:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 19
    .line 20
    iget-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroid/graphics/Path;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance v0, Landroid/graphics/Path;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 42
    .line 43
    iget-object v0, p0, La3d20260409/a20260409View;->n:Landroid/graphics/RectF;

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 51
    .line 52
    iput-object v0, p0, La3d20260409/a20260409View;->n:Landroid/graphics/RectF;

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 56
    move-result v0

    .line 57
    int-to-float v0, v0

    .line 58
    .line 59
    .line 60
    const v1, 0x3cf5c28f    # 0.03f

    .line 61
    mul-float/2addr v0, v1

    .line 62
    .line 63
    iget-object v1, p0, La3d20260409/a20260409View;->n:Landroid/graphics/RectF;

    .line 64
    .line 65
    iget-object v2, p0, La3d20260409/a20260409View;->d:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 68
    add-float/2addr v3, v0

    .line 69
    .line 70
    iput v3, v1, Landroid/graphics/RectF;->left:F

    .line 71
    .line 72
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 73
    sub-float/2addr v3, v0

    .line 74
    .line 75
    iput v3, v1, Landroid/graphics/RectF;->right:F

    .line 76
    .line 77
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 78
    add-float/2addr v3, v0

    .line 79
    .line 80
    iput v3, v1, Landroid/graphics/RectF;->top:F

    .line 81
    .line 82
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 83
    sub-float/2addr v2, v0

    .line 84
    .line 85
    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    .line 86
    .line 87
    iget-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 88
    .line 89
    iget v2, p0, La3d20260409/a20260409View;->o:I

    .line 90
    int-to-float v2, v2

    .line 91
    .line 92
    iget v3, p0, La3d20260409/a20260409View;->p:I

    .line 93
    int-to-float v3, v3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 97
    .line 98
    iget-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 99
    .line 100
    iget-object v1, p0, La3d20260409/a20260409View;->n:Landroid/graphics/RectF;

    .line 101
    .line 102
    iget v2, p0, La3d20260409/a20260409View;->o:I

    .line 103
    .line 104
    add-int/lit16 v2, v2, 0xb4

    .line 105
    int-to-float v2, v2

    .line 106
    .line 107
    iget v3, p0, La3d20260409/a20260409View;->p:I

    .line 108
    int-to-float v3, v3

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 112
    .line 113
    iget-object v0, p0, La3d20260409/a20260409View;->m:Landroid/graphics/Path;

    .line 114
    .line 115
    iget-object v1, p0, La3d20260409/a20260409View;->c:Landroid/graphics/Paint;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 119
    return-void
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
.end method

.method public e(Lintl/o0oOOOOOooooo;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lintl/o0oOOOOOooooo;->OOOOOoooooooO:Lintl/o0oOOOOOooooo;

    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Lintl/o0oOOOOOooooo;->OOOOOoooo:Lintl/o0oOOOOOooooo;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 13
    .line 14
    :goto_1
    if-eqz p1, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La3d20260409/a20260409View;->i()V

    .line 18
    .line 19
    :cond_2
    iget-object v0, p0, La3d20260409/a20260409View;->b:Landroid/graphics/Paint;

    .line 20
    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    iget p1, p0, La3d20260409/a20260409View;->i:I

    .line 24
    goto :goto_2

    .line 25
    .line 26
    :cond_3
    iget p1, p0, La3d20260409/a20260409View;->j:I

    .line 27
    .line 28
    .line 29
    :goto_2
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
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
.end method

.method public f(Ljava/lang/String;)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    .line 5
    const-string v3, "ellipseYMax"

    .line 6
    .line 7
    const-string v4, "ellipseXMin"

    .line 8
    .line 9
    const-string v5, "ellipseXMax"

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/high16 p1, -0x40800000    # -1.0f

    .line 14
    .line 15
    iput p1, p0, La3d20260409/a20260409View;->g:F

    .line 16
    .line 17
    iput p1, p0, La3d20260409/a20260409View;->f:F

    .line 18
    .line 19
    iput p1, p0, La3d20260409/a20260409View;->e:F

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 29
    move-result-wide v7

    .line 30
    double-to-float p1, v7

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 34
    move-result-wide v7

    .line 35
    double-to-float v7, v7

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 39
    move-result-wide v8

    .line 40
    double-to-float v6, v8

    .line 41
    .line 42
    iget v8, p0, La3d20260409/a20260409View;->f:F

    .line 43
    .line 44
    sub-float v8, v7, v8

    .line 45
    .line 46
    .line 47
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 48
    move-result v8

    .line 49
    float-to-double v8, v8

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const-wide v10, 0x3f9eb851eb851eb8L    # 0.03

    .line 55
    .line 56
    cmpl-double v8, v8, v10

    .line 57
    .line 58
    if-lez v8, :cond_3

    .line 59
    .line 60
    iget v8, p0, La3d20260409/a20260409View;->f:F

    .line 61
    .line 62
    new-array v9, v2, [F

    .line 63
    .line 64
    aput v8, v9, v1

    .line 65
    .line 66
    aput v7, v9, v0

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v4, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    iget v7, p0, La3d20260409/a20260409View;->e:F

    .line 73
    .line 74
    new-array v8, v2, [F

    .line 75
    .line 76
    aput v7, v8, v1

    .line 77
    .line 78
    aput p1, v8, v0

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v5, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    iget v5, p0, La3d20260409/a20260409View;->g:F

    .line 85
    .line 86
    new-array v7, v2, [F

    .line 87
    .line 88
    aput v5, v7, v1

    .line 89
    .line 90
    aput v6, v7, v0

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v3, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    new-instance v5, Landroid/animation/AnimatorSet;

    .line 97
    .line 98
    .line 99
    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 100
    .line 101
    iget-object v6, p0, La3d20260409/a20260409View;->l:Ljava/lang/Long;

    .line 102
    .line 103
    if-nez v6, :cond_1

    .line 104
    .line 105
    const-wide/16 v6, 0x12c

    .line 106
    goto :goto_0

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 110
    move-result-wide v6

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {v5, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 114
    .line 115
    iget-object v6, p0, La3d20260409/a20260409View;->k:Landroid/animation/TimeInterpolator;

    .line 116
    .line 117
    if-nez v6, :cond_2

    .line 118
    .line 119
    new-instance v6, Landroid/view/animation/AccelerateInterpolator;

    .line 120
    .line 121
    .line 122
    invoke-direct {v6}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 123
    .line 124
    .line 125
    :cond_2
    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 126
    const/4 v6, 0x3

    .line 127
    .line 128
    new-array v6, v6, [Landroid/animation/Animator;

    .line 129
    .line 130
    aput-object v4, v6, v1

    .line 131
    .line 132
    aput-object p1, v6, v0

    .line 133
    .line 134
    aput-object v3, v6, v2

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    :catch_0
    :cond_3
    return-void
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
.end method

.method public h()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/a20260409View;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, La3d20260409/a20260409View;->f(Ljava/lang/String;)V

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
    .line 19
    .line 20
.end method

.method public final i()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    iget-boolean v2, p0, La3d20260409/a20260409View;->r:Z

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iput-boolean v1, p0, La3d20260409/a20260409View;->r:Z

    .line 10
    .line 11
    iget v2, p0, La3d20260409/a20260409View;->o:I

    .line 12
    .line 13
    add-int/lit16 v3, v2, 0xb4

    .line 14
    .line 15
    .line 16
    filled-new-array {v2, v3}, [I

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    const-string/jumbo v3, "startAngle"

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v3, v2}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    const/16 v3, 0x96

    .line 27
    .line 28
    .line 29
    filled-new-array {v0, v3}, [I

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "swipeAngle"

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v5, v4}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    iget v5, p0, La3d20260409/a20260409View;->q:I

    .line 40
    .line 41
    .line 42
    const-string/jumbo v6, "lineSegmentAlpha"

    .line 43
    .line 44
    const/16 v7, 0xff

    .line 45
    .line 46
    if-nez v5, :cond_1

    .line 47
    .line 48
    .line 49
    filled-new-array {v3, v7, v0}, [I

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v6, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 54
    move-result-object v3

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_1
    const/16 v3, 0xc8

    .line 58
    .line 59
    .line 60
    filled-new-array {v7, v3, v0}, [I

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v6, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    :goto_0
    new-instance v5, Landroid/animation/AnimatorSet;

    .line 68
    .line 69
    .line 70
    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 71
    .line 72
    const-wide/16 v6, 0x5dc

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 76
    .line 77
    new-instance v6, Landroid/view/animation/DecelerateInterpolator;

    .line 78
    .line 79
    .line 80
    invoke-direct {v6}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 84
    .line 85
    new-instance v6, La3d20260409/a20260409View$a;

    .line 86
    .line 87
    .line 88
    invoke-direct {v6, p0}, La3d20260409/a20260409View$a;-><init>(La3d20260409/a20260409View;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 92
    const/4 v6, 0x3

    .line 93
    .line 94
    new-array v6, v6, [Landroid/animation/Animator;

    .line 95
    .line 96
    aput-object v2, v6, v0

    .line 97
    .line 98
    aput-object v4, v6, v1

    .line 99
    const/4 v0, 0x2

    .line 100
    .line 101
    aput-object v3, v6, v0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 108
    return-void
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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, La3d20260409/a20260409View;->a(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, La3d20260409/a20260409View;->d(Landroid/graphics/Canvas;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEllipseXMax(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->e:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
    .line 24
.end method

.method public setEllipseXMin(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->f:F

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
    .line 24
.end method

.method public setEllipseYMax(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->g:F

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
    .line 24
.end method

.method public setLineSegmentAlpha(I)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->q:I

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
    .line 24
.end method

.method public setStartAngle(I)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->o:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
    .line 24
.end method

.method public setSwipeAngle(I)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, La3d20260409/a20260409View;->p:I

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
    .line 24
.end method
