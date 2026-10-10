package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.request.ImageRequest;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p547q3.InterfaceC43595a;
import p549q5.C43613b;
import p549q5.InterfaceC43619h;
import p617s5.InterfaceC44317b;
import p712w3.InterfaceC45711k;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j */
/* JADX INFO: compiled from: BitmapProbeProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5703j implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> f9359a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45711k<InterfaceC44317b> f9360b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC43619h f9361c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> f9362d;

    /* JADX INFO: renamed from: e */
    public final C43613b<InterfaceC43595a> f9363e;

    /* JADX INFO: renamed from: f */
    public final C43613b<InterfaceC43595a> f9364f;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    /* JADX INFO: compiled from: BitmapProbeProducer.java */
    public static class a extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC5733w0 f9365c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> f9366d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC45711k<InterfaceC44317b> f9367e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC43619h f9368f;

        /* JADX INFO: renamed from: g */
        public final C43613b<InterfaceC43595a> f9369g;

        /* JADX INFO: renamed from: h */
        public final C43613b<InterfaceC43595a> f9370h;

        public a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> interfaceC5648f, InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, C43613b<InterfaceC43595a> c43613b, C43613b<InterfaceC43595a> c43613b2) {
            super(interfaceC5712m);
            this.f9365c = interfaceC5733w0;
            this.f9366d = interfaceC5648f;
            this.f9367e = interfaceC45711k;
            this.f9368f = interfaceC43619h;
            this.f9369g = c43613b;
            this.f9370h = c43613b2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            boolean zM81959d;
            boolean z11;
            BufferedDiskCache bufferedDiskCacheMo97779b;
            try {
                if (C36621b.m81959d()) {
                    C36621b.m81957a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC5682c.m9646e(i11) && abstractC0110a != null && !AbstractC5682c.m9648l(i11, 8)) {
                    ImageRequest imageRequestMo9666h = this.f9365c.mo9666h();
                    InterfaceC43595a interfaceC43595aMo95975b = this.f9368f.mo95975b(imageRequestMo9666h, this.f9365c.mo9663a());
                    String str = (String) this.f9365c.getExtra("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f9365c.mo9664b().getExperiments().getIsEncodedMemoryCacheProbingEnabled() && !this.f9369g.m95973b(interfaceC43595aMo95975b)) {
                            this.f9366d.mo9156a(interfaceC43595aMo95975b);
                            this.f9369g.m95972a(interfaceC43595aMo95975b);
                        }
                        if (this.f9365c.mo9664b().getExperiments().getIsDiskCacheProbingEnabled() && !this.f9370h.m95973b(interfaceC43595aMo95975b)) {
                            if (imageRequestMo9666h.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            InterfaceC44317b interfaceC44317b = this.f9367e.get();
                            if (z11) {
                                bufferedDiskCacheMo97779b = interfaceC44317b.mo97778a();
                            } else {
                                bufferedDiskCacheMo97779b = interfaceC44317b.mo97779b();
                            }
                            bufferedDiskCacheMo97779b.m9129f(interfaceC43595aMo95975b);
                            this.f9370h.m95972a(interfaceC43595aMo95975b);
                        }
                    }
                    m9801o().mo9652b(abstractC0110a, i11);
                    if (zM81959d) {
                        return;
                    } else {
                        return;
                    }
                }
                m9801o().mo9652b(abstractC0110a, i11);
            } finally {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m9709c() {
        return "BitmapProbeProducer";
    }

    public C5703j(InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> interfaceC5648f, InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, C43613b<InterfaceC43595a> c43613b, C43613b<InterfaceC43595a> c43613b2, InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        this.f9359a = interfaceC5648f;
        this.f9360b = interfaceC45711k;
        this.f9361c = interfaceC43619h;
        this.f9363e = c43613b;
        this.f9364f = c43613b2;
        this.f9362d = interfaceC5731v0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("BitmapProbeProducer#produceResults");
            }
            InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
            interfaceC5737y0Mo9665g.mo9454b(interfaceC5733w0, m9709c());
            a aVar = new a(interfaceC5712m, interfaceC5733w0, this.f9359a, this.f9360b, this.f9361c, this.f9363e, this.f9364f);
            interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, "BitmapProbeProducer", null);
            if (C36621b.m81959d()) {
                C36621b.m81957a("mInputProducer.produceResult");
            }
            this.f9362d.mo9524a(aVar, interfaceC5733w0);
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
