package yb0;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: yb0.t */
/* JADX INFO: compiled from: DatabaseWorkerPool.java */
/* JADX INFO: loaded from: classes23.dex */
public class C46452t implements InterfaceC46448p {

    /* JADX INFO: renamed from: a */
    public final String f104179a;

    /* JADX INFO: renamed from: b */
    public final int f104180b;

    /* JADX INFO: renamed from: c */
    public HandlerThread f104181c;

    /* JADX INFO: renamed from: d */
    public Handler f104182d;

    @Override // yb0.InterfaceC46448p
    /* JADX INFO: renamed from: b */
    public void mo102492b(C46445m c46445m) {
        this.f104182d.post(c46445m.f104159b);
    }

    @Override // yb0.InterfaceC46448p
    /* JADX INFO: renamed from: c */
    public void mo102493c() {
        HandlerThread handlerThread = this.f104181c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f104181c = null;
            this.f104182d = null;
        }
    }

    @Override // yb0.InterfaceC46448p
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f104179a, this.f104180b);
        this.f104181c = handlerThread;
        handlerThread.start();
        this.f104182d = new Handler(this.f104181c.getLooper());
    }

    public C46452t(String str, int i11) {
        this.f104179a = str;
        this.f104180b = i11;
    }
}
