package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class StillCaptureFlow {
    private final boolean mShouldStopRepeatingBeforeStillCapture;

    public boolean shouldStopRepeatingBeforeCapture(List<CaptureRequest> list, boolean z11) {
        if (this.mShouldStopRepeatingBeforeStillCapture && z11) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public StillCaptureFlow() {
        boolean z11;
        if (((StillCaptureFlashStopRepeatingQuirk) DeviceQuirks.get(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mShouldStopRepeatingBeforeStillCapture = z11;
    }
}
