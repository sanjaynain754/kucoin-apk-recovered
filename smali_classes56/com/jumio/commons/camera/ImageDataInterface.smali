.class public interface abstract Lcom/jumio/commons/camera/ImageDataInterface;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/data/scan/FileDataInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u0004\u0018\u00010\rX\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#\u00a8\u0006$\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/commons/camera/ImageDataInterface;",
        "Lcom/jumio/core/data/scan/FileDataInterface;",
        "size",
        "Lcom/jumio/commons/camera/Size;",
        "getSize",
        "()Lcom/jumio/commons/camera/Size;",
        "orientationMode",
        "Lcom/jumio/commons/enums/ScreenAngle;",
        "getOrientationMode",
        "()Lcom/jumio/commons/enums/ScreenAngle;",
        "setOrientationMode",
        "(Lcom/jumio/commons/enums/ScreenAngle;)V",
        "cameraPosition",
        "Lcom/jumio/commons/camera/ImageData$CameraPosition;",
        "getCameraPosition",
        "()Lcom/jumio/commons/camera/ImageData$CameraPosition;",
        "setCameraPosition",
        "(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V",
        "metadata",
        "Lcom/jumio/commons/camera/ImageMetadata;",
        "getMetadata",
        "()Lcom/jumio/commons/camera/ImageMetadata;",
        "setMetadata",
        "(Lcom/jumio/commons/camera/ImageMetadata;)V",
        "cameraDataModel",
        "Lcom/jumio/core/camera/CameraDataModel;",
        "getCameraDataModel",
        "()Lcom/jumio/core/camera/CameraDataModel;",
        "setCameraDataModel",
        "(Lcom/jumio/core/camera/CameraDataModel;)V",
        "cameraConnectionData",
        "Lcom/jumio/core/camera/CameraConnectionData;",
        "getCameraConnectionData",
        "()Lcom/jumio/core/camera/CameraConnectionData;",
        "setCameraConnectionData",
        "(Lcom/jumio/core/camera/CameraConnectionData;)V",
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
.method public abstract getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getCameraDataModel()Lcom/jumio/core/camera/CameraDataModel;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMetadata()Lcom/jumio/commons/camera/ImageMetadata;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getOrientationMode()Lcom/jumio/commons/enums/ScreenAngle;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSize()Lcom/jumio/commons/camera/Size;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V
    .param p1    # Lcom/jumio/core/camera/CameraConnectionData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setCameraDataModel(Lcom/jumio/core/camera/CameraDataModel;)V
    .param p1    # Lcom/jumio/core/camera/CameraDataModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setCameraPosition(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V
    .param p1    # Lcom/jumio/commons/camera/ImageData$CameraPosition;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setMetadata(Lcom/jumio/commons/camera/ImageMetadata;)V
    .param p1    # Lcom/jumio/commons/camera/ImageMetadata;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setOrientationMode(Lcom/jumio/commons/enums/ScreenAngle;)V
    .param p1    # Lcom/jumio/commons/enums/ScreenAngle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method
