package com.tencent.ugc.videobase.frame;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35823a implements IRecycler {

    /* JADX INFO: renamed from: a */
    private final FramePool f77370a;

    /* JADX INFO: renamed from: a */
    public static IRecycler m79309a(FramePool framePool) {
        return new C35823a(framePool);
    }

    @Override // com.tencent.ugc.videobase.frame.IRecycler
    public final void recycle(RefCounted refCounted) {
        FramePool.lambda$new$0(this.f77370a, refCounted);
    }

    private C35823a(FramePool framePool) {
        this.f77370a = framePool;
    }
}
