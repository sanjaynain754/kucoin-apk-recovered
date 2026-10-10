package com.sumsub.sns.internal.features.presentation.preview.photo.poa;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.poa.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31923g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f64894a;

    /* JADX INFO: renamed from: b */
    public C29124h f64895b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64896c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31925i f64897d;

    /* JADX INFO: renamed from: e */
    public int f64898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31923g(C31925i c31925i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64897d = c31925i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64896c = obj;
        this.f64898e |= Integer.MIN_VALUE;
        return this.f64897d.mo70740a((AbstractC29172p) null, (C29124h) null, this);
    }
}
