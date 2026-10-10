package com.sumsub.sns.internal.features.data.repository.navigation;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30024s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30027v f60311b;

    /* JADX INFO: renamed from: c */
    public int f60312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30024s(C30027v c30027v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60311b = c30027v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60310a = obj;
        this.f60312c |= Integer.MIN_VALUE;
        Object objM70068a = this.f60311b.m70068a((String) null, this);
        return objM70068a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70068a : Result.m103843boximpl(objM70068a);
    }
}
