.class public Landroidx/camera/core/impl/utils/SurfaceUtil;
.super Ljava/lang/Object;
.source "SurfaceUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;
    }
.end annotation


# static fields
.field public static final JNI_LIB_NAME:Ljava/lang/String; = "surface_util_jni"

.field private static final TAG:Ljava/lang/String; = "SurfaceUtil"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "surface_util_jni"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 7
    return-void
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

.method public static getSurfaceInfo(Landroid/view/Surface;)Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/camera/core/impl/utils/SurfaceUtil;->nativeGetSurfaceInfo(Landroid/view/Surface;)[I

    .line 4
    move-result-object p0

    .line 5
    .line 6
    new-instance v0, Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;-><init>()V

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    aget v1, p0, v1

    .line 13
    .line 14
    iput v1, v0, Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;->format:I

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    aget v1, p0, v1

    .line 18
    .line 19
    iput v1, v0, Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;->width:I

    .line 20
    const/4 v1, 0x2

    .line 21
    .line 22
    aget p0, p0, v1

    .line 23
    .line 24
    iput p0, v0, Landroidx/camera/core/impl/utils/SurfaceUtil$SurfaceInfo;->height:I

    .line 25
    return-object v0
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
.end method

.method private static native nativeGetSurfaceInfo(Landroid/view/Surface;)[I
.end method
