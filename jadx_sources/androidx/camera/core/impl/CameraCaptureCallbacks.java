package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraCaptureCallbacks {

    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {
        private final List<CameraCaptureCallback> mCallbacks = new ArrayList();

        public List<CameraCaptureCallback> getCallbacks() {
            return this.mCallbacks;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(i11);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i11, CameraCaptureResult cameraCaptureResult) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(i11, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i11, CameraCaptureFailure cameraCaptureFailure) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(i11, cameraCaptureFailure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i11, int i12) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(i11, i12);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(i11);
            }
        }

        public ComboCameraCaptureCallback(List<CameraCaptureCallback> list) {
            for (CameraCaptureCallback cameraCaptureCallback : list) {
                if (!(cameraCaptureCallback instanceof NoOpCameraCaptureCallback)) {
                    this.mCallbacks.add(cameraCaptureCallback);
                }
            }
        }
    }

    public static CameraCaptureCallback createComboCallback(List<CameraCaptureCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        return list.size() == 1 ? list.get(0) : new ComboCameraCaptureCallback(list);
    }

    public static CameraCaptureCallback createNoOpCallback() {
        return new NoOpCameraCaptureCallback();
    }

    private CameraCaptureCallbacks() {
    }

    public static CameraCaptureCallback createComboCallback(CameraCaptureCallback... cameraCaptureCallbackArr) {
        return createComboCallback((List<CameraCaptureCallback>) Arrays.asList(cameraCaptureCallbackArr));
    }

    public static final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i11) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i11, CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i11, CameraCaptureFailure cameraCaptureFailure) {
        }
    }
}
