package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31248c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f63250a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31252d f63252c;

    /* JADX INFO: renamed from: d */
    public int f63253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31248c(C31252d c31252d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63252c = c31252d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63251b = obj;
        this.f63253d |= Integer.MIN_VALUE;
        return this.f63252c.m70659a(null, this);
    }
}
