package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.v1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30642v1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61915b;

    /* JADX INFO: renamed from: c */
    public int f61916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30642v1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61915b = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61914a = obj;
        this.f61916c |= Integer.MIN_VALUE;
        return this.f61915b.m70295a(this);
    }
}
