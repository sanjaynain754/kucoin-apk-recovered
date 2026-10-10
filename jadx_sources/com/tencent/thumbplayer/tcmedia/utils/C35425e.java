package com.tencent.thumbplayer.tcmedia.utils;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.e */
/* JADX INFO: loaded from: classes64.dex */
public class C35425e {

    /* JADX INFO: renamed from: a */
    private Object f76581a = null;

    /* JADX INFO: renamed from: b */
    private boolean f76582b = false;

    /* JADX INFO: renamed from: c */
    private Throwable f76583c = null;

    /* JADX INFO: renamed from: a */
    public synchronized Object m78862a(long j11) {
        try {
            if (!this.f76582b) {
                m78861b(j11);
            }
            Throwable th2 = this.f76583c;
            if (th2 != null) {
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f76581a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78863a(Object obj) {
        if (this.f76582b) {
            return;
        }
        this.f76581a = obj;
        this.f76582b = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    private void m78861b(long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = false;
        while (j11 > 0) {
            try {
                wait(j11);
                break;
            } catch (InterruptedException unused) {
                j11 -= System.currentTimeMillis() - jCurrentTimeMillis;
                TPLogUtil.m78800i("TPFutureResult", "getResult wait has InterruptedException, remainTime:".concat(String.valueOf(j11)));
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78864a(Throwable th2) {
        if (th2 != null) {
            this.f76583c = th2;
            this.f76582b = true;
            notifyAll();
        }
    }
}
