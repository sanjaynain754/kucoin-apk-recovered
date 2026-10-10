package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.x */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7842x extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C7810ae f12124a;

    public C7842x(C7810ae c7810ae) {
        this.f12124a = c7810ae;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        synchronized (this.f12124a.f12098g) {
            try {
                if (this.f12124a.f12104m.get() > 0 && this.f12124a.f12104m.decrementAndGet() > 0) {
                    this.f12124a.f12094c.m13326d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C7810ae c7810ae = this.f12124a;
                if (c7810ae.f12106o != null) {
                    c7810ae.f12094c.m13326d("Unbind from service.", new Object[0]);
                    C7810ae c7810ae2 = this.f12124a;
                    c7810ae2.f12093b.unbindService(c7810ae2.f12105n);
                    this.f12124a.f12099h = false;
                    this.f12124a.f12106o = null;
                    this.f12124a.f12105n = null;
                }
                this.f12124a.m13292x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
