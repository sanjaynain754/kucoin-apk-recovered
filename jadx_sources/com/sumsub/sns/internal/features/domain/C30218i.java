package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30218i extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Document f60736a;

    /* JADX INFO: renamed from: b */
    public String f60737b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60738c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30220j f60739d;

    /* JADX INFO: renamed from: e */
    public int f60740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30218i(C30220j c30220j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60739d = c30220j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60738c = obj;
        this.f60740e |= Integer.MIN_VALUE;
        return this.f60739d.m70144a(null, null, this);
    }
}
