package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31756Q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC31770c0 f64529a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC31770c0 f64531c;

    /* JADX INFO: renamed from: d */
    public int f64532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31756Q(AbstractC31770c0 abstractC31770c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f64531c = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64530b = obj;
        this.f64532d |= Integer.MIN_VALUE;
        return AbstractC31770c0.m70856a(this.f64531c, this);
    }
}
