.class Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;
.super Ljava/lang/Object;
.source "TakePictureManagerImpl.java"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->submitCameraRequest(Landroidx/camera/core/imagecapture/CameraRequest;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

.field final synthetic val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;


# direct methods
.method public constructor <init>(Landroidx/camera/core/imagecapture/TakePictureManagerImpl;Landroidx/camera/core/imagecapture/CameraRequest;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/CameraRequest;->isAborted()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->val$cameraRequest:Landroidx/camera/core/imagecapture/CameraRequest;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/CameraRequest;->getCaptureConfigs()Ljava/util/List;

    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Landroidx/camera/core/impl/CaptureConfig;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/camera/core/impl/CaptureConfig;->getId()I

    .line 26
    move-result v0

    .line 27
    .line 28
    instance-of v1, p1, Landroidx/camera/core/ImageCaptureException;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    .line 33
    .line 34
    iget-object v1, v1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 35
    .line 36
    check-cast p1, Landroidx/camera/core/ImageCaptureException;

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p1}, Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;->of(ILandroidx/camera/core/ImageCaptureException;)Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Landroidx/camera/core/imagecapture/ImagePipeline;->notifyCaptureError(Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;)V

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    .line 47
    .line 48
    iget-object v1, v1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 49
    .line 50
    new-instance v2, Landroidx/camera/core/ImageCaptureException;

    .line 51
    const/4 v3, 0x2

    .line 52
    .line 53
    const-string v4, "Failed to submit capture request"

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v3, v4, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2}, Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;->of(ILandroidx/camera/core/ImageCaptureException;)Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Landroidx/camera/core/imagecapture/ImagePipeline;->notifyCaptureError(Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;)V

    .line 64
    .line 65
    :goto_0
    iget-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    .line 66
    .line 67
    iget-object p1, p1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Landroidx/camera/core/imagecapture/ImageCaptureControl;->unlockFlashMode()V

    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 2
    iget-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManagerImpl$1;->this$0:Landroidx/camera/core/imagecapture/TakePictureManagerImpl;

    iget-object p1, p1, Landroidx/camera/core/imagecapture/TakePictureManagerImpl;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    invoke-interface {p1}, Landroidx/camera/core/imagecapture/ImageCaptureControl;->unlockFlashMode()V

    return-void
.end method
