package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.e2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32082e2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65291a;

    /* JADX INFO: renamed from: b */
    public int f65292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32087f2 f65293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32082e2(C32087f2 c32087f2, Continuation continuation) {
        super(continuation);
        this.f65293c = c32087f2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65291a = obj;
        this.f65292b |= Integer.MIN_VALUE;
        return this.f65293c.emit(null, this);
    }
}
