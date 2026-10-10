package com.sumsub.sns.internal.core.presentation.android.location;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28674j extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28676l f58302b;

    /* JADX INFO: renamed from: c */
    public int f58303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28674j(C28676l c28676l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58302b = c28676l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58301a = obj;
        this.f58303c |= Integer.MIN_VALUE;
        return this.f58302b.m69489a(this);
    }
}
