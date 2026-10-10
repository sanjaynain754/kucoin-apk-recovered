.class public interface abstract Ljumio/core/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract cameraAvailable()V
.end method

.method public abstract cameraError(Ljava/lang/Throwable;)V
.end method

.method public abstract captureFrame(Lcom/jumio/commons/camera/Frame;)V
.end method

.method public abstract feedFrame(Lcom/jumio/commons/camera/Frame;)V
.end method

.method public abstract getDefaultFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;
.end method

.method public abstract getEnableExtraction()Z
.end method

.method public abstract getPreviewSize()Lcom/jumio/commons/camera/Size;
.end method

.method public abstract getShouldUseShader()Z
.end method

.method public abstract getShowShutterButton()Z
.end method

.method public abstract getSupportedFacing()[Lcom/jumio/sdk/enums/JumioCameraFacing;
.end method

.method public abstract isBrandingEnabled()Z
.end method

.method public abstract isPresented(Z)V
.end method

.method public abstract onPreviewAvailable(Lcom/jumio/commons/camera/CameraSettings;)V
.end method

.method public abstract setEnableExtraction(Z)V
.end method

.method public abstract setScanView(Lcom/jumio/core/views/CameraScanView;)V
.end method

.method public abstract takePicture()V
.end method
