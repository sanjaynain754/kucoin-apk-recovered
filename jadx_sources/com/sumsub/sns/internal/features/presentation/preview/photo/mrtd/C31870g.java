package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31870g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64772a;

    /* JADX INFO: renamed from: b */
    public int f64773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31873h f64774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31870g(C31873h c31873h, Continuation continuation) {
        super(continuation);
        this.f64774c = c31873h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64772a = obj;
        this.f64773b |= Integer.MIN_VALUE;
        return this.f64774c.emit(null, this);
    }
}
