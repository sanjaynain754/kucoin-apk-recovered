package p549q5;

import com.facebook.imagepipeline.cache.InterfaceC5648f;
import p547q3.InterfaceC43595a;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: q5.p */
/* JADX INFO: compiled from: InstrumentedMemoryCacheBitmapMemoryCacheFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43627p {

    /* JADX INFO: renamed from: q5.p$a */
    /* JADX INFO: compiled from: InstrumentedMemoryCacheBitmapMemoryCacheFactory.java */
    public class a implements InterfaceC43629r<InterfaceC43595a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC43625n f96301a;

        public a(InterfaceC43625n interfaceC43625n) {
            this.f96301a = interfaceC43625n;
        }

        @Override // p549q5.InterfaceC43629r
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo95996a(InterfaceC43595a interfaceC43595a) {
            this.f96301a.mo96011j(interfaceC43595a);
        }

        @Override // p549q5.InterfaceC43629r
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo95997b(InterfaceC43595a interfaceC43595a) {
            this.f96301a.mo96003b(interfaceC43595a);
        }

        @Override // p549q5.InterfaceC43629r
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo95998c(InterfaceC43595a interfaceC43595a) {
            this.f96301a.mo96010i(interfaceC43595a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C43626o<InterfaceC43595a, InterfaceC46071e> m96016a(InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, InterfaceC43625n interfaceC43625n) {
        interfaceC43625n.mo96012k(interfaceC5648f);
        return new C43626o<>(interfaceC5648f, new a(interfaceC43625n));
    }
}
