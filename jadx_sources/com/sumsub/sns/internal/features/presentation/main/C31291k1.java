package com.sumsub.sns.internal.features.presentation.main;

import java.util.ArrayList;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.k1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31291k1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ArrayList f63407a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63409c;

    /* JADX INFO: renamed from: d */
    public int f63410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31291k1(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63409c = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63408b = obj;
        this.f63410d |= Integer.MIN_VALUE;
        return this.f63409c.m70645a((ArrayList) null, this);
    }
}
