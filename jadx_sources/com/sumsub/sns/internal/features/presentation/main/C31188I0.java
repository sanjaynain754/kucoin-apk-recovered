package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31188I0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63052b;

    /* JADX INFO: renamed from: c */
    public int f63053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31188I0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63052b = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63051a = obj;
        this.f63053c |= Integer.MIN_VALUE;
        return this.f63052b.m70654b(this);
    }
}
