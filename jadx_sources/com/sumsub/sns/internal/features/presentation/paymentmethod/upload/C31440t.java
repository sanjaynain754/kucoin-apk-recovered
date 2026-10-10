package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.C30151v;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31440t extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30151v f63719a;

    /* JADX INFO: renamed from: b */
    public C29124h f63720b;

    /* JADX INFO: renamed from: c */
    public C30145p f63721c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63722d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31442v f63723e;

    /* JADX INFO: renamed from: f */
    public int f63724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31440t(C31442v c31442v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63723e = c31442v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63722d = obj;
        this.f63724f |= Integer.MIN_VALUE;
        return this.f63723e.m70725a((C30145p) null, (ContinuationImpl) this);
    }
}
