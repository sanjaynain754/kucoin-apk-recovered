package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31497o extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63902a;

    /* JADX INFO: renamed from: b */
    public C29124h f63903b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63904c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31476A f63905d;

    /* JADX INFO: renamed from: e */
    public int f63906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31497o(C31476A c31476a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63905d = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63904c = obj;
        this.f63906e |= Integer.MIN_VALUE;
        return this.f63905d.mo70740a((AbstractC29172p) null, (C29124h) null, this);
    }
}
