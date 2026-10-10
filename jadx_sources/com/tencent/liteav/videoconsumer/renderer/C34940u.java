package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.C34744i;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.InterfaceC34867a;
import com.tencent.liteav.videobase.egl.C34880d;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.frame.C34884c;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.frame.C34890i;
import com.tencent.liteav.videobase.frame.FrameMetaData;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p136b.C34863b;
import com.tencent.liteav.videobase.utils.BitmapUtils;
import com.tencent.liteav.videobase.utils.C34898d;
import com.tencent.liteav.videobase.utils.C34900f;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C34908e;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.EnumC34909f;
import com.tencent.liteav.videobase.videobase.InterfaceC34906c;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.u */
/* JADX INFO: loaded from: classes59.dex */
public final class C34940u extends AbstractC34938s implements RenderViewHelperInterface.RenderViewListener {

    /* JADX INFO: renamed from: B */
    private InterfaceC34867a f74544B;

    /* JADX INFO: renamed from: C */
    private AbstractC34939t f74545C;

    /* JADX INFO: renamed from: E */
    private Bitmap f74547E;

    /* JADX INFO: renamed from: G */
    private C34914a f74549G;

    /* JADX INFO: renamed from: H */
    private List<PointF> f74550H;

    /* JADX INFO: renamed from: I */
    private List<PointF> f74551I;

    /* JADX INFO: renamed from: f */
    private final CustomHandler f74557f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC34906c f74558g;

    /* JADX INFO: renamed from: n */
    private Object f74565n;

    /* JADX INFO: renamed from: q */
    private C34890i f74568q;

    /* JADX INFO: renamed from: r */
    private C34886e f74569r;

    /* JADX INFO: renamed from: w */
    private DisplayTarget f74574w;

    /* JADX INFO: renamed from: x */
    private RenderViewHelperInterface f74575x;

    /* JADX INFO: renamed from: a */
    public final String f74552a = "VideoRenderer_" + hashCode();

    /* JADX INFO: renamed from: e */
    private final Handler f74556e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    private final C34748m f74560i = new C34748m(5);

    /* JADX INFO: renamed from: j */
    private final C34692b f74561j = new C34692b();

    /* JADX INFO: renamed from: k */
    private final Size f74562k = new Size();

    /* JADX INFO: renamed from: l */
    private Surface f74563l = null;

    /* JADX INFO: renamed from: m */
    private boolean f74564m = false;

    /* JADX INFO: renamed from: o */
    private EGLCore f74566o = null;

    /* JADX INFO: renamed from: p */
    private final C34884c f74567p = new C34884c();

    /* JADX INFO: renamed from: b */
    public final C34900f f74553b = new C34900f();

    /* JADX INFO: renamed from: s */
    private GLConstants.GLScaleType f74570s = GLConstants.GLScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: t */
    private EnumC34747l f74571t = EnumC34747l.NORMAL;

    /* JADX INFO: renamed from: u */
    private boolean f74572u = false;

    /* JADX INFO: renamed from: v */
    private boolean f74573v = false;

    /* JADX INFO: renamed from: y */
    private final Size f74576y = new Size();

    /* JADX INFO: renamed from: c */
    public volatile boolean f74554c = false;

    /* JADX INFO: renamed from: d */
    public boolean f74555d = false;

    /* JADX INFO: renamed from: z */
    private boolean f74577z = false;

    /* JADX INFO: renamed from: A */
    private final Size f74543A = new Size();

    /* JADX INFO: renamed from: D */
    private boolean f74546D = false;

    /* JADX INFO: renamed from: F */
    private final C34691a f74548F = new C34691a(5000);

    /* JADX INFO: renamed from: h */
    private final C34748m f74559h = null;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76650a(C34940u c34940u, AbstractC34939t abstractC34939t) {
        LiteavLog.m76087i(c34940u.f74552a, "Start");
        if (c34940u.f74554c) {
            LiteavLog.m76093w(c34940u.f74552a, "renderer is started!");
            return;
        }
        c34940u.f74554c = true;
        c34940u.f74545C = abstractC34939t;
        DisplayTarget displayTarget = c34940u.f74574w;
        if (displayTarget != null) {
            c34940u.m76656b(displayTarget, true);
        }
        c34940u.f74548F.f73384a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m76656b(DisplayTarget displayTarget, boolean z11) {
        LiteavLog.m76087i(this.f74552a, "setDisplayViewInternal=" + displayTarget + ",clearLastImage=" + z11);
        boolean zEquals = CommonUtil.equals(this.f74574w, displayTarget);
        if (zEquals && displayTarget != null && this.f74575x != null) {
            LiteavLog.m76093w(this.f74552a, "view is equal and RenderViewHelper is created.");
            return;
        }
        if (!zEquals) {
            this.f74546D = true;
            DisplayTarget displayTarget2 = this.f74574w;
            if (displayTarget2 != null && z11) {
                displayTarget2.hideAll();
            }
        }
        m76653a(z11);
        this.f74574w = displayTarget;
        if (displayTarget == null) {
            return;
        }
        displayTarget.showAll();
        this.f74575x = RenderViewHelperInterface.create(displayTarget, this);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m76658c(C34940u c34940u) {
        C34940u c34940u2;
        RenderViewHelperInterface renderViewHelperInterface;
        PixelFrame pixelFrameM76563a = c34940u.f74553b.m76563a();
        if (pixelFrameM76563a == null) {
            LiteavLog.m76079d(c34940u.f74552a, "renderFrameInternal pixelFrame is null!");
            return;
        }
        c34940u.f74576y.set(pixelFrameM76563a.getWidth(), pixelFrameM76563a.getHeight());
        FrameMetaData metaData = pixelFrameM76563a.getMetaData();
        if (metaData != null) {
            c34940u.f74571t = metaData.getRenderRotation();
            c34940u.f74572u = metaData.isRenderMirrorHorizontal();
            c34940u.f74573v = metaData.isRenderMirrorVertical();
            c34940u.f74576y.set(metaData.getCaptureRealSize());
        }
        if (c34940u.f74548F.m76041a() && (renderViewHelperInterface = c34940u.f74575x) != null) {
            renderViewHelperInterface.checkViewAvailability();
        }
        if (c34940u.f74577z) {
            RenderViewHelperInterface renderViewHelperInterface2 = c34940u.f74575x;
            if (renderViewHelperInterface2 != null) {
                renderViewHelperInterface2.updateVideoFrameInfo(c34940u.f74570s, pixelFrameM76563a.getWidth(), pixelFrameM76563a.getHeight(), c34940u.f74577z);
            }
            int i11 = AbstractC34939t.a.f74538a;
        } else if (c34940u.f74575x == null) {
            int i12 = AbstractC34939t.a.f74538a;
        } else if (c34940u.m76654a(pixelFrameM76563a)) {
            c34940u.m76655b();
            PixelFrame pixelFrame = new PixelFrame(pixelFrameM76563a);
            boolean z11 = c34940u.f74572u;
            boolean z12 = c34940u.f74573v;
            EnumC34747l enumC34747l = c34940u.f74571t;
            pixelFrame.setRotation(EnumC34747l.m76131a((pixelFrame.getRotation().mValue + enumC34747l.mValue) % TXVodDownloadDataSource.QUALITY_360P));
            if (z11) {
                pixelFrame.setMirrorHorizontal(!pixelFrame.isMirrorHorizontal());
            }
            if (z12) {
                pixelFrame.setMirrorVertical(!pixelFrame.isMirrorVertical());
            }
            if (enumC34747l == EnumC34747l.ROTATION_90 || enumC34747l == EnumC34747l.ROTATION_270) {
                int width = pixelFrame.getWidth();
                pixelFrame.setWidth(pixelFrame.getHeight());
                pixelFrame.setHeight(width);
            }
            pixelFrame.setMirrorVertical(!pixelFrame.isMirrorVertical());
            if (pixelFrame.getRotation() != EnumC34747l.NORMAL) {
                EnumC34747l rotation = pixelFrame.getRotation();
                EnumC34747l enumC34747l2 = EnumC34747l.ROTATION_180;
                if (rotation != enumC34747l2) {
                    pixelFrame.setRotation(EnumC34747l.m76131a((pixelFrame.getRotation().mValue + enumC34747l2.mValue) % TXVodDownloadDataSource.QUALITY_360P));
                }
            }
            c34940u.f74543A.width = pixelFrame.getWidth();
            c34940u.f74543A.height = pixelFrame.getHeight();
            c34940u.m76643a(pixelFrame, c34940u.f74570s);
            if (c34940u.f74544B != null) {
                OpenGlUtils.bindFramebuffer(36160, 0);
                Size size = c34940u.f74562k;
                int i13 = size.width;
                int i14 = size.height;
                InterfaceC34867a interfaceC34867a = c34940u.f74544B;
                if (interfaceC34867a != null) {
                    c34940u.f74544B = null;
                    ByteBuffer byteBufferM76561b = C34898d.m76561b(i13 * i14 * 4);
                    if (byteBufferM76561b == null) {
                        LiteavLog.m76083e(c34940u.f74552a, "snapshotVideoFrameFromFrameBuffer, allocate direct buffer failed.");
                        interfaceC34867a.onComplete(null);
                        c34940u2 = c34940u;
                    } else {
                        byteBufferM76561b.order(ByteOrder.nativeOrder());
                        byteBufferM76561b.position(0);
                        GLES20.glReadPixels(0, 0, i13, i14, 6408, 5121, byteBufferM76561b);
                        c34940u2 = c34940u;
                        c34940u.f74556e.post(RunnableC34943x.m76666a(c34940u2, c34940u.f74575x, byteBufferM76561b, i13, i14, interfaceC34867a));
                    }
                } else {
                    c34940u2 = c34940u;
                }
            } else {
                c34940u2 = c34940u;
            }
            if (!c34940u2.m76659c() || OpenGlUtils.getGLErrorCount() > 0) {
                int i15 = AbstractC34939t.a.f74538a;
                LiteavLog.m76082e(c34940u2.f74561j.m76042a("renderFailed"), c34940u2.f74552a, "render frame failed.", new Object[0]);
            } else {
                int i16 = AbstractC34939t.a.f74538a;
                if (c34940u2.f74546D) {
                    c34940u2.f74558g.notifyEvent(C34908e.b.EVT_VIDEO_RENDER_FIRST_FRAME_ON_VIEW, pixelFrameM76563a, null);
                    c34940u2.f74546D = false;
                }
            }
        } else {
            int i17 = AbstractC34939t.a.f74538a;
            LiteavLog.m76082e(c34940u.f74561j.m76042a("makeCurrent"), c34940u.f74552a, "make current failed.", new Object[0]);
        }
        pixelFrameM76563a.release();
    }

    public C34940u(Looper looper, InterfaceC34906c interfaceC34906c) {
        this.f74557f = new CustomHandler(looper);
        this.f74558g = interfaceC34906c;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public final void onRequestRedraw(Bitmap bitmap) {
        m76640a(bitmap);
        m76663a(RunnableC34945z.m76668a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public final void onSurfaceChanged(Surface surface, boolean z11) {
        m76663a(RunnableC34944y.m76667a(this, surface, z11));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public final void onSurfaceDestroy() {
        Runnable runnableM76592a = RunnableC34915aa.m76592a(this);
        C34748m c34748m = this.f74559h;
        if (c34748m != null) {
            c34748m.m76134a(runnableM76592a, 2000L);
        } else if (Looper.myLooper() == this.f74557f.getLooper()) {
            runnableM76592a.run();
        } else {
            this.f74557f.runAndWaitDone(runnableM76592a, 2000L);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76652a(C34940u c34940u, boolean z11) {
        ArrayList arrayList;
        Surface surface;
        LiteavLog.m76087i(c34940u.f74552a, "Stop,clearLastImage=".concat(String.valueOf(z11)));
        if (!c34940u.f74554c) {
            LiteavLog.m76093w(c34940u.f74552a, "renderer is not started!");
            return;
        }
        c34940u.f74554c = false;
        c34940u.f74544B = null;
        c34940u.m76653a(z11);
        DisplayTarget displayTarget = c34940u.f74574w;
        if (displayTarget != null && z11) {
            displayTarget.hideAll();
        }
        C34900f c34900f = c34940u.f74553b;
        synchronized (c34900f) {
            arrayList = new ArrayList(c34900f.f74322a);
            c34900f.f74322a.clear();
        }
        LiteavLog.m76087i("RingFrameQueue", "evictAll pixelFrame.");
        PixelFrame.releasePixelFrames(arrayList);
        c34940u.m76641a();
        if (c34940u.f74564m && (surface = c34940u.f74563l) != null) {
            surface.release();
            c34940u.f74564m = false;
        }
        c34940u.f74563l = null;
        c34940u.f74562k.set(0, 0);
        c34940u.f74576y.set(0, 0);
        c34940u.f74555d = false;
    }

    /* JADX INFO: renamed from: b */
    private void m76655b() {
        EGLCore eGLCore = this.f74566o;
        if (eGLCore == null) {
            return;
        }
        Size surfaceSize = eGLCore.getSurfaceSize();
        if (this.f74562k.equals(surfaceSize)) {
            return;
        }
        LiteavLog.m76086i(this.f74561j.m76042a("updateSurfaceSize"), this.f74552a, "surface size changed,old size=" + this.f74562k + ",new size=" + surfaceSize, new Object[0]);
        this.f74562k.set(surfaceSize);
        if (this.f74563l != null) {
            InterfaceC34906c interfaceC34906c = this.f74558g;
            EnumC34909f enumC34909f = EnumC34909f.STATUS_VIDEO_RENDER_RESOLUTION;
            Size size = this.f74562k;
            interfaceC34906c.updateStatus(enumC34909f, Integer.valueOf(size.height | (size.width << 16)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76657b(C34940u c34940u) {
        PixelFrame pixelFrameCreateFromBitmap;
        Bitmap bitmapM76640a = c34940u.m76640a((Bitmap) null);
        if (bitmapM76640a == null || (pixelFrameCreateFromBitmap = PixelFrame.createFromBitmap(bitmapM76640a)) == null || !c34940u.m76654a(pixelFrameCreateFromBitmap)) {
            return;
        }
        c34940u.m76655b();
        pixelFrameCreateFromBitmap.setMirrorVertical(true);
        c34940u.m76643a(pixelFrameCreateFromBitmap, c34940u.f74570s);
        c34940u.m76659c();
    }

    /* JADX INFO: renamed from: a */
    public final void m76662a(DisplayTarget displayTarget, boolean z11) {
        m76663a(RunnableC34918ad.m76595a(this, displayTarget, z11));
    }

    /* JADX INFO: renamed from: a */
    public final void m76661a(GLConstants.GLScaleType gLScaleType) {
        m76663a(RunnableC34919ae.m76596a(this, gLScaleType));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76647a(C34940u c34940u, GLConstants.GLScaleType gLScaleType) {
        if (c34940u.f74570s != gLScaleType) {
            LiteavLog.m76087i(c34940u.f74552a, "setScaleType ".concat(String.valueOf(gLScaleType)));
            c34940u.f74570s = gLScaleType;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76660a(EnumC34747l enumC34747l) {
        m76663a(RunnableC34920af.m76597a(this, enumC34747l));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76646a(C34940u c34940u, EnumC34747l enumC34747l) {
        if (c34940u.f74571t != enumC34747l) {
            LiteavLog.m76087i(c34940u.f74552a, "setRenderRotation ".concat(String.valueOf(enumC34747l)));
            c34940u.f74571t = enumC34747l;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76663a(Runnable runnable) {
        C34748m c34748m = this.f74559h;
        if (c34748m != null) {
            c34748m.mo76133a(runnable);
        } else if (Looper.myLooper() == this.f74557f.getLooper()) {
            runnable.run();
        } else {
            this.f74557f.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76641a() {
        if (this.f74566o == null) {
            return;
        }
        C34691a c34691aM76042a = this.f74561j.m76042a("uninitGL");
        String str = this.f74552a;
        Surface surface = this.f74563l;
        LiteavLog.m76086i(c34691aM76042a, str, "uninitializeEGL %d %s", Integer.valueOf(surface != null ? surface.hashCode() : 0), this.f74562k);
        try {
            this.f74566o.makeCurrent();
        } catch (C34880d e11) {
            LiteavLog.m76082e(this.f74561j.m76042a("makeCurrentError"), this.f74552a, "uninitializeEGL EGLCore makeCurrent failed.".concat(String.valueOf(e11)), new Object[0]);
        }
        C34914a c34914a = this.f74549G;
        if (c34914a != null) {
            C34890i c34890i = c34914a.f74466g;
            if (c34890i != null) {
                c34890i.m76549a();
                c34914a.f74466g = null;
            }
            C34863b c34863b = c34914a.f74463d;
            if (c34863b != null) {
                c34863b.m76475b();
                c34914a.f74463d = null;
            }
            this.f74549G = null;
        }
        C34890i c34890i2 = this.f74568q;
        if (c34890i2 != null) {
            c34890i2.m76549a();
            this.f74568q = null;
        }
        this.f74567p.m76525d();
        C34886e c34886e = this.f74569r;
        if (c34886e != null) {
            c34886e.mo76516a();
            this.f74569r.mo76519b();
            this.f74569r = null;
        }
        EGLCore.destroy(this.f74566o);
        this.f74566o = null;
    }

    /* JADX INFO: renamed from: c */
    private boolean m76659c() {
        try {
            this.f74566o.swapBuffers();
            return true;
        } catch (C34880d e11) {
            LiteavLog.m76082e(this.f74561j.m76042a("swapBuffers"), this.f74552a, "EGLCore swapBuffers failed.".concat(String.valueOf(e11)), new Object[0]);
            this.f74558g.notifyWarning(C34908e.c.WARNING_VIDEO_RENDER_SWAP_BUFFER, "VideoRender: swapBuffer error:".concat(String.valueOf(e11)));
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m76654a(PixelFrame pixelFrame) {
        Object gLContext = pixelFrame.getGLContext();
        if (this.f74566o == null || (gLContext != null && !CommonUtil.equals(this.f74565n, gLContext))) {
            m76641a();
            Object gLContext2 = pixelFrame.getGLContext();
            if (this.f74563l == null) {
                LiteavLog.m76082e(this.f74561j.m76042a("initGLNoSurface"), this.f74552a, "Initialize EGL failed because surface is null", new Object[0]);
            } else {
                try {
                    LiteavLog.m76086i(this.f74561j.m76042a("initGL"), this.f74552a, "initializeEGL surface=" + this.f74563l + ",size=" + this.f74562k, new Object[0]);
                    EGLCore eGLCore = new EGLCore();
                    this.f74566o = eGLCore;
                    Surface surface = this.f74563l;
                    Size size = this.f74562k;
                    eGLCore.initialize(gLContext2, surface, size.width, size.height);
                    this.f74565n = gLContext2;
                    this.f74566o.makeCurrent();
                    if (this.f74569r == null) {
                        this.f74569r = new C34886e();
                    }
                    this.f74567p.m76521a();
                } catch (C34880d e11) {
                    LiteavLog.m76081e(this.f74561j.m76042a("initGLError"), this.f74552a, "initializeEGL failed.", e11);
                    this.f74566o = null;
                    this.f74558g.notifyWarning(C34908e.c.WARNING_VIDEO_RENDER_EGL_CORE_CREATE_FAILED, "VideoRender: create EGLCore fail:".concat(String.valueOf(e11)));
                }
            }
        }
        EGLCore eGLCore2 = this.f74566o;
        if (eGLCore2 == null) {
            return false;
        }
        try {
            eGLCore2.makeCurrent();
            return true;
        } catch (C34880d e12) {
            LiteavLog.m76082e(this.f74561j.m76042a("makeCurrentForFrameError"), this.f74552a, "EGLCore makeCurrent failed.".concat(String.valueOf(e12)), new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76643a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        RenderViewHelperInterface renderViewHelperInterface = this.f74575x;
        if (renderViewHelperInterface != null) {
            renderViewHelperInterface.updateVideoFrameInfo(this.f74570s, this.f74543A.getWidth(), this.f74543A.getHeight(), this.f74577z);
        }
        if (this.f74562k.isValid()) {
            if (this.f74575x instanceof TextureViewSurfaceTextureListenerC34930k) {
                gLScaleType = GLConstants.GLScaleType.FILL;
            }
            List<PointF> list = this.f74550H;
            List<PointF> list2 = this.f74551I;
            if (list != null && list.size() == 4 && list2 != null && list2.size() == 4) {
                if (this.f74549G == null) {
                    C34886e c34886e = this.f74569r;
                    Size size = this.f74562k;
                    C34914a c34914a = new C34914a(c34886e, size.width, size.height);
                    this.f74549G = c34914a;
                    List<PointF> list3 = this.f74550H;
                    List<PointF> list4 = this.f74551I;
                    c34914a.f74468i = list3;
                    c34914a.f74469j = list4;
                    c34914a.f74470k = true;
                }
                RenderViewHelperInterface renderViewHelperInterface2 = this.f74575x;
                if (renderViewHelperInterface2 != null) {
                    C34914a c34914a2 = this.f74549G;
                    Size size2 = this.f74562k;
                    Matrix transformMatrix = renderViewHelperInterface2.getTransformMatrix(size2.width, size2.height);
                    if (!C34744i.m76117a(c34914a2.f74467h, transformMatrix)) {
                        c34914a2.f74467h = transformMatrix;
                        c34914a2.f74470k = true;
                    }
                }
                C34914a c34914a3 = this.f74549G;
                Size size3 = this.f74562k;
                int i11 = size3.width;
                int i12 = size3.height;
                Size size4 = c34914a3.f74461b;
                if (size4.width != i11 || size4.height != i12) {
                    size4.set(i11, i12);
                    c34914a3.f74470k = true;
                }
                C34914a c34914a4 = this.f74549G;
                if (c34914a4.f74461b.isValid()) {
                    if (c34914a4.f74466g == null) {
                        LiteavLog.m76087i(c34914a4.f74460a, "create PixelFrameRenderer, size =" + c34914a4.f74461b);
                        Size size5 = c34914a4.f74461b;
                        c34914a4.f74466g = new C34890i(size5.width, size5.height);
                    }
                    Size size6 = c34914a4.f74461b;
                    OpenGlUtils.glViewport(0, 0, size6.width, size6.height);
                    C34886e c34886e2 = c34914a4.f74462c;
                    Size size7 = c34914a4.f74461b;
                    AbstractC34885d abstractC34885dM76532a = c34886e2.m76532a(size7.width, size7.height);
                    C34890i c34890i = c34914a4.f74466g;
                    Size size8 = c34914a4.f74461b;
                    c34890i.m76550a(size8.width, size8.height);
                    c34914a4.f74466g.m76551a(pixelFrame, gLScaleType, abstractC34885dM76532a);
                    C34863b c34863b = c34914a4.f74463d;
                    if (c34863b == null && c34863b == null) {
                        C34863b c34863b2 = new C34863b();
                        c34914a4.f74463d = c34863b2;
                        c34863b2.m76473a(c34914a4.f74462c);
                        if (c34914a4.f74464e == null || c34914a4.f74465f == null) {
                            c34914a4.f74464e = OpenGlUtils.createNormalCubeVerticesBuffer();
                            c34914a4.f74465f = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
                        }
                    }
                    if (c34914a4.f74470k) {
                        c34914a4.m76591a(c34914a4.f74468i, c34914a4.f74469j);
                        c34914a4.f74470k = false;
                    }
                    c34914a4.f74463d.mo76472a(abstractC34885dM76532a.mo76526a(), null, c34914a4.f74464e, c34914a4.f74465f);
                    abstractC34885dM76532a.release();
                    return;
                }
                return;
            }
            Size size9 = this.f74562k;
            OpenGlUtils.glViewport(0, 0, size9.width, size9.height);
            if (this.f74568q == null) {
                LiteavLog.m76087i(this.f74552a, "create PixelFrameRenderer, surfaceSize=" + this.f74562k);
                Size size10 = this.f74562k;
                this.f74568q = new C34890i(size10.width, size10.height);
            }
            C34890i c34890i2 = this.f74568q;
            Size size11 = this.f74562k;
            c34890i2.m76550a(size11.width, size11.height);
            this.f74568q.m76551a(pixelFrame, gLScaleType, (AbstractC34885d) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76649a(C34940u c34940u, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i11, int i12, InterfaceC34867a interfaceC34867a) {
        TextureView textureView = renderViewHelperInterface instanceof TextureViewSurfaceTextureListenerC34930k ? ((TextureViewSurfaceTextureListenerC34930k) renderViewHelperInterface).f74513a : null;
        c34940u.f74560i.mo76133a(RunnableC34916ab.m76593a(c34940u, byteBuffer, i11, i12, textureView != null ? textureView.getTransform(new Matrix()) : null, interfaceC34867a));
    }

    /* JADX INFO: renamed from: a */
    private void m76642a(Surface surface, boolean z11) {
        Surface surface2;
        if (C34744i.m76117a(this.f74563l, surface)) {
            LiteavLog.m76079d(this.f74552a, "updateSurface same surface!");
            return;
        }
        m76641a();
        if (this.f74564m && (surface2 = this.f74563l) != null) {
            surface2.release();
        }
        this.f74563l = surface;
        if (surface == null) {
            this.f74562k.set(0, 0);
        }
        this.f74564m = z11;
    }

    /* JADX INFO: renamed from: a */
    private void m76653a(boolean z11) {
        RenderViewHelperInterface renderViewHelperInterface = this.f74575x;
        if (renderViewHelperInterface != null) {
            renderViewHelperInterface.release(z11);
            this.f74575x = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76645a(C34940u c34940u, Surface surface, boolean z11) {
        LiteavLog.m76088i(c34940u.f74552a, "onSurfaceChanged surface: %s, oldSurface: %s, isNeedRelease: %b", surface, c34940u.f74563l, Boolean.valueOf(z11));
        c34940u.m76642a(surface, z11);
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m76640a(Bitmap bitmap) {
        Bitmap bitmap2;
        synchronized (this) {
            bitmap2 = this.f74547E;
            this.f74547E = bitmap;
        }
        return bitmap2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76644a(C34940u c34940u) {
        LiteavLog.m76087i(c34940u.f74552a, "onSurfaceDestroy " + c34940u.f74563l);
        c34940u.m76642a((Surface) null, c34940u.f74564m);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76651a(C34940u c34940u, ByteBuffer byteBuffer, int i11, int i12, Matrix matrix, InterfaceC34867a interfaceC34867a) {
        try {
            byteBuffer.position(0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            if (matrix == null) {
                matrix = new Matrix();
            }
            matrix.postScale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
            interfaceC34867a.onComplete(BitmapUtils.createBitmap(bitmapCreateBitmap, matrix, true));
        } catch (Throwable th2) {
            LiteavLog.m76084e(c34940u.f74552a, "build snapshot bitmap failed.", th2);
            interfaceC34867a.onComplete(null);
        }
    }
}
