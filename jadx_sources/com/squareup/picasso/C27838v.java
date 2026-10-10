package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.squareup.picasso.v */
/* JADX INFO: compiled from: Stats.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27838v {

    /* JADX INFO: renamed from: a */
    public final HandlerThread f56855a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC27820d f56856b;

    /* JADX INFO: renamed from: c */
    public final Handler f56857c;

    /* JADX INFO: renamed from: d */
    public long f56858d;

    /* JADX INFO: renamed from: e */
    public long f56859e;

    /* JADX INFO: renamed from: f */
    public long f56860f;

    /* JADX INFO: renamed from: g */
    public long f56861g;

    /* JADX INFO: renamed from: h */
    public long f56862h;

    /* JADX INFO: renamed from: i */
    public long f56863i;

    /* JADX INFO: renamed from: j */
    public long f56864j;

    /* JADX INFO: renamed from: k */
    public long f56865k;

    /* JADX INFO: renamed from: l */
    public int f56866l;

    /* JADX INFO: renamed from: m */
    public int f56867m;

    /* JADX INFO: renamed from: n */
    public int f56868n;

    /* JADX INFO: renamed from: com.squareup.picasso.v$a */
    /* JADX INFO: compiled from: Stats.java */
    public static class a extends Handler {

        /* JADX INFO: renamed from: a */
        public final C27838v f56869a;

        /* JADX INFO: renamed from: com.squareup.picasso.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Stats.java */
        public class RunnableC46992a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Message f56870b;

            public RunnableC46992a(Message message) {
                this.f56870b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f56870b.what);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                this.f56869a.m68929j();
                return;
            }
            if (i11 == 1) {
                this.f56869a.m68930k();
                return;
            }
            if (i11 == 2) {
                this.f56869a.m68927h(message.arg1);
                return;
            }
            if (i11 == 3) {
                this.f56869a.m68928i(message.arg1);
            } else if (i11 != 4) {
                Picasso.f56672p.post(new RunnableC46992a(message));
            } else {
                this.f56869a.m68931l((Long) message.obj);
            }
        }

        public a(Looper looper, C27838v c27838v) {
            super(looper);
            this.f56869a = c27838v;
        }
    }

    /* JADX INFO: renamed from: g */
    public static long m68920g(int i11, long j11) {
        return j11 / ((long) i11);
    }

    /* JADX INFO: renamed from: b */
    public void m68922b(Bitmap bitmap) {
        m68932m(bitmap, 2);
    }

    /* JADX INFO: renamed from: c */
    public void m68923c(Bitmap bitmap) {
        m68932m(bitmap, 3);
    }

    /* JADX INFO: renamed from: a */
    public C27839w m68921a() {
        return new C27839w(this.f56856b.mo68847a(), this.f56856b.size(), this.f56858d, this.f56859e, this.f56860f, this.f56861g, this.f56862h, this.f56863i, this.f56864j, this.f56865k, this.f56866l, this.f56867m, this.f56868n, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: d */
    public void m68924d() {
        this.f56857c.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: e */
    public void m68925e() {
        this.f56857c.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: f */
    public void m68926f(long j11) {
        Handler handler = this.f56857c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j11)));
    }

    /* JADX INFO: renamed from: h */
    public void m68927h(long j11) {
        int i11 = this.f56867m + 1;
        this.f56867m = i11;
        long j12 = this.f56861g + j11;
        this.f56861g = j12;
        this.f56864j = m68920g(i11, j12);
    }

    /* JADX INFO: renamed from: i */
    public void m68928i(long j11) {
        this.f56868n++;
        long j12 = this.f56862h + j11;
        this.f56862h = j12;
        this.f56865k = m68920g(this.f56867m, j12);
    }

    /* JADX INFO: renamed from: j */
    public void m68929j() {
        this.f56858d++;
    }

    /* JADX INFO: renamed from: k */
    public void m68930k() {
        this.f56859e++;
    }

    /* JADX INFO: renamed from: l */
    public void m68931l(Long l11) {
        this.f56866l++;
        long jLongValue = this.f56860f + l11.longValue();
        this.f56860f = jLongValue;
        this.f56863i = m68920g(this.f56866l, jLongValue);
    }

    public C27838v(InterfaceC27820d interfaceC27820d) {
        this.f56856b = interfaceC27820d;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f56855a = handlerThread;
        handlerThread.start();
        C27841y.m68942h(handlerThread.getLooper());
        this.f56857c = new a(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: m */
    public final void m68932m(Bitmap bitmap, int i11) {
        int iM68943i = C27841y.m68943i(bitmap);
        Handler handler = this.f56857c;
        handler.sendMessage(handler.obtainMessage(i11, iM68943i, 0));
    }
}
