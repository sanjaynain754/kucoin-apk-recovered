package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28125i0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57345a;

    /* JADX INFO: renamed from: b */
    public int f57346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28128j0 f57347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28125i0(C28128j0 c28128j0, Continuation continuation) {
        super(continuation);
        this.f57347c = c28128j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57345a = obj;
        this.f57346b |= Integer.MIN_VALUE;
        return this.f57347c.emit(null, this);
    }
}
