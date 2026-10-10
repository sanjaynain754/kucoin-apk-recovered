package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32799u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67125a;

    /* JADX INFO: renamed from: b */
    public int f67126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32800v f67127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32799u(C32800v c32800v, Continuation continuation) {
        super(continuation);
        this.f67127c = c32800v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67125a = obj;
        this.f67126b |= Integer.MIN_VALUE;
        return this.f67127c.emit(null, this);
    }
}
