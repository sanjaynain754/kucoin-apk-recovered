package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30087V extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f60470a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30088W f60472c;

    /* JADX INFO: renamed from: d */
    public int f60473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30087V(C30088W c30088w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60472c = c30088w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60471b = obj;
        this.f60473d |= Integer.MIN_VALUE;
        Object objM70108a = this.f60472c.m70108a(null, null, null, false, this);
        return objM70108a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70108a : Result.m103843boximpl(objM70108a);
    }
}
