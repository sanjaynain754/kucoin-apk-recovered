.class public final Lcom/kubi/futures/view/UnderlineDrawableTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "UnderlineDrawableTextView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0015J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001a2\u0008\u0010!\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0016\u00a8\u0006\""
    }
    d2 = {
        "Lcom/kubi/futures/view/UnderlineDrawableTextView;",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "underlinePaint",
        "Landroid/graphics/Paint;",
        "drawableStart",
        "Landroid/graphics/drawable/Drawable;",
        "path",
        "Landroid/graphics/Path;",
        "layoutText",
        "Landroid/text/StaticLayout;",
        "isLayoutRtl",
        "",
        "()Z",
        "isLayoutRtl$delegate",
        "Lkotlin/Lazy;",
        "onMeasure",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "setDrawableStart",
        "drawable",
        "KumexLib_googleRelease"
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
.field public final b:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Landroid/text/StaticLayout;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/futures/view/UnderlineDrawableTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/futures/view/UnderlineDrawableTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->d:Landroid/graphics/Path;

    .line 5
    sget-object p1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance p2, Lcom/kubi/futures/view/s;

    invoke-direct {p2}, Lcom/kubi/futures/view/s;-><init>()V

    invoke-static {p1, p2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->f:Lkotlin/Lazy;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p3, 0x40400000    # 3.0f

    .line 8
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    new-instance p3, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/4 v1, 0x0

    invoke-direct {p3, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 11
    iput-object p1, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->b:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method public static synthetic b()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/view/UnderlineDrawableTextView;->d()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static final d()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 19
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "canvas"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v8, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->e:Landroid/text/StaticLayout;

    .line 12
    .line 13
    if-nez v8, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    :goto_0
    return-void

    .line 22
    .line 23
    :cond_1
    iget-object v3, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->b:Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 27
    move-result v4

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 38
    move-result v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/futures/view/UnderlineDrawableTextView;->c()Z

    .line 45
    move-result v9

    .line 46
    .line 47
    iget-object v3, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->c:Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 53
    move-result v5

    .line 54
    move v10, v5

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v10, 0x0

    .line 57
    .line 58
    :goto_1
    if-eqz v3, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 62
    move-result v5

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    const/4 v5, 0x0

    .line 65
    .line 66
    .line 67
    :goto_2
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablePadding()I

    .line 68
    move-result v11

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8}, Landroid/text/StaticLayout;->getLineCount()I

    .line 72
    move-result v6

    .line 73
    const/4 v7, 0x0

    .line 74
    move v12, v7

    .line 75
    const/4 v7, 0x0

    .line 76
    .line 77
    :goto_3
    if-ge v7, v6, :cond_4

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8, v7}, Landroid/text/Layout;->getLineWidth(I)F

    .line 81
    move-result v13

    .line 82
    .line 83
    .line 84
    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    .line 85
    move-result v12

    .line 86
    .line 87
    add-int/lit8 v7, v7, 0x1

    .line 88
    goto :goto_3

    .line 89
    .line 90
    :cond_4
    add-int v6, v10, v11

    .line 91
    int-to-float v6, v6

    .line 92
    add-float/2addr v6, v12

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/widget/TextView;->getGravity()I

    .line 96
    move-result v7

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 100
    move-result v13

    .line 101
    .line 102
    .line 103
    invoke-static {v7, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 104
    move-result v7

    .line 105
    .line 106
    and-int/lit8 v13, v7, 0x7

    .line 107
    const/4 v15, 0x5

    .line 108
    const/4 v7, 0x3

    .line 109
    .line 110
    const/high16 v16, 0x40000000    # 2.0f

    .line 111
    const/4 v14, 0x1

    .line 112
    .line 113
    if-eq v13, v14, :cond_7

    .line 114
    .line 115
    if-eq v13, v7, :cond_6

    .line 116
    .line 117
    if-eq v13, v15, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 121
    move-result v6

    .line 122
    int-to-float v6, v6

    .line 123
    goto :goto_4

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 127
    move-result v4

    .line 128
    int-to-float v4, v4

    .line 129
    sub-float/2addr v4, v6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 133
    move-result v6

    .line 134
    int-to-float v6, v6

    .line 135
    .line 136
    sub-float v6, v4, v6

    .line 137
    goto :goto_4

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 141
    move-result v4

    .line 142
    int-to-float v6, v4

    .line 143
    goto :goto_4

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 147
    move-result v4

    .line 148
    int-to-float v4, v4

    .line 149
    sub-float/2addr v4, v6

    .line 150
    .line 151
    div-float v6, v4, v16

    .line 152
    .line 153
    :goto_4
    if-eqz v9, :cond_8

    .line 154
    .line 155
    add-float v4, v6, v12

    .line 156
    int-to-float v15, v11

    .line 157
    add-float/2addr v4, v15

    .line 158
    move v15, v6

    .line 159
    move v6, v4

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    int-to-float v4, v10

    .line 162
    add-float/2addr v4, v6

    .line 163
    int-to-float v15, v11

    .line 164
    add-float/2addr v4, v15

    .line 165
    move v15, v4

    .line 166
    .line 167
    .line 168
    :goto_5
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 169
    move-result-object v4

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 173
    move-result-object v4

    .line 174
    .line 175
    iget v7, v4, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 176
    .line 177
    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 178
    sub-float/2addr v7, v4

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 182
    move-result v4

    .line 183
    int-to-float v4, v4

    .line 184
    int-to-float v5, v5

    .line 185
    sub-float/2addr v7, v5

    .line 186
    .line 187
    .line 188
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 189
    move-result v5

    .line 190
    add-float/2addr v4, v5

    .line 191
    .line 192
    if-eqz v3, :cond_9

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v6, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 205
    .line 206
    .line 207
    :cond_9
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8}, Landroid/text/StaticLayout;->getLineCount()I

    .line 211
    move-result v3

    .line 212
    const/4 v4, 0x0

    .line 213
    .line 214
    :goto_6
    if-ge v4, v3, :cond_f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v4}, Landroid/text/Layout;->getLineWidth(I)F

    .line 218
    move-result v5

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8, v4}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 222
    move-result v6

    .line 223
    int-to-float v6, v6

    .line 224
    .line 225
    if-eq v13, v14, :cond_e

    .line 226
    const/4 v7, 0x3

    .line 227
    .line 228
    if-eq v13, v7, :cond_d

    .line 229
    const/4 v14, 0x5

    .line 230
    .line 231
    if-eq v13, v14, :cond_b

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 235
    move-result v5

    .line 236
    int-to-float v5, v5

    .line 237
    :cond_a
    :goto_7
    move v7, v3

    .line 238
    goto :goto_9

    .line 239
    .line 240
    .line 241
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 242
    move-result v7

    .line 243
    int-to-float v7, v7

    .line 244
    sub-float/2addr v7, v5

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 248
    move-result v5

    .line 249
    int-to-float v5, v5

    .line 250
    .line 251
    if-nez v9, :cond_c

    .line 252
    .line 253
    :goto_8
    sub-float v5, v7, v5

    .line 254
    goto :goto_7

    .line 255
    :cond_c
    sub-float/2addr v7, v5

    .line 256
    int-to-float v5, v10

    .line 257
    sub-float/2addr v7, v5

    .line 258
    int-to-float v5, v11

    .line 259
    goto :goto_8

    .line 260
    :cond_d
    const/4 v14, 0x5

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 264
    move-result v5

    .line 265
    int-to-float v5, v5

    .line 266
    .line 267
    if-nez v9, :cond_a

    .line 268
    int-to-float v7, v11

    .line 269
    add-float/2addr v5, v7

    .line 270
    int-to-float v7, v10

    .line 271
    add-float/2addr v5, v7

    .line 272
    goto :goto_7

    .line 273
    :cond_e
    const/4 v14, 0x5

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 277
    move-result v7

    .line 278
    int-to-float v7, v7

    .line 279
    sub-float/2addr v7, v5

    .line 280
    .line 281
    div-float v5, v7, v16

    .line 282
    goto :goto_7

    .line 283
    .line 284
    .line 285
    :goto_9
    invoke-virtual {v8, v4}, Landroid/text/StaticLayout;->getLineStart(I)I

    .line 286
    move-result v3

    .line 287
    move v14, v4

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8, v14}, Landroid/text/Layout;->getLineEnd(I)I

    .line 291
    move-result v4

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 295
    move-result v1

    .line 296
    int-to-float v1, v1

    .line 297
    add-float/2addr v6, v1

    .line 298
    move v1, v7

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 302
    move-result-object v7

    .line 303
    .line 304
    move/from16 v18, v14

    .line 305
    .line 306
    const/16 v17, 0x3

    .line 307
    move v14, v1

    .line 308
    .line 309
    move-object/from16 v1, p1

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 313
    .line 314
    add-int/lit8 v4, v18, 0x1

    .line 315
    move v3, v14

    .line 316
    const/4 v14, 0x1

    .line 317
    goto :goto_6

    .line 318
    .line 319
    .line 320
    :cond_f
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 324
    move-result v2

    .line 325
    int-to-float v2, v2

    .line 326
    .line 327
    if-eqz v9, :cond_10

    .line 328
    .line 329
    add-float v3, v15, v12

    .line 330
    goto :goto_a

    .line 331
    :cond_10
    move v3, v15

    .line 332
    .line 333
    :goto_a
    if-eqz v9, :cond_11

    .line 334
    goto :goto_b

    .line 335
    :cond_11
    add-float/2addr v15, v12

    .line 336
    .line 337
    :goto_b
    iget-object v4, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->d:Landroid/graphics/Path;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 341
    .line 342
    iget-object v4, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->d:Landroid/graphics/Path;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v3, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 346
    .line 347
    iget-object v3, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->d:Landroid/graphics/Path;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3, v15, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 351
    .line 352
    iget-object v2, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->d:Landroid/graphics/Path;

    .line 353
    .line 354
    iget-object v3, v0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->b:Landroid/graphics/Paint;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 358
    return-void
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
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
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
.end method

.method public onMeasure(II)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 4
    move-result p2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    move-result v0

    .line 9
    sub-int/2addr p2, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 13
    move-result v0

    .line 14
    sub-int/2addr p2, v0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->c:Landroid/graphics/drawable/Drawable;

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablePadding()I

    .line 29
    move-result v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    const-string v5, "..."

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 39
    move-result v4

    .line 40
    float-to-int v4, v4

    .line 41
    sub-int/2addr p2, v2

    .line 42
    sub-int/2addr p2, v3

    .line 43
    .line 44
    .line 45
    invoke-static {p2, v4}, Ljava/lang/Math;->max(II)I

    .line 46
    move-result p2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/futures/view/UnderlineDrawableTextView;->c()Z

    .line 50
    move-result v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    .line 61
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 62
    move-result v4

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v1, v4, v5, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    if-eqz v2, :cond_1

    .line 73
    .line 74
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_1
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {p2, v3}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 86
    goto :goto_2

    .line 87
    .line 88
    :cond_2
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {p2, v2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingExtra()F

    .line 96
    move-result v2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    .line 100
    move-result v3

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v2, v3}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 104
    move-result-object p2

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v1}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    iput-object p2, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->e:Landroid/text/StaticLayout;

    .line 115
    .line 116
    if-eqz p2, :cond_3

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Landroid/text/Layout;->getHeight()I

    .line 120
    move-result p2

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    move p2, v1

    .line 123
    .line 124
    :goto_3
    if-eqz v0, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 128
    move-result v1

    .line 129
    .line 130
    .line 131
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 132
    move-result v0

    .line 133
    .line 134
    .line 135
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 136
    move-result p2

    .line 137
    add-int/2addr v0, p2

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 141
    move-result p2

    .line 142
    add-int/2addr v0, p2

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x3

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 148
    move-result p1

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 152
    return-void
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
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final setDrawableStart(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Lcom/kubi/futures/view/UnderlineDrawableTextView;->c:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
