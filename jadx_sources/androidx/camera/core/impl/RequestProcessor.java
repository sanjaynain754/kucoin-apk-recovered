package androidx.camera.core.impl;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface RequestProcessor {

    public interface Request {
        Config getParameters();

        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(Request request, Callback callback);

    void stopRepeating();

    int submit(Request request, Callback callback);

    int submit(List<Request> list, Callback callback);

    public interface Callback {
        default void onCaptureSequenceAborted(int i11) {
        }

        default void onCaptureCompleted(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(Request request, CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceCompleted(int i11, long j11) {
        }

        default void onCaptureBufferLost(Request request, long j11, int i11) {
        }

        default void onCaptureStarted(Request request, long j11, long j12) {
        }
    }
}
