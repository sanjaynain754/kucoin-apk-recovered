package com.facebook.imagepipeline.producers;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.request.ImageRequest;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x */
/* JADX INFO: compiled from: EncodedMemoryCacheProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5734x implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> f9490a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9491b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<C46075i> f9492c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x$a */
    /* JADX INFO: compiled from: EncodedMemoryCacheProducer.java */
    public static class a extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> f9493c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC43595a f9494d;

        /* JADX INFO: renamed from: e */
        public final boolean f9495e;

        /* JADX INFO: renamed from: f */
        public final boolean f9496f;

        public a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> interfaceC5648f, InterfaceC43595a interfaceC43595a, boolean z11, boolean z12) {
            super(interfaceC5712m);
            this.f9493c = interfaceC5648f;
            this.f9494d = interfaceC43595a;
            this.f9495e = z11;
            this.f9496f = z12;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            AbstractC0110a<PooledByteBuffer> abstractC0110aMo9158e;
            try {
                if (C36621b.m81959d()) {
                    C36621b.m81957a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC5682c.m9646e(i11) && c46075i != null && !AbstractC5682c.m9648l(i11, 10) && c46075i.m101578m() != ImageFormat.f8817d) {
                    AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = c46075i.m101574i();
                    if (abstractC0110aM101574i != null) {
                        try {
                            if (this.f9496f && this.f9495e) {
                                abstractC0110aMo9158e = this.f9493c.mo9158e(this.f9494d, abstractC0110aM101574i);
                            } else {
                                abstractC0110aMo9158e = null;
                            }
                            AbstractC0110a.m555j(abstractC0110aM101574i);
                            if (abstractC0110aMo9158e != null) {
                                try {
                                    C46075i c46075i2 = new C46075i(abstractC0110aMo9158e);
                                    c46075i2.m101573h(c46075i);
                                    AbstractC0110a.m555j(abstractC0110aMo9158e);
                                    try {
                                        m9801o().mo9653c(1.0f);
                                        m9801o().mo9652b(c46075i2, i11);
                                        C46075i.m101556g(c46075i2);
                                        if (C36621b.m81959d()) {
                                            C36621b.m81958b();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        C46075i.m101556g(c46075i2);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    AbstractC0110a.m555j(abstractC0110aMo9158e);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            AbstractC0110a.m555j(abstractC0110aM101574i);
                            throw th4;
                        }
                    }
                    m9801o().mo9652b(c46075i, i11);
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                        return;
                    }
                    return;
                }
                m9801o().mo9652b(c46075i, i11);
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            } catch (Throwable th5) {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                throw th5;
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("EncodedMemoryCacheProducer#produceResults");
            }
            InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
            interfaceC5737y0Mo9665g.mo9454b(interfaceC5733w0, "EncodedMemoryCacheProducer");
            InterfaceC43595a interfaceC43595aMo95975b = this.f9491b.mo95975b(interfaceC5733w0.mo9666h(), interfaceC5733w0.mo9663a());
            AbstractC0110a<PooledByteBuffer> abstractC0110a = interfaceC5733w0.mo9666h().isCacheEnabled(4) ? this.f9490a.get(interfaceC43595aMo95975b) : null;
            try {
                if (abstractC0110a != null) {
                    C46075i c46075i = new C46075i(abstractC0110a);
                    try {
                        interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, "EncodedMemoryCacheProducer", interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, "EncodedMemoryCacheProducer") ? ImmutableMap.m8533of("cached_value_found", CredentialEntry.TRUE_STRING) : null);
                        interfaceC5737y0Mo9665g.mo9453a(interfaceC5733w0, "EncodedMemoryCacheProducer", true);
                        interfaceC5733w0.mo9670l("memory_encoded");
                        interfaceC5712m.mo9653c(1.0f);
                        interfaceC5712m.mo9652b(c46075i, 1);
                        C46075i.m101556g(c46075i);
                        AbstractC0110a.m555j(abstractC0110a);
                        if (C36621b.m81959d()) {
                            C36621b.m81958b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        C46075i.m101556g(c46075i);
                        throw th2;
                    }
                }
                if (interfaceC5733w0.mo9673o().getValue() < ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                    a aVar = new a(interfaceC5712m, this.f9490a, interfaceC43595aMo95975b, interfaceC5733w0.mo9666h().isCacheEnabled(8), interfaceC5733w0.mo9664b().getExperiments().getIsEncodedCacheEnabled());
                    interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, "EncodedMemoryCacheProducer", interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, "EncodedMemoryCacheProducer") ? ImmutableMap.m8533of("cached_value_found", CredentialEntry.FALSE_STRING) : null);
                    this.f9492c.mo9524a(aVar, interfaceC5733w0);
                    AbstractC0110a.m555j(abstractC0110a);
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                        return;
                    }
                    return;
                }
                interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, "EncodedMemoryCacheProducer", interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, "EncodedMemoryCacheProducer") ? ImmutableMap.m8533of("cached_value_found", CredentialEntry.FALSE_STRING) : null);
                interfaceC5737y0Mo9665g.mo9453a(interfaceC5733w0, "EncodedMemoryCacheProducer", false);
                interfaceC5733w0.mo9668j("memory_encoded", "nil-result");
                interfaceC5712m.mo9652b(null, 1);
                AbstractC0110a.m555j(abstractC0110a);
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            } catch (Throwable th3) {
                AbstractC0110a.m555j(abstractC0110a);
                throw th3;
            }
        } catch (Throwable th4) {
            if (!C36621b.m81959d()) {
                throw th4;
            }
            C36621b.m81958b();
            throw th4;
        }
    }

    public C5734x(InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> interfaceC5648f, InterfaceC43619h interfaceC43619h, InterfaceC5731v0<C46075i> interfaceC5731v0) {
        this.f9490a = interfaceC5648f;
        this.f9491b = interfaceC43619h;
        this.f9492c = interfaceC5731v0;
    }
}
