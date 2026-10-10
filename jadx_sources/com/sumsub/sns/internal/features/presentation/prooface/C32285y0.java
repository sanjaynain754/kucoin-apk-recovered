package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32285y0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65759a;

    /* JADX INFO: renamed from: b */
    public int f65760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32289z0 f65761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32285y0(C32289z0 c32289z0, Continuation continuation) {
        super(continuation);
        this.f65761c = c32289z0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65759a = obj;
        this.f65760b |= Integer.MIN_VALUE;
        return this.f65761c.emit(null, this);
    }
}
