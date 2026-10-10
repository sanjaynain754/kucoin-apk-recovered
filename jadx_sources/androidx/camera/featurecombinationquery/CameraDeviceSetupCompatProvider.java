package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraDeviceSetupCompatProvider {
    CameraDeviceSetupCompat getCameraDeviceSetupCompat(String str) throws CameraAccessException;
}
