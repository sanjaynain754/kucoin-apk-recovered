package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28921e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29697t2 f58807a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f58808b;

    /* JADX INFO: renamed from: c */
    public int f58809c;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58808b = obj;
        this.f58809c |= Integer.MIN_VALUE;
        return AbstractC28922f.m69687a(null, null, null, this);
    }

    public C28921e(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
