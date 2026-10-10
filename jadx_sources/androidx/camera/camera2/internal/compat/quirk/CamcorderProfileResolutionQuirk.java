package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class CamcorderProfileResolutionQuirk implements Quirk {
    private static final String TAG = "CamcorderProfileResolutionQuirk";
    private final StreamConfigurationMapCompat mStreamConfigurationMapCompat;
    private List<Size> mSupportedResolutions = null;

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> getSupportedResolutions() {
        if (this.mSupportedResolutions == null) {
            Size[] outputSizes = this.mStreamConfigurationMapCompat.getOutputSizes(34);
            this.mSupportedResolutions = outputSizes != null ? Arrays.asList((Size[]) outputSizes.clone()) : Collections.EMPTY_LIST;
            Logger.m1866d(TAG, "mSupportedResolutions = " + this.mSupportedResolutions);
        }
        return new ArrayList(this.mSupportedResolutions);
    }

    public CamcorderProfileResolutionQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mStreamConfigurationMapCompat = cameraCharacteristicsCompat.getStreamConfigurationMapCompat();
    }
}
