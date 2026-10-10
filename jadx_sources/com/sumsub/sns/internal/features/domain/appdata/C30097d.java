package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30097d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60499a;

    /* JADX INFO: renamed from: b */
    public Object f60500b;

    /* JADX INFO: renamed from: c */
    public Object f60501c;

    /* JADX INFO: renamed from: d */
    public ReviewStatusType f60502d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f60503e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30099f f60504f;

    /* JADX INFO: renamed from: g */
    public int f60505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30097d(C30099f c30099f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60504f = c30099f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60503e = obj;
        this.f60505g |= Integer.MIN_VALUE;
        Object objM70111a = this.f60504f.m70111a(false, null, this);
        return objM70111a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70111a : Result.m103843boximpl(objM70111a);
    }
}
