package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32879x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67274a;

    /* JADX INFO: renamed from: b */
    public int f67275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32880y f67276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32879x(C32880y c32880y, Continuation continuation) {
        super(continuation);
        this.f67276c = c32880y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67274a = obj;
        this.f67275b |= Integer.MIN_VALUE;
        return this.f67276c.emit(null, this);
    }
}
