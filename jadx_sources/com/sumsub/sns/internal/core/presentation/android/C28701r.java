package com.sumsub.sns.internal.core.presentation.android;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28701r extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28705t f58351b;

    /* JADX INFO: renamed from: c */
    public int f58352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28701r(C28705t c28705t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58351b = c28705t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58350a = obj;
        this.f58352c |= Integer.MIN_VALUE;
        return this.f58351b.m69509b(this);
    }
}
