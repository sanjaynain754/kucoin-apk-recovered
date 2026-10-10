package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraDeviceStateCallbacks {

    public static final class ComboDeviceStateCallback extends CameraDevice.StateCallback {
        private final List<CameraDevice.StateCallback> mCallbacks = new ArrayList();

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i11);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }

        public ComboDeviceStateCallback(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof NoOpDeviceStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }
    }

    public static CameraDevice.StateCallback createComboCallback(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        return list.size() == 1 ? list.get(0) : new ComboDeviceStateCallback(list);
    }

    public static CameraDevice.StateCallback createNoOpCallback() {
        return new NoOpDeviceStateCallback();
    }

    private CameraDeviceStateCallbacks() {
    }

    public static CameraDevice.StateCallback createComboCallback(CameraDevice.StateCallback... stateCallbackArr) {
        return createComboCallback((List<CameraDevice.StateCallback>) Arrays.asList(stateCallbackArr));
    }

    public static final class NoOpDeviceStateCallback extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
        }
    }
}
