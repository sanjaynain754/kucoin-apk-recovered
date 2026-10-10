package com.sumsub.sns.internal.features.presentation.verification;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32689N extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66797a;

    /* JADX INFO: renamed from: b */
    public Object f66798b;

    /* JADX INFO: renamed from: c */
    public Object f66799c;

    /* JADX INFO: renamed from: d */
    public CharSequence f66800d;

    /* JADX INFO: renamed from: e */
    public CharSequence f66801e;

    /* JADX INFO: renamed from: f */
    public boolean f66802f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f66803g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C32720j0 f66804h;

    /* JADX INFO: renamed from: i */
    public int f66805i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32689N(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66804h = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66803g = obj;
        this.f66805i |= Integer.MIN_VALUE;
        return this.f66804h.m71309b(null, null, this);
    }
}
