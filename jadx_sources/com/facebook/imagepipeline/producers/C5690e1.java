package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e1 */
/* JADX INFO: compiled from: SwallowResultProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5690e1<T> implements InterfaceC5731v0<Void> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5731v0<T> f9325a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e1$a */
    /* JADX INFO: compiled from: SwallowResultProducer.java */
    public class a extends AbstractC5724s<T, Void> {
        public a(InterfaceC5712m interfaceC5712m) {
            super(interfaceC5712m);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: h */
        public void mo9551h(T t11, int i11) {
            if (AbstractC5682c.m9645d(i11)) {
                m9801o().mo9652b(null, i11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<Void> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        this.f9325a.mo9524a(new a(interfaceC5712m), interfaceC5733w0);
    }

    public C5690e1(InterfaceC5731v0<T> interfaceC5731v0) {
        this.f9325a = interfaceC5731v0;
    }
}
