.class public interface abstract Landroidx/camera/core/concurrent/CameraCoordinator;
.super Ljava/lang/Object;
.source "CameraCoordinator.java"

# interfaces
.implements Landroidx/camera/core/impl/InternalCameraPresenceListener;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/concurrent/CameraCoordinator$ConcurrentCameraModeListener;,
        Landroidx/camera/core/concurrent/CameraCoordinator$CameraOperatingMode;
    }
.end annotation


# static fields
.field public static final CAMERA_OPERATING_MODE_CONCURRENT:I = 0x2

.field public static final CAMERA_OPERATING_MODE_SINGLE:I = 0x1

.field public static final CAMERA_OPERATING_MODE_UNSPECIFIED:I


# virtual methods
.method public abstract addListener(Landroidx/camera/core/concurrent/CameraCoordinator$ConcurrentCameraModeListener;)V
.end method

.method public abstract getActiveConcurrentCameraInfos()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/CameraInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCameraOperatingMode()I
.end method

.method public abstract getConcurrentCameraSelectors()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/camera/core/CameraSelector;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getPairedConcurrentCameraId(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public init(Landroidx/camera/core/impl/CameraRepository;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public abstract removeListener(Landroidx/camera/core/concurrent/CameraCoordinator$ConcurrentCameraModeListener;)V
.end method

.method public abstract setActiveConcurrentCameraInfos(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/CameraInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setCameraOperatingMode(I)V
.end method

.method public abstract shutdown()V
.end method
