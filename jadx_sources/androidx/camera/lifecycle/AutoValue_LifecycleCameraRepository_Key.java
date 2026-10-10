package androidx.camera.lifecycle;

import androidx.camera.core.CameraIdentifier;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {
    private final CameraIdentifier cameraIdentifier;
    private final int lifecycleOwnerHash;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.Key) {
            LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
            if (this.lifecycleOwnerHash == key.getLifecycleOwnerHash() && this.cameraIdentifier.equals(key.getCameraIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public CameraIdentifier getCameraIdentifier() {
        return this.cameraIdentifier;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public int getLifecycleOwnerHash() {
        return this.lifecycleOwnerHash;
    }

    public int hashCode() {
        return ((this.lifecycleOwnerHash ^ 1000003) * 1000003) ^ this.cameraIdentifier.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.lifecycleOwnerHash + ", cameraIdentifier=" + this.cameraIdentifier + "}";
    }

    public AutoValue_LifecycleCameraRepository_Key(int i11, CameraIdentifier cameraIdentifier) {
        this.lifecycleOwnerHash = i11;
        if (cameraIdentifier != null) {
            this.cameraIdentifier = cameraIdentifier;
            return;
        }
        throw new NullPointerException("Null cameraIdentifier");
    }
}
