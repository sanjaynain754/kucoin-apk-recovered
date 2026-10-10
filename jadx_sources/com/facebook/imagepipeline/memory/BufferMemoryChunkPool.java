package com.facebook.imagepipeline.memory;

import p008a6.C0148h0;
import p008a6.C0154n;
import p712w3.InterfaceC45704d;
import p819z3.InterfaceC46675d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class BufferMemoryChunkPool extends AbstractC5659b {
    @Override // com.facebook.imagepipeline.memory.AbstractC5659b, com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C0154n mo699g(int i11) {
        return new C0154n(i11);
    }

    @InterfaceC45704d
    public BufferMemoryChunkPool(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0, PoolStatsTracker poolStatsTracker) {
        super(interfaceC46675d, c0148h0, poolStatsTracker);
    }
}
