package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.B1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30439B1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30538d1 f61273a;

    /* JADX INFO: renamed from: b */
    public Object f61274b;

    /* JADX INFO: renamed from: c */
    public Object f61275c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f61276d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30440B2 f61277e;

    /* JADX INFO: renamed from: f */
    public int f61278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30439B1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61277e = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61276d = obj;
        this.f61278f |= Integer.MIN_VALUE;
        return this.f61277e.m70307b(this);
    }
}
