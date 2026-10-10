package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31439s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31442v f63717b;

    /* JADX INFO: renamed from: c */
    public int f63718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31439s(C31442v c31442v, Continuation continuation) {
        super(continuation);
        this.f63717b = c31442v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63716a = obj;
        this.f63718c |= Integer.MIN_VALUE;
        return this.f63717b.mo70458a((AbstractC30146q) null, this);
    }
}
