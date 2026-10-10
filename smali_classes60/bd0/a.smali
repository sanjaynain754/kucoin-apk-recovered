.class public final Lbd0/a;
.super Landroid/text/style/ReplacementSpan;
.source "AnchorTagSpan.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/barrage/view/AnchorTagSpan;",
        "Landroid/text/style/ReplacementSpan;",
        "text",
        "",
        "textColor",
        "",
        "textSize",
        "",
        "background",
        "Landroid/graphics/drawable/Drawable;",
        "tagWidth",
        "tagHeight",
        "margin",
        "isRtl",
        "",
        "<init>",
        "(Ljava/lang/String;IFLandroid/graphics/drawable/Drawable;IIIZ)V",
        "getSize",
        "paint",
        "Landroid/graphics/Paint;",
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
        "tuilivekit_googleRelease"
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:I

.field public final d:F

.field public final e:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IFLandroid/graphics/drawable/Drawable;IIIZ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "text"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "background"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lbd0/a;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput p2, p0, Lbd0/a;->c:I

    .line 18
    .line 19
    iput p3, p0, Lbd0/a;->d:F

    .line 20
    .line 21
    iput-object p4, p0, Lbd0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    iput p5, p0, Lbd0/a;->f:I

    .line 24
    .line 25
    iput p6, p0, Lbd0/a;->g:I

    .line 26
    .line 27
    iput p7, p0, Lbd0/a;->h:I

    .line 28
    .line 29
    iput-boolean p8, p0, Lbd0/a;->i:Z

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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 2
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
    const-string p3, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p3, "text"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p2, "paint"

    .line 13
    .line 14
    .line 15
    invoke-static {p9, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 22
    .line 23
    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 24
    add-int/2addr p3, p2

    .line 25
    const/4 p2, 0x2

    .line 26
    div-int/2addr p3, p2

    .line 27
    add-int/2addr p7, p3

    .line 28
    .line 29
    iget p3, p0, Lbd0/a;->g:I

    .line 30
    .line 31
    div-int/lit8 p4, p3, 0x2

    .line 32
    sub-int/2addr p7, p4

    .line 33
    .line 34
    iget-boolean p4, p0, Lbd0/a;->i:Z

    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    iget p4, p0, Lbd0/a;->h:I

    .line 39
    int-to-float p4, p4

    .line 40
    add-float/2addr p5, p4

    .line 41
    .line 42
    :cond_0
    iget-object p4, p0, Lbd0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 43
    float-to-int p6, p5

    .line 44
    .line 45
    iget p8, p0, Lbd0/a;->f:I

    .line 46
    add-int/2addr p8, p6

    .line 47
    add-int/2addr p3, p7

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4, p6, p7, p8, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 51
    .line 52
    iget-object p3, p0, Lbd0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p9}, Landroid/graphics/Paint;->getTextSize()F

    .line 59
    move-result p3

    .line 60
    .line 61
    .line 62
    invoke-virtual {p9}, Landroid/graphics/Paint;->getColor()I

    .line 63
    move-result p4

    .line 64
    .line 65
    iget p6, p0, Lbd0/a;->d:F

    .line 66
    .line 67
    .line 68
    invoke-virtual {p9, p6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 69
    .line 70
    iget p6, p0, Lbd0/a;->c:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p9, p6}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    const/4 p6, 0x1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p9, p6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 78
    .line 79
    iget-object p6, p0, Lbd0/a;->b:Ljava/lang/String;

    .line 80
    .line 81
    sget-object p8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p6, p8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 85
    move-result-object p6

    .line 86
    .line 87
    const-string v0, "toUpperCase(...)"

    .line 88
    .line 89
    .line 90
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p9, p6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 94
    move-result p6

    .line 95
    .line 96
    iget v1, p0, Lbd0/a;->f:I

    .line 97
    int-to-float v1, v1

    .line 98
    sub-float/2addr v1, p6

    .line 99
    int-to-float p6, p2

    .line 100
    div-float/2addr v1, p6

    .line 101
    add-float/2addr p5, v1

    .line 102
    .line 103
    iget v1, p0, Lbd0/a;->g:I

    .line 104
    div-int/2addr v1, p2

    .line 105
    add-int/2addr p7, v1

    .line 106
    int-to-float p2, p7

    .line 107
    .line 108
    .line 109
    invoke-virtual {p9}, Landroid/graphics/Paint;->descent()F

    .line 110
    move-result p7

    .line 111
    .line 112
    .line 113
    invoke-virtual {p9}, Landroid/graphics/Paint;->ascent()F

    .line 114
    move-result v1

    .line 115
    add-float/2addr p7, v1

    .line 116
    div-float/2addr p7, p6

    .line 117
    sub-float/2addr p2, p7

    .line 118
    .line 119
    iget-object p6, p0, Lbd0/a;->b:Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p6, p8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 123
    move-result-object p6

    .line 124
    .line 125
    .line 126
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p6, p5, p2, p9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p9, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p9, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    const/4 p1, 0x0

    .line 137
    .line 138
    .line 139
    invoke-virtual {p9, p1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 140
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 1
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
    const-string p3, "paint"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p3, "text"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iget p2, p0, Lbd0/a;->g:I

    .line 19
    .line 20
    iget p3, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 21
    .line 22
    iget p4, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 23
    .line 24
    sub-int v0, p3, p4

    .line 25
    sub-int/2addr p2, v0

    .line 26
    .line 27
    div-int/lit8 p2, p2, 0x2

    .line 28
    sub-int/2addr p4, p2

    .line 29
    .line 30
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 31
    .line 32
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 33
    sub-int/2addr p1, p2

    .line 34
    .line 35
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 36
    .line 37
    add-int p1, p3, p2

    .line 38
    .line 39
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 40
    add-int/2addr p3, p2

    .line 41
    .line 42
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 43
    .line 44
    :cond_0
    iget p1, p0, Lbd0/a;->f:I

    .line 45
    .line 46
    iget p2, p0, Lbd0/a;->h:I

    .line 47
    add-int/2addr p1, p2

    .line 48
    return p1
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
.end method
