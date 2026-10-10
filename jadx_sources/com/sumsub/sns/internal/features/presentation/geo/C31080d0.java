package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31080d0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62843a;

    /* JADX INFO: renamed from: b */
    public int f62844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31083e0 f62845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31080d0(C31083e0 c31083e0, Continuation continuation) {
        super(continuation);
        this.f62845c = c31083e0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62843a = obj;
        this.f62844b |= Integer.MIN_VALUE;
        return this.f62845c.emit(null, this);
    }
}
