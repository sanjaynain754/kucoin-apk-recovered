package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.K1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32014K1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65077a;

    /* JADX INFO: renamed from: b */
    public int f65078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32017L1 f65079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32014K1(C32017L1 c32017l1, Continuation continuation) {
        super(continuation);
        this.f65079c = c32017l1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65077a = obj;
        this.f65078b |= Integer.MIN_VALUE;
        return this.f65079c.emit(null, this);
    }
}
