.class final Landroidx/camera/core/impl/utils/Exif$Speed;
.super Ljava/lang/Object;
.source "Exif.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/utils/Exif;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Speed"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/Exif$Speed$Converter;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static fromKilometersPerHour(D)Landroidx/camera/core/impl/utils/Exif$Speed$Converter;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/utils/Exif$Speed$Converter;

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v1, 0x3fe3e2456f75d9a1L    # 0.621371

    .line 8
    mul-double/2addr p0, v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Landroidx/camera/core/impl/utils/Exif$Speed$Converter;-><init>(D)V

    .line 12
    return-object v0
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

.method public static fromKnots(D)Landroidx/camera/core/impl/utils/Exif$Speed$Converter;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/utils/Exif$Speed$Converter;

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v1, 0x3ff269984a0e410bL    # 1.15078

    .line 8
    mul-double/2addr p0, v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Landroidx/camera/core/impl/utils/Exif$Speed$Converter;-><init>(D)V

    .line 12
    return-object v0
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

.method public static fromMilesPerHour(D)Landroidx/camera/core/impl/utils/Exif$Speed$Converter;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/utils/Exif$Speed$Converter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Landroidx/camera/core/impl/utils/Exif$Speed$Converter;-><init>(D)V

    .line 6
    return-object v0
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
