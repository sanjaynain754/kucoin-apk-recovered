.class public final Lc20/a;
.super Landroid/text/style/ReplacementSpan;
.source "PerpSpan.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016JP\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/span/PerpSpan;",
        "Landroid/text/style/ReplacementSpan;",
        "<init>",
        "()V",
        "regularFont",
        "Landroid/graphics/Typeface;",
        "getSize",
        "",
        "paint",
        "Landroid/graphics/Paint;",
        "text",
        "",
        "start",
        "end",
        "fontMetricsInt",
        "Landroid/graphics/Paint$FontMetricsInt;",
        "draw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "x",
        "",
        "top",
        "y",
        "bottom",
        "LComponent_googleRelease"
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
.field public final b:Landroid/graphics/Typeface;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget v1, Lcom/kubi/sdk/res/R$font;->regular:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lc20/a;->b:Landroid/graphics/Typeface;

    .line 18
    return-void
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 16
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

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p5

    move/from16 v3, p6

    move-object/from16 v6, p9

    const-string v4, "canvas"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "text"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "paint"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    .line 2
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTextSize()F

    move-result v8

    .line 3
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v9

    const/high16 v4, 0x40400000    # 3.0f

    div-float v4, v8, v4

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    .line 4
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    move-object/from16 v10, p0

    .line 5
    iget-object v4, v10, Lc20/a;->b:Landroid/graphics/Typeface;

    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v4

    move/from16 v11, p3

    move/from16 v12, p4

    .line 7
    invoke-virtual {v6, v1, v11, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v13

    sub-int v14, p8, v3

    int-to-float v3, v3

    int-to-float v14, v14

    div-float/2addr v14, v5

    add-float/2addr v3, v14

    .line 8
    iget v5, v4, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float v14, v5, v4

    add-float/2addr v5, v4

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v5, v4

    div-float/2addr v14, v4

    sub-float v4, v3, v14

    const/16 p6, 0x1

    .line 9
    invoke-static/range {p6 .. p6}, Lcom/kubi/utils/extensions/e;->b(I)I

    move-result v15

    int-to-float v15, v15

    sub-float/2addr v4, v15

    add-float/2addr v14, v3

    .line 10
    invoke-static/range {p6 .. p6}, Lcom/kubi/utils/extensions/e;->b(I)I

    move-result v15

    int-to-float v15, v15

    add-float/2addr v14, v15

    .line 11
    sget-object v15, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    sget v1, Lcom/kubi/sdk/res/R$color;->c_cover4:I

    invoke-virtual {v15, v1}, Lcom/kubi/utils/c;->a(I)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    new-instance v1, Landroid/graphics/RectF;

    add-float/2addr v13, v2

    const/4 v15, 0x6

    .line 13
    invoke-static {v15}, Lcom/kubi/utils/extensions/e;->b(I)I

    move-result v15

    int-to-float v15, v15

    add-float/2addr v13, v15

    .line 14
    invoke-direct {v1, v2, v4, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v4, 0x4

    .line 15
    invoke-static {v4}, Lcom/kubi/utils/extensions/e;->b(I)I

    move-result v13

    int-to-float v13, v13

    invoke-static {v4}, Lcom/kubi/utils/extensions/e;->b(I)I

    move-result v4

    int-to-float v4, v4

    .line 16
    invoke-virtual {v0, v1, v13, v4, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const/16 v1, 0x99

    .line 17
    invoke-static {v7, v1}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    sub-float v5, v3, v5

    const/4 v1, 0x3

    .line 18
    invoke-static {v1}, Lcom/kubi/utils/extensions/e;->b(I)I

    move-result v1

    int-to-float v1, v1

    add-float v4, v2, v1

    move-object/from16 v1, p2

    move v2, v11

    move v3, v12

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 19
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 21
    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 4
    .param p1    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint$FontMetricsInt;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "paint"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "text"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const/high16 v2, 0x40400000    # 3.0f

    .line 21
    .line 22
    div-float v2, v0, v2

    .line 23
    .line 24
    const/high16 v3, 0x40000000    # 2.0f

    .line 25
    mul-float/2addr v2, v3

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 29
    .line 30
    iget-object v2, p0, Lc20/a;->b:Landroid/graphics/Typeface;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 37
    move-result p2

    .line 38
    float-to-int p2, p2

    .line 39
    const/4 p3, 0x6

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 43
    move-result p3

    .line 44
    add-int/2addr p2, p3

    .line 45
    .line 46
    if-eqz p5, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 50
    move-result-object p3

    .line 51
    .line 52
    iget p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 53
    .line 54
    iget v2, p3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 55
    float-to-int v2, v2

    .line 56
    .line 57
    .line 58
    invoke-static {p4, v2}, Ljava/lang/Math;->min(II)I

    .line 59
    move-result p4

    .line 60
    .line 61
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 62
    .line 63
    iget p4, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 64
    .line 65
    iget p3, p3, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 66
    float-to-int p3, p3

    .line 67
    .line 68
    .line 69
    invoke-static {p4, p3}, Ljava/lang/Math;->max(II)I

    .line 70
    move-result p3

    .line 71
    .line 72
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 79
    return p2
    .line 80
    .line 81
    .line 82
    .line 83
.end method
