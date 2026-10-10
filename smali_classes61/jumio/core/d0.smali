.class public final Ljumio/core/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/CameraCallbackInterface;


# instance fields
.field public final a:Ljumio/core/c0;

.field public final synthetic b:Lcom/jumio/core/views/CameraScanView;


# direct methods
.method public constructor <init>(Lcom/jumio/core/views/CameraScanView;Ljumio/core/c0;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "cameraScanPartInterface"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Ljumio/core/d0;->b:Lcom/jumio/core/views/CameraScanView;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    iput-object p2, p0, Ljumio/core/d0;->a:Ljumio/core/c0;

    .line 13
    return-void
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
    .line 25
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
.end method


# virtual methods
.method public final onCameraAvailable()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/d0;->a:Ljumio/core/c0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljumio/core/c0;->cameraAvailable()V

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
.end method

.method public final onCameraError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/d0;->a:Ljumio/core/c0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljumio/core/c0;->cameraError(Ljava/lang/Throwable;)V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final onCameraFallback()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/d0;->b:Lcom/jumio/core/views/CameraScanView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/jumio/core/views/CameraScanView;->access$cameraFallback(Lcom/jumio/core/views/CameraScanView;)V

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
.end method

.method public final onCaptureFrame(Lcom/jumio/commons/camera/Frame;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/d0;->a:Ljumio/core/c0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljumio/core/c0;->captureFrame(Lcom/jumio/commons/camera/Frame;)V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final onPreviewAvailable(Lcom/jumio/commons/camera/CameraSettings;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "settings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Ljumio/core/d0;->b:Lcom/jumio/core/views/CameraScanView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/jumio/core/views/CameraScanView;->setCameraSettings$jumio_core_release(Lcom/jumio/commons/camera/CameraSettings;)V

    .line 11
    .line 12
    iget-object v0, p0, Ljumio/core/d0;->a:Ljumio/core/c0;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljumio/core/c0;->onPreviewAvailable(Lcom/jumio/commons/camera/CameraSettings;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final onPreviewFrame(Lcom/jumio/commons/camera/Frame;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "frame"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Ljumio/core/d0;->b:Lcom/jumio/core/views/CameraScanView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jumio/core/views/CameraScanView;->getCameraManager$jumio_core_release()Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->getFocusing()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Ljumio/core/d0;->a:Ljumio/core/c0;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljumio/core/c0;->feedFrame(Lcom/jumio/commons/camera/Frame;)V

    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final onStopPreview()V
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
.end method
