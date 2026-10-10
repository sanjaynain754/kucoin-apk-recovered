package p055c9;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.zxing.client.android.C9149R;
import com.journeyapps.barcodescanner.camera.C9298a;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import p037b9.C4519m;
import p037b9.C4521o;

/* JADX INFO: renamed from: c9.b */
/* JADX INFO: compiled from: CameraInstance.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4908b {

    /* JADX INFO: renamed from: n */
    public static final String f5417n = "b";

    /* JADX INFO: renamed from: a */
    public C4910d f5418a;

    /* JADX INFO: renamed from: b */
    public C4909c f5419b;

    /* JADX INFO: renamed from: c */
    public C9298a f5420c;

    /* JADX INFO: renamed from: d */
    public Handler f5421d;

    /* JADX INFO: renamed from: e */
    public C4912f f5422e;

    /* JADX INFO: renamed from: h */
    public Handler f5425h;

    /* JADX INFO: renamed from: f */
    public boolean f5423f = false;

    /* JADX INFO: renamed from: g */
    public boolean f5424g = true;

    /* JADX INFO: renamed from: i */
    public CameraSettings f5426i = new CameraSettings();

    /* JADX INFO: renamed from: j */
    public Runnable f5427j = new c();

    /* JADX INFO: renamed from: k */
    public Runnable f5428k = new d();

    /* JADX INFO: renamed from: l */
    public Runnable f5429l = new e();

    /* JADX INFO: renamed from: m */
    public Runnable f5430m = new f();

    /* JADX INFO: renamed from: c9.b$a */
    /* JADX INFO: compiled from: CameraInstance.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f5431b;

        public a(boolean z11) {
            this.f5431b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4908b.this.f5420c.m14413s(this.f5431b);
        }
    }

    /* JADX INFO: renamed from: c9.b$b */
    /* JADX INFO: compiled from: CameraInstance.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4915i f5433b;

        /* JADX INFO: renamed from: c9.b$b$a */
        /* JADX INFO: compiled from: CameraInstance.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4908b.this.f5420c.m14406l(b.this.f5433b);
            }
        }

        public b(InterfaceC4915i interfaceC4915i) {
            this.f5433b = interfaceC4915i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4908b.this.f5423f) {
                C4908b.this.f5418a.m5129c(new a());
            } else {
                Log.d(C4908b.f5417n, "Camera is closed, not requesting preview");
            }
        }
    }

    /* JADX INFO: renamed from: c9.b$c */
    /* JADX INFO: compiled from: CameraInstance.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C4908b.f5417n, "Opening camera");
                C4908b.this.f5420c.m14405k();
            } catch (Exception e11) {
                C4908b.this.m5115o(e11);
                Log.e(C4908b.f5417n, "Failed to open camera", e11);
            }
        }
    }

    /* JADX INFO: renamed from: c9.b$d */
    /* JADX INFO: compiled from: CameraInstance.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C4908b.f5417n, "Configuring camera");
                C4908b.this.f5420c.m14399d();
                if (C4908b.this.f5421d != null) {
                    C4908b.this.f5421d.obtainMessage(C9149R.id.zxing_prewiew_size_ready, C4908b.this.m5113m()).sendToTarget();
                }
            } catch (Exception e11) {
                C4908b.this.m5115o(e11);
                Log.e(C4908b.f5417n, "Failed to configure camera", e11);
            }
        }
    }

    /* JADX INFO: renamed from: c9.b$e */
    /* JADX INFO: compiled from: CameraInstance.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C4908b.f5417n, "Starting preview");
                C4908b.this.f5420c.m14412r(C4908b.this.f5419b);
                C4908b.this.f5420c.m14414t();
            } catch (Exception e11) {
                C4908b.this.m5115o(e11);
                Log.e(C4908b.f5417n, "Failed to start preview", e11);
            }
        }
    }

    /* JADX INFO: renamed from: c9.b$f */
    /* JADX INFO: compiled from: CameraInstance.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C4908b.f5417n, "Closing camera");
                C4908b.this.f5420c.m14415u();
                C4908b.this.f5420c.m14398c();
            } catch (Exception e11) {
                Log.e(C4908b.f5417n, "Failed to close camera", e11);
            }
            C4908b.this.f5424g = true;
            C4908b.this.f5421d.sendEmptyMessage(C9149R.id.zxing_camera_closed);
            C4908b.this.f5418a.m5128b();
        }
    }

    /* JADX INFO: renamed from: l */
    public C4912f m5112l() {
        return this.f5422e;
    }

    /* JADX INFO: renamed from: m */
    public final C4519m m5113m() {
        return this.f5420c.m14402g();
    }

    /* JADX INFO: renamed from: n */
    public boolean m5114n() {
        return this.f5424g;
    }

    /* JADX INFO: renamed from: o */
    public final void m5115o(Exception exc) {
        Handler handler = this.f5421d;
        if (handler != null) {
            handler.obtainMessage(C9149R.id.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m5117q(InterfaceC4915i interfaceC4915i) {
        this.f5425h.post(new b(interfaceC4915i));
    }

    /* JADX INFO: renamed from: r */
    public void m5118r(CameraSettings cameraSettings) {
        if (this.f5423f) {
            return;
        }
        this.f5426i = cameraSettings;
        this.f5420c.m14408n(cameraSettings);
    }

    /* JADX INFO: renamed from: s */
    public void m5119s(C4912f c4912f) {
        this.f5422e = c4912f;
        this.f5420c.m14410p(c4912f);
    }

    /* JADX INFO: renamed from: t */
    public void m5120t(Handler handler) {
        this.f5421d = handler;
    }

    /* JADX INFO: renamed from: u */
    public void m5121u(C4909c c4909c) {
        this.f5419b = c4909c;
    }

    /* JADX INFO: renamed from: x */
    public final void m5124x() {
        if (!this.f5423f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public C4908b(Context context) {
        C4521o.m4363a();
        this.f5418a = C4910d.m5126d();
        C9298a c9298a = new C9298a(context);
        this.f5420c = c9298a;
        c9298a.m14408n(this.f5426i);
        this.f5425h = new Handler();
    }

    /* JADX INFO: renamed from: j */
    public void m5110j() {
        C4521o.m4363a();
        if (this.f5423f) {
            this.f5418a.m5129c(this.f5430m);
        } else {
            this.f5424g = true;
        }
        this.f5423f = false;
    }

    /* JADX INFO: renamed from: k */
    public void m5111k() {
        C4521o.m4363a();
        m5124x();
        this.f5418a.m5129c(this.f5428k);
    }

    /* JADX INFO: renamed from: p */
    public void m5116p() {
        C4521o.m4363a();
        this.f5423f = true;
        this.f5424g = false;
        this.f5418a.m5130e(this.f5427j);
    }

    /* JADX INFO: renamed from: v */
    public void m5122v(boolean z11) {
        C4521o.m4363a();
        if (this.f5423f) {
            this.f5418a.m5129c(new a(z11));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m5123w() {
        C4521o.m4363a();
        m5124x();
        this.f5418a.m5129c(this.f5429l);
    }
}
