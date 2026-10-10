package jumio.core;

import android.hardware.Camera;
import com.jumio.commons.camera.Camera1Manager;
import com.jumio.commons.log.Log;
import p852kotlin.Unit;

/* JADX INFO: renamed from: jumio.core.N */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40566N implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Camera1Manager f90055a;

    public RunnableC40566N(Camera1Manager camera1Manager) {
        this.f90055a = camera1Manager;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020 A[Catch: all -> 0x0014, Exception -> 0x0024, TRY_LEAVE, TryCatch #2 {Exception -> 0x0024, blocks: (B:13:0x001a, B:15:0x0020), top: B:27:0x001a, outer: #0 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Camera camera;
        Object obj = this.f90055a.f13486d;
        Camera1Manager camera1Manager = this.f90055a;
        synchronized (obj) {
            try {
                Camera camera2 = camera1Manager.f13483a;
                if (camera2 != null) {
                    camera2.setPreviewTexture(null);
                    try {
                        camera = camera1Manager.f13483a;
                        if (camera != null) {
                            camera.release();
                        }
                    } catch (Exception e11) {
                        Log.printStackTrace(e11);
                    }
                    camera1Manager.f13483a = null;
                    camera1Manager.f13485c = null;
                    Unit unit = Unit.INSTANCE;
                } else {
                    camera = camera1Manager.f13483a;
                    if (camera != null) {
                        camera.release();
                    }
                    camera1Manager.f13483a = null;
                    camera1Manager.f13485c = null;
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Exception e12) {
                Log.printStackTrace(e12);
            }
            throw th;
        }
    }
}
