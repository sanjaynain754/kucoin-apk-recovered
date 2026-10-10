package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final int imageFormat;
    private final Size size;
    private final Surface surface;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.surface.equals(outputSurface.getSurface()) && this.size.equals(outputSurface.getSize()) && this.imageFormat == outputSurface.getImageFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.surface + ", size=" + this.size + ", imageFormat=" + this.imageFormat + "}";
    }

    public AutoValue_OutputSurface(Surface surface, Size size, int i11) {
        if (surface != null) {
            this.surface = surface;
            if (size != null) {
                this.size = size;
                this.imageFormat = i11;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }
}
