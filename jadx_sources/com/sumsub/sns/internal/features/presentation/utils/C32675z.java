package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32675z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66700a;

    /* JADX INFO: renamed from: b */
    public String f66701b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66702c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32635M f66703d;

    /* JADX INFO: renamed from: e */
    public int f66704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32675z(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66703d = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66702c = obj;
        this.f66704e |= Integer.MIN_VALUE;
        return this.f66703d.m71230a((String) null, (String) null, this);
    }
}
