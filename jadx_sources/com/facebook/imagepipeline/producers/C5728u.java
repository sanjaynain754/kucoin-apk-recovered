package com.facebook.imagepipeline.producers;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.request.ImageRequest;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p617s5.InterfaceC44317b;
import p712w3.InterfaceC45711k;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u */
/* JADX INFO: compiled from: DiskCacheWriteProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5728u implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45711k<InterfaceC44317b> f9483a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9484b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<C46075i> f9485c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u$a */
    /* JADX INFO: compiled from: DiskCacheWriteProducer.java */
    public static class a extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC5733w0 f9486c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC45711k<InterfaceC44317b> f9487d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC43619h f9488e;

        public a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h) {
            super(interfaceC5712m);
            this.f9486c = interfaceC5733w0;
            this.f9487d = interfaceC45711k;
            this.f9488e = interfaceC43619h;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            this.f9486c.mo9665g().mo9454b(this.f9486c, "DiskCacheWriteProducer");
            if (AbstractC5682c.m9646e(i11) || c46075i == null || AbstractC5682c.m9648l(i11, 10) || c46075i.m101578m() == ImageFormat.f8817d) {
                this.f9486c.mo9665g().mo9462j(this.f9486c, "DiskCacheWriteProducer", null);
                m9801o().mo9652b(c46075i, i11);
                return;
            }
            ImageRequest imageRequestMo9666h = this.f9486c.mo9666h();
            InterfaceC43595a interfaceC43595aMo95975b = this.f9488e.mo95975b(imageRequestMo9666h, this.f9486c.mo9663a());
            InterfaceC44317b interfaceC44317b = this.f9487d.get();
            BufferedDiskCache bufferedDiskCacheM9558a = DiskCacheDecision.m9558a(imageRequestMo9666h, interfaceC44317b.mo97778a(), interfaceC44317b.mo97779b(), interfaceC44317b.mo97780c());
            if (bufferedDiskCacheM9558a != null) {
                bufferedDiskCacheM9558a.m9137p(interfaceC43595aMo95975b, c46075i);
                this.f9486c.mo9665g().mo9462j(this.f9486c, "DiskCacheWriteProducer", null);
                m9801o().mo9652b(c46075i, i11);
                return;
            }
            this.f9486c.mo9665g().mo9463k(this.f9486c, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestMo9666h.getCacheChoice().ordinal()).toString()), null);
            m9801o().mo9652b(c46075i, i11);
        }
    }

    public C5728u(InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, InterfaceC5731v0<C46075i> interfaceC5731v0) {
        this.f9483a = interfaceC45711k;
        this.f9484b = interfaceC43619h;
        this.f9485c = interfaceC5731v0;
    }

    /* JADX INFO: renamed from: c */
    private void m9841c(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        InterfaceC5733w0 interfaceC5733w1;
        if (interfaceC5733w0.mo9673o().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            interfaceC5733w0.mo9668j("disk", "nil-result_write");
            interfaceC5712m.mo9652b(null, 1);
            return;
        }
        if (interfaceC5733w0.mo9666h().isCacheEnabled(32)) {
            interfaceC5733w1 = interfaceC5733w0;
            interfaceC5712m = new a(interfaceC5712m, interfaceC5733w1, this.f9483a, this.f9484b);
        } else {
            interfaceC5733w1 = interfaceC5733w0;
        }
        this.f9485c.mo9524a(interfaceC5712m, interfaceC5733w1);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        m9841c(interfaceC5712m, interfaceC5733w0);
    }
}
