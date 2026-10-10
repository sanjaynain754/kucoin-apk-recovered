package ai.advance.common.camera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p387k.C40826a;
import p387k.C40828c;
import p387k.C40833h;

/* JADX INFO: loaded from: classes23.dex */
public class GuardianCameraView extends TextureView implements Camera.PreviewCallback, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: b */
    public long f819b;

    /* JADX INFO: renamed from: c */
    public Activity f820c;

    /* JADX INFO: renamed from: d */
    public Camera f821d;

    /* JADX INFO: renamed from: e */
    public Camera.Size f822e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f823f;

    /* JADX INFO: renamed from: g */
    public int f824g;

    /* JADX INFO: renamed from: h */
    public int f825h;

    /* JADX INFO: renamed from: i */
    public int f826i;

    /* JADX INFO: renamed from: j */
    public int f827j;

    /* JADX INFO: renamed from: k */
    public boolean f828k;

    /* JADX INFO: renamed from: l */
    public int f829l;

    /* JADX INFO: renamed from: m */
    public int f830m;

    /* JADX INFO: renamed from: n */
    public HandlerC0328g f831n;

    /* JADX INFO: renamed from: o */
    public Camera.AutoFocusCallback f832o;

    /* JADX INFO: renamed from: p */
    public boolean f833p;

    /* JADX INFO: renamed from: q */
    public boolean f834q;

    /* JADX INFO: renamed from: r */
    public ExecutorService f835r;

    /* JADX INFO: renamed from: s */
    public final Handler f836s;

    /* JADX INFO: renamed from: t */
    public boolean f837t;

    /* JADX INFO: renamed from: u */
    public boolean f838u;

    /* JADX INFO: renamed from: v */
    public final ExecutorService f839v;

    /* JADX INFO: renamed from: w */
    public float f840w;

    /* JADX INFO: renamed from: x */
    public float f841x;

    /* JADX INFO: renamed from: y */
    public TextureView.SurfaceTextureListener f842y;

    /* JADX INFO: renamed from: z */
    public Rect f843z;

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$a */
    public class ViewOnClickListenerC0322a implements View.OnClickListener {
        public ViewOnClickListenerC0322a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GuardianCameraView.this.m1128f();
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$b */
    public class C0323b implements Camera.AutoFocusCallback {
        public C0323b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z11, Camera camera) {
            GuardianCameraView.this.getMainHandler().m1153b();
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$c */
    public class C0324c implements Comparator<Camera.Size> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f846b;

        public C0324c(float f11) {
            this.f846b = f11;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Float.compare(Math.abs(this.f846b - GuardianCameraView.this.m1139q(size)), Math.abs(this.f846b - GuardianCameraView.this.m1139q(size2)));
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$d */
    public class C0325d implements Comparator<Camera.Size> {
        public C0325d() {
        }

        /* JADX INFO: renamed from: a */
        public int m1150a(Camera.Size size) {
            return Math.abs((GuardianCameraView.this.getViewWidth() - GuardianCameraView.this.m1138p(size)) + (GuardianCameraView.this.getViewHeight() - GuardianCameraView.this.m1137o(size)));
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Float.compare(m1150a(size), m1150a(size2));
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$e */
    public class TextureViewSurfaceTextureListenerC0326e implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0326e() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            GuardianCameraView guardianCameraView = GuardianCameraView.this;
            Camera.Size size = guardianCameraView.f822e;
            if (size != null) {
                guardianCameraView.m1144v(size);
            }
            GuardianCameraView guardianCameraView2 = GuardianCameraView.this;
            guardianCameraView2.f837t = true;
            guardianCameraView2.m1148z();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            GuardianCameraView guardianCameraView = GuardianCameraView.this;
            guardianCameraView.f837t = false;
            guardianCameraView.m1125B();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            GuardianCameraView.this.getClass();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$f */
    public class RunnableC0327f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ byte[] f850b;

        /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f852b;

            public a(Bitmap bitmap) {
                this.f852b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity activity = GuardianCameraView.this.f820c;
            }
        }

        /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$f$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f854b;

            public b(Bitmap bitmap) {
                this.f854b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity activity = GuardianCameraView.this.f820c;
            }
        }

        public RunnableC0327f(byte[] bArr) {
            this.f850b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = this.f850b;
            GuardianCameraView guardianCameraView = GuardianCameraView.this;
            Camera.Size size = guardianCameraView.f822e;
            Bitmap bitmapM89323i = C40826a.m89323i(bArr, size.width, size.height, guardianCameraView.f827j, guardianCameraView.m1141s(), GuardianCameraView.this.m1140r());
            GuardianCameraView guardianCameraView2 = GuardianCameraView.this;
            Rect rect = guardianCameraView2.f843z;
            if (rect == null) {
                guardianCameraView2.f820c.runOnUiThread(new a(bitmapM89323i));
                return;
            }
            float viewHeight = (rect.top / guardianCameraView2.getViewHeight()) * GuardianCameraView.this.getCameraTransformHeightRatio();
            GuardianCameraView guardianCameraView3 = GuardianCameraView.this;
            float viewWidth = (guardianCameraView3.f843z.left / guardianCameraView3.getViewWidth()) * GuardianCameraView.this.getCameraTransformWidthRatio();
            GuardianCameraView guardianCameraView4 = GuardianCameraView.this;
            float viewWidth2 = (guardianCameraView4.f843z.right / guardianCameraView4.getViewWidth()) * GuardianCameraView.this.getCameraTransformWidthRatio();
            GuardianCameraView guardianCameraView5 = GuardianCameraView.this;
            float viewHeight2 = (guardianCameraView5.f843z.bottom / guardianCameraView5.getViewHeight()) * GuardianCameraView.this.getCameraTransformHeightRatio();
            int width = (int) (bitmapM89323i.getWidth() * viewWidth);
            int height = (int) (bitmapM89323i.getHeight() * viewHeight);
            int width2 = (int) ((viewWidth2 - viewWidth) * bitmapM89323i.getWidth());
            int height2 = (int) ((viewHeight2 - viewHeight) * bitmapM89323i.getHeight());
            try {
                int width3 = bitmapM89323i.getWidth();
                int height3 = bitmapM89323i.getHeight();
                if (GuardianCameraView.this.m1140r()) {
                    width = (int) ((1.0f - viewWidth2) * bitmapM89323i.getWidth());
                }
                int i11 = width;
                if (i11 + width2 > width3) {
                    width2 = width3 - i11;
                }
                int i12 = width2;
                if (height + height2 > height3) {
                    height2 = height3 - height;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM89323i, i11, height, i12, height2, (Matrix) null, false);
                bitmapM89323i.recycle();
                GuardianCameraView.this.f820c.runOnUiThread(new b(bitmapCreateBitmap));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$g */
    public class HandlerC0328g extends Handler {
        /* JADX INFO: renamed from: a */
        public synchronized void m1152a() {
            sendEmptyMessage(9246);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m1153b() {
            GuardianCameraView guardianCameraView = GuardianCameraView.this;
            if (guardianCameraView.f833p) {
                sendEmptyMessageDelayed(9245, guardianCameraView.f819b);
            }
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m1154c() {
            removeMessages(9245);
            removeMessages(9246);
        }

        public HandlerC0328g(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: d */
        public void m1155d() {
            try {
                GuardianCameraView guardianCameraView = GuardianCameraView.this;
                guardianCameraView.f821d.autoFocus(guardianCameraView.getAutoFocusCallback());
            } catch (Exception unused) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 != 9245) {
                if (i11 != 9246) {
                    return;
                }
            } else if (!GuardianCameraView.this.m1132j() || !GuardianCameraView.this.f833p) {
                return;
            }
            m1155d();
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraView$h */
    public interface InterfaceC0329h {
        /* JADX INFO: renamed from: a */
        void m1156a();
    }

    public GuardianCameraView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized HandlerC0328g getMainHandler() {
        try {
            if (this.f831n == null) {
                this.f831n = new HandlerC0328g(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f831n;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1129g(final int i11) {
        try {
            try {
                this.f821d = Camera.open(i11);
                this.f836s.post(new Runnable() { // from class: i.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f86136b.m1127e(i11);
                    }
                });
            } catch (Exception e11) {
                C40833h.m89363g("open camera exception:" + e11.getMessage());
            }
        } finally {
            this.f823f = false;
        }
    }

    public synchronized Camera.AutoFocusCallback getAutoFocusCallback() {
        try {
            if (this.f832o == null) {
                this.f832o = new C0323b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f832o;
    }

    public void setAutoFocusEnable(long j11) {
        this.f833p = true;
        this.f819b = j11;
        if (m1132j()) {
            m1146x();
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m1142t(final int i11) {
        if (!this.f823f) {
            this.f823f = true;
            this.f839v.execute(new Runnable() { // from class: i.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86134b.m1129g(i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m1146x() {
        if (m1132j()) {
            getMainHandler().m1153b();
        }
    }

    public GuardianCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f819b = 1300L;
        this.f837t = false;
        this.f838u = true;
        this.f839v = Executors.newSingleThreadExecutor();
        this.f842y = new TextureViewSurfaceTextureListenerC0326e();
        if (context instanceof Activity) {
            this.f820c = (Activity) context;
        }
        this.f836s = new Handler(Looper.getMainLooper());
        m1135m();
        setSurfaceTextureListener(this.f842y);
        addOnLayoutChangeListener(this);
        setOnClickListener(new ViewOnClickListenerC0322a());
    }

    /* JADX INFO: renamed from: C */
    public void m1126C() {
        RectF rectF;
        if (this.f822e != null) {
            float viewWidth = getViewWidth();
            float viewHeight = getViewHeight();
            float fM1139q = m1139q(this.f822e);
            RectF rectF2 = new RectF(0.0f, 0.0f, viewHeight, viewWidth);
            if (m1141s()) {
                rectF = new RectF(0.0f, 0.0f, viewHeight, fM1139q * viewHeight);
                this.f840w = rectF.width() / rectF2.width();
                this.f841x = rectF.height() / rectF2.height();
            } else {
                RectF rectF3 = new RectF(0.0f, 0.0f, viewWidth / fM1139q, viewWidth);
                this.f840w = rectF3.height() / rectF2.height();
                this.f841x = rectF3.width() / rectF2.width();
                rectF = rectF3;
            }
            this.f840w = rectF.width() / rectF2.width();
            this.f841x = rectF.height() / rectF2.height();
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            setTransform(matrix);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1127e(int i11) {
        try {
            Camera.Parameters parameters = this.f821d.getParameters();
            Camera.Size sizeM1131i = m1131i(this.f821d.getParameters());
            this.f822e = sizeM1131i;
            parameters.setPreviewSize(sizeM1131i.width, sizeM1131i.height);
            int iM1136n = m1136n(i11);
            this.f827j = iM1136n;
            this.f821d.setDisplayOrientation(iM1136n);
            this.f821d.setParameters(parameters);
            m1126C();
            m1146x();
        } catch (Exception unused) {
            this.f823f = false;
        }
    }

    public Camera getCamera() {
        return this.f821d;
    }

    public float getCameraTransformHeightRatio() {
        return this.f841x;
    }

    public float getCameraTransformWidthRatio() {
        return this.f840w;
    }

    public ExecutorService getExecutor() {
        if (this.f835r == null) {
            this.f835r = Executors.newCachedThreadPool();
        }
        return this.f835r;
    }

    public Camera.Size getPreviewSize() {
        return this.f822e;
    }

    public float getScale() {
        return 1.0f;
    }

    public int getViewHeight() {
        return this.f830m;
    }

    public int getViewWidth() {
        return this.f829l;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1130h(GuardianCameraView guardianCameraView) {
        try {
            this.f821d.setPreviewTexture(guardianCameraView.getSurfaceTexture());
            this.f821d.startPreview();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m1132j() {
        return this.f821d != null;
    }

    /* JADX INFO: renamed from: k */
    public void m1133k(byte[] bArr) {
        if (this.f834q) {
            this.f834q = false;
            getExecutor().execute(new RunnableC0327f(bArr));
        }
    }

    /* JADX INFO: renamed from: n */
    public int m1136n(int i11) {
        return C40828c.m89331e(i11, this.f820c);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (bArr == null) {
            return;
        }
        m1133k(bArr);
    }

    /* JADX INFO: renamed from: r */
    public boolean m1140r() {
        int i11 = this.f826i;
        return i11 != -1 && this.f824g == i11;
    }

    public void setSoundPlayEnable(boolean z11) {
        this.f838u = z11;
    }

    /* JADX INFO: renamed from: u */
    public void m1143u(int i11, InterfaceC0329h interfaceC0329h) {
        this.f824g = i11;
        if (this.f820c == null) {
            if (interfaceC0329h != null) {
                interfaceC0329h.m1156a();
            }
        } else if (this.f829l == 0) {
            this.f828k = true;
        } else {
            this.f828k = false;
            m1142t(i11);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1147y(final GuardianCameraView guardianCameraView) {
        if (this.f821d != null) {
            this.f839v.execute(new Runnable() { // from class: i.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86132b.m1130h(guardianCameraView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public void m1124A() {
        getMainHandler().m1154c();
    }

    /* JADX INFO: renamed from: B */
    public void m1125B() {
        try {
            if (m1132j()) {
                this.f821d.stopPreview();
                this.f821d.setPreviewCallback(null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1128f() {
        getMainHandler().m1152a();
    }

    /* JADX INFO: renamed from: i */
    public Camera.Size m1131i(Camera.Parameters parameters) {
        float fM1139q;
        Object obj;
        try {
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            Collections.sort(supportedPreviewSizes, new C0324c(getViewWidth() / getViewHeight()));
            ArrayList arrayList = new ArrayList();
            if (supportedPreviewSizes.size() > 0) {
                fM1139q = m1139q(supportedPreviewSizes.get(0));
            } else {
                fM1139q = 0.0f;
            }
            for (Camera.Size size : supportedPreviewSizes) {
                if (Math.abs(m1139q(size) - fM1139q) < 0.1d) {
                    arrayList.add(size);
                }
            }
            Collections.sort(arrayList, new C0325d());
            if (arrayList.size() > 0) {
                obj = arrayList.get(0);
            } else if (supportedPreviewSizes.size() > 0) {
                obj = supportedPreviewSizes.get(0);
            } else {
                return null;
            }
            return (Camera.Size) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1134l() {
        try {
            m1124A();
            Camera camera = this.f821d;
            if (camera != null) {
                camera.stopPreview();
                this.f821d.setPreviewCallback(null);
                this.f821d.release();
                this.f821d = null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1135m() {
        this.f825h = C40828c.m89330d();
        this.f826i = C40828c.m89332f();
        if (this.f825h == -1) {
            C40833h.m89363g("No back facing camera detected on the device.");
        }
        if (this.f826i == -1) {
            C40833h.m89363g("No front facing camera detected on the device.");
        }
    }

    /* JADX INFO: renamed from: o */
    public int m1137o(Camera.Size size) {
        if (m1141s()) {
            return size.width;
        }
        return size.height;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f829l == measuredWidth && this.f830m == measuredHeight) {
            return;
        }
        this.f829l = getMeasuredWidth();
        this.f830m = getMeasuredHeight();
        if (this.f828k) {
            m1145w(this.f824g);
        } else if (m1132j()) {
            m1126C();
        }
    }

    /* JADX INFO: renamed from: p */
    public int m1138p(Camera.Size size) {
        if (m1141s()) {
            return size.height;
        }
        return size.width;
    }

    /* JADX INFO: renamed from: q */
    public float m1139q(Camera.Size size) {
        return m1138p(size) / m1137o(size);
    }

    /* JADX INFO: renamed from: s */
    public boolean m1141s() {
        if (getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m1145w(int i11) {
        m1134l();
        m1143u(i11, null);
        m1148z();
    }

    /* JADX INFO: renamed from: z */
    public void m1148z() {
        if (m1132j() && this.f837t) {
            m1147y(this);
            this.f821d.setPreviewCallback(this);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1144v(Camera.Size size) {
    }
}
