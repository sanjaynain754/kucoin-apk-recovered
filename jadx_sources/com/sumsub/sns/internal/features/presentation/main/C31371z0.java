package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31371z0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63566a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63568c;

    /* JADX INFO: renamed from: d */
    public int f63569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31371z0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63568c = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63567b = obj;
        this.f63569d |= Integer.MIN_VALUE;
        return C31251c2.m70639a(this.f63568c, (ContinuationImpl) this);
    }
}
