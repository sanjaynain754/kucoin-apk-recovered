package com.jumio.commons.camera;

import com.jumio.commons.enums.ScreenAngle;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.camera.CameraDataModel;
import com.jumio.core.enums.UploadResolution;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.jumio.commons.camera.a */
/* JADX INFO: loaded from: classes56.dex */
public final class C9300a implements ImageDataInterface, Serializable {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f13565a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public UploadResolution f13566b;

    /* JADX INFO: renamed from: c */
    public CameraDataModel f13567c;

    /* JADX INFO: renamed from: a */
    public final ImageData m14447a(UploadResolution uploadResolution) {
        Intrinsics.checkNotNullParameter(uploadResolution, "uploadResolution");
        LinkedHashMap linkedHashMap = this.f13565a;
        Object imageData = linkedHashMap.get(uploadResolution);
        if (imageData == null) {
            imageData = new ImageData();
            linkedHashMap.put(uploadResolution, imageData);
        }
        return (ImageData) imageData;
    }

    /* JADX INFO: renamed from: b */
    public final void m14448b(UploadResolution uploadResolution) {
        Intrinsics.checkNotNullParameter(uploadResolution, "uploadResolution");
        UploadResolution uploadResolution2 = UploadResolution.UHD;
        if ((uploadResolution != uploadResolution2 || !m14447a(uploadResolution2).getHasData()) && (uploadResolution != (uploadResolution2 = UploadResolution.DEBUG) || !m14447a(uploadResolution2).getHasData())) {
            uploadResolution2 = UploadResolution.FHD;
        }
        this.f13566b = uploadResolution2;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final void clear() {
        Iterator it = this.f13565a.entrySet().iterator();
        while (it.hasNext()) {
            ((ImageData) ((Map.Entry) it.next()).getValue()).clear();
        }
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final CameraConnectionData getCameraConnectionData() {
        return m14447a(this.f13566b).getCameraConnectionData();
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final CameraDataModel getCameraDataModel() {
        return this.f13567c;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final ImageData.CameraPosition getCameraPosition() {
        return m14447a(this.f13566b).getCameraPosition();
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final String getData() {
        return m14447a(this.f13566b).getData();
    }

    @Override // com.jumio.core.data.scan.FileDataInterface
    public final String getFileName() {
        return m14447a(this.f13566b).getFileName();
    }

    @Override // com.jumio.core.data.scan.FileDataInterface
    public final String getFileType() {
        return m14447a(this.f13566b).getFileType();
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final boolean getHasData() {
        return m14447a(this.f13566b).getHasData();
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final ImageMetadata getMetadata() {
        return m14447a(this.f13566b).getMetadata();
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final String getMimeType() {
        return m14447a(this.f13566b).getMimeType();
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final ScreenAngle getOrientationMode() {
        return m14447a(this.f13566b).getOrientationMode();
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final Size getSize() {
        return m14447a(this.f13566b).getSize();
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final Long getTimestamp() {
        return m14447a(this.f13566b).getTimestamp();
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final void setCameraConnectionData(CameraConnectionData cameraConnectionData) {
        m14447a(this.f13566b).setCameraConnectionData(cameraConnectionData);
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final void setCameraDataModel(CameraDataModel cameraDataModel) {
        this.f13567c = cameraDataModel;
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final void setCameraPosition(ImageData.CameraPosition cameraPosition) {
        m14447a(this.f13566b).setCameraPosition(cameraPosition);
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final void setData(String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(value, "value");
        m14447a(this.f13566b).setData(value);
    }

    @Override // com.jumio.core.data.scan.FileDataInterface
    public final void setFileType(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m14447a(this.f13566b).setFileType(value);
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final void setMetadata(ImageMetadata imageMetadata) {
        m14447a(this.f13566b).setMetadata(imageMetadata);
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final void setMimeType(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m14447a(this.f13566b).setMimeType(value);
    }

    @Override // com.jumio.commons.camera.ImageDataInterface
    public final void setOrientationMode(ScreenAngle screenAngle) {
        m14447a(this.f13566b).setOrientationMode(screenAngle);
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public final void setTimestamp(Long l11) {
        m14447a(this.f13566b).setTimestamp(l11);
    }

    public C9300a() {
        UploadResolution uploadResolution = UploadResolution.UHD;
        if (!m14447a(uploadResolution).getHasData()) {
            uploadResolution = UploadResolution.FHD;
            if (!m14447a(uploadResolution).getHasData()) {
                UploadResolution uploadResolution2 = UploadResolution.DEBUG;
                if (m14447a(uploadResolution2).getHasData()) {
                    uploadResolution = uploadResolution2;
                }
            }
        }
        this.f13566b = uploadResolution;
    }
}
