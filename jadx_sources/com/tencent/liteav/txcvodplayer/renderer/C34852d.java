package com.tencent.liteav.txcvodplayer.renderer;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.C34880d;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.frame.C34890i;
import com.tencent.liteav.videobase.frame.C34892k;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.C34900f;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C34907d;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videoconsumer.renderer.C34940u;
import com.tencent.liteav.videoconsumer.renderer.RunnableC34917ac;
import com.tencent.liteav.videoconsumer.renderer.RunnableC34941v;
import com.tencent.liteav.videoconsumer.renderer.RunnableC34942w;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34852d implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public CustomHandler f74069a;

    /* JADX INFO: renamed from: b */
    protected EGLCore f74070b;

    /* JADX INFO: renamed from: c */
    private C34940u f74071c;

    /* JADX INFO: renamed from: d */
    private DisplayTarget f74072d;

    /* JADX INFO: renamed from: g */
    private SurfaceTexture f74075g;

    /* JADX INFO: renamed from: i */
    private PixelFrame f74077i;

    /* JADX INFO: renamed from: j */
    private C34892k f74078j;

    /* JADX INFO: renamed from: k */
    private C34890i f74079k;

    /* JADX INFO: renamed from: l */
    private C34886e f74080l;

    /* JADX INFO: renamed from: p */
    private final a f74084p;

    /* JADX INFO: renamed from: e */
    private GLConstants.GLScaleType f74073e = GLConstants.GLScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: f */
    private EnumC34747l f74074f = EnumC34747l.NORMAL;

    /* JADX INFO: renamed from: h */
    private int f74076h = -1;

    /* JADX INFO: renamed from: m */
    private final float[] f74081m = new float[16];

    /* JADX INFO: renamed from: n */
    private int f74082n = 720;

    /* JADX INFO: renamed from: o */
    private int f74083o = 1280;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo75970a(SurfaceTexture surfaceTexture);

        /* JADX INFO: renamed from: a */
        void mo75971a(PixelFrame pixelFrame);

        /* JADX INFO: renamed from: f */
        void mo75984f();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76449b(C34852d c34852d) {
        LiteavLog.m76087i("VodRenderer", "Start");
        C34940u c34940u = c34852d.f74071c;
        if (c34940u != null) {
            c34940u.m76662a(c34852d.f74072d, true);
            c34852d.f74071c.m76660a(c34852d.f74074f);
            c34852d.f74071c.m76661a(c34852d.f74073e);
            C34940u c34940u2 = c34852d.f74071c;
            c34940u2.m76663a(RunnableC34941v.m76664a(c34940u2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C34940u m76452d(C34852d c34852d) {
        c34852d.f74071c = null;
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ DisplayTarget m76453e(C34852d c34852d) {
        c34852d.f74072d = null;
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ CustomHandler m76455g(C34852d c34852d) {
        c34852d.f74069a = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m76460a(boolean z11) {
        m76459a(RunnableC34854f.m76462a(this, z11), "Stop");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76448a(C34852d c34852d, boolean z11) {
        LiteavLog.m76087i("VodRenderer", "Stop");
        C34940u c34940u = c34852d.f74071c;
        if (c34940u != null) {
            c34940u.m76663a(RunnableC34917ac.m76594a(c34940u, z11));
        }
    }

    public C34852d(a aVar) {
        this.f74084p = aVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        m76459a(RunnableC34860l.m76468a(this, surfaceTexture), "onFrameAvailable");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76447a(C34852d c34852d, DisplayTarget displayTarget) {
        LiteavLog.m76087i("VodRenderer", "setDisplayTarget: ".concat(String.valueOf(displayTarget)));
        c34852d.f74072d = displayTarget;
        C34940u c34940u = c34852d.f74071c;
        if (c34940u != null) {
            c34940u.m76662a(displayTarget, true);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m76450b() {
        EGLCore eGLCore = this.f74070b;
        if (eGLCore == null) {
            LiteavLog.m76083e("VodRenderer", "makeCurrent on mEGLCore is null");
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (C34880d e11) {
            LiteavLog.m76084e("VodRenderer", "make current failed.", e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76443a(C34852d c34852d, int i11, int i12) {
        if (c34852d.f74082n == i11 && c34852d.f74083o == i12) {
            return;
        }
        LiteavLog.m76088i("VodRenderer", "setVideoSize: %d*%d", Integer.valueOf(i11), Integer.valueOf(i12));
        c34852d.f74082n = i11;
        c34852d.f74083o = i12;
        c34852d.f74077i.setWidth(i11);
        c34852d.f74077i.setHeight(c34852d.f74083o);
        C34890i c34890i = c34852d.f74079k;
        if (c34890i != null) {
            c34890i.m76549a();
            c34852d.f74079k = null;
        }
        C34886e c34886e = c34852d.f74080l;
        if (c34886e != null) {
            c34886e.mo76516a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76458a(GLConstants.GLScaleType gLScaleType) {
        m76459a(RunnableC34857i.m76465a(this, gLScaleType), "setScaleType");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76446a(C34852d c34852d, GLConstants.GLScaleType gLScaleType) {
        LiteavLog.m76087i("VodRenderer", "setScaleType ".concat(String.valueOf(gLScaleType)));
        c34852d.f74073e = gLScaleType;
        C34940u c34940u = c34852d.f74071c;
        if (c34940u != null) {
            c34940u.m76661a(gLScaleType);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76457a(EnumC34747l enumC34747l) {
        m76459a(RunnableC34858j.m76466a(this, enumC34747l), "setRenderRotation");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76445a(C34852d c34852d, EnumC34747l enumC34747l) {
        LiteavLog.m76087i("VodRenderer", "setRenderRotation ".concat(String.valueOf(enumC34747l)));
        c34852d.f74074f = enumC34747l;
        C34940u c34940u = c34852d.f74071c;
        if (c34940u != null) {
            c34940u.m76660a(enumC34747l);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76456a() {
        ArrayList arrayList;
        if (this.f74070b == null) {
            return;
        }
        C34892k c34892k = this.f74078j;
        if (c34892k != null) {
            c34892k.f74260c = true;
            synchronized (c34892k) {
                arrayList = new ArrayList(c34892k.f74258a);
                c34892k.f74258a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f74078j = null;
        }
        try {
            this.f74070b.makeCurrent();
            a aVar = this.f74084p;
            if (aVar != null) {
                aVar.mo75984f();
            }
            SurfaceTexture surfaceTexture = this.f74075g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f74075g = null;
            }
            OpenGlUtils.deleteTexture(this.f74076h);
            this.f74076h = -1;
            C34890i c34890i = this.f74079k;
            if (c34890i != null) {
                c34890i.m76549a();
                this.f74079k = null;
            }
            C34886e c34886e = this.f74080l;
            if (c34886e != null) {
                c34886e.mo76516a();
                this.f74080l.mo76519b();
                this.f74080l = null;
            }
        } catch (C34880d e11) {
            LiteavLog.m76084e("VodRenderer", "EGLCore destroy failed.", e11);
        }
        EGLCore.destroy(this.f74070b);
        this.f74070b = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m76459a(Runnable runnable, String str) {
        CustomHandler customHandler = this.f74069a;
        if (customHandler == null) {
            LiteavLog.m76093w("VodRenderer", "ignore runnable: ".concat(String.valueOf(str)));
        } else if (customHandler.getLooper() != Looper.myLooper()) {
            customHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76444a(C34852d c34852d, SurfaceTexture surfaceTexture) {
        C34892k c34892k;
        C34892k.b bVarM76535a;
        PixelFrame pixelFrameRemoveFirst;
        SurfaceTexture surfaceTexture2 = c34852d.f74075g;
        if (surfaceTexture2 != null && surfaceTexture == surfaceTexture2) {
            if (c34852d.m76450b()) {
                if (c34852d.f74080l != null && (c34892k = c34852d.f74078j) != null) {
                    try {
                        bVarM76535a = c34892k.m76535a();
                    } catch (InterruptedException unused) {
                        bVarM76535a = null;
                    }
                    try {
                        c34852d.f74075g.updateTexImage();
                        c34852d.f74075g.getTransformMatrix(c34852d.f74081m);
                        c34852d.f74077i.setMatrix(c34852d.f74081m);
                    } catch (Exception e11) {
                        LiteavLog.m76093w("VodRenderer", "updateTexImage exception: ".concat(String.valueOf(e11)));
                    }
                    int i11 = c34852d.f74076h;
                    int width = c34852d.f74077i.getWidth();
                    int height = c34852d.f74077i.getHeight();
                    bVarM76535a.f74281b = 36197;
                    bVarM76535a.f74280a = i11;
                    bVarM76535a.f74282c = width;
                    bVarM76535a.f74283d = height;
                    PixelFrame pixelFrameMo76527a = bVarM76535a.mo76527a(c34852d.f74077i.getGLContext());
                    pixelFrameMo76527a.setMatrix(c34852d.f74081m);
                    if (c34852d.f74079k == null) {
                        c34852d.f74079k = new C34890i(c34852d.f74082n, c34852d.f74083o);
                    }
                    OpenGlUtils.glViewport(0, 0, c34852d.f74082n, c34852d.f74083o);
                    AbstractC34885d abstractC34885dM76532a = c34852d.f74080l.m76532a(c34852d.f74082n, c34852d.f74083o);
                    c34852d.f74079k.m76551a(pixelFrameMo76527a, GLConstants.GLScaleType.CENTER_CROP, abstractC34885dM76532a);
                    PixelFrame pixelFrameMo76527a2 = abstractC34885dM76532a.mo76527a(c34852d.f74070b.getEglContext());
                    abstractC34885dM76532a.release();
                    a aVar = c34852d.f74084p;
                    if (aVar != null) {
                        aVar.mo75971a(pixelFrameMo76527a2);
                    }
                    C34940u c34940u = c34852d.f74071c;
                    if (c34940u != null && c34940u.f74554c) {
                        if (!c34940u.f74555d) {
                            c34940u.f74555d = true;
                            LiteavLog.m76079d(c34940u.f74552a, "VideoRender receive first frame!");
                        }
                        C34900f c34900f = c34940u.f74553b;
                        pixelFrameMo76527a2.retain();
                        synchronized (c34900f) {
                            try {
                                pixelFrameRemoveFirst = c34900f.f74322a.size() >= c34900f.f74323b ? c34900f.f74322a.removeFirst() : null;
                                c34900f.f74322a.addLast(pixelFrameMo76527a2);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (pixelFrameRemoveFirst != null) {
                            pixelFrameRemoveFirst.release();
                        }
                        c34940u.m76663a(RunnableC34942w.m76665a(c34940u));
                    }
                    bVarM76535a.release();
                    pixelFrameMo76527a.release();
                    pixelFrameMo76527a2.release();
                    return;
                }
                LiteavLog.m76093w("VodRenderer", "onCaptureFrameAvailable mGLTexturePool:" + c34852d.f74080l + " mTextureHolderPool:" + c34852d.f74078j);
                return;
            }
            return;
        }
        LiteavLog.m76087i("VodRenderer", "mSurfaceTexture= " + c34852d.f74075g + " ,surfaceTexture= " + surfaceTexture);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76442a(C34852d c34852d) {
        if (c34852d.f74070b == null) {
            c34852d.f74070b = new EGLCore();
            if (c34852d.f74078j == null) {
                c34852d.f74078j = new C34892k();
            }
            try {
                c34852d.f74070b.initialize(null, null, 128, 128);
                c34852d.f74070b.makeCurrent();
                c34852d.f74076h = OpenGlUtils.generateTextureOES();
                SurfaceTexture surfaceTexture = new SurfaceTexture(c34852d.f74076h);
                c34852d.f74075g = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(c34852d.f74082n, c34852d.f74083o);
                c34852d.f74075g.setOnFrameAvailableListener(c34852d);
                PixelFrame pixelFrame = new PixelFrame();
                c34852d.f74077i = pixelFrame;
                pixelFrame.setWidth(c34852d.f74082n);
                c34852d.f74077i.setHeight(c34852d.f74083o);
                c34852d.f74077i.setPixelBufferType(GLConstants.EnumC34866a.TEXTURE_OES);
                c34852d.f74077i.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
                c34852d.f74077i.setRotation(EnumC34747l.NORMAL);
                c34852d.f74077i.setGLContext(c34852d.f74070b.getEglContext());
                c34852d.f74077i.setTextureId(c34852d.f74076h);
                c34852d.f74080l = new C34886e();
                a aVar = c34852d.f74084p;
                if (aVar != null) {
                    aVar.mo75970a(c34852d.f74075g);
                }
            } catch (C34880d e11) {
                LiteavLog.m76084e("VodRenderer", "initializeEGL failed.", e11);
                c34852d.f74070b = null;
            }
        }
        c34852d.f74071c = new C34940u(c34852d.f74069a.getLooper(), new C34907d());
    }
}
