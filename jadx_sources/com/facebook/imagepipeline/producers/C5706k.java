package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k */
/* JADX INFO: compiled from: BranchOnSeparateImagesProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5706k implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5731v0<C46075i> f9376a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5731v0<C46075i> f9377b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k$a */
    /* JADX INFO: compiled from: BranchOnSeparateImagesProducer.java */
    public class a extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public InterfaceC5733w0 f9378c;

        public a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
            super(interfaceC5712m);
            this.f9378c = interfaceC5733w0;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(Throwable th2) {
            C5706k.this.f9377b.mo9524a(m9801o(), this.f9378c);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            ImageRequest imageRequestMo9666h = this.f9378c.mo9666h();
            boolean zM9645d = AbstractC5682c.m9645d(i11);
            boolean zM9738c = C5711l1.m9738c(c46075i, imageRequestMo9666h.getResizeOptions());
            if (c46075i != null && (zM9738c || imageRequestMo9666h.getLocalThumbnailPreviewsEnabled())) {
                if (zM9645d && zM9738c) {
                    m9801o().mo9652b(c46075i, i11);
                } else {
                    m9801o().mo9652b(c46075i, AbstractC5682c.m9650n(i11, 1));
                }
            }
            if (!zM9645d || zM9738c || imageRequestMo9666h.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                return;
            }
            C46075i.m101556g(c46075i);
            C5706k.this.f9377b.mo9524a(m9801o(), this.f9378c);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        this.f9376a.mo9524a(new a(interfaceC5712m, interfaceC5733w0), interfaceC5733w0);
    }

    public C5706k(InterfaceC5731v0<C46075i> interfaceC5731v0, InterfaceC5731v0<C46075i> interfaceC5731v1) {
        this.f9376a = interfaceC5731v0;
        this.f9377b = interfaceC5731v1;
    }
}
