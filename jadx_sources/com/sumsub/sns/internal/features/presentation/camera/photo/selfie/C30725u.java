package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30725u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62070a;

    /* JADX INFO: renamed from: b */
    public int f62071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30726v f62072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30725u(C30726v c30726v, Continuation continuation) {
        super(continuation);
        this.f62072c = c30726v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62070a = obj;
        this.f62071b |= Integer.MIN_VALUE;
        return this.f62072c.emit(null, this);
    }
}
