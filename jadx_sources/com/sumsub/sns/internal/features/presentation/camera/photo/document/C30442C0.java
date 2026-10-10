package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.C0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30442C0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30444C2 f61330a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30444C2 f61332c;

    /* JADX INFO: renamed from: d */
    public int f61333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30442C0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61332c = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61331b = obj;
        this.f61333d |= Integer.MIN_VALUE;
        return this.f61332c.onPrepare(this);
    }
}
