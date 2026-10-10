package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30221j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC30223k0 f60747a;

    /* JADX INFO: renamed from: b */
    public AbstractC30176f0 f60748b;

    /* JADX INFO: renamed from: c */
    public AbstractC29172p f60749c;

    /* JADX INFO: renamed from: d */
    public String f60750d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f60751e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC30223k0 f60752f;

    /* JADX INFO: renamed from: g */
    public int f60753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30221j0(AbstractC30223k0 abstractC30223k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60752f = abstractC30223k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60751e = obj;
        this.f60753g |= Integer.MIN_VALUE;
        return AbstractC30223k0.m70145a(this.f60752f, (AbstractC30176f0) null, this);
    }
}
