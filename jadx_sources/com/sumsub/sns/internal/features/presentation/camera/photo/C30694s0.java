package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30694s0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62025a;

    /* JADX INFO: renamed from: b */
    public int f62026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30732t0 f62027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30694s0(C30732t0 c30732t0, Continuation continuation) {
        super(continuation);
        this.f62027c = c30732t0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62025a = obj;
        this.f62026b |= Integer.MIN_VALUE;
        return this.f62027c.emit(null, this);
    }
}
