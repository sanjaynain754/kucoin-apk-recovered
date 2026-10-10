package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31112r0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62901a;

    /* JADX INFO: renamed from: b */
    public int f62902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31114s0 f62903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31112r0(C31114s0 c31114s0, Continuation continuation) {
        super(continuation);
        this.f62903c = c31114s0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62901a = obj;
        this.f62902b |= Integer.MIN_VALUE;
        return this.f62903c.emit(null, this);
    }
}
