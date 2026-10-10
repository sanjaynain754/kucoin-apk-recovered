package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class ConvergenceUtils {
    private static final Set<CameraCaptureMetaData.AeState> AE_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AeState> AE_TORCH_AS_FLASH_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AfState> AF_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    private static final Set<CameraCaptureMetaData.AwbState> AWB_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.CONVERGED, CameraCaptureMetaData.AwbState.UNKNOWN));
    private static final String TAG = "ConvergenceUtils";

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.CONVERGED;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.UNKNOWN;
        Set<CameraCaptureMetaData.AeState> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        AE_CONVERGED_STATE_SET = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(aeState2);
        enumSetCopyOf.remove(aeState3);
        AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = Collections.unmodifiableSet(enumSetCopyOf);
    }

    private ConvergenceUtils() {
    }

    public static boolean is3AConverged(CameraCaptureResult cameraCaptureResult, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (cameraCaptureResult.getAfMode() != CameraCaptureMetaData.AfMode.OFF && !AF_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAfState())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (cameraCaptureResult.getAeMode() == CameraCaptureMetaData.AeMode.OFF) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 ? !(z13 || AE_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState())) : !(z13 || AE_TORCH_AS_FLASH_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState()))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (cameraCaptureResult.getAwbMode() == CameraCaptureMetaData.AwbMode.OFF || AWB_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAwbState())) {
            z15 = true;
        } else {
            z15 = false;
        }
        Logger.m1866d(TAG, "checkCaptureResult, AE=" + cameraCaptureResult.getAeState() + " AF =" + cameraCaptureResult.getAfState() + " AWB=" + cameraCaptureResult.getAwbState());
        if (z12 && z14 && z15) {
            return true;
        }
        return false;
    }
}
