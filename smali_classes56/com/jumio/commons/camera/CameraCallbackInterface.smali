.class public interface abstract Lcom/jumio/commons/camera/CameraCallbackInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0008\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH&J\u0008\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/commons/camera/CameraCallbackInterface;",
        "",
        "onCameraAvailable",
        "",
        "onCameraError",
        "t",
        "",
        "onCameraFallback",
        "onPreviewAvailable",
        "settings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "onPreviewFrame",
        "frame",
        "Lcom/jumio/commons/camera/Frame;",
        "onCaptureFrame",
        "onStopPreview",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onCameraAvailable()V
.end method

.method public abstract onCameraError(Ljava/lang/Throwable;)V
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onCameraFallback()V
.end method

.method public abstract onCaptureFrame(Lcom/jumio/commons/camera/Frame;)V
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onPreviewAvailable(Lcom/jumio/commons/camera/CameraSettings;)V
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onPreviewFrame(Lcom/jumio/commons/camera/Frame;)V
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onStopPreview()V
.end method
