package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p483o0.C42908e;
import p483o0.InterfaceC42907d;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p617s5.InterfaceC44317b;
import p712w3.InterfaceC45711k;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t */
/* JADX INFO: compiled from: DiskCacheReadProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5726t implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45711k<InterfaceC44317b> f9453a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC43619h f9454b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<C46075i> f9455c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t$a */
    /* JADX INFO: compiled from: DiskCacheReadProducer.java */
    public class a implements InterfaceC42907d<C46075i, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5737y0 f9456a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5733w0 f9457b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC5712m f9458c;

        public a(InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, InterfaceC5712m interfaceC5712m) {
            this.f9456a = interfaceC5737y0;
            this.f9457b = interfaceC5733w0;
            this.f9458c = interfaceC5712m;
        }

        @Override // p483o0.InterfaceC42907d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo9793a(C42908e<C46075i> c42908e) throws Exception {
            if (C5726t.m9807f(c42908e)) {
                this.f9456a.mo9456d(this.f9457b, "DiskCacheProducer", null);
                this.f9458c.mo9651a();
            } else if (c42908e.m94105n()) {
                this.f9456a.mo9463k(this.f9457b, "DiskCacheProducer", c42908e.m94101i(), null);
                C5726t.this.f9455c.mo9524a(this.f9458c, this.f9457b);
            } else {
                C46075i c46075iM94102j = c42908e.m94102j();
                if (c46075iM94102j != null) {
                    InterfaceC5737y0 interfaceC5737y0 = this.f9456a;
                    InterfaceC5733w0 interfaceC5733w0 = this.f9457b;
                    interfaceC5737y0.mo9462j(interfaceC5733w0, "DiskCacheProducer", C5726t.m9806e(interfaceC5737y0, interfaceC5733w0, true, c46075iM94102j.m101582q()));
                    this.f9456a.mo9453a(this.f9457b, "DiskCacheProducer", true);
                    this.f9457b.mo9670l("disk");
                    this.f9458c.mo9653c(1.0f);
                    this.f9458c.mo9652b(c46075iM94102j, 1);
                    c46075iM94102j.close();
                } else {
                    InterfaceC5737y0 interfaceC5737y1 = this.f9456a;
                    InterfaceC5733w0 interfaceC5733w1 = this.f9457b;
                    interfaceC5737y1.mo9462j(interfaceC5733w1, "DiskCacheProducer", C5726t.m9806e(interfaceC5737y1, interfaceC5733w1, false, 0));
                    C5726t.this.f9455c.mo9524a(this.f9458c, this.f9457b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t$b */
    /* JADX INFO: compiled from: DiskCacheReadProducer.java */
    public class b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f9460a;

        public b(AtomicBoolean atomicBoolean) {
            this.f9460a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9460a.set(true);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static Map<String, String> m9806e(InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, boolean z11, int i11) {
        if (interfaceC5737y0.mo9458f(interfaceC5733w0, "DiskCacheProducer")) {
            return z11 ? ImmutableMap.m8534of("cached_value_found", String.valueOf(z11), "encodedImageSize", String.valueOf(i11)) : ImmutableMap.m8533of("cached_value_found", String.valueOf(z11));
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m9810i(AtomicBoolean atomicBoolean, InterfaceC5733w0 interfaceC5733w0) {
        interfaceC5733w0.mo9667i(new b(atomicBoolean));
    }

    public C5726t(InterfaceC45711k<InterfaceC44317b> interfaceC45711k, InterfaceC43619h interfaceC43619h, InterfaceC5731v0<C46075i> interfaceC5731v0) {
        this.f9453a = interfaceC45711k;
        this.f9454b = interfaceC43619h;
        this.f9455c = interfaceC5731v0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9807f(C42908e<?> c42908e) {
        if (!c42908e.m94103l()) {
            if (!c42908e.m94105n() || !(c42908e.m94101i() instanceof CancellationException)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        ImageRequest imageRequestMo9666h = interfaceC5733w0.mo9666h();
        if (!interfaceC5733w0.mo9666h().isCacheEnabled(16)) {
            m9808g(interfaceC5712m, interfaceC5733w0);
            return;
        }
        interfaceC5733w0.mo9665g().mo9454b(interfaceC5733w0, "DiskCacheProducer");
        InterfaceC43595a interfaceC43595aMo95975b = this.f9454b.mo95975b(imageRequestMo9666h, interfaceC5733w0.mo9663a());
        InterfaceC44317b interfaceC44317b = this.f9453a.get();
        BufferedDiskCache bufferedDiskCacheM9558a = DiskCacheDecision.m9558a(imageRequestMo9666h, interfaceC44317b.mo97778a(), interfaceC44317b.mo97779b(), interfaceC44317b.mo97780c());
        if (bufferedDiskCacheM9558a == null) {
            interfaceC5733w0.mo9665g().mo9463k(interfaceC5733w0, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestMo9666h.getCacheChoice().ordinal()).toString()), null);
            m9808g(interfaceC5712m, interfaceC5733w0);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        bufferedDiskCacheM9558a.m9135m(interfaceC43595aMo95975b, atomicBoolean).m94099e(m9809h(interfaceC5712m, interfaceC5733w0));
        m9810i(atomicBoolean, interfaceC5733w0);
    }

    /* JADX INFO: renamed from: g */
    public final void m9808g(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        if (interfaceC5733w0.mo9673o().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            interfaceC5733w0.mo9668j("disk", "nil-result_read");
            interfaceC5712m.mo9652b(null, 1);
        } else {
            this.f9455c.mo9524a(interfaceC5712m, interfaceC5733w0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC42907d<C46075i, Void> m9809h(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        return new a(interfaceC5733w0.mo9665g(), interfaceC5733w0, interfaceC5712m);
    }
}
