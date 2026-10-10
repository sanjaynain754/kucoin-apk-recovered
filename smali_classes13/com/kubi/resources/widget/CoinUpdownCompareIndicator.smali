.class public final Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;
.super Landroid/view/View;
.source "CoinUpdownCompareIndicator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;,
        Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0002\'(B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "lineHeight",
        "",
        "dividerMarginHorizontal",
        "upCount",
        "unchangeCount",
        "downCount",
        "upPaint",
        "Landroid/graphics/Paint;",
        "downPaint",
        "unchangePaint",
        "upPath",
        "Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$IndicatorPath;",
        "downPath",
        "updateView",
        "",
        "up",
        "unchange",
        "down",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "drawAllLine",
        "totalCount",
        "drawSingleLine",
        "paint",
        "drawUpLine",
        "drawDownLine",
        "dp2px",
        "size",
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
.field public b:F

.field public c:F

.field public d:I

.field public e:I

.field public f:I

.field public final g:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;
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

    invoke-direct/range {v1 .. v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10
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
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->g:Landroid/graphics/Paint;

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->h:Landroid/graphics/Paint;

    .line 7
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->i:Landroid/graphics/Paint;

    .line 8
    new-instance v2, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;-><init>(Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 9
    new-instance v3, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;-><init>(Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 10
    invoke-virtual {p0, v3, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 11
    sget-object v2, Lcom/kubi/sdk/res/R$styleable;->CoinUpdownCompareIndicator:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget v2, Lcom/kubi/sdk/res/R$styleable;->CoinUpdownCompareIndicator_cuci_upColor:I

    const/4 v4, -0x1

    .line 13
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    const/16 v5, 0x66

    if-ne v2, v4, :cond_0

    .line 14
    invoke-static {p1}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    move-result v2

    .line 15
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v6

    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    move-result v7

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {v5, v6, v7, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    .line 16
    :cond_0
    sget v6, Lcom/kubi/sdk/res/R$styleable;->CoinUpdownCompareIndicator_cuci_unchangeColor:I

    .line 17
    sget v7, Lcom/kubi/sdk/res/R$color;->c_cover8:I

    invoke-static {p1, v7}, Lcom/kubi/utils/extensions/k;->n(Landroid/content/Context;I)I

    move-result v7

    .line 18
    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    .line 19
    sget v7, Lcom/kubi/sdk/res/R$styleable;->CoinUpdownCompareIndicator_cuci_downColor:I

    .line 20
    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    if-ne v7, v4, :cond_1

    .line 21
    invoke-static {p1}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    move-result p1

    .line 22
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v7

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-static {v5, v4, v7, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    .line 23
    :cond_1
    sget p1, Lcom/kubi/sdk/res/R$styleable;->CoinUpdownCompareIndicator_cuci_lineHeight:I

    const/4 v4, 0x3

    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->a(I)F

    move-result v4

    .line 24
    invoke-virtual {p2, p1, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 25
    sget p1, Lcom/kubi/sdk/res/R$styleable;->CoinUpdownCompareIndicator_cuci_dividerMarginHorizontal:I

    const/4 v4, 0x2

    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->a(I)F

    move-result v4

    .line 26
    invoke-virtual {p2, p1, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->c:F

    .line 27
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    invoke-virtual {p3, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 30
    iget p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 31
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 32
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 33
    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    iget p2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    sget-object p2, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 36
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 38
    iget p2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(I)F
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
    int-to-float p1, p1

    .line 12
    mul-float/2addr p1, v0

    .line 13
    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    add-float/2addr p1, v0

    .line 16
    return p1
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
.end method

.method public final b(Landroid/graphics/Canvas;I)V
    .locals 11

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d:I

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->e:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->f:I

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    const/4 v0, 0x2

    .line 14
    int-to-float v0, v0

    .line 15
    .line 16
    iget v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->c:F

    .line 17
    mul-float/2addr v0, v1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->c:F

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    sub-float/2addr v1, v0

    .line 27
    .line 28
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d:I

    .line 29
    int-to-float v0, v0

    .line 30
    mul-float/2addr v0, v1

    .line 31
    int-to-float p2, p2

    .line 32
    div-float/2addr v0, p2

    .line 33
    .line 34
    iget v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->e:I

    .line 35
    int-to-float v2, v2

    .line 36
    mul-float/2addr v2, v1

    .line 37
    div-float/2addr v2, p2

    .line 38
    .line 39
    iget v3, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->f:I

    .line 40
    int-to-float v3, v3

    .line 41
    mul-float/2addr v1, v3

    .line 42
    div-float/2addr v1, p2

    .line 43
    const/4 p2, 0x0

    .line 44
    .line 45
    cmpl-float v3, v0, p2

    .line 46
    .line 47
    const/high16 v4, 0x40000000    # 2.0f

    .line 48
    .line 49
    if-lez v3, :cond_1

    .line 50
    .line 51
    iget v5, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 52
    div-float/2addr v5, v4

    .line 53
    .line 54
    iget-object v6, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v5}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 62
    .line 63
    iget-object v6, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, p2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 71
    .line 72
    iget-object v6, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v5}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 80
    .line 81
    iget-object v6, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 85
    move-result-object v6

    .line 86
    .line 87
    iget v7, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v7}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 91
    .line 92
    iget-object v6, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 96
    move-result-object v6

    .line 97
    add-float/2addr v5, v0

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v5}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 101
    .line 102
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 110
    .line 111
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v5}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 119
    .line 120
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    iget v5, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v5}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->e(Landroid/graphics/Canvas;)V

    .line 133
    .line 134
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 142
    move-result v0

    .line 143
    .line 144
    if-lez v3, :cond_2

    .line 145
    .line 146
    iget v3, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->c:F

    .line 147
    goto :goto_1

    .line 148
    :cond_2
    move v3, p2

    .line 149
    .line 150
    :goto_1
    add-float v6, v0, v3

    .line 151
    .line 152
    cmpl-float v0, v2, p2

    .line 153
    .line 154
    if-lez v0, :cond_3

    .line 155
    .line 156
    add-float v8, v6, v2

    .line 157
    .line 158
    iget v9, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 159
    .line 160
    iget-object v10, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->i:Landroid/graphics/Paint;

    .line 161
    const/4 v7, 0x0

    .line 162
    move-object v5, p1

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 166
    goto :goto_2

    .line 167
    :cond_3
    move-object v5, p1

    .line 168
    .line 169
    :goto_2
    cmpl-float p1, v1, p2

    .line 170
    .line 171
    if-lez p1, :cond_4

    .line 172
    add-float/2addr v6, v2

    .line 173
    .line 174
    iget p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->c:F

    .line 175
    add-float/2addr v6, p1

    .line 176
    .line 177
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 181
    move-result-object p1

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 185
    .line 186
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 194
    .line 195
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v6}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 203
    .line 204
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 208
    move-result-object p1

    .line 209
    .line 210
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 214
    .line 215
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 223
    move-result v0

    .line 224
    int-to-float v0, v0

    .line 225
    .line 226
    iget v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 227
    div-float/2addr v1, v4

    .line 228
    sub-float/2addr v0, v1

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 232
    .line 233
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 237
    move-result-object p1

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 241
    .line 242
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 250
    move-result p2

    .line 251
    int-to-float p2, p2

    .line 252
    .line 253
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 254
    div-float/2addr v0, v4

    .line 255
    sub-float/2addr p2, v0

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->c(F)V

    .line 259
    .line 260
    iget-object p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 264
    move-result-object p1

    .line 265
    .line 266
    iget p2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->d(F)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->c(Landroid/graphics/Canvas;)V

    .line 273
    :cond_4
    return-void
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

.method public final c(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Path;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 15
    move-result v1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 29
    .line 30
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 38
    move-result v1

    .line 39
    .line 40
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 48
    move-result v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 52
    .line 53
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 61
    move-result v1

    .line 62
    .line 63
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 71
    move-result v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 75
    .line 76
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 84
    move-result v1

    .line 85
    .line 86
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 94
    move-result v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 101
    move-result v1

    .line 102
    int-to-float v1, v1

    .line 103
    .line 104
    iget v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 105
    sub-float/2addr v1, v2

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 109
    move-result v2

    .line 110
    int-to-float v3, v2

    .line 111
    .line 112
    iget v4, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 113
    .line 114
    const/high16 v6, 0x43340000    # 180.0f

    .line 115
    const/4 v7, 0x1

    .line 116
    const/4 v2, 0x0

    .line 117
    .line 118
    const/high16 v5, -0x3d4c0000    # -90.0f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 125
    .line 126
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->h:Landroid/graphics/Paint;

    .line 127
    .line 128
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 132
    .line 133
    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 137
    .line 138
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->h:Landroid/graphics/Paint;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 142
    return-void
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

.method public final d(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 10

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 3
    .line 4
    const/high16 v1, 0x40000000    # 2.0f

    .line 5
    .line 6
    div-float v7, v0, v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    move-result v0

    .line 11
    int-to-float v5, v0

    .line 12
    .line 13
    iget v6, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move v8, v7

    .line 17
    move-object v2, p1

    .line 18
    move-object v9, p2

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 22
    return-void
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
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Path;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 15
    move-result v1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->d()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 29
    .line 30
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 38
    move-result v1

    .line 39
    .line 40
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->b()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 48
    move-result v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 52
    .line 53
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 61
    move-result v1

    .line 62
    .line 63
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->a()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 71
    move-result v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 75
    .line 76
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->a()F

    .line 84
    move-result v1

    .line 85
    .line 86
    iget-object v2, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->c()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$b;->b()F

    .line 94
    move-result v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 98
    .line 99
    iget v3, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b:F

    .line 100
    .line 101
    const/high16 v6, 0x43340000    # 180.0f

    .line 102
    const/4 v7, 0x1

    .line 103
    const/4 v1, 0x0

    .line 104
    const/4 v2, 0x0

    .line 105
    .line 106
    const/high16 v5, -0x3c790000    # -270.0f

    .line 107
    move v4, v3

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 114
    .line 115
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->g:Landroid/graphics/Paint;

    .line 116
    .line 117
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 121
    .line 122
    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 126
    .line 127
    iget-object v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->g:Landroid/graphics/Paint;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 131
    return-void
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

.method public final f(III)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 5
    move-result p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d:I

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 11
    move-result p1

    .line 12
    .line 13
    iput p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->e:I

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 17
    move-result p1

    .line 18
    .line 19
    iput p1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->f:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 23
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4
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
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->j:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->e()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->k:Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$a;->e()V

    .line 19
    .line 20
    iget v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d:I

    .line 21
    .line 22
    iget v1, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->e:I

    .line 23
    .line 24
    add-int v2, v0, v1

    .line 25
    .line 26
    iget v3, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->f:I

    .line 27
    add-int/2addr v2, v3

    .line 28
    .line 29
    if-gtz v2, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->i:Landroid/graphics/Paint;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_0
    if-lez v0, :cond_1

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->g:Landroid/graphics/Paint;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 47
    return-void

    .line 48
    .line 49
    :cond_1
    if-nez v0, :cond_2

    .line 50
    .line 51
    if-lez v1, :cond_2

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->i:Landroid/graphics/Paint;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 59
    return-void

    .line 60
    .line 61
    :cond_2
    if-nez v0, :cond_3

    .line 62
    .line 63
    if-nez v1, :cond_3

    .line 64
    .line 65
    if-lez v3, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->h:Landroid/graphics/Paint;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 71
    return-void

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-virtual {p0, p1, v2}, Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;->b(Landroid/graphics/Canvas;I)V

    .line 75
    return-void
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
