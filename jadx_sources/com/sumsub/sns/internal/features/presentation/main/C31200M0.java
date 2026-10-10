package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31200M0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63088a;

    /* JADX INFO: renamed from: b */
    public Object f63089b;

    /* JADX INFO: renamed from: c */
    public ReviewStatusType f63090c;

    /* JADX INFO: renamed from: d */
    public boolean f63091d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63092e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31251c2 f63093f;

    /* JADX INFO: renamed from: g */
    public int f63094g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31200M0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63093f = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63092e = obj;
        this.f63094g |= Integer.MIN_VALUE;
        return C31251c2.m70638a(this.f63093f, null, null, null, false, this);
    }
}
