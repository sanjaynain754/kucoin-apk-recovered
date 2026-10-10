.class public final Lcom/kubi/resources/widget/interpolator/KcInterpolatorsKt;
.super Ljava/lang/Object;
.source "KcInterpolators.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "create",
        "Landroid/view/animation/Interpolator;",
        "Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;",
        "Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;",
        "LComponent_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final create(Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;)Landroid/view/animation/Interpolator;
    .locals 3
    .param p0    # Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;->getX1()F

    move-result v0

    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;->getY1()F

    move-result v1

    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;->getX2()F

    move-result v2

    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;->getY2()F

    move-result p0

    invoke-static {v0, v1, v2, p0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0

    const-string v0, "create(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final create(Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;)Landroid/view/animation/Interpolator;
    .locals 3
    .param p0    # Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;->getX1()F

    move-result v0

    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;->getY1()F

    move-result v1

    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;->getX2()F

    move-result v2

    invoke-virtual {p0}, Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;->getY2()F

    move-result p0

    invoke-static {v0, v1, v2, p0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0

    const-string v0, "create(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
