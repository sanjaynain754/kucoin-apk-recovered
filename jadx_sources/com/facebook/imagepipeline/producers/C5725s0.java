package com.facebook.imagepipeline.producers;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.InterfaceC5742b;
import com.facebook.imagepipeline.request.InterfaceC5743c;
import java.util.Map;
import p006a4.AbstractC0110a;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s0 */
/* JADX INFO: compiled from: PostprocessedBitmapMemoryCacheProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5725s0 implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> f9446a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9447b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> f9448c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s0$a */
    /* JADX INFO: compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    public static class a extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC43595a f9449c;

        /* JADX INFO: renamed from: d */
        public final boolean f9450d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> f9451e;

        /* JADX INFO: renamed from: f */
        public final boolean f9452f;

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            if (abstractC0110a == null) {
                if (AbstractC5682c.m9645d(i11)) {
                    m9801o().mo9652b(null, i11);
                }
            } else if (!AbstractC5682c.m9646e(i11) || this.f9450d) {
                AbstractC0110a<InterfaceC46071e> abstractC0110aMo9158e = this.f9452f ? this.f9451e.mo9158e(this.f9449c, abstractC0110a) : null;
                try {
                    m9801o().mo9653c(1.0f);
                    InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712mM9801o = m9801o();
                    if (abstractC0110aMo9158e != null) {
                        abstractC0110a = abstractC0110aMo9158e;
                    }
                    interfaceC5712mM9801o.mo9652b(abstractC0110a, i11);
                } finally {
                    AbstractC0110a.m555j(abstractC0110aMo9158e);
                }
            }
        }

        public a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC43595a interfaceC43595a, boolean z11, InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, boolean z12) {
            super(interfaceC5712m);
            this.f9449c = interfaceC43595a;
            this.f9450d = z11;
            this.f9451e = interfaceC5648f;
            this.f9452f = z12;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m9802c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    public C5725s0(InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, InterfaceC43619h interfaceC43619h, InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        this.f9446a = interfaceC5648f;
        this.f9447b = interfaceC43619h;
        this.f9448c = interfaceC5731v0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        AbstractC0110a<InterfaceC46071e> abstractC0110a;
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        Object objMo9663a = interfaceC5733w0.mo9663a();
        InterfaceC5742b postprocessor = imageRequestMo9666h.getPostprocessor();
        if (postprocessor != null && postprocessor.getPostprocessorCacheKey() != null) {
            interfaceC5737y0Mo9665g.mo9454b(interfaceC5733w0, m9802c());
            InterfaceC43595a interfaceC43595aMo95974a = this.f9447b.mo95974a(imageRequestMo9666h, objMo9663a);
            Map<String, String> mapM8533of = null;
            if (interfaceC5733w0.mo9666h().isCacheEnabled(1)) {
                abstractC0110a = this.f9446a.get(interfaceC43595aMo95974a);
            } else {
                abstractC0110a = null;
            }
            if (abstractC0110a != null) {
                String strM9802c = m9802c();
                if (interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, m9802c())) {
                    mapM8533of = ImmutableMap.m8533of("cached_value_found", CredentialEntry.TRUE_STRING);
                }
                interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, strM9802c, mapM8533of);
                interfaceC5737y0Mo9665g.mo9453a(interfaceC5733w0, "PostprocessedBitmapMemoryCacheProducer", true);
                interfaceC5733w0.mo9668j("memory_bitmap", "postprocessed");
                interfaceC5712m.mo9653c(1.0f);
                interfaceC5712m.mo9652b(abstractC0110a, 1);
                abstractC0110a.close();
                return;
            }
            a aVar = new a(interfaceC5712m, interfaceC43595aMo95974a, postprocessor instanceof InterfaceC5743c, this.f9446a, interfaceC5733w0.mo9666h().isCacheEnabled(2));
            String strM9802c2 = m9802c();
            if (interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, m9802c())) {
                mapM8533of = ImmutableMap.m8533of("cached_value_found", CredentialEntry.FALSE_STRING);
            }
            interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, strM9802c2, mapM8533of);
            this.f9448c.mo9524a(aVar, interfaceC5733w0);
            return;
        }
        this.f9448c.mo9524a(interfaceC5712m, interfaceC5733w0);
    }
}
