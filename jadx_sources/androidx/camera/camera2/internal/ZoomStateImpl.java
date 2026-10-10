package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.AdapterCameraInfo;

/* JADX INFO: loaded from: classes23.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f11) throws IllegalArgumentException {
        if (f11 <= 1.0f && f11 >= 0.0f) {
            this.mLinearZoom = f11;
            this.mZoomRatio = AdapterCameraInfo.getZoomRatioByPercentage(f11, this.mMinZoomRatio, this.mMaxZoomRatio);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f11 + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f11) throws IllegalArgumentException {
        float f12 = this.mMaxZoomRatio;
        if (f11 <= f12) {
            float f13 = this.mMinZoomRatio;
            if (f11 >= f13) {
                this.mZoomRatio = f11;
                this.mLinearZoom = AdapterCameraInfo.getPercentageByRatio(f11, f13, f12);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f11 + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
    }

    public ZoomStateImpl(float f11, float f12) {
        this.mMaxZoomRatio = f11;
        this.mMinZoomRatio = f12;
    }
}
