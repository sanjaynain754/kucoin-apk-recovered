package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.remote.C29310Y3;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29947w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29310Y3 f60122a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29950z f60124c;

    /* JADX INFO: renamed from: d */
    public int f60125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29947w(C29950z c29950z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60124c = c29950z;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60123b = obj;
        this.f60125d |= Integer.MIN_VALUE;
        Object objM70009a = this.f60124c.m70009a((C29310Y3) null, this);
        return objM70009a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70009a : Result.m103843boximpl(objM70009a);
    }
}
