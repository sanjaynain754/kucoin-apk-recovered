package com.sumsub.sns.internal.log.logger;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33298d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33301g f67880b;

    /* JADX INFO: renamed from: c */
    public int f67881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33298d(C33301g c33301g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67880b = c33301g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67879a = obj;
        this.f67881c |= Integer.MIN_VALUE;
        return this.f67880b.mo68969a(null, this);
    }
}
