package p055c9;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: renamed from: c9.c */
/* JADX INFO: compiled from: CameraSurface.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4909c {

    /* JADX INFO: renamed from: a */
    public SurfaceHolder f5440a;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f5441b;

    public C4909c(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f5440a = surfaceHolder;
    }

    /* JADX INFO: renamed from: a */
    public void m5125a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f5440a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f5441b);
        }
    }

    public C4909c(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f5441b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
