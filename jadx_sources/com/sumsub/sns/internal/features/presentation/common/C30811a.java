package com.sumsub.sns.internal.features.presentation.common;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30811a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30815c f62243b;

    /* JADX INFO: renamed from: c */
    public int f62244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30811a(AbstractC30815c abstractC30815c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62243b = abstractC30815c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62242a = obj;
        this.f62244c |= Integer.MIN_VALUE;
        return this.f62243b.m70480a(this);
    }
}
