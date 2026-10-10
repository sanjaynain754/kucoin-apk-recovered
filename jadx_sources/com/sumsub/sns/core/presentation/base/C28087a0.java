package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28087a0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f57285a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28142p0 f57287c;

    /* JADX INFO: renamed from: d */
    public int f57288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28087a0(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(continuation);
        this.f57287c = abstractC28142p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57286b = obj;
        this.f57288d |= Integer.MIN_VALUE;
        return AbstractC28142p0.getString$suspendImpl(this.f57287c, null, this);
    }
}
