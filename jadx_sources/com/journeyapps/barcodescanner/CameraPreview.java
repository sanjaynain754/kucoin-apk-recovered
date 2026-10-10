package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import com.google.zxing.client.android.C9149R;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p037b9.C4518l;
import p037b9.C4519m;
import p037b9.C4521o;
import p037b9.InterfaceC4517k;
import p055c9.AbstractC4916j;
import p055c9.C4908b;
import p055c9.C4909c;
import p055c9.C4911e;
import p055c9.C4912f;
import p055c9.C4913g;
import p055c9.C4914h;

/* JADX INFO: loaded from: classes56.dex */
public class CameraPreview extends ViewGroup {

    /* JADX INFO: renamed from: B */
    public static final String f13275B = "CameraPreview";

    /* JADX INFO: renamed from: A */
    public final InterfaceC9293f f13276A;

    /* JADX INFO: renamed from: b */
    public C4908b f13277b;

    /* JADX INFO: renamed from: c */
    public WindowManager f13278c;

    /* JADX INFO: renamed from: d */
    public Handler f13279d;

    /* JADX INFO: renamed from: e */
    public boolean f13280e;

    /* JADX INFO: renamed from: f */
    public SurfaceView f13281f;

    /* JADX INFO: renamed from: g */
    public TextureView f13282g;

    /* JADX INFO: renamed from: h */
    public boolean f13283h;

    /* JADX INFO: renamed from: i */
    public C4518l f13284i;

    /* JADX INFO: renamed from: j */
    public int f13285j;

    /* JADX INFO: renamed from: k */
    public List<InterfaceC9293f> f13286k;

    /* JADX INFO: renamed from: l */
    public C4912f f13287l;

    /* JADX INFO: renamed from: m */
    public CameraSettings f13288m;

    /* JADX INFO: renamed from: n */
    public C4519m f13289n;

    /* JADX INFO: renamed from: o */
    public C4519m f13290o;

    /* JADX INFO: renamed from: p */
    public Rect f13291p;

    /* JADX INFO: renamed from: q */
    public C4519m f13292q;

    /* JADX INFO: renamed from: r */
    public Rect f13293r;

    /* JADX INFO: renamed from: s */
    public Rect f13294s;

    /* JADX INFO: renamed from: t */
    public C4519m f13295t;

    /* JADX INFO: renamed from: u */
    public double f13296u;

    /* JADX INFO: renamed from: v */
    public AbstractC4916j f13297v;

    /* JADX INFO: renamed from: w */
    public boolean f13298w;

    /* JADX INFO: renamed from: x */
    public final SurfaceHolder.Callback f13299x;

    /* JADX INFO: renamed from: y */
    public final Handler.Callback f13300y;

    /* JADX INFO: renamed from: z */
    public InterfaceC4517k f13301z;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$a */
    public class TextureViewSurfaceTextureListenerC9288a implements TextureView.SurfaceTextureListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public TextureViewSurfaceTextureListenerC9288a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            CameraPreview.this.f13292q = new C4519m(i11, i12);
            CameraPreview.this.m14324C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            onSurfaceTextureSizeChanged(surfaceTexture, i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$b */
    public class SurfaceHolderCallbackC9289b implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC9289b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            if (surfaceHolder == null) {
                Log.e(CameraPreview.f13275B, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            CameraPreview.this.f13292q = new C4519m(i12, i13);
            CameraPreview.this.m14324C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.f13292q = null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$c */
    public class C9290c implements Handler.Callback {
        public C9290c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == C9149R.id.zxing_prewiew_size_ready) {
                CameraPreview.this.m14339w((C4519m) message.obj);
                return true;
            }
            if (i11 != C9149R.id.zxing_camera_error) {
                if (i11 != C9149R.id.zxing_camera_closed) {
                    return false;
                }
                CameraPreview.this.f13276A.mo14343b();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!CameraPreview.this.m14335r()) {
                return false;
            }
            CameraPreview.this.mo14312u();
            CameraPreview.this.f13276A.mo14344c(exc);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$d */
    public class C9291d implements InterfaceC4517k {

        /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CameraPreview.this.m14341z();
            }
        }

        public C9291d() {
        }

        @Override // p037b9.InterfaceC4517k
        public void onRotationChanged(int i11) {
            CameraPreview.this.f13279d.postDelayed(new a(), 250L);
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$e */
    public class C9292e implements InterfaceC9293f {
        public C9292e() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: a */
        public void mo14342a() {
            Iterator it = CameraPreview.this.f13286k.iterator();
            while (it.hasNext()) {
                ((InterfaceC9293f) it.next()).mo14342a();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: b */
        public void mo14343b() {
            Iterator it = CameraPreview.this.f13286k.iterator();
            while (it.hasNext()) {
                ((InterfaceC9293f) it.next()).mo14343b();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: c */
        public void mo14344c(Exception exc) {
            Iterator it = CameraPreview.this.f13286k.iterator();
            while (it.hasNext()) {
                ((InterfaceC9293f) it.next()).mo14344c(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: d */
        public void mo14345d() {
            Iterator it = CameraPreview.this.f13286k.iterator();
            while (it.hasNext()) {
                ((InterfaceC9293f) it.next()).mo14345d();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: e */
        public void mo14346e() {
            Iterator it = CameraPreview.this.f13286k.iterator();
            while (it.hasNext()) {
                ((InterfaceC9293f) it.next()).mo14346e();
            }
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$f */
    public interface InterfaceC9293f {
        /* JADX INFO: renamed from: a */
        void mo14342a();

        /* JADX INFO: renamed from: b */
        void mo14343b();

        /* JADX INFO: renamed from: c */
        void mo14344c(Exception exc);

        /* JADX INFO: renamed from: d */
        void mo14345d();

        /* JADX INFO: renamed from: e */
        void mo14346e();
    }

    public CameraPreview(Context context) {
        super(context);
        this.f13280e = false;
        this.f13283h = false;
        this.f13285j = -1;
        this.f13286k = new ArrayList();
        this.f13288m = new CameraSettings();
        this.f13293r = null;
        this.f13294s = null;
        this.f13295t = null;
        this.f13296u = 0.1d;
        this.f13297v = null;
        this.f13298w = false;
        this.f13299x = new SurfaceHolderCallbackC9289b();
        this.f13300y = new C9290c();
        this.f13301z = new C9291d();
        this.f13276A = new C9292e();
        m14333p(context, null, 0, 0);
    }

    private int getDisplayRotation() {
        return this.f13278c.getDefaultDisplay().getRotation();
    }

    /* JADX INFO: renamed from: A */
    public final void m14322A() {
        if (this.f13280e) {
            TextureView textureView = new TextureView(getContext());
            this.f13282g = textureView;
            textureView.setSurfaceTextureListener(m14325D());
            addView(this.f13282g);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f13281f = surfaceView;
        surfaceView.getHolder().addCallback(this.f13299x);
        addView(this.f13281f);
    }

    /* JADX INFO: renamed from: B */
    public final void m14323B(C4909c c4909c) {
        if (this.f13283h || this.f13277b == null) {
            return;
        }
        Log.i(f13275B, "Starting preview");
        this.f13277b.m5121u(c4909c);
        this.f13277b.m5123w();
        this.f13283h = true;
        mo14313x();
        this.f13276A.mo14346e();
    }

    /* JADX INFO: renamed from: C */
    public final void m14324C() {
        Rect rect;
        C4519m c4519m = this.f13292q;
        if (c4519m == null || this.f13290o == null || (rect = this.f13291p) == null) {
            return;
        }
        if (this.f13281f != null && c4519m.equals(new C4519m(rect.width(), this.f13291p.height()))) {
            m14323B(new C4909c(this.f13281f.getHolder()));
            return;
        }
        TextureView textureView = this.f13282g;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f13290o != null) {
            this.f13282g.setTransform(m14329l(new C4519m(this.f13282g.getWidth(), this.f13282g.getHeight()), this.f13290o));
        }
        m14323B(new C4909c(this.f13282g.getSurfaceTexture()));
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: D */
    public final TextureView.SurfaceTextureListener m14325D() {
        return new TextureViewSurfaceTextureListenerC9288a();
    }

    public C4908b getCameraInstance() {
        return this.f13277b;
    }

    public CameraSettings getCameraSettings() {
        return this.f13288m;
    }

    public Rect getFramingRect() {
        return this.f13293r;
    }

    public C4519m getFramingRectSize() {
        return this.f13295t;
    }

    public double getMarginFraction() {
        return this.f13296u;
    }

    public Rect getPreviewFramingRect() {
        return this.f13294s;
    }

    public AbstractC4916j getPreviewScalingStrategy() {
        AbstractC4916j abstractC4916j = this.f13297v;
        if (abstractC4916j != null) {
            return abstractC4916j;
        }
        return this.f13282g != null ? new C4911e() : new C4913g();
    }

    /* JADX INFO: renamed from: i */
    public void m14326i(InterfaceC9293f interfaceC9293f) {
        this.f13286k.add(interfaceC9293f);
    }

    /* JADX INFO: renamed from: j */
    public final void m14327j() {
        C4519m c4519m;
        C4912f c4912f;
        C4519m c4519m2 = this.f13289n;
        if (c4519m2 == null || (c4519m = this.f13290o) == null || (c4912f = this.f13287l) == null) {
            this.f13294s = null;
            this.f13293r = null;
            this.f13291p = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i11 = c4519m.f3949b;
        int i12 = c4519m.f3950c;
        int i13 = c4519m2.f3949b;
        int i14 = c4519m2.f3950c;
        this.f13291p = c4912f.m5137d(c4519m);
        this.f13293r = mo14328k(new Rect(0, 0, i13, i14), this.f13291p);
        Rect rect = new Rect(this.f13293r);
        Rect rect2 = this.f13291p;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i11) / this.f13291p.width(), (rect.top * i12) / this.f13291p.height(), (rect.right * i11) / this.f13291p.width(), (rect.bottom * i12) / this.f13291p.height());
        this.f13294s = rect3;
        if (rect3.width() > 0 && this.f13294s.height() > 0) {
            this.f13276A.mo14342a();
            return;
        }
        this.f13294s = null;
        this.f13293r = null;
        Log.w(f13275B, "Preview frame is too small");
    }

    /* JADX INFO: renamed from: k */
    public Rect mo14328k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f13295t != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f13295t.f3949b) / 2), Math.max(0, (rect3.height() - this.f13295t.f3950c) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(((double) rect3.width()) * this.f13296u, ((double) rect3.height()) * this.f13296u);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* JADX INFO: renamed from: l */
    public Matrix m14329l(C4519m c4519m, C4519m c4519m2) {
        float f11;
        float f12 = c4519m.f3949b / c4519m.f3950c;
        float f13 = c4519m2.f3949b / c4519m2.f3950c;
        float f14 = 1.0f;
        if (f12 < f13) {
            float f15 = f13 / f12;
            f11 = 1.0f;
            f14 = f15;
        } else {
            f11 = f12 / f13;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f14, f11);
        int i11 = c4519m.f3949b;
        int i12 = c4519m.f3950c;
        matrix.postTranslate((i11 - (i11 * f14)) / 2.0f, (i12 - (i12 * f11)) / 2.0f);
        return matrix;
    }

    /* JADX INFO: renamed from: m */
    public final void m14330m(C4519m c4519m) {
        this.f13289n = c4519m;
        C4908b c4908b = this.f13277b;
        if (c4908b == null || c4908b.m5112l() != null) {
            return;
        }
        C4912f c4912f = new C4912f(getDisplayRotation(), c4519m);
        this.f13287l = c4912f;
        c4912f.m5138e(getPreviewScalingStrategy());
        this.f13277b.m5119s(this.f13287l);
        this.f13277b.m5111k();
        boolean z11 = this.f13298w;
        if (z11) {
            this.f13277b.m5122v(z11);
        }
    }

    /* JADX INFO: renamed from: n */
    public C4908b m14331n() {
        C4908b c4908b = new C4908b(getContext());
        c4908b.m5118r(this.f13288m);
        return c4908b;
    }

    /* JADX INFO: renamed from: o */
    public final void m14332o() {
        if (this.f13277b != null) {
            Log.w(f13275B, "initCamera called twice");
            return;
        }
        C4908b c4908bM14331n = m14331n();
        this.f13277b = c4908bM14331n;
        c4908bM14331n.m5120t(this.f13279d);
        this.f13277b.m5116p();
        this.f13285j = getDisplayRotation();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        m14330m(new C4519m(i13 - i11, i14 - i12));
        SurfaceView surfaceView = this.f13281f;
        if (surfaceView == null) {
            TextureView textureView = this.f13282g;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f13291p;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    /* JADX INFO: renamed from: r */
    public boolean m14335r() {
        return this.f13277b != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m14336s() {
        C4908b c4908b = this.f13277b;
        return c4908b == null || c4908b.m5114n();
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.f13288m = cameraSettings;
    }

    public void setFramingRectSize(C4519m c4519m) {
        this.f13295t = c4519m;
    }

    public void setMarginFraction(double d11) {
        if (d11 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f13296u = d11;
    }

    public void setPreviewScalingStrategy(AbstractC4916j abstractC4916j) {
        this.f13297v = abstractC4916j;
    }

    public void setTorch(boolean z11) {
        this.f13298w = z11;
        C4908b c4908b = this.f13277b;
        if (c4908b != null) {
            c4908b.m5122v(z11);
        }
    }

    public void setUseTextureView(boolean z11) {
        this.f13280e = z11;
    }

    /* JADX INFO: renamed from: t */
    public boolean m14337t() {
        return this.f13283h;
    }

    /* JADX INFO: renamed from: w */
    public final void m14339w(C4519m c4519m) {
        this.f13290o = c4519m;
        if (this.f13289n != null) {
            m14327j();
            requestLayout();
            m14324C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m14322A();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.f13298w);
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m14333p(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (getBackground() == null) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        m14334q(attributeSet);
        this.f13278c = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        this.f13279d = new Handler(this.f13300y);
        this.f13284i = new C4518l();
    }

    /* JADX INFO: renamed from: q */
    public void m14334q(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9149R.styleable.zxing_camera_preview);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C9149R.styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(C9149R.styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f13295t = new C4519m(dimension, dimension2);
        }
        this.f13280e = typedArrayObtainStyledAttributes.getBoolean(C9149R.styleable.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(C9149R.styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.f13297v = new C4911e();
        } else if (integer == 2) {
            this.f13297v = new C4913g();
        } else if (integer == 3) {
            this.f13297v = new C4914h();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: u */
    public void mo14312u() {
        TextureView textureView;
        SurfaceView surfaceView;
        C4521o.m4363a();
        Log.d(f13275B, "pause()");
        this.f13285j = -1;
        C4908b c4908b = this.f13277b;
        if (c4908b != null) {
            c4908b.m5110j();
            this.f13277b = null;
            this.f13283h = false;
        } else {
            this.f13279d.sendEmptyMessage(C9149R.id.zxing_camera_closed);
        }
        if (this.f13292q == null && (surfaceView = this.f13281f) != null) {
            surfaceView.getHolder().removeCallback(this.f13299x);
        }
        if (this.f13292q == null && (textureView = this.f13282g) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f13289n = null;
        this.f13290o = null;
        this.f13294s = null;
        this.f13284i.m4349f();
        this.f13276A.mo14345d();
    }

    /* JADX INFO: renamed from: v */
    public void m14338v() {
        C4908b cameraInstance = getCameraInstance();
        mo14312u();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.m5114n() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m14340y() {
        C4521o.m4363a();
        Log.d(f13275B, "resume()");
        m14332o();
        if (this.f13292q != null) {
            m14324C();
        } else {
            SurfaceView surfaceView = this.f13281f;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f13299x);
            } else {
                TextureView textureView = this.f13282g;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        m14325D().onSurfaceTextureAvailable(this.f13282g.getSurfaceTexture(), this.f13282g.getWidth(), this.f13282g.getHeight());
                    } else {
                        this.f13282g.setSurfaceTextureListener(m14325D());
                    }
                }
            }
        }
        requestLayout();
        this.f13284i.m4348e(getContext(), this.f13301z);
    }

    /* JADX INFO: renamed from: z */
    public final void m14341z() {
        if (m14335r() && getDisplayRotation() != this.f13285j) {
            mo14312u();
            m14340y();
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo14313x() {
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13280e = false;
        this.f13283h = false;
        this.f13285j = -1;
        this.f13286k = new ArrayList();
        this.f13288m = new CameraSettings();
        this.f13293r = null;
        this.f13294s = null;
        this.f13295t = null;
        this.f13296u = 0.1d;
        this.f13297v = null;
        this.f13298w = false;
        this.f13299x = new SurfaceHolderCallbackC9289b();
        this.f13300y = new C9290c();
        this.f13301z = new C9291d();
        this.f13276A = new C9292e();
        m14333p(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f13280e = false;
        this.f13283h = false;
        this.f13285j = -1;
        this.f13286k = new ArrayList();
        this.f13288m = new CameraSettings();
        this.f13293r = null;
        this.f13294s = null;
        this.f13295t = null;
        this.f13296u = 0.1d;
        this.f13297v = null;
        this.f13298w = false;
        this.f13299x = new SurfaceHolderCallbackC9289b();
        this.f13300y = new C9290c();
        this.f13301z = new C9291d();
        this.f13276A = new C9292e();
        m14333p(context, attributeSet, i11, 0);
    }
}
