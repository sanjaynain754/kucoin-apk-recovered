package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.domain.navigation.model.C30274C;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31311g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f63450a;

    /* JADX INFO: renamed from: b */
    public C31323s f63451b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63452c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31318n f63453d;

    /* JADX INFO: renamed from: e */
    public int f63454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31311g(C31318n c31318n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63453d = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63452c = obj;
        this.f63454e |= Integer.MIN_VALUE;
        return this.f63453d.m70671a((C30274C) null, (C30274C) null, false, (ContinuationImpl) this);
    }
}
