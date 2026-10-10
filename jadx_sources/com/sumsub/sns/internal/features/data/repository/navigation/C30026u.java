package com.sumsub.sns.internal.features.data.repository.navigation;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30026u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60316a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30027v f60317b;

    /* JADX INFO: renamed from: c */
    public int f60318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30026u(C30027v c30027v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60317b = c30027v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60316a = obj;
        this.f60318c |= Integer.MIN_VALUE;
        Object objM70069a = this.f60317b.m70069a(false, (ContinuationImpl) this);
        return objM70069a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70069a : Result.m103843boximpl(objM70069a);
    }
}
