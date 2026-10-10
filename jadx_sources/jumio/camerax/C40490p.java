package jumio.camerax;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.core.util.Consumer;
import com.jumio.commons.camera.renderer.CameraRenderer;
import jumio.camerax.C40490p;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C40490p extends CameraRenderer implements SurfaceProcessor {

    /* JADX INFO: renamed from: n */
    public Surface f89871n;

    /* JADX INFO: renamed from: o */
    public SurfaceOutput f89872o;

    /* JADX INFO: renamed from: p */
    public final float[] f89873p = new float[16];

    /* JADX INFO: renamed from: a */
    public static final void m89128a(C40490p c40490p, Surface surface, SurfaceRequest.Result result) {
        c40490p.unregisterInputSurface();
        surface.release();
    }

    @Override // com.jumio.commons.camera.renderer.CameraRenderer
    /* JADX INFO: renamed from: getRenderTransform */
    public final float[] getF13571d() {
        SurfaceOutput surfaceOutput = this.f89872o;
        if (surfaceOutput != null) {
            surfaceOutput.updateTransformMatrix(this.f89873p, super.getF13571d());
        }
        return this.f89873p;
    }

    @Override // com.jumio.commons.camera.renderer.CameraRenderer
    public final void releaseInternal() {
        Surface surface = this.f89871n;
        if (surface != null) {
            surface.release();
        }
        this.f89871n = null;
        SurfaceOutput surfaceOutput = this.f89872o;
        if (surfaceOutput != null) {
            surfaceOutput.close();
        }
        super.releaseInternal();
    }

    /* JADX INFO: renamed from: a */
    public static final void m89129a(C40490p c40490p, SurfaceOutput.Event event) {
        SurfaceOutput surfaceOutput = c40490p.f89872o;
        if (surfaceOutput != null) {
            surfaceOutput.close();
        }
        c40490p.unregisterOutputSurface();
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(SurfaceRequest surfaceRequest) {
        Intrinsics.checkNotNullParameter(surfaceRequest, "surfaceRequest");
        SurfaceTexture surfaceTexture = new SurfaceTexture(getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        this.f89871n = surface;
        surfaceRequest.provideSurface(surface, getExecutor(), new Consumer() { // from class: kg0.d
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C40490p.m89128a(this.f91260b, surface, (SurfaceRequest.Result) obj);
            }
        });
        registerInputSurface(surfaceTexture);
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        Intrinsics.checkNotNullParameter(surfaceOutput, "surfaceOutput");
        if (getF13578k()) {
            surfaceOutput.close();
            return;
        }
        Surface surface = surfaceOutput.getSurface(getExecutor(), new Consumer() { // from class: kg0.c
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C40490p.m89129a(this.f91259b, (SurfaceOutput.Event) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
        registerOutputSurface(surface);
        this.f89872o = surfaceOutput;
    }
}
