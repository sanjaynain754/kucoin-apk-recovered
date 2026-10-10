package jumio.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.jumio.commons.camera.Size;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import jumio.core.TextureViewSurfaceTextureListenerC40681j3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.j3 */
/* JADX INFO: loaded from: classes61.dex */
public final class TextureViewSurfaceTextureListenerC40681j3 extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public TextureView.SurfaceTextureListener f90304a;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f90305b;

    /* JADX INFO: renamed from: c */
    public C40600U f90306c;

    /* JADX INFO: renamed from: d */
    public boolean f90307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC40681j3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90306c = new C40600U();
    }

    /* JADX INFO: renamed from: a */
    public static final void m89256a(TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3, SurfaceTexture surfaceTexture, int i11, int i12) {
        C40600U c40600u = textureViewSurfaceTextureListenerC40681j3.f90306c;
        c40600u.getClass();
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        c40600u.registerOutputSurface(new Surface(surfaceTexture));
        SurfaceTexture surfaceTextureM89239a = textureViewSurfaceTextureListenerC40681j3.f90306c.m89239a(i11, i12);
        TextureView.SurfaceTextureListener surfaceTextureListener = textureViewSurfaceTextureListenerC40681j3.f90304a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTextureM89239a, i11, i12);
        }
        textureViewSurfaceTextureListenerC40681j3.f90305b = surfaceTextureM89239a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m89257b(TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3, SurfaceTexture surfaceTexture, int i11, int i12) {
        C40600U c40600u = textureViewSurfaceTextureListenerC40681j3.f90306c;
        c40600u.getClass();
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        c40600u.registerOutputSurface(new Surface(surfaceTexture));
        SurfaceTexture surfaceTextureM89239a = textureViewSurfaceTextureListenerC40681j3.f90306c.m89239a(i11, i12);
        TextureView.SurfaceTextureListener surfaceTextureListener = textureViewSurfaceTextureListenerC40681j3.f90304a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTextureM89239a, i11, i12);
        }
        textureViewSurfaceTextureListenerC40681j3.f90305b = surfaceTextureM89239a;
    }

    public final boolean getShouldUseShader() {
        return this.f90307d;
    }

    public final void setShader(@NotNull ShaderProvider shaderProvider) {
        Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
        this.f90306c.setShader(shaderProvider);
    }

    public final void setShouldUseShader(boolean z11) {
        this.f90307d = z11;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(@Nullable TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f90304a = surfaceTextureListener;
        super.setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(final SurfaceTexture surface, final int i11, final int i12) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f90307d) {
            this.f90306c.release();
            C40600U c40600u = new C40600U();
            this.f90306c = c40600u;
            c40600u.getExecutor().execute(new Runnable() { // from class: lg0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    TextureViewSurfaceTextureListenerC40681j3.m89256a(this.f93658b, surface, i11, i12);
                }
            });
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f90304a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i11, i12);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f90307d) {
            this.f90306c.release();
            SurfaceTexture surfaceTexture = this.f90305b;
            if (surfaceTexture == null || (surfaceTextureListener = this.f90304a) == null) {
                return false;
            }
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f90304a;
        if (surfaceTextureListener2 == null) {
            return false;
        }
        return surfaceTextureListener2.onSurfaceTextureDestroyed(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surface, final int i11, final int i12) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f90307d) {
            this.f90306c.getExecutor().execute(new Runnable() { // from class: lg0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    TextureViewSurfaceTextureListenerC40681j3.m89257b(this.f93662b, surface, i11, i12);
                }
            });
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f90304a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i11, i12);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f90307d) {
            SurfaceTexture surfaceTexture = this.f90305b;
            if (surfaceTexture != null && (surfaceTextureListener = this.f90304a) != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                return;
            }
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f90304a;
        if (surfaceTextureListener2 != null) {
            surfaceTextureListener2.onSurfaceTextureUpdated(surface);
        }
    }

    public final void setFrameSize(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f90306c.setFrameSize(size);
    }
}
