package jumio.core;

import android.graphics.Rect;
import android.hardware.Camera;
import com.jumio.commons.camera.Camera1Manager;
import com.jumio.commons.camera.MeteringPoint;
import com.jumio.commons.log.Log;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.O */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40571O implements Runnable {

    /* JADX INFO: renamed from: a */
    public final MeteringPoint f90061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Camera1Manager f90062b;

    public RunnableC40571O(Camera1Manager camera1Manager, MeteringPoint meteringPoint) {
        Intrinsics.checkNotNullParameter(meteringPoint, "meteringPoint");
        this.f90062b = camera1Manager;
        this.f90061a = meteringPoint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = this.f90062b.f13505w;
        int width = textureViewSurfaceTextureListenerC40681j3 != null ? textureViewSurfaceTextureListenerC40681j3.getWidth() : 0;
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j4 = this.f90062b.f13505w;
        int height = textureViewSurfaceTextureListenerC40681j4 != null ? textureViewSurfaceTextureListenerC40681j4.getHeight() : 0;
        float x11 = this.f90061a.getX();
        float y11 = this.f90061a.getY();
        float f11 = 2;
        float width2 = this.f90061a.getWidth() / f11;
        float height2 = this.f90061a.getHeight() / f11;
        if (this.f90061a.isNormalized()) {
            float f12 = width;
            x11 = this.f90061a.getX() * f12;
            float f13 = height;
            float y12 = this.f90061a.getY() * f13;
            float width3 = (this.f90061a.getWidth() * f12) / f11;
            height2 = (this.f90061a.getHeight() * f13) / f11;
            width2 = width3;
            y11 = y12;
        }
        float f14 = 2000;
        float f15 = width;
        float f16 = 1000;
        int i11 = (int) ((((x11 - width2) / f15) * f14) - f16);
        int i12 = (int) ((((x11 + width2) / f15) * f14) - f16);
        float f17 = height;
        int i13 = (int) ((((y11 - height2) / f17) * f14) - f16);
        int i14 = (int) ((((y11 + height2) / f17) * f14) - f16);
        Object obj = this.f90062b.f13486d;
        Camera1Manager camera1Manager = this.f90062b;
        synchronized (obj) {
            try {
                try {
                    Camera camera = camera1Manager.f13483a;
                    if (camera != null) {
                        if (camera1Manager.getF13501s()) {
                            return;
                        }
                        if (camera1Manager.f13488f) {
                            camera1Manager.f13501s = true;
                            camera.autoFocus(camera1Manager.f13487e);
                        } else {
                            Camera.Parameters parameters = camera.getParameters();
                            Intrinsics.checkNotNull(parameters);
                            Camera1Manager.access$addAreas(camera1Manager, parameters, new Rect(i11, i13, i12, i14));
                            camera.setParameters(parameters);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e11) {
                    Log.printStackTrace(e11);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
