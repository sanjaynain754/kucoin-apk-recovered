package com.jumio.commons.camera;

import com.jumio.commons.enums.ScreenAngle;
import com.jumio.commons.log.Log;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.camera.CameraDataModel;
import com.jumio.core.data.scan.FileData;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010(\u001a\u00020)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006-"}, m90084d2 = {"Lcom/jumio/commons/camera/ImageData;", "Lcom/jumio/core/data/scan/FileData;", "Lcom/jumio/commons/camera/ImageDataInterface;", "Ljava/io/Serializable;", "<init>", "()V", "size", "Lcom/jumio/commons/camera/Size;", "getSize", "()Lcom/jumio/commons/camera/Size;", "orientationMode", "Lcom/jumio/commons/enums/ScreenAngle;", "getOrientationMode", "()Lcom/jumio/commons/enums/ScreenAngle;", "setOrientationMode", "(Lcom/jumio/commons/enums/ScreenAngle;)V", "cameraPosition", "Lcom/jumio/commons/camera/ImageData$CameraPosition;", "getCameraPosition", "()Lcom/jumio/commons/camera/ImageData$CameraPosition;", "setCameraPosition", "(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V", "metadata", "Lcom/jumio/commons/camera/ImageMetadata;", "getMetadata", "()Lcom/jumio/commons/camera/ImageMetadata;", "setMetadata", "(Lcom/jumio/commons/camera/ImageMetadata;)V", "cameraDataModel", "Lcom/jumio/core/camera/CameraDataModel;", "getCameraDataModel", "()Lcom/jumio/core/camera/CameraDataModel;", "setCameraDataModel", "(Lcom/jumio/core/camera/CameraDataModel;)V", "cameraConnectionData", "Lcom/jumio/core/camera/CameraConnectionData;", "getCameraConnectionData", "()Lcom/jumio/core/camera/CameraConnectionData;", "setCameraConnectionData", "(Lcom/jumio/core/camera/CameraConnectionData;)V", "clear", "", "getUploadMetadata", "Lorg/json/JSONObject;", "CameraPosition", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class ImageData extends FileData implements ImageDataInterface, Serializable {

    @Nullable
    private CameraConnectionData cameraConnectionData;

    @Nullable
    private CameraDataModel cameraDataModel;

    @Nullable
    private CameraPosition cameraPosition;

    @Nullable
    private ImageMetadata metadata;

    @Nullable
    private ScreenAngle orientationMode;

    @NotNull
    private final Size size = new Size(0, 0);

    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/commons/camera/ImageData$CameraPosition;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum CameraPosition {
        FRONT,
        BACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<CameraPosition> getEntries() {
            return $ENTRIES;
        }
    }

    @Nullable
    public JSONObject getUploadMetadata() {
        return null;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    @Nullable
    public CameraConnectionData getCameraConnectionData() {
        return this.cameraConnectionData;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    @Nullable
    public CameraDataModel getCameraDataModel() {
        return this.cameraDataModel;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    @Nullable
    public CameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    @Nullable
    public ImageMetadata getMetadata() {
        return this.metadata;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    @Nullable
    public ScreenAngle getOrientationMode() {
        return this.orientationMode;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    @NotNull
    public Size getSize() {
        return this.size;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public void setCameraConnectionData(@Nullable CameraConnectionData cameraConnectionData) {
        this.cameraConnectionData = cameraConnectionData;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public void setCameraDataModel(@Nullable CameraDataModel cameraDataModel) {
        this.cameraDataModel = cameraDataModel;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public void setCameraPosition(@Nullable CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public void setMetadata(@Nullable ImageMetadata imageMetadata) {
        this.metadata = imageMetadata;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public void setOrientationMode(@Nullable ScreenAngle screenAngle) {
        this.orientationMode = screenAngle;
    }

    @Override // com.jumio.core.data.scan.FileData, com.jumio.core.data.scan.DataInterface
    public void clear() {
        try {
            super.clear();
            getSize().setWidth(0);
            getSize().setHeight(0);
            setOrientationMode(null);
            setCameraPosition(null);
            setMetadata(null);
            setCameraDataModel(null);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }
}
