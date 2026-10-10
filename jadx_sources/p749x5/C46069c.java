package p749x5;

import p448m5.C42429d;
import p448m5.InterfaceC42427b;

/* JADX INFO: renamed from: x5.c */
/* JADX INFO: compiled from: CloseableAnimatedImage.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46069c extends AbstractC46073g {

    /* JADX INFO: renamed from: b */
    public C42429d f103506b;

    /* JADX INFO: renamed from: c */
    public boolean f103507c;

    @Override // p749x5.InterfaceC46071e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                C42429d c42429d = this.f103506b;
                if (c42429d == null) {
                    return;
                }
                this.f103506b = null;
                c42429d.m93142a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p749x5.InterfaceC46071e, p749x5.InterfaceC46077k
    public synchronized int getHeight() {
        C42429d c42429d;
        c42429d = this.f103506b;
        return c42429d == null ? 0 : c42429d.m93144d().getHeight();
    }

    @Override // p749x5.InterfaceC46071e
    public synchronized int getSizeInBytes() {
        C42429d c42429d;
        c42429d = this.f103506b;
        return c42429d == null ? 0 : c42429d.m93144d().getSizeInBytes();
    }

    @Override // p749x5.InterfaceC46071e, p749x5.InterfaceC46077k
    public synchronized int getWidth() {
        C42429d c42429d;
        c42429d = this.f103506b;
        return c42429d == null ? 0 : c42429d.m93144d().getWidth();
    }

    @Override // p749x5.InterfaceC46071e
    public synchronized boolean isClosed() {
        return this.f103506b == null;
    }

    /* JADX INFO: renamed from: p */
    public synchronized InterfaceC42427b m101548p() {
        C42429d c42429d;
        c42429d = this.f103506b;
        return c42429d == null ? null : c42429d.m93144d();
    }

    /* JADX INFO: renamed from: q */
    public synchronized C42429d m101549q() {
        return this.f103506b;
    }

    @Override // p749x5.AbstractC46067a, p749x5.InterfaceC46071e
    public boolean isStateful() {
        return this.f103507c;
    }

    public C46069c(C42429d c42429d, boolean z11) {
        this.f103506b = c42429d;
        this.f103507c = z11;
    }
}
