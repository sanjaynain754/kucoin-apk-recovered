package com.sumsub.sns.internal.core.domain;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28592o extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28598r f58203b;

    /* JADX INFO: renamed from: c */
    public int f58204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28592o(C28598r c28598r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58203b = c28598r;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58202a = obj;
        this.f58204c |= Integer.MIN_VALUE;
        return this.f58203b.mo69411a(this);
    }
}
