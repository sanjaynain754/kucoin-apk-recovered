package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30543e0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State f61685a;

    /* JADX INFO: renamed from: b */
    public int f61686b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61687c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30444C2 f61688d;

    /* JADX INFO: renamed from: e */
    public int f61689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30543e0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61688d = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61687c = obj;
        this.f61689e |= Integer.MIN_VALUE;
        return this.f61688d.m70337a((C30536d) null, false, (ContinuationImpl) this);
    }
}
