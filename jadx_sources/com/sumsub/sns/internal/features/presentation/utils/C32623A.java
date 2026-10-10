package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32623A extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32635M f66560b;

    /* JADX INFO: renamed from: c */
    public int f66561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32623A(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66560b = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66559a = obj;
        this.f66561c |= Integer.MIN_VALUE;
        return this.f66560b.m71246b(this);
    }
}
