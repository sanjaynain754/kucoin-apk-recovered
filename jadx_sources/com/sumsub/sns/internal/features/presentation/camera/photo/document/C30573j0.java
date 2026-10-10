package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30573j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30486P f61743a;

    /* JADX INFO: renamed from: b */
    public Object f61744b;

    /* JADX INFO: renamed from: c */
    public Object f61745c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f61746d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30444C2 f61747e;

    /* JADX INFO: renamed from: f */
    public int f61748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30573j0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61747e = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61746d = obj;
        this.f61748f |= Integer.MIN_VALUE;
        return this.f61747e.m70350c(this);
    }
}
