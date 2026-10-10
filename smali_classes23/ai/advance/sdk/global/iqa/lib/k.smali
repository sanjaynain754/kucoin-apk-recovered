.class public Lai/advance/sdk/global/iqa/lib/k;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final b:Landroid/graphics/Paint;

.field public c:Ljava/lang/Integer;

.field public d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/RectF;

.field public f:I

.field public final g:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lai/advance/sdk/global/iqa/lib/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const-string p2, "#ff0000"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lai/advance/sdk/global/iqa/lib/k;->f:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x40000000    # 2.0f

    invoke-virtual {p0, p2}, Lai/advance/sdk/global/iqa/lib/k;->a(F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/k;->e:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final a(F)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    mul-float/2addr p1, v0

    .line 12
    float-to-int p1, p1

    .line 13
    return p1
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

.method public final b(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    .line 7
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 11
    move-result v1

    .line 12
    .line 13
    const/high16 v2, 0x40000000    # 2.0f

    .line 14
    div-float/2addr v1, v2

    .line 15
    sub-float/2addr v0, v1

    .line 16
    float-to-int v0, v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    .line 23
    iget-object v3, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 27
    move-result v3

    .line 28
    div-float/2addr v3, v2

    .line 29
    sub-float/2addr v1, v3

    .line 30
    float-to-int v1, v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 34
    move-result v3

    .line 35
    int-to-float v3, v3

    .line 36
    .line 37
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 41
    move-result v4

    .line 42
    div-float/2addr v4, v2

    .line 43
    add-float/2addr v3, v4

    .line 44
    float-to-int v3, v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 48
    move-result v4

    .line 49
    int-to-float v4, v4

    .line 50
    .line 51
    iget-object v5, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 55
    move-result v5

    .line 56
    div-float/2addr v5, v2

    .line 57
    add-float/2addr v4, v5

    .line 58
    float-to-int v2, v4

    .line 59
    .line 60
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/k;->e:Landroid/graphics/RectF;

    .line 61
    int-to-float v0, v0

    .line 62
    .line 63
    iput v0, v4, Landroid/graphics/RectF;->left:F

    .line 64
    int-to-float v5, v1

    .line 65
    .line 66
    iput v5, v4, Landroid/graphics/RectF;->top:F

    .line 67
    int-to-float v3, v3

    .line 68
    .line 69
    iput v3, v4, Landroid/graphics/RectF;->right:F

    .line 70
    int-to-float v6, v2

    .line 71
    .line 72
    iput v6, v4, Landroid/graphics/RectF;->bottom:F

    .line 73
    .line 74
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 78
    sub-int/2addr v2, v1

    .line 79
    int-to-float v1, v2

    .line 80
    .line 81
    .line 82
    const v2, 0x3dc08312    # 0.094f

    .line 83
    mul-float/2addr v1, v2

    .line 84
    .line 85
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 86
    .line 87
    add-float v4, v5, v1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 91
    .line 92
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v0, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 96
    .line 97
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 98
    .line 99
    add-float v7, v0, v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 103
    .line 104
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v7, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 108
    .line 109
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v0, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 113
    .line 114
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 115
    .line 116
    sub-float v7, v6, v1

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v0, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 120
    .line 121
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 125
    .line 126
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 130
    .line 131
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 132
    .line 133
    sub-float v2, v3, v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 137
    .line 138
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 142
    .line 143
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v3, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 147
    .line 148
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 152
    .line 153
    const/high16 v0, 0x40a00000    # 5.0f

    .line 154
    div-float/2addr v1, v0

    .line 155
    .line 156
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 160
    .line 161
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->g:Landroid/graphics/Path;

    .line 162
    .line 163
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 167
    .line 168
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 169
    .line 170
    const/high16 v1, 0x3f800000    # 1.0f

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v1}, Lai/advance/sdk/global/iqa/lib/k;->a(F)I

    .line 174
    move-result v1

    .line 175
    int-to-float v1, v1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 179
    .line 180
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->e:Landroid/graphics/RectF;

    .line 181
    .line 182
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 186
    return-void
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

.method public final c(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 14
    .line 15
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 16
    .line 17
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 18
    sub-float/2addr v1, v0

    .line 19
    .line 20
    .line 21
    const v0, 0x3dc08312    # 0.094f

    .line 22
    mul-float/2addr v1, v0

    .line 23
    .line 24
    const/high16 v0, 0x40a00000    # 5.0f

    .line 25
    div-float/2addr v1, v0

    .line 26
    .line 27
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 31
    .line 32
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 36
    move-result v1

    .line 37
    int-to-float v1, v1

    .line 38
    .line 39
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 43
    move-result v2

    .line 44
    .line 45
    const/high16 v3, 0x40000000    # 2.0f

    .line 46
    div-float/2addr v2, v3

    .line 47
    sub-float/2addr v1, v2

    .line 48
    float-to-int v1, v1

    .line 49
    int-to-float v1, v1

    .line 50
    .line 51
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 52
    .line 53
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 57
    move-result v1

    .line 58
    int-to-float v1, v1

    .line 59
    .line 60
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 64
    move-result v2

    .line 65
    div-float/2addr v2, v3

    .line 66
    sub-float/2addr v1, v2

    .line 67
    float-to-int v1, v1

    .line 68
    int-to-float v1, v1

    .line 69
    .line 70
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 71
    .line 72
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 76
    move-result v1

    .line 77
    int-to-float v1, v1

    .line 78
    .line 79
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 83
    move-result v2

    .line 84
    div-float/2addr v2, v3

    .line 85
    add-float/2addr v1, v2

    .line 86
    float-to-int v1, v1

    .line 87
    int-to-float v1, v1

    .line 88
    .line 89
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 90
    .line 91
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 95
    move-result v1

    .line 96
    int-to-float v1, v1

    .line 97
    .line 98
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 102
    move-result v2

    .line 103
    div-float/2addr v2, v3

    .line 104
    add-float/2addr v1, v2

    .line 105
    float-to-int v1, v1

    .line 106
    int-to-float v1, v1

    .line 107
    .line 108
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 109
    .line 110
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->d:Landroid/graphics/RectF;

    .line 111
    .line 112
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/k;->c:Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 116
    move-result v1

    .line 117
    int-to-float v1, v1

    .line 118
    .line 119
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/k;->c:Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 123
    move-result v2

    .line 124
    int-to-float v2, v2

    .line 125
    .line 126
    iget-object v3, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 130
    return-void
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

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->c:Ljava/lang/Integer;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lai/advance/sdk/global/iqa/lib/k;->b(Landroid/graphics/Canvas;)V

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lai/advance/sdk/global/iqa/lib/k;->c(Landroid/graphics/Canvas;)V

    .line 15
    return-void
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

.method public setCornerRadius(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/k;->c:Ljava/lang/Integer;

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

.method public setLineColor(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/k;->f:I

    .line 3
    .line 4
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/k;->b:Landroid/graphics/Paint;

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
