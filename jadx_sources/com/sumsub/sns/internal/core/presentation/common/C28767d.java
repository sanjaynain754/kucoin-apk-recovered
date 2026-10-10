package com.sumsub.sns.internal.core.presentation.common;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28767d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f58512a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f58513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28769e f58514c;

    /* JADX INFO: renamed from: d */
    public int f58515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28767d(C28769e c28769e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58514c = c28769e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58513b = obj;
        this.f58515d |= Integer.MIN_VALUE;
        return this.f58514c.m69591a(null, null, null, this);
    }
}
