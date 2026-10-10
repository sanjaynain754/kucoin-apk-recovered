package p549q5;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import p547q3.InterfaceC43595a;

/* JADX INFO: renamed from: q5.m */
/* JADX INFO: compiled from: EncodedMemoryCacheFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43624m {

    /* JADX INFO: renamed from: q5.m$a */
    /* JADX INFO: compiled from: EncodedMemoryCacheFactory.java */
    public class a implements InterfaceC43629r<InterfaceC43595a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC43625n f96298a;

        public a(InterfaceC43625n interfaceC43625n) {
            this.f96298a = interfaceC43625n;
        }

        @Override // p549q5.InterfaceC43629r
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo95996a(InterfaceC43595a interfaceC43595a) {
            this.f96298a.mo96006e(interfaceC43595a);
        }

        @Override // p549q5.InterfaceC43629r
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo95997b(InterfaceC43595a interfaceC43595a) {
            this.f96298a.mo96007f(interfaceC43595a);
        }

        @Override // p549q5.InterfaceC43629r
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo95998c(InterfaceC43595a interfaceC43595a) {
            this.f96298a.mo96015n(interfaceC43595a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C43626o<InterfaceC43595a, PooledByteBuffer> m95995a(InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> interfaceC5648f, InterfaceC43625n interfaceC43625n) {
        interfaceC43625n.mo96009h(interfaceC5648f);
        return new C43626o<>(interfaceC5648f, new a(interfaceC43625n));
    }
}
