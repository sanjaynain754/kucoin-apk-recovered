package jumio.core;

import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.core.views.CameraScanView;
import com.jumio.sdk.enums.JumioCameraFacing;

/* JADX INFO: renamed from: jumio.core.c0 */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC40643c0 {
    void cameraAvailable();

    void cameraError(Throwable th2);

    void captureFrame(Frame frame);

    void feedFrame(Frame frame);

    JumioCameraFacing getDefaultFacing();

    boolean getEnableExtraction();

    Size getPreviewSize();

    boolean getShouldUseShader();

    boolean getShowShutterButton();

    JumioCameraFacing[] getSupportedFacing();

    boolean isBrandingEnabled();

    void isPresented(boolean z11);

    void onPreviewAvailable(CameraSettings cameraSettings);

    void setEnableExtraction(boolean z11);

    void setScanView(CameraScanView cameraScanView);

    void takePicture();
}
