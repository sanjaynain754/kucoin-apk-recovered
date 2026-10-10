package com.tencent.ugc.videobase.frame;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35824b implements IRecycler {

    /* JADX INFO: renamed from: a */
    private static final C35824b f77371a = new C35824b();

    /* JADX INFO: renamed from: a */
    public static IRecycler m79310a() {
        return f77371a;
    }

    @Override // com.tencent.ugc.videobase.frame.IRecycler
    public final void recycle(RefCounted refCounted) {
        ((GLTexturePool.TextureFrame) refCounted).mTexture.release();
    }

    private C35824b() {
    }
}
