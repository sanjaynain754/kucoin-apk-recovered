package p749x5;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;
import p284g6.C37818c;
import p712w3.C45708h;

/* JADX INFO: renamed from: x5.b */
/* JADX INFO: compiled from: BaseCloseableStaticBitmap.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46068b extends AbstractC46067a implements InterfaceC46072f {

    /* JADX INFO: renamed from: g */
    public static boolean f103500g;

    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> f103501b;

    /* JADX INFO: renamed from: c */
    public volatile Bitmap f103502c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC46080n f103503d;

    /* JADX INFO: renamed from: e */
    public final int f103504e;

    /* JADX INFO: renamed from: f */
    public final int f103505f;

    public C46068b(Bitmap bitmap, InterfaceC0117h<Bitmap> interfaceC0117h, InterfaceC46080n interfaceC46080n, int i11, int i12) {
        this.f103502c = (Bitmap) C45708h.m100896g(bitmap);
        this.f103501b = AbstractC0110a.m560u(this.f103502c, (InterfaceC0117h) C45708h.m100896g(interfaceC0117h));
        this.f103503d = interfaceC46080n;
        this.f103504e = i11;
        this.f103505f = i12;
    }

    @Override // p749x5.InterfaceC46072f
    /* JADX INFO: renamed from: f */
    public synchronized AbstractC0110a<Bitmap> mo101545f() {
        return AbstractC0110a.m553h(this.f103501b);
    }

    @Override // p749x5.InterfaceC46071e
    public synchronized boolean isClosed() {
        return this.f103501b == null;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized AbstractC0110a<Bitmap> m101546p() {
        AbstractC0110a<Bitmap> abstractC0110a;
        abstractC0110a = this.f103501b;
        this.f103501b = null;
        this.f103502c = null;
        return abstractC0110a;
    }

    /* JADX INFO: renamed from: q */
    public static int m101540q(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* JADX INFO: renamed from: u */
    public static int m101541u(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m101542v() {
        return f103500g;
    }

    @Override // p749x5.InterfaceC46072f
    /* JADX INFO: renamed from: F */
    public int mo101543F() {
        return this.f103504e;
    }

    @Override // p749x5.InterfaceC46070d
    /* JADX INFO: renamed from: K */
    public Bitmap mo101544K() {
        return this.f103502c;
    }

    @Override // p749x5.InterfaceC46071e, p749x5.InterfaceC46077k
    public int getHeight() {
        int i11;
        return (this.f103504e % 180 != 0 || (i11 = this.f103505f) == 5 || i11 == 7) ? m101541u(this.f103502c) : m101540q(this.f103502c);
    }

    @Override // p749x5.AbstractC46067a, p749x5.InterfaceC46071e
    public InterfaceC46080n getQualityInfo() {
        return this.f103503d;
    }

    @Override // p749x5.InterfaceC46071e
    public int getSizeInBytes() {
        return C37818c.m85341j(this.f103502c);
    }

    @Override // p749x5.InterfaceC46071e, p749x5.InterfaceC46077k
    public int getWidth() {
        int i11;
        return (this.f103504e % 180 != 0 || (i11 = this.f103505f) == 5 || i11 == 7) ? m101540q(this.f103502c) : m101541u(this.f103502c);
    }

    @Override // p749x5.InterfaceC46072f
    /* JADX INFO: renamed from: t */
    public int mo101547t() {
        return this.f103505f;
    }

    @Override // p749x5.InterfaceC46071e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC0110a<Bitmap> abstractC0110aM101546p = m101546p();
        if (abstractC0110aM101546p != null) {
            abstractC0110aM101546p.close();
        }
    }

    public C46068b(AbstractC0110a<Bitmap> abstractC0110a, InterfaceC46080n interfaceC46080n, int i11, int i12) {
        AbstractC0110a<Bitmap> abstractC0110a2 = (AbstractC0110a) C45708h.m100896g(abstractC0110a.mo564g());
        this.f103501b = abstractC0110a2;
        this.f103502c = abstractC0110a2.m565l();
        this.f103503d = interfaceC46080n;
        this.f103504e = i11;
        this.f103505f = i12;
    }
}
