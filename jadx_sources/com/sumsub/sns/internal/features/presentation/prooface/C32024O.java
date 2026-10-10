package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32024O extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f65094a;

    /* JADX INFO: renamed from: b */
    public C29810M f65095b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65096c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32109k0 f65097d;

    /* JADX INFO: renamed from: e */
    public int f65098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32024O(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65097d = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65096c = obj;
        this.f65098e |= Integer.MIN_VALUE;
        return C32109k0.m71027a(this.f65097d, (C29894i) null, this);
    }
}
