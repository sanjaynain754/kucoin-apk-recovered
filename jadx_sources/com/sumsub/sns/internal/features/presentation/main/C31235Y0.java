package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.Y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31235Y0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63194c;

    /* JADX INFO: renamed from: d */
    public int f63195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31235Y0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63194c = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63193b = obj;
        this.f63195d |= Integer.MIN_VALUE;
        return this.f63194c.m70656b(false, this);
    }
}
