package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class AttachedSurfaceInfo {
    public abstract List<UseCaseConfigFactory.CaptureType> getCaptureTypes();

    public abstract DynamicRange getDynamicRange();

    public abstract int getImageFormat();

    public abstract Config getImplementationOptions();

    public abstract int getSessionType();

    public abstract Size getSize();

    public abstract SurfaceConfig getSurfaceConfig();

    public abstract Range<Integer> getTargetFrameRate();

    public abstract boolean isStrictFrameRateRequired();

    public static AttachedSurfaceInfo create(SurfaceConfig surfaceConfig, int i11, Size size, DynamicRange dynamicRange, List<UseCaseConfigFactory.CaptureType> list, Config config, int i12, Range<Integer> range, boolean z11) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i11, size, dynamicRange, list, config, i12, range, z11);
    }

    public StreamSpec toStreamSpec(Config config) {
        return StreamSpec.builder(getSize()).setSessionType(getSessionType()).setExpectedFrameRateRange(getTargetFrameRate()).setDynamicRange(getDynamicRange()).setImplementationOptions(config).build();
    }
}
