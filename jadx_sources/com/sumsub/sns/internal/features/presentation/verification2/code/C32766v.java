package com.sumsub.sns.internal.features.presentation.verification2.code;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32766v extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32767w f67056b;

    /* JADX INFO: renamed from: c */
    public int f67057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32766v(C32767w c32767w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67056b = c32767w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67055a = obj;
        this.f67057c |= Integer.MIN_VALUE;
        return this.f67056b.m71338a(null, this);
    }
}
