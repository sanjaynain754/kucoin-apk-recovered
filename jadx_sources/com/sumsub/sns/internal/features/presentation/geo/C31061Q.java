package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31061Q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62800a;

    /* JADX INFO: renamed from: b */
    public int f62801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31062S f62802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31061Q(C31062S c31062s, Continuation continuation) {
        super(continuation);
        this.f62802c = c31062s;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62800a = obj;
        this.f62801b |= Integer.MIN_VALUE;
        return this.f62802c.emit(null, this);
    }
}
