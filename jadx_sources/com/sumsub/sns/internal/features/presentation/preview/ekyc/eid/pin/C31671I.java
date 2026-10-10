package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31671I extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64279a;

    /* JADX INFO: renamed from: b */
    public int f64280b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f64281c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31672J f64282d;

    /* JADX INFO: renamed from: e */
    public SNSEidPinViewModel$Step f64283e;

    /* JADX INFO: renamed from: f */
    public CharSequence f64284f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31671I(C31672J c31672j, Continuation continuation) {
        super(continuation);
        this.f64282d = c31672j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64279a = obj;
        this.f64280b |= Integer.MIN_VALUE;
        return this.f64282d.emit(null, this);
    }
}
