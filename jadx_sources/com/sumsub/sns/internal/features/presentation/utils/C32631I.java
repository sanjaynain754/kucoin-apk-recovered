package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32631I extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32635M f66588a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32635M f66590c;

    /* JADX INFO: renamed from: d */
    public int f66591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32631I(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66590c = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66589b = obj;
        this.f66591d |= Integer.MIN_VALUE;
        return C32635M.m71223a(this.f66590c, (AbstractC29172p) null, this);
    }
}
