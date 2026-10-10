package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32693S extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66833b;

    /* JADX INFO: renamed from: c */
    public int f66834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32693S(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66833b = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66832a = obj;
        this.f66834c |= Integer.MIN_VALUE;
        return C32720j0.m71297a(this.f66833b, (SNSVerificationStepViewModel$Step) null, (CharSequence) null, (C32742x) null, (C29570k0) null, this);
    }
}
