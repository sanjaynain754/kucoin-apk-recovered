package ai.advance.common.camera;

import ai.advance.common.camera.GuardianCameraViewV2;
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
import p295h.C38063b;
import p387k.C40826a;
import p387k.C40828c;
import p387k.C40833h;

/* JADX INFO: loaded from: classes23.dex */
public class GuardianCameraViewV2 extends TextureView implements Camera.PreviewCallback, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: A */
    public TextureView.SurfaceTextureListener f857A;

    /* JADX INFO: renamed from: B */
    public Rect f858B;

    /* JADX INFO: renamed from: b */
    public C38063b f859b;

    /* JADX INFO: renamed from: c */
    public long f860c;

    /* JADX INFO: renamed from: d */
    public Activity f861d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0336g f862e;

    /* JADX INFO: renamed from: f */
    public Camera f863f;

    /* JADX INFO: renamed from: g */
    public Camera.Size f864g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f865h;

    /* JADX INFO: renamed from: i */
    public int f866i;

    /* JADX INFO: renamed from: j */
    public int f867j;

    /* JADX INFO: renamed from: k */
    public int f868k;

    /* JADX INFO: renamed from: l */
    public int f869l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f870m;

    /* JADX INFO: renamed from: n */
    public int f871n;

    /* JADX INFO: renamed from: o */
    public int f872o;

    /* JADX INFO: renamed from: p */
    public HandlerC0335f f873p;

    /* JADX INFO: renamed from: q */
    public Camera.AutoFocusCallback f874q;

    /* JADX INFO: renamed from: r */
    public boolean f875r;

    /* JADX INFO: renamed from: s */
    public boolean f876s;

    /* JADX INFO: renamed from: t */
    public ExecutorService f877t;

    /* JADX INFO: renamed from: u */
    public boolean f878u;

    /* JADX INFO: renamed from: v */
    public final Handler f879v;

    /* JADX INFO: renamed from: w */
    public boolean f880w;

    /* JADX INFO: renamed from: x */
    public float f881x;

    /* JADX INFO: renamed from: y */
    public float f882y;

    /* JADX INFO: renamed from: z */
    public final ExecutorService f883z;

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$a */
    public class ViewOnClickListenerC0330a implements View.OnClickListener {
        public ViewOnClickListenerC0330a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GuardianCameraViewV2.this.mo1173I();
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$b */
    public class C0331b implements Comparator<Camera.Size> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f885b;

        public C0331b(float f11) {
            this.f885b = f11;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Float.compare(Math.abs(this.f885b - GuardianCameraViewV2.this.m1184W(size)), Math.abs(this.f885b - GuardianCameraViewV2.this.m1184W(size2)));
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$c */
    public class C0332c implements Comparator<Camera.Size> {
        public C0332c() {
        }

        /* JADX INFO: renamed from: a */
        public int m1196a(Camera.Size size) {
            return Math.abs((GuardianCameraViewV2.this.getViewWidth() - GuardianCameraViewV2.this.mo409V(size)) + (GuardianCameraViewV2.this.getViewHeight() - GuardianCameraViewV2.this.mo408U(size)));
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Float.compare(m1196a(size), m1196a(size2));
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$d */
    public class TextureViewSurfaceTextureListenerC0333d implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0333d() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            GuardianCameraViewV2 guardianCameraViewV2 = GuardianCameraViewV2.this;
            Camera.Size size = guardianCameraViewV2.f864g;
            if (size != null) {
                guardianCameraViewV2.mo419d0(size);
            }
            GuardianCameraViewV2 guardianCameraViewV3 = GuardianCameraViewV2.this;
            guardianCameraViewV3.f878u = true;
            guardianCameraViewV3.mo1191h0();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            GuardianCameraViewV2 guardianCameraViewV2 = GuardianCameraViewV2.this;
            guardianCameraViewV2.f878u = false;
            guardianCameraViewV2.mo1193j0();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            InterfaceC0336g interfaceC0336g = GuardianCameraViewV2.this.f862e;
            if (interfaceC0336g != null) {
                interfaceC0336g.onSurfaceTextureUpdated(surfaceTexture);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$e */
    public class RunnableC0334e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ byte[] f889b;

        /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f891b;

            public a(Bitmap bitmap) {
                this.f891b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity activity = GuardianCameraViewV2.this.f861d;
            }
        }

        /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$e$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f893b;

            public b(Bitmap bitmap) {
                this.f893b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity activity = GuardianCameraViewV2.this.f861d;
            }
        }

        public RunnableC0334e(byte[] bArr) {
            this.f889b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = this.f889b;
            GuardianCameraViewV2 guardianCameraViewV2 = GuardianCameraViewV2.this;
            Camera.Size size = guardianCameraViewV2.f864g;
            Bitmap bitmapM89323i = C40826a.m89323i(bArr, size.width, size.height, guardianCameraViewV2.f869l, guardianCameraViewV2.mo1186Y(), GuardianCameraViewV2.this.m1185X());
            GuardianCameraViewV2 guardianCameraViewV3 = GuardianCameraViewV2.this;
            Rect rect = guardianCameraViewV3.f858B;
            if (rect == null) {
                guardianCameraViewV3.f861d.runOnUiThread(new a(bitmapM89323i));
                return;
            }
            float viewHeight = (rect.top / guardianCameraViewV3.getViewHeight()) * GuardianCameraViewV2.this.getCameraTransformHeightRatio();
            GuardianCameraViewV2 guardianCameraViewV4 = GuardianCameraViewV2.this;
            float viewWidth = (guardianCameraViewV4.f858B.left / guardianCameraViewV4.getViewWidth()) * GuardianCameraViewV2.this.getCameraTransformWidthRatio();
            GuardianCameraViewV2 guardianCameraViewV5 = GuardianCameraViewV2.this;
            float viewWidth2 = (guardianCameraViewV5.f858B.right / guardianCameraViewV5.getViewWidth()) * GuardianCameraViewV2.this.getCameraTransformWidthRatio();
            GuardianCameraViewV2 guardianCameraViewV6 = GuardianCameraViewV2.this;
            float viewHeight2 = (guardianCameraViewV6.f858B.bottom / guardianCameraViewV6.getViewHeight()) * GuardianCameraViewV2.this.getCameraTransformHeightRatio();
            int width = (int) (bitmapM89323i.getWidth() * viewWidth);
            int height = (int) (bitmapM89323i.getHeight() * viewHeight);
            int width2 = (int) ((viewWidth2 - viewWidth) * bitmapM89323i.getWidth());
            int height2 = (int) ((viewHeight2 - viewHeight) * bitmapM89323i.getHeight());
            try {
                int width3 = bitmapM89323i.getWidth();
                int height3 = bitmapM89323i.getHeight();
                if (GuardianCameraViewV2.this.m1185X()) {
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
                GuardianCameraViewV2.this.f861d.runOnUiThread(new b(bitmapCreateBitmap));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$f */
    public class HandlerC0335f extends Handler {
        /* JADX INFO: renamed from: a */
        public synchronized void m1198a() {
            sendEmptyMessage(9246);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m1199b() {
            GuardianCameraViewV2 guardianCameraViewV2 = GuardianCameraViewV2.this;
            if (guardianCameraViewV2.f875r) {
                sendEmptyMessageDelayed(9245, guardianCameraViewV2.f860c);
            }
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m1200c() {
            removeMessages(9245);
            removeMessages(9246);
        }

        public HandlerC0335f(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: d */
        public void m1201d() {
            try {
                GuardianCameraViewV2 guardianCameraViewV2 = GuardianCameraViewV2.this;
                guardianCameraViewV2.f863f.autoFocus(guardianCameraViewV2.getAutoFocusCallback());
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
            } else if (!GuardianCameraViewV2.this.mo1176M() || !GuardianCameraViewV2.this.f875r) {
                return;
            }
            m1201d();
        }
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$g */
    public interface InterfaceC0336g {
        /* JADX INFO: renamed from: b */
        void mo89b();

        /* JADX INFO: renamed from: c */
        void mo90c(byte[] bArr, Camera.Size size);

        /* JADX INFO: renamed from: i */
        void mo91i(Exception exc);

        void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: ai.advance.common.camera.GuardianCameraViewV2$h */
    public interface InterfaceC0337h {
        /* JADX INFO: renamed from: a */
        void mo366a();
    }

    public GuardianCameraViewV2(Context context) {
        this(context, null);
    }

    private synchronized HandlerC0335f getMainHandler() {
        try {
            if (this.f873p == null) {
                this.f873p = new HandlerC0335f(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f873p;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1170D(final int i11, final InterfaceC0336g interfaceC0336g) {
        try {
            this.f863f = Camera.open(i11);
            this.f879v.post(new Runnable() { // from class: i.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86150b.m1171E(interfaceC0336g, i11);
                }
            });
        } catch (Exception e11) {
            if (this.f862e != null) {
                this.f879v.post(new Runnable() { // from class: i.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f86153b.m1161G(e11);
                    }
                });
            }
        } finally {
            this.f865h = false;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public synchronized void mo415b0(final int i11, final InterfaceC0336g interfaceC0336g) {
        try {
            this.f862e = interfaceC0336g;
            this.f866i = i11;
            if (this.f861d == null) {
                return;
            }
            if (this.f871n == 0) {
                this.f870m = true;
            } else {
                this.f870m = false;
                if (!this.f865h) {
                    this.f865h = true;
                    this.f883z.execute(new Runnable() { // from class: i.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f86146b.m1170D(i11, interfaceC0336g);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setAutoFocusEnable(long j11) {
        this.f875r = true;
        this.f860c = j11;
        if (mo1176M()) {
            mo1190g0();
        }
    }

    public GuardianCameraViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f860c = 1300L;
        this.f878u = false;
        this.f880w = true;
        this.f883z = Executors.newSingleThreadExecutor();
        this.f857A = new TextureViewSurfaceTextureListenerC0333d();
        if (context instanceof Activity) {
            this.f861d = (Activity) context;
        }
        this.f879v = new Handler(Looper.getMainLooper());
        m1182S();
        setSurfaceTextureListener(this.f857A);
        addOnLayoutChangeListener(this);
        setOnClickListener(new ViewOnClickListenerC0330a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m1158B() {
        try {
            this.f863f.setPreviewTexture(getSurfaceTexture());
            this.f863f.setPreviewCallback(this);
            this.f863f.startPreview();
        } catch (Exception e11) {
            try {
                Camera camera = this.f863f;
                if (camera != null) {
                    camera.setPreviewCallback(null);
                }
            } catch (Exception unused) {
            }
            this.f863f = null;
            InterfaceC0336g interfaceC0336g = this.f862e;
            if (interfaceC0336g != null) {
                interfaceC0336g.mo91i(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m1159C(int i11) {
        mo415b0(i11, this.f862e);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m1160F(InterfaceC0337h interfaceC0337h) {
        if (interfaceC0337h != null) {
            interfaceC0337h.mo366a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m1161G(Exception exc) {
        this.f862e.mo91i(exc);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m1171E(InterfaceC0336g interfaceC0336g, int i11) {
        if (interfaceC0336g != null) {
            try {
                Camera.Parameters parameters = this.f863f.getParameters();
                Camera.Size sizeMo86L = mo86L(this.f863f.getParameters());
                this.f864g = sizeMo86L;
                parameters.setPreviewSize(sizeMo86L.width, sizeMo86L.height);
                int iM1183T = m1183T(i11);
                this.f869l = iM1183T;
                this.f863f.setDisplayOrientation(iM1183T);
                this.f863f.setParameters(parameters);
                mo431l0();
                mo1190g0();
                mo1191h0();
                interfaceC0336g.mo89b();
            } catch (Exception e11) {
                InterfaceC0336g interfaceC0336g2 = this.f862e;
                if (interfaceC0336g2 != null) {
                    interfaceC0336g2.mo91i(e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean mo1176M() {
        return this.f863f != null;
    }

    /* JADX INFO: renamed from: N */
    public void m1177N(byte[] bArr) {
        if (this.f876s) {
            this.f876s = false;
            getExecutor().execute(new RunnableC0334e(bArr));
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo1179P(final InterfaceC0337h interfaceC0337h) {
        this.f883z.submit(new Runnable() { // from class: i.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f86142b.m1174J(interfaceC0337h);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m1180Q(final InterfaceC0337h interfaceC0337h) {
        this.f883z.submit(new Runnable() { // from class: i.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f86144b.m1175K(interfaceC0337h);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m1181R() {
        C38063b c38063b = this.f859b;
        if (c38063b != null) {
            c38063b.m85947e();
        }
    }

    /* JADX INFO: renamed from: T */
    public int m1183T(int i11) {
        return C40828c.m89331e(i11, this.f861d);
    }

    /* JADX INFO: renamed from: X */
    public boolean m1185X() {
        int i11 = this.f868k;
        return i11 != -1 && this.f866i == i11;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m1187Z() {
        return this.f880w;
    }

    /* JADX INFO: renamed from: c0 */
    public void m1188c0(int i11, boolean z11, long j11) {
        if (this.f859b == null) {
            this.f859b = new C38063b(getContext());
        }
        this.f859b.m85950h(this.f880w);
        if (this.f880w) {
            this.f859b.m85948f(i11, z11, j11);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo1189e0() {
        mo423f0(this.f866i);
    }

    /* JADX INFO: renamed from: f0 */
    public void mo423f0(final int i11) {
        mo1179P(new InterfaceC0337h() { // from class: i.f
            @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0337h
            /* JADX INFO: renamed from: a */
            public final void mo366a() {
                this.f86140a.m1159C(i11);
            }
        });
    }

    public Camera.AutoFocusCallback getAutoFocusCallback() {
        if (this.f874q == null) {
            synchronized (this) {
                try {
                    if (this.f874q == null) {
                        this.f874q = new Camera.AutoFocusCallback() { // from class: i.e
                            @Override // android.hardware.Camera.AutoFocusCallback
                            public final void onAutoFocus(boolean z11, Camera camera) {
                                this.f86139a.m1172H(z11, camera);
                            }
                        };
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f874q;
    }

    public int getBackCameraId() {
        return this.f867j;
    }

    public Camera getCamera() {
        return this.f863f;
    }

    public float getCameraTransformHeightRatio() {
        return this.f882y;
    }

    public float getCameraTransformWidthRatio() {
        return this.f881x;
    }

    public ExecutorService getExecutor() {
        if (this.f877t == null) {
            this.f877t = Executors.newCachedThreadPool();
        }
        return this.f877t;
    }

    public int getFrontCameraId() {
        return this.f868k;
    }

    public Camera.Size getPreviewSize() {
        return this.f864g;
    }

    public float getScale() {
        return 1.0f;
    }

    public int getViewHeight() {
        return this.f872o;
    }

    public int getViewWidth() {
        return this.f871n;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo431l0() {
        RectF rectF;
        if (this.f864g != null) {
            float viewWidth = getViewWidth();
            float viewHeight = getViewHeight();
            float fM1184W = m1184W(this.f864g);
            RectF rectF2 = new RectF(0.0f, 0.0f, viewHeight, viewWidth);
            if (mo1186Y()) {
                rectF = new RectF(0.0f, 0.0f, viewHeight, fM1184W * viewHeight);
                this.f881x = rectF.width() / rectF2.width();
                this.f882y = rectF.height() / rectF2.height();
            } else {
                RectF rectF3 = new RectF(0.0f, 0.0f, viewWidth / fM1184W, viewWidth);
                this.f881x = rectF3.height() / rectF2.height();
                this.f882y = rectF3.width() / rectF2.width();
                rectF = rectF3;
            }
            this.f881x = rectF.width() / rectF2.width();
            this.f882y = rectF.height() / rectF2.height();
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            setTransform(matrix);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size size;
        if (bArr == null) {
            return;
        }
        InterfaceC0336g interfaceC0336g = this.f862e;
        if (interfaceC0336g != null && this.f863f != null && (size = this.f864g) != null) {
            interfaceC0336g.mo90c(bArr, size);
        }
        m1177N(bArr);
    }

    public void setSoundPlayEnable(boolean z11) {
        this.f880w = z11;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m1172H(boolean z11, Camera camera) {
        getMainHandler().m1199b();
    }

    /* JADX INFO: renamed from: I */
    public void mo1173I() {
        getMainHandler().m1198a();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m1174J(final InterfaceC0337h interfaceC0337h) {
        mo1178O();
        this.f879v.post(new Runnable() { // from class: i.j
            @Override // java.lang.Runnable
            public final void run() {
                GuardianCameraViewV2.m1160F(interfaceC0337h);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m1175K(InterfaceC0337h interfaceC0337h) {
        mo1178O();
        if (interfaceC0337h != null) {
            interfaceC0337h.mo366a();
        }
    }

    /* JADX INFO: renamed from: L */
    public Camera.Size mo86L(Camera.Parameters parameters) {
        float fM1184W;
        Object obj;
        try {
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            Collections.sort(supportedPreviewSizes, new C0331b(getViewWidth() / getViewHeight()));
            ArrayList arrayList = new ArrayList();
            if (supportedPreviewSizes.size() > 0) {
                fM1184W = m1184W(supportedPreviewSizes.get(0));
            } else {
                fM1184W = 0.0f;
            }
            for (Camera.Size size : supportedPreviewSizes) {
                if (Math.abs(m1184W(size) - fM1184W) < 0.1d) {
                    arrayList.add(size);
                }
            }
            Collections.sort(arrayList, new C0332c());
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

    /* JADX INFO: renamed from: O */
    public void mo1178O() {
        try {
            mo1192i0();
            Camera camera = this.f863f;
            if (camera != null) {
                camera.stopPreview();
                this.f863f.setPreviewCallback(null);
                this.f863f.release();
                this.f863f = null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: S */
    public void m1182S() {
        this.f867j = C40828c.m89330d();
        this.f868k = C40828c.m89332f();
        if (this.f867j == -1) {
            C40833h.m89363g("No back facing camera detected on the device.");
        }
        if (this.f868k == -1) {
            C40833h.m89363g("No front facing camera detected on the device.");
        }
    }

    /* JADX INFO: renamed from: U */
    public int mo408U(Camera.Size size) {
        if (mo1186Y()) {
            return size.width;
        }
        return size.height;
    }

    /* JADX INFO: renamed from: V */
    public int mo409V(Camera.Size size) {
        if (mo1186Y()) {
            return size.height;
        }
        return size.width;
    }

    /* JADX INFO: renamed from: W */
    public float m1184W(Camera.Size size) {
        return mo409V(size) / mo408U(size);
    }

    /* JADX INFO: renamed from: Y */
    public boolean mo1186Y() {
        if (getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo1190g0() {
        if (mo1176M()) {
            getMainHandler().m1199b();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void mo1191h0() {
        if (mo1176M() && this.f878u && this.f863f != null) {
            this.f883z.execute(new Runnable() { // from class: i.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86138b.m1158B();
                }
            });
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void mo1192i0() {
        getMainHandler().m1200c();
    }

    /* JADX INFO: renamed from: j0 */
    public void mo1193j0() {
        try {
            if (mo1176M()) {
                this.f863f.stopPreview();
                this.f863f.setPreviewCallback(null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m1194k0() {
        int iM89332f;
        if (m1185X()) {
            iM89332f = C40828c.m89330d();
        } else {
            iM89332f = C40828c.m89332f();
        }
        mo423f0(iM89332f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f871n == measuredWidth && this.f872o == measuredHeight) {
            return;
        }
        this.f871n = getMeasuredWidth();
        this.f872o = getMeasuredHeight();
        if (this.f870m) {
            mo423f0(this.f866i);
        } else if (mo1176M()) {
            mo431l0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo413a0() {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo419d0(Camera.Size size) {
    }
}
