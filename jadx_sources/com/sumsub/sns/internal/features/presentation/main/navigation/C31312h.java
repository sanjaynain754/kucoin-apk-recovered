package com.sumsub.sns.internal.features.presentation.main.navigation;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31312h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f63455a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31318n f63457c;

    /* JADX INFO: renamed from: d */
    public int f63458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31312h(C31318n c31318n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63457c = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63456b = obj;
        this.f63458d |= Integer.MIN_VALUE;
        Object objM70676a = this.f63457c.m70676a(this);
        return objM70676a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70676a : Result.m103843boximpl(objM70676a);
    }
}
