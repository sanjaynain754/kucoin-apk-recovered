package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30072F extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f60420a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30073G f60422c;

    /* JADX INFO: renamed from: d */
    public int f60423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30072F(C30073G c30073g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60422c = c30073g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60421b = obj;
        this.f60423d |= Integer.MIN_VALUE;
        Object objM70100a = this.f60422c.m70100a(this);
        return objM70100a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70100a : Result.m103843boximpl(objM70100a);
    }
}
