.class public final Landroidx/camera/core/impl/CameraMode;
.super Ljava/lang/Object;
.source "CameraMode.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/CameraMode$Mode;
    }
.end annotation


# static fields
.field public static final CONCURRENT_CAMERA:I = 0x1

.field public static final DEFAULT:I = 0x0

.field public static final ULTRA_HIGH_RESOLUTION_CAMERA:I = 0x2


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

.method public static toLabelString(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const-string p0, "DEFAULT"

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    const-string p0, "ULTRA_HIGH_RESOLUTION_CAMERA"

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_1
    const-string p0, "CONCURRENT_CAMERA"

    .line 15
    return-object p0
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
