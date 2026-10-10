package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.D0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31173D0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63028a;

    /* JADX INFO: renamed from: b */
    public Document f63029b;

    /* JADX INFO: renamed from: c */
    public C31251c2 f63030c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63031d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31251c2 f63032e;

    /* JADX INFO: renamed from: f */
    public int f63033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31173D0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63032e = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63031d = obj;
        this.f63033f |= Integer.MIN_VALUE;
        return this.f63032e.m70647a(false, (ContinuationImpl) this);
    }
}
