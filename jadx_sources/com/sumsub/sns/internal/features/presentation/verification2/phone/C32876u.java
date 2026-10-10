package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32876u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67267a;

    /* JADX INFO: renamed from: b */
    public int f67268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32877v f67269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32876u(C32877v c32877v, Continuation continuation) {
        super(continuation);
        this.f67269c = c32877v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67267a = obj;
        this.f67268b |= Integer.MIN_VALUE;
        return this.f67269c.emit(null, this);
    }
}
