package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: loaded from: classes23.dex */
public class AutoFlashAEModeDisabler {
    private final boolean mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled;
    private final boolean mIsImageCaptureFailWithAutoFlashQuirkEnabled;

    public int getCorrectedAeMode(int i11) {
        if ((this.mIsImageCaptureFailWithAutoFlashQuirkEnabled || this.mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled) && i11 == 2) {
            return 1;
        }
        return i11;
    }

    public AutoFlashAEModeDisabler(Quirks quirks) {
        boolean z11;
        this.mIsImageCaptureFailWithAutoFlashQuirkEnabled = quirks.contains(ImageCaptureFailWithAutoFlashQuirk.class);
        if (DeviceQuirks.get(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled = z11;
    }
}
