package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31094i0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C31120v0 f62872a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31120v0 f62874c;

    /* JADX INFO: renamed from: d */
    public int f62875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31094i0(C31120v0 c31120v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62874c = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62873b = obj;
        this.f62875d |= Integer.MIN_VALUE;
        return this.f62874c.m70584b(this);
    }
}
