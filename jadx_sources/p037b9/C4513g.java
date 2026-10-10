package p037b9;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.client.android.C9149R;
import p055c9.C4908b;
import p055c9.InterfaceC4915i;

/* JADX INFO: renamed from: b9.g */
/* JADX INFO: compiled from: DecoderThread.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4513g {

    /* JADX INFO: renamed from: k */
    public static final String f3926k = "g";

    /* JADX INFO: renamed from: a */
    public C4908b f3927a;

    /* JADX INFO: renamed from: b */
    public HandlerThread f3928b;

    /* JADX INFO: renamed from: c */
    public Handler f3929c;

    /* JADX INFO: renamed from: d */
    public C4510d f3930d;

    /* JADX INFO: renamed from: e */
    public Handler f3931e;

    /* JADX INFO: renamed from: f */
    public Rect f3932f;

    /* JADX INFO: renamed from: g */
    public boolean f3933g = false;

    /* JADX INFO: renamed from: h */
    public final Object f3934h = new Object();

    /* JADX INFO: renamed from: i */
    public final Handler.Callback f3935i = new a();

    /* JADX INFO: renamed from: j */
    public final InterfaceC4915i f3936j = new b();

    /* JADX INFO: renamed from: b9.g$a */
    /* JADX INFO: compiled from: DecoderThread.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == C9149R.id.zxing_decode) {
                C4513g.this.m4336g((C4520n) message.obj);
                return true;
            }
            if (i11 != C9149R.id.zxing_preview_failed) {
                return true;
            }
            C4513g.this.m4337h();
            return true;
        }
    }

    /* JADX INFO: renamed from: b9.g$b */
    /* JADX INFO: compiled from: DecoderThread.java */
    public class b implements InterfaceC4915i {
        public b() {
        }

        @Override // p055c9.InterfaceC4915i
        /* JADX INFO: renamed from: a */
        public void mo4342a(C4520n c4520n) {
            synchronized (C4513g.this.f3934h) {
                try {
                    if (C4513g.this.f3933g) {
                        C4513g.this.f3929c.obtainMessage(C9149R.id.zxing_decode, c4520n).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p055c9.InterfaceC4915i
        /* JADX INFO: renamed from: b */
        public void mo4343b(Exception exc) {
            synchronized (C4513g.this.f3934h) {
                try {
                    if (C4513g.this.f3933g) {
                        C4513g.this.f3929c.obtainMessage(C9149R.id.zxing_preview_failed).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public LuminanceSource m4335f(C4520n c4520n) {
        if (this.f3932f == null) {
            return null;
        }
        return c4520n.m4358a();
    }

    /* JADX INFO: renamed from: h */
    public final void m4337h() {
        this.f3927a.m5117q(this.f3936j);
    }

    /* JADX INFO: renamed from: i */
    public void m4338i(Rect rect) {
        this.f3932f = rect;
    }

    /* JADX INFO: renamed from: j */
    public void m4339j(C4510d c4510d) {
        this.f3930d = c4510d;
    }

    public C4513g(C4908b c4908b, C4510d c4510d, Handler handler) {
        C4521o.m4363a();
        this.f3927a = c4908b;
        this.f3930d = c4510d;
        this.f3931e = handler;
    }

    /* JADX INFO: renamed from: g */
    public final void m4336g(C4520n c4520n) {
        Result resultM4325b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c4520n.m4362i(this.f3932f);
        LuminanceSource luminanceSourceM4335f = m4335f(c4520n);
        if (luminanceSourceM4335f != null) {
            resultM4325b = this.f3930d.m4325b(luminanceSourceM4335f);
        } else {
            resultM4325b = null;
        }
        if (resultM4325b != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Log.d(f3926k, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
            if (this.f3931e != null) {
                Message messageObtain = Message.obtain(this.f3931e, C9149R.id.zxing_decode_succeeded, new C4509c(resultM4325b, c4520n));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.f3931e;
            if (handler != null) {
                Message.obtain(handler, C9149R.id.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.f3931e != null) {
            Message.obtain(this.f3931e, C9149R.id.zxing_possible_result_points, this.f3930d.m4326c()).sendToTarget();
        }
        m4337h();
    }

    /* JADX INFO: renamed from: k */
    public void m4340k() {
        C4521o.m4363a();
        HandlerThread handlerThread = new HandlerThread(f3926k);
        this.f3928b = handlerThread;
        handlerThread.start();
        this.f3929c = new Handler(this.f3928b.getLooper(), this.f3935i);
        this.f3933g = true;
        m4337h();
    }

    /* JADX INFO: renamed from: l */
    public void m4341l() {
        C4521o.m4363a();
        synchronized (this.f3934h) {
            this.f3933g = false;
            this.f3929c.removeCallbacksAndMessages(null);
            this.f3928b.quit();
        }
    }
}
