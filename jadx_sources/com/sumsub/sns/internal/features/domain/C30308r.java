package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30308r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30312t f60925b;

    /* JADX INFO: renamed from: c */
    public int f60926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30308r(C30312t c30312t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60925b = c30312t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60924a = obj;
        this.f60926c |= Integer.MIN_VALUE;
        return this.f60925b.m70180a((Document) null, (String) null, (String) null, this);
    }
}
