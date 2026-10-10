package androidx.camera.featurecombinationquery;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 35)
class Camera2CameraDeviceSetupCompatProvider implements CameraDeviceSetupCompatProvider {
    private final CameraManager mCameraManager;

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider
    public CameraDeviceSetupCompat getCameraDeviceSetupCompat(String str) throws CameraAccessException {
        return new Camera2CameraDeviceSetupCompat(this.mCameraManager, str);
    }

    public Camera2CameraDeviceSetupCompatProvider(Context context) {
        this.mCameraManager = (CameraManager) context.getSystemService(CameraManager.class);
    }
}
