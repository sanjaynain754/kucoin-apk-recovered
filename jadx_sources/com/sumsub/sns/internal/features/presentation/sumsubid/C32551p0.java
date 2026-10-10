package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32551p0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66398a;

    /* JADX INFO: renamed from: b */
    public int f66399b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32554q0 f66400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32551p0(C32554q0 c32554q0, Continuation continuation) {
        super(continuation);
        this.f66400c = c32554q0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66398a = obj;
        this.f66399b |= Integer.MIN_VALUE;
        return this.f66400c.emit(null, this);
    }
}
