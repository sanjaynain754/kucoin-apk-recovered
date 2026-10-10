package com.tencent.liteav.txcvodplayer.renderer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.InterfaceC34807b;
import com.tencent.liteav.txcplayer.InterfaceC34808c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes59.dex */
public class TextureRenderView extends TextureView implements InterfaceC34849a {

    /* JADX INFO: renamed from: a */
    private C34850b f74044a;

    /* JADX INFO: renamed from: b */
    private TextureViewSurfaceTextureListenerC34848b f74045b;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.TextureRenderView$a */
    public static final class C34847a implements InterfaceC34849a.b {

        /* JADX INFO: renamed from: a */
        private TextureRenderView f74046a;

        /* JADX INFO: renamed from: b */
        private SurfaceTexture f74047b;

        /* JADX INFO: renamed from: c */
        private InterfaceC34808c f74048c;

        /* JADX INFO: renamed from: d */
        private Surface f74049d;

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: a */
        public final void mo76328a(ITXVCubePlayer iTXVCubePlayer) {
            if (iTXVCubePlayer == null) {
                return;
            }
            if (LiteavSystemInfo.getSystemOSVersionInt() < 16 || !(iTXVCubePlayer instanceof InterfaceC34807b)) {
                Surface surfaceMo76329b = mo76329b();
                this.f74049d = surfaceMo76329b;
                iTXVCubePlayer.setSurface(surfaceMo76329b);
                return;
            }
            InterfaceC34807b interfaceC34807b = (InterfaceC34807b) iTXVCubePlayer;
            this.f74046a.f74045b.f74054e = false;
            if (this.f74046a.getSurfaceTexture() != null) {
                this.f74047b = this.f74046a.getSurfaceTexture();
            }
            try {
                SurfaceTexture surfaceTexture = interfaceC34807b.getSurfaceTexture();
                if (surfaceTexture != null) {
                    interfaceC34807b.setSurfaceTextureHost(this.f74046a.f74045b);
                    if (this.f74046a.getSurfaceTexture() != surfaceTexture) {
                        this.f74046a.setSurfaceTexture(surfaceTexture);
                    }
                    this.f74046a.f74045b.f74050a = surfaceTexture;
                } else {
                    Surface surface = this.f74049d;
                    if (surface != null) {
                        iTXVCubePlayer.setSurface(surface);
                    }
                    interfaceC34807b.setSurfaceTexture(this.f74047b);
                    interfaceC34807b.setSurfaceTextureHost(this.f74046a.f74045b);
                }
                this.f74049d = iTXVCubePlayer.getSurface();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: b */
        public final Surface mo76329b() {
            if (this.f74047b == null) {
                return null;
            }
            if (this.f74049d == null) {
                this.f74049d = new Surface(this.f74047b);
            }
            return this.f74049d;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: c */
        public final Surface mo76330c() {
            return this.f74049d;
        }

        public C34847a(TextureRenderView textureRenderView, SurfaceTexture surfaceTexture, InterfaceC34808c interfaceC34808c) {
            this.f74046a = textureRenderView;
            this.f74047b = surfaceTexture;
            this.f74048c = interfaceC34808c;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: a */
        public final InterfaceC34849a mo76327a() {
            return this.f74046a;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.TextureRenderView$b */
    public static final class TextureViewSurfaceTextureListenerC34848b implements TextureView.SurfaceTextureListener, InterfaceC34808c {

        /* JADX INFO: renamed from: a */
        SurfaceTexture f74050a;

        /* JADX INFO: renamed from: b */
        boolean f74051b;

        /* JADX INFO: renamed from: c */
        int f74052c;

        /* JADX INFO: renamed from: d */
        int f74053d;

        /* JADX INFO: renamed from: h */
        WeakReference<TextureRenderView> f74057h;

        /* JADX INFO: renamed from: e */
        boolean f74054e = true;

        /* JADX INFO: renamed from: f */
        boolean f74055f = false;

        /* JADX INFO: renamed from: g */
        boolean f74056g = false;

        /* JADX INFO: renamed from: i */
        Map<InterfaceC34849a.a, Object> f74058i = new ConcurrentHashMap();

        @Override // com.tencent.liteav.txcplayer.InterfaceC34808c
        /* JADX INFO: renamed from: a */
        public final void mo76229a(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: null");
                return;
            }
            if (this.f74056g) {
                if (surfaceTexture != this.f74050a) {
                    LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f74054e) {
                    LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                    return;
                } else {
                    LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                    return;
                }
            }
            if (this.f74055f) {
                if (surfaceTexture != this.f74050a) {
                    LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f74054e) {
                    LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                    return;
                } else {
                    LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    this.f74054e = true;
                    return;
                }
            }
            if (surfaceTexture != this.f74050a) {
                LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (this.f74054e) {
                LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: alive: will released by TextureView");
            } else {
                LiteavLog.m76087i("TextureRenderView", "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                this.f74054e = true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f74050a = surfaceTexture;
            this.f74051b = false;
            this.f74052c = 0;
            this.f74053d = 0;
            C34847a c34847a = new C34847a(this.f74057h.get(), surfaceTexture, this);
            Iterator<InterfaceC34849a.a> it = this.f74058i.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo76331a(c34847a);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f74050a = surfaceTexture;
            this.f74051b = false;
            this.f74052c = 0;
            this.f74053d = 0;
            C34847a c34847a = new C34847a(this.f74057h.get(), surfaceTexture, this);
            Iterator<InterfaceC34849a.a> it = this.f74058i.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo76334b(c34847a);
            }
            LiteavLog.m76087i("TextureRenderView", "onSurfaceTextureDestroyed: destroy: " + this.f74054e);
            return this.f74054e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f74050a = surfaceTexture;
            this.f74051b = true;
            this.f74052c = i11;
            this.f74053d = i12;
            C34847a c34847a = new C34847a(this.f74057h.get(), surfaceTexture, this);
            Iterator<InterfaceC34849a.a> it = this.f74058i.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo76332a(c34847a, i11, i12);
            }
        }

        public TextureViewSurfaceTextureListenerC34848b(TextureRenderView textureRenderView) {
            this.f74057h = new WeakReference<>(textureRenderView);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureRenderView(Context context) {
        super(context);
        m76436b();
    }

    /* JADX INFO: renamed from: b */
    private void m76436b() {
        this.f74044a = new C34850b(this);
        TextureViewSurfaceTextureListenerC34848b textureViewSurfaceTextureListenerC34848b = new TextureViewSurfaceTextureListenerC34848b(this);
        this.f74045b = textureViewSurfaceTextureListenerC34848b;
        setSurfaceTextureListener(textureViewSurfaceTextureListenerC34848b);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: a */
    public final boolean mo76432a() {
        return false;
    }

    public InterfaceC34849a.b getSurfaceHolder() {
        return new C34847a(this, this.f74045b.f74050a, this.f74045b);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            TextureViewSurfaceTextureListenerC34848b textureViewSurfaceTextureListenerC34848b = this.f74045b;
            LiteavLog.m76087i("TextureRenderView", "willDetachFromWindow()");
            textureViewSurfaceTextureListenerC34848b.f74055f = true;
            super.onDetachedFromWindow();
            TextureViewSurfaceTextureListenerC34848b textureViewSurfaceTextureListenerC34848b2 = this.f74045b;
            LiteavLog.m76087i("TextureRenderView", "didDetachFromWindow()");
            textureViewSurfaceTextureListenerC34848b2.f74056g = true;
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        this.f74044a.m76440c(i11, i12);
        C34850b c34850b = this.f74044a;
        setMeasuredDimension(c34850b.f74060b, c34850b.f74061c);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<InterfaceC34849a.a> it = this.f74045b.f74058i.keySet().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (it.next().mo76333a(motionEvent)) {
                z11 = true;
            }
        }
        if (z11) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    public void setAspectRatio(int i11) {
        this.f74044a.f74062d = i11;
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    public void setVideoRotation(int i11) {
        this.f74044a.f74059a = i11;
        setRotation(i11);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76436b();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: a */
    public final void mo76430a(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f74044a.m76438a(i11, i12);
        requestLayout();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextureViewSurfaceTextureListenerC34848b textureViewSurfaceTextureListenerC34848b = this.f74045b;
        LiteavLog.m76087i("TextureRenderView", "onAttachFromWindow()");
        textureViewSurfaceTextureListenerC34848b.f74055f = false;
        textureViewSurfaceTextureListenerC34848b.f74056g = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: b */
    public final void mo76433b(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f74044a.m76439b(i11, i12);
        requestLayout();
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m76436b();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: a */
    public final void mo76431a(InterfaceC34849a.a aVar) {
        C34847a c34847a;
        TextureViewSurfaceTextureListenerC34848b textureViewSurfaceTextureListenerC34848b = this.f74045b;
        textureViewSurfaceTextureListenerC34848b.f74058i.put(aVar, aVar);
        if (textureViewSurfaceTextureListenerC34848b.f74050a != null) {
            c34847a = new C34847a(textureViewSurfaceTextureListenerC34848b.f74057h.get(), textureViewSurfaceTextureListenerC34848b.f74050a, textureViewSurfaceTextureListenerC34848b);
            aVar.mo76331a(c34847a);
        } else {
            c34847a = null;
        }
        if (textureViewSurfaceTextureListenerC34848b.f74051b) {
            if (c34847a == null) {
                c34847a = new C34847a(textureViewSurfaceTextureListenerC34848b.f74057h.get(), textureViewSurfaceTextureListenerC34848b.f74050a, textureViewSurfaceTextureListenerC34848b);
            }
            aVar.mo76332a(c34847a, textureViewSurfaceTextureListenerC34848b.f74052c, textureViewSurfaceTextureListenerC34848b.f74053d);
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: b */
    public final void mo76434b(InterfaceC34849a.a aVar) {
        this.f74045b.f74058i.remove(aVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    public View getView() {
        return this;
    }
}
