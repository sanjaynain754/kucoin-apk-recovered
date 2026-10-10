package com.sumsub.sns.internal.features.presentation.esign;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30951F extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f62533a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62535c;

    /* JADX INFO: renamed from: d */
    public int f62536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30951F(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62535c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62534b = obj;
        this.f62536d |= Integer.MIN_VALUE;
        return this.f62535c.m70554c(null, this);
    }
}
