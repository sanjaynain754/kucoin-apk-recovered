package jumio.core;

import android.graphics.SurfaceTexture;
import com.jumio.commons.camera.renderer.CameraRenderer;

/* JADX INFO: renamed from: jumio.core.U */
/* JADX INFO: loaded from: classes61.dex */
public final class C40600U extends CameraRenderer {
    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m89239a(int i11, int i12) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(getTextureName());
        surfaceTexture.setDefaultBufferSize(i11, i12);
        registerInputSurface(surfaceTexture);
        return surfaceTexture;
    }
}
