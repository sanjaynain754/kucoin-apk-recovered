package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.BytesRange;
import java.io.InputStream;
import java.util.Map;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p684v5.InterfaceC45424e;
import p749x5.C46075i;
import p819z3.AbstractC46681j;
import p819z3.InterfaceC46672a;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o0 */
/* JADX INFO: compiled from: NetworkFetchProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5717o0 implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC46679h f9414a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46672a f9415b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5719p0 f9416c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o0$a */
    /* JADX INFO: compiled from: NetworkFetchProducer.java */
    public class a implements InterfaceC5719p0.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5677a0 f9417a;

        public a(C5677a0 c5677a0) {
            this.f9417a = c5677a0;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0.a
        /* JADX INFO: renamed from: a */
        public void mo9783a() {
            C5717o0.this.m9779k(this.f9417a);
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0.a
        public void onFailure(Throwable th2) {
            C5717o0.this.m9780l(this.f9417a, th2);
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0.a
        /* JADX INFO: renamed from: b */
        public void mo9784b(InputStream inputStream, int i11) throws Throwable {
            if (C36621b.m81959d()) {
                C36621b.m81957a("NetworkFetcher->onResponse");
            }
            C5717o0.this.m9781m(this.f9417a, inputStream, i11);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static float m9773e(int i11, int i12) {
        return i12 > 0 ? i11 / i12 : 1.0f - ((float) Math.exp(((double) (-i11)) / 50000.0d));
    }

    /* JADX INFO: renamed from: m */
    public void m9781m(C5677a0 c5677a0, InputStream inputStream, int i11) throws Throwable {
        AbstractC46681j abstractC46681jMo605d = i11 > 0 ? this.f9414a.mo605d(i11) : this.f9414a.mo603b();
        byte[] bArr = this.f9415b.get(16384);
        while (true) {
            try {
                int i12 = inputStream.read(bArr);
                if (i12 < 0) {
                    this.f9416c.onFetchCompletion(c5677a0, abstractC46681jMo605d.getCount());
                    m9777h(abstractC46681jMo605d, c5677a0);
                    this.f9415b.release(bArr);
                    abstractC46681jMo605d.close();
                    return;
                }
                if (i12 > 0) {
                    abstractC46681jMo605d.write(bArr, 0, i12);
                    m9778i(abstractC46681jMo605d, c5677a0);
                    c5677a0.m9599a().mo9653c(m9773e(abstractC46681jMo605d.getCount(), i11));
                }
            } catch (Throwable th2) {
                this.f9415b.release(bArr);
                abstractC46681jMo605d.close();
                throw th2;
            }
        }
    }

    public C5717o0(InterfaceC46679h interfaceC46679h, InterfaceC46672a interfaceC46672a, InterfaceC5719p0 interfaceC5719p0) {
        this.f9414a = interfaceC46679h;
        this.f9415b = interfaceC46672a;
        this.f9416c = interfaceC5719p0;
    }

    /* JADX INFO: renamed from: j */
    public static void m9774j(AbstractC46681j abstractC46681j, int i11, BytesRange bytesRange, InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) throws Throwable {
        AbstractC0110a abstractC0110aM558p = AbstractC0110a.m558p(abstractC46681j.mo9487a());
        C46075i c46075i = null;
        try {
            C46075i c46075i2 = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM558p);
            try {
                c46075i2.m101564P(bytesRange);
                c46075i2.m101560J();
                interfaceC5712m.mo9652b(c46075i2, i11);
                C46075i.m101556g(c46075i2);
                AbstractC0110a.m555j(abstractC0110aM558p);
            } catch (Throwable th2) {
                th = th2;
                c46075i = c46075i2;
                C46075i.m101556g(c46075i);
                AbstractC0110a.m555j(abstractC0110aM558p);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        interfaceC5733w0.mo9665g().mo9454b(interfaceC5733w0, "NetworkFetchProducer");
        C5677a0 c5677a0CreateFetchState = this.f9416c.createFetchState(interfaceC5712m, interfaceC5733w0);
        this.f9416c.fetch(c5677a0CreateFetchState, new a(c5677a0CreateFetchState));
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m9775f(C5677a0 c5677a0, int i11) {
        if (!c5677a0.m9602d().mo9458f(c5677a0.m9600b(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f9416c.getExtraMap(c5677a0, i11);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public long m9776g() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public void m9777h(AbstractC46681j abstractC46681j, C5677a0 c5677a0) throws Throwable {
        Map<String, String> mapM9775f = m9775f(c5677a0, abstractC46681j.getCount());
        InterfaceC5737y0 interfaceC5737y0M9602d = c5677a0.m9602d();
        interfaceC5737y0M9602d.mo9462j(c5677a0.m9600b(), "NetworkFetchProducer", mapM9775f);
        interfaceC5737y0M9602d.mo9453a(c5677a0.m9600b(), "NetworkFetchProducer", true);
        c5677a0.m9600b().mo9670l("network");
        m9774j(abstractC46681j, c5677a0.m9603e() | 1, c5677a0.m9604f(), c5677a0.m9599a(), c5677a0.m9600b());
    }

    /* JADX INFO: renamed from: i */
    public void m9778i(AbstractC46681j abstractC46681j, C5677a0 c5677a0) throws Throwable {
        if (m9782n(c5677a0, c5677a0.m9600b())) {
            long jM9776g = m9776g();
            if (jM9776g - c5677a0.m9601c() >= 100) {
                c5677a0.m9606h(jM9776g);
                c5677a0.m9602d().mo9460h(c5677a0.m9600b(), "NetworkFetchProducer", "intermediate_result");
                m9774j(abstractC46681j, c5677a0.m9603e(), c5677a0.m9604f(), c5677a0.m9599a(), c5677a0.m9600b());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m9779k(C5677a0 c5677a0) {
        c5677a0.m9602d().mo9456d(c5677a0.m9600b(), "NetworkFetchProducer", null);
        c5677a0.m9599a().mo9651a();
    }

    /* JADX INFO: renamed from: l */
    public final void m9780l(C5677a0 c5677a0, Throwable th2) {
        c5677a0.m9602d().mo9463k(c5677a0.m9600b(), "NetworkFetchProducer", th2, null);
        c5677a0.m9602d().mo9453a(c5677a0.m9600b(), "NetworkFetchProducer", false);
        c5677a0.m9600b().mo9670l("network");
        c5677a0.m9599a().onFailure(th2);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9782n(C5677a0 c5677a0, InterfaceC5733w0 interfaceC5733w0) {
        InterfaceC45424e progressiveJpegConfig = interfaceC5733w0.mo9664b().getProgressiveJpegConfig();
        if (progressiveJpegConfig == null || !progressiveJpegConfig.mo100389c() || !c5677a0.m9600b().mo9671m()) {
            return false;
        }
        return this.f9416c.shouldPropagate(c5677a0);
    }
}
