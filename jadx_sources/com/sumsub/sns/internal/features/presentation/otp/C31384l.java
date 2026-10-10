package com.sumsub.sns.internal.features.presentation.otp;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31384l extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f63595a;

    /* JADX INFO: renamed from: b */
    public C31374b f63596b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63597c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31389q f63598d;

    /* JADX INFO: renamed from: e */
    public int f63599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31384l(C31389q c31389q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63598d = c31389q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63597c = obj;
        this.f63599e |= Integer.MIN_VALUE;
        return this.f63598d.m70702a(this);
    }
}
