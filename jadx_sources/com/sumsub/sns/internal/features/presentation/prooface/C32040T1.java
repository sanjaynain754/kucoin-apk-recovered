package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.T1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32040T1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65181a;

    /* JADX INFO: renamed from: b */
    public int f65182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32043U1 f65183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32040T1(C32043U1 c32043u1, Continuation continuation) {
        super(continuation);
        this.f65183c = c32043u1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65181a = obj;
        this.f65182b |= Integer.MIN_VALUE;
        return this.f65183c.emit(null, this);
    }
}
