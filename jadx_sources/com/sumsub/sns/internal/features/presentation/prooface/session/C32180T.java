package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32180T extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65537a;

    /* JADX INFO: renamed from: b */
    public int f65538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32182U f65539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32180T(C32182U c32182u, Continuation continuation) {
        super(continuation);
        this.f65539c = c32182u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65537a = obj;
        this.f65538b |= Integer.MIN_VALUE;
        return this.f65539c.emit(null, this);
    }
}
