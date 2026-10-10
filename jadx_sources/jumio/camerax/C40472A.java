package jumio.camerax;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.jumio.commons.log.Log;
import com.jumio.core.util.DeviceUtilKt;
import java.util.Iterator;
import jumio.camerax.C40472A;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C40472A implements InterfaceC40489o {

    /* JADX INFO: renamed from: a */
    public ProcessCameraProvider f89850a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m89118a(C40472A c40472a, ListenableFuture listenableFuture, Function1 function1) {
        ProcessCameraProvider processCameraProvider;
        try {
            processCameraProvider = (ProcessCameraProvider) listenableFuture.get();
        } catch (Exception e11) {
            Log.m14466d("DefaultCameraXProvider", e11);
            processCameraProvider = null;
        }
        c40472a.f89850a = processCameraProvider;
        function1.invoke(Boolean.valueOf(processCameraProvider != null));
    }

    /* JADX INFO: renamed from: a */
    public final C40494t m89119a(C40499y lifecycle, CameraSelector cameraSelector, C40477c c40477c, UseCase... useCases) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        Iterator it = ArraysKt.filterNotNull(useCases).iterator();
        while (it.hasNext()) {
            builder.addUseCase((UseCase) it.next());
        }
        if (c40477c != null) {
            builder.addEffect(c40477c);
        }
        ProcessCameraProvider processCameraProvider = this.f89850a;
        if (processCameraProvider == null) {
            return null;
        }
        UseCaseGroup useCaseGroupBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "build(...)");
        Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(lifecycle, cameraSelector, useCaseGroupBuild);
        if (cameraBindToLifecycle == null) {
            return null;
        }
        return new C40494t(cameraBindToLifecycle);
    }

    /* JADX INFO: renamed from: a */
    public final void m89120a(Context context, final Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i11 = DeviceUtilKt.getDeviceUtil().isDebug(context) ? 3 : 6;
        try {
            ProcessCameraProvider.Companion companion = ProcessCameraProvider.INSTANCE;
            CameraXConfig cameraXConfigBuild = CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig()).setMinimumLoggingLevel(i11).build();
            Intrinsics.checkNotNullExpressionValue(cameraXConfigBuild, "build(...)");
            companion.configureInstance(cameraXConfigBuild);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        try {
            final ListenableFuture<ProcessCameraProvider> companion2 = ProcessCameraProvider.INSTANCE.getInstance(context);
            companion2.addListener(new Runnable() { // from class: kg0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C40472A.m89118a(this.f91255b, companion2, callback);
                }
            }, ContextCompat.getMainExecutor(context));
        } catch (Exception e12) {
            Log.m14471e("DefaultCameraXProvider", e12);
            callback.invoke(Boolean.FALSE);
        }
    }
}
