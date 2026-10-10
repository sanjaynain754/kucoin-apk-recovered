package androidx.camera.core.impl;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class OutputSurfaceConfiguration {
    public abstract OutputSurface getImageAnalysisOutputSurface();

    public abstract OutputSurface getImageCaptureOutputSurface();

    public abstract OutputSurface getPostviewOutputSurface();

    public abstract OutputSurface getPreviewOutputSurface();

    public static OutputSurfaceConfiguration create(OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3, OutputSurface outputSurface4) {
        return new AutoValue_OutputSurfaceConfiguration(outputSurface, outputSurface2, outputSurface3, outputSurface4);
    }
}
