package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28113e0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57323a;

    /* JADX INFO: renamed from: b */
    public int f57324b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28116f0 f57325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28113e0(C28116f0 c28116f0, Continuation continuation) {
        super(continuation);
        this.f57325c = c28116f0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57323a = obj;
        this.f57324b |= Integer.MIN_VALUE;
        return this.f57325c.emit(null, this);
    }
}
