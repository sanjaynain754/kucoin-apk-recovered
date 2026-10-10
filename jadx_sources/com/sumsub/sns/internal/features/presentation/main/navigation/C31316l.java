package com.sumsub.sns.internal.features.presentation.main.navigation;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31316l extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31318n f63472b;

    /* JADX INFO: renamed from: c */
    public int f63473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31316l(C31318n c31318n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63472b = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63471a = obj;
        this.f63473c |= Integer.MIN_VALUE;
        Object objM70678b = this.f63472b.m70678b(this);
        return objM70678b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70678b : Result.m103843boximpl(objM70678b);
    }
}
