.class public Landroidx/camera/camera2/internal/compat/workaround/MeteringRegionCorrection;
.super Ljava/lang/Object;
.source "MeteringRegionCorrection.java"


# instance fields
.field private final mCameraQuirks:Landroidx/camera/core/impl/Quirks;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/Quirks;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/workaround/MeteringRegionCorrection;->mCameraQuirks:Landroidx/camera/core/impl/Quirks;

    .line 6
    return-void
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
.end method


# virtual methods
.method public getCorrectedPoint(Landroidx/camera/core/MeteringPoint;I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/camera/camera2/internal/compat/workaround/MeteringRegionCorrection;->mCameraQuirks:Landroidx/camera/core/impl/Quirks;

    .line 6
    .line 7
    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/AfRegionFlipHorizontallyQuirk;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v0}, Landroidx/camera/core/impl/Quirks;->contains(Ljava/lang/Class;)Z

    .line 11
    move-result p2

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Landroid/graphics/PointF;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/camera/core/MeteringPoint;->getX()F

    .line 19
    move-result v0

    .line 20
    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    sub-float/2addr v1, v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/camera/core/MeteringPoint;->getY()F

    .line 26
    move-result p1

    .line 27
    .line 28
    .line 29
    invoke-direct {p2, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 30
    return-object p2

    .line 31
    .line 32
    :cond_0
    new-instance p2, Landroid/graphics/PointF;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/camera/core/MeteringPoint;->getX()F

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/camera/core/MeteringPoint;->getY()F

    .line 40
    move-result p1

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 44
    return-object p2
    .line 45
.end method
