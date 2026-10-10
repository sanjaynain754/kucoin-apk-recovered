package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32695U extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66840a;

    /* JADX INFO: renamed from: b */
    public int f66841b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f66842c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32696V f66843d;

    /* JADX INFO: renamed from: e */
    public Long f66844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32695U(C32696V c32696v, Continuation continuation) {
        super(continuation);
        this.f66843d = c32696v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66840a = obj;
        this.f66841b |= Integer.MIN_VALUE;
        return this.f66843d.emit(null, this);
    }
}
