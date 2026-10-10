.class public final Lcom/kubi/payment/util/j;
.super Landroid/text/style/ReplacementSpan;
.source "RoundedBackgroundSpan.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016JP\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/payment/util/RoundedBackgroundSpan;",
        "Landroid/text/style/ReplacementSpan;",
        "backgroundColor",
        "",
        "textColor",
        "radius",
        "",
        "size",
        "marginH",
        "<init>",
        "(IIFFF)V",
        "getSize",
        "paint",
        "Landroid/graphics/Paint;",
        "text",
        "",
        "start",
        "end",
        "fm",
        "Landroid/graphics/Paint$FontMetricsInt;",
        "draw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "x",
        "top",
        "y",
        "bottom",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:F

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(IIFFF)V
    .locals 0

    .line 5
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 6
    iput p1, p0, Lcom/kubi/payment/util/j;->b:I

    .line 7
    iput p2, p0, Lcom/kubi/payment/util/j;->c:I

    .line 8
    iput p3, p0, Lcom/kubi/payment/util/j;->d:F

    .line 9
    iput p4, p0, Lcom/kubi/payment/util/j;->e:F

    .line 10
    iput p5, p0, Lcom/kubi/payment/util/j;->f:F

    return-void
.end method

.method public synthetic constructor <init>(IIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/high16 p3, 0x40000000    # 2.0f

    .line 1
    invoke-static {p3}, Lcom/kubi/utils/extensions/e;->a(F)F

    move-result p3

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/high16 p3, 0x41a00000    # 20.0f

    .line 2
    invoke-static {p3}, Lcom/kubi/utils/extensions/e;->a(F)F

    move-result p4

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/high16 p3, 0x40800000    # 4.0f

    .line 3
    invoke-static {p3}, Lcom/kubi/utils/extensions/e;->a(F)F

    move-result p5

    :cond_2
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v5, p5

    .line 4
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/util/j;-><init>(IIFFF)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 10
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v6, p9

    .line 3
    .line 4
    const-string v0, "canvas"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "text"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v0, "paint"

    .line 15
    .line 16
    .line 17
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 21
    move-result v7

    .line 22
    .line 23
    .line 24
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    move/from16 v1, p7

    .line 28
    int-to-float v1, v1

    .line 29
    .line 30
    iget v2, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 31
    .line 32
    iget v3, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 33
    add-float/2addr v2, v3

    .line 34
    .line 35
    const/high16 v3, 0x40000000    # 2.0f

    .line 36
    div-float/2addr v2, v3

    .line 37
    add-float/2addr v1, v2

    .line 38
    .line 39
    iget v2, p0, Lcom/kubi/payment/util/j;->f:F

    .line 40
    add-float/2addr v2, p5

    .line 41
    .line 42
    new-instance v4, Landroid/graphics/RectF;

    .line 43
    .line 44
    iget v5, p0, Lcom/kubi/payment/util/j;->e:F

    .line 45
    .line 46
    div-float v8, v5, v3

    .line 47
    .line 48
    sub-float v8, v1, v8

    .line 49
    .line 50
    add-float v9, v2, v5

    .line 51
    div-float/2addr v5, v3

    .line 52
    add-float/2addr v1, v5

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, v2, v8, v9, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    .line 57
    iget v1, p0, Lcom/kubi/payment/util/j;->b:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    .line 62
    iget v1, p0, Lcom/kubi/payment/util/j;->d:F

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v4, v1, v1, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    iget v1, p0, Lcom/kubi/payment/util/j;->c:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 74
    move-result v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    .line 78
    move-result v5

    .line 79
    div-float/2addr v2, v3

    .line 80
    sub-float/2addr v5, v2

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 84
    move-result v2

    .line 85
    .line 86
    iget v4, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 87
    .line 88
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 89
    add-float/2addr v4, v0

    .line 90
    div-float/2addr v4, v3

    .line 91
    sub-float/2addr v2, v4

    .line 92
    move-object v0, p1

    .line 93
    move-object v1, p2

    .line 94
    move v3, p4

    .line 95
    move v4, v5

    .line 96
    move v5, v2

    .line 97
    move v2, p3

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 104
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0
    .param p1    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint$FontMetricsInt;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p2, "paint"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p5, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iget p2, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 14
    .line 15
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 16
    add-float/2addr p2, p1

    .line 17
    .line 18
    const/high16 p1, 0x40000000    # 2.0f

    .line 19
    div-float/2addr p2, p1

    .line 20
    .line 21
    iget p3, p0, Lcom/kubi/payment/util/j;->e:F

    .line 22
    .line 23
    div-float p4, p3, p1

    .line 24
    .line 25
    sub-float p4, p2, p4

    .line 26
    div-float/2addr p3, p1

    .line 27
    add-float/2addr p2, p3

    .line 28
    float-to-int p1, p4

    .line 29
    .line 30
    add-int/lit8 p1, p1, -0x1

    .line 31
    .line 32
    iget p3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 33
    .line 34
    if-ge p1, p3, :cond_0

    .line 35
    .line 36
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 37
    .line 38
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 39
    :cond_0
    float-to-int p1, p2

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    iget p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 44
    .line 45
    if-le p1, p2, :cond_1

    .line 46
    .line 47
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 48
    .line 49
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 50
    .line 51
    :cond_1
    iget p1, p0, Lcom/kubi/payment/util/j;->e:F

    .line 52
    .line 53
    iget p2, p0, Lcom/kubi/payment/util/j;->f:F

    .line 54
    const/4 p3, 0x2

    .line 55
    int-to-float p3, p3

    .line 56
    mul-float/2addr p2, p3

    .line 57
    add-float/2addr p1, p2

    .line 58
    float-to-int p1, p1

    .line 59
    return p1
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
    .line 233
    .line 234
.end method
