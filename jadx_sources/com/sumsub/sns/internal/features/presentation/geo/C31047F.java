package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31047F extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28142p0 f62753a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31120v0 f62755c;

    /* JADX INFO: renamed from: d */
    public int f62756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31047F(C31120v0 c31120v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62755c = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62754b = obj;
        this.f62756d |= Integer.MIN_VALUE;
        return this.f62755c.m70582a(this);
    }
}
