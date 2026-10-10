package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32392A extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29124h f65981a;

    /* JADX INFO: renamed from: b */
    public AbstractC29172p f65982b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65983c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32403L f65984d;

    /* JADX INFO: renamed from: e */
    public int f65985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32392A(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65984d = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65983c = obj;
        this.f65985e |= Integer.MIN_VALUE;
        return this.f65984d.m71121b(this);
    }
}
