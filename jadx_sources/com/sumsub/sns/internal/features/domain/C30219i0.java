package com.sumsub.sns.internal.features.domain;

import java.util.Iterator;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30219i0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC30223k0 f60741a;

    /* JADX INFO: renamed from: b */
    public Iterator f60742b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60743c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC30223k0 f60744d;

    /* JADX INFO: renamed from: e */
    public int f60745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30219i0(AbstractC30223k0 abstractC30223k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60744d = abstractC30223k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60743c = obj;
        this.f60745e |= Integer.MIN_VALUE;
        return AbstractC30223k0.m70146a(this.f60744d, (List) null, (AbstractC30176f0) null, this);
    }
}
