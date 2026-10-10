package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31744E extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28978A2 f64489a;

    /* JADX INFO: renamed from: b */
    public AbstractC31770c0 f64490b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64491c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC31770c0 f64492d;

    /* JADX INFO: renamed from: e */
    public int f64493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31744E(AbstractC31770c0 abstractC31770c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64492d = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64491c = obj;
        this.f64493e |= Integer.MIN_VALUE;
        return this.f64492d.m70858a((AbstractC28978A2) null, this);
    }
}
