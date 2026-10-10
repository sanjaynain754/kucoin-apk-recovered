package p421l4;

import android.graphics.Rect;
import com.facebook.fresco.p061ui.common.C5617a;
import com.facebook.fresco.p061ui.common.ImageLoadStatus;
import com.facebook.fresco.p061ui.common.ImagePerfData;
import com.facebook.fresco.p061ui.common.ImageRenderingInfra;
import com.facebook.fresco.p061ui.common.VisibilityState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p050c4.InterfaceC4820b;
import p283g5.InterfaceC37809b;
import p283g5.InterfaceC37811d;
import p392k4.C40890e;
import p447m4.C42423a;
import p447m4.C42424b;
import p631t4.InterfaceC44687b;
import p821z5.C46703b;

/* JADX INFO: renamed from: l4.a */
/* JADX INFO: compiled from: ImagePerfMonitor.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42052a implements InterfaceC37811d {

    /* JADX INFO: renamed from: a */
    public final C40890e f92329a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4820b f92330b;

    /* JADX INFO: renamed from: c */
    public final C5617a f92331c = new C5617a(ImageRenderingInfra.DRAWEE);

    /* JADX INFO: renamed from: d */
    public C42423a f92332d;

    /* JADX INFO: renamed from: e */
    public C42424b f92333e;

    /* JADX INFO: renamed from: f */
    public C46703b f92334f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC37809b> f92335g;

    /* JADX INFO: renamed from: h */
    public boolean f92336h;

    @Override // p283g5.InterfaceC37811d
    /* JADX INFO: renamed from: a */
    public void mo85326a(C5617a c5617a, VisibilityState visibilityState) {
        List<InterfaceC37809b> list;
        if (!this.f92336h || (list = this.f92335g) == null || list.isEmpty()) {
            return;
        }
        ImagePerfData imagePerfDataM8865S = c5617a.m8865S();
        Iterator<InterfaceC37809b> it = this.f92335g.iterator();
        while (it.hasNext()) {
            it.next().m85303b(imagePerfDataM8865S, visibilityState);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m92254c(InterfaceC37809b interfaceC37809b) {
        if (interfaceC37809b == null) {
            return;
        }
        if (this.f92335g == null) {
            this.f92335g = new CopyOnWriteArrayList();
        }
        this.f92335g.add(interfaceC37809b);
    }

    /* JADX INFO: renamed from: d */
    public void m92255d() {
        InterfaceC44687b interfaceC44687bMo94318e = this.f92329a.mo94318e();
        if (interfaceC44687bMo94318e == null || interfaceC44687bMo94318e.mo96759b() == null) {
            return;
        }
        Rect bounds = interfaceC44687bMo94318e.mo96759b().getBounds();
        this.f92331c.m8860N(bounds.width());
        this.f92331c.m8859M(bounds.height());
    }

    /* JADX INFO: renamed from: e */
    public void m92256e() {
        List<InterfaceC37809b> list = this.f92335g;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m92258g(boolean z11) {
        this.f92336h = z11;
        if (!z11) {
            C42424b c42424b = this.f92333e;
            if (c42424b != null) {
                this.f92329a.m94302S(c42424b);
            }
            C46703b c46703b = this.f92334f;
            if (c46703b != null) {
                this.f92329a.m89559y0(c46703b);
                return;
            }
            return;
        }
        m92259h();
        C42424b c42424b2 = this.f92333e;
        if (c42424b2 != null) {
            this.f92329a.m94324k(c42424b2);
        }
        C46703b c46703b2 = this.f92334f;
        if (c46703b2 != null) {
            this.f92329a.m89539i0(c46703b2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m92259h() {
        if (this.f92333e == null) {
            this.f92333e = new C42424b(this.f92330b, this.f92331c, this);
        }
        if (this.f92332d == null) {
            this.f92332d = new C42423a(this.f92330b, this.f92331c);
        }
        if (this.f92334f == null) {
            this.f92334f = new C46703b(this.f92332d);
        }
    }

    public C42052a(InterfaceC4820b interfaceC4820b, C40890e c40890e) {
        this.f92330b = interfaceC4820b;
        this.f92329a = c40890e;
    }

    @Override // p283g5.InterfaceC37811d
    /* JADX INFO: renamed from: b */
    public void mo85327b(C5617a c5617a, ImageLoadStatus imageLoadStatus) {
        List<InterfaceC37809b> list;
        c5617a.m8854H(imageLoadStatus);
        if (this.f92336h && (list = this.f92335g) != null && !list.isEmpty()) {
            if (imageLoadStatus == ImageLoadStatus.SUCCESS) {
                m92255d();
            }
            ImagePerfData imagePerfDataM8865S = c5617a.m8865S();
            Iterator<InterfaceC37809b> it = this.f92335g.iterator();
            while (it.hasNext()) {
                it.next().m85302a(imagePerfDataM8865S, imageLoadStatus);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m92257f() {
        m92256e();
        m92258g(false);
        this.f92331c.m8866w();
    }
}
