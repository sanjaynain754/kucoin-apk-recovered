package androidx.camera.camera2.interop;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalCamera2Interop
public final class Camera2Interop {

    public static final class Extender<T> {
        ExtendableBuilder<T> mBaseBuilder;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Extender<T> setCaptureRequestTemplate(int i11) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.TEMPLATE_TYPE_OPTION, Integer.valueOf(i11));
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        @RequiresApi(28)
        public Extender<T> setPhysicalCameraId(String str) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setSessionCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        @RequiresApi(33)
        public Extender<T> setStreamUseCase(long j11) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION, Long.valueOf(j11));
            return this;
        }

        public Extender(ExtendableBuilder<T> extendableBuilder) {
            this.mBaseBuilder = extendableBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> Extender<T> setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.createCaptureRequestOption(key), Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }
    }

    private Camera2Interop() {
    }
}
