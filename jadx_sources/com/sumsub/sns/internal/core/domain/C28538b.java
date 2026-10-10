package com.sumsub.sns.internal.core.domain;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28538b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28544c f58092b;

    /* JADX INFO: renamed from: c */
    public int f58093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28538b(C28544c c28544c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58092b = c28544c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58091a = obj;
        this.f58093c |= Integer.MIN_VALUE;
        return this.f58092b.mo69411a(this);
    }
}
