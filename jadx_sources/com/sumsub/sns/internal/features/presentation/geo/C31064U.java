package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31064U extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62812a;

    /* JADX INFO: renamed from: b */
    public int f62813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31065V f62814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31064U(C31065V c31065v, Continuation continuation) {
        super(continuation);
        this.f62814c = c31065v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62812a = obj;
        this.f62813b |= Integer.MIN_VALUE;
        return this.f62814c.emit(null, this);
    }
}
