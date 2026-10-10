package com.jumio.commons.camera;

import com.jumio.commons.enums.ScreenAngle;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.camera.CameraDataModel;
import com.jumio.core.data.scan.FileDataInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/commons/camera/ImageDataInterface;", "Lcom/jumio/core/data/scan/FileDataInterface;", "size", "Lcom/jumio/commons/camera/Size;", "getSize", "()Lcom/jumio/commons/camera/Size;", "orientationMode", "Lcom/jumio/commons/enums/ScreenAngle;", "getOrientationMode", "()Lcom/jumio/commons/enums/ScreenAngle;", "setOrientationMode", "(Lcom/jumio/commons/enums/ScreenAngle;)V", "cameraPosition", "Lcom/jumio/commons/camera/ImageData$CameraPosition;", "getCameraPosition", "()Lcom/jumio/commons/camera/ImageData$CameraPosition;", "setCameraPosition", "(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V", "metadata", "Lcom/jumio/commons/camera/ImageMetadata;", "getMetadata", "()Lcom/jumio/commons/camera/ImageMetadata;", "setMetadata", "(Lcom/jumio/commons/camera/ImageMetadata;)V", "cameraDataModel", "Lcom/jumio/core/camera/CameraDataModel;", "getCameraDataModel", "()Lcom/jumio/core/camera/CameraDataModel;", "setCameraDataModel", "(Lcom/jumio/core/camera/CameraDataModel;)V", "cameraConnectionData", "Lcom/jumio/core/camera/CameraConnectionData;", "getCameraConnectionData", "()Lcom/jumio/core/camera/CameraConnectionData;", "setCameraConnectionData", "(Lcom/jumio/core/camera/CameraConnectionData;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ImageDataInterface extends FileDataInterface {
    @Nullable
    CameraConnectionData getCameraConnectionData();

    @Nullable
    CameraDataModel getCameraDataModel();

    @Nullable
    ImageData.CameraPosition getCameraPosition();

    @Nullable
    ImageMetadata getMetadata();

    @Nullable
    ScreenAngle getOrientationMode();

    @NotNull
    Size getSize();

    void setCameraConnectionData(@Nullable CameraConnectionData cameraConnectionData);

    void setCameraDataModel(@Nullable CameraDataModel cameraDataModel);

    void setCameraPosition(@Nullable ImageData.CameraPosition cameraPosition);

    void setMetadata(@Nullable ImageMetadata imageMetadata);

    void setOrientationMode(@Nullable ScreenAngle screenAngle);
}
