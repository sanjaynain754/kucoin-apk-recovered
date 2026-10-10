package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import rg0.InterfaceC44082a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29976e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60220a;

    /* JADX INFO: renamed from: b */
    public InterfaceC44082a f60221b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60222c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29978g f60223d;

    /* JADX INFO: renamed from: e */
    public int f60224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29976e(C29978g c29978g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60223d = c29978g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60222c = obj;
        this.f60224e |= Integer.MIN_VALUE;
        return this.f60223d.m70054a((Boolean) null, this);
    }
}
