package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31797a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f64607a;

    /* JADX INFO: renamed from: b */
    public String f64608b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64609c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31801e f64610d;

    /* JADX INFO: renamed from: e */
    public int f64611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31797a(C31801e c31801e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64610d = c31801e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64609c = obj;
        this.f64611e |= Integer.MIN_VALUE;
        return this.f64610d.m70881b((String) null, (String) null, this);
    }
}
