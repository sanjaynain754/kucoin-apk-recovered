package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31096j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62878a;

    /* JADX INFO: renamed from: b */
    public int f62879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31098k0 f62880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31096j0(C31098k0 c31098k0, Continuation continuation) {
        super(continuation);
        this.f62880c = c31098k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62878a = obj;
        this.f62879b |= Integer.MIN_VALUE;
        return this.f62880c.emit(null, this);
    }
}
