package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.core.presentation.android.C28705t;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31077c0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31120v0 f62839b;

    /* JADX INFO: renamed from: c */
    public int f62840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31077c0(C31120v0 c31120v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62839b = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62838a = obj;
        this.f62840c |= Integer.MIN_VALUE;
        return this.f62839b.m70580a((C28705t) null, this);
    }
}
