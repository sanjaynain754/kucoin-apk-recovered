package com.sumsub.sns.internal.features.presentation.preview;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31738g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31739h f64474b;

    /* JADX INFO: renamed from: c */
    public int f64475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31738g(AbstractC31739h abstractC31739h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64474b = abstractC31739h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64473a = obj;
        this.f64475c |= Integer.MIN_VALUE;
        return this.f64474b.m70854a((Function1) null, this);
    }
}
