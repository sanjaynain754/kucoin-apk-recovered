package p055c9;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: c9.a */
/* JADX INFO: compiled from: AutoFocusManager.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C4907a {

    /* JADX INFO: renamed from: i */
    public static final String f5404i = "a";

    /* JADX INFO: renamed from: j */
    public static final Collection<String> f5405j;

    /* JADX INFO: renamed from: a */
    public boolean f5406a;

    /* JADX INFO: renamed from: b */
    public boolean f5407b;

    /* JADX INFO: renamed from: c */
    public final boolean f5408c;

    /* JADX INFO: renamed from: d */
    public final Camera f5409d;

    /* JADX INFO: renamed from: e */
    public Handler f5410e;

    /* JADX INFO: renamed from: f */
    public int f5411f = 1;

    /* JADX INFO: renamed from: g */
    public final Handler.Callback f5412g;

    /* JADX INFO: renamed from: h */
    public final Camera.AutoFocusCallback f5413h;

    /* JADX INFO: renamed from: c9.a$a */
    /* JADX INFO: compiled from: AutoFocusManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != C4907a.this.f5411f) {
                return false;
            }
            C4907a.this.m5098h();
            return true;
        }
    }

    /* JADX INFO: renamed from: c9.a$b */
    /* JADX INFO: compiled from: AutoFocusManager.java */
    public class b implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: c9.a$b$a */
        /* JADX INFO: compiled from: AutoFocusManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4907a.this.f5407b = false;
                C4907a.this.m5096f();
            }
        }

        public b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z11, Camera camera) {
            C4907a.this.f5410e.post(new a());
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m5096f() {
        if (!this.f5406a && !this.f5410e.hasMessages(this.f5411f)) {
            Handler handler = this.f5410e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f5411f), 2000L);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m5099i() {
        this.f5406a = false;
        m5098h();
    }

    /* JADX INFO: renamed from: j */
    public void m5100j() {
        this.f5406a = true;
        this.f5407b = false;
        m5097g();
        if (this.f5408c) {
            try {
                this.f5409d.cancelAutoFocus();
            } catch (RuntimeException e11) {
                Log.w(f5404i, "Unexpected exception while cancelling focusing", e11);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f5405j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    /* JADX INFO: renamed from: g */
    public final void m5097g() {
        this.f5410e.removeMessages(this.f5411f);
    }

    /* JADX INFO: renamed from: h */
    public final void m5098h() {
        if (!this.f5408c || this.f5406a || this.f5407b) {
            return;
        }
        try {
            this.f5409d.autoFocus(this.f5413h);
            this.f5407b = true;
        } catch (RuntimeException e11) {
            Log.w(f5404i, "Unexpected exception while focusing", e11);
            m5096f();
        }
    }

    public C4907a(Camera camera, CameraSettings cameraSettings) {
        a aVar = new a();
        this.f5412g = aVar;
        this.f5413h = new b();
        this.f5410e = new Handler(aVar);
        this.f5409d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z11 = cameraSettings.m14388c() && f5405j.contains(focusMode);
        this.f5408c = z11;
        Log.i(f5404i, "Current focus mode '" + focusMode + "'; use auto focus? " + z11);
        m5099i();
    }
}
