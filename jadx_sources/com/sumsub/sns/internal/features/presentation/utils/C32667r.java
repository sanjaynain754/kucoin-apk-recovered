package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32667r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32668s f66672b;

    /* JADX INFO: renamed from: c */
    public int f66673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32667r(C32668s c32668s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66672b = c32668s;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66671a = obj;
        this.f66673c |= Integer.MIN_VALUE;
        return C32668s.m71290a(this.f66672b, null, null, this);
    }
}
