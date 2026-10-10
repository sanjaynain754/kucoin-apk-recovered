.class public final Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;
.super Ljava/lang/Object;
.source "ConcurrentCamera.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ConcurrentCamera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SingleCameraConfig"
.end annotation


# instance fields
.field private mCameraSelector:Landroidx/camera/core/CameraSelector;

.field private mCompositionSettings:Landroidx/camera/core/CompositionSettings;

.field private mLifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

.field private mUseCaseGroup:Landroidx/camera/core/UseCaseGroup;


# direct methods
.method public constructor <init>(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;Landroidx/camera/core/CompositionSettings;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mCameraSelector:Landroidx/camera/core/CameraSelector;

    .line 4
    iput-object p2, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mUseCaseGroup:Landroidx/camera/core/UseCaseGroup;

    .line 5
    iput-object p3, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mCompositionSettings:Landroidx/camera/core/CompositionSettings;

    .line 6
    iput-object p4, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mLifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/core/CompositionSettings;->DEFAULT:Landroidx/camera/core/CompositionSettings;

    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;-><init>(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;Landroidx/camera/core/CompositionSettings;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method


# virtual methods
.method public getCameraSelector()Landroidx/camera/core/CameraSelector;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mCameraSelector:Landroidx/camera/core/CameraSelector;

    .line 3
    return-object v0
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
.end method

.method public getCompositionSettings()Landroidx/camera/core/CompositionSettings;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mCompositionSettings:Landroidx/camera/core/CompositionSettings;

    .line 3
    return-object v0
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
.end method

.method public getLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mLifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 3
    return-object v0
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
.end method

.method public getUseCaseGroup()Landroidx/camera/core/UseCaseGroup;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;->mUseCaseGroup:Landroidx/camera/core/UseCaseGroup;

    .line 3
    return-object v0
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
.end method
