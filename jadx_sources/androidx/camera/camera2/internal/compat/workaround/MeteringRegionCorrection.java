package androidx.camera.camera2.internal.compat.workaround;

import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: loaded from: classes23.dex */
public class MeteringRegionCorrection {
    private final Quirks mCameraQuirks;

    public PointF getCorrectedPoint(MeteringPoint meteringPoint, int i11) {
        return (i11 == 1 && this.mCameraQuirks.contains(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - meteringPoint.getX(), meteringPoint.getY()) : new PointF(meteringPoint.getX(), meteringPoint.getY());
    }

    public MeteringRegionCorrection(Quirks quirks) {
        this.mCameraQuirks = quirks;
    }
}
