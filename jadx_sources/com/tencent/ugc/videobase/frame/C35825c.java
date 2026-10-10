package com.tencent.ugc.videobase.frame;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35825c implements IRecycler {

    /* JADX INFO: renamed from: a */
    private static final C35825c f77372a = new C35825c();

    /* JADX INFO: renamed from: a */
    public static IRecycler m79311a() {
        return f77372a;
    }

    @Override // com.tencent.ugc.videobase.frame.IRecycler
    public final void recycle(RefCounted refCounted) {
        ((TextureHolderPool.C35822a) refCounted).f77369a.release();
    }

    private C35825c() {
    }
}
