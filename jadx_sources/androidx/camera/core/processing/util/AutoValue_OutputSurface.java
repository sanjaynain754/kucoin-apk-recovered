package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final EGLSurface eglSurface;
    private final int height;
    private final int width;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.eglSurface.equals(outputSurface.getEglSurface()) && this.width == outputSurface.getWidth() && this.height == outputSurface.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.eglSurface.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.eglSurface + ", width=" + this.width + ", height=" + this.height + "}";
    }

    public AutoValue_OutputSurface(EGLSurface eGLSurface, int i11, int i12) {
        if (eGLSurface != null) {
            this.eglSurface = eGLSurface;
            this.width = i11;
            this.height = i12;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }
}
