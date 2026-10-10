package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32064b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f65235a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65236b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32074d f65237c;

    /* JADX INFO: renamed from: d */
    public int f65238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32064b(C32074d c32074d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65237c = c32074d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65236b = obj;
        this.f65238d |= Integer.MIN_VALUE;
        return this.f65237c.m71023a((String) null, this);
    }
}
