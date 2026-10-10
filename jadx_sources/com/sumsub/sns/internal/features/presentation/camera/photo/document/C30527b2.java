package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.b2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30527b2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61644b;

    /* JADX INFO: renamed from: c */
    public int f61645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30527b2(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61644b = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61643a = obj;
        this.f61645c |= Integer.MIN_VALUE;
        return this.f61644b.m70309c(this);
    }
}
