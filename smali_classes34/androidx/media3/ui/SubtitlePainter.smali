.class final Landroidx/media3/ui/SubtitlePainter;
.super Ljava/lang/Object;
.source "SubtitlePainter.java"


# static fields
.field private static final INNER_PADDING_RATIO:F = 0.125f

.field private static final TAG:Ljava/lang/String; = "SubtitlePainter"


# instance fields
.field private backgroundColor:I

.field private final bitmapPaint:Landroid/graphics/Paint;

.field private bitmapRect:Landroid/graphics/Rect;

.field private bottomPaddingFraction:F

.field private cueBitmap:Landroid/graphics/Bitmap;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private cueBitmapHeight:F

.field private cueLine:F

.field private cueLineAnchor:I

.field private cueLineType:I

.field private cuePosition:F

.field private cuePositionAnchor:I

.field private cueSize:F

.field private cueText:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private cueTextAlignment:Landroid/text/Layout$Alignment;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private cueTextSizePx:F

.field private defaultTextSizePx:F

.field private edgeColor:I

.field private edgeLayout:Landroid/text/StaticLayout;

.field private edgeType:I

.field private foregroundColor:I

.field private final outlineWidth:F

.field private parentBottom:I

.field private parentLeft:I

.field private parentRight:I

.field private parentTop:I

.field private final shadowOffset:F

.field private final shadowRadius:F

.field private final spacingAdd:F

.field private final spacingMult:F

.field private textLayout:Landroid/text/StaticLayout;

.field private textLeft:I

.field private textPaddingX:I

.field private final textPaint:Landroid/text/TextPaint;

.field private textTop:I

.field private windowColor:I

.field private final windowPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x1010217

    .line 7
    .line 8
    .line 9
    const v1, 0x1010218

    .line 10
    .line 11
    .line 12
    filled-new-array {v0, v1}, [I

    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1, v0, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 23
    move-result v1

    .line 24
    int-to-float v1, v1

    .line 25
    .line 26
    iput v1, p0, Landroidx/media3/ui/SubtitlePainter;->spacingAdd:F

    .line 27
    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    const/4 v2, 0x1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 33
    move-result v1

    .line 34
    .line 35
    iput v1, p0, Landroidx/media3/ui/SubtitlePainter;->spacingMult:F

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 49
    int-to-float p1, p1

    .line 50
    .line 51
    const/high16 v0, 0x40000000    # 2.0f

    .line 52
    mul-float/2addr p1, v0

    .line 53
    .line 54
    const/high16 v0, 0x43200000    # 160.0f

    .line 55
    div-float/2addr p1, v0

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 59
    move-result p1

    .line 60
    int-to-float p1, p1

    .line 61
    .line 62
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->outlineWidth:F

    .line 63
    .line 64
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->shadowRadius:F

    .line 65
    .line 66
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->shadowOffset:F

    .line 67
    .line 68
    new-instance p1, Landroid/text/TextPaint;

    .line 69
    .line 70
    .line 71
    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    .line 72
    .line 73
    iput-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 80
    .line 81
    new-instance p1, Landroid/graphics/Paint;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 85
    .line 86
    iput-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->windowPaint:Landroid/graphics/Paint;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 90
    .line 91
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    .line 96
    new-instance p1, Landroid/graphics/Paint;

    .line 97
    .line 98
    .line 99
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 100
    .line 101
    iput-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->bitmapPaint:Landroid/graphics/Paint;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

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
.end method

.method private static areCharSequencesEqual(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 0
    .param p0    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eq p0, p1, :cond_1

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result p0

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
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
.end method

.method private drawBitmapLayout(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmap:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/ui/SubtitlePainter;->bitmapRect:Landroid/graphics/Rect;

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->bitmapPaint:Landroid/graphics/Paint;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

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

.method private drawLayout(Landroid/graphics/Canvas;Z)V
    .locals 0

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroidx/media3/ui/SubtitlePainter;->drawTextLayout(Landroid/graphics/Canvas;)V

    .line 6
    return-void

    .line 7
    .line 8
    :cond_0
    iget-object p2, p0, Landroidx/media3/ui/SubtitlePainter;->bitmapRect:Landroid/graphics/Rect;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p2, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmap:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Landroidx/media3/ui/SubtitlePainter;->drawBitmapLayout(Landroid/graphics/Canvas;)V

    .line 20
    return-void
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

.method private drawTextLayout(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/ui/SubtitlePainter;->edgeLayout:Landroid/text/StaticLayout;

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 14
    move-result v2

    .line 15
    .line 16
    iget v3, p0, Landroidx/media3/ui/SubtitlePainter;->textLeft:I

    .line 17
    int-to-float v3, v3

    .line 18
    .line 19
    iget v4, p0, Landroidx/media3/ui/SubtitlePainter;->textTop:I

    .line 20
    int-to-float v4, v4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 24
    .line 25
    iget v3, p0, Landroidx/media3/ui/SubtitlePainter;->windowColor:I

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 29
    move-result v3

    .line 30
    .line 31
    if-lez v3, :cond_1

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/media3/ui/SubtitlePainter;->windowPaint:Landroid/graphics/Paint;

    .line 34
    .line 35
    iget v4, p0, Landroidx/media3/ui/SubtitlePainter;->windowColor:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    .line 40
    iget v3, p0, Landroidx/media3/ui/SubtitlePainter;->textPaddingX:I

    .line 41
    neg-int v3, v3

    .line 42
    int-to-float v5, v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 46
    move-result v3

    .line 47
    .line 48
    iget v4, p0, Landroidx/media3/ui/SubtitlePainter;->textPaddingX:I

    .line 49
    add-int/2addr v3, v4

    .line 50
    int-to-float v7, v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 54
    move-result v3

    .line 55
    int-to-float v8, v3

    .line 56
    .line 57
    iget-object v9, p0, Landroidx/media3/ui/SubtitlePainter;->windowPaint:Landroid/graphics/Paint;

    .line 58
    const/4 v6, 0x0

    .line 59
    move-object v4, p1

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v4, p1

    .line 65
    .line 66
    :goto_0
    iget p1, p0, Landroidx/media3/ui/SubtitlePainter;->edgeType:I

    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v5, 0x1

    .line 69
    .line 70
    if-ne p1, v5, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 73
    .line 74
    sget-object v5, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 80
    .line 81
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->outlineWidth:F

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 87
    .line 88
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->edgeColor:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    .line 93
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 94
    .line 95
    sget-object v5, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    const/4 v6, 0x2

    .line 104
    .line 105
    if-ne p1, v6, :cond_3

    .line 106
    .line 107
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 108
    .line 109
    iget v1, p0, Landroidx/media3/ui/SubtitlePainter;->shadowRadius:F

    .line 110
    .line 111
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->shadowOffset:F

    .line 112
    .line 113
    iget v6, p0, Landroidx/media3/ui/SubtitlePainter;->edgeColor:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1, v5, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 117
    goto :goto_3

    .line 118
    :cond_3
    const/4 v6, 0x3

    .line 119
    .line 120
    if-eq p1, v6, :cond_4

    .line 121
    const/4 v7, 0x4

    .line 122
    .line 123
    if-ne p1, v7, :cond_8

    .line 124
    .line 125
    :cond_4
    if-ne p1, v6, :cond_5

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    move v5, v3

    .line 128
    :goto_1
    const/4 p1, -0x1

    .line 129
    .line 130
    if-eqz v5, :cond_6

    .line 131
    move v6, p1

    .line 132
    goto :goto_2

    .line 133
    .line 134
    :cond_6
    iget v6, p0, Landroidx/media3/ui/SubtitlePainter;->edgeColor:I

    .line 135
    .line 136
    :goto_2
    if-eqz v5, :cond_7

    .line 137
    .line 138
    iget p1, p0, Landroidx/media3/ui/SubtitlePainter;->edgeColor:I

    .line 139
    .line 140
    :cond_7
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->shadowRadius:F

    .line 141
    .line 142
    const/high16 v7, 0x40000000    # 2.0f

    .line 143
    div-float/2addr v5, v7

    .line 144
    .line 145
    iget-object v7, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 146
    .line 147
    iget v8, p0, Landroidx/media3/ui/SubtitlePainter;->foregroundColor:I

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 151
    .line 152
    iget-object v7, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 153
    .line 154
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 158
    .line 159
    iget-object v7, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 160
    .line 161
    iget v8, p0, Landroidx/media3/ui/SubtitlePainter;->shadowRadius:F

    .line 162
    neg-float v9, v5

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v8, v9, v9, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 169
    .line 170
    iget-object v1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 171
    .line 172
    iget v6, p0, Landroidx/media3/ui/SubtitlePainter;->shadowRadius:F

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v6, v5, v5, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 176
    .line 177
    :cond_8
    :goto_3
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 178
    .line 179
    iget v1, p0, Landroidx/media3/ui/SubtitlePainter;->foregroundColor:I

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 183
    .line 184
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 185
    .line 186
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 193
    .line 194
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 195
    const/4 v0, 0x0

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v0, v0, v0, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 202
    :cond_9
    :goto_4
    return-void
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

.method private setupBitmapLayout()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmap:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/ui/SubtitlePainter;->parentRight:I

    .line 5
    .line 6
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->parentLeft:I

    .line 7
    sub-int/2addr v1, v2

    .line 8
    .line 9
    iget v3, p0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 10
    .line 11
    iget v4, p0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 12
    sub-int/2addr v3, v4

    .line 13
    int-to-float v2, v2

    .line 14
    int-to-float v1, v1

    .line 15
    .line 16
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->cuePosition:F

    .line 17
    mul-float/2addr v5, v1

    .line 18
    add-float/2addr v2, v5

    .line 19
    int-to-float v4, v4

    .line 20
    int-to-float v3, v3

    .line 21
    .line 22
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->cueLine:F

    .line 23
    mul-float/2addr v5, v3

    .line 24
    add-float/2addr v4, v5

    .line 25
    .line 26
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->cueSize:F

    .line 27
    mul-float/2addr v1, v5

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 31
    move-result v1

    .line 32
    .line 33
    iget v5, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmapHeight:F

    .line 34
    .line 35
    .line 36
    const v6, -0x800001

    .line 37
    .line 38
    cmpl-float v6, v5, v6

    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    mul-float/2addr v3, v5

    .line 42
    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    int-to-float v3, v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 51
    move-result v5

    .line 52
    int-to-float v5, v5

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    move-result v0

    .line 57
    int-to-float v0, v0

    .line 58
    div-float/2addr v5, v0

    .line 59
    mul-float/2addr v3, v5

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 63
    move-result v0

    .line 64
    .line 65
    :goto_0
    iget v3, p0, Landroidx/media3/ui/SubtitlePainter;->cuePositionAnchor:I

    .line 66
    const/4 v5, 0x1

    .line 67
    const/4 v6, 0x2

    .line 68
    .line 69
    if-ne v3, v6, :cond_1

    .line 70
    int-to-float v3, v1

    .line 71
    :goto_1
    sub-float/2addr v2, v3

    .line 72
    goto :goto_2

    .line 73
    .line 74
    :cond_1
    if-ne v3, v5, :cond_2

    .line 75
    .line 76
    div-int/lit8 v3, v1, 0x2

    .line 77
    int-to-float v3, v3

    .line 78
    goto :goto_1

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_2
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 82
    move-result v2

    .line 83
    .line 84
    iget v3, p0, Landroidx/media3/ui/SubtitlePainter;->cueLineAnchor:I

    .line 85
    .line 86
    if-ne v3, v6, :cond_3

    .line 87
    int-to-float v3, v0

    .line 88
    :goto_3
    sub-float/2addr v4, v3

    .line 89
    goto :goto_4

    .line 90
    .line 91
    :cond_3
    if-ne v3, v5, :cond_4

    .line 92
    .line 93
    div-int/lit8 v3, v0, 0x2

    .line 94
    int-to-float v3, v3

    .line 95
    goto :goto_3

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_4
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 99
    move-result v3

    .line 100
    .line 101
    new-instance v4, Landroid/graphics/Rect;

    .line 102
    add-int/2addr v1, v2

    .line 103
    add-int/2addr v0, v3

    .line 104
    .line 105
    .line 106
    invoke-direct {v4, v2, v3, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 107
    .line 108
    iput-object v4, p0, Landroidx/media3/ui/SubtitlePainter;->bitmapRect:Landroid/graphics/Rect;

    .line 109
    return-void
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

.method private setupTextLayout()V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/media3/ui/SubtitlePainter;->cueText:Ljava/lang/CharSequence;

    .line 5
    .line 6
    instance-of v2, v1, Landroid/text/SpannableStringBuilder;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v1, Landroid/text/SpannableStringBuilder;

    .line 11
    :goto_0
    move-object v4, v1

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 15
    .line 16
    iget-object v2, v0, Landroidx/media3/ui/SubtitlePainter;->cueText:Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :goto_1
    iget v1, v0, Landroidx/media3/ui/SubtitlePainter;->parentRight:I

    .line 23
    .line 24
    iget v2, v0, Landroidx/media3/ui/SubtitlePainter;->parentLeft:I

    .line 25
    sub-int/2addr v1, v2

    .line 26
    .line 27
    iget v2, v0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 28
    .line 29
    iget v3, v0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 30
    sub-int/2addr v2, v3

    .line 31
    .line 32
    iget-object v3, v0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 33
    .line 34
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->defaultTextSizePx:F

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 38
    .line 39
    iget v3, v0, Landroidx/media3/ui/SubtitlePainter;->defaultTextSizePx:F

    .line 40
    .line 41
    const/high16 v5, 0x3e000000    # 0.125f

    .line 42
    mul-float/2addr v3, v5

    .line 43
    .line 44
    const/high16 v5, 0x3f000000    # 0.5f

    .line 45
    add-float/2addr v3, v5

    .line 46
    float-to-int v11, v3

    .line 47
    .line 48
    mul-int/lit8 v12, v11, 0x2

    .line 49
    .line 50
    sub-int v3, v1, v12

    .line 51
    .line 52
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->cueSize:F

    .line 53
    .line 54
    .line 55
    const v13, -0x800001

    .line 56
    .line 57
    cmpl-float v6, v5, v13

    .line 58
    .line 59
    if-eqz v6, :cond_1

    .line 60
    int-to-float v3, v3

    .line 61
    mul-float/2addr v3, v5

    .line 62
    float-to-int v3, v3

    .line 63
    :cond_1
    move v6, v3

    .line 64
    .line 65
    const-string v14, "SubtitlePainter"

    .line 66
    .line 67
    if-gtz v6, :cond_2

    .line 68
    .line 69
    const-string v1, "Skipped drawing subtitle cue (insufficient space)"

    .line 70
    .line 71
    .line 72
    invoke-static {v14, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    return-void

    .line 74
    .line 75
    :cond_2
    iget v3, v0, Landroidx/media3/ui/SubtitlePainter;->cueTextSizePx:F

    .line 76
    const/4 v15, 0x0

    .line 77
    .line 78
    cmpl-float v3, v3, v15

    .line 79
    .line 80
    const/high16 v5, 0xff0000

    .line 81
    const/4 v7, 0x0

    .line 82
    .line 83
    if-lez v3, :cond_3

    .line 84
    .line 85
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    .line 86
    .line 87
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->cueTextSizePx:F

    .line 88
    float-to-int v8, v8

    .line 89
    .line 90
    .line 91
    invoke-direct {v3, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 95
    move-result v8

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v3, v7, v8, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 99
    .line 100
    :cond_3
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-direct {v3, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->edgeType:I

    .line 106
    const/4 v9, 0x1

    .line 107
    .line 108
    if-ne v8, v9, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 112
    move-result v8

    .line 113
    .line 114
    const-class v10, Landroid/text/style/ForegroundColorSpan;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v7, v8, v10}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 118
    move-result-object v8

    .line 119
    .line 120
    check-cast v8, [Landroid/text/style/ForegroundColorSpan;

    .line 121
    array-length v10, v8

    .line 122
    move v9, v7

    .line 123
    .line 124
    :goto_2
    if-ge v9, v10, :cond_4

    .line 125
    .line 126
    move/from16 v17, v13

    .line 127
    .line 128
    aget-object v13, v8, v9

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v13}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 132
    .line 133
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    move/from16 v13, v17

    .line 136
    goto :goto_2

    .line 137
    .line 138
    :cond_4
    move/from16 v17, v13

    .line 139
    .line 140
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->backgroundColor:I

    .line 141
    .line 142
    .line 143
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    .line 144
    move-result v8

    .line 145
    const/4 v13, 0x2

    .line 146
    .line 147
    if-lez v8, :cond_7

    .line 148
    .line 149
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->edgeType:I

    .line 150
    .line 151
    if-eqz v8, :cond_6

    .line 152
    .line 153
    if-ne v8, v13, :cond_5

    .line 154
    goto :goto_3

    .line 155
    .line 156
    :cond_5
    new-instance v8, Landroid/text/style/BackgroundColorSpan;

    .line 157
    .line 158
    iget v9, v0, Landroidx/media3/ui/SubtitlePainter;->backgroundColor:I

    .line 159
    .line 160
    .line 161
    invoke-direct {v8, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 165
    move-result v9

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v8, v7, v9, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 169
    goto :goto_4

    .line 170
    .line 171
    :cond_6
    :goto_3
    new-instance v8, Landroid/text/style/BackgroundColorSpan;

    .line 172
    .line 173
    iget v9, v0, Landroidx/media3/ui/SubtitlePainter;->backgroundColor:I

    .line 174
    .line 175
    .line 176
    invoke-direct {v8, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 180
    move-result v9

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v8, v7, v9, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 184
    .line 185
    :cond_7
    :goto_4
    iget-object v5, v0, Landroidx/media3/ui/SubtitlePainter;->cueTextAlignment:Landroid/text/Layout$Alignment;

    .line 186
    .line 187
    if-nez v5, :cond_8

    .line 188
    .line 189
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 190
    .line 191
    :cond_8
    move-object/from16 v20, v5

    .line 192
    move-object v5, v3

    .line 193
    .line 194
    new-instance v3, Landroid/text/StaticLayout;

    .line 195
    move-object v8, v5

    .line 196
    .line 197
    iget-object v5, v0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 198
    move-object v9, v8

    .line 199
    .line 200
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->spacingMult:F

    .line 201
    move-object v10, v9

    .line 202
    .line 203
    iget v9, v0, Landroidx/media3/ui/SubtitlePainter;->spacingAdd:F

    .line 204
    .line 205
    move-object/from16 v18, v10

    .line 206
    const/4 v10, 0x1

    .line 207
    .line 208
    move/from16 v19, v15

    .line 209
    .line 210
    move-object/from16 v7, v20

    .line 211
    const/4 v15, 0x1

    .line 212
    .line 213
    .line 214
    invoke-direct/range {v3 .. v10}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 215
    .line 216
    iput-object v3, v0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 220
    move-result v3

    .line 221
    .line 222
    iget-object v5, v0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5}, Landroid/text/StaticLayout;->getLineCount()I

    .line 226
    move-result v5

    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v9, 0x0

    .line 229
    .line 230
    :goto_5
    if-ge v9, v5, :cond_9

    .line 231
    .line 232
    iget-object v10, v0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v10, v9}, Landroid/text/Layout;->getLineWidth(I)F

    .line 236
    move-result v10

    .line 237
    .line 238
    move-object/from16 v20, v14

    .line 239
    float-to-double v13, v10

    .line 240
    .line 241
    .line 242
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 243
    move-result-wide v13

    .line 244
    double-to-int v10, v13

    .line 245
    .line 246
    .line 247
    invoke-static {v10, v8}, Ljava/lang/Math;->max(II)I

    .line 248
    move-result v8

    .line 249
    .line 250
    add-int/lit8 v9, v9, 0x1

    .line 251
    .line 252
    move-object/from16 v14, v20

    .line 253
    const/4 v13, 0x2

    .line 254
    goto :goto_5

    .line 255
    .line 256
    :cond_9
    move-object/from16 v20, v14

    .line 257
    .line 258
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->cueSize:F

    .line 259
    .line 260
    cmpl-float v5, v5, v17

    .line 261
    .line 262
    if-eqz v5, :cond_a

    .line 263
    .line 264
    if-ge v8, v6, :cond_a

    .line 265
    goto :goto_6

    .line 266
    :cond_a
    move v6, v8

    .line 267
    :goto_6
    add-int/2addr v6, v12

    .line 268
    .line 269
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->cuePosition:F

    .line 270
    .line 271
    cmpl-float v8, v5, v17

    .line 272
    .line 273
    if-eqz v8, :cond_d

    .line 274
    int-to-float v1, v1

    .line 275
    mul-float/2addr v1, v5

    .line 276
    .line 277
    .line 278
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 279
    move-result v1

    .line 280
    .line 281
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentLeft:I

    .line 282
    add-int/2addr v1, v5

    .line 283
    .line 284
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->cuePositionAnchor:I

    .line 285
    .line 286
    if-eq v8, v15, :cond_c

    .line 287
    const/4 v9, 0x2

    .line 288
    .line 289
    if-eq v8, v9, :cond_b

    .line 290
    goto :goto_7

    .line 291
    :cond_b
    sub-int/2addr v1, v6

    .line 292
    goto :goto_7

    .line 293
    :cond_c
    const/4 v9, 0x2

    .line 294
    .line 295
    mul-int/lit8 v1, v1, 0x2

    .line 296
    sub-int/2addr v1, v6

    .line 297
    div-int/2addr v1, v9

    .line 298
    .line 299
    .line 300
    :goto_7
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 301
    move-result v1

    .line 302
    add-int/2addr v6, v1

    .line 303
    .line 304
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentRight:I

    .line 305
    .line 306
    .line 307
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 308
    move-result v5

    .line 309
    goto :goto_8

    .line 310
    :cond_d
    const/4 v9, 0x2

    .line 311
    sub-int/2addr v1, v6

    .line 312
    div-int/2addr v1, v9

    .line 313
    .line 314
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentLeft:I

    .line 315
    add-int/2addr v1, v5

    .line 316
    .line 317
    add-int v5, v1, v6

    .line 318
    .line 319
    :goto_8
    sub-int v6, v5, v1

    .line 320
    .line 321
    if-gtz v6, :cond_e

    .line 322
    .line 323
    const-string v1, "Skipped drawing subtitle cue (invalid horizontal positioning)"

    .line 324
    .line 325
    move-object/from16 v2, v20

    .line 326
    .line 327
    .line 328
    invoke-static {v2, v1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    return-void

    .line 330
    .line 331
    :cond_e
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->cueLine:F

    .line 332
    .line 333
    cmpl-float v8, v5, v17

    .line 334
    .line 335
    if-eqz v8, :cond_14

    .line 336
    .line 337
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->cueLineType:I

    .line 338
    .line 339
    if-nez v8, :cond_10

    .line 340
    int-to-float v2, v2

    .line 341
    mul-float/2addr v2, v5

    .line 342
    .line 343
    .line 344
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 345
    move-result v2

    .line 346
    .line 347
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 348
    add-int/2addr v2, v5

    .line 349
    .line 350
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->cueLineAnchor:I

    .line 351
    const/4 v9, 0x2

    .line 352
    .line 353
    if-ne v5, v9, :cond_f

    .line 354
    goto :goto_9

    .line 355
    .line 356
    :cond_f
    if-ne v5, v15, :cond_12

    .line 357
    .line 358
    mul-int/lit8 v2, v2, 0x2

    .line 359
    sub-int/2addr v2, v3

    .line 360
    div-int/2addr v2, v9

    .line 361
    goto :goto_a

    .line 362
    .line 363
    :cond_10
    iget-object v2, v0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 364
    const/4 v5, 0x0

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v5}, Landroid/text/Layout;->getLineBottom(I)I

    .line 368
    move-result v2

    .line 369
    .line 370
    iget-object v8, v0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8, v5}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 374
    move-result v5

    .line 375
    sub-int/2addr v2, v5

    .line 376
    .line 377
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->cueLine:F

    .line 378
    .line 379
    cmpl-float v8, v5, v19

    .line 380
    .line 381
    if-ltz v8, :cond_11

    .line 382
    int-to-float v2, v2

    .line 383
    mul-float/2addr v5, v2

    .line 384
    .line 385
    .line 386
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 387
    move-result v2

    .line 388
    .line 389
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 390
    add-int/2addr v2, v5

    .line 391
    goto :goto_a

    .line 392
    .line 393
    :cond_11
    const/high16 v8, 0x3f800000    # 1.0f

    .line 394
    add-float/2addr v5, v8

    .line 395
    int-to-float v2, v2

    .line 396
    mul-float/2addr v5, v2

    .line 397
    .line 398
    .line 399
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 400
    move-result v2

    .line 401
    .line 402
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 403
    add-int/2addr v2, v5

    .line 404
    :goto_9
    sub-int/2addr v2, v3

    .line 405
    .line 406
    :cond_12
    :goto_a
    add-int v5, v2, v3

    .line 407
    .line 408
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 409
    .line 410
    if-le v5, v8, :cond_13

    .line 411
    .line 412
    sub-int v2, v8, v3

    .line 413
    goto :goto_b

    .line 414
    .line 415
    :cond_13
    iget v3, v0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 416
    .line 417
    if-ge v2, v3, :cond_15

    .line 418
    move v2, v3

    .line 419
    goto :goto_b

    .line 420
    .line 421
    :cond_14
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 422
    sub-int/2addr v5, v3

    .line 423
    int-to-float v2, v2

    .line 424
    .line 425
    iget v3, v0, Landroidx/media3/ui/SubtitlePainter;->bottomPaddingFraction:F

    .line 426
    mul-float/2addr v2, v3

    .line 427
    float-to-int v2, v2

    .line 428
    .line 429
    sub-int v2, v5, v2

    .line 430
    .line 431
    :cond_15
    :goto_b
    new-instance v3, Landroid/text/StaticLayout;

    .line 432
    .line 433
    iget-object v5, v0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 434
    .line 435
    iget v8, v0, Landroidx/media3/ui/SubtitlePainter;->spacingMult:F

    .line 436
    .line 437
    iget v9, v0, Landroidx/media3/ui/SubtitlePainter;->spacingAdd:F

    .line 438
    const/4 v10, 0x1

    .line 439
    .line 440
    .line 441
    invoke-direct/range {v3 .. v10}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 442
    .line 443
    move/from16 v19, v6

    .line 444
    .line 445
    iput-object v3, v0, Landroidx/media3/ui/SubtitlePainter;->textLayout:Landroid/text/StaticLayout;

    .line 446
    .line 447
    new-instance v16, Landroid/text/StaticLayout;

    .line 448
    .line 449
    iget-object v3, v0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 450
    .line 451
    iget v4, v0, Landroidx/media3/ui/SubtitlePainter;->spacingMult:F

    .line 452
    .line 453
    iget v5, v0, Landroidx/media3/ui/SubtitlePainter;->spacingAdd:F

    .line 454
    .line 455
    const/16 v23, 0x1

    .line 456
    .line 457
    move/from16 v21, v4

    .line 458
    .line 459
    move/from16 v22, v5

    .line 460
    .line 461
    move-object/from16 v20, v7

    .line 462
    .line 463
    move-object/from16 v17, v18

    .line 464
    .line 465
    move-object/from16 v18, v3

    .line 466
    .line 467
    .line 468
    invoke-direct/range {v16 .. v23}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 469
    .line 470
    move-object/from16 v3, v16

    .line 471
    .line 472
    iput-object v3, v0, Landroidx/media3/ui/SubtitlePainter;->edgeLayout:Landroid/text/StaticLayout;

    .line 473
    .line 474
    iput v1, v0, Landroidx/media3/ui/SubtitlePainter;->textLeft:I

    .line 475
    .line 476
    iput v2, v0, Landroidx/media3/ui/SubtitlePainter;->textTop:I

    .line 477
    .line 478
    iput v11, v0, Landroidx/media3/ui/SubtitlePainter;->textPaddingX:I

    .line 479
    return-void
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
.end method


# virtual methods
.method public draw(Landroidx/media3/common/text/Cue;Landroidx/media3/ui/CaptionStyleCompat;FFFLandroid/graphics/Canvas;IIII)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/media3/common/text/Cue;->bitmap:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-object v1, p1, Landroidx/media3/common/text/Cue;->text:Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    return-void

    .line 19
    .line 20
    :cond_1
    iget-boolean v1, p1, Landroidx/media3/common/text/Cue;->windowColorSet:Z

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget v1, p1, Landroidx/media3/common/text/Cue;->windowColor:I

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_2
    iget v1, p2, Landroidx/media3/ui/CaptionStyleCompat;->windowColor:I

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_3
    const/high16 v1, -0x1000000

    .line 31
    .line 32
    :goto_1
    iget-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueText:Ljava/lang/CharSequence;

    .line 33
    .line 34
    iget-object v3, p1, Landroidx/media3/common/text/Cue;->text:Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Landroidx/media3/ui/SubtitlePainter;->areCharSequencesEqual(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 38
    move-result v2

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    iget-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueTextAlignment:Landroid/text/Layout$Alignment;

    .line 43
    .line 44
    iget-object v3, p1, Landroidx/media3/common/text/Cue;->textAlignment:Landroid/text/Layout$Alignment;

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmap:Landroid/graphics/Bitmap;

    .line 53
    .line 54
    iget-object v3, p1, Landroidx/media3/common/text/Cue;->bitmap:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    if-ne v2, v3, :cond_4

    .line 57
    .line 58
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueLine:F

    .line 59
    .line 60
    iget v3, p1, Landroidx/media3/common/text/Cue;->line:F

    .line 61
    .line 62
    cmpl-float v2, v2, v3

    .line 63
    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueLineType:I

    .line 67
    .line 68
    iget v3, p1, Landroidx/media3/common/text/Cue;->lineType:I

    .line 69
    .line 70
    if-ne v2, v3, :cond_4

    .line 71
    .line 72
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueLineAnchor:I

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    iget v3, p1, Landroidx/media3/common/text/Cue;->lineAnchor:I

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    move-result v2

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cuePosition:F

    .line 91
    .line 92
    iget v3, p1, Landroidx/media3/common/text/Cue;->position:F

    .line 93
    .line 94
    cmpl-float v2, v2, v3

    .line 95
    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cuePositionAnchor:I

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    iget v3, p1, Landroidx/media3/common/text/Cue;->positionAnchor:I

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    move-result v2

    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueSize:F

    .line 117
    .line 118
    iget v3, p1, Landroidx/media3/common/text/Cue;->size:F

    .line 119
    .line 120
    cmpl-float v2, v2, v3

    .line 121
    .line 122
    if-nez v2, :cond_4

    .line 123
    .line 124
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmapHeight:F

    .line 125
    .line 126
    iget v3, p1, Landroidx/media3/common/text/Cue;->bitmapHeight:F

    .line 127
    .line 128
    cmpl-float v2, v2, v3

    .line 129
    .line 130
    if-nez v2, :cond_4

    .line 131
    .line 132
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->foregroundColor:I

    .line 133
    .line 134
    iget v3, p2, Landroidx/media3/ui/CaptionStyleCompat;->foregroundColor:I

    .line 135
    .line 136
    if-ne v2, v3, :cond_4

    .line 137
    .line 138
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->backgroundColor:I

    .line 139
    .line 140
    iget v3, p2, Landroidx/media3/ui/CaptionStyleCompat;->backgroundColor:I

    .line 141
    .line 142
    if-ne v2, v3, :cond_4

    .line 143
    .line 144
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->windowColor:I

    .line 145
    .line 146
    if-ne v2, v1, :cond_4

    .line 147
    .line 148
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->edgeType:I

    .line 149
    .line 150
    iget v3, p2, Landroidx/media3/ui/CaptionStyleCompat;->edgeType:I

    .line 151
    .line 152
    if-ne v2, v3, :cond_4

    .line 153
    .line 154
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->edgeColor:I

    .line 155
    .line 156
    iget v3, p2, Landroidx/media3/ui/CaptionStyleCompat;->edgeColor:I

    .line 157
    .line 158
    if-ne v2, v3, :cond_4

    .line 159
    .line 160
    iget-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    iget-object v3, p2, Landroidx/media3/ui/CaptionStyleCompat;->typeface:Landroid/graphics/Typeface;

    .line 167
    .line 168
    .line 169
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    move-result v2

    .line 171
    .line 172
    if-eqz v2, :cond_4

    .line 173
    .line 174
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->defaultTextSizePx:F

    .line 175
    .line 176
    cmpl-float v2, v2, p3

    .line 177
    .line 178
    if-nez v2, :cond_4

    .line 179
    .line 180
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueTextSizePx:F

    .line 181
    .line 182
    cmpl-float v2, v2, p4

    .line 183
    .line 184
    if-nez v2, :cond_4

    .line 185
    .line 186
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->bottomPaddingFraction:F

    .line 187
    .line 188
    cmpl-float v2, v2, p5

    .line 189
    .line 190
    if-nez v2, :cond_4

    .line 191
    .line 192
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->parentLeft:I

    .line 193
    .line 194
    if-ne v2, p7, :cond_4

    .line 195
    .line 196
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 197
    .line 198
    if-ne v2, p8, :cond_4

    .line 199
    .line 200
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->parentRight:I

    .line 201
    .line 202
    if-ne v2, p9, :cond_4

    .line 203
    .line 204
    iget v2, p0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 205
    .line 206
    if-ne v2, p10, :cond_4

    .line 207
    .line 208
    .line 209
    invoke-direct {p0, p6, v0}, Landroidx/media3/ui/SubtitlePainter;->drawLayout(Landroid/graphics/Canvas;Z)V

    .line 210
    return-void

    .line 211
    .line 212
    :cond_4
    iget-object v2, p1, Landroidx/media3/common/text/Cue;->text:Ljava/lang/CharSequence;

    .line 213
    .line 214
    iput-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueText:Ljava/lang/CharSequence;

    .line 215
    .line 216
    iget-object v2, p1, Landroidx/media3/common/text/Cue;->textAlignment:Landroid/text/Layout$Alignment;

    .line 217
    .line 218
    iput-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueTextAlignment:Landroid/text/Layout$Alignment;

    .line 219
    .line 220
    iget-object v2, p1, Landroidx/media3/common/text/Cue;->bitmap:Landroid/graphics/Bitmap;

    .line 221
    .line 222
    iput-object v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmap:Landroid/graphics/Bitmap;

    .line 223
    .line 224
    iget v2, p1, Landroidx/media3/common/text/Cue;->line:F

    .line 225
    .line 226
    iput v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueLine:F

    .line 227
    .line 228
    iget v2, p1, Landroidx/media3/common/text/Cue;->lineType:I

    .line 229
    .line 230
    iput v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueLineType:I

    .line 231
    .line 232
    iget v2, p1, Landroidx/media3/common/text/Cue;->lineAnchor:I

    .line 233
    .line 234
    iput v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueLineAnchor:I

    .line 235
    .line 236
    iget v2, p1, Landroidx/media3/common/text/Cue;->position:F

    .line 237
    .line 238
    iput v2, p0, Landroidx/media3/ui/SubtitlePainter;->cuePosition:F

    .line 239
    .line 240
    iget v2, p1, Landroidx/media3/common/text/Cue;->positionAnchor:I

    .line 241
    .line 242
    iput v2, p0, Landroidx/media3/ui/SubtitlePainter;->cuePositionAnchor:I

    .line 243
    .line 244
    iget v2, p1, Landroidx/media3/common/text/Cue;->size:F

    .line 245
    .line 246
    iput v2, p0, Landroidx/media3/ui/SubtitlePainter;->cueSize:F

    .line 247
    .line 248
    iget p1, p1, Landroidx/media3/common/text/Cue;->bitmapHeight:F

    .line 249
    .line 250
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmapHeight:F

    .line 251
    .line 252
    iget p1, p2, Landroidx/media3/ui/CaptionStyleCompat;->foregroundColor:I

    .line 253
    .line 254
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->foregroundColor:I

    .line 255
    .line 256
    iget p1, p2, Landroidx/media3/ui/CaptionStyleCompat;->backgroundColor:I

    .line 257
    .line 258
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->backgroundColor:I

    .line 259
    .line 260
    iput v1, p0, Landroidx/media3/ui/SubtitlePainter;->windowColor:I

    .line 261
    .line 262
    iget p1, p2, Landroidx/media3/ui/CaptionStyleCompat;->edgeType:I

    .line 263
    .line 264
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->edgeType:I

    .line 265
    .line 266
    iget p1, p2, Landroidx/media3/ui/CaptionStyleCompat;->edgeColor:I

    .line 267
    .line 268
    iput p1, p0, Landroidx/media3/ui/SubtitlePainter;->edgeColor:I

    .line 269
    .line 270
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->textPaint:Landroid/text/TextPaint;

    .line 271
    .line 272
    iget-object p2, p2, Landroidx/media3/ui/CaptionStyleCompat;->typeface:Landroid/graphics/Typeface;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 276
    .line 277
    iput p3, p0, Landroidx/media3/ui/SubtitlePainter;->defaultTextSizePx:F

    .line 278
    .line 279
    iput p4, p0, Landroidx/media3/ui/SubtitlePainter;->cueTextSizePx:F

    .line 280
    .line 281
    iput p5, p0, Landroidx/media3/ui/SubtitlePainter;->bottomPaddingFraction:F

    .line 282
    .line 283
    iput p7, p0, Landroidx/media3/ui/SubtitlePainter;->parentLeft:I

    .line 284
    .line 285
    iput p8, p0, Landroidx/media3/ui/SubtitlePainter;->parentTop:I

    .line 286
    .line 287
    iput p9, p0, Landroidx/media3/ui/SubtitlePainter;->parentRight:I

    .line 288
    .line 289
    iput p10, p0, Landroidx/media3/ui/SubtitlePainter;->parentBottom:I

    .line 290
    .line 291
    if-eqz v0, :cond_5

    .line 292
    .line 293
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->cueText:Ljava/lang/CharSequence;

    .line 294
    .line 295
    .line 296
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    invoke-direct {p0}, Landroidx/media3/ui/SubtitlePainter;->setupTextLayout()V

    .line 300
    goto :goto_2

    .line 301
    .line 302
    :cond_5
    iget-object p1, p0, Landroidx/media3/ui/SubtitlePainter;->cueBitmap:Landroid/graphics/Bitmap;

    .line 303
    .line 304
    .line 305
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    invoke-direct {p0}, Landroidx/media3/ui/SubtitlePainter;->setupBitmapLayout()V

    .line 309
    .line 310
    .line 311
    :goto_2
    invoke-direct {p0, p6, v0}, Landroidx/media3/ui/SubtitlePainter;->drawLayout(Landroid/graphics/Canvas;Z)V

    .line 312
    return-void
.end method
