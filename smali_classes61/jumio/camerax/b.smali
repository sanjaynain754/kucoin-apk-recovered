.class public abstract Ljumio/camerax/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/hardware/camera2/params/ColorSpaceTransform;)Landroid/hardware/camera2/params/ColorSpaceTransform;
    .locals 6

    const/16 v0, 0x9

    .line 1
    new-array v1, v0, [Landroid/util/Rational;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    sget-object v4, Landroid/util/Rational;->ZERO:Landroid/util/Rational;

    const-string v5, "ZERO"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, v1, v2}, Landroid/hardware/camera2/params/ColorSpaceTransform;->copyElements([Landroid/util/Rational;I)V

    .line 3
    new-instance p0, Landroid/hardware/camera2/params/ColorSpaceTransform;

    invoke-direct {p0, v1}, Landroid/hardware/camera2/params/ColorSpaceTransform;-><init>([Landroid/util/Rational;)V

    return-object p0
.end method

.method public static final a(Landroid/hardware/camera2/params/RggbChannelVector;)Landroid/hardware/camera2/params/RggbChannelVector;
    .locals 4

    .line 4
    new-instance v0, Landroid/hardware/camera2/params/RggbChannelVector;

    invoke-virtual {p0}, Landroid/hardware/camera2/params/RggbChannelVector;->getRed()F

    move-result v1

    invoke-virtual {p0}, Landroid/hardware/camera2/params/RggbChannelVector;->getGreenEven()F

    move-result v2

    invoke-virtual {p0}, Landroid/hardware/camera2/params/RggbChannelVector;->getGreenOdd()F

    move-result v3

    invoke-virtual {p0}, Landroid/hardware/camera2/params/RggbChannelVector;->getBlue()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/hardware/camera2/params/RggbChannelVector;-><init>(FFFF)V

    return-object v0
.end method
