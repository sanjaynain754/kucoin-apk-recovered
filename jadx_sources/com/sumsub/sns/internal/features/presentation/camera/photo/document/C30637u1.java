package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.u1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30637u1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State f61900a;

    /* JADX INFO: renamed from: b */
    public int f61901b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61902c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61903d;

    /* JADX INFO: renamed from: e */
    public int f61904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30637u1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61903d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61902c = obj;
        this.f61904e |= Integer.MIN_VALUE;
        return this.f61903d.m70292a((C30536d) null, false, (ContinuationImpl) this);
    }
}
