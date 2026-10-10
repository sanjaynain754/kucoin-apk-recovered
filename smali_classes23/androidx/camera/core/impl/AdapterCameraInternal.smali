.class public Landroidx/camera/core/impl/AdapterCameraInternal;
.super Ljava/lang/Object;
.source "AdapterCameraInternal.java"

# interfaces
.implements Landroidx/camera/core/impl/CameraInternal;


# instance fields
.field private final mAdapterCameraControl:Landroidx/camera/core/impl/AdapterCameraControl;

.field private final mAdapterCameraInfo:Landroidx/camera/core/impl/AdapterCameraInfo;

.field private final mCameraInternal:Landroidx/camera/core/impl/CameraInternal;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/CameraInternal;Landroidx/camera/core/impl/AdapterCameraInfo;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mAdapterCameraInfo:Landroidx/camera/core/impl/AdapterCameraInfo;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroidx/camera/core/impl/AdapterCameraInfo;->getCameraConfig()Landroidx/camera/core/impl/CameraConfig;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    new-instance v0, Landroidx/camera/core/impl/AdapterCameraControl;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Landroidx/camera/core/impl/CameraInternal;->getCameraControlInternal()Landroidx/camera/core/impl/CameraControlInternal;

    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-interface {p2, v1}, Landroidx/camera/core/impl/CameraConfig;->getSessionProcessor(Landroidx/camera/core/impl/SessionProcessor;)Landroidx/camera/core/impl/SessionProcessor;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p1, p2}, Landroidx/camera/core/impl/AdapterCameraControl;-><init>(Landroidx/camera/core/impl/CameraControlInternal;Landroidx/camera/core/impl/SessionProcessor;)V

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mAdapterCameraControl:Landroidx/camera/core/impl/AdapterCameraControl;

    .line 28
    return-void
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
.end method


# virtual methods
.method public attachUseCases(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/UseCase;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraInternal;->attachUseCases(Ljava/util/Collection;)V

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

.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->close()V

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
.end method

.method public detachUseCases(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/UseCase;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraInternal;->detachUseCases(Ljava/util/Collection;)V

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

.method public getCameraControl()Landroidx/camera/core/CameraControl;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mAdapterCameraControl:Landroidx/camera/core/impl/AdapterCameraControl;

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

.method public getCameraControlInternal()Landroidx/camera/core/impl/CameraControlInternal;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mAdapterCameraControl:Landroidx/camera/core/impl/AdapterCameraControl;

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

.method public getCameraInfo()Landroidx/camera/core/CameraInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mAdapterCameraInfo:Landroidx/camera/core/impl/AdapterCameraInfo;

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

.method public getCameraInfoInternal()Landroidx/camera/core/impl/CameraInfoInternal;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mAdapterCameraInfo:Landroidx/camera/core/impl/AdapterCameraInfo;

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

.method public getCameraState()Landroidx/camera/core/impl/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/Observable<",
            "Landroidx/camera/core/impl/CameraInternal$State;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->getCameraState()Landroidx/camera/core/impl/Observable;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getExtendedConfig()Landroidx/camera/core/impl/CameraConfig;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->getExtendedConfig()Landroidx/camera/core/impl/CameraConfig;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getHasTransform()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->getHasTransform()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getImplementation()Landroidx/camera/core/impl/CameraInternal;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

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

.method public isFrontFacing()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->isFrontFacing()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public varargs isUseCasesCombinationSupported(Z[Landroidx/camera/core/UseCase;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    invoke-interface {v0, p1, p2}, Landroidx/camera/core/Camera;->isUseCasesCombinationSupported(Z[Landroidx/camera/core/UseCase;)Z

    move-result p1

    return p1
.end method

.method public varargs isUseCasesCombinationSupported([Landroidx/camera/core/UseCase;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    invoke-interface {v0, p1}, Landroidx/camera/core/Camera;->isUseCasesCombinationSupported([Landroidx/camera/core/UseCase;)Z

    move-result p1

    return p1
.end method

.method public varargs isUseCasesCombinationSupportedByFramework([Landroidx/camera/core/UseCase;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/Camera;->isUseCasesCombinationSupportedByFramework([Landroidx/camera/core/UseCase;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public onUseCaseActive(Landroidx/camera/core/UseCase;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/UseCase$StateChangeCallback;->onUseCaseActive(Landroidx/camera/core/UseCase;)V

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

.method public onUseCaseInactive(Landroidx/camera/core/UseCase;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/UseCase$StateChangeCallback;->onUseCaseInactive(Landroidx/camera/core/UseCase;)V

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

.method public onUseCaseReset(Landroidx/camera/core/UseCase;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/UseCase$StateChangeCallback;->onUseCaseReset(Landroidx/camera/core/UseCase;)V

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

.method public onUseCaseUpdated(Landroidx/camera/core/UseCase;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/UseCase$StateChangeCallback;->onUseCaseUpdated(Landroidx/camera/core/UseCase;)V

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

.method public open()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->open()V

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
.end method

.method public release()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/impl/CameraInternal;->release()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public setActiveResumingMode(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraInternal;->setActiveResumingMode(Z)V

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

.method public setExtendedConfig(Landroidx/camera/core/impl/CameraConfig;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraInternal;->setExtendedConfig(Landroidx/camera/core/impl/CameraConfig;)V

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

.method public setPrimary(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/AdapterCameraInternal;->mCameraInternal:Landroidx/camera/core/impl/CameraInternal;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraInternal;->setPrimary(Z)V

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
