package com.facebook.imagepipeline.producers;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a4.AbstractC0110a;
import p483o0.C42908e;
import p483o0.InterfaceC42907d;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p617s5.InterfaceC44317b;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;
import p747x3.C45999a;
import p749x5.C46075i;
import p819z3.AbstractC46681j;
import p819z3.InterfaceC46672a;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q0 */
/* JADX INFO: compiled from: PartialDiskCacheProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5721q0 implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45711k<InterfaceC44317b> f9425a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9426b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC46679h f9427c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC46672a f9428d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5731v0<C46075i> f9429e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q0$a */
    /* JADX INFO: compiled from: PartialDiskCacheProducer.java */
    public class a implements InterfaceC42907d<C46075i, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5737y0 f9430a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5733w0 f9431b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC5712m f9432c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC43595a f9433d;

        public a(InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, InterfaceC5712m interfaceC5712m, InterfaceC43595a interfaceC43595a) {
            this.f9430a = interfaceC5737y0;
            this.f9431b = interfaceC5733w0;
            this.f9432c = interfaceC5712m;
            this.f9433d = interfaceC43595a;
        }

        @Override // p483o0.InterfaceC42907d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo9793a(C42908e<C46075i> c42908e) throws Exception {
            if (C5721q0.m9789g(c42908e)) {
                this.f9430a.mo9456d(this.f9431b, "PartialDiskCacheProducer", null);
                this.f9432c.mo9651a();
            } else if (c42908e.m94105n()) {
                this.f9430a.mo9463k(this.f9431b, "PartialDiskCacheProducer", c42908e.m94101i(), null);
                C5721q0.this.m9792i(this.f9432c, this.f9431b, this.f9433d, null);
            } else {
                C46075i c46075iM94102j = c42908e.m94102j();
                if (c46075iM94102j != null) {
                    InterfaceC5737y0 interfaceC5737y0 = this.f9430a;
                    InterfaceC5733w0 interfaceC5733w0 = this.f9431b;
                    interfaceC5737y0.mo9462j(interfaceC5733w0, "PartialDiskCacheProducer", C5721q0.m9788f(interfaceC5737y0, interfaceC5733w0, true, c46075iM94102j.m101582q()));
                    BytesRange bytesRangeM9181g = BytesRange.m9181g(c46075iM94102j.m101582q() - 1);
                    c46075iM94102j.m101564P(bytesRangeM9181g);
                    int iM101582q = c46075iM94102j.m101582q();
                    ImageRequest imageRequestMo9666h = this.f9431b.mo9666h();
                    if (bytesRangeM9181g.m9182c(imageRequestMo9666h.getBytesRange())) {
                        this.f9431b.mo9668j("disk", "partial");
                        this.f9430a.mo9453a(this.f9431b, "PartialDiskCacheProducer", true);
                        this.f9432c.mo9652b(c46075iM94102j, 9);
                    } else {
                        this.f9432c.mo9652b(c46075iM94102j, 8);
                        C5721q0.this.m9792i(this.f9432c, new C5684c1(ImageRequestBuilder.m9849b(imageRequestMo9666h).m9894z(BytesRange.m9179d(iM101582q - 1)).m9872a(), this.f9431b), this.f9433d, c46075iM94102j);
                    }
                } else {
                    InterfaceC5737y0 interfaceC5737y1 = this.f9430a;
                    InterfaceC5733w0 interfaceC5733w1 = this.f9431b;
                    interfaceC5737y1.mo9462j(interfaceC5733w1, "PartialDiskCacheProducer", C5721q0.m9788f(interfaceC5737y1, interfaceC5733w1, false, 0));
                    C5721q0.this.m9792i(this.f9432c, this.f9431b, this.f9433d, c46075iM94102j);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q0$b */
    /* JADX INFO: compiled from: PartialDiskCacheProducer.java */
    public class b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f9435a;

        public b(AtomicBoolean atomicBoolean) {
            this.f9435a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9435a.set(true);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q0$c */
    /* JADX INFO: compiled from: PartialDiskCacheProducer.java */
    public static class c extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC45711k<InterfaceC44317b> f9437c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC43595a f9438d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC46679h f9439e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC46672a f9440f;

        /* JADX INFO: renamed from: g */
        public final C46075i f9441g;

        /* JADX INFO: renamed from: h */
        public final boolean f9442h;

        public c(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43595a interfaceC43595a, InterfaceC46679h interfaceC46679h, InterfaceC46672a interfaceC46672a, C46075i c46075i, boolean z11) {
            super(interfaceC5712m);
            this.f9437c = interfaceC45711k;
            this.f9438d = interfaceC43595a;
            this.f9439e = interfaceC46679h;
            this.f9440f = interfaceC46672a;
            this.f9441g = c46075i;
            this.f9442h = z11;
        }

        /* JADX INFO: renamed from: p */
        public final void m9795p(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
            byte[] bArr = this.f9440f.get(16384);
            int i12 = i11;
            while (i12 > 0) {
                try {
                    int i13 = inputStream.read(bArr, 0, Math.min(16384, i12));
                    if (i13 < 0) {
                        break;
                    } else if (i13 > 0) {
                        outputStream.write(bArr, 0, i13);
                        i12 -= i13;
                    }
                } catch (Throwable th2) {
                    this.f9440f.release(bArr);
                    throw th2;
                }
            }
            this.f9440f.release(bArr);
            if (i12 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i11), Integer.valueOf(i12)));
            }
        }

        /* JADX INFO: renamed from: q */
        public final AbstractC46681j m9796q(C46075i c46075i, C46075i c46075i2) throws IOException {
            int i11 = ((BytesRange) C45708h.m100896g(c46075i2.m101575j())).from;
            AbstractC46681j abstractC46681jMo605d = this.f9439e.mo605d(c46075i2.m101582q() + i11);
            m9795p(c46075i.m101580o(), abstractC46681jMo605d, i11);
            m9795p(c46075i2.m101580o(), abstractC46681jMo605d, c46075i2.m101582q());
            return abstractC46681jMo605d;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            if (!AbstractC5682c.m9646e(i11)) {
                if (this.f9441g != null && c46075i != null && c46075i.m101575j() != null) {
                    try {
                        try {
                            m9798s(m9796q(this.f9441g, c46075i));
                        } catch (IOException e11) {
                            C45999a.m101508n("PartialDiskCacheProducer", "Error while merging image data", e11);
                            m9801o().onFailure(e11);
                        }
                        c46075i.close();
                        this.f9441g.close();
                        this.f9437c.get().mo97779b().m9139s(this.f9438d);
                        return;
                    } catch (Throwable th2) {
                        c46075i.close();
                        this.f9441g.close();
                        throw th2;
                    }
                }
                if (this.f9442h && AbstractC5682c.m9649m(i11, 8) && AbstractC5682c.m9645d(i11) && c46075i != null && c46075i.m101578m() != ImageFormat.f8817d) {
                    this.f9437c.get().mo97779b().m9137p(this.f9438d, c46075i);
                    m9801o().mo9652b(c46075i, i11);
                } else {
                    m9801o().mo9652b(c46075i, i11);
                }
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m9798s(AbstractC46681j abstractC46681j) throws Throwable {
            C46075i c46075i;
            Throwable th2;
            AbstractC0110a abstractC0110aM558p = AbstractC0110a.m558p(abstractC46681j.mo9487a());
            try {
                c46075i = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM558p);
                try {
                    c46075i.m101560J();
                    m9801o().mo9652b(c46075i, 1);
                    C46075i.m101556g(c46075i);
                    AbstractC0110a.m555j(abstractC0110aM558p);
                } catch (Throwable th3) {
                    th2 = th3;
                    C46075i.m101556g(c46075i);
                    AbstractC0110a.m555j(abstractC0110aM558p);
                    throw th2;
                }
            } catch (Throwable th4) {
                c46075i = null;
                th2 = th4;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static Map<String, String> m9788f(InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, boolean z11, int i11) {
        if (interfaceC5737y0.mo9458f(interfaceC5733w0, "PartialDiskCacheProducer")) {
            return z11 ? ImmutableMap.m8534of("cached_value_found", String.valueOf(z11), "encodedImageSize", String.valueOf(i11)) : ImmutableMap.m8533of("cached_value_found", String.valueOf(z11));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m9790j(AtomicBoolean atomicBoolean, InterfaceC5733w0 interfaceC5733w0) {
        interfaceC5733w0.mo9667i(new b(atomicBoolean));
    }

    /* JADX INFO: renamed from: i */
    public final void m9792i(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, InterfaceC43595a interfaceC43595a, C46075i c46075i) {
        this.f9429e.mo9524a(new c(interfaceC5712m, this.f9425a, interfaceC43595a, this.f9427c, this.f9428d, c46075i, interfaceC5733w0.mo9666h().isCacheEnabled(32)), interfaceC5733w0);
    }

    public C5721q0(InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, InterfaceC46679h interfaceC46679h, InterfaceC46672a interfaceC46672a, InterfaceC5731v0<C46075i> interfaceC5731v0) {
        this.f9425a = interfaceC45711k;
        this.f9426b = interfaceC43619h;
        this.f9427c = interfaceC46679h;
        this.f9428d = interfaceC46672a;
        this.f9429e = interfaceC5731v0;
    }

    /* JADX INFO: renamed from: e */
    public static Uri m9787e(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", CredentialEntry.TRUE_STRING).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static boolean m9789g(C42908e<?> c42908e) {
        if (!c42908e.m94103l()) {
            if (!c42908e.m94105n() || !(c42908e.m94101i() instanceof CancellationException)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        boolean zIsCacheEnabled = interfaceC5733w0.mo9666h().isCacheEnabled(16);
        boolean zIsCacheEnabled2 = interfaceC5733w0.mo9666h().isCacheEnabled(32);
        if (!zIsCacheEnabled && !zIsCacheEnabled2) {
            this.f9429e.mo9524a(interfaceC5712m, interfaceC5733w0);
            return;
        }
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        interfaceC5737y0Mo9665g.mo9454b(interfaceC5733w0, "PartialDiskCacheProducer");
        InterfaceC43595a interfaceC43595aMo95977d = this.f9426b.mo95977d(imageRequestMo9666h, m9787e(imageRequestMo9666h), interfaceC5733w0.mo9663a());
        if (!zIsCacheEnabled) {
            interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, "PartialDiskCacheProducer", m9788f(interfaceC5737y0Mo9665g, interfaceC5733w0, false, 0));
            m9792i(interfaceC5712m, interfaceC5733w0, interfaceC43595aMo95977d, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f9425a.get().mo97779b().m9135m(interfaceC43595aMo95977d, atomicBoolean).m94099e(m9791h(interfaceC5712m, interfaceC5733w0, interfaceC43595aMo95977d));
            m9790j(atomicBoolean, interfaceC5733w0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC42907d<C46075i, Void> m9791h(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, InterfaceC43595a interfaceC43595a) {
        return new a(interfaceC5733w0.mo9665g(), interfaceC5733w0, interfaceC5712m, interfaceC43595a);
    }
}
