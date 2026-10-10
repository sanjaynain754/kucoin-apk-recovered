package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29995x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29967J f60274a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60276c;

    /* JADX INFO: renamed from: d */
    public int f60277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29995x(C29967J c29967j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60276c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60275b = obj;
        this.f60277d |= Integer.MIN_VALUE;
        return this.f60276c.m70045b(false, this);
    }
}
