package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32059a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29810M f65223a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32074d f65225c;

    /* JADX INFO: renamed from: d */
    public int f65226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32059a(C32074d c32074d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65225c = c32074d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65224b = obj;
        this.f65226d |= Integer.MIN_VALUE;
        return this.f65225c.m71021a((C29810M) null, this);
    }
}
