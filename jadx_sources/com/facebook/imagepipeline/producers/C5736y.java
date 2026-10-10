package com.facebook.imagepipeline.producers;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.request.ImageRequest;
import p192d6.C36621b;
import p547q3.InterfaceC43595a;
import p549q5.C43613b;
import p549q5.InterfaceC43619h;
import p617s5.InterfaceC44317b;
import p712w3.InterfaceC45711k;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.y */
/* JADX INFO: compiled from: EncodedProbeProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5736y implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45711k<InterfaceC44317b> f9497a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9498b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<C46075i> f9499c;

    /* JADX INFO: renamed from: d */
    public final C43613b<InterfaceC43595a> f9500d;

    /* JADX INFO: renamed from: e */
    public final C43613b<InterfaceC43595a> f9501e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.y$a */
    /* JADX INFO: compiled from: EncodedProbeProducer.java */
    public static class a extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC5733w0 f9502c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC45711k<InterfaceC44317b> f9503d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC43619h f9504e;

        /* JADX INFO: renamed from: f */
        public final C43613b<InterfaceC43595a> f9505f;

        /* JADX INFO: renamed from: g */
        public final C43613b<InterfaceC43595a> f9506g;

        public a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, C43613b<InterfaceC43595a> c43613b, C43613b<InterfaceC43595a> c43613b2) {
            super(interfaceC5712m);
            this.f9502c = interfaceC5733w0;
            this.f9503d = interfaceC45711k;
            this.f9504e = interfaceC43619h;
            this.f9505f = c43613b;
            this.f9506g = c43613b2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            boolean zM81959d;
            boolean z11;
            BufferedDiskCache bufferedDiskCacheMo97779b;
            try {
                if (C36621b.m81959d()) {
                    C36621b.m81957a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC5682c.m9646e(i11) && c46075i != null && !AbstractC5682c.m9648l(i11, 10) && c46075i.m101578m() != ImageFormat.f8817d) {
                    ImageRequest imageRequestMo9666h = this.f9502c.mo9666h();
                    InterfaceC43595a interfaceC43595aMo95975b = this.f9504e.mo95975b(imageRequestMo9666h, this.f9502c.mo9663a());
                    this.f9505f.m95972a(interfaceC43595aMo95975b);
                    if ("memory_encoded".equals(this.f9502c.getExtra("origin"))) {
                        if (!this.f9506g.m95973b(interfaceC43595aMo95975b)) {
                            if (imageRequestMo9666h.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            InterfaceC44317b interfaceC44317b = this.f9503d.get();
                            if (z11) {
                                bufferedDiskCacheMo97779b = interfaceC44317b.mo97778a();
                            } else {
                                bufferedDiskCacheMo97779b = interfaceC44317b.mo97779b();
                            }
                            bufferedDiskCacheMo97779b.m9129f(interfaceC43595aMo95975b);
                            this.f9506g.m95972a(interfaceC43595aMo95975b);
                        }
                    } else if ("disk".equals(this.f9502c.getExtra("origin"))) {
                        this.f9506g.m95972a(interfaceC43595aMo95975b);
                    }
                    m9801o().mo9652b(c46075i, i11);
                    if (zM81959d) {
                        return;
                    } else {
                        return;
                    }
                }
                m9801o().mo9652b(c46075i, i11);
            } finally {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m9846c() {
        return "EncodedProbeProducer";
    }

    public C5736y(InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, C43613b c43613b, C43613b c43613b2, InterfaceC5731v0<C46075i> interfaceC5731v0) {
        this.f9497a = interfaceC45711k;
        this.f9498b = interfaceC43619h;
        this.f9500d = c43613b;
        this.f9501e = c43613b2;
        this.f9499c = interfaceC5731v0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("EncodedProbeProducer#produceResults");
            }
            InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
            interfaceC5737y0Mo9665g.mo9454b(interfaceC5733w0, m9846c());
            a aVar = new a(interfaceC5712m, interfaceC5733w0, this.f9497a, this.f9498b, this.f9500d, this.f9501e);
            interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, "EncodedProbeProducer", null);
            if (C36621b.m81959d()) {
                C36621b.m81957a("mInputProducer.produceResult");
            }
            this.f9499c.mo9524a(aVar, interfaceC5733w0);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }
}
