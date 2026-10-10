package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31102m0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62886a;

    /* JADX INFO: renamed from: b */
    public int f62887b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31104n0 f62888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31102m0(C31104n0 c31104n0, Continuation continuation) {
        super(continuation);
        this.f62888c = c31104n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62886a = obj;
        this.f62887b |= Integer.MIN_VALUE;
        return this.f62888c.emit(null, this);
    }
}
