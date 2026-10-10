package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30670g0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61978a;

    /* JADX INFO: renamed from: b */
    public int f61979b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30672h0 f61980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30670g0(C30672h0 c30672h0, Continuation continuation) {
        super(continuation);
        this.f61980c = c30672h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61978a = obj;
        this.f61979b |= Integer.MIN_VALUE;
        return this.f61980c.emit(null, this);
    }
}
