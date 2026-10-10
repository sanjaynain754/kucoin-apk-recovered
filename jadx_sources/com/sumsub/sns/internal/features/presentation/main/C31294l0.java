package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31294l0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63412a;

    /* JADX INFO: renamed from: b */
    public C29124h f63413b;

    /* JADX INFO: renamed from: c */
    public boolean f63414c;

    /* JADX INFO: renamed from: d */
    public boolean f63415d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63416e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31332p0 f63417f;

    /* JADX INFO: renamed from: g */
    public int f63418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31294l0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63417f = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63416e = obj;
        this.f63418g |= Integer.MIN_VALUE;
        return this.f63417f.m70685a((AbstractC29172p) null, (C29124h) null, false, false, (ContinuationImpl) this);
    }
}
