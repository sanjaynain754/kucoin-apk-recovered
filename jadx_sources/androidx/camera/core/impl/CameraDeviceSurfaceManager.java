package androidx.camera.core.impl;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.InitializationException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraDeviceSurfaceManager extends InternalCameraPresenceListener {

    public interface Provider {
        CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set<String> set) throws InitializationException;
    }

    SurfaceStreamSpecQueryResult getSuggestedStreamSpecs(int i11, String str, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, boolean z11, boolean z12, boolean z13, boolean z14);

    SurfaceConfig transformSurfaceConfig(int i11, String str, int i12, Size size, StreamUseCase streamUseCase);
}
