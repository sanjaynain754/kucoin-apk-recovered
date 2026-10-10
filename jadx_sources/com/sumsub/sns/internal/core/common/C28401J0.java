package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.features.data.model.common.LogParams;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28401J0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28403K0 f57892b;

    /* JADX INFO: renamed from: c */
    public int f57893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28401J0(C28403K0 c28403k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57892b = c28403k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57891a = obj;
        this.f57893c |= Integer.MIN_VALUE;
        return this.f57892b.send((LogParams) null, this);
    }
}
