.class public abstract Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Landroid/graphics/Rect;FF)Landroid/graphics/Rect;
    .locals 4

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 8
    new-instance p0, Landroid/graphics/Rect;

    .line 9
    iget v1, v0, Landroid/graphics/RectF;->left:F

    mul-float/2addr v1, p1

    float-to-int v1, v1

    .line 10
    iget v2, v0, Landroid/graphics/RectF;->top:F

    mul-float/2addr v2, p2

    float-to-int v2, v2

    .line 11
    iget v3, v0, Landroid/graphics/RectF;->right:F

    mul-float/2addr v3, p1

    float-to-int p1, v3

    .line 12
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v0, p2

    float-to-int p2, v0

    .line 13
    invoke-direct {p0, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;
    .locals 1

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/h;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    .line 2
    sget-object p0, Landroidx/camera/video/Quality;->SD:Landroidx/camera/video/Quality;

    return-object p0

    .line 3
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 4
    :cond_1
    sget-object p0, Landroidx/camera/video/Quality;->HD:Landroidx/camera/video/Quality;

    return-object p0

    .line 5
    :cond_2
    sget-object p0, Landroidx/camera/video/Quality;->FHD:Landroidx/camera/video/Quality;

    return-object p0

    .line 6
    :cond_3
    sget-object p0, Landroidx/camera/video/Quality;->UHD:Landroidx/camera/video/Quality;

    return-object p0
.end method
