package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32542m0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66386a;

    /* JADX INFO: renamed from: b */
    public int f66387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32545n0 f66388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32542m0(C32545n0 c32545n0, Continuation continuation) {
        super(continuation);
        this.f66388c = c32545n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66386a = obj;
        this.f66387b |= Integer.MIN_VALUE;
        return this.f66388c.emit(null, this);
    }
}
