package com.sumsub.sns.internal.features.data.repository.navigation;

import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30025t extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30027v f60314b;

    /* JADX INFO: renamed from: c */
    public int f60315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30025t(C30027v c30027v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60314b = c30027v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60313a = obj;
        this.f60315c |= Integer.MIN_VALUE;
        Object objM70070b = this.f60314b.m70070b(null, this);
        return objM70070b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70070b : Result.m103843boximpl(objM70070b);
    }
}
