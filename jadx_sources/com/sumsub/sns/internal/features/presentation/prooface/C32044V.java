package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32044V extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f65189a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32109k0 f65191c;

    /* JADX INFO: renamed from: d */
    public int f65192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32044V(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65191c = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65190b = obj;
        this.f65192d |= Integer.MIN_VALUE;
        return this.f65191c.m71044b(null, this);
    }
}
