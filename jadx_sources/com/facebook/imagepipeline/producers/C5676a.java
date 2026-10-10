package com.facebook.imagepipeline.producers;

import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a */
/* JADX INFO: compiled from: AddImageTransformMetaDataProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5676a implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5731v0<C46075i> f9257a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a */
    /* JADX INFO: compiled from: AddImageTransformMetaDataProducer.java */
    public static class a extends AbstractC5724s<C46075i, C46075i> {
        public a(InterfaceC5712m<C46075i> interfaceC5712m) {
            super(interfaceC5712m);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            if (c46075i == null) {
                m9801o().mo9652b(null, i11);
                return;
            }
            if (!C46075i.m101557z(c46075i)) {
                c46075i.m101560J();
            }
            m9801o().mo9652b(c46075i, i11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        this.f9257a.mo9524a(new a(interfaceC5712m), interfaceC5733w0);
    }

    public C5676a(InterfaceC5731v0<C46075i> interfaceC5731v0) {
        this.f9257a = interfaceC5731v0;
    }
}
