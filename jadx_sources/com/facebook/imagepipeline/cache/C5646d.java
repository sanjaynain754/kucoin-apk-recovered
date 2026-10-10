package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import p547q3.InterfaceC43595a;
import p549q5.C43628q;
import p549q5.InterfaceC43632u;
import p712w3.InterfaceC45711k;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.cache.d */
/* JADX INFO: compiled from: EncodedCountingMemoryCacheFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5646d {

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.d$a */
    /* JADX INFO: compiled from: EncodedCountingMemoryCacheFactory.java */
    public class a implements InterfaceC43632u<PooledByteBuffer> {
        @Override // p549q5.InterfaceC43632u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo9142a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5645c<InterfaceC43595a, PooledByteBuffer> m9149a(InterfaceC45711k<C43628q> interfaceC45711k, InterfaceC46675d interfaceC46675d, InterfaceC5648f.a aVar) {
        C5647e c5647e = new C5647e(new a(), aVar, interfaceC45711k, null, false, false);
        interfaceC46675d.mo102897a(c5647e);
        return c5647e;
    }
}
