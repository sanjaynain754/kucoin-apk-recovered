package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32558s0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66413a;

    /* JADX INFO: renamed from: b */
    public int f66414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32560t0 f66415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32558s0(C32560t0 c32560t0, Continuation continuation) {
        super(continuation);
        this.f66415c = c32560t0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66413a = obj;
        this.f66414b |= Integer.MIN_VALUE;
        return this.f66415c.emit(null, this);
    }
}
