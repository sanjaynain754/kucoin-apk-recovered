.class public Lcom/blankj/utilcode/util/SpanUtils$f;
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
    name = "f"
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->b:I

    .line 4
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->c:I

    .line 5
    iput p3, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->d:I

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/blankj/utilcode/util/SpanUtils$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/blankj/utilcode/util/SpanUtils$f;-><init>(III)V

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 4
    move-result-object p6

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 8
    move-result p8

    .line 9
    .line 10
    sget-object p9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    iget p9, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->b:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    int-to-float v1, p3

    .line 20
    int-to-float v2, p5

    .line 21
    .line 22
    iget p5, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->c:I

    .line 23
    mul-int/2addr p4, p5

    .line 24
    add-int/2addr p3, p4

    .line 25
    int-to-float v3, p3

    .line 26
    int-to-float v4, p7

    .line 27
    move-object v0, p1

    .line 28
    move-object v5, p2

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

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
.end method

.method public getLeadingMargin(Z)I
    .locals 1

    .line 1
    .line 2
    iget p1, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->c:I

    .line 3
    .line 4
    iget v0, p0, Lcom/blankj/utilcode/util/SpanUtils$f;->d:I

    .line 5
    add-int/2addr p1, v0

    .line 6
    return p1
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
.end method
