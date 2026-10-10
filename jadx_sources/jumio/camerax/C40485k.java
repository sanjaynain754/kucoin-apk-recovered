package jumio.camerax;

import android.hardware.camera2.params.ColorSpaceTransform;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import com.jumio.camerax.CameraXManager;
import com.jumio.camerax.utils.ImageProxyExtKt;
import com.jumio.commons.camera.CameraCallbackInterface;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.FrameKt;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.core.camera.CameraConnectionData;
import java.lang.ref.WeakReference;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C40485k extends ImageCapture.OnImageCapturedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraXManager f89868a;

    public C40485k(CameraXManager cameraXManager) {
        this.f89868a = cameraXManager;
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final void onCaptureSuccess(ImageProxy imageProxy) {
        CameraCallbackInterface cameraCallbackInterface;
        CameraCallbackInterface cameraCallbackInterface2;
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            C40492r c40492rM89125a = this.f89868a.imageAnalysisCaptureCallback.m89125a();
            Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
            int i11 = c40492rM89125a.f89875b;
            float f11 = c40492rM89125a.f89878e;
            long j11 = c40492rM89125a.f89874a;
            ColorSpaceTransform colorSpaceTransform = c40492rM89125a.f89879f;
            Frame.Metadata metadata = new Frame.Metadata(size, imageProxy.getImageInfo().getRotationDegrees(), i11, j11, f11, colorSpaceTransform != null ? FrameKt.toFloatArray(colorSpaceTransform) : null, c40492rM89125a.f89876c, this.f89868a.getFrameMetadata().getOrientation(), this.f89868a.getFrameMetadata().isPortrait(), 256, System.currentTimeMillis(), false, CameraConnectionData.INSTANCE.get(this.f89868a.getCollectCameraConnection()), c40492rM89125a.f89881h, 2048, null);
            WeakReference weakReference = this.f89868a.cameraCallback;
            if (weakReference != null && (cameraCallbackInterface2 = (CameraCallbackInterface) weakReference.get()) != null) {
                cameraCallbackInterface2.onCaptureFrame(new Frame(ImageProxyExtKt.getSinglePlaneByteArray(imageProxy), metadata, false, 4, null));
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            WeakReference weakReference2 = this.f89868a.cameraCallback;
            if (weakReference2 != null && (cameraCallbackInterface = (CameraCallbackInterface) weakReference2.get()) != null) {
                cameraCallbackInterface.onCaptureFrame(null);
            }
        }
        imageProxy.close();
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final void onError(ImageCaptureException exception) {
        CameraCallbackInterface cameraCallbackInterface;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Log.printStackTrace(exception);
        WeakReference weakReference = this.f89868a.cameraCallback;
        if (weakReference == null || (cameraCallbackInterface = (CameraCallbackInterface) weakReference.get()) == null) {
            return;
        }
        cameraCallbackInterface.onCaptureFrame(null);
    }
}
