package jumio.core;

import android.hardware.Camera;
import com.jumio.commons.camera.Camera1Manager;
import com.jumio.commons.log.Log;
import p852kotlin.Unit;

/* JADX INFO: renamed from: jumio.core.P */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40576P implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Camera1Manager f90071a;

    public RunnableC40576P(Camera1Manager camera1Manager) {
        this.f90071a = camera1Manager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f90071a.setFlash(false);
        Object obj = this.f90071a.f13486d;
        Camera1Manager camera1Manager = this.f90071a;
        synchronized (obj) {
            try {
                Camera camera = camera1Manager.f13483a;
                if (camera != null) {
                    camera.stopPreview();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e11) {
                Log.printStackTrace(e11);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
