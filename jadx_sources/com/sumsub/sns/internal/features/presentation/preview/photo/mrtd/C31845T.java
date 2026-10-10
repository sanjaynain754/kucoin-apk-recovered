package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31845T extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64718a;

    /* JADX INFO: renamed from: b */
    public int f64719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31846U f64720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31845T(C31846U c31846u, Continuation continuation) {
        super(continuation);
        this.f64720c = c31846u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64718a = obj;
        this.f64719b |= Integer.MIN_VALUE;
        return this.f64720c.emit(null, this);
    }
}
