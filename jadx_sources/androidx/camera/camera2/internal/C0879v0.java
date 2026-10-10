package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.v0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C0879v0 implements CameraCharacteristicsProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraCharacteristicsCompat f1499a;

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        return this.f1499a.get(key);
    }
}
