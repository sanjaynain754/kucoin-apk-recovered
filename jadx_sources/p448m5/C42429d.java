package p448m5;

import android.graphics.Bitmap;
import java.util.List;
import p006a4.AbstractC0110a;
import p253f6.InterfaceC37380a;
import p712w3.C45708h;

/* JADX INFO: renamed from: m5.d */
/* JADX INFO: compiled from: AnimatedImageResult.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42429d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC42427b f94050a;

    /* JADX INFO: renamed from: b */
    public final int f94051b;

    /* JADX INFO: renamed from: c */
    public String f94052c;

    /* JADX INFO: renamed from: d */
    public AbstractC0110a<Bitmap> f94053d;

    /* JADX INFO: renamed from: e */
    public List<AbstractC0110a<Bitmap>> f94054e;

    public C42429d(C42430e c42430e) {
        this.f94050a = (InterfaceC42427b) C45708h.m100896g(c42430e.m93150e());
        this.f94051b = c42430e.m93149d();
        this.f94053d = c42430e.m93151f();
        this.f94054e = c42430e.m93148c();
        c42430e.m93147b();
        this.f94052c = c42430e.m93152g();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m93142a() {
        AbstractC0110a.m555j(this.f94053d);
        this.f94053d = null;
        AbstractC0110a.m556k(this.f94054e);
        this.f94054e = null;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC37380a m93143c() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C42429d m93140b(InterfaceC42427b interfaceC42427b) {
        return new C42429d(interfaceC42427b);
    }

    /* JADX INFO: renamed from: f */
    public static C42430e m93141f(InterfaceC42427b interfaceC42427b) {
        return new C42430e(interfaceC42427b);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC42427b m93144d() {
        return this.f94050a;
    }

    /* JADX INFO: renamed from: e */
    public String m93145e() {
        return this.f94052c;
    }

    public C42429d(InterfaceC42427b interfaceC42427b) {
        this.f94050a = (InterfaceC42427b) C45708h.m100896g(interfaceC42427b);
        this.f94051b = 0;
    }
}
