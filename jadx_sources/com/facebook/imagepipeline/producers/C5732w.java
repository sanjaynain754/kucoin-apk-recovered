package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.request.ImageRequest;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w */
/* JADX INFO: compiled from: EncodedCacheKeyMultiplexProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5732w extends AbstractC5713m0<Pair<InterfaceC43595a, ImageRequest.RequestLevel>, C46075i> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC43619h f9489f;

    public C5732w(InterfaceC43619h interfaceC43619h, boolean z11, InterfaceC5731v0 interfaceC5731v0) {
        super(interfaceC5731v0, "EncodedCacheKeyMultiplexProducer", HasExtraData.Companion.KEY_MULTIPLEX_ENCODED_COUNT, z11);
        this.f9489f = interfaceC43619h;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5713m0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<InterfaceC43595a, ImageRequest.RequestLevel> mo9689j(InterfaceC5733w0 interfaceC5733w0) {
        return Pair.create(this.f9489f.mo95975b(interfaceC5733w0.mo9666h(), interfaceC5733w0.mo9663a()), interfaceC5733w0.mo9673o());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5713m0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C46075i mo9688g(C46075i c46075i) {
        return C46075i.m101555b(c46075i);
    }
}
