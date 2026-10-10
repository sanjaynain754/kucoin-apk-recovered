package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.V1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31227V1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63174b;

    /* JADX INFO: renamed from: c */
    public int f63175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31227V1(C31243a2 c31243a2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63174b = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63173a = obj;
        this.f63175c |= Integer.MIN_VALUE;
        return this.f63174b.m70627b(this);
    }
}
