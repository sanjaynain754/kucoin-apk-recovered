package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30415U extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61203a;

    /* JADX INFO: renamed from: b */
    public int f61204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30416V f61205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30415U(C30416V c30416v, Continuation continuation) {
        super(continuation);
        this.f61205c = c30416v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61203a = obj;
        this.f61204b |= Integer.MIN_VALUE;
        return this.f61205c.emit(null, this);
    }
}
