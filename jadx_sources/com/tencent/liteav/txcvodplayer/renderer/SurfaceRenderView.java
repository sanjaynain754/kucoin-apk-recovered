package com.tencent.liteav.txcvodplayer.renderer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.InterfaceC34807b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes59.dex */
public class SurfaceRenderView extends SurfaceView implements InterfaceC34849a {

    /* JADX INFO: renamed from: a */
    private C34850b f74033a;

    /* JADX INFO: renamed from: b */
    private SurfaceHolderCallbackC34846b f74034b;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.SurfaceRenderView$a */
    public static final class C34845a implements InterfaceC34849a.b {

        /* JADX INFO: renamed from: a */
        private SurfaceRenderView f74035a;

        /* JADX INFO: renamed from: b */
        private SurfaceHolder f74036b;

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: a */
        public final void mo76328a(ITXVCubePlayer iTXVCubePlayer) {
            if (iTXVCubePlayer != null) {
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 16 && (iTXVCubePlayer instanceof InterfaceC34807b)) {
                    ((InterfaceC34807b) iTXVCubePlayer).setSurfaceTexture(null);
                }
                iTXVCubePlayer.setDisplay(this.f74036b);
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: b */
        public final Surface mo76329b() {
            SurfaceHolder surfaceHolder = this.f74036b;
            if (surfaceHolder == null) {
                return null;
            }
            return surfaceHolder.getSurface();
        }

        public C34845a(SurfaceRenderView surfaceRenderView, SurfaceHolder surfaceHolder) {
            this.f74035a = surfaceRenderView;
            this.f74036b = surfaceHolder;
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: c */
        public final Surface mo76330c() {
            return mo76329b();
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
        /* JADX INFO: renamed from: a */
        public final InterfaceC34849a mo76327a() {
            return this.f74035a;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.SurfaceRenderView$b */
    public static final class SurfaceHolderCallbackC34846b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        SurfaceHolder f74037a;

        /* JADX INFO: renamed from: b */
        boolean f74038b;

        /* JADX INFO: renamed from: c */
        int f74039c;

        /* JADX INFO: renamed from: d */
        int f74040d;

        /* JADX INFO: renamed from: e */
        WeakReference<SurfaceRenderView> f74041e;

        /* JADX INFO: renamed from: f */
        Map<InterfaceC34849a.a, Object> f74042f = new ConcurrentHashMap();

        /* JADX INFO: renamed from: g */
        private int f74043g;

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f74037a = null;
            this.f74038b = false;
            this.f74043g = 0;
            this.f74039c = 0;
            this.f74040d = 0;
            C34845a c34845a = new C34845a(this.f74041e.get(), this.f74037a);
            Iterator<InterfaceC34849a.a> it = this.f74042f.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo76334b(c34845a);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            this.f74037a = surfaceHolder;
            this.f74038b = true;
            this.f74043g = i11;
            this.f74039c = i12;
            this.f74040d = i13;
            C34845a c34845a = new C34845a(this.f74041e.get(), this.f74037a);
            Iterator<InterfaceC34849a.a> it = this.f74042f.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo76332a(c34845a, i12, i13);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f74037a = surfaceHolder;
            this.f74038b = false;
            this.f74043g = 0;
            this.f74039c = 0;
            this.f74040d = 0;
            C34845a c34845a = new C34845a(this.f74041e.get(), this.f74037a);
            Iterator<InterfaceC34849a.a> it = this.f74042f.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo76331a(c34845a);
            }
        }

        public SurfaceHolderCallbackC34846b(SurfaceRenderView surfaceRenderView) {
            this.f74041e = new WeakReference<>(surfaceRenderView);
        }
    }

    public SurfaceRenderView(Context context) {
        super(context);
        m76429b();
    }

    /* JADX INFO: renamed from: b */
    private void m76429b() {
        this.f74033a = new C34850b(this);
        this.f74034b = new SurfaceHolderCallbackC34846b(this);
        getHolder().addCallback(this.f74034b);
        getHolder().setType(0);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: a */
    public final boolean mo76432a() {
        return true;
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: a */
    public final void mo76430a(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f74033a.m76438a(i11, i12);
        getHolder().setFixedSize(i11, i12);
        requestLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i11, int i12) {
        this.f74033a.m76440c(i11, i12);
        C34850b c34850b = this.f74033a;
        setMeasuredDimension(c34850b.f74060b, c34850b.f74061c);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<InterfaceC34849a.a> it = this.f74034b.f74042f.keySet().iterator();
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
        this.f74033a.f74062d = i11;
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    public void setVideoRotation(int i11) {
        LiteavLog.m76083e("", "SurfaceView doesn't support rotation (" + i11 + ")!\n");
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76429b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 14) {
            accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
        }
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m76429b();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: a */
    public final void mo76431a(InterfaceC34849a.a aVar) {
        C34845a c34845a;
        SurfaceHolderCallbackC34846b surfaceHolderCallbackC34846b = this.f74034b;
        surfaceHolderCallbackC34846b.f74042f.put(aVar, aVar);
        if (surfaceHolderCallbackC34846b.f74037a != null) {
            c34845a = new C34845a(surfaceHolderCallbackC34846b.f74041e.get(), surfaceHolderCallbackC34846b.f74037a);
            aVar.mo76331a(c34845a);
        } else {
            c34845a = null;
        }
        if (surfaceHolderCallbackC34846b.f74038b) {
            if (c34845a == null) {
                c34845a = new C34845a(surfaceHolderCallbackC34846b.f74041e.get(), surfaceHolderCallbackC34846b.f74037a);
            }
            aVar.mo76332a(c34845a, surfaceHolderCallbackC34846b.f74039c, surfaceHolderCallbackC34846b.f74040d);
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: b */
    public final void mo76433b(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f74033a.m76439b(i11, i12);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    /* JADX INFO: renamed from: b */
    public final void mo76434b(InterfaceC34849a.a aVar) {
        this.f74034b.f74042f.remove(aVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a
    public View getView() {
        return this;
    }
}
