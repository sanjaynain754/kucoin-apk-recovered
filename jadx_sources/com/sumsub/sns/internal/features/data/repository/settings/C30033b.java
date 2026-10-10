package com.sumsub.sns.internal.features.data.repository.settings;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.settings.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30033b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60329a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30034c f60330b;

    /* JADX INFO: renamed from: c */
    public int f60331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30033b(C30034c c30034c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60330b = c30034c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60329a = obj;
        this.f60331c |= Integer.MIN_VALUE;
        return this.f60330b.m70075b(this);
    }
}
