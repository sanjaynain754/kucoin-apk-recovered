package com.otaliastudios.transcoder.internal.video;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.otaliastudios.opengl.draw.GlRect;
import com.otaliastudios.opengl.program.GlTextureProgram;
import com.otaliastudios.opengl.texture.GlTexture;
import w90.C45770i;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.video.a */
/* JADX INFO: compiled from: FrameDrawer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27365a {

    /* JADX INFO: renamed from: k */
    public static final C45770i f55798k = new C45770i("FrameDrawer");

    /* JADX INFO: renamed from: a */
    public SurfaceTexture f55799a;

    /* JADX INFO: renamed from: b */
    public Surface f55800b;

    /* JADX INFO: renamed from: c */
    public GlTextureProgram f55801c;

    /* JADX INFO: renamed from: d */
    public GlRect f55802d;

    /* JADX INFO: renamed from: i */
    @GuardedBy("mFrameAvailableLock")
    public boolean f55807i;

    /* JADX INFO: renamed from: e */
    public float f55803e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f55804f = 1.0f;

    /* JADX INFO: renamed from: g */
    public int f55805g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f55806h = false;

    /* JADX INFO: renamed from: j */
    public final Object f55808j = new Object();

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.video.a$a */
    /* JADX INFO: compiled from: FrameDrawer.java */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        public a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C27365a.f55798k.m101070h("New frame available");
            synchronized (C27365a.this.f55808j) {
                try {
                    if (!C27365a.this.f55807i) {
                        C27365a.this.f55807i = true;
                        C27365a.this.f55808j.notifyAll();
                    } else {
                        throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68079e() {
        synchronized (this.f55808j) {
            while (!this.f55807i) {
                try {
                    this.f55808j.wait(10000L);
                    if (!this.f55807i) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f55807i = false;
        }
        this.f55799a.updateTexImage();
    }

    /* JADX INFO: renamed from: g */
    public final void m68081g() {
        this.f55799a.getTransformMatrix(this.f55801c.getTextureTransform());
        float f11 = 1.0f / this.f55803e;
        float f12 = 1.0f / this.f55804f;
        Matrix.translateM(this.f55801c.getTextureTransform(), 0, (1.0f - f11) / 2.0f, (1.0f - f12) / 2.0f, 0.0f);
        Matrix.scaleM(this.f55801c.getTextureTransform(), 0, f11, f12, 1.0f);
        Matrix.translateM(this.f55801c.getTextureTransform(), 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.f55801c.getTextureTransform(), 0, this.f55805g, 0.0f, 0.0f, 1.0f);
        if (this.f55806h) {
            Matrix.scaleM(this.f55801c.getTextureTransform(), 0, 1.0f, -1.0f, 1.0f);
        }
        Matrix.translateM(this.f55801c.getTextureTransform(), 0, -0.5f, -0.5f, 0.0f);
        this.f55801c.m67837a(this.f55802d);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Surface m68082h() {
        return this.f55800b;
    }

    /* JADX INFO: renamed from: i */
    public void m68083i() {
        this.f55801c.mo67844i();
        this.f55800b.release();
        this.f55800b = null;
        this.f55799a = null;
        this.f55802d = null;
        this.f55801c = null;
    }

    /* JADX INFO: renamed from: j */
    public void m68084j(boolean z11) {
        this.f55806h = z11;
    }

    /* JADX INFO: renamed from: k */
    public void m68085k(int i11) {
        this.f55805g = i11;
    }

    /* JADX INFO: renamed from: l */
    public void m68086l(float f11, float f12) {
        this.f55803e = f11;
        this.f55804f = f12;
    }

    public C27365a() {
        GlTexture glTexture = new GlTexture();
        GlTextureProgram glTextureProgram = new GlTextureProgram();
        this.f55801c = glTextureProgram;
        glTextureProgram.m67853l(glTexture);
        this.f55802d = new GlRect();
        SurfaceTexture surfaceTexture = new SurfaceTexture(glTexture.getId());
        this.f55799a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new a());
        this.f55800b = new Surface(this.f55799a);
    }

    /* JADX INFO: renamed from: f */
    public void m68080f() {
        m68079e();
        m68081g();
    }
}
