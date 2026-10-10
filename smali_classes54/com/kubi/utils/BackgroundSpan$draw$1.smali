.class final Lcom/kubi/utils/BackgroundSpan$draw$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BackgroundSpan.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/utils/BackgroundSpan;->draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/graphics/Paint;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/graphics/Paint;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $canvas:Landroid/graphics/Canvas;

.field final synthetic $end:I

.field final synthetic $fullHeight:I

.field final synthetic $newTextHeight:F

.field final synthetic $newTextTop:F

.field final synthetic $newTextWidth:F

.field final synthetic $oldTextWidth:I

.field final synthetic $paint:Landroid/graphics/Paint;

.field final synthetic $start:I

.field final synthetic $text:Ljava/lang/CharSequence;

.field final synthetic $top:I

.field final synthetic $x:F


# direct methods
.method public constructor <init>(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIFIIFFLandroid/graphics/Paint;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$canvas:Landroid/graphics/Canvas;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$text:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iput p3, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$start:I

    .line 7
    .line 8
    iput p4, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$end:I

    .line 9
    .line 10
    iput p5, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$x:F

    .line 11
    .line 12
    iput p6, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$oldTextWidth:I

    .line 13
    .line 14
    iput p7, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$newTextWidth:F

    .line 15
    .line 16
    iput p8, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$top:I

    .line 17
    .line 18
    iput p9, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$fullHeight:I

    .line 19
    .line 20
    iput p10, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$newTextHeight:F

    .line 21
    .line 22
    iput p11, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$newTextTop:F

    .line 23
    .line 24
    iput-object p12, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$paint:Landroid/graphics/Paint;

    .line 25
    const/4 p1, 0x1

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 29
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Lcom/kubi/utils/BackgroundSpan$draw$1;->invoke(Landroid/graphics/Paint;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/graphics/Paint;)V
    .locals 8
    .param p1    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$canvas:Landroid/graphics/Canvas;

    .line 3
    iget-object v2, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$text:Ljava/lang/CharSequence;

    .line 4
    iget v3, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$start:I

    .line 5
    iget v4, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$end:I

    .line 6
    iget p1, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$x:F

    iget v0, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$oldTextWidth:I

    int-to-float v0, v0

    iget v5, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$newTextWidth:F

    sub-float/2addr v0, v5

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v0, v5

    add-float/2addr p1, v0

    .line 7
    iget v0, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$top:I

    int-to-float v0, v0

    iget v6, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$fullHeight:I

    int-to-float v6, v6

    iget v7, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$newTextHeight:F

    sub-float/2addr v6, v7

    div-float/2addr v6, v5

    add-float/2addr v0, v6

    iget v5, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$newTextTop:F

    add-float v6, v0, v5

    .line 8
    iget-object v7, p0, Lcom/kubi/utils/BackgroundSpan$draw$1;->$paint:Landroid/graphics/Paint;

    move v5, p1

    .line 9
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    return-void
.end method
