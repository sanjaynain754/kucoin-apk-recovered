package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32690O extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66806a;

    /* JADX INFO: renamed from: b */
    public int f66807b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f66808c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32691P f66809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32690O(C32691P c32691p, Continuation continuation) {
        super(continuation);
        this.f66809d = c32691p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66806a = obj;
        this.f66807b |= Integer.MIN_VALUE;
        return this.f66809d.emit(null, this);
    }
}
