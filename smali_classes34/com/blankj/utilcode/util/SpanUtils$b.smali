.class public Lcom/blankj/utilcode/util/SpanUtils$b;
.super Ljava/lang/Object;
.source "SpanUtils.java"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public e:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->e:Landroid/graphics/Path;

    .line 4
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->b:I

    .line 5
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->c:I

    .line 6
    iput p3, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->d:I

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/blankj/utilcode/util/SpanUtils$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/blankj/utilcode/util/SpanUtils$b;-><init>(III)V

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    .line 1
    .line 2
    check-cast p8, Landroid/text/Spanned;

    .line 3
    .line 4
    .line 5
    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 6
    move-result p6

    .line 7
    .line 8
    if-ne p6, p9, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 12
    move-result-object p6

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 16
    move-result p8

    .line 17
    .line 18
    iget p9, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->b:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    sget-object p9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 30
    move-result p9

    .line 31
    .line 32
    const/high16 p10, 0x40000000    # 2.0f

    .line 33
    .line 34
    if-eqz p9, :cond_1

    .line 35
    .line 36
    iget-object p9, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->e:Landroid/graphics/Path;

    .line 37
    .line 38
    if-nez p9, :cond_0

    .line 39
    .line 40
    new-instance p9, Landroid/graphics/Path;

    .line 41
    .line 42
    .line 43
    invoke-direct {p9}, Landroid/graphics/Path;-><init>()V

    .line 44
    .line 45
    iput-object p9, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->e:Landroid/graphics/Path;

    .line 46
    .line 47
    iget p11, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->c:I

    .line 48
    int-to-float p11, p11

    .line 49
    .line 50
    sget-object p12, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 51
    const/4 v0, 0x0

    .line 52
    .line 53
    .line 54
    invoke-virtual {p9, v0, v0, p11, p12}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 58
    .line 59
    iget p9, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->c:I

    .line 60
    mul-int/2addr p4, p9

    .line 61
    add-int/2addr p3, p4

    .line 62
    int-to-float p3, p3

    .line 63
    add-int/2addr p5, p7

    .line 64
    int-to-float p4, p5

    .line 65
    div-float/2addr p4, p10

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 69
    .line 70
    iget-object p3, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->e:Landroid/graphics/Path;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_1
    iget p9, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->c:I

    .line 80
    mul-int/2addr p4, p9

    .line 81
    add-int/2addr p3, p4

    .line 82
    int-to-float p3, p3

    .line 83
    add-int/2addr p5, p7

    .line 84
    int-to-float p4, p5

    .line 85
    div-float/2addr p4, p10

    .line 86
    int-to-float p5, p9

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 96
    :cond_2
    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 1

    .line 1
    .line 2
    iget p1, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->c:I

    .line 3
    .line 4
    mul-int/lit8 p1, p1, 0x2

    .line 5
    .line 6
    iget v0, p0, Lcom/blankj/utilcode/util/SpanUtils$b;->d:I

    .line 7
    add-int/2addr p1, v0

    .line 8
    return p1
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
.end method
