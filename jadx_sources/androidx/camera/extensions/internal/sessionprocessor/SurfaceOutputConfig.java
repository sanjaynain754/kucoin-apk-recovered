package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class SurfaceOutputConfig implements Camera2OutputConfig {
    public static SurfaceOutputConfig create(int i11, int i12, String str, List<Camera2OutputConfig> list, Surface surface) {
        return new AutoValue_SurfaceOutputConfig(i11, i12, str, list, surface);
    }

    public abstract Surface getSurface();

    public static SurfaceOutputConfig create(int i11, Surface surface) {
        return create(i11, -1, null, Collections.EMPTY_LIST, surface);
    }
}
