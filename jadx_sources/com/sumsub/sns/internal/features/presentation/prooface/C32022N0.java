package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32148C0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32022N0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC32148C0 f65087a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32028P0 f65089c;

    /* JADX INFO: renamed from: d */
    public int f65090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32022N0(C32028P0 c32028p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65089c = c32028p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65088b = obj;
        this.f65090d |= Integer.MIN_VALUE;
        return this.f65089c.m70974a(null, this);
    }
}
