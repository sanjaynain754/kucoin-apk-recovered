package com.sumsub.sns.internal.features.presentation.questionnaire;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32296E extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f65784a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65785b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32300I f65786c;

    /* JADX INFO: renamed from: d */
    public int f65787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32296E(C32300I c32300i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65786c = c32300i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65785b = obj;
        this.f65787d |= Integer.MIN_VALUE;
        return this.f65786c.m71086a(false, (ContinuationImpl) this);
    }
}
