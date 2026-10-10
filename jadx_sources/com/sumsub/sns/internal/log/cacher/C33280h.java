package com.sumsub.sns.internal.log.cacher;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33280h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33284l f67836b;

    /* JADX INFO: renamed from: c */
    public int f67837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33280h(C33284l c33284l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67836b = c33284l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67835a = obj;
        this.f67837c |= Integer.MIN_VALUE;
        return this.f67836b.send(null, this);
    }
}
