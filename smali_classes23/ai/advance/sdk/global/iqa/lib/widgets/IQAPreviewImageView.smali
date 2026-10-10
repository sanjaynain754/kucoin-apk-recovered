.class public Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public b:Landroid/graphics/RectF;

.field public final c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Bitmap;

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 11
    const/4 p2, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 15
    .line 16
    const-string p2, "#ffff33"

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 20
    move-result p2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

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
.end method


# virtual methods
.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->d:Landroid/graphics/Bitmap;

    .line 3
    return-object v0
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12

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
    .line 11
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->b:Landroid/graphics/RectF;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 18
    int-to-float v3, v0

    .line 19
    .line 20
    .line 21
    const v4, 0x3ba3d70a    # 0.005f

    .line 22
    mul-float/2addr v4, v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    .line 27
    new-instance v2, Landroid/graphics/RectF;

    .line 28
    .line 29
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->b:Landroid/graphics/RectF;

    .line 30
    .line 31
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 32
    mul-float/2addr v5, v3

    .line 33
    int-to-float v6, v1

    .line 34
    .line 35
    iget v7, v4, Landroid/graphics/RectF;->top:F

    .line 36
    mul-float/2addr v7, v6

    .line 37
    .line 38
    iget v8, v4, Landroid/graphics/RectF;->right:F

    .line 39
    mul-float/2addr v3, v8

    .line 40
    .line 41
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 42
    mul-float/2addr v6, v4

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v5, v7, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 46
    .line 47
    iget-object v3, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 51
    move-result v3

    .line 52
    .line 53
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 57
    move-result v4

    .line 58
    .line 59
    iget-object v5, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 63
    .line 64
    :cond_0
    iget v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->e:I

    .line 65
    const/4 v3, 0x1

    .line 66
    .line 67
    if-ne v2, v3, :cond_1

    .line 68
    int-to-float v10, v1

    .line 69
    .line 70
    iget-object v11, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    move-object v6, p1

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    :cond_1
    iget v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->f:I

    .line 80
    .line 81
    if-ne v2, v3, :cond_2

    .line 82
    int-to-float v9, v0

    .line 83
    .line 84
    iget-object v11, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    move-object v6, p1

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 92
    .line 93
    :cond_2
    iget v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->h:I

    .line 94
    .line 95
    if-ne v2, v3, :cond_3

    .line 96
    int-to-float v8, v1

    .line 97
    int-to-float v9, v0

    .line 98
    .line 99
    iget-object v11, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 100
    const/4 v7, 0x0

    .line 101
    move v10, v8

    .line 102
    move-object v6, p1

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 106
    .line 107
    :cond_3
    iget v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->g:I

    .line 108
    .line 109
    if-ne v2, v3, :cond_4

    .line 110
    int-to-float v7, v0

    .line 111
    int-to-float v10, v1

    .line 112
    .line 113
    iget-object v11, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->c:Landroid/graphics/Paint;

    .line 114
    const/4 v8, 0x0

    .line 115
    move v9, v7

    .line 116
    move-object v6, p1

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 120
    :cond_4
    return-void
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

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->d:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->d:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 24
    return-void

    .line 25
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 29
    .line 30
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->d:Landroid/graphics/Bitmap;

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
    .line 78
.end method

.method public setPointRect(Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/IQAPreviewImageView;->b:Landroid/graphics/RectF;

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
