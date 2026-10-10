package androidx.camera.extensions.internal.compat.workaround;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AvailableKeysRetriever {
    boolean mShouldInvokeOnInit;

    public List<CaptureRequest.Key> getAvailableCaptureRequestKeys(ImageCaptureExtenderImpl imageCaptureExtenderImpl, String str, CameraCharacteristics cameraCharacteristics, Context context) {
        if (this.mShouldInvokeOnInit) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (this.mShouldInvokeOnInit) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }

    public AvailableKeysRetriever() {
        boolean z11;
        if (DeviceQuirks.get(GetAvailableKeysNeedsOnInit.class) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mShouldInvokeOnInit = z11;
    }
}
