package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OutputSurface {
    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();

    /* JADX INFO: renamed from: of */
    public static OutputSurface m2053of(EGLSurface eGLSurface, int i11, int i12) {
        return new AutoValue_OutputSurface(eGLSurface, i11, i12);
    }
}
