package androidx.camera.core.internal;

import androidx.camera.core.ZoomState;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class ImmutableZoomState implements ZoomState {
    public static ZoomState create(float f11, float f12, float f13, float f14) {
        return new AutoValue_ImmutableZoomState(f11, f12, f13, f14);
    }

    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    public static ZoomState create(ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}
