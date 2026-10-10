package com.sumsub.sns.internal.features.presentation.consent;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30868s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f62351a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30870u f62353c;

    /* JADX INFO: renamed from: d */
    public int f62354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30868s(C30870u c30870u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62353c = c30870u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62352b = obj;
        this.f62354d |= Integer.MIN_VALUE;
        return C30870u.m70502b(this.f62353c, this);
    }
}
