package p549q5;

import com.facebook.imagepipeline.cache.InterfaceC5648f;
import p006a4.AbstractC0110a;
import p712w3.InterfaceC45709i;

/* JADX INFO: renamed from: q5.o */
/* JADX INFO: compiled from: InstrumentedMemoryCache.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43626o<K, V> implements InterfaceC5648f<K, V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5648f<K, V> f96299a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43629r f96300b;

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: a */
    public void mo9156a(K k11) {
        this.f96299a.mo9156a(k11);
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: c */
    public int mo9157c(InterfaceC45709i<K> interfaceC45709i) {
        return this.f96299a.mo9157c(interfaceC45709i);
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: e */
    public AbstractC0110a<V> mo9158e(K k11, AbstractC0110a<V> abstractC0110a) {
        this.f96300b.mo95998c(k11);
        return this.f96299a.mo9158e(k11, abstractC0110a);
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: f */
    public boolean mo9159f(InterfaceC45709i<K> interfaceC45709i) {
        return this.f96299a.mo9159f(interfaceC45709i);
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    public AbstractC0110a<V> get(K k11) {
        AbstractC0110a<V> abstractC0110a = this.f96299a.get(k11);
        if (abstractC0110a == null) {
            this.f96300b.mo95997b(k11);
            return abstractC0110a;
        }
        this.f96300b.mo95996a(k11);
        return abstractC0110a;
    }

    public C43626o(InterfaceC5648f<K, V> interfaceC5648f, InterfaceC43629r interfaceC43629r) {
        this.f96299a = interfaceC5648f;
        this.f96300b = interfaceC43629r;
    }
}
