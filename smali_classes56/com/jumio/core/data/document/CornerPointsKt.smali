.class public final Lcom/jumio/core/data/document/CornerPointsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0005\u001a\u0014\u0010\u0008\u001a\u00020\t*\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002\u001a\u000c\u0010\u000b\u001a\u00020\n*\u00020\u000cH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "MIN_VALID_WIDTH",
        "",
        "MIN_VALID_HEIGHT",
        "distanceTo",
        "",
        "Landroid/graphics/PointF;",
        "other",
        "copy",
        "isAtLeast",
        "",
        "Lcom/jumio/commons/camera/Size;",
        "toSize",
        "Landroid/graphics/RectF;",
        "jumio-core_release"
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
.method public static final access$isAtLeast(Lcom/jumio/commons/camera/Size;Lcom/jumio/commons/camera/Size;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 14
    move-result p0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 18
    move-result p1

    .line 19
    .line 20
    if-lt p0, p1, :cond_0

    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
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
.end method

.method public static final access$toSize(Landroid/graphics/RectF;)Lcom/jumio/commons/camera/Size;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/commons/camera/Size;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/RectF;->width()F

    .line 6
    move-result v1

    .line 7
    float-to-int v1, v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/RectF;->height()F

    .line 11
    move-result p0

    .line 12
    float-to-int p0, p0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, p0}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final copy(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 2
    .param p0    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/PointF;

    .line 8
    .line 9
    iget v1, p0, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, p0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final distanceTo(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 4
    .param p0    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "other"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 13
    .line 14
    iget v1, p0, Landroid/graphics/PointF;->x:F

    .line 15
    sub-float/2addr v0, v1

    .line 16
    float-to-double v0, v0

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-double v2, v2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 22
    move-result-wide v0

    .line 23
    double-to-float v0, v0

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 26
    .line 27
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 28
    sub-float/2addr p1, p0

    .line 29
    float-to-double p0, p1

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 33
    move-result-wide p0

    .line 34
    double-to-float p0, p0

    .line 35
    add-float/2addr v0, p0

    .line 36
    float-to-double p0, v0

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 40
    move-result-wide p0

    .line 41
    double-to-float p0, p0

    .line 42
    return p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
