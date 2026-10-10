package com.sumsub.sns.internal.features.presentation.verification2.code;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32763s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32767w f67036a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32767w f67038c;

    /* JADX INFO: renamed from: d */
    public int f67039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32763s(C32767w c32767w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67038c = c32767w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67037b = obj;
        this.f67039d |= Integer.MIN_VALUE;
        return C32767w.m71337a(this.f67038c, null, this);
    }
}
