package com.facebook.imagepipeline.cache;

import p547q3.InterfaceC43595a;
import p549q5.C43628q;
import p549q5.InterfaceC43632u;
import p712w3.InterfaceC45711k;
import p749x5.InterfaceC46071e;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.cache.b */
/* JADX INFO: compiled from: CountingLruBitmapMemoryCacheFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5644b implements InterfaceC5643a {

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.b$a */
    /* JADX INFO: compiled from: CountingLruBitmapMemoryCacheFactory.java */
    public class a implements InterfaceC43632u<InterfaceC46071e> {
        public a() {
        }

        @Override // p549q5.InterfaceC43632u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo9142a(InterfaceC46071e interfaceC46071e) {
            return interfaceC46071e.getSizeInBytes();
        }
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5643a
    /* JADX INFO: renamed from: a */
    public InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> mo9141a(InterfaceC45711k<C43628q> interfaceC45711k, InterfaceC46675d interfaceC46675d, InterfaceC5648f.a aVar, boolean z11, boolean z12, InterfaceC5645c.b<InterfaceC43595a> bVar) {
        C5647e c5647e = new C5647e(new a(), aVar, interfaceC45711k, bVar, z11, z12);
        interfaceC46675d.mo102897a(c5647e);
        return c5647e;
    }
}
