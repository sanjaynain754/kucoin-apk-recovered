package p447m4;

import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.drawable.InterfaceC5587g0;
import com.facebook.fresco.p061ui.common.BaseControllerListener2;
import com.facebook.fresco.p061ui.common.C5617a;
import com.facebook.fresco.p061ui.common.ControllerListener2;
import com.facebook.fresco.p061ui.common.ImageLoadStatus;
import com.facebook.fresco.p061ui.common.VisibilityState;
import java.io.Closeable;
import p050c4.InterfaceC4820b;
import p283g5.InterfaceC37811d;
import p749x5.InterfaceC46077k;

/* JADX INFO: renamed from: m4.b */
/* JADX INFO: compiled from: ImagePerfStateManager.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42424b extends BaseControllerListener2<InterfaceC46077k> implements Closeable, InterfaceC5587g0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC4820b f94045d;

    /* JADX INFO: renamed from: e */
    public final C5617a f94046e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC37811d f94047f;

    /* JADX INFO: renamed from: g */
    public InterfaceC37811d f94048g;

    /* JADX INFO: renamed from: h */
    public final boolean f94049h;

    public C42424b(InterfaceC4820b interfaceC4820b, C5617a c5617a, InterfaceC37811d interfaceC37811d) {
        this(interfaceC4820b, c5617a, interfaceC37811d, true);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public final void m93124n(C5617a c5617a, long j11) {
        c5617a.m8864R(false);
        c5617a.m8858L(j11);
        m93128u(c5617a, VisibilityState.INVISIBLE);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public void m93125o(C5617a c5617a, long j11) {
        c5617a.m8864R(true);
        c5617a.m8863Q(j11);
        m93128u(c5617a, VisibilityState.VISIBLE);
    }

    public C42424b(InterfaceC4820b interfaceC4820b, C5617a c5617a, InterfaceC37811d interfaceC37811d, boolean z11) {
        this.f94048g = null;
        this.f94045d = interfaceC4820b;
        this.f94046e = c5617a;
        this.f94047f = interfaceC37811d;
        this.f94049h = z11;
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5587g0
    /* JADX INFO: renamed from: b */
    public void mo8684b(boolean z11) {
        if (z11) {
            m93125o(this.f94046e, this.f94045d.now());
        } else {
            m93124n(this.f94046e, this.f94045d.now());
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: h */
    public void mo8837h(String str, ControllerListener2.Extras extras) {
        long jNow = this.f94045d.now();
        C5617a c5617a = this.f94046e;
        c5617a.m8852F(extras);
        c5617a.m8848B(str);
        m93127q(c5617a, ImageLoadStatus.RELEASED);
        if (this.f94049h) {
            m93124n(c5617a, jNow);
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: i */
    public void mo8838i(String str, Object obj, ControllerListener2.Extras extras) {
        long jNow = this.f94045d.now();
        C5617a c5617a = this.f94046e;
        c5617a.m8867x();
        c5617a.m8850D(jNow);
        c5617a.m8848B(str);
        c5617a.m8868y(obj);
        c5617a.m8852F(extras);
        m93127q(c5617a, ImageLoadStatus.REQUESTED);
        if (this.f94049h) {
            m93125o(c5617a, jNow);
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: j */
    public void mo8839j(String str, Throwable th2, ControllerListener2.Extras extras) {
        long jNow = this.f94045d.now();
        C5617a c5617a = this.f94046e;
        c5617a.m8852F(extras);
        c5617a.m8869z(jNow);
        c5617a.m8848B(str);
        c5617a.m8851E(th2);
        m93127q(c5617a, ImageLoadStatus.ERROR);
        m93124n(c5617a, jNow);
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo8836g(String str, InterfaceC46077k interfaceC46077k, ControllerListener2.Extras extras) {
        long jNow = this.f94045d.now();
        C5617a c5617a = this.f94046e;
        c5617a.m8852F(extras);
        c5617a.m8847A(jNow);
        c5617a.m8856J(jNow);
        c5617a.m8848B(str);
        c5617a.m8853G(interfaceC46077k);
        m93127q(c5617a, ImageLoadStatus.SUCCESS);
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onIntermediateImageSet(String str, InterfaceC46077k interfaceC46077k) {
        long jNow = this.f94045d.now();
        C5617a c5617a = this.f94046e;
        c5617a.m8849C(jNow);
        c5617a.m8848B(str);
        c5617a.m8853G(interfaceC46077k);
        m93127q(c5617a, ImageLoadStatus.INTERMEDIATE_AVAILABLE);
    }

    /* JADX INFO: renamed from: p */
    public void m93126p() {
        this.f94046e.m8866w();
    }

    /* JADX INFO: renamed from: u */
    public final void m93128u(C5617a c5617a, VisibilityState visibilityState) {
        this.f94047f.mo85326a(c5617a, visibilityState);
        InterfaceC37811d interfaceC37811d = this.f94048g;
        if (interfaceC37811d != null) {
            interfaceC37811d.mo85326a(c5617a, visibilityState);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m93126p();
    }

    /* JADX INFO: renamed from: q */
    public final void m93127q(C5617a c5617a, ImageLoadStatus imageLoadStatus) {
        c5617a.m8854H(imageLoadStatus);
        this.f94047f.mo85327b(c5617a, imageLoadStatus);
        InterfaceC37811d interfaceC37811d = this.f94048g;
        if (interfaceC37811d != null) {
            interfaceC37811d.mo85327b(c5617a, imageLoadStatus);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5587g0
    public void onDraw() {
    }
}
