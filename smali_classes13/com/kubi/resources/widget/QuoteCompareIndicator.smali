.class public final Lcom/kubi/resources/widget/QuoteCompareIndicator;
.super Landroid/view/View;
.source "QuoteCompareIndicator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/QuoteCompareIndicator$a;,
        Lcom/kubi/resources/widget/QuoteCompareIndicator$b;,
        Lcom/kubi/resources/widget/QuoteCompareIndicator$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0003*+,B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0014J\u0012\u0010\"\u001a\u00020\u001a2\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0002J*\u0010#\u001a\u00020\u001a2\u0008\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006-"
    }
    d2 = {
        "Lcom/kubi/resources/widget/QuoteCompareIndicator;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "downPaint",
        "Landroid/graphics/Paint;",
        "upPaint",
        "upCount",
        "downCount",
        "lineWidth",
        "attachWidth",
        "spanWidth",
        "roundSize",
        "indicator",
        "Lcom/kubi/resources/widget/QuoteCompareIndicator$Indicator;",
        "getIndicator",
        "()Lcom/kubi/resources/widget/QuoteCompareIndicator$Indicator;",
        "indicator$delegate",
        "Lkotlin/Lazy;",
        "updateView",
        "",
        "up",
        "down",
        "downColor",
        "upColor",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "drawIndicator",
        "drawLine",
        "indicatorPath",
        "Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;",
        "paint",
        "",
        "getPath",
        "downWidth",
        "Indicator",
        "IndicatorPath",
        "Pos",
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
.field public b:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public final j:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/kubi/resources/widget/QuoteCompareIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/kubi/resources/widget/QuoteCompareIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    const/16 p1, 0x50

    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d:I

    const/4 p1, 0x6

    .line 8
    invoke-static {p0, p1}, Lcom/kubi/utils/extensions/core/c;->d(Landroid/view/View;I)I

    move-result p1

    iput p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    const/4 p1, 0x2

    .line 9
    invoke-static {p0, p1}, Lcom/kubi/utils/extensions/core/c;->d(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->g:I

    const/16 p2, 0x9

    .line 10
    invoke-static {p0, p2}, Lcom/kubi/utils/extensions/core/c;->d(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->h:I

    .line 11
    iget p2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    invoke-static {p0, p1}, Lcom/kubi/utils/extensions/core/c;->d(Landroid/view/View;I)I

    move-result p1

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 12
    new-instance p1, Lcom/kubi/resources/widget/v1;

    invoke-direct {p1}, Lcom/kubi/resources/widget/v1;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->j:Lkotlin/Lazy;

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 13
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 14
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 15
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/resources/widget/QuoteCompareIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final e()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;-><init>(Lcom/kubi/resources/widget/QuoteCompareIndicator$b;Lcom/kubi/resources/widget/QuoteCompareIndicator$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    return-object v0
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

.method public static synthetic g(Lcom/kubi/resources/widget/QuoteCompareIndicator;IIIIILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p6, p5, 0x4

    .line 3
    .line 4
    const-string v0, "getContext(...)"

    .line 5
    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object p3

    .line 11
    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    const/4 p6, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {p3, p6}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 18
    move-result p3

    .line 19
    .line 20
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 21
    .line 22
    if-eqz p5, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    move-result-object p4

    .line 27
    .line 28
    .line 29
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 p5, 0x1

    .line 31
    .line 32
    .line 33
    invoke-static {p4, p5}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 34
    move-result p4

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f(IIII)V

    .line 38
    return-void
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
.end method

.method private final getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->j:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 9
    return-object v0
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
.method public final b(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget-object v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c(Landroid/graphics/Canvas;Lcom/kubi/resources/widget/QuoteCompareIndicator$b;Landroid/graphics/Paint;Z)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 49
    const/4 v2, 0x0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c(Landroid/graphics/Canvas;Lcom/kubi/resources/widget/QuoteCompareIndicator$b;Landroid/graphics/Paint;Z)V

    .line 53
    return-void
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
.end method

.method public final c(Landroid/graphics/Canvas;Lcom/kubi/resources/widget/QuoteCompareIndicator$b;Landroid/graphics/Paint;Z)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Path;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 11
    move-result-object p4

    .line 12
    .line 13
    .line 14
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 15
    move-result p4

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 30
    move-result-object p4

    .line 31
    .line 32
    .line 33
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 34
    move-result p4

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 42
    move-result v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 49
    move-result-object p4

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 53
    move-result p4

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 61
    move-result v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 68
    move-result-object p4

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 72
    move-result p4

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 80
    move-result v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 87
    move-result-object p4

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 91
    move-result p4

    .line 92
    .line 93
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 94
    int-to-float v1, v1

    .line 95
    sub-float/2addr p4, v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 103
    move-result v1

    .line 104
    .line 105
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 106
    .line 107
    div-int/lit8 v2, v2, 0x2

    .line 108
    int-to-float v2, v2

    .line 109
    sub-float/2addr v1, v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 117
    move-result v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 125
    move-result p2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, p4, v1, v2, p2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 129
    goto :goto_0

    .line 130
    .line 131
    .line 132
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 133
    move-result-object p4

    .line 134
    .line 135
    .line 136
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 137
    move-result p4

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 145
    move-result v1

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 152
    move-result-object p4

    .line 153
    .line 154
    .line 155
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 156
    move-result p4

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 164
    move-result v1

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 171
    move-result-object p4

    .line 172
    .line 173
    .line 174
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 175
    move-result p4

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 183
    move-result v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 190
    move-result-object p4

    .line 191
    .line 192
    .line 193
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 194
    move-result p4

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 202
    move-result v1

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 209
    move-result-object p4

    .line 210
    .line 211
    .line 212
    invoke-virtual {p4}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 213
    move-result p4

    .line 214
    .line 215
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 216
    int-to-float v1, v1

    .line 217
    add-float/2addr p4, v1

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 225
    move-result v1

    .line 226
    .line 227
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 228
    .line 229
    div-int/lit8 v2, v2, 0x2

    .line 230
    int-to-float v2, v2

    .line 231
    sub-float/2addr v1, v2

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 235
    move-result-object v2

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 239
    move-result v2

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 243
    move-result-object p2

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->b()F

    .line 247
    move-result p2

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, p4, v1, v2, p2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 251
    .line 252
    .line 253
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 254
    .line 255
    const/high16 p2, 0x3f800000    # 1.0f

    .line 256
    .line 257
    .line 258
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 259
    .line 260
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 264
    .line 265
    sget-object p2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 269
    .line 270
    if-eqz p1, :cond_1

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 274
    :cond_1
    return-void
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
.end method

.method public final d(I)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 7
    add-int/2addr v0, v1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 19
    move-result-object v1

    .line 20
    int-to-float v2, v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    move-result v3

    .line 40
    int-to-float v3, v3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 74
    move-result v2

    .line 75
    .line 76
    iget v3, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 77
    add-int/2addr v2, v3

    .line 78
    int-to-float v2, v2

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 93
    move-result-object v1

    .line 94
    add-int/2addr v0, p1

    .line 95
    .line 96
    iget p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->g:I

    .line 97
    add-int/2addr p1, v0

    .line 98
    .line 99
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->h:I

    .line 100
    sub-int/2addr p1, v2

    .line 101
    int-to-float p1, p1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 120
    move-result v1

    .line 121
    int-to-float v1, v1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->h:I

    .line 139
    sub-int/2addr v0, v1

    .line 140
    int-to-float v0, v0

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 144
    .line 145
    .line 146
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 147
    move-result-object p1

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 159
    move-result v0

    .line 160
    .line 161
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 162
    add-int/2addr v0, v1

    .line 163
    int-to-float v0, v0

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 170
    move-result p1

    .line 171
    .line 172
    iget v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 173
    add-int/2addr p1, v0

    .line 174
    .line 175
    .line 176
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    .line 188
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 201
    move-result v1

    .line 202
    .line 203
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->h:I

    .line 204
    int-to-float v2, v2

    .line 205
    add-float/2addr v1, v2

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 209
    .line 210
    .line 211
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 212
    move-result-object v0

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->d()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 224
    move-result v1

    .line 225
    int-to-float v1, v1

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 229
    .line 230
    .line 231
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 236
    move-result-object v0

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 240
    move-result-object v0

    .line 241
    .line 242
    .line 243
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 244
    move-result-object v1

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 248
    move-result-object v1

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 252
    move-result-object v1

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->a()F

    .line 256
    move-result v1

    .line 257
    .line 258
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->h:I

    .line 259
    int-to-float v2, v2

    .line 260
    add-float/2addr v1, v2

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 264
    .line 265
    .line 266
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 267
    move-result-object v0

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 271
    move-result-object v0

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->c()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 275
    move-result-object v0

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 279
    move-result v1

    .line 280
    .line 281
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 282
    add-int/2addr v1, v2

    .line 283
    int-to-float v1, v1

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 287
    .line 288
    .line 289
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 290
    move-result-object v0

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 294
    move-result-object v0

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 298
    move-result-object v0

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 302
    move-result v1

    .line 303
    sub-int/2addr v1, p1

    .line 304
    int-to-float v1, v1

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 308
    .line 309
    .line 310
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 311
    move-result-object v0

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 315
    move-result-object v0

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 319
    move-result-object v0

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 323
    move-result v1

    .line 324
    int-to-float v1, v1

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 328
    .line 329
    .line 330
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 331
    move-result-object v0

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 335
    move-result-object v0

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 339
    move-result-object v0

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 343
    move-result v1

    .line 344
    sub-int/2addr v1, p1

    .line 345
    int-to-float p1, v1

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->c(F)V

    .line 349
    .line 350
    .line 351
    invoke-direct {p0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->getIndicator()Lcom/kubi/resources/widget/QuoteCompareIndicator$a;

    .line 352
    move-result-object p1

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$a;->b()Lcom/kubi/resources/widget/QuoteCompareIndicator$b;

    .line 356
    move-result-object p1

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator$b;->a()Lcom/kubi/resources/widget/QuoteCompareIndicator$c;

    .line 360
    move-result-object p1

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 364
    move-result v0

    .line 365
    .line 366
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 367
    add-int/2addr v0, v1

    .line 368
    int-to-float v0, v0

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator$c;->d(F)V

    .line 372
    return-void
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

.method public final f(IIII)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d:I

    .line 3
    .line 4
    iput p2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e:I

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    iget v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d:I

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e:I

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    move-result v0

    .line 21
    .line 22
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e:I

    .line 23
    .line 24
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d:I

    .line 25
    add-int/2addr v1, v2

    .line 26
    div-int/2addr v0, v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    move-result v0

    .line 31
    .line 32
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e:I

    .line 33
    .line 34
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d:I

    .line 35
    add-int/2addr v2, v1

    .line 36
    div-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b(Landroid/graphics/Canvas;)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_0
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e:I

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    move-result v0

    .line 55
    .line 56
    iget-object v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 57
    .line 58
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 59
    int-to-float v2, v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 63
    .line 64
    iget-object v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 65
    .line 66
    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 73
    move-result v1

    .line 74
    .line 75
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 76
    add-int/2addr v1, v2

    .line 77
    int-to-float v3, v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 81
    move-result v1

    .line 82
    .line 83
    iget v2, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 84
    add-int/2addr v1, v2

    .line 85
    int-to-float v4, v1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 89
    move-result v1

    .line 90
    sub-int/2addr v0, v1

    .line 91
    .line 92
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 93
    sub-int/2addr v0, v1

    .line 94
    int-to-float v5, v0

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 98
    move-result v0

    .line 99
    .line 100
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 101
    add-int/2addr v0, v1

    .line 102
    int-to-float v6, v0

    .line 103
    .line 104
    iget-object v7, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->c:Landroid/graphics/Paint;

    .line 105
    move-object v2, p1

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 109
    return-void

    .line 110
    :cond_1
    move-object v2, p1

    .line 111
    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    iget p1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->e:I

    .line 115
    .line 116
    if-eqz p1, :cond_2

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 120
    move-result p1

    .line 121
    .line 122
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 123
    .line 124
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->f:I

    .line 125
    int-to-float v1, v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 129
    .line 130
    iget-object v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 131
    .line 132
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 139
    move-result v0

    .line 140
    .line 141
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 142
    add-int/2addr v0, v1

    .line 143
    int-to-float v9, v0

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 147
    move-result v0

    .line 148
    .line 149
    iget v1, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 150
    add-int/2addr v0, v1

    .line 151
    int-to-float v10, v0

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 155
    move-result v0

    .line 156
    sub-int/2addr p1, v0

    .line 157
    .line 158
    iget v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 159
    sub-int/2addr p1, v0

    .line 160
    int-to-float v11, p1

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 164
    move-result p1

    .line 165
    .line 166
    iget v0, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->i:I

    .line 167
    add-int/2addr p1, v0

    .line 168
    int-to-float v12, p1

    .line 169
    .line 170
    iget-object v13, p0, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b:Landroid/graphics/Paint;

    .line 171
    move-object v8, v2

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 175
    return-void

    .line 176
    .line 177
    .line 178
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 182
    move-result p1

    .line 183
    .line 184
    div-int/lit8 p1, p1, 0x2

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->d(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/QuoteCompareIndicator;->b(Landroid/graphics/Canvas;)V

    .line 191
    return-void
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
