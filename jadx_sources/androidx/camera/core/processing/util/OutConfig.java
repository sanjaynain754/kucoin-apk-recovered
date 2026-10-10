package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import com.google.auto.value.AutoValue;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class OutConfig {
    /* JADX INFO: renamed from: of */
    public static OutConfig m2052of(SurfaceEdge surfaceEdge) {
        return m2050of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    public abstract Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract Size getSize();

    public abstract int getTargets();

    public abstract UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    /* JADX INFO: renamed from: of */
    public static OutConfig m2050of(int i11, int i12, Rect rect, Size size, int i13, boolean z11) {
        return m2051of(i11, i12, rect, size, i13, z11, false);
    }

    /* JADX INFO: renamed from: of */
    public static OutConfig m2051of(int i11, int i12, Rect rect, Size size, int i13, boolean z11, boolean z12) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i11, i12, rect, size, i13, z11, z12);
    }
}
