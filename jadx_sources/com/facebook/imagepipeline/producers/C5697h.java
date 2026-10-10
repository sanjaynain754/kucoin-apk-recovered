package com.facebook.imagepipeline.producers;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46076j;
import p749x5.InterfaceC46080n;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h */
/* JADX INFO: compiled from: BitmapMemoryCacheProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5697h implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> f9339a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9340b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> f9341c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h$a */
    /* JADX INFO: compiled from: BitmapMemoryCacheProducer.java */
    public class a extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC43595a f9342c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f9343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5712m interfaceC5712m, InterfaceC43595a interfaceC43595a, boolean z11) {
            super(interfaceC5712m);
            this.f9342c = interfaceC43595a;
            this.f9343d = z11;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            AbstractC0110a<InterfaceC46071e> abstractC0110a2;
            try {
                if (C36621b.m81959d()) {
                    C36621b.m81957a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zM9645d = AbstractC5682c.m9645d(i11);
                AbstractC0110a<InterfaceC46071e> abstractC0110aMo9158e = null;
                if (abstractC0110a == null) {
                    if (zM9645d) {
                        m9801o().mo9652b(null, i11);
                    }
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                        return;
                    }
                    return;
                }
                if (!abstractC0110a.m565l().isStateful() && !AbstractC5682c.m9649m(i11, 8)) {
                    if (!zM9645d && (abstractC0110a2 = C5697h.this.f9339a.get(this.f9342c)) != null) {
                        try {
                            InterfaceC46080n qualityInfo = abstractC0110a.m565l().getQualityInfo();
                            InterfaceC46080n qualityInfo2 = abstractC0110a2.m565l().getQualityInfo();
                            if (!qualityInfo2.mo101589a() && qualityInfo2.mo101591c() < qualityInfo.mo101591c()) {
                                AbstractC0110a.m555j(abstractC0110a2);
                            } else {
                                m9801o().mo9652b(abstractC0110a2, i11);
                                AbstractC0110a.m555j(abstractC0110a2);
                                if (C36621b.m81959d()) {
                                    C36621b.m81958b();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            AbstractC0110a.m555j(abstractC0110a2);
                            throw th2;
                        }
                    }
                    if (this.f9343d) {
                        abstractC0110aMo9158e = C5697h.this.f9339a.mo9158e(this.f9342c, abstractC0110a);
                    }
                    if (zM9645d) {
                        try {
                            m9801o().mo9653c(1.0f);
                        } catch (Throwable th3) {
                            AbstractC0110a.m555j(abstractC0110aMo9158e);
                            throw th3;
                        }
                    }
                    InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712mM9801o = m9801o();
                    if (abstractC0110aMo9158e != null) {
                        abstractC0110a = abstractC0110aMo9158e;
                    }
                    interfaceC5712mM9801o.mo9652b(abstractC0110a, i11);
                    AbstractC0110a.m555j(abstractC0110aMo9158e);
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                        return;
                    }
                    return;
                }
                m9801o().mo9652b(abstractC0110a, i11);
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            } catch (Throwable th4) {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public String mo9522e() {
        return "BitmapMemoryCacheProducer";
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> mo9523g(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC43595a interfaceC43595a, boolean z11) {
        return new a(interfaceC5712m, interfaceC43595a, z11);
    }

    public C5697h(InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, InterfaceC43619h interfaceC43619h, InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0) {
        this.f9339a = interfaceC5648f;
        this.f9340b = interfaceC43619h;
        this.f9341c = interfaceC5731v0;
    }

    /* JADX INFO: renamed from: f */
    public static void m9697f(InterfaceC46076j interfaceC46076j, InterfaceC5733w0 interfaceC5733w0) {
        interfaceC5733w0.putExtras(interfaceC46076j.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        AbstractC0110a<InterfaceC46071e> abstractC0110a;
        boolean zM81959d;
        Map<String, String> mapM8533of;
        Map<String, String> mapM8533of2;
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("BitmapMemoryCacheProducer#produceResults");
            }
            InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
            interfaceC5737y0Mo9665g.mo9454b(interfaceC5733w0, mo9522e());
            InterfaceC43595a interfaceC43595aMo95976c = this.f9340b.mo95976c(interfaceC5733w0.mo9666h(), interfaceC5733w0.mo9663a());
            Map<String, String> mapM8533of3 = null;
            if (interfaceC5733w0.mo9666h().isCacheEnabled(1)) {
                abstractC0110a = this.f9339a.get(interfaceC43595aMo95976c);
            } else {
                abstractC0110a = null;
            }
            if (abstractC0110a != null) {
                m9697f(abstractC0110a.m565l(), interfaceC5733w0);
                boolean zMo101589a = abstractC0110a.m565l().getQualityInfo().mo101589a();
                if (zMo101589a) {
                    String strMo9522e = mo9522e();
                    if (interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, mo9522e())) {
                        mapM8533of2 = ImmutableMap.m8533of("cached_value_found", CredentialEntry.TRUE_STRING);
                    } else {
                        mapM8533of2 = null;
                    }
                    interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, strMo9522e, mapM8533of2);
                    interfaceC5737y0Mo9665g.mo9453a(interfaceC5733w0, mo9522e(), true);
                    interfaceC5733w0.mo9668j("memory_bitmap", mo9521d());
                    interfaceC5712m.mo9653c(1.0f);
                }
                interfaceC5712m.mo9652b(abstractC0110a, AbstractC5682c.m9647k(zMo101589a));
                abstractC0110a.close();
                if (zMo101589a) {
                    if (zM81959d) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (interfaceC5733w0.mo9673o().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                String strMo9522e2 = mo9522e();
                if (interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, mo9522e())) {
                    mapM8533of = ImmutableMap.m8533of("cached_value_found", CredentialEntry.FALSE_STRING);
                } else {
                    mapM8533of = null;
                }
                interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, strMo9522e2, mapM8533of);
                interfaceC5737y0Mo9665g.mo9453a(interfaceC5733w0, mo9522e(), false);
                interfaceC5733w0.mo9668j("memory_bitmap", mo9521d());
                interfaceC5712m.mo9652b(null, 1);
                if (zM81959d) {
                    return;
                } else {
                    return;
                }
            }
            InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712mMo9523g = mo9523g(interfaceC5712m, interfaceC43595aMo95976c, interfaceC5733w0.mo9666h().isCacheEnabled(2));
            String strMo9522e3 = mo9522e();
            if (interfaceC5737y0Mo9665g.mo9458f(interfaceC5733w0, mo9522e())) {
                mapM8533of3 = ImmutableMap.m8533of("cached_value_found", CredentialEntry.FALSE_STRING);
            }
            interfaceC5737y0Mo9665g.mo9462j(interfaceC5733w0, strMo9522e3, mapM8533of3);
            if (C36621b.m81959d()) {
                C36621b.m81957a("mInputProducer.produceResult");
            }
            this.f9341c.mo9524a(interfaceC5712mMo9523g, interfaceC5733w0);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String mo9521d() {
        return "pipe_bg";
    }
}
