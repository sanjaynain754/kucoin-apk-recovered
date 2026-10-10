.class public abstract Landroidx/camera/core/MeteringPointFactory;
.super Ljava/lang/Object;
.source "MeteringPointFactory.java"


# instance fields
.field private mSurfaceAspectRatio:Landroid/util/Rational;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Landroidx/camera/core/MeteringPointFactory;-><init>(Landroid/util/Rational;)V

    return-void
.end method

.method public constructor <init>(Landroid/util/Rational;)V
    .locals 0
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/core/MeteringPointFactory;->mSurfaceAspectRatio:Landroid/util/Rational;

    return-void
.end method

.method public static getDefaultPointSize()F
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, 0x3e19999a    # 0.15f

    .line 4
    return v0
    .line 5
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
.end method


# virtual methods
.method public abstract convertPoint(FF)Landroid/graphics/PointF;
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end method

.method public final createPoint(FF)Landroidx/camera/core/MeteringPoint;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/MeteringPointFactory;->getDefaultPointSize()F

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/camera/core/MeteringPointFactory;->createPoint(FFF)Landroidx/camera/core/MeteringPoint;

    move-result-object p1

    return-object p1
.end method

.method public final createPoint(FFF)Landroidx/camera/core/MeteringPoint;
    .locals 2

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/MeteringPointFactory;->convertPoint(FF)Landroid/graphics/PointF;

    move-result-object p1

    .line 3
    new-instance p2, Landroidx/camera/core/MeteringPoint;

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    iget-object v1, p0, Landroidx/camera/core/MeteringPointFactory;->mSurfaceAspectRatio:Landroid/util/Rational;

    invoke-direct {p2, v0, p1, p3, v1}, Landroidx/camera/core/MeteringPoint;-><init>(FFFLandroid/util/Rational;)V

    return-object p2
.end method

.method public setSurfaceAspectRatio(Landroid/util/Rational;)V
    .locals 0
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/core/MeteringPointFactory;->mSurfaceAspectRatio:Landroid/util/Rational;

    .line 3
    return-void
    .line 4
    .line 5
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
.end method
