package androidx.camera.core.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public interface SessionProcessor {
    public static final int TYPE_CAMERA2_EXTENSION = 1;
    public static final int TYPE_VENDOR_LIBRARY = 0;

    public interface CaptureSessionRequestProcessor {
        Pair<Long, Long> getRealtimeStillCaptureLatency();

        void setExtensionStrength(@IntRange(from = 0, m1553to = 100) int i11);
    }

    void abortCapture(int i11);

    void deInitSession();

    default Pair<Integer, Integer> getImplementationType() {
        return Pair.create(0, 0);
    }

    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(RequestProcessor requestProcessor);

    void setParameters(Config config);

    int startCapture(boolean z11, TagBundle tagBundle, CaptureCallback captureCallback);

    int startRepeating(TagBundle tagBundle, CaptureCallback captureCallback);

    default int startTrigger(Config config, TagBundle tagBundle, CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    default List<Pair<CameraCharacteristics.Key, Object>> getAvailableCharacteristicsKeyValues() {
        return Collections.EMPTY_LIST;
    }

    default Range<Float> getExtensionZoomRange() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (Pair<CameraCharacteristics.Key, Object> pair : getAvailableCharacteristicsKeyValues()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                return (Range) pair.second;
            }
        }
        return null;
    }

    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }

    default Map<Integer, List<Size>> getSupportedPostviewSize(Size size) {
        return Collections.EMPTY_MAP;
    }

    default int[] getExtensionAvailableStabilizationModes() {
        for (Pair<CameraCharacteristics.Key, Object> pair : getAvailableCharacteristicsKeyValues()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                return (int[]) pair.second;
            }
        }
        return null;
    }

    public interface CaptureCallback {
        default void onCaptureFailed(int i11) {
        }

        default void onCaptureProcessProgressed(int i11) {
        }

        default void onCaptureProcessStarted(int i11) {
        }

        default void onCaptureSequenceAborted(int i11) {
        }

        default void onCaptureSequenceCompleted(int i11) {
        }

        default void onCaptureStarted(int i11, long j11) {
        }

        default void onCaptureCompleted(long j11, int i11, CameraCaptureResult cameraCaptureResult) {
        }
    }

    default void setCaptureSessionRequestProcessor(CaptureSessionRequestProcessor captureSessionRequestProcessor) {
    }
}
