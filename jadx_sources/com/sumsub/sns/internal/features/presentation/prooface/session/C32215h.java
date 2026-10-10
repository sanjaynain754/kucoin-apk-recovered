package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32215h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65624a;

    /* JADX INFO: renamed from: b */
    public int f65625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32218i f65626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32215h(C32218i c32218i, Continuation continuation) {
        super(continuation);
        this.f65626c = c32218i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65624a = obj;
        this.f65625b |= Integer.MIN_VALUE;
        return this.f65626c.emit(null, this);
    }
}
