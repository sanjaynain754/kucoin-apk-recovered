package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.z1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32290z1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32072c2 f65769b;

    /* JADX INFO: renamed from: c */
    public int f65770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32290z1(C32072c2 c32072c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65769b = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65768a = obj;
        this.f65770c |= Integer.MIN_VALUE;
        return C32072c2.m71010a(this.f65769b, this);
    }
}
