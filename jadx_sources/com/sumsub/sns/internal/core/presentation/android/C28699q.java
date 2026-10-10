package com.sumsub.sns.internal.core.presentation.android;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28699q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28705t f58347b;

    /* JADX INFO: renamed from: c */
    public int f58348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28699q(C28705t c28705t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58347b = c28705t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58346a = obj;
        this.f58348c |= Integer.MIN_VALUE;
        return this.f58347b.m69506a(this);
    }
}
