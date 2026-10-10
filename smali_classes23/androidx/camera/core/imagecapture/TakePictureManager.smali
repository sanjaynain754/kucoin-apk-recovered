.class public interface abstract Landroidx/camera/core/imagecapture/TakePictureManager;
.super Ljava/lang/Object;
.source "TakePictureManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/imagecapture/TakePictureManager$Provider;,
        Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;
    }
.end annotation


# virtual methods
.method public abstract abortRequests()V
    .annotation build Landroidx/annotation/MainThread;
    .end annotation
.end method

.method public abstract getCapturingRequest()Landroidx/camera/core/imagecapture/RequestWithCallback;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end method

.method public abstract getImagePipeline()Landroidx/camera/core/imagecapture/ImagePipeline;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end method

.method public abstract getIncompleteRequests()Ljava/util/List;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/imagecapture/RequestWithCallback;",
            ">;"
        }
    .end annotation
.end method

.method public abstract hasCapturingRequest()Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end method

.method public abstract offerRequest(Landroidx/camera/core/imagecapture/TakePictureRequest;)V
    .annotation build Landroidx/annotation/MainThread;
    .end annotation
.end method

.method public abstract pause()V
    .annotation build Landroidx/annotation/MainThread;
    .end annotation
.end method

.method public abstract resume()V
    .annotation build Landroidx/annotation/MainThread;
    .end annotation
.end method

.method public abstract setImagePipeline(Landroidx/camera/core/imagecapture/ImagePipeline;)V
    .annotation build Landroidx/annotation/MainThread;
    .end annotation
.end method
