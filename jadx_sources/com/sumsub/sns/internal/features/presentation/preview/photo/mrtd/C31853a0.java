package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31853a0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64734a;

    /* JADX INFO: renamed from: b */
    public int f64735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31856b0 f64736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31853a0(C31856b0 c31856b0, Continuation continuation) {
        super(continuation);
        this.f64736c = c31856b0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64734a = obj;
        this.f64735b |= Integer.MIN_VALUE;
        return this.f64736c.emit(null, this);
    }
}
