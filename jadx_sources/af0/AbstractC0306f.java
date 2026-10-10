package af0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: af0.f */
/* JADX INFO: compiled from: ProgressUIListener.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC0306f extends AbstractC0303c {

    /* JADX INFO: renamed from: e */
    public Handler f810e;

    /* JADX INFO: renamed from: af0.f$a */
    /* JADX INFO: compiled from: ProgressUIListener.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                Bundle data = message.getData();
                if (data == null) {
                    return;
                }
                AbstractC0306f.this.mo1057h(data.getLong("totalBytes"));
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                AbstractC0306f.this.m1056g();
                return;
            }
            Bundle data2 = message.getData();
            if (data2 == null) {
                return;
            }
            AbstractC0306f.this.mo1055f(data2.getLong("numBytes"), data2.getLong("totalBytes"), data2.getFloat("percent"), data2.getFloat("speed"));
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1055f(long j11, long j12, float f11, float f12);

    /* JADX INFO: renamed from: e */
    public final void m1054e() {
        if (this.f810e != null) {
            return;
        }
        synchronized (AbstractC0306f.class) {
            try {
                if (this.f810e == null) {
                    this.f810e = new a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // af0.AbstractC0303c
    /* JADX INFO: renamed from: b */
    public final void mo1051b(long j11, long j12, float f11, float f12) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo1055f(j11, j12, f11, f12);
            return;
        }
        m1054e();
        Message messageObtainMessage = this.f810e.obtainMessage();
        messageObtainMessage.what = 2;
        Bundle bundle = new Bundle();
        bundle.putLong("numBytes", j11);
        bundle.putLong("totalBytes", j12);
        bundle.putFloat("percent", f11);
        bundle.putFloat("speed", f12);
        messageObtainMessage.setData(bundle);
        this.f810e.sendMessage(messageObtainMessage);
    }

    @Override // af0.AbstractC0303c
    /* JADX INFO: renamed from: c */
    public final void mo1052c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m1056g();
            return;
        }
        m1054e();
        Message messageObtainMessage = this.f810e.obtainMessage();
        messageObtainMessage.what = 3;
        this.f810e.sendMessage(messageObtainMessage);
    }

    @Override // af0.AbstractC0303c
    /* JADX INFO: renamed from: d */
    public final void mo1053d(long j11) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo1057h(j11);
            return;
        }
        m1054e();
        Message messageObtainMessage = this.f810e.obtainMessage();
        messageObtainMessage.what = 1;
        Bundle bundle = new Bundle();
        bundle.putLong("totalBytes", j11);
        messageObtainMessage.setData(bundle);
        this.f810e.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: h */
    public void mo1057h(long j11) {
    }

    /* JADX INFO: renamed from: g */
    public void m1056g() {
    }
}
