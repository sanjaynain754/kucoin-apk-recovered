package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32041U extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65185b;

    /* JADX INFO: renamed from: c */
    public int f65186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32041U(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65185b = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65184a = obj;
        this.f65186c |= Integer.MIN_VALUE;
        return this.f65185b.m71038a(this);
    }
}
