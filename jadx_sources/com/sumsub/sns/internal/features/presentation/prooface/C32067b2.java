package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.b2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32067b2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Function1 f65241a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32072c2 f65243c;

    /* JADX INFO: renamed from: d */
    public int f65244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32067b2(C32072c2 c32072c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65243c = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65242b = obj;
        this.f65244d |= Integer.MIN_VALUE;
        return this.f65243c.m71018b(this);
    }
}
