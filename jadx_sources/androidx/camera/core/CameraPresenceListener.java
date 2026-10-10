package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraPresenceListener {
    void onCamerasAdded(Set<CameraIdentifier> set);

    void onCamerasRemoved(Set<CameraIdentifier> set);
}
