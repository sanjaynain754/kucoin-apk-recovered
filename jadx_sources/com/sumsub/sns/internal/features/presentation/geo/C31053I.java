package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31053I extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62772a;

    /* JADX INFO: renamed from: b */
    public int f62773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31054J f62774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31053I(C31054J c31054j, Continuation continuation) {
        super(continuation);
        this.f62774c = c31054j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62772a = obj;
        this.f62773b |= Integer.MIN_VALUE;
        return this.f62774c.emit(null, this);
    }
}
