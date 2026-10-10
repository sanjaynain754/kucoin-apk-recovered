package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35554c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXUGCPartsManager.JoinAllPartsListener f76881a;

    /* JADX INFO: renamed from: b */
    private final int f76882b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79053a(TXUGCPartsManager.JoinAllPartsListener joinAllPartsListener, int i11) {
        return new RunnableC35554c(joinAllPartsListener, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXUGCPartsManagerImpl.C354681.m78964a(this.f76881a, this.f76882b);
    }

    private RunnableC35554c(TXUGCPartsManager.JoinAllPartsListener joinAllPartsListener, int i11) {
        this.f76881a = joinAllPartsListener;
        this.f76882b = i11;
    }
}
