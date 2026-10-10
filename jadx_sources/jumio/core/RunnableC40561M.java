package jumio.core;

import android.graphics.SurfaceTexture;
import com.jumio.commons.camera.Camera1Manager;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.M */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40561M implements Runnable {

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture f90042a;

    /* JADX INFO: renamed from: b */
    public final int f90043b;

    /* JADX INFO: renamed from: c */
    public final int f90044c;

    /* JADX INFO: renamed from: d */
    public final boolean f90045d;

    /* JADX INFO: renamed from: e */
    public final int f90046e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Camera1Manager f90047f;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f90047f.f13486d;
        Camera1Manager camera1Manager = this.f90047f;
        synchronized (obj) {
            try {
                camera1Manager.m14444b();
                camera1Manager.m14443a(this.f90042a, this.f90043b, this.f90044c, this.f90045d, this.f90046e);
                if (!camera1Manager.getF13502t()) {
                    camera1Manager.startPreview();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public RunnableC40561M(Camera1Manager camera1Manager, SurfaceTexture surface, int i11, int i12, boolean z11, int i13) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f90047f = camera1Manager;
        this.f90042a = surface;
        this.f90043b = i11;
        this.f90044c = i12;
        this.f90045d = z11;
        this.f90046e = i13;
    }
}
