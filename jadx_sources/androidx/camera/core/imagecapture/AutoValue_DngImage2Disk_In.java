package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_DngImage2Disk_In extends DngImage2Disk.AbstractC0961In {
    private final ImageProxy imageProxy;
    private final ImageCapture.OutputFileOptions outputFileOptions;
    private final int rotationDegrees;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DngImage2Disk.AbstractC0961In) {
            DngImage2Disk.AbstractC0961In abstractC0961In = (DngImage2Disk.AbstractC0961In) obj;
            if (this.imageProxy.equals(abstractC0961In.getImageProxy()) && this.rotationDegrees == abstractC0961In.getRotationDegrees() && this.outputFileOptions.equals(abstractC0961In.getOutputFileOptions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.DngImage2Disk.AbstractC0961In
    public ImageProxy getImageProxy() {
        return this.imageProxy;
    }

    @Override // androidx.camera.core.imagecapture.DngImage2Disk.AbstractC0961In
    public ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.DngImage2Disk.AbstractC0961In
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.imageProxy.hashCode() ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.outputFileOptions.hashCode();
    }

    public String toString() {
        return "In{imageProxy=" + this.imageProxy + ", rotationDegrees=" + this.rotationDegrees + ", outputFileOptions=" + this.outputFileOptions + "}";
    }

    public AutoValue_DngImage2Disk_In(ImageProxy imageProxy, int i11, ImageCapture.OutputFileOptions outputFileOptions) {
        if (imageProxy != null) {
            this.imageProxy = imageProxy;
            this.rotationDegrees = i11;
            if (outputFileOptions != null) {
                this.outputFileOptions = outputFileOptions;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null imageProxy");
    }
}
