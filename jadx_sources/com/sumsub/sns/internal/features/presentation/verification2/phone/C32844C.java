package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32844C extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67199a;

    /* JADX INFO: renamed from: b */
    public int f67200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32845D f67201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32844C(C32845D c32845d, Continuation continuation) {
        super(continuation);
        this.f67201c = c32845d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67199a = obj;
        this.f67200b |= Integer.MIN_VALUE;
        return this.f67201c.emit(null, this);
    }
}
