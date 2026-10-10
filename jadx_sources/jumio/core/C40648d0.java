package jumio.core;

import com.jumio.commons.camera.CameraCallbackInterface;
import com.jumio.commons.camera.CameraManagerInterface;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.views.CameraScanView;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.d0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40648d0 implements CameraCallbackInterface {

    /* JADX INFO: renamed from: a */
    public final InterfaceC40643c0 f90241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraScanView f90242b;

    public C40648d0(CameraScanView cameraScanView, InterfaceC40643c0 cameraScanPartInterface) {
        Intrinsics.checkNotNullParameter(cameraScanPartInterface, "cameraScanPartInterface");
        this.f90242b = cameraScanView;
        this.f90241a = cameraScanPartInterface;
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onCameraAvailable() {
        this.f90241a.cameraAvailable();
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onCameraError(Throwable th2) {
        this.f90241a.cameraError(th2);
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onCameraFallback() {
        CameraScanView.access$cameraFallback(this.f90242b);
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onCaptureFrame(Frame frame) {
        this.f90241a.captureFrame(frame);
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onPreviewAvailable(CameraSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f90242b.setCameraSettings$jumio_core_release(settings);
        this.f90241a.onPreviewAvailable(settings);
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onPreviewFrame(Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        CameraManagerInterface f14592i = this.f90242b.getF14592i();
        if (f14592i == null || f14592i.getF13501s()) {
            return;
        }
        this.f90241a.feedFrame(frame);
    }

    @Override // com.jumio.commons.camera.CameraCallbackInterface
    public final void onStopPreview() {
    }
}
