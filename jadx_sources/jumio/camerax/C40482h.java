package jumio.camerax;

import android.hardware.camera2.params.ColorSpaceTransform;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.jumio.camerax.CameraXManager;
import com.jumio.camerax.utils.ImageProxyExtKt;
import com.jumio.commons.camera.CameraCallbackInterface;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.FrameKt;
import com.jumio.commons.log.Log;
import com.jumio.core.camera.CameraConnectionData;
import java.lang.ref.WeakReference;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40482h implements ImageAnalysis.Analyzer {

    /* JADX INFO: renamed from: a */
    public final WeakReference f89865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraXManager f89866b;

    public C40482h(CameraXManager cameraXManager, CameraCallbackInterface cameraCallback) {
        Intrinsics.checkNotNullParameter(cameraCallback, "cameraCallback");
        this.f89866b = cameraXManager;
        this.f89865a = new WeakReference(cameraCallback);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        C40492r c40492rM89125a = this.f89866b.imageAnalysisCaptureCallback.m89125a();
        Frame.Metadata metadataDeepCopy = this.f89866b.getFrameMetadata().deepCopy();
        CameraXManager cameraXManager = this.f89866b;
        metadataDeepCopy.setIso(c40492rM89125a.f89875b);
        metadataDeepCopy.setLensPosition(c40492rM89125a.f89878e);
        metadataDeepCopy.setShutterSpeed(c40492rM89125a.f89874a);
        ColorSpaceTransform colorSpaceTransform = c40492rM89125a.f89879f;
        metadataDeepCopy.setColorSpaceTransform(colorSpaceTransform != null ? FrameKt.toFloatArray(colorSpaceTransform) : null);
        metadataDeepCopy.setAperture(c40492rM89125a.f89876c);
        metadataDeepCopy.getSize().setWidth(imageProxy.getWidth());
        metadataDeepCopy.getSize().setHeight(imageProxy.getHeight());
        metadataDeepCopy.setRotation(imageProxy.getImageInfo().getRotationDegrees());
        metadataDeepCopy.setTimestamp(System.currentTimeMillis());
        metadataDeepCopy.setFlashOn(cameraXManager.getF13500r());
        metadataDeepCopy.setCameraConnectionData(CameraConnectionData.INSTANCE.get(cameraXManager.getCollectCameraConnection()));
        metadataDeepCopy.setFlashState(c40492rM89125a.f89881h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] nv21Bytes = ImageProxyExtKt.getNv21Bytes(imageProxy);
        Log.m14479v("CameraXManager", "Flattening YUV bytes took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        CameraCallbackInterface cameraCallbackInterface = (CameraCallbackInterface) this.f89865a.get();
        if (cameraCallbackInterface != null) {
            cameraCallbackInterface.onPreviewFrame(new Frame(nv21Bytes, metadataDeepCopy, false, 4, null));
        }
        imageProxy.close();
    }
}
