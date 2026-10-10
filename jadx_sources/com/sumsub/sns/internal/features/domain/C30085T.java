package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30085T extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60462a;

    /* JADX INFO: renamed from: b */
    public AbstractC29172p f60463b;

    /* JADX INFO: renamed from: c */
    public String f60464c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60465d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30086U f60466e;

    /* JADX INFO: renamed from: f */
    public int f60467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30085T(C30086U c30086u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60466e = c30086u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60465d = obj;
        this.f60467f |= Integer.MIN_VALUE;
        Object objM70107a = this.f60466e.m70107a(null, this);
        return objM70107a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70107a : Result.m103843boximpl(objM70107a);
    }
}
