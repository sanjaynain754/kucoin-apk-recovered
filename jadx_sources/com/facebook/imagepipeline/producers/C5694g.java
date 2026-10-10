package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.request.ImageRequest;
import p006a4.AbstractC0110a;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g */
/* JADX INFO: compiled from: BitmapMemoryCacheKeyMultiplexProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5694g extends AbstractC5713m0<Pair<InterfaceC43595a, ImageRequest.RequestLevel>, AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC43619h f9327f;

    public C5694g(InterfaceC43619h interfaceC43619h, InterfaceC5731v0 interfaceC5731v0) {
        super(interfaceC5731v0, "BitmapMemoryCacheKeyMultiplexProducer", HasExtraData.Companion.KEY_MULTIPLEX_BITMAP_COUNT);
        this.f9327f = interfaceC43619h;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5713m0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<InterfaceC43595a, ImageRequest.RequestLevel> mo9689j(InterfaceC5733w0 interfaceC5733w0) {
        return Pair.create(this.f9327f.mo95976c(interfaceC5733w0.mo9666h(), interfaceC5733w0.mo9663a()), interfaceC5733w0.mo9673o());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5713m0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC0110a<InterfaceC46071e> mo9688g(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        return AbstractC0110a.m553h(abstractC0110a);
    }
}
