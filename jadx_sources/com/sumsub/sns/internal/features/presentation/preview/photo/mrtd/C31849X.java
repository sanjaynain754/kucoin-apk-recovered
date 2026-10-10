package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31849X extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64729a;

    /* JADX INFO: renamed from: b */
    public int f64730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31850Y f64731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31849X(C31850Y c31850y, Continuation continuation) {
        super(continuation);
        this.f64731c = c31850y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64729a = obj;
        this.f64730b |= Integer.MIN_VALUE;
        return this.f64731c.emit(null, this);
    }
}
