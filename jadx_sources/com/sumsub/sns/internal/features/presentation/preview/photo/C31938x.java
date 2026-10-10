package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31938x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public CharSequence f64929a;

    /* JADX INFO: renamed from: b */
    public CharSequence f64930b;

    /* JADX INFO: renamed from: c */
    public Object f64931c;

    /* JADX INFO: renamed from: d */
    public SNSPreviewPhotoDocumentViewModel$Content$ButtonAction f64932d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f64933e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC31770c0 f64934f;

    /* JADX INFO: renamed from: g */
    public int f64935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31938x(AbstractC31770c0 abstractC31770c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64934f = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64933e = obj;
        this.f64935g |= Integer.MIN_VALUE;
        return this.f64934f.m70864b((ContinuationImpl) this);
    }
}
