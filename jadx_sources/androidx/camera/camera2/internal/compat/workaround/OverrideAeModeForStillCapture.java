package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: loaded from: classes23.dex */
public class OverrideAeModeForStillCapture {
    private boolean mAePrecaptureStarted = false;
    private final boolean mHasAutoFlashUnderExposedQuirk;

    public void onAePrecaptureFinished() {
        this.mAePrecaptureStarted = false;
    }

    public void onAePrecaptureStarted() {
        this.mAePrecaptureStarted = true;
    }

    public boolean shouldSetAeModeAlwaysFlash(int i11) {
        return this.mAePrecaptureStarted && i11 == 0 && this.mHasAutoFlashUnderExposedQuirk;
    }

    public OverrideAeModeForStillCapture(Quirks quirks) {
        this.mHasAutoFlashUnderExposedQuirk = quirks.get(AutoFlashUnderExposedQuirk.class) != null;
    }
}
