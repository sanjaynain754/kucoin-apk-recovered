package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32069c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32081e1 f65249a;

    /* JADX INFO: renamed from: b */
    public SNSLiveness3dFaceViewModel$Icon f65250b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65251c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32074d f65252d;

    /* JADX INFO: renamed from: e */
    public int f65253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32069c(C32074d c32074d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65252d = c32074d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65251c = obj;
        this.f65253e |= Integer.MIN_VALUE;
        return this.f65252d.m71022a(null, false, this);
    }
}
