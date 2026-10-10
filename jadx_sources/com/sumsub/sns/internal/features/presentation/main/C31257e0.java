package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31257e0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29124h f63305a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31332p0 f63307c;

    /* JADX INFO: renamed from: d */
    public int f63308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31257e0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63307c = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63306b = obj;
        this.f63308d |= Integer.MIN_VALUE;
        return this.f63307c.m70684a((C29124h) null, this);
    }
}
