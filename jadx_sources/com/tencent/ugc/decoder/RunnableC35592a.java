package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35592a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DecodeAbilityProvider f76944a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79089a(DecodeAbilityProvider decodeAbilityProvider) {
        return new RunnableC35592a(decodeAbilityProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76944a.updateDecoderAbility();
    }

    private RunnableC35592a(DecodeAbilityProvider decodeAbilityProvider) {
        this.f76944a = decodeAbilityProvider;
    }
}
