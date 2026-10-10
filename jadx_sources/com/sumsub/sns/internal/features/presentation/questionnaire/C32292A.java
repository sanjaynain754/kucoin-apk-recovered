package com.sumsub.sns.internal.features.presentation.questionnaire;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32292A extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65772a;

    /* JADX INFO: renamed from: b */
    public int f65773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32293B f65774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32292A(C32293B c32293b, Continuation continuation) {
        super(continuation);
        this.f65774c = c32293b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65772a = obj;
        this.f65773b |= Integer.MIN_VALUE;
        return this.f65774c.emit(null, this);
    }
}
