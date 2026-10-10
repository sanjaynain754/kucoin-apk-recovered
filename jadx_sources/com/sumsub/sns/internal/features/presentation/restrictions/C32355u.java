package com.sumsub.sns.internal.features.presentation.restrictions;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32355u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65922a;

    /* JADX INFO: renamed from: b */
    public int f65923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32356v f65924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32355u(C32356v c32356v, Continuation continuation) {
        super(continuation);
        this.f65924c = c32356v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65922a = obj;
        this.f65923b |= Integer.MIN_VALUE;
        return this.f65924c.emit(null, this);
    }
}
