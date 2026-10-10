package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    ListenableFuture<Void> cancelFocusAndMetering();

    ListenableFuture<Void> enableTorch(boolean z11);

    ListenableFuture<Integer> setExposureCompensationIndex(int i11);

    ListenableFuture<Void> setLinearZoom(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11);

    ListenableFuture<Void> setZoomRatio(float f11);

    ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);

    default ListenableFuture<Void> enableLowLightBoostAsync(boolean z11) {
        return Futures.immediateFailedFuture(new OperationCanceledException("Not supported!"));
    }

    default ListenableFuture<Void> setTorchStrengthLevel(@IntRange(from = 1) int i11) {
        return Futures.immediateFailedFuture(new UnsupportedOperationException("Setting torch strength is not supported on the device."));
    }
}
