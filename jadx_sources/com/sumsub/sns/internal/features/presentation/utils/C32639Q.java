package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32639Q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Document f66634a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66635b;

    /* JADX INFO: renamed from: c */
    public int f66636c;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66635b = obj;
        this.f66636c |= Integer.MIN_VALUE;
        return AbstractC32640S.m71259a(null, null, this);
    }

    public C32639Q(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
