package jumio.core;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.jumio.commons.camera.Camera1Manager;
import com.jumio.commons.camera.CameraCallbackInterface;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.Q */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40581Q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture f90076a;

    /* JADX INFO: renamed from: b */
    public final int f90077b;

    /* JADX INFO: renamed from: c */
    public final int f90078c;

    /* JADX INFO: renamed from: d */
    public final boolean f90079d;

    /* JADX INFO: renamed from: e */
    public final int f90080e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Camera1Manager f90081f;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f90081f.f13486d;
        Camera1Manager camera1Manager = this.f90081f;
        synchronized (obj) {
            try {
                Camera unused = camera1Manager.f13483a;
                CameraCallbackInterface cameraCallbackInterface = camera1Manager.f13491i;
                if (cameraCallbackInterface != null) {
                    cameraCallbackInterface.onStopPreview();
                }
                camera1Manager.m14443a(this.f90076a, this.f90077b, this.f90078c, this.f90079d, this.f90080e);
                if (!camera1Manager.getF13502t()) {
                    camera1Manager.startPreview();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public RunnableC40581Q(Camera1Manager camera1Manager, SurfaceTexture surface, int i11, int i12, boolean z11, int i13) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f90081f = camera1Manager;
        this.f90076a = surface;
        this.f90077b = i11;
        this.f90078c = i12;
        this.f90079d = z11;
        this.f90080e = i13;
    }
}
