package uf0;

import io.opencensus.trace.Span;
import rf0.InterfaceC44071a;
import yf0.C46487b;

/* JADX INFO: renamed from: uf0.j */
/* JADX INFO: compiled from: CurrentSpanUtils.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45221j {

    /* JADX INFO: renamed from: uf0.j$b */
    /* JADX INFO: compiled from: CurrentSpanUtils.java */
    public static final class b implements InterfaceC44071a {

        /* JADX INFO: renamed from: b */
        public final InterfaceC45219h f101742b;

        /* JADX INFO: renamed from: c */
        public final Span f101743c;

        /* JADX INFO: renamed from: d */
        public final boolean f101744d;

        public b(Span span, boolean z11) {
            this.f101743c = span;
            this.f101744d = z11;
            this.f101742b = C46487b.m102560d(C46487b.m102557a(), span).mo99905b();
        }

        @Override // rf0.InterfaceC44071a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C46487b.m102557a().mo99904a(this.f101742b);
            if (this.f101744d) {
                this.f101743c.m87947f();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC44071a m99910b(Span span, boolean z11) {
        return new b(span, z11);
    }

    /* JADX INFO: renamed from: a */
    public static Span m99909a() {
        return C46487b.m102558b(C46487b.m102557a());
    }
}
