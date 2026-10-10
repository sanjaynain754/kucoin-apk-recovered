package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32771A extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67070a;

    /* JADX INFO: renamed from: b */
    public int f67071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32772B f67072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32771A(C32772B c32772b, Continuation continuation) {
        super(continuation);
        this.f67072c = c32772b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67070a = obj;
        this.f67071b |= Integer.MIN_VALUE;
        return this.f67072c.emit(null, this);
    }
}
