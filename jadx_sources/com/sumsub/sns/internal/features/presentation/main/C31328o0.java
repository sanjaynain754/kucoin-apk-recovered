package com.sumsub.sns.internal.features.presentation.main;

import java.util.ArrayList;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31328o0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ArrayList f63484a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31332p0 f63486c;

    /* JADX INFO: renamed from: d */
    public int f63487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31328o0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63486c = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63485b = obj;
        this.f63487d |= Integer.MIN_VALUE;
        return this.f63486c.m70687a((ArrayList) null, this);
    }
}
